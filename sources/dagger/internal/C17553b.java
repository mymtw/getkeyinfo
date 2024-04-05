package dagger.internal;

import p740eq.C19011a;

/* renamed from: dagger.internal.b */
public final class C17553b<T> implements C17555d<T> {

    /* renamed from: a */
    public C19011a<T> f38386a;

    /* renamed from: a */
    public static <T> void m29425a(C19011a<T> aVar, C19011a<T> aVar2) {
        C17553b bVar = (C17553b) aVar;
        if (bVar.f38386a == null) {
            bVar.f38386a = aVar2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T get() {
        C19011a<T> aVar = this.f38386a;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }
}
