CREATE DATABASE IF NOT EXISTS course_db_0;

USE course_db_0;


CREATE TABLE course_0
(
    cid     BIGINT(20) PRIMARY KEY,
    cname   VARCHAR(50) NOT NULL,
    user_id BIGINT(20) NOT NULL,
    status  VARCHAR(50) NOT NULL
);

CREATE TABLE course_1
(
    cid     BIGINT(20) PRIMARY KEY,
    cname   VARCHAR(50) NOT NULL,
    user_id BIGINT(20) NOT NULL,
    status  VARCHAR(50) NOT NULL
);


CREATE DATABASE IF NOT EXISTS course_db_1;
USE course_db_1;
CREATE TABLE course_0
(
    cid     BIGINT(20) PRIMARY KEY,
    cname   VARCHAR(50) NOT NULL,
    user_id BIGINT(20) NOT NULL,
    status  VARCHAR(50) NOT NULL
);
CREATE TABLE course_1
(
    cid     BIGINT(20) PRIMARY KEY,
    cname   VARCHAR(50) NOT NULL,
    user_id BIGINT(20) NOT NULL,
    status  VARCHAR(50) NOT NULL
);

CREATE DATABASE IF NOT EXISTS user_db;
USE user_db;
CREATE TABLE user
(
    id     BIGINT(20) PRIMARY KEY,
    name   VARCHAR(50) NOT NULL
);