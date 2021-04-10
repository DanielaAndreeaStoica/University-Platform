-- materie
INSERT INTO `proiect`.`materie` ( `denumire`, `descriere`,`data_incepere`,`data_terminare`) VALUES ( 'POO', 'programare in java','2020-09-28','2021-02-01');
INSERT INTO `proiect`.`materie` ( `denumire`, `descriere`,`data_incepere`,`data_terminare`) VALUES ( 'BD', 'proiectare bd','2020-09-28','2021-02-01');
INSERT INTO `proiect`.`materie` ( `denumire`, `descriere`,`data_incepere`,`data_terminare`) VALUES ( 'AF', 'algoritmi fundamentali','2020-09-28','2021-02-01');
INSERT INTO `proiect`.`materie` (`denumire`, `descriere`,`data_incepere`,`data_terminare`) VALUES ( 'MES', 'masuratori','2020-09-28','2021-02-01');
INSERT INTO `proiect`.`materie` (`denumire`, `descriere`,`data_incepere`,`data_terminare`) VALUES ( 'CAN', 'circuite analogice','2020-09-28','2021-02-01');
INSERT INTO `proiect`.`materie` ( `denumire`, `descriere`,`data_incepere`,`data_terminare`) VALUES ( 'Engleza', 'english','2020-09-28','2021-02-01');
-- activitate
INSERT INTO `proiect`.`activitate` (`tipActivitate`, `denumire`) VALUES ('1', 'curs');
INSERT INTO `proiect`.`activitate` (`tipActivitate`, `denumire`) VALUES ('2', 'seminar');
INSERT INTO `proiect`.`activitate` (`tipActivitate`, `denumire`) VALUES ('3', 'laborator');

