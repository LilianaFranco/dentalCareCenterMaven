CREATE TABLE if NOT EXISTS dentists (id INT PRIMARY KEY, dentalLicense INT, lastname VARCHAR(100), name VARCHAR(100));
CREATE TABLE if NOT EXISTS patients (id INT PRIMARY KEY, idCard INT, lastname VARCHAR(100), name VARCHAR(100), address VARCHAR(100), registrationDate DATE);
