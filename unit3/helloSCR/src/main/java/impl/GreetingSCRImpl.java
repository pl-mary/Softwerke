package impl;

import api.GreetingSCR;
import org.apache.felix.scr.annotations.*;

@SuppressWarnings("deprecation")
@Component()
@Service(value = GreetingSCR.class)
public class GreetingSCRImpl implements GreetingSCR {

    @Override
    public void sayHello() {
        System.out.println("Hello OGSi world!");
    }

    @Activate
    protected void activate() {
        System.out.println("Greeting bundle activated");
    }

    @Deactivate
    protected void deactivate() {
        System.out.println("Greeting bundle deactivated");
    }
}