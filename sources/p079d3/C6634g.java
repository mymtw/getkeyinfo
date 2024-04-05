package p079d3;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C3422l;
import com.etsy.android.lib.models.ResponseConstants;

/* renamed from: d3.g */
public final class C6634g {

    /* renamed from: a */
    public static final String f14638a = C3422l.m8214e("PackageManagerHelper");

    /* renamed from: a */
    public static void m13017a(Context context, Class<?> cls, boolean z) {
        String str = ResponseConstants.ENABLED;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C3422l c = C3422l.m8213c();
            String str2 = f14638a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : "disabled";
            c.mo12926a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            C3422l c2 = C3422l.m8213c();
            String str3 = f14638a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            c2.mo12926a(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}
