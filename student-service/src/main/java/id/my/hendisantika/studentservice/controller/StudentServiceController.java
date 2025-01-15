package id.my.hendisantika.studentservice.controller;

import id.my.hendisantika.studentservice.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/01/25
 * Time: 06.10
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
public class StudentServiceController {

    private static Map<String, List<Student>> schoolDB = new HashMap<>();

    static {
        schoolDB = new HashMap<>();

        List<Student> lst = new ArrayList<>();
        Student std = new Student("Yuji", "Class IV");
        lst.add(std);
        std = new Student("Naobara", "Class V");
        lst.add(std);

        schoolDB.put("Jujutsu Kaisen High School", lst);

        lst = new ArrayList<>();
        std = new Student("Gojo", "Class III");
        lst.add(std);
        std = new Student("Geto", "Class VI");
        lst.add(std);

        schoolDB.put("Konoha", lst);
    }

    @GetMapping(value = "/getStudentDetailsForSchool/{schoolname}")
    public List<Student> getStudents(@PathVariable String schoolname) {
        log.info("Getting Student details for {}", schoolname);

        List<Student> studentList = schoolDB.get(schoolname);
        if (studentList == null) {
            studentList = new ArrayList<>();
            Student std = new Student("Not Found", "N/A");
            studentList.add(std);
        }
        return studentList;
    }

}
