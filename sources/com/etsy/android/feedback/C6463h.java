package com.etsy.android.feedback;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.etsy.android.p327ui.shop.C11132b1;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.shop.C11309y0;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import p321cc.C8569c;
import p425q9.C13265p;
import p456ua.C13461f;
import p486y9.C13888d;

/* renamed from: com.etsy.android.feedback.h */
public final class C6463h implements C2870k0.C2872b {

    /* renamed from: a */
    public final C6462g f14339a;

    /* renamed from: b */
    public final C8569c f14340b;

    /* renamed from: c */
    public final C11309y0 f14341c;

    /* renamed from: d */
    public final C11132b1 f14342d;

    /* renamed from: e */
    public final C11201t f14343e;

    /* renamed from: f */
    public final C13888d f14344f;

    /* renamed from: g */
    public final C13265p f14345g;

    /* renamed from: h */
    public final C13461f f14346h;

    /* renamed from: i */
    public final boolean f14347i;

    /* renamed from: j */
    public final C6473r f14348j;

    /* renamed from: k */
    public final C11786n f14349k;

    public C6463h(C6462g gVar, C8569c cVar, C11309y0 y0Var, C11132b1 b1Var, C11201t tVar, C13888d dVar, C13265p pVar, C13461f fVar, boolean z, C6473r rVar, C11786n nVar) {
        C19383o.m32797g(cVar, "listingRepository");
        C19383o.m32797g(y0Var, "shopInfoRepository");
        C19383o.m32797g(b1Var, "shopReviewsRepository");
        C19383o.m32797g(tVar, "reviewsTranslationRepository");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(rVar, "reviewsEligibility");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f14339a = gVar;
        this.f14340b = cVar;
        this.f14341c = y0Var;
        this.f14342d = b1Var;
        this.f14343e = tVar;
        this.f14344f = dVar;
        this.f14345g = pVar;
        this.f14346h = fVar;
        this.f14347i = z;
        this.f14348j = rVar;
        this.f14349k = nVar;
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        return new FeedbackViewModel(this.f14339a, this.f14340b, this.f14341c, this.f14342d, this.f14343e, this.f14344f, this.f14345g, this.f14346h, this.f14347i, this.f14348j, this.f14349k);
    }
}
