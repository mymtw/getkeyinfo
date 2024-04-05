package p039c8;

/* renamed from: c8.f */
public abstract class C4450f<T> {

    /* renamed from: a */
    public final C4449e f9743a;

    public C4450f(C4449e eVar) {
        this.f9743a = eVar;
    }

    /* renamed from: a */
    public C4450f<?> mo14392a(String str) {
        throw new RuntimeException("Invalid or non Implemented status" + " startArray in " + getClass() + " key=" + str);
    }

    /* renamed from: b */
    public abstract Object mo14389b();

    /* renamed from: c */
    public T mo14391c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public abstract void mo14390d(Object obj, Object obj2);

    /* renamed from: e */
    public void mo14393e(Object obj, String str, Object obj2) {
        throw new RuntimeException("Invalid or non Implemented status" + " setValue in " + getClass() + " key=" + str);
    }

    /* renamed from: f */
    public C4450f<?> mo14394f(String str) {
        throw new RuntimeException("Invalid or non Implemented status" + " startObject(String key) in " + getClass() + " key=" + str);
    }

    /* renamed from: g */
    public Object mo14395g() {
        throw new RuntimeException("Invalid or non Implemented status" + " createObject() in " + getClass());
    }
}
