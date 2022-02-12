package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "signin_button")
    public WebElement homeSignInButton;

    @FindBy(id = "user_login")
    public WebElement userNameBox;

    @FindBy(id = "user_password")
    public WebElement passwordBox;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement signInClickButton;

    @FindBy(css = ".alert")
    public WebElement loginWarningMessage;

    public void validSignIn(){

        homeSignInButton.click();

        userNameBox.sendKeys(ConfigurationReader.get("username"));

        passwordBox.sendKeys(ConfigurationReader.get("password"));

        signInClickButton.click();

        Driver.get().navigate().back();


    }

    public void invlaidSignIn(){
        homeSignInButton.click();

        userNameBox.sendKeys(ConfigurationReader.get("wrongusername"));

        passwordBox.sendKeys(ConfigurationReader.get("wrongpassword"));

        signInClickButton.click();





    }

}
