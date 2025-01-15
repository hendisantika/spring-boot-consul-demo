package id.my.hendisantika.school.controller;

import id.my.hendisantika.school.delegate.StudentServiceDelegate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/01/25
 * Time: 06.19
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class SchoolServiceController {

    private final StudentServiceDelegate studentServiceDelegate;

    @GetMapping(value = "/getSchoolDetails/{schoolname}")
    public String getStudents(@PathVariable String schoolname) {
        log.info("Going to call student service to get data!");
        return studentServiceDelegate.callStudentServiceAndGetData(schoolname);
    }

}
