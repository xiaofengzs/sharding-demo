package com.zxf.shardingdemo;

import com.zxf.shardingdemo.entities.Course;
import com.zxf.shardingdemo.entities.User;
import com.zxf.shardingdemo.mapper.CourseRepository;
import com.zxf.shardingdemo.mapper.UserRepository;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class ShardingDemoApplicationTests {

    @Autowired
    public CourseRepository courseRepository;

    @Autowired
    public UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void test_sharding() throws InterruptedException {
        int count = 0;
        int changeDatabase = 0;
        while (true) {
            Course course = new Course();
            course.setCname("test");
            course.setStatus("active");
            course.setUserId(100L+ changeDatabase);

            courseRepository.save(course);
            count ++;
            if (count % 2 == 0) {
                changeDatabase ++;
            }

            if (count >= 20) {
                break;
            }
            Thread.sleep(1000);
        }
    }

    @Test
    void find() {
        val byId = courseRepository.findById(948239992411389953L);
        System.out.println(byId);

        Course course = new Course();
        course.setUserId(114L);
        courseRepository.findAll(Example.of(course));

        course.setUserId(113L);

        courseRepository.findAll(Example.of(course));
    }

    @Test
    void testUserSharding() {

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("zxf");
            userRepository.save(user);

        }
    }

    @Test
    void testUserShardingFind() {
        User user = new User();
        user.setName("zxf");
        System.out.println(userRepository.findById(948262742941237248L));
//        userRepository.save(user);
    }
}
