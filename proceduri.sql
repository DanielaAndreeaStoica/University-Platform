-- administrator: cautare utilizator dupa nume si tip
DROP PROCEDURE IF EXISTS cautareUtilizator;
DELIMITER //
CREATE PROCEDURE cautareUtilizator(numeUtilizator varchar(45), tipUtilizator varchar(45))
BEGIN
	SELECT *
	FROM utilizator
	where nume = numeUtilizator AND utilizator.tipUtilizator = tipUtilizator;
END //
DELIMITER ;
call cautareUtilizator('Brehar','profesor');

-- administrator: cautare curs dupa nume
DROP PROCEDURE IF EXISTS cautareCurs;
DELIMITER //
CREATE PROCEDURE cautareCurs(numeCurs varchar(45))
BEGIN
	SELECT utilizator.tipUtilizator, utilizator.nume, utilizator.prenume, materie.denumire
    FROM utilizator, materie, profesor_materie, profesor
    WHERE materie.denumire = numeCurs AND materie.idMaterie = profesor_materie.idMaterie AND profesor_materie.idProfesor = profesor.idProfesor AND profesor.idUtilizator = utilizator.idUtilizator AND utilizator.tipUtilizator = 'profesor';

END //
DELIMITER ;
call cautareCurs('POO');

-- administrator: vizualizarea tuturor studentilor inscrisi la un curs
DROP PROCEDURE IF EXISTS vizualizareStudenti
DELIMITER //
CREATE PROCEDURE vizualizareStudenti(numeCurs varchar(45))
BEGIN
	SELECT utilizator.tipUtilizator, utilizator.nume, utilizator.prenume, materie.denumire
    FROM utilizator, materie, student, student_materie
    WHERE materie.denumire = numeCurs AND materie.idMaterie = student_materie.idMaterie AND student_materie.idStudent = student.idStudent AND student.idUtilizator = utilizator.idUtilizator AND utilizator.tipUtilizator = 'student';
END //
DELIMITER ;
call vizualizareStudenti('POO');

-- administrator: asignare profesori la cursuri
DROP PROCEDURE IF EXISTS asignareProfesorCurs
DELIMITER //
CREATE PROCEDURE asignareProfesorCurs(numeProfesor varchar(45), prenumeProfesor varchar(45), numeCurs varchar(45))
BEGIN
	SELECT profesor.idProfesor INTO @idProf
    FROM profesor, utilizator
    WHERE profesor.idUtilizator = utilizator.idUtilizator AND utilizator.nume = numeProfesor AND utilizator.prenume = prenumeProfesor AND utilizator.tipUtilizator = 'profesor';
    
    SELECT materie.idMaterie INTO @idMat
    FROM materie
    WHERE materie.denumire = numeCurs;
    
    INSERT INTO profesor_materie (idMaterie, idProfesor) VALUES (@idMat, @idProf);
END //
DELIMITER ;
CALL asignareProfesorCurs('Brehar','Alex','POO');

#un prof seteaza ponderea
drop procedure if exists setarePondere;
DELIMITER //
create procedure setarePondere(idProf int, denumireMaterie varchar(45), denumireActivitate varchar(45), pondere int)
begin
    select am.idActivitate into @value2
    from materie m, activitati_materie am, activitate a
    where m.idMaterie = am.idMaterie and m.denumire = denumireMaterie and am.idProfesor = idProf and a.tipActivitate = am.tipActivitate
    and a.denumire = denumireActivitate;
    
    update activitati_materie
    set pondereNota = pondere
    where idActivitate = @value2;
end //
DELIMITER ;
call setarePondere('3', 'POO', 'curs', '55');

#un prof ii adauga nota studentului
drop procedure if exists adaugareNote;
DELIMITER //
create procedure adaugareNote(idProf int, denumireMaterie varchar(45), denumireActivitate varchar(45), idStud int, notaNoua float)
begin
	select n.idActivitate into @value1
    from note n
    join activitati_materie am
    on n.idActivitate = am.idActivitate
    join activitate a
    on a.tipActivitate = am.tipActivitate
    join materie m
    on am.idMaterie = m.idMaterie
    join student_materie sm
    on sm.idMaterie = am.idMaterie
    where am.idProfesor = idProf and n.idStudent = idStud and a.denumire = denumireActivitate and m.denumire = denumireMaterie
    group by (n.idActivitate);
 
    update note
    set nota = notaNoua
    where idActivitate = @value1 and idStudent = idStud;
    
end //
DELIMITER ;
call adaugareNote(1, 'POO', 'curs', 1, 8.6);

# sa se determine id-ul activitatilor de la materia idM la care participa studentul idS
drop procedure if exists procedura1;
DELIMITER //
create procedure procedura1(idMat int, idStud int)
begin
	select am.idActivitate
	from activitati_materie am
	join note n
	on am.idActivitate = n.idActivitate
	where n.idStudent = idStud and am.idMaterie = idMat;
end //
DELIMITER ;
call procedura1(5, 13);

# sa se afiseze materia, numele activitatii(curs, seminar, laborator) si nota de la activitate
drop procedure if exists procedura2;
DELIMITER //
create procedure procedura2(idStud int)
begin
	select m.denumire, a.denumire, n.nota
    from student_materie sm, materie m, activitati_materie am, activitate a, note n
    where sm.idStudent = idStud and sm.idMaterie = m.idMaterie and sm.idMaterie = am.idMaterie and am.tipActivitate = a.tipActivitate
    and am.idActivitate = n.idActivitate and n.idStudent = idStud;
end //
DELIMITER ;
call procedura2(1);
call procedura2(6);

# sa se afiseze toate activitatile pe care le sustine un profesor(denumire materie, denumire activitate, ziua, orele)
drop procedure if exists procedura3;
DELIMITER //
create procedure procedura3(idProf int)
begin
	select m.denumire, a.denumire, s.ziua, s.ora_incepere, s.ora_terminare
    from materie m, activitati_materie am, activitate a, saptamanal s
    where am.idProfesor = idProf and am.idMaterie = m.idMaterie and am.tipActivitate = a.tipActivitate and am.idActivitate = s.idActivitate;
end //
DELIMITER ;
call procedura3(1);
call procedura3(8);