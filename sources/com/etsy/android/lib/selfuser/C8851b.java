package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.selfuser.C8852c;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.selfuser.b */
public final class C8851b {

    /* renamed from: a */
    public final C8850a f19527a;

    public C8851b(C8850a aVar) {
        C19383o.m32797g(aVar, "selfUserEndpoint");
        this.f19527a = aVar;
    }

    /* renamed from: a */
    public static C8852c.C8853a m17248a(Throwable th) {
        C19383o.m32797g(th, "error");
        C15588c1.m25314Y(new SelfUserRepository$getUser$2$1(th), 1);
        return new C8852c.C8853a(th);
    }
}
