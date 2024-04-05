package p079d3;

import android.content.Context;
import android.os.PowerManager;
import androidx.appcompat.widget.C0326j;
import androidx.work.C3422l;
import java.util.WeakHashMap;

/* renamed from: d3.m */
public final class C6641m {

    /* renamed from: a */
    public static final String f14654a = C3422l.m8214e("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f14655b = new WeakHashMap<>();

    /* renamed from: a */
    public static PowerManager.WakeLock m13020a(Context context, String str) {
        String i = C0326j.m864i("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, i);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f14655b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, i);
        }
        return newWakeLock;
    }
}
