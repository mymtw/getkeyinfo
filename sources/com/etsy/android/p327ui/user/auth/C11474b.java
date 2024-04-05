package com.etsy.android.p327ui.user.auth;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.push.registration.C8837j;
import com.etsy.android.util.C12049i;
import dagger.internal.C17555d;
import dagger.internal.C17556e;
import p040c9.C4619m;
import p040c9.C4646o;
import p425q9.C13252d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.user.auth.b */
public final class C11474b implements C17555d<C11473a> {

    /* renamed from: a */
    public final C19011a<FragmentActivity> f25321a;

    /* renamed from: b */
    public final C19011a<C11477e> f25322b;

    /* renamed from: c */
    public final C19011a<C8837j> f25323c;

    /* renamed from: d */
    public final C19011a<C13252d> f25324d;

    /* renamed from: e */
    public final C19011a<C12049i> f25325e;

    public C11474b(C17556e eVar, C17556e eVar2, C4646o oVar, C19011a aVar, C4619m mVar) {
        this.f25321a = eVar;
        this.f25322b = eVar2;
        this.f25323c = oVar;
        this.f25324d = aVar;
        this.f25325e = mVar;
    }

    public final Object get() {
        return new C11473a(this.f25321a.get(), this.f25322b.get(), this.f25323c.get(), this.f25324d.get(), this.f25325e.get());
    }
}
