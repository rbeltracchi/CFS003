
DROP DATABASe if exists `pets`;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mascotas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pets` DEFAULT CHARACTER SET utf8 ;
USE `pets` ;
-- -----------------------------------------------------
-- Table `pets`.`TABLA_USUARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pets`.`TABLA_USUARIO` (
  `idUsuario` INTEGER NOT NULL,
  `apellidoynombre` VARCHAR(50) NOT NULL,
  `correo` varchar(30) NOT NULL unique,
  `contrasenia` varchar(10) NOT NULL,
  `direccion` varchar(30) NULL,
  `telefono` INTEGER NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `pets`.`TABLA_MASCOTA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pets`.`TABLA_MASCOTA` (
  `idMascota` INTEGER NOT NULL,
  `nombre` VARCHAR(15) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `color` varchar(20) NOT NULL,
  `sexo` varchar(6) NOT NULL,
  PRIMARY KEY (`idMascota`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pets`.`TABLA_FICHA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pets`.`TABLA_FICHA` (
  `idFicha` INT NOT NULL,
  `idMascota` INT NOT NULL,
  `idUsuario` INT NOT NULL,
  `estado` varchar(10) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idFicha`),
  INDEX `fk_TABLA_FICHA_TABLA_MASCOTA_idx` (`idMascota` ASC),
  INDEX `fk_TABLA_FICHA_TABLA_USUARIO_idx` (`idUsuario` ASC),
  CONSTRAINT `fk_TABLA_FICHA_TABLA_MASCOTA`
    FOREIGN KEY (`idMascota`)
    REFERENCES `pets`.`TABLA_MASCOTA` (`idMascota`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_TABLA_FICHA_TABLA_USUARIO`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `pets`.`TABLA_USUARIO` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- insertar usuarios
insert into `TABLA_USUARIO`(`idUsuario`,`apellidoynombre`,`correo`,`contrasenia`,`direccion`, `telefono`) values (1,"Blanco Miguel","miguelblanco@gmail.com","migue123","Beiro 450",4423433);
insert into `TABLA_USUARIO`(`idUsuario`,`apellidoynombre`,`correo`,`contrasenia`,`direccion`, `telefono`) values (2,"Ambar Monica","monicaambar@gmail.com","monica123","Quintana 678",4447865);
insert into `TABLA_USUARIO`(`idUsuario`,`apellidoynombre`,`correo`,`contrasenia`,`direccion`, `telefono`) values (3,"Luna Leticia","leticialuna@gmail.com","leti123","San Martin 56",4433987);
insert into `TABLA_USUARIO`(`idUsuario`,`apellidoynombre`,`correo`,`contrasenia`,`direccion`, `telefono`) values (4,"Lopez Samuel","samuellopez@gmail.com","sam123","loberia 98",4446733);
insert into `TABLA_USUARIO`(`idUsuario`,`apellidoynombre`,`correo`,`contrasenia`,`direccion`, `telefono`) values (5,"Suarez Elvira","elvirasuarez@gmail.com","elvi123","pedersen 35",4432860);

-- insertar mascotas
insert into `TABLA_MASCOTA`(`idMascota`,`nombre`,`tipo`,`color`,`sexo`) values (1,"coco","perro","marron","macho");
insert into `TABLA_MASCOTA`(`idMascota`,`nombre`,`tipo`,`color`,`sexo`) values (2,"uma","perro","negra","hembra");
insert into `TABLA_MASCOTA`(`idMascota`,`nombre`,`tipo`,`color`,`sexo`) values (3,"felix","gato","gris","macho");
insert into `TABLA_MASCOTA`(`idMascota`,`nombre`,`tipo`,`color`,`sexo`) values (4,"NN1","gato","blanco","hembra");
insert into `TABLA_MASCOTA`(`idMascota`,`nombre`,`tipo`,`color`,`sexo`) values (5,"NN2","perro","blanco y negro","macho");
-- insertar fichas
insert into `TABLA_FICHA`(`idFicha`,`IdMascota`,`IdUsuario`,`estado`,`descripcion`, `fecha`) values (1,2,3,"perdido", "zona parque", "18-03-01");
insert into `TABLA_FICHA`(`idFicha`,`IdMascota`,`IdUsuario`,`estado`,`descripcion`, `fecha`) values (2,3,2,"perdido", "sarmiento al 500", "18/05/14");
insert into `TABLA_FICHA`(`idFicha`,`IdMascota`,`IdUsuario`,`estado`,`descripcion`, `fecha`) values (3,4,1,"encontrado", "rivadavia al 100","18/05/29");
insert into `TABLA_FICHA`(`idFicha`,`IdMascota`,`IdUsuario`,`estado`,`descripcion`, `fecha`) values (4,1,5,"encontrado", "marconi al 1500","18/06/09");
insert into `TABLA_FICHA`(`idFicha`,`IdMascota`,`IdUsuario`,`estado`,`descripcion`, `fecha`) values (5,5,4,"encontrado", "mitre al 1400","18/06/13");