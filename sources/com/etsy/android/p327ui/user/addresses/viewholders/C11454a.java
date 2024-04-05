package com.etsy.android.p327ui.user.addresses.viewholders;

import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.etsy.android.stylekit.views.CollageCheckbox;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.a */
public final class C11454a implements CollageCheckbox.C9027c {

    /* renamed from: a */
    public final /* synthetic */ C11396e f25279a;

    /* renamed from: b */
    public final /* synthetic */ C11455b f25280b;

    public C11454a(C11396e eVar, C11455b bVar) {
        this.f25279a = eVar;
        this.f25280b = bVar;
    }

    /* renamed from: a */
    public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
        C19383o.m32797g(collageCheckbox, "selectedButton");
        ((C11396e.C11399c) this.f25279a).f25126a.f25165f = Boolean.valueOf(z);
        this.f25280b.f25281b.invoke(new C11430n.C11433c(this.f25279a, z));
    }
}
