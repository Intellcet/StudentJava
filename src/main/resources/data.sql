INSERT INTO group_ (id, group_number) VALUES (1, 3631);
INSERT INTO group_ (id, group_number) VALUES (2, 3621);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(1, 'Василий', 'Пупкин', SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(2, 'Петя', 'Петров', SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(3, 'Василиса', 'Васильева', SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(4, 'Роман', 'Бобиков', SELECT id FROM group_ WHERE group_number = 3621);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(5, 'Владимир', 'Петрухин', SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(6, 'Златопуст', 'Локанс', SELECT id FROM group_ WHERE group_number = 3621);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(7, 'Констанция', 'Сальвиолли', SELECT id FROM group_ WHERE group_number = 3631);