package com.paypal.pyplcheckout.utils;

import android.os.SystemClock;
import android.support.p013v4.media.C0072d;
import androidx.test.espresso.IdlingResource$ResourceCallback;
import androidx.test.espresso.idling.CountingIdlingResource;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CheckoutIdlingResource {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static CheckoutIdlingResource _instance;
    private final CountingIdlingResource countingIdlingResource = new CountingIdlingResource();
    private int resourceCounter;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public static /* synthetic */ void get_instance$annotations() {
        }

        public final CheckoutIdlingResource getInstance() {
            if (get_instance() == null) {
                set_instance(new CheckoutIdlingResource());
            }
            CheckoutIdlingResource checkoutIdlingResource = get_instance();
            C19383o.m32794d(checkoutIdlingResource);
            return checkoutIdlingResource;
        }

        public final CheckoutIdlingResource get_instance() {
            return CheckoutIdlingResource._instance;
        }

        public final void set_instance(CheckoutIdlingResource checkoutIdlingResource) {
            CheckoutIdlingResource._instance = checkoutIdlingResource;
        }
    }

    public static final CheckoutIdlingResource getInstance() {
        return Companion.getInstance();
    }

    public final void decrement() {
        this.resourceCounter--;
        CountingIdlingResource countingIdlingResource2 = this.countingIdlingResource;
        int decrementAndGet = countingIdlingResource2.f7668b.decrementAndGet();
        if (decrementAndGet == 0) {
            countingIdlingResource2.getClass();
            SystemClock.uptimeMillis();
            countingIdlingResource2.getClass();
        }
        if (decrementAndGet <= -1) {
            throw new IllegalStateException(C0072d.m200g(50, "Counter has been corrupted! counterVal=", decrementAndGet));
        }
    }

    public final CountingIdlingResource getCountingIdlingResource() {
        return this.countingIdlingResource;
    }

    public String getName() {
        String str = this.countingIdlingResource.f7667a;
        C19383o.m32796f(str, "countingIdlingResource.name");
        return str;
    }

    public final int getResourceCounter() {
        return this.resourceCounter;
    }

    public final void increment() {
        this.resourceCounter++;
        CountingIdlingResource countingIdlingResource2 = this.countingIdlingResource;
        if (countingIdlingResource2.f7668b.getAndIncrement() == 0) {
            SystemClock.uptimeMillis();
            countingIdlingResource2.getClass();
        }
    }

    public boolean isIdleNow() {
        return this.countingIdlingResource.f7668b.get() == 0;
    }

    public void registerIdleTransitionCallback(IdlingResource$ResourceCallback idlingResource$ResourceCallback) {
        this.countingIdlingResource.getClass();
    }

    public final void setResourceCounter(int i) {
        this.resourceCounter = i;
    }
}
