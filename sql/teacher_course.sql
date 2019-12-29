CREATE VIEW teacher_course
            (teacher_id, teacher_name, teacher_sex, teacher_protitle, teacher_phone, course_id, course_name, term,
             course_hour,tea_identity,teach_hour)
AS
SELECT sy.teacher.teacher_id,
       sy.teacher.name,
       sy.teacher.sex,
       sy.teacher.protitle,
       sy.teacher.phone,
       sy.course.course_id,
       sy.course.course_name,
       sy.course.term,
       sy.course.course_hour,
sy.tc.tea_identity,
sy.tc.teach_hour

FROM sy.teacher
         LEFT OUTER JOIN sy.tc
                         ON sy.teacher.teacher_id = sy.tc.teacher_id
         LEFT OUTER JOIN sy.course
                         ON sy.tc.course_id = sy.course.course_id