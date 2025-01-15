package id.my.hendisantika.studentservice.controller;

import id.my.hendisantika.studentservice.model.Student;
import lombok.extern.slf4j.Slf4j;
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

    private static final Map<String, List<Student>> schoolDB = new HashMap<String, List<Student>>();

    static {
        schoolDB = new HashMap<String, List<Student>>();

        List<Student> lst = new ArrayList<Student>();
        Student std = new Student("Sajal", "Class IV");
        lst.add(std);
        std = new Student("Lokesh", "Class V");
        lst.add(std);

        schoolDB.put("abcschool", lst);

        lst = new ArrayList<Student>();
        std = new Student("Kajal", "Class III");
        lst.add(std);
        std = new Student("Sukesh", "Class VI");
        lst.add(std);

        schoolDB.put("xyzschool", lst);

    }

}
