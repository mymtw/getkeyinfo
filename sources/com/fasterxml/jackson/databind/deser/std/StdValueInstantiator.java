package com.fasterxml.jackson.databind.deser.std;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

@JacksonStdImpl
public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    private static final long serialVersionUID = 1;
    public SettableBeanProperty[] _arrayDelegateArguments;
    public AnnotatedWithParams _arrayDelegateCreator;
    public JavaType _arrayDelegateType;
    public SettableBeanProperty[] _constructorArguments;
    public AnnotatedWithParams _defaultCreator;
    public SettableBeanProperty[] _delegateArguments;
    public AnnotatedWithParams _delegateCreator;
    public JavaType _delegateType;
    public AnnotatedWithParams _fromBooleanCreator;
    public AnnotatedWithParams _fromDoubleCreator;
    public AnnotatedWithParams _fromIntCreator;
    public AnnotatedWithParams _fromLongCreator;
    public AnnotatedWithParams _fromStringCreator;
    public AnnotatedParameter _incompleteParameter;
    public final Class<?> _valueClass;
    public final String _valueTypeDesc;
    public AnnotatedWithParams _withArgsCreator;

    @Deprecated
    public StdValueInstantiator(DeserializationConfig deserializationConfig, Class<?> cls) {
        this._valueTypeDesc = ClassUtil.nameOf(cls);
        this._valueClass = cls == null ? Object.class : cls;
    }

    private Object _createUsingDelegate(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (annotatedWithParams == null) {
            StringBuilder h = C0072d.m201h("No delegate constructor for ");
            h.append(getValueTypeDesc());
            throw new IllegalStateException(h.toString());
        } else if (settableBeanPropertyArr == null) {
            try {
                return annotatedWithParams.call1(obj);
            } catch (Throwable th) {
                throw rewrapCtorProblem(deserializationContext, th);
            }
        } else {
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty == null) {
                    objArr[i] = obj;
                } else {
                    objArr[i] = deserializationContext.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, (Object) null);
                }
            }
            return annotatedWithParams.call(objArr);
        }
    }

    public boolean canCreateFromBoolean() {
        return this._fromBooleanCreator != null;
    }

    public boolean canCreateFromDouble() {
        return this._fromDoubleCreator != null;
    }

    public boolean canCreateFromInt() {
        return this._fromIntCreator != null;
    }

    public boolean canCreateFromLong() {
        return this._fromLongCreator != null;
    }

    public boolean canCreateFromObjectWith() {
        return this._withArgsCreator != null;
    }

    public boolean canCreateFromString() {
        return this._fromStringCreator != null;
    }

    public boolean canCreateUsingArrayDelegate() {
        return this._arrayDelegateType != null;
    }

    public boolean canCreateUsingDefault() {
        return this._defaultCreator != null;
    }

    public boolean canCreateUsingDelegate() {
        return this._delegateType != null;
    }

    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public void configureFromArraySettings(AnnotatedWithParams annotatedWithParams, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr) {
        this._arrayDelegateCreator = annotatedWithParams;
        this._arrayDelegateType = javaType;
        this._arrayDelegateArguments = settableBeanPropertyArr;
    }

    public void configureFromBooleanCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBooleanCreator = annotatedWithParams;
    }

    public void configureFromDoubleCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromDoubleCreator = annotatedWithParams;
    }

    public void configureFromIntCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromIntCreator = annotatedWithParams;
    }

    public void configureFromLongCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromLongCreator = annotatedWithParams;
    }

    public void configureFromObjectSettings(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedWithParams annotatedWithParams3, SettableBeanProperty[] settableBeanPropertyArr2) {
        this._defaultCreator = annotatedWithParams;
        this._delegateCreator = annotatedWithParams2;
        this._delegateType = javaType;
        this._delegateArguments = settableBeanPropertyArr;
        this._withArgsCreator = annotatedWithParams3;
        this._constructorArguments = settableBeanPropertyArr2;
    }

    public void configureFromStringCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromStringCreator = annotatedWithParams;
    }

    public void configureIncompleteParameter(AnnotatedParameter annotatedParameter) {
        this._incompleteParameter = annotatedParameter;
    }

    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) throws IOException {
        if (this._fromBooleanCreator == null) {
            return super.createFromBoolean(deserializationContext, z);
        }
        Boolean valueOf = Boolean.valueOf(z);
        try {
            return this._fromBooleanCreator.call1(valueOf);
        } catch (Throwable th) {
            return deserializationContext.handleInstantiationProblem(this._fromBooleanCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, th));
        }
    }

    public Object createFromDouble(DeserializationContext deserializationContext, double d) throws IOException {
        if (this._fromDoubleCreator == null) {
            return super.createFromDouble(deserializationContext, d);
        }
        Double valueOf = Double.valueOf(d);
        try {
            return this._fromDoubleCreator.call1(valueOf);
        } catch (Throwable th) {
            return deserializationContext.handleInstantiationProblem(this._fromDoubleCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, th));
        }
    }

    public Object createFromInt(DeserializationContext deserializationContext, int i) throws IOException {
        if (this._fromIntCreator != null) {
            Integer valueOf = Integer.valueOf(i);
            try {
                return this._fromIntCreator.call1(valueOf);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this._fromIntCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, th));
            }
        } else if (this._fromLongCreator == null) {
            return super.createFromInt(deserializationContext, i);
        } else {
            Long valueOf2 = Long.valueOf((long) i);
            try {
                return this._fromLongCreator.call1(valueOf2);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), valueOf2, rewrapCtorProblem(deserializationContext, th2));
            }
        }
    }

    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        if (this._fromLongCreator == null) {
            return super.createFromLong(deserializationContext, j);
        }
        Long valueOf = Long.valueOf(j);
        try {
            return this._fromLongCreator.call1(valueOf);
        } catch (Throwable th) {
            return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, th));
        }
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._withArgsCreator;
        if (annotatedWithParams == null) {
            return super.createFromObjectWith(deserializationContext, objArr);
        }
        try {
            return annotatedWithParams.call(objArr);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, objArr, rewrapCtorProblem(deserializationContext, e));
        }
    }

    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._fromStringCreator;
        if (annotatedWithParams == null) {
            return _createFromStringFallbacks(deserializationContext, str);
        }
        try {
            return annotatedWithParams.call1(str);
        } catch (Throwable th) {
            return deserializationContext.handleInstantiationProblem(this._fromStringCreator.getDeclaringClass(), str, rewrapCtorProblem(deserializationContext, th));
        }
    }

    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._arrayDelegateCreator;
        return (annotatedWithParams != null || this._delegateCreator == null) ? _createUsingDelegate(annotatedWithParams, this._arrayDelegateArguments, deserializationContext, obj) : createUsingDelegate(deserializationContext, obj);
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._defaultCreator;
        if (annotatedWithParams == null) {
            return super.createUsingDefault(deserializationContext);
        }
        try {
            return annotatedWithParams.call();
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, (Object) null, rewrapCtorProblem(deserializationContext, e));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2._arrayDelegateCreator;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createUsingDelegate(com.fasterxml.jackson.databind.DeserializationContext r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r2._delegateCreator
            if (r0 != 0) goto L_0x000f
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r1 = r2._arrayDelegateCreator
            if (r1 == 0) goto L_0x000f
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r0 = r2._arrayDelegateArguments
            java.lang.Object r3 = r2._createUsingDelegate(r1, r0, r3, r4)
            return r3
        L_0x000f:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r1 = r2._delegateArguments
            java.lang.Object r3 = r2._createUsingDelegate(r0, r1, r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDelegate(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    public AnnotatedWithParams getArrayDelegateCreator() {
        return this._arrayDelegateCreator;
    }

    public JavaType getArrayDelegateType(DeserializationConfig deserializationConfig) {
        return this._arrayDelegateType;
    }

    public AnnotatedWithParams getDefaultCreator() {
        return this._defaultCreator;
    }

    public AnnotatedWithParams getDelegateCreator() {
        return this._delegateCreator;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return this._delegateType;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return this._constructorArguments;
    }

    public AnnotatedParameter getIncompleteParameter() {
        return this._incompleteParameter;
    }

    public Class<?> getValueClass() {
        return this._valueClass;
    }

    public String getValueTypeDesc() {
        return this._valueTypeDesc;
    }

    public AnnotatedWithParams getWithArgsCreator() {
        return this._withArgsCreator;
    }

    public JsonMappingException rewrapCtorProblem(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return wrapAsJsonMappingException(deserializationContext, th);
    }

    @Deprecated
    public JsonMappingException unwrapAndWrapException(DeserializationContext deserializationContext, Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof JsonMappingException) {
                return (JsonMappingException) th2;
            }
        }
        return deserializationContext.instantiationException(getValueClass(), th);
    }

    public JsonMappingException wrapAsJsonMappingException(DeserializationContext deserializationContext, Throwable th) {
        return th instanceof JsonMappingException ? (JsonMappingException) th : deserializationContext.instantiationException(getValueClass(), th);
    }

    @Deprecated
    public JsonMappingException wrapException(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof JsonMappingException) {
                return (JsonMappingException) th2;
            }
        }
        StringBuilder h = C0072d.m201h("Instantiation of ");
        h.append(getValueTypeDesc());
        h.append(" value failed: ");
        h.append(ClassUtil.exceptionMessage(th));
        return new JsonMappingException((Closeable) null, h.toString(), th);
    }

    public StdValueInstantiator(DeserializationConfig deserializationConfig, JavaType javaType) {
        String str;
        if (javaType == null) {
            str = "UNKNOWN TYPE";
        } else {
            str = javaType.toString();
        }
        this._valueTypeDesc = str;
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
    }

    public StdValueInstantiator(StdValueInstantiator stdValueInstantiator) {
        this._valueTypeDesc = stdValueInstantiator._valueTypeDesc;
        this._valueClass = stdValueInstantiator._valueClass;
        this._defaultCreator = stdValueInstantiator._defaultCreator;
        this._constructorArguments = stdValueInstantiator._constructorArguments;
        this._withArgsCreator = stdValueInstantiator._withArgsCreator;
        this._delegateType = stdValueInstantiator._delegateType;
        this._delegateCreator = stdValueInstantiator._delegateCreator;
        this._delegateArguments = stdValueInstantiator._delegateArguments;
        this._arrayDelegateType = stdValueInstantiator._arrayDelegateType;
        this._arrayDelegateCreator = stdValueInstantiator._arrayDelegateCreator;
        this._arrayDelegateArguments = stdValueInstantiator._arrayDelegateArguments;
        this._fromStringCreator = stdValueInstantiator._fromStringCreator;
        this._fromIntCreator = stdValueInstantiator._fromIntCreator;
        this._fromLongCreator = stdValueInstantiator._fromLongCreator;
        this._fromDoubleCreator = stdValueInstantiator._fromDoubleCreator;
        this._fromBooleanCreator = stdValueInstantiator._fromBooleanCreator;
    }
}
