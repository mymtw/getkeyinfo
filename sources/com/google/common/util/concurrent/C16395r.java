package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.util.concurrent.r */
public final class C16395r<V> extends AbstractFuture.C16351h<V> {
    @CanIgnoreReturnValue
    /* renamed from: k */
    public final boolean mo58317k(Throwable th) {
        return super.mo58317k(th);
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public final boolean mo58424l(@NullableDecl V v) {
        if (v == null) {
            v = AbstractFuture.f36448h;
        }
        if (!AbstractFuture.f36447g.mo58321b(this, (Object) null, v)) {
            return false;
        }
        AbstractFuture.m26468d(this);
        return true;
    }
}
