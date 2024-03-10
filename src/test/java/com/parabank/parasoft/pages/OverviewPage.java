package com.parabank.parasoft.pages;

import static io.qameta.allure.Allure.step;

public class OverviewPage extends BasePage{

    public OverviewPage thisPageTitle(){
        step("Checking page title.");
        System.out.println(getPageTitle());;
        return this;
    }

}
