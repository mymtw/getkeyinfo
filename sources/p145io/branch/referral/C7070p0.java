package p145io.branch.referral;

import androidx.preference.C3039b;
import p145io.branch.referral.ServerRequest;

/* renamed from: io.branch.referral.p0 */
public final class C7070p0 extends C3039b {

    /* renamed from: c */
    public static C7071a f15742c = null;

    /* renamed from: d */
    public static boolean f15743d = false;

    /* renamed from: e */
    public static boolean f15744e = false;

    /* renamed from: f */
    public static Long f15745f = Long.MIN_VALUE;

    /* renamed from: g */
    public static Long f15746g = Long.MIN_VALUE;

    /* renamed from: h */
    public static String f15747h = null;

    /* renamed from: io.branch.referral.p0$a */
    public interface C7071a {
    }

    /* renamed from: u0 */
    public static void m13662u0() {
        C7071a aVar = f15742c;
        if (aVar != null) {
            Branch branch = (Branch) aVar;
            branch.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.XIAOMI_INSTALL_REFERRER_FETCH_WAIT_LOCK);
            branch.f15592r = false;
            branch.mo19206w();
            f15742c = null;
        }
    }
}
