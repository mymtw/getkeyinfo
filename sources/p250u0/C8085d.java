package p250u0;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: u0.d */
public final class C8085d {
    /* renamed from: a */
    public static int m16265a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* renamed from: b */
    public static String m16266b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m16267c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
