ALTER TABLE Drama_Tags
    DROP CONSTRAINT FK_Drama_Tags_Dramas_DramaID
GO

ALTER TABLE Drama_Tags
    DROP CONSTRAINT FK_Drama_Tags_Tags_TagId
GO

ALTER TABLE Dramas
    DROP CONSTRAINT FK_Dramas_Countries_CountryId
GO

ALTER TABLE Dramas
    DROP CONSTRAINT FK_Dramas_Genres_GenreId
GO

ALTER TABLE Dramas
    DROP CONSTRAINT FK_Dramas_Tags_TagId
GO

CREATE SEQUENCE drama_seq START WITH 1 INCREMENT BY 50
GO

CREATE TABLE drama
(
    id         bigint    NOT NULL,
    drama_name varchar(255),
    year       int       NOT NULL,
    rating     float(53) NOT NULL,
    imageurl   varchar(255),
    genreid    int       NOT NULL,
    countryid  int       NOT NULL,
    tagid      int       NOT NULL,
    CONSTRAINT pk_drama PRIMARY KEY (id)
)
GO

DROP TABLE Countries
GO

DROP TABLE Drama_Tags
GO

DROP TABLE Dramas
GO

DROP TABLE Genres
GO

DROP TABLE Tags
GO

DROP TABLE __EFMigrationsHistory
GO