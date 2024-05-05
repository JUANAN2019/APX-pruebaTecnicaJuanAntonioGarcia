# APX-pruebaTecnica
 

## Descripción:

Este proyecto  inserta un registro en la base de datos y devuelve los datos insertados en el registro, con los campos id, nuip, full_name, phone y address. 

## Características:
+ **Artifact:** WIKJ123.
+ **Id:** El id es primary key y no puede ser nulo y es de tipo Number.
+ **nuip**: Es numero de identtificacion internacional, es de tipo Number y  hace la validacion para que no inserte dos registros con el mismo nuip declarando este campo como UNIQUE cuando se crea la tabla.
+ **full_name:** Es de tipo String
+ **phone:** Es de tipo String.
+ **address:** Es de tipo String
## Creacion tabla en BD:

CREATE TABLE WIKJ."T_WIKJ_HAB_PRUEBAFINAL"(<br>
    id NUMBER(5) NOT NULL PRIMARY KEY,<br>
	nuip NUMBER(10) UNIQUE ,<br>
	full_name VARCHAR(50),<br>
	phone VARCHAR(15),<br>
	address VARCHAR(30)<br>
)

## Imagenes de Postman:

![Image](/images/PruebaTecPostman1.png)<br><br>
![Image](/images/PruebaTecPostman.png)




* En las imagenes se ve como se hacen dos peticiones, hace la insercion de los datos y devuelve el registro insertado tras hacer el select en la base de datos.

## Documentación:

* La documentación completa del proyecto está disponible en :
https://drive.google.com/drive/folders/1gzC4LFA1ZF5IOX2amDKJK0_l7Ot1J2lH?usp=sharing



* Si desea  contactar conmigo, puede hacerlo a través de linkedin:
 https://www.linkedin.com/in/juan-agg
