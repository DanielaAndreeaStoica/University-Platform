-- determinare daca e student, profesor sau administrator
select u.tipUtilizator
from informatii_logare il
join utilizator u
on il.idUtilizator=u.idUtilizator
where il.username = 'LobontGeorgiana';

-- determinare id prof la logare
select p.idProfesor
from informatii_logare il
join utilizator u
on il.idUtilizator=u.idUtilizator
join profesor p
on u.idUtilizator=p.idProfesor
where il.username='LobontGeorgiana';

-- determinare id stud la logare
select s.idStudent
from informatii_logare il
join utilizator u
on il.idUtilizator=u.idUtilizator
join student s
on u.idUtilizator=s.idUtilizator
where il.username='SigoiuGeorge';

-- determinare id prof cu cei mai putini studenti pentru asignare la student cand se inscrie la curs
-- prima linie este raspunsul
select p.idProfesor, count(sm.idStudent)
from profesor p
join profesor_materie pm
on p.idProfesor=pm.idProfesor
join materie m
on m.idMaterie=pm.idMaterie
join student_materie sm
on sm.idMaterie=m.idMaterie
where m.denumire='POO' and p.idProfesor=sm.idProfesor
group by p.idProfesor
order by count(sm.idStudent) ASC;

-- determinare activitati la care studentul nu este inscris/ la care se poate inscrie
select m.denumire
from materie m
where m.denumire not in(
select m.denumire
from student_materie sm
join materie m
on sm.idMaterie=m.idMaterie
where sm.idStudent=1);

-- determinare date personale in functie de idUtilizator
select *
from utilizator u
where u.idUtilizator=2;

-- determinare idUtilizator in functie de idStudent
select idUtilizator
from student
where idStudent=2;

-- determinare idUtilizator in functie de idStudent
select idUtilizator
from profesor
where idProfesor=2;

-- determinare idM stiind denumirea
SELECT materie.idMaterie FROM materie WHERE materie.denumire = 'CAN';