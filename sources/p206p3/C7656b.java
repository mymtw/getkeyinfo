package p206p3;

import android.util.Log;
import java.util.HashSet;

/* renamed from: p3.b */
public final class C7656b {

    /* renamed from: a */
    public static C7655a f16960a = new C7655a();

    /* renamed from: a */
    public static void m14694a() {
        f16960a.getClass();
    }

    /* renamed from: b */
    public static void m14695b(String str) {
        f16960a.getClass();
        HashSet hashSet = C7655a.f16959a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            hashSet.add(str);
        }
    }
}
