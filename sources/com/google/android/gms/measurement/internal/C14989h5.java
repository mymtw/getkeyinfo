package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p604kj.C18102g;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.h5 */
public final class C14989h5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final /* synthetic */ C15007j5 f33556b;

    public /* synthetic */ C14989h5(C15007j5 j5Var) {
        this.f33556b = j5Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C15103u3 u3Var;
        try {
            ((C15103u3) this.f33556b.f33681b).mo52016b().f33732o.mo52237a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                u3Var = (C15103u3) this.f33556b.f33681b;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        ((C15103u3) this.f33556b.f33681b).mo52335w();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        ((C15103u3) this.f33556b.f33681b).mo52015a().mo52308o(new C14980g5(this, z, data, str, queryParameter));
                        u3Var = (C15103u3) this.f33556b.f33681b;
                    }
                }
                u3Var = (C15103u3) this.f33556b.f33681b;
            }
        } catch (RuntimeException e) {
            ((C15103u3) this.f33556b.f33681b).mo52016b().f33724g.mo52238b(e, "Throwable caught in onActivityCreated");
            u3Var = (C15103u3) this.f33556b.f33681b;
        } catch (Throwable th) {
            ((C15103u3) this.f33556b.f33681b).mo52332t().mo52350p(activity, bundle);
            throw th;
        }
        u3Var.mo52332t().mo52350p(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        C15113v5 t = ((C15103u3) this.f33556b.f33681b).mo52332t();
        synchronized (t.f33931m) {
            if (activity == t.f33926h) {
                t.f33926h = null;
            }
        }
        if (((C15103u3) t.f33681b).f33878h.mo51974q()) {
            t.f33925g.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        C15113v5 t = ((C15103u3) this.f33556b.f33681b).mo52332t();
        synchronized (t.f33931m) {
            t.f33930l = false;
            t.f33927i = true;
        }
        long elapsedRealtime = ((C15103u3) t.f33681b).f33885o.elapsedRealtime();
        if (!((C15103u3) t.f33681b).f33878h.mo51974q()) {
            t.f33922d = null;
            ((C15103u3) t.f33681b).mo52015a().mo52308o(new C15097t5(t, elapsedRealtime));
        } else {
            C15061p5 q = t.mo52351q(activity);
            t.f33923e = t.f33922d;
            t.f33922d = null;
            ((C15103u3) t.f33681b).mo52015a().mo52308o(new C15105u5(t, q, elapsedRealtime));
        }
        C15114v6 v = ((C15103u3) this.f33556b.f33681b).mo52334v();
        ((C15103u3) v.f33681b).mo52015a().mo52308o(new C15053o6(v, ((C15103u3) v.f33681b).f33885o.elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        C15114v6 v = ((C15103u3) this.f33556b.f33681b).mo52334v();
        ((C15103u3) v.f33681b).mo52015a().mo52308o(new C14975g0(v, ((C15103u3) v.f33681b).f33885o.elapsedRealtime(), 2));
        C15113v5 t = ((C15103u3) this.f33556b.f33681b).mo52332t();
        synchronized (t.f33931m) {
            t.f33930l = true;
            if (activity != t.f33926h) {
                synchronized (t.f33931m) {
                    t.f33926h = activity;
                    t.f33927i = false;
                }
                if (((C15103u3) t.f33681b).f33878h.mo51974q()) {
                    t.f33928j = null;
                    ((C15103u3) t.f33681b).mo52015a().mo52308o(new C18102g(t, 1));
                }
            }
        }
        if (!((C15103u3) t.f33681b).f33878h.mo51974q()) {
            t.f33922d = t.f33928j;
            ((C15103u3) t.f33681b).mo52015a().mo52308o(new C15088s5(t, 0));
            return;
        }
        t.mo52345k(activity, t.mo52351q(activity), false);
        C14985h1 k = ((C15103u3) t.f33681b).mo52324k();
        ((C15103u3) k.f33681b).mo52015a().mo52308o(new C14975g0(k, ((C15103u3) k.f33681b).f33885o.elapsedRealtime(), 0));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C15061p5 p5Var;
        C15113v5 t = ((C15103u3) this.f33556b.f33681b).mo52332t();
        if (((C15103u3) t.f33681b).f33878h.mo51974q() && bundle != null && (p5Var = (C15061p5) t.f33925g.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", p5Var.f33751c);
            bundle2.putString("name", p5Var.f33749a);
            bundle2.putString("referrer_name", p5Var.f33750b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
