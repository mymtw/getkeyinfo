package androidx.compose.runtime;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.a1 */
public final class C1295a1<T> {

    /* renamed from: a */
    public final C1302d f2799a;

    public /* synthetic */ C1295a1(C1302d dVar) {
        this.f2799a = dVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C1295a1 m2576a(C1302d dVar) {
        return new C1295a1(dVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1295a1) && C19383o.m32792b(this.f2799a, ((C1295a1) obj).f2799a);
    }

    public final int hashCode() {
        return this.f2799a.hashCode();
    }

    public final String toString() {
        C1302d dVar = this.f2799a;
        return "SkippableUpdater(composer=" + dVar + ')';
    }
}
