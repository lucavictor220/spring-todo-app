package com.utm; /**
 * Created by vitiok on 6/7/17.
 */
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/todo")
    public ToDo getTodo() {
        return new ToDo(counter.incrementAndGet(),
                "Study for interaction and multimedia exam");
    }

    /**
     *
     * passing parameter to /greeting root will come into value param as shown in below example
     * http://localhost:8080/greeting?name=User
     * @RequestMapping("/greeting")
    public com.utm.ToDo greeting(@RequestParam(value="name", defaultValue="Study for interaction and multimedia exam") String name) {
    return new com.utm.ToDo(counter.incrementAndGet(),
    String.format(template, name));
    }
     */
}