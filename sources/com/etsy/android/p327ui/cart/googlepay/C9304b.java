package com.etsy.android.p327ui.cart.googlepay;

import android.content.Context;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p340ea.C12673n;
import p346fa.C12703a;
import p422pe.C13219a;
import p422pe.C13225d;
import p422pe.C13227f;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.cart.googlepay.b */
public final class C9304b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f20528a;

    /* renamed from: b */
    public final C19011a f20529b;

    /* renamed from: c */
    public final C19011a f20530c;

    /* renamed from: d */
    public final C19011a f20531d;

    /* renamed from: e */
    public final C19011a f20532e;

    /* renamed from: f */
    public final C19011a f20533f;

    public /* synthetic */ C9304b(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C17555d dVar, int i) {
        this.f20528a = i;
        this.f20529b = aVar;
        this.f20530c = aVar2;
        this.f20531d = aVar3;
        this.f20532e = aVar4;
        this.f20533f = dVar;
    }

    public final Object get() {
        switch (this.f20528a) {
            case 0:
                return new C9303a((Context) this.f20529b.get(), (C8694h) this.f20530c.get(), (C12673n) this.f20531d.get(), (C12703a) this.f20532e.get(), (C8591a) this.f20533f.get());
            default:
                return new C13225d((C8694h) this.f20529b.get(), (C13219a) this.f20530c.get(), (C13227f) this.f20531d.get(), (C17414y) this.f20532e.get(), (C8618c) this.f20533f.get());
        }
    }
}
