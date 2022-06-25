package com.ingjuanfg.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Contar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        for(int i=0; i<10; i++){
            System.out.println("Hola");
        }
    }

    public static Contar hastaDiez(){
        return instrumented(Contar.class);
    }
}
