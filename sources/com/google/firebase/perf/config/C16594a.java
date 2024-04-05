package com.google.firebase.perf.config;

import com.google.firebase.perf.util.C16626b;
import com.google.firebase.perf.util.C16627c;
import com.google.protobuf.C16910l;
import java.util.concurrent.Executors;
import p552dn.C17696a;
import p568fn.C17781a;

/* renamed from: com.google.firebase.perf.config.a */
public final class C16594a {

    /* renamed from: d */
    public static final C17781a f36827d = C17781a.m29823d();

    /* renamed from: e */
    public static volatile C16594a f36828e;

    /* renamed from: a */
    public final RemoteConfigManager f36829a = RemoteConfigManager.getInstance();

    /* renamed from: b */
    public C16626b f36830b = new C16626b();

    /* renamed from: c */
    public C16612s f36831c;

    public C16594a() {
        C16612s sVar;
        C17781a aVar = C16612s.f36849c;
        synchronized (C16612s.class) {
            if (C16612s.f36850d == null) {
                C16612s.f36850d = new C16612s(Executors.newSingleThreadExecutor());
            }
            sVar = C16612s.f36850d;
        }
        this.f36831c = sVar;
    }

    /* renamed from: e */
    public static synchronized C16594a m27423e() {
        C16594a aVar;
        synchronized (C16594a.class) {
            if (f36828e == null) {
                f36828e = new C16594a();
            }
            aVar = f36828e;
        }
        return aVar;
    }

    /* renamed from: l */
    public static boolean m27424l(long j) {
        return j >= 0;
    }

