package com.paypal.pyplcheckout.utils;

import java.util.TimerTask;
import kotlin.C19394m;
import p753kq.C19846a;

public final class PYPLCheckoutUtils$waitFor$timeOutTask$1 extends TimerTask {
    public final /* synthetic */ C19846a<C19394m> $failFunction;

    public PYPLCheckoutUtils$waitFor$timeOutTask$1(C19846a<C19394m> aVar) {
        this.$failFunction = aVar;
    }

    public void run() {
        this.$failFunction.invoke();
    }
}
