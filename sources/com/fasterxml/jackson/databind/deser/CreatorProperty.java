package com.fasterxml.jackson.databind.deser;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class CreatorProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedParameter _annotated;
    public final int _creatorIndex;
    public SettableBeanProperty _fallbackSetter;
    public boolean _ignorable;
    public final JacksonInject.Value _injectableValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, typeDeserializer, annotations, propertyMetadata);
        this._annotated = annotatedParameter;
        this._creatorIndex = i;
        this._injectableValue = value;
        this._fallbackSetter = null;
    }

    private void _reportMissingSetter(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        StringBuilder h = C0072d.m201h("No fallback setter/field defined for creator property '");
        h.append(getName());
        h.append("'");
        String sb = h.toString();
        if (deserializationContext != null) {
            deserializationContext.reportBadDefinition(getType(), sb);
            return;
        }
        throw InvalidDefinitionException.from(jsonParser, sb, getType());
    }

    private final void _verifySetter() throws IOException {
        if (this._fallbackSetter == null) {
            _reportMissingSetter((JsonParser) null, (DeserializationContext) null);
        }
    }

    public static CreatorProperty construct(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        return new CreatorProperty(propertyName, javaType, propertyName2, typeDeserializer, annotations, annotatedParameter, i, value, propertyMetadata);
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        _verifySetter();
        this._fallbackSetter.set(obj, deserialize(jsonParser, deserializationContext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        _verifySetter();
        return this._fallbackSetter.setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Deprecated
    public Object findInjectableValue(DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        if (this._injectableValue == null) {
            deserializationContext.reportBadDefinition(ClassUtil.classOf(obj), String.format("Property '%s' (type %s) has no injectable value id configured", new Object[]{getName(), getClass().getName()}));
        }
        return deserializationContext.findInjectableValue(this._injectableValue.getId(), this, obj);
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedParameter annotatedParameter = this._annotated;
        if (annotatedParameter == null) {
            return null;
        }
        return annotatedParameter.getAnnotation(cls);
    }

    public int getCreatorIndex() {
        return this._creatorIndex;
    }

    public Object getInjectableValueId() {
        JacksonInject.Value value = this._injectableValue;
        if (value == null) {
            return null;
        }
        return value.getId();
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public PropertyMetadata getMetadata() {
        PropertyMetadata metadata = super.getMetadata();
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        return settableBeanProperty != null ? metadata.withMergeInfo(settableBeanProperty.getMetadata().getMergeInfo()) : metadata;
    }

    @Deprecated
    public void inject(DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, findInjectableValue(deserializationContext, obj));
    }

    public boolean isIgnorable() {
        return this._ignorable;
    }

    public boolean isInjectionOnly() {
        JacksonInject.Value value = this._injectableValue;
        return value != null && !value.willUseInput(true);
    }

    public void markAsIgnorable() {
        this._ignorable = true;
    }

    public void set(Object obj, Object obj2) throws IOException {
        _verifySetter();
        this._fallbackSetter.set(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        _verifySetter();
        return this._fallbackSetter.setAndReturn(obj, obj2);
    }

    public void setFallbackSetter(SettableBeanProperty settableBeanProperty) {
        this._fallbackSetter = settableBeanProperty;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[creator property, name '");
        h.append(getName());
        h.append("'; inject id '");
        h.append(getInjectableValueId());
        h.append("']");
        return h.toString();
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new CreatorProperty(this, this._valueDeserializer, nullValueProvider);
    }

    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        JsonDeserializer<Object> jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this._nullProvider;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new CreatorProperty(this, jsonDeserializer, nullValueProvider);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CreatorProperty(com.fasterxml.jackson.databind.PropertyName r13, com.fasterxml.jackson.databind.JavaType r14, com.fasterxml.jackson.databind.PropertyName r15, com.fasterxml.jackson.databind.jsontype.TypeDeserializer r16, com.fasterxml.jackson.databind.util.Annotations r17, com.fasterxml.jackson.databind.introspect.AnnotatedParameter r18, int r19, java.lang.Object r20, com.fasterxml.jackson.databind.PropertyMetadata r21) {
        /*
            r12 = this;
            r0 = r20
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x000a
        L_0x0006:
            com.fasterxml.jackson.annotation.JacksonInject$Value r1 = com.fasterxml.jackson.annotation.JacksonInject.Value.construct(r0, r1)
        L_0x000a:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r11 = r21
            r2.<init>((com.fasterxml.jackson.databind.PropertyName) r3, (com.fasterxml.jackson.databind.JavaType) r4, (com.fasterxml.jackson.databind.PropertyName) r5, (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r6, (com.fasterxml.jackson.databind.util.Annotations) r7, (com.fasterxml.jackson.databind.introspect.AnnotatedParameter) r8, (int) r9, (com.fasterxml.jackson.annotation.JacksonInject.Value) r10, (com.fasterxml.jackson.databind.PropertyMetadata) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.CreatorProperty.<init>(com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, com.fasterxml.jackson.databind.util.Annotations, com.fasterxml.jackson.databind.introspect.AnnotatedParameter, int, java.lang.Object, com.fasterxml.jackson.databind.PropertyMetadata):void");
    }

    public CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }

    public CreatorProperty(CreatorProperty creatorProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(creatorProperty, jsonDeserializer, nullValueProvider);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }
}
