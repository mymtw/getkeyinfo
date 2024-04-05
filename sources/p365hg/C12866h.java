package p365hg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashSet;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: hg.h */
public final class C12866h {

    /* renamed from: a */
    public static final HashSet<String> f28363a = C19382n.m32754j0("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    /* renamed from: a */
    public static final boolean m20543a(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        C19383o.m32796f(str2, "brand");
        if (C19457k.m33025c1(str2, "generic", false) && (i & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null) {
                return false;
            }
            if (signatureArr.length == 0) {
                return false;
            }
            C19383o.m32796f(signatureArr, "packageInfo.signatures");
            for (Signature byteArray : signatureArr) {
                HashSet<String> hashSet = f28363a;
                byte[] byteArray2 = byteArray.toByteArray();
                C19383o.m32796f(byteArray2, "it.toByteArray()");
                C12869i0.f28375h.getClass();
                if (!C19327t.m32634P0(C12869i0.m20583v("SHA-1", byteArray2), hashSet)) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
