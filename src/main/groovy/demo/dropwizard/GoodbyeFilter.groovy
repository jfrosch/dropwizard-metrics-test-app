package demo.dropwizard

import com.codahale.metrics.Metric
import com.codahale.metrics.MetricFilter

class GoodbyeFilter implements MetricFilter {

    @Override
    boolean matches(String name, Metric metric) {
        name.toLowerCase().contains 'goodbye'
    }
}
