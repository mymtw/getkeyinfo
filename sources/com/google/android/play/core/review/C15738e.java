package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15697i;
import com.google.android.play.core.internal.zzad;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.review.e */
public final class C15738e extends zzad {

    /* renamed from: a */
    public final C15032m3 f35521a;

    /* renamed from: b */
    public final C18614l f35522b;

    /* renamed from: c */
    public final /* synthetic */ C15739f f35523c;

    public C15738e(C15739f fVar, C18614l lVar) {
        C15032m3 m3Var = new C15032m3("OnRequestInstallCallback");
        this.f35523c = fVar;
        this.f35521a = m3Var;
        this.f35522b = lVar;
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        C15697i iVar = this.f35523c.f35525a;
        if (iVar != null) {
            iVar.mo55524c(this.f35522b);
        }
        this.f35521a.mo52245e("onGetLaunchReviewFlowInfo", new Object[0]);
        this.f35522b.mo70126b(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
