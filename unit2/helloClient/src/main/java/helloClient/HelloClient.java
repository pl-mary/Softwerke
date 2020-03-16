package helloClient;

import api.Greeting;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloClient implements BundleActivator {
    private static final String NAME = "HelloClient bundle";

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        try {
            Greeting service = (Greeting) bundleContext.getService(bundleContext.getServiceReference(Greeting.class.getName()));
            service.sayHello();
        } catch (NullPointerException e) {
            System.err.println("Error while getting access to GreetingBundle");
        }
        System.out.println(NAME + " started");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println(NAME + " stopped");
    }
}
