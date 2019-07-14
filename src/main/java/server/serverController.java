package server;

import bean.Employee;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/server")

public class serverController {

    /**
     * We are using constructor based dependecny injection.
     */

    @RequestMapping(value = "/employee/xml", method = RequestMethod.GET, produces = { "application/xml", "text/xml" })
    public ResponseEntity<Employee> getXML() {
        Employee employee = new Employee(1,"sonia","saini","sonia@gmail.com");
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);

    }
    @RequestMapping(value = "/employee/null", method = RequestMethod.GET)
    public ResponseEntity<String> getNull() {
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);

    }
    @RequestMapping(value = "/employee/string", method = RequestMethod.GET,produces = { "application/text", "text/plain" })
    public ResponseEntity<String> getString() {
        String str = new String("sonia:saini:sonia@gmail.com");
        return new ResponseEntity<String>(str, HttpStatus.OK);

    }


}
