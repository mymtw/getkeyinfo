package com.paypal.android.platform.authsdk.authinterface;

public interface CommonListener<T, E> {
    void onError(E e);

    void onSuccess(T t);
}