    /* renamed from: m */
    public static boolean m27425m(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            String trim2 = trim.trim();
            Boolean bool = C17696a.f38491a;
            if (trim2.equals("20.0.4")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m27426n(long j) {
        return j >= 0;
    }

    /* renamed from: p */
    public static boolean m27427p(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    /* renamed from: a */
    public final C16627c<Boolean> mo59248a(C16910l lVar) {
        C16612s sVar = this.f36831c;
        String e = lVar.mo59236e();
        if (e == null) {
            sVar.getClass();
            C16612s.f36849c.mo69014a("Key is null when getting boolean value on device cache.");
            return new C16627c<>();
        }
        if (sVar.f36851a == null) {
            sVar.mo59260b(C16612s.m27478a());
            if (sVar.f36851a == null) {
                return new C16627c<>();
            }
        }
        if (!sVar.f36851a.contains(e)) {
            return new C16627c<>();
        }
        try {
            return new C16627c<>(Boolean.valueOf(sVar.f36851a.getBoolean(e, false)));
        } catch (ClassCastException e2) {
            C16612s.f36849c.mo69015b("Key %s from sharedPreferences has type other than long: %s", e, e2.getMessage());
            return new C16627c<>();
        }
    }

    /* renamed from: b */
    public final C16627c<Float> mo59249b(C16910l lVar) {
        C16612s sVar = this.f36831c;
        String e = lVar.mo59236e();
        if (e == null) {
            sVar.getClass();
            C16612s.f36849c.mo69014a("Key is null when getting float value on device cache.");
            return new C16627c<>();
        }
        if (sVar.f36851a == null) {
            sVar.mo59260b(C16612s.m27478a());
            if (sVar.f36851a == null) {
                return new C16627c<>();
            }
        }
        if (!sVar.f36851a.contains(e)) {
            return new C16627c<>();
        }
        try {
            return new C16627c<>(Float.valueOf(sVar.f36851a.getFloat(e, 0.0f)));
        } catch (ClassCastException e2) {
            C16612s.f36849c.mo69015b("Key %s from sharedPreferences has type other than float: %s", e, e2.getMessage());
            return new C16627c<>();
        }
    }

    /* renamed from: c */
    public final C16627c<Long> mo59250c(C16910l lVar) {
        C16612s sVar = this.f36831c;
        String e = lVar.mo59236e();
        if (e == null) {
            sVar.getClass();
            C16612s.f36849c.mo69014a("Key is null when getting long value on device cache.");
            return new C16627c<>();
        }
        if (sVar.f36851a == null) {
            sVar.mo59260b(C16612s.m27478a());
            if (sVar.f36851a == null) {
                return new C16627c<>();
            }
        }
        if (!sVar.f36851a.contains(e)) {
            return new C16627c<>();
        }
        try {
            return new C16627c<>(Long.valueOf(sVar.f36851a.getLong(e, 0)));
        } catch (ClassCastException e2) {
            C16612s.f36849c.mo69015b("Key %s from sharedPreferences has type other than long: %s", e, e2.getMessage());
            return new C16627c<>();
        }
    }

    /* renamed from: d */
    public final C16627c<String> mo59251d(C16910l lVar) {
        C16612s sVar = this.f36831c;
        String e = lVar.mo59236e();
        if (e == null) {
            sVar.getClass();
            C16612s.f36849c.mo69014a("Key is null when getting String value on device cache.");
            return new C16627c<>();
        }
        if (sVar.f36851a == null) {
            sVar.mo59260b(C16612s.m27478a());
            if (sVar.f36851a == null) {
                return new C16627c<>();
            }
        }
        if (!sVar.f36851a.contains(e)) {
            return new C16627c<>();
        }
        try {
            return new C16627c<>(sVar.f36851a.getString(e, ""));
        } catch (ClassCastException e2) {
            C16612s.f36849c.mo69015b("Key %s from sharedPreferences has type other than String: %s", e, e2.getMessage());
            return new C16627c<>();
        }
    }

    /* renamed from: f */
    public final Boolean mo59252f() {
        C16595b bVar;
        synchronized (C16595b.class) {
            if (C16595b.f36832e == null) {
                C16595b.f36832e = new C16595b();
            }
            bVar = C16595b.f36832e;
        }
        C16627c<Boolean> h = mo59254h(bVar);
        return h.mo59369b() ? h.mo59368a() : Boolean.FALSE;
    }

    /* renamed from: g */
    public final Boolean mo59253g() {
        C16596c cVar;
        if (mo59252f().booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (C16596c.class) {
            if (C16596c.f36833e == null) {
                C16596c.f36833e = new C16596c();
            }
            cVar = C16596c.f36833e;
        }
        C16627c<Boolean> a = mo59248a(cVar);
        if (a.mo59369b()) {
            return a.mo59368a();
        }
        C16627c<Boolean> h = mo59254h(cVar);
        if (h.mo59369b()) {
            return h.mo59368a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.perf.util.C16627c<java.lang.Boolean> mo59254h(com.google.protobuf.C16910l r6) {
        /*
            r5 = this;
            com.google.firebase.perf.util.b r0 = r5.f36830b
            java.lang.String r6 = r6.mo59259f()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f36856a
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = r2
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            com.google.firebase.perf.util.c r6 = new com.google.firebase.perf.util.c
            r6.<init>()
            goto L_0x0050
        L_0x0020:
            android.os.Bundle r0 = r0.f36856a     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x0038 }
            if (r0 != 0) goto L_0x0031
            com.google.firebase.perf.util.c r0 = new com.google.firebase.perf.util.c     // Catch:{ ClassCastException -> 0x0038 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r0
            goto L_0x0050
        L_0x0031:
            com.google.firebase.perf.util.c r3 = new com.google.firebase.perf.util.c     // Catch:{ ClassCastException -> 0x0038 }
            r3.<init>(r0)     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r3
            goto L_0x0050
        L_0x0038:
            r0 = move-exception
            fn.a r3 = com.google.firebase.perf.util.C16626b.f36855b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.String r6 = r0.getMessage()
            r4[r1] = r6
            java.lang.String r6 = "Metadata key %s contains type other than boolean: %s"
            r3.mo69015b(r6, r4)
            com.google.firebase.perf.util.c r6 = new com.google.firebase.perf.util.c
            r6.<init>()
        L_0x0050:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.C16594a.mo59254h(com.google.protobuf.l):com.google.firebase.perf.util.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.perf.util.C16627c<java.lang.Long> mo59255i(com.google.protobuf.C16910l r6) {
        /*
            r5 = this;
            com.google.firebase.perf.util.b r0 = r5.f36830b
            java.lang.String r6 = r6.mo59259f()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f36856a
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = r2
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            com.google.firebase.perf.util.c r6 = new com.google.firebase.perf.util.c
            r6.<init>()
            goto L_0x0050
        L_0x0020:
            android.os.Bundle r0 = r0.f36856a     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ ClassCastException -> 0x0038 }
            if (r0 != 0) goto L_0x0031
            com.google.firebase.perf.util.c r0 = new com.google.firebase.perf.util.c     // Catch:{ ClassCastException -> 0x0038 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r0
            goto L_0x0050
        L_0x0031:
            com.google.firebase.perf.util.c r3 = new com.google.firebase.perf.util.c     // Catch:{ ClassCastException -> 0x0038 }
            r3.<init>(r0)     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r3
            goto L_0x0050
        L_0x0038:
            r0 = move-exception
            fn.a r3 = com.google.firebase.perf.util.C16626b.f36855b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.String r6 = r0.getMessage()
            r4[r1] = r6
            java.lang.String r6 = "Metadata key %s contains type other than int: %s"
            r3.mo69015b(r6, r4)
            com.google.firebase.perf.util.c r6 = new com.google.firebase.perf.util.c
            r6.<init>()
        L_0x0050:
            boolean r0 = r6.mo59369b()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r6 = r6.mo59368a()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            long r0 = (long) r6
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            com.google.firebase.perf.util.c r0 = new com.google.firebase.perf.util.c
            r0.<init>(r6)
            goto L_0x0070
        L_0x006b:
            com.google.firebase.perf.util.c r0 = new com.google.firebase.perf.util.c
            r0.<init>()
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.C16594a.mo59255i(com.google.protobuf.l):com.google.firebase.perf.util.c");
    }

    /* renamed from: j */
    public final long mo59256j() {
        C16600g gVar;
        synchronized (C16600g.class) {
            if (C16600g.f36837e == null) {
                C16600g.f36837e = new C16600g();
            }
            gVar = C16600g.f36837e;
        }
        C16627c<Long> k = mo59257k(gVar);
        boolean z = true;
        if (k.mo59369b()) {
            if (k.mo59368a().longValue() > 0) {
                this.f36831c.mo59261c(k.mo59368a().longValue(), "com.google.firebase.perf.TimeLimitSec");
                return k.mo59368a().longValue();
            }
        }
        C16627c<Long> c = mo59250c(gVar);
        if (c.mo59369b()) {
            if (c.mo59368a().longValue() <= 0) {
                z = false;
            }
            if (z) {
                return c.mo59368a().longValue();
            }
        }
        Long l = 600L;
        return l.longValue();
    }

    /* renamed from: k */
    public final C16627c<Long> mo59257k(C16910l lVar) {
        return this.f36829a.getLong(lVar.mo59237h());
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59258o() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.mo59253g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto L_0x00ce
        L_0x000e:
            java.lang.Class<com.google.firebase.perf.config.i> r0 = com.google.firebase.perf.config.C16602i.class
            monitor-enter(r0)
            com.google.firebase.perf.config.i r3 = com.google.firebase.perf.config.C16602i.f36839e     // Catch:{ all -> 0x00cf }
            if (r3 != 0) goto L_0x001c
            com.google.firebase.perf.config.i r3 = new com.google.firebase.perf.config.i     // Catch:{ all -> 0x00cf }
            r3.<init>()     // Catch:{ all -> 0x00cf }
            com.google.firebase.perf.config.C16602i.f36839e = r3     // Catch:{ all -> 0x00cf }
        L_0x001c:
            com.google.firebase.perf.config.i r3 = com.google.firebase.perf.config.C16602i.f36839e     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f36829a
            r3.getClass()
            java.lang.String r4 = "fpr_enabled"
            com.google.firebase.perf.util.c r0 = r0.getBoolean(r4)
            boolean r4 = r0.mo59369b()
            if (r4 == 0) goto L_0x0056
            com.google.firebase.perf.config.RemoteConfigManager r3 = r6.f36829a
            boolean r3 = r3.isLastFetchFailed()
            if (r3 == 0) goto L_0x003a
            r0 = r1
            goto L_0x006c
        L_0x003a:
            com.google.firebase.perf.config.s r3 = r6.f36831c
            java.lang.String r4 = "com.google.firebase.perf.SdkEnabled"
            java.lang.Object r5 = r0.mo59368a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r3.mo59264f(r4, r5)
            java.lang.Object r0 = r0.mo59368a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x006c
        L_0x0056:
            com.google.firebase.perf.util.c r0 = r6.mo59248a(r3)
            boolean r3 = r0.mo59369b()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r0 = r0.mo59368a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            if (r0 == 0) goto L_0x00ca
            java.lang.Class<com.google.firebase.perf.config.h> r0 = com.google.firebase.perf.config.C16601h.class
            monitor-enter(r0)
            com.google.firebase.perf.config.h r3 = com.google.firebase.perf.config.C16601h.f36838e     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x007c
            com.google.firebase.perf.config.h r3 = new com.google.firebase.perf.config.h     // Catch:{ all -> 0x00c7 }
            r3.<init>()     // Catch:{ all -> 0x00c7 }
            com.google.firebase.perf.config.C16601h.f36838e = r3     // Catch:{ all -> 0x00c7 }
        L_0x007c:
            com.google.firebase.perf.config.h r3 = com.google.firebase.perf.config.C16601h.f36838e     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f36829a
            r3.getClass()
            java.lang.String r4 = "fpr_disabled_android_versions"
            com.google.firebase.perf.util.c r0 = r0.getString(r4)
            boolean r4 = r0.mo59369b()
            if (r4 == 0) goto L_0x00a8
            com.google.firebase.perf.config.s r3 = r6.f36831c
            java.lang.String r4 = "com.google.firebase.perf.SdkDisabledVersions"
            java.lang.Object r5 = r0.mo59368a()
            java.lang.String r5 = (java.lang.String) r5
            r3.mo59263e(r4, r5)
            java.lang.Object r0 = r0.mo59368a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m27425m(r0)
            goto L_0x00c3
        L_0x00a8:
            com.google.firebase.perf.util.c r0 = r6.mo59251d(r3)
            boolean r3 = r0.mo59369b()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r0 = r0.mo59368a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m27425m(r0)
            goto L_0x00c3
        L_0x00bd:
            java.lang.String r0 = ""
            boolean r0 = m27425m(r0)
        L_0x00c3:
            if (r0 != 0) goto L_0x00ca
            r0 = r2
            goto L_0x00cb
        L_0x00c7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00ca:
            r0 = r1
        L_0x00cb:
            if (r0 == 0) goto L_0x00ce
            r1 = r2
        L_0x00ce:
            return r1
        L_0x00cf:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.C16594a.mo59258o():boolean");
    }
}
