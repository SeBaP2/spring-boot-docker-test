package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Madzia nie chce ze mną graaaaaaaaaaaaaaaaaaaaaać w <b>Memoria</b> :'(((((((((((((((((<br/>"
                + "<br/>"
                + "Ale za to Madzia zabija <i>Żołnierzem 76</i> w <b>Overwatch</b> ^.^";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
