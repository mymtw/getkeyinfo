package com.google.common.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;

/* renamed from: com.google.common.reflect.k */
public abstract class C16342k {

    /* renamed from: a */
    public final HashSet f36444a = new HashSet();

    /* renamed from: a */
    public final void mo58307a(Type... typeArr) {
        for (TypeVariable typeVariable : typeArr) {
            if (typeVariable != null && this.f36444a.add(typeVariable)) {
                try {
                    if (typeVariable instanceof TypeVariable) {
                        mo58249e(typeVariable);
                    } else if (typeVariable instanceof WildcardType) {
                        mo58250f((WildcardType) typeVariable);
                    } else if (typeVariable instanceof ParameterizedType) {
                        mo58248d(typeVariable);
                    } else if (typeVariable instanceof Class) {
                        mo58251b(typeVariable);
                    } else if (typeVariable instanceof GenericArrayType) {
                        mo58247c(typeVariable);
                    } else {
                        throw new AssertionError("Unknown type: " + typeVariable);
                    }
                } catch (Throwable th) {
                    this.f36444a.remove(typeVariable);
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo58251b(Class<?> cls) {
    }

    /* renamed from: c */
    public void mo58247c(GenericArrayType genericArrayType) {
    }

    /* renamed from: d */
    public void mo58248d(ParameterizedType parameterizedType) {
    }

    /* renamed from: e */
    public abstract void mo58249e(TypeVariable<?> typeVariable);

    /* renamed from: f */
    public abstract void mo58250f(WildcardType wildcardType);
}
