package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.d */
public final class C14947d extends C15033m4 {

    /* renamed from: c */
    public Boolean f33333c;

    /* renamed from: d */
    public C14938c f33334d = C14929b.f33276b;

    /* renamed from: e */
    public Boolean f33335e;

    public C14947d(C15103u3 u3Var) {
        super(u3Var);
    }

    /* renamed from: h */
    public final String mo51965h(String str) {
        Class<String> cls = String.class;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            Preconditions.checkNotNull(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Could not find SystemProperties class");
            return "";
        } catch (NoSuchMethodException e2) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e2, "Could not find SystemProperties.get() method");
            return "";
        } catch (IllegalAccessException e3) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e3, "Could not access SystemProperties.get()");
            return "";
        } catch (InvocationTargetException e4) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* renamed from: i */
    public final double mo51966i(String str, C14950d2<Double> d2Var) {
        if (str == null) {
            return d2Var.mo51978a(null).doubleValue();
        }
        String e = this.f33334d.mo51945e(str, d2Var.f33339a);
        if (TextUtils.isEmpty(e)) {
            return d2Var.mo51978a(null).doubleValue();
        }
        try {
            return d2Var.mo51978a(Double.valueOf(Double.parseDouble(e))).doubleValue();
        } catch (NumberFormatException unused) {
            return d2Var.mo51978a(null).doubleValue();
        }
    }

    /* renamed from: j */
    public final int mo51967j() {
        C15018k7 w = ((C15103u3) this.f33681b).mo52335w();
        Boolean bool = ((C15103u3) w.f33681b).mo52333u().f33575f;
        if (w.mo52210g0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: k */
    public final int mo51968k(String str, C14950d2<Integer> d2Var) {
        if (str == null) {
            return d2Var.mo51978a(null).intValue();
        }
        String e = this.f33334d.mo51945e(str, d2Var.f33339a);
        if (TextUtils.isEmpty(e)) {
            return d2Var.mo51978a(null).intValue();
        }
        try {
            return d2Var.mo51978a(Integer.valueOf(Integer.parseInt(e))).intValue();
        } catch (NumberFormatException unused) {
            return d2Var.mo51978a(null).intValue();
        }
    }

    /* renamed from: l */
    public final void mo51969l() {
        ((C15103u3) this.f33681b).getClass();
    }

    /* renamed from: m */
    public final long mo51970m(String str, C14950d2<Long> d2Var) {
        if (str == null) {
            return d2Var.mo51978a(null).longValue();
        }
        String e = this.f33334d.mo51945e(str, d2Var.f33339a);
        if (TextUtils.isEmpty(e)) {
            return d2Var.mo51978a(null).longValue();
        }
        try {
            return d2Var.mo51978a(Long.valueOf(Long.parseLong(e))).longValue();
        } catch (NumberFormatException unused) {
            return d2Var.mo51978a(null).longValue();
        }
    }

    @VisibleForTesting
    /* renamed from: n */
    public final Bundle mo51971n() {
        try {
            if (((C15103u3) this.f33681b).f33872b.getPackageManager() == null) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(((C15103u3) this.f33681b).f33872b).getApplicationInfo(((C15103u3) this.f33681b).f33872b.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: o */
    public final Boolean mo51972o(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle n = mo51971n();
        if (n == null) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!n.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(n.getBoolean(str));
        }
    }

    /* renamed from: p */
    public final boolean mo51973p(String str, C14950d2<Boolean> d2Var) {
        if (str == null) {
            return d2Var.mo51978a(null).booleanValue();
        }
        String e = this.f33334d.mo51945e(str, d2Var.f33339a);
        if (TextUtils.isEmpty(e)) {
            return d2Var.mo51978a(null).booleanValue();
        }
        return d2Var.mo51978a(Boolean.valueOf(((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33440x0) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(e) : Boolean.parseBoolean(e))).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo51974q() {
        Boolean o = mo51972o("google_analytics_automatic_screen_reporting_enabled");
        return o == null || o.booleanValue();
    }

    /* renamed from: r */
    public final boolean mo51975r() {
        ((C15103u3) this.f33681b).getClass();
        Boolean o = mo51972o("firebase_analytics_collection_deactivated");
        return o != null && o.booleanValue();
    }

    /* renamed from: s */
    public final boolean mo51976s(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.f33334d.mo51945e(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: t */
    public final boolean mo51977t() {
        if (this.f33333c == null) {
            Boolean o = mo51972o("app_measurement_lite");
            this.f33333c = o;
            if (o == null) {
                this.f33333c = Boolean.FALSE;
            }
        }
        return this.f33333c.booleanValue() || !((C15103u3) this.f33681b).f33876f;
    }
}
