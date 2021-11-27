package co.com.reto.choucair.tasks;

import co.com.reto.choucair.model.ChoucairData;
import co.com.reto.choucair.userinterface.PageMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private List<ChoucairData> choucairData;

    public Login (List<ChoucairData> choucairData)
    {

        this.choucairData = choucairData;
    }

    public static Login very(List<ChoucairData> choucairData) {
        return Tasks.instrumented(Login.class,choucairData);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageMap.SIGN_IN),
                Enter.theValue(choucairData.get(0).getEmail()).into(PageMap.EMAIL),
                Enter.theValue(choucairData.get(0).getPassword()).into(PageMap.PASSWORD), Click.on(PageMap.BUTTON_IN)








        );




    }
}
