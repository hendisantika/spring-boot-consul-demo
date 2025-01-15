package id.my.hendisantika.school.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/01/25
 * Time: 06.16
 * To change this template use File | Settings | File Templates.
 */
@Service
public class StudentServiceDelegate {
    @Autowired
    RestTemplate restTemplate;

}
