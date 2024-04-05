package p145io.branch.referral;

import androidx.preference.C3039b;
import p145io.branch.referral.ServerRequest;
import p504ai.C13983i;

/* renamed from: io.branch.referral.g0 */
public final class C7039g0 extends C3039b {

    /* renamed from: c */
    public static C7040a f15656c = null;

    /* renamed from: d */
    public static boolean f15657d = false;

    /* renamed from: e */
    public static boolean f15658e = false;

    /* renamed from: f */
    public static Long f15659f = Long.MIN_VALUE;

    /* renamed from: g */
    public static Long f15660g = Long.MIN_VALUE;

    /* renamed from: h */
    public static String f15661h = null;

    /* renamed from: io.branch.referral.g0$a */
    public interface C7040a {
    }

    /* renamed from: u0 */
    public static void m13636u0(String str, long j, long j2, String str2) {
        StringBuilder n = C13983i.m21495n(str2, " onReferrerClientFinished() Referrer: ", str, " Click Timestamp: ");
        n.append(j);
        n.append(" Install Timestamp: ");
        n.append(j2);
        C7077r.m13675a(n.toString());
        m13637v0();
    }

    /* renamed from: v0 */
    public static void m13637v0() {
        C7040a aVar = f15656c;
        if (aVar != null) {
            Branch branch = (Branch) aVar;
            branch.f15580f.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.GOOGLE_INSTALL_REFERRER_FETCH_WAIT_LOCK);
            branch.f15590p = false;
            branch.mo19206w();
            f15656c = null;
        }
    }
}
