package com.Haceb.pages;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrationMoreDetails extends PageObject {
    private final By txtEmail =By.xpath("(//input[@name='email' and @class='gigya-input-text'])[4]");
    private final By txtName =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[5]/input");
    private final By txtLastName =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[6]/input");
    private final By txtPassword =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[7]/input");
    private final By textPasswordComf =By.xpath("//*[@id=\"gigya-password-142670944012194750\"]");
    private final By btnCheckbox =By.xpath("//*[@id=\"gigya-checkbox-70031539084410860\"]");
    private final By btnCheckbox2 =By.xpath("//*[@id=\"gigya-multiChoice-0-98366419479004930\"]");
    private final By btnRegister =By.xpath("//*[@id=\"gigya-register-form\"]/div[2]/div[11]/input");
    private final By txtId = By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[3]/input");
    private final By chooseGender = By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[4]/select");
    private final By chooseCountryCode =By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[6]/fieldset/select");
    private final By chooseCounty=By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[7]/select");
    private final By chooseTown=By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[8]/select");
    private final By btnSend =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[8]/font/font/input");
    private final By txtBirthday =By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[5]/input");
    private final By txtNumber =By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[6]/fieldset/input");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getTextPasswordComf() {
        return textPasswordComf;
    }

    public By getBtnCheckbox() {
        return btnCheckbox;
    }

    public By getBtnCheckbox2() {
        return btnCheckbox2;
    }

    public By getBtnRegister() {
        return btnRegister;
    }

    public By getTxtId() {
        return txtId;
    }

    public By getChooseGender() {
        return chooseGender;
    }

    public By getChooseCountryCode() {
        return chooseCountryCode;
    }

    public By getChooseCounty() {
        return chooseCounty;
    }

    public By getChooseTown() {
        return chooseTown;
    }

    public By getBtnSend() {
        return btnSend;
    }

    public By getTxtBirthday() {
        return txtBirthday;
    }

    public By getTxtNumber() {
        return txtNumber;
    }





}
