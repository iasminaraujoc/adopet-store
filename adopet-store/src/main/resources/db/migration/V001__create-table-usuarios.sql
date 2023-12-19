CREATE TABLE usuarios(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,

    PRIMARY KEY(id)
);

CREATE TABLE perfis(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL UNIQUE,

    PRIMARY KEY(id)
);

CREATE TABLE usuarios_perfis(
    usuario_id BIGINT NOT NULL,
    perfil_id BIGINT NOT NULL,

    PRIMARY KEY(usuario_id, perfil_id),
    CONSTRAINT USUARIOS_PERFIS_FK_USUARIO FOREIGN KEY(usuario_id) REFERENCES usuarios(id),
    CONSTRAINT USUARIOS_PERFIS_FK_PERFIL FOREIGN KEY(perfil_id) REFERENCES perfis(id)

);

INSERT INTO perfis VALUES(1, 'ROLE_ADMIN');
INSERT INTO perfis VALUES(2, 'ROLE_COMPRADOR');

INSERT INTO usuarios VALUES(1, 'Administrador', 'admin@email.com.br', '$2a$10$Y50UaMFOxteibQEYLrwuHeehHYfcoafCopUazP12.rqB41bsolF5.');
INSERT INTO usuarios VALUES(2, 'Comprador', 'comprador@email.com.br', '$2a$10$Y50UaMFOxteibQEYLrwuHeehHYfcoafCopUazP12.rqB41bsolF5.');

INSERT INTO usuarios_perfis values(1, 1);
INSERT INTO usuarios_perfis values(2, 2);