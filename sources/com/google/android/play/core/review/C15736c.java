package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p689ul.C18614l;
import p689ul.C18617o;

@SuppressLint({"RestrictedApi"})
/* renamed from: com.google.android.play.core.review.c */
public final class C15736c implements C15734a {

    /* renamed from: a */
    public final C15739f f35517a;

    /* renamed from: b */
    public final Handler f35518b = new Handler(Looper.getMainLooper());

    public C15736c(C15739f fVar) {
        this.f35517a = fVar;
    }

    /* renamed from: a */
    public final C18617o mo55626a() {
        C15739f fVar = this.f35517a;
        C15032m3 m3Var = C15739f.f35524c;
        m3Var.mo52245e("requestInAppReview (%s)", fVar.f35526b);
        if (fVar.f35525a == null) {
            m3Var.mo52243c("Play Store app is either not installed or not the official version", new Object[0]);
            ReviewException reviewException = new ReviewException(-1);
            C18617o oVar = new C18617o();
            synchronized (oVar.f41106a) {
                if (!oVar.f41108c) {
                    oVar.f41108c = true;
                    oVar.f41110e = reviewException;
                } else {
                    throw new IllegalStateException("Task is already complete");
                }
            }
            oVar.f41107b.mo70124b(oVar);
            return oVar;
        }
        C18614l lVar = new C18614l();
        fVar.f35525a.mo55523b(new C15737d(fVar, lVar, lVar), lVar);
        return lVar.f41104a;
    }

    /* renamed from: b */
    public final C18617o mo55627b(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            C18617o oVar = new C18617o();
            synchronized (oVar.f41106a) {
                if (!oVar.f41108c) {
                    oVar.f41108c = true;
                    oVar.f41109d = null;
                } else {
                    throw new IllegalStateException("Task is already complete");
                }
            }
            oVar.f41107b.mo70124b(oVar);
            return oVar;
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.zza());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C18614l lVar = new C18614l();
        intent.putExtra("result_receiver", new zzc(this.f35518b, lVar));
        activity.startActivity(intent);
        return lVar.f41104a;
    }
}
