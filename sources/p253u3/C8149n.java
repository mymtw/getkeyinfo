package p253u3;

import android.util.Log;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeSdk;
import p306z8.C8476c;

/* renamed from: u3.n */
public final class C8149n {

    /* renamed from: c */
    public static C8149n f17874c = new C8149n();

    /* renamed from: a */
    public volatile boolean f17875a = true;

    /* renamed from: b */
    public C8476c f17876b = null;

    /* renamed from: a */
    public final void mo20765a(String str, String str2) {
        if (this.f17875a) {
            C8476c cVar = this.f17876b;
            if (cVar != null) {
                AmplitudeSdk.m35237initialize$lambda2$lambda0((AmplitudeSdk) cVar.f18501b, str, str2);
            }
            Log.e(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo20766b(String str, String str2, Throwable th) {
        if (this.f17875a) {
            C8476c cVar = this.f17876b;
            if (cVar != null) {
                AmplitudeSdk.m35237initialize$lambda2$lambda0((AmplitudeSdk) cVar.f18501b, str, str2);
            }
            Log.e(str, str2, th);
        }
    }

    /* renamed from: c */
    public final void mo20767c(String str, String str2) {
        if (this.f17875a) {
            Log.w(str, str2);
        }
    }
}
