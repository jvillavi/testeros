package com.jvillavi.tester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesterController {

    @GetMapping("/mensaje")
    public Respuesta mensaje(@RequestParam(value = "saludo") String saludo) {
        var respuesta = new Respuesta();
        respuesta.setMensaje("El mensaje fue: "+saludo);

        return respuesta;
    }

}
