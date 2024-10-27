package org.benz.elements;

import org.openqa.selenium.By;

public abstract class Element {
    //private final By locator;
    protected By[] storage;

    protected abstract int index();

    public By getBy() {
        return storage[index()];
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (By el : storage) {
            sb.append(el.toString());
        }
        return sb.toString();
    }

    public String getXpath() {
        String xpath = this.getBy().toString();
        if (xpath.contains(".xpath")) {
            xpath = xpath.substring(10);
        } else {
            xpath = xpath.substring(7);
        }
        return xpath;
    }

}