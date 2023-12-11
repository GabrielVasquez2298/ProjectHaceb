package com.Exito.stepDefinitions;
import com.Exito.steps.AddProductSteps;


import net.thucydides.core.annotations.Steps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;


public class AddProductStepDefinitions {

    @Steps
    AddProductSteps addProductSteps;

    @Dado("user opens the browser")
    public void userOpensBrowser() {


        try {
            addProductSteps.OpensBrowser();

            // Espera durante 10 segundos antes de cerrar la página
            Thread.sleep(3000); // 5000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            // Manejo de excepciones si hay interrupción durante el sleep
            e.printStackTrace();
        }
        addProductSteps.ClickPopUp();
    }
    @Y("principal menu is opened")
    public void openPrincipalMenu() {
        addProductSteps.ClickMenu();;
    }

    @Y("sports category is selected")
    public void selectSports() {
        addProductSteps.ClickSports();


    }
    @Y("the off-road bike category is selected")
    public void selectMountainBikes() {

        addProductSteps.ClickMountainBikes();
    }
   @Cuando("the user identifies the product")
    public void clickOnTheAddButton() {

        addProductSteps.getInfoProduct();


    }


    @Y("click on the add button")
    public void clickAddButton() {
        addProductSteps.btnAddCar();


    }
    @Y("the user enters the shopping cart")
    public void theUserEntersTheShoppingCart() {
        addProductSteps.btnMyCart();

    }
    @Y("User inserts the credentials and confirm")
    public void addCredentialsConfirm(){
        addProductSteps.AddEmailAndConfirm();
    }
    @Entonces("the user will be able to view the added product")
    public void theUserWillBeAbleToViewTheAddedProduct() {

        addProductSteps.isSameProduct();
    }


}
