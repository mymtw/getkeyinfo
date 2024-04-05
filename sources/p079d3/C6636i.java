package p079d3;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C3373b;
import androidx.work.C3422l;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: d3.i */
public final class C6636i {

    /* renamed from: a */
    public static final String f14640a = C3422l.m8214e("ProcessUtils");

    /* renamed from: a */
    public static boolean m13018a(Context context, C3373b bVar) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C6636i.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                C3422l.m8213c().mo12926a(f14640a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        str = next.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        bVar.getClass();
        return !TextUtils.isEmpty((CharSequence) null) ? TextUtils.equals(str, (CharSequence) null) : TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
