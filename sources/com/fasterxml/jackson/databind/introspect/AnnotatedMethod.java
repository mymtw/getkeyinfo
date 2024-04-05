package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    public final transient Method _method;
    public Class<?>[] _paramClasses;
    public Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        public Class<?>[] args;
        public Class<?> clazz;
        public String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method != null) {
            this._method = method;
            return;
        }
        throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
    }

    public final Object call() throws Exception {
        return this._method.invoke((Object) null, new Object[0]);
    }

    public final Object call1(Object obj) throws Exception {
        return this._method.invoke((Object) null, new Object[]{obj});
    }

    public final Object callOn(Object obj) throws Exception {
        return this._method.invoke(obj, (Object[]) null);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedMethod.class) && ((AnnotatedMethod) obj)._method == this._method;
    }

    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    public String getFullName() {
        return String.format("%s(%d params)", new Object[]{super.getFullName(), Integer.valueOf(getParameterCount())});
    }

    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    public int getModifiers() {
        return this._method.getModifiers();
    }

    public String getName() {
        return this._method.getName();
    }

    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    public Class<?> getRawParameterType(int i) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    public JavaType getType() {
        return this._typeContext.resolveType(this._method.getGenericReturnType());
    }

    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder h = C0072d.m201h("Failed to getValue() with method ");
            h.append(getFullName());
            h.append(": ");
            h.append(e.getMessage());
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    public boolean hasReturnType() {
        Class<?> rawReturnType = getRawReturnType();
        return (rawReturnType == Void.TYPE || rawReturnType == Void.class) ? false : true;
    }

    public int hashCode() {
        return this._method.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.name, serialization.args);
            if (!declaredMethod.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredMethod, false);
            }
            return new AnnotatedMethod((TypeResolutionContext) null, declaredMethod, (AnnotationMap) null, (AnnotationMap[]) null);
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
            this._method.invoke(obj, new Object[]{obj2});
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder h = C0072d.m201h("Failed to setValue() with method ");
            h.append(getFullName());
            h.append(": ");
            h.append(e.getMessage());
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[method ");
        h.append(getFullName());
        h.append("]");
        return h.toString();
    }

    public Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }

    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke((Object) null, objArr);
    }

    public Method getAnnotated() {
        return this._method;
    }

    public Method getMember() {
        return this._method;
    }

    public AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._typeContext, this._method, annotationMap, this._paramAnnotations);
    }

    public AnnotatedMethod(Serialization serialization) {
        super((TypeResolutionContext) null, (AnnotationMap) null, (AnnotationMap[]) null);
        this._method = null;
        this._serialization = serialization;
    }
}
