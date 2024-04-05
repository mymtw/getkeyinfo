package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.reflect.a */
public class C16326a extends AccessibleObject implements Member {

    /* renamed from: b */
    public final AccessibleObject f36427b;

    /* renamed from: c */
    public final Member f36428c;

    public <M extends AccessibleObject & Member> C16326a(M m) {
        m.getClass();
        this.f36427b = m;
        this.f36428c = (Member) m;
    }

    /* renamed from: a */
    public TypeToken<?> mo58245a() {
        return TypeToken.m26399of(getDeclaringClass());
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C16326a)) {
            return false;
        }
        C16326a aVar = (C16326a) obj;
        return mo58245a().equals(aVar.mo58245a()) && this.f36428c.equals(aVar.f36428c);
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f36427b.getAnnotation(cls);
    }

    public final Annotation[] getAnnotations() {
        return this.f36427b.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f36427b.getDeclaredAnnotations();
    }

    public Class<?> getDeclaringClass() {
        return this.f36428c.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f36428c.getModifiers();
    }

    public final String getName() {
        return this.f36428c.getName();
    }

    public final int hashCode() {
        return this.f36428c.hashCode();
    }

    public final boolean isAccessible() {
        return this.f36427b.isAccessible();
    }

    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f36427b.isAnnotationPresent(cls);
    }

    public final boolean isSynthetic() {
        return this.f36428c.isSynthetic();
    }

    public final void setAccessible(boolean z) throws SecurityException {
        this.f36427b.setAccessible(z);
    }

    public String toString() {
        return this.f36428c.toString();
    }
}
