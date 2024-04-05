package dagger.internal;

import p634np.C18289a;

/* renamed from: dagger.internal.e */
public final class C17556e<T> implements C17555d<T>, C18289a<T> {

    /* renamed from: a */
    public final T f38390a;

    public C17556e(T t) {
        this.f38390a = t;
    }

    /* renamed from: a */
    public static C17556e m29429a(Object obj) {
        if (obj != null) {
            return new C17556e(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final T get() {
        return this.f38390a;
    }
}
