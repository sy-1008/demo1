CREATE VIEW student_stutopic_topic
            (student_id, name, sex, major, class_name, stutopic_id, select_time, flag, topic_id, course_id, teacher_id,
             topic, keyword,
             creation_time,
             student_num)
AS
SELECT sy.student.student_id,
       sy.student.name,
       sy.student.sex,
       sy.student.major,
       sy.student.class_name,
       sy.stutopic.stutopic_id,
       sy.stutopic.select_time,
       sy.stutopic.flag,
       sy.topic.topic_id,
       sy.topic.course_id,
       sy.topic.teacher_id,
       sy.topic.topic,
       sy.topic.keyword,
       sy.topic.creation_time,
       sy.topic.student_num


FROM sy.student
         LEFT OUTER JOIN sy.stutopic
                         ON sy.student.student_id = sy.stutopic.student_id
         LEFT OUTER JOIN sy.topic
                         ON sy.stutopic.topic_id= sy.topic.topic_id
