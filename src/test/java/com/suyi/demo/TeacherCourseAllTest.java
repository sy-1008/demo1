package com.suyi.demo;

import com.suyi.demo.mapper.TeacherCourseAllMapper;
import com.suyi.demo.service.TeacherCourseAllService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TeacherCourseAllTest {
    @Resource
    TeacherCourseAllService teacherCourseAllService;
    @Resource
    TeacherCourseAllMapper teacherCourseAllMapper;

    @Test
    void deleteTest() {
        teacherCourseAllService.deleteteachercourse("1001", "1002");
    }

    @Test
    void deleteMaaperTest(){
        teacherCourseAllMapper.deleteteachercourse("1002", "1001");
    }
}
