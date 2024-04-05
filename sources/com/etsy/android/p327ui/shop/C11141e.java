package com.etsy.android.p327ui.shop;

import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.shop.C11184o0;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import p003a2.C0023f;
import p649pm.C18414q;
import p722ym.C18895a;

/* renamed from: com.etsy.android.ui.shop.e */
public final /* synthetic */ class C11141e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f24635b;

    /* renamed from: c */
    public final /* synthetic */ Object f24636c;

    /* renamed from: d */
    public final /* synthetic */ Object f24637d;

    public /* synthetic */ C11141e(int i, Object obj, Object obj2) {
        this.f24635b = i;
        this.f24636c = obj;
        this.f24637d = obj2;
    }

    public final void run() {
        C0391c cVar;
        switch (this.f24635b) {
            case 0:
                ((BaseShopHomeFragment) this.f24636c).lambda$handleSearchSuccess$4((C11184o0.C11186b) this.f24637d);
                return;
            case 1:
                C14216b.C14217a aVar = (C14216b.C14217a) this.f24636c;
                ((C14216b) this.f24637d).mo47324B(aVar.f31564a, aVar.f31565b);
                return;
            case 2:
                C0023f.m114o(this.f24636c);
                int i = AdsMediaSource.f31768j;
                throw null;
            default:
                C18414q qVar = (C18414q) this.f24636c;
                C18895a<T> aVar2 = (C18895a) this.f24637d;
                if (qVar.f40501b == C18414q.f40499d) {
                    synchronized (qVar) {
                        cVar = qVar.f40500a;
                        qVar.f40500a = null;
                        qVar.f40501b = aVar2;
                    }
                    cVar.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
        }
    }
}
