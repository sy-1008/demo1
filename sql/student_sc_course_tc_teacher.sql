CREATE VIEW student_sc_course_tc_teacher
            (sc_id, student_id, student_name, student_sex, student_major, student_class_name, course_id, course_name,
             term,
             course_hour, score, teacher_id, tea_identity, teach_hour, teacher_name,teacher_sex,protitle, phone)
AS
SELECT sy.sc.sc_id,
       sy.student.student_id,
       sy.student.name,
       sy.student.sex,
       sy.student.major,
       sy.student.class_name,
       sy.course.course_id,
       sy.course.course_name,
       sy.course.term,
       sy.course.course_hour,
       sy.sc.score,
       sy.tc.teacher_id,
       sy.tc.tea_identity,
       sy.tc.teach_hour,
       sy.teacher.name,
       sy.teacher.sex,
       sy.teacher.protitle,
       sy.teacher.phone
FROM sy.student
         LEFT OUTER JOIN sy.sc
                         ON sy.student.student_id = sy.sc.student_id
         LEFT OUTER JOIN sy.course
                         ON sy.sc.course_id = sy.course.course_id
         LEFT OUTER JOIN sy.tc
                         ON sy.sc.course_id = sy.tc.course_id
         LEFT OUTER JOIN sy.teacher
                         ON sy.tc.teacher_id = sy.teacher.teacher_id