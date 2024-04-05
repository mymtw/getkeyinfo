package p453tf;

import java.util.concurrent.Callable;

/* renamed from: tf.n */
public final class C13424n<V> implements Callable {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[SYNTHETIC, Splitter:B:14:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8 A[SYNTHETIC, Splitter:B:32:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f A[SYNTHETIC, Splitter:B:51:0x010f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            tf.c$a r0 = p453tf.C13401c.f29349g
            tf.c r0 = r0.mo46082a()
            tf.b r1 = r0.f29354e
            android.content.SharedPreferences r2 = r1.f29347a
            java.lang.String r3 = "com.facebook.AccessTokenManager.CachedAccessToken"
            boolean r2 = r2.contains(r3)
            r4 = 0
            if (r2 == 0) goto L_0x002a
            android.content.SharedPreferences r1 = r1.f29347a
            java.lang.String r1 = r1.getString(r3, r4)
            if (r1 == 0) goto L_0x002c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002c }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x002c }
            com.facebook.AccessToken$c r1 = com.facebook.AccessToken.Companion     // Catch:{ JSONException -> 0x002c }
            r1.getClass()     // Catch:{ JSONException -> 0x002c }
            com.facebook.AccessToken r1 = com.facebook.AccessToken.C12174c.m19979b(r2)     // Catch:{ JSONException -> 0x002c }
            goto L_0x002d
        L_0x002a:
            java.lang.String r1 = p453tf.C13418j.f29381a
        L_0x002c:
            r1 = r4
        L_0x002d:
            r2 = 0
            if (r1 == 0) goto L_0x0033
            r0.mo46081d(r1, r2)
        L_0x0033:
            tf.s$a r0 = p453tf.C13432s.f29418e
            tf.s r0 = r0.mo46107a()
            tf.r r1 = r0.f29421c
            android.content.SharedPreferences r1 = r1.f29416a
            java.lang.String r3 = "com.facebook.ProfileManager.CachedProfile"
            java.lang.String r1 = r1.getString(r3, r4)
            if (r1 == 0) goto L_0x0050
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0050 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0050 }
            com.facebook.Profile r1 = new com.facebook.Profile     // Catch:{ JSONException -> 0x0050 }
            r1.<init>((org.json.JSONObject) r3)     // Catch:{ JSONException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            if (r1 == 0) goto L_0x0056
            r0.mo46106a(r1, r2)
        L_0x0056:
            com.facebook.AccessToken$c r0 = com.facebook.AccessToken.Companion
            r0.getClass()
            boolean r0 = com.facebook.AccessToken.C12174c.m19983f()
            if (r0 == 0) goto L_0x0073
            com.facebook.Profile$a r0 = com.facebook.Profile.Companion
            r0.getClass()
            tf.s$a r0 = p453tf.C13432s.f29418e
            tf.s r0 = r0.mo46107a()
            com.facebook.Profile r0 = r0.f29419a
            if (r0 != 0) goto L_0x0073
            com.facebook.Profile.C12204a.m20030a()
        L_0x0073:
            android.content.Context r0 = p453tf.C13418j.m21106b()
            java.lang.String r1 = p453tf.C13418j.f29384d
            java.lang.String r3 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            uf.h$a r3 = p461uf.C13511h.f29567i
            r3.getClass()
            boolean r3 = p453tf.C13442y.m21140c()
            if (r3 != 0) goto L_0x008a
            goto L_0x009d
        L_0x008a:
            uf.h r3 = new uf.h
            r3.<init>((android.content.Context) r0, (java.lang.String) r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = p461uf.C13511h.m21277b()
            if (r1 == 0) goto L_0x011a
            uf.i r5 = new uf.i
            r5.<init>(r0, r3)
            r1.execute(r5)
        L_0x009d:
            java.lang.String r0 = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest"
            java.lang.Class<tf.y> r1 = p453tf.C13442y.class
            boolean r3 = p401mg.C13080a.m20762b(r1)
            if (r3 == 0) goto L_0x00a8
            goto L_0x00f6
        L_0x00a8:
            android.content.Context r3 = p453tf.C13418j.m21106b()     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            java.lang.String r6 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            if (r5 == 0) goto L_0x00bf
            android.os.Bundle r6 = r5.metaData     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            goto L_0x00c0
        L_0x00bf:
            r6 = r4
        L_0x00c0:
            if (r6 == 0) goto L_0x00f6
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            java.lang.String r6 = "com.facebook.sdk.AutoAppLinkEnabled"
            boolean r2 = r5.getBoolean(r6, r2)     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            if (r2 == 0) goto L_0x00f6
            uf.h r2 = new uf.h     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            r2.<init>((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            boolean r5 = p365hg.C12869i0.m20585x()     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            if (r5 != 0) goto L_0x00e6
            java.lang.String r5 = "SchemeWarning"
            r3.putString(r5, r0)     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            java.lang.String r5 = p453tf.C13442y.f29447a     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            android.util.Log.w(r5, r0)     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
        L_0x00e6:
            java.lang.String r0 = "fb_auto_applink"
            boolean r5 = p453tf.C13442y.m21140c()     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            if (r5 == 0) goto L_0x00f6
            r2.mo46168d(r3, r0)     // Catch:{ NameNotFoundException -> 0x00f6, all -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            p401mg.C13080a.m20761a(r1, r0)
        L_0x00f6:
            android.content.Context r0 = p453tf.C13418j.m21106b()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "getApplicationContext().applicationContext"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            uf.h r1 = new uf.h
            r1.<init>((android.content.Context) r0, (java.lang.String) r4)
            boolean r0 = p401mg.C13080a.m20762b(r1)
            if (r0 == 0) goto L_0x010f
            goto L_0x0119
        L_0x010f:
            com.facebook.appevents.FlushReason r0 = com.facebook.appevents.FlushReason.EXPLICIT     // Catch:{ all -> 0x0115 }
            p461uf.C13503d.m21268d(r0)     // Catch:{ all -> 0x0115 }
            goto L_0x0119
        L_0x0115:
            r0 = move-exception
            p401mg.C13080a.m20761a(r1, r0)
        L_0x0119:
            return r4
        L_0x011a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p453tf.C13424n.call():java.lang.Object");
    }
}
