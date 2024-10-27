package org.benz.elements;

import org.openqa.selenium.By;

public class WebElement extends Element {

    public WebElement(By[] storage)
    {
        this.storage= storage;
    }

    protected int index(){
        return 0;
    }

    public By getBy(){
        return storage[this.index()];
    }

}
