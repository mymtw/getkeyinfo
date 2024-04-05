package com.google.common.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.common.reflect.b */
public abstract class C16327b<T, R> extends C16326a implements GenericDeclaration {

    /* renamed from: com.google.common.reflect.b$a */
    public static class C16328a<T> extends C16327b<T, T> {

        /* renamed from: d */
        public final Constructor<?> f36429d;

        public C16328a(Constructor<?> constructor) {
            super(constructor);
            this.f36429d = constructor;
        }

        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable[] typeParameters2 = this.f36429d.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[(typeParameters.length + typeParameters2.length)];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }
    }

    /* renamed from: com.google.common.reflect.b$b */
    public static class C16329b<T> extends C16327b<T, Object> {

        /* renamed from: d */
        public final Method f36430d;

        public C16329b(Method method) {
            super(method);
            this.f36430d = method;
        }

        public final TypeVariable<?>[] getTypeParameters() {
            return this.f36430d.getTypeParameters();
        }
    }

    public <M extends AccessibleObject & Member> C16327b(M m) {
        super(m);
    }

    public final Class<? super T> getDeclaringClass() {
        return super.getDeclaringClass();
    }
}
