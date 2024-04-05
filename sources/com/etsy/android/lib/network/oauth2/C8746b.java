package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.push.registration.C8837j;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.shop.BaseShopHomePageRepository;
import com.etsy.android.p327ui.shop.C11139d0;
import com.etsy.android.p327ui.shop.tabs.C11216c;
import com.etsy.android.p327ui.shop.tabs.overview.C11233b;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p346fa.C12703a;
import p425q9.C13265p;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.b */
public final class C8746b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19226a;

    /* renamed from: b */
    public final C19011a f19227b;

    /* renamed from: c */
    public final C19011a f19228c;

    /* renamed from: d */
    public final C19011a f19229d;

    /* renamed from: e */
    public final C19011a f19230e;

    public /* synthetic */ C8746b(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, int i) {
        this.f19226a = i;
        this.f19227b = aVar;
        this.f19228c = aVar2;
        this.f19229d = aVar3;
        this.f19230e = aVar4;
    }

    public final Object get() {
        switch (this.f19226a) {
            case 0:
                return new C8744a((C8809t) this.f19227b.get(), (C13265p) this.f19228c.get(), (C8837j) this.f19229d.get(), (C8591a) this.f19230e.get());
            case 1:
                return new C8769s((C8618c) this.f19227b.get(), (C8793t) this.f19228c.get(), (C8890e0) this.f19229d.get(), (C12703a) this.f19230e.get());
            default:
                return new C11233b((CoroutineDispatcher) this.f19227b.get(), (C11216c) this.f19228c.get(), (BaseShopHomePageRepository) this.f19229d.get(), (C11139d0) this.f19230e.get());
        }
    }
}
