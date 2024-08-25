CREATE DATABASE IF NOT EXISTS sample;

CREATE TABLE IF NOT EXISTS student (
	rollNo int primary key,
    s_name varchar(50) not null,
    marks int
);

