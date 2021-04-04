CREATE TABLE IF NOT EXISTS users (

    id int NOT NULL PRIMARY KEY,
    username varchar(250),
    fullName varchar(250),
    email varchar(250),
    birthDay timestamp,
    gender varchar(250),
    photo varchar(250)

);