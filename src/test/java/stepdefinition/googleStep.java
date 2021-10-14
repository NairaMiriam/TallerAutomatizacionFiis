package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleStep {
    @Given("^que el usuario se encuentra en el home de google$")
    public void queElUsuarioSeEncuentraEnElHomeDeGoogle() {
    }

    @When("^se ingresa una palabra de busqueda \"([^\"]*)\"$")
    public void seIngresaUnaPalabraDeBusqueda(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^la aplicacion muestra el resultado de \"([^\"]*)\"$")
    public void laAplicacionMuestraElResultadoDe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
