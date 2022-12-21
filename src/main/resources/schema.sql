DROP TABLE IF EXISTS county_native_name cascade;
DROP TABLE IF EXISTS country_name cascade;

CREATE TABLE IF NOT EXISTS country_name
(
    id   BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    CONSTRAINT UQ_NAME UNIQUE (name)
);

CREATE TABLE IF NOT EXISTS county_native_name
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    native_name VARCHAR(250) NOT NULL,
    country_id  BIGINT REFERENCES country_name (id),
    CONSTRAINT UQ_NATIVE_NAME UNIQUE (native_name)
);
