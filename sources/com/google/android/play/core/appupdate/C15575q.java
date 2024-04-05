package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.internal.C15686c0;

/* renamed from: com.google.android.play.core.appupdate.q */
public final class C15575q implements C15686c0 {

    /* renamed from: b */
    public final C15686c0 f35055b;

    /* renamed from: c */
    public final C15686c0 f35056c;

    public C15575q(C15568j jVar, C15686c0 c0Var) {
        this.f35055b = jVar;
        this.f35056c = c0Var;
    }

    public final Object zza() {
        Context context = (Context) ((C15568j) this.f35055b).f35038b.f35037c;
        C15588c1.m25311V0(context);
        return new C15574p(context, (C15576r) this.f35056c.zza());
    }
}