-- utilizator
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '5000205203224', 'Madar', 'Razvan', '160 Edgemont Street', '0723777994', 'email2@gmail.com', 'RO53PORL5268411177456327', '99');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '5001212279951', 'Sigoiu', 'George', '9269 Bayberry Lane', '0772774169', 'email1@gmail.com', 'RO20PORL6118261682487366', '35');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '5000708194210', 'Lobont', 'Ramona', '833 Birchwood Ave.', '0768463080', 'email3@gmail.com', 'RO68PORL5323641831533462', '27');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '5000809466189', 'Lobont', 'Georgiana', '440 Henry Drive', '0786074263', 'email4@gmail.com', 'RO35RZBR6315796557686312', '96');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '5001123951477', 'Stoica', 'Daniela', '9442 Ohio Street', '0736738547', 'email5@gmail.com', 'RO02PORL5613215845552298', '90');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '5000907829728', 'Stoica', 'Dorin', '8071 Mayfield Circle', '0755055346', 'email6@gmail.com', 'RO55RZBR2747519225162897', '67');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '5001015565374', 'Madar', 'Bogdan', '7597 Oxford St.', '0756772168', 'email7@gmail.com', 'RO80PORL7745957137616856', '65');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '1001019496063', 'Matioc', 'Bogdan', '69 Myers St.', '0739163615', 'email8@gmail.com', 'RO67PORL7845927115619621', '52');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '5000205272144', 'Grumeza', 'Theodor', '304 Van Dyke Dr.', '0734436982', 'email9@gmail.com', 'RO96PORL1561573792914834', '54');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '5000806434412', 'Grr', 'Marcel', '9588 St Louis Street', '0776349424', 'email10@gmail.com', 'RO69RZBR9233362397416868', '78');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '5000617358915', 'Stoica', 'Andreea', '448 Cobblestone St.', '0781759583', 'email11@gmail.com', 'RO16RZBR5358861111442472', '29');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '5000524964845', 'Brehar', 'Alex', '8143 South Henry Smith Road', '0733754649', 'email12@gmail.com', 'RO92PORL2379958758849515', '25');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('administrator', '1960524964855', 'Oprisa', 'Ciprian', '9442 Ohio Street', '0756872168', 'ciprianoprisa@gmail.com', 'RO68RFRL5323647931533462', '69');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('super-administrator', '1901019496063', 'Susan', 'Gheorge', '833 Birchwood Ave.', '0765963880', 'susanghe1@gmail.com', 'RO13PORL5613215878552298','0');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '1880823391622', 'Ciun', 'Seba', 'STR. OZANA nr. 31NEAMŢ', '0785196237', 'email109@gmail.com', 'RO66PORL9643949451324852','11');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '6020111282061', 'Popa', 'Bogdan', 'STR. CUZA I. AL. nr. 712', '0795817931', 'email108@gmail.com', 'RO93RZBR6415277156241589','81');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '1961018297901', 'Balan', 'Caius', 'STR. ALECSANDRI VASILE nr. 1', '0762669644', 'email107@gmail.com', 'RO45RZBR9556181131258995','14');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '1911227322219', 'Trufasiu', 'Oana', 'BD. VICTORIEI nr. 75', '0718606580', 'email106@gmail.com', 'RO88PORL6816134996846722','67');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '1980529220151', 'Danescu', 'Miruna', 'Strada Simion Barnutiu 12', '0792657618', 'email105@gmail.com', 'RO13RZBR9896277965434457','55');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '1880704095202', 'Moldovan', 'Liana', 'STR. JIULUI nr. 1', '0773171239', 'email104@gmail.com', 'RO43RZBR7892235656367736','80');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '2970510401889', 'Senila', 'Coco', 'DN 1A NR. 4', '0794388574', 'email103@gmail.com', 'RO90RZBR8661654928594455','98');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '2900219171030', 'Stancu', 'Mihai', 'Bulevardul Nicolae Grigorescu 41', '0735414752', 'email102@gmail.com', 'RO62RZBR5927758534654274','8');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('student', '5010321345477', 'Tanti', 'Tuta', 'STR. LIPATTI DINU bl. 37A', '0716873326', 'email101@gmail.com', 'RO44RZBR1132719417663996','25');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '1860412384859', 'Mclean', 'Damon', 'STR. ODOBESCU ALEXANDRU nr. 1', '0727531038', 'contmail2@yahoo.com', 'RO45RZBR6958192757318172','42');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '1950322417110', 'Truong', 'Bailey', 'STR. REGIMENTUL 11 SIRET nr. 1', '0734853518', 'contmail1@yahoo.com', 'RO63PORL1294436184366591','96');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '1851030134996', 'Jacobs', 'Brook', 'STR. VLADIMIRESCU TUDOR nr. 16', '0788843014', 'contmail3@yahoo.com', 'RO84PORL1174236214384314','34');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '5001129245365', 'Rodrigues', 'Mylah', 'BD. VICTORIEI nr. 75', '0732376699', 'contmail4@yahoo.com', 'RO23RZBR5575426882939666','35');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '2981226332183', 'Simmons', 'Amalie', 'STR. CONTA VASILE nr. 2-4', '0772966019', 'contmail5@yahoo.com', 'RO98PORL7641199286259943','36');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '2910628356240', 'Cortes', 'Lidia', 'Strada Mihai Eminescu Bl.1, Ap.41', '0784739146', 'contmail6@yahoo.com', 'RO50PORL9959931794918484','37');
INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES ('profesor', '1910917426746', 'Singleton', 'Karim', 'Soseaua Pipera-Tunari 1', '0781261612', 'contmail7@yahoo.com', 'RO48RZBR2821482781893924','38');

