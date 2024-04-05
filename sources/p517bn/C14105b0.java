package p517bn;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* renamed from: bn.b0 */
public final class C14105b0 {

    /* renamed from: b */
    public static WeakReference<C14105b0> f31061b;

    /* renamed from: a */
    public C14134y f31062a;

    public C14105b0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
    }

    /* renamed from: a */
    public final synchronized C14103a0 mo46978a() {
        String peek;
        C14103a0 a0Var;
        C14134y yVar = this.f31062a;
        synchronized (yVar.f31141d) {
            peek = yVar.f31141d.peek();
        }
        Pattern pattern = C14103a0.f31056d;
        a0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                a0Var = new C14103a0(split[0], split[1]);
            }
        }
        return a0Var;
    }
}
