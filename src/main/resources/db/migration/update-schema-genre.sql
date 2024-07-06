CREATE TABLE drama_genres
(
    drama_id  bigint NOT NULL,
    genres_id bigint NOT NULL,
    CONSTRAINT pk_drama_genres PRIMARY KEY (drama_id, genres_id)
)
GO

CREATE TABLE genre_dramas
(
    genre_id  bigint NOT NULL,
    dramas_id bigint NOT NULL,
    CONSTRAINT pk_genre_dramas PRIMARY KEY (genre_id, dramas_id)
)
GO

ALTER TABLE drama_genres
    ADD CONSTRAINT fk_dragen_on_drama FOREIGN KEY (drama_id) REFERENCES drama (id)
GO

ALTER TABLE drama_genres
    ADD CONSTRAINT fk_dragen_on_genre FOREIGN KEY (genres_id) REFERENCES genre (id)
GO

ALTER TABLE genre_dramas
    ADD CONSTRAINT fk_gendra_on_drama FOREIGN KEY (dramas_id) REFERENCES drama (id)
GO

ALTER TABLE genre_dramas
    ADD CONSTRAINT fk_gendra_on_genre FOREIGN KEY (genre_id) REFERENCES genre (id)
GO

DECLARE @sql [nvarchar](MAX)
SELECT @sql = N'ALTER TABLE drama DROP CONSTRAINT ' + QUOTENAME([df].[name])
FROM [sys].[columns] AS [c]
         INNER JOIN [sys].[default_constraints] AS [df]
                    ON [df].[object_id] = [c].[default_object_id]
WHERE [c].[object_id] = OBJECT_ID(N'drama')
  AND [c].[name] = N'genreid'
EXEC sp_executesql @sql
GO

ALTER TABLE drama
    DROP COLUMN genreid
GO