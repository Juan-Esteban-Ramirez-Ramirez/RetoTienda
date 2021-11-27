package co.com.reto.choucair.tasks;

import co.com.reto.choucair.userinterface.PageMap;
import co.com.reto.choucair.util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.sql.Time;

public class Dress implements Task {

    Wait wait;

    public static Dress well() {
        return Tasks.instrumented(Dress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageMap.DRESSES),
                Click.on(PageMap.PRENDA),
                Click.on(PageMap.ADD), Click.on(PageMap.NEXT), Click.on(PageMap.NEXT_SUMMARY),
                 Click.on(PageMap.NEXT_SIGN), Click.on(PageMap.OK_SERVICE),
                Click.on(PageMap.NEXT_SHIPPING), Click.on(PageMap.PAGO), Click.on(PageMap.OK_PAGO));





    }
}
