package p608kn;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import p568fn.C17781a;

/* renamed from: kn.f */
public final class C18154f {

    /* renamed from: a */
    public final Runtime f39640a = Runtime.getRuntime();

    /* renamed from: b */
    public final ActivityManager f39641b;

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f39642c;

    /* renamed from: d */
    public final String f39643d;

    /* renamed from: e */
    public final Context f39644e;

    static {
        C17781a.m29823d();
    }

    public C18154f(Context context) {
        String str;
        this.f39644e = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f39641b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f39642c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
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
            this.f39643d = str;
        }
        str = this.f39644e.getPackageName();
        this.f39643d = str;
    }
}
