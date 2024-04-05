package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class ObjectIdInfo {
    private static final ObjectIdInfo EMPTY = new ObjectIdInfo(PropertyName.NO_NAME, Object.class, (Class<? extends ObjectIdGenerator<?>>) null, false, (Class<? extends ObjectIdResolver>) null);
    public final boolean _alwaysAsId;
    public final Class<? extends ObjectIdGenerator<?>> _generator;
    public final PropertyName _propertyName;
    public final Class<? extends ObjectIdResolver> _resolver;
    public final Class<?> _scope;

    public ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends ObjectIdResolver> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    public static ObjectIdInfo empty() {
        return EMPTY;
    }

    public boolean getAlwaysAsId() {
        return this._alwaysAsId;
    }

    public Class<? extends ObjectIdGenerator<?>> getGeneratorType() {
        return this._generator;
    }

    public PropertyName getPropertyName() {
        return this._propertyName;
    }

    public Class<? extends ObjectIdResolver> getResolverType() {
        return this._resolver;
    }

    public Class<?> getScope() {
        return this._scope;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ObjectIdInfo: propName=");
        h.append(this._propertyName);
        h.append(", scope=");
        h.append(ClassUtil.nameOf(this._scope));
        h.append(", generatorType=");
        h.append(ClassUtil.nameOf((Class<?>) this._generator));
        h.append(", alwaysAsId=");
        h.append(this._alwaysAsId);
        return h.toString();
    }

    public ObjectIdInfo withAlwaysAsId(boolean z) {
        if (this._alwaysAsId == z) {
            return this;
        }
        return new ObjectIdInfo(this._propertyName, this._scope, this._generator, z, this._resolver);
    }

    public ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z) {
        this(propertyName, cls, cls2, z, SimpleObjectIdResolver.class);
    }

    public ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z, Class<? extends ObjectIdResolver> cls3) {
        this._propertyName = propertyName;
        this._scope = cls;
        this._generator = cls2;
        this._alwaysAsId = z;
        this._resolver = cls3 == null ? SimpleObjectIdResolver.class : cls3;
    }
}
