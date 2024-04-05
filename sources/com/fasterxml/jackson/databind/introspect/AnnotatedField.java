package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public final class AnnotatedField extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final transient Field _field;
    public Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        public Class<?> clazz;
        public String name;

        public Serialization(Field field) {
            this.clazz = field.getDeclaringClass();
            this.name = field.getName();
        }
    }

    public AnnotatedField(TypeResolutionContext typeResolutionContext, Field field, AnnotationMap annotationMap) {
        super(typeResolutionContext, annotationMap);
        this._field = field;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedField.class) && ((AnnotatedField) obj)._field == this._field;
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    public Member getMember() {
        return this._field;
    }

    public int getModifiers() {
        return this._field.getModifiers();
    }

    public String getName() {
        return this._field.getName();
    }

    public Class<?> getRawType() {
        return this._field.getType();
    }

    public JavaType getType() {
        return this._typeContext.resolveType(this._field.getGenericType());
    }

    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder h = C0072d.m201h("Failed to getValue() for field ");
            h.append(getFullName());
            h.append(": ");
            h.append(e.getMessage());
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    public int hashCode() {
        return this._field.getName().hashCode();
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Field declaredField = cls.getDeclaredField(serialization.name);
            if (!declaredField.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredField, false);
            }
            return new AnnotatedField((TypeResolutionContext) null, declaredField, (AnnotationMap) null);
        } catch (Exception unused) {
            StringBuilder h = C0072d.m201h("Could not find method '");
            h.append(this._serialization.name);
            h.append("' from Class '");
            h.append(cls.getName());
            throw new IllegalArgumentException(h.toString());
        }
    }

    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            StringBuilder h = C0072d.m201h("Failed to setValue() for field ");
            h.append(getFullName());
            h.append(": ");
            h.append(e.getMessage());
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[field ");
        h.append(getFullName());
        h.append("]");
        return h.toString();
    }

    public Object writeReplace() {
        return new AnnotatedField(new Serialization(this._field));
    }

    public Field getAnnotated() {
        return this._field;
    }

    public AnnotatedField withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedField(this._typeContext, this._field, annotationMap);
    }

    public AnnotatedField(Serialization serialization) {
        super((TypeResolutionContext) null, (AnnotationMap) null);
        this._field = null;
        this._serialization = serialization;
    }
}
