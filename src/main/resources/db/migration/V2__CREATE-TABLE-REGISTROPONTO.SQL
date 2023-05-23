CREATE TABLE registroponto(
    idPonto BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    data DATE NOT NULL,
    horario TIME NOT NULL,
    latitude VARCHAR(255) NOT NULL,
    longitude VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    login_funcionario VARCHAR(255) NOT NULL,
    id_funcionario VARCHAR(14) NOT NULL,
    is_adjusted TINYINT(1) NOT NULL
);