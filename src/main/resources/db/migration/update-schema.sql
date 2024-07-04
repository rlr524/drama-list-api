GO
CREATE SEQUENCE country_seq START WITH 1 INCREMENT BY 50
GO

CREATE TABLE country
(
    id           bigint NOT NULL,
    country_name varchar(255),
    CONSTRAINT pk_country PRIMARY KEY (id)
)
GO