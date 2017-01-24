package demo

import grails.transaction.Transactional

class DemoController {

    HelperService helperService

    @Transactional()
    def index() {
        Person.withNewSession {
            helperService.doSomething()
        }

        render 'Success'
    }
}
