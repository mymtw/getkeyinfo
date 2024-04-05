package p077d1;

/* renamed from: d1.f */
public final class C6622f<T> extends C6621e {

    /* renamed from: d */
    public final Object f14610d = new Object();

    public C6622f(int i) {
        super(i);
    }

    /* renamed from: a */
    public final boolean mo18806a(T t) {
        boolean a;
        synchronized (this.f14610d) {
            a = super.mo18806a(t);
        }
        return a;
    }

    /* renamed from: b */
    public final T mo18807b() {
        T b;
        synchronized (this.f14610d) {
            b = super.mo18807b();
        }
        return b;
    }
}
