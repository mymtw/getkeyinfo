package p453tf;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p401mg.C13080a;

/* renamed from: tf.y */
public final class C13442y {

    /* renamed from: a */
    public static final String f29447a = C13442y.class.getName();

    /* renamed from: b */
    public static final AtomicBoolean f29448b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final AtomicBoolean f29449c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final C13443a f29450d = new C13443a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    public static final C13443a f29451e = new C13443a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f */
    public static final C13443a f29452f = new C13443a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g */
    public static final C13443a f29453g = new C13443a(false, "auto_event_setup_enabled");

    /* renamed from: h */
    public static final C13443a f29454h = new C13443a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i */
    public static SharedPreferences f29455i;

    /* renamed from: j */
    public static final C13442y f29456j = new C13442y();

    /* renamed from: tf.y$a */
    public static final class C13443a {

        /* renamed from: a */
        public Boolean f29457a;

        /* renamed from: b */
        public long f29458b;

        /* renamed from: c */
        public boolean f29459c;

        /* renamed from: d */
        public String f29460d;

        public C13443a(boolean z, String str) {
            this.f29459c = z;
            this.f29460d = str;
        }

        /* renamed from: a */
        public final boolean mo46131a() {
            Boolean bool = this.f29457a;
            return bool != null ? bool.booleanValue() : this.f29459c;
        }
    }

    /* renamed from: tf.y$b */
    public static final class C13444b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ long f29461b;

