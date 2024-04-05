package p145io.branch.referral;

import android.content.Context;
import android.os.RemoteException;
import android.support.p013v4.media.C0072d;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.branch.referral.e0 */
public final class C7035e0 implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InstallReferrerClient f15651a;

    public C7035e0(InstallReferrerClient installReferrerClient, Context context) {
        this.f15651a = installReferrerClient;
    }

    public final void onInstallReferrerServiceDisconnected() {
        C7077r.m13675a("onInstallReferrerServiceDisconnected()");
    }

    public final void onInstallReferrerSetupFinished(int i) {
        C7077r.m13675a("Google Play onInstallReferrerSetupFinished, responseCode = " + i);
        if (i != -1) {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = this.f15651a.getInstallReferrer();
                    if (installReferrer != null) {
                        C7039g0.f15661h = installReferrer.getInstallReferrer();
                        C7039g0.f15659f = Long.valueOf(installReferrer.getReferrerClickTimestampSeconds());
                        C7039g0.f15660g = Long.valueOf(installReferrer.getInstallBeginTimestampSeconds());
                    }
                    this.f15651a.endConnection();
                    C7039g0.m13636u0(C7039g0.f15661h, C7039g0.f15659f.longValue(), C7039g0.f15660g.longValue(), this.f15651a.getClass().getName());
                    return;
                } catch (RemoteException e) {
                    StringBuilder h = C0072d.m201h("onInstallReferrerSetupFinished() Remote Exception: ");
                    h.append(e.getMessage());
                    C7077r.m13675a(h.toString());
                    C7039g0.f15658e = true;
                    C7039g0.m13637v0();
                    return;
                } catch (Exception e2) {
                    StringBuilder h2 = C0072d.m201h("onInstallReferrerSetupFinished() Exception: ");
                    h2.append(e2.getMessage());
                    C7077r.m13675a(h2.toString());
                    C7039g0.f15658e = true;
                    C7039g0.m13637v0();
                    return;
                }
            } else if (!(i == 1 || i == 2 || i == 3)) {
                return;
            }
        }
        C7077r.m13675a("responseCode: " + i);
        C7039g0.f15658e = true;
        C7039g0.m13637v0();
    }
}
