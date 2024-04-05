package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.C1353o0;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.C14572a3;
import com.google.android.gms.internal.measurement.C14636f2;
import com.google.android.gms.internal.measurement.C14689j3;
import com.google.android.gms.internal.measurement.C14702k3;
import com.google.android.gms.internal.measurement.C14722la;
import com.google.android.gms.internal.measurement.C14766p2;
import com.google.android.gms.internal.measurement.C14779q2;
import com.google.android.gms.internal.measurement.C14811s9;
import com.google.android.gms.internal.measurement.C14816t2;
import com.google.android.gms.internal.measurement.C14828u2;
import com.google.android.gms.internal.measurement.C14836ua;
import com.google.android.gms.internal.measurement.C14865x3;
import com.google.android.gms.internal.measurement.C14888z2;
import com.google.android.gms.internal.measurement.C14893z7;
import com.google.android.gms.internal.measurement.zzcl;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p193o.C7494b;
import p604kj.C18104i;
import p772tq.C20203a;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
public final class C14973f7 implements C15051o4 {

    /* renamed from: D */
    public static volatile C14973f7 f33482D;

    /* renamed from: A */
    public long f33483A;

    /* renamed from: B */
    public final HashMap f33484B;

    /* renamed from: C */
    public final C1353o0 f33485C = new C1353o0((Object) this);

    /* renamed from: b */
    public final C15041n3 f33486b;

    /* renamed from: c */
    public final C15094t2 f33487c;

    /* renamed from: d */
    public C14983h f33488d;

    /* renamed from: e */
    public C15110v2 f33489e;

    /* renamed from: f */
    public C15138y6 f33490f;

    /* renamed from: g */
    public C15090s7 f33491g;

    /* renamed from: h */
    public final C14991h7 f33492h;

    /* renamed from: i */
    public C15052o5 f33493i;

    /* renamed from: j */
    public C15008j6 f33494j;

    /* renamed from: k */
    public final C14937b7 f33495k;

    /* renamed from: l */
    public C14960e3 f33496l;

    /* renamed from: m */
    public final C15103u3 f33497m;

    /* renamed from: n */
    public boolean f33498n = false;

    /* renamed from: o */
    public boolean f33499o;
    @VisibleForTesting

    /* renamed from: p */
    public long f33500p;

    /* renamed from: q */
    public ArrayList f33501q;

    /* renamed from: r */
    public int f33502r;

    /* renamed from: s */
    public int f33503s;

    /* renamed from: t */
    public boolean f33504t;

    /* renamed from: u */
    public boolean f33505u;

    /* renamed from: v */
    public boolean f33506v;

    /* renamed from: w */
    public FileLock f33507w;

    /* renamed from: x */
    public FileChannel f33508x;

    /* renamed from: y */
    public ArrayList f33509y;

    /* renamed from: z */
    public ArrayList f33510z;

    public C14973f7(C14982g7 g7Var) {
        Preconditions.checkNotNull(g7Var);
        this.f33497m = C15103u3.m24641r(g7Var.f33538a, (zzcl) null, (Long) null);
        this.f33483A = -1;
        this.f33495k = new C14937b7(this);
        C14991h7 h7Var = new C14991h7(this);
        h7Var.mo51943i();
        this.f33492h = h7Var;
        C15094t2 t2Var = new C15094t2(this);
        t2Var.mo51943i();
        this.f33487c = t2Var;
        C15041n3 n3Var = new C15041n3(this);
        n3Var.mo51943i();
        this.f33486b = n3Var;
        this.f33484B = new HashMap();
        mo52015a().mo52308o(new C18104i(4, this, g7Var));
    }

    /* renamed from: I */
    public static final void m24287I(C14928a7 a7Var) {
        if (a7Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!a7Var.f33275d) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(a7Var.getClass())));
        }
    }

    /* renamed from: O */
    public static C14973f7 m24288O(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f33482D == null) {
            synchronized (C14973f7.class) {
                if (f33482D == null) {
                    f33482D = new C14973f7((C14982g7) Preconditions.checkNotNull(new C14982g7(context)));
                }
            }
        }
        return f33482D;
    }

    @VisibleForTesting
    /* renamed from: v */
    public static final void m24289v(C14766p2 p2Var, int i, String str) {
        List<C14828u2> w = p2Var.mo50774w();
        int i2 = 0;
        while (i2 < w.size()) {
            if (!"_err".equals(w.get(i2).mo50887x())) {
                i2++;
            } else {
                return;
            }
        }
        C14816t2 v = C14828u2.m23989v();
        v.mo50855q("_err");
        v.mo50854p(Long.valueOf((long) i).longValue());
        C14828u2 u2Var = (C14828u2) v.mo50807h();
        C14816t2 v2 = C14828u2.m23989v();
        v2.mo50855q("_ev");
        v2.mo50856r(str);
        C14828u2 u2Var2 = (C14828u2) v2.mo50807h();
        if (p2Var.f33059d) {
            p2Var.mo50809j();
            p2Var.f33059d = false;
        }
        C14779q2.m23873B((C14779q2) p2Var.f33058c, u2Var);
        if (p2Var.f33059d) {
            p2Var.mo50809j();
            p2Var.f33059d = false;
        }
        C14779q2.m23873B((C14779q2) p2Var.f33058c, u2Var2);
    }

    @VisibleForTesting
    /* renamed from: w */
    public static final void m24290w(C14766p2 p2Var, String str) {
        List<C14828u2> w = p2Var.mo50774w();
        for (int i = 0; i < w.size(); i++) {
            if (str.equals(w.get(i).mo50887x())) {
                p2Var.mo50769r(i);
                return;
            }
        }
    }

    /* renamed from: A */
    public final void mo51999A() {
        mo52015a().mo51995g();
        if (this.f33504t || this.f33505u || this.f33506v) {
            mo52016b().f33732o.mo52240d(Boolean.valueOf(this.f33504t), Boolean.valueOf(this.f33505u), Boolean.valueOf(this.f33506v), "Not stopping services. fetch, network, upload");
            return;
        }
        mo52016b().f33732o.mo52237a("Stopping uploading service(s)");
        ArrayList arrayList = this.f33501q;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ((List) Preconditions.checkNotNull(this.f33501q)).clear();
        }
    }

    @VisibleForTesting
    /* renamed from: B */
    public final void mo52000B(C14888z2 z2Var, long j, boolean z) {
        String str = true != z ? "_lte" : "_se";
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        C15000i7 H = hVar.mo52058H(z2Var.mo51000s(), str);
        C15000i7 i7Var = (H == null || H.f33584e == null) ? new C15000i7(z2Var.mo51000s(), "auto", str, mo52017c().currentTimeMillis(), Long.valueOf(j)) : new C15000i7(z2Var.mo51000s(), "auto", str, mo52017c().currentTimeMillis(), Long.valueOf(((Long) H.f33584e).longValue() + j));
        C14689j3 u = C14702k3.m23670u();
        u.mo50604p(str);
        u.mo50605q(mo52017c().currentTimeMillis());
        u.mo50603o(((Long) i7Var.f33584e).longValue());
        C14702k3 k3Var = (C14702k3) u.mo50807h();
        int u2 = C14991h7.m24388u(z2Var, str);
        if (u2 >= 0) {
            if (z2Var.f33059d) {
                z2Var.mo50809j();
                z2Var.f33059d = false;
            }
            C14572a3.m23300w0((C14572a3) z2Var.f33058c, u2, k3Var);
        } else {
            if (z2Var.f33059d) {
                z2Var.mo50809j();
                z2Var.f33059d = false;
            }
            C14572a3.m23301x0((C14572a3) z2Var.f33058c, k3Var);
        }
        if (j > 0) {
            C14983h hVar2 = this.f33488d;
            m24287I(hVar2);
            hVar2.mo52078t(i7Var);
            mo52016b().f33732o.mo52239c(true != z ? "lifetime" : "session-scoped", "Updated engagement user property. scope, value", i7Var.f33584e);
        }
    }

    /* renamed from: C */
    public final void mo52001C(C14766p2 p2Var, C14766p2 p2Var2) {
        Preconditions.checkArgument("_e".equals(p2Var.mo50773v()));
        m24287I(this.f33492h);
        C14828u2 l = C14991h7.m24381l((C14779q2) p2Var.mo50807h(), "_et");
        if (l != null && l.mo50880M() && l.mo50886u() > 0) {
            long u = l.mo50886u();
            m24287I(this.f33492h);
            C14828u2 l2 = C14991h7.m24381l((C14779q2) p2Var2.mo50807h(), "_et");
            if (l2 != null && l2.mo50886u() > 0) {
                u += l2.mo50886u();
            }
            m24287I(this.f33492h);
            C14991h7.m24380k(p2Var2, "_et", Long.valueOf(u));
            m24287I(this.f33492h);
            C14991h7.m24380k(p2Var, "_fr", 1L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0339  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52002D() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurementJobService"
            com.google.android.gms.measurement.internal.s3 r2 = r19.mo52015a()
            r2.mo51995g()
            r19.mo52021g()
            long r2 = r1.f33500p
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x004e
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.Clock r6 = r19.mo52017c()
            long r6 = r6.elapsedRealtime()
            long r8 = r1.f33500p
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r2 = r2 - r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.o2 r0 = r19.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.mo52238b(r2, r3)
            com.google.android.gms.measurement.internal.v2 r0 = r19.mo52011N()
            r0.mo52341a()
            com.google.android.gms.measurement.internal.y6 r0 = r1.f33490f
            m24287I(r0)
            r0.mo52368k()
            return
        L_0x004c:
            r1.f33500p = r4
        L_0x004e:
            com.google.android.gms.measurement.internal.u3 r2 = r1.f33497m
            boolean r2 = r2.mo52322g()
            if (r2 == 0) goto L_0x0411
            boolean r2 = r19.mo52005G()
            if (r2 != 0) goto L_0x005e
            goto L_0x0411
        L_0x005e:
            com.google.android.gms.common.util.Clock r2 = r19.mo52017c()
            long r2 = r2.currentTimeMillis()
            r19.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r6 = com.google.android.gms.measurement.internal.C14959e2.f33367A
            r7 = 0
            java.lang.Object r6 = r6.mo51978a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            long r8 = java.lang.Math.max(r4, r8)
            com.google.android.gms.measurement.internal.h r6 = r1.f33488d
            m24287I(r6)
            java.lang.String r10 = "select count(1) > 0 from raw_events where realtime = 1"
            long r10 = r6.mo52081x(r10, r7)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x008b
            r6 = 1
            goto L_0x008c
        L_0x008b:
            r6 = 0
        L_0x008c:
            if (r6 != 0) goto L_0x00a5
            com.google.android.gms.measurement.internal.h r6 = r1.f33488d
            m24287I(r6)
            java.lang.String r12 = "select count(1) > 0 from queue where has_realtime = 1"
            long r12 = r6.mo52081x(r12, r7)
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x009f
            r6 = 1
            goto L_0x00a0
        L_0x009f:
            r6 = 0
        L_0x00a0:
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r6 = 0
            goto L_0x00a6
        L_0x00a5:
            r6 = 1
        L_0x00a6:
            if (r6 == 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.d r12 = r19.mo52008K()
            java.lang.String r13 = "debug.firebase.analytics.app"
            java.lang.String r12 = r12.mo51965h(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x00d4
            java.lang.String r13 = ".none."
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00d4
            r19.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C14959e2.f33435v
            java.lang.Object r12 = r12.mo51978a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto L_0x00fb
        L_0x00d4:
            r19.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C14959e2.f33433u
            java.lang.Object r12 = r12.mo51978a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto L_0x00fb
        L_0x00e8:
            r19.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C14959e2.f33431t
            java.lang.Object r12 = r12.mo51978a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
        L_0x00fb:
            com.google.android.gms.measurement.internal.j6 r14 = r1.f33494j
            com.google.android.gms.measurement.internal.y2 r14 = r14.f33617j
            long r14 = r14.mo52363a()
            com.google.android.gms.measurement.internal.j6 r10 = r1.f33494j
            com.google.android.gms.measurement.internal.y2 r10 = r10.f33618k
            long r16 = r10.mo52363a()
            com.google.android.gms.measurement.internal.h r10 = r1.f33488d
            m24287I(r10)
            java.lang.String r11 = "select max(bundle_end_timestamp) from queue"
            long r10 = r10.mo52082y(r4, r11, r7)
            com.google.android.gms.measurement.internal.h r4 = r1.f33488d
            m24287I(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r18 = r0
            r0 = 0
            long r4 = r4.mo52082y(r0, r5, r7)
            long r4 = java.lang.Math.max(r10, r4)
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0131
            r4 = r19
            goto L_0x01b1
        L_0x0131:
            long r4 = r4 - r2
            long r0 = java.lang.Math.abs(r4)
            long r0 = r2 - r0
            long r14 = r14 - r2
            long r4 = java.lang.Math.abs(r14)
            long r16 = r16 - r2
            long r10 = java.lang.Math.abs(r16)
            long r10 = r2 - r10
            long r2 = r2 - r4
            long r2 = java.lang.Math.max(r2, r10)
            long r8 = r8 + r0
            if (r6 == 0) goto L_0x0159
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0159
            long r4 = java.lang.Math.min(r0, r2)
            long r8 = r4 + r12
        L_0x0159:
            r4 = r19
            com.google.android.gms.measurement.internal.h7 r5 = r4.f33492h
            m24287I(r5)
            boolean r5 = r5.mo52110I(r2, r12)
            if (r5 != 0) goto L_0x0168
            long r2 = r2 + r12
            goto L_0x0169
        L_0x0168:
            r2 = r8
        L_0x0169:
            r5 = 0
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01b3
            r0 = 0
        L_0x0174:
            r19.mo52008K()
            r1 = 20
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r5 = com.google.android.gms.measurement.internal.C14959e2.f33369C
            java.lang.Object r5 = r5.mo51978a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            int r1 = java.lang.Math.min(r1, r5)
            if (r0 >= r1) goto L_0x01b1
            r19.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C14959e2.f33368B
            java.lang.Object r1 = r1.mo51978a(r7)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            r8 = 0
            long r5 = java.lang.Math.max(r8, r5)
            r8 = 1
            long r8 = r8 << r0
            long r5 = r5 * r8
            long r2 = r2 + r5
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x01b3
            int r0 = r0 + 1
            goto L_0x0174
        L_0x01b1:
            r2 = 0
        L_0x01b3:
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x03f6
            com.google.android.gms.measurement.internal.t2 r0 = r4.f33487c
            m24287I(r0)
            boolean r0 = r0.mo52315k()
            if (r0 == 0) goto L_0x0398
            com.google.android.gms.measurement.internal.j6 r0 = r4.f33494j
            com.google.android.gms.measurement.internal.y2 r0 = r0.f33616i
            long r0 = r0.mo52363a()
            r19.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C14959e2.f33429s
            java.lang.Object r5 = r5.mo51978a(r7)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r8 = 0
            long r5 = java.lang.Math.max(r8, r5)
            com.google.android.gms.measurement.internal.h7 r8 = r4.f33492h
            m24287I(r8)
            boolean r8 = r8.mo52110I(r0, r5)
            if (r8 != 0) goto L_0x01f1
            long r0 = r0 + r5
            long r2 = java.lang.Math.max(r2, r0)
        L_0x01f1:
            com.google.android.gms.measurement.internal.v2 r0 = r19.mo52011N()
            r0.mo52341a()
            com.google.android.gms.common.util.Clock r0 = r19.mo52017c()
            long r0 = r0.currentTimeMillis()
            long r2 = r2 - r0
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0229
            r19.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r2 = com.google.android.gms.measurement.internal.C14959e2.f33437w
            java.lang.Object r2 = r2.mo51978a(r7)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r2 = java.lang.Math.max(r0, r2)
            com.google.android.gms.measurement.internal.j6 r0 = r4.f33494j
            com.google.android.gms.measurement.internal.y2 r0 = r0.f33617j
            com.google.android.gms.common.util.Clock r1 = r19.mo52017c()
            long r5 = r1.currentTimeMillis()
            r0.mo52364b(r5)
        L_0x0229:
            com.google.android.gms.measurement.internal.o2 r0 = r19.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = "Upload scheduled in approximately ms"
            r0.mo52238b(r1, r5)
            com.google.android.gms.measurement.internal.y6 r0 = r4.f33490f
            m24287I(r0)
            r0.mo51942h()
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            android.content.Context r1 = r1.f33872b
            boolean r5 = com.google.android.gms.measurement.internal.C15018k7.m24471T(r1)
            if (r5 != 0) goto L_0x0262
            com.google.android.gms.measurement.internal.o4 r5 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33731n
            java.lang.String r6 = "Receiver not registered/enabled"
            r5.mo52237a(r6)
        L_0x0262:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.content.pm.PackageManager r5 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0280 }
            if (r5 != 0) goto L_0x026c
            goto L_0x0280
        L_0x026c:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0280 }
            r8 = r18
            r6.<init>(r1, r8)     // Catch:{ NameNotFoundException -> 0x0282 }
            r1 = 0
            android.content.pm.ServiceInfo r5 = r5.getServiceInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0282 }
            if (r5 == 0) goto L_0x0282
            boolean r1 = r5.enabled     // Catch:{ NameNotFoundException -> 0x0282 }
            if (r1 == 0) goto L_0x0282
            r1 = 1
            goto L_0x0283
        L_0x0280:
            r8 = r18
        L_0x0282:
            r1 = 0
        L_0x0283:
            if (r1 != 0) goto L_0x0294
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33731n
            java.lang.String r5 = "Service not registered/enabled"
            r1.mo52237a(r5)
        L_0x0294:
            r0.mo52368k()
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.String r6 = "Scheduling upload, millis"
            r1.mo52238b(r5, r6)
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.common.util.Clock r1 = r1.f33885o
            r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C14959e2.f33439x
            java.lang.Object r1 = r1.mo51978a(r7)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            r9 = 0
            long r5 = java.lang.Math.max(r9, r5)
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x02e6
            com.google.android.gms.measurement.internal.k r1 = r0.mo52371n()
            long r5 = r1.f33623c
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x02dc
            r1 = 1
            goto L_0x02dd
        L_0x02dc:
            r1 = 0
        L_0x02dd:
            if (r1 != 0) goto L_0x02e6
            com.google.android.gms.measurement.internal.k r1 = r0.mo52371n()
            r1.mo52169c(r2)
        L_0x02e6:
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            com.google.android.gms.measurement.internal.o4 r1 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            android.content.Context r1 = r1.f33872b
            android.content.ComponentName r5 = new android.content.ComponentName
            r5.<init>(r1, r8)
            int r0 = r0.mo52369l()
            android.os.PersistableBundle r6 = new android.os.PersistableBundle
            r6.<init>()
            java.lang.String r7 = "action"
            java.lang.String r8 = "com.google.android.gms.measurement.UPLOAD"
            r6.putString(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            r7.<init>(r0, r5)
            android.app.job.JobInfo$Builder r0 = r7.setMinimumLatency(r2)
            long r2 = r2 + r2
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r2)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r6)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.C14686j0.f32892a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r1.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            r3.getClass()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.C14686j0.f32892a
            if (r0 == 0) goto L_0x0394
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x0339
            goto L_0x0394
        L_0x0339:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.C14686j0.f32893b
            if (r0 == 0) goto L_0x0360
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x0351, InvocationTargetException -> 0x034f }
            java.lang.Object r0 = r0.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x0351, InvocationTargetException -> 0x034f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0351, InvocationTargetException -> 0x034f }
            if (r0 == 0) goto L_0x0360
            int r6 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x0351, InvocationTargetException -> 0x034f }
            goto L_0x0361
        L_0x034f:
            r0 = move-exception
            goto L_0x0352
        L_0x0351:
            r0 = move-exception
        L_0x0352:
            r1 = 6
            java.lang.String r5 = "JobSchedulerCompat"
            boolean r1 = android.util.Log.isLoggable(r5, r1)
            if (r1 == 0) goto L_0x0360
            java.lang.String r1 = "myUserId invocation illegal"
            android.util.Log.e(r5, r1, r0)
        L_0x0360:
            r6 = 0
        L_0x0361:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = "UploadAlarm"
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.C14686j0.f32892a
            if (r5 == 0) goto L_0x0390
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            r8 = 0
            r7[r8] = r2     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            r8 = 1
            r7[r8] = r0     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            r0 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            r7[r0] = r6     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            r0 = 3
            r7[r0] = r1     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            java.lang.Object r0 = r5.invoke(r3, r7)     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            if (r0 == 0) goto L_0x0397
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x038a, InvocationTargetException -> 0x0388 }
            goto L_0x0397
        L_0x0388:
            r0 = move-exception
            goto L_0x038b
        L_0x038a:
            r0 = move-exception
        L_0x038b:
            java.lang.String r5 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r5, r0)
        L_0x0390:
            r3.schedule(r2)
            goto L_0x0397
        L_0x0394:
            r3.schedule(r2)
        L_0x0397:
            return
        L_0x0398:
            com.google.android.gms.measurement.internal.o2 r0 = r19.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r1 = "No network"
            r0.mo52237a(r1)
            com.google.android.gms.measurement.internal.v2 r0 = r19.mo52011N()
            com.google.android.gms.measurement.internal.f7 r1 = r0.f33906a
            r1.mo52021g()
            com.google.android.gms.measurement.internal.f7 r1 = r0.f33906a
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo52015a()
            r1.mo51995g()
            boolean r1 = r0.f33907b
            if (r1 == 0) goto L_0x03ba
            goto L_0x03ed
        L_0x03ba:
            com.google.android.gms.measurement.internal.f7 r1 = r0.f33906a
            com.google.android.gms.measurement.internal.u3 r1 = r1.f33497m
            android.content.Context r1 = r1.f33872b
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            com.google.android.gms.measurement.internal.f7 r1 = r0.f33906a
            com.google.android.gms.measurement.internal.t2 r1 = r1.f33487c
            m24287I(r1)
            boolean r1 = r1.mo52315k()
            r0.f33908c = r1
            com.google.android.gms.measurement.internal.f7 r1 = r0.f33906a
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            boolean r2 = r0.f33908c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "Registering connectivity change receiver. Network connected"
            r1.mo52238b(r2, r3)
            r1 = 1
            r0.f33907b = r1
        L_0x03ed:
            com.google.android.gms.measurement.internal.y6 r0 = r4.f33490f
            m24287I(r0)
            r0.mo52368k()
            return
        L_0x03f6:
            com.google.android.gms.measurement.internal.o2 r0 = r19.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r1 = "Next upload time is 0"
            r0.mo52237a(r1)
            com.google.android.gms.measurement.internal.v2 r0 = r19.mo52011N()
            r0.mo52341a()
            com.google.android.gms.measurement.internal.y6 r0 = r4.f33490f
            m24287I(r0)
            r0.mo52368k()
            return
        L_0x0411:
            r4 = r1
            com.google.android.gms.measurement.internal.o2 r0 = r19.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r1 = "Nothing to upload or uploading impossible"
            r0.mo52237a(r1)
            com.google.android.gms.measurement.internal.v2 r0 = r19.mo52011N()
            r0.mo52341a()
            com.google.android.gms.measurement.internal.y6 r0 = r4.f33490f
            m24287I(r0)
            r0.mo52368k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52002D():void");
    }

    /* renamed from: E */
    public final boolean mo52003E(zzp zzp) {
        C14811s9.m23933a();
        return mo52008K().mo51973p(zzp.zza, C14959e2.f33398c0) ? !TextUtils.isEmpty(zzp.zzb) || !TextUtils.isEmpty(zzp.zzu) || !TextUtils.isEmpty(zzp.zzq) : !TextUtils.isEmpty(zzp.zzb) || !TextUtils.isEmpty(zzp.zzq);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.gms.internal.measurement.z2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v84, resolved type: com.google.android.gms.internal.measurement.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v86, resolved type: com.google.android.gms.internal.measurement.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v87, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v107, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v115, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v124, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v125, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: com.google.android.gms.internal.measurement.z2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v130, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v146, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v147, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v84, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v93, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v94, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v164, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v165, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v166, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v167, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v169, resolved type: com.google.android.gms.measurement.internal.s7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v170, resolved type: com.google.android.gms.measurement.internal.s7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v102, resolved type: o.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v103, resolved type: o.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v173, resolved type: o.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v178, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v179, resolved type: com.google.android.gms.internal.measurement.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v180, resolved type: com.google.android.gms.internal.measurement.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v195, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v196, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v197, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v198, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v199, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v201, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v202, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v203, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v204, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v205, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v210, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v211, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v214, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v216, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v217, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v218, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v219, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v220, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v221, resolved type: com.google.android.gms.measurement.internal.f7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v104, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v79, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r11v82, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r11v91, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v99, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v112 */
    /* JADX WARNING: type inference failed for: r11v114, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v116 */
    /* JADX WARNING: type inference failed for: r11v153, types: [o.b, o.i] */
    /* JADX WARNING: type inference failed for: r11v200 */
    /* JADX WARNING: Code restructure failed: missing block: B:1250:0x1c37, code lost:
        if (r7 > (r9.mo51978a(null).longValue() + r5)) goto L_0x1c3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0bb5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0bb6, code lost:
        r20 = r8;
        r27 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0bbb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0bbc, code lost:
        r1 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0bdf, code lost:
        if (r1 == null) goto L_0x0bf4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0bea, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0d8c, code lost:
        if (r12 != null) goto L_0x0d8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:821:0x1242, code lost:
        if (r13 == null) goto L_0x1247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:905:0x1452, code lost:
        if (r10 == null) goto L_0x1457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:952:0x15b7, code lost:
        if (r10 != false) goto L_0x15c2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1041:0x17e8 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1054:0x1833 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1055:0x1856 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1063:0x18cd A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1064:0x18cf A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1067:0x18d7 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1078:0x1909 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1126:0x1a36 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1129:0x1a4d A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1130:0x1a66 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1216:0x1b5f A[SYNTHETIC, Splitter:B:1216:0x1b5f] */
    /* JADX WARNING: Removed duplicated region for block: B:1245:0x1c1e A[SYNTHETIC, Splitter:B:1245:0x1c1e] */
    /* JADX WARNING: Removed duplicated region for block: B:1260:0x1cb6 A[Catch:{ NumberFormatException -> 0x179f, all -> 0x1dca }] */
    /* JADX WARNING: Removed duplicated region for block: B:1264:0x1cd4 A[Catch:{ SQLiteException -> 0x1cee }] */
    /* JADX WARNING: Removed duplicated region for block: B:1295:0x1d8f A[SYNTHETIC, Splitter:B:1295:0x1d8f] */
    /* JADX WARNING: Removed duplicated region for block: B:1407:0x1692 A[EDGE_INSN: B:1407:0x1692->B:980:0x1692 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03f4 A[Catch:{ all -> 0x012a, all -> 0x06fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04b4 A[Catch:{ all -> 0x012a, all -> 0x06fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x050e A[Catch:{ all -> 0x012a, all -> 0x06fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x066f A[SYNTHETIC, Splitter:B:241:0x066f] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0687 A[Catch:{ all -> 0x012a, all -> 0x06fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x06ce A[Catch:{ all -> 0x06f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0bbb A[ExcHandler: all (r0v83 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:485:0x0b15] */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0bea A[Catch:{ all -> 0x0be5, all -> 0x1d83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x0cd4 A[SYNTHETIC, Splitter:B:598:0x0cd4] */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0cea A[Catch:{ all -> 0x0be5, all -> 0x1d83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:670:0x0e7c A[Catch:{ all -> 0x0e77, all -> 0x15da }] */
    /* JADX WARNING: Removed duplicated region for block: B:677:0x0e8b A[Catch:{ all -> 0x0be5, all -> 0x1d83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:751:0x106b A[Catch:{ all -> 0x0be5, all -> 0x1d83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:828:0x1250 A[Catch:{ all -> 0x0e77, all -> 0x15da }] */
    /* JADX WARNING: Removed duplicated region for block: B:859:0x1366 A[Catch:{ all -> 0x0be5, all -> 0x1d83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:913:0x1461 A[Catch:{ all -> 0x0e77, all -> 0x15da }] */
    /* JADX WARNING: Removed duplicated region for block: B:964:0x1601 A[SYNTHETIC, Splitter:B:964:0x1601] */
    /* JADX WARNING: Removed duplicated region for block: B:984:0x1698 A[SYNTHETIC, Splitter:B:984:0x1698] */
    /* JADX WARNING: Removed duplicated region for block: B:994:0x16c0 A[Catch:{ all -> 0x1d7a }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52004F(long r69) {
        /*
            r68 = this;
            r1 = r68
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "1"
            java.lang.String r5 = "_sn"
            java.lang.String r6 = "_npa"
            java.lang.String r7 = "_ai"
            com.google.android.gms.measurement.internal.h r8 = r1.f33488d
            m24287I(r8)
            r8.mo52065O()
            com.google.android.gms.measurement.internal.e7 r8 = new com.google.android.gms.measurement.internal.e7     // Catch:{ all -> 0x1dcc }
            r8.<init>(r1)     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.h r9 = r1.f33488d     // Catch:{ all -> 0x1dcc }
            m24287I(r9)     // Catch:{ all -> 0x1dcc }
            long r12 = r1.f33483A     // Catch:{ all -> 0x1dcc }
            r10 = r69
            r14 = r8
            r9.mo52079u(r10, r12, r14)     // Catch:{ all -> 0x1dcc }
            java.util.ArrayList r9 = r8.f33459c     // Catch:{ all -> 0x1dcc }
            r10 = 0
            if (r9 == 0) goto L_0x1db7
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x1dcc }
            if (r9 == 0) goto L_0x0035
            goto L_0x1db7
        L_0x0035:
            com.google.android.gms.internal.measurement.a3 r9 = r8.f33457a     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.q5 r9 = r9.mo50872n()     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.z2 r9 = (com.google.android.gms.internal.measurement.C14888z2) r9     // Catch:{ all -> 0x1dcc }
            boolean r11 = r9.f33059d     // Catch:{ all -> 0x1dcc }
            if (r11 == 0) goto L_0x004a
            r9.mo50809j()     // Catch:{ all -> 0x0047 }
            r9.f33059d = r10     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            goto L_0x06fc
        L_0x004a:
            MessageType r11 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r11 = (com.google.android.gms.internal.measurement.C14572a3) r11     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.C14572a3.m23298u0(r11)     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.d r11 = r68.mo52008K()     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r12 = r8.f33457a     // Catch:{ all -> 0x1dcc }
            java.lang.String r12 = r12.mo50295C1()     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C14959e2.f33387U     // Catch:{ all -> 0x1dcc }
            boolean r11 = r11.mo51973p(r12, r13)     // Catch:{ all -> 0x1dcc }
            r15 = r10
            r20 = r15
            r21 = r20
            r12 = -1
            r13 = -1
            r16 = 0
            r18 = 0
            r19 = 0
        L_0x006e:
            java.util.ArrayList r10 = r8.f33459c     // Catch:{ all -> 0x1dcc }
            int r10 = r10.size()     // Catch:{ all -> 0x1dcc }
            java.lang.String r14 = "_fr"
            r23 = r6
            java.lang.String r6 = "_et"
            r24 = r11
            java.lang.String r11 = "_e"
            r25 = 1000(0x3e8, double:4.94E-321)
            r27 = r2
            r29 = r3
            if (r15 >= r10) goto L_0x0700
            java.util.ArrayList r3 = r8.f33459c     // Catch:{ all -> 0x06fb }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r3 = (com.google.android.gms.internal.measurement.C14779q2) r3     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q5 r3 = r3.mo50872n()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.p2 r3 = (com.google.android.gms.internal.measurement.C14766p2) r3     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n3 r10 = r1.f33486b     // Catch:{ all -> 0x06fb }
            m24287I(r10)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r2 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r2 = r2.mo50295C1()     // Catch:{ all -> 0x06fb }
            r31 = r15
            java.lang.String r15 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r2 = r10.mo52258o(r2, r15)     // Catch:{ all -> 0x06fb }
            java.lang.String r10 = "_err"
            if (r2 == 0) goto L_0x013e
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52277n()     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.a3 r11 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r11 = r11.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n2 r11 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r11)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.u3 r14 = r1.f33497m     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.j2 r14 = r14.mo52329p()     // Catch:{ all -> 0x06fb }
            java.lang.String r15 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            java.lang.String r14 = r14.mo52142d(r15)     // Catch:{ all -> 0x06fb }
            r2.mo52239c(r11, r6, r14)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n3 r2 = r1.f33486b     // Catch:{ all -> 0x06fb }
            m24287I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r6 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = r6.mo50295C1()     // Catch:{ all -> 0x06fb }
            java.lang.String r11 = "measurement.upload.blacklist_internal"
            java.lang.String r2 = r2.mo51945e(r6, r11)     // Catch:{ all -> 0x013b }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x013b }
            if (r2 != 0) goto L_0x012d
            com.google.android.gms.measurement.internal.n3 r2 = r1.f33486b     // Catch:{ all -> 0x06fb }
            m24287I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r6 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = r6.mo50295C1()     // Catch:{ all -> 0x06fb }
            java.lang.String r11 = "measurement.upload.blacklist_public"
            java.lang.String r2 = r2.mo51945e(r6, r11)     // Catch:{ all -> 0x012a }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x0101
            goto L_0x012d
        L_0x0101:
            java.lang.String r2 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x06fb }
            if (r2 != 0) goto L_0x012d
            com.google.android.gms.measurement.internal.k7 r2 = r68.mo52013Q()     // Catch:{ all -> 0x06fb }
            androidx.compose.runtime.o0 r6 = r1.f33485C     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r10 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r33 = r10.mo50295C1()     // Catch:{ all -> 0x06fb }
            r34 = 11
            java.lang.String r35 = "_ev"
            java.lang.String r36 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            r37 = 0
            r2.getClass()     // Catch:{ all -> 0x06fb }
            r32 = r6
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x06fb }
            goto L_0x012d
        L_0x012a:
            r0 = move-exception
            goto L_0x06fc
        L_0x012d:
            r32 = r4
            r28 = r7
            r15 = r27
            r10 = r31
            r7 = r5
            r5 = r12
            r12 = r29
            goto L_0x06e1
        L_0x013b:
            r0 = move-exception
            goto L_0x06fc
        L_0x013e:
            java.lang.String r2 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            java.lang.String[] r15 = p568fn.C17782b.f38640k     // Catch:{ all -> 0x06f9 }
            r32 = r4
            java.lang.String[] r4 = p568fn.C17782b.f38638i     // Catch:{ all -> 0x06f9 }
            java.lang.String r4 = p514bk.C14088a.m21797z(r7, r15, r4)     // Catch:{ all -> 0x06f9 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x06fb }
            if (r2 == 0) goto L_0x01bd
            r3.mo50770s(r7)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52276m()     // Catch:{ all -> 0x06fb }
            java.lang.String r4 = "Renaming ad_impression to _ai"
            r2.mo52237a(r4)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            java.lang.String r2 = r2.mo52279s()     // Catch:{ all -> 0x06fb }
            r4 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x06fb }
            if (r2 == 0) goto L_0x01bd
            r2 = 0
        L_0x0172:
            MessageType r4 = r3.f33058c     // Catch:{ all -> 0x01ba }
            com.google.android.gms.internal.measurement.q2 r4 = (com.google.android.gms.internal.measurement.C14779q2) r4     // Catch:{ all -> 0x01ba }
            int r4 = r4.mo50796s()     // Catch:{ all -> 0x01ba }
            if (r2 >= r4) goto L_0x01bd
            java.lang.String r4 = "ad_platform"
            com.google.android.gms.internal.measurement.u2 r15 = r3.mo50772u(r2)     // Catch:{ all -> 0x06fb }
            java.lang.String r15 = r15.mo50887x()     // Catch:{ all -> 0x06fb }
            boolean r4 = r4.equals(r15)     // Catch:{ all -> 0x06fb }
            if (r4 == 0) goto L_0x01b7
            com.google.android.gms.internal.measurement.u2 r4 = r3.mo50772u(r2)     // Catch:{ all -> 0x06fb }
            java.lang.String r4 = r4.mo50888y()     // Catch:{ all -> 0x06fb }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x06fb }
            if (r4 != 0) goto L_0x01b7
            java.lang.String r4 = "admob"
            com.google.android.gms.internal.measurement.u2 r15 = r3.mo50772u(r2)     // Catch:{ all -> 0x06fb }
            java.lang.String r15 = r15.mo50888y()     // Catch:{ all -> 0x06fb }
            boolean r4 = r4.equalsIgnoreCase(r15)     // Catch:{ all -> 0x06fb }
            if (r4 == 0) goto L_0x01b7
            com.google.android.gms.measurement.internal.o2 r4 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r4 = r4.mo52278o()     // Catch:{ all -> 0x06fb }
            java.lang.String r15 = "AdMob ad impression logged from app. Potentially duplicative."
            r4.mo52237a(r15)     // Catch:{ all -> 0x06fb }
        L_0x01b7:
            int r2 = r2 + 1
            goto L_0x0172
        L_0x01ba:
            r0 = move-exception
            goto L_0x06fc
        L_0x01bd:
            com.google.android.gms.measurement.internal.n3 r2 = r1.f33486b     // Catch:{ all -> 0x06fb }
            m24287I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r4 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r4 = r4.mo50295C1()     // Catch:{ all -> 0x06fb }
            java.lang.String r15 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r2 = r2.mo52257n(r4, r15)     // Catch:{ all -> 0x06fb }
            java.lang.String r4 = "_c"
            if (r2 != 0) goto L_0x0229
            com.google.android.gms.measurement.internal.h7 r15 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r15)     // Catch:{ all -> 0x06fb }
            java.lang.String r15 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)     // Catch:{ all -> 0x06fb }
            r28 = r7
            int r7 = r15.hashCode()     // Catch:{ all -> 0x06fb }
            r33 = r5
            r5 = 94660(0x171c4, float:1.32647E-40)
            if (r7 == r5) goto L_0x020c
            r5 = 95025(0x17331, float:1.33158E-40)
            if (r7 == r5) goto L_0x0202
            r5 = 95027(0x17333, float:1.33161E-40)
            if (r7 == r5) goto L_0x01f8
            goto L_0x0216
        L_0x01f8:
            java.lang.String r5 = "_ui"
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0216
            r5 = 1
            goto L_0x0217
        L_0x0202:
            java.lang.String r5 = "_ug"
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0216
            r5 = 2
            goto L_0x0217
        L_0x020c:
            java.lang.String r5 = "_in"
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0216
            r5 = 0
            goto L_0x0217
        L_0x0216:
            r5 = -1
        L_0x0217:
            if (r5 == 0) goto L_0x022d
            r7 = 1
            if (r5 == r7) goto L_0x022d
            r7 = 2
            if (r5 == r7) goto L_0x022d
            r34 = r6
            r30 = r12
            r35 = r13
            r7 = r14
            r2 = 0
            goto L_0x03f2
        L_0x0229:
            r33 = r5
            r28 = r7
        L_0x022d:
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x0230:
            r30 = r12
            MessageType r12 = r3.f33058c     // Catch:{ all -> 0x06f7 }
            com.google.android.gms.internal.measurement.q2 r12 = (com.google.android.gms.internal.measurement.C14779q2) r12     // Catch:{ all -> 0x06f7 }
            int r12 = r12.mo50796s()     // Catch:{ all -> 0x06f7 }
            r34 = r6
            java.lang.String r6 = "_r"
            if (r5 >= r12) goto L_0x029c
            com.google.android.gms.internal.measurement.u2 r12 = r3.mo50772u(r5)     // Catch:{ all -> 0x06fb }
            java.lang.String r12 = r12.mo50887x()     // Catch:{ all -> 0x06fb }
            boolean r12 = r4.equals(r12)     // Catch:{ all -> 0x06fb }
            if (r12 == 0) goto L_0x026a
            com.google.android.gms.internal.measurement.u2 r6 = r3.mo50772u(r5)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q5 r6 = r6.mo50872n()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t2 r6 = (com.google.android.gms.internal.measurement.C14816t2) r6     // Catch:{ all -> 0x06fb }
            r35 = r13
            r12 = 1
            r6.mo50854p(r12)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r6 = r6.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r6 = (com.google.android.gms.internal.measurement.C14828u2) r6     // Catch:{ all -> 0x06fb }
            r3.mo50771t(r5, r6)     // Catch:{ all -> 0x06fb }
            r7 = 1
            goto L_0x0293
        L_0x026a:
            r35 = r13
            com.google.android.gms.internal.measurement.u2 r12 = r3.mo50772u(r5)     // Catch:{ all -> 0x06fb }
            java.lang.String r12 = r12.mo50887x()     // Catch:{ all -> 0x06fb }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x06fb }
            if (r6 == 0) goto L_0x0293
            com.google.android.gms.internal.measurement.u2 r6 = r3.mo50772u(r5)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q5 r6 = r6.mo50872n()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t2 r6 = (com.google.android.gms.internal.measurement.C14816t2) r6     // Catch:{ all -> 0x06fb }
            r12 = 1
            r6.mo50854p(r12)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r6 = r6.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r6 = (com.google.android.gms.internal.measurement.C14828u2) r6     // Catch:{ all -> 0x06fb }
            r3.mo50771t(r5, r6)     // Catch:{ all -> 0x06fb }
            r15 = 1
        L_0x0293:
            int r5 = r5 + 1
            r12 = r30
            r6 = r34
            r13 = r35
            goto L_0x0230
        L_0x029c:
            r35 = r13
            if (r7 != 0) goto L_0x02cc
            if (r2 == 0) goto L_0x02cc
            com.google.android.gms.measurement.internal.o2 r5 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52276m()     // Catch:{ all -> 0x06fb }
            java.lang.String r7 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.u3 r12 = r1.f33497m     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.j2 r12 = r12.mo52329p()     // Catch:{ all -> 0x06fb }
            java.lang.String r13 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            java.lang.String r12 = r12.mo52142d(r13)     // Catch:{ all -> 0x06fb }
            r5.mo52238b(r12, r7)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t2 r5 = com.google.android.gms.internal.measurement.C14828u2.m23989v()     // Catch:{ all -> 0x06fb }
            r5.mo50855q(r4)     // Catch:{ all -> 0x06fb }
            r12 = 1
            r5.mo50854p(r12)     // Catch:{ all -> 0x06fb }
            r3.mo50768q(r5)     // Catch:{ all -> 0x06fb }
        L_0x02cc:
            if (r15 != 0) goto L_0x02f8
            com.google.android.gms.measurement.internal.o2 r5 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52276m()     // Catch:{ all -> 0x06fb }
            java.lang.String r7 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.u3 r12 = r1.f33497m     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.j2 r12 = r12.mo52329p()     // Catch:{ all -> 0x06fb }
            java.lang.String r13 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            java.lang.String r12 = r12.mo52142d(r13)     // Catch:{ all -> 0x06fb }
            r5.mo52238b(r12, r7)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t2 r5 = com.google.android.gms.internal.measurement.C14828u2.m23989v()     // Catch:{ all -> 0x06fb }
            r5.mo50855q(r6)     // Catch:{ all -> 0x06fb }
            r12 = 1
            r5.mo50854p(r12)     // Catch:{ all -> 0x06fb }
            r3.mo50768q(r5)     // Catch:{ all -> 0x06fb }
        L_0x02f8:
            com.google.android.gms.measurement.internal.h r5 = r1.f33488d     // Catch:{ all -> 0x06fb }
            m24287I(r5)     // Catch:{ all -> 0x06fb }
            long r37 = r68.mo52036x()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r7 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r39 = r7.mo50295C1()     // Catch:{ all -> 0x06fb }
            r40 = 0
            r41 = 1
            r36 = r5
            com.google.android.gms.measurement.internal.f r5 = r36.mo52055E(r37, r39, r40, r41)     // Catch:{ all -> 0x06fb }
            long r12 = r5.f33466e     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.d r5 = r68.mo52008K()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r7 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r7 = r7.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C14959e2.f33423p     // Catch:{ all -> 0x06fb }
            int r5 = r5.mo51968k(r7, r15)     // Catch:{ all -> 0x06fb }
            r7 = r14
            long r14 = (long) r5     // Catch:{ all -> 0x06fb }
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x032d
            m24290w(r3, r6)     // Catch:{ all -> 0x06fb }
            goto L_0x032f
        L_0x032d:
            r21 = 1
        L_0x032f:
            java.lang.String r5 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r5 = com.google.android.gms.measurement.internal.C15018k7.m24470S(r5)     // Catch:{ all -> 0x06fb }
            if (r5 == 0) goto L_0x03f2
            if (r2 == 0) goto L_0x03f2
            com.google.android.gms.measurement.internal.h r5 = r1.f33488d     // Catch:{ all -> 0x06fb }
            m24287I(r5)     // Catch:{ all -> 0x06fb }
            long r37 = r68.mo52036x()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r6 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r39 = r6.mo50295C1()     // Catch:{ all -> 0x06fb }
            r40 = 1
            r41 = 0
            r36 = r5
            com.google.android.gms.measurement.internal.f r5 = r36.mo52055E(r37, r39, r40, r41)     // Catch:{ all -> 0x06fb }
            long r5 = r5.f33464c     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.d r12 = r68.mo52008K()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r13 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r13 = r13.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C14959e2.f33421o     // Catch:{ all -> 0x06fb }
            int r12 = r12.mo51968k(r13, r14)     // Catch:{ all -> 0x06fb }
            long r12 = (long) r12     // Catch:{ all -> 0x06fb }
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03f2
            com.google.android.gms.measurement.internal.o2 r5 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52277n()     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.a3 r12 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r12 = r12.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n2 r12 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r12)     // Catch:{ all -> 0x06fb }
            r5.mo52238b(r12, r6)     // Catch:{ all -> 0x06fb }
            r5 = 0
            r6 = 0
            r12 = 0
            r13 = -1
        L_0x0386:
            MessageType r14 = r3.f33058c     // Catch:{ all -> 0x03ef }
            com.google.android.gms.internal.measurement.q2 r14 = (com.google.android.gms.internal.measurement.C14779q2) r14     // Catch:{ all -> 0x03ef }
            int r14 = r14.mo50796s()     // Catch:{ all -> 0x03ef }
            if (r6 >= r14) goto L_0x03b4
            com.google.android.gms.internal.measurement.u2 r14 = r3.mo50772u(r6)     // Catch:{ all -> 0x06fb }
            java.lang.String r15 = r14.mo50887x()     // Catch:{ all -> 0x06fb }
            boolean r15 = r4.equals(r15)     // Catch:{ all -> 0x06fb }
            if (r15 == 0) goto L_0x03a6
            com.google.android.gms.internal.measurement.q5 r5 = r14.mo50872n()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t2 r5 = (com.google.android.gms.internal.measurement.C14816t2) r5     // Catch:{ all -> 0x06fb }
            r13 = r6
            goto L_0x03b1
        L_0x03a6:
            java.lang.String r14 = r14.mo50887x()     // Catch:{ all -> 0x06fb }
            boolean r14 = r10.equals(r14)     // Catch:{ all -> 0x06fb }
            if (r14 == 0) goto L_0x03b1
            r12 = 1
        L_0x03b1:
            int r6 = r6 + 1
            goto L_0x0386
        L_0x03b4:
            if (r12 == 0) goto L_0x03bd
            if (r5 == 0) goto L_0x03bc
            r3.mo50769r(r13)     // Catch:{ all -> 0x06fb }
            goto L_0x03f2
        L_0x03bc:
            r5 = 0
        L_0x03bd:
            if (r5 == 0) goto L_0x03d7
            com.google.android.gms.internal.measurement.q5 r5 = r5.clone()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t2 r5 = (com.google.android.gms.internal.measurement.C14816t2) r5     // Catch:{ all -> 0x06fb }
            r5.mo50855q(r10)     // Catch:{ all -> 0x06fb }
            r14 = 10
            r5.mo50854p(r14)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r5 = r5.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r5 = (com.google.android.gms.internal.measurement.C14828u2) r5     // Catch:{ all -> 0x06fb }
            r3.mo50771t(r13, r5)     // Catch:{ all -> 0x06fb }
            goto L_0x03f2
        L_0x03d7:
            com.google.android.gms.measurement.internal.o2 r5 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52275l()     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.a3 r10 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r10 = r10.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n2 r10 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x06fb }
            r5.mo52238b(r10, r6)     // Catch:{ all -> 0x06fb }
            goto L_0x03f2
        L_0x03ef:
            r0 = move-exception
            goto L_0x06fc
        L_0x03f2:
            if (r2 == 0) goto L_0x04aa
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x06fb }
            java.util.List r5 = r3.mo50774w()     // Catch:{ all -> 0x06fb }
            r2.<init>(r5)     // Catch:{ all -> 0x06fb }
            r5 = 0
            r6 = -1
            r10 = -1
        L_0x0400:
            int r12 = r2.size()     // Catch:{ all -> 0x06fb }
            java.lang.String r13 = "currency"
            java.lang.String r14 = "value"
            if (r5 >= r12) goto L_0x0430
            java.lang.Object r12 = r2.get(r5)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r12 = (com.google.android.gms.internal.measurement.C14828u2) r12     // Catch:{ all -> 0x06fb }
            java.lang.String r12 = r12.mo50887x()     // Catch:{ all -> 0x06fb }
            boolean r12 = r14.equals(r12)     // Catch:{ all -> 0x06fb }
            if (r12 == 0) goto L_0x041c
            r6 = r5
            goto L_0x042d
        L_0x041c:
            java.lang.Object r12 = r2.get(r5)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r12 = (com.google.android.gms.internal.measurement.C14828u2) r12     // Catch:{ all -> 0x06fb }
            java.lang.String r12 = r12.mo50887x()     // Catch:{ all -> 0x06fb }
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x06fb }
            if (r12 == 0) goto L_0x042d
            r10 = r5
        L_0x042d:
            int r5 = r5 + 1
            goto L_0x0400
        L_0x0430:
            r5 = -1
            if (r6 != r5) goto L_0x0435
            goto L_0x04aa
        L_0x0435:
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r5 = (com.google.android.gms.internal.measurement.C14828u2) r5     // Catch:{ all -> 0x06fb }
            boolean r5 = r5.mo50880M()     // Catch:{ all -> 0x06fb }
            if (r5 != 0) goto L_0x0466
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r5 = (com.google.android.gms.internal.measurement.C14828u2) r5     // Catch:{ all -> 0x06fb }
            boolean r5 = r5.mo50878K()     // Catch:{ all -> 0x06fb }
            if (r5 != 0) goto L_0x0466
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52278o()     // Catch:{ all -> 0x06fb }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo52237a(r5)     // Catch:{ all -> 0x06fb }
            r3.mo50769r(r6)     // Catch:{ all -> 0x06fb }
            m24290w(r3, r4)     // Catch:{ all -> 0x06fb }
            r2 = 18
            m24289v(r3, r2, r14)     // Catch:{ all -> 0x06fb }
            goto L_0x04aa
        L_0x0466:
            r5 = -1
            if (r10 != r5) goto L_0x046a
            goto L_0x0492
        L_0x046a:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r2 = (com.google.android.gms.internal.measurement.C14828u2) r2     // Catch:{ all -> 0x06fb }
            java.lang.String r2 = r2.mo50888y()     // Catch:{ all -> 0x06fb }
            int r5 = r2.length()     // Catch:{ all -> 0x06fb }
            r10 = 3
            if (r5 != r10) goto L_0x0492
            r5 = 0
        L_0x047c:
            int r10 = r2.length()     // Catch:{ all -> 0x06fb }
            if (r5 >= r10) goto L_0x04aa
            int r10 = r2.codePointAt(r5)     // Catch:{ all -> 0x06fb }
            boolean r12 = java.lang.Character.isLetter(r10)     // Catch:{ all -> 0x06fb }
            if (r12 == 0) goto L_0x0492
            int r10 = java.lang.Character.charCount(r10)     // Catch:{ all -> 0x06fb }
            int r5 = r5 + r10
            goto L_0x047c
        L_0x0492:
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52278o()     // Catch:{ all -> 0x06fb }
            java.lang.String r5 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo52237a(r5)     // Catch:{ all -> 0x06fb }
            r3.mo50769r(r6)     // Catch:{ all -> 0x06fb }
            m24290w(r3, r4)     // Catch:{ all -> 0x06fb }
            r2 = 19
            m24289v(r3, r2, r13)     // Catch:{ all -> 0x06fb }
        L_0x04aa:
            java.lang.String r2 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x06fb }
            if (r2 == 0) goto L_0x050e
            com.google.android.gms.measurement.internal.h7 r2 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r2 = r3.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r2 = (com.google.android.gms.internal.measurement.C14779q2) r2     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r2 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r2, r7)     // Catch:{ all -> 0x06fb }
            if (r2 != 0) goto L_0x0502
            if (r19 == 0) goto L_0x04ef
            long r4 = r19.mo50767p()     // Catch:{ all -> 0x06fb }
            long r6 = r3.mo50767p()     // Catch:{ all -> 0x06fb }
            long r4 = r4 - r6
            long r4 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x06fb }
            int r2 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r2 > 0) goto L_0x04ef
            com.google.android.gms.internal.measurement.q5 r2 = r19.clone()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.p2 r2 = (com.google.android.gms.internal.measurement.C14766p2) r2     // Catch:{ all -> 0x06fb }
            boolean r4 = r1.mo52006H(r3, r2)     // Catch:{ all -> 0x06fb }
            if (r4 == 0) goto L_0x04ef
            r14 = r35
            r9.mo50997p(r14, r2)     // Catch:{ all -> 0x06fb }
            r12 = r30
            r2 = 0
            r19 = 0
            goto L_0x04f4
        L_0x04ef:
            r14 = r35
            r2 = r3
            r12 = r20
        L_0x04f4:
            r18 = r2
            r5 = r12
            r13 = r14
            r15 = r27
            r12 = r29
            r7 = r33
            r4 = r34
            goto L_0x0659
        L_0x0502:
            r15 = r27
            r12 = r29
            r5 = r30
            r7 = r33
            r4 = r34
            goto L_0x0657
        L_0x050e:
            r14 = r35
            java.lang.String r2 = "_vs"
            java.lang.String r4 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x06fb }
            if (r2 == 0) goto L_0x0572
            com.google.android.gms.measurement.internal.h7 r2 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r2 = r3.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r2 = (com.google.android.gms.internal.measurement.C14779q2) r2     // Catch:{ all -> 0x06fb }
            r4 = r34
            com.google.android.gms.internal.measurement.u2 r2 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r2, r4)     // Catch:{ all -> 0x06fb }
            if (r2 != 0) goto L_0x056e
            if (r18 == 0) goto L_0x0560
            long r5 = r18.mo50767p()     // Catch:{ all -> 0x06fb }
            long r12 = r3.mo50767p()     // Catch:{ all -> 0x06fb }
            long r5 = r5 - r12
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x06fb }
            int r2 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r2 > 0) goto L_0x0560
            com.google.android.gms.internal.measurement.q5 r2 = r18.clone()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.p2 r2 = (com.google.android.gms.internal.measurement.C14766p2) r2     // Catch:{ all -> 0x06fb }
            boolean r5 = r1.mo52006H(r2, r3)     // Catch:{ all -> 0x06fb }
            if (r5 == 0) goto L_0x0558
            r5 = r30
            r9.mo50997p(r5, r2)     // Catch:{ all -> 0x06fb }
            r13 = r14
            r2 = 0
            r18 = 0
            goto L_0x055d
        L_0x0558:
            r5 = r30
            r2 = r3
            r13 = r20
        L_0x055d:
            r19 = r2
            goto L_0x0566
        L_0x0560:
            r5 = r30
            r19 = r3
            r13 = r20
        L_0x0566:
            r15 = r27
            r12 = r29
            r7 = r33
            goto L_0x0659
        L_0x056e:
            r5 = r30
            goto L_0x064f
        L_0x0572:
            r5 = r30
            r4 = r34
            com.google.android.gms.measurement.internal.d r2 = r68.mo52008K()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.a3 r6 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = r6.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C14959e2.f33404f0     // Catch:{ all -> 0x06fb }
            boolean r2 = r2.mo51973p(r6, r7)     // Catch:{ all -> 0x06fb }
            if (r2 == 0) goto L_0x064f
            java.lang.String r2 = "_ab"
            java.lang.String r6 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x06fb }
            if (r2 == 0) goto L_0x064f
            com.google.android.gms.measurement.internal.h7 r2 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r2 = r3.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r2 = (com.google.android.gms.internal.measurement.C14779q2) r2     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r2 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r2, r4)     // Catch:{ all -> 0x06fb }
            if (r2 != 0) goto L_0x064f
            if (r18 == 0) goto L_0x064f
            long r6 = r18.mo50767p()     // Catch:{ all -> 0x06fb }
            long r12 = r3.mo50767p()     // Catch:{ all -> 0x06fb }
            long r6 = r6 - r12
            long r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x06fb }
            r12 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x064f
            com.google.android.gms.internal.measurement.q5 r2 = r18.clone()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.p2 r2 = (com.google.android.gms.internal.measurement.C14766p2) r2     // Catch:{ all -> 0x06fb }
            r1.mo52001C(r2, r3)     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = r2.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r6 = r11.equals(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.h7 r6 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r6 = r2.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r6 = (com.google.android.gms.internal.measurement.C14779q2) r6     // Catch:{ all -> 0x06fb }
            r7 = r33
            com.google.android.gms.internal.measurement.u2 r6 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r6, r7)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.h7 r10 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r10)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r10 = r2.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r10 = (com.google.android.gms.internal.measurement.C14779q2) r10     // Catch:{ all -> 0x06fb }
            r12 = r29
            com.google.android.gms.internal.measurement.u2 r10 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r10, r12)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.h7 r13 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r13)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r13 = r2.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r13 = (com.google.android.gms.internal.measurement.C14779q2) r13     // Catch:{ all -> 0x06fb }
            r15 = r27
            com.google.android.gms.internal.measurement.u2 r13 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r13, r15)     // Catch:{ all -> 0x06fb }
            java.lang.String r18 = ""
            if (r6 == 0) goto L_0x060a
            java.lang.String r6 = r6.mo50888y()     // Catch:{ all -> 0x06fb }
            goto L_0x060c
        L_0x060a:
            r6 = r18
        L_0x060c:
            boolean r25 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06fb }
            if (r25 != 0) goto L_0x061d
            r35 = r14
            com.google.android.gms.measurement.internal.h7 r14 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r14)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r3, r7, r6)     // Catch:{ all -> 0x06fb }
            goto L_0x061f
        L_0x061d:
            r35 = r14
        L_0x061f:
            if (r10 == 0) goto L_0x0625
            java.lang.String r18 = r10.mo50888y()     // Catch:{ all -> 0x06fb }
        L_0x0625:
            r6 = r18
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06fb }
            if (r10 != 0) goto L_0x0635
            com.google.android.gms.measurement.internal.h7 r10 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r10)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r3, r12, r6)     // Catch:{ all -> 0x06fb }
        L_0x0635:
            if (r13 == 0) goto L_0x0647
            com.google.android.gms.measurement.internal.h7 r6 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r6)     // Catch:{ all -> 0x06fb }
            long r13 = r13.mo50886u()     // Catch:{ all -> 0x06fb }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r3, r15, r6)     // Catch:{ all -> 0x06fb }
        L_0x0647:
            r9.mo50997p(r5, r2)     // Catch:{ all -> 0x06fb }
            r13 = r35
            r18 = 0
            goto L_0x0659
        L_0x064f:
            r35 = r14
            r15 = r27
            r12 = r29
            r7 = r33
        L_0x0657:
            r13 = r35
        L_0x0659:
            if (r24 != 0) goto L_0x06bb
            java.lang.String r2 = r3.mo50773v()     // Catch:{ all -> 0x06fb }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x06fb }
            if (r2 == 0) goto L_0x06bb
            MessageType r2 = r3.f33058c     // Catch:{ all -> 0x06b9 }
            com.google.android.gms.internal.measurement.q2 r2 = (com.google.android.gms.internal.measurement.C14779q2) r2     // Catch:{ all -> 0x06b9 }
            int r2 = r2.mo50796s()     // Catch:{ all -> 0x06b9 }
            if (r2 != 0) goto L_0x0687
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52277n()     // Catch:{ all -> 0x06fb }
            java.lang.String r4 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.a3 r6 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = r6.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n2 r6 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r6)     // Catch:{ all -> 0x06fb }
            r2.mo52238b(r6, r4)     // Catch:{ all -> 0x06fb }
            goto L_0x06bb
        L_0x0687:
            com.google.android.gms.measurement.internal.h7 r2 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r2 = r3.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r2 = (com.google.android.gms.internal.measurement.C14779q2) r2     // Catch:{ all -> 0x06fb }
            java.io.Serializable r2 = com.google.android.gms.measurement.internal.C14991h7.m24382m(r2, r4)     // Catch:{ all -> 0x06fb }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x06fb }
            if (r2 != 0) goto L_0x06b2
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52277n()     // Catch:{ all -> 0x06fb }
            java.lang.String r4 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.a3 r6 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = r6.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n2 r6 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r6)     // Catch:{ all -> 0x06fb }
            r2.mo52238b(r6, r4)     // Catch:{ all -> 0x06fb }
            goto L_0x06bb
        L_0x06b2:
            long r10 = r2.longValue()     // Catch:{ all -> 0x06fb }
            long r16 = r16 + r10
            goto L_0x06bb
        L_0x06b9:
            r0 = move-exception
            goto L_0x06fc
        L_0x06bb:
            java.util.ArrayList r2 = r8.f33459c     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r4 = r3.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r4 = (com.google.android.gms.internal.measurement.C14779q2) r4     // Catch:{ all -> 0x06fb }
            r10 = r31
            r2.set(r10, r4)     // Catch:{ all -> 0x06fb }
            int r20 = r20 + 1
            boolean r2 = r9.f33059d     // Catch:{ all -> 0x06f5 }
            if (r2 == 0) goto L_0x06d4
            r9.mo50809j()     // Catch:{ all -> 0x06f5 }
            r2 = 0
            r9.f33059d = r2     // Catch:{ all -> 0x06f5 }
        L_0x06d4:
            MessageType r2 = r9.f33058c     // Catch:{ all -> 0x06f5 }
            com.google.android.gms.internal.measurement.a3 r2 = (com.google.android.gms.internal.measurement.C14572a3) r2     // Catch:{ all -> 0x06f5 }
            com.google.android.gms.internal.measurement.t5 r3 = r3.mo50807h()     // Catch:{ all -> 0x06f5 }
            com.google.android.gms.internal.measurement.q2 r3 = (com.google.android.gms.internal.measurement.C14779q2) r3     // Catch:{ all -> 0x06f5 }
            com.google.android.gms.internal.measurement.C14572a3.m23270N(r2, r3)     // Catch:{ all -> 0x06f5 }
        L_0x06e1:
            int r2 = r10 + 1
            r3 = r12
            r6 = r23
            r11 = r24
            r4 = r32
            r12 = r5
            r5 = r7
            r7 = r28
            r67 = r15
            r15 = r2
            r2 = r67
            goto L_0x006e
        L_0x06f5:
            r0 = move-exception
            goto L_0x06fc
        L_0x06f7:
            r0 = move-exception
            goto L_0x06fc
        L_0x06f9:
            r0 = move-exception
            goto L_0x06fc
        L_0x06fb:
            r0 = move-exception
        L_0x06fc:
            r2 = r0
            r11 = r1
            goto L_0x1dcf
        L_0x0700:
            r4 = r6
            r7 = r14
            if (r24 == 0) goto L_0x0760
            r3 = r20
            r2 = 0
        L_0x0707:
            if (r2 >= r3) goto L_0x0760
            MessageType r5 = r9.f33058c     // Catch:{ all -> 0x075e }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x075e }
            com.google.android.gms.internal.measurement.q2 r5 = r5.mo50349x1(r2)     // Catch:{ all -> 0x075e }
            java.lang.String r6 = r5.mo50800y()     // Catch:{ all -> 0x06fb }
            boolean r6 = r11.equals(r6)     // Catch:{ all -> 0x06fb }
            if (r6 == 0) goto L_0x072e
            com.google.android.gms.measurement.internal.h7 r6 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r6 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r5, r7)     // Catch:{ all -> 0x06fb }
            if (r6 == 0) goto L_0x072e
            r9.mo50993H(r2)     // Catch:{ all -> 0x06fb }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x075b
        L_0x072e:
            com.google.android.gms.measurement.internal.h7 r6 = r1.f33492h     // Catch:{ all -> 0x06fb }
            m24287I(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.u2 r5 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r5, r4)     // Catch:{ all -> 0x06fb }
            if (r5 == 0) goto L_0x075b
            boolean r6 = r5.mo50880M()     // Catch:{ all -> 0x06fb }
            if (r6 == 0) goto L_0x0748
            long r5 = r5.mo50886u()     // Catch:{ all -> 0x06fb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06fb }
            goto L_0x0749
        L_0x0748:
            r5 = 0
        L_0x0749:
            if (r5 == 0) goto L_0x075b
            long r12 = r5.longValue()     // Catch:{ all -> 0x06fb }
            r14 = 0
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x075b
            long r5 = r5.longValue()     // Catch:{ all -> 0x06fb }
            long r16 = r16 + r5
        L_0x075b:
            r5 = 1
            int r2 = r2 + r5
            goto L_0x0707
        L_0x075e:
            r0 = move-exception
            goto L_0x06fc
        L_0x0760:
            r2 = r16
            r4 = 0
            r1.mo52000B(r9, r2, r4)     // Catch:{ all -> 0x1dcc }
            MessageType r4 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ all -> 0x1db3 }
            com.google.android.gms.internal.measurement.z5 r4 = r4.mo50299F()     // Catch:{ all -> 0x1db3 }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ all -> 0x1db3 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1dcc }
        L_0x0776:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x1dcc }
            java.lang.String r6 = "_se"
            java.lang.String r7 = "_s"
            if (r5 == 0) goto L_0x079c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.q2 r5 = (com.google.android.gms.internal.measurement.C14779q2) r5     // Catch:{ all -> 0x06fb }
            java.lang.String r5 = r5.mo50800y()     // Catch:{ all -> 0x06fb }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x06fb }
            if (r5 == 0) goto L_0x0776
            com.google.android.gms.measurement.internal.h r4 = r1.f33488d     // Catch:{ all -> 0x06fb }
            m24287I(r4)     // Catch:{ all -> 0x06fb }
            java.lang.String r5 = r9.mo51000s()     // Catch:{ all -> 0x06fb }
            r4.mo52070l(r5, r6)     // Catch:{ all -> 0x06fb }
        L_0x079c:
            java.lang.String r4 = "_sid"
            int r4 = com.google.android.gms.measurement.internal.C14991h7.m24388u(r9, r4)     // Catch:{ all -> 0x1dcc }
            if (r4 < 0) goto L_0x07a9
            r4 = 1
            r1.mo52000B(r9, r2, r4)     // Catch:{ all -> 0x06fb }
            goto L_0x07c9
        L_0x07a9:
            int r2 = com.google.android.gms.measurement.internal.C14991h7.m24388u(r9, r6)     // Catch:{ all -> 0x1dcc }
            if (r2 < 0) goto L_0x07c9
            r9.mo50994I(r2)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.o2 r2 = r68.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x06fb }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.a3 r4 = r8.f33457a     // Catch:{ all -> 0x06fb }
            java.lang.String r4 = r4.mo50295C1()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r4)     // Catch:{ all -> 0x06fb }
            r2.mo52238b(r4, r3)     // Catch:{ all -> 0x06fb }
        L_0x07c9:
            com.google.android.gms.measurement.internal.h7 r2 = r1.f33492h     // Catch:{ all -> 0x1dcc }
            m24287I(r2)     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52276m()     // Catch:{ all -> 0x1dcc }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.mo52237a(r4)     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.f7 r3 = r2.f34048c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.f33486b     // Catch:{ all -> 0x1dcc }
            m24287I(r3)     // Catch:{ all -> 0x1dcc }
            java.lang.String r4 = r9.mo51000s()     // Catch:{ all -> 0x1dcc }
            r3.mo51995g()     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.f2 r3 = r3.mo52255l(r4)     // Catch:{ all -> 0x1daf }
            if (r3 != 0) goto L_0x07f5
            r3 = 0
            goto L_0x07f9
        L_0x07f5:
            boolean r3 = r3.mo50506E()     // Catch:{ all -> 0x1daf }
        L_0x07f9:
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r3 == 0) goto L_0x0964
            com.google.android.gms.measurement.internal.f7 r3 = r2.f34048c     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.h r3 = r3.f33488d     // Catch:{ all -> 0x06fb }
            m24287I(r3)     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = r9.mo51000s()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo52053C(r6)     // Catch:{ all -> 0x06fb }
            if (r3 == 0) goto L_0x0964
            com.google.android.gms.measurement.internal.u3 r6 = r3.f34015a     // Catch:{ all -> 0x0961 }
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo52015a()     // Catch:{ all -> 0x0961 }
            r6.mo51995g()     // Catch:{ all -> 0x0961 }
            boolean r3 = r3.f34031q     // Catch:{ all -> 0x0961 }
            if (r3 == 0) goto L_0x0964
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.l r3 = r3.mo52326m()     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = "com.google"
            r3.mo51995g()     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.o4 r10 = r3.f33681b     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10     // Catch:{ all -> 0x095e }
            com.google.android.gms.common.util.Clock r10 = r10.f33885o     // Catch:{ all -> 0x095e }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x095e }
            long r12 = r3.f33645h     // Catch:{ all -> 0x095e }
            long r12 = r10 - r12
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x083e
            r12 = 0
            r3.f33644g = r12     // Catch:{ all -> 0x095e }
        L_0x083e:
            java.lang.Boolean r12 = r3.f33644g     // Catch:{ all -> 0x095e }
            if (r12 != 0) goto L_0x08d4
            com.google.android.gms.measurement.internal.o4 r12 = r3.f33681b     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12     // Catch:{ all -> 0x095e }
            android.content.Context r12 = r12.f33872b     // Catch:{ all -> 0x095e }
            java.lang.String r13 = "android.permission.GET_ACCOUNTS"
            int r12 = p260v0.C8184a.m16458a(r12, r13)     // Catch:{ all -> 0x095e }
            if (r12 == 0) goto L_0x0868
            com.google.android.gms.measurement.internal.o4 r6 = r3.f33681b     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.m2 r6 = r6.f33728k     // Catch:{ all -> 0x095e }
            java.lang.String r12 = "Permission error checking for dasher/unicorn accounts"
            r6.mo52237a(r12)     // Catch:{ all -> 0x095e }
            r3.f33645h = r10     // Catch:{ all -> 0x095e }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x095e }
            r3.f33644g = r6     // Catch:{ all -> 0x095e }
        L_0x0865:
            r3 = 0
            goto L_0x08d8
        L_0x0868:
            android.accounts.AccountManager r12 = r3.f33643f     // Catch:{ all -> 0x095e }
            if (r12 != 0) goto L_0x0878
            com.google.android.gms.measurement.internal.o4 r12 = r3.f33681b     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12     // Catch:{ all -> 0x095e }
            android.content.Context r12 = r12.f33872b     // Catch:{ all -> 0x095e }
            android.accounts.AccountManager r12 = android.accounts.AccountManager.get(r12)     // Catch:{ all -> 0x095e }
            r3.f33643f = r12     // Catch:{ all -> 0x095e }
        L_0x0878:
            android.accounts.AccountManager r12 = r3.f33643f     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            java.lang.String r13 = "service_HOSTED"
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            r14 = 0
            android.accounts.AccountManagerFuture r12 = r12.getAccountsByTypeAndFeatures(r6, r13, r14, r14)     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            java.lang.Object r12 = r12.getResult()     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            android.accounts.Account[] r12 = (android.accounts.Account[]) r12     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            if (r12 == 0) goto L_0x0898
            int r12 = r12.length     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            if (r12 <= 0) goto L_0x0898
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            r3.f33644g = r6     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            r3.f33645h = r10     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
        L_0x0896:
            r3 = 1
            goto L_0x08d8
        L_0x0898:
            android.accounts.AccountManager r12 = r3.f33643f     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            java.lang.String r13 = "service_uca"
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            r14 = 0
            android.accounts.AccountManagerFuture r6 = r12.getAccountsByTypeAndFeatures(r6, r13, r14, r14)     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            java.lang.Object r6 = r6.getResult()     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            android.accounts.Account[] r6 = (android.accounts.Account[]) r6     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            if (r6 == 0) goto L_0x08cd
            int r6 = r6.length     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            if (r6 <= 0) goto L_0x08cd
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            r3.f33644g = r6     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            r3.f33645h = r10     // Catch:{ AuthenticatorException -> 0x08bc, IOException -> 0x08ba, OperationCanceledException -> 0x08b7 }
            goto L_0x0896
        L_0x08b7:
            r0 = move-exception
        L_0x08b8:
            r6 = r0
            goto L_0x08be
        L_0x08ba:
            r0 = move-exception
            goto L_0x08b8
        L_0x08bc:
            r0 = move-exception
            goto L_0x08b8
        L_0x08be:
            com.google.android.gms.measurement.internal.o4 r12 = r3.f33681b     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.o2 r12 = r12.mo52016b()     // Catch:{ all -> 0x095e }
            com.google.android.gms.measurement.internal.m2 r12 = r12.f33725h     // Catch:{ all -> 0x095e }
            java.lang.String r13 = "Exception checking account types"
            r12.mo52238b(r6, r13)     // Catch:{ all -> 0x095e }
        L_0x08cd:
            r3.f33645h = r10     // Catch:{ all -> 0x095e }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x095e }
            r3.f33644g = r6     // Catch:{ all -> 0x095e }
            goto L_0x0865
        L_0x08d4:
            boolean r3 = r12.booleanValue()     // Catch:{ all -> 0x095e }
        L_0x08d8:
            if (r3 == 0) goto L_0x0964
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52274k()     // Catch:{ all -> 0x06fb }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r3.mo52237a(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.j3 r3 = com.google.android.gms.internal.measurement.C14702k3.m23670u()     // Catch:{ all -> 0x06fb }
            r6 = r23
            r3.mo50604p(r6)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x06fb }
            com.google.android.gms.measurement.internal.l r2 = r2.mo52326m()     // Catch:{ all -> 0x06fb }
            long r10 = r2.mo52227k()     // Catch:{ all -> 0x06fb }
            r3.mo50605q(r10)     // Catch:{ all -> 0x06fb }
            r10 = 1
            r3.mo50603o(r10)     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.t5 r2 = r3.mo50807h()     // Catch:{ all -> 0x06fb }
            com.google.android.gms.internal.measurement.k3 r2 = (com.google.android.gms.internal.measurement.C14702k3) r2     // Catch:{ all -> 0x06fb }
            r3 = 0
        L_0x090f:
            MessageType r10 = r9.f33058c     // Catch:{ all -> 0x095b }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x095b }
            int r10 = r10.mo50325l1()     // Catch:{ all -> 0x095b }
            if (r3 >= r10) goto L_0x0946
            MessageType r10 = r9.f33058c     // Catch:{ all -> 0x0943 }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x0943 }
            com.google.android.gms.internal.measurement.k3 r10 = r10.mo50291A1(r3)     // Catch:{ all -> 0x0943 }
            java.lang.String r10 = r10.mo50629w()     // Catch:{ all -> 0x06fb }
            boolean r10 = r6.equals(r10)     // Catch:{ all -> 0x06fb }
            if (r10 == 0) goto L_0x0940
            boolean r6 = r9.f33059d     // Catch:{ all -> 0x093d }
            if (r6 == 0) goto L_0x0935
            r9.mo50809j()     // Catch:{ all -> 0x093d }
            r6 = 0
            r9.f33059d = r6     // Catch:{ all -> 0x093d }
        L_0x0935:
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x093d }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x093d }
            com.google.android.gms.internal.measurement.C14572a3.m23300w0(r6, r3, r2)     // Catch:{ all -> 0x093d }
            goto L_0x0964
        L_0x093d:
            r0 = move-exception
            goto L_0x06fc
        L_0x0940:
            int r3 = r3 + 1
            goto L_0x090f
        L_0x0943:
            r0 = move-exception
            goto L_0x06fc
        L_0x0946:
            boolean r3 = r9.f33059d     // Catch:{ all -> 0x0958 }
            if (r3 == 0) goto L_0x0950
            r9.mo50809j()     // Catch:{ all -> 0x0958 }
            r3 = 0
            r9.f33059d = r3     // Catch:{ all -> 0x0958 }
        L_0x0950:
            MessageType r3 = r9.f33058c     // Catch:{ all -> 0x0958 }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.C14572a3) r3     // Catch:{ all -> 0x0958 }
            com.google.android.gms.internal.measurement.C14572a3.m23301x0(r3, r2)     // Catch:{ all -> 0x0958 }
            goto L_0x0964
        L_0x0958:
            r0 = move-exception
            goto L_0x06fc
        L_0x095b:
            r0 = move-exception
            goto L_0x06fc
        L_0x095e:
            r0 = move-exception
            goto L_0x06fc
        L_0x0961:
            r0 = move-exception
            goto L_0x06fc
        L_0x0964:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            boolean r6 = r9.f33059d     // Catch:{ all -> 0x1dcc }
            if (r6 == 0) goto L_0x0977
            r9.mo50809j()     // Catch:{ all -> 0x0974 }
            r6 = 0
            r9.f33059d = r6     // Catch:{ all -> 0x0974 }
            goto L_0x0977
        L_0x0974:
            r0 = move-exception
            goto L_0x06fc
        L_0x0977:
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.C14572a3.m23251A0(r6, r2)     // Catch:{ all -> 0x1dcc }
            r2 = -9223372036854775808
            boolean r6 = r9.f33059d     // Catch:{ all -> 0x1dcc }
            if (r6 == 0) goto L_0x098e
            r9.mo50809j()     // Catch:{ all -> 0x098b }
            r6 = 0
            r9.f33059d = r6     // Catch:{ all -> 0x098b }
            goto L_0x098e
        L_0x098b:
            r0 = move-exception
            goto L_0x06fc
        L_0x098e:
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.C14572a3.m23252B0(r6, r2)     // Catch:{ all -> 0x1dcc }
            r2 = 0
        L_0x0996:
            MessageType r3 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.C14572a3) r3     // Catch:{ all -> 0x1dab }
            int r3 = r3.mo50319h1()     // Catch:{ all -> 0x1dab }
            if (r2 >= r3) goto L_0x0a06
            MessageType r3 = r9.f33058c     // Catch:{ all -> 0x0a03 }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.C14572a3) r3     // Catch:{ all -> 0x0a03 }
            com.google.android.gms.internal.measurement.q2 r3 = r3.mo50349x1(r2)     // Catch:{ all -> 0x0a03 }
            long r10 = r3.mo50798u()     // Catch:{ all -> 0x06fb }
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x0a00 }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0a00 }
            long r12 = r6.mo50343u1()     // Catch:{ all -> 0x0a00 }
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x09d1
            long r10 = r3.mo50798u()     // Catch:{ all -> 0x06fb }
            boolean r6 = r9.f33059d     // Catch:{ all -> 0x09ce }
            if (r6 == 0) goto L_0x09c6
            r9.mo50809j()     // Catch:{ all -> 0x09ce }
            r6 = 0
            r9.f33059d = r6     // Catch:{ all -> 0x09ce }
        L_0x09c6:
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x09ce }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x09ce }
            com.google.android.gms.internal.measurement.C14572a3.m23251A0(r6, r10)     // Catch:{ all -> 0x09ce }
            goto L_0x09d1
        L_0x09ce:
            r0 = move-exception
            goto L_0x06fc
        L_0x09d1:
            long r10 = r3.mo50798u()     // Catch:{ all -> 0x06fb }
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x09fd }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x09fd }
            long r12 = r6.mo50335q1()     // Catch:{ all -> 0x09fd }
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x09fa
            long r10 = r3.mo50798u()     // Catch:{ all -> 0x06fb }
            boolean r3 = r9.f33059d     // Catch:{ all -> 0x09f7 }
            if (r3 == 0) goto L_0x09ef
            r9.mo50809j()     // Catch:{ all -> 0x09f7 }
            r3 = 0
            r9.f33059d = r3     // Catch:{ all -> 0x09f7 }
        L_0x09ef:
            MessageType r3 = r9.f33058c     // Catch:{ all -> 0x09f7 }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.C14572a3) r3     // Catch:{ all -> 0x09f7 }
            com.google.android.gms.internal.measurement.C14572a3.m23252B0(r3, r10)     // Catch:{ all -> 0x09f7 }
            goto L_0x09fa
        L_0x09f7:
            r0 = move-exception
            goto L_0x06fc
        L_0x09fa:
            int r2 = r2 + 1
            goto L_0x0996
        L_0x09fd:
            r0 = move-exception
            goto L_0x06fc
        L_0x0a00:
            r0 = move-exception
            goto L_0x06fc
        L_0x0a03:
            r0 = move-exception
            goto L_0x06fc
        L_0x0a06:
            r9.mo50992F()     // Catch:{ all -> 0x1dcc }
            r9.mo51006y()     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.measurement.internal.s7 r2 = r1.f33491g     // Catch:{ all -> 0x1dcc }
            m24287I(r2)     // Catch:{ all -> 0x1dcc }
            java.lang.String r3 = r9.mo51000s()     // Catch:{ all -> 0x1dcc }
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x1da7 }
            com.google.android.gms.internal.measurement.z5 r6 = r6.mo50299F()     // Catch:{ all -> 0x1da7 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ all -> 0x1da7 }
            MessageType r10 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x1da3 }
            com.google.android.gms.internal.measurement.z5 r10 = r10.mo50300G()     // Catch:{ all -> 0x1da3 }
            java.util.List r18 = java.util.Collections.unmodifiableList(r10)     // Catch:{ all -> 0x1da3 }
            MessageType r10 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x1d9f }
            long r10 = r10.mo50343u1()     // Catch:{ all -> 0x1d9f }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x1dcc }
            MessageType r11 = r9.f33058c     // Catch:{ all -> 0x1dcc }
            com.google.android.gms.internal.measurement.a3 r11 = (com.google.android.gms.internal.measurement.C14572a3) r11     // Catch:{ all -> 0x1d9b }
            long r11 = r11.mo50335q1()     // Catch:{ all -> 0x1d9b }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x1dcc }
            java.lang.String r15 = "current_results"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r18)     // Catch:{ all -> 0x1d97 }
            r2.f33840e = r3     // Catch:{ all -> 0x1d97 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x1d97 }
            r3.<init>()     // Catch:{ all -> 0x1d97 }
            r2.f33841f = r3     // Catch:{ all -> 0x1d97 }
            o.b r3 = new o.b     // Catch:{ all -> 0x1d97 }
            r3.<init>()     // Catch:{ all -> 0x1d97 }
            r2.f33842g = r3     // Catch:{ all -> 0x1d97 }
            r2.f33843h = r10     // Catch:{ all -> 0x1d97 }
            r2.f33844i = r11     // Catch:{ all -> 0x1d97 }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ all -> 0x1d97 }
        L_0x0a68:
            boolean r10 = r3.hasNext()     // Catch:{ all -> 0x1d97 }
            if (r10 == 0) goto L_0x0a80
            java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.internal.measurement.q2 r10 = (com.google.android.gms.internal.measurement.C14779q2) r10     // Catch:{ all -> 0x1d97 }
            java.lang.String r10 = r10.mo50800y()     // Catch:{ all -> 0x1d97 }
            boolean r10 = r7.equals(r10)     // Catch:{ all -> 0x1d97 }
            if (r10 == 0) goto L_0x0a68
            r3 = 1
            goto L_0x0a81
        L_0x0a80:
            r3 = 0
        L_0x0a81:
            com.google.android.gms.internal.measurement.C14656g9.m23603a()     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.o4 r7 = r2.f33681b     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.d r7 = r7.mo52325l()     // Catch:{ all -> 0x1d97 }
            java.lang.String r10 = r2.f33840e     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C14959e2.f33391Y     // Catch:{ all -> 0x1d97 }
            boolean r7 = r7.mo51973p(r10, r11)     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.internal.measurement.C14656g9.m23603a()     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.o4 r10 = r2.f33681b     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.d r10 = r10.mo52325l()     // Catch:{ all -> 0x1d97 }
            java.lang.String r11 = r2.f33840e     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C14959e2.f33390X     // Catch:{ all -> 0x1d97 }
            boolean r19 = r10.mo51973p(r11, r12)     // Catch:{ all -> 0x1d97 }
            if (r3 == 0) goto L_0x0af1
            com.google.android.gms.measurement.internal.f7 r10 = r2.f34048c     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.h r10 = r10.mo52010M()     // Catch:{ all -> 0x1d97 }
            java.lang.String r11 = r2.f33840e     // Catch:{ all -> 0x1d97 }
            r10.mo51942h()     // Catch:{ all -> 0x1d97 }
            r10.mo51995g()     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)     // Catch:{ all -> 0x1d97 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x1d97 }
            r12.<init>()     // Catch:{ all -> 0x1d97 }
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x1d97 }
            java.lang.String r4 = "current_session_count"
            r12.put(r4, r14)     // Catch:{ all -> 0x1d97 }
            android.database.sqlite.SQLiteDatabase r4 = r10.mo52052B()     // Catch:{ SQLiteException -> 0x0ada }
            r5 = 1
            java.lang.String[] r14 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0ada }
            r14[r13] = r11     // Catch:{ SQLiteException -> 0x0ada }
            java.lang.String r5 = "events"
            java.lang.String r13 = "app_id = ?"
            r4.update(r5, r12, r13, r14)     // Catch:{ SQLiteException -> 0x0ada }
            goto L_0x0af1
        L_0x0ada:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.o4 r5 = r10.f33681b     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52275l()     // Catch:{ all -> 0x1d97 }
            com.google.android.gms.measurement.internal.n2 r10 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r11)     // Catch:{ all -> 0x1d97 }
            java.lang.String r11 = "Error resetting session-scoped event counts. appId"
            r5.mo52239c(r10, r11, r4)     // Catch:{ all -> 0x1d97 }
        L_0x0af1:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1d97 }
            java.lang.String r5 = "Failed to merge filter. appId"
            java.lang.String r14 = "Database error querying filters. appId"
            java.lang.String r13 = "audience_id"
            java.lang.String r12 = "data"
            if (r19 == 0) goto L_0x0bee
            if (r7 == 0) goto L_0x0bee
            com.google.android.gms.measurement.internal.f7 r4 = r2.f34048c     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.measurement.internal.h r4 = r4.mo52010M()     // Catch:{ all -> 0x1d83 }
            java.lang.String r10 = r2.f33840e     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x1d83 }
            o.b r11 = new o.b     // Catch:{ all -> 0x1d83 }
            r11.<init>()     // Catch:{ all -> 0x1d83 }
            android.database.sqlite.SQLiteDatabase r31 = r4.mo52052B()     // Catch:{ all -> 0x1d83 }
            java.lang.String[] r33 = new java.lang.String[]{r13, r12}     // Catch:{ SQLiteException -> 0x0bbf, all -> 0x0bbb }
            r16 = r12
            r12 = 1
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0bb5, all -> 0x0bbb }
            r12 = 0
            r1[r12] = r10     // Catch:{ SQLiteException -> 0x0bb5, all -> 0x0bbb }
            java.lang.String r32 = "event_filters"
            java.lang.String r34 = "app_id=?"
            r36 = 0
            r37 = 0
            r38 = 0
            r35 = r1
            android.database.Cursor r1 = r31.query(r32, r33, r34, r35, r36, r37, r38)     // Catch:{ SQLiteException -> 0x0bb5, all -> 0x0bbb }
            boolean r12 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0bae }
            if (r12 == 0) goto L_0x0ba3
            r20 = r8
        L_0x0b39:
            r12 = 1
            byte[] r8 = r1.getBlob(r12)     // Catch:{ SQLiteException -> 0x0ba1 }
            com.google.android.gms.internal.measurement.p1 r12 = com.google.android.gms.internal.measurement.C14778q1.m23856t()     // Catch:{ IOException -> 0x0b7b }
            com.google.android.gms.internal.measurement.q5 r8 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r12, r8)     // Catch:{ IOException -> 0x0b7b }
            com.google.android.gms.internal.measurement.p1 r8 = (com.google.android.gms.internal.measurement.C14765p1) r8     // Catch:{ IOException -> 0x0b7b }
            com.google.android.gms.internal.measurement.t5 r8 = r8.mo50807h()     // Catch:{ IOException -> 0x0b7b }
            com.google.android.gms.internal.measurement.q1 r8 = (com.google.android.gms.internal.measurement.C14778q1) r8     // Catch:{ IOException -> 0x0b7b }
            boolean r12 = r8.mo50782E()     // Catch:{ SQLiteException -> 0x0ba1 }
            if (r12 != 0) goto L_0x0b57
            r27 = r9
            goto L_0x0b92
        L_0x0b57:
            r12 = 0
            int r17 = r1.getInt(r12)     // Catch:{ SQLiteException -> 0x0ba1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x0ba1 }
            java.lang.Object r17 = r11.get(r12)     // Catch:{ SQLiteException -> 0x0ba1 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x0ba1 }
            if (r17 != 0) goto L_0x0b73
            r27 = r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0bac }
            r9.<init>()     // Catch:{ SQLiteException -> 0x0bac }
            r11.put(r12, r9)     // Catch:{ SQLiteException -> 0x0bac }
            goto L_0x0b77
        L_0x0b73:
            r27 = r9
            r9 = r17
        L_0x0b77:
            r9.add(r8)     // Catch:{ SQLiteException -> 0x0bac }
            goto L_0x0b92
        L_0x0b7b:
            r0 = move-exception
            r27 = r9
            r8 = r0
            com.google.android.gms.measurement.internal.o4 r9 = r4.f33681b     // Catch:{ SQLiteException -> 0x0bac }
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9     // Catch:{ SQLiteException -> 0x0bac }
            com.google.android.gms.measurement.internal.o2 r9 = r9.mo52016b()     // Catch:{ SQLiteException -> 0x0bac }
            com.google.android.gms.measurement.internal.m2 r9 = r9.mo52275l()     // Catch:{ SQLiteException -> 0x0bac }
            com.google.android.gms.measurement.internal.n2 r12 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ SQLiteException -> 0x0bac }
            r9.mo52239c(r12, r5, r8)     // Catch:{ SQLiteException -> 0x0bac }
        L_0x0b92:
            boolean r8 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0bac }
            if (r8 != 0) goto L_0x0b9e
            r1.close()     // Catch:{ all -> 0x15da }
            r4 = r11
            goto L_0x0bf4
        L_0x0b9e:
            r9 = r27
            goto L_0x0b39
        L_0x0ba1:
            r0 = move-exception
            goto L_0x0bb1
        L_0x0ba3:
            r20 = r8
            r27 = r9
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0bac }
            goto L_0x0be1
        L_0x0bac:
            r0 = move-exception
            goto L_0x0bb3
        L_0x0bae:
            r0 = move-exception
            r20 = r8
        L_0x0bb1:
            r27 = r9
        L_0x0bb3:
            r8 = r0
            goto L_0x0bc8
        L_0x0bb5:
            r0 = move-exception
            r20 = r8
            r27 = r9
            goto L_0x0bc6
        L_0x0bbb:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x0be8
        L_0x0bbf:
            r0 = move-exception
            r20 = r8
            r27 = r9
            r16 = r12
        L_0x0bc6:
            r8 = r0
            r1 = 0
        L_0x0bc8:
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b     // Catch:{ all -> 0x0be5 }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ all -> 0x0be5 }
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()     // Catch:{ all -> 0x0be5 }
            com.google.android.gms.measurement.internal.m2 r4 = r4.mo52275l()     // Catch:{ all -> 0x0be5 }
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0be5 }
            r4.mo52239c(r9, r14, r8)     // Catch:{ all -> 0x0be5 }
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0be5 }
            if (r1 == 0) goto L_0x0bf4
        L_0x0be1:
            r1.close()     // Catch:{ all -> 0x1d83 }
            goto L_0x0bf4
        L_0x0be5:
            r0 = move-exception
            r15 = r1
            r1 = r0
        L_0x0be8:
            if (r15 == 0) goto L_0x0bed
            r15.close()     // Catch:{ all -> 0x1d83 }
        L_0x0bed:
            throw r1     // Catch:{ all -> 0x1d83 }
        L_0x0bee:
            r20 = r8
            r27 = r9
            r16 = r12
        L_0x0bf4:
            com.google.android.gms.measurement.internal.f7 r1 = r2.f34048c     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.measurement.internal.h r1 = r1.mo52010M()     // Catch:{ all -> 0x1d83 }
            java.lang.String r8 = r2.f33840e     // Catch:{ all -> 0x1d83 }
            r1.mo51942h()     // Catch:{ all -> 0x1d83 }
            r1.mo51995g()     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x1d83 }
            android.database.sqlite.SQLiteDatabase r31 = r1.mo52052B()     // Catch:{ all -> 0x1d83 }
            java.lang.String[] r33 = new java.lang.String[]{r13, r15}     // Catch:{ SQLiteException -> 0x0cb2, all -> 0x0cab }
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0cb2, all -> 0x0cab }
            r9 = 0
            r10[r9] = r8     // Catch:{ SQLiteException -> 0x0cb2, all -> 0x0cab }
            java.lang.String r32 = "audience_filter_values"
            java.lang.String r34 = "app_id=?"
            r36 = 0
            r37 = 0
            r38 = 0
            r35 = r10
            android.database.Cursor r9 = r31.query(r32, r33, r34, r35, r36, r37, r38)     // Catch:{ SQLiteException -> 0x0cb2, all -> 0x0cab }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0ca5 }
            if (r10 != 0) goto L_0x0c3e
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0c36 }
            r9.close()     // Catch:{ all -> 0x1d83 }
            r17 = r13
            r31 = r14
            goto L_0x0cd7
        L_0x0c36:
            r0 = move-exception
            r10 = r0
            r17 = r13
        L_0x0c3a:
            r31 = r14
            goto L_0x0cb9
        L_0x0c3e:
            o.b r10 = new o.b     // Catch:{ SQLiteException -> 0x0ca5 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x0ca5 }
        L_0x0c43:
            r11 = 0
            int r12 = r9.getInt(r11)     // Catch:{ SQLiteException -> 0x0ca5 }
            r17 = r13
            r11 = 1
            byte[] r13 = r9.getBlob(r11)     // Catch:{ SQLiteException -> 0x0ca3 }
            com.google.android.gms.internal.measurement.f3 r11 = com.google.android.gms.internal.measurement.C14650g3.m23587w()     // Catch:{ IOException -> 0x0c6e }
            com.google.android.gms.internal.measurement.q5 r11 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r11, r13)     // Catch:{ IOException -> 0x0c6e }
            com.google.android.gms.internal.measurement.f3 r11 = (com.google.android.gms.internal.measurement.C14637f3) r11     // Catch:{ IOException -> 0x0c6e }
            com.google.android.gms.internal.measurement.t5 r11 = r11.mo50807h()     // Catch:{ IOException -> 0x0c6e }
            com.google.android.gms.internal.measurement.g3 r11 = (com.google.android.gms.internal.measurement.C14650g3) r11     // Catch:{ IOException -> 0x0c6e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0c6b }
            r10.put(r12, r11)     // Catch:{ SQLiteException -> 0x0c6b }
            r29 = r10
            r31 = r14
            goto L_0x0c8d
        L_0x0c6b:
            r0 = move-exception
            r10 = r0
            goto L_0x0c3a
        L_0x0c6e:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.o4 r13 = r1.f33681b     // Catch:{ SQLiteException -> 0x0ca3 }
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13     // Catch:{ SQLiteException -> 0x0ca3 }
            com.google.android.gms.measurement.internal.o2 r13 = r13.mo52016b()     // Catch:{ SQLiteException -> 0x0ca3 }
            com.google.android.gms.measurement.internal.m2 r13 = r13.mo52275l()     // Catch:{ SQLiteException -> 0x0ca3 }
            r29 = r10
            java.lang.String r10 = "Failed to merge filter results. appId, audienceId, error"
            r31 = r14
            com.google.android.gms.measurement.internal.n2 r14 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r8)     // Catch:{ SQLiteException -> 0x0ca0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0ca0 }
            r13.mo52240d(r14, r12, r11, r10)     // Catch:{ SQLiteException -> 0x0ca0 }
        L_0x0c8d:
            boolean r10 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0ca0 }
            if (r10 != 0) goto L_0x0c99
            r9.close()     // Catch:{ all -> 0x15da }
            r1 = r29
            goto L_0x0cd7
        L_0x0c99:
            r13 = r17
            r10 = r29
            r14 = r31
            goto L_0x0c43
        L_0x0ca0:
            r0 = move-exception
        L_0x0ca1:
            r10 = r0
            goto L_0x0cb9
        L_0x0ca3:
            r0 = move-exception
            goto L_0x0ca8
        L_0x0ca5:
            r0 = move-exception
            r17 = r13
        L_0x0ca8:
            r31 = r14
            goto L_0x0ca1
        L_0x0cab:
            r0 = move-exception
            r1 = r0
            r15 = 0
            r11 = r68
            goto L_0x1d8d
        L_0x0cb2:
            r0 = move-exception
            r17 = r13
            r31 = r14
            r10 = r0
            r9 = 0
        L_0x0cb9:
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ all -> 0x1d88 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ all -> 0x1d88 }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ all -> 0x1d88 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.mo52275l()     // Catch:{ all -> 0x1d88 }
            java.lang.String r11 = "Database error querying filter results. appId"
            com.google.android.gms.measurement.internal.n2 r8 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r8)     // Catch:{ all -> 0x1d88 }
            r1.mo52239c(r8, r11, r10)     // Catch:{ all -> 0x1d88 }
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1d88 }
            if (r9 == 0) goto L_0x0cd7
            r9.close()     // Catch:{ all -> 0x1d83 }
        L_0x0cd7:
            boolean r8 = r1.isEmpty()     // Catch:{ all -> 0x1d83 }
            if (r8 == 0) goto L_0x0cea
        L_0x0cdd:
            r32 = r5
            r34 = r6
            r1 = r15
            r4 = r16
            r9 = r17
            r6 = r31
            goto L_0x1059
        L_0x0cea:
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x1d83 }
            java.util.Set r9 = r1.keySet()     // Catch:{ all -> 0x1d83 }
            r8.<init>(r9)     // Catch:{ all -> 0x1d83 }
            if (r3 == 0) goto L_0x0e80
            java.lang.String r3 = r2.f33840e     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch:{ all -> 0x1d83 }
            o.b r9 = new o.b     // Catch:{ all -> 0x1d83 }
            r9.<init>()     // Catch:{ all -> 0x1d83 }
            boolean r10 = r1.isEmpty()     // Catch:{ all -> 0x1d83 }
            if (r10 == 0) goto L_0x0d0a
            goto L_0x0e81
        L_0x0d0a:
            com.google.android.gms.measurement.internal.f7 r10 = r2.f34048c     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.measurement.internal.h r10 = r10.mo52010M()     // Catch:{ all -> 0x1d83 }
            r10.mo51942h()     // Catch:{ all -> 0x1d83 }
            r10.mo51995g()     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x1d83 }
            o.b r11 = new o.b     // Catch:{ all -> 0x1d83 }
            r11.<init>()     // Catch:{ all -> 0x1d83 }
            android.database.sqlite.SQLiteDatabase r12 = r10.mo52052B()     // Catch:{ all -> 0x1d83 }
            r13 = 2
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0d70, all -> 0x0d6b }
            r13 = 0
            r14[r13] = r3     // Catch:{ SQLiteException -> 0x0d70, all -> 0x0d6b }
            r13 = 1
            r14[r13] = r3     // Catch:{ SQLiteException -> 0x0d70, all -> 0x0d6b }
            java.lang.String r13 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r12 = r12.rawQuery(r13, r14)     // Catch:{ SQLiteException -> 0x0d70, all -> 0x0d6b }
            boolean r13 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0d68 }
            if (r13 == 0) goto L_0x0d63
        L_0x0d37:
            r13 = 0
            int r14 = r12.getInt(r13)     // Catch:{ SQLiteException -> 0x0d68 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x0d68 }
            java.lang.Object r14 = r11.get(r13)     // Catch:{ SQLiteException -> 0x0d68 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ SQLiteException -> 0x0d68 }
            if (r14 != 0) goto L_0x0d50
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0d68 }
            r14.<init>()     // Catch:{ SQLiteException -> 0x0d68 }
            r11.put(r13, r14)     // Catch:{ SQLiteException -> 0x0d68 }
        L_0x0d50:
            r13 = 1
            int r29 = r12.getInt(r13)     // Catch:{ SQLiteException -> 0x0d68 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r29)     // Catch:{ SQLiteException -> 0x0d68 }
            r14.add(r13)     // Catch:{ SQLiteException -> 0x0d68 }
            boolean r13 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0d68 }
            if (r13 != 0) goto L_0x0d37
            goto L_0x0d8e
        L_0x0d63:
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0d68 }
            goto L_0x0d8e
        L_0x0d68:
            r0 = move-exception
            r11 = r0
            goto L_0x0d73
        L_0x0d6b:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x0e7a
        L_0x0d70:
            r0 = move-exception
            r11 = r0
            r12 = 0
        L_0x0d73:
            com.google.android.gms.measurement.internal.o4 r10 = r10.f33681b     // Catch:{ all -> 0x0e77 }
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10     // Catch:{ all -> 0x0e77 }
            com.google.android.gms.measurement.internal.o2 r10 = r10.mo52016b()     // Catch:{ all -> 0x0e77 }
            com.google.android.gms.measurement.internal.m2 r10 = r10.mo52275l()     // Catch:{ all -> 0x0e77 }
            java.lang.String r13 = "Database error querying scoped filters. appId"
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r3)     // Catch:{ all -> 0x0e77 }
            r10.mo52239c(r3, r13, r11)     // Catch:{ all -> 0x0e77 }
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0e77 }
            if (r12 == 0) goto L_0x0d91
        L_0x0d8e:
            r12.close()     // Catch:{ all -> 0x15da }
        L_0x0d91:
            java.util.Set r3 = r1.keySet()     // Catch:{ all -> 0x15da }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x15da }
        L_0x0d99:
            boolean r10 = r3.hasNext()     // Catch:{ all -> 0x15da }
            if (r10 == 0) goto L_0x0e81
            java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x15da }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x15da }
            int r10 = r10.intValue()     // Catch:{ all -> 0x15da }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x15da }
            java.lang.Object r13 = r1.get(r12)     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.g3 r13 = (com.google.android.gms.internal.measurement.C14650g3) r13     // Catch:{ all -> 0x15da }
            java.lang.Object r14 = r11.get(r12)     // Catch:{ all -> 0x15da }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x15da }
            if (r14 == 0) goto L_0x0e6a
            boolean r29 = r14.isEmpty()     // Catch:{ all -> 0x15da }
            if (r29 == 0) goto L_0x0dc3
            goto L_0x0e6a
        L_0x0dc3:
            com.google.android.gms.measurement.internal.f7 r12 = r2.f34048c     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.h7 r12 = r12.mo52012P()     // Catch:{ all -> 0x15da }
            java.util.List r29 = r13.mo50540B()     // Catch:{ all -> 0x15da }
            r32 = r3
            r3 = r29
            com.google.android.gms.internal.measurement.y5 r3 = (com.google.android.gms.internal.measurement.C14879y5) r3     // Catch:{ all -> 0x15da }
            java.util.List r3 = r12.mo52107D(r3, r14)     // Catch:{ all -> 0x15da }
            boolean r12 = r3.isEmpty()     // Catch:{ all -> 0x15da }
            if (r12 != 0) goto L_0x0e67
            com.google.android.gms.internal.measurement.q5 r12 = r13.mo50872n()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.f3 r12 = (com.google.android.gms.internal.measurement.C14637f3) r12     // Catch:{ all -> 0x15da }
            r12.mo50515o()     // Catch:{ all -> 0x15da }
            r29 = r11
            boolean r11 = r12.f33059d     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x0df2
            r12.mo50809j()     // Catch:{ all -> 0x15da }
            r11 = 0
            r12.f33059d = r11     // Catch:{ all -> 0x15da }
        L_0x0df2:
            MessageType r11 = r12.f33058c     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.g3 r11 = (com.google.android.gms.internal.measurement.C14650g3) r11     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.C14650g3.m23581G(r11, r3)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.f7 r3 = r2.f34048c     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.h7 r3 = r3.mo52012P()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.y5 r11 = r13.mo50542D()     // Catch:{ all -> 0x15da }
            java.util.List r3 = r3.mo52107D(r11, r14)     // Catch:{ all -> 0x15da }
            r12.mo50516p()     // Catch:{ all -> 0x15da }
            boolean r11 = r12.f33059d     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x0e14
            r12.mo50809j()     // Catch:{ all -> 0x15da }
            r11 = 0
            r12.f33059d = r11     // Catch:{ all -> 0x15da }
        L_0x0e14:
            MessageType r11 = r12.f33058c     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.g3 r11 = (com.google.android.gms.internal.measurement.C14650g3) r11     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.C14650g3.m23579E(r11, r3)     // Catch:{ all -> 0x15da }
            r3 = 0
        L_0x0e1c:
            int r11 = r13.mo50543r()     // Catch:{ all -> 0x15da }
            if (r3 >= r11) goto L_0x0e3a
            com.google.android.gms.internal.measurement.o2 r11 = r13.mo50547v(r3)     // Catch:{ all -> 0x15da }
            int r11 = r11.mo50754r()     // Catch:{ all -> 0x15da }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x15da }
            boolean r11 = r14.contains(r11)     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x0e37
            r12.mo50517q(r3)     // Catch:{ all -> 0x15da }
        L_0x0e37:
            int r3 = r3 + 1
            goto L_0x0e1c
        L_0x0e3a:
            r3 = 0
        L_0x0e3b:
            int r11 = r13.mo50545t()     // Catch:{ all -> 0x15da }
            if (r3 >= r11) goto L_0x0e59
            com.google.android.gms.internal.measurement.i3 r11 = r13.mo50548z(r3)     // Catch:{ all -> 0x15da }
            int r11 = r11.mo50585s()     // Catch:{ all -> 0x15da }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x15da }
            boolean r11 = r14.contains(r11)     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x0e56
            r12.mo50518r(r3)     // Catch:{ all -> 0x15da }
        L_0x0e56:
            int r3 = r3 + 1
            goto L_0x0e3b
        L_0x0e59:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.t5 r10 = r12.mo50807h()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.g3 r10 = (com.google.android.gms.internal.measurement.C14650g3) r10     // Catch:{ all -> 0x15da }
            r9.put(r3, r10)     // Catch:{ all -> 0x15da }
            goto L_0x0e71
        L_0x0e67:
            r29 = r11
            goto L_0x0e71
        L_0x0e6a:
            r32 = r3
            r29 = r11
            r9.put(r12, r13)     // Catch:{ all -> 0x15da }
        L_0x0e71:
            r11 = r29
            r3 = r32
            goto L_0x0d99
        L_0x0e77:
            r0 = move-exception
            r1 = r0
            r15 = r12
        L_0x0e7a:
            if (r15 == 0) goto L_0x0e7f
            r15.close()     // Catch:{ all -> 0x15da }
        L_0x0e7f:
            throw r1     // Catch:{ all -> 0x15da }
        L_0x0e80:
            r9 = r1
        L_0x0e81:
            java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x1d83 }
        L_0x0e85:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x1d83 }
            if (r8 == 0) goto L_0x0cdd
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x1d83 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x1d83 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x1d83 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1d83 }
            java.lang.Object r10 = r9.get(r10)     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.internal.measurement.g3 r10 = (com.google.android.gms.internal.measurement.C14650g3) r10     // Catch:{ all -> 0x1d83 }
            java.util.BitSet r14 = new java.util.BitSet     // Catch:{ all -> 0x1d83 }
            r14.<init>()     // Catch:{ all -> 0x1d83 }
            java.util.BitSet r13 = new java.util.BitSet     // Catch:{ all -> 0x1d83 }
            r13.<init>()     // Catch:{ all -> 0x1d83 }
            o.b r12 = new o.b     // Catch:{ all -> 0x1d83 }
            r12.<init>()     // Catch:{ all -> 0x1d83 }
            if (r10 == 0) goto L_0x0efb
            int r11 = r10.mo50543r()     // Catch:{ all -> 0x1d83 }
            if (r11 != 0) goto L_0x0eb7
            goto L_0x0efb
        L_0x0eb7:
            com.google.android.gms.internal.measurement.z5 r11 = r10.mo50539A()     // Catch:{ all -> 0x1d83 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x1d83 }
        L_0x0ebf:
            boolean r29 = r11.hasNext()     // Catch:{ all -> 0x15da }
            if (r29 == 0) goto L_0x0efb
            java.lang.Object r29 = r11.next()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.o2 r29 = (com.google.android.gms.internal.measurement.C14753o2) r29     // Catch:{ all -> 0x15da }
            boolean r32 = r29.mo50757y()     // Catch:{ all -> 0x15da }
            if (r32 == 0) goto L_0x0ebf
            int r32 = r29.mo50754r()     // Catch:{ all -> 0x15da }
            r33 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r32)     // Catch:{ all -> 0x15da }
            boolean r32 = r29.mo50756x()     // Catch:{ all -> 0x15da }
            if (r32 == 0) goto L_0x0ef0
            long r34 = r29.mo50755s()     // Catch:{ all -> 0x15da }
            java.lang.Long r29 = java.lang.Long.valueOf(r34)     // Catch:{ all -> 0x15da }
            r67 = r29
            r29 = r9
            r9 = r67
            goto L_0x0ef3
        L_0x0ef0:
            r29 = r9
            r9 = 0
        L_0x0ef3:
            r12.put(r3, r9)     // Catch:{ all -> 0x15da }
            r9 = r29
            r3 = r33
            goto L_0x0ebf
        L_0x0efb:
            r33 = r3
            r29 = r9
            o.b r3 = new o.b     // Catch:{ all -> 0x1d83 }
            r3.<init>()     // Catch:{ all -> 0x1d83 }
            if (r10 == 0) goto L_0x0f54
            int r9 = r10.mo50545t()     // Catch:{ all -> 0x1d83 }
            if (r9 != 0) goto L_0x0f0d
            goto L_0x0f54
        L_0x0f0d:
            com.google.android.gms.internal.measurement.z5 r9 = r10.mo50541C()     // Catch:{ all -> 0x15da }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x15da }
        L_0x0f15:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x0f54
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.i3 r11 = (com.google.android.gms.internal.measurement.C14676i3) r11     // Catch:{ all -> 0x15da }
            boolean r32 = r11.mo50588z()     // Catch:{ all -> 0x15da }
            if (r32 == 0) goto L_0x0f51
            int r32 = r11.mo50584r()     // Catch:{ all -> 0x15da }
            if (r32 <= 0) goto L_0x0f51
            int r32 = r11.mo50585s()     // Catch:{ all -> 0x15da }
            r34 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r32)     // Catch:{ all -> 0x15da }
            int r32 = r11.mo50584r()     // Catch:{ all -> 0x15da }
            r35 = r15
            r22 = -1
            int r15 = r32 + -1
            long r36 = r11.mo50586t(r15)     // Catch:{ all -> 0x15da }
            java.lang.Long r11 = java.lang.Long.valueOf(r36)     // Catch:{ all -> 0x15da }
            r3.put(r9, r11)     // Catch:{ all -> 0x15da }
            r9 = r34
            r15 = r35
            goto L_0x0f15
        L_0x0f51:
            r22 = -1
            goto L_0x0f15
        L_0x0f54:
            r35 = r15
            r22 = -1
            if (r10 == 0) goto L_0x0faf
            r9 = 0
        L_0x0f5b:
            int r11 = r10.mo50546u()     // Catch:{ all -> 0x15da }
            int r11 = r11 * 64
            if (r9 >= r11) goto L_0x0faf
            com.google.android.gms.internal.measurement.y5 r11 = r10.mo50542D()     // Catch:{ all -> 0x15da }
            boolean r11 = com.google.android.gms.measurement.internal.C14991h7.m24378H(r9, r11)     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x0f9d
            com.google.android.gms.measurement.internal.o4 r11 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r11 = (com.google.android.gms.measurement.internal.C15103u3) r11     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r11 = r11.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r11 = r11.mo52276m()     // Catch:{ all -> 0x15da }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            r32 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x15da }
            r34 = r6
            java.lang.String r6 = "Filter already evaluated. audience ID, filter ID"
            r11.mo52239c(r15, r6, r5)     // Catch:{ all -> 0x15da }
            r13.set(r9)     // Catch:{ all -> 0x15da }
            java.util.List r5 = r10.mo50540B()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.y5 r5 = (com.google.android.gms.internal.measurement.C14879y5) r5     // Catch:{ all -> 0x15da }
            boolean r5 = com.google.android.gms.measurement.internal.C14991h7.m24378H(r9, r5)     // Catch:{ all -> 0x15da }
            if (r5 == 0) goto L_0x0fa1
            r14.set(r9)     // Catch:{ all -> 0x15da }
            goto L_0x0fa8
        L_0x0f9d:
            r32 = r5
            r34 = r6
        L_0x0fa1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x15da }
            r12.remove(r5)     // Catch:{ all -> 0x15da }
        L_0x0fa8:
            int r9 = r9 + 1
            r5 = r32
            r6 = r34
            goto L_0x0f5b
        L_0x0faf:
            r32 = r5
            r34 = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.g3 r6 = (com.google.android.gms.internal.measurement.C14650g3) r6     // Catch:{ all -> 0x15da }
            if (r19 == 0) goto L_0x101b
            if (r7 == 0) goto L_0x101b
            java.lang.Object r5 = r4.get(r5)     // Catch:{ all -> 0x15da }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x15da }
            if (r5 == 0) goto L_0x101b
            java.lang.Long r9 = r2.f33844i     // Catch:{ all -> 0x15da }
            if (r9 == 0) goto L_0x101b
            java.lang.Long r9 = r2.f33843h     // Catch:{ all -> 0x15da }
            if (r9 != 0) goto L_0x0fd2
            goto L_0x101b
        L_0x0fd2:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x15da }
        L_0x0fd6:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x15da }
            if (r9 == 0) goto L_0x101b
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.q1 r9 = (com.google.android.gms.internal.measurement.C14778q1) r9     // Catch:{ all -> 0x15da }
            int r10 = r9.mo50786s()     // Catch:{ all -> 0x15da }
            java.lang.Long r11 = r2.f33844i     // Catch:{ all -> 0x15da }
            long r36 = r11.longValue()     // Catch:{ all -> 0x15da }
            long r36 = r36 / r25
            boolean r9 = r9.mo50780C()     // Catch:{ all -> 0x15da }
            if (r9 == 0) goto L_0x0ffc
            java.lang.Long r9 = r2.f33843h     // Catch:{ all -> 0x15da }
            long r36 = r9.longValue()     // Catch:{ all -> 0x15da }
            long r36 = r36 / r25
        L_0x0ffc:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x15da }
            boolean r10 = r12.containsKey(r9)     // Catch:{ all -> 0x15da }
            if (r10 == 0) goto L_0x100d
            java.lang.Long r10 = java.lang.Long.valueOf(r36)     // Catch:{ all -> 0x15da }
            r12.put(r9, r10)     // Catch:{ all -> 0x15da }
        L_0x100d:
            boolean r10 = r3.containsKey(r9)     // Catch:{ all -> 0x15da }
            if (r10 == 0) goto L_0x0fd6
            java.lang.Long r10 = java.lang.Long.valueOf(r36)     // Catch:{ all -> 0x15da }
            r3.put(r9, r10)     // Catch:{ all -> 0x15da }
            goto L_0x0fd6
        L_0x101b:
            com.google.android.gms.measurement.internal.n7 r5 = new com.google.android.gms.measurement.internal.n7     // Catch:{ all -> 0x15da }
            java.lang.String r9 = r2.f33840e     // Catch:{ all -> 0x15da }
            r10 = r5
            r11 = r2
            r15 = r16
            r16 = r12
            r12 = r9
            r9 = r17
            r17 = r13
            r13 = r6
            r6 = r31
            r31 = r1
            r1 = r35
            r35 = r4
            r4 = r15
            r15 = r17
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x15da }
            o.b r3 = r2.f33842g     // Catch:{ all -> 0x15da }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            r3.put(r8, r5)     // Catch:{ all -> 0x15da }
            r15 = r1
            r16 = r4
            r17 = r9
            r9 = r29
            r1 = r31
            r5 = r32
            r3 = r33
            r4 = r35
            r31 = r6
            r6 = r34
            goto L_0x0e85
        L_0x1059:
            boolean r3 = r34.isEmpty()     // Catch:{ all -> 0x1d83 }
            java.lang.String r5 = "Skipping failed audience ID"
            if (r3 == 0) goto L_0x106b
        L_0x1061:
            r22 = r1
            r12 = r4
            r41 = r5
            r14 = r6
            r26 = r9
            goto L_0x135c
        L_0x106b:
            com.google.android.gms.measurement.internal.o7 r3 = new com.google.android.gms.measurement.internal.o7     // Catch:{ all -> 0x1d83 }
            r3.<init>(r2)     // Catch:{ all -> 0x1d83 }
            o.b r7 = new o.b     // Catch:{ all -> 0x1d83 }
            r7.<init>()     // Catch:{ all -> 0x1d83 }
            java.util.Iterator r8 = r34.iterator()     // Catch:{ all -> 0x1d83 }
        L_0x1079:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x1d83 }
            if (r10 == 0) goto L_0x1061
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.internal.measurement.q2 r10 = (com.google.android.gms.internal.measurement.C14779q2) r10     // Catch:{ all -> 0x1d83 }
            java.lang.String r11 = r2.f33840e     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.internal.measurement.q2 r11 = r3.mo52282a(r10, r11)     // Catch:{ all -> 0x1d83 }
            if (r11 == 0) goto L_0x133e
            com.google.android.gms.measurement.internal.f7 r12 = r2.f34048c     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.measurement.internal.h r12 = r12.mo52010M()     // Catch:{ all -> 0x1d83 }
            java.lang.String r13 = r2.f33840e     // Catch:{ all -> 0x1d83 }
            java.lang.String r14 = r11.mo50800y()     // Catch:{ all -> 0x1d83 }
            java.lang.String r15 = r10.mo50800y()     // Catch:{ all -> 0x1d83 }
            com.google.android.gms.measurement.internal.n r15 = r12.mo52057G(r13, r15)     // Catch:{ all -> 0x1d83 }
            if (r15 != 0) goto L_0x10f2
            com.google.android.gms.measurement.internal.o4 r15 = r12.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r15 = (com.google.android.gms.measurement.internal.C15103u3) r15     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r15 = r15.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r15 = r15.mo52277n()     // Catch:{ all -> 0x15da }
            r16 = r3
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r13)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o4 r12 = r12.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.j2 r12 = r12.mo52329p()     // Catch:{ all -> 0x15da }
            java.lang.String r12 = r12.mo52142d(r14)     // Catch:{ all -> 0x15da }
            java.lang.String r14 = "Event aggregate wasn't created during raw event logging. appId, event"
            r15.mo52239c(r3, r14, r12)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n r3 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x15da }
            java.lang.String r35 = r10.mo50800y()     // Catch:{ all -> 0x15da }
            r36 = 1
            r38 = 1
            r40 = 1
            long r42 = r10.mo50798u()     // Catch:{ all -> 0x15da }
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r33 = r3
            r34 = r13
            r33.<init>(r34, r35, r36, r38, r40, r42, r44, r46, r47, r48, r49)     // Catch:{ all -> 0x15da }
            r22 = r1
            r25 = r4
            r17 = r5
            r31 = r6
            r19 = r8
            goto L_0x1133
        L_0x10f2:
            r16 = r3
            com.google.android.gms.measurement.internal.n r3 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x15da }
            java.lang.String r10 = r15.f33686a     // Catch:{ all -> 0x15da }
            java.lang.String r12 = r15.f33687b     // Catch:{ all -> 0x15da }
            long r13 = r15.f33688c     // Catch:{ all -> 0x15da }
            r25 = 1
            long r53 = r13 + r25
            long r13 = r15.f33689d     // Catch:{ all -> 0x15da }
            long r55 = r13 + r25
            long r13 = r15.f33690e     // Catch:{ all -> 0x15da }
            long r57 = r13 + r25
            long r13 = r15.f33691f     // Catch:{ all -> 0x15da }
            r17 = r5
            r31 = r6
            long r5 = r15.f33692g     // Catch:{ all -> 0x15da }
            r19 = r8
            java.lang.Long r8 = r15.f33693h     // Catch:{ all -> 0x15da }
            r22 = r1
            java.lang.Long r1 = r15.f33694i     // Catch:{ all -> 0x15da }
            r25 = r4
            java.lang.Long r4 = r15.f33695j     // Catch:{ all -> 0x15da }
            java.lang.Boolean r15 = r15.f33696k     // Catch:{ all -> 0x15da }
            r50 = r3
            r51 = r10
            r52 = r12
            r59 = r13
            r61 = r5
            r63 = r8
            r64 = r1
            r65 = r4
            r66 = r15
            r50.<init>(r51, r52, r53, r55, r57, r59, r61, r63, r64, r65, r66)     // Catch:{ all -> 0x15da }
        L_0x1133:
            com.google.android.gms.measurement.internal.f7 r1 = r2.f34048c     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.h r1 = r1.mo52010M()     // Catch:{ all -> 0x15da }
            r1.mo52073o(r3)     // Catch:{ all -> 0x15da }
            long r4 = r3.f33688c     // Catch:{ all -> 0x15da }
            java.lang.String r1 = r11.mo50800y()     // Catch:{ all -> 0x15da }
            java.lang.Object r6 = r7.get(r1)     // Catch:{ all -> 0x15da }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x15da }
            if (r6 != 0) goto L_0x1254
            com.google.android.gms.measurement.internal.f7 r6 = r2.f34048c     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.h r6 = r6.mo52010M()     // Catch:{ all -> 0x15da }
            java.lang.String r8 = r2.f33840e     // Catch:{ all -> 0x15da }
            r6.mo51942h()     // Catch:{ all -> 0x15da }
            r6.mo51995g()     // Catch:{ all -> 0x15da }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x15da }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)     // Catch:{ all -> 0x15da }
            o.b r10 = new o.b     // Catch:{ all -> 0x15da }
            r10.<init>()     // Catch:{ all -> 0x15da }
            android.database.sqlite.SQLiteDatabase r33 = r6.mo52052B()     // Catch:{ all -> 0x15da }
            r12 = r25
            java.lang.String[] r35 = new java.lang.String[]{r9, r12}     // Catch:{ SQLiteException -> 0x121d, all -> 0x1224 }
            r13 = 2
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x121d, all -> 0x1224 }
            r13 = 0
            r14[r13] = r8     // Catch:{ SQLiteException -> 0x121d, all -> 0x1224 }
            r13 = 1
            r14[r13] = r1     // Catch:{ SQLiteException -> 0x121d, all -> 0x1224 }
            java.lang.String r34 = "event_filters"
            java.lang.String r36 = "app_id=? AND event_name=?"
            r38 = 0
            r39 = 0
            r40 = 0
            r37 = r14
            android.database.Cursor r13 = r33.query(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ SQLiteException -> 0x121d, all -> 0x1224 }
            boolean r14 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x1219 }
            if (r14 == 0) goto L_0x120c
        L_0x118c:
            r14 = 1
            byte[] r15 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x1205 }
            com.google.android.gms.internal.measurement.p1 r14 = com.google.android.gms.internal.measurement.C14778q1.m23856t()     // Catch:{ IOException -> 0x11d3 }
            com.google.android.gms.internal.measurement.q5 r14 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r14, r15)     // Catch:{ IOException -> 0x11d3 }
            com.google.android.gms.internal.measurement.p1 r14 = (com.google.android.gms.internal.measurement.C14765p1) r14     // Catch:{ IOException -> 0x11d3 }
            com.google.android.gms.internal.measurement.t5 r14 = r14.mo50807h()     // Catch:{ IOException -> 0x11d3 }
            com.google.android.gms.internal.measurement.q1 r14 = (com.google.android.gms.internal.measurement.C14778q1) r14     // Catch:{ IOException -> 0x11d3 }
            r15 = 0
            int r25 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x11cb }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r25)     // Catch:{ SQLiteException -> 0x11cb }
            java.lang.Object r25 = r10.get(r15)     // Catch:{ SQLiteException -> 0x11cb }
            java.util.List r25 = (java.util.List) r25     // Catch:{ SQLiteException -> 0x11cb }
            if (r25 != 0) goto L_0x11bd
            r26 = r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x11c9 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x11c9 }
            r10.put(r15, r9)     // Catch:{ SQLiteException -> 0x11c9 }
            goto L_0x11c1
        L_0x11bd:
            r26 = r9
            r9 = r25
        L_0x11c1:
            r9.add(r14)     // Catch:{ SQLiteException -> 0x11c9 }
            r25 = r10
            r10 = r32
            goto L_0x11ee
        L_0x11c9:
            r0 = move-exception
            goto L_0x11ce
        L_0x11cb:
            r0 = move-exception
            r26 = r9
        L_0x11ce:
            r9 = r0
            r10 = r32
            goto L_0x1229
        L_0x11d3:
            r0 = move-exception
            r26 = r9
            r9 = r0
            com.google.android.gms.measurement.internal.o4 r14 = r6.f33681b     // Catch:{ SQLiteException -> 0x1203 }
            com.google.android.gms.measurement.internal.u3 r14 = (com.google.android.gms.measurement.internal.C15103u3) r14     // Catch:{ SQLiteException -> 0x1203 }
            com.google.android.gms.measurement.internal.o2 r14 = r14.mo52016b()     // Catch:{ SQLiteException -> 0x1203 }
            com.google.android.gms.measurement.internal.m2 r14 = r14.mo52275l()     // Catch:{ SQLiteException -> 0x1203 }
            com.google.android.gms.measurement.internal.n2 r15 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r8)     // Catch:{ SQLiteException -> 0x1203 }
            r25 = r10
            r10 = r32
            r14.mo52239c(r15, r10, r9)     // Catch:{ SQLiteException -> 0x1217 }
        L_0x11ee:
            boolean r9 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x1217 }
            if (r9 != 0) goto L_0x11fc
            r13.close()     // Catch:{ all -> 0x15da }
            r6 = r25
            r14 = r31
            goto L_0x1247
        L_0x11fc:
            r32 = r10
            r10 = r25
            r9 = r26
            goto L_0x118c
        L_0x1203:
            r0 = move-exception
            goto L_0x1208
        L_0x1205:
            r0 = move-exception
            r26 = r9
        L_0x1208:
            r10 = r32
        L_0x120a:
            r9 = r0
            goto L_0x1229
        L_0x120c:
            r26 = r9
            r10 = r32
            java.util.Map r6 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x1217 }
            r14 = r31
            goto L_0x1244
        L_0x1217:
            r0 = move-exception
            goto L_0x120a
        L_0x1219:
            r0 = move-exception
            r26 = r9
            goto L_0x1208
        L_0x121d:
            r0 = move-exception
            r26 = r9
            r10 = r32
            r9 = r0
            goto L_0x1228
        L_0x1224:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x124e
        L_0x1228:
            r13 = 0
        L_0x1229:
            com.google.android.gms.measurement.internal.o4 r6 = r6.f33681b     // Catch:{ all -> 0x124b }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ all -> 0x124b }
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()     // Catch:{ all -> 0x124b }
            com.google.android.gms.measurement.internal.m2 r6 = r6.mo52275l()     // Catch:{ all -> 0x124b }
            com.google.android.gms.measurement.internal.n2 r8 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r8)     // Catch:{ all -> 0x124b }
            r14 = r31
            r6.mo52239c(r8, r14, r9)     // Catch:{ all -> 0x124b }
            java.util.Map r6 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x124b }
            if (r13 == 0) goto L_0x1247
        L_0x1244:
            r13.close()     // Catch:{ all -> 0x15da }
        L_0x1247:
            r7.put(r1, r6)     // Catch:{ all -> 0x15da }
            goto L_0x125c
        L_0x124b:
            r0 = move-exception
            r1 = r0
            r15 = r13
        L_0x124e:
            if (r15 == 0) goto L_0x1253
            r15.close()     // Catch:{ all -> 0x15da }
        L_0x1253:
            throw r1     // Catch:{ all -> 0x15da }
        L_0x1254:
            r26 = r9
            r12 = r25
            r14 = r31
            r10 = r32
        L_0x125c:
            java.util.Set r1 = r6.keySet()     // Catch:{ all -> 0x15da }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x15da }
        L_0x1264:
            boolean r8 = r1.hasNext()     // Catch:{ all -> 0x15da }
            if (r8 == 0) goto L_0x1337
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x15da }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x15da }
            int r8 = r8.intValue()     // Catch:{ all -> 0x15da }
            java.util.HashSet r9 = r2.f33841f     // Catch:{ all -> 0x15da }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            boolean r9 = r9.contains(r13)     // Catch:{ all -> 0x15da }
            if (r9 == 0) goto L_0x1294
            com.google.android.gms.measurement.internal.o4 r8 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r8 = r8.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r8 = r8.mo52276m()     // Catch:{ all -> 0x15da }
            r9 = r17
            r8.mo52238b(r13, r9)     // Catch:{ all -> 0x15da }
            r17 = r9
            goto L_0x1264
        L_0x1294:
            r9 = r17
            java.lang.Object r13 = r6.get(r13)     // Catch:{ all -> 0x15da }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x15da }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x15da }
            r15 = 1
        L_0x12a1:
            boolean r17 = r13.hasNext()     // Catch:{ all -> 0x15da }
            if (r17 == 0) goto L_0x1316
            java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.q1 r15 = (com.google.android.gms.internal.measurement.C14778q1) r15     // Catch:{ all -> 0x15da }
            r17 = r1
            com.google.android.gms.measurement.internal.p7 r1 = new com.google.android.gms.measurement.internal.p7     // Catch:{ all -> 0x15da }
            r25 = r6
            java.lang.String r6 = r2.f33840e     // Catch:{ all -> 0x15da }
            r1.<init>(r2, r6, r8, r15)     // Catch:{ all -> 0x15da }
            java.lang.Long r6 = r2.f33843h     // Catch:{ all -> 0x15da }
            r29 = r7
            java.lang.Long r7 = r2.f33844i     // Catch:{ all -> 0x15da }
            int r15 = r15.mo50786s()     // Catch:{ all -> 0x15da }
            r32 = r10
            o.b r10 = r2.f33842g     // Catch:{ all -> 0x15da }
            r31 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            r41 = r9
            r9 = 0
            java.lang.Object r10 = r10.getOrDefault(r13, r9)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n7 r10 = (com.google.android.gms.measurement.internal.C15045n7) r10     // Catch:{ all -> 0x15da }
            if (r10 != 0) goto L_0x12da
            r40 = 0
            goto L_0x12e2
        L_0x12da:
            java.util.BitSet r9 = r10.f33713d     // Catch:{ all -> 0x15da }
            boolean r9 = r9.get(r15)     // Catch:{ all -> 0x15da }
            r40 = r9
        L_0x12e2:
            r33 = r1
            r34 = r6
            r35 = r7
            r36 = r11
            r37 = r4
            r39 = r3
            boolean r15 = r33.mo52290g(r34, r35, r36, r37, r39, r40)     // Catch:{ all -> 0x15da }
            if (r15 == 0) goto L_0x130c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n7 r6 = r2.mo52314k(r6)     // Catch:{ all -> 0x15da }
            r6.mo52270b(r1)     // Catch:{ all -> 0x15da }
            r1 = r17
            r6 = r25
            r7 = r29
            r13 = r31
            r10 = r32
            r9 = r41
            goto L_0x12a1
        L_0x130c:
            java.util.HashSet r1 = r2.f33841f     // Catch:{ all -> 0x15da }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            r1.add(r6)     // Catch:{ all -> 0x15da }
            goto L_0x1320
        L_0x1316:
            r17 = r1
            r25 = r6
            r29 = r7
            r41 = r9
            r32 = r10
        L_0x1320:
            if (r15 != 0) goto L_0x132b
            java.util.HashSet r1 = r2.f33841f     // Catch:{ all -> 0x15da }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x15da }
            r1.add(r6)     // Catch:{ all -> 0x15da }
        L_0x132b:
            r1 = r17
            r6 = r25
            r7 = r29
            r10 = r32
            r17 = r41
            goto L_0x1264
        L_0x1337:
            r29 = r7
            r32 = r10
            r41 = r17
            goto L_0x134c
        L_0x133e:
            r22 = r1
            r16 = r3
            r12 = r4
            r41 = r5
            r14 = r6
            r29 = r7
            r19 = r8
            r26 = r9
        L_0x134c:
            r4 = r12
            r6 = r14
            r3 = r16
            r8 = r19
            r1 = r22
            r9 = r26
            r7 = r29
            r5 = r41
            goto L_0x1079
        L_0x135c:
            boolean r1 = r18.isEmpty()     // Catch:{ all -> 0x1d83 }
            if (r1 == 0) goto L_0x1366
        L_0x1362:
            r9 = r26
            goto L_0x15de
        L_0x1366:
            o.b r1 = new o.b     // Catch:{ all -> 0x1d83 }
            r1.<init>()     // Catch:{ all -> 0x1d83 }
            java.util.Iterator r3 = r18.iterator()     // Catch:{ all -> 0x1d83 }
        L_0x136f:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x1d83 }
            if (r4 == 0) goto L_0x1362
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.k3 r4 = (com.google.android.gms.internal.measurement.C14702k3) r4     // Catch:{ all -> 0x15da }
            java.lang.String r5 = r4.mo50629w()     // Catch:{ all -> 0x15da }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x15da }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x15da }
            if (r6 != 0) goto L_0x1465
            com.google.android.gms.measurement.internal.f7 r6 = r2.f34048c     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.h r6 = r6.mo52010M()     // Catch:{ all -> 0x15da }
            java.lang.String r7 = r2.f33840e     // Catch:{ all -> 0x15da }
            r6.mo51942h()     // Catch:{ all -> 0x15da }
            r6.mo51995g()     // Catch:{ all -> 0x15da }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)     // Catch:{ all -> 0x15da }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)     // Catch:{ all -> 0x15da }
            o.b r8 = new o.b     // Catch:{ all -> 0x15da }
            r8.<init>()     // Catch:{ all -> 0x15da }
            android.database.sqlite.SQLiteDatabase r31 = r6.mo52052B()     // Catch:{ all -> 0x15da }
            r9 = r26
            java.lang.String[] r33 = new java.lang.String[]{r9, r12}     // Catch:{ SQLiteException -> 0x1436, all -> 0x1432 }
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x1436, all -> 0x1432 }
            r10 = 0
            r11[r10] = r7     // Catch:{ SQLiteException -> 0x1436, all -> 0x1432 }
            r10 = 1
            r11[r10] = r5     // Catch:{ SQLiteException -> 0x1436, all -> 0x1432 }
            java.lang.String r32 = "property_filters"
            java.lang.String r34 = "app_id=? AND property_name=?"
            r36 = 0
            r37 = 0
            r38 = 0
            r35 = r11
            android.database.Cursor r10 = r31.query(r32, r33, r34, r35, r36, r37, r38)     // Catch:{ SQLiteException -> 0x1436, all -> 0x1432 }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x142e }
            if (r11 == 0) goto L_0x1424
        L_0x13c9:
            r11 = 1
            byte[] r13 = r10.getBlob(r11)     // Catch:{ SQLiteException -> 0x142e }
            com.google.android.gms.internal.measurement.w1 r11 = com.google.android.gms.internal.measurement.C14863x1.m24113t()     // Catch:{ IOException -> 0x13fd }
            com.google.android.gms.internal.measurement.q5 r11 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r11, r13)     // Catch:{ IOException -> 0x13fd }
            com.google.android.gms.internal.measurement.w1 r11 = (com.google.android.gms.internal.measurement.C14851w1) r11     // Catch:{ IOException -> 0x13fd }
            com.google.android.gms.internal.measurement.t5 r11 = r11.mo50807h()     // Catch:{ IOException -> 0x13fd }
            com.google.android.gms.internal.measurement.x1 r11 = (com.google.android.gms.internal.measurement.C14863x1) r11     // Catch:{ IOException -> 0x13fd }
            r13 = 0
            int r15 = r10.getInt(r13)     // Catch:{ SQLiteException -> 0x142e }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x142e }
            java.lang.Object r15 = r8.get(r13)     // Catch:{ SQLiteException -> 0x142e }
            java.util.List r15 = (java.util.List) r15     // Catch:{ SQLiteException -> 0x142e }
            if (r15 != 0) goto L_0x13f7
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x142e }
            r15.<init>()     // Catch:{ SQLiteException -> 0x142e }
            r8.put(r13, r15)     // Catch:{ SQLiteException -> 0x142e }
        L_0x13f7:
            r15.add(r11)     // Catch:{ SQLiteException -> 0x142e }
            r16 = r3
            goto L_0x1416
        L_0x13fd:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.o4 r13 = r6.f33681b     // Catch:{ SQLiteException -> 0x142e }
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13     // Catch:{ SQLiteException -> 0x142e }
            com.google.android.gms.measurement.internal.o2 r13 = r13.mo52016b()     // Catch:{ SQLiteException -> 0x142e }
            com.google.android.gms.measurement.internal.m2 r13 = r13.mo52275l()     // Catch:{ SQLiteException -> 0x142e }
            java.lang.String r15 = "Failed to merge filter"
            r16 = r3
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r7)     // Catch:{ SQLiteException -> 0x142b }
            r13.mo52239c(r3, r15, r11)     // Catch:{ SQLiteException -> 0x142b }
        L_0x1416:
            boolean r3 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x142b }
            if (r3 != 0) goto L_0x1421
            r10.close()     // Catch:{ all -> 0x15da }
            r6 = r8
            goto L_0x1458
        L_0x1421:
            r3 = r16
            goto L_0x13c9
        L_0x1424:
            r16 = r3
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x142b }
            goto L_0x1454
        L_0x142b:
            r0 = move-exception
        L_0x142c:
            r3 = r0
            goto L_0x143b
        L_0x142e:
            r0 = move-exception
            r16 = r3
            goto L_0x142c
        L_0x1432:
            r0 = move-exception
            r1 = r0
            r15 = 0
            goto L_0x145f
        L_0x1436:
            r0 = move-exception
            r16 = r3
            r3 = r0
            r10 = 0
        L_0x143b:
            com.google.android.gms.measurement.internal.o4 r6 = r6.f33681b     // Catch:{ all -> 0x145c }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ all -> 0x145c }
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()     // Catch:{ all -> 0x145c }
            com.google.android.gms.measurement.internal.m2 r6 = r6.mo52275l()     // Catch:{ all -> 0x145c }
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r7)     // Catch:{ all -> 0x145c }
            r6.mo52239c(r7, r14, r3)     // Catch:{ all -> 0x145c }
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x145c }
            if (r10 == 0) goto L_0x1457
        L_0x1454:
            r10.close()     // Catch:{ all -> 0x15da }
        L_0x1457:
            r6 = r3
        L_0x1458:
            r1.put(r5, r6)     // Catch:{ all -> 0x15da }
            goto L_0x1469
        L_0x145c:
            r0 = move-exception
            r1 = r0
            r15 = r10
        L_0x145f:
            if (r15 == 0) goto L_0x1464
            r15.close()     // Catch:{ all -> 0x15da }
        L_0x1464:
            throw r1     // Catch:{ all -> 0x15da }
        L_0x1465:
            r16 = r3
            r9 = r26
        L_0x1469:
            java.util.Set r3 = r6.keySet()     // Catch:{ all -> 0x15da }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x15da }
        L_0x1471:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x15da }
            if (r5 == 0) goto L_0x15cc
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x15da }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x15da }
            int r5 = r5.intValue()     // Catch:{ all -> 0x15da }
            java.util.HashSet r7 = r2.f33841f     // Catch:{ all -> 0x15da }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x15da }
            boolean r7 = r7.contains(r8)     // Catch:{ all -> 0x15da }
            if (r7 == 0) goto L_0x14a2
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52276m()     // Catch:{ all -> 0x15da }
            r7 = r41
            r3.mo52238b(r8, r7)     // Catch:{ all -> 0x15da }
            r17 = r1
            goto L_0x15d0
        L_0x14a2:
            r7 = r41
            java.lang.Object r8 = r6.get(r8)     // Catch:{ all -> 0x15da }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x15da }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x15da }
            r10 = 1
        L_0x14af:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x15b1
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.x1 r10 = (com.google.android.gms.internal.measurement.C14863x1) r10     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o4 r11 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r11 = (com.google.android.gms.measurement.internal.C15103u3) r11     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r11 = r11.mo52016b()     // Catch:{ all -> 0x15da }
            java.lang.String r11 = r11.mo52279s()     // Catch:{ all -> 0x15da }
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)     // Catch:{ all -> 0x15da }
            if (r11 == 0) goto L_0x1525
            com.google.android.gms.measurement.internal.o4 r11 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r11 = (com.google.android.gms.measurement.internal.C15103u3) r11     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r11 = r11.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r11 = r11.mo52276m()     // Catch:{ all -> 0x15da }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x15da }
            boolean r15 = r10.mo50961A()     // Catch:{ all -> 0x15da }
            if (r15 == 0) goto L_0x14ef
            int r15 = r10.mo50963r()     // Catch:{ all -> 0x15da }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x15da }
            r17 = r1
            goto L_0x14f2
        L_0x14ef:
            r17 = r1
            r15 = 0
        L_0x14f2:
            com.google.android.gms.measurement.internal.o4 r1 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.j2 r1 = r1.mo52329p()     // Catch:{ all -> 0x15da }
            r18 = r3
            java.lang.String r3 = r10.mo50965v()     // Catch:{ all -> 0x15da }
            java.lang.String r1 = r1.mo52144f(r3)     // Catch:{ all -> 0x15da }
            java.lang.String r3 = "Evaluating filter. audience, filter, property"
            r11.mo52240d(r13, r15, r1, r3)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o4 r1 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r1 = r1.mo52276m()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.f7 r3 = r2.f34048c     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.h7 r3 = r3.mo52012P()     // Catch:{ all -> 0x15da }
            java.lang.String r3 = r3.mo52106B(r10)     // Catch:{ all -> 0x15da }
            java.lang.String r11 = "Filter definition"
            r1.mo52238b(r3, r11)     // Catch:{ all -> 0x15da }
            goto L_0x1529
        L_0x1525:
            r17 = r1
            r18 = r3
        L_0x1529:
            boolean r1 = r10.mo50961A()     // Catch:{ all -> 0x15da }
            if (r1 == 0) goto L_0x1583
            int r1 = r10.mo50963r()     // Catch:{ all -> 0x15da }
            r3 = 256(0x100, float:3.59E-43)
            if (r1 <= r3) goto L_0x1538
            goto L_0x1583
        L_0x1538:
            com.google.android.gms.measurement.internal.r7 r1 = new com.google.android.gms.measurement.internal.r7     // Catch:{ all -> 0x15da }
            java.lang.String r3 = r2.f33840e     // Catch:{ all -> 0x15da }
            r1.<init>(r2, r3, r5, r10)     // Catch:{ all -> 0x15da }
            java.lang.Long r3 = r2.f33843h     // Catch:{ all -> 0x15da }
            java.lang.Long r11 = r2.f33844i     // Catch:{ all -> 0x15da }
            int r10 = r10.mo50963r()     // Catch:{ all -> 0x15da }
            o.b r13 = r2.f33842g     // Catch:{ all -> 0x15da }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x15da }
            r19 = r6
            r6 = 0
            java.lang.Object r13 = r13.getOrDefault(r15, r6)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n7 r13 = (com.google.android.gms.measurement.internal.C15045n7) r13     // Catch:{ all -> 0x15da }
            if (r13 != 0) goto L_0x155a
            r6 = 0
            goto L_0x1560
        L_0x155a:
            java.util.BitSet r6 = r13.f33713d     // Catch:{ all -> 0x15da }
            boolean r6 = r6.get(r10)     // Catch:{ all -> 0x15da }
        L_0x1560:
            boolean r10 = r1.mo52302g(r3, r11, r4, r6)     // Catch:{ all -> 0x15da }
            if (r10 == 0) goto L_0x1579
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n7 r3 = r2.mo52314k(r3)     // Catch:{ all -> 0x15da }
            r3.mo52270b(r1)     // Catch:{ all -> 0x15da }
            r1 = r17
            r3 = r18
            r6 = r19
            goto L_0x14af
        L_0x1579:
            java.util.HashSet r1 = r2.f33841f     // Catch:{ all -> 0x15da }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x15da }
            r1.add(r3)     // Catch:{ all -> 0x15da }
            goto L_0x15b7
        L_0x1583:
            r19 = r6
            com.google.android.gms.measurement.internal.o4 r1 = r2.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r1 = r1.mo52277n()     // Catch:{ all -> 0x15da }
            java.lang.String r3 = r2.f33840e     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r3)     // Catch:{ all -> 0x15da }
            boolean r6 = r10.mo50961A()     // Catch:{ all -> 0x15da }
            if (r6 == 0) goto L_0x15a6
            int r6 = r10.mo50963r()     // Catch:{ all -> 0x15da }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x15da }
            goto L_0x15a7
        L_0x15a6:
            r6 = 0
        L_0x15a7:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x15da }
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r1.mo52239c(r3, r8, r6)     // Catch:{ all -> 0x15da }
            goto L_0x15b9
        L_0x15b1:
            r17 = r1
            r18 = r3
            r19 = r6
        L_0x15b7:
            if (r10 != 0) goto L_0x15c2
        L_0x15b9:
            java.util.HashSet r1 = r2.f33841f     // Catch:{ all -> 0x15da }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x15da }
            r1.add(r3)     // Catch:{ all -> 0x15da }
        L_0x15c2:
            r41 = r7
            r1 = r17
            r3 = r18
            r6 = r19
            goto L_0x1471
        L_0x15cc:
            r17 = r1
            r7 = r41
        L_0x15d0:
            r41 = r7
            r26 = r9
            r3 = r16
            r1 = r17
            goto L_0x136f
        L_0x15da:
            r0 = move-exception
            r1 = r0
            goto L_0x16a3
        L_0x15de:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x1d83 }
            r1.<init>()     // Catch:{ all -> 0x1d83 }
            o.b r3 = r2.f33842g     // Catch:{ all -> 0x1d83 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x1d83 }
            java.util.HashSet r4 = r2.f33841f     // Catch:{ all -> 0x1d83 }
            o.h$c r3 = (p193o.C7500h.C7503c) r3     // Catch:{ all -> 0x1d83 }
            r3.removeAll(r4)     // Catch:{ all -> 0x1d83 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x1d83 }
        L_0x15f4:
            r4 = r3
            o.h$a r4 = (p193o.C7500h.C7501a) r4     // Catch:{ all -> 0x1d83 }
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x1d83 }
            r6 = -1
            java.lang.String r8 = "app_id"
            if (r5 == 0) goto L_0x1692
            java.lang.Object r4 = r4.next()     // Catch:{ all -> 0x15da }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x15da }
            int r4 = r4.intValue()     // Catch:{ all -> 0x15da }
            o.b r5 = r2.f33842g     // Catch:{ all -> 0x15da }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x15da }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n7 r5 = (com.google.android.gms.measurement.internal.C15045n7) r5     // Catch:{ all -> 0x15da }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.m2 r4 = r5.mo52269a(r4)     // Catch:{ all -> 0x15da }
            r1.add(r4)     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.f7 r5 = r2.f34048c     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.h r5 = r5.mo52010M()     // Catch:{ all -> 0x15da }
            java.lang.String r11 = r2.f33840e     // Catch:{ all -> 0x15da }
            com.google.android.gms.internal.measurement.g3 r4 = r4.mo50675u()     // Catch:{ all -> 0x15da }
            r5.mo51942h()     // Catch:{ all -> 0x15da }
            r5.mo51995g()     // Catch:{ all -> 0x15da }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)     // Catch:{ all -> 0x15da }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x15da }
            byte[] r4 = r4.mo50868i()     // Catch:{ all -> 0x15da }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x15da }
            r13.<init>()     // Catch:{ all -> 0x15da }
            r13.put(r8, r11)     // Catch:{ all -> 0x15da }
            r13.put(r9, r10)     // Catch:{ all -> 0x15da }
            r8 = r22
            r13.put(r8, r4)     // Catch:{ all -> 0x15da }
            android.database.sqlite.SQLiteDatabase r4 = r5.mo52052B()     // Catch:{ SQLiteException -> 0x1676 }
            java.lang.String r10 = "audience_filter_values"
            r14 = 5
            r15 = 0
            long r16 = r4.insertWithOnConflict(r10, r15, r13, r14)     // Catch:{ SQLiteException -> 0x1673 }
            int r4 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x168e
            com.google.android.gms.measurement.internal.o4 r4 = r5.f33681b     // Catch:{ SQLiteException -> 0x1673 }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ SQLiteException -> 0x1673 }
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()     // Catch:{ SQLiteException -> 0x1673 }
            com.google.android.gms.measurement.internal.m2 r4 = r4.mo52275l()     // Catch:{ SQLiteException -> 0x1673 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r11)     // Catch:{ SQLiteException -> 0x1673 }
            r4.mo52238b(r7, r6)     // Catch:{ SQLiteException -> 0x1673 }
            goto L_0x168e
        L_0x1673:
            r0 = move-exception
        L_0x1674:
            r4 = r0
            goto L_0x1679
        L_0x1676:
            r0 = move-exception
            r14 = 5
            goto L_0x1674
        L_0x1679:
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52275l()     // Catch:{ all -> 0x15da }
            com.google.android.gms.measurement.internal.n2 r6 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r11)     // Catch:{ all -> 0x15da }
            java.lang.String r7 = "Error storing filter results. appId"
            r5.mo52239c(r6, r7, r4)     // Catch:{ all -> 0x15da }
        L_0x168e:
            r22 = r8
            goto L_0x15f4
        L_0x1692:
            r9 = r27
            boolean r2 = r9.f33059d     // Catch:{ all -> 0x1d7a }
            if (r2 == 0) goto L_0x16a7
            r9.mo50809j()     // Catch:{ all -> 0x16a1 }
            r2 = 0
            r9.f33059d = r2     // Catch:{ all -> 0x16a1 }
            goto L_0x16a7
        L_0x169f:
            r1 = r0
            goto L_0x16a3
        L_0x16a1:
            r0 = move-exception
            goto L_0x169f
        L_0x16a3:
            r11 = r68
            goto L_0x19df
        L_0x16a7:
            MessageType r2 = r9.f33058c     // Catch:{ all -> 0x1d7e }
            com.google.android.gms.internal.measurement.a3 r2 = (com.google.android.gms.internal.measurement.C14572a3) r2     // Catch:{ all -> 0x1d7e }
            com.google.android.gms.internal.measurement.C14572a3.m23288d0(r2, r1)     // Catch:{ all -> 0x1d7e }
            com.google.android.gms.measurement.internal.d r1 = r68.mo52008K()     // Catch:{ all -> 0x1d7a }
            r2 = r20
            com.google.android.gms.internal.measurement.a3 r3 = r2.f33457a     // Catch:{ all -> 0x1d7a }
            java.lang.String r3 = r3.mo50295C1()     // Catch:{ all -> 0x1d7a }
            boolean r1 = r1.mo51976s(r3)     // Catch:{ all -> 0x1d7a }
            if (r1 == 0) goto L_0x1a36
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x1d7a }
            r1.<init>()     // Catch:{ all -> 0x1d7a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x1d7a }
            r3.<init>()     // Catch:{ all -> 0x1d7a }
            com.google.android.gms.measurement.internal.k7 r4 = r68.mo52013Q()     // Catch:{ all -> 0x1d7a }
            java.security.SecureRandom r4 = r4.mo52218o()     // Catch:{ all -> 0x1d7a }
            r5 = 0
        L_0x16d3:
            MessageType r10 = r9.f33058c     // Catch:{ all -> 0x1d7a }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x1a32 }
            int r10 = r10.mo50319h1()     // Catch:{ all -> 0x1a32 }
            if (r5 >= r10) goto L_0x19e2
            MessageType r10 = r9.f33058c     // Catch:{ all -> 0x1d7a }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x19db }
            com.google.android.gms.internal.measurement.q2 r10 = r10.mo50349x1(r5)     // Catch:{ all -> 0x19db }
            com.google.android.gms.internal.measurement.q5 r10 = r10.mo50872n()     // Catch:{ all -> 0x1d7a }
            com.google.android.gms.internal.measurement.p2 r10 = (com.google.android.gms.internal.measurement.C14766p2) r10     // Catch:{ all -> 0x1d7a }
            java.lang.String r11 = r10.mo50773v()     // Catch:{ all -> 0x1d7a }
            java.lang.String r13 = "_ep"
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x1d7a }
            java.lang.String r13 = "_sr"
            java.lang.String r14 = "_efs"
            if (r11 == 0) goto L_0x177f
            r11 = r68
            com.google.android.gms.measurement.internal.h7 r15 = r11.f33492h     // Catch:{ all -> 0x1dca }
            m24287I(r15)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.t5 r15 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r15 = (com.google.android.gms.internal.measurement.C14779q2) r15     // Catch:{ all -> 0x1dca }
            java.lang.String r6 = "_en"
            java.io.Serializable r6 = com.google.android.gms.measurement.internal.C14991h7.m24382m(r15, r6)     // Catch:{ all -> 0x1dca }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x1dca }
            java.lang.Object r7 = r1.get(r6)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n r7 = (com.google.android.gms.measurement.internal.C15037n) r7     // Catch:{ all -> 0x1dca }
            if (r7 != 0) goto L_0x1737
            com.google.android.gms.measurement.internal.h r7 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r7)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r15 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r15 = r15.mo50295C1()     // Catch:{ all -> 0x1dca }
            java.lang.Object r18 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ all -> 0x1dca }
            r25 = r12
            r12 = r18
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n r7 = r7.mo52057G(r15, r12)     // Catch:{ all -> 0x1dca }
            if (r7 == 0) goto L_0x1739
            r1.put(r6, r7)     // Catch:{ all -> 0x1dca }
            goto L_0x1739
        L_0x1737:
            r25 = r12
        L_0x1739:
            if (r7 == 0) goto L_0x1778
            java.lang.Long r6 = r7.f33694i     // Catch:{ all -> 0x1dca }
            if (r6 != 0) goto L_0x1778
            java.lang.Long r6 = r7.f33695j     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x1757
            long r18 = r6.longValue()     // Catch:{ all -> 0x1dca }
            r26 = 1
            int r6 = (r18 > r26 ? 1 : (r18 == r26 ? 0 : -1))
            if (r6 <= 0) goto L_0x1757
            com.google.android.gms.measurement.internal.h7 r6 = r11.f33492h     // Catch:{ all -> 0x1dca }
            m24287I(r6)     // Catch:{ all -> 0x1dca }
            java.lang.Long r6 = r7.f33695j     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r10, r13, r6)     // Catch:{ all -> 0x1dca }
        L_0x1757:
            java.lang.Boolean r6 = r7.f33696k     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x176f
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x176f
            com.google.android.gms.measurement.internal.h7 r6 = r11.f33492h     // Catch:{ all -> 0x1dca }
            m24287I(r6)     // Catch:{ all -> 0x1dca }
            r6 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r10, r14, r12)     // Catch:{ all -> 0x1dca }
        L_0x176f:
            com.google.android.gms.internal.measurement.t5 r6 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r6 = (com.google.android.gms.internal.measurement.C14779q2) r6     // Catch:{ all -> 0x1dca }
            r3.add(r6)     // Catch:{ all -> 0x1dca }
        L_0x1778:
            r9.mo50997p(r5, r10)     // Catch:{ all -> 0x1dca }
            r22 = r8
            goto L_0x1901
        L_0x177f:
            r11 = r68
            r25 = r12
            com.google.android.gms.measurement.internal.n3 r6 = r11.f33486b     // Catch:{ all -> 0x1dca }
            m24287I(r6)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r7 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r7 = r7.mo50295C1()     // Catch:{ all -> 0x1dca }
            java.lang.String r12 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r12 = r6.mo51945e(r7, r12)     // Catch:{ all -> 0x1dca }
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1dca }
            if (r15 != 0) goto L_0x17b6
            long r6 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x179f }
            goto L_0x17b8
        L_0x179f:
            r0 = move-exception
            r12 = r0
            com.google.android.gms.measurement.internal.o4 r6 = r6.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r6 = r6.mo52277n()     // Catch:{ all -> 0x1dca }
            java.lang.String r15 = "Unable to parse timezone offset. appId"
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r7)     // Catch:{ all -> 0x1dca }
            r6.mo52239c(r7, r15, r12)     // Catch:{ all -> 0x1dca }
        L_0x17b6:
            r6 = 0
        L_0x17b8:
            com.google.android.gms.measurement.internal.k7 r12 = r68.mo52013Q()     // Catch:{ all -> 0x1dca }
            long r18 = r10.mo50767p()     // Catch:{ all -> 0x1dca }
            r12.getClass()     // Catch:{ all -> 0x1dca }
            r26 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 * r26
            long r18 = r6 + r18
            r12 = r14
            r22 = 86400000(0x5265c00, double:4.2687272E-316)
            long r14 = r18 / r22
            com.google.android.gms.internal.measurement.t5 r18 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r18 = (com.google.android.gms.internal.measurement.C14779q2) r18     // Catch:{ all -> 0x1dca }
            r22 = r8
            r19 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x1dca }
            r19 = r12
            java.lang.String r12 = "_dbg"
            boolean r20 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1dca }
            if (r20 != 0) goto L_0x181c
            com.google.android.gms.internal.measurement.z5 r18 = r18.mo50801z()     // Catch:{ all -> 0x1dca }
            java.util.Iterator r18 = r18.iterator()     // Catch:{ all -> 0x1dca }
        L_0x17f0:
            boolean r20 = r18.hasNext()     // Catch:{ all -> 0x1dca }
            if (r20 == 0) goto L_0x181c
            java.lang.Object r20 = r18.next()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.u2 r20 = (com.google.android.gms.internal.measurement.C14828u2) r20     // Catch:{ all -> 0x1dca }
            r26 = r6
            java.lang.String r6 = r20.mo50887x()     // Catch:{ all -> 0x1dca }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x1819
            long r6 = r20.mo50886u()     // Catch:{ all -> 0x1dca }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x1dca }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x1dca }
            if (r6 != 0) goto L_0x1817
            goto L_0x181e
        L_0x1817:
            r6 = 1
            goto L_0x1831
        L_0x1819:
            r6 = r26
            goto L_0x17f0
        L_0x181c:
            r26 = r6
        L_0x181e:
            com.google.android.gms.measurement.internal.n3 r6 = r11.f33486b     // Catch:{ all -> 0x1dca }
            m24287I(r6)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r7 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r7 = r7.mo50295C1()     // Catch:{ all -> 0x1dca }
            java.lang.String r8 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            int r6 = r6.mo52254k(r7, r8)     // Catch:{ all -> 0x1dca }
        L_0x1831:
            if (r6 > 0) goto L_0x1856
            com.google.android.gms.measurement.internal.o2 r7 = r68.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r7 = r7.mo52277n()     // Catch:{ all -> 0x1dca }
            java.lang.String r8 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1dca }
            r7.mo52239c(r12, r8, r6)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.t5 r6 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r6 = (com.google.android.gms.internal.measurement.C14779q2) r6     // Catch:{ all -> 0x1dca }
            r3.add(r6)     // Catch:{ all -> 0x1dca }
            r9.mo50997p(r5, r10)     // Catch:{ all -> 0x1dca }
            goto L_0x1901
        L_0x1856:
            java.lang.String r7 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n r7 = (com.google.android.gms.measurement.internal.C15037n) r7     // Catch:{ all -> 0x1dca }
            if (r7 != 0) goto L_0x18b6
            com.google.android.gms.measurement.internal.h r7 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r7)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r8 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r8 = r8.mo50295C1()     // Catch:{ all -> 0x1dca }
            java.lang.String r12 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n r7 = r7.mo52057G(r8, r12)     // Catch:{ all -> 0x1dca }
            if (r7 != 0) goto L_0x18b6
            com.google.android.gms.measurement.internal.o2 r7 = r68.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r7 = r7.mo52277n()     // Catch:{ all -> 0x1dca }
            java.lang.String r8 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.a3 r12 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r12 = r12.mo50295C1()     // Catch:{ all -> 0x1dca }
            r28 = r14
            java.lang.String r14 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            r7.mo52239c(r12, r8, r14)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n r7 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r8 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r32 = r8.mo50295C1()     // Catch:{ all -> 0x1dca }
            java.lang.String r33 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            r34 = 1
            r36 = 1
            r38 = 1
            long r40 = r10.mo50767p()     // Catch:{ all -> 0x1dca }
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r31 = r7
            r31.<init>(r32, r33, r34, r36, r38, r40, r42, r44, r45, r46, r47)     // Catch:{ all -> 0x1dca }
            goto L_0x18b8
        L_0x18b6:
            r28 = r14
        L_0x18b8:
            com.google.android.gms.measurement.internal.h7 r8 = r11.f33492h     // Catch:{ all -> 0x1dca }
            m24287I(r8)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.t5 r8 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r8 = (com.google.android.gms.internal.measurement.C14779q2) r8     // Catch:{ all -> 0x1dca }
            java.lang.String r12 = "_eid"
            java.io.Serializable r8 = com.google.android.gms.measurement.internal.C14991h7.m24382m(r8, r12)     // Catch:{ all -> 0x1dca }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x1dca }
            if (r8 == 0) goto L_0x18cf
            r12 = 1
            goto L_0x18d0
        L_0x18cf:
            r12 = 0
        L_0x18d0:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x1dca }
            r14 = 1
            if (r6 != r14) goto L_0x1909
            com.google.android.gms.internal.measurement.t5 r6 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r6 = (com.google.android.gms.internal.measurement.C14779q2) r6     // Catch:{ all -> 0x1dca }
            r3.add(r6)     // Catch:{ all -> 0x1dca }
            boolean r6 = r12.booleanValue()     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x18fe
            java.lang.Long r6 = r7.f33694i     // Catch:{ all -> 0x1dca }
            if (r6 != 0) goto L_0x18f2
            java.lang.Long r6 = r7.f33695j     // Catch:{ all -> 0x1dca }
            if (r6 != 0) goto L_0x18f2
            java.lang.Boolean r6 = r7.f33696k     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x18fe
        L_0x18f2:
            r6 = 0
            com.google.android.gms.measurement.internal.n r7 = r7.mo52252a(r6, r6, r6)     // Catch:{ all -> 0x1dca }
            java.lang.String r6 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            r1.put(r6, r7)     // Catch:{ all -> 0x1dca }
        L_0x18fe:
            r9.mo50997p(r5, r10)     // Catch:{ all -> 0x1dca }
        L_0x1901:
            r18 = r4
            r4 = r5
            r23 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x19cd
        L_0x1909:
            int r14 = r4.nextInt(r6)     // Catch:{ all -> 0x1dca }
            if (r14 != 0) goto L_0x1949
            com.google.android.gms.measurement.internal.h7 r8 = r11.f33492h     // Catch:{ all -> 0x1dca }
            m24287I(r8)     // Catch:{ all -> 0x1dca }
            long r14 = (long) r6     // Catch:{ all -> 0x1dca }
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r10, r13, r6)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.t5 r8 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r8 = (com.google.android.gms.internal.measurement.C14779q2) r8     // Catch:{ all -> 0x1dca }
            r3.add(r8)     // Catch:{ all -> 0x1dca }
            boolean r8 = r12.booleanValue()     // Catch:{ all -> 0x1dca }
            if (r8 == 0) goto L_0x1930
            r8 = 0
            com.google.android.gms.measurement.internal.n r7 = r7.mo52252a(r8, r6, r8)     // Catch:{ all -> 0x1dca }
        L_0x1930:
            java.lang.String r6 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            long r12 = r10.mo50767p()     // Catch:{ all -> 0x1dca }
            r14 = r28
            com.google.android.gms.measurement.internal.n r7 = r7.mo52253b(r12, r14)     // Catch:{ all -> 0x1dca }
            r1.put(r6, r7)     // Catch:{ all -> 0x1dca }
            r18 = r4
            r4 = r5
            r23 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x19ca
        L_0x1949:
            r18 = r4
            r14 = r28
            java.lang.Long r4 = r7.f33693h     // Catch:{ all -> 0x1dca }
            if (r4 == 0) goto L_0x1959
            long r26 = r4.longValue()     // Catch:{ all -> 0x1dca }
            r23 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x196b
        L_0x1959:
            com.google.android.gms.measurement.internal.k7 r4 = r68.mo52013Q()     // Catch:{ all -> 0x1dca }
            long r28 = r10.mo50766o()     // Catch:{ all -> 0x1dca }
            r4.getClass()     // Catch:{ all -> 0x1dca }
            long r26 = r26 + r28
            r23 = 86400000(0x5265c00, double:4.2687272E-316)
            long r26 = r26 / r23
        L_0x196b:
            int r4 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x19b4
            com.google.android.gms.measurement.internal.h7 r4 = r11.f33492h     // Catch:{ all -> 0x1dca }
            m24287I(r4)     // Catch:{ all -> 0x1dca }
            r26 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x1dca }
            r8 = r19
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r10, r8, r4)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.h7 r4 = r11.f33492h     // Catch:{ all -> 0x1dca }
            m24287I(r4)     // Catch:{ all -> 0x1dca }
            r19 = r5
            long r4 = (long) r6     // Catch:{ all -> 0x1dca }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.C14991h7.m24380k(r10, r13, r4)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.t5 r5 = r10.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.q2 r5 = (com.google.android.gms.internal.measurement.C14779q2) r5     // Catch:{ all -> 0x1dca }
            r3.add(r5)     // Catch:{ all -> 0x1dca }
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x1dca }
            if (r5 == 0) goto L_0x19a4
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x1dca }
            r6 = 0
            com.google.android.gms.measurement.internal.n r7 = r7.mo52252a(r6, r4, r5)     // Catch:{ all -> 0x1dca }
        L_0x19a4:
            java.lang.String r4 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            long r5 = r10.mo50767p()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n r5 = r7.mo52253b(r5, r14)     // Catch:{ all -> 0x1dca }
            r1.put(r4, r5)     // Catch:{ all -> 0x1dca }
            goto L_0x19c8
        L_0x19b4:
            r19 = r5
            boolean r4 = r12.booleanValue()     // Catch:{ all -> 0x1dca }
            if (r4 == 0) goto L_0x19c8
            java.lang.String r4 = r10.mo50773v()     // Catch:{ all -> 0x1dca }
            r5 = 0
            com.google.android.gms.measurement.internal.n r6 = r7.mo52252a(r8, r5, r5)     // Catch:{ all -> 0x1dca }
            r1.put(r4, r6)     // Catch:{ all -> 0x1dca }
        L_0x19c8:
            r4 = r19
        L_0x19ca:
            r9.mo50997p(r4, r10)     // Catch:{ all -> 0x1dca }
        L_0x19cd:
            int r5 = r4 + 1
            r4 = r18
            r8 = r22
            r12 = r25
            r6 = -1
            goto L_0x16d3
        L_0x19d9:
            r1 = r0
            goto L_0x19df
        L_0x19db:
            r0 = move-exception
            r11 = r68
            goto L_0x19d9
        L_0x19df:
            r2 = r1
            goto L_0x1dcf
        L_0x19e2:
            r11 = r68
            r22 = r8
            r25 = r12
            int r4 = r3.size()     // Catch:{ all -> 0x1dca }
            MessageType r5 = r9.f33058c     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x1a30 }
            int r5 = r5.mo50319h1()     // Catch:{ all -> 0x1a30 }
            if (r4 >= r5) goto L_0x1a0d
            boolean r4 = r9.f33059d     // Catch:{ all -> 0x1dca }
            if (r4 == 0) goto L_0x1a00
            r9.mo50809j()     // Catch:{ all -> 0x1a0b }
            r4 = 0
            r9.f33059d = r4     // Catch:{ all -> 0x1a0b }
        L_0x1a00:
            MessageType r4 = r9.f33058c     // Catch:{ all -> 0x1a0b }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ all -> 0x1a0b }
            com.google.android.gms.internal.measurement.C14572a3.m23298u0(r4)     // Catch:{ all -> 0x1a0b }
            r9.mo51002u(r3)     // Catch:{ all -> 0x1dca }
            goto L_0x1a0d
        L_0x1a0b:
            r0 = move-exception
            goto L_0x19d9
        L_0x1a0d:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x1dca }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x1dca }
        L_0x1a15:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x1dca }
            if (r3 == 0) goto L_0x1a3c
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x1dca }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.h r4 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r4)     // Catch:{ all -> 0x1dca }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n r3 = (com.google.android.gms.measurement.internal.C15037n) r3     // Catch:{ all -> 0x1dca }
            r4.mo52073o(r3)     // Catch:{ all -> 0x1dca }
            goto L_0x1a15
        L_0x1a30:
            r0 = move-exception
            goto L_0x19d9
        L_0x1a32:
            r0 = move-exception
            r11 = r68
            goto L_0x19d9
        L_0x1a36:
            r11 = r68
            r22 = r8
            r25 = r12
        L_0x1a3c:
            com.google.android.gms.internal.measurement.a3 r1 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r1 = r1.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.h r3 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r3)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo52053C(r1)     // Catch:{ all -> 0x1dca }
            if (r3 != 0) goto L_0x1a66
            com.google.android.gms.measurement.internal.o2 r3 = r68.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52275l()     // Catch:{ all -> 0x1dca }
            java.lang.String r4 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.a3 r5 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r5 = r5.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r5)     // Catch:{ all -> 0x1dca }
            r3.mo52238b(r5, r4)     // Catch:{ all -> 0x1dca }
            goto L_0x1b55
        L_0x1a66:
            MessageType r4 = r9.f33058c     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ all -> 0x1d77 }
            int r4 = r4.mo50319h1()     // Catch:{ all -> 0x1d77 }
            if (r4 <= 0) goto L_0x1b55
            com.google.android.gms.measurement.internal.u3 r4 = r3.f34015a     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo52015a()     // Catch:{ all -> 0x1b52 }
            r4.mo51995g()     // Catch:{ all -> 0x1b52 }
            long r4 = r3.f34023i     // Catch:{ all -> 0x1b52 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x1a96
            boolean r6 = r9.f33059d     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x1a8b
            r9.mo50809j()     // Catch:{ all -> 0x1a93 }
            r6 = 0
            r9.f33059d = r6     // Catch:{ all -> 0x1a93 }
        L_0x1a8b:
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x1a93 }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x1a93 }
            com.google.android.gms.internal.measurement.C14572a3.m23255E0(r6, r4)     // Catch:{ all -> 0x1a93 }
            goto L_0x1a99
        L_0x1a93:
            r0 = move-exception
            goto L_0x19d9
        L_0x1a96:
            r9.mo50989C()     // Catch:{ all -> 0x1dca }
        L_0x1a99:
            com.google.android.gms.measurement.internal.u3 r6 = r3.f34015a     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo52015a()     // Catch:{ all -> 0x1b4f }
            r6.mo51995g()     // Catch:{ all -> 0x1b4f }
            long r6 = r3.f34022h     // Catch:{ all -> 0x1b4f }
            r12 = 0
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x1aab
            goto L_0x1aac
        L_0x1aab:
            r4 = r6
        L_0x1aac:
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x1ac5
            boolean r6 = r9.f33059d     // Catch:{ all -> 0x1dca }
            if (r6 == 0) goto L_0x1aba
            r9.mo50809j()     // Catch:{ all -> 0x1ac2 }
            r6 = 0
            r9.f33059d = r6     // Catch:{ all -> 0x1ac2 }
        L_0x1aba:
            MessageType r6 = r9.f33058c     // Catch:{ all -> 0x1ac2 }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x1ac2 }
            com.google.android.gms.internal.measurement.C14572a3.m23253C0(r6, r4)     // Catch:{ all -> 0x1ac2 }
            goto L_0x1ac8
        L_0x1ac2:
            r0 = move-exception
            goto L_0x19d9
        L_0x1ac5:
            r9.mo50990D()     // Catch:{ all -> 0x1dca }
        L_0x1ac8:
            com.google.android.gms.measurement.internal.u3 r4 = r3.f34015a     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo52015a()     // Catch:{ all -> 0x1b4c }
            r4.mo51995g()     // Catch:{ all -> 0x1b4c }
            long r4 = r3.f34021g     // Catch:{ all -> 0x1b4c }
            r6 = 1
            long r4 = r4 + r6
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x1af1
            com.google.android.gms.measurement.internal.u3 r4 = r3.f34015a     // Catch:{ all -> 0x1b4c }
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()     // Catch:{ all -> 0x1b4c }
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33727j     // Catch:{ all -> 0x1b4c }
            java.lang.String r5 = r3.f34016b     // Catch:{ all -> 0x1b4c }
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r5)     // Catch:{ all -> 0x1b4c }
            java.lang.String r6 = "Bundle index overflow. appId"
            r4.mo52238b(r5, r6)     // Catch:{ all -> 0x1b4c }
            goto L_0x1af2
        L_0x1af1:
            r12 = r4
        L_0x1af2:
            r4 = 1
            r3.f34012D = r4     // Catch:{ all -> 0x1b4c }
            r3.f34021g = r12     // Catch:{ all -> 0x1b4c }
            com.google.android.gms.measurement.internal.u3 r4 = r3.f34015a     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo52015a()     // Catch:{ all -> 0x1b49 }
            r4.mo51995g()     // Catch:{ all -> 0x1b49 }
            long r4 = r3.f34021g     // Catch:{ all -> 0x1b49 }
            int r4 = (int) r4
            boolean r5 = r9.f33059d     // Catch:{ all -> 0x1dca }
            if (r5 == 0) goto L_0x1b0d
            r9.mo50809j()     // Catch:{ all -> 0x1b46 }
            r5 = 0
            r9.f33059d = r5     // Catch:{ all -> 0x1b46 }
        L_0x1b0d:
            MessageType r5 = r9.f33058c     // Catch:{ all -> 0x1b46 }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x1b46 }
            com.google.android.gms.internal.measurement.C14572a3.m23283Y(r5, r4)     // Catch:{ all -> 0x1b46 }
            MessageType r4 = r9.f33058c     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ all -> 0x1b43 }
            long r4 = r4.mo50343u1()     // Catch:{ all -> 0x1b43 }
            r3.mo52392q(r4)     // Catch:{ all -> 0x1dca }
            MessageType r4 = r9.f33058c     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ all -> 0x1b40 }
            long r4 = r4.mo50335q1()     // Catch:{ all -> 0x1b40 }
            r3.mo52390o(r4)     // Catch:{ all -> 0x1dca }
            java.lang.String r4 = r3.mo52398w()     // Catch:{ all -> 0x1dca }
            if (r4 == 0) goto L_0x1b34
            r9.mo50998q(r4)     // Catch:{ all -> 0x1dca }
            goto L_0x1b37
        L_0x1b34:
            r9.mo50987A()     // Catch:{ all -> 0x1dca }
        L_0x1b37:
            com.google.android.gms.measurement.internal.h r4 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r4)     // Catch:{ all -> 0x1dca }
            r4.mo52072n(r3)     // Catch:{ all -> 0x1dca }
            goto L_0x1b55
        L_0x1b40:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b43:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b46:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b49:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b4c:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b4f:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b52:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b55:
            MessageType r3 = r9.f33058c     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.C14572a3) r3     // Catch:{ all -> 0x1d74 }
            int r3 = r3.mo50319h1()     // Catch:{ all -> 0x1d74 }
            if (r3 <= 0) goto L_0x1d29
            com.google.android.gms.measurement.internal.u3 r3 = r11.f33497m     // Catch:{ all -> 0x1dca }
            r3.getClass()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n3 r3 = r11.f33486b     // Catch:{ all -> 0x1dca }
            m24287I(r3)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r4 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r4 = r4.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.f2 r3 = r3.mo52255l(r4)     // Catch:{ all -> 0x1dca }
            if (r3 == 0) goto L_0x1b95
            boolean r4 = r3.mo50508G()     // Catch:{ all -> 0x1dca }
            if (r4 != 0) goto L_0x1b7c
            goto L_0x1b95
        L_0x1b7c:
            long r3 = r3.mo50511t()     // Catch:{ all -> 0x1dca }
            boolean r5 = r9.f33059d     // Catch:{ all -> 0x1dca }
            if (r5 == 0) goto L_0x1b8a
            r9.mo50809j()     // Catch:{ all -> 0x1b92 }
            r5 = 0
            r9.f33059d = r5     // Catch:{ all -> 0x1b92 }
        L_0x1b8a:
            MessageType r5 = r9.f33058c     // Catch:{ all -> 0x1b92 }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x1b92 }
            com.google.android.gms.internal.measurement.C14572a3.m23294j0(r5, r3)     // Catch:{ all -> 0x1b92 }
            goto L_0x1bcf
        L_0x1b92:
            r0 = move-exception
            goto L_0x19d9
        L_0x1b95:
            com.google.android.gms.internal.measurement.a3 r3 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r3 = r3.mo50350y()     // Catch:{ all -> 0x1dca }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1dca }
            if (r3 == 0) goto L_0x1bb8
            boolean r3 = r9.f33059d     // Catch:{ all -> 0x1dca }
            if (r3 == 0) goto L_0x1bab
            r9.mo50809j()     // Catch:{ all -> 0x1bb5 }
            r3 = 0
            r9.f33059d = r3     // Catch:{ all -> 0x1bb5 }
        L_0x1bab:
            MessageType r3 = r9.f33058c     // Catch:{ all -> 0x1bb5 }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.C14572a3) r3     // Catch:{ all -> 0x1bb5 }
            r4 = -1
            com.google.android.gms.internal.measurement.C14572a3.m23294j0(r3, r4)     // Catch:{ all -> 0x1bb5 }
            goto L_0x1bcf
        L_0x1bb5:
            r0 = move-exception
            goto L_0x19d9
        L_0x1bb8:
            com.google.android.gms.measurement.internal.o2 r3 = r68.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52277n()     // Catch:{ all -> 0x1dca }
            java.lang.String r4 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.a3 r5 = r2.f33457a     // Catch:{ all -> 0x1dca }
            java.lang.String r5 = r5.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r5)     // Catch:{ all -> 0x1dca }
            r3.mo52238b(r5, r4)     // Catch:{ all -> 0x1dca }
        L_0x1bcf:
            com.google.android.gms.measurement.internal.h r3 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r3)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.t5 r4 = r9.mo50807h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ all -> 0x1dca }
            r3.mo51995g()     // Catch:{ all -> 0x1dca }
            r3.mo51942h()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x1dca }
            java.lang.String r5 = r4.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)     // Catch:{ all -> 0x1dca }
            boolean r5 = r4.mo50307V0()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.common.internal.Preconditions.checkState(r5)     // Catch:{ all -> 0x1dca }
            r3.mo52069k()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o4 r5 = r3.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x1dca }
            com.google.android.gms.common.util.Clock r5 = r5.mo52017c()     // Catch:{ all -> 0x1dca }
            long r5 = r5.currentTimeMillis()     // Catch:{ all -> 0x1dca }
            long r7 = r4.mo50335q1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o4 r9 = r3.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9     // Catch:{ all -> 0x1dca }
            r9.getClass()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C14959e2.f33370D     // Catch:{ all -> 0x1dca }
            r10 = 0
            java.lang.Object r12 = r9.mo51978a(r10)     // Catch:{ all -> 0x1d26 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x1d26 }
            long r12 = r12.longValue()     // Catch:{ all -> 0x1d26 }
            long r12 = r5 - r12
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 < 0) goto L_0x1c3d
            long r7 = r4.mo50335q1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o4 r10 = r3.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10     // Catch:{ all -> 0x1dca }
            r10.getClass()     // Catch:{ all -> 0x1dca }
            r10 = 0
            java.lang.Object r9 = r9.mo51978a(r10)     // Catch:{ all -> 0x1dca }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x1c3a }
            long r9 = r9.longValue()     // Catch:{ all -> 0x1c3a }
            long r9 = r9 + r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x1c62
            goto L_0x1c3d
        L_0x1c3a:
            r0 = move-exception
            goto L_0x19d9
        L_0x1c3d:
            com.google.android.gms.measurement.internal.o4 r7 = r3.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r7 = r7.mo52277n()     // Catch:{ all -> 0x1dca }
            java.lang.String r8 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r9 = r4.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r9)     // Catch:{ all -> 0x1dca }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x1dca }
            long r12 = r4.mo50335q1()     // Catch:{ all -> 0x1dca }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x1dca }
            r7.mo52240d(r9, r5, r6, r8)     // Catch:{ all -> 0x1dca }
        L_0x1c62:
            byte[] r5 = r4.mo50868i()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.f7 r6 = r3.f34048c     // Catch:{ IOException -> 0x1d0a }
            com.google.android.gms.measurement.internal.h7 r6 = r6.f33492h     // Catch:{ IOException -> 0x1d0a }
            m24287I(r6)     // Catch:{ IOException -> 0x1d0a }
            byte[] r5 = r6.mo52111K(r5)     // Catch:{ IOException -> 0x1d0a }
            com.google.android.gms.measurement.internal.o4 r6 = r3.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r6 = r6.mo52276m()     // Catch:{ all -> 0x1dca }
            java.lang.String r7 = "Saving bundle, size"
            int r8 = r5.length     // Catch:{ all -> 0x1dca }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1dca }
            r6.mo52238b(r8, r7)     // Catch:{ all -> 0x1dca }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x1dca }
            r6.<init>()     // Catch:{ all -> 0x1dca }
            java.lang.String r7 = r4.mo50295C1()     // Catch:{ all -> 0x1dca }
            r8 = r22
            r6.put(r8, r7)     // Catch:{ all -> 0x1dca }
            java.lang.String r7 = "bundle_end_timestamp"
            long r8 = r4.mo50335q1()     // Catch:{ all -> 0x1dca }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x1dca }
            r6.put(r7, r8)     // Catch:{ all -> 0x1dca }
            r7 = r25
            r6.put(r7, r5)     // Catch:{ all -> 0x1dca }
            java.lang.String r5 = "has_realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x1dca }
            r6.put(r5, r7)     // Catch:{ all -> 0x1dca }
            boolean r5 = r4.mo50313b1()     // Catch:{ all -> 0x1dca }
            if (r5 == 0) goto L_0x1cc3
            java.lang.String r5 = "retry_count"
            int r7 = r4.mo50321j1()     // Catch:{ all -> 0x1dca }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x1dca }
            r6.put(r5, r7)     // Catch:{ all -> 0x1dca }
        L_0x1cc3:
            android.database.sqlite.SQLiteDatabase r5 = r3.mo52052B()     // Catch:{ SQLiteException -> 0x1cee }
            java.lang.String r7 = "queue"
            r8 = 0
            long r5 = r5.insert(r7, r8, r6)     // Catch:{ SQLiteException -> 0x1cee }
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x1d29
            com.google.android.gms.measurement.internal.o4 r5 = r3.f33681b     // Catch:{ SQLiteException -> 0x1cee }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ SQLiteException -> 0x1cee }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ SQLiteException -> 0x1cee }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52275l()     // Catch:{ SQLiteException -> 0x1cee }
            java.lang.String r6 = "Failed to insert bundle (got -1). appId"
            java.lang.String r7 = r4.mo50295C1()     // Catch:{ SQLiteException -> 0x1cee }
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r7)     // Catch:{ SQLiteException -> 0x1cee }
            r5.mo52238b(r7, r6)     // Catch:{ SQLiteException -> 0x1cee }
            goto L_0x1d29
        L_0x1cee:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52275l()     // Catch:{ all -> 0x1dca }
            java.lang.String r6 = "Error storing bundle. appId"
            java.lang.String r4 = r4.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r4)     // Catch:{ all -> 0x1dca }
            r3.mo52239c(r4, r6, r5)     // Catch:{ all -> 0x1dca }
            goto L_0x1d29
        L_0x1d0a:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52275l()     // Catch:{ all -> 0x1dca }
            java.lang.String r6 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r4 = r4.mo50295C1()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r4)     // Catch:{ all -> 0x1dca }
            r3.mo52239c(r4, r6, r5)     // Catch:{ all -> 0x1dca }
            goto L_0x1d29
        L_0x1d26:
            r0 = move-exception
            goto L_0x19d9
        L_0x1d29:
            com.google.android.gms.measurement.internal.h r3 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r3)     // Catch:{ all -> 0x1dca }
            java.util.ArrayList r2 = r2.f33458b     // Catch:{ all -> 0x1dca }
            r3.mo52066P(r2)     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.h r2 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r2)     // Catch:{ all -> 0x1dca }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo52052B()     // Catch:{ all -> 0x1dca }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x1d4b }
            r5 = 0
            r4[r5] = r1     // Catch:{ SQLiteException -> 0x1d4b }
            r5 = 1
            r4[r5] = r1     // Catch:{ SQLiteException -> 0x1d4b }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r5, r4)     // Catch:{ SQLiteException -> 0x1d4b }
            goto L_0x1d62
        L_0x1d4b:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x1dca }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            com.google.android.gms.measurement.internal.n2 r1 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r1)     // Catch:{ all -> 0x1dca }
            r2.mo52239c(r1, r4, r3)     // Catch:{ all -> 0x1dca }
        L_0x1d62:
            com.google.android.gms.measurement.internal.h r1 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r1)     // Catch:{ all -> 0x1dca }
            r1.mo52071m()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.h r1 = r11.f33488d
            m24287I(r1)
            r1.mo52067Q()
            r1 = 1
            return r1
        L_0x1d74:
            r0 = move-exception
            goto L_0x19d9
        L_0x1d77:
            r0 = move-exception
            goto L_0x19d9
        L_0x1d7a:
            r0 = move-exception
            r11 = r68
            goto L_0x1dce
        L_0x1d7e:
            r0 = move-exception
            r11 = r68
            goto L_0x19d9
        L_0x1d83:
            r0 = move-exception
            r11 = r68
            goto L_0x19d9
        L_0x1d88:
            r0 = move-exception
            r11 = r68
            r1 = r0
            r15 = r9
        L_0x1d8d:
            if (r15 == 0) goto L_0x1d96
            r15.close()     // Catch:{ all -> 0x1d93 }
            goto L_0x1d96
        L_0x1d93:
            r0 = move-exception
            goto L_0x19d9
        L_0x1d96:
            throw r1     // Catch:{ all -> 0x1d93 }
        L_0x1d97:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1d9b:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1d9f:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1da3:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1da7:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1dab:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1daf:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1db3:
            r0 = move-exception
            r11 = r1
            goto L_0x19d9
        L_0x1db7:
            r11 = r1
            com.google.android.gms.measurement.internal.h r1 = r11.f33488d     // Catch:{ all -> 0x1dca }
            m24287I(r1)     // Catch:{ all -> 0x1dca }
            r1.mo52071m()     // Catch:{ all -> 0x1dca }
            com.google.android.gms.measurement.internal.h r1 = r11.f33488d
            m24287I(r1)
            r1.mo52067Q()
            r1 = 0
            return r1
        L_0x1dca:
            r0 = move-exception
            goto L_0x1dce
        L_0x1dcc:
            r0 = move-exception
            r11 = r1
        L_0x1dce:
            r2 = r0
        L_0x1dcf:
            com.google.android.gms.measurement.internal.h r1 = r11.f33488d
            m24287I(r1)
            r1.mo52067Q()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52004F(long):boolean");
    }

    /* renamed from: G */
    public final boolean mo52005G() {
        mo52015a().mo51995g();
        mo52021g();
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        if (!(hVar.mo52081x("select count(1) > 0 from raw_events", (String[]) null) != 0)) {
            C14983h hVar2 = this.f33488d;
            m24287I(hVar2);
            return !TextUtils.isEmpty(hVar2.mo52060J());
        }
    }

    /* renamed from: H */
    public final boolean mo52006H(C14766p2 p2Var, C14766p2 p2Var2) {
        Preconditions.checkArgument("_e".equals(p2Var.mo50773v()));
        m24287I(this.f33492h);
        C14828u2 l = C14991h7.m24381l((C14779q2) p2Var.mo50807h(), "_sc");
        String str = null;
        String y = l == null ? null : l.mo50888y();
        m24287I(this.f33492h);
        C14828u2 l2 = C14991h7.m24381l((C14779q2) p2Var2.mo50807h(), "_pc");
        if (l2 != null) {
            str = l2.mo50888y();
        }
        if (str == null || !str.equals(y)) {
            return false;
        }
        mo52001C(p2Var, p2Var2);
        return true;
    }

    /* renamed from: J */
    public final C15143z3 mo52007J(zzp zzp) {
        mo52015a().mo51995g();
        mo52021g();
        Preconditions.checkNotNull(zzp);
        Preconditions.checkNotEmpty(zzp.zza);
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        C15143z3 C = hVar.mo52053C(zzp.zza);
        C14956e c = mo52009L(zzp.zza).mo51983c(C14956e.m24275b(zzp.zzv));
        String m = c.mo51985e() ? this.f33494j.mo52167m(zzp.zza) : "";
        if (C == null) {
            C = new C15143z3(this.f33497m, zzp.zza);
            if (c.mo51987f()) {
                C.mo52378c(mo52014R(c));
            }
            if (c.mo51985e()) {
                C.mo52394s(m);
            }
        } else {
            if (c.mo51985e() && m != null) {
                C.f34015a.mo52015a().mo51995g();
                if (!m.equals(C.f34019e)) {
                    C.mo52394s(m);
                    C14893z7.m24209b();
                    C14947d K = mo52008K();
                    C14950d2<Boolean> d2Var = C14959e2.f33430s0;
                    if (!K.mo51973p((String) null, d2Var) || !mo52008K().mo51973p((String) null, C14959e2.f33436v0)) {
                        C.mo52378c(mo52014R(c));
                    } else if (!"00000000-0000-0000-0000-000000000000".equals(this.f33494j.mo52166l(zzp.zza, c).first)) {
                        C.mo52378c(mo52014R(c));
                    }
                    C14893z7.m24209b();
                    if (mo52008K().mo51973p((String) null, d2Var) && !"00000000-0000-0000-0000-000000000000".equals(this.f33494j.mo52166l(zzp.zza, c).first)) {
                        C14983h hVar2 = this.f33488d;
                        m24287I(hVar2);
                        if (hVar2.mo52058H(zzp.zza, AnalyticsLogDatabaseHelper.f19040ID) != null) {
                            C14983h hVar3 = this.f33488d;
                            m24287I(hVar3);
                            if (hVar3.mo52058H(zzp.zza, "_lair") == null) {
                                C15000i7 i7Var = new C15000i7(zzp.zza, "auto", "_lair", mo52017c().currentTimeMillis(), 1L);
                                C14983h hVar4 = this.f33488d;
                                m24287I(hVar4);
                                hVar4.mo52078t(i7Var);
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(C.mo52400y()) && c.mo51987f()) {
                C.mo52378c(mo52014R(c));
            }
        }
        C.mo52387l(zzp.zzb);
        C.mo52376a(zzp.zzq);
        C14811s9.m23933a();
        if (mo52008K().mo51973p(C.mo52399x(), C14959e2.f33398c0)) {
            C.mo52386k(zzp.zzu);
        }
        if (!TextUtils.isEmpty(zzp.zzk)) {
            C.mo52385j(zzp.zzk);
        }
        long j = zzp.zze;
        if (j != 0) {
            C.mo52388m(j);
        }
        if (!TextUtils.isEmpty(zzp.zzc)) {
            C.mo52380e(zzp.zzc);
        }
        C.mo52381f(zzp.zzj);
        String str = zzp.zzd;
        if (str != null) {
            C.mo52379d(str);
        }
        C.mo52383h(zzp.zzf);
        C.mo52393r(zzp.zzh);
        if (!TextUtils.isEmpty(zzp.zzg)) {
            C.mo52389n(zzp.zzg);
        }
        if (!mo52008K().mo51973p((String) null, C14959e2.f33416l0)) {
            C.mo52377b(zzp.zzl);
        }
        boolean z = zzp.zzo;
        C.f34015a.mo52015a().mo51995g();
        boolean z2 = false;
        C.f34012D |= C.f34031q != z;
        C.f34031q = z;
        Boolean bool = zzp.zzr;
        C.f34015a.mo52015a().mo51995g();
        boolean z3 = C.f34012D;
        Boolean bool2 = C.f34033s;
        if (bool2 == null && bool == null) {
            z2 = true;
        } else if (bool2 != null) {
            z2 = bool2.equals(bool);
        }
        C.f34012D = z3 | (!z2);
        C.f34033s = bool;
        C.mo52384i(zzp.zzs);
        C.f34015a.mo52015a().mo51995g();
        if (C.f34012D) {
            C14983h hVar5 = this.f33488d;
            m24287I(hVar5);
            hVar5.mo52072n(C);
        }
        return C;
    }

    /* renamed from: K */
    public final C14947d mo52008K() {
        return ((C15103u3) Preconditions.checkNotNull(this.f33497m)).f33878h;
    }

    /* renamed from: L */
    public final C14956e mo52009L(String str) {
        String str2;
        mo52015a().mo51995g();
        mo52021g();
        C14956e eVar = (C14956e) this.f33484B.get(str);
        if (eVar != null) {
            return eVar;
        }
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        Preconditions.checkNotNull(str);
        hVar.mo51995g();
        hVar.mo51942h();
        Cursor cursor = null;
        try {
            Cursor rawQuery = hVar.mo52052B().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C14956e b = C14956e.m24275b(str2);
            mo52032r(str, b);
            return b;
        } catch (SQLiteException e) {
            ((C15103u3) hVar.f33681b).mo52016b().f33724g.mo52239c("select consent_state from consent_settings where app_id=? limit 1;", "Database error", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: M */
    public final C14983h mo52010M() {
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        return hVar;
    }

    /* renamed from: N */
    public final C15110v2 mo52011N() {
        C15110v2 v2Var = this.f33489e;
        if (v2Var != null) {
            return v2Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: P */
    public final C14991h7 mo52012P() {
        C14991h7 h7Var = this.f33492h;
        m24287I(h7Var);
        return h7Var;
    }

    /* renamed from: Q */
    public final C15018k7 mo52013Q() {
        return ((C15103u3) Preconditions.checkNotNull(this.f33497m)).mo52335w();
    }

    /* renamed from: R */
    public final String mo52014R(C14956e eVar) {
        if (!eVar.mo51987f()) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo52013Q().mo52218o().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: a */
    public final C15086s3 mo52015a() {
        return ((C15103u3) Preconditions.checkNotNull(this.f33497m)).mo52015a();
    }

    /* renamed from: b */
    public final C15049o2 mo52016b() {
        return ((C15103u3) Preconditions.checkNotNull(this.f33497m)).mo52016b();
    }

    /* renamed from: c */
    public final Clock mo52017c() {
        return ((C15103u3) Preconditions.checkNotNull(this.f33497m)).f33885o;
    }

    /* renamed from: d */
    public final C20203a mo52018d() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52019e() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.s3 r0 = r10.mo52015a()
            r0.mo51995g()
            r10.mo52021g()
            boolean r0 = r10.f33499o
            if (r0 != 0) goto L_0x01a5
            r0 = 1
            r10.f33499o = r0
            com.google.android.gms.measurement.internal.s3 r1 = r10.mo52015a()
            r1.mo51995g()
            java.nio.channels.FileLock r1 = r10.f33507w
            java.lang.String r2 = "Storage concurrent access okay"
            r3 = 0
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0026
            goto L_0x0030
        L_0x0026:
            com.google.android.gms.measurement.internal.o2 r1 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            r1.mo52237a(r2)
            goto L_0x0066
        L_0x0030:
            com.google.android.gms.measurement.internal.h r1 = r10.f33488d
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            r1.getClass()
            com.google.android.gms.measurement.internal.u3 r1 = r10.f33497m
            android.content.Context r1 = r1.f33872b
            java.io.File r1 = r1.getFilesDir()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "google_app_measurement.db"
            r4.<init>(r1, r5)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.lang.String r5 = "rw"
            r1.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            r10.f33508x = r1     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            r10.f33507w = r1     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.measurement.internal.o2 r1 = r10.mo52016b()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            r1.mo52237a(r2)     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
        L_0x0066:
            r1 = r0
            goto L_0x009b
        L_0x0068:
            com.google.android.gms.measurement.internal.o2 r1 = r10.mo52016b()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.mo52237a(r2)     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            goto L_0x009a
        L_0x0074:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o2 r2 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            java.lang.String r4 = "Storage lock already acquired"
            r2.mo52238b(r1, r4)
            goto L_0x009a
        L_0x0081:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o2 r2 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g
            java.lang.String r4 = "Failed to access storage lock file"
            r2.mo52238b(r1, r4)
            goto L_0x009a
        L_0x008e:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o2 r2 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g
            java.lang.String r4 = "Failed to acquire storage lock"
            r2.mo52238b(r1, r4)
        L_0x009a:
            r1 = r3
        L_0x009b:
            if (r1 == 0) goto L_0x01a5
            java.nio.channels.FileChannel r1 = r10.f33508x
            com.google.android.gms.measurement.internal.s3 r2 = r10.mo52015a()
            r2.mo51995g()
            r4 = 0
            java.lang.String r2 = "Bad channel to read from"
            r6 = 4
            if (r1 == 0) goto L_0x00e9
            boolean r7 = r1.isOpen()
            if (r7 != 0) goto L_0x00b4
            goto L_0x00e9
        L_0x00b4:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            r1.position(r4)     // Catch:{ IOException -> 0x00dc }
            int r1 = r1.read(r7)     // Catch:{ IOException -> 0x00dc }
            if (r1 == r6) goto L_0x00d4
            r7 = -1
            if (r1 == r7) goto L_0x00f2
            com.google.android.gms.measurement.internal.o2 r7 = r10.mo52016b()     // Catch:{ IOException -> 0x00dc }
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33727j     // Catch:{ IOException -> 0x00dc }
            java.lang.String r8 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00dc }
            r7.mo52238b(r1, r8)     // Catch:{ IOException -> 0x00dc }
            goto L_0x00f2
        L_0x00d4:
            r7.flip()     // Catch:{ IOException -> 0x00dc }
            int r3 = r7.getInt()     // Catch:{ IOException -> 0x00dc }
            goto L_0x00f2
        L_0x00dc:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o2 r7 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33724g
            java.lang.String r8 = "Failed to read from channel"
            r7.mo52238b(r1, r8)
            goto L_0x00f2
        L_0x00e9:
            com.google.android.gms.measurement.internal.o2 r1 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            r1.mo52237a(r2)
        L_0x00f2:
            com.google.android.gms.measurement.internal.u3 r1 = r10.f33497m
            com.google.android.gms.measurement.internal.g2 r1 = r1.mo52327n()
            r1.mo51946h()
            int r1 = r1.f33518f
            com.google.android.gms.measurement.internal.s3 r7 = r10.mo52015a()
            r7.mo51995g()
            if (r3 <= r1) goto L_0x011a
            com.google.android.gms.measurement.internal.o2 r0 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            r0.mo52239c(r2, r3, r1)
            return
        L_0x011a:
            if (r3 >= r1) goto L_0x01a5
            java.nio.channels.FileChannel r7 = r10.f33508x
            com.google.android.gms.measurement.internal.s3 r8 = r10.mo52015a()
            r8.mo51995g()
            if (r7 == 0) goto L_0x0189
            boolean r8 = r7.isOpen()
            if (r8 != 0) goto L_0x012e
            goto L_0x0189
        L_0x012e:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r6)
            r2.putInt(r1)
            r2.flip()
            r7.truncate(r4)     // Catch:{ IOException -> 0x017c }
            com.google.android.gms.measurement.internal.d r4 = r10.mo52008K()     // Catch:{ IOException -> 0x017c }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C14959e2.f33414k0     // Catch:{ IOException -> 0x017c }
            r6 = 0
            r4.mo51973p(r6, r5)     // Catch:{ IOException -> 0x017c }
            r7.write(r2)     // Catch:{ IOException -> 0x017c }
            r7.force(r0)     // Catch:{ IOException -> 0x017c }
            long r4 = r7.size()     // Catch:{ IOException -> 0x017c }
            r8 = 4
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.o2 r0 = r10.mo52016b()     // Catch:{ IOException -> 0x017c }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ IOException -> 0x017c }
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r4 = r7.size()     // Catch:{ IOException -> 0x017c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x017c }
            r0.mo52238b(r4, r2)     // Catch:{ IOException -> 0x017c }
        L_0x0168:
            com.google.android.gms.measurement.internal.o2 r0 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            r0.mo52239c(r2, r3, r1)
            return
        L_0x017c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o2 r2 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g
            java.lang.String r4 = "Failed to write to channel"
            r2.mo52238b(r0, r4)
            goto L_0x0192
        L_0x0189:
            com.google.android.gms.measurement.internal.o2 r0 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            r0.mo52237a(r2)
        L_0x0192:
            com.google.android.gms.measurement.internal.o2 r0 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            r0.mo52239c(r2, r3, r1)
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52019e():void");
    }

    /* renamed from: f */
    public final Context mo52020f() {
        return this.f33497m.f33872b;
    }

    /* renamed from: g */
    public final void mo52021g() {
        if (!this.f33498n) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: h */
    public final void mo52022h(C15143z3 z3Var) {
        mo52015a().mo51995g();
        C14811s9.m23933a();
        C14947d K = mo52008K();
        String x = z3Var.mo52399x();
        C14950d2<Boolean> d2Var = C14959e2.f33398c0;
        if (K.mo51973p(x, d2Var)) {
            if (TextUtils.isEmpty(z3Var.mo52375C()) && TextUtils.isEmpty(z3Var.mo52374B()) && TextUtils.isEmpty(z3Var.mo52397v())) {
                mo52026l((String) Preconditions.checkNotNull(z3Var.mo52399x()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(z3Var.mo52375C()) && TextUtils.isEmpty(z3Var.mo52397v())) {
            mo52026l((String) Preconditions.checkNotNull(z3Var.mo52399x()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        C14937b7 b7Var = this.f33495k;
        Uri.Builder builder = new Uri.Builder();
        String C = z3Var.mo52375C();
        if (TextUtils.isEmpty(C)) {
            C14811s9.m23933a();
            if (((C15103u3) b7Var.f33681b).f33878h.mo51973p(z3Var.mo52399x(), d2Var)) {
                C = z3Var.mo52374B();
                if (TextUtils.isEmpty(C)) {
                    C = z3Var.mo52397v();
                }
            } else {
                C = z3Var.mo52397v();
            }
        }
        C7494b bVar = null;
        Uri.Builder encodedAuthority = builder.scheme(C14959e2.f33403f.mo51978a(null)).encodedAuthority(C14959e2.f33405g.mo51978a(null));
        String valueOf = String.valueOf(C);
        Uri.Builder appendQueryParameter = encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", z3Var.mo52400y()).appendQueryParameter("platform", "android");
        ((C15103u3) b7Var.f33681b).f33878h.mo51969l();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(46000));
        C14722la.m23700b();
        if (((C15103u3) b7Var.f33681b).f33878h.mo51973p(z3Var.mo52399x(), C14959e2.f33426q0)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(z3Var.mo52399x());
            URL url = new URL(uri);
            mo52016b().f33732o.mo52238b(str, "Fetching remote configuration");
            C15041n3 n3Var = this.f33486b;
            m24287I(n3Var);
            C14636f2 l = n3Var.mo52255l(str);
            C15041n3 n3Var2 = this.f33486b;
            m24287I(n3Var2);
            n3Var2.mo51995g();
            String str2 = (String) n3Var2.f33707l.getOrDefault(str, null);
            if (l != null && !TextUtils.isEmpty(str2)) {
                bVar = new C7494b();
                bVar.put("If-Modified-Since", str2);
            }
            this.f33504t = true;
            C15094t2 t2Var = this.f33487c;
            m24287I(t2Var);
            C14865x3 x3Var = new C14865x3(this);
            t2Var.mo51995g();
            t2Var.mo51942h();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(x3Var);
            ((C15103u3) t2Var.f33681b).mo52015a().mo52307n(new C15085s2(t2Var, str, url, (byte[]) null, bVar, x3Var));
        } catch (MalformedURLException unused) {
            mo52016b().f33724g.mo52239c(C15049o2.m24575p(z3Var.mo52399x()), "Failed to parse config URL. Not fetching. appId", uri);
        }
    }

    /* renamed from: i */
    public final void mo52023i(zzat zzat, zzp zzp) {
        zzat zzat2;
        List<zzab> list;
        List<zzab> list2;
        List<zzab> list3;
        zzp zzp2 = zzp;
        Preconditions.checkNotNull(zzp);
        Preconditions.checkNotEmpty(zzp2.zza);
        mo52015a().mo51995g();
        mo52021g();
        String str = zzp2.zza;
        zzat zzat3 = zzat;
        long j = zzat3.zzd;
        C14836ua.f33116c.f33117b.zza().zza();
        if (mo52008K().mo51973p((String) null, C14959e2.f33438w0)) {
            C15058p2 b = C15058p2.m24596b(zzat);
            mo52015a().mo51995g();
            C15018k7.m24481s((C15061p5) null, b.f33746d, false);
            zzat3 = b.mo52283a();
        }
        m24287I(this.f33492h);
        Preconditions.checkNotNull(zzat3);
        Preconditions.checkNotNull(zzp);
        if (!TextUtils.isEmpty(zzp2.zzb) || !TextUtils.isEmpty(zzp2.zzq)) {
            if (!zzp2.zzh) {
                mo52007J(zzp2);
                return;
            }
            List<String> list4 = zzp2.zzt;
            if (list4 == null) {
                zzat2 = zzat3;
            } else if (list4.contains(zzat3.zza)) {
                Bundle zzc = zzat3.zzb.zzc();
                zzc.putLong("ga_safelisted", 1);
                zzat2 = new zzat(zzat3.zza, new zzar(zzc), zzat3.zzc, zzat3.zzd);
            } else {
                mo52016b().f33731n.mo52240d(str, zzat3.zza, zzat3.zzc, "Dropping non-safelisted event. appId, event name, origin");
                return;
            }
            C14983h hVar = this.f33488d;
            m24287I(hVar);
            hVar.mo52065O();
            try {
                C14983h hVar2 = this.f33488d;
                m24287I(hVar2);
                Preconditions.checkNotEmpty(str);
                hVar2.mo51995g();
                hVar2.mo51942h();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    ((C15103u3) hVar2.f33681b).mo52016b().f33727j.mo52239c(C15049o2.m24575p(str), "Invalid time querying timed out conditional properties", Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = hVar2.mo52062L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzab next : list) {
                    if (next != null) {
                        mo52016b().f33732o.mo52240d(next.zza, this.f33497m.f33884n.mo52144f(next.zzc.zzb), next.zzc.zza(), "User property timed out");
                        zzat zzat4 = next.zzg;
                        if (zzat4 != null) {
                            mo52035u(new zzat(zzat4, j), zzp2);
                        }
                        C14983h hVar3 = this.f33488d;
                        m24287I(hVar3);
                        hVar3.mo52080w(str, next.zzc.zzb);
                    }
                }
                C14983h hVar4 = this.f33488d;
                m24287I(hVar4);
                Preconditions.checkNotEmpty(str);
                hVar4.mo51995g();
                hVar4.mo51942h();
                if (i < 0) {
                    ((C15103u3) hVar4.f33681b).mo52016b().f33727j.mo52239c(C15049o2.m24575p(str), "Invalid time querying expired conditional properties", Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = hVar4.mo52062L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzab next2 : list2) {
                    if (next2 != null) {
                        mo52016b().f33732o.mo52240d(next2.zza, this.f33497m.f33884n.mo52144f(next2.zzc.zzb), next2.zzc.zza(), "User property expired");
                        C14983h hVar5 = this.f33488d;
                        m24287I(hVar5);
                        hVar5.mo52070l(str, next2.zzc.zzb);
                        zzat zzat5 = next2.zzk;
                        if (zzat5 != null) {
                            arrayList.add(zzat5);
                        }
                        C14983h hVar6 = this.f33488d;
                        m24287I(hVar6);
                        hVar6.mo52080w(str, next2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mo52035u(new zzat((zzat) it.next(), j), zzp2);
                }
                C14983h hVar7 = this.f33488d;
                m24287I(hVar7);
                String str2 = zzat2.zza;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                hVar7.mo51995g();
                hVar7.mo51942h();
                if (i < 0) {
                    ((C15103u3) hVar7.f33681b).mo52016b().f33727j.mo52240d(C15049o2.m24575p(str), ((C15103u3) hVar7.f33681b).f33884n.mo52142d(str2), Long.valueOf(j), "Invalid time querying triggered conditional properties");
                    list3 = Collections.emptyList();
                } else {
                    list3 = hVar7.mo52062L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzab next3 : list3) {
                    if (next3 != null) {
                        zzkv zzkv = next3.zzc;
                        C15000i7 i7Var = new C15000i7((String) Preconditions.checkNotNull(next3.zza), next3.zzb, zzkv.zzb, j, Preconditions.checkNotNull(zzkv.zza()));
                        C14983h hVar8 = this.f33488d;
                        m24287I(hVar8);
                        if (hVar8.mo52078t(i7Var)) {
                            mo52016b().f33732o.mo52240d(next3.zza, this.f33497m.f33884n.mo52144f(i7Var.f33582c), i7Var.f33584e, "User property triggered");
                        } else {
                            mo52016b().f33724g.mo52240d(C15049o2.m24575p(next3.zza), this.f33497m.f33884n.mo52144f(i7Var.f33582c), i7Var.f33584e, "Too many active user properties, ignoring");
                        }
                        zzat zzat6 = next3.zzi;
                        if (zzat6 != null) {
                            arrayList2.add(zzat6);
                        }
                        next3.zzc = new zzkv(i7Var);
                        next3.zze = true;
                        C14983h hVar9 = this.f33488d;
                        m24287I(hVar9);
                        hVar9.mo52077s(next3);
                    }
                }
                mo52035u(zzat2, zzp2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mo52035u(new zzat((zzat) it2.next(), j), zzp2);
                }
                C14983h hVar10 = this.f33488d;
                m24287I(hVar10);
                hVar10.mo52071m();
            } finally {
                C14983h hVar11 = this.f33488d;
                m24287I(hVar11);
                hVar11.mo52067Q();
            }
        }
    }

    /* renamed from: j */
    public final void mo52024j(zzat zzat, String str) {
        zzp zzp;
        zzat zzat2 = zzat;
        String str2 = str;
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        C15143z3 C = hVar.mo52053C(str2);
        if (C == null || TextUtils.isEmpty(C.mo52401z())) {
            mo52016b().f33731n.mo52238b(str2, "No app data available; dropping event");
            return;
        }
        Boolean z = mo52038z(C);
        if (z == null) {
            if (!"_ui".equals(zzat2.zza)) {
                mo52016b().f33727j.mo52238b(C15049o2.m24575p(str), "Could not find package. appId");
            }
        } else if (!z.booleanValue()) {
            mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "App version does not match; dropping event. appId");
            return;
        }
        String C2 = C.mo52375C();
        String z2 = C.mo52401z();
        long u = C.mo52396u();
        C.f34015a.mo52015a().mo51995g();
        String str3 = C.f34026l;
        C.f34015a.mo52015a().mo51995g();
        long j = C.f34027m;
        C.f34015a.mo52015a().mo51995g();
        long j2 = C.f34028n;
        C.f34015a.mo52015a().mo51995g();
        boolean z3 = C.f34029o;
        String A = C.mo52373A();
        C.f34015a.mo52015a().mo51995g();
        long j3 = C.f34030p;
        C.f34015a.mo52015a().mo51995g();
        boolean z4 = C.f34031q;
        String v = C.mo52397v();
        C.f34015a.mo52015a().mo51995g();
        Boolean bool = C.f34033s;
        C.f34015a.mo52015a().mo51995g();
        boolean z5 = z4;
        long j4 = C.f34034t;
        C.f34015a.mo52015a().mo51995g();
        ArrayList arrayList = C.f34035u;
        C14811s9.m23933a();
        String str4 = str;
        zzp = new zzp(str4, C2, z2, u, str3, j, j2, (String) null, z3, false, A, j3, 0, 0, z5, false, v, bool, j4, (List<String>) arrayList, mo52008K().mo51973p(C.mo52399x(), C14959e2.f33398c0) ? C.mo52374B() : null, mo52009L(str2).mo51984d());
        mo52025k(zzat2, r17);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        if (r5 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0150  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52025k(com.google.android.gms.measurement.internal.zzat r12, com.google.android.gms.measurement.internal.zzp r13) {
        /*
            r11 = this;
            java.lang.String r0 = r13.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.p2 r12 = com.google.android.gms.measurement.internal.C15058p2.m24596b(r12)
            com.google.android.gms.measurement.internal.k7 r0 = r11.mo52013Q()
            android.os.Bundle r1 = r12.f33746d
            com.google.android.gms.measurement.internal.h r2 = r11.f33488d
            m24287I(r2)
            java.lang.String r3 = r13.zza
            r2.mo51995g()
            r2.mo51942h()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r2.mo52052B()     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            java.lang.String r8 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r5 = r5.rawQuery(r8, r6)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x00cc }
            if (r6 != 0) goto L_0x0044
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33732o     // Catch:{ SQLiteException -> 0x00cc }
            java.lang.String r6 = "Default event parameters not found"
            r3.mo52237a(r6)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x00e4
        L_0x0044:
            byte[] r6 = r5.getBlob(r7)     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.internal.measurement.p2 r7 = com.google.android.gms.internal.measurement.C14779q2.m23880v()     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.q5 r6 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r7, r6)     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.p2 r6 = (com.google.android.gms.internal.measurement.C14766p2) r6     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.t5 r6 = r6.mo50807h()     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.q2 r6 = (com.google.android.gms.internal.measurement.C14779q2) r6     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.measurement.internal.f7 r3 = r2.f34048c     // Catch:{ SQLiteException -> 0x00cc }
            r3.mo52012P()     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.internal.measurement.z5 r3 = r6.mo50801z()     // Catch:{ SQLiteException -> 0x00cc }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00cc }
            r6.<init>()     // Catch:{ SQLiteException -> 0x00cc }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SQLiteException -> 0x00cc }
        L_0x006a:
            boolean r7 = r3.hasNext()     // Catch:{ SQLiteException -> 0x00cc }
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r7 = r3.next()     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.internal.measurement.u2 r7 = (com.google.android.gms.internal.measurement.C14828u2) r7     // Catch:{ SQLiteException -> 0x00cc }
            java.lang.String r8 = r7.mo50887x()     // Catch:{ SQLiteException -> 0x00cc }
            boolean r9 = r7.mo50878K()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x0088
            double r9 = r7.mo50883r()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putDouble(r8, r9)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x0088:
            boolean r9 = r7.mo50879L()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x0096
            float r7 = r7.mo50884s()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putFloat(r8, r7)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x0096:
            boolean r9 = r7.mo50882O()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x00a4
            java.lang.String r7 = r7.mo50888y()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putString(r8, r7)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x00a4:
            boolean r9 = r7.mo50880M()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x006a
            long r9 = r7.mo50886u()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putLong(r8, r9)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x00b2:
            r5.close()
            r4 = r6
            goto L_0x00e7
        L_0x00b7:
            r6 = move-exception
            com.google.android.gms.measurement.internal.o4 r7 = r2.f33681b     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33724g     // Catch:{ SQLiteException -> 0x00cc }
            java.lang.String r8 = "Failed to retrieve default event parameters. appId"
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r3)     // Catch:{ SQLiteException -> 0x00cc }
            r7.mo52239c(r3, r8, r6)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x00e4
        L_0x00cc:
            r3 = move-exception
            goto L_0x00d3
        L_0x00ce:
            r12 = move-exception
            goto L_0x014e
        L_0x00d1:
            r3 = move-exception
            r5 = r4
        L_0x00d3:
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ all -> 0x014c }
            java.lang.String r6 = "Error selecting default event parameters"
            r2.mo52238b(r3, r6)     // Catch:{ all -> 0x014c }
            if (r5 == 0) goto L_0x00e7
        L_0x00e4:
            r5.close()
        L_0x00e7:
            r0.mo52221t(r1, r4)
            com.google.android.gms.measurement.internal.k7 r0 = r11.mo52013Q()
            com.google.android.gms.measurement.internal.d r1 = r11.mo52008K()
            java.lang.String r2 = r13.zza
            r1.getClass()
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r3 = com.google.android.gms.measurement.internal.C14959e2.f33375I
            int r1 = r1.mo51968k(r2, r3)
            r2 = 100
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 25
            int r1 = java.lang.Math.max(r1, r2)
            r0.mo52222u(r12, r1)
            com.google.android.gms.measurement.internal.zzat r12 = r12.mo52283a()
            java.lang.String r0 = r12.zza
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x011b
            goto L_0x0148
        L_0x011b:
            com.google.android.gms.measurement.internal.zzar r0 = r12.zzb
            java.lang.String r1 = "_cis"
            java.lang.String r0 = r0.zzg(r1)
            java.lang.String r1 = "referrer API v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0148
            com.google.android.gms.measurement.internal.zzar r0 = r12.zzb
            java.lang.String r1 = "gclid"
            java.lang.String r6 = r0.zzg(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0148
            com.google.android.gms.measurement.internal.zzkv r0 = new com.google.android.gms.measurement.internal.zzkv
            long r4 = r12.zzd
            java.lang.String r3 = "_lgclid"
            java.lang.String r7 = "auto"
            r2 = r0
            r2.<init>(r3, r4, r6, r7)
            r11.mo52033s(r0, r13)
        L_0x0148:
            r11.mo52023i(r12, r13)
            return
        L_0x014c:
            r12 = move-exception
            r4 = r5
        L_0x014e:
            if (r4 == 0) goto L_0x0153
            r4.close()
        L_0x0153:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52025k(com.google.android.gms.measurement.internal.zzat, com.google.android.gms.measurement.internal.zzp):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x00d0, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[Catch:{ all -> 0x00d0, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0125 A[Catch:{ all -> 0x00d0, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131 A[Catch:{ all -> 0x00d0, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151 A[Catch:{ all -> 0x00d0, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0155 A[Catch:{ all -> 0x00d0, all -> 0x0177 }] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52026l(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.s3 r0 = r8.mo52015a()
            r0.mo51995g()
            r8.mo52021g()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x0177 }
        L_0x0012:
            com.google.android.gms.measurement.internal.o2 r1 = r8.mo52016b()     // Catch:{ all -> 0x0177 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o     // Catch:{ all -> 0x0177 }
            int r2 = r12.length     // Catch:{ all -> 0x0177 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo52238b(r2, r3)     // Catch:{ all -> 0x0177 }
            com.google.android.gms.measurement.internal.h r1 = r8.f33488d     // Catch:{ all -> 0x0177 }
            m24287I(r1)     // Catch:{ all -> 0x0177 }
            r1.mo52065O()     // Catch:{ all -> 0x0177 }
            com.google.android.gms.measurement.internal.h r1 = r8.f33488d     // Catch:{ all -> 0x00d0 }
            m24287I(r1)     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo52053C(r9)     // Catch:{ all -> 0x00d0 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            r5 = 1
            if (r10 == r3) goto L_0x0041
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0041
            if (r10 != r4) goto L_0x0045
            r10 = r4
        L_0x0041:
            if (r11 != 0) goto L_0x0045
            r3 = r5
            goto L_0x0046
        L_0x0045:
            r3 = r0
        L_0x0046:
            if (r1 != 0) goto L_0x0059
            com.google.android.gms.measurement.internal.o2 r10 = r8.mo52016b()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.m2 r10 = r10.f33727j     // Catch:{ all -> 0x00d0 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r9)     // Catch:{ all -> 0x00d0 }
            r10.mo52238b(r9, r11)     // Catch:{ all -> 0x00d0 }
            goto L_0x0158
        L_0x0059:
            r6 = 404(0x194, float:5.66E-43)
            r7 = 0
            if (r3 != 0) goto L_0x00d3
            if (r10 != r6) goto L_0x0061
            goto L_0x00d3
        L_0x0061:
            com.google.android.gms.common.util.Clock r12 = r8.mo52017c()     // Catch:{ all -> 0x00d0 }
            long r12 = r12.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.u3 r2 = r1.f34015a     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo52015a()     // Catch:{ all -> 0x00d0 }
            r2.mo51995g()     // Catch:{ all -> 0x00d0 }
            boolean r2 = r1.f34012D     // Catch:{ all -> 0x00d0 }
            long r3 = r1.f34014F     // Catch:{ all -> 0x00d0 }
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r5 = r0
        L_0x007c:
            r2 = r2 | r5
            r1.f34012D = r2     // Catch:{ all -> 0x00d0 }
            r1.f34014F = r12     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.h r12 = r8.f33488d     // Catch:{ all -> 0x00d0 }
            m24287I(r12)     // Catch:{ all -> 0x00d0 }
            r12.mo52072n(r1)     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.o2 r12 = r8.mo52016b()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.m2 r12 = r12.f33732o     // Catch:{ all -> 0x00d0 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00d0 }
            r12.mo52239c(r1, r13, r11)     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.n3 r11 = r8.f33486b     // Catch:{ all -> 0x00d0 }
            m24287I(r11)     // Catch:{ all -> 0x00d0 }
            r11.mo51995g()     // Catch:{ all -> 0x00d0 }
            o.b r11 = r11.f33707l     // Catch:{ all -> 0x00d0 }
            r11.put(r9, r7)     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.j6 r9 = r8.f33494j     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.y2 r9 = r9.f33618k     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.common.util.Clock r11 = r8.mo52017c()     // Catch:{ all -> 0x00d0 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            r9.mo52364b(r11)     // Catch:{ all -> 0x00d0 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00bc
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00cb
        L_0x00bc:
            com.google.android.gms.measurement.internal.j6 r9 = r8.f33494j     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.y2 r9 = r9.f33616i     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.common.util.Clock r10 = r8.mo52017c()     // Catch:{ all -> 0x00d0 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            r9.mo52364b(r10)     // Catch:{ all -> 0x00d0 }
        L_0x00cb:
            r8.mo52002D()     // Catch:{ all -> 0x00d0 }
            goto L_0x0158
        L_0x00d0:
            r9 = move-exception
            goto L_0x016e
        L_0x00d3:
            if (r13 == 0) goto L_0x00de
            java.lang.String r11 = "Last-Modified"
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x00d0 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x00d0 }
            goto L_0x00df
        L_0x00de:
            r11 = r7
        L_0x00df:
            if (r11 == 0) goto L_0x00ee
            int r13 = r11.size()     // Catch:{ all -> 0x00d0 }
            if (r13 <= 0) goto L_0x00ee
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00d0 }
            goto L_0x00ef
        L_0x00ee:
            r11 = r7
        L_0x00ef:
            if (r10 == r6) goto L_0x00fd
            if (r10 != r4) goto L_0x00f4
            goto L_0x00fd
        L_0x00f4:
            com.google.android.gms.measurement.internal.n3 r13 = r8.f33486b     // Catch:{ all -> 0x00d0 }
            m24287I(r13)     // Catch:{ all -> 0x00d0 }
            r13.mo52259p(r9, r12, r11)     // Catch:{ all -> 0x00d0 }
            goto L_0x0110
        L_0x00fd:
            com.google.android.gms.measurement.internal.n3 r11 = r8.f33486b     // Catch:{ all -> 0x00d0 }
            m24287I(r11)     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.internal.measurement.f2 r11 = r11.mo52255l(r9)     // Catch:{ all -> 0x00d0 }
            if (r11 != 0) goto L_0x0110
            com.google.android.gms.measurement.internal.n3 r11 = r8.f33486b     // Catch:{ all -> 0x00d0 }
            m24287I(r11)     // Catch:{ all -> 0x00d0 }
            r11.mo52259p(r9, r7, r7)     // Catch:{ all -> 0x00d0 }
        L_0x0110:
            com.google.android.gms.common.util.Clock r11 = r8.mo52017c()     // Catch:{ all -> 0x00d0 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            r1.mo52382g(r11)     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.h r11 = r8.f33488d     // Catch:{ all -> 0x00d0 }
            m24287I(r11)     // Catch:{ all -> 0x00d0 }
            r11.mo52072n(r1)     // Catch:{ all -> 0x00d0 }
            if (r10 != r6) goto L_0x0131
            com.google.android.gms.measurement.internal.o2 r10 = r8.mo52016b()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.m2 r10 = r10.f33729l     // Catch:{ all -> 0x00d0 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.mo52238b(r9, r11)     // Catch:{ all -> 0x00d0 }
            goto L_0x0140
        L_0x0131:
            com.google.android.gms.measurement.internal.o2 r9 = r8.mo52016b()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.m2 r9 = r9.f33732o     // Catch:{ all -> 0x00d0 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00d0 }
            r9.mo52239c(r10, r11, r2)     // Catch:{ all -> 0x00d0 }
        L_0x0140:
            com.google.android.gms.measurement.internal.t2 r9 = r8.f33487c     // Catch:{ all -> 0x00d0 }
            m24287I(r9)     // Catch:{ all -> 0x00d0 }
            boolean r9 = r9.mo52315k()     // Catch:{ all -> 0x00d0 }
            if (r9 == 0) goto L_0x0155
            boolean r9 = r8.mo52005G()     // Catch:{ all -> 0x00d0 }
            if (r9 == 0) goto L_0x0155
            r8.mo52034t()     // Catch:{ all -> 0x00d0 }
            goto L_0x0158
        L_0x0155:
            r8.mo52002D()     // Catch:{ all -> 0x00d0 }
        L_0x0158:
            com.google.android.gms.measurement.internal.h r9 = r8.f33488d     // Catch:{ all -> 0x00d0 }
            m24287I(r9)     // Catch:{ all -> 0x00d0 }
            r9.mo52071m()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.h r9 = r8.f33488d     // Catch:{ all -> 0x0177 }
            m24287I(r9)     // Catch:{ all -> 0x0177 }
            r9.mo52067Q()     // Catch:{ all -> 0x0177 }
            r8.f33504t = r0
            r8.mo51999A()
            return
        L_0x016e:
            com.google.android.gms.measurement.internal.h r10 = r8.f33488d     // Catch:{ all -> 0x0177 }
            m24287I(r10)     // Catch:{ all -> 0x0177 }
            r10.mo52067Q()     // Catch:{ all -> 0x0177 }
            throw r9     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r9 = move-exception
            r8.f33504t = r0
            r8.mo51999A()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52026l(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x03b4 A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03dc A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ef A[SYNTHETIC, Splitter:B:126:0x03ef] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x048c A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04aa A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0545 A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124 A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01de A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x023b A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024a A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x025a A[Catch:{ SQLiteException -> 0x01c7, all -> 0x0575 }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52027m(com.google.android.gms.measurement.internal.zzp r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.s3 r8 = r24.mo52015a()
            r8.mo51995g()
            r24.mo52021g()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            java.lang.String r8 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            boolean r8 = r24.mo52003E(r25)
            if (r8 == 0) goto L_0x057f
            com.google.android.gms.measurement.internal.h r8 = r1.f33488d
            m24287I(r8)
            java.lang.String r9 = r2.zza
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo52053C(r9)
            r9 = 0
            if (r8 == 0) goto L_0x0063
            java.lang.String r11 = r8.mo52375C()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0063
            java.lang.String r11 = r2.zzb
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0063
            r8.mo52382g(r9)
            com.google.android.gms.measurement.internal.h r11 = r1.f33488d
            m24287I(r11)
            r11.mo52072n(r8)
            com.google.android.gms.measurement.internal.n3 r8 = r1.f33486b
            m24287I(r8)
            java.lang.String r11 = r2.zza
            r8.mo51995g()
            o.b r8 = r8.f33703h
            r8.remove(r11)
        L_0x0063:
            boolean r8 = r2.zzh
            if (r8 != 0) goto L_0x006b
            r24.mo52007J(r25)
            return
        L_0x006b:
            long r11 = r2.zzm
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0079
            com.google.android.gms.common.util.Clock r8 = r24.mo52017c()
            long r11 = r8.currentTimeMillis()
        L_0x0079:
            com.google.android.gms.measurement.internal.u3 r8 = r1.f33497m
            com.google.android.gms.measurement.internal.l r8 = r8.mo52326m()
            r8.mo51995g()
            r15 = 0
            r8.f33644g = r15
            r8.f33645h = r9
            int r8 = r2.zzn
            r13 = 1
            if (r8 == 0) goto L_0x00a4
            if (r8 == r13) goto L_0x00a4
            com.google.android.gms.measurement.internal.o2 r14 = r24.mo52016b()
            com.google.android.gms.measurement.internal.m2 r14 = r14.f33727j
            java.lang.String r15 = r2.zza
            com.google.android.gms.measurement.internal.n2 r15 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r15)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r14.mo52239c(r15, r9, r8)
            r8 = 0
        L_0x00a4:
            com.google.android.gms.measurement.internal.h r9 = r1.f33488d
            m24287I(r9)
            r9.mo52065O()
            com.google.android.gms.measurement.internal.h r9 = r1.f33488d     // Catch:{ all -> 0x0575 }
            m24287I(r9)     // Catch:{ all -> 0x0575 }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.i7 r9 = r9.mo52058H(r10, r14)     // Catch:{ all -> 0x0575 }
            if (r9 == 0) goto L_0x00c9
            java.lang.String r10 = "auto"
            java.lang.String r14 = r9.f33581b     // Catch:{ all -> 0x0575 }
            boolean r10 = r10.equals(r14)     // Catch:{ all -> 0x0575 }
            if (r10 == 0) goto L_0x00c6
            goto L_0x00c9
        L_0x00c6:
            r20 = r3
            goto L_0x0111
        L_0x00c9:
            java.lang.Boolean r10 = r2.zzr     // Catch:{ all -> 0x0575 }
            if (r10 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.zzkv r15 = new com.google.android.gms.measurement.internal.zzkv     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_npa"
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0575 }
            if (r13 == r10) goto L_0x00da
            r20 = 0
            goto L_0x00dc
        L_0x00da:
            r20 = 1
        L_0x00dc:
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0575 }
            java.lang.String r18 = "auto"
            r20 = r3
            r3 = r13
            r13 = r15
            r3 = r15
            r15 = r11
            r17 = r10
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0575 }
            if (r9 == 0) goto L_0x00f9
            java.lang.Object r9 = r9.f33584e     // Catch:{ all -> 0x0575 }
            java.lang.Long r10 = r3.zzd     // Catch:{ all -> 0x0575 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0575 }
            if (r9 != 0) goto L_0x0111
        L_0x00f9:
            r1.mo52033s(r3, r2)     // Catch:{ all -> 0x0575 }
            goto L_0x0111
        L_0x00fd:
            r20 = r3
            if (r9 == 0) goto L_0x0111
            com.google.android.gms.measurement.internal.zzkv r3 = new com.google.android.gms.measurement.internal.zzkv     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r3
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0575 }
            r1.mo52029o(r3, r2)     // Catch:{ all -> 0x0575 }
        L_0x0111:
            com.google.android.gms.measurement.internal.h r3 = r1.f33488d     // Catch:{ all -> 0x0575 }
            m24287I(r3)     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0575 }
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.z3 r15 = r3.mo52053C(r9)     // Catch:{ all -> 0x0575 }
            if (r15 == 0) goto L_0x01dc
            com.google.android.gms.measurement.internal.k7 r3 = r24.mo52013Q()     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = r2.zzb     // Catch:{ all -> 0x0575 }
            java.lang.String r10 = r15.mo52375C()     // Catch:{ all -> 0x0575 }
            java.lang.String r13 = r2.zzq     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = r15.mo52397v()     // Catch:{ all -> 0x0575 }
            r3.getClass()     // Catch:{ all -> 0x0575 }
            boolean r3 = com.google.android.gms.measurement.internal.C15018k7.m24473V(r9, r10, r13, r14)     // Catch:{ all -> 0x0575 }
            if (r3 == 0) goto L_0x01dc
            com.google.android.gms.measurement.internal.o2 r3 = r24.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33727j     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r15.mo52399x()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.n2 r10 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0575 }
            r3.mo52238b(r10, r9)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.h r3 = r1.f33488d     // Catch:{ all -> 0x0575 }
            m24287I(r3)     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = r15.mo52399x()     // Catch:{ all -> 0x0575 }
            r3.mo51942h()     // Catch:{ all -> 0x0575 }
            r3.mo51995g()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch:{ all -> 0x0575 }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo52052B()     // Catch:{ SQLiteException -> 0x01c7 }
            r13 = 1
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01c7 }
            r13 = 0
            r14[r13] = r9     // Catch:{ SQLiteException -> 0x01c7 }
            java.lang.String r15 = "events"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            java.lang.String r13 = "user_attributes"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "conditional_properties"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "apps"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "raw_events"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "raw_events_metadata"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "event_filters"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "property_filters"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "audience_filter_values"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r13
            java.lang.String r13 = "consent_settings"
            int r0 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c7 }
            int r15 = r15 + r0
            if (r15 <= 0) goto L_0x01db
            com.google.android.gms.measurement.internal.o4 r0 = r3.f33681b     // Catch:{ SQLiteException -> 0x01c7 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x01c7 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x01c7 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o     // Catch:{ SQLiteException -> 0x01c7 }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01c7 }
            r0.mo52239c(r9, r10, r13)     // Catch:{ SQLiteException -> 0x01c7 }
            goto L_0x01db
        L_0x01c7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ all -> 0x0575 }
            java.lang.String r10 = "Error deleting application data. appId, error"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r9)     // Catch:{ all -> 0x0575 }
            r3.mo52239c(r9, r10, r0)     // Catch:{ all -> 0x0575 }
        L_0x01db:
            r15 = 0
        L_0x01dc:
            if (r15 == 0) goto L_0x0235
            long r9 = r15.mo52396u()     // Catch:{ all -> 0x0575 }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01f5
            long r9 = r15.mo52396u()     // Catch:{ all -> 0x0575 }
            long r13 = r2.zzj     // Catch:{ all -> 0x0575 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01f5
            r14 = 1
            goto L_0x01f6
        L_0x01f5:
            r14 = 0
        L_0x01f6:
            java.lang.String r0 = r15.mo52401z()     // Catch:{ all -> 0x0575 }
            long r9 = r15.mo52396u()     // Catch:{ all -> 0x0575 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x0211
            if (r0 == 0) goto L_0x0211
            java.lang.String r3 = r2.zzc     // Catch:{ all -> 0x0575 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0575 }
            if (r3 != 0) goto L_0x0211
            r3 = 1
            goto L_0x0212
        L_0x0211:
            r3 = 0
        L_0x0212:
            r3 = r3 | r14
            if (r3 == 0) goto L_0x0235
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0575 }
            r3.<init>()     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = "_pv"
            r3.putString(r9, r0)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.zzat r0 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.zzar r15 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0575 }
            r15.<init>(r3)     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r3 = 0
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0575 }
            r1.mo52023i(r0, r2)     // Catch:{ all -> 0x0575 }
            goto L_0x0236
        L_0x0235:
            r3 = 0
        L_0x0236:
            r24.mo52007J(r25)     // Catch:{ all -> 0x0575 }
            if (r8 != 0) goto L_0x024a
            com.google.android.gms.measurement.internal.h r0 = r1.f33488d     // Catch:{ all -> 0x0575 }
            m24287I(r0)     // Catch:{ all -> 0x0575 }
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = "_f"
            com.google.android.gms.measurement.internal.n r0 = r0.mo52057G(r8, r9)     // Catch:{ all -> 0x0575 }
            r14 = r3
            goto L_0x0258
        L_0x024a:
            com.google.android.gms.measurement.internal.h r0 = r1.f33488d     // Catch:{ all -> 0x0575 }
            m24287I(r0)     // Catch:{ all -> 0x0575 }
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x0575 }
            java.lang.String r9 = "_v"
            com.google.android.gms.measurement.internal.n r0 = r0.mo52057G(r8, r9)     // Catch:{ all -> 0x0575 }
            r14 = 1
        L_0x0258:
            if (r0 != 0) goto L_0x0545
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r15 = r11 / r8
            r10 = r4
            r3 = 1
            long r15 = r15 + r3
            long r15 = r15 * r8
            java.lang.String r8 = "_dac"
            java.lang.String r9 = "_r"
            java.lang.String r13 = "_c"
            java.lang.String r3 = "_et"
            if (r14 != 0) goto L_0x04c4
            com.google.android.gms.measurement.internal.zzkv r0 = new com.google.android.gms.measurement.internal.zzkv     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0575 }
            java.lang.String r18 = "auto"
            r4 = r13
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0575 }
            r1.mo52033s(r0, r2)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.s3 r0 = r24.mo52015a()     // Catch:{ all -> 0x0575 }
            r0.mo51995g()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.e3 r0 = r1.f33496l     // Catch:{ all -> 0x0575 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0575 }
            r13 = r0
            com.google.android.gms.measurement.internal.e3 r13 = (com.google.android.gms.measurement.internal.C14960e3) r13     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x0377
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0575 }
            if (r14 == 0) goto L_0x029d
            goto L_0x0377
        L_0x029d:
            com.google.android.gms.measurement.internal.u3 r14 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.s3 r14 = r14.mo52015a()     // Catch:{ all -> 0x0575 }
            r14.mo51995g()     // Catch:{ all -> 0x0575 }
            boolean r14 = r13.mo51990a()     // Catch:{ all -> 0x0575 }
            if (r14 != 0) goto L_0x02bd
            com.google.android.gms.measurement.internal.u3 r0 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33730m     // Catch:{ all -> 0x0575 }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.mo52237a(r5)     // Catch:{ all -> 0x0575 }
            r22 = r11
            goto L_0x0386
        L_0x02bd:
            com.google.android.gms.measurement.internal.zzfc r14 = new com.google.android.gms.measurement.internal.zzfc     // Catch:{ all -> 0x0575 }
            r14.<init>(r13, r0)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.u3 r0 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()     // Catch:{ all -> 0x0575 }
            r0.mo51995g()     // Catch:{ all -> 0x0575 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0575 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0575 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0575 }
            r22 = r11
            java.lang.String r11 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r5, r11)     // Catch:{ all -> 0x0575 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.u3 r11 = r13.f33444a     // Catch:{ all -> 0x0575 }
            android.content.Context r11 = r11.f33872b     // Catch:{ all -> 0x0575 }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ all -> 0x0575 }
            if (r11 != 0) goto L_0x02f7
            com.google.android.gms.measurement.internal.u3 r0 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33728k     // Catch:{ all -> 0x0575 }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo52237a(r5)     // Catch:{ all -> 0x0575 }
            goto L_0x0386
        L_0x02f7:
            r12 = 0
            java.util.List r11 = r11.queryIntentServices(r0, r12)     // Catch:{ all -> 0x0575 }
            if (r11 == 0) goto L_0x0369
            boolean r15 = r11.isEmpty()     // Catch:{ all -> 0x0575 }
            if (r15 != 0) goto L_0x0369
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x0575 }
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11     // Catch:{ all -> 0x0575 }
            android.content.pm.ServiceInfo r11 = r11.serviceInfo     // Catch:{ all -> 0x0575 }
            if (r11 == 0) goto L_0x0386
            java.lang.String r12 = r11.packageName     // Catch:{ all -> 0x0575 }
            java.lang.String r11 = r11.name     // Catch:{ all -> 0x0575 }
            if (r11 == 0) goto L_0x035b
            boolean r5 = r5.equals(r12)     // Catch:{ all -> 0x0575 }
            if (r5 == 0) goto L_0x035b
            boolean r5 = r13.mo51990a()     // Catch:{ all -> 0x0575 }
            if (r5 == 0) goto L_0x035b
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x0575 }
            r5.<init>(r0)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ RuntimeException -> 0x0348 }
            com.google.android.gms.measurement.internal.u3 r11 = r13.f33444a     // Catch:{ RuntimeException -> 0x0348 }
            android.content.Context r11 = r11.f33872b     // Catch:{ RuntimeException -> 0x0348 }
            r12 = 1
            boolean r0 = r0.bindService(r11, r5, r14, r12)     // Catch:{ RuntimeException -> 0x0348 }
            com.google.android.gms.measurement.internal.u3 r5 = r13.f33444a     // Catch:{ RuntimeException -> 0x0348 }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ RuntimeException -> 0x0348 }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33732o     // Catch:{ RuntimeException -> 0x0348 }
            java.lang.String r11 = "Install Referrer Service is"
            java.lang.String r12 = "available"
            java.lang.String r14 = "not available"
            r15 = 1
            if (r15 == r0) goto L_0x0344
            r12 = r14
        L_0x0344:
            r5.mo52238b(r12, r11)     // Catch:{ RuntimeException -> 0x0348 }
            goto L_0x0386
        L_0x0348:
            r0 = move-exception
            com.google.android.gms.measurement.internal.u3 r5 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ all -> 0x0575 }
            java.lang.String r11 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0575 }
            r5.mo52238b(r0, r11)     // Catch:{ all -> 0x0575 }
            goto L_0x0386
        L_0x035b:
            com.google.android.gms.measurement.internal.u3 r0 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ all -> 0x0575 }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo52237a(r5)     // Catch:{ all -> 0x0575 }
            goto L_0x0386
        L_0x0369:
            com.google.android.gms.measurement.internal.u3 r0 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33730m     // Catch:{ all -> 0x0575 }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo52237a(r5)     // Catch:{ all -> 0x0575 }
            goto L_0x0386
        L_0x0377:
            r22 = r11
            com.google.android.gms.measurement.internal.u3 r0 = r13.f33444a     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33728k     // Catch:{ all -> 0x0575 }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo52237a(r5)     // Catch:{ all -> 0x0575 }
        L_0x0386:
            com.google.android.gms.measurement.internal.s3 r0 = r24.mo52015a()     // Catch:{ all -> 0x0575 }
            r0.mo51995g()     // Catch:{ all -> 0x0575 }
            r24.mo52021g()     // Catch:{ all -> 0x0575 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0575 }
            r5.<init>()     // Catch:{ all -> 0x0575 }
            r11 = 1
            r5.putLong(r4, r11)     // Catch:{ all -> 0x0575 }
            r5.putLong(r9, r11)     // Catch:{ all -> 0x0575 }
            r13 = 0
            r5.putLong(r7, r13)     // Catch:{ all -> 0x0575 }
            r5.putLong(r6, r13)     // Catch:{ all -> 0x0575 }
            r5.putLong(r10, r13)     // Catch:{ all -> 0x0575 }
            r4 = r20
            r5.putLong(r4, r13)     // Catch:{ all -> 0x0575 }
            r5.putLong(r3, r11)     // Catch:{ all -> 0x0575 }
            boolean r0 = r2.zzp     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x03b7
            r5.putLong(r8, r11)     // Catch:{ all -> 0x0575 }
        L_0x03b7:
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x0575 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0575 }
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.h r0 = r1.f33488d     // Catch:{ all -> 0x0575 }
            m24287I(r0)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x0575 }
            r0.mo51995g()     // Catch:{ all -> 0x0575 }
            r0.mo51942h()     // Catch:{ all -> 0x0575 }
            long r13 = r0.mo52083z(r8)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.u3 r0 = r1.f33497m     // Catch:{ all -> 0x0575 }
            android.content.Context r0 = r0.f33872b     // Catch:{ all -> 0x0575 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0575 }
            if (r0 != 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.o2 r0 = r24.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ all -> 0x0575 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r8)     // Catch:{ all -> 0x0575 }
            r0.mo52238b(r7, r4)     // Catch:{ all -> 0x0575 }
            r19 = r3
            goto L_0x04a4
        L_0x03ef:
            com.google.android.gms.measurement.internal.u3 r0 = r1.f33497m     // Catch:{ NameNotFoundException -> 0x03fd }
            android.content.Context r0 = r0.f33872b     // Catch:{ NameNotFoundException -> 0x03fd }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x03fd }
            r9 = 0
            android.content.pm.PackageInfo r15 = r0.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x03fd }
            goto L_0x040e
        L_0x03fd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o2 r9 = r24.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r9 = r9.f33724g     // Catch:{ all -> 0x0575 }
            java.lang.String r11 = "Package info is null, first open report might be inaccurate. appId"
            com.google.android.gms.measurement.internal.n2 r12 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r8)     // Catch:{ all -> 0x0575 }
            r9.mo52239c(r12, r11, r0)     // Catch:{ all -> 0x0575 }
            r15 = 0
        L_0x040e:
            if (r15 == 0) goto L_0x0466
            long r11 = r15.firstInstallTime     // Catch:{ all -> 0x0575 }
            r16 = 0
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0466
            r19 = r3
            r20 = r4
            long r3 = r15.lastUpdateTime     // Catch:{ all -> 0x0575 }
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0445
            com.google.android.gms.measurement.internal.d r0 = r24.mo52008K()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C14959e2.f33406g0     // Catch:{ all -> 0x0575 }
            r4 = 0
            boolean r0 = r0.mo51973p(r4, r3)     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x043d
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0442
            r11 = 1
            r5.putLong(r7, r11)     // Catch:{ all -> 0x0575 }
            r13 = 0
            goto L_0x0442
        L_0x043d:
            r11 = 1
            r5.putLong(r7, r11)     // Catch:{ all -> 0x0575 }
        L_0x0442:
            r11 = r13
            r14 = 0
            goto L_0x0448
        L_0x0445:
            r4 = 0
            r11 = r13
            r14 = 1
        L_0x0448:
            com.google.android.gms.measurement.internal.zzkv r0 = new com.google.android.gms.measurement.internal.zzkv     // Catch:{ all -> 0x0575 }
            java.lang.String r3 = "_fi"
            r7 = 1
            if (r7 == r14) goto L_0x0452
            r14 = 0
            goto L_0x0454
        L_0x0452:
            r14 = 1
        L_0x0454:
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0575 }
            java.lang.String r18 = "auto"
            r13 = r0
            r14 = r3
            r15 = r22
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0575 }
            r1.mo52033s(r0, r2)     // Catch:{ all -> 0x0575 }
            r13 = r11
            goto L_0x046b
        L_0x0466:
            r19 = r3
            r20 = r4
            r4 = 0
        L_0x046b:
            com.google.android.gms.measurement.internal.u3 r0 = r1.f33497m     // Catch:{ NameNotFoundException -> 0x0479 }
            android.content.Context r0 = r0.f33872b     // Catch:{ NameNotFoundException -> 0x0479 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0479 }
            r3 = 0
            android.content.pm.ApplicationInfo r15 = r0.getApplicationInfo(r8, r3)     // Catch:{ NameNotFoundException -> 0x0479 }
            goto L_0x048a
        L_0x0479:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o2 r3 = r24.mo52016b()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ all -> 0x0575 }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            com.google.android.gms.measurement.internal.n2 r8 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r8)     // Catch:{ all -> 0x0575 }
            r3.mo52239c(r8, r7, r0)     // Catch:{ all -> 0x0575 }
            r15 = r4
        L_0x048a:
            if (r15 == 0) goto L_0x04a4
            int r0 = r15.flags     // Catch:{ all -> 0x0575 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0497
            r3 = 1
            r5.putLong(r10, r3)     // Catch:{ all -> 0x0575 }
        L_0x0497:
            int r0 = r15.flags     // Catch:{ all -> 0x0575 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x04a4
            r3 = r20
            r7 = 1
            r5.putLong(r3, r7)     // Catch:{ all -> 0x0575 }
        L_0x04a4:
            r3 = 0
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04ad
            r5.putLong(r6, r13)     // Catch:{ all -> 0x0575 }
        L_0x04ad:
            com.google.android.gms.measurement.internal.zzat r0 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.zzar r15 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0575 }
            r15.<init>(r5)     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r22
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0575 }
            r1.mo52025k(r0, r2)     // Catch:{ all -> 0x0575 }
            r3 = r19
            goto L_0x0513
        L_0x04c4:
            r19 = r3
            r22 = r11
            r4 = r13
            com.google.android.gms.measurement.internal.zzkv r0 = new com.google.android.gms.measurement.internal.zzkv     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0575 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r22
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0575 }
            r1.mo52033s(r0, r2)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.s3 r0 = r24.mo52015a()     // Catch:{ all -> 0x0575 }
            r0.mo51995g()     // Catch:{ all -> 0x0575 }
            r24.mo52021g()     // Catch:{ all -> 0x0575 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0575 }
            r0.<init>()     // Catch:{ all -> 0x0575 }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x0575 }
            r0.putLong(r9, r5)     // Catch:{ all -> 0x0575 }
            r3 = r19
            r0.putLong(r3, r5)     // Catch:{ all -> 0x0575 }
            boolean r4 = r2.zzp     // Catch:{ all -> 0x0575 }
            if (r4 == 0) goto L_0x04ff
            r0.putLong(r8, r5)     // Catch:{ all -> 0x0575 }
        L_0x04ff:
            com.google.android.gms.measurement.internal.zzat r4 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.zzar r15 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0575 }
            r15.<init>(r0)     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r4
            r17 = r22
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0575 }
            r1.mo52025k(r4, r2)     // Catch:{ all -> 0x0575 }
        L_0x0513:
            com.google.android.gms.measurement.internal.d r0 = r24.mo52008K()     // Catch:{ all -> 0x0575 }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C14959e2.f33387U     // Catch:{ all -> 0x0575 }
            boolean r0 = r0.mo51973p(r4, r5)     // Catch:{ all -> 0x0575 }
            if (r0 != 0) goto L_0x0564
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0575 }
            r0.<init>()     // Catch:{ all -> 0x0575 }
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0575 }
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.zzat r3 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_e"
            com.google.android.gms.measurement.internal.zzar r15 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0575 }
            r15.<init>(r0)     // Catch:{ all -> 0x0575 }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r22
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0575 }
            r1.mo52025k(r3, r2)     // Catch:{ all -> 0x0575 }
            goto L_0x0564
        L_0x0545:
            r22 = r11
            boolean r0 = r2.zzi     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x0564
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0575 }
            r0.<init>()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.zzat r3 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.zzar r15 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0575 }
            r15.<init>(r0)     // Catch:{ all -> 0x0575 }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r22
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0575 }
            r1.mo52025k(r3, r2)     // Catch:{ all -> 0x0575 }
        L_0x0564:
            com.google.android.gms.measurement.internal.h r0 = r1.f33488d     // Catch:{ all -> 0x0575 }
            m24287I(r0)     // Catch:{ all -> 0x0575 }
            r0.mo52071m()     // Catch:{ all -> 0x0575 }
            com.google.android.gms.measurement.internal.h r0 = r1.f33488d
            m24287I(r0)
            r0.mo52067Q()
            return
        L_0x0575:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            r2.mo52067Q()
            throw r0
        L_0x057f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52027m(com.google.android.gms.measurement.internal.zzp):void");
    }

    /* renamed from: n */
    public final void mo52028n(zzab zzab, zzp zzp) {
        Preconditions.checkNotNull(zzab);
        Preconditions.checkNotEmpty(zzab.zza);
        Preconditions.checkNotNull(zzab.zzc);
        Preconditions.checkNotEmpty(zzab.zzc.zzb);
        mo52015a().mo51995g();
        mo52021g();
        if (mo52003E(zzp)) {
            if (zzp.zzh) {
                C14983h hVar = this.f33488d;
                m24287I(hVar);
                hVar.mo52065O();
                try {
                    mo52007J(zzp);
                    String str = (String) Preconditions.checkNotNull(zzab.zza);
                    C14983h hVar2 = this.f33488d;
                    m24287I(hVar2);
                    zzab D = hVar2.mo52054D(str, zzab.zzc.zzb);
                    if (D != null) {
                        mo52016b().f33731n.mo52239c(zzab.zza, "Removing conditional user property", this.f33497m.f33884n.mo52144f(zzab.zzc.zzb));
                        C14983h hVar3 = this.f33488d;
                        m24287I(hVar3);
                        hVar3.mo52080w(str, zzab.zzc.zzb);
                        if (D.zze) {
                            C14983h hVar4 = this.f33488d;
                            m24287I(hVar4);
                            hVar4.mo52070l(str, zzab.zzc.zzb);
                        }
                        zzat zzat = zzab.zzk;
                        if (zzat != null) {
                            zzar zzar = zzat.zzb;
                            mo52035u((zzat) Preconditions.checkNotNull(mo52013Q().mo52217m0(str, ((zzat) Preconditions.checkNotNull(zzab.zzk)).zza, zzar != null ? zzar.zzc() : null, D.zzb, zzab.zzk.zzd, true)), zzp);
                        }
                    } else {
                        mo52016b().f33727j.mo52239c(C15049o2.m24575p(zzab.zza), "Conditional user property doesn't exist", this.f33497m.f33884n.mo52144f(zzab.zzc.zzb));
                    }
                    C14983h hVar5 = this.f33488d;
                    m24287I(hVar5);
                    hVar5.mo52071m();
                } finally {
                    C14983h hVar6 = this.f33488d;
                    m24287I(hVar6);
                    hVar6.mo52067Q();
                }
            } else {
                mo52007J(zzp);
            }
        }
    }

    /* renamed from: o */
    public final void mo52029o(zzkv zzkv, zzp zzp) {
        mo52015a().mo51995g();
        mo52021g();
        if (mo52003E(zzp)) {
            if (!zzp.zzh) {
                mo52007J(zzp);
            } else if (!"_npa".equals(zzkv.zzb) || zzp.zzr == null) {
                mo52016b().f33731n.mo52238b(this.f33497m.f33884n.mo52144f(zzkv.zzb), "Removing user property");
                C14983h hVar = this.f33488d;
                m24287I(hVar);
                hVar.mo52065O();
                try {
                    mo52007J(zzp);
                    C14893z7.m24209b();
                    if (this.f33497m.f33878h.mo51973p((String) null, C14959e2.f33430s0) && this.f33497m.f33878h.mo51973p((String) null, C14959e2.f33434u0) && AnalyticsLogDatabaseHelper.f19040ID.equals(zzkv.zzb)) {
                        C14983h hVar2 = this.f33488d;
                        m24287I(hVar2);
                        hVar2.mo52070l((String) Preconditions.checkNotNull(zzp.zza), "_lair");
                    }
                    C14983h hVar3 = this.f33488d;
                    m24287I(hVar3);
                    hVar3.mo52070l((String) Preconditions.checkNotNull(zzp.zza), zzkv.zzb);
                    C14983h hVar4 = this.f33488d;
                    m24287I(hVar4);
                    hVar4.mo52071m();
                    mo52016b().f33731n.mo52238b(this.f33497m.f33884n.mo52144f(zzkv.zzb), "User property removed");
                } finally {
                    C14983h hVar5 = this.f33488d;
                    m24287I(hVar5);
                    hVar5.mo52067Q();
                }
            } else {
                mo52016b().f33731n.mo52237a("Falling back to manifest metadata value for ad personalization");
                mo52033s(new zzkv("_npa", mo52017c().currentTimeMillis(), Long.valueOf(true != zzp.zzr.booleanValue() ? 0 : 1), "auto"), zzp);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: p */
    public final void mo52030p(zzp zzp) {
        if (this.f33509y != null) {
            ArrayList arrayList = new ArrayList();
            this.f33510z = arrayList;
            arrayList.addAll(this.f33509y);
        }
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        String str = (String) Preconditions.checkNotNull(zzp.zza);
        Preconditions.checkNotEmpty(str);
        hVar.mo51995g();
        hVar.mo51942h();
        try {
            SQLiteDatabase B = hVar.mo52052B();
            String[] strArr = {str};
            int delete = B.delete("apps", "app_id=?", strArr) + B.delete("events", "app_id=?", strArr) + B.delete("user_attributes", "app_id=?", strArr) + B.delete("conditional_properties", "app_id=?", strArr) + B.delete("raw_events", "app_id=?", strArr) + B.delete("raw_events_metadata", "app_id=?", strArr) + B.delete("queue", "app_id=?", strArr) + B.delete("audience_filter_values", "app_id=?", strArr) + B.delete("main_event_params", "app_id=?", strArr) + B.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                ((C15103u3) hVar.f33681b).mo52016b().f33732o.mo52239c(str, "Reset analytics data. app, records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            ((C15103u3) hVar.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error resetting analytics data. appId, error", e);
        }
        if (zzp.zzh) {
            mo52027m(zzp);
        }
    }

    /* renamed from: q */
    public final void mo52031q(zzab zzab, zzp zzp) {
        zzat zzat;
        Preconditions.checkNotNull(zzab);
        Preconditions.checkNotEmpty(zzab.zza);
        Preconditions.checkNotNull(zzab.zzb);
        Preconditions.checkNotNull(zzab.zzc);
        Preconditions.checkNotEmpty(zzab.zzc.zzb);
        mo52015a().mo51995g();
        mo52021g();
        if (mo52003E(zzp)) {
            if (!zzp.zzh) {
                mo52007J(zzp);
                return;
            }
            zzab zzab2 = new zzab(zzab);
            boolean z = false;
            zzab2.zze = false;
            C14983h hVar = this.f33488d;
            m24287I(hVar);
            hVar.mo52065O();
            try {
                C14983h hVar2 = this.f33488d;
                m24287I(hVar2);
                zzab D = hVar2.mo52054D((String) Preconditions.checkNotNull(zzab2.zza), zzab2.zzc.zzb);
                if (D != null && !D.zzb.equals(zzab2.zzb)) {
                    mo52016b().f33727j.mo52240d(this.f33497m.f33884n.mo52144f(zzab2.zzc.zzb), zzab2.zzb, D.zzb, "Updating a conditional user property with different origin. name, origin, origin (from DB)");
                }
                if (D != null && D.zze) {
                    zzab2.zzb = D.zzb;
                    zzab2.zzd = D.zzd;
                    zzab2.zzh = D.zzh;
                    zzab2.zzf = D.zzf;
                    zzab2.zzi = D.zzi;
                    zzab2.zze = true;
                    zzkv zzkv = zzab2.zzc;
                    zzab2.zzc = new zzkv(zzkv.zzb, D.zzc.zzc, zzkv.zza(), D.zzc.zzf);
                } else if (TextUtils.isEmpty(zzab2.zzf)) {
                    zzkv zzkv2 = zzab2.zzc;
                    zzab2.zzc = new zzkv(zzkv2.zzb, zzab2.zzd, zzkv2.zza(), zzab2.zzc.zzf);
                    zzab2.zze = true;
                    z = true;
                }
                if (zzab2.zze) {
                    zzkv zzkv3 = zzab2.zzc;
                    C15000i7 i7Var = new C15000i7((String) Preconditions.checkNotNull(zzab2.zza), zzab2.zzb, zzkv3.zzb, zzkv3.zzc, Preconditions.checkNotNull(zzkv3.zza()));
                    C14983h hVar3 = this.f33488d;
                    m24287I(hVar3);
                    if (hVar3.mo52078t(i7Var)) {
                        mo52016b().f33731n.mo52240d(zzab2.zza, this.f33497m.f33884n.mo52144f(i7Var.f33582c), i7Var.f33584e, "User property updated immediately");
                    } else {
                        mo52016b().f33724g.mo52240d(C15049o2.m24575p(zzab2.zza), this.f33497m.f33884n.mo52144f(i7Var.f33582c), i7Var.f33584e, "(2)Too many active user properties, ignoring");
                    }
                    if (z && (zzat = zzab2.zzi) != null) {
                        mo52035u(new zzat(zzat, zzab2.zzd), zzp);
                    }
                }
                C14983h hVar4 = this.f33488d;
                m24287I(hVar4);
                if (hVar4.mo52077s(zzab2)) {
                    mo52016b().f33731n.mo52240d(zzab2.zza, this.f33497m.f33884n.mo52144f(zzab2.zzc.zzb), zzab2.zzc.zza(), "Conditional property added");
                } else {
                    mo52016b().f33724g.mo52240d(C15049o2.m24575p(zzab2.zza), this.f33497m.f33884n.mo52144f(zzab2.zzc.zzb), zzab2.zzc.zza(), "Too many conditional properties, ignoring");
                }
                C14983h hVar5 = this.f33488d;
                m24287I(hVar5);
                hVar5.mo52071m();
            } finally {
                C14983h hVar6 = this.f33488d;
                m24287I(hVar6);
                hVar6.mo52067Q();
            }
        }
    }

    /* renamed from: r */
    public final void mo52032r(String str, C14956e eVar) {
        mo52015a().mo51995g();
        mo52021g();
        this.f33484B.put(str, eVar);
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(eVar);
        hVar.mo51995g();
        hVar.mo51942h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", eVar.mo51984d());
        try {
            if (hVar.mo52052B().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                ((C15103u3) hVar.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e) {
            ((C15103u3) hVar.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error storing consent setting. appId, error", e);
        }
    }

    /* renamed from: s */
    public final void mo52033s(zzkv zzkv, zzp zzp) {
        long j;
        mo52015a().mo51995g();
        mo52021g();
        if (mo52003E(zzp)) {
            if (!zzp.zzh) {
                mo52007J(zzp);
                return;
            }
            int f0 = mo52013Q().mo52209f0(zzkv.zzb);
            int i = 0;
            if (f0 != 0) {
                C15018k7 Q = mo52013Q();
                String str = zzkv.zzb;
                mo52008K();
                Q.getClass();
                String m = C15018k7.m24478m(24, str, true);
                String str2 = zzkv.zzb;
                int length = str2 != null ? str2.length() : 0;
                C15018k7 Q2 = mo52013Q();
                C1353o0 o0Var = this.f33485C;
                String str3 = zzp.zza;
                Q2.getClass();
                C15018k7.m24482v(o0Var, str3, f0, "_ev", m, length);
                return;
            }
            int b0 = mo52013Q().mo52205b0(zzkv.zza(), zzkv.zzb);
            if (b0 != 0) {
                C15018k7 Q3 = mo52013Q();
                String str4 = zzkv.zzb;
                mo52008K();
                Q3.getClass();
                String m2 = C15018k7.m24478m(24, str4, true);
                Object zza = zzkv.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    i = zza.toString().length();
                }
                C15018k7 Q4 = mo52013Q();
                C1353o0 o0Var2 = this.f33485C;
                String str5 = zzp.zza;
                Q4.getClass();
                C15018k7.m24482v(o0Var2, str5, b0, "_ev", m2, i);
                return;
            }
            Object l = mo52013Q().mo52215l(zzkv.zza(), zzkv.zzb);
            if (l != null) {
                if ("_sid".equals(zzkv.zzb)) {
                    long j2 = zzkv.zzc;
                    String str6 = zzkv.zzf;
                    String str7 = (String) Preconditions.checkNotNull(zzp.zza);
                    C14983h hVar = this.f33488d;
                    m24287I(hVar);
                    C15000i7 H = hVar.mo52058H(str7, "_sno");
                    if (H != null) {
                        Object obj = H.f33584e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo52033s(new zzkv("_sno", j2, Long.valueOf(j + 1), str6), zzp);
                        }
                    }
                    if (H != null) {
                        mo52016b().f33727j.mo52238b(H.f33584e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    C14983h hVar2 = this.f33488d;
                    m24287I(hVar2);
                    C15037n G = hVar2.mo52057G(str7, "_s");
                    if (G != null) {
                        j = G.f33688c;
                        mo52016b().f33732o.mo52238b(Long.valueOf(j), "Backfill the session number. Last used session number");
                    } else {
                        j = 0;
                    }
                    mo52033s(new zzkv("_sno", j2, Long.valueOf(j + 1), str6), zzp);
                }
                C15000i7 i7Var = new C15000i7((String) Preconditions.checkNotNull(zzp.zza), (String) Preconditions.checkNotNull(zzkv.zzf), zzkv.zzb, zzkv.zzc, l);
                mo52016b().f33732o.mo52239c(this.f33497m.f33884n.mo52144f(i7Var.f33582c), "Setting user property", l);
                C14983h hVar3 = this.f33488d;
                m24287I(hVar3);
                hVar3.mo52065O();
                try {
                    C14893z7.m24209b();
                    if (this.f33497m.f33878h.mo51973p((String) null, C14959e2.f33430s0) && AnalyticsLogDatabaseHelper.f19040ID.equals(i7Var.f33582c)) {
                        C14983h hVar4 = this.f33488d;
                        m24287I(hVar4);
                        hVar4.mo52070l(zzp.zza, "_lair");
                    }
                    mo52007J(zzp);
                    C14983h hVar5 = this.f33488d;
                    m24287I(hVar5);
                    boolean t = hVar5.mo52078t(i7Var);
                    C14983h hVar6 = this.f33488d;
                    m24287I(hVar6);
                    hVar6.mo52071m();
                    if (!t) {
                        mo52016b().f33724g.mo52239c(this.f33497m.f33884n.mo52144f(i7Var.f33582c), "Too many unique user properties are set. Ignoring user property", i7Var.f33584e);
                        C15018k7 Q5 = mo52013Q();
                        C1353o0 o0Var3 = this.f33485C;
                        String str8 = zzp.zza;
                        Q5.getClass();
                        C15018k7.m24482v(o0Var3, str8, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C14983h hVar7 = this.f33488d;
                    m24287I(hVar7);
                    hVar7.mo52067Q();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:209|210) */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x027f, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        mo52016b().mo52275l().mo52239c(com.google.android.gms.measurement.internal.C15049o2.m24575p(r6), "Failed to parse upload URL. Not uploading. appId", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        if (r11 != null) goto L_0x0131;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:209:0x04c1 */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a8 A[SYNTHETIC, Splitter:B:140:0x02a8] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b1 A[Catch:{ all -> 0x0137, all -> 0x0572 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04d8 A[Catch:{ all -> 0x0137, all -> 0x0572 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x054e A[Catch:{ all -> 0x0137, all -> 0x0572 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0555 A[Catch:{ all -> 0x0137, all -> 0x0572 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x056e A[SYNTHETIC, Splitter:B:248:0x056e] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013b A[Catch:{ all -> 0x0137, all -> 0x0572 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x0131=Splitter:B:54:0x0131, B:200:0x0441=Splitter:B:200:0x0441, B:234:0x054a=Splitter:B:234:0x054a, B:128:0x027c=Splitter:B:128:0x027c, B:137:0x028d=Splitter:B:137:0x028d, B:51:0x011e=Splitter:B:51:0x011e} */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52034t() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.s3 r0 = r22.mo52015a()
            r0.mo51995g()
            r22.mo52021g()
            r2 = 1
            r1.f33506v = r2
            r3 = 0
            com.google.android.gms.measurement.internal.u3 r0 = r1.f33497m     // Catch:{ all -> 0x0572 }
            r0.getClass()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.u3 r0 = r1.f33497m     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.i6 r0 = r0.mo52333u()     // Catch:{ all -> 0x0572 }
            java.lang.Boolean r0 = r0.mo52134t()     // Catch:{ all -> 0x0572 }
            if (r0 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.o2 r0 = r22.mo52016b()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.mo52277n()     // Catch:{ all -> 0x0572 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo52237a(r2)     // Catch:{ all -> 0x0572 }
            r1.f33506v = r3
            goto L_0x0566
        L_0x0032:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0572 }
            if (r0 == 0) goto L_0x0049
            com.google.android.gms.measurement.internal.o2 r0 = r22.mo52016b()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.mo52275l()     // Catch:{ all -> 0x0572 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo52237a(r2)     // Catch:{ all -> 0x0572 }
            r1.f33506v = r3
            goto L_0x0566
        L_0x0049:
            long r4 = r1.f33500p     // Catch:{ all -> 0x0572 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.mo52002D()     // Catch:{ all -> 0x0572 }
            r1.f33506v = r3
            goto L_0x0566
        L_0x0058:
            com.google.android.gms.measurement.internal.s3 r0 = r22.mo52015a()     // Catch:{ all -> 0x0572 }
            r0.mo51995g()     // Catch:{ all -> 0x0572 }
            java.util.ArrayList r0 = r1.f33509y     // Catch:{ all -> 0x0572 }
            if (r0 == 0) goto L_0x0074
            com.google.android.gms.measurement.internal.o2 r0 = r22.mo52016b()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.mo52276m()     // Catch:{ all -> 0x0572 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo52237a(r2)     // Catch:{ all -> 0x0572 }
            r1.f33506v = r3
            goto L_0x0566
        L_0x0074:
            com.google.android.gms.measurement.internal.t2 r0 = r1.f33487c     // Catch:{ all -> 0x0572 }
            m24287I(r0)     // Catch:{ all -> 0x0572 }
            boolean r0 = r0.mo52315k()     // Catch:{ all -> 0x0572 }
            if (r0 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.o2 r0 = r22.mo52016b()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.mo52276m()     // Catch:{ all -> 0x0572 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo52237a(r2)     // Catch:{ all -> 0x0572 }
            r22.mo52002D()     // Catch:{ all -> 0x0572 }
            r1.f33506v = r3
            goto L_0x0566
        L_0x0093:
            com.google.android.gms.common.util.Clock r0 = r22.mo52017c()     // Catch:{ all -> 0x0572 }
            long r4 = r0.currentTimeMillis()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d r0 = r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C14959e2.f33383Q     // Catch:{ all -> 0x0572 }
            r9 = 0
            int r0 = r0.mo51968k(r9, r8)     // Catch:{ all -> 0x0572 }
            r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r8 = com.google.android.gms.measurement.internal.C14959e2.f33401e     // Catch:{ all -> 0x0572 }
            java.lang.Object r8 = r8.mo51978a(r9)     // Catch:{ all -> 0x0572 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0572 }
            long r10 = r8.longValue()     // Catch:{ all -> 0x0572 }
            long r10 = r4 - r10
            r8 = r3
        L_0x00b8:
            if (r8 >= r0) goto L_0x00c3
            boolean r12 = r1.mo52004F(r10)     // Catch:{ all -> 0x0572 }
            if (r12 == 0) goto L_0x00c3
            int r8 = r8 + 1
            goto L_0x00b8
        L_0x00c3:
            com.google.android.gms.measurement.internal.j6 r0 = r1.f33494j     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.y2 r0 = r0.f33617j     // Catch:{ all -> 0x0572 }
            long r10 = r0.mo52363a()     // Catch:{ all -> 0x0572 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00e6
            com.google.android.gms.measurement.internal.o2 r0 = r22.mo52016b()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.mo52274k()     // Catch:{ all -> 0x0572 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0572 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0572 }
            r0.mo52238b(r7, r6)     // Catch:{ all -> 0x0572 }
        L_0x00e6:
            com.google.android.gms.measurement.internal.h r0 = r1.f33488d     // Catch:{ all -> 0x0572 }
            m24287I(r0)     // Catch:{ all -> 0x0572 }
            java.lang.String r6 = r0.mo52060J()     // Catch:{ all -> 0x0572 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0572 }
            r7 = -1
            if (r0 != 0) goto L_0x04dc
            long r10 = r1.f33483A     // Catch:{ all -> 0x0572 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x013f
            com.google.android.gms.measurement.internal.h r10 = r1.f33488d     // Catch:{ all -> 0x0572 }
            m24287I(r10)     // Catch:{ all -> 0x0572 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo52052B()     // Catch:{ SQLiteException -> 0x011c, all -> 0x011a }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x011c, all -> 0x011a }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0118 }
            if (r0 != 0) goto L_0x0113
            goto L_0x0131
        L_0x0113:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0118 }
            goto L_0x0131
        L_0x0118:
            r0 = move-exception
            goto L_0x011e
        L_0x011a:
            r0 = move-exception
            goto L_0x0139
        L_0x011c:
            r0 = move-exception
            r11 = r9
        L_0x011e:
            com.google.android.gms.measurement.internal.o4 r10 = r10.f33681b     // Catch:{ all -> 0x0137 }
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10     // Catch:{ all -> 0x0137 }
            com.google.android.gms.measurement.internal.o2 r10 = r10.mo52016b()     // Catch:{ all -> 0x0137 }
            com.google.android.gms.measurement.internal.m2 r10 = r10.mo52275l()     // Catch:{ all -> 0x0137 }
            java.lang.String r12 = "Error querying raw events"
            r10.mo52238b(r0, r12)     // Catch:{ all -> 0x0137 }
            if (r11 == 0) goto L_0x0134
        L_0x0131:
            r11.close()     // Catch:{ all -> 0x0572 }
        L_0x0134:
            r1.f33483A = r7     // Catch:{ all -> 0x0572 }
            goto L_0x013f
        L_0x0137:
            r0 = move-exception
            r9 = r11
        L_0x0139:
            if (r9 == 0) goto L_0x013e
            r9.close()     // Catch:{ all -> 0x0572 }
        L_0x013e:
            throw r0     // Catch:{ all -> 0x0572 }
        L_0x013f:
            com.google.android.gms.measurement.internal.d r0 = r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C14959e2.f33407h     // Catch:{ all -> 0x0572 }
            int r0 = r0.mo51968k(r6, r7)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d r7 = r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C14959e2.f33409i     // Catch:{ all -> 0x0572 }
            int r7 = r7.mo51968k(r6, r8)     // Catch:{ all -> 0x0572 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.h r8 = r1.f33488d     // Catch:{ all -> 0x0572 }
            m24287I(r8)     // Catch:{ all -> 0x0572 }
            r8.mo51995g()     // Catch:{ all -> 0x0572 }
            r8.mo51942h()     // Catch:{ all -> 0x0572 }
            if (r0 <= 0) goto L_0x0166
            r10 = r2
            goto L_0x0167
        L_0x0166:
            r10 = r3
        L_0x0167:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0572 }
            if (r7 <= 0) goto L_0x016e
            r10 = r2
            goto L_0x016f
        L_0x016e:
            r10 = r3
        L_0x016f:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch:{ all -> 0x0572 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo52052B()     // Catch:{ SQLiteException -> 0x0289, all -> 0x0285 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0289, all -> 0x0285 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0289, all -> 0x0285 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0289, all -> 0x0285 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0289, all -> 0x0285 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0289, all -> 0x0285 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0281 }
            if (r0 != 0) goto L_0x01aa
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0281 }
            r11.close()     // Catch:{ all -> 0x0572 }
            r20 = r4
            goto L_0x02ab
        L_0x01aa:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0281 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0281 }
            r13 = r3
        L_0x01b0:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0281 }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0254 }
            com.google.android.gms.measurement.internal.f7 r2 = r8.f34048c     // Catch:{ IOException -> 0x0254 }
            com.google.android.gms.measurement.internal.h7 r2 = r2.f33492h     // Catch:{ IOException -> 0x0254 }
            m24287I(r2)     // Catch:{ IOException -> 0x0254 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x023d }
            r9.<init>(r0)     // Catch:{ IOException -> 0x023d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x023d }
            r0.<init>(r9)     // Catch:{ IOException -> 0x023d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x023d }
            r3.<init>()     // Catch:{ IOException -> 0x023d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x023d }
            r20 = r4
        L_0x01d4:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x023b }
            if (r4 > 0) goto L_0x0236
            r0.close()     // Catch:{ IOException -> 0x023b }
            r9.close()     // Catch:{ IOException -> 0x023b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x023b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x021c }
            if (r2 != 0) goto L_0x01f0
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x021c }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01f0
            goto L_0x027c
        L_0x01f0:
            com.google.android.gms.internal.measurement.z2 r2 = com.google.android.gms.internal.measurement.C14572a3.m23303y1()     // Catch:{ IOException -> 0x021f }
            com.google.android.gms.internal.measurement.q5 r2 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r2, r0)     // Catch:{ IOException -> 0x021f }
            com.google.android.gms.internal.measurement.z2 r2 = (com.google.android.gms.internal.measurement.C14888z2) r2     // Catch:{ IOException -> 0x021f }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x021c }
            if (r4 != 0) goto L_0x0208
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x021c }
            r2.mo50999r(r4)     // Catch:{ SQLiteException -> 0x021c }
        L_0x0208:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x021c }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.t5 r0 = r2.mo50807h()     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.internal.measurement.a3 r0 = (com.google.android.gms.internal.measurement.C14572a3) r0     // Catch:{ SQLiteException -> 0x021c }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x021c }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x021c }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x021c }
            goto L_0x026c
        L_0x021c:
            r0 = move-exception
            goto L_0x028d
        L_0x021f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r2 = r8.f33681b     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ SQLiteException -> 0x021c }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r6)     // Catch:{ SQLiteException -> 0x021c }
            r2.mo52239c(r4, r3, r0)     // Catch:{ SQLiteException -> 0x021c }
            goto L_0x026c
        L_0x0236:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x023b }
            goto L_0x01d4
        L_0x023b:
            r0 = move-exception
            goto L_0x0240
        L_0x023d:
            r0 = move-exception
            r20 = r4
        L_0x0240:
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ IOException -> 0x0252 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ IOException -> 0x0252 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ IOException -> 0x0252 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo52238b(r0, r3)     // Catch:{ IOException -> 0x0252 }
            throw r0     // Catch:{ IOException -> 0x0252 }
        L_0x0252:
            r0 = move-exception
            goto L_0x0257
        L_0x0254:
            r0 = move-exception
            r20 = r4
        L_0x0257:
            com.google.android.gms.measurement.internal.o4 r2 = r8.f33681b     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ SQLiteException -> 0x021c }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r6)     // Catch:{ SQLiteException -> 0x021c }
            r2.mo52239c(r4, r3, r0)     // Catch:{ SQLiteException -> 0x021c }
        L_0x026c:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x021c }
            if (r0 == 0) goto L_0x027c
            if (r13 <= r7) goto L_0x0275
            goto L_0x027c
        L_0x0275:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01b0
        L_0x027c:
            r11.close()     // Catch:{ all -> 0x0572 }
            r0 = r12
            goto L_0x02ab
        L_0x0281:
            r0 = move-exception
            r20 = r4
            goto L_0x028d
        L_0x0285:
            r0 = move-exception
            r9 = 0
            goto L_0x04d6
        L_0x0289:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x028d:
            com.google.android.gms.measurement.internal.o4 r2 = r8.f33681b     // Catch:{ all -> 0x04d4 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x04d4 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x04d4 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x04d4 }
            java.lang.String r3 = "Error querying bundles. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r6)     // Catch:{ all -> 0x04d4 }
            r2.mo52239c(r4, r3, r0)     // Catch:{ all -> 0x04d4 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d4 }
            if (r11 == 0) goto L_0x02ab
            r11.close()     // Catch:{ all -> 0x0572 }
        L_0x02ab:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0572 }
            if (r2 != 0) goto L_0x0563
            com.google.android.gms.measurement.internal.e r2 = r1.mo52009L(r6)     // Catch:{ all -> 0x0572 }
            boolean r2 = r2.mo51985e()     // Catch:{ all -> 0x0572 }
            if (r2 == 0) goto L_0x0310
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0572 }
        L_0x02bf:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0572 }
            if (r3 == 0) goto L_0x02de
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0572 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0572 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r3 = (com.google.android.gms.internal.measurement.C14572a3) r3     // Catch:{ all -> 0x0572 }
            java.lang.String r4 = r3.mo50294C()     // Catch:{ all -> 0x0572 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0572 }
            if (r4 != 0) goto L_0x02bf
            java.lang.String r2 = r3.mo50294C()     // Catch:{ all -> 0x0572 }
            goto L_0x02df
        L_0x02de:
            r2 = 0
        L_0x02df:
            if (r2 == 0) goto L_0x0310
            r3 = 0
        L_0x02e2:
            int r4 = r0.size()     // Catch:{ all -> 0x0572 }
            if (r3 >= r4) goto L_0x0310
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0572 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0572 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ all -> 0x0572 }
            java.lang.String r5 = r4.mo50294C()     // Catch:{ all -> 0x0572 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0572 }
            if (r5 == 0) goto L_0x02fd
            goto L_0x030d
        L_0x02fd:
            java.lang.String r4 = r4.mo50294C()     // Catch:{ all -> 0x0572 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0572 }
            if (r4 != 0) goto L_0x030d
            r2 = 0
            java.util.List r0 = r0.subList(r2, r3)     // Catch:{ all -> 0x0572 }
            goto L_0x0310
        L_0x030d:
            int r3 = r3 + 1
            goto L_0x02e2
        L_0x0310:
            com.google.android.gms.internal.measurement.x2 r2 = com.google.android.gms.internal.measurement.C14876y2.m24167r()     // Catch:{ all -> 0x0572 }
            int r3 = r0.size()     // Catch:{ all -> 0x0572 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0572 }
            int r5 = r0.size()     // Catch:{ all -> 0x0572 }
            r4.<init>(r5)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d r5 = r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.c r5 = r5.f33334d     // Catch:{ all -> 0x0572 }
            java.lang.String r7 = "gaia_collection_enabled"
            java.lang.String r5 = r5.mo51945e(r6, r7)     // Catch:{ all -> 0x0572 }
            java.lang.String r7 = "1"
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0572 }
            if (r5 == 0) goto L_0x0341
            com.google.android.gms.measurement.internal.e r5 = r1.mo52009L(r6)     // Catch:{ all -> 0x0572 }
            boolean r5 = r5.mo51985e()     // Catch:{ all -> 0x0572 }
            if (r5 == 0) goto L_0x0341
            r5 = 1
            goto L_0x0342
        L_0x0341:
            r5 = 0
        L_0x0342:
            com.google.android.gms.measurement.internal.e r7 = r1.mo52009L(r6)     // Catch:{ all -> 0x0572 }
            boolean r7 = r7.mo51985e()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.e r8 = r1.mo52009L(r6)     // Catch:{ all -> 0x0572 }
            boolean r8 = r8.mo51987f()     // Catch:{ all -> 0x0572 }
            r9 = 0
        L_0x0353:
            if (r9 >= r3) goto L_0x0404
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x0572 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0572 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.q5 r10 = r10.mo50872n()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.z2 r10 = (com.google.android.gms.internal.measurement.C14888z2) r10     // Catch:{ all -> 0x0572 }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x0572 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0572 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0572 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0572 }
            r4.add(r11)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d r11 = r22.mo52008K()     // Catch:{ all -> 0x0572 }
            r11.mo51969l()     // Catch:{ all -> 0x0572 }
            boolean r11 = r10.f33059d     // Catch:{ all -> 0x0572 }
            if (r11 == 0) goto L_0x0383
            r10.mo50809j()     // Catch:{ all -> 0x0572 }
            r11 = 0
            r10.f33059d = r11     // Catch:{ all -> 0x0572 }
        L_0x0383:
            MessageType r11 = r10.f33058c     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r11 = (com.google.android.gms.internal.measurement.C14572a3) r11     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.C14572a3.m23275P0(r11)     // Catch:{ all -> 0x0572 }
            boolean r11 = r10.f33059d     // Catch:{ all -> 0x0572 }
            if (r11 == 0) goto L_0x0394
            r10.mo50809j()     // Catch:{ all -> 0x0572 }
            r11 = 0
            r10.f33059d = r11     // Catch:{ all -> 0x0572 }
        L_0x0394:
            MessageType r11 = r10.f33058c     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r11 = (com.google.android.gms.internal.measurement.C14572a3) r11     // Catch:{ all -> 0x0572 }
            r12 = r20
            com.google.android.gms.internal.measurement.C14572a3.m23304z0(r11, r12)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.u3 r11 = r1.f33497m     // Catch:{ all -> 0x0572 }
            r11.getClass()     // Catch:{ all -> 0x0572 }
            boolean r11 = r10.f33059d     // Catch:{ all -> 0x0572 }
            if (r11 == 0) goto L_0x03ac
            r10.mo50809j()     // Catch:{ all -> 0x0572 }
            r11 = 0
            r10.f33059d = r11     // Catch:{ all -> 0x0572 }
        L_0x03ac:
            MessageType r11 = r10.f33058c     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r11 = (com.google.android.gms.internal.measurement.C14572a3) r11     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.C14572a3.m23287c0(r11)     // Catch:{ all -> 0x0572 }
            if (r5 != 0) goto L_0x03b8
            r10.mo51007z()     // Catch:{ all -> 0x0572 }
        L_0x03b8:
            if (r7 != 0) goto L_0x03c0
            r10.mo50991E()     // Catch:{ all -> 0x0572 }
            r10.mo50988B()     // Catch:{ all -> 0x0572 }
        L_0x03c0:
            if (r8 != 0) goto L_0x03c5
            r10.mo51005x()     // Catch:{ all -> 0x0572 }
        L_0x03c5:
            com.google.android.gms.measurement.internal.d r11 = r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C14959e2.f33388V     // Catch:{ all -> 0x0572 }
            boolean r11 = r11.mo51973p(r6, r14)     // Catch:{ all -> 0x0572 }
            if (r11 == 0) goto L_0x03e7
            com.google.android.gms.internal.measurement.t5 r11 = r10.mo50807h()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r11 = (com.google.android.gms.internal.measurement.C14572a3) r11     // Catch:{ all -> 0x0572 }
            byte[] r11 = r11.mo50868i()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.h7 r14 = r1.f33492h     // Catch:{ all -> 0x0572 }
            m24287I(r14)     // Catch:{ all -> 0x0572 }
            long r14 = r14.mo52114v(r11)     // Catch:{ all -> 0x0572 }
            r10.mo50996o(r14)     // Catch:{ all -> 0x0572 }
        L_0x03e7:
            boolean r11 = r2.f33059d     // Catch:{ all -> 0x0572 }
            if (r11 == 0) goto L_0x03f1
            r2.mo50809j()     // Catch:{ all -> 0x0572 }
            r11 = 0
            r2.f33059d = r11     // Catch:{ all -> 0x0572 }
        L_0x03f1:
            MessageType r11 = r2.f33058c     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.y2 r11 = (com.google.android.gms.internal.measurement.C14876y2) r11     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.t5 r10 = r10.mo50807h()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.a3 r10 = (com.google.android.gms.internal.measurement.C14572a3) r10     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.C14876y2.m24169v(r11, r10)     // Catch:{ all -> 0x0572 }
            int r9 = r9 + 1
            r20 = r12
            goto L_0x0353
        L_0x0404:
            r12 = r20
            com.google.android.gms.measurement.internal.o2 r0 = r22.mo52016b()     // Catch:{ all -> 0x0572 }
            java.lang.String r0 = r0.mo52279s()     // Catch:{ all -> 0x0572 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0572 }
            if (r0 == 0) goto L_0x0425
            com.google.android.gms.measurement.internal.h7 r0 = r1.f33492h     // Catch:{ all -> 0x0572 }
            m24287I(r0)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.t5 r5 = r2.mo50807h()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.y2 r5 = (com.google.android.gms.internal.measurement.C14876y2) r5     // Catch:{ all -> 0x0572 }
            java.lang.String r0 = r0.mo52105A(r5)     // Catch:{ all -> 0x0572 }
            goto L_0x0426
        L_0x0425:
            r0 = 0
        L_0x0426:
            com.google.android.gms.measurement.internal.h7 r5 = r1.f33492h     // Catch:{ all -> 0x0572 }
            m24287I(r5)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.t5 r5 = r2.mo50807h()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.internal.measurement.y2 r5 = (com.google.android.gms.internal.measurement.C14876y2) r5     // Catch:{ all -> 0x0572 }
            byte[] r14 = r5.mo50868i()     // Catch:{ all -> 0x0572 }
            r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d2<java.lang.String> r5 = com.google.android.gms.measurement.internal.C14959e2.f33427r     // Catch:{ all -> 0x0572 }
            r7 = 0
            java.lang.Object r5 = r5.mo51978a(r7)     // Catch:{ all -> 0x0572 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0572 }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04c1 }
            r7.<init>(r5)     // Catch:{ MalformedURLException -> 0x04c1 }
            boolean r8 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x04c1 }
            r9 = 1
            r8 = r8 ^ r9
            com.google.android.gms.common.internal.Preconditions.checkArgument(r8)     // Catch:{ MalformedURLException -> 0x04c1 }
            java.util.ArrayList r8 = r1.f33509y     // Catch:{ MalformedURLException -> 0x04c1 }
            if (r8 == 0) goto L_0x0461
            com.google.android.gms.measurement.internal.o2 r4 = r22.mo52016b()     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.m2 r4 = r4.mo52275l()     // Catch:{ MalformedURLException -> 0x04c1 }
            java.lang.String r8 = "Set uploading progress before finishing the previous upload"
            r4.mo52237a(r8)     // Catch:{ MalformedURLException -> 0x04c1 }
            goto L_0x0468
        L_0x0461:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x04c1 }
            r8.<init>(r4)     // Catch:{ MalformedURLException -> 0x04c1 }
            r1.f33509y = r8     // Catch:{ MalformedURLException -> 0x04c1 }
        L_0x0468:
            com.google.android.gms.measurement.internal.j6 r4 = r1.f33494j     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.y2 r4 = r4.f33618k     // Catch:{ MalformedURLException -> 0x04c1 }
            r4.mo52364b(r12)     // Catch:{ MalformedURLException -> 0x04c1 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x047b
            com.google.android.gms.internal.measurement.a3 r2 = r2.mo50969o()     // Catch:{ MalformedURLException -> 0x04c1 }
            java.lang.String r4 = r2.mo50295C1()     // Catch:{ MalformedURLException -> 0x04c1 }
        L_0x047b:
            com.google.android.gms.measurement.internal.o2 r2 = r22.mo52016b()     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52276m()     // Catch:{ MalformedURLException -> 0x04c1 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x04c1 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x04c1 }
            r2.mo52240d(r4, r8, r0, r3)     // Catch:{ MalformedURLException -> 0x04c1 }
            r2 = 1
            r1.f33505u = r2     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.t2 r11 = r1.f33487c     // Catch:{ MalformedURLException -> 0x04c1 }
            m24287I(r11)     // Catch:{ MalformedURLException -> 0x04c1 }
            f8.b r0 = new f8.b     // Catch:{ MalformedURLException -> 0x04c1 }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x04c1 }
            r11.mo51995g()     // Catch:{ MalformedURLException -> 0x04c1 }
            r11.mo51942h()     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.o4 r2 = r11.f33681b     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo52015a()     // Catch:{ MalformedURLException -> 0x04c1 }
            com.google.android.gms.measurement.internal.s2 r3 = new com.google.android.gms.measurement.internal.s2     // Catch:{ MalformedURLException -> 0x04c1 }
            r15 = 0
            r10 = r3
            r12 = r6
            r13 = r7
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04c1 }
            r2.mo52307n(r3)     // Catch:{ MalformedURLException -> 0x04c1 }
            goto L_0x0563
        L_0x04c1:
            com.google.android.gms.measurement.internal.o2 r0 = r22.mo52016b()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.mo52275l()     // Catch:{ all -> 0x0572 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r6)     // Catch:{ all -> 0x0572 }
            r0.mo52239c(r3, r2, r5)     // Catch:{ all -> 0x0572 }
            goto L_0x0563
        L_0x04d4:
            r0 = move-exception
            r9 = r11
        L_0x04d6:
            if (r9 == 0) goto L_0x04db
            r9.close()     // Catch:{ all -> 0x0572 }
        L_0x04db:
            throw r0     // Catch:{ all -> 0x0572 }
        L_0x04dc:
            r12 = r4
            r1.f33483A = r7     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0572 }
            m24287I(r2)     // Catch:{ all -> 0x0572 }
            r22.mo52008K()     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r0 = com.google.android.gms.measurement.internal.C14959e2.f33401e     // Catch:{ all -> 0x0572 }
            r7 = 0
            java.lang.Object r0 = r0.mo51978a(r7)     // Catch:{ all -> 0x0572 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0572 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0572 }
            long r4 = r12 - r3
            r2.mo51995g()     // Catch:{ all -> 0x0572 }
            r2.mo51942h()     // Catch:{ all -> 0x0572 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo52052B()     // Catch:{ SQLiteException -> 0x0534, all -> 0x0531 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0534, all -> 0x0531 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0534, all -> 0x0531 }
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLiteException -> 0x0534, all -> 0x0531 }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x0534, all -> 0x0531 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x052f }
            if (r0 != 0) goto L_0x0528
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b     // Catch:{ SQLiteException -> 0x052f }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x052f }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x052f }
            com.google.android.gms.measurement.internal.m2 r0 = r0.mo52276m()     // Catch:{ SQLiteException -> 0x052f }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.mo52237a(r4)     // Catch:{ SQLiteException -> 0x052f }
            goto L_0x0549
        L_0x0528:
            r4 = 0
            java.lang.String r0 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x052f }
            r9 = r0
            goto L_0x054a
        L_0x052f:
            r0 = move-exception
            goto L_0x0536
        L_0x0531:
            r0 = move-exception
            r9 = r7
            goto L_0x056c
        L_0x0534:
            r0 = move-exception
            r3 = r7
        L_0x0536:
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ all -> 0x056a }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x056a }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x056a }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x056a }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo52238b(r0, r4)     // Catch:{ all -> 0x056a }
            if (r3 == 0) goto L_0x054e
        L_0x0549:
            r9 = r7
        L_0x054a:
            r3.close()     // Catch:{ all -> 0x0572 }
            goto L_0x054f
        L_0x054e:
            r9 = r7
        L_0x054f:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0572 }
            if (r0 != 0) goto L_0x0563
            com.google.android.gms.measurement.internal.h r0 = r1.f33488d     // Catch:{ all -> 0x0572 }
            m24287I(r0)     // Catch:{ all -> 0x0572 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo52053C(r9)     // Catch:{ all -> 0x0572 }
            if (r0 == 0) goto L_0x0563
            r1.mo52022h(r0)     // Catch:{ all -> 0x0572 }
        L_0x0563:
            r2 = 0
            r1.f33506v = r2
        L_0x0566:
            r22.mo51999A()
            return
        L_0x056a:
            r0 = move-exception
            r9 = r3
        L_0x056c:
            if (r9 == 0) goto L_0x0571
            r9.close()     // Catch:{ all -> 0x0572 }
        L_0x0571:
            throw r0     // Catch:{ all -> 0x0572 }
        L_0x0572:
            r0 = move-exception
            r2 = 0
            r1.f33506v = r2
            r22.mo51999A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52034t():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:287:0x090b, code lost:
        if (r13.size() == 0) goto L_0x090d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x033e A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x038b A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x038e A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03f7 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0589 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05c5 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x065e A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x06cb A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06dc A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x06f1 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x070c A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0727 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0743 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x075b A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0770 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x07a1 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x07bf A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x081c A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x084d A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0864 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0884 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0910 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x092f A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0984 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x09a0 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x09bc A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x09d7 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x09f1 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x09fe A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0a27 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0ab6 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0acd A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0afa A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c19 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0c84 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0ca5 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }, LOOP:4: B:407:0x0c9f->B:409:0x0ca5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0d0e A[Catch:{ SQLiteException -> 0x0d2b }] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0d26  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0c2b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c1 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d9 A[SYNTHETIC, Splitter:B:55:0x01d9] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0254 A[Catch:{ NumberFormatException -> 0x08f3, all -> 0x0daf }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52035u(com.google.android.gms.measurement.internal.zzat r36, com.google.android.gms.measurement.internal.zzp r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r37)
            java.lang.String r8 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.s3 r10 = r35.mo52015a()
            r10.mo51995g()
            r35.mo52021g()
            java.lang.String r10 = r3.zza
            com.google.android.gms.measurement.internal.h7 r11 = r1.f33492h
            m24287I(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r36)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r37)
            java.lang.String r11 = r3.zzb
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            r28 = 1
            if (r11 == 0) goto L_0x0045
            java.lang.String r11 = r3.zzq
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0045
            r11 = 0
            goto L_0x0047
        L_0x0045:
            r11 = r28
        L_0x0047:
            if (r11 != 0) goto L_0x004a
            return
        L_0x004a:
            boolean r11 = r3.zzh
            if (r11 == 0) goto L_0x0dba
            com.google.android.gms.measurement.internal.n3 r11 = r1.f33486b
            m24287I(r11)
            java.lang.String r12 = r2.zza
            boolean r11 = r11.mo52258o(r10, r12)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r11 == 0) goto L_0x0114
            com.google.android.gms.measurement.internal.o2 r3 = r35.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52277n()
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)
            com.google.android.gms.measurement.internal.u3 r5 = r1.f33497m
            com.google.android.gms.measurement.internal.j2 r5 = r5.mo52329p()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.mo52142d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo52239c(r4, r6, r5)
            com.google.android.gms.measurement.internal.n3 r3 = r1.f33486b
            m24287I(r3)
            java.lang.String r4 = "measurement.upload.blacklist_internal"
            java.lang.String r3 = r3.mo51945e(r10, r4)
            java.lang.String r4 = "1"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00be
            com.google.android.gms.measurement.internal.n3 r3 = r1.f33486b
            m24287I(r3)
            java.lang.String r5 = "measurement.upload.blacklist_public"
            java.lang.String r3 = r3.mo51945e(r10, r5)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00a0
            goto L_0x00be
        L_0x00a0:
            java.lang.String r3 = r2.zza
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L_0x0113
            com.google.android.gms.measurement.internal.k7 r3 = r35.mo52013Q()
            androidx.compose.runtime.o0 r11 = r1.f33485C
            r13 = 11
            java.lang.String r15 = r2.zza
            r16 = 0
            r3.getClass()
            java.lang.String r14 = "_ev"
            r12 = r10
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r11, r12, r13, r14, r15, r16)
            return
        L_0x00be:
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo52053C(r10)
            if (r2 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.u3 r3 = r2.f34015a
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo52015a()
            r3.mo51995g()
            long r3 = r2.f34014F
            com.google.android.gms.measurement.internal.u3 r5 = r2.f34015a
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo52015a()
            r5.mo51995g()
            long r5 = r2.f34013E
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.Clock r5 = r35.mo52017c()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r35.mo52008K()
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C14959e2.f33443z
            java.lang.Object r5 = r5.mo51978a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0113
            com.google.android.gms.measurement.internal.o2 r3 = r35.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52274k()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo52237a(r4)
            r1.mo52022h(r2)
        L_0x0113:
            return
        L_0x0114:
            com.google.android.gms.measurement.internal.p2 r2 = com.google.android.gms.measurement.internal.C15058p2.m24596b(r36)
            com.google.android.gms.measurement.internal.k7 r11 = r35.mo52013Q()
            com.google.android.gms.measurement.internal.d r12 = r35.mo52008K()
            r12.getClass()
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C14959e2.f33375I
            int r12 = r12.mo51968k(r10, r15)
            r15 = 100
            int r12 = java.lang.Math.min(r12, r15)
            r15 = 25
            int r12 = java.lang.Math.max(r12, r15)
            r11.mo52222u(r2, r12)
            com.google.android.gms.measurement.internal.zzat r2 = r2.mo52283a()
            com.google.android.gms.measurement.internal.o2 r11 = r35.mo52016b()
            java.lang.String r11 = r11.mo52279s()
            r15 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r15)
            if (r11 == 0) goto L_0x0162
            com.google.android.gms.measurement.internal.o2 r11 = r35.mo52016b()
            com.google.android.gms.measurement.internal.m2 r11 = r11.mo52276m()
            com.google.android.gms.measurement.internal.u3 r12 = r1.f33497m
            com.google.android.gms.measurement.internal.j2 r12 = r12.mo52329p()
            java.lang.String r12 = r12.mo52141c(r2)
            java.lang.String r15 = "Logging event"
            r11.mo52238b(r12, r15)
        L_0x0162:
            com.google.android.gms.measurement.internal.h r11 = r1.f33488d
            m24287I(r11)
            r11.mo52065O()
            r1.mo52007J(r3)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14893z7.m24209b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r11 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C14959e2.f33430s0     // Catch:{ all -> 0x0daf }
            boolean r11 = r11.mo51973p(r13, r12)     // Catch:{ all -> 0x0daf }
            if (r11 != 0) goto L_0x0194
            com.google.android.gms.measurement.internal.d r11 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C14959e2.f33432t0     // Catch:{ all -> 0x0daf }
            boolean r11 = r11.mo51973p(r13, r12)     // Catch:{ all -> 0x0daf }
            if (r11 == 0) goto L_0x0194
            com.google.android.gms.measurement.internal.h r11 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r11)     // Catch:{ all -> 0x0daf }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0daf }
            java.lang.String r15 = "_lair"
            r11.mo52070l(r12, r15)     // Catch:{ all -> 0x0daf }
        L_0x0194:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0daf }
            java.lang.String r12 = "refund"
            if (r11 != 0) goto L_0x01b5
            java.lang.String r11 = "purchase"
            java.lang.String r15 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r11 = r11.equals(r15)     // Catch:{ all -> 0x0daf }
            if (r11 != 0) goto L_0x01b5
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0daf }
            if (r11 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r11 = 0
            goto L_0x01b7
        L_0x01b5:
            r11 = r28
        L_0x01b7:
            java.lang.String r15 = "_iap"
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0daf }
            if (r13 != 0) goto L_0x01cd
            if (r11 == 0) goto L_0x01c6
            r11 = r28
            goto L_0x01cd
        L_0x01c6:
            r33 = r4
            r29 = r8
            r8 = r14
            goto L_0x0377
        L_0x01cd:
            com.google.android.gms.measurement.internal.zzar r13 = r2.zzb     // Catch:{ all -> 0x0daf }
            java.lang.String r15 = "currency"
            java.lang.String r13 = r13.zzg(r15)     // Catch:{ all -> 0x0daf }
            java.lang.String r15 = "value"
            if (r11 == 0) goto L_0x0242
            com.google.android.gms.measurement.internal.zzar r11 = r2.zzb     // Catch:{ all -> 0x0daf }
            java.lang.Double r11 = r11.zzd(r15)     // Catch:{ all -> 0x0daf }
            double r18 = r11.doubleValue()     // Catch:{ all -> 0x0daf }
            r20 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r18 = r18 * r20
            r22 = 0
            int r11 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r11 != 0) goto L_0x0200
            com.google.android.gms.measurement.internal.zzar r11 = r2.zzb     // Catch:{ all -> 0x0daf }
            java.lang.Long r11 = r11.zze(r15)     // Catch:{ all -> 0x0daf }
            r22 = r14
            long r14 = r11.longValue()     // Catch:{ all -> 0x0daf }
            double r14 = (double) r14     // Catch:{ all -> 0x0daf }
            double r18 = r14 * r20
            goto L_0x0202
        L_0x0200:
            r22 = r14
        L_0x0202:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x021c
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x021c
            long r14 = java.lang.Math.round(r18)     // Catch:{ all -> 0x0daf }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0daf }
            if (r11 == 0) goto L_0x024e
            long r14 = -r14
            goto L_0x024e
        L_0x021c:
            com.google.android.gms.measurement.internal.o2 r2 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52277n()     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            java.lang.Double r5 = java.lang.Double.valueOf(r18)     // Catch:{ all -> 0x0daf }
            r2.mo52239c(r4, r3, r5)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            r2.mo52071m()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            r2.mo52067Q()
            return
        L_0x0242:
            r22 = r14
            com.google.android.gms.measurement.internal.zzar r11 = r2.zzb     // Catch:{ all -> 0x0daf }
            java.lang.Long r11 = r11.zze(r15)     // Catch:{ all -> 0x0daf }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0daf }
        L_0x024e:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0daf }
            if (r11 != 0) goto L_0x0371
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0daf }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0daf }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0daf }
            if (r12 == 0) goto L_0x0371
            java.lang.String r12 = "_ltv_"
            int r13 = r11.length()     // Catch:{ all -> 0x0daf }
            if (r13 == 0) goto L_0x026f
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x0daf }
            goto L_0x0274
        L_0x026f:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0daf }
            r11.<init>(r12)     // Catch:{ all -> 0x0daf }
        L_0x0274:
            r13 = r11
            com.google.android.gms.measurement.internal.h r11 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r11)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.i7 r11 = r11.mo52058H(r10, r13)     // Catch:{ all -> 0x0daf }
            if (r11 == 0) goto L_0x02bb
            java.lang.Object r11 = r11.f33584e     // Catch:{ all -> 0x0daf }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0daf }
            if (r12 != 0) goto L_0x0287
            goto L_0x02bb
        L_0x0287:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0daf }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.i7 r18 = new com.google.android.gms.measurement.internal.i7     // Catch:{ all -> 0x0daf }
            r19 = r13
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.util.Clock r20 = r35.mo52017c()     // Catch:{ all -> 0x0daf }
            long r20 = r20.currentTimeMillis()     // Catch:{ all -> 0x0daf }
            long r11 = r11 + r14
            java.lang.Long r23 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0daf }
            r11 = r18
            r12 = r10
            r17 = r19
            r15 = 0
            r29 = r8
            r8 = r22
            r14 = r17
            r9 = 0
            r15 = r20
            r17 = r23
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0daf }
            r33 = r4
            r9 = r18
            r4 = 2
            goto L_0x0333
        L_0x02bb:
            r29 = r8
            r17 = r13
            r8 = r22
            r9 = 0
            com.google.android.gms.measurement.internal.h r11 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r11)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r12 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.C14959e2.f33371E     // Catch:{ all -> 0x0daf }
            int r12 = r12.mo51968k(r10, r13)     // Catch:{ all -> 0x0daf }
            int r12 = r12 + -1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0daf }
            r11.mo51995g()     // Catch:{ all -> 0x0daf }
            r11.mo51942h()     // Catch:{ all -> 0x0daf }
            android.database.sqlite.SQLiteDatabase r13 = r11.mo52052B()     // Catch:{ SQLiteException -> 0x02fb }
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x02fb }
            r16 = 0
            r9[r16] = r10     // Catch:{ SQLiteException -> 0x02fb }
            r9[r28] = r10     // Catch:{ SQLiteException -> 0x02fb }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x02fb }
            r33 = r4
            r4 = 2
            r9[r4] = r12     // Catch:{ SQLiteException -> 0x02f8 }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r12, r9)     // Catch:{ SQLiteException -> 0x02f8 }
            goto L_0x0315
        L_0x02f8:
            r0 = move-exception
        L_0x02f9:
            r9 = r0
            goto L_0x0300
        L_0x02fb:
            r0 = move-exception
            r33 = r4
            r4 = 2
            goto L_0x02f9
        L_0x0300:
            com.google.android.gms.measurement.internal.o4 r11 = r11.f33681b     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r11 = (com.google.android.gms.measurement.internal.C15103u3) r11     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.o2 r11 = r11.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r11 = r11.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r12 = "Error pruning currencies. appId"
            com.google.android.gms.measurement.internal.n2 r13 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            r11.mo52239c(r13, r12, r9)     // Catch:{ all -> 0x0daf }
        L_0x0315:
            com.google.android.gms.measurement.internal.i7 r18 = new com.google.android.gms.measurement.internal.i7     // Catch:{ all -> 0x0daf }
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.util.Clock r9 = r35.mo52017c()     // Catch:{ all -> 0x0daf }
            long r19 = r9.currentTimeMillis()     // Catch:{ all -> 0x0daf }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0daf }
            r11 = r18
            r12 = r10
            r14 = r17
            r15 = r19
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0daf }
            r9 = r18
        L_0x0333:
            com.google.android.gms.measurement.internal.h r11 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r11)     // Catch:{ all -> 0x0daf }
            boolean r11 = r11.mo52078t(r9)     // Catch:{ all -> 0x0daf }
            if (r11 != 0) goto L_0x0378
            com.google.android.gms.measurement.internal.o2 r11 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r11 = r11.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            com.google.android.gms.measurement.internal.n2 r13 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r14 = r1.f33497m     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.j2 r14 = r14.mo52329p()     // Catch:{ all -> 0x0daf }
            java.lang.String r15 = r9.f33582c     // Catch:{ all -> 0x0daf }
            java.lang.String r14 = r14.mo52144f(r15)     // Catch:{ all -> 0x0daf }
            java.lang.Object r9 = r9.f33584e     // Catch:{ all -> 0x0daf }
            r11.mo52240d(r13, r14, r9, r12)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.k7 r9 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            androidx.compose.runtime.o0 r11 = r1.f33485C     // Catch:{ all -> 0x0daf }
            r13 = 9
            r14 = 0
            r15 = 0
            r16 = 0
            r9.getClass()     // Catch:{ all -> 0x0daf }
            r12 = r10
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0daf }
            goto L_0x0378
        L_0x0371:
            r33 = r4
            r29 = r8
            r8 = r22
        L_0x0377:
            r4 = 2
        L_0x0378:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r9 = com.google.android.gms.measurement.internal.C15018k7.m24470S(r9)     // Catch:{ all -> 0x0daf }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0daf }
            r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.zzar r11 = r2.zzb     // Catch:{ all -> 0x0daf }
            if (r11 != 0) goto L_0x038e
            r16 = 0
            goto L_0x03b7
        L_0x038e:
            android.os.Bundle r12 = r11.zza     // Catch:{ all -> 0x0daf }
            java.util.Set r12 = r12.keySet()     // Catch:{ all -> 0x0daf }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0daf }
            r16 = 0
        L_0x039c:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0daf }
            if (r13 == 0) goto L_0x03b7
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0daf }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0daf }
            java.lang.Object r13 = r11.zzf(r13)     // Catch:{ all -> 0x0daf }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0daf }
            if (r14 == 0) goto L_0x039c
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0daf }
            int r13 = r13.length     // Catch:{ all -> 0x0daf }
            long r13 = (long) r13     // Catch:{ all -> 0x0daf }
            long r16 = r16 + r13
            goto L_0x039c
        L_0x03b7:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.h r11 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r11)     // Catch:{ all -> 0x0daf }
            long r12 = r35.mo52036x()     // Catch:{ all -> 0x0daf }
            r17 = 1
            r20 = 0
            r21 = 0
            r31 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.f r11 = r11.mo52056F(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0daf }
            long r12 = r11.f33463b     // Catch:{ all -> 0x0daf }
            r35.mo52008K()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C14959e2.f33415l     // Catch:{ all -> 0x0daf }
            r15 = 0
            java.lang.Object r14 = r14.mo51978a(r15)     // Catch:{ all -> 0x0daf }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0daf }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0daf }
            r32 = r6
            r16 = r7
            long r6 = (long) r14     // Catch:{ all -> 0x0daf }
            long r12 = r12 - r6
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r6 <= 0) goto L_0x0425
            long r12 = r12 % r17
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0414
            com.google.android.gms.measurement.internal.o2 r2 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            long r5 = r11.f33463b     // Catch:{ all -> 0x0daf }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0daf }
            r2.mo52239c(r4, r3, r5)     // Catch:{ all -> 0x0daf }
        L_0x0414:
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            r2.mo52071m()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            r2.mo52067Q()
            return
        L_0x0425:
            if (r9 == 0) goto L_0x0481
            long r6 = r11.f33462a     // Catch:{ all -> 0x0daf }
            r35.mo52008K()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C14959e2.f33419n     // Catch:{ all -> 0x0daf }
            java.lang.Object r12 = r12.mo51978a(r15)     // Catch:{ all -> 0x0daf }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0daf }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0daf }
            long r12 = (long) r12     // Catch:{ all -> 0x0daf }
            long r6 = r6 - r12
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0481
            long r6 = r6 % r17
            int r3 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x045b
            com.google.android.gms.measurement.internal.o2 r3 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            long r6 = r11.f33462a     // Catch:{ all -> 0x0daf }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0daf }
            r3.mo52239c(r5, r4, r6)     // Catch:{ all -> 0x0daf }
        L_0x045b:
            com.google.android.gms.measurement.internal.k7 r3 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            androidx.compose.runtime.o0 r11 = r1.f33485C     // Catch:{ all -> 0x0daf }
            r13 = 16
            java.lang.String r14 = "_ev"
            java.lang.String r15 = r2.zza     // Catch:{ all -> 0x0daf }
            r16 = 0
            r3.getClass()     // Catch:{ all -> 0x0daf }
            r12 = r10
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            r2.mo52071m()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            r2.mo52067Q()
            return
        L_0x0481:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x04cf
            long r7 = r11.f33465d     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r12 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            java.lang.String r13 = r3.zza     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C14959e2.f33417m     // Catch:{ all -> 0x0daf }
            int r12 = r12.mo51968k(r13, r14)     // Catch:{ all -> 0x0daf }
            int r12 = java.lang.Math.min(r6, r12)     // Catch:{ all -> 0x0daf }
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ all -> 0x0daf }
            long r12 = (long) r12     // Catch:{ all -> 0x0daf }
            long r7 = r7 - r12
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x04cf
            int r2 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x04be
            com.google.android.gms.measurement.internal.o2 r2 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = "Too many error events logged. appId, count"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            long r5 = r11.f33465d     // Catch:{ all -> 0x0daf }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0daf }
            r2.mo52239c(r4, r3, r5)     // Catch:{ all -> 0x0daf }
        L_0x04be:
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            r2.mo52071m()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            r2.mo52067Q()
            return
        L_0x04cf:
            com.google.android.gms.measurement.internal.zzar r7 = r2.zzb     // Catch:{ all -> 0x0daf }
            android.os.Bundle r7 = r7.zzc()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.k7 r8 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.zzc     // Catch:{ all -> 0x0daf }
            r8.mo52223w(r7, r12, r11)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.k7 r8 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            boolean r8 = r8.mo52201O(r10)     // Catch:{ all -> 0x0daf }
            java.lang.String r14 = "_r"
            if (r8 == 0) goto L_0x0500
            com.google.android.gms.measurement.internal.k7 r8 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0daf }
            java.lang.String r12 = "_dbg"
            r8.mo52223w(r7, r11, r12)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.k7 r8 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            r8.mo52223w(r7, r11, r14)     // Catch:{ all -> 0x0daf }
        L_0x0500:
            java.lang.String r8 = "_s"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0daf }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0528
            com.google.android.gms.measurement.internal.h r8 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r8)     // Catch:{ all -> 0x0daf }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0daf }
            r12 = r16
            com.google.android.gms.measurement.internal.i7 r8 = r8.mo52058H(r11, r12)     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0528
            java.lang.Object r11 = r8.f33584e     // Catch:{ all -> 0x0daf }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0daf }
            if (r11 == 0) goto L_0x0528
            com.google.android.gms.measurement.internal.k7 r11 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            java.lang.Object r8 = r8.f33584e     // Catch:{ all -> 0x0daf }
            r11.mo52223w(r7, r8, r12)     // Catch:{ all -> 0x0daf }
        L_0x0528:
            com.google.android.gms.measurement.internal.h r8 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r8)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0daf }
            r8.mo51995g()     // Catch:{ all -> 0x0daf }
            r8.mo51942h()     // Catch:{ all -> 0x0daf }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo52052B()     // Catch:{ SQLiteException -> 0x0568 }
            com.google.android.gms.measurement.internal.o4 r12 = r8.f33681b     // Catch:{ SQLiteException -> 0x0568 }
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12     // Catch:{ SQLiteException -> 0x0568 }
            com.google.android.gms.measurement.internal.d r12 = r12.mo52325l()     // Catch:{ SQLiteException -> 0x0568 }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.C14959e2.f33425q     // Catch:{ SQLiteException -> 0x0568 }
            int r12 = r12.mo51968k(r10, r13)     // Catch:{ SQLiteException -> 0x0568 }
            int r6 = java.lang.Math.min(r6, r12)     // Catch:{ SQLiteException -> 0x0568 }
            r12 = 0
            int r6 = java.lang.Math.max(r12, r6)     // Catch:{ SQLiteException -> 0x0568 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0568 }
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0568 }
            r13[r12] = r10     // Catch:{ SQLiteException -> 0x0568 }
            r13[r28] = r6     // Catch:{ SQLiteException -> 0x0568 }
            java.lang.String r6 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r12 = r32
            int r6 = r11.delete(r12, r6, r13)     // Catch:{ SQLiteException -> 0x0566 }
            long r4 = (long) r6
            goto L_0x0583
        L_0x0566:
            r0 = move-exception
            goto L_0x056b
        L_0x0568:
            r0 = move-exception
            r12 = r32
        L_0x056b:
            r4 = r0
            com.google.android.gms.measurement.internal.o4 r5 = r8.f33681b     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r5 = r5.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = "Error deleting over the limit events. appId"
            com.google.android.gms.measurement.internal.n2 r8 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            r5.mo52239c(r8, r6, r4)     // Catch:{ all -> 0x0daf }
            r4 = 0
        L_0x0583:
            r16 = 0
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x059e
            com.google.android.gms.measurement.internal.o2 r6 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r6 = r6.mo52277n()     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            com.google.android.gms.measurement.internal.n2 r11 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0daf }
            r6.mo52239c(r11, r8, r4)     // Catch:{ all -> 0x0daf }
        L_0x059e:
            com.google.android.gms.measurement.internal.m r4 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r5 = r1.f33497m     // Catch:{ all -> 0x0daf }
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r2.zza     // Catch:{ all -> 0x0daf }
            long r2 = r2.zzd     // Catch:{ all -> 0x0daf }
            r11 = r4
            r8 = r12
            r12 = r5
            r5 = r14
            r14 = r10
            r32 = r8
            r8 = r15
            r15 = r6
            r16 = r2
            r18 = r7
            r11.<init>(r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = r4.f33669b     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.n r2 = r2.mo52057G(r10, r3)     // Catch:{ all -> 0x0daf }
            if (r2 != 0) goto L_0x065e
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            long r2 = r2.mo52051A(r10)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r6 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            r6.getClass()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C14959e2.f33374H     // Catch:{ all -> 0x0daf }
            int r6 = r6.mo51968k(r10, r7)     // Catch:{ all -> 0x0daf }
            r11 = 2000(0x7d0, float:2.803E-42)
            int r6 = java.lang.Math.min(r6, r11)     // Catch:{ all -> 0x0daf }
            r12 = 500(0x1f4, float:7.0E-43)
            int r6 = java.lang.Math.max(r6, r12)     // Catch:{ all -> 0x0daf }
            long r13 = (long) r6     // Catch:{ all -> 0x0daf }
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x063e
            if (r9 == 0) goto L_0x063e
            com.google.android.gms.measurement.internal.o2 r2 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r10)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r6 = r1.f33497m     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.j2 r6 = r6.mo52329p()     // Catch:{ all -> 0x0daf }
            java.lang.String r4 = r4.f33669b     // Catch:{ all -> 0x0daf }
            java.lang.String r4 = r6.mo52142d(r4)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r6 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            r6.getClass()     // Catch:{ all -> 0x0daf }
            int r6 = r6.mo51968k(r10, r7)     // Catch:{ all -> 0x0daf }
            int r6 = java.lang.Math.min(r6, r11)     // Catch:{ all -> 0x0daf }
            int r6 = java.lang.Math.max(r6, r12)     // Catch:{ all -> 0x0daf }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0daf }
            r2.mo52240d(r5, r4, r6, r3)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.k7 r2 = r35.mo52013Q()     // Catch:{ all -> 0x0daf }
            androidx.compose.runtime.o0 r11 = r1.f33485C     // Catch:{ all -> 0x0daf }
            r13 = 8
            r14 = 0
            r15 = 0
            r16 = 0
            r2.getClass()     // Catch:{ all -> 0x0daf }
            r12 = r10
            com.google.android.gms.measurement.internal.C15018k7.m24482v(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            r2.mo52067Q()
            return
        L_0x063e:
            com.google.android.gms.measurement.internal.n r2 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x0daf }
            java.lang.String r13 = r4.f33669b     // Catch:{ all -> 0x0daf }
            long r6 = r4.f33671d     // Catch:{ all -> 0x0daf }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r6
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0daf }
            r27 = r5
            goto L_0x0699
        L_0x065e:
            com.google.android.gms.measurement.internal.u3 r3 = r1.f33497m     // Catch:{ all -> 0x0daf }
            long r6 = r2.f33691f     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m r4 = r4.mo52235a(r3, r6)     // Catch:{ all -> 0x0daf }
            long r6 = r4.f33671d     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.n r3 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x0daf }
            java.lang.String r10 = r2.f33686a     // Catch:{ all -> 0x0daf }
            java.lang.String r11 = r2.f33687b     // Catch:{ all -> 0x0daf }
            long r12 = r2.f33688c     // Catch:{ all -> 0x0daf }
            long r14 = r2.f33689d     // Catch:{ all -> 0x0daf }
            long r8 = r2.f33690e     // Catch:{ all -> 0x0daf }
            r34 = r4
            r27 = r5
            long r4 = r2.f33692g     // Catch:{ all -> 0x0daf }
            r16 = r8
            java.lang.Long r8 = r2.f33693h     // Catch:{ all -> 0x0daf }
            java.lang.Long r9 = r2.f33694i     // Catch:{ all -> 0x0daf }
            java.lang.Long r1 = r2.f33695j     // Catch:{ all -> 0x0dab }
            java.lang.Boolean r2 = r2.f33696k     // Catch:{ all -> 0x0dab }
            r23 = r9
            r9 = r3
            r18 = r6
            r20 = r4
            r22 = r8
            r24 = r1
            r25 = r2
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r22, r23, r24, r25)     // Catch:{ all -> 0x0dab }
            r1 = r35
            r2 = r3
            r4 = r34
        L_0x0699:
            com.google.android.gms.measurement.internal.h r3 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r3)     // Catch:{ all -> 0x0daf }
            r3.mo52073o(r2)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.s3 r2 = r35.mo52015a()     // Catch:{ all -> 0x0daf }
            r2.mo51995g()     // Catch:{ all -> 0x0daf }
            r35.mo52021g()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r37)     // Catch:{ all -> 0x0daf }
            java.lang.String r2 = r4.f33668a     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x0daf }
            java.lang.String r2 = r4.f33668a     // Catch:{ all -> 0x0daf }
            r3 = r37
            java.lang.String r5 = r3.zza     // Catch:{ all -> 0x0daf }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.z2 r2 = com.google.android.gms.internal.measurement.C14572a3.m23303y1()     // Catch:{ all -> 0x0daf }
            boolean r5 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x06d1
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r5 = 0
            r2.f33059d = r5     // Catch:{ all -> 0x0daf }
        L_0x06d1:
            MessageType r5 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23292h0(r5)     // Catch:{ all -> 0x0daf }
            boolean r5 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x06e2
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r5 = 0
            r2.f33059d = r5     // Catch:{ all -> 0x0daf }
        L_0x06e2:
            MessageType r5 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23257G0(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r3.zza     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x0704
            java.lang.String r5 = r3.zza     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x06fd
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x06fd:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23269M0(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x0704:
            java.lang.String r5 = r3.zzd     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x071f
            java.lang.String r5 = r3.zzd     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0718
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x0718:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23267L0(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x071f:
            java.lang.String r5 = r3.zzc     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x073a
            java.lang.String r5 = r3.zzc     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0733
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x0733:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23271N0(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x073a:
            long r5 = r3.zzj     // Catch:{ all -> 0x0daf }
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0755
            int r5 = (int) r5     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x074e
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x074e:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23291g0(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x0755:
            long r5 = r3.zze     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x0761
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x0761:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23273O0(r7, r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r3.zzb     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x0783
            java.lang.String r5 = r3.zzb     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x077c
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x077c:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23286b0(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x0783:
            java.lang.String r5 = r3.zza     // Catch:{ all -> 0x0daf }
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.e r5 = r1.mo52009L(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r3.zzv     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.e r6 = com.google.android.gms.measurement.internal.C14956e.m24275b(r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.e r5 = r5.mo51983c(r6)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r5.mo51984d()     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x07a7
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x07a7:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23296s0(r6, r5)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14811s9.m23933a()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r5 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r3.zza     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C14959e2.f33398c0     // Catch:{ all -> 0x0daf }
            boolean r5 = r5.mo51973p(r6, r7)     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x081c
            MessageType r5 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r5.mo50350y()     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x07e8
            java.lang.String r5 = r3.zzu     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x07e8
            java.lang.String r5 = r3.zzu     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x07e1
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x07e1:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23295r0(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x07e8:
            MessageType r5 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r5.mo50350y()     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x0845
            java.lang.String r5 = r2.mo51001t()     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x0845
            java.lang.String r5 = r3.zzq     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x0845
            java.lang.String r5 = r3.zzq     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0814
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x0814:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23266L(r6, r5)     // Catch:{ all -> 0x0daf }
            goto L_0x0845
        L_0x081c:
            MessageType r5 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r5.mo50350y()     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x0845
            java.lang.String r5 = r3.zzq     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x0845
            java.lang.String r5 = r3.zzq     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x083e
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x083e:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23266L(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x0845:
            long r5 = r3.zzf     // Catch:{ all -> 0x0daf }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x085e
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x0857
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x0857:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23282X(r7, r5)     // Catch:{ all -> 0x0daf }
        L_0x085e:
            long r5 = r3.zzs     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x086a
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x086a:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23272O(r7, r5)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h7 r5 = r1.f33492h     // Catch:{ all -> 0x0daf }
            m24287I(r5)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.f7 r6 = r5.f34048c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r6 = r6.f33497m     // Catch:{ all -> 0x0daf }
            android.content.Context r6 = r6.mo52020f()     // Catch:{ all -> 0x0daf }
            java.util.Map r6 = com.google.android.gms.measurement.internal.C14959e2.m24283b(r6)     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x090d
            int r7 = r6.size()     // Catch:{ all -> 0x0daf }
            if (r7 != 0) goto L_0x088c
            goto L_0x090d
        L_0x088c:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0daf }
            r13.<init>()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C14959e2.f33382P     // Catch:{ all -> 0x0daf }
            r8 = 0
            java.lang.Object r7 = r7.mo51978a(r8)     // Catch:{ all -> 0x0daf }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0daf }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0daf }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x0daf }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0daf }
        L_0x08a6:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0907
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0daf }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x0daf }
            java.lang.Object r9 = r8.getKey()     // Catch:{ all -> 0x0daf }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0daf }
            java.lang.String r10 = "measurement.id."
            boolean r9 = r9.startsWith(r10)     // Catch:{ all -> 0x0daf }
            if (r9 == 0) goto L_0x08a6
            java.lang.Object r8 = r8.getValue()     // Catch:{ NumberFormatException -> 0x08f3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x08f3 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x08f3 }
            if (r8 == 0) goto L_0x08a6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x08f3 }
            r13.add(r8)     // Catch:{ NumberFormatException -> 0x08f3 }
            int r8 = r13.size()     // Catch:{ NumberFormatException -> 0x08f3 }
            if (r8 < r7) goto L_0x08a6
            com.google.android.gms.measurement.internal.o4 r8 = r5.f33681b     // Catch:{ NumberFormatException -> 0x08f3 }
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8     // Catch:{ NumberFormatException -> 0x08f3 }
            com.google.android.gms.measurement.internal.o2 r8 = r8.mo52016b()     // Catch:{ NumberFormatException -> 0x08f3 }
            com.google.android.gms.measurement.internal.m2 r8 = r8.mo52277n()     // Catch:{ NumberFormatException -> 0x08f3 }
            java.lang.String r9 = "Too many experiment IDs. Number of IDs"
            int r10 = r13.size()     // Catch:{ NumberFormatException -> 0x08f3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x08f3 }
            r8.mo52238b(r10, r9)     // Catch:{ NumberFormatException -> 0x08f3 }
            goto L_0x0907
        L_0x08f3:
            r0 = move-exception
            r8 = r0
            com.google.android.gms.measurement.internal.o4 r9 = r5.f33681b     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.o2 r9 = r9.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r9 = r9.mo52277n()     // Catch:{ all -> 0x0daf }
            java.lang.String r10 = "Experiment ID NumberFormatException"
            r9.mo52238b(r8, r10)     // Catch:{ all -> 0x0daf }
            goto L_0x08a6
        L_0x0907:
            int r5 = r13.size()     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x090e
        L_0x090d:
            r13 = 0
        L_0x090e:
            if (r13 == 0) goto L_0x0913
            r2.mo51003v(r13)     // Catch:{ all -> 0x0daf }
        L_0x0913:
            java.lang.String r5 = r3.zza     // Catch:{ all -> 0x0daf }
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.e r5 = r1.mo52009L(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r3.zzv     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.e r6 = com.google.android.gms.measurement.internal.C14956e.m24275b(r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.e r5 = r5.mo51983c(r6)     // Catch:{ all -> 0x0daf }
            boolean r6 = r5.mo51985e()     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0975
            com.google.android.gms.measurement.internal.j6 r6 = r1.f33494j     // Catch:{ all -> 0x0daf }
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0daf }
            android.util.Pair r6 = r6.mo52166l(r7, r5)     // Catch:{ all -> 0x0daf }
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x0daf }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0daf }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0daf }
            if (r7 != 0) goto L_0x0975
            boolean r7 = r3.zzo     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x0975
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x0daf }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0daf }
            boolean r8 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0953
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r8 = 0
            r2.f33059d = r8     // Catch:{ all -> 0x0daf }
        L_0x0953:
            MessageType r8 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r8 = (com.google.android.gms.internal.measurement.C14572a3) r8     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23276R(r8, r7)     // Catch:{ all -> 0x0daf }
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0975
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0daf }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x096e
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x096e:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23278T(r7, r6)     // Catch:{ all -> 0x0daf }
        L_0x0975:
            com.google.android.gms.measurement.internal.u3 r6 = r1.f33497m     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.l r6 = r6.mo52326m()     // Catch:{ all -> 0x0daf }
            r6.mo52264i()     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x098a
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x098a:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23261I0(r7, r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r6 = r1.f33497m     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.l r6 = r6.mo52326m()     // Catch:{ all -> 0x0daf }
            r6.mo52264i()     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x09a6
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x09a6:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23259H0(r7, r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r6 = r1.f33497m     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.l r6 = r6.mo52326m()     // Catch:{ all -> 0x0daf }
            long r6 = r6.mo52228l()     // Catch:{ all -> 0x0daf }
            int r6 = (int) r6     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x09c2
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x09c2:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23265K0(r7, r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r6 = r1.f33497m     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.l r6 = r6.mo52326m()     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r6.mo52229m()     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x09dd
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x09dd:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23263J0(r7, r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r6 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C14959e2.f33416l0     // Catch:{ all -> 0x0daf }
            r8 = 0
            boolean r6 = r6.mo51973p(r8, r7)     // Catch:{ all -> 0x0daf }
            if (r6 != 0) goto L_0x09f6
            long r8 = r3.zzl     // Catch:{ all -> 0x0daf }
            r2.mo50995J(r8)     // Catch:{ all -> 0x0daf }
        L_0x09f6:
            com.google.android.gms.measurement.internal.u3 r6 = r1.f33497m     // Catch:{ all -> 0x0daf }
            boolean r6 = r6.mo52321e()     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0a1a
            r2.mo51000s()     // Catch:{ all -> 0x0daf }
            r6 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0a09
            goto L_0x0a1a
        L_0x0a09:
            boolean r3 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r3 != 0) goto L_0x0a0e
            goto L_0x0a14
        L_0x0a0e:
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r3 = 0
            r2.f33059d = r3     // Catch:{ all -> 0x0daf }
        L_0x0a14:
            MessageType r2 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r2 = (com.google.android.gms.internal.measurement.C14572a3) r2     // Catch:{ all -> 0x0daf }
            r2 = 0
            throw r2     // Catch:{ all -> 0x0daf }
        L_0x0a1a:
            com.google.android.gms.measurement.internal.h r6 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r6)     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo52053C(r8)     // Catch:{ all -> 0x0daf }
            if (r6 != 0) goto L_0x0a98
            com.google.android.gms.measurement.internal.z3 r6 = new com.google.android.gms.measurement.internal.z3     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r8 = r1.f33497m     // Catch:{ all -> 0x0daf }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0daf }
            r6.<init>(r8, r9)     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = r1.mo52014R(r5)     // Catch:{ all -> 0x0daf }
            r6.mo52378c(r8)     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = r3.zzk     // Catch:{ all -> 0x0daf }
            r6.mo52385j(r8)     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0daf }
            r6.mo52387l(r8)     // Catch:{ all -> 0x0daf }
            boolean r8 = r5.mo51985e()     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0a52
            com.google.android.gms.measurement.internal.j6 r8 = r1.f33494j     // Catch:{ all -> 0x0daf }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = r8.mo52167m(r9)     // Catch:{ all -> 0x0daf }
            r6.mo52394s(r8)     // Catch:{ all -> 0x0daf }
        L_0x0a52:
            r8 = 0
            r6.mo52391p(r8)     // Catch:{ all -> 0x0daf }
            r6.mo52392q(r8)     // Catch:{ all -> 0x0daf }
            r6.mo52390o(r8)     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0daf }
            r6.mo52380e(r8)     // Catch:{ all -> 0x0daf }
            long r8 = r3.zzj     // Catch:{ all -> 0x0daf }
            r6.mo52381f(r8)     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0daf }
            r6.mo52379d(r8)     // Catch:{ all -> 0x0daf }
            long r8 = r3.zze     // Catch:{ all -> 0x0daf }
            r6.mo52388m(r8)     // Catch:{ all -> 0x0daf }
            long r8 = r3.zzf     // Catch:{ all -> 0x0daf }
            r6.mo52383h(r8)     // Catch:{ all -> 0x0daf }
            boolean r8 = r3.zzh     // Catch:{ all -> 0x0daf }
            r6.mo52393r(r8)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r8 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            r9 = 0
            boolean r7 = r8.mo51973p(r9, r7)     // Catch:{ all -> 0x0daf }
            if (r7 != 0) goto L_0x0a8b
            long r7 = r3.zzl     // Catch:{ all -> 0x0daf }
            r6.mo52377b(r7)     // Catch:{ all -> 0x0daf }
        L_0x0a8b:
            long r7 = r3.zzs     // Catch:{ all -> 0x0daf }
            r6.mo52384i(r7)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r7 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r7)     // Catch:{ all -> 0x0daf }
            r7.mo52072n(r6)     // Catch:{ all -> 0x0daf }
        L_0x0a98:
            boolean r5 = r5.mo51987f()     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x0ac3
            java.lang.String r5 = r6.mo52400y()     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x0ac3
            java.lang.String r5 = r6.mo52400y()     // Catch:{ all -> 0x0daf }
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0daf }
            boolean r7 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r7 == 0) goto L_0x0abc
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r7 = 0
            r2.f33059d = r7     // Catch:{ all -> 0x0daf }
        L_0x0abc:
            MessageType r7 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C14572a3) r7     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23280V(r7, r5)     // Catch:{ all -> 0x0daf }
        L_0x0ac3:
            java.lang.String r5 = r6.mo52373A()     // Catch:{ all -> 0x0daf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0daf }
            if (r5 != 0) goto L_0x0ae8
            java.lang.String r5 = r6.mo52373A()     // Catch:{ all -> 0x0daf }
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0daf }
            boolean r6 = r2.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0ae1
            r2.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r2.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x0ae1:
            MessageType r6 = r2.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.C14572a3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14572a3.m23290f0(r6, r5)     // Catch:{ all -> 0x0daf }
        L_0x0ae8:
            com.google.android.gms.measurement.internal.h r5 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r5)     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = r3.zza     // Catch:{ all -> 0x0daf }
            java.util.List r3 = r5.mo52063M(r3)     // Catch:{ all -> 0x0daf }
            r15 = 0
        L_0x0af4:
            int r5 = r3.size()     // Catch:{ all -> 0x0daf }
            if (r15 >= r5) goto L_0x0baf
            com.google.android.gms.internal.measurement.j3 r5 = com.google.android.gms.internal.measurement.C14702k3.m23670u()     // Catch:{ all -> 0x0daf }
            java.lang.Object r6 = r3.get(r15)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.i7 r6 = (com.google.android.gms.measurement.internal.C15000i7) r6     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r6.f33582c     // Catch:{ all -> 0x0daf }
            r5.mo50604p(r6)     // Catch:{ all -> 0x0daf }
            java.lang.Object r6 = r3.get(r15)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.i7 r6 = (com.google.android.gms.measurement.internal.C15000i7) r6     // Catch:{ all -> 0x0daf }
            long r6 = r6.f33583d     // Catch:{ all -> 0x0daf }
            r5.mo50605q(r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h7 r6 = r1.f33492h     // Catch:{ all -> 0x0daf }
            m24287I(r6)     // Catch:{ all -> 0x0daf }
            java.lang.Object r7 = r3.get(r15)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.i7 r7 = (com.google.android.gms.measurement.internal.C15000i7) r7     // Catch:{ all -> 0x0daf }
            java.lang.Object r7 = r7.f33584e     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0daf }
            boolean r8 = r5.f33059d     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0b2e
            r5.mo50809j()     // Catch:{ all -> 0x0daf }
            r8 = 0
            r5.f33059d = r8     // Catch:{ all -> 0x0daf }
        L_0x0b2e:
            MessageType r8 = r5.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.k3 r8 = (com.google.android.gms.internal.measurement.C14702k3) r8     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14702k3.m23665B(r8)     // Catch:{ all -> 0x0daf }
            boolean r8 = r5.f33059d     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0b3f
            r5.mo50809j()     // Catch:{ all -> 0x0daf }
            r8 = 0
            r5.f33059d = r8     // Catch:{ all -> 0x0daf }
        L_0x0b3f:
            MessageType r8 = r5.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.k3 r8 = (com.google.android.gms.internal.measurement.C14702k3) r8     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14702k3.m23667D(r8)     // Catch:{ all -> 0x0daf }
            boolean r8 = r5.f33059d     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0b50
            r5.mo50809j()     // Catch:{ all -> 0x0daf }
            r8 = 0
            r5.f33059d = r8     // Catch:{ all -> 0x0daf }
        L_0x0b50:
            MessageType r8 = r5.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.k3 r8 = (com.google.android.gms.internal.measurement.C14702k3) r8     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14702k3.m23669F(r8)     // Catch:{ all -> 0x0daf }
            boolean r8 = r7 instanceof java.lang.String     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0b6f
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0daf }
            boolean r6 = r5.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0b67
            r5.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r5.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x0b67:
            MessageType r6 = r5.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.k3 r6 = (com.google.android.gms.internal.measurement.C14702k3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14702k3.m23664A(r6, r7)     // Catch:{ all -> 0x0daf }
            goto L_0x0ba8
        L_0x0b6f:
            boolean r8 = r7 instanceof java.lang.Long     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0b7d
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0daf }
            long r6 = r7.longValue()     // Catch:{ all -> 0x0daf }
            r5.mo50603o(r6)     // Catch:{ all -> 0x0daf }
            goto L_0x0ba8
        L_0x0b7d:
            boolean r8 = r7 instanceof java.lang.Double     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0b99
            java.lang.Double r7 = (java.lang.Double) r7     // Catch:{ all -> 0x0daf }
            double r6 = r7.doubleValue()     // Catch:{ all -> 0x0daf }
            boolean r8 = r5.f33059d     // Catch:{ all -> 0x0daf }
            if (r8 == 0) goto L_0x0b91
            r5.mo50809j()     // Catch:{ all -> 0x0daf }
            r8 = 0
            r5.f33059d = r8     // Catch:{ all -> 0x0daf }
        L_0x0b91:
            MessageType r8 = r5.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.k3 r8 = (com.google.android.gms.internal.measurement.C14702k3) r8     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14702k3.m23668E(r8, r6)     // Catch:{ all -> 0x0daf }
            goto L_0x0ba8
        L_0x0b99:
            com.google.android.gms.measurement.internal.o4 r6 = r6.f33681b     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r6 = r6.f33724g     // Catch:{ all -> 0x0daf }
            java.lang.String r8 = "Ignoring invalid (type) user attribute value"
            r6.mo52238b(r7, r8)     // Catch:{ all -> 0x0daf }
        L_0x0ba8:
            r2.mo51004w(r5)     // Catch:{ all -> 0x0daf }
            int r15 = r15 + 1
            goto L_0x0af4
        L_0x0baf:
            com.google.android.gms.measurement.internal.h r3 = r1.f33488d     // Catch:{ IOException -> 0x0d61 }
            m24287I(r3)     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.internal.measurement.t5 r5 = r2.mo50807h()     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.internal.measurement.a3 r5 = (com.google.android.gms.internal.measurement.C14572a3) r5     // Catch:{ IOException -> 0x0d61 }
            r3.mo51995g()     // Catch:{ IOException -> 0x0d61 }
            r3.mo51942h()     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ IOException -> 0x0d61 }
            java.lang.String r6 = r5.mo50295C1()     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch:{ IOException -> 0x0d61 }
            byte[] r6 = r5.mo50868i()     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.measurement.internal.f7 r7 = r3.f34048c     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.measurement.internal.h7 r7 = r7.f33492h     // Catch:{ IOException -> 0x0d61 }
            m24287I(r7)     // Catch:{ IOException -> 0x0d61 }
            long r7 = r7.mo52114v(r6)     // Catch:{ IOException -> 0x0d61 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ IOException -> 0x0d61 }
            r9.<init>()     // Catch:{ IOException -> 0x0d61 }
            java.lang.String r10 = r5.mo50295C1()     // Catch:{ IOException -> 0x0d61 }
            r11 = r31
            r9.put(r11, r10)     // Catch:{ IOException -> 0x0d61 }
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0d61 }
            r12 = r33
            r9.put(r12, r10)     // Catch:{ IOException -> 0x0d61 }
            java.lang.String r10 = "metadata"
            r9.put(r10, r6)     // Catch:{ IOException -> 0x0d61 }
            android.database.sqlite.SQLiteDatabase r6 = r3.mo52052B()     // Catch:{ SQLiteException -> 0x0d45 }
            java.lang.String r10 = "raw_events_metadata"
            r13 = 4
            r14 = 0
            r6.insertWithOnConflict(r10, r14, r9, r13)     // Catch:{ SQLiteException -> 0x0d45 }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.zzar r3 = r4.f33673f     // Catch:{ all -> 0x0daf }
            android.os.Bundle r3 = r3.zza     // Catch:{ all -> 0x0daf }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0daf }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0daf }
        L_0x0c13:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x0c2b
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0daf }
            r6 = r27
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x0daf }
            if (r5 == 0) goto L_0x0c28
            goto L_0x0c65
        L_0x0c28:
            r27 = r6
            goto L_0x0c13
        L_0x0c2b:
            com.google.android.gms.measurement.internal.n3 r3 = r1.f33486b     // Catch:{ all -> 0x0daf }
            m24287I(r3)     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r4.f33668a     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r4.f33669b     // Catch:{ all -> 0x0daf }
            boolean r3 = r3.mo52257n(r5, r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r13 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r13)     // Catch:{ all -> 0x0daf }
            long r14 = r35.mo52036x()     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = r4.f33668a     // Catch:{ all -> 0x0daf }
            r17 = 0
            r18 = 0
            r16 = r5
            com.google.android.gms.measurement.internal.f r5 = r13.mo52055E(r14, r16, r17, r18)     // Catch:{ all -> 0x0daf }
            if (r3 == 0) goto L_0x0c63
            long r5 = r5.f33466e     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d r3 = r35.mo52008K()     // Catch:{ all -> 0x0daf }
            java.lang.String r9 = r4.f33668a     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C14959e2.f33423p     // Catch:{ all -> 0x0daf }
            int r3 = r3.mo51968k(r9, r10)     // Catch:{ all -> 0x0daf }
            long r9 = (long) r3     // Catch:{ all -> 0x0daf }
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0c63
            goto L_0x0c65
        L_0x0c63:
            r28 = 0
        L_0x0c65:
            r2.mo51995g()     // Catch:{ all -> 0x0daf }
            r2.mo51942h()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = r4.f33668a     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.f7 r3 = r2.f34048c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h7 r3 = r3.f33492h     // Catch:{ all -> 0x0daf }
            m24287I(r3)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.p2 r5 = com.google.android.gms.internal.measurement.C14779q2.m23880v()     // Catch:{ all -> 0x0daf }
            long r9 = r4.f33672e     // Catch:{ all -> 0x0daf }
            boolean r6 = r5.f33059d     // Catch:{ all -> 0x0daf }
            if (r6 == 0) goto L_0x0c8a
            r5.mo50809j()     // Catch:{ all -> 0x0daf }
            r6 = 0
            r5.f33059d = r6     // Catch:{ all -> 0x0daf }
        L_0x0c8a:
            MessageType r6 = r5.f33058c     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.q2 r6 = (com.google.android.gms.internal.measurement.C14779q2) r6     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.C14779q2.m23879H(r9, r6)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.zzar r6 = r4.f33673f     // Catch:{ all -> 0x0daf }
            android.os.Bundle r6 = r6.zza     // Catch:{ all -> 0x0daf }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x0daf }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0daf }
        L_0x0c9f:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x0daf }
            if (r9 == 0) goto L_0x0cc2
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x0daf }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.t2 r10 = com.google.android.gms.internal.measurement.C14828u2.m23989v()     // Catch:{ all -> 0x0daf }
            r10.mo50855q(r9)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.zzar r13 = r4.f33673f     // Catch:{ all -> 0x0daf }
            java.lang.Object r9 = r13.zzf(r9)     // Catch:{ all -> 0x0daf }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch:{ all -> 0x0daf }
            r3.mo52109G(r10, r9)     // Catch:{ all -> 0x0daf }
            r5.mo50768q(r10)     // Catch:{ all -> 0x0daf }
            goto L_0x0c9f
        L_0x0cc2:
            com.google.android.gms.internal.measurement.t5 r3 = r5.mo50807h()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.internal.measurement.q2 r3 = (com.google.android.gms.internal.measurement.C14779q2) r3     // Catch:{ all -> 0x0daf }
            byte[] r3 = r3.mo50868i()     // Catch:{ all -> 0x0daf }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0daf }
            r5.<init>()     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = r4.f33668a     // Catch:{ all -> 0x0daf }
            r5.put(r11, r6)     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = "name"
            java.lang.String r9 = r4.f33669b     // Catch:{ all -> 0x0daf }
            r5.put(r6, r9)     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = "timestamp"
            long r9 = r4.f33671d     // Catch:{ all -> 0x0daf }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0daf }
            r5.put(r6, r9)     // Catch:{ all -> 0x0daf }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0daf }
            r5.put(r12, r6)     // Catch:{ all -> 0x0daf }
            java.lang.String r6 = "data"
            r5.put(r6, r3)     // Catch:{ all -> 0x0daf }
            java.lang.String r3 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0daf }
            r5.put(r3, r6)     // Catch:{ all -> 0x0daf }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo52052B()     // Catch:{ SQLiteException -> 0x0d2b }
            r6 = r32
            r7 = 0
            long r5 = r3.insert(r6, r7, r5)     // Catch:{ SQLiteException -> 0x0d2b }
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0d26
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b     // Catch:{ SQLiteException -> 0x0d2b }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ SQLiteException -> 0x0d2b }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ SQLiteException -> 0x0d2b }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52275l()     // Catch:{ SQLiteException -> 0x0d2b }
            java.lang.String r5 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r4.f33668a     // Catch:{ SQLiteException -> 0x0d2b }
            com.google.android.gms.measurement.internal.n2 r6 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r6)     // Catch:{ SQLiteException -> 0x0d2b }
            r3.mo52238b(r6, r5)     // Catch:{ SQLiteException -> 0x0d2b }
            goto L_0x0d78
        L_0x0d26:
            r2 = 0
            r1.f33500p = r2     // Catch:{ all -> 0x0daf }
            goto L_0x0d78
        L_0x0d2b:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = "Error storing raw event. appId"
            java.lang.String r4 = r4.f33668a     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r4)     // Catch:{ all -> 0x0daf }
            r2.mo52239c(r4, r5, r3)     // Catch:{ all -> 0x0daf }
            goto L_0x0d78
        L_0x0d45:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.mo52275l()     // Catch:{ IOException -> 0x0d61 }
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r5 = r5.mo50295C1()     // Catch:{ IOException -> 0x0d61 }
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r5)     // Catch:{ IOException -> 0x0d61 }
            r3.mo52239c(r5, r6, r4)     // Catch:{ IOException -> 0x0d61 }
            throw r4     // Catch:{ IOException -> 0x0d61 }
        L_0x0d61:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.o2 r4 = r35.mo52016b()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.m2 r4 = r4.mo52275l()     // Catch:{ all -> 0x0daf }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo51000s()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.n2 r2 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r2)     // Catch:{ all -> 0x0daf }
            r4.mo52239c(r2, r5, r3)     // Catch:{ all -> 0x0daf }
        L_0x0d78:
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d     // Catch:{ all -> 0x0daf }
            m24287I(r2)     // Catch:{ all -> 0x0daf }
            r2.mo52071m()     // Catch:{ all -> 0x0daf }
            com.google.android.gms.measurement.internal.h r2 = r1.f33488d
            m24287I(r2)
            r2.mo52067Q()
            r35.mo52002D()
            com.google.android.gms.measurement.internal.o2 r2 = r35.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.mo52276m()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r29
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo52238b(r3, r4)
            return
        L_0x0dab:
            r0 = move-exception
            r1 = r35
            goto L_0x0db0
        L_0x0daf:
            r0 = move-exception
        L_0x0db0:
            r2 = r0
            com.google.android.gms.measurement.internal.h r3 = r1.f33488d
            m24287I(r3)
            r3.mo52067Q()
            throw r2
        L_0x0dba:
            r1.mo52007J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14973f7.mo52035u(com.google.android.gms.measurement.internal.zzat, com.google.android.gms.measurement.internal.zzp):void");
    }

    /* renamed from: x */
    public final long mo52036x() {
        long currentTimeMillis = mo52017c().currentTimeMillis();
        C15008j6 j6Var = this.f33494j;
        j6Var.mo51942h();
        j6Var.mo51995g();
        long a = j6Var.f33619l.mo52363a();
        if (a == 0) {
            a = ((long) ((C15103u3) j6Var.f33681b).mo52335w().mo52218o().nextInt(86400000)) + 1;
            j6Var.f33619l.mo52364b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: y */
    public final zzp mo52037y(String str) {
        String str2 = str;
        C14983h hVar = this.f33488d;
        m24287I(hVar);
        C15143z3 C = hVar.mo52053C(str2);
        if (C == null || TextUtils.isEmpty(C.mo52401z())) {
            mo52016b().f33731n.mo52238b(str2, "No app data available; dropping");
            return null;
        }
        Boolean z = mo52038z(C);
        if (z == null || z.booleanValue()) {
            String C2 = C.mo52375C();
            String z2 = C.mo52401z();
            long u = C.mo52396u();
            C.f34015a.mo52015a().mo51995g();
            String str3 = C.f34026l;
            C.f34015a.mo52015a().mo51995g();
            long j = C.f34027m;
            C.f34015a.mo52015a().mo51995g();
            long j2 = C.f34028n;
            C.f34015a.mo52015a().mo51995g();
            boolean z3 = C.f34029o;
            String A = C.mo52373A();
            C.f34015a.mo52015a().mo51995g();
            long j3 = C.f34030p;
            C.f34015a.mo52015a().mo51995g();
            boolean z4 = C.f34031q;
            String v = C.mo52397v();
            C.f34015a.mo52015a().mo51995g();
            Boolean bool = C.f34033s;
            boolean z5 = z4;
            C.f34015a.mo52015a().mo51995g();
            long j4 = j2;
            boolean z6 = z3;
            long j5 = C.f34034t;
            C.f34015a.mo52015a().mo51995g();
            ArrayList arrayList = C.f34035u;
            C14811s9.m23933a();
            ArrayList arrayList2 = arrayList;
            return new zzp(str, C2, z2, u, str3, j, j4, (String) null, z6, false, A, j3, 0, 0, z5, false, v, bool, j5, (List<String>) arrayList2, mo52008K().mo51973p(str2, C14959e2.f33398c0) ? C.mo52374B() : null, mo52009L(str).mo51984d());
        }
        mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "App version does not match; dropping. appId");
        return null;
    }

    /* renamed from: z */
    public final Boolean mo52038z(C15143z3 z3Var) {
        try {
            if (z3Var.mo52396u() != ParserMinimalBase.MIN_INT_L) {
                if (z3Var.mo52396u() == ((long) Wrappers.packageManager(this.f33497m.f33872b).getPackageInfo(z3Var.mo52399x(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.f33497m.f33872b).getPackageInfo(z3Var.mo52399x(), 0).versionName;
                String z = z3Var.mo52401z();
                if (z != null && z.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
