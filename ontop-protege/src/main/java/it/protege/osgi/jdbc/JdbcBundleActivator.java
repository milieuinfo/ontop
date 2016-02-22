package it.protege.osgi.jdbc;


import com.google.common.collect.ImmutableList;
import it.protege.osgi.jdbc.impl.Activator;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.List;

/**
 * @author xiao
 */
public class JdbcBundleActivator implements BundleActivator {

    private List<BundleActivator> activators;

    @Override
    public void start(BundleContext context) throws Exception {
        activators = ImmutableList.of(
                new Activator(),
                new it.protege.osgi.jdbc.prefs.Activator());

        for (BundleActivator activator : activators) {
            activator.start(context);
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        for (BundleActivator activator : activators) {
            activator.stop(context);
        }

        activators = null;
    }
}