package com.etsy.android.util;

import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public final class OneShotOnResume implements C2857f {

    /* renamed from: b */
    public final Lifecycle f26836b;

    /* renamed from: c */
    public final C19846a<C19394m> f26837c;

    public OneShotOnResume(Lifecycle lifecycle, C19846a<C19394m> aVar) {
        C19383o.m32797g(lifecycle, "lifecycle");
        this.f26836b = lifecycle;
        this.f26837c = aVar;
        lifecycle.mo10733a(this);
    }

    public final void onDestroy(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        this.f26836b.mo10735c(this);
    }

    public final void onResume(C2887s sVar) {
        this.f26836b.mo10735c(this);
        this.f26837c.invoke();
    }
}
