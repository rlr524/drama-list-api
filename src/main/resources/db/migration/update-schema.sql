GO
CREATE SEQUENCE tag_seq START WITH 1 INCREMENT BY 50
GO

CREATE TABLE tag
(
    id       bigint NOT NULL,
    tag_name varchar(255),
    CONSTRAINT pk_tag PRIMARY KEY (id)
)
GO