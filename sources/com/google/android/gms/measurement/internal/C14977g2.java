package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14617d9;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.g2 */
public final class C14977g2 extends C14933b3 {

    /* renamed from: d */
    public String f33516d;

    /* renamed from: e */
    public String f33517e;

    /* renamed from: f */
    public int f33518f;

    /* renamed from: g */
    public String f33519g;

    /* renamed from: h */
    public long f33520h;

    /* renamed from: i */
    public final long f33521i;

    /* renamed from: j */
    public List<String> f33522j;

    /* renamed from: k */
    public int f33523k;

    /* renamed from: l */
    public String f33524l;

    /* renamed from: m */
    public String f33525m;

    /* renamed from: n */
    public String f33526n;

    public C14977g2(C15103u3 u3Var, long j) {
        super(u3Var);
        this.f33521i = j;
    }

    /* renamed from: j */
    public final boolean mo51948j() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018d A[Catch:{ IllegalStateException -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018f A[Catch:{ IllegalStateException -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a5 A[SYNTHETIC, Splitter:B:56:0x01a5] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e4 A[Catch:{ IllegalStateException -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020f A[Catch:{ IllegalStateException -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0281 A[SYNTHETIC, Splitter:B:92:0x0281] */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52045k() {
        /*
            r13 = this;
            com.google.android.gms.measurement.internal.o4 r0 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            android.content.Context r0 = r0.f33872b
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.o4 r1 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            android.content.Context r1 = r1.f33872b
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "unknown"
            java.lang.String r3 = "Unknown"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33724g
            com.google.android.gms.measurement.internal.n2 r8 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo52238b(r8, r9)
            goto L_0x0099
        L_0x0034:
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            goto L_0x004c
        L_0x0039:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33724g
            com.google.android.gms.measurement.internal.n2 r8 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo52238b(r8, r9)
        L_0x004c:
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "manual_install"
            goto L_0x005a
        L_0x0051:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x005a
            r2 = r6
        L_0x005a:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b     // Catch:{ NameNotFoundException -> 0x0084 }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r7 = r7.f33872b     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0084 }
            if (r7 == 0) goto L_0x0099
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0084 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0084 }
            if (r9 != 0) goto L_0x007b
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0084 }
            goto L_0x007c
        L_0x007b:
            r8 = r3
        L_0x007c:
            java.lang.String r3 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0081 }
            int r4 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0081 }
            goto L_0x0099
        L_0x0081:
            r7 = r3
            r3 = r8
            goto L_0x0085
        L_0x0084:
            r7 = r3
        L_0x0085:
            com.google.android.gms.measurement.internal.o4 r8 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8
            com.google.android.gms.measurement.internal.o2 r8 = r8.mo52016b()
            com.google.android.gms.measurement.internal.m2 r8 = r8.f33724g
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo52239c(r9, r10, r3)
            r3 = r7
        L_0x0099:
            r13.f33516d = r0
            r13.f33519g = r2
            r13.f33517e = r3
            r13.f33518f = r4
            r2 = 0
            r13.f33520h = r2
            com.google.android.gms.measurement.internal.o4 r2 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            java.lang.String r2 = r2.f33873c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c2
            com.google.android.gms.measurement.internal.o4 r2 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            java.lang.String r2 = r2.f33874d
            java.lang.String r4 = "am"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c2
            r2 = r3
            goto L_0x00c3
        L_0x00c2:
            r2 = r5
        L_0x00c3:
            com.google.android.gms.measurement.internal.o4 r4 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            int r4 = r4.mo52323j()
            switch(r4) {
                case 0: goto L_0x0149;
                case 1: goto L_0x0139;
                case 2: goto L_0x0129;
                case 3: goto L_0x0119;
                case 4: goto L_0x0109;
                case 5: goto L_0x00f9;
                case 6: goto L_0x00e9;
                case 7: goto L_0x00d8;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            goto L_0x0159
        L_0x00d8:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33730m
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x00e9:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33729l
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x00f9:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33732o
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x0109:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33730m
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x0119:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33730m
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x0129:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33732o
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x0139:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33730m
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x0149:
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33732o
            java.lang.String r8 = "App measurement collection enabled"
            r7.mo52237a(r8)
            goto L_0x0160
        L_0x0159:
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33730m
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.mo52237a(r8)
        L_0x0160:
            r13.f33524l = r6
            r13.f33525m = r6
            r13.f33526n = r6
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            r7.getClass()
            if (r2 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.o4 r2 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            java.lang.String r2 = r2.f33873c
            r13.f33525m = r2
        L_0x0177:
            r2 = 0
            com.google.android.gms.measurement.internal.o4 r7 = r13.f33681b     // Catch:{ IllegalStateException -> 0x022e }
            r8 = r7
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8     // Catch:{ IllegalStateException -> 0x022e }
            android.content.Context r8 = r8.f33872b     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ IllegalStateException -> 0x022e }
            java.lang.String r7 = r7.f33890t     // Catch:{ IllegalStateException -> 0x022e }
            java.lang.String r7 = p514bk.C14088a.m21778A(r8, r7)     // Catch:{ IllegalStateException -> 0x022e }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x022e }
            if (r3 == r8) goto L_0x018f
            r8 = r7
            goto L_0x0190
        L_0x018f:
            r8 = r6
        L_0x0190:
            r13.f33524l = r8     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.internal.measurement.C14811s9.m23933a()     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.o4 r8 = r13.f33681b     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.d r8 = r8.f33878h     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C14959e2.f33398c0     // Catch:{ IllegalStateException -> 0x022e }
            boolean r8 = r8.mo51973p(r2, r9)     // Catch:{ IllegalStateException -> 0x022e }
            java.lang.String r9 = "admob_app_id"
            if (r8 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.o4 r8 = r13.f33681b     // Catch:{ IllegalStateException -> 0x022e }
            r10 = r8
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10     // Catch:{ IllegalStateException -> 0x022e }
            android.content.Context r10 = r10.f33872b     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8     // Catch:{ IllegalStateException -> 0x022e }
            java.lang.String r8 = r8.f33890t     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch:{ IllegalStateException -> 0x022e }
            android.content.res.Resources r11 = r10.getResources()     // Catch:{ IllegalStateException -> 0x022e }
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x022e }
            if (r12 != 0) goto L_0x01be
            goto L_0x01c2
        L_0x01be:
            java.lang.String r8 = com.google.android.gms.measurement.internal.C15050o3.m24586a(r10)     // Catch:{ IllegalStateException -> 0x022e }
        L_0x01c2:
            java.lang.String r10 = "ga_app_id"
            java.lang.String r10 = com.google.android.gms.measurement.internal.C15050o3.m24587b(r11, r10, r8)     // Catch:{ IllegalStateException -> 0x022e }
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x022e }
            if (r3 == r12) goto L_0x01cf
            r6 = r10
        L_0x01cf:
            r13.f33526n = r6     // Catch:{ IllegalStateException -> 0x022e }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x022e }
            if (r3 == 0) goto L_0x01dd
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x022e }
            if (r3 != 0) goto L_0x020d
        L_0x01dd:
            java.lang.String r3 = com.google.android.gms.measurement.internal.C15050o3.m24587b(r11, r9, r8)     // Catch:{ IllegalStateException -> 0x022e }
            r13.f33525m = r3     // Catch:{ IllegalStateException -> 0x022e }
            goto L_0x020d
        L_0x01e4:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x022e }
            if (r3 != 0) goto L_0x020d
            com.google.android.gms.measurement.internal.o4 r3 = r13.f33681b     // Catch:{ IllegalStateException -> 0x022e }
            r6 = r3
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ IllegalStateException -> 0x022e }
            android.content.Context r6 = r6.f33872b     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ IllegalStateException -> 0x022e }
            java.lang.String r3 = r3.f33890t     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ IllegalStateException -> 0x022e }
            android.content.res.Resources r7 = r6.getResources()     // Catch:{ IllegalStateException -> 0x022e }
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x022e }
            if (r8 != 0) goto L_0x0203
            goto L_0x0207
        L_0x0203:
            java.lang.String r3 = com.google.android.gms.measurement.internal.C15050o3.m24586a(r6)     // Catch:{ IllegalStateException -> 0x022e }
        L_0x0207:
            java.lang.String r3 = com.google.android.gms.measurement.internal.C15050o3.m24587b(r7, r9, r3)     // Catch:{ IllegalStateException -> 0x022e }
            r13.f33525m = r3     // Catch:{ IllegalStateException -> 0x022e }
        L_0x020d:
            if (r4 != 0) goto L_0x0242
            com.google.android.gms.measurement.internal.o4 r3 = r13.f33681b     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ IllegalStateException -> 0x022e }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33732o     // Catch:{ IllegalStateException -> 0x022e }
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f33516d     // Catch:{ IllegalStateException -> 0x022e }
            java.lang.String r7 = r13.f33524l     // Catch:{ IllegalStateException -> 0x022e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x022e }
            if (r7 == 0) goto L_0x0228
            java.lang.String r7 = r13.f33525m     // Catch:{ IllegalStateException -> 0x022e }
            goto L_0x022a
        L_0x0228:
            java.lang.String r7 = r13.f33524l     // Catch:{ IllegalStateException -> 0x022e }
        L_0x022a:
            r3.mo52239c(r6, r4, r7)     // Catch:{ IllegalStateException -> 0x022e }
            goto L_0x0242
        L_0x022e:
            r3 = move-exception
            com.google.android.gms.measurement.internal.o4 r4 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33724g
            com.google.android.gms.measurement.internal.n2 r0 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r4.mo52239c(r0, r6, r3)
        L_0x0242:
            r13.f33522j = r2
            com.google.android.gms.measurement.internal.o4 r0 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            com.google.android.gms.measurement.internal.o4 r0 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            r0.getClass()
            java.lang.String r3 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.os.Bundle r4 = r0.mo51971n()
            if (r4 != 0) goto L_0x026f
            com.google.android.gms.measurement.internal.o4 r3 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g
            java.lang.String r4 = "Failed to load metadata: Metadata bundle is null"
            r3.mo52237a(r4)
            goto L_0x0275
        L_0x026f:
            boolean r6 = r4.containsKey(r3)
            if (r6 != 0) goto L_0x0277
        L_0x0275:
            r3 = r2
            goto L_0x027f
        L_0x0277:
            int r3 = r4.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x027f:
            if (r3 == 0) goto L_0x02ab
            com.google.android.gms.measurement.internal.o4 r4 = r0.f33681b     // Catch:{ NotFoundException -> 0x029b }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ NotFoundException -> 0x029b }
            android.content.Context r4 = r4.f33872b     // Catch:{ NotFoundException -> 0x029b }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ NotFoundException -> 0x029b }
            int r3 = r3.intValue()     // Catch:{ NotFoundException -> 0x029b }
            java.lang.String[] r3 = r4.getStringArray(r3)     // Catch:{ NotFoundException -> 0x029b }
            if (r3 != 0) goto L_0x0296
            goto L_0x02ab
        L_0x0296:
            java.util.List r2 = java.util.Arrays.asList(r3)     // Catch:{ NotFoundException -> 0x029b }
            goto L_0x02ab
        L_0x029b:
            r3 = move-exception
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.String r4 = "Failed to load string array from metadata: resource not found"
            r0.mo52238b(r3, r4)
        L_0x02ab:
            if (r2 != 0) goto L_0x02ae
            goto L_0x02e5
        L_0x02ae:
            int r0 = r2.size()
            if (r0 != 0) goto L_0x02c4
            com.google.android.gms.measurement.internal.o4 r0 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33729l
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo52237a(r2)
            goto L_0x02e7
        L_0x02c4:
            java.util.Iterator r0 = r2.iterator()
        L_0x02c8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02e5
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.o4 r4 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.k7 r4 = r4.mo52335w()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo52198L(r6, r3)
            if (r3 != 0) goto L_0x02c8
            goto L_0x02e7
        L_0x02e5:
            r13.f33522j = r2
        L_0x02e7:
            if (r1 == 0) goto L_0x02f6
            com.google.android.gms.measurement.internal.o4 r0 = r13.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            android.content.Context r0 = r0.f33872b
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r13.f33523k = r0
            return
        L_0x02f6:
            r13.f33523k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14977g2.mo52045k():void");
    }

    /* renamed from: l */
    public final String mo52046l() {
        mo51946h();
        Preconditions.checkNotNull(this.f33516d);
        return this.f33516d;
    }

    /* renamed from: m */
    public final String mo52047m() {
        C14617d9.f32811c.f32812b.zza().zza();
        if (((C15103u3) this.f33681b).f33878h.mo51973p((String) null, C14959e2.f33424p0)) {
            mo51995g();
        }
        mo51946h();
        Preconditions.checkNotNull(this.f33524l);
        return this.f33524l;
    }
}
