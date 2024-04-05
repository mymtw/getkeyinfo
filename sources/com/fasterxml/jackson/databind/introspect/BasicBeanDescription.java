package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.C0048b;
import p504ai.C13983i;

public class BasicBeanDescription extends BeanDescription {
    private static final Class<?>[] NO_VIEWS = new Class[0];
    public final AnnotationIntrospector _annotationIntrospector;
    public final AnnotatedClass _classInfo;
    public final MapperConfig<?> _config;
    public Class<?>[] _defaultViews;
    public boolean _defaultViewsResolved;
    public ObjectIdInfo _objectIdInfo;
    public final POJOPropertiesCollector _propCollector;
    public List<BeanPropertyDefinition> _properties;

    public BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector, JavaType javaType, AnnotatedClass annotatedClass) {
        super(javaType);
        this._propCollector = pOJOPropertiesCollector;
        MapperConfig<?> config = pOJOPropertiesCollector.getConfig();
        this._config = config;
        if (config == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = config.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
    }

    public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public static BasicBeanDescription forOtherUse(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass) {
        return new BasicBeanDescription(mapperConfig, javaType, annotatedClass, Collections.emptyList());
    }

    public static BasicBeanDescription forSerialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public Converter<Object, Object> _createConverter(Object obj) {
        Converter<?, ?> converter = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class<Converter.None> cls = (Class) obj;
            if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    converter = handlerInstantiator.converterInstance(this._config, this._classInfo, cls);
                }
                return converter == null ? (Converter) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : converter;
            }
            throw new IllegalStateException(C0326j.m863h(cls, C0072d.m201h("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(C13983i.m21493l(obj, C0072d.m201h("AnnotationIntrospector returned Converter definition of type "), "; expected type Converter or Class<Converter> instead"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r3 = r2._annotationIntrospector.findImplicitPropertyName(r3);
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.PropertyName _findCreatorPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedParameter r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r2._annotationIntrospector
            com.fasterxml.jackson.databind.PropertyName r0 = r0.findNameForDeserialization(r3)
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0020
        L_0x000e:
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r2._annotationIntrospector
            java.lang.String r3 = r1.findImplicitPropertyName(r3)
            if (r3 == 0) goto L_0x0020
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0020
            com.fasterxml.jackson.databind.PropertyName r0 = com.fasterxml.jackson.databind.PropertyName.construct(r3)
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findCreatorPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedParameter):com.fasterxml.jackson.databind.PropertyName");
    }

    @Deprecated
    public LinkedHashMap<String, AnnotatedField> _findPropertyFields(Collection<String> collection, boolean z) {
        LinkedHashMap<String, AnnotatedField> linkedHashMap = new LinkedHashMap<>();
        for (BeanPropertyDefinition next : _properties()) {
            AnnotatedField field = next.getField();
            if (field != null) {
                String name = next.getName();
                if (collection == null || !collection.contains(name)) {
                    linkedHashMap.put(name, field);
                }
            }
        }
        return linkedHashMap;
    }

    public List<BeanPropertyDefinition> _properties() {
        if (this._properties == null) {
            this._properties = this._propCollector.getProperties();
        }
        return this._properties;
    }

    public boolean addProperty(BeanPropertyDefinition beanPropertyDefinition) {
        if (hasProperty(beanPropertyDefinition.getFullName())) {
            return false;
        }
        _properties().add(beanPropertyDefinition);
        return true;
    }

    @Deprecated
    public TypeBindings bindingsForBeanType() {
        return this._type.getBindings();
    }

    public AnnotatedMember findAnyGetter() throws IllegalArgumentException {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        AnnotatedMember anyGetter = pOJOPropertiesCollector == null ? null : pOJOPropertiesCollector.getAnyGetter();
        if (anyGetter != null) {
            if (!Map.class.isAssignableFrom(anyGetter.getRawType())) {
                StringBuilder h = C0072d.m201h("Invalid 'any-getter' annotation on method ");
                h.append(anyGetter.getName());
                h.append("(): return type is not instance of java.util.Map");
                throw new IllegalArgumentException(h.toString());
            }
        }
        return anyGetter;
    }

    public AnnotatedMember findAnySetterAccessor() throws IllegalArgumentException {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        AnnotatedMethod anySetterMethod = pOJOPropertiesCollector.getAnySetterMethod();
        if (anySetterMethod != null) {
            Class<?> rawParameterType = anySetterMethod.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return anySetterMethod;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", new Object[]{anySetterMethod.getName(), rawParameterType.getName()}));
        }
        AnnotatedMember anySetterField = this._propCollector.getAnySetterField();
        if (anySetterField == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(anySetterField.getRawType())) {
            return anySetterField;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", new Object[]{anySetterField.getName()}));
    }

    @Deprecated
    public Map<String, AnnotatedMember> findBackReferenceProperties() {
        List<BeanPropertyDefinition> findBackReferences = findBackReferences();
        if (findBackReferences == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (BeanPropertyDefinition next : findBackReferences) {
            hashMap.put(next.getName(), next.getMutator());
        }
        return hashMap;
    }

    public List<BeanPropertyDefinition> findBackReferences() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (BeanPropertyDefinition next : _properties()) {
            AnnotationIntrospector.ReferenceProperty findReferenceType = next.findReferenceType();
            if (findReferenceType != null && findReferenceType.isBackReference()) {
                String name = findReferenceType.getName();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(name);
                } else if (!hashSet.add(name)) {
                    throw new IllegalArgumentException(C0048b.m163a("Multiple back-reference properties with name '", name, "'"));
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String findClassDescription() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findClassDescription(this._classInfo);
    }

    public AnnotatedConstructor findDefaultConstructor() {
        return this._classInfo.getDefaultConstructor();
    }

    public Class<?>[] findDefaultViews() {
        if (!this._defaultViewsResolved) {
            this._defaultViewsResolved = true;
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            Class<?>[] findViews = annotationIntrospector == null ? null : annotationIntrospector.findViews(this._classInfo);
            if (findViews == null && !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                findViews = NO_VIEWS;
            }
            this._defaultViews = findViews;
        }
        return this._defaultViews;
    }

    public Converter<Object, Object> findDeserializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findDeserializationConverter(this._classInfo));
    }

    public JsonFormat.Value findExpectedFormat(JsonFormat.Value value) {
        JsonFormat.Value findFormat;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (!(annotationIntrospector == null || (findFormat = annotationIntrospector.findFormat(this._classInfo)) == null)) {
            value = value == null ? findFormat : value.withOverrides(findFormat);
        }
        JsonFormat.Value defaultPropertyFormat = this._config.getDefaultPropertyFormat(this._classInfo.getRawType());
        return defaultPropertyFormat != null ? value == null ? defaultPropertyFormat : value.withOverrides(defaultPropertyFormat) : value;
    }

    public Method findFactoryMethod(Class<?>... clsArr) {
        for (AnnotatedMethod next : this._classInfo.getFactoryMethods()) {
            if (isFactoryMethod(next) && next.getParameterCount() == 1) {
                Class<?> rawParameterType = next.getRawParameterType(0);
                for (Class<?> isAssignableFrom : clsArr) {
                    if (rawParameterType.isAssignableFrom(isAssignableFrom)) {
                        return next.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Map<Object, AnnotatedMember> findInjectables() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        return pOJOPropertiesCollector != null ? pOJOPropertiesCollector.getInjectables() : Collections.emptyMap();
    }

    public AnnotatedMember findJsonValueAccessor() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        return pOJOPropertiesCollector.getJsonValueAccessor();
    }

    @Deprecated
    public AnnotatedMethod findJsonValueMethod() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        return pOJOPropertiesCollector.getJsonValueMethod();
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return this._classInfo.findMethod(str, clsArr);
    }

    public Class<?> findPOJOBuilder() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this._classInfo);
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this._classInfo);
    }

    public List<BeanPropertyDefinition> findProperties() {
        return _properties();
    }

    public BeanPropertyDefinition findProperty(PropertyName propertyName) {
        for (BeanPropertyDefinition next : _properties()) {
            if (next.hasName(propertyName)) {
                return next;
            }
        }
        return null;
    }

    public JsonInclude.Value findPropertyInclusion(JsonInclude.Value value) {
        JsonInclude.Value findPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        return (annotationIntrospector == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(this._classInfo)) == null) ? value : value == null ? findPropertyInclusion : value.withOverrides(findPropertyInclusion);
    }

    public Converter<Object, Object> findSerializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findSerializationConverter(this._classInfo));
    }

    public Constructor<?> findSingleArgConstructor(Class<?>... clsArr) {
        for (AnnotatedConstructor next : this._classInfo.getConstructors()) {
            if (next.getParameterCount() == 1) {
                Class<?> rawParameterType = next.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return next.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Annotations getClassAnnotations() {
        return this._classInfo.getAnnotations();
    }

    public AnnotatedClass getClassInfo() {
        return this._classInfo;
    }

    public List<AnnotatedConstructor> getConstructors() {
        return this._classInfo.getConstructors();
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        List<AnnotatedMethod> factoryMethods = this._classInfo.getFactoryMethods();
        if (factoryMethods.isEmpty()) {
            return factoryMethods;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod next : factoryMethods) {
            if (isFactoryMethod(next)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public Set<String> getIgnoredPropertyNames() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        Set<String> ignoredPropertyNames = pOJOPropertiesCollector == null ? null : pOJOPropertiesCollector.getIgnoredPropertyNames();
        return ignoredPropertyNames == null ? Collections.emptySet() : ignoredPropertyNames;
    }

    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public boolean hasKnownClassAnnotations() {
        return this._classInfo.hasAnnotations();
    }

    public boolean hasProperty(PropertyName propertyName) {
        return findProperty(propertyName) != null;
    }

    public Object instantiateBean(boolean z) {
        AnnotatedConstructor defaultConstructor = this._classInfo.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z) {
            defaultConstructor.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return defaultConstructor.getAnnotated().newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            ClassUtil.throwIfError(e);
            ClassUtil.throwIfRTE(e);
            StringBuilder h = C0072d.m201h("Failed to instantiate bean of type ");
            h.append(this._classInfo.getAnnotated().getName());
            h.append(": (");
            h.append(e.getClass().getName());
            h.append(") ");
            h.append(ClassUtil.exceptionMessage(e));
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5 = r5.getRawParameterType(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isFactoryMethod(com.fasterxml.jackson.databind.introspect.AnnotatedMethod r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r5.getRawReturnType()
            java.lang.Class r1 = r4.getBeanClass()
            boolean r0 = r1.isAssignableFrom(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r4._annotationIntrospector
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r4._config
            com.fasterxml.jackson.annotation.JsonCreator$Mode r0 = r0.findCreatorAnnotation(r2, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0020
            com.fasterxml.jackson.annotation.JsonCreator$Mode r3 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r0 == r3) goto L_0x0020
            return r2
        L_0x0020:
            java.lang.String r0 = r5.getName()
            java.lang.String r3 = "valueOf"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0033
            int r3 = r5.getParameterCount()
            if (r3 != r2) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.String r3 = "fromString"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0052
            int r0 = r5.getParameterCount()
            if (r0 != r2) goto L_0x0052
            java.lang.Class r5 = r5.getRawParameterType(r1)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 == r0) goto L_0x0051
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r5 = r0.isAssignableFrom(r5)
            if (r5 == 0) goto L_0x0052
        L_0x0051:
            return r2
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.BasicBeanDescription.isFactoryMethod(com.fasterxml.jackson.databind.introspect.AnnotatedMethod):boolean");
    }

    public boolean removeProperty(String str) {
        Iterator<BeanPropertyDefinition> it = _properties().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public JavaType resolveType(Type type) {
        if (type == null) {
            return null;
        }
        return this._config.getTypeFactory().constructType(type, this._type.getBindings());
    }

    public BasicBeanDescription(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass, List<BeanPropertyDefinition> list) {
        super(javaType);
        this._propCollector = null;
        this._config = mapperConfig;
        if (mapperConfig == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
        this._properties = list;
    }

    public BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector) {
        this(pOJOPropertiesCollector, pOJOPropertiesCollector.getType(), pOJOPropertiesCollector.getClassDef());
        this._objectIdInfo = pOJOPropertiesCollector.getObjectIdInfo();
    }
}
