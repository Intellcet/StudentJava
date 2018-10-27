INSERT INTO cathedra (id, cathedra_name) VALUES (1, 'ВММКС');
INSERT INTO cathedra (id, cathedra_name) VALUES (2, 'МиИ');

INSERT INTO professor (id, professor_name, cathedra_id) VALUES (1, 'Личинус',        SELECT id FROM cathedra WHERE cathedra_name = 'ВММКС');
INSERT INTO professor (id, professor_name, cathedra_id) VALUES (2, 'Пишков',         SELECT id FROM cathedra WHERE cathedra_name = 'ВММКС');
INSERT INTO professor (id, professor_name, cathedra_id) VALUES (3, 'Родионов В.И.',  SELECT id FROM cathedra WHERE cathedra_name = 'МиИ'  );
INSERT INTO professor (id, professor_name, cathedra_id) VALUES (4, 'Родионова А.Г.', SELECT id FROM cathedra WHERE cathedra_name = 'МиИ'  );
INSERT INTO professor (id, professor_name, cathedra_id) VALUES (5, 'Новикова Е.В.',  SELECT id FROM cathedra WHERE cathedra_name = 'МиИ'  );

INSERT INTO subject (id, subject_name, cathedra_id) VALUES (1, 'МСиС',             SELECT id FROM cathedra WHERE cathedra_name = 'ВММКС');
INSERT INTO subject (id, subject_name, cathedra_id) VALUES (2, 'Схемотехника ЭВМ', SELECT id FROM cathedra WHERE cathedra_name = 'ВММКС');
INSERT INTO subject (id, subject_name, cathedra_id) VALUES (3, 'Мат. Ан.',         SELECT id FROM cathedra WHERE cathedra_name = 'МиИ'  );
INSERT INTO subject (id, subject_name, cathedra_id) VALUES (4, 'Функ. Ан.',        SELECT id FROM cathedra WHERE cathedra_name = 'МиИ'  );
INSERT INTO subject (id, subject_name, cathedra_id) VALUES (5, 'Диф. Ур.',         SELECT id FROM cathedra WHERE cathedra_name = 'МиИ'  );

INSERT INTO group_ (id, group_number) VALUES (1, 3631);
INSERT INTO group_ (id, group_number) VALUES (2, 3621);

INSERT INTO student (id, first_name, last_name, group_id) VALUES(1, 'Василий',    'Пупкин',     SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(2, 'Петя',       'Петров',     SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(3, 'Василиса',   'Васильева',  SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(4, 'Роман',      'Бобиков',    SELECT id FROM group_ WHERE group_number = 3621);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(5, 'Владимир',   'Петрухин',   SELECT id FROM group_ WHERE group_number = 3631);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(6, 'Златопуст',  'Локанс',     SELECT id FROM group_ WHERE group_number = 3621);
INSERT INTO student (id, first_name, last_name, group_id) VALUES(7, 'Констанция', 'Сальвиолли', SELECT id FROM group_ WHERE group_number = 3631);

INSERT INTO group_subject (id, group_id, subject_id) VALUES (1, SELECT id FROM group_ WHERE group_number = 3621, SELECT id FROM subject WHERE subject_name = 'МСиС'            );
INSERT INTO group_subject (id, group_id, subject_id) VALUES (2, SELECT id FROM group_ WHERE group_number = 3631, SELECT id FROM subject WHERE subject_name = 'Схемотехника ЭВМ');
INSERT INTO group_subject (id, group_id, subject_id) VALUES (3, SELECT id FROM group_ WHERE group_number = 3621, SELECT id FROM subject WHERE subject_name = 'Мат. Ан.'        );
INSERT INTO group_subject (id, group_id, subject_id) VALUES (4, SELECT id FROM group_ WHERE group_number = 3621, SELECT id FROM subject WHERE subject_name = 'Функ. Ан.'       );
INSERT INTO group_subject (id, group_id, subject_id) VALUES (5, SELECT id FROM group_ WHERE group_number = 3621, SELECT id FROM subject WHERE subject_name = 'Диф. Ур.'        );