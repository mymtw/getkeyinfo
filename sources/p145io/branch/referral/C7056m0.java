package p145io.branch.referral;

import androidx.preference.C3039b;
import p145io.branch.referral.ServerRequest;

/* renamed from: io.branch.referral.m0 */
public final class C7056m0 extends C3039b {

    /* renamed from: c */
    public static C7057a f15703c = null;

    /* renamed from: d */
    public static boolean f15704d = false;

    /* renamed from: e */
    public static boolean f15705e = false;

    /* renamed from: f */
    public static Long f15706f = Long.MIN_VALUE;

    /* renamed from: g */
    public static Long f15707g = Long.MIN_VALUE;

    /* renamed from: h */
    public static String f15708h = null;

    /* renamed from: io.branch.referral.m0$a */
    public interface C7057a {
    }

    /* renamed from: u0 */
    public static void m13646u0() {
        C7057a aVar = f15703c;
        if (aVar != null) {
            Branch branch = (Branch) aVar;
            branch.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.SAMSUNG_INSTALL_REFERRER_FETCH_WAIT_LOCK);
            branch.f15591q = false;
            branch.mo19206w();
            f15703c = null;
        }
    }
}
