package com.sample.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by satish on 20/06/17.
 */

@RestController
public class WelcomeController {


@Autowired
    private WelcomeService service ;

    @RequestMapping("/welcome")
    public String welcome(){
        return service.retrieveWelcomeMessage();
    }

    @RequestMapping("/status")
    public String status(){
        return service.retrieveStatusMessage();
    }

    @RequestMapping(method = { RequestMethod.GET }, value = { "/hello" })
    public String sayHello(HttpServletResponse response) {
        return "hello";
    }


}
@Component
class WelcomeService {
    public String retrieveWelcomeMessage() {
        return "This is Great Spring Welcome";
    }

    public String retrieveStatusMessage() {
        return "This is Status Message";
    }

}
