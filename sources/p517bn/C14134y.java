package p517bn;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: bn.y */
public final class C14134y {

    /* renamed from: a */
    public final SharedPreferences f31138a;

    /* renamed from: b */
    public final String f31139b;

    /* renamed from: c */
    public final String f31140c;

    /* renamed from: d */
    public final ArrayDeque<String> f31141d = new ArrayDeque<>();

    /* renamed from: e */
    public final Executor f31142e;

    public C14134y(SharedPreferences sharedPreferences, Executor executor) {
        this.f31138a = sharedPreferences;
        this.f31139b = "topic_operation_queue";
        this.f31140c = ",";
        this.f31142e = executor;
    }

    /* renamed from: a */
    public static C14134y m21883a(SharedPreferences sharedPreferences, Executor executor) {
        C14134y yVar = new C14134y(sharedPreferences, executor);
        synchronized (yVar.f31141d) {
            yVar.f31141d.clear();
            String string = yVar.f31138a.getString(yVar.f31139b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(yVar.f31140c)) {
                    if (r1 == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : string.split(yVar.f31140c, -1)) {
                        if (!TextUtils.isEmpty(str)) {
                            yVar.f31141d.add(str);
                        }
                    }
                }
            }
        }
        return yVar;
    }
}