-- student
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('1', '33', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('2', '33', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`,  `oreSustinute`, `an`) VALUES ('3', '33', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('5', '31', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('7',  '31', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('8', '31', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('10', '31', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('15', '30', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('16', '33', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('17', '33', '1');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('18', '32', '2');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('19', '32', '2');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('20', '32', '2');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('21', '31', '2');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('22', '31', '2');
INSERT INTO `proiect`.`student` (`idUtilizator`, `oreSustinute`, `an`) VALUES ('23', '31', '2');


-- profesor
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('4','20', '30'); 
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('6','20', '30');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('9','20', '30');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('11','20', '30');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('12','20', '30');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('24','22', '32');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('25','22', '32');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('26','22', '32');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('27','22', '32');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('28','22', '32');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('29','22', '32');
INSERT INTO `proiect`.`profesor` (`idUtilizator`,`minim_ore`, `maxim_ore`) VALUES ('30','22', '32');


-- administrator
INSERT INTO `proiect`.`administrator` (`idUtilizator`,`super-administrator`) VALUES ('13','0'); 
INSERT INTO `proiect`.`administrator` (`idUtilizator`,`super-administrator`) VALUES ('14','1'); 


-- profesor-materie
insert into profesor_materie values(1,1);
insert into profesor_materie values(2,1);
insert into profesor_materie values(3,1);
insert into profesor_materie values(4,2);
insert into profesor_materie values(5,2);
insert into profesor_materie values(6,3);
insert into profesor_materie values(7,3);
insert into profesor_materie values(8,4);
insert into profesor_materie values(9,5);
insert into profesor_materie values(10,5);
insert into profesor_materie values(11,5);
insert into profesor_materie values(12,6);

-- activitati-materie
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('1', '1', '2', '4', '15', '70');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('2', '2', '2', '5', '15', '20');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('3', '2', '1', '3', '15', '35');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('4', '1', '3', '6', '15', '50');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('5', '3', '3', '7', '15', '40');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('6', '1', '3', '7', '15', '60');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('7', '1', '5', '11', '15', '100');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('8', '2', '5', '9', '15', '30');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('9', '1', '1', '1', '15', '70');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('10', '1', '6', '12', '15', '100');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('11', '2', '4', '8', '15', '25');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('12', '3', '3', '6', '15', '50');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('13', '2', '1', '1', '15', '30');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('14', '1', '1', '3', '15', '65');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('15', '3', '1', '2', '15', '40');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('16', '1', '4', '8', '15', '100');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('17', '1', '2', '5', '15', '80');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('18', '1', '1', '2', '15', '60');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('19', '3', '2', '4', '15', '30');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('20', '1', '5', '9', '15', '70');
INSERT INTO `proiect`.`activitati_materie` (`idActivitate`, `tipActivitate`, `idMaterie`, `idProfesor`, `nrParticipantiMax`, `pondereNota`) VALUES ('21', '1', '5', '10', '15', '100');


-- logare_informatii
INSERT INTO informatii_logare values ('1','MadarRazvan','madar');
INSERT INTO informatii_logare values ('2','SigoiuGeorge','sigoiu');
INSERT INTO informatii_logare values ('3','LobontRamona','lobont');
INSERT INTO informatii_logare values ('4','LobontGeorgiana','lobont');
INSERT INTO informatii_logare values ('5','StoicaDaniela','stoica');
INSERT INTO informatii_logare values ('6','StoicaDorin','stoica');
INSERT INTO informatii_logare values ('7','MadarBogdan','madar');
INSERT INTO informatii_logare values ('8','MatiocBogdan','matioc');
INSERT INTO informatii_logare values ('9','GrumezaTheodor','grumeza');
INSERT INTO informatii_logare values ('10','GrrMarcel','grr');
INSERT INTO informatii_logare values ('11','StoicaAndreea','stoica');
INSERT INTO informatii_logare values ('12','BreharAlex','brehar');
INSERT INTO informatii_logare values ('13','OprisaCiprian','oprisa');
INSERT INTO informatii_logare values ('14','admin','admin');
INSERT INTO informatii_logare values ('15','CiunSeba','ciun');
INSERT INTO informatii_logare values ('16','PopaBogdan','popa');
INSERT INTO informatii_logare values ('17','BalanCaius','balan');
INSERT INTO informatii_logare values ('18','TrufasiuOana','trufasiu');
INSERT INTO informatii_logare values ('19','DanescuMiruna','danescu');
INSERT INTO informatii_logare values ('20','MoldovanLiana','moldovan');
INSERT INTO informatii_logare values ('21','SenilaCoco','senila');
INSERT INTO informatii_logare values ('22','StancuMihai','stancu');
INSERT INTO informatii_logare values ('23','TantiTuta','tanti');
INSERT INTO informatii_logare values ('24','McleanDamon','mclean');
INSERT INTO informatii_logare values ('25','TruongBailey','truong');
INSERT INTO informatii_logare values ('26','JacobsBrook','jacobs');
INSERT INTO informatii_logare values ('27','RodriguesMylah','rodrigues');
INSERT INTO informatii_logare values ('28','SimmonsAmalie','simmons');
INSERT INTO informatii_logare values ('29','CortesLidia','cortes');
INSERT INTO informatii_logare values ('30','SingletonKarim','singleton');

-- student-materie 
insert into student_materie values(1,1,1,curdate(),null);
insert into student_materie values(2,1,2,curdate(),null);
insert into student_materie values(3,1,3,curdate(),null);
insert into student_materie values(4,1,1,curdate(),null);
insert into student_materie values(5,1,2,curdate(),null);
insert into student_materie values(6,2,4,curdate(),null);
insert into student_materie values(7,2,5,curdate(),null);
insert into student_materie values(8,2,4,curdate(),null);
insert into student_materie values(9,3,6,curdate(),null);
insert into student_materie values(10,3,7,curdate(),null);
insert into student_materie values(11,5,9,curdate(),null);
insert into student_materie values(12,5,10,curdate(),null);
insert into student_materie values(13,5,11,curdate(),null);
insert into student_materie values(14,5,9,curdate(),null);
insert into student_materie values(15,6,12,curdate(),null);
insert into student_materie values(16,6,12,curdate(),null);

-- saptamanal
insert into saptamanal values(1,'Monday','8:00','10:00');
insert into saptamanal values(2,'Monday','8:00','10:00');
insert into saptamanal values(3,'Monday','10:00','12:00');
insert into saptamanal values(4,'Monday','12:00','14:00');
insert into saptamanal values(5,'Monday','12:00','14:00');
insert into saptamanal values(6,'Monday','14:00','16:00');
insert into saptamanal values(7,'Tuesday','8:00','10:00');
insert into saptamanal values(8,'Tuesday','8:00','10:00');
insert into saptamanal values(9,'Tuesday','10:00','12:00');
insert into saptamanal values(10,'Tuesday','12:00','14:00');
insert into saptamanal values(11,'Wednesday','8:00','10:00');
insert into saptamanal values(12,'Wednesday','10:00','12:00');
insert into saptamanal values(13,'Wednesday','12:00','14:00');
insert into saptamanal values(14,'Wednesday','12:00','14:00');
insert into saptamanal values(15,'Wednesday','18:00','20:00');
insert into saptamanal values(16,'Thursday','8:00','10:00');
insert into saptamanal values(17,'Thursday','10:00','12:00');
insert into saptamanal values(18,'Thursday','12:00','14:00');
insert into saptamanal values(19,'Friday','8:00','10:00');
insert into saptamanal values(20,'Friday','10:00','12:00');
insert into saptamanal values(21,'Friday','10:00','12:00');
insert into saptamanal values(21,'Wednesday','14:00','16:00');
insert into saptamanal values(7,'Thursday','14:00','16:00');

-- note
insert into note(idStudent, idActivitate) values(1,9);
insert into note(idStudent, idActivitate) values(1,13);
insert into note(idStudent, idActivitate) values(2,18);
insert into note(idStudent, idActivitate) values(2,15);
insert into note(idStudent, idActivitate) values(3,14);
insert into note(idStudent, idActivitate) values(3,3);
insert into note(idStudent, idActivitate) values(4,9);
insert into note(idStudent, idActivitate) values(4,13);
insert into note(idStudent, idActivitate) values(5,18);
insert into note(idStudent, idActivitate) values(5,15);
insert into note(idStudent, idActivitate) values(6,1);
insert into note(idStudent, idActivitate) values(6,19);
insert into note(idStudent, idActivitate) values(7,17);
insert into note(idStudent, idActivitate) values(7,2);
insert into note(idStudent, idActivitate) values(8,1);
insert into note(idStudent, idActivitate) values(8,19);
insert into note(idStudent, idActivitate) values(9,4);
insert into note(idStudent, idActivitate) values(9,12);
insert into note(idStudent, idActivitate) values(10,6);
insert into note(idStudent, idActivitate) values(10,5);
insert into note(idStudent, idActivitate) values(11,20);
insert into note(idStudent, idActivitate) values(11,8);
insert into note(idStudent, idActivitate) values(12,21);
insert into note(idStudent, idActivitate) values(13,7);
insert into note(idStudent, idActivitate) values(14,21);
insert into note(idStudent, idActivitate) values(15,10);
insert into note(idStudent, idActivitate) values(16,10);

-- grup studiu
INSERT INTO `proiect`.`grup_studiu` (`idGrupStudiu`, `denumireMaterie`) VALUES ('1', 'POO');
INSERT INTO `proiect`.`grup_studiu` (`idGrupStudiu`, `denumireMaterie`) VALUES ('2', 'BD');
INSERT INTO `proiect`.`grup_studiu` (`idGrupStudiu`, `denumireMaterie`) VALUES ('3', 'AF');
INSERT INTO `proiect`.`grup_studiu` (`idGrupStudiu`, `denumireMaterie`) VALUES ('4', 'MES');
INSERT INTO `proiect`.`grup_studiu` (`idGrupStudiu`, `denumireMaterie`) VALUES ('5', 'CAN');
INSERT INTO `proiect`.`grup_studiu` (`idGrupStudiu`, `denumireMaterie`) VALUES ('6', 'Engleza');

