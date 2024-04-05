package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import p003a2.C0023f;

public class VirtualAnnotatedMember extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final Class<?> _declaringClass;
    public final String _name;
    public final JavaType _type;

    public VirtualAnnotatedMember(TypeResolutionContext typeResolutionContext, Class<?> cls, String str, JavaType javaType) {
        super(typeResolutionContext, (AnnotationMap) null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    public Field getAnnotated() {
        return null;
    }

    public int getAnnotationCount() {
        return 0;
    }

    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    public Member getMember() {
        return null;
    }

    public int getModifiers() {
        return 0;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    public JavaType getType() {
        return this._type;
    }

    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException(C0023f.m110k(C0072d.m201h("Cannot get virtual property '"), this._name, "'"));
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException(C0023f.m110k(C0072d.m201h("Cannot set virtual property '"), this._name, "'"));
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[virtual ");
        h.append(getFullName());
        h.append("]");
        return h.toString();
    }

    public Annotated withAnnotations(AnnotationMap annotationMap) {
        return this;
    }
}
