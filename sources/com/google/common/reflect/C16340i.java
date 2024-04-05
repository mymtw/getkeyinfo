package com.google.common.reflect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken;

/* renamed from: com.google.common.reflect.i */
public final class C16340i extends TypeToken.C16307e.C16310c<Object> {
    public C16340i(TypeToken.C16307e eVar) {
        super(eVar);
    }

    /* renamed from: b */
    public final ImmutableList mo58253b(ImmutableCollection immutableCollection) {
        ImmutableList.C15953a builder = ImmutableList.builder();
        for (Object next : immutableCollection) {
            if (!mo58255d(next).isInterface()) {
                builder.mo56633b(next);
            }
        }
        return super.mo58253b(builder.mo56664e());
    }

    /* renamed from: c */
    public final Iterable<Object> mo58254c(Object obj) {
        return ImmutableSet.m25894of();
    }
}
