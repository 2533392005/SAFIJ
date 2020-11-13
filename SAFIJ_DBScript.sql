SET FOREIGN_KEY_CHECKS = 0;
CREATE DATABASE IF NOT EXISTS SAFIJ;
USE SAFIJ;

DROP TABLE IF EXISTS pais;
CREATE TABLE pais (
pais_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Pais',
pais_nombre varchar(100) COMMENT 'Nombre',
pais_nacionalidad varchar(100) COMMENT 'Nacionalidad/Gentilicio',
pais_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
pais_usuario_crea varchar(11) COMMENT 'Auditoria',
pais_fecha_crea datetime COMMENT 'Auditoria',
pais_usuario_modifica varchar(11) COMMENT 'Auditoria',
pais_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (pais_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad pais';


DROP TABLE IF EXISTS departamento;
CREATE TABLE departamento (
departamento_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Departamento',
departamento_nombre varchar(100) COMMENT 'Nombre',
departamento_pais_id varchar(11) COMMENT 'Llave primaria - pais',
departamento_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
departamento_usuario_crea varchar(11) COMMENT 'Auditoria',
departamento_fecha_crea datetime COMMENT 'Auditoria',
departamento_usuario_modifica varchar(11) COMMENT 'Auditoria',
departamento_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (departamento_id),
KEY fk_departamento_pais_id (departamento_pais_id),
CONSTRAINT fk_departamento_pais_id FOREIGN KEY (departamento_pais_id) REFERENCES pais (pais_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad departamento';


DROP TABLE IF EXISTS municipio;
CREATE TABLE municipio (
municipio_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Municipio',
municipio_nombre varchar(100) COMMENT 'Nombre',
municipio_departamento_id varchar(11) COMMENT 'Llave primaria - departamento',
municipio_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
municipio_usuario_crea varchar(11) COMMENT 'Auditoria',
municipio_fecha_crea datetime COMMENT 'Auditoria',
municipio_usuario_modifica varchar(11) COMMENT 'Auditoria',
municipio_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (municipio_id),
KEY fk_municipio_departamento_id (municipio_departamento_id),
CONSTRAINT fk_municipio_departamento_id FOREIGN KEY (municipio_departamento_id) REFERENCES departamento (departamento_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad Municipio';


DROP TABLE IF EXISTS ciudad;
CREATE TABLE ciudad (
ciudad_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Ciudad',
ciudad_nombre varchar(100) COMMENT 'Nombre',
ciudad_municipio_id varchar(11) COMMENT 'Llave primaria - municipio',
ciudad_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
ciudad_usuario_crea varchar(11) COMMENT 'Auditoria',
ciudad_fecha_crea datetime COMMENT 'Auditoria',
ciudad_usuario_modifica varchar(11) COMMENT 'Auditoria',
ciudad_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (ciudad_id),
KEY fk_ciudad_municipio_id (ciudad_municipio_id),
CONSTRAINT fk_ciudad_municipio_id FOREIGN KEY (ciudad_municipio_id) REFERENCES municipio (municipio_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad Ciudad';


DROP TABLE IF EXISTS genero;
CREATE TABLE genero (
genero_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Genero',
genero_nombre varchar(100) COMMENT 'Nombre',
genero_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
genero_usuario_crea varchar(11) COMMENT 'Auditoria',
genero_fecha_crea datetime COMMENT 'Auditoria',
genero_usuario_modifica varchar(11) COMMENT 'Auditoria',
genero_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (genero_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad genero';


DROP TABLE IF EXISTS civil;
CREATE TABLE civil (
estado_civil_id varchar(11) NOT NULL COMMENT 'Llave  primaria - estado civil',
estado_civil_nombre varchar(100) COMMENT 'Nombre',
estado_civil_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
estado_civil_usuario_crea varchar(11) COMMENT 'Auditoria',
estado_civil_fecha_crea datetime COMMENT 'Auditoria',
estado_civil_usuario_modifica varchar(11) COMMENT 'Auditoria',
estado_civil_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (estado_civil_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad estado_civil';


DROP TABLE IF EXISTS idioma;
CREATE TABLE idioma (
idioma_id varchar(11) NOT NULL COMMENT 'Llave  primaria - idioma',
idioma_nombre varchar(100) COMMENT 'Nombre',
idioma_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
idioma_usuario_crea varchar(11) COMMENT 'Auditoria',
idioma_fecha_crea datetime COMMENT 'Auditoria',
idioma_usuario_modifica varchar(11) COMMENT 'Auditoria',
idioma_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (idioma_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad idioma';


DROP TABLE IF EXISTS parentesco;
CREATE TABLE parentesco (
parentesco_id varchar(11) NOT NULL COMMENT 'Llave  primaria - parentesco',
parentesco_nombre varchar(100) COMMENT 'Nombre',
parentesco_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (-1= Eliminado, 0=inactivo, 1=activo)',
parentesco_usuario_crea varchar(11) COMMENT 'Auditoria',
parentesco_fecha_crea datetime COMMENT 'Auditoria',
parentesco_usuario_modifica varchar(11) COMMENT 'Auditoria',
parentesco_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (parentesco_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad idioma';


DROP TABLE IF EXISTS personal_profesion;
CREATE TABLE personal_profesion (
profesion_id varchar(11) NOT NULL COMMENT 'Llave  primaria - profesion',
profesion_nombre varchar(100) COMMENT 'Nombre',
profesion_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
profesion_usuario_crea varchar(11) COMMENT 'Auditoria',
profesion_fecha_crea datetime COMMENT 'Auditoria',
profesion_usuario_modifica varchar(11) COMMENT 'Auditoria',
profesion_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (profesion_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad profesion';


DROP TABLE IF EXISTS personal_persona;
CREATE TABLE personal_persona (
persona_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Persona',
persona_nombre1 varchar(100) COMMENT 'Nombre uno',
persona_nombre2 varchar(100) COMMENT 'Nombre dos',
persona_apellido1 varchar(100) COMMENT 'Apellido uno',
persona_apellido2 varchar(100) COMMENT 'Apellido dos',
persona_apellido3 varchar(100) COMMENT 'Apellido tres (casada)',
persona_fecha_nac datetime COMMENT 'Fecha de nacimiento',
persona_direccion varchar(300) COMMENT 'Dirección',
persona_telefono_fijo varchar(100) COMMENT 'Telefono fijo',
persona_telefono_movil varchar(100) COMMENT 'Telefono movil',
persona_dui varchar(20) COMMENT 'Dui',
persona_nit varchar(20) COMMENT 'nit',
persona_observaciones varchar(300) COMMENT 'Dui',
persona_genero_id varchar(11) COMMENT 'Llave primaria - Genero',
persona_estado_civil_id varchar(11) COMMENT 'Llave primaria - estado civil',
persona_profesion_id varchar(11) COMMENT 'Llave primaria - profesion',
persona_tipo varchar(11) NOT NULL DEFAULT 1 COMMENT '(0=contratado, 1=temporal, 2=outsourcing, 3=facilitador, 4=externo, 5=proveedor, 6=cliente)',
persona_municipio_id varchar(11) COMMENT 'Llave primaria - municipio',
persona_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (0=inactivo, 1=activo, 2= Eliminado)',
persona_usuario_crea varchar(11) COMMENT 'Auditoria',
persona_fecha_crea datetime COMMENT 'Auditoria',
persona_usuario_modifica varchar(11) COMMENT 'Auditoria',
persona_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (persona_id),
KEY fk_persona_genero_id (persona_genero_id),
KEY fk_persona_estado_civil_id (persona_estado_civil_id),
KEY fk_persona_profesion_id (persona_profesion_id),
KEY fk_persona_municipio_id (persona_municipio_id),
CONSTRAINT fk_persona_genero_id FOREIGN KEY (persona_genero_id) REFERENCES genero (genero_id),
CONSTRAINT fk_persona_estado_civil_id FOREIGN KEY (persona_estado_civil_id) REFERENCES civil (estado_civil_id),
CONSTRAINT fk_persona_profesion_id FOREIGN KEY (persona_profesion_id) REFERENCES personal_profesion (profesion_id),
CONSTRAINT fk_persona_municipio_id FOREIGN KEY (persona_municipio_id) REFERENCES municipio (municipio_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad persona';


DROP TABLE IF EXISTS personal_experiencia_laboral;
CREATE TABLE personal_experiencia_laboral (
experiencia_laboral_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Experiencia Laboral',
experiencia_laboral_empresa varchar(100) COMMENT 'Empresa',
experiencia_laboral_cargo varchar(100) COMMENT 'Cargo',
experiencia_laboral_anio int(2) COMMENT 'Anios de experiencia',
experiencia_laboral_fecha_desde datetime COMMENT 'Fecha desde',
experiencia_laboral_contacto varchar(100) COMMENT 'Contacto',
experiencia_laboral_telefono varchar(100) COMMENT 'Telefono',
experiencia_laboral_comentarios varchar(500) COMMENT 'Comentarios',
experiencia_laboral_persona_id varchar(11) COMMENT 'Llave primaria - Persona',
experiencia_laboral_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
experiencia_laboral_usuario_crea varchar(11) COMMENT 'Auditoria',
experiencia_laboral_fecha_crea datetime COMMENT 'Auditoria',
experiencia_laboral_usuario_modifica varchar(11) COMMENT 'Auditoria',
experiencia_laboral_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (experiencia_laboral_id),
KEY fk_experiencia_laboral_persona_id (experiencia_laboral_persona_id),
CONSTRAINT fk_experiencia_laboral_persona_id FOREIGN KEY (experiencia_laboral_persona_id) REFERENCES personal_persona (persona_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad Experiencia Laboral';


DROP TABLE IF EXISTS personal_habilidades;
CREATE TABLE personal_habilidades (
habilidades_id varchar(11) NOT NULL COMMENT 'Llave  primaria - Habilidades',
habilidades_descripcion varchar(500) COMMENT 'Descripción habilidad',
habilidades_porcentaje decimal(19,2) COMMENT 'Porcentaje sobre la habilidad',
habilidades_persona_id varchar(11) COMMENT 'Llave primaria - Persona',
habilidades_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
habilidades_usuario_crea varchar(11) COMMENT 'Auditoria',
habilidades_fecha_crea datetime COMMENT 'Auditoria',
habilidades_usuario_modifica varchar(11) COMMENT 'Auditoria',
habilidades_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (habilidades_id),
KEY fk_habilidades_persona_id (habilidades_persona_id),
CONSTRAINT fk_habilidades_persona_id FOREIGN KEY (habilidades_persona_id) REFERENCES personal_persona (persona_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad Habilidades';


DROP TABLE IF EXISTS personal_contactos;
CREATE TABLE personal_contactos (
contactos_id varchar(11) NOT NULL COMMENT 'Llave  primaria - contactos',
contactos_nombre varchar(300) COMMENT 'Nombre completo del contacto',
contacto_telefono_fijo varchar(100) COMMENT 'Telefono fijo',
contacto_telefono_movil varchar(100) COMMENT 'Telefono movil',
contactos_direccion varchar(300) COMMENT 'Dirección del contacto',
contactos_persona_id varchar(11) COMMENT 'Llave primaria - Persona',
contactos_parentesco_id varchar(11) COMMENT 'Llave primaria - Parentesco',
contactos_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
contactos_usuario_crea varchar(11) COMMENT 'Auditoria',
contactos_fecha_crea datetime COMMENT 'Auditoria',
contactos_usuario_modifica varchar(11) COMMENT 'Auditoria',
contactos_fecha_modifica datetime COMMENT 'Auditoria',
PRIMARY KEY (contactos_id),
KEY fk_contactos_persona_id (contactos_persona_id),
CONSTRAINT fk_contactos_persona_id FOREIGN KEY (contactos_persona_id) REFERENCES personal_persona (persona_id),
KEY fk_contactos_parentesco_id (contactos_parentesco_id),
CONSTRAINT fk_contactos_parentesco_id FOREIGN KEY (contactos_parentesco_id) REFERENCES parentesco (parentesco_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad contactos';


DROP TABLE IF EXISTS enrolamiento_accesos;
CREATE TABLE enrolamiento_accesos (
accesos_id varchar (11) NOT NULL,
accesos_nombre varchar(11) NOT NULL,
accesos_descripcion varchar(11),
accesos_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
accesos_nivel0 int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
accesos_nivel1 int(1) NOT NULL DEFAULT 0 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
accesos_nivel2 int(1) NOT NULL DEFAULT 0 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
accesos_nivel3 int(1) NOT NULL DEFAULT 0 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
accesos_nivel4 int(1) NOT NULL DEFAULT 0 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
accesos_id_usuario_crea varchar(11) comment 'id del usuario que creo el registro',
accesos_fecha_crea datetime comment 'fecha de creacion del registro',
accesos_id_usuario_modi varchar(11) comment 'id del usuario que modifico el registro',
accesos_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (accesos_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad enrolamiento_accesos';


DROP TABLE IF EXISTS enrolamiento_roles;
CREATE TABLE enrolamiento_roles (
roles_id varchar (11) NOT NULL,
roles_nombre varchar(11) NOT NULL,
roles_descripcion varchar(11),
roles_llave0 varchar(11),
roles_llave1 varchar(11),
roles_nivel0 int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
roles_nivel1 int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
roles_nivel2 int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
roles_nivel3 int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
roles_nivel4 int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
accesos_id varchar (11),
roles_estado int (1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
roles_id_usuario_crea varchar(11) comment 'id del usuario que creo el registro',
roles_fecha_crea datetime comment 'fecha de creacion del registro',
roles_id_usuario_modi varchar(11) comment 'id del usuario que modifico el registro',
roles_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (roles_id),
KEY fk_accesos_id (accesos_id),
CONSTRAINT fk_accesos_id FOREIGN KEY (accesos_id) REFERENCES enrolamiento_accesos(accesos_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad enrolamiento_roles';


DROP TABLE IF EXISTS enrolamiento_usuarios;
CREATE TABLE enrolamiento_usuarios (
usuario_id varchar(11) NOT NULL ,
persona_id varchar(11),
roles_id varchar (11),
accesos_id varchar (11),
usuarios_tipo int(1),
usuarios_descripcion varchar (200),
usuarios_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
usuarios_id_usuario_crea varchar(11) comment 'id del usuario que creo el registro',
usuarios_fecha_crea datetime comment 'fecha de creacion del registro',
usuarios_id_usuario_modi varchar(11) comment 'id del usuario que modifico el registro',
usuarios_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (usuario_id),
KEY fk_persona_id (persona_id),
CONSTRAINT fk_persona_id FOREIGN KEY (persona_id) REFERENCES personal_persona (persona_id),
KEY fk_roles_id (roles_id),
CONSTRAINT fk_roles_id FOREIGN KEY (roles_id) REFERENCES enrolamiento_roles (roles_id),
KEY fk_accesos_id0 (accesos_id),
CONSTRAINT fk_accesos_id0 FOREIGN KEY (accesos_id) REFERENCES enrolamiento_accesos (accesos_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad enrolamiento_usuarios';


DROP TABLE IF EXISTS estados;
CREATE TABLE estados (
estado_id int (3) comment 'id del estado - tabla estados',
nombre_estado varchar (50) comment 'nombre a mostrar en el sistema',
descripcion_estado varchar (100) comment 'Define el tipo de aplicacion del estado a la tabla',
estados_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
estados_id_usuario_crea varchar(11) comment 'id del usuario que creo el estado',
estados_fecha_crea datetime comment 'fecha de creacion del estado',
estados_id_usuario_modi varchar(11) comment 'id del usuario que modifico el estado',
estados_fecha_modi datetime comment 'fecha de modificacion del estado',
PRIMARY KEY (estado_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad Estados';


DROP TABLE IF EXISTS catalogo_agencias;
CREATE TABLE  catalogo_agencias (
agencias_id varchar(11) NOT NULL ,
agencias_nombre varchar(100) NOT NULL,
agencias_descripcion varchar(200),
agencias_direccion varchar (200),
pais_id varchar(11),
departamento_id varchar(11),
municipio_id varchar(11),
ciudad_id varchar(11),
agencia_usuario_id varchar(11) comment 'Usuario encargado de la agencia',
agencia_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
agencia_id_usuario_crea varchar(11) comment 'id del usuario que creo el registro',
agencia_fecha_crea datetime comment 'fecha de creacion del registro',
agencia_id_usuario_modi varchar(11) comment 'id del usuario que modifico el registro',
agencia_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (agencias_id),
KEY fk_pais_id0 (pais_id),
CONSTRAINT fk_pais_id0 FOREIGN KEY (pais_id) REFERENCES pais (pais_id),
KEY fk_departamento_id0 (departamento_id),
CONSTRAINT fk_departamento_id0 FOREIGN KEY (departamento_id) REFERENCES departamento (departamento_id),
KEY fk_municipio_id0 (municipio_id),
CONSTRAINT fk_municipio_id0 FOREIGN KEY (municipio_id) REFERENCES municipio (municipio_id),
KEY fk_ciudad_id0 (ciudad_id),
CONSTRAINT fk_ciudad_id0 FOREIGN KEY (ciudad_id) REFERENCES ciudad (ciudad_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad catalogo_agencias';


DROP TABLE IF EXISTS catalogo_tipo_activo;
CREATE TABLE catalogo_tipo_activo (
tipo_activo_id varchar(11) NOT NULL ,
tipo_activo_nombre varchar(100) NOT NULL,
tipo_activo_descripcion varchar(200),
tipo_activo_categoria int(1) COMMENT '0=activo principal ,1=subcategoria, 2=extraido de un activo ppal 3=extraido de una subcategoria', 
tipo_activo_categoria_origen int(1) COMMENT '0=activo principal ,1=subcategoria, 2=extraido de un activo ppal 3=extraido de una subcategoria', 
tipo_activo_cantidad_tiempo int(3),
tipo_activo_tiempo_id varchar(11) COMMENT 'Factor por el cual se efectuara la medicion de la vida util o depreciacion',
tipo_activo_porcentaje int(3) COMMENT 'Porcentaje sobre valor por escala de tiempo',
tipo_activo_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
tipo_activo_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
tipo_activo_fecha_crea datetime comment 'fecha de creacion del registro',
tipo_activo_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
tipo_activo_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (tipo_activo_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad catalogo_tipo_activo';


DROP TABLE IF EXISTS catalogo_tiempo;
CREATE TABLE catalogo_tiempo (
tiempo_id varchar(11) NOT NULL ,
tiempo_nombre varchar(100) NOT NULL,
tiempo_descripcion varchar (100),
tiempo_magnitud varchar (100) COMMENT '0=anio, 1=semestre, 2=trimestre, 3=bimestre, 4=mensual, 5=quincenal, 6=semanal, 7=diario',
tiempo_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
tiempo_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
tiempo_fecha_crea datetime comment 'fecha de creacion del registro',
tiempo_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
tiempo_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (tiempo_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad catalogo_tiempo';


DROP TABLE IF EXISTS periodos;
CREATE TABLE periodos (
periodos_id varchar(11) NOT NULL,
periodos_nombre varchar(100) NOT NULL,
periodos_descripcion varchar(100) NOT NULL,
periodos_fecha_inicio datetime comment 'fecha de inicio del periodo',
periodos_fecha_fin datetime comment 'fecha de finalizacion del periodo',
periodos_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
periodos_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
periodos_fecha_crea datetime comment 'fecha de creacion del registro',
periodos_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
periodos_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (periodos_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad periodos';


DROP TABLE IF EXISTS transaccion;
CREATE TABLE transaccion (
transaccion_id varchar(11) NOT NULL,
transaccion_servicio int(1) NOT NULL,
transaccion_orientacion int(1) NOT NULL COMMENT '1=Request, 2=Response',
transaccion_tipo int(1) NOT NULL COMMENT '1=Creacion, 2=Recuperacion, 3=Modificacion, 4=Borrar, 5=logueo al sistema, 6=salida del sistema',
transaccion_fecha_inicio datetime comment 'fecha de inicio de la transaccion',
transaccion_fecha_fin datetime comment 'fecha de finalizacion de la transaccion',
transaccion_periodo_id varchar(11),
transaccion_detalle LONGBLOB,
transaccion_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
transaccion_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
transaccion_fecha_crea datetime comment 'fecha de creacion del registro',
transaccion_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
transaccion_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (transaccion_id),
KEY fk_transaccion_periodo_id (transaccion_periodo_id),
CONSTRAINT fk_transaccion_periodo_id FOREIGN KEY (transaccion_periodo_id) REFERENCES periodos (periodos_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad transaccion';


DROP TABLE IF EXISTS inventario;
CREATE TABLE  inventario(
inventario_id varchar(11) NOT NULL,
bienes_id varchar(11) NOT NULL,
inventario_estado_inventario int(1) NOT NULL COMMENT 'Estado de Activo Fijo 0=creado, 1=activo, 2=obsoleto, 3=baja del inventario, 4=venta del activo',
inventario_agencia_id varchar(11) NOT NULL COMMENT 'Agencia en donde se encuentra fisicamente el activo',
inventario_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
inventario_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
inventario_fecha_crea datetime comment 'fecha de creacion del registro',
inventario_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
inventario_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (inventario_id),
KEY fk_inventario_agencia_id (inventario_agencia_id),
CONSTRAINT fk_inventario_agencia_id FOREIGN KEY (inventario_agencia_id) REFERENCES catalogo_agencias (agencias_id),
KEY fk_bienes_id (bienes_id),
CONSTRAINT fk_bienes_id FOREIGN KEY (bienes_id) REFERENCES bienes_detalles (bienes_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad inventario';


DROP TABLE IF EXISTS mantenimientos;
CREATE TABLE mantenimientos (
mantenimientos_id varchar(11) NOT NULL,
inventario_id varchar(11) NOT NULL,
mantenimientos_tipo int(1) NOT NULL COMMENT '1=programado, 2=solicitado 3=preventivo, 4=correctivo',
mantenimientos_condicion int(1) NOT NULL COMMENT '1=incluido, 2=contratado 3=licitado, 4=emergencia',
mantenimientos_monto_final decimal(19,2) NOT NULL COMMENT 'Monto por el cual se esta efectuando el mantenimiento',
mantenimientos_avance int(1) NOT NULL COMMENT '1=finalizado, 2=incompleto 3=reclamo, 4=reprogramacion',
mantenimientos_fecha_inicio datetime comment 'fecha de inicio del mantenimiento',
mantenimientos_fecha_fin datetime comment 'fecha de finalizacion del mantenimiento',
mantenimientos_detalle varchar (500) comment 'Detalles adicionales del mantenimiento',
mantenimientos_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo)',
mantenimientos_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
mantenimientos_fecha_crea datetime comment 'fecha de creacion del registro',
mantenimientos_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
mantenimientos_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (mantenimientos_id),
KEY fk_inventario_id (inventario_id),
CONSTRAINT fk_inventario_id FOREIGN KEY (inventario_id) REFERENCES inventario (inventario_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad mantenimientos';


DROP TABLE IF EXISTS depreciacion;
CREATE TABLE depreciacion (
depreciacion_id varchar(11) NOT NULL ,
inventario_id varchar(11) NOT NULL,
periodos_id varchar(11),
tipo_activo_id varchar(11),
depreciacion_fecha_inicio datetime COMMENT 'Fecha de inicio del calculo de depreciacion',
depreciacion_fecha_fin datetime COMMENT 'Fecha de inicio del calculo de depreciacion',
depreciacion_monto_inicial decimal(19,2) NOT NULL,
depreciacion_monto_depreciado decimal(19,2) NOT null,
depreciacion_monto_restante decimal(19,2) NOT NULL,
depreciacion_correlativo int(11) NOT NULL,
depreciacion_control varchar(11) NOT NULL,
depreciacion_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo',
depreciacion_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
depreciacion_fecha_crea datetime comment 'fecha de creacion del registro',
depreciacion_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
depreciacion_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (depreciacion_id),
KEY fk_periodos_id0 (periodos_id),
CONSTRAINT fk_periodos_id0 FOREIGN KEY (periodos_id) REFERENCES periodos (periodos_id),
KEY fk_tipo_activo_id (tipo_activo_id),
CONSTRAINT fk_tipo_activo_id FOREIGN KEY (tipo_activo_id) REFERENCES catalogo_tipo_activo (tipo_activo_id),
KEY fk_inventario_id1 (inventario_id),
CONSTRAINT fk_inventario_id1 FOREIGN KEY (inventario_id) REFERENCES inventario (inventario_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad depreciacion';


DROP TABLE IF EXISTS bienes;
CREATE TABLE bienes (
bienes_id varchar(11) NOT NULL ,
tipo_activo_id varchar(11) NOT NULL,
bienes_codigo varchar(11) NOT NULL,
bienes_no_factura varchar(500) COMMENT 'Numero de factura', 
bienes_no_ruc_proveed varchar(500) COMMENT 'Numero ruc proveedor',
bienes_fecha_compra datetime ,
bienes_monto_compra decimal(19,2),
bienes_fecha_venta datetime ,
bienes_monto_venta decimal(19,2),
bienes_descripcion varchar(500),
bienes_no_serie varchar(50) COMMENT 'Numero de serie',
bienes_estado_af varchar(50) COMMENT 'Estado af',
bienes_ubicacion_inicial varchar(50) COMMENT 'Ubicacion fisica inicial del bien',
bienes_responsable varchar(11) COMMENT 'Usuario responsable inicialmente del bien',
bienes_familia varchar(50) COMMENT 'familia a que pertenece',
bienes_sub_familia varchar(50) COMMENT 'familia a que pertenece',
bienes_codigo_adicional varchar(11) COMMENT 'Codigo adicional de identificacion',
bienes_razon_social varchar(50) COMMENT 'Razon social',
bienes_cantidad int(11),
bienes_cantidad_lote varchar(11),
bienes_no_poliza varchar(50) COMMENT 'Numero de poliza',
bienes_no_contrato varchar(50) COMMENT 'Numero del contrato',
bienes_tipo_adquisicion int(1) NOT NULL COMMENT '1=compra directa, 2=arrendamiento temporal, 3=arrendamiento contratado, 4=compra por arrendamiento, 5=servicio contratado',
bienes_estado_original int(1) COMMENT '1=unidad completa, 2=parte de una unidad, 3=resultado de desmantelamiento, 4=producto de otro bien, 5=generado uniendo bienes', 
bienes_estado_actual int(1) COMMENT '1=unidad completa, 2=parte de una unidad, 3=resultado de desmantelamiento, 4=producto de otro bien, 5=generado uniendo bienes', 
bienes_estado_procedencia int(1) COMMENT '1=unidad completa, 2=parte de una unidad, 3=resultado de desmantelamiento, 4=producto de otro bien, 5=generado uniendo bienes',
bienes_detalle varchar(500),
bienes_estado int(1) NOT NULL DEFAULT 1 COMMENT 'Estado de registro (2= Eliminado, 0=inactivo, 1=activo',
bienes_id_usuario_crea varchar (11) comment 'id del usuario que creo el registro',
bienes_fecha_crea datetime comment 'fecha de creacion del registro',
bienes_id_usuario_modi varchar (11) comment 'id del usuario que modifico el registro',
bienes_fecha_modi datetime comment 'fecha de modificacion del registro',
PRIMARY KEY (bienes_id),
KEY fk_bienes_tipo_activo_id (tipo_activo_id),
CONSTRAINT fk_bienes_tipo_activo_id FOREIGN KEY (tipo_activo_id) REFERENCES catalogo_tipo_activo (tipo_activo_id)
) ENGINE=InnoDB CHARSET=latin1 COMMENT='Entidad bienes';

commit;
insert into pais (pais_id,pais_nombre,pais_nacionalidad,pais_estado,pais_usuario_crea,pais_fecha_crea,pais_usuario_modifica,pais_fecha_modifica ) values (1,'El Salvador','Salvadorena',1,1,'2020-10-22 00:00:01',1,'2020-10-22 00:00:01');

insert into departamento (departamento_id,departamento_nombre,departamento_pais_id,departamento_estado,departamento_usuario_crea,departamento_fecha_crea,departamento_usuario_modifica,departamento_fecha_modifica ) values (1,'San Salvador',1,1,1,'2020-10-22 00:00:01',1,'2020-10-22 00:00:01');

insert into municipio (municipio_id,municipio_nombre,municipio_departamento_id,municipio_estado,municipio_usuario_crea,municipio_fecha_crea,municipio_usuario_modifica,municipio_fecha_modifica ) values (1,'San Salvador',1,1,1,'2020-10-22 00:00:01',1,'2020-10-22 00:00:01');

insert into genero (genero_id,genero_nombre,genero_estado,genero_usuario_crea,genero_fecha_crea,genero_usuario_modifica,genero_fecha_modifica) values (1,'Masculino',1,1,'2020-10-22 00:00:01',877,'2020-10-22 00:00:01');

insert into civil (estado_civil_id,estado_civil_nombre,estado_civil_estado,estado_civil_usuario_crea,estado_civil_fecha_crea,estado_civil_usuario_modifica,estado_civil_fecha_modifica) values (1,'Soltero',1,1,'2020-10-22 00:00:01',1,'2020-10-22 00:00:01');

insert into personal_profesion (profesion_id,profesion_nombre,profesion_estado,profesion_usuario_crea,profesion_fecha_crea,profesion_usuario_modifica,profesion_fecha_modifica ) values (1,'Profesional',1,1,'2020-10-22 00:00:01',1,'2020-10-22 00:00:01');

insert into enrolamiento_accesos (accesos_id,accesos_nombre,accesos_descripcion,accesos_estado,accesos_nivel0,accesos_nivel1,accesos_nivel2,accesos_nivel3,accesos_nivel4,accesos_id_usuario_crea,accesos_fecha_crea,accesos_id_usuario_modi,accesos_fecha_modi) values (1,1,1,1,1,1,1,1,1,'1','2020-10-22 22:28:00','1','2020-10-22 22:28:00');

insert into enrolamiento_roles (roles_id,roles_nombre,roles_descripcion,roles_llave0,roles_llave1,roles_nivel0,roles_nivel1,roles_nivel2,roles_nivel3,roles_nivel4,accesos_id,roles_estado,roles_id_usuario_crea,roles_fecha_crea,roles_id_usuario_modi,roles_fecha_modi ) values (1,1,1,1,'1',1,1,1,1,1,1,1,'1','2020-10-22 22:28:00','1','2020-10-22 22:28:00');

insert into enrolamiento_usuarios (usuario_id, persona_id, roles_id, accesos_id, usuarios_tipo, usuarios_descripcion, usuarios_estado, usuarios_id_usuario_crea, usuarios_fecha_crea, usuarios_id_usuario_modi, usuarios_fecha_modi)
values (11111, 99999, 1, 1, 5, 'Callejas', 1, 100011, '2020-10-22 22:28:00', 101, '2020-10-22 22:28:00');

commit;

