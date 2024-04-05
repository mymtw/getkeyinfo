package com.paypal.pyplcheckout.utils;

import androidx.lifecycle.LiveData;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;

public final class TestExtensionsKt {
    /* JADX INFO: finally extract failed */
    public static final <T> T getOrAwaitValue(LiveData<T> liveData, long j, TimeUnit timeUnit, C19846a<C19394m> aVar) {
        C19383o.m32797g(liveData, "<this>");
        C19383o.m32797g(timeUnit, "timeUnit");
        C19383o.m32797g(aVar, "afterObserve");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TestExtensionsKt$getOrAwaitValue$observer$1 testExtensionsKt$getOrAwaitValue$observer$1 = new TestExtensionsKt$getOrAwaitValue$observer$1(ref$ObjectRef, countDownLatch, liveData);
        liveData.observeForever(testExtensionsKt$getOrAwaitValue$observer$1);
        try {
            aVar.invoke();
            if (countDownLatch.await(j, timeUnit)) {
                liveData.removeObserver(testExtensionsKt$getOrAwaitValue$observer$1);
                return ref$ObjectRef.element;
            }
            throw new TimeoutException("LiveData value was never set.");
        } catch (Throwable th) {
            liveData.removeObserver(testExtensionsKt$getOrAwaitValue$observer$1);
            throw th;
        }
    }

    public static /* synthetic */ Object getOrAwaitValue$default(LiveData liveData, long j, TimeUnit timeUnit, C19846a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 2;
        }
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        if ((i & 4) != 0) {
            aVar = TestExtensionsKt$getOrAwaitValue$1.INSTANCE;
        }
        return getOrAwaitValue(liveData, j, timeUnit, aVar);
    }
}
