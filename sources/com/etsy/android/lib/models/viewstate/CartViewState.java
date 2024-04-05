package com.etsy.android.lib.models.viewstate;

import java.io.Serializable;

public class CartViewState implements Serializable {
    public boolean mIsEditingShippingCosts = false;
    public boolean mIsLoading = false;
    public boolean mIsRequestingShippingCosts = false;
    public boolean mIsViewingShippingCosts = false;

    public boolean isEditingShippingCosts() {
        return this.mIsEditingShippingCosts;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isRequestingShippingCosts() {
        return this.mIsRequestingShippingCosts;
    }

    public boolean isViewingShippingCosts() {
        return this.mIsViewingShippingCosts;
    }

    public void setEditingShippingCosts(boolean z) {
        this.mIsEditingShippingCosts = z;
    }

    public void setIsLoading(boolean z) {
        this.mIsLoading = z;
    }

    public void setRequestingShippingCosts(boolean z) {
        this.mIsRequestingShippingCosts = z;
    }

    public void setViewingShippingCosts(boolean z) {
        this.mIsViewingShippingCosts = z;
    }
}
