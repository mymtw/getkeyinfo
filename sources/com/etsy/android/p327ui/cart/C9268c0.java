package com.etsy.android.p327ui.cart;

import com.etsy.android.p327ui.core.C9621i;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p321cc.C8569c;
import p350fe.C12741o;
import p428qc.C13282a;
import p428qc.C13294e;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.cart.c0 */
public final class C9268c0 implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f20468a;

    /* renamed from: b */
    public final C19011a f20469b;

    /* renamed from: c */
    public final C19011a f20470c;

    public /* synthetic */ C9268c0(C19011a aVar, C19011a aVar2, int i) {
        this.f20468a = i;
        this.f20469b = aVar;
        this.f20470c = aVar2;
    }

    public final Object get() {
        switch (this.f20468a) {
            case 0:
                return new C9244b0((C12741o) this.f20469b.get(), (C9242a0) this.f20470c.get());
            case 1:
                return new C8569c((C9621i) this.f20469b.get(), (C17414y) this.f20470c.get());
            default:
                return new C13282a((C12741o) this.f20469b.get(), (C13294e) this.f20470c.get());
        }
    }
}
