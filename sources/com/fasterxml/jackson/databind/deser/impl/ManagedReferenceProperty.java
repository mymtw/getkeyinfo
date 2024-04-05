package com.fasterxml.jackson.databind.deser.impl;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import p003a2.C0023f;

public final class ManagedReferenceProperty extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;
    public final SettableBeanProperty _backProperty;
    public final boolean _isContainer;
    public final String _referenceName;

    public ManagedReferenceProperty(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, boolean z) {
        super(settableBeanProperty);
        this._referenceName = str;
        this._backProperty = settableBeanProperty2;
        this._isContainer = z;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, this.delegate.deserialize(jsonParser, deserializationContext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this.delegate.fixAccess(deserializationConfig);
        this._backProperty.fixAccess(deserializationConfig);
    }

    public final void set(Object obj, Object obj2) throws IOException {
        setAndReturn(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            if (!this._isContainer) {
                this._backProperty.set(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this._backProperty.set(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object next : (Collection) obj2) {
                    if (next != null) {
                        this._backProperty.set(next, obj);
                    }
                }
            } else if (obj2 instanceof Map) {
                for (Object next2 : ((Map) obj2).values()) {
                    if (next2 != null) {
                        this._backProperty.set(next2, obj);
                    }
                }
            } else {
                StringBuilder h = C0072d.m201h("Unsupported container type (");
                h.append(obj2.getClass().getName());
                h.append(") when resolving reference '");
                throw new IllegalStateException(C0023f.m110k(h, this._referenceName, "'"));
            }
        }
        return this.delegate.setAndReturn(obj, obj2);
    }

    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        throw new IllegalStateException("Should never try to reset delegate");
    }
}
