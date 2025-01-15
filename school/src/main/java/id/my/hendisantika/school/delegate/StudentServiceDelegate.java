package id.my.hendisantika.school.delegate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

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
@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceDelegate {
    private final RestTemplate restTemplate;

    public String callStudentServiceAndGetData(String schoolname) {
        log.info("Consul Demo - Getting School details for {}", schoolname);
        String response = restTemplate.exchange("http://student-service/getStudentDetailsForSchool/{schoolname}", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        }, schoolname).getBody();

        log.info("Response Received as {} -  {}", response, new Date());
        return "School Name -  " + schoolname + " :::  Student Details " + response + " -  " + new Date();
    }

}
