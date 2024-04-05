package com.etsy.android.lib.util;

import com.google.android.exoplayer2.audio.C14189a;
import p513bj.C14049b0;
import p513bj.C14071o;
import p619mh.C18223d;

/* renamed from: com.etsy.android.lib.util.k */
public final /* synthetic */ class C8912k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f19665b;

    /* renamed from: c */
    public final /* synthetic */ Object f19666c;

    /* renamed from: d */
    public final /* synthetic */ Object f19667d;

    public /* synthetic */ C8912k(int i, Object obj, Object obj2) {
        this.f19665b = i;
        this.f19666c = obj;
        this.f19667d = obj2;
    }

    public final void run() {
        int i;
        switch (this.f19665b) {
            case 0:
                ((CrashUtil) this.f19666c).mo30457b((Throwable) this.f19667d);
                return;
            case 1:
                C14189a aVar = ((C14189a.C14190a) this.f19666c).f31403b;
                int i2 = C14049b0.f30913a;
                aVar.mo47247u((C18223d) this.f19667d);
                return;
            default:
                C14071o oVar = (C14071o) this.f19666c;
                C14071o.C14072a aVar2 = (C14071o.C14072a) this.f19667d;
                synchronized (oVar.f30978c) {
                    i = oVar.f30979d;
                }
                aVar2.mo46825a(i);
                return;
        }
    }
}
