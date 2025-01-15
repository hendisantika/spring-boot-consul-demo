package id.my.hendisantika.studentservice.model;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/01/25
 * Time: 06.09
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String name;
    private String className;

    public Student(String name, String className) {
        super();
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
