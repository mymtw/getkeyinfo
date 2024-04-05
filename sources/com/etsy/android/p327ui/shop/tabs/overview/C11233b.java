package com.etsy.android.p327ui.shop.tabs.overview;

import com.etsy.android.p327ui.shop.BaseShopHomePageRepository;
import com.etsy.android.p327ui.shop.C11139d0;
import com.etsy.android.p327ui.shop.tabs.C11209a;
import com.etsy.android.p327ui.shop.tabs.C11216c;
import com.etsy.android.p327ui.shop.tabs.C11221g;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.b */
public final class C11233b {

    /* renamed from: a */
    public final CoroutineDispatcher f24816a;

    /* renamed from: b */
    public final C11216c f24817b;

    /* renamed from: c */
    public final BaseShopHomePageRepository f24818c;

    /* renamed from: d */
    public final C11139d0 f24819d;

    public C11233b(CoroutineDispatcher coroutineDispatcher, C11216c cVar, BaseShopHomePageRepository baseShopHomePageRepository, C11139d0 d0Var) {
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        C19383o.m32797g(cVar, "dispatcher");
        C19383o.m32797g(baseShopHomePageRepository, "repository");
        C19383o.m32797g(d0Var, "shopEligibility");
        this.f24816a = coroutineDispatcher;
        this.f24817b = cVar;
        this.f24818c = baseShopHomePageRepository;
        this.f24819d = d0Var;
    }

    /* renamed from: a */
    public final void mo36944a(C19525d0 d0Var, C11209a.C11211b bVar, C11221g gVar) {
        C19697g.m33468f(d0Var, this.f24816a, (CoroutineStart) null, new LoadShopFromIdHandler$handle$2(bVar, this, (C19340c<? super LoadShopFromIdHandler$handle$2>) null), 2);
    }
}
