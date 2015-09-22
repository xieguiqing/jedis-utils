package org.yatech.jedis.utils.lua

import spock.lang.Specification

/**
 * Created by yinona on 22/09/15.
 */
class LuaConditionsSpec extends Specification {

    def 'isNull throws for non-local arguments'() {
        given:
        def value = Mock(LuaValue)

        when:
        LuaConditions.isNull(value)

        then:
        thrown(IllegalArgumentException)
    }

}
