package p145io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7063o;
import p145io.branch.referral.ServerRequest;

/* renamed from: io.branch.referral.c */
public final class C7030c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public int f15638b = 0;

    /* renamed from: c */
    public HashSet f15639c = new HashSet();

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C7077r.m13675a("onActivityCreated, activity = " + activity);
        Branch j = Branch.m13575j();
        if (j != null) {
            j.f15583i = Branch.INTENT_STATE.PENDING;
            C7063o b = C7063o.m13656b();
            Context applicationContext = activity.getApplicationContext();
            C7063o.C7065b bVar = b.f15721c;
            if (bVar != null && C7063o.C7065b.m13661a(bVar, applicationContext)) {
                C7063o b2 = C7063o.m13656b();
                if (b2.mo19299d(b2.f15721c, activity, (C7063o.C7066c) null)) {
                    b2.f15721c = null;
                }
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        C7077r.m13675a("onActivityDestroyed, activity = " + activity);
        Branch j = Branch.m13575j();
        if (j != null) {
            if (j.mo19196i() == activity) {
                j.f15586l.clear();
            }
            C7063o b = C7063o.m13656b();
            String str = b.f15723e;
            if (str != null && str.equalsIgnoreCase(activity.getClass().getName())) {
                b.f15719a = false;
            }
            this.f15639c.remove(activity.toString());
        }
    }

    public final void onActivityPaused(Activity activity) {
        C7077r.m13675a("onActivityPaused, activity = " + activity);
        Branch.m13575j();
    }

    public final void onActivityResumed(Activity activity) {
        C7077r.m13675a("onActivityResumed, activity = " + activity);
        Branch j = Branch.m13575j();
        if (j != null) {
            j.f15583i = Branch.INTENT_STATE.READY;
            j.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
            if ((activity.getIntent() == null || j.f15584j == Branch.SESSION_STATE.INITIALISED) ? false : true) {
                j.mo19204u(activity.getIntent().getData(), activity);
                if (!j.f15596v.f15762a && Branch.f15569B != null && j.f15576b.mo19317f() != null && !j.f15576b.mo19317f().equalsIgnoreCase("bnc_no_value")) {
                    if (j.f15588n) {
                        j.f15593s = true;
                    } else {
                        j.mo19202s();
                    }
                }
            }
            j.mo19203t();
            if (j.f15584j == Branch.SESSION_STATE.UNINITIALISED && !Branch.f15573y) {
                C7077r.m13675a("initializing session on user's behalf (onActivityResumed called but SESSION_STATE = UNINITIALISED)");
                Branch.C7020i iVar = new Branch.C7020i(activity);
                iVar.f15604b = true;
                iVar.mo19217a();
            }
            this.f15639c.add(activity.toString());
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        C7072q qVar;
        C7077r rVar;
        C7077r.m13675a("onActivityStarted, activity = " + activity);
        Branch j = Branch.m13575j();
        if (j != null) {
            j.f15586l = new WeakReference<>(activity);
            j.f15583i = Branch.INTENT_STATE.PENDING;
            boolean z = true;
            this.f15638b++;
            Branch j2 = Branch.m13575j();
            if (j2 != null) {
                if (j2.f15596v == null || (qVar = j2.f15577c) == null || qVar.f15748a == null || (rVar = j2.f15576b) == null || rVar.mo19327q() == null) {
                    z = false;
                }
                if (z) {
                    if (!j2.f15576b.mo19327q().equals(j2.f15577c.f15748a.f15752c) && !j2.f15588n && !j2.f15596v.f15762a) {
                        j2.f15588n = j2.f15577c.f15748a.mo19311g(activity, j2);
                    }
                }
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        C7077r.m13675a("onActivityStopped, activity = " + activity);
        Branch j = Branch.m13575j();
        if (j != null) {
            int i = this.f15638b - 1;
            this.f15638b = i;
            if (i < 1) {
                j.f15594t = false;
                j.f15576b.f15761e.f15652a.clear();
                Branch.SESSION_STATE session_state = j.f15584j;
                Branch.SESSION_STATE session_state2 = Branch.SESSION_STATE.UNINITIALISED;
                if (session_state != session_state2) {
                    C7090z zVar = new C7090z(j.f15578d);
                    if (j.f15585k) {
                        j.mo19198l(zVar);
                    } else {
                        zVar.mo19252k((C7031c0) null, (Branch) null);
                    }
                    j.f15584j = session_state2;
                }
                j.f15585k = false;
                j.f15576b.mo19335y("bnc_external_intent_uri", (String) null);
                C7078r0 r0Var = j.f15596v;
                Context context = j.f15578d;
                r0Var.getClass();
                r0Var.f15762a = C7077r.m13677h(context).mo19316e("bnc_tracking_state");
            }
        }
    }
}
