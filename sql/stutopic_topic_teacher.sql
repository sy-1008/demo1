CREATE VIEW stutopic_topic_teacher
            (stu_topic_id,student_id,select_time,flag,topic_id,course_id,teacher_id,topic,keyword,creation_time,
                student_num,name,sex,phone,protitle)
AS
SELECT sy.stutopic.stutopic_id,
       sy.stutopic.student_id,

       sy.stutopic.select_time,
       sy.stutopic.flag,
       sy.topic.topic_id,
       sy.topic.course_id,
       sy.topic.teacher_id,
       sy.topic.topic,
       sy.topic.keyword,
       sy.topic.creation_time,
       sy.topic.student_num,

       sy.teacher.name,
       sy.teacher.sex,
       sy.teacher.phone,
       sy.teacher.protitle


FROM sy.stutopic
         LEFT OUTER JOIN sy.topic
                         ON sy.stutopic.topic_id= sy.topic.topic_id
         LEFT OUTER JOIN sy.teacher
                         ON sy.topic.teacher_id=sy.teacher.teacher_id
