GO
CREATE SEQUENCE genre_seq START WITH 1 INCREMENT BY 50
GO

CREATE TABLE genre
(
    id         bigint NOT NULL,
    genre_name varchar(255),
    CONSTRAINT pk_genre PRIMARY KEY (id)
)
GO