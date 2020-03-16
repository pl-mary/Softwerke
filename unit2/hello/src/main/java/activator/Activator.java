package activator;

import api.Greeting;
import impl.GreetingImpl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import javax.print.attribute.standard.MediaSize;

public class Activator implements BundleActivator {
    private static final String NAME = "Greeting bundle";

    public void start(BundleContext ctx) throws Exception {
        ctx.registerService(Greeting.class.getName(),
                new GreetingImpl("OSGi world"), null);
        System.out.println(NAME + " registered");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println(NAME + " stopped");
    }
}
