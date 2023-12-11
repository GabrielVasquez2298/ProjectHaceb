package com.Haceb.stepDefinitions;



import com.Haceb.steps.InitialRegistrationSteps;
import com.Haceb.steps.RegistrationDetailsSteps;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import io.cucumber.java.es.Y;


public class RegisterInToHacebStepDefinitions {


    @Steps
    InitialRegistrationSteps initialRegistrationSteps;
    @Steps
    RegistrationDetailsSteps registrationDetailsSteps;



    @Dado("user is on the Haceb.com")
    public void userInRegisterPage() {

        initialRegistrationSteps.openBrowser();
        initialRegistrationSteps.closePopUp();
        initialRegistrationSteps.hoverBotton();
        initialRegistrationSteps.ClickBtnRegister();
        initialRegistrationSteps.ClickbtnregisterPopUp();
        initialRegistrationSteps.changeWindow();
    }
    @Cuando("the user completes the registration form")
    public void completesRegistrationForm() {
       registrationDetailsSteps.entryinformation();
    }
    @Cuando("Click on the register button")
    public void clickOnRegisterButton() {

        registrationDetailsSteps.clickRegisterBotton();
        registrationDetailsSteps.entryInformationStep2();
        registrationDetailsSteps.changeWindow();
    }
    /*@Entonces("the user should be able to view their profile")
    public void viewProfile() {
        homePageSteps.textProfile();
    }*/

}
