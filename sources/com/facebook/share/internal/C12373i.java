package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.share.internal.C12348b;
import p453tf.C13426p;

/* renamed from: com.facebook.share.internal.i */
public final class C12373i implements C13426p.C13427a {

    /* renamed from: a */
    public final /* synthetic */ C12348b.C12363n f27574a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f27575b;

    /* renamed from: c */
    public final /* synthetic */ C12348b f27576c;

    public C12373i(C12348b bVar, C12348b.C12363n nVar, Bundle bundle) {
        this.f27576c = bVar;
        this.f27574a = nVar;
        this.f27575b = bundle;
    }

    /* renamed from: a */
    public final void mo39759a(C13426p pVar) {
        C12348b bVar = this.f27576c;
        bVar.f27523l = false;
        if (this.f27574a.f27534d != null) {
            bVar.mo39756k(true);
            return;
        }
        bVar.f27519h = null;
        bVar.f27522k = false;
        bVar.mo39754g().mo46175b("fb_like_control_did_unlike", this.f27575b);
        C12348b bVar2 = this.f27576c;
        Bundle bundle = this.f27575b;
        boolean z = bVar2.f27514c;
        if (z != bVar2.f27522k && !bVar2.mo39757l(bundle, z)) {
            bVar2.mo39756k(!bVar2.f27514c);
        }
    }
}
