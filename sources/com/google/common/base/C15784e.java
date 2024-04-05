package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.base.e */
public interface C15784e<F, T> {
    @NullableDecl
    @CanIgnoreReturnValue
    T apply(@NullableDecl F f);

    boolean equals(@NullableDecl Object obj);
}
