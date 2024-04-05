package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.p015ui.text.font.C1962p;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14599c4;
import com.google.android.gms.internal.measurement.C14651g4;
import com.google.android.gms.internal.measurement.C14742n4;
import com.google.android.gms.internal.measurement.C14755o4;
import com.google.android.gms.internal.measurement.C14794r4;
import com.google.android.gms.internal.measurement.C14853w3;
import com.google.android.gms.internal.measurement.C14889z3;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import p514bk.C14088a;
import p772tq.C20203a;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
public final class C15103u3 implements C15051o4 {

    /* renamed from: I */
    public static volatile C15103u3 f33863I;

    /* renamed from: A */
    public long f33864A;

    /* renamed from: B */
    public volatile Boolean f33865B;
    @VisibleForTesting

    /* renamed from: C */
    public Boolean f33866C;
    @VisibleForTesting

    /* renamed from: D */
    public Boolean f33867D;

    /* renamed from: E */
    public volatile boolean f33868E;

    /* renamed from: F */
    public int f33869F;

    /* renamed from: G */
    public final AtomicInteger f33870G = new AtomicInteger(0);
    @VisibleForTesting

    /* renamed from: H */
    public final long f33871H;

    /* renamed from: b */
    public final Context f33872b;

    /* renamed from: c */
    public final String f33873c;

    /* renamed from: d */
    public final String f33874d;

    /* renamed from: e */
    public final String f33875e;

    /* renamed from: f */
    public final boolean f33876f;

    /* renamed from: g */
    public final C20203a f33877g;

    /* renamed from: h */
    public final C14947d f33878h;

    /* renamed from: i */
    public final C14942c3 f33879i;

    /* renamed from: j */
    public final C15049o2 f33880j;

    /* renamed from: k */
    public final C15086s3 f33881k;

    /* renamed from: l */
    public final C15114v6 f33882l;

    /* renamed from: m */
    public final C15018k7 f33883m;

    /* renamed from: n */
    public final C15004j2 f33884n;

    /* renamed from: o */
    public final Clock f33885o;

    /* renamed from: p */
    public final C15113v5 f33886p;

    /* renamed from: q */
    public final C15007j5 f33887q;

    /* renamed from: r */
    public final C14985h1 f33888r;

    /* renamed from: s */
    public final C15043n5 f33889s;

    /* renamed from: t */
    public final String f33890t;

    /* renamed from: u */
    public C14995i2 f33891u;

    /* renamed from: v */
    public C14999i6 f33892v;

    /* renamed from: w */
    public C15019l f33893w;

    /* renamed from: x */
    public C14977g2 f33894x;

    /* renamed from: y */
    public boolean f33895y = false;

    /* renamed from: z */
    public Boolean f33896z;

