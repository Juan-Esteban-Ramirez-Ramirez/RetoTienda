package co.com.reto.choucair.stepdefinitions;


import co.com.reto.choucair.model.ChoucairData;
import co.com.reto.choucair.questions.Answeer;
import co.com.reto.choucair.tasks.Dress;
import co.com.reto.choucair.tasks.Login;
import co.com.reto.choucair.tasks.Openn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class AutomationStepdefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^the user is on the main page$")
    public void theUserIsOnTheMainPage() {

        OnStage.theActorCalled("Juan").wasAbleTo(Openn.thePage());

    }


    @When("^user logs in$")
    public void userLogsIn(List<ChoucairData> ChoucairData)  {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.very(ChoucairData));

    }

    @When("^choose the preferred dress$")
    public void chooseThePreferredDress()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Dress.well());

    }

    @Then("^confirm the purchase so that it can be sent to your address$")
    public void confirmThePurchaseSoThatItCanBeSentToYourAddress(List<ChoucairData> ChoucairData) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answeer.compra(ChoucairData), Matchers.equalTo(ChoucairData.get(0).getConfirmation())));

    }


}
