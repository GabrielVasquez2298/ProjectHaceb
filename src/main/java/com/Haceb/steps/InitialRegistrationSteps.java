package com.Haceb.steps;
import com.Haceb.pages.InictialRegistration;

import com.Haceb.commons.commons;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;



import java.util.Set;


public class InitialRegistrationSteps extends commons {

  @Page
  InictialRegistration inictialRegistration;

    @Step("Open Browser")
    public void openBrowser() {
        try {
            inictialRegistration.openUrl("https://www.haceb.com/");
            // Wait for 10 seconds
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step("Close the PopUp")
    public void closePopUp() {
        inictialRegistration.getDriver().findElement(inictialRegistration.getBtnCloseModal()).click();

    }
    @Step("Hover on register botton")
    public void hoverBotton(){
        commons.hover(inictialRegistration.getDriver(), inictialRegistration.getBtnRegistrationList());
    }
    @Step("Click Register")
    public void ClickBtnRegister(){
        inictialRegistration.getDriver().findElement(inictialRegistration.getBtnRegister()).click();
    }
    @Step("Click botton register popup")
    public void ClickbtnregisterPopUp(){
        try {
            inictialRegistration.getDriver().findElement(inictialRegistration.getBtnRegisterModal()).click();

            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    @Step("Change Window")
    public void changeWindow(){
        commons.changeWindow(inictialRegistration.getDriver());
    }


}
