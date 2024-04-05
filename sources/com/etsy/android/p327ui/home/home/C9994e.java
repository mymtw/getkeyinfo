package com.etsy.android.p327ui.home.home;

import com.etsy.android.lib.useraction.UserActionBus;
import com.squareup.moshi.C17414y;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.home.e */
public final class C9994e {

    /* renamed from: a */
    public final C9990a f21995a;

    /* renamed from: b */
    public final UserActionBus f21996b;

    /* renamed from: c */
    public final C17414y f21997c;

    public C9994e(C9990a aVar, UserActionBus userActionBus, C17414y yVar) {
        C19383o.m32797g(aVar, "homeEndpoint");
        C19383o.m32797g(userActionBus, "userActionBus");
        C19383o.m32797g(yVar, "moshi");
        this.f21995a = aVar;
        this.f21996b = userActionBus;
        this.f21997c = yVar;
    }
}
