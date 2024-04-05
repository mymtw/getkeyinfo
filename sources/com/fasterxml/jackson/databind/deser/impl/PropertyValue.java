package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

public abstract class PropertyValue {
    public final PropertyValue next;
    public final Object value;

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.PropertyValue$a */
    public static final class C12525a extends PropertyValue {

        /* renamed from: a */
        public final SettableAnyProperty f27670a;

        /* renamed from: b */
        public final String f27671b;

        public C12525a(PropertyValue propertyValue, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(propertyValue, obj);
            this.f27670a = settableAnyProperty;
            this.f27671b = str;
        }

        public final void assign(Object obj) throws IOException, JsonProcessingException {
            this.f27670a.set(obj, this.f27671b, this.value);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.PropertyValue$b */
    public static final class C12526b extends PropertyValue {

        /* renamed from: a */
        public final Object f27672a;

        public C12526b(PropertyValue propertyValue, Object obj, Object obj2) {
            super(propertyValue, obj);
            this.f27672a = obj2;
        }

        public final void assign(Object obj) throws IOException, JsonProcessingException {
            ((Map) obj).put(this.f27672a, this.value);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.PropertyValue$c */
    public static final class C12527c extends PropertyValue {

        /* renamed from: a */
        public final SettableBeanProperty f27673a;

        public C12527c(PropertyValue propertyValue, Object obj, SettableBeanProperty settableBeanProperty) {
            super(propertyValue, obj);
            this.f27673a = settableBeanProperty;
        }

        public final void assign(Object obj) throws IOException, JsonProcessingException {
            this.f27673a.set(obj, this.value);
        }
    }

    public PropertyValue(PropertyValue propertyValue, Object obj) {
        this.next = propertyValue;
        this.value = obj;
    }

    public abstract void assign(Object obj) throws IOException, JsonProcessingException;
}
