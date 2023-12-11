package com.Exito.steps;

import com.Exito.pages.AddProductExito;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class AddProductSteps {

java.lang.String product1;

java.lang.String product2;
    @Page
    AddProductExito addProductExito;

    @Step("Opens the browser")
    public void OpensBrowser(){
        addProductExito.openUrl("https://www.exito.com/");
    }

    @Step("Click on pop up")
    public void ClickPopUp(){
        addProductExito.getDriver().findElement(addProductExito.getBtnClosePopUp()).click();
    }

    @Step("Click on the principal menu")
    public void ClickMenu(){
        addProductExito.getDriver().findElement(addProductExito.getBtnMenu()).click();
    }


    @Step("Click on the Sports category")
    public void ClickSports(){

        //addProductExito.getDriver().findElement(addProductExito.getBtnSports()).click();
        //Localiza el elemento utilizando by
        WebElement elemento = addProductExito.getDriver().findElement(addProductExito.getBtnSports());
        //Crea una instancia de la clase Actions para realizar acciones avanzadas
        Actions actions = new Actions(addProductExito.getDriver());
        //Realiza la accion de hover sobre el elemento
        actions.moveToElement(elemento).perform();
    }

    @Step("Click on Mountain Bike")
    public void ClickMountainBikes(){
        addProductExito.getDriver().findElement(addProductExito.getBtnMountainBikes()).click();
    }


    @Step("the user identifies the product")
    public void getInfoProduct(){
        product1=addProductExito.getDriver().findElement(addProductExito.getInfoProduct()).getText();

    }


    @Step("click on the add button")
    public void btnAddCar(){
        addProductExito.getDriver().findElement(addProductExito.getBtnAddCart()).click();

    }

    @Step ("the user enters the shopping cart")
    public void btnMyCart(){
        addProductExito.getDriver().findElement(addProductExito.getBtnMyCart()).click();

    }

    @Step("User inserts the credentials and confirm")
    public void AddEmailAndConfirm() {
        addProductExito.getDriver().findElement(addProductExito.getTxtCorreo()).sendKeys("gabo@gmail.com");
        addProductExito.getDriver().findElement(addProductExito.getBtnConfirm()).click();
    }

    //In this step we will compare if we got the same product
    @Step("the user will be able to view the added product")

    public void isSameProduct(){
         product2 =addProductExito.getDriver().findElement(addProductExito.getAddedProduct()).getText();
         if(product1.equals(product2)) {


             System.out.println("*****************************************************************************************************************");
             System.out.println("es el mismo producto");
             System.out.println(product1);
             System.out.println(product2);
         }else{
             System.out.println("*****************************************************************************************************************");
             System.out.println("No es el mismo");
             System.out.println(product1);
             System.out.println(product2);
         }


    }


}
