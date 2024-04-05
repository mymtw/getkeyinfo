package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.C1339j1;
import com.etsy.android.push.CartRefreshDelegate;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14617d9;
import com.google.android.gms.internal.measurement.C14695j9;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p604kj.C18103h;
import p604kj.C18105j;

/* renamed from: com.google.android.gms.measurement.internal.j5 */
public final class C15007j5 extends C14933b3 {
    @VisibleForTesting

    /* renamed from: d */
    public C14989h5 f33598d;

    /* renamed from: e */
    public C1339j1 f33599e;

    /* renamed from: f */
    public final CopyOnWriteArraySet f33600f = new CopyOnWriteArraySet();

    /* renamed from: g */
    public boolean f33601g;

    /* renamed from: h */
    public final AtomicReference<String> f33602h = new AtomicReference<>();

    /* renamed from: i */
    public final Object f33603i = new Object();

    /* renamed from: j */
    public C14956e f33604j = new C14956e((Boolean) null, (Boolean) null);

    /* renamed from: k */
    public int f33605k = 100;

    /* renamed from: l */
    public final AtomicLong f33606l = new AtomicLong(0);

    /* renamed from: m */
    public long f33607m = -1;

    /* renamed from: n */
    public int f33608n = 100;

    /* renamed from: o */
    public final C15036m7 f33609o;
    @VisibleForTesting

    /* renamed from: p */
    public boolean f33610p = true;

    /* renamed from: q */
    public final C15033m4 f33611q = new C15033m4(this);

    public C15007j5(C15103u3 u3Var) {
        super(u3Var);
        this.f33609o = new C15036m7(u3Var);
    }

