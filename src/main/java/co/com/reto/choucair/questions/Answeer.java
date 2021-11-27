package co.com.reto.choucair.questions;

import co.com.reto.choucair.model.ChoucairData;
import co.com.reto.choucair.userinterface.PageMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answeer implements Question<String> {

    private List<ChoucairData> choucairData;

    public Answeer (List<ChoucairData> choucairData){

        this.choucairData = choucairData;
    }

    public static Answeer compra(List<ChoucairData> choucairData){

        return new Answeer(choucairData);
    }


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PageMap.COMPRA).viewedBy(actor).asString();
    }
}
