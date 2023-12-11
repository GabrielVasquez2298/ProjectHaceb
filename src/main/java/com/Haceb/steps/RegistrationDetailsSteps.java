package com.Haceb.steps;
import com.Haceb.Utils.UserData;
import com.Haceb.commons.commons;
import com.Haceb.pages.RegistrationMoreDetails;
import org.fluentlenium.core.annotation.Page;
import net.thucydides.core.annotations.Step;

public class RegistrationDetailsSteps {
    @Page
    RegistrationMoreDetails registrationMoreDetails;
    @Page
    UserData userData;
    @Page
    commons commons;

    @Step("enter information ")
    public void entryinformation(){
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTxtEmail()).sendKeys(UserData.extractTo().get(0).get("Email"));
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTxtName()).sendKeys(UserData.extractTo().get(0).get("Name"));
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTxtLastName()).sendKeys(UserData.extractTo().get(0).get("LastName"));
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTxtPassword()).sendKeys(UserData.extractTo().get(0).get("Password"));
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTextPasswordComf()).sendKeys(UserData.extractTo().get(0).get("ConfirmPassword"));
        commons.executeScript(registrationMoreDetails.getDriver(), "arguments[0].checked = true;", registrationMoreDetails.getBtnCheckbox());
        commons.executeScript(registrationMoreDetails.getDriver(), "arguments[0].checked = true;", registrationMoreDetails.getBtnCheckbox2());

    }
    @Step("click register botton")
    public void clickRegisterBotton(){
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getBtnRegister()).click();
    }
    @Step("Second step")
    public void entryInformationStep2(){

        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTxtId()).sendKeys(UserData.extractTo().get(0).get("ID"));
        commons.selectElementByText(registrationMoreDetails.getDriver(), registrationMoreDetails.getChooseGender(),UserData.extractTo().get(0).get("Genero"));
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTxtBirthday()).sendKeys(UserData.extractTo().get(0).get("Birthday"));
        commons.selectElementByText(registrationMoreDetails.getDriver(),registrationMoreDetails.getChooseCountryCode(),UserData.extractTo().get(0).get("IndicadorPais"));
        registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getTxtNumber()).sendKeys(UserData.extractTo().get(0).get("Number"));
        commons.selectElementByText(registrationMoreDetails.getDriver(), registrationMoreDetails.getChooseCounty(),UserData.extractTo().get(0).get("County"));
        commons.selectElementByText(registrationMoreDetails.getDriver(), registrationMoreDetails.getChooseTown(),UserData.extractTo().get(0).get("Town"));
        try {
            registrationMoreDetails.getDriver().findElement(registrationMoreDetails.getBtnSend()).click();

            Thread.sleep(15000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    @Step("Change window")
    public void changeWindow(){
        commons.changeWindow(registrationMoreDetails.getDriver());
    }

}
