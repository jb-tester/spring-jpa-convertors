DROP TABLE IF EXISTS person;
CREATE TABLE person (
                         id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                         gr INT,
                         name VARCHAR(255),
                         phone VARCHAR(30)
);
INSERT INTO person(gr, name, phone) VALUES ( 1, 'vasya', 5554567 );
INSERT INTO person(gr, name, phone) VALUES ( 2, 'petya', 5551234 );
INSERT INTO person(gr, name, phone)VALUES (3, 'julia' , 7774555);