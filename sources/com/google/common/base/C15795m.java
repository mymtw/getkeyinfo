package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.base.m */
public interface C15795m<T> {
    @CanIgnoreReturnValue
    boolean apply(@NullableDecl T t);

    boolean equals(@NullableDecl Object obj);
}
