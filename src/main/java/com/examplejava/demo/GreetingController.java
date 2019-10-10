package com.examplejava.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//The RestController makes the class a controller where every method returns a domain object instead of a view.
@RestController
public class GreetingController {
    
    private final AtomicLong counter = new AtomicLong();
    private static final String greetingTempalate = "Howdy, %s!";
    private static final String goodbyeTemplate = "Goodbye, %s!";

    @RequestMapping(value = { "/", "", "mypeeps", "knownPeople" })
    public People index() {
        return new People(counter.incrementAndGet(), KnownPeople.printPeople());
    }

    @RequestMapping(value = { "/greeting", "/greetings", "/hello" })
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        KnownPeople.addPerson(name);
        return new Greeting(counter.incrementAndGet(), String.format(greetingTempalate, name));
    }

    @RequestMapping(value = { "/goodbye", "/bye" })
    public Goodbye goodbye(@RequestParam(value = "name", defaultValue = "World") String name) {
        KnownPeople.removePerson(name);
        return new Goodbye(counter.incrementAndGet(), String.format(goodbyeTemplate, name));
    }

    @RequestMapping(value = { "/dude", "/bro" })
    public String dude() {
        return "got here";
    }
}