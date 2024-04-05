package p312ag;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

/* renamed from: ag.d */
public final class C8527d {

    /* renamed from: a */
    public static final /* synthetic */ int f18569a = 0;

    static {
        new C8527d();
    }

    /* renamed from: a */
    public static final String m16930a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArr[i])}, 1));
            C19383o.m32796f(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        C19383o.m32796f(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* renamed from: b */
    public static final View m16931b(Activity activity) {
        Class<C8527d> cls = C8527d.class;
        if (C13080a.m20762b(cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            View decorView = window.getDecorView();
            C19383o.m32796f(decorView, "window.decorView");
            return decorView.getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (kotlin.text.C19457k.m33025c1(r0, "generic", false) == false) goto L_0x0060;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m16932c() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "Build.FINGERPRINT"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            boolean r3 = kotlin.text.C19457k.m33025c1(r0, r1, r2)
            if (r3 != 0) goto L_0x0068
            java.lang.String r3 = "unknown"
            boolean r0 = kotlin.text.C19457k.m33025c1(r0, r3, r2)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "Build.MODEL"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            java.lang.String r3 = "google_sdk"
            boolean r4 = kotlin.text.C19459m.m33036e1(r0, r3, r2)
            if (r4 != 0) goto L_0x0068
            java.lang.String r4 = "Emulator"
            boolean r4 = kotlin.text.C19459m.m33036e1(r0, r4, r2)
            if (r4 != 0) goto L_0x0068
            java.lang.String r4 = "Android SDK built for x86"
            boolean r0 = kotlin.text.C19459m.m33036e1(r0, r4, r2)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Build.MANUFACTURER"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            java.lang.String r4 = "Genymotion"
            boolean r0 = kotlin.text.C19459m.m33036e1(r0, r4, r2)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r4 = "Build.BRAND"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            boolean r0 = kotlin.text.C19457k.m33025c1(r0, r1, r2)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r4 = "Build.DEVICE"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            boolean r0 = kotlin.text.C19457k.m33025c1(r0, r1, r2)
            if (r0 != 0) goto L_0x0068
        L_0x0060:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r2 = 1
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ag.C8527d.m16932c():boolean");
    }
}
