package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }


    public String getUrl(){

        return Driver.get().getCurrentUrl();
    }
}
