package com.etsy.android.p327ui.user.auth;

import android.net.Uri;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.user.auth.C11481i;
import com.google.android.material.badge.BadgeDrawable;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.auth.g */
public final class C11479g implements C12729e {

    /* renamed from: a */
    public final C11484j f25329a;

    /* renamed from: b */
    public final C12741o f25330b;

    public C11479g(C11484j jVar, C12741o oVar) {
        C19383o.m32797g(jVar, "signInEventManager");
        C19383o.m32797g(oVar, "routeInspector");
        this.f25329a = jVar;
        this.f25330b = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12741o oVar = this.f25330b;
        Uri uri = fVar.f28049b;
        oVar.getClass();
        String d = C12741o.m20404d(uri, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        if (!C18263b.m30839d0(d)) {
            return new C12731g.C12732a(C0326j.m864i("Invalid or Missing Token ", d));
        }
        String a1 = C19457k.m33023a1(d, " ", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, false);
        C11484j jVar = this.f25329a;
        C11487l lVar = new C11487l(a1, (String) null, 2);
        jVar.getClass();
        jVar.f25334a.onNext(new C11481i.C11483b(lVar));
        return new C12731g.C12733b(new HomePagerKey(fVar.f28050c, fVar.f28051d, false, 4, (DefaultConstructorMarker) null));
    }
}
