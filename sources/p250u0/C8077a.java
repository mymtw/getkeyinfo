package p250u0;

import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import java.util.Arrays;
import p003a2.C0023f;
import p260v0.C8184a;

/* renamed from: u0.a */
public final class C8077a extends C8184a {

    /* renamed from: c */
    public static final /* synthetic */ int f17593c = 0;

    /* renamed from: u0.a$a */
    public interface C8078a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: u0.a$b */
    public interface C8079b {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: c */
    public static void m16263c(int i, ComponentActivity componentActivity, String[] strArr) {
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                i2++;
            } else {
                throw new IllegalArgumentException(C0023f.m110k(C0072d.m201h("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (componentActivity instanceof C8079b) {
            ((C8079b) componentActivity).validateRequestPermissionsRequestCode(i);
        }
        componentActivity.requestPermissions(strArr, i);
    }
}
