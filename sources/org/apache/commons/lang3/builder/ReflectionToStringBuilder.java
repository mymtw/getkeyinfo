package org.apache.commons.lang3.builder;

import android.support.p013v4.media.C0072d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.lang3.ArrayUtils;

public class ReflectionToStringBuilder extends ToStringBuilder {
    private boolean appendStatics = false;
    private boolean appendTransients = false;
    public String[] excludeFieldNames;
    private Class<?> upToClass = null;

    public ReflectionToStringBuilder(Object obj) {
        super(obj);
    }

    public static String[] toNoNullStringArray(Collection<String> collection) {
        if (collection == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        return toNoNullStringArray(collection.toArray());
    }

    public static String toString(Object obj) {
        return toString(obj, (ToStringStyle) null, false, false, (Class) null);
    }

    public static String toStringExclude(Object obj, Collection<String> collection) {
        return toStringExclude(obj, toNoNullStringArray(collection));
    }

    public boolean accept(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !isAppendTransients()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !isAppendStatics()) {
            return false;
        }
        String[] strArr = this.excludeFieldNames;
        return strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0;
    }

    public void appendFieldsIn(Class<?> cls) {
        if (cls.isArray()) {
            reflectionAppendArray(getObject());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (accept(field)) {
                try {
                    append(name, getValue(field));
                } catch (IllegalAccessException e) {
                    StringBuilder h = C0072d.m201h("Unexpected IllegalAccessException: ");
                    h.append(e.getMessage());
                    throw new InternalError(h.toString());
                }
            }
        }
    }

    public String[] getExcludeFieldNames() {
        return (String[]) this.excludeFieldNames.clone();
    }

    public Class<?> getUpToClass() {
        return this.upToClass;
    }

    public Object getValue(Field field) throws IllegalArgumentException, IllegalAccessException {
        return field.get(getObject());
    }

    public boolean isAppendStatics() {
        return this.appendStatics;
    }

    public boolean isAppendTransients() {
        return this.appendTransients;
    }

    public ReflectionToStringBuilder reflectionAppendArray(Object obj) {
        getStyle().reflectionAppendArrayDetail(getStringBuffer(), (String) null, obj);
        return this;
    }

    public void setAppendStatics(boolean z) {
        this.appendStatics = z;
    }

    public void setAppendTransients(boolean z) {
        this.appendTransients = z;
    }

    public ReflectionToStringBuilder setExcludeFieldNames(String... strArr) {
        if (strArr == null) {
            this.excludeFieldNames = null;
        } else {
            String[] noNullStringArray = toNoNullStringArray((Object[]) strArr);
            this.excludeFieldNames = noNullStringArray;
            Arrays.sort(noNullStringArray);
        }
        return this;
    }

    public void setUpToClass(Class<?> cls) {
        Object object;
        if (cls == null || (object = getObject()) == null || cls.isInstance(object)) {
            this.upToClass = cls;
            return;
        }
        throw new IllegalArgumentException("Specified class is not a superclass of the object");
    }

    public static String toString(Object obj, ToStringStyle toStringStyle) {
        return toString(obj, toStringStyle, false, false, (Class) null);
    }

    public static String toStringExclude(Object obj, String... strArr) {
        return new ReflectionToStringBuilder(obj).setExcludeFieldNames(strArr).toString();
    }

    public static String[] toNoNullStringArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z) {
        return toString(obj, toStringStyle, z, false, (Class) null);
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z, boolean z2) {
        return toString(obj, toStringStyle, z, z2, (Class) null);
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle) {
        super(obj, toStringStyle);
    }

    public static <T> String toString(T t, ToStringStyle toStringStyle, boolean z, boolean z2, Class<? super T> cls) {
        return new ReflectionToStringBuilder(t, toStringStyle, (StringBuffer) null, cls, z, z2).toString();
    }

    public String toString() {
        if (getObject() == null) {
            return getStyle().getNullText();
        }
        Class<?> cls = getObject().getClass();
        appendFieldsIn(cls);
        while (cls.getSuperclass() != null && cls != getUpToClass()) {
            cls = cls.getSuperclass();
            appendFieldsIn(cls);
        }
        return super.toString();
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        super(obj, toStringStyle, stringBuffer);
    }

    public <T> ReflectionToStringBuilder(T t, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(t, toStringStyle, stringBuffer);
        setUpToClass(cls);
        setAppendTransients(z);
        setAppendStatics(z2);
    }
}
