package com.fasterxml.jackson.databind.module;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class SimpleAbstractTypeResolver extends AbstractTypeResolver implements Serializable {
    private static final long serialVersionUID = 1;
    public final HashMap<ClassKey, Class<?>> _mappings = new HashMap<>();

    public <T> SimpleAbstractTypeResolver addMapping(Class<T> cls, Class<? extends T> cls2) {
        if (cls == cls2) {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        } else if (!cls.isAssignableFrom(cls2)) {
            StringBuilder h = C0072d.m201h("Cannot add mapping from class ");
            h.append(cls.getName());
            h.append(" to ");
            h.append(cls2.getName());
            h.append(", as latter is not a subtype of former");
            throw new IllegalArgumentException(h.toString());
        } else if (Modifier.isAbstract(cls.getModifiers())) {
            this._mappings.put(new ClassKey(cls), cls2);
            return this;
        } else {
            throw new IllegalArgumentException(C0326j.m863h(cls, C0072d.m201h("Cannot add mapping from class "), " since it is not abstract"));
        }
    }

    public JavaType findTypeMapping(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class cls = this._mappings.get(new ClassKey(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, cls);
    }

    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return null;
    }

    @Deprecated
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        return null;
    }
}
