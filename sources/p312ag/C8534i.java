package p312ag;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.time.DateUtils;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13503d;
import p461uf.C13511h;

/* renamed from: ag.i */
public final class C8534i {

    /* renamed from: a */
    public static final String f18589a = C8534i.class.getCanonicalName();

    /* renamed from: b */
    public static final long[] f18590b = {300000, 900000, 1800000, DateUtils.MILLIS_PER_HOUR, 21600000, 43200000, DateUtils.MILLIS_PER_DAY, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: c */
    public static final C8534i f18591c = new C8534i();

    /* renamed from: b */
    public static final void m16940b(String str, String str2, Context context) {
        C13511h hVar;
        Class<C8534i> cls = C8534i.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(str, "activityName");
                Bundle bundle = new Bundle();
                bundle.putString("fb_mobile_launch_source", "Unclassified");
                bundle.putString("fb_mobile_pckg_fp", f18591c.mo21060a(context));
                bundle.putString("fb_mobile_app_cert_hash", C19382n.m32747f0(context));
                hVar = new C13511h(str, str2);
                String str3 = C13418j.f29381a;
                if (C13442y.m21140c()) {
                    hVar.mo46168d(bundle, "fb_mobile_activate_app");
                }
                C13511h.f29567i.getClass();
                if (C13511h.C13512a.m21285c() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY && !C13080a.m20762b(hVar)) {
                    C13503d.m21268d(FlushReason.EXPLICIT);
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076 A[Catch:{ all -> 0x0057, all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e8 A[Catch:{ all -> 0x0057, all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e9 A[Catch:{ all -> 0x0057, all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f6 A[Catch:{ all -> 0x0057, all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb A[Catch:{ all -> 0x0057, all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0121 A[SYNTHETIC, Splitter:B:76:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m16941c(java.lang.String r19, p312ag.C8532h r20, java.lang.String r21) {
        /*
            r1 = r19
            r2 = r20
            java.lang.String r0 = "activityName"
            java.lang.Class<ag.i> r3 = p312ag.C8534i.class
            boolean r4 = p401mg.C13080a.m20762b(r3)
            if (r4 == 0) goto L_0x000f
            return
        L_0x000f:
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)     // Catch:{ all -> 0x0134 }
            if (r2 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.Long r0 = r2.f18584b     // Catch:{ all -> 0x0134 }
            r4 = 0
            if (r0 == 0) goto L_0x0020
            long r6 = r0.longValue()     // Catch:{ all -> 0x0134 }
            goto L_0x0021
        L_0x0020:
            r6 = r4
        L_0x0021:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x002c
            long r6 = r0.longValue()     // Catch:{ all -> 0x0134 }
            goto L_0x0038
        L_0x002c:
            java.lang.Long r0 = r2.f18587e     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0035
            long r6 = r0.longValue()     // Catch:{ all -> 0x0134 }
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            long r6 = r4 - r6
        L_0x0038:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            java.lang.String r8 = "Clock skew detected"
            if (r0 >= 0) goto L_0x005c
            ag.i r6 = f18591c     // Catch:{ all -> 0x0134 }
            r6.getClass()     // Catch:{ all -> 0x0134 }
            boolean r0 = p401mg.C13080a.m20762b(r6)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            hg.c0$a r0 = p365hg.C12845c0.f28334f     // Catch:{ all -> 0x0057 }
            com.facebook.LoggingBehavior r7 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x0057 }
            java.lang.String r9 = f18589a     // Catch:{ all -> 0x0057 }
            kotlin.jvm.internal.C19383o.m32794d(r9)     // Catch:{ all -> 0x0057 }
            r0.mo45626b(r7, r9, r8)     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            p401mg.C13080a.m20761a(r6, r0)     // Catch:{ all -> 0x0134 }
        L_0x005b:
            r6 = r4
        L_0x005c:
            java.lang.Long r0 = r2.f18586d     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0071
            java.lang.Long r0 = r2.f18587e     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x0065
            goto L_0x0071
        L_0x0065:
            long r9 = r0.longValue()     // Catch:{ all -> 0x0134 }
            java.lang.Long r0 = r2.f18586d     // Catch:{ all -> 0x0134 }
            long r11 = r0.longValue()     // Catch:{ all -> 0x0134 }
            long r9 = r9 - r11
            goto L_0x0072
        L_0x0071:
            r9 = r4
        L_0x0072:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
            ag.i r9 = f18591c     // Catch:{ all -> 0x0134 }
            r9.getClass()     // Catch:{ all -> 0x0134 }
            boolean r0 = p401mg.C13080a.m20762b(r9)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            hg.c0$a r0 = p365hg.C12845c0.f28334f     // Catch:{ all -> 0x008f }
            com.facebook.LoggingBehavior r10 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x008f }
            java.lang.String r11 = f18589a     // Catch:{ all -> 0x008f }
            kotlin.jvm.internal.C19383o.m32794d(r11)     // Catch:{ all -> 0x008f }
            r0.mo45626b(r10, r11, r8)     // Catch:{ all -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r0 = move-exception
            p401mg.C13080a.m20761a(r9, r0)     // Catch:{ all -> 0x0134 }
        L_0x0093:
            r9 = r4
        L_0x0094:
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ all -> 0x0134 }
            r14.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "fb_mobile_app_interruptions"
            int r8 = r2.f18583a     // Catch:{ all -> 0x0134 }
            r14.putInt(r0, r8)     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = "fb_mobile_time_between_sessions"
            java.util.Locale r11 = java.util.Locale.ROOT     // Catch:{ all -> 0x0134 }
            java.lang.String r12 = "session_quanta_%d"
            r13 = 1
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x0134 }
            boolean r0 = p401mg.C13080a.m20762b(r3)     // Catch:{ all -> 0x0134 }
            r16 = 0
            if (r0 == 0) goto L_0x00b2
            goto L_0x00c6
        L_0x00b2:
            r0 = r16
        L_0x00b4:
            long[] r4 = f18590b     // Catch:{ all -> 0x00c2 }
            int r5 = r4.length     // Catch:{ all -> 0x00c2 }
            if (r0 >= r5) goto L_0x00c8
            r17 = r4[r0]     // Catch:{ all -> 0x00c2 }
            int r4 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c8
            int r0 = r0 + 1
            goto L_0x00b4
        L_0x00c2:
            r0 = move-exception
            p401mg.C13080a.m20761a(r3, r0)     // Catch:{ all -> 0x0134 }
        L_0x00c6:
            r0 = r16
        L_0x00c8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0134 }
            r15[r16] = r0     // Catch:{ all -> 0x0134 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r15, r13)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = java.lang.String.format(r11, r12, r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = "java.lang.String.format(locale, format, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)     // Catch:{ all -> 0x0134 }
            r14.putString(r8, r0)     // Catch:{ all -> 0x0134 }
            ag.j r0 = r2.f18585c     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r0 = "Unclassified"
        L_0x00eb:
            java.lang.String r4 = "fb_mobile_launch_source"
            r14.putString(r4, r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "_logTime"
            java.lang.Long r2 = r2.f18587e     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00fb
            long r4 = r2.longValue()     // Catch:{ all -> 0x0134 }
            goto L_0x00fd
        L_0x00fb:
            r4 = 0
        L_0x00fd:
            r2 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r2     // Catch:{ all -> 0x0134 }
            long r4 = r4 / r6
            r14.putLong(r0, r4)     // Catch:{ all -> 0x0134 }
            uf.h r2 = new uf.h     // Catch:{ all -> 0x0134 }
            r4 = r21
            r2.<init>((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0134 }
            java.lang.String r12 = "fb_mobile_deactivate_app"
            double r0 = (double) r9     // Catch:{ all -> 0x0134 }
            r4 = 1000(0x3e8, double:4.94E-321)
            double r4 = (double) r4     // Catch:{ all -> 0x0134 }
            double r0 = r0 / r4
            java.lang.String r4 = p453tf.C13418j.f29381a     // Catch:{ all -> 0x0134 }
            boolean r4 = p453tf.C13442y.m21140c()     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x0133
            boolean r4 = p401mg.C13080a.m20762b(r2)     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x0121
            goto L_0x0133
        L_0x0121:
            java.lang.Double r13 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x012f }
            r15 = 0
            java.util.UUID r16 = com.facebook.appevents.internal.ActivityLifecycleTracker.m20067a()     // Catch:{ all -> 0x012f }
            r11 = r2
            r11.mo46169e(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x012f:
            r0 = move-exception
            p401mg.C13080a.m20761a(r2, r0)     // Catch:{ all -> 0x0134 }
        L_0x0133:
            return
        L_0x0134:
            r0 = move-exception
            p401mg.C13080a.m20761a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ag.C8534i.m16941c(java.lang.String, ag.h, java.lang.String):void");
    }

    /* renamed from: a */
    public final String mo21060a(Context context) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, (String) null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String b = C8531g.m16937b(context);
            if (b == null) {
                b = C8531g.m16936a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            }
            sharedPreferences.edit().putString(str, b).apply();
            return b;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
