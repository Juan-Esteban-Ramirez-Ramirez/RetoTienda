package co.com.reto.choucair.tasks;

import co.com.reto.choucair.userinterface.PageMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Openn implements Task {

    private PageMap pageMap;


    public static Openn thePage() {
        return Tasks.instrumented(Openn.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageMap));

    }




}
