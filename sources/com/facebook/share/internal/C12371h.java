package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.share.internal.C12348b;
import p365hg.C12869i0;
import p453tf.C13426p;

/* renamed from: com.facebook.share.internal.h */
public final class C12371h implements C12348b.C12364o {

    /* renamed from: a */
    public final /* synthetic */ Bundle f27570a;

    /* renamed from: b */
    public final /* synthetic */ C12348b f27571b;

    /* renamed from: com.facebook.share.internal.h$a */
    public class C12372a implements C13426p.C13427a {

        /* renamed from: a */
        public final /* synthetic */ C12348b.C12362m f27572a;

        public C12372a(C12348b.C12362m mVar) {
            this.f27572a = mVar;
        }

        /* renamed from: a */
        public final void mo39759a(C13426p pVar) {
            C12348b bVar = C12371h.this.f27571b;
            bVar.f27523l = false;
            C12348b.C12362m mVar = this.f27572a;
            if (mVar.f27534d != null) {
                bVar.mo39756k(false);
                return;
            }
            bVar.f27519h = C12869i0.m20567f(mVar.f27558e, (String) null);
            C12348b bVar2 = C12371h.this.f27571b;
            bVar2.f27522k = true;
            bVar2.mo39754g().mo46175b("fb_like_control_did_like", C12371h.this.f27570a);
            C12371h hVar = C12371h.this;
            C12348b bVar3 = hVar.f27571b;
            Bundle bundle = hVar.f27570a;
            boolean z = bVar3.f27514c;
            if (z != bVar3.f27522k && !bVar3.mo39757l(bundle, z)) {
                bVar3.mo39756k(!bVar3.f27514c);
            }
        }
    }

    public C12371h(C12348b bVar, Bundle bundle) {
        this.f27571b = bVar;
        this.f27570a = bundle;
    }

    public final void onComplete() {
        if (C12869i0.m20546B(this.f27571b.f27520i)) {
            Bundle bundle = new Bundle();
            bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
            C12348b.m20167c(this.f27571b, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
            return;
        }
        C13426p pVar = new C13426p();
        C12348b bVar = this.f27571b;
        C12348b.C12362m mVar = new C12348b.C12362m(bVar.f27520i, bVar.f27513b);
        pVar.add(mVar.f27531a);
        pVar.mo46094c(new C12372a(mVar));
        pVar.mo46097e();
    }
}
