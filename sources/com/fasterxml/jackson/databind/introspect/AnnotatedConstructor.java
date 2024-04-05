package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedConstructor extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    public final Constructor<?> _constructor;
    public Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        public Class<?>[] args;
        public Class<?> clazz;

        public Serialization(Constructor<?> constructor) {
            this.clazz = constructor.getDeclaringClass();
            this.args = constructor.getParameterTypes();
        }
    }

    public AnnotatedConstructor(TypeResolutionContext typeResolutionContext, Constructor<?> constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (constructor != null) {
            this._constructor = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }

    public final Object call() throws Exception {
        return this._constructor.newInstance(new Object[0]);
    }

    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(new Object[]{obj});
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedConstructor.class) && ((AnnotatedConstructor) obj)._constructor == this._constructor;
    }

    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    public Member getMember() {
        return this._constructor;
    }

    public int getModifiers() {
        return this._constructor.getModifiers();
    }

    public String getName() {
        return this._constructor.getName();
    }

    public int getParameterCount() {
        return this._constructor.getParameterTypes().length;
    }

    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    public Class<?> getRawParameterType(int i) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    public JavaType getType() {
        return this._typeContext.resolveType(getRawType());
    }

    public Object getValue(Object obj) throws UnsupportedOperationException {
        StringBuilder h = C0072d.m201h("Cannot call getValue() on constructor of ");
        h.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(h.toString());
    }

    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(serialization.args);
            if (!declaredConstructor.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredConstructor, false);
            }
            return new AnnotatedConstructor((TypeResolutionContext) null, declaredConstructor, (AnnotationMap) null, (AnnotationMap[]) null);
        } catch (Exception unused) {
            StringBuilder h = C0072d.m201h("Could not find constructor with ");
            h.append(this._serialization.args.length);
            h.append(" args from Class '");
            h.append(cls.getName());
            throw new IllegalArgumentException(h.toString());
        }
    }

    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        StringBuilder h = C0072d.m201h("Cannot call setValue() on constructor of ");
        h.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(h.toString());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[constructor for ");
        h.append(getName());
        h.append(", annotations: ");
        h.append(this._annotations);
        h.append("]");
        return h.toString();
    }

    public Object writeReplace() {
        return new AnnotatedConstructor(new Serialization(this._constructor));
    }

    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    public AnnotatedConstructor withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, annotationMap, this._paramAnnotations);
    }

    public AnnotatedConstructor(Serialization serialization) {
        super((TypeResolutionContext) null, (AnnotationMap) null, (AnnotationMap[]) null);
        this._constructor = null;
        this._serialization = serialization;
    }
}
