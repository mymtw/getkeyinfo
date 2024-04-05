package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzac;
import p614ll.C18199a;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.review.d */
public final class C15737d extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ C18614l f35519c;

    /* renamed from: d */
    public final /* synthetic */ C15739f f35520d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15737d(C15739f fVar, C18614l lVar, C18614l lVar2) {
        super(lVar);
        this.f35520d = fVar;
        this.f35519c = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15739f fVar = this.f35520d;
            String str = fVar.f35526b;
            Bundle a = C18199a.m30698a("review");
            C15739f fVar2 = this.f35520d;
            C18614l lVar = this.f35519c;
            String str2 = fVar2.f35526b;
            ((zzac) fVar.f35525a.f35474n).zzc(str, a, new C15738e(fVar2, lVar));
        } catch (RemoteException e) {
            C15739f.f35524c.mo52244d(e, "error requesting in-app review for %s", this.f35520d.f35526b);
            this.f35519c.mo70125a(new RuntimeException(e));
        }
    }
}
