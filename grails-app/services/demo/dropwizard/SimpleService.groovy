package demo.dropwizard

import grails.gorm.transactions.Transactional
import grails.plugin.dropwizard.metrics.meters.Metered

@Transactional(readOnly = true)
class SimpleService {

    @Metered('sayHello meter')
    String sayHello(String name) {
        name ? "Hello ${name}!" : 'Hello Stranger!'
    }

    @Metered('sayGoodbye meter')
    String sayGoodbye(String name) {
        name ? "Goodbye ${name}!" : 'Goodbye Stranger!'
    }
}
