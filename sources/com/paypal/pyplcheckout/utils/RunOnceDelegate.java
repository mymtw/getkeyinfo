package com.paypal.pyplcheckout.utils;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

final class RunOnceDelegate {
    private final AtomicBoolean ran = new AtomicBoolean(false);

    public final void run(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "block");
        if (this.ran.compareAndSet(false, true)) {
            aVar.invoke();
        }
    }
}
