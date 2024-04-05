package com.facebook.share.internal;

import com.facebook.AccessToken;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: com.facebook.share.internal.d */
public final class C12367d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C12348b f27566b;

    public C12367d(C12348b bVar) {
        this.f27566b = bVar;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                C12348b bVar = this.f27566b;
                bVar.getClass();
                if (!AccessToken.isCurrentAccessTokenActive()) {
                    LikeStatusClient likeStatusClient = new LikeStatusClient(C13418j.m21106b(), C13418j.m21107c(), bVar.f27512a);
                    if (likeStatusClient.start()) {
                        likeStatusClient.setCompletedListener(new C12347a(bVar));
                        return;
                    }
                    return;
                }
                bVar.mo39753f(new C12374j(bVar));
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
