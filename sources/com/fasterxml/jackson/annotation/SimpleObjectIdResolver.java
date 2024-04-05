package com.fasterxml.jackson.annotation;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.HashMap;
import java.util.Map;

public class SimpleObjectIdResolver implements ObjectIdResolver {
    public Map<ObjectIdGenerator.IdKey, Object> _items;

    public void bindItem(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this._items;
        if (map == null) {
            this._items = new HashMap();
        } else if (map.containsKey(idKey)) {
            StringBuilder h = C0072d.m201h("Already had POJO for id (");
            h.append(idKey.key.getClass().getName());
            h.append(") [");
            h.append(idKey);
            h.append("]");
            throw new IllegalStateException(h.toString());
        }
        this._items.put(idKey, obj);
    }

    public boolean canUseFor(ObjectIdResolver objectIdResolver) {
        return objectIdResolver.getClass() == getClass();
    }

    public ObjectIdResolver newForDeserialization(Object obj) {
        return new SimpleObjectIdResolver();
    }

    public Object resolveId(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this._items;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }
}
