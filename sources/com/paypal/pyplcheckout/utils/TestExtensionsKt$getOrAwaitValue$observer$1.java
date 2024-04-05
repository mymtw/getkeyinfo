package com.paypal.pyplcheckout.utils;

import androidx.lifecycle.C2843a0;
import androidx.lifecycle.LiveData;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class TestExtensionsKt$getOrAwaitValue$observer$1 implements C2843a0<T> {
    public final /* synthetic */ Ref$ObjectRef<T> $data;
    public final /* synthetic */ CountDownLatch $latch;
    public final /* synthetic */ LiveData<T> $this_getOrAwaitValue;

    public TestExtensionsKt$getOrAwaitValue$observer$1(Ref$ObjectRef<T> ref$ObjectRef, CountDownLatch countDownLatch, LiveData<T> liveData) {
        this.$data = ref$ObjectRef;
        this.$latch = countDownLatch;
        this.$this_getOrAwaitValue = liveData;
    }

    public void onChanged(T t) {
        this.$data.element = t;
        this.$latch.countDown();
        this.$this_getOrAwaitValue.removeObserver(this);
    }
}
