package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class JDKValueInstantiators {

    public static class ArrayListInstantiator extends ValueInstantiator.Base {
        public static final ArrayListInstantiator INSTANCE = new ArrayListInstantiator();
        private static final long serialVersionUID = 2;

        public ArrayListInstantiator() {
            super((Class<?>) ArrayList.class);
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new ArrayList();
        }
    }

    public static class ConstantValueInstantiator extends ValueInstantiator.Base {
        private static final long serialVersionUID = 2;
        public final Object _value;

        public ConstantValueInstantiator(Object obj) {
            super(obj.getClass());
            this._value = obj;
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return this._value;
        }
    }

    public static class HashMapInstantiator extends ValueInstantiator.Base {
        public static final HashMapInstantiator INSTANCE = new HashMapInstantiator();
        private static final long serialVersionUID = 2;

        public HashMapInstantiator() {
            super((Class<?>) HashMap.class);
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new HashMap();
        }
    }

    public static class LinkedHashMapInstantiator extends ValueInstantiator.Base {
        public static final LinkedHashMapInstantiator INSTANCE = new LinkedHashMapInstantiator();
        private static final long serialVersionUID = 2;

        public LinkedHashMapInstantiator() {
            super((Class<?>) LinkedHashMap.class);
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new LinkedHashMap();
        }
    }

    public static ValueInstantiator findStdValueInstantiator(DeserializationConfig deserializationConfig, Class<?> cls) {
        if (cls == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return ArrayListInstantiator.INSTANCE;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new ConstantValueInstantiator(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new ConstantValueInstantiator(list);
            }
            return null;
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (cls == LinkedHashMap.class) {
                return LinkedHashMapInstantiator.INSTANCE;
            }
            if (cls == HashMap.class) {
                return HashMapInstantiator.INSTANCE;
            }
            if (Collections.EMPTY_MAP.getClass() == cls) {
                return new ConstantValueInstantiator(Collections.EMPTY_MAP);
            }
            return null;
        }
    }
}
