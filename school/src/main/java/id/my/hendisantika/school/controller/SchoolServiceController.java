package id.my.hendisantika.school.controller;

import id.my.hendisantika.school.delegate.StudentServiceDelegate;
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
@RestController
public class SchoolServiceController {

    private final StudentServiceDelegate studentServiceDelegate;
}
