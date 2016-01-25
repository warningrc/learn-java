package com.warningrc.test

import spock.lang.Specification


class BlocksSpec extends Specification{

    def "测试feature method的代码块"(){
        expect:
        Service service = new Service();
        String name = service.name(null);
    }

    def "测试一下条件失败的错误提示"(){
        setup:
        def elem = "push me"
        def stack = new Stack<Object>();

        when:
        stack.push(elem)

        then:
        !stack.empty
        stack.size() == 2
    }
}
