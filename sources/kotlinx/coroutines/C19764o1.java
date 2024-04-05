package kotlinx.coroutines;

import kotlinx.coroutines.internal.C19729m;
import p768rq.C20153b;

/* renamed from: kotlinx.coroutines.o1 */
public abstract class C19764o1 extends CoroutineDispatcher {
    /* renamed from: E0 */
    public abstract C19764o1 mo72111E0();

    public String toString() {
        String str;
        C19764o1 o1Var;
        C20153b bVar = C19760n0.f43719a;
        C19764o1 o1Var2 = C19729m.f43681a;
        if (this == o1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                o1Var = o1Var2.mo72111E0();
            } catch (UnsupportedOperationException unused) {
                o1Var = null;
            }
            str = this == o1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C19543e0.m33300R(this);
    }
}
