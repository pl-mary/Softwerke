package client;

import api.GreetingSCR;
import org.apache.felix.scr.annotations.*;

@SuppressWarnings("deprecation")
@Component
public class HelloClientSCR {

    @Reference(policy = ReferencePolicy.DYNAMIC)
    private volatile GreetingSCR greetingService;

    @Activate
    public void activate(){
        greetingService.sayHello();
    }

    @Deactivate
    public void deactivate(){
        System.out.println("HelloClient deactivated");
    }
}
