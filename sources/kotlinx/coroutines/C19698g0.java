package kotlinx.coroutines;

import kotlinx.coroutines.internal.C19729m;
import kotlinx.coroutines.internal.C19737u;
import p768rq.C20153b;

/* renamed from: kotlinx.coroutines.g0 */
public final class C19698g0 {

    /* renamed from: a */
    public static final C19744j0 f43633a;

    static {
        String str;
        C19744j0 j0Var;
        int i = C19737u.f43688a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (!(str == null ? false : Boolean.parseBoolean(str))) {
            j0Var = C19547f0.f43502i;
        } else {
            C20153b bVar = C19760n0.f43719a;
            C19764o1 o1Var = C19729m.f43681a;
            o1Var.mo72111E0();
            j0Var = !(o1Var instanceof C19744j0) ? C19547f0.f43502i : (C19744j0) o1Var;
        }
        f43633a = j0Var;
    }
}
