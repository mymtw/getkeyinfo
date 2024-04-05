package com.etsy.android.p327ui.home.etsylens;

import androidx.activity.result.C0118a;
import com.etsy.android.p327ui.user.review.C11750u;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.etsylens.c */
public final /* synthetic */ class C9972c implements C0118a {

    /* renamed from: b */
    public final /* synthetic */ EtsyLensPresenter f21957b;

    public /* synthetic */ C9972c(EtsyLensPresenter etsyLensPresenter) {
        this.f21957b = etsyLensPresenter;
    }

    /* renamed from: a */
    public final void mo413a(Object obj) {
        EtsyLensPresenter etsyLensPresenter = this.f21957b;
        Map map = (Map) obj;
        C19383o.m32797g(etsyLensPresenter, "this$0");
        C9974e eVar = etsyLensPresenter.f21944c;
        C19383o.m32796f(map, "permissions");
        ((C11750u) etsyLensPresenter.f21950i.getValue()).getClass();
        eVar.mo33166d(C11750u.m19448a(map));
    }
}
