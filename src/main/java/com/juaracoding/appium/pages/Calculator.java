package com.juaracoding.appium.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class Calculator {

    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    private MobileElement btnSatu;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    private MobileElement btnTiga;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    private MobileElement btnEmpat;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    private MobileElement btnLima;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    private MobileElement btnEnam;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    private MobileElement btnTujuh;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    private MobileElement btnKurang;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    private MobileElement btnKali;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    private MobileElement btnBagi;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;

    //Method
    public void calcAdd() {
        btnSatu.click();
        btnKurang.click();
        btnKali.click();
        btnBagi.click();
        btnKurang.click();
        btnDua.click();
        btnTiga.click();
        btnEmpat.click();
        btnLima.click();
        btnEnam.click();
        btnTujuh.click();
        btnSamaDengan.click();
    }

    //
    public String getTxtResult() {
        return hasil.getText();
    }

}
