package com.fasterxml.jackson.databind.deser;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BeanDeserializerBuilder {
    public SettableAnyProperty _anySetter;
    public HashMap<String, SettableBeanProperty> _backRefProperties;
    public final BeanDescription _beanDesc;
    public AnnotatedMethod _buildMethod;
    public JsonPOJOBuilder.Value _builderConfig;
    public final DeserializationConfig _config;
    public final DeserializationContext _context;
    public HashSet<String> _ignorableProps;
    public boolean _ignoreAllUnknown;
    public List<ValueInjector> _injectables;
    public ObjectIdReader _objectIdReader;
    public final Map<String, SettableBeanProperty> _properties;
    public ValueInstantiator _valueInstantiator;

    public BeanDeserializerBuilder(BeanDescription beanDescription, DeserializationContext deserializationContext) {
        this._properties = new LinkedHashMap();
        this._beanDesc = beanDescription;
        this._context = deserializationContext;
        this._config = deserializationContext.getConfig();
    }

    private static HashMap<String, SettableBeanProperty> _copy(HashMap<String, SettableBeanProperty> hashMap) {
        if (hashMap == null) {
            return null;
        }
        return new HashMap<>(hashMap);
    }

    public Map<String, List<PropertyName>> _collectAliases(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this._config.getAnnotationIntrospector();
        HashMap hashMap = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty next : collection) {
                List<PropertyName> findPropertyAliases = annotationIntrospector.findPropertyAliases(next.getMember());
                if (findPropertyAliases != null && !findPropertyAliases.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(next.getName(), findPropertyAliases);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }

    public void _fixAccess(Collection<SettableBeanProperty> collection) {
        if (this._config.canOverrideAccessModifiers()) {
            for (SettableBeanProperty fixAccess : collection) {
                fixAccess.fixAccess(this._config);
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null) {
            settableAnyProperty.fixAccess(this._config);
        }
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod != null) {
            annotatedMethod.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    public void addBackReferenceProperty(String str, SettableBeanProperty settableBeanProperty) {
        if (this._backRefProperties == null) {
            this._backRefProperties = new HashMap<>(4);
        }
        if (this._config.canOverrideAccessModifiers()) {
            settableBeanProperty.fixAccess(this._config);
        }
        this._backRefProperties.put(str, settableBeanProperty);
    }

    public void addCreatorProperty(SettableBeanProperty settableBeanProperty) {
        addProperty(settableBeanProperty);
    }

    public void addIgnorable(String str) {
        if (this._ignorableProps == null) {
            this._ignorableProps = new HashSet<>();
        }
        this._ignorableProps.add(str);
    }

    public void addInjectable(PropertyName propertyName, JavaType javaType, Annotations annotations, AnnotatedMember annotatedMember, Object obj) {
        if (this._injectables == null) {
            this._injectables = new ArrayList();
        }
        if (this._config.canOverrideAccessModifiers()) {
            annotatedMember.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        this._injectables.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    public void addOrReplaceProperty(SettableBeanProperty settableBeanProperty, boolean z) {
        this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    public void addProperty(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty put = this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
        if (put != null && put != settableBeanProperty) {
            StringBuilder h = C0072d.m201h("Duplicate property '");
            h.append(settableBeanProperty.getName());
            h.append("' for ");
            h.append(this._beanDesc.getType());
            throw new IllegalArgumentException(h.toString());
        }
    }

    public JsonDeserializer<?> build() {
        boolean z;
        Collection<SettableBeanProperty> values = this._properties.values();
        _fixAccess(values);
        BeanPropertyMap construct = BeanPropertyMap.construct((MapperConfig<?>) this._config, values, _collectAliases(values));
        construct.assignIndexes();
        boolean z2 = !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            Iterator<SettableBeanProperty> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().hasViews()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = z2;
        if (this._objectIdReader != null) {
            construct = construct.withProperty(new ObjectIdValueProperty(this._objectIdReader, PropertyMetadata.STD_REQUIRED));
        }
        return new BeanDeserializer(this, this._beanDesc, construct, this._backRefProperties, this._ignorableProps, this._ignoreAllUnknown, z);
    }

    public AbstractDeserializer buildAbstract() {
        return new AbstractDeserializer(this, this._beanDesc, this._backRefProperties, this._properties);
    }

    public JsonDeserializer<?> buildBuilderBased(JavaType javaType, String str) throws JsonMappingException {
        AnnotatedMethod annotatedMethod = this._buildMethod;
        boolean z = true;
        if (annotatedMethod != null) {
            Class<?> rawReturnType = annotatedMethod.getRawReturnType();
            Class<?> rawClass = javaType.getRawClass();
            if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                this._context.reportBadDefinition(this._beanDesc.getType(), String.format("Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)", new Object[]{this._buildMethod.getFullName(), rawReturnType.getName(), javaType.getRawClass().getName()}));
            }
        } else if (!str.isEmpty()) {
            this._context.reportBadDefinition(this._beanDesc.getType(), String.format("Builder class %s does not have build method (name: '%s')", new Object[]{this._beanDesc.getBeanClass().getName(), str}));
        }
        Collection<SettableBeanProperty> values = this._properties.values();
        _fixAccess(values);
        BeanPropertyMap construct = BeanPropertyMap.construct((MapperConfig<?>) this._config, values, _collectAliases(values));
        construct.assignIndexes();
        boolean z2 = !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            Iterator<SettableBeanProperty> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().hasViews()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = z2;
        if (this._objectIdReader != null) {
            construct = construct.withProperty(new ObjectIdValueProperty(this._objectIdReader, PropertyMetadata.STD_REQUIRED));
        }
        return createBuilderBasedDeserializer(javaType, construct, z);
    }

    public JsonDeserializer<?> createBuilderBasedDeserializer(JavaType javaType, BeanPropertyMap beanPropertyMap, boolean z) {
        return new BuilderBasedDeserializer(this, this._beanDesc, javaType, beanPropertyMap, this._backRefProperties, this._ignorableProps, this._ignoreAllUnknown, z);
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return this._properties.get(propertyName.getSimpleName());
    }

    public SettableAnyProperty getAnySetter() {
        return this._anySetter;
    }

    public AnnotatedMethod getBuildMethod() {
        return this._buildMethod;
    }

    public JsonPOJOBuilder.Value getBuilderConfig() {
        return this._builderConfig;
    }

    public List<ValueInjector> getInjectables() {
        return this._injectables;
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public Iterator<SettableBeanProperty> getProperties() {
        return this._properties.values().iterator();
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public boolean hasIgnorable(String str) {
        HashSet<String> hashSet = this._ignorableProps;
        return hashSet != null && hashSet.contains(str);
    }

    public boolean hasProperty(PropertyName propertyName) {
        return findProperty(propertyName) != null;
    }

    public SettableBeanProperty removeProperty(PropertyName propertyName) {
        return this._properties.remove(propertyName.getSimpleName());
    }

    public void setAnySetter(SettableAnyProperty settableAnyProperty) {
        if (this._anySetter == null || settableAnyProperty == null) {
            this._anySetter = settableAnyProperty;
            return;
        }
        throw new IllegalStateException("_anySetter already set to non-null");
    }

    public void setIgnoreUnknownProperties(boolean z) {
        this._ignoreAllUnknown = z;
    }

    public void setObjectIdReader(ObjectIdReader objectIdReader) {
        this._objectIdReader = objectIdReader;
    }

    public void setPOJOBuilder(AnnotatedMethod annotatedMethod, JsonPOJOBuilder.Value value) {
        this._buildMethod = annotatedMethod;
        this._builderConfig = value;
    }

    public void setValueInstantiator(ValueInstantiator valueInstantiator) {
        this._valueInstantiator = valueInstantiator;
    }

    private static <T> List<T> _copy(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public BeanDeserializerBuilder(BeanDeserializerBuilder beanDeserializerBuilder) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this._properties = linkedHashMap;
        this._beanDesc = beanDeserializerBuilder._beanDesc;
        this._context = beanDeserializerBuilder._context;
        this._config = beanDeserializerBuilder._config;
        linkedHashMap.putAll(beanDeserializerBuilder._properties);
        this._injectables = _copy(beanDeserializerBuilder._injectables);
        this._backRefProperties = _copy(beanDeserializerBuilder._backRefProperties);
        this._ignorableProps = beanDeserializerBuilder._ignorableProps;
        this._valueInstantiator = beanDeserializerBuilder._valueInstantiator;
        this._objectIdReader = beanDeserializerBuilder._objectIdReader;
        this._anySetter = beanDeserializerBuilder._anySetter;
        this._ignoreAllUnknown = beanDeserializerBuilder._ignoreAllUnknown;
        this._buildMethod = beanDeserializerBuilder._buildMethod;
        this._builderConfig = beanDeserializerBuilder._builderConfig;
    }
}
