package com.paypal.android.platform.authsdk.authcommon;

import android.os.Binder;

public final class ObjectWrapperForBinder extends Binder {
    private final Object data;

    public ObjectWrapperForBinder(Object obj) {
        this.data = obj;
    }

    public final Object getData() {
        return this.data;
    }
}
