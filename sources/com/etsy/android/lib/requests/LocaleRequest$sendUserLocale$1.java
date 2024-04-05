package com.etsy.android.lib.requests;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LocaleRequest$sendUserLocale$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ LocaleRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocaleRequest$sendUserLocale$1(LocaleRequest localeRequest) {
        super(1);
        this.this$0 = localeRequest;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "e");
        this.this$0.logcat.mo21307b("Received an error fetching user's locale", th);
    }
}
