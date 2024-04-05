package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.z1 */
public final class C19845z1 {

    /* renamed from: a */
    public static final ThreadLocal<C19821t0> f43852a = new ThreadLocal<>();

    /* renamed from: a */
    public static C19821t0 m33859a() {
        ThreadLocal<C19821t0> threadLocal = f43852a;
        C19821t0 t0Var = threadLocal.get();
        if (t0Var != null) {
            return t0Var;
        }
        C19546f fVar = new C19546f(Thread.currentThread());
        threadLocal.set(fVar);
        return fVar;
    }
}
