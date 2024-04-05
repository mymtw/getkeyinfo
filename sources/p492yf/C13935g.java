package p492yf;

import com.facebook.internal.FeatureManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: yf.g */
public final class C13935g {

    /* renamed from: a */
    public static final AtomicBoolean f30642a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final C13935g f30643b = new C13935g();

    /* renamed from: a */
    public static final void m21461a() {
        Class<C13935g> cls = C13935g.class;
        if (!C13080a.m20762b(cls)) {
            try {
                if (!f30642a.get()) {
                    return;
                }
                if (!f30643b.mo46759b() || !FeatureManager.m20100c(FeatureManager.Feature.IapLoggingLib2)) {
                    C13922a.m21430b();
                } else {
                    C13923b.m21432b(C13418j.m21106b());
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r0 = r0.metaData.getString("com.google.android.play.billingclient.version");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46759b() {
        /*
            r5 = this;
            boolean r0 = p401mg.C13080a.m20762b(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = p453tf.C13418j.m21106b()     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r3)     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            if (r0 == 0) goto L_0x0045
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            java.lang.String r2 = "com.google.android.play.billingclient.version"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            if (r0 != 0) goto L_0x0027
            return r1
        L_0x0027:
            java.lang.String r2 = "."
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            r3 = 3
            r4 = 2
            java.util.List r0 = kotlin.text.C19459m.m33056y1(r0, r2, r3, r4)     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0045, all -> 0x0041 }
            if (r0 < r4) goto L_0x0040
            r1 = 1
        L_0x0040:
            return r1
        L_0x0041:
            r0 = move-exception
            p401mg.C13080a.m20761a(r5, r0)
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p492yf.C13935g.mo46759b():boolean");
    }
}
