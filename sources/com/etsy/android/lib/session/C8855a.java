package com.etsy.android.lib.session;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import kotlin.jvm.internal.C19383o;
import p496za.C13943a;

/* renamed from: com.etsy.android.lib.session.a */
public final class C8855a {

    /* renamed from: a */
    public final C8618c f19544a;

    /* renamed from: b */
    public final C13943a f19545b;

    /* renamed from: c */
    public boolean f19546c;

    public C8855a(C8618c cVar, C13943a aVar) {
        C19383o.m32797g(cVar, "etsyConfigMap");
        C19383o.m32797g(aVar, "sharedPreferencesProvider");
        this.f19544a = cVar;
        this.f19545b = aVar;
        this.f19546c = aVar.mo46761a().getBoolean("customerCentricMessagingEnrolled", false);
    }

    /* renamed from: a */
    public final boolean mo30407a() {
        return this.f19544a.mo21132b(C8592b.C8595c.f18859c) && this.f19546c;
    }
}
