package impl;

import command.HelloCommand;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

@SuppressWarnings("deprecation")
@Component
@Service(value = HelloCommand.class)
@Properties({
        @Property(name = "osgi.command.scope", value = "practice"),
        @Property(name = "osgi.command.function", value = "hello")
})
public class HelloCommandImpl implements HelloCommand {

    public void hello() {
        System.out.println("Hello");
    }

    public void hello(String param) {
        System.out.println("Hello, " + param);
    }
}