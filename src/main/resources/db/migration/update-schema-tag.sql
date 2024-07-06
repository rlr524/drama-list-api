CREATE TABLE drama_tags
(
    drama_id bigint NOT NULL,
    tags_id  bigint NOT NULL,
    CONSTRAINT pk_drama_tags PRIMARY KEY (drama_id, tags_id)
)
GO

CREATE TABLE tag_dramas
(
    tag_id    bigint NOT NULL,
    dramas_id bigint NOT NULL,
    CONSTRAINT pk_tag_dramas PRIMARY KEY (tag_id, dramas_id)
)
GO

ALTER TABLE drama_tags
    ADD CONSTRAINT fk_dratag_on_drama FOREIGN KEY (drama_id) REFERENCES drama (id)
GO

ALTER TABLE drama_tags
    ADD CONSTRAINT fk_dratag_on_genre FOREIGN KEY (tags_id) REFERENCES tag (id)
GO

ALTER TABLE tag_dramas
    ADD CONSTRAINT fk_tagdra_on_drama FOREIGN KEY (dramas_id) REFERENCES drama (id)
GO

ALTER TABLE tag_dramas
    ADD CONSTRAINT fk_tagdra_on_tag FOREIGN KEY (tag_id) REFERENCES tag (id)
GO

DECLARE @sql [nvarchar](MAX)
SELECT @sql = N'ALTER TABLE drama DROP CONSTRAINT ' + QUOTENAME([df].[name])
FROM [sys].[columns] AS [c]
         INNER JOIN [sys].[default_constraints] AS [df]
                    ON [df].[object_id] = [c].[default_object_id]
WHERE [c].[object_id] = OBJECT_ID(N'drama')
  AND [c].[name] = N'tagid'
EXEC sp_executesql @sql
GO

ALTER TABLE drama
    DROP COLUMN tagid
GO