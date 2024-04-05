package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
public final class C15113v5 extends C14933b3 {

    /* renamed from: d */
    public volatile C15061p5 f33922d;

    /* renamed from: e */
    public volatile C15061p5 f33923e;
    @VisibleForTesting

    /* renamed from: f */
    public C15061p5 f33924f;

    /* renamed from: g */
    public final ConcurrentHashMap f33925g = new ConcurrentHashMap();

    /* renamed from: h */
    public Activity f33926h;

    /* renamed from: i */
    public volatile boolean f33927i;

    /* renamed from: j */
    public volatile C15061p5 f33928j;

    /* renamed from: k */
    public C15061p5 f33929k;

    /* renamed from: l */
    public boolean f33930l;

    /* renamed from: m */
    public final Object f33931m = new Object();

    /* renamed from: n */
    public String f33932n;

    public C15113v5(C15103u3 u3Var) {
        super(u3Var);
    }

    /* renamed from: j */
    public final boolean mo51948j() {
        return false;
    }

    /* renamed from: k */
    public final void mo52345k(Activity activity, C15061p5 p5Var, boolean z) {
        C15061p5 p5Var2;
        C15061p5 p5Var3 = p5Var;
        C15061p5 p5Var4 = this.f33922d == null ? this.f33923e : this.f33922d;
        if (p5Var3.f33750b == null) {
            p5Var2 = new C15061p5(p5Var3.f33749a, activity != null ? mo52349o(activity.getClass()) : null, p5Var3.f33751c, p5Var3.f33753e, p5Var3.f33754f);
        } else {
            p5Var2 = p5Var3;
        }
        this.f33923e = this.f33922d;
        this.f33922d = p5Var2;
        ((C15103u3) this.f33681b).mo52015a().mo52308o(new C15079r5(this, p5Var2, p5Var4, ((C15103u3) this.f33681b).f33885o.elapsedRealtime(), z));
    }

    /* renamed from: l */
    public final void mo52346l(C15061p5 p5Var, C15061p5 p5Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        C15061p5 p5Var3 = p5Var;
        C15061p5 p5Var4 = p5Var2;
        long j2 = j;
        Bundle bundle2 = bundle;
        mo51995g();
        boolean z3 = false;
        boolean z4 = p5Var4 == null || p5Var4.f33751c != p5Var3.f33751c || !C15018k7.m24472U(p5Var4.f33750b, p5Var3.f33750b) || !C15018k7.m24472U(p5Var4.f33749a, p5Var3.f33749a);
        if (z && this.f33924f != null) {
            z3 = true;
        }
        if (z4) {
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            C15018k7.m24481s(p5Var3, bundle3, true);
            if (p5Var4 != null) {
                String str = p5Var4.f33749a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = p5Var4.f33750b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", p5Var4.f33751c);
            }
            if (z3) {
                C15098t6 t6Var = ((C15103u3) this.f33681b).mo52334v().f33935f;
                long j3 = j2 - t6Var.f33856b;
                t6Var.f33856b = j2;
                if (j3 > 0) {
                    ((C15103u3) this.f33681b).mo52335w().mo52219q(bundle3, j3);
                }
            }
            if (!((C15103u3) this.f33681b).f33878h.mo51974q()) {
                bundle3.putLong("_mst", 1);
            }
            String str3 = true != p5Var3.f33753e ? "auto" : "app";
            long currentTimeMillis = ((C15103u3) this.f33681b).f33885o.currentTimeMillis();
            z2 = z3;
            if (p5Var3.f33753e) {
                long j4 = p5Var3.f33754f;
                if (j4 != 0) {
                    currentTimeMillis = j4;
                }
            }
            ((C15103u3) this.f33681b).mo52331s().mo52152n(str3, "_vs", bundle3, currentTimeMillis);
        } else {
            z2 = z3;
        }
        if (z2) {
            mo52347m(this.f33924f, true, j2);
        }
        this.f33924f = p5Var3;
        if (p5Var3.f33753e) {
            this.f33929k = p5Var3;
        }
        C14999i6 u = ((C15103u3) this.f33681b).mo52333u();
        u.mo51995g();
        u.mo51946h();
        u.mo52133s(new C14952d4(1, u, p5Var3));
    }

    /* renamed from: m */
    public final void mo52347m(C15061p5 p5Var, boolean z, long j) {
        ((C15103u3) this.f33681b).mo52324k().mo52086j(((C15103u3) this.f33681b).f33885o.elapsedRealtime());
        if (((C15103u3) this.f33681b).mo52334v().f33935f.mo52319a(j, p5Var != null && p5Var.f33752d, z) && p5Var != null) {
            p5Var.f33752d = false;
        }
    }

    /* renamed from: n */
    public final C15061p5 mo52348n(boolean z) {
        mo51946h();
        mo51995g();
        if (!z) {
            return this.f33924f;
        }
        C15061p5 p5Var = this.f33924f;
        return p5Var != null ? p5Var : this.f33929k;
    }

    @VisibleForTesting
    /* renamed from: o */
    public final String mo52349o(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        ((C15103u3) this.f33681b).getClass();
        if (length2 <= 100) {
            return str;
        }
        ((C15103u3) this.f33681b).getClass();
        return str.substring(0, 100);
    }

    /* renamed from: p */
    public final void mo52350p(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (((C15103u3) this.f33681b).f33878h.mo51974q() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f33925g.put(activity, new C15061p5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* renamed from: q */
    public final C15061p5 mo52351q(Activity activity) {
        Preconditions.checkNotNull(activity);
        C15061p5 p5Var = (C15061p5) this.f33925g.get(activity);
        if (p5Var == null) {
            C15061p5 p5Var2 = new C15061p5((String) null, mo52349o(activity.getClass()), ((C15103u3) this.f33681b).mo52335w().mo52211i0());
            this.f33925g.put(activity, p5Var2);
            p5Var = p5Var2;
        }
        return this.f33928j != null ? this.f33928j : p5Var;
    }
}
