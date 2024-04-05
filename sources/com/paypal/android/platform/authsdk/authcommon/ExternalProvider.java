package com.paypal.android.platform.authsdk.authcommon;

public interface ExternalProvider<T, U> {
    U provide(T t);
}
