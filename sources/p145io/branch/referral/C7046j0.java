package p145io.branch.referral;

import android.content.Context;
import androidx.preference.C3039b;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import java.util.Timer;

/* renamed from: io.branch.referral.j0 */
public final class C7046j0 extends C3039b {

    /* renamed from: c */
    public static C7047a f15670c = null;

    /* renamed from: d */
    public static boolean f15671d = false;

    /* renamed from: io.branch.referral.j0$a */
    public interface C7047a {
    }

    /* renamed from: u0 */
    public static void m13640u0(Context context, Branch branch) {
        f15670c = branch;
        f15671d = true;
        try {
            InstallReferrerClient.newBuilder(context).build().startConnection(new C7042h0());
            new Timer().schedule(new C7044i0(), 1500);
        } catch (Exception e) {
            C7077r.m13675a(e.getMessage());
            e.printStackTrace();
        }
    }
}
