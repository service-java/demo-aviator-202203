package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AviatorApplicationTests {

    @Test
    void genCode() {
        Map<String,Object> evn = new HashMap<String,Object>(){{
            put("x",2);
            put("y",4);
            put("z",8);
        }};

        // AviatorExecutor.executeBigDecimal(AviatorContext.builder().expression("max(x,y,z,h)").env(evn).build());

    }

}
