package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;

@Immutable
/* renamed from: com.google.common.hash.e */
public interface C16271e {
    <T> HashCode hashObject(T t, Funnel<? super T> funnel);

    C16272f newHasher();
}
