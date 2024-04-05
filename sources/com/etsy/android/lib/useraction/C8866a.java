package com.etsy.android.lib.useraction;

import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.useraction.a */
public final /* synthetic */ class C8866a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ UserActionBus f19593b;

    public /* synthetic */ C8866a(UserActionBus userActionBus) {
        this.f19593b = userActionBus;
    }

    public final Object call() {
        UserActionBus userActionBus = this.f19593b;
        C19383o.m32797g(userActionBus, "this$0");
        userActionBus.f19586a.mo30443b(userActionBus.f19587b);
        return C19394m.f43287a;
    }
}
