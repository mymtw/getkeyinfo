package com.google.common.reflect;

import com.google.common.reflect.C16333f;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.reflect.h */
public final class C16339h extends C16333f.C16337d {

    /* renamed from: c */
    public final /* synthetic */ TypeVariable f36441c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16339h(AtomicInteger atomicInteger, TypeVariable typeVariable) {
        super(atomicInteger);
        this.f36441c = typeVariable;
    }

    /* renamed from: b */
    public final TypeVariable<?> mo58306b(Type[] typeArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
        linkedHashSet.addAll(Arrays.asList(this.f36441c.getBounds()));
        if (linkedHashSet.size() > 1) {
            linkedHashSet.remove(Object.class);
        }
        return super.mo58306b((Type[]) linkedHashSet.toArray(new Type[0]));
    }
}
