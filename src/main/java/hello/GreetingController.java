package hello;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//The RestController makes the class a controller where every method returns a domain object instead of a view.
@RestController
public class GreetingController{

    private static final String greetingTempalate = "Howdy, %s!";
    private static final String goodbyeTemplate = "Goodbye, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(greetingTempalate, name));
    }

    @RequestMapping("/goodbye")
    public Goodbye goodbye(@RequestParam(value="name", defaultValue = "World") String name){
        return new Goodbye(counter.incrementAndGet(), String.format(goodbyeTemplate, name));
    }
}