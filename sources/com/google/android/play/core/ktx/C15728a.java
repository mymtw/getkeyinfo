package com.google.android.play.core.ktx;

import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p622ml.C18244a;
import p753kq.C19857l;

/* renamed from: com.google.android.play.core.ktx.a */
public final class C15728a implements C18244a {

    /* renamed from: a */
    public final C18244a f35512a;

    /* renamed from: b */
    public final C19857l<C15728a, C19394m> f35513b;

    public C15728a(AppUpdateManagerKtxKt$requestUpdateFlow$1.C15718c cVar, C19857l lVar) {
        this.f35512a = cVar;
        this.f35513b = lVar;
    }

    /* renamed from: a */
    public final void mo31232a(Object obj) {
        InstallState installState = (InstallState) obj;
        C19383o.m32798h(installState, "state");
        this.f35512a.mo31232a(installState);
        int c = installState.mo55513c();
        if (c == 0 || c == 11 || c == 5 || c == 6) {
            this.f35513b.invoke(this);
        }
    }
}
