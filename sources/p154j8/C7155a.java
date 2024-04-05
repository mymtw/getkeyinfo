package p154j8;

import android.content.Context;
import android.content.pm.PackageManager;
import com.cardinalcommerce.shared.p065cs.utils.CCInitProvider;
import java.util.UUID;
import p257u8.C8177f;

/* renamed from: j8.a */
public final class C7155a {

    /* renamed from: a */
    public String f15921a;

    public C7155a() {
        Context a = CCInitProvider.m12770a();
        C8177f a2 = C8177f.m16444a(a);
        this.f15921a = a2.mo20810e("SDKAppID", (String) null);
        long d = a2.mo20809d();
        try {
            long j = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).lastUpdateTime;
            String str = this.f15921a;
            if (str == null || d == 0 || d != j) {
                str = UUID.randomUUID().toString();
                a2.mo20808c("SDKAppID", str);
                a2.mo20807b(j);
            }
            this.f15921a = str;
        } catch (PackageManager.NameNotFoundException e) {
            String.valueOf(11318);
            e.getLocalizedMessage();
            throw null;
        }
    }
}
