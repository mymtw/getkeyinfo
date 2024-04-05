package p030bo.app;

/* renamed from: bo.app.y5 */
public final class C4307y5 {

    /* renamed from: a */
    public static final C4307y5 f9500a = new C4307y5();

    /* renamed from: b */
    private static final int f9501b;

    /* renamed from: c */
    private static final int f9502c = 2;

    /* renamed from: d */
    private static final int f9503d;

    /* renamed from: e */
    private static final long f9504e = 1;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f9501b = availableProcessors;
        f9503d = Math.max(2, availableProcessors - 1);
    }

    private C4307y5() {
    }

    /* renamed from: a */
    public static final int m9969a() {
        return f9501b;
    }
}
