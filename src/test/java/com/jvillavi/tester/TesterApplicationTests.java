package com.jvillavi.tester;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TesterApplicationTests {

    @Autowired
    private TesterController servicio;

    @Test
    void contextLoads() {
    }

    @Test
    void probarSaludo(){
        String saludo = "Hola Mundo";

        assertThat(servicio).isNotNull();
    }

}
