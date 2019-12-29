CREATE VIEW student_course
            (sc_id,student_id, student_name,student_sex,student_major, student_class_name,course_id, course_name, term,
             course_hour,score)
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
       sy.sc.score

FROM sy.student
         LEFT OUTER JOIN sy.sc
                         ON sy.student.student_id = sy.sc.student_id
         LEFT OUTER JOIN sy.course
                         ON sy.sc.course_id= sy.course.course_id