package p409o9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.install.InstallPersistence;
import com.etsy.android.lib.logger.C8694h;
import p003a2.C0023f;
import p425q9.C13273w;

/* renamed from: o9.q */
public final class C13138q {

    /* renamed from: h */
    public static C13138q f28894h;

    /* renamed from: a */
    public String f28895a;

    /* renamed from: b */
    public String f28896b;

    /* renamed from: c */
    public String f28897c;

    /* renamed from: d */
    public String f28898d = "";

    /* renamed from: e */
    public Boolean f28899e = Boolean.FALSE;

    /* renamed from: f */
    public int f28900f;

    /* renamed from: g */
    public boolean f28901g;

    /* renamed from: o9.q$a */
    public static class C13139a implements Runnable {

        /* renamed from: b */
        public Context f28902b;

        /* renamed from: c */
        public C13138q f28903c;

        public C13139a(Context context, C13138q qVar) {
            this.f28902b = context;
            this.f28903c = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                android.content.Context r2 = r6.f28902b     // Catch:{ IOException -> 0x0048, GooglePlayServicesRepairableException -> 0x0033, GooglePlayServicesNotAvailableException -> 0x001e, SecurityException -> 0x0009 }
                com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2)     // Catch:{ IOException -> 0x0048, GooglePlayServicesRepairableException -> 0x0033, GooglePlayServicesNotAvailableException -> 0x001e, SecurityException -> 0x0009 }
                goto L_0x005d
            L_0x0009:
                r2 = move-exception
                com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a
                java.lang.Object[] r4 = new java.lang.Object[r1]
                java.lang.String r2 = r2.toString()
                r4[r0] = r2
                java.lang.String r2 = "Security issue, most likey due to out of date GooglePlayServices %s"
                java.lang.String r2 = java.lang.String.format(r2, r4)
                r3.mo21306a(r2)
                goto L_0x005c
            L_0x001e:
                r2 = move-exception
                com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a
                java.lang.Object[] r4 = new java.lang.Object[r1]
                java.lang.String r2 = r2.toString()
                r4[r0] = r2
                java.lang.String r2 = "GooglePlayServicesNotAvailableException %s"
                java.lang.String r2 = java.lang.String.format(r2, r4)
                r3.mo21306a(r2)
                goto L_0x005c
            L_0x0033:
                r2 = move-exception
                com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a
                java.lang.Object[] r4 = new java.lang.Object[r1]
                java.lang.String r2 = r2.toString()
                r4[r0] = r2
                java.lang.String r2 = "GooglePlayServicesRepairableException %s"
                java.lang.String r2 = java.lang.String.format(r2, r4)
                r3.mo21306a(r2)
                goto L_0x005c
            L_0x0048:
                r2 = move-exception
                com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a
                java.lang.Object[] r4 = new java.lang.Object[r1]
                java.lang.String r2 = r2.toString()
                r4[r0] = r2
                java.lang.String r2 = "ioException %s"
                java.lang.String r2 = java.lang.String.format(r2, r4)
                r3.mo21306a(r2)
            L_0x005c:
                r2 = 0
            L_0x005d:
                if (r2 == 0) goto L_0x0087
                com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a
                java.lang.Object[] r4 = new java.lang.Object[r1]
                java.lang.String r5 = r2.getId()
                r4[r0] = r5
                java.lang.String r0 = "Got advertising id! %s"
                java.lang.String r0 = java.lang.String.format(r0, r4)
                r3.mo21306a(r0)
                o9.q r0 = r6.f28903c
                java.lang.String r3 = r2.getId()
                r0.f28898d = r3
                o9.q r0 = r6.f28903c
                boolean r2 = r2.isLimitAdTrackingEnabled()
                r1 = r1 ^ r2
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.f28899e = r1
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p409o9.C13138q.C13139a.run():void");
        }
    }

    public C13138q(Context context) {
        boolean z = true;
        this.f28901g = true;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f28896b = packageInfo.versionName;
            this.f28897c = packageInfo.packageName;
            this.f28900f = packageInfo.versionCode;
            if (context.getResources().getBoolean(R.bool.width_600) || context.getResources().getConfiguration().orientation != 1) {
                if (context.getResources().getBoolean(R.bool.width_720) || context.getResources().getConfiguration().orientation != 2) {
                    z = false;
                }
            }
            this.f28901g = z;
        } catch (PackageManager.NameNotFoundException e) {
            C8694h.f19097a.mo21309d("Error fetching version: ", e);
        }
        this.f28895a = new InstallPersistence(context).mo21280a();
        new Thread(new C13273w(new C13139a(context, this), 0)).start();
    }

    /* renamed from: a */
    public static C13138q m20808a() {
        C13138q qVar = f28894h;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("InstallInfo must be created via createInstance before getInstance can be called");
    }

    /* renamed from: b */
    public final String mo45852b(String str) {
        String k = C0023f.m110k(C0072d.m201h(" EtsyInc/"), this.f28896b, " Android/1");
        if (this.f28901g) {
            k = C0326j.m864i(" Mobile/1", k);
        }
        return C0326j.m864i(str, k);
    }
}
