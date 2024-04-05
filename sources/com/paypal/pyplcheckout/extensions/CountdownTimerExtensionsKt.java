package com.paypal.pyplcheckout.extensions;

import android.os.CountDownTimer;
import kotlin.jvm.internal.C19383o;

public final class CountdownTimerExtensionsKt {
    public static final void restart(CountDownTimer countDownTimer) {
        C19383o.m32797g(countDownTimer, "<this>");
        countDownTimer.cancel();
        countDownTimer.start();
    }
}
