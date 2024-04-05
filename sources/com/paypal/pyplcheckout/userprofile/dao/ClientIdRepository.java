package com.paypal.pyplcheckout.userprofile.dao;

public final class ClientIdRepository {
    private boolean hasClientIdChanged;

    public final void cacheClientIdChanged() {
        this.hasClientIdChanged = true;
    }

    public final boolean getCachedClientId() {
        return this.hasClientIdChanged;
    }
}