        public C13444b(long j) {
            this.f29461b = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[Catch:{ all -> 0x0018, all -> 0x00d6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004c A[Catch:{ all -> 0x0018, all -> 0x00d6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ all -> 0x0018, all -> 0x00d6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb A[SYNTHETIC, Splitter:B:40:0x00cb] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                java.lang.String r0 = "auto_event_setup_enabled"
                java.lang.Class<tf.y> r1 = p453tf.C13442y.class
                boolean r2 = p401mg.C13080a.m20762b(r8)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r2 = p453tf.C13442y.f29447a     // Catch:{ all -> 0x00d6 }
                boolean r2 = p401mg.C13080a.m20762b(r1)     // Catch:{ all -> 0x00d6 }
                r3 = 0
                if (r2 == 0) goto L_0x0015
                goto L_0x001c
            L_0x0015:
                tf.y$a r2 = p453tf.C13442y.f29452f     // Catch:{ all -> 0x0018 }
                goto L_0x001d
            L_0x0018:
                r2 = move-exception
                p401mg.C13080a.m20761a(r1, r2)     // Catch:{ all -> 0x00d6 }
            L_0x001c:
                r2 = r3
            L_0x001d:
                boolean r2 = r2.mo46131a()     // Catch:{ all -> 0x00d6 }
                r4 = 0
                if (r2 == 0) goto L_0x00c2
                java.lang.String r2 = p453tf.C13418j.m21107c()     // Catch:{ all -> 0x00d6 }
                hg.n r2 = com.facebook.internal.FetchedAppSettingsManager.m20107f(r2, r4)     // Catch:{ all -> 0x00d6 }
                if (r2 == 0) goto L_0x00c2
                boolean r2 = r2.f28406j     // Catch:{ all -> 0x00d6 }
                if (r2 == 0) goto L_0x00c2
                android.content.Context r2 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x00d6 }
                hg.b$a r5 = p365hg.C12831b.f28321h     // Catch:{ all -> 0x00d6 }
                r5.getClass()     // Catch:{ all -> 0x00d6 }
                hg.b r2 = p365hg.C12831b.C12832a.m20469a(r2)     // Catch:{ all -> 0x00d6 }
                if (r2 == 0) goto L_0x004c
                java.lang.String r5 = r2.mo45613a()     // Catch:{ all -> 0x00d6 }
                if (r5 == 0) goto L_0x004c
                java.lang.String r2 = r2.mo45613a()     // Catch:{ all -> 0x00d6 }
                goto L_0x004d
            L_0x004c:
                r2 = r3
            L_0x004d:
                if (r2 == 0) goto L_0x00c2
                android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x00d6 }
                r5.<init>()     // Catch:{ all -> 0x00d6 }
                java.lang.String r6 = "advertiser_id"
                r5.putString(r6, r2)     // Catch:{ all -> 0x00d6 }
                java.lang.String r2 = "fields"
                r5.putString(r2, r0)     // Catch:{ all -> 0x00d6 }
                p365hg.C12879l0.m20603g()     // Catch:{ all -> 0x00d6 }
                java.lang.String r2 = p453tf.C13418j.f29386f     // Catch:{ all -> 0x00d6 }
                boolean r2 = p365hg.C12869i0.m20546B(r2)     // Catch:{ all -> 0x00d6 }
                if (r2 == 0) goto L_0x0082
                com.facebook.GraphRequest$c r2 = com.facebook.GraphRequest.f27224o     // Catch:{ all -> 0x00d6 }
                java.lang.String r6 = p453tf.C13418j.m21107c()     // Catch:{ all -> 0x00d6 }
                r2.getClass()     // Catch:{ all -> 0x00d6 }
                com.facebook.GraphRequest r2 = com.facebook.GraphRequest.C12196c.m20007g(r3, r6, r3)     // Catch:{ all -> 0x00d6 }
                r6 = 1
                r2.f27233i = r6     // Catch:{ all -> 0x00d6 }
                r2.f27228d = r5     // Catch:{ all -> 0x00d6 }
                com.facebook.GraphResponse r2 = r2.mo39226c()     // Catch:{ all -> 0x00d6 }
                org.json.JSONObject r2 = r2.f27246c     // Catch:{ all -> 0x00d6 }
                goto L_0x0095
            L_0x0082:
                com.facebook.GraphRequest$c r2 = com.facebook.GraphRequest.f27224o     // Catch:{ all -> 0x00d6 }
                java.lang.String r6 = "app"
                r2.getClass()     // Catch:{ all -> 0x00d6 }
                com.facebook.GraphRequest r2 = com.facebook.GraphRequest.C12196c.m20007g(r3, r6, r3)     // Catch:{ all -> 0x00d6 }
                r2.f27228d = r5     // Catch:{ all -> 0x00d6 }
                com.facebook.GraphResponse r2 = r2.mo39226c()     // Catch:{ all -> 0x00d6 }
                org.json.JSONObject r2 = r2.f27246c     // Catch:{ all -> 0x00d6 }
            L_0x0095:
                if (r2 == 0) goto L_0x00c2
                tf.y r5 = p453tf.C13442y.f29456j     // Catch:{ all -> 0x00d6 }
                tf.y$a r6 = p453tf.C13442y.m21138a()     // Catch:{ all -> 0x00d6 }
                boolean r0 = r2.optBoolean(r0, r4)     // Catch:{ all -> 0x00d6 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d6 }
                r6.f29457a = r0     // Catch:{ all -> 0x00d6 }
                tf.y$a r0 = p453tf.C13442y.m21138a()     // Catch:{ all -> 0x00d6 }
                long r6 = r8.f29461b     // Catch:{ all -> 0x00d6 }
                r0.f29458b = r6     // Catch:{ all -> 0x00d6 }
                tf.y$a r0 = p453tf.C13442y.m21138a()     // Catch:{ all -> 0x00d6 }
                boolean r2 = p401mg.C13080a.m20762b(r1)     // Catch:{ all -> 0x00d6 }
                if (r2 == 0) goto L_0x00ba
                goto L_0x00c2
            L_0x00ba:
                r5.mo46130k(r0)     // Catch:{ all -> 0x00be }
                goto L_0x00c2
            L_0x00be:
                r0 = move-exception
                p401mg.C13080a.m20761a(r1, r0)     // Catch:{ all -> 0x00d6 }
            L_0x00c2:
                java.lang.String r0 = p453tf.C13442y.f29447a     // Catch:{ all -> 0x00d6 }
                boolean r0 = p401mg.C13080a.m20762b(r1)     // Catch:{ all -> 0x00d6 }
                if (r0 == 0) goto L_0x00cb
                goto L_0x00d2
            L_0x00cb:
                java.util.concurrent.atomic.AtomicBoolean r3 = p453tf.C13442y.f29449c     // Catch:{ all -> 0x00ce }
                goto L_0x00d2
            L_0x00ce:
                r0 = move-exception
                p401mg.C13080a.m20761a(r1, r0)     // Catch:{ all -> 0x00d6 }
            L_0x00d2:
                r3.set(r4)     // Catch:{ all -> 0x00d6 }
                return
            L_0x00d6:
                r0 = move-exception
                p401mg.C13080a.m20761a(r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p453tf.C13442y.C13444b.run():void");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C13443a m21138a() {
        Class<C13442y> cls = C13442y.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f29453g;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m21139b() {
        Class<C13442y> cls = C13442y.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            f29456j.mo46124e();
            return f29452f.mo46131a();
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m21140c() {
        Class<C13442y> cls = C13442y.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            f29456j.mo46124e();
            return f29451e.mo46131a();
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }

    /* renamed from: d */
    public final void mo46123d() {
        if (!C13080a.m20762b(this)) {
            try {
                C13443a aVar = f29453g;
                mo46128i(aVar);
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.f29457a == null || currentTimeMillis - aVar.f29458b >= 604800000) {
                    aVar.f29457a = null;
                    aVar.f29458b = 0;
                    if (f29449c.compareAndSet(false, true)) {
                        C13418j.m21108d().execute(new C13444b(currentTimeMillis));
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: e */
    public final void mo46124e() {
        if (!C13080a.m20762b(this)) {
            try {
                if (C13418j.m21113i()) {
                    if (f29448b.compareAndSet(false, true)) {
                        SharedPreferences sharedPreferences = C13418j.m21106b().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                        C19383o.m32796f(sharedPreferences, "FacebookSdk.getApplicati…GS, Context.MODE_PRIVATE)");
                        f29455i = sharedPreferences;
                        C13443a[] aVarArr = {f29451e, f29452f, f29450d};
                        if (!C13080a.m20762b(this)) {
                            for (int i = 0; i < 3; i++) {
                                C13443a aVar = aVarArr[i];
                                if (aVar == f29453g) {
                                    mo46123d();
                                } else if (aVar.f29457a == null) {
                                    mo46128i(aVar);
                                    if (aVar.f29457a == null) {
                                        mo46125f(aVar);
                                    }
                                } else {
                                    mo46130k(aVar);
                                }
                            }
                        }
                        mo46123d();
                        mo46127h();
                        mo46126g();
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: f */
    public final void mo46125f(C13443a aVar) {
        if (!C13080a.m20762b(this)) {
            try {
                mo46129j();
                Context b = C13418j.m21106b();
                ApplicationInfo applicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null && applicationInfo.metaData.containsKey(aVar.f29460d)) {
                    aVar.f29457a = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.f29460d, aVar.f29459c));
                }
            } catch (PackageManager.NameNotFoundException e) {
                C12869i0.m20550F(f29447a, e);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:34|35|36|(2:38|39)(1:42)|(11:44|45|46|47|(5:49|50|(1:52)(1:53)|54|55)|58|59|(1:61)(1:62)|(2:64|(1:75))|66|76)|56|58|59|(0)(0)|(0)|66|76) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00ca */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ed A[Catch:{ all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ef A[Catch:{ all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2 A[Catch:{ all -> 0x0109 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46126g() {
        /*
            r16 = this;
            java.lang.String r0 = "previous"
            java.lang.String r1 = "com.facebook.sdk.USER_SETTINGS_BITMASK"
            boolean r2 = p401mg.C13080a.m20762b(r16)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicBoolean r2 = f29448b     // Catch:{ all -> 0x0109 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x0109 }
            if (r2 != 0) goto L_0x0014
            return
        L_0x0014:
            boolean r2 = p453tf.C13418j.m21113i()     // Catch:{ all -> 0x0109 }
            if (r2 != 0) goto L_0x001b
            return
        L_0x001b:
            android.content.Context r2 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x0109 }
            tf.y$a r3 = f29450d     // Catch:{ all -> 0x0109 }
            boolean r3 = r3.mo46131a()     // Catch:{ all -> 0x0109 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002b
            r3 = r4
            goto L_0x002c
        L_0x002b:
            r3 = r5
        L_0x002c:
            int r3 = r3 << r5
            r3 = r3 | r5
            tf.y$a r6 = f29451e     // Catch:{ all -> 0x0109 }
            boolean r6 = r6.mo46131a()     // Catch:{ all -> 0x0109 }
            if (r6 == 0) goto L_0x0038
            r6 = r4
            goto L_0x0039
        L_0x0038:
            r6 = r5
        L_0x0039:
            int r6 = r6 << r4
            r3 = r3 | r6
            tf.y$a r6 = f29452f     // Catch:{ all -> 0x0109 }
            boolean r6 = r6.mo46131a()     // Catch:{ all -> 0x0109 }
            if (r6 == 0) goto L_0x0045
            r6 = r4
            goto L_0x0046
        L_0x0045:
            r6 = r5
        L_0x0046:
            r7 = 2
            int r6 = r6 << r7
            r3 = r3 | r6
            tf.y$a r6 = f29454h     // Catch:{ all -> 0x0109 }
            boolean r6 = r6.mo46131a()     // Catch:{ all -> 0x0109 }
            if (r6 == 0) goto L_0x0053
            r6 = r4
            goto L_0x0054
        L_0x0053:
            r6 = r5
        L_0x0054:
            r8 = 3
            int r6 = r6 << r8
            r3 = r3 | r6
            android.content.SharedPreferences r6 = f29455i     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = "userSettingPref"
            r10 = 0
            if (r6 == 0) goto L_0x0105
            int r6 = r6.getInt(r1, r5)     // Catch:{ all -> 0x0109 }
            if (r6 == r3) goto L_0x0104
            android.content.SharedPreferences r11 = f29455i     // Catch:{ all -> 0x0109 }
            if (r11 == 0) goto L_0x0100
            android.content.SharedPreferences$Editor r9 = r11.edit()     // Catch:{ all -> 0x0109 }
            android.content.SharedPreferences$Editor r1 = r9.putInt(r1, r3)     // Catch:{ all -> 0x0109 }
            r1.apply()     // Catch:{ all -> 0x0109 }
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c8 }
            java.lang.String r9 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c8 }
            r11 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r9, r11)     // Catch:{ NameNotFoundException -> 0x00c8 }
            if (r1 == 0) goto L_0x0089
            android.os.Bundle r9 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r13 = r5
            r14 = r13
            goto L_0x00ca
        L_0x0089:
            r9 = r10
        L_0x008a:
            if (r9 == 0) goto L_0x00c8
            java.lang.String r9 = "com.facebook.sdk.AutoInitEnabled"
            java.lang.String r11 = "com.facebook.sdk.AutoLogAppEventsEnabled"
            java.lang.String r12 = "com.facebook.sdk.AdvertiserIDCollectionEnabled"
            java.lang.String r13 = "com.facebook.sdk.MonitorEnabled"
            java.lang.String[] r9 = new java.lang.String[]{r9, r11, r12, r13}     // Catch:{ NameNotFoundException -> 0x00c8 }
            r11 = 4
            boolean[] r12 = new boolean[r11]     // Catch:{ NameNotFoundException -> 0x00c8 }
            r12[r5] = r4     // Catch:{ NameNotFoundException -> 0x00c8 }
            r12[r4] = r4     // Catch:{ NameNotFoundException -> 0x00c8 }
            r12[r7] = r4     // Catch:{ NameNotFoundException -> 0x00c8 }
            r12[r8] = r4     // Catch:{ NameNotFoundException -> 0x00c8 }
            r8 = r5
            r13 = r8
            r14 = r13
        L_0x00a6:
            if (r8 >= r11) goto L_0x00ca
            android.os.Bundle r15 = r1.metaData     // Catch:{ NameNotFoundException -> 0x00ca }
            r4 = r9[r8]     // Catch:{ NameNotFoundException -> 0x00ca }
            boolean r4 = r15.containsKey(r4)     // Catch:{ NameNotFoundException -> 0x00ca }
            if (r4 == 0) goto L_0x00b4
            r4 = 1
            goto L_0x00b5
        L_0x00b4:
            r4 = r5
        L_0x00b5:
            int r4 = r4 << r8
            r13 = r13 | r4
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x00ca }
            r15 = r9[r8]     // Catch:{ NameNotFoundException -> 0x00ca }
            boolean r5 = r12[r8]     // Catch:{ NameNotFoundException -> 0x00ca }
            boolean r4 = r4.getBoolean(r15, r5)     // Catch:{ NameNotFoundException -> 0x00ca }
            int r4 = r4 << r8
            r14 = r14 | r4
            int r8 = r8 + 1
            r4 = 1
            r5 = 0
            goto L_0x00a6
        L_0x00c8:
            r13 = 0
            r14 = 0
        L_0x00ca:
            uf.h r1 = new uf.h     // Catch:{ all -> 0x0109 }
            r1.<init>((android.content.Context) r2, (java.lang.String) r10)     // Catch:{ all -> 0x0109 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0109 }
            r2.<init>()     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = "usage"
            r2.putInt(r4, r13)     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = "initial"
            r2.putInt(r4, r14)     // Catch:{ all -> 0x0109 }
            r2.putInt(r0, r6)     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = "current"
            r2.putInt(r4, r3)     // Catch:{ all -> 0x0109 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0109 }
            r0 = r0 & r7
            if (r0 == 0) goto L_0x00ef
            r4 = 1
            goto L_0x00f0
        L_0x00ef:
            r4 = 0
        L_0x00f0:
            if (r4 != 0) goto L_0x00fa
            java.lang.String r0 = p453tf.C13418j.f29381a     // Catch:{ all -> 0x0109 }
            boolean r0 = m21140c()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x0104
        L_0x00fa:
            java.lang.String r0 = "fb_sdk_settings_changed"
            r1.mo46170f(r0, r2)     // Catch:{ all -> 0x0109 }
            goto L_0x0104
        L_0x0100:
            kotlin.jvm.internal.C19383o.m32805o(r9)     // Catch:{ all -> 0x0109 }
            throw r10     // Catch:{ all -> 0x0109 }
        L_0x0104:
            return
        L_0x0105:
            kotlin.jvm.internal.C19383o.m32805o(r9)     // Catch:{ all -> 0x0109 }
            throw r10     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            r1 = r16
            p401mg.C13080a.m20761a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p453tf.C13442y.mo46126g():void");
    }

    /* renamed from: h */
    public final void mo46127h() {
        if (!C13080a.m20762b(this)) {
            try {
                Context b = C13418j.m21106b();
                ApplicationInfo applicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                    if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                        Log.w(f29447a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w(f29447a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!m21139b()) {
                        Log.w(f29447a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: i */
    public final void mo46128i(C13443a aVar) {
        String str = "";
        if (!C13080a.m20762b(this)) {
            try {
                mo46129j();
                SharedPreferences sharedPreferences = f29455i;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(aVar.f29460d, str);
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        aVar.f29457a = Boolean.valueOf(jSONObject.getBoolean("value"));
                        aVar.f29458b = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                C19383o.m32805o("userSettingPref");
                throw null;
            } catch (JSONException e) {
                C12869i0.m20550F(f29447a, e);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: j */
    public final void mo46129j() {
        if (!C13080a.m20762b(this)) {
            try {
                if (!f29448b.get()) {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: k */
    public final void mo46130k(C13443a aVar) {
        if (!C13080a.m20762b(this)) {
            try {
                mo46129j();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.f29457a);
                jSONObject.put("last_timestamp", aVar.f29458b);
                SharedPreferences sharedPreferences = f29455i;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(aVar.f29460d, jSONObject.toString()).apply();
                    mo46126g();
                    return;
                }
                C19383o.m32805o("userSettingPref");
                throw null;
            } catch (Exception e) {
                C12869i0.m20550F(f29447a, e);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
