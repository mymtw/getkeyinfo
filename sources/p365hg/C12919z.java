package p365hg;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p365hg.C12917y;
import p401mg.C13080a;
import p461uf.C13511h;

/* renamed from: hg.z */
public final class C12919z implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InstallReferrerClient f28483a;

    /* renamed from: b */
    public final /* synthetic */ C12917y.C12918a f28484b;

    public C12919z(InstallReferrerClient installReferrerClient, C13511h.C13512a.C13513a aVar) {
        this.f28483a = installReferrerClient;
        this.f28484b = aVar;
    }

    public final void onInstallReferrerServiceDisconnected() {
    }

    public final void onInstallReferrerSetupFinished(int i) {
        if (!C13080a.m20762b(this)) {
            if (i == 0) {
                try {
                    InstallReferrerClient installReferrerClient = this.f28483a;
                    C19383o.m32796f(installReferrerClient, "referrerClient");
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    C19383o.m32796f(installReferrer, "referrerClient.installReferrer");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (C19459m.m33036e1(installReferrer2, "fb", false) || C19459m.m33036e1(installReferrer2, "facebook", false))) {
                        this.f28484b.mo45683a(installReferrer2);
                    }
                    C12917y.m20628a();
                } catch (RemoteException unused) {
                }
            } else if (i == 2) {
                try {
                    C12917y.m20628a();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }
}
