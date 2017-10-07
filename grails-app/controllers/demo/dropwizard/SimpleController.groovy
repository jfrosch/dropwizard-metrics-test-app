package demo.dropwizard

class SimpleController {
	static responseFormats = ['json']

    SimpleService simpleService

    def sayGoodbye(String name) {
        respond ([message: simpleService.sayGoodbye(name)])
    }

    def sayHello(String name) {
        respond ([message: simpleService.sayHello(name)])
    }
}
