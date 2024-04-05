package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p622ml.C18244a;
import p689ul.C18614l;
import p689ul.C18617o;

/* renamed from: com.google.android.play.core.appupdate.g */
public final class C15565g implements C15560b {

    /* renamed from: a */
    public final C15574p f35029a;

    /* renamed from: b */
    public final C15564f f35030b;

    /* renamed from: c */
    public final Context f35031c;

    public C15565g(C15574p pVar, C15564f fVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f35029a = pVar;
        this.f35030b = fVar;
        this.f35031c = context;
    }

    /* renamed from: a */
    public final synchronized void mo55334a(C18244a aVar) {
        this.f35030b.mo69855d(aVar);
    }

    /* renamed from: b */
    public final synchronized void mo55335b(C18244a aVar) {
        this.f35030b.mo69854c(aVar);
    }

    /* renamed from: c */
    public final boolean mo55336c(C15559a aVar, int i, Activity activity) throws IntentSender.SendIntentException {
        C15577s c = C15561c.m25160c(i);
        if (activity == null || aVar == null) {
            return false;
        }
        if (!(aVar.mo55333a(c) != null) || aVar.f35016j) {
            return false;
        }
        aVar.f35016j = true;
        activity.startIntentSenderForResult(aVar.mo55333a(c).getIntentSender(), 501, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    /* renamed from: d */
    public final C18617o mo55337d() {
        C15574p pVar = this.f35029a;
        String packageName = this.f35031c.getPackageName();
        if (pVar.f35051a == null) {
            return C15574p.m25230b();
        }
        C15574p.f35049e.mo52245e("completeUpdate(%s)", packageName);
        C18614l lVar = new C18614l();
        pVar.f35051a.mo55523b(new C15570l(pVar, lVar, lVar, packageName), lVar);
        return lVar.f41104a;
    }

    /* renamed from: e */
    public final C18617o mo55338e() {
        C15574p pVar = this.f35029a;
        String packageName = this.f35031c.getPackageName();
        if (pVar.f35051a == null) {
            return C15574p.m25230b();
        }
        C15574p.f35049e.mo52245e("requestUpdateInfo(%s)", packageName);
        C18614l lVar = new C18614l();
        pVar.f35051a.mo55523b(new C15569k(pVar, lVar, lVar, packageName), lVar);
        return lVar.f41104a;
    }
}
