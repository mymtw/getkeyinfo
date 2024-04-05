package com.paypal.pyplcheckout.model;

public class GenericViewData<T> {
    private T viewData;

    public GenericViewData(T t) {
        this.viewData = t;
    }

    public T getViewData() {
        return this.viewData;
    }

    public void setViewData(T t) {
        this.viewData = t;
    }
}
