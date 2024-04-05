package p145io.branch.referral;

import java.util.TimerTask;
import p145io.branch.referral.C7046j0;
import p145io.branch.referral.ServerRequest;

/* renamed from: io.branch.referral.i0 */
public final class C7044i0 extends TimerTask {
    public final void run() {
        C7077r.m13675a("Huawei Store Referrer fetch lock released by timer");
        C7046j0.C7047a aVar = C7046j0.f15670c;
        if (aVar != null) {
            Branch branch = (Branch) aVar;
            branch.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.HUAWEI_INSTALL_REFERRER_FETCH_WAIT_LOCK);
            branch.f15589o = false;
            branch.mo19206w();
            C7046j0.f15670c = null;
        }
    }
}
