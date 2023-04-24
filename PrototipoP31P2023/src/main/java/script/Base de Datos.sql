CREATE SCHEMA IF NOT EXISTS `cineVision` DEFAULT CHARACTER SET utf8 ;
USE `cineVision` ;

-- -----------------------------------------------------
-- Tabla Usuarios
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS tblUsuarios (
  idUsuarios INT NOT NULL AUTO_INCREMENT,
  Usuario VARCHAR(45) NULL,
  contra VARCHAR(45) NULL,
  PRIMARY KEY (idUsuarios)
  );

insert into tblUsuarios(Usuario,contra)values("monica","1234"); 
select * from tblUsuarios;
drop table tblUsuarios;


CREATE TABLE IF NOT EXISTS tbl_Clientes (
	clId int auto_increment,
    clNombre VARCHAR(40) NOT NULL,
    clNit varchar (25) NOT NULL,
    clDebe VARCHAR (25) NOT NULL,
    clHaber VARCHAR (25) NOT NULL,
    PRIMARY KEY(clId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into tbl_Clientes values("","Juan","1234","200","300"); 
select * from tbl_Clientes;