    /* renamed from: A */
    public static void m24433A(C15007j5 j5Var, C14956e eVar, int i, long j, boolean z, boolean z2) {
        j5Var.mo51995g();
        j5Var.mo51946h();
        if (j <= j5Var.f33607m) {
            if (j5Var.f33608n <= i) {
                ((C15103u3) j5Var.f33681b).mo52016b().f33730m.mo52238b(eVar, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        C14942c3 q = ((C15103u3) j5Var.f33681b).mo52330q();
        C15051o4 o4Var = q.f33681b;
        q.mo51995g();
        if (q.mo51960r(i)) {
            SharedPreferences.Editor edit = q.mo51953k().edit();
            edit.putString("consent_settings", eVar.mo51984d());
            edit.putInt("consent_source", i);
            edit.apply();
            j5Var.f33607m = j;
            j5Var.f33608n = i;
            C14999i6 u = ((C15103u3) j5Var.f33681b).mo52333u();
            u.mo51995g();
            u.mo51946h();
            if (z) {
                ((C15103u3) u.f33681b).getClass();
                ((C15103u3) u.f33681b).mo52328o().mo52119l();
            }
            if (u.mo52128n()) {
                u.mo52133s(new C15015k4(1, u, u.mo52130p(false)));
            }
            if (z2) {
                ((C15103u3) j5Var.f33681b).mo52333u().mo52137x(new AtomicReference());
                return;
            }
            return;
        }
        ((C15103u3) j5Var.f33681b).mo52016b().f33730m.mo52238b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
    }

    /* renamed from: B */
    public final void mo52147B() {
        mo51995g();
        mo51946h();
        if (((C15103u3) this.f33681b).mo52322g()) {
            if (((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33392Z)) {
                C14947d dVar = ((C15103u3) this.f33681b).f33878h;
                ((C15103u3) dVar.f33681b).getClass();
                Boolean o = dVar.mo51972o("google_analytics_deferred_deep_link_enabled");
                if (o != null && o.booleanValue()) {
                    ((C15103u3) this.f33681b).mo52016b().f33731n.mo52237a("Deferred Deep Link feature enabled.");
                    ((C15103u3) this.f33681b).mo52015a().mo52308o(new C18103h(this, 1));
                }
            }
            C14999i6 u = ((C15103u3) this.f33681b).mo52333u();
            u.mo51995g();
            u.mo51946h();
            zzp p = u.mo52130p(true);
            ((C15103u3) u.f33681b).mo52328o().mo52121n(3, new byte[0]);
            u.mo52133s(new C15001j(2, u, p));
            this.f33610p = false;
            C14942c3 q = ((C15103u3) this.f33681b).mo52330q();
            q.mo51995g();
            String string = q.mo51953k().getString("previous_os_version", (String) null);
            ((C15103u3) q.f33681b).mo52326m().mo52264i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = q.mo51953k().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                ((C15103u3) this.f33681b).mo52326m().mo52264i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo52151m("auto", bundle, "_ou");
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo52148C(String str, Bundle bundle, String str2) {
        long currentTimeMillis = ((C15103u3) this.f33681b).f33885o.currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ((C15103u3) this.f33681b).mo52015a().mo52308o(new C15136y4(this, bundle2));
    }

    /* renamed from: j */
    public final boolean mo51948j() {
        return false;
    }

    /* renamed from: k */
    public final void mo52149k() {
        if ((((C15103u3) this.f33681b).f33872b.getApplicationContext() instanceof Application) && this.f33598d != null) {
            ((Application) ((C15103u3) this.f33681b).f33872b.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f33598d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r4 > 100) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r6 > 100) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        r2 = ((com.google.android.gms.measurement.internal.C15103u3) r1.f33681b).mo52016b().f33732o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f7, code lost:
        if (r13 != null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fc, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        if (r14 != null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0102, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0103, code lost:
        r2.mo52239c(r3, "Logging screen view with name, class", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010a, code lost:
        if (r1.f33922d != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010c, code lost:
        r2 = r1.f33923e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010f, code lost:
        r2 = r1.f33922d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0111, code lost:
        r12 = new com.google.android.gms.measurement.internal.C15061p5(r13, r14, ((com.google.android.gms.measurement.internal.C15103u3) r1.f33681b).mo52335w().mo52211i0(), true, r26);
        r1.f33922d = r12;
        r1.f33923e = r2;
        r1.f33928j = r12;
        ((com.google.android.gms.measurement.internal.C15103u3) r1.f33681b).mo52015a().mo52308o(new com.google.android.gms.measurement.internal.C15070q5(r1, r0, r12, r2, ((com.google.android.gms.measurement.internal.C15103u3) r1.f33681b).f33885o.elapsedRealtime()));
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52150l(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            if (r21 != 0) goto L_0x0008
            java.lang.String r0 = "app"
            r3 = r0
            goto L_0x000a
        L_0x0008:
            r3 = r21
        L_0x000a:
            if (r23 != 0) goto L_0x0012
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L_0x0014
        L_0x0012:
            r0 = r23
        L_0x0014:
            java.lang.String r1 = "screen_view"
            r4 = r22
            boolean r1 = com.google.android.gms.measurement.internal.C15018k7.m24472U(r4, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.o4 r1 = r11.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.v5 r1 = r1.mo52332t()
            java.lang.Object r5 = r1.f33931m
            monitor-enter(r5)
            boolean r3 = r1.f33930l     // Catch:{ all -> 0x0154 }
            if (r3 != 0) goto L_0x0040
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33729l     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.mo52237a(r1)     // Catch:{ all -> 0x0154 }
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            goto L_0x0153
        L_0x0040:
            java.lang.String r3 = "screen_name"
            java.lang.String r13 = r0.getString(r3)     // Catch:{ all -> 0x0154 }
            r3 = 100
            if (r13 == 0) goto L_0x0077
            int r4 = r13.length()     // Catch:{ all -> 0x0154 }
            if (r4 <= 0) goto L_0x005d
            int r4 = r13.length()     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f33681b     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ all -> 0x0154 }
            r6.getClass()     // Catch:{ all -> 0x0154 }
            if (r4 <= r3) goto L_0x0077
        L_0x005d:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33729l     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch:{ all -> 0x0154 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0154 }
            r0.mo52238b(r2, r1)     // Catch:{ all -> 0x0154 }
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            goto L_0x0153
        L_0x0077:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x0154 }
            if (r4 == 0) goto L_0x00ac
            int r6 = r4.length()     // Catch:{ all -> 0x0154 }
            if (r6 <= 0) goto L_0x0092
            int r6 = r4.length()     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f33681b     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ all -> 0x0154 }
            r7.getClass()     // Catch:{ all -> 0x0154 }
            if (r6 <= r3) goto L_0x00ac
        L_0x0092:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33729l     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r4.length()     // Catch:{ all -> 0x0154 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0154 }
            r0.mo52238b(r2, r1)     // Catch:{ all -> 0x0154 }
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            goto L_0x0153
        L_0x00ac:
            if (r4 != 0) goto L_0x00bf
            android.app.Activity r3 = r1.f33926h     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x00bb
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x0154 }
            java.lang.String r3 = r1.mo52349o(r3)     // Catch:{ all -> 0x0154 }
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r3 = "Activity"
        L_0x00bd:
            r14 = r3
            goto L_0x00c0
        L_0x00bf:
            r14 = r4
        L_0x00c0:
            com.google.android.gms.measurement.internal.p5 r3 = r1.f33922d     // Catch:{ all -> 0x0154 }
            boolean r4 = r1.f33927i     // Catch:{ all -> 0x0154 }
            if (r4 == 0) goto L_0x00ec
            if (r3 == 0) goto L_0x00ec
            r1.f33927i = r2     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = r3.f33750b     // Catch:{ all -> 0x0154 }
            boolean r2 = com.google.android.gms.measurement.internal.C15018k7.m24472U(r2, r14)     // Catch:{ all -> 0x0154 }
            java.lang.String r3 = r3.f33749a     // Catch:{ all -> 0x0154 }
            boolean r3 = com.google.android.gms.measurement.internal.C15018k7.m24472U(r3, r13)     // Catch:{ all -> 0x0154 }
            if (r2 == 0) goto L_0x00ec
            if (r3 == 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33729l     // Catch:{ all -> 0x0154 }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.mo52237a(r1)     // Catch:{ all -> 0x0154 }
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            goto L_0x0153
        L_0x00ec:
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33732o
            if (r13 != 0) goto L_0x00fc
            java.lang.String r3 = "null"
            goto L_0x00fd
        L_0x00fc:
            r3 = r13
        L_0x00fd:
            if (r14 != 0) goto L_0x0102
            java.lang.String r4 = "null"
            goto L_0x0103
        L_0x0102:
            r4 = r14
        L_0x0103:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.mo52239c(r3, r5, r4)
            com.google.android.gms.measurement.internal.p5 r2 = r1.f33922d
            if (r2 != 0) goto L_0x010f
            com.google.android.gms.measurement.internal.p5 r2 = r1.f33923e
            goto L_0x0111
        L_0x010f:
            com.google.android.gms.measurement.internal.p5 r2 = r1.f33922d
        L_0x0111:
            com.google.android.gms.measurement.internal.p5 r3 = new com.google.android.gms.measurement.internal.p5
            com.google.android.gms.measurement.internal.o4 r4 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.k7 r4 = r4.mo52335w()
            long r15 = r4.mo52211i0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r1.f33922d = r3
            r1.f33923e = r2
            r1.f33928j = r3
            com.google.android.gms.measurement.internal.o4 r4 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.common.util.Clock r4 = r4.f33885o
            long r4 = r4.elapsedRealtime()
            com.google.android.gms.measurement.internal.o4 r6 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo52015a()
            com.google.android.gms.measurement.internal.q5 r7 = new com.google.android.gms.measurement.internal.q5
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.mo52308o(r7)
        L_0x0153:
            return
        L_0x0154:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            throw r0
        L_0x0157:
            if (r25 == 0) goto L_0x0166
            androidx.compose.runtime.j1 r1 = r11.f33599e
            if (r1 == 0) goto L_0x0166
            boolean r1 = com.google.android.gms.measurement.internal.C15018k7.m24469R(r22)
            if (r1 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r9 = r2
            goto L_0x0168
        L_0x0166:
            r1 = 1
            r9 = r1
        L_0x0168:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r0)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0175:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r7.get(r1)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0194
            android.os.Bundle r6 = new android.os.Bundle
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6.<init>(r5)
            r7.putBundle(r1, r6)
            goto L_0x0175
        L_0x0194:
            boolean r1 = r5 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x01b0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            r1 = r2
        L_0x019b:
            int r6 = r5.length
            if (r1 >= r6) goto L_0x0175
            r6 = r5[r1]
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x01ad
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5[r1] = r8
        L_0x01ad:
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01b0:
            boolean r1 = r5 instanceof java.util.List
            if (r1 == 0) goto L_0x0175
            java.util.List r5 = (java.util.List) r5
            r1 = r2
        L_0x01b7:
            int r6 = r5.size()
            if (r1 >= r6) goto L_0x0175
            java.lang.Object r6 = r5.get(r1)
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x01cf
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5.set(r1, r8)
        L_0x01cf:
            int r1 = r1 + 1
            goto L_0x01b7
        L_0x01d2:
            com.google.android.gms.measurement.internal.o4 r0 = r11.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()
            com.google.android.gms.measurement.internal.v4 r12 = new com.google.android.gms.measurement.internal.v4
            r1 = r12
            r2 = r20
            r4 = r22
            r5 = r26
            r8 = r25
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r0.mo52308o(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15007j5.mo52150l(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* renamed from: m */
    public final void mo52151m(String str, Bundle bundle, String str2) {
        mo51995g();
        mo52152n(str, str2, bundle, ((C15103u3) this.f33681b).f33885o.currentTimeMillis());
    }

    /* renamed from: n */
    public final void mo52152n(String str, String str2, Bundle bundle, long j) {
        mo51995g();
        mo52153o(str, str2, j, bundle, true, this.f33599e == null || C15018k7.m24469R(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52153o(java.lang.String r27, java.lang.String r28, long r29, android.os.Bundle r31, boolean r32, boolean r33, boolean r34, java.lang.String r35) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r12 = r31
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r27)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r31)
            r26.mo51995g()
            r26.mo51946h()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            boolean r1 = r1.mo52321e()
            if (r1 == 0) goto L_0x0600
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.g2 r1 = r1.mo52327n()
            java.util.List<java.lang.String> r1 = r1.f33522j
            if (r1 == 0) goto L_0x0045
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33731n
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo52239c(r9, r1, r8)
            return
        L_0x0045:
            boolean r1 = r7.f33601g
            r13 = 0
            r14 = 1
            r15 = 0
            if (r1 != 0) goto L_0x00a2
            r7.f33601g = r14
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b     // Catch:{ ClassNotFoundException -> 0x0093 }
            r2 = r1
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ ClassNotFoundException -> 0x0093 }
            boolean r2 = r2.f33876f     // Catch:{ ClassNotFoundException -> 0x0093 }
            if (r2 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ ClassNotFoundException -> 0x0093 }
            android.content.Context r1 = r1.f33872b     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r14, r1)     // Catch:{ ClassNotFoundException -> 0x0093 }
            goto L_0x0068
        L_0x0064:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0093 }
        L_0x0068:
            java.lang.Class[] r1 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0082 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r15] = r2     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0082 }
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b     // Catch:{ Exception -> 0x0082 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ Exception -> 0x0082 }
            android.content.Context r2 = r2.f33872b     // Catch:{ Exception -> 0x0082 }
            r1[r15] = r2     // Catch:{ Exception -> 0x0082 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0082 }
            goto L_0x00a2
        L_0x0082:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b     // Catch:{ ClassNotFoundException -> 0x0093 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ ClassNotFoundException -> 0x0093 }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ ClassNotFoundException -> 0x0093 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33727j     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo52238b(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0093 }
            goto L_0x00a2
        L_0x0093:
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33730m
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo52237a(r1)
        L_0x00a2:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            java.lang.String r5 = r12.getString(r0)
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.common.util.Clock r0 = r0.f33885o
            long r3 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r6 = "_lgclid"
            r1 = r26
            r1.mo52160v(r2, r3, r5, r6)
        L_0x00d0:
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            if (r32 == 0) goto L_0x00fd
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C15018k7.f33636i
            r0 = r0[r15]
            boolean r0 = r0.equals(r9)
            r0 = r0 ^ r14
            if (r0 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.k7 r0 = r0.mo52335w()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo52330q()
            com.google.android.gms.measurement.internal.x2 r1 = r1.f33318w
            android.os.Bundle r1 = r1.mo52358a()
            r0.mo52221t(r12, r1)
        L_0x00fd:
            r0 = 40
            if (r34 != 0) goto L_0x0195
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0195
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo52199M(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0122
            goto L_0x013e
        L_0x0122:
            java.lang.String[] r3 = p568fn.C17782b.f38638i
            java.lang.String[] r5 = p568fn.C17782b.f38639j
            boolean r3 = r1.mo52194H(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x012f
            r4 = 13
            goto L_0x013e
        L_0x012f:
            com.google.android.gms.measurement.internal.o4 r3 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            r3.getClass()
            boolean r1 = r1.mo52193G(r0, r2, r9)
            if (r1 != 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r4 = r15
        L_0x013e:
            if (r4 == 0) goto L_0x0195
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33726i
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.j2 r2 = r2.f33884n
            java.lang.String r2 = r2.mo52142d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo52238b(r2, r3)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            r2.getClass()
            r1.getClass()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C15018k7.m24478m(r0, r9, r14)
            if (r9 == 0) goto L_0x0175
            int r15 = r28.length()
        L_0x0175:
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            com.google.android.gms.measurement.internal.m4 r2 = r7.f33611q
            r3 = 0
            r1.getClass()
            java.lang.String r1 = "_ev"
            r27 = r2
            r28 = r3
            r29 = r4
            r30 = r1
            r31 = r0
            r32 = r15
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r27, r28, r29, r30, r31, r32)
            return
        L_0x0195:
            com.google.android.gms.internal.measurement.ua r1 = com.google.android.gms.internal.measurement.C14836ua.f33116c
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.va> r1 = r1.f33117b
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.va r1 = (com.google.android.gms.internal.measurement.C14848va) r1
            r1.zza()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C14959e2.f33438w0
            boolean r1 = r1.mo51973p(r13, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01da
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.v5 r1 = r1.mo52332t()
            com.google.android.gms.measurement.internal.p5 r1 = r1.mo52348n(r15)
            if (r1 == 0) goto L_0x01cf
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01cf
            r1.f33752d = r14
        L_0x01cf:
            if (r32 == 0) goto L_0x01d5
            if (r34 != 0) goto L_0x01d5
            r3 = r14
            goto L_0x01d6
        L_0x01d5:
            r3 = r15
        L_0x01d6:
            com.google.android.gms.measurement.internal.C15018k7.m24481s(r1, r12, r3)
            goto L_0x0201
        L_0x01da:
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.v5 r1 = r1.mo52332t()
            com.google.android.gms.measurement.internal.p5 r1 = r1.mo52348n(r15)
            if (r1 == 0) goto L_0x01f7
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01f7
            r1.f33752d = r14
        L_0x01f7:
            if (r32 == 0) goto L_0x01fd
            if (r34 != 0) goto L_0x01fd
            r3 = r14
            goto L_0x01fe
        L_0x01fd:
            r3 = r15
        L_0x01fe:
            com.google.android.gms.measurement.internal.C15018k7.m24481s(r1, r12, r3)
        L_0x0201:
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C15018k7.m24469R(r28)
            if (r32 == 0) goto L_0x026b
            androidx.compose.runtime.j1 r4 = r7.f33599e
            if (r4 == 0) goto L_0x026b
            if (r3 != 0) goto L_0x026b
            if (r1 == 0) goto L_0x0218
            r16 = r14
            goto L_0x026d
        L_0x0218:
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33731n
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.j2 r1 = r1.f33884n
            java.lang.String r1 = r1.mo52142d(r9)
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.j2 r2 = r2.f33884n
            java.lang.String r2 = r2.mo52140b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo52239c(r1, r3, r2)
            androidx.compose.runtime.j1 r0 = r7.f33599e
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            androidx.compose.runtime.j1 r13 = r7.f33599e
            r13.getClass()
            java.lang.Object r0 = r13.f2932b     // Catch:{ RemoteException -> 0x0256 }
            r1 = r0
            com.google.android.gms.internal.measurement.zzci r1 = (com.google.android.gms.internal.measurement.zzci) r1     // Catch:{ RemoteException -> 0x0256 }
            r2 = r27
            r3 = r28
            r4 = r31
            r5 = r29
            r1.zze(r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x0256 }
            goto L_0x026a
        L_0x0256:
            r0 = move-exception
            java.lang.Object r1 = r13.f2933c
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r1
            com.google.android.gms.measurement.internal.u3 r1 = r1.zza
            if (r1 == 0) goto L_0x026a
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33727j
            java.lang.String r2 = "Event interceptor threw exception"
            r1.mo52238b(r0, r2)
        L_0x026a:
            return
        L_0x026b:
            r16 = r1
        L_0x026d:
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            boolean r1 = r1.mo52322g()
            if (r1 == 0) goto L_0x05ff
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            int r1 = r1.mo52206c0(r9)
            if (r1 == 0) goto L_0x02d9
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33726i
            com.google.android.gms.measurement.internal.o4 r3 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo52238b(r3, r4)
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.k7 r2 = r2.mo52335w()
            com.google.android.gms.measurement.internal.o4 r3 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            r3.getClass()
            r2.getClass()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C15018k7.m24478m(r0, r9, r14)
            if (r9 == 0) goto L_0x02ba
            int r15 = r28.length()
        L_0x02ba:
            com.google.android.gms.measurement.internal.o4 r2 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.k7 r2 = r2.mo52335w()
            com.google.android.gms.measurement.internal.m4 r3 = r7.f33611q
            r2.getClass()
            java.lang.String r2 = "_ev"
            r27 = r3
            r28 = r35
            r29 = r1
            r30 = r2
            r31 = r0
            r32 = r15
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r27, r28, r29, r30, r31, r32)
            return
        L_0x02d9:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = com.google.android.gms.common.util.CollectionUtils.listOf((T[]) r1)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            r2 = r35
            r3 = r28
            r4 = r31
            r6 = r34
            android.os.Bundle r12 = r1.mo52216l0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.v5 r1 = r1.mo52332t()
            com.google.android.gms.measurement.internal.p5 r1 = r1.mo52348n(r15)
            java.lang.String r6 = "_ae"
            if (r1 == 0) goto L_0x0348
            boolean r1 = r6.equals(r9)
            if (r1 == 0) goto L_0x0348
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.v6 r1 = r1.mo52334v()
            com.google.android.gms.measurement.internal.t6 r1 = r1.f33935f
            com.google.android.gms.measurement.internal.v6 r2 = r1.f33858d
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.common.util.Clock r2 = r2.f33885o
            long r14 = r2.elapsedRealtime()
            long r3 = r1.f33856b
            long r2 = r14 - r3
            r1.f33856b = r14
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0348
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            r1.mo52219q(r12, r2)
        L_0x0348:
            com.google.android.gms.internal.measurement.a9 r1 = com.google.android.gms.internal.measurement.C14578a9.f32745c
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.b9> r1 = r1.f32746b
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.b9 r1 = (com.google.android.gms.internal.measurement.C14591b9) r1
            r1.zza()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C14959e2.f33408h0
            boolean r1 = r1.mo51973p(r13, r2)
            if (r1 == 0) goto L_0x03e6
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x03c1
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x03c1
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r2)
            if (r3 == 0) goto L_0x0389
            r2 = r13
            goto L_0x038f
        L_0x0389:
            if (r2 == 0) goto L_0x038f
            java.lang.String r2 = r2.trim()
        L_0x038f:
            com.google.android.gms.measurement.internal.o4 r3 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.c3 r3 = r3.mo52330q()
            com.google.android.gms.measurement.internal.a3 r3 = r3.f33315t
            java.lang.String r3 = r3.mo51937a()
            boolean r3 = com.google.android.gms.measurement.internal.C15018k7.m24472U(r2, r3)
            if (r3 != 0) goto L_0x03b1
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo52330q()
            com.google.android.gms.measurement.internal.a3 r1 = r1.f33315t
            r1.mo51938b(r2)
            goto L_0x03e6
        L_0x03b1:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33731n
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo52237a(r1)
            return
        L_0x03c1:
            boolean r1 = r6.equals(r9)
            if (r1 == 0) goto L_0x03e6
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo52330q()
            com.google.android.gms.measurement.internal.a3 r1 = r1.f33315t
            java.lang.String r1 = r1.mo51937a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x03e6
            r12.putString(r2, r1)
        L_0x03e6:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo52330q()
            com.google.android.gms.measurement.internal.y2 r1 = r1.f33310o
            long r1 = r1.mo52363a()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0472
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo52330q()
            boolean r1 = r1.mo51959q(r10)
            if (r1 == 0) goto L_0x0472
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo52330q()
            com.google.android.gms.measurement.internal.w2 r1 = r1.f33312q
            boolean r1 = r1.mo52354b()
            if (r1 == 0) goto L_0x0472
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo52237a(r2)
            r5 = 0
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.common.util.Clock r1 = r1.f33885o
            long r17 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r15 = "_sid"
            r1 = r26
            r31 = r14
            r13 = r3
            r3 = r17
            r19 = r6
            r6 = r15
            r1.mo52160v(r2, r3, r5, r6)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.common.util.Clock r1 = r1.f33885o
            long r3 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r6 = "_sno"
            r1 = r26
            r1.mo52160v(r2, r3, r5, r6)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.common.util.Clock r1 = r1.f33885o
            long r3 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r6 = "_se"
            r1 = r26
            r1.mo52160v(r2, r3, r5, r6)
            goto L_0x0477
        L_0x0472:
            r19 = r6
            r31 = r14
            r13 = r3
        L_0x0477:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r13)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x04a0
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo52237a(r2)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.v6 r1 = r1.mo52334v()
            com.google.android.gms.measurement.internal.u6 r1 = r1.f33934e
            r2 = 1
            r1.mo52339b(r10, r2)
        L_0x04a0:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x04b1:
            if (r3 >= r2) goto L_0x0501
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x04fe
            com.google.android.gms.measurement.internal.o4 r5 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            r5.mo52335w()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x04d3
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x04f9
        L_0x04d3:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x04e4
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x04f9
        L_0x04e4:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x04f8
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x04f9
        L_0x04f8:
            r13 = 0
        L_0x04f9:
            if (r13 == 0) goto L_0x04fe
            r12.putParcelableArray(r4, r13)
        L_0x04fe:
            int r3 = r3 + 1
            goto L_0x04b1
        L_0x0501:
            r12 = 0
        L_0x0502:
            int r1 = r31.size()
            if (r12 >= r1) goto L_0x05c9
            r13 = r31
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0515
            java.lang.String r2 = "_ep"
            goto L_0x0516
        L_0x0515:
            r2 = r9
        L_0x0516:
            r1.putString(r0, r8)
            if (r33 == 0) goto L_0x0527
            com.google.android.gms.measurement.internal.o4 r3 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.k7 r3 = r3.mo52335w()
            android.os.Bundle r1 = r3.mo52214k0(r1)
        L_0x0527:
            r14 = r1
            com.google.android.gms.measurement.internal.zzat r15 = new com.google.android.gms.measurement.internal.zzat
            com.google.android.gms.measurement.internal.zzar r3 = new com.google.android.gms.measurement.internal.zzar
            r3.<init>(r14)
            r1 = r15
            r4 = r27
            r5 = r29
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.i6 r1 = r1.mo52333u()
            r1.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            r1.mo51995g()
            r1.mo51946h()
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            r2.getClass()
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.i2 r2 = r2.mo52328o()
            r2.getClass()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            com.google.android.gms.measurement.internal.zzau.zza(r15, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L_0x0584
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33725h
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.mo52237a(r3)
            r2 = 1
            r23 = 0
            goto L_0x058c
        L_0x0584:
            r3 = 0
            boolean r6 = r2.mo52121n(r3, r4)
            r23 = r6
            r2 = 1
        L_0x058c:
            com.google.android.gms.measurement.internal.zzp r22 = r1.mo52130p(r2)
            com.google.android.gms.measurement.internal.b5 r2 = new com.google.android.gms.measurement.internal.b5
            r20 = r2
            r21 = r1
            r24 = r15
            r25 = r35
            r20.<init>((com.google.android.gms.measurement.internal.C14999i6) r21, (com.google.android.gms.measurement.internal.zzp) r22, (boolean) r23, (com.google.android.gms.measurement.internal.zzat) r24, (java.lang.String) r25)
            r1.mo52133s(r2)
            if (r16 != 0) goto L_0x05c3
            java.util.concurrent.CopyOnWriteArraySet r1 = r7.f33600f
            java.util.Iterator r15 = r1.iterator()
        L_0x05a8:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x05c3
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.p4 r1 = (com.google.android.gms.measurement.internal.C15060p4) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r27
            r3 = r28
            r5 = r29
            r1.mo52234a(r2, r3, r4, r5)
            goto L_0x05a8
        L_0x05c3:
            int r12 = r12 + 1
            r31 = r13
            goto L_0x0502
        L_0x05c9:
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.v5 r0 = r0.mo52332t()
            r1 = 0
            com.google.android.gms.measurement.internal.p5 r0 = r0.mo52348n(r1)
            if (r0 == 0) goto L_0x05ff
            r0 = r19
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x05ff
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.v6 r0 = r0.mo52334v()
            com.google.android.gms.measurement.internal.o4 r1 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.common.util.Clock r1 = r1.f33885o
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.t6 r0 = r0.f33935f
            r3 = 1
            r0.mo52319a(r1, r3, r3)
        L_0x05ff:
            return
        L_0x0600:
            com.google.android.gms.measurement.internal.o4 r0 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33731n
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo52237a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15007j5.mo52153o(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: p */
    public final void mo52154p(long j, boolean z) {
        mo51995g();
        mo51946h();
        ((C15103u3) this.f33681b).mo52016b().f33731n.mo52237a("Resetting analytics data (FE)");
        C15114v6 v = ((C15103u3) this.f33681b).mo52334v();
        v.mo51995g();
        C15098t6 t6Var = v.f33935f;
        t6Var.f33857c.mo52168a();
        t6Var.f33855a = 0;
        t6Var.f33856b = 0;
        boolean e = ((C15103u3) this.f33681b).mo52321e();
        C14942c3 q = ((C15103u3) this.f33681b).mo52330q();
        q.f33301f.mo52364b(j);
        if (!TextUtils.isEmpty(((C15103u3) q.f33681b).mo52330q().f33315t.mo51937a())) {
            q.f33315t.mo51938b((String) null);
        }
        C14695j9 j9Var = C14695j9.f32897c;
        j9Var.f32898b.zza().zza();
        C14947d dVar = ((C15103u3) q.f33681b).f33878h;
        C14950d2<Boolean> d2Var = C14959e2.f33410i0;
        if (dVar.mo51973p((String) null, d2Var)) {
            q.f33310o.mo52364b(0);
        }
        if (!((C15103u3) q.f33681b).f33878h.mo51975r()) {
            q.mo51958p(!e);
        }
        q.f33316u.mo51938b((String) null);
        q.f33317v.mo52364b(0);
        q.f33318w.mo52359b((Bundle) null);
        if (z) {
            C14999i6 u = ((C15103u3) this.f33681b).mo52333u();
            u.mo51995g();
            u.mo51946h();
            zzp p = u.mo52130p(false);
            ((C15103u3) u.f33681b).getClass();
            ((C15103u3) u.f33681b).mo52328o().mo52119l();
            u.mo52133s(new C18105j((Object) u, (Object) p, 3));
        }
        j9Var.f32898b.zza().zza();
        if (((C15103u3) this.f33681b).f33878h.mo51973p((String) null, d2Var)) {
            ((C15103u3) this.f33681b).mo52334v().f33934e.mo52338a();
        }
        this.f33610p = !e;
    }

    /* renamed from: q */
    public final void mo52155q(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52237a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        C19421p.m32946m0(bundle2, "app_id", cls2, (Object) null);
        C19421p.m32946m0(bundle2, CartRefreshDelegate.ARG_ORIGIN, cls2, (Object) null);
        C19421p.m32946m0(bundle2, "name", cls2, (Object) null);
        C19421p.m32946m0(bundle2, "value", Object.class, (Object) null);
        C19421p.m32946m0(bundle2, "trigger_event_name", cls2, (Object) null);
        C19421p.m32946m0(bundle2, "trigger_timeout", cls, 0L);
        C19421p.m32946m0(bundle2, "timed_out_event_name", cls2, (Object) null);
        C19421p.m32946m0(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        C19421p.m32946m0(bundle2, "triggered_event_name", cls2, (Object) null);
        C19421p.m32946m0(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        C19421p.m32946m0(bundle2, "time_to_live", cls, 0L);
        C19421p.m32946m0(bundle2, "expired_event_name", cls2, (Object) null);
        C19421p.m32946m0(bundle2, "expired_event_params", Bundle.class, (Object) null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(CartRefreshDelegate.ARG_ORIGIN));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (((C15103u3) this.f33681b).mo52335w().mo52209f0(string) != 0) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(((C15103u3) this.f33681b).f33884n.mo52144f(string), "Invalid conditional user property name");
        } else if (((C15103u3) this.f33681b).mo52335w().mo52205b0(obj, string) == 0) {
            Object l = ((C15103u3) this.f33681b).mo52335w().mo52215l(obj, string);
            if (l == null) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(((C15103u3) this.f33681b).f33884n.mo52144f(string), "Unable to normalize conditional user property value", obj);
                return;
            }
            C19421p.m32950o0(bundle2, l);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                ((C15103u3) this.f33681b).getClass();
                if (j2 > 15552000000L || j2 < 1) {
                    ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(((C15103u3) this.f33681b).f33884n.mo52144f(string), "Invalid conditional user property timeout", Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            ((C15103u3) this.f33681b).getClass();
            if (j3 > 15552000000L || j3 < 1) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(((C15103u3) this.f33681b).f33884n.mo52144f(string), "Invalid conditional user property time to live", Long.valueOf(j3));
            } else {
                ((C15103u3) this.f33681b).mo52015a().mo52308o(new C15128x4(0, (Object) this, (Object) bundle2));
            }
        } else {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(((C15103u3) this.f33681b).f33884n.mo52144f(string), "Invalid conditional user property value", obj);
        }
    }

    /* renamed from: r */
    public final void mo52156r(Bundle bundle, int i, long j) {
        mo51946h();
        String string = bundle.getString("ad_storage");
        if ((string == null || C14956e.m24277h(string) != null) && ((string = bundle.getString("analytics_storage")) == null || C14956e.m24277h(string) != null)) {
            string = null;
        }
        if (string != null) {
            ((C15103u3) this.f33681b).mo52016b().f33729l.mo52238b(string, "Ignoring invalid consent setting");
            ((C15103u3) this.f33681b).mo52016b().f33729l.mo52237a("Valid consent values are 'granted', 'denied'");
        }
        mo52157s(C14956e.m24274a(bundle), i, j);
    }

    /* renamed from: s */
    public final void mo52157s(C14956e eVar, int i, long j) {
        boolean z;
        boolean z2;
        C14956e eVar2;
        boolean z3;
        mo51946h();
        if (i != -10 && eVar.f33363a == null && eVar.f33364b == null) {
            ((C15103u3) this.f33681b).mo52016b().f33729l.mo52237a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f33603i) {
            try {
                z = false;
                if (i <= this.f33605k) {
                    C14956e eVar3 = this.f33604j;
                    Boolean bool = eVar.f33363a;
                    Boolean bool2 = Boolean.FALSE;
                    z3 = (bool == bool2 && eVar3.f33363a != bool2) || (eVar.f33364b == bool2 && eVar3.f33364b != bool2);
                    if (eVar.mo51987f() && !this.f33604j.mo51987f()) {
                        z = true;
                    }
                    C14956e eVar4 = this.f33604j;
                    Boolean bool3 = eVar.f33363a;
                    if (bool3 == null) {
                        bool3 = eVar4.f33363a;
                    }
                    Boolean bool4 = eVar.f33364b;
                    if (bool4 == null) {
                        bool4 = eVar4.f33364b;
                    }
                    C14956e eVar5 = new C14956e(bool3, bool4);
                    this.f33604j = eVar5;
                    this.f33605k = i;
                    z2 = z;
                    z = true;
                    eVar2 = eVar5;
                } else {
                    eVar2 = eVar;
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z) {
            ((C15103u3) this.f33681b).mo52016b().f33730m.mo52238b(eVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f33606l.getAndIncrement();
        if (z3) {
            this.f33602h.set((Object) null);
            ((C15103u3) this.f33681b).mo52015a().mo52309p(new C14953d5(this, eVar2, j, i, andIncrement, z2));
        } else if (i == 30 || i == -10) {
            ((C15103u3) this.f33681b).mo52015a().mo52309p(new C14962e5(this, eVar2, i, andIncrement, z2));
        } else {
            ((C15103u3) this.f33681b).mo52015a().mo52308o(new C14971f5(this, eVar2, i, andIncrement, z2));
        }
    }

    /* renamed from: t */
    public final void mo52158t(C14956e eVar) {
        mo51995g();
        boolean z = (eVar.mo51987f() && eVar.mo51985e()) || ((C15103u3) this.f33681b).mo52333u().mo52128n();
        C15103u3 u3Var = (C15103u3) this.f33681b;
        u3Var.mo52015a().mo51995g();
        if (z != u3Var.f33868E) {
            C15103u3 u3Var2 = (C15103u3) this.f33681b;
            u3Var2.mo52015a().mo51995g();
            u3Var2.f33868E = z;
            C14942c3 q = ((C15103u3) this.f33681b).mo52330q();
            C15051o4 o4Var = q.f33681b;
            q.mo51995g();
            Boolean valueOf = q.mo51953k().contains("measurement_enabled_from_api") ? Boolean.valueOf(q.mo51953k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                mo52162x(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52159u(java.lang.String r10, java.lang.String r11, java.lang.Object r12, boolean r13, long r14) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0004
            java.lang.String r10 = "app"
        L_0x0004:
            r2 = r10
            r10 = 6
            r0 = 0
            r1 = 24
            if (r13 == 0) goto L_0x0018
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.k7 r10 = r10.mo52335w()
            int r10 = r10.mo52209f0(r11)
            goto L_0x0042
        L_0x0018:
            com.google.android.gms.measurement.internal.o4 r13 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13
            com.google.android.gms.measurement.internal.k7 r13 = r13.mo52335w()
            java.lang.String r3 = "user property"
            boolean r4 = r13.mo52199M(r3, r11)
            if (r4 != 0) goto L_0x0029
            goto L_0x0042
        L_0x0029:
            java.lang.String[] r4 = kotlinx.coroutines.C19543e0.f43494g
            r5 = 0
            boolean r4 = r13.mo52194H(r3, r4, r5, r11)
            if (r4 != 0) goto L_0x0035
            r10 = 15
            goto L_0x0042
        L_0x0035:
            com.google.android.gms.measurement.internal.o4 r4 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            r4.getClass()
            boolean r13 = r13.mo52193G(r1, r3, r11)
            if (r13 != 0) goto L_0x0044
        L_0x0042:
            r5 = r10
            goto L_0x0045
        L_0x0044:
            r5 = r0
        L_0x0045:
            r10 = 1
            if (r5 == 0) goto L_0x0079
            com.google.android.gms.measurement.internal.o4 r12 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12
            com.google.android.gms.measurement.internal.k7 r12 = r12.mo52335w()
            com.google.android.gms.measurement.internal.o4 r13 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13
            r13.getClass()
            r12.getClass()
            java.lang.String r7 = com.google.android.gms.measurement.internal.C15018k7.m24478m(r1, r11, r10)
            if (r11 == 0) goto L_0x0064
            int r0 = r11.length()
        L_0x0064:
            r8 = r0
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.k7 r10 = r10.mo52335w()
            com.google.android.gms.measurement.internal.m4 r3 = r9.f33611q
            r4 = 0
            r10.getClass()
            java.lang.String r6 = "_ev"
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r3, r4, r5, r6, r7, r8)
            return
        L_0x0079:
            if (r12 == 0) goto L_0x00e7
            com.google.android.gms.measurement.internal.o4 r13 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13
            com.google.android.gms.measurement.internal.k7 r13 = r13.mo52335w()
            int r5 = r13.mo52205b0(r12, r11)
            if (r5 == 0) goto L_0x00c4
            com.google.android.gms.measurement.internal.o4 r13 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13
            com.google.android.gms.measurement.internal.k7 r13 = r13.mo52335w()
            com.google.android.gms.measurement.internal.o4 r14 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r14 = (com.google.android.gms.measurement.internal.C15103u3) r14
            r14.getClass()
            r13.getClass()
            java.lang.String r7 = com.google.android.gms.measurement.internal.C15018k7.m24478m(r1, r11, r10)
            boolean r10 = r12 instanceof java.lang.String
            if (r10 != 0) goto L_0x00a7
            boolean r10 = r12 instanceof java.lang.CharSequence
            if (r10 == 0) goto L_0x00af
        L_0x00a7:
            java.lang.String r10 = r12.toString()
            int r0 = r10.length()
        L_0x00af:
            r8 = r0
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.k7 r10 = r10.mo52335w()
            com.google.android.gms.measurement.internal.m4 r3 = r9.f33611q
            r4 = 0
            r10.getClass()
            java.lang.String r6 = "_ev"
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r3, r4, r5, r6, r7, r8)
            return
        L_0x00c4:
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.k7 r10 = r10.mo52335w()
            java.lang.Object r4 = r10.mo52215l(r12, r11)
            if (r4 == 0) goto L_0x00e6
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.s3 r10 = r10.mo52015a()
            com.google.android.gms.measurement.internal.w4 r12 = new com.google.android.gms.measurement.internal.w4
            r0 = r12
            r1 = r9
            r3 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.mo52308o(r12)
        L_0x00e6:
            return
        L_0x00e7:
            r4 = 0
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.s3 r10 = r10.mo52015a()
            com.google.android.gms.measurement.internal.w4 r12 = new com.google.android.gms.measurement.internal.w4
            r0 = r12
            r1 = r9
            r3 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.mo52308o(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15007j5.mo52159u(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52160v(java.lang.String r9, long r10, java.lang.Object r12, java.lang.String r13) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r8.mo51995g()
            r8.mo51946h()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r13)
            r1 = 1
            if (r0 == 0) goto L_0x0065
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r12 = r0.toLowerCase(r12)
            java.lang.String r13 = "false"
            boolean r12 = r13.equals(r12)
            r2 = 1
            if (r1 == r12) goto L_0x0035
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = r2
        L_0x0036:
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            com.google.android.gms.measurement.internal.a3 r0 = r0.f33308m
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r13 = "true"
        L_0x004e:
            r0.mo51938b(r13)
            goto L_0x0063
        L_0x0052:
            if (r12 != 0) goto L_0x0065
            com.google.android.gms.measurement.internal.o4 r13 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13
            com.google.android.gms.measurement.internal.c3 r13 = r13.mo52330q()
            com.google.android.gms.measurement.internal.a3 r13 = r13.f33308m
            java.lang.String r0 = "unset"
            r13.mo51938b(r0)
        L_0x0063:
            java.lang.String r13 = "_npa"
        L_0x0065:
            r6 = r12
            r3 = r13
            com.google.android.gms.measurement.internal.o4 r12 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12
            boolean r12 = r12.mo52321e()
            if (r12 != 0) goto L_0x0081
            com.google.android.gms.measurement.internal.o4 r9 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9
            com.google.android.gms.measurement.internal.o2 r9 = r9.mo52016b()
            com.google.android.gms.measurement.internal.m2 r9 = r9.f33732o
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo52237a(r10)
            return
        L_0x0081:
            com.google.android.gms.measurement.internal.o4 r12 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12
            boolean r12 = r12.mo52322g()
            if (r12 != 0) goto L_0x008c
            return
        L_0x008c:
            com.google.android.gms.measurement.internal.zzkv r12 = new com.google.android.gms.measurement.internal.zzkv
            r2 = r12
            r4 = r10
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.o4 r9 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9
            com.google.android.gms.measurement.internal.i6 r9 = r9.mo52333u()
            r9.mo51995g()
            r9.mo51946h()
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            r10.getClass()
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.i2 r10 = r10.mo52328o()
            r10.getClass()
            android.os.Parcel r11 = android.os.Parcel.obtain()
            r13 = 0
            com.google.android.gms.measurement.internal.zzkw.zza(r12, r11, r13)
            byte[] r0 = r11.marshall()
            r11.recycle()
            int r11 = r0.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r11 <= r2) goto L_0x00d8
            com.google.android.gms.measurement.internal.o4 r10 = r10.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.o2 r10 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r10 = r10.f33725h
            java.lang.String r11 = "User property too long for local database. Sending directly to service"
            r10.mo52237a(r11)
            goto L_0x00dc
        L_0x00d8:
            boolean r13 = r10.mo52121n(r1, r0)
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzp r10 = r9.mo52130p(r1)
            com.google.android.gms.measurement.internal.x5 r11 = new com.google.android.gms.measurement.internal.x5
            r11.<init>(r9, r10, r13, r12)
            r9.mo52133s(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15007j5.mo52160v(java.lang.String, long, java.lang.Object, java.lang.String):void");
    }

    /* renamed from: w */
    public final void mo52161w(Bundle bundle, long j) {
        C14617d9.f32811c.f32812b.zza().zza();
        if (!((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33422o0) || TextUtils.isEmpty(((C15103u3) this.f33681b).mo52327n().mo52047m())) {
            mo52156r(bundle, 0, j);
        } else {
            ((C15103u3) this.f33681b).mo52016b().f33729l.mo52237a("Using developer consent only; google app id found");
        }
    }

    /* renamed from: x */
    public final void mo52162x(Boolean bool, boolean z) {
        mo51995g();
        mo51946h();
        ((C15103u3) this.f33681b).mo52016b().f33731n.mo52238b(bool, "Setting app measurement enabled (FE)");
        ((C15103u3) this.f33681b).mo52330q().mo51957o(bool);
        if (z) {
            C14942c3 q = ((C15103u3) this.f33681b).mo52330q();
            C15051o4 o4Var = q.f33681b;
            q.mo51995g();
            SharedPreferences.Editor edit = q.mo51953k().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        C15103u3 u3Var = (C15103u3) this.f33681b;
        u3Var.mo52015a().mo51995g();
        if (u3Var.f33868E || (bool != null && !bool.booleanValue())) {
            mo52163y();
        }
    }

    /* renamed from: y */
    public final void mo52163y() {
        mo51995g();
        String a = ((C15103u3) this.f33681b).mo52330q().f33308m.mo51937a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo52160v("app", ((C15103u3) this.f33681b).f33885o.currentTimeMillis(), (Object) null, "_npa");
            } else {
                mo52160v("app", ((C15103u3) this.f33681b).f33885o.currentTimeMillis(), Long.valueOf(true != "true".equals(a) ? 0 : 1), "_npa");
            }
        }
        if (!((C15103u3) this.f33681b).mo52321e() || !this.f33610p) {
            ((C15103u3) this.f33681b).mo52016b().f33731n.mo52237a("Updating Scion state (FE)");
            C14999i6 u = ((C15103u3) this.f33681b).mo52333u();
            u.mo51995g();
            u.mo51946h();
            u.mo52133s(new C15144z4(u, u.mo52130p(true), 1));
            return;
        }
        ((C15103u3) this.f33681b).mo52016b().f33731n.mo52237a("Recording app launch after enabling measurement for the first time (FE)");
        mo52147B();
        C14695j9.f32897c.f32898b.zza().zza();
        if (((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33410i0)) {
            ((C15103u3) this.f33681b).mo52334v().f33934e.mo52338a();
        }
        ((C15103u3) this.f33681b).mo52015a().mo52308o(new C15096t4(this, 0));
    }

    /* renamed from: z */
    public final String mo52164z() {
        return this.f33602h.get();
    }
}
