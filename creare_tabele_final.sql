
-- -----------------------------------------------------
-- Schema proiect
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `proiect` ;
USE `proiect` ;

-- -----------------------------------------------------
-- Table `proiect`.`materie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`materie` (
  `idMaterie` INT NOT NULL AUTO_INCREMENT,
  `denumire` VARCHAR(45) NULL,
  `descriere` TEXT NULL,
  `data_incepere` DATE NULL,
  `data_terminare` DATE NULL,
  PRIMARY KEY (`idMaterie`));


-- -----------------------------------------------------
-- Table `proiect`.`activitate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`activitate` (
  `tipActivitate` INT NOT NULL AUTO_INCREMENT,
  `denumire` VARCHAR(45) NULL,
  PRIMARY KEY (`tipActivitate`));


-- -----------------------------------------------------
-- Table `proiect`.`activitati_materie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`activitati_materie` (
  `idActivitate` INT NOT NULL AUTO_INCREMENT,
  `tipActivitate` INT NULL,
  `idMaterie` INT NULL,
  `idProfesor` INT NULL,
  `nrParticipantiMax` INT NULL,
  `pondereNota` INT NULL,
  PRIMARY KEY (`idActivitate`),
  INDEX `fk20_idx` (`idMaterie` ASC) VISIBLE,
  INDEX `fk21_idx` (`tipActivitate` ASC) VISIBLE,
  CONSTRAINT `fk20`
    FOREIGN KEY (`idMaterie`)
    REFERENCES `proiect`.`materie` (`idMaterie`),
  CONSTRAINT `fk21`
    FOREIGN KEY (`tipActivitate`)
    REFERENCES `proiect`.`activitate` (`tipActivitate`));


-- -----------------------------------------------------
-- Table `proiect`.`saptamanal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`saptamanal` (
  `idActivitate` INT NULL,
  `ziua` VARCHAR(45) NULL,
  `ora_incepere` TIME NULL,
  `ora_terminare` TIME NULL,
  INDEX `fk24_idx` (`idActivitate` ASC) VISIBLE,
  CONSTRAINT `fk24`
    FOREIGN KEY (`idActivitate`)
    REFERENCES `proiect`.`activitati_materie` (`idActivitate`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `proiect`.`grup_studiu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`grup_studiu` (
  `idGrupStudiu` INT NOT NULL,
  `denumireMaterie` VARCHAR(45) NULL,
  `mesaj` TEXT NULL,
  PRIMARY KEY (`idGrupStudiu`));


-- -----------------------------------------------------
-- Table `proiect`.`activitati_grup_studiu_planificare`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`activitati_grup_studiu_planificare` (
  `idActivitate` INT NOT NULL,
  `denumire` VARCHAR(45) NULL,
  `idGrupStudiu` INT NULL,
  `numarMinimParticipanti` INT NULL,
  `data_desfasurare` DATETIME NULL,
  `durata` TIME NULL,
  PRIMARY KEY (`idActivitate`),
  INDEX `fk16_idx` (`idGrupStudiu` ASC) VISIBLE,
  CONSTRAINT `fk16`
    FOREIGN KEY (`idGrupStudiu`)
    REFERENCES `proiect`.`grup_studiu` (`idGrupStudiu`));


-- -----------------------------------------------------
-- Table `proiect`.`utilizator`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`utilizator` (
  `idUtilizator` INT NOT NULL AUTO_INCREMENT,
  `tipUtilizator` VARCHAR(45) NULL,
  `CNP` VARCHAR(45) NULL,
  `nume` VARCHAR(45) NULL,
  `prenume` VARCHAR(45) NULL,
  `adresa` TEXT NULL,
  `numarTelefon` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `IBAN` VARCHAR(45) NULL,
  `nrContract` INT NULL,
  PRIMARY KEY (`idUtilizator`));


-- -----------------------------------------------------
-- Table `proiect`.`administrator`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`administrator` (
  `idAdministartor` INT NOT NULL AUTO_INCREMENT,
  `idUtilizator` INT NULL,
  `super-administrator` INT NULL,
  PRIMARY KEY (`idAdministartor`),
  INDEX `fk13_idx` (`idUtilizator` ASC) VISIBLE,
  CONSTRAINT `fk13`
    FOREIGN KEY (`idUtilizator`)
    REFERENCES `proiect`.`utilizator` (`idUtilizator`));


-- -----------------------------------------------------
-- Table `proiect`.`calendar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`calendar` (
  `idActivitate` INT NULL,
  `date_time` DATETIME NULL,
  `nrMaxStudenti` INT NULL,
  INDEX `fk2_idx` (`idActivitate` ASC) VISIBLE,
  CONSTRAINT `fk2`
    FOREIGN KEY (`idActivitate`)
    REFERENCES `proiect`.`activitati_materie` (`idActivitate`));


-- -----------------------------------------------------
-- Table `proiect`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`student` (
  `idStudent` INT NOT NULL AUTO_INCREMENT,
  `idUtilizator` INT NULL DEFAULT NULL,
  `oreSustinute` INT NULL,
  `an` INT NULL,
  PRIMARY KEY (`idStudent`),
  INDEX `fk11_idx` (`idUtilizator` ASC) VISIBLE,
  CONSTRAINT `fk11`
    FOREIGN KEY (`idUtilizator`)
    REFERENCES `proiect`.`utilizator` (`idUtilizator`));


-- -----------------------------------------------------
-- Table `proiect`.`grup_studiu_student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`grup_studiu_student` (
  `idGrupStudiu` INT NULL,
  `idStudent` INT NULL,
  INDEX `idStudent` (`idStudent` ASC) VISIBLE,
  INDEX `fk15_idx` (`idGrupStudiu` ASC) VISIBLE,
  CONSTRAINT `fk14`
    FOREIGN KEY (`idStudent`)
    REFERENCES `proiect`.`student` (`idStudent`),
  CONSTRAINT `fk15`
    FOREIGN KEY (`idGrupStudiu`)
    REFERENCES `proiect`.`grup_studiu` (`idGrupStudiu`));

-- -----------------------------------------------------
-- Table `proiect`.`student_activitati_grup`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`student_activitati_grup` (
  `idActivitate` INT NULL,
  `idStudent` INT NULL,
  INDEX `fk30_idx` (`idStudent` ASC) VISIBLE,
  CONSTRAINT `fk30`
    FOREIGN KEY (`idStudent`)
    REFERENCES `proiect`.`grup_studiu_student` (`idStudent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
-- -----------------------------------------------------
-- Table `proiect`.`informatii_logare`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`informatii_logare` (
  `idUtilizator` INT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  INDEX `fk17_idx` (`idUtilizator` ASC) VISIBLE,
  CONSTRAINT `fk17`
    FOREIGN KEY (`idUtilizator`)
    REFERENCES `proiect`.`utilizator` (`idUtilizator`));


-- -----------------------------------------------------
-- Table `proiect`.`note`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`note` (
  `idActivitate` INT NULL,
  `idStudent` INT NULL,
  `nota` FLOAT NULL,
  INDEX `fk3_idx` (`idActivitate` ASC) VISIBLE,
  CONSTRAINT `fk3`
    FOREIGN KEY (`idActivitate`)
    REFERENCES `proiect`.`activitati_materie` (`idActivitate`));


-- -----------------------------------------------------
-- Table `proiect`.`profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`profesor` (
  `idProfesor` INT NOT NULL AUTO_INCREMENT,
  `idUtilizator` INT NULL,
  `minim_ore` INT NULL,
  `maxim_ore` INT NULL,
  PRIMARY KEY (`idProfesor`),
  INDEX `fk_idProfesor` (`idProfesor` ASC) VISIBLE,
  INDEX `fk10_idx` (`idUtilizator` ASC) VISIBLE,
  CONSTRAINT `fk10`
    FOREIGN KEY (`idUtilizator`)
    REFERENCES `proiect`.`utilizator` (`idUtilizator`));


-- -----------------------------------------------------
-- Table `proiect`.`profesor_materie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`profesor_materie` (
  `idProfesor` INT NULL,
  `idMaterie` INT NULL,
  INDEX `fk_idProfesor_idx` (`idProfesor` ASC) VISIBLE,
  INDEX `fk6_idx` (`idMaterie` ASC) VISIBLE,
  CONSTRAINT `fk6`
    FOREIGN KEY (`idMaterie`)
    REFERENCES `proiect`.`materie` (`idMaterie`),
  CONSTRAINT `fk7`
    FOREIGN KEY (`idProfesor`)
    REFERENCES `proiect`.`profesor` (`idProfesor`));


-- -----------------------------------------------------
-- Table `proiect`.`student_materie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proiect`.`student_materie` (
  `idStudent` INT NULL DEFAULT NULL,
  `idMaterie` INT NULL DEFAULT NULL,
  `idProfesor` INT NULL DEFAULT NULL,
  `data_inscriere` DATE NULL,
  `nota` FLOAT NULL,
  INDEX `idStudent` (`idStudent` ASC) VISIBLE,
  INDEX `fk8_idx` (`idMaterie` ASC) VISIBLE,
  CONSTRAINT `fk8`
    FOREIGN KEY (`idMaterie`)
    REFERENCES `proiect`.`materie` (`idMaterie`),
  CONSTRAINT `fk9`
    FOREIGN KEY (`idStudent`)
    REFERENCES `proiect`.`student` (`idStudent`));

