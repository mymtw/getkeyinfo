package com.etsy.android.p327ui.user.purchases;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.user.C11488b;
import com.etsy.android.p327ui.user.purchases.module.C11663d;
import com.etsy.android.qualtrics.C8951c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19838x1;
import kotlinx.coroutines.internal.C19721f;
import kotlinx.coroutines.internal.C19729m;
import p001a0.C0005b;
import p143i9.C7007f;
import p409o9.C13138q;
import p425q9.C13265p;
import p456ua.C13461f;
import p486y9.C13888d;
import p768rq.C20153b;

/* renamed from: com.etsy.android.ui.user.purchases.r */
public final class C11672r {

    /* renamed from: a */
    public final C11678t f25838a;

    /* renamed from: b */
    public final C11679u f25839b;

    /* renamed from: c */
    public final C13461f f25840c;

    /* renamed from: d */
    public final C8630b f25841d;

    /* renamed from: e */
    public final C8951c f25842e;

    /* renamed from: f */
    public final C13888d f25843f;

    /* renamed from: g */
    public final C8703p f25844g;

    /* renamed from: h */
    public final C13265p f25845h;

    /* renamed from: i */
    public final C13138q f25846i;

    /* renamed from: j */
    public final C11488b f25847j;

    /* renamed from: k */
    public final CartBadgeCountRepo f25848k;

    /* renamed from: l */
    public final C7007f f25849l;

    /* renamed from: m */
    public final C11663d f25850m;

    /* renamed from: n */
    public final C19721f f25851n;

    public C11672r(PurchasesFragment purchasesFragment, C11679u uVar, C13461f fVar, C8630b bVar, C8951c cVar, C13888d dVar, C8703p pVar, C13265p pVar2, C13138q qVar, C11488b bVar2, CartBadgeCountRepo cartBadgeCountRepo, C7007f fVar2, C11663d dVar2) {
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        C19383o.m32797g(cVar, "qualtricsWrapper");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(pVar2, "session");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(cartBadgeCountRepo, "cartBadgeCountRepo");
        this.f25838a = purchasesFragment;
        this.f25839b = uVar;
        this.f25840c = fVar;
        this.f25841d = bVar;
        this.f25842e = cVar;
        this.f25843f = dVar;
        this.f25844g = pVar;
        this.f25845h = pVar2;
        this.f25846i = qVar;
        this.f25847j = bVar2;
        this.f25848k = cartBadgeCountRepo;
        this.f25849l = fVar2;
        this.f25850m = dVar2;
        C19838x1 j = C0005b.m44j();
        C20153b bVar3 = C19760n0.f43719a;
        this.f25851n = C19697g.m33463a(j.plus(C19729m.f43681a.mo72111E0()));
    }
}
