package id.my.hendisantika.studentservice.controller;

import id.my.hendisantika.studentservice.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

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

    private static final Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();

}
