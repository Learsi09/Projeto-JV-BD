-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Crianças`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Crianças` (
  `idCrianças` INT NOT NULL,
  `Idade` INT NULL,
  `Altura` INT NULL,
  `Nome` VARCHAR(45) NULL,
  `Nacionalidade` VARCHAR(45) NULL,
  PRIMARY KEY (`idCrianças`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Adotante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Adotante` (
  `idAdotante` INT NOT NULL,
  `Nome` VARCHAR(45) NULL,
  `Idade` INT NULL,
  `Altura` INT NULL,
  `Nacionalidade` VARCHAR(45) NULL,
  PRIMARY KEY (`idAdotante`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`AppAdoção`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AppAdoção` (
  `idAppAdoção` INT NOT NULL,
  `AppAdoção_idAppAdoção` INT NOT NULL,
  PRIMARY KEY (`idAppAdoção`),
  INDEX `fk_Adotante_Adotante1_idx` (`AppAdoção_idAppAdoção` ASC) VISIBLE,
  CONSTRAINT `fk_Crianças_Crianças1`
    FOREIGN KEY ()
    REFERENCES `mydb`.`Crianças` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Adotante_Adotante1`
    FOREIGN KEY (`AppAdoção_idAppAdoção`)
    REFERENCES `mydb`.`Adotante` (`idAdotante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
