package com.Haceb.pages;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;



public class InictialRegistration extends PageObject{

    private final By btnRegistrationList =By.xpath("/html/body/header/div[2]/div[6]/div[2]");
    private final By btnRegister =By.xpath("/html/body/header/div[2]/div[6]/div[2]/div/a[2]");
    private final By btnRegisterModal =By.xpath("//*[@id=\"vtexIdUI-custom-oauth\"]");
    private final By btnCloseModal =By.xpath("//a[@aria-label='close window']\n");

    public By getBtnRegistrationList() {
        return btnRegistrationList;
    }

    public By getBtnRegister() {
        return btnRegister;
    }

    public By getBtnRegisterModal() {
        return btnRegisterModal;
    }

    public By getBtnCloseModal() {
        return btnCloseModal;
    }

}
