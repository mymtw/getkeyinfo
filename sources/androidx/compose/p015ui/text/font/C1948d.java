package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.p012os.VibratorManager;
import android.provider.Settings;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;

/* renamed from: androidx.compose.ui.text.font.d */
public final class C1948d {
    /* renamed from: a */
    public static final C1947c m4269a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new C1947c(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }

    /* renamed from: b */
    public static final void m4270b(Context context, long j) {
        C19383o.m32797g(context, "<this>");
        boolean z = m4276h(context) != 0;
        Vibrator e = m4273e(context);
        if (z && e != null) {
            e.vibrate(VibrationEffect.createOneShot(j, -1));
        }
    }

    /* renamed from: c */
    public static final int m4271c(Context context, int i) {
        Object obj = C8184a.f17966a;
        return C8184a.C8188d.m16468a(context, i);
    }

    /* renamed from: d */
    public static final int m4272d(Context context) {
        C19383o.m32797g(context, "<this>");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: e */
    public static final Vibrator m4273e(Context context) {
        C19383o.m32797g(context, "<this>");
        if (!(Build.VERSION.SDK_INT >= 31)) {
            return (Vibrator) context.getSystemService("vibrator");
        }
        VibratorManager vibratorManager = (VibratorManager) context.getSystemService("vibrator_manager");
        if (vibratorManager != null) {
            return vibratorManager.getDefaultVibrator();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.getConfiguration();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m4274f(android.content.Context r1) {
        /*
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x000f
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 == 0) goto L_0x000f
            float r1 = r1.fontScale
            goto L_0x0011
        L_0x000f:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0011:
            r0 = 1071225242(0x3fd9999a, float:1.7)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.C1948d.m4274f(android.content.Context):boolean");
    }

    /* renamed from: g */
    public static final boolean m4275g(Context context) {
        return context.getResources().getBoolean(R.bool.width_720);
    }

    /* renamed from: h */
    public static final int m4276h(Context context) {
        C19383o.m32797g(context, "<this>");
        return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.app.Activity m4277i(android.content.Context r2) {
        /*
        L_0x0000:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 != 0) goto L_0x0014
            boolean r1 = r2 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x0014
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.String r0 = "returnContext.baseContext"
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            goto L_0x0000
        L_0x0014:
            if (r0 == 0) goto L_0x0019
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.C1948d.m4277i(android.content.Context):android.app.Activity");
    }
}