    public C15103u3(C15069q4 q4Var) {
        Context context;
        Bundle bundle;
        Preconditions.checkNotNull(q4Var);
        Context context2 = q4Var.f33768a;
        C20203a aVar = new C20203a(0);
        this.f33877g = aVar;
        C14088a.f31025f = aVar;
        this.f33872b = context2;
        this.f33873c = q4Var.f33769b;
        this.f33874d = q4Var.f33770c;
        this.f33875e = q4Var.f33771d;
        this.f33876f = q4Var.f33775h;
        this.f33865B = q4Var.f33772e;
        this.f33890t = q4Var.f33777j;
        boolean z = true;
        this.f33868E = true;
        zzcl zzcl = q4Var.f33774g;
        if (!(zzcl == null || (bundle = zzcl.zzg) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f33866C = (Boolean) obj;
            }
            Object obj2 = zzcl.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f33867D = (Boolean) obj2;
            }
        }
        synchronized (C14742n4.f32962f) {
            C14853w3 w3Var = C14742n4.f32963g;
            Context applicationContext = context2.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            if (w3Var == null || w3Var.f33143a != applicationContext) {
                C14889z3.m24205c();
                C14755o4.m23819a();
                synchronized (C14599c4.class) {
                    C14599c4 c4Var = C14599c4.f32782c;
                    if (!(c4Var == null || (context = c4Var.f32783a) == null || c4Var.f32784b == null)) {
                        context.getContentResolver().unregisterContentObserver(C14599c4.f32782c.f32784b);
                    }
                    C14599c4.f32782c = null;
                }
                C14742n4.f32963g = new C14853w3(applicationContext, C14794r4.m23909a(new C14651g4(applicationContext)));
                C14742n4.f32964h.incrementAndGet();
            }
        }
        Clock instance = DefaultClock.getInstance();
        this.f33885o = instance;
        Long l = q4Var.f33776i;
        this.f33871H = l != null ? l.longValue() : instance.currentTimeMillis();
        this.f33878h = new C14947d(this);
        C14942c3 c3Var = new C14942c3(this);
        c3Var.mo52265j();
        this.f33879i = c3Var;
        C15049o2 o2Var = new C15049o2(this);
        o2Var.mo52265j();
        this.f33880j = o2Var;
        C15018k7 k7Var = new C15018k7(this);
        k7Var.mo52265j();
        this.f33883m = k7Var;
        this.f33884n = new C15004j2(new C1962p(this));
        this.f33888r = new C14985h1(this);
        C15113v5 v5Var = new C15113v5(this);
        v5Var.mo51947i();
        this.f33886p = v5Var;
        C15007j5 j5Var = new C15007j5(this);
        j5Var.mo51947i();
        this.f33887q = j5Var;
        C15114v6 v6Var = new C15114v6(this);
        v6Var.mo51947i();
        this.f33882l = v6Var;
        C15043n5 n5Var = new C15043n5(this);
        n5Var.mo52265j();
        this.f33889s = n5Var;
        C15086s3 s3Var = new C15086s3(this);
        s3Var.mo52265j();
        this.f33881k = s3Var;
        zzcl zzcl2 = q4Var.f33774g;
        if (!(zzcl2 == null || zzcl2.zzb == 0)) {
            z = false;
        }
        if (context2.getApplicationContext() instanceof Application) {
            C15007j5 s = mo52331s();
            if (((C15103u3) s.f33681b).f33872b.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C15103u3) s.f33681b).f33872b.getApplicationContext();
                if (s.f33598d == null) {
                    s.f33598d = new C14989h5(s);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(s.f33598d);
                    application.registerActivityLifecycleCallbacks(s.f33598d);
                    ((C15103u3) s.f33681b).mo52016b().f33732o.mo52237a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo52016b().f33727j.mo52237a("Application context is not an Application");
        }
        s3Var.mo52308o(new C15095t3(0, (Object) this, (Object) q4Var));
    }

    /* renamed from: h */
    public static final void m24639h(C14933b3 b3Var) {
        if (b3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b3Var.f33280c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b3Var.getClass())));
        }
    }

    /* renamed from: i */
    public static final void m24640i(C15042n4 n4Var) {
        if (n4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!n4Var.f33708c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(n4Var.getClass())));
        }
    }

    /* renamed from: r */
    public static C15103u3 m24641r(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.zze == null || zzcl.zzf == null)) {
            zzcl = new zzcl(zzcl.zza, zzcl.zzb, zzcl.zzc, zzcl.zzd, (String) null, (String) null, zzcl.zzg, (String) null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f33863I == null) {
            synchronized (C15103u3.class) {
                if (f33863I == null) {
                    f33863I = new C15103u3(new C15069q4(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.zzg) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.checkNotNull(f33863I);
            f33863I.f33865B = Boolean.valueOf(zzcl.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f33863I);
        return f33863I;
    }

    @Pure
    /* renamed from: a */
    public final C15086s3 mo52015a() {
        m24640i(this.f33881k);
        return this.f33881k;
    }

    @Pure
    /* renamed from: b */
    public final C15049o2 mo52016b() {
        m24640i(this.f33880j);
        return this.f33880j;
    }

    @Pure
    /* renamed from: c */
    public final Clock mo52017c() {
        return this.f33885o;
    }

    @Pure
    /* renamed from: d */
    public final C20203a mo52018d() {
        return this.f33877g;
    }

    /* renamed from: e */
    public final boolean mo52321e() {
        return mo52323j() == 0;
    }

    @Pure
    /* renamed from: f */
    public final Context mo52020f() {
        return this.f33872b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r0 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if (android.text.TextUtils.isEmpty(r0.f33525m) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52322g() {
        /*
            r7 = this;
            boolean r0 = r7.f33895y
            if (r0 == 0) goto L_0x00e5
            com.google.android.gms.measurement.internal.s3 r0 = r7.mo52015a()
            r0.mo51995g()
            java.lang.Boolean r0 = r7.f33896z
            if (r0 == 0) goto L_0x0030
            long r1 = r7.f33864A
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0030
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00de
            com.google.android.gms.common.util.Clock r0 = r7.f33885o
            long r0 = r0.elapsedRealtime()
            long r2 = r7.f33864A
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00de
        L_0x0030:
            com.google.android.gms.common.util.Clock r0 = r7.f33885o
            long r0 = r0.elapsedRealtime()
            r7.f33864A = r0
            com.google.android.gms.measurement.internal.k7 r0 = r7.mo52335w()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.mo52200N(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0092
            com.google.android.gms.measurement.internal.k7 r0 = r7.mo52335w()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.mo52200N(r3)
            if (r0 == 0) goto L_0x0092
            android.content.Context r0 = r7.f33872b
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)
            boolean r0 = r0.isCallerInstantApp()
            if (r0 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.d r0 = r7.f33878h
            boolean r0 = r0.mo51977t()
            if (r0 != 0) goto L_0x0090
            android.content.Context r0 = r7.f33872b
            boolean r0 = com.google.android.gms.measurement.internal.C15018k7.m24471T(r0)
            if (r0 == 0) goto L_0x0092
            android.content.Context r0 = r7.f33872b
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008d }
            if (r4 != 0) goto L_0x007c
            goto L_0x008d
        L_0x007c:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x008d }
            r5.<init>(r0, r3)     // Catch:{ NameNotFoundException -> 0x008d }
            android.content.pm.ServiceInfo r0 = r4.getServiceInfo(r5, r1)     // Catch:{ NameNotFoundException -> 0x008d }
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x008d }
            if (r0 == 0) goto L_0x008d
            r0 = r2
            goto L_0x008e
        L_0x008d:
            r0 = r1
        L_0x008e:
            if (r0 == 0) goto L_0x0092
        L_0x0090:
            r0 = r2
            goto L_0x0093
        L_0x0092:
            r0 = r1
        L_0x0093:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.f33896z = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.k7 r0 = r7.mo52335w()
            com.google.android.gms.measurement.internal.g2 r3 = r7.mo52327n()
            java.lang.String r3 = r3.mo52047m()
            com.google.android.gms.measurement.internal.g2 r4 = r7.mo52327n()
            r4.mo51946h()
            java.lang.String r4 = r4.f33525m
            com.google.android.gms.measurement.internal.g2 r5 = r7.mo52327n()
            r5.mo51946h()
            java.lang.String r6 = r5.f33526n
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.lang.String r5 = r5.f33526n
            boolean r0 = r0.mo52192F(r3, r4, r5)
            if (r0 != 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.g2 r0 = r7.mo52327n()
            r0.mo51946h()
            java.lang.String r0 = r0.f33525m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d8
        L_0x00d7:
            r1 = r2
        L_0x00d8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f33896z = r0
        L_0x00de:
            java.lang.Boolean r0 = r7.f33896z
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15103u3.mo52322g():boolean");
    }

    /* renamed from: j */
    public final int mo52323j() {
        mo52015a().mo51995g();
        if (this.f33878h.mo51975r()) {
            return 1;
        }
        Boolean bool = this.f33867D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo52015a().mo51995g();
        if (!this.f33868E) {
            return 8;
        }
        Boolean n = mo52330q().mo51956n();
        if (n != null) {
            return n.booleanValue() ? 0 : 3;
        }
        C14947d dVar = this.f33878h;
        C20203a aVar = ((C15103u3) dVar.f33681b).f33877g;
        Boolean o = dVar.mo51972o("firebase_analytics_collection_enabled");
        if (o != null) {
            return o.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f33866C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f33878h.mo51973p((String) null, C14959e2.f33386T) || this.f33865B == null || this.f33865B.booleanValue()) ? 0 : 7;
    }

    @Pure
    /* renamed from: k */
    public final C14985h1 mo52324k() {
        C14985h1 h1Var = this.f33888r;
        if (h1Var != null) {
            return h1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: l */
    public final C14947d mo52325l() {
        return this.f33878h;
    }

    @Pure
    /* renamed from: m */
    public final C15019l mo52326m() {
        m24640i(this.f33893w);
        return this.f33893w;
    }

    @Pure
    /* renamed from: n */
    public final C14977g2 mo52327n() {
        m24639h(this.f33894x);
        return this.f33894x;
    }

    @Pure
    /* renamed from: o */
    public final C14995i2 mo52328o() {
        m24639h(this.f33891u);
        return this.f33891u;
    }

    @Pure
    /* renamed from: p */
    public final C15004j2 mo52329p() {
        return this.f33884n;
    }

    @Pure
    /* renamed from: q */
    public final C14942c3 mo52330q() {
        C14942c3 c3Var = this.f33879i;
        if (c3Var != null) {
            return c3Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: s */
    public final C15007j5 mo52331s() {
        m24639h(this.f33887q);
        return this.f33887q;
    }

    @Pure
    /* renamed from: t */
    public final C15113v5 mo52332t() {
        m24639h(this.f33886p);
        return this.f33886p;
    }

    @Pure
    /* renamed from: u */
    public final C14999i6 mo52333u() {
        m24639h(this.f33892v);
        return this.f33892v;
    }

    @Pure
    /* renamed from: v */
    public final C15114v6 mo52334v() {
        m24639h(this.f33882l);
        return this.f33882l;
    }

    @Pure
    /* renamed from: w */
    public final C15018k7 mo52335w() {
        C15018k7 k7Var = this.f33883m;
        if (k7Var != null) {
            return k7Var;
        }
        throw new IllegalStateException("Component not created");
    }
}
