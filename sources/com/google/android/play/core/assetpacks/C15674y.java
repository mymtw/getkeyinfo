package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.work.C3421k;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15714z;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p149j3.C7107h;
import p461uf.C13518l;
import p639ol.C18316c;
import p772tq.C20203a;

/* renamed from: com.google.android.play.core.assetpacks.y */
public final class C15674y extends C18316c {

    /* renamed from: g */
    public final C15608h1 f35409g;

    /* renamed from: h */
    public final C15659u0 f35410h;

    /* renamed from: i */
    public final C15714z f35411i;

    /* renamed from: j */
    public final C15627m0 f35412j;

    /* renamed from: k */
    public final C15671x0 f35413k;

    /* renamed from: l */
    public final C15714z f35414l;

    /* renamed from: m */
    public final C15714z f35415m;

    /* renamed from: n */
    public final C15581a2 f35416n;

    /* renamed from: o */
    public final Handler f35417o = new Handler(Looper.getMainLooper());

    public C15674y(Context context, C15608h1 h1Var, C15659u0 u0Var, C15714z zVar, C15671x0 x0Var, C15627m0 m0Var, C15714z zVar2, C15714z zVar3, C15581a2 a2Var) {
        super(new C15032m3("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f35409g = h1Var;
        this.f35410h = u0Var;
        this.f35411i = zVar;
        this.f35413k = x0Var;
        this.f35412j = m0Var;
        this.f35414l = zVar2;
        this.f35415m = zVar3;
        this.f35416n = a2Var;
    }

    /* renamed from: a */
    public final void mo55341a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f40209a.mo52243c("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            C15603g0 i = AssetPackState.m25235i(bundleExtra, stringArrayList.get(0), this.f35413k, this.f35416n, C20203a.f44777g);
            this.f40209a.mo52242b("ListenerRegistryBroadcastReceiver.onReceive: %s", i);
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                this.f35412j.getClass();
            }
            ((Executor) this.f35415m.zza()).execute(new C15666w(this, bundleExtra, i));
            ((Executor) this.f35414l.zza()).execute(new C3421k(3, (Object) this, (Object) bundleExtra));
            return;
        }
        this.f40209a.mo52243c("Empty bundle received from broadcast.", new Object[0]);
    }

    /* renamed from: f */
    public final void mo55506f(Bundle bundle) {
        C15608h1 h1Var = this.f35409g;
        h1Var.getClass();
        if (((Boolean) h1Var.mo55412d(new C7107h(4, h1Var, bundle))).booleanValue()) {
            C15659u0 u0Var = this.f35410h;
            u0Var.getClass();
            C15032m3 m3Var = C15659u0.f35344k;
            m3Var.mo52242b("Run extractor loop", new Object[0]);
            if (u0Var.f35354j.compareAndSet(false, true)) {
                while (true) {
                    C13518l lVar = null;
                    try {
                        lVar = u0Var.f35353i.mo55421a();
                    } catch (zzck e) {
                        C15659u0.f35344k.mo52243c("Error while getting next extraction task: %s", e.getMessage());
                        if (e.zza >= 0) {
                            ((C15677y2) u0Var.f35352h.zza()).mo55465b(e.zza);
                            u0Var.mo55491a(e.zza, e);
                        }
                    }
                    if (lVar != null) {
                        try {
                            if (lVar instanceof C15639p0) {
                                u0Var.f35346b.mo55477a((C15639p0) lVar);
                            } else if (lVar instanceof C15629m2) {
                                u0Var.f35347c.mo55475a((C15629m2) lVar);
                            } else if (lVar instanceof C15652s1) {
                                u0Var.f35348d.mo55489a((C15652s1) lVar);
                            } else if (lVar instanceof C15660u1) {
                                u0Var.f35349e.mo55505a((C15660u1) lVar);
                            } else if (lVar instanceof C15593d2) {
                                u0Var.f35350f.mo55398a((C15593d2) lVar);
                            } else if (lVar instanceof C15601f2) {
                                u0Var.f35351g.mo55405a((C15601f2) lVar);
                            } else {
                                C15659u0.f35344k.mo52243c("Unknown task type: %s", lVar.getClass().getName());
                            }
                        } catch (Exception e2) {
                            C15659u0.f35344k.mo52243c("Error during extraction task: %s", e2.getMessage());
                            ((C15677y2) u0Var.f35352h.zza()).mo55465b(lVar.f29574a);
                            u0Var.mo55491a(lVar.f29574a, e2);
                        }
                    } else {
                        u0Var.f35354j.set(false);
                        return;
                    }
                }
            } else {
                m3Var.mo52246f("runLoop already looping; return", new Object[0]);
            }
        }
    }
}
