package com.google.common.collect;

import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.g */
public abstract class C16171g<T> extends C16170f2<T> {
    @NullableDecl

    /* renamed from: b */
    public T f36267b;

    public C16171g(@NullableDecl T t) {
        this.f36267b = t;
    }

    @NullableDecl
    /* renamed from: a */
    public abstract T mo55956a(T t);

    public final boolean hasNext() {
        return this.f36267b != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                T t = this.f36267b;
                this.f36267b = mo55956a(t);
                return t;
            } catch (Throwable th) {
                this.f36267b = mo55956a(this.f36267b);
                throw th;
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
