package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.p */
public final class C19385p implements C19378j {

    /* renamed from: b */
    public final Class<?> f43268b;

    public C19385p(Class cls) {
        C19383o.m32797g(cls, "jClass");
        this.f43268b = cls;
    }

    /* renamed from: a */
    public final Class<?> mo71917a() {
        return this.f43268b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19385p) && C19383o.m32792b(this.f43268b, ((C19385p) obj).f43268b);
    }

    public final int hashCode() {
        return this.f43268b.hashCode();
    }

    public final String toString() {
        return this.f43268b.toString() + " (Kotlin reflection is not available)";
    }
}
