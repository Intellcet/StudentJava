INSERT INTO group_ (id, group_number) VALUES (1, 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(1, 'Василий', 'Пупкин', SELECT id FROM group_ WHERE group_number = 3631);