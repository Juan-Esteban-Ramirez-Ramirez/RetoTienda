package co.com.reto.choucair.util;

import net.serenitybdd.core.pages.PageObject;

public class Wait extends PageObject {



    public void time(String seg){
        int segundos = Integer.parseInt(seg);
        waitFor(segundos).second();

    }
}
