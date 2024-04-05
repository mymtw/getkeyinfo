package com.fasterxml.jackson.databind.ser;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BeanSerializerFactory extends BasicSerializerFactory {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory((SerializerFactoryConfig) null);
    private static final long serialVersionUID = 1;

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    public BeanPropertyWriter _constructWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, PropertyBuilder propertyBuilder, boolean z, AnnotatedMember annotatedMember) throws JsonMappingException {
        SerializerProvider serializerProvider2 = serializerProvider;
        AnnotatedMember annotatedMember2 = annotatedMember;
        PropertyName fullName = beanPropertyDefinition.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(fullName, type, beanPropertyDefinition.getWrapperName(), annotatedMember, beanPropertyDefinition.getMetadata());
        JsonSerializer<Object> findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMember2);
        if (findSerializerFromAnnotation instanceof ResolvableSerializer) {
            ((ResolvableSerializer) findSerializerFromAnnotation).resolve(serializerProvider);
        }
        JsonSerializer<?> handlePrimaryContextualization = serializerProvider.handlePrimaryContextualization(findSerializerFromAnnotation, std);
        TypeSerializer typeSerializer = null;
        if (type.isContainerType() || type.isReferenceType()) {
            typeSerializer = findPropertyContentTypeSerializer(type, serializerProvider.getConfig(), annotatedMember2);
        }
        TypeSerializer typeSerializer2 = typeSerializer;
        return propertyBuilder.buildWriter(serializerProvider, beanPropertyDefinition, type, handlePrimaryContextualization, findPropertyTypeSerializer(type, serializerProvider.getConfig(), annotatedMember2), typeSerializer2, annotatedMember, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e A[LOOP:0: B:11:0x002e->B:14:0x003e, LOOP_START, PHI: r2 
      PHI: (r2v1 com.fasterxml.jackson.databind.JsonSerializer) = (r2v0 com.fasterxml.jackson.databind.JsonSerializer), (r2v5 com.fasterxml.jackson.databind.JsonSerializer) binds: [B:10:0x0026, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> _createSerializer2(com.fasterxml.jackson.databind.SerializerProvider r5, com.fasterxml.jackson.databind.JavaType r6, com.fasterxml.jackson.databind.BeanDescription r7, boolean r8) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.SerializationConfig r0 = r5.getConfig()
            boolean r1 = r6.isContainerType()
            r2 = 0
            if (r1 == 0) goto L_0x0018
            if (r8 != 0) goto L_0x0011
            boolean r8 = r4.usesStaticTyping(r0, r7, r2)
        L_0x0011:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.buildContainerSerializer(r5, r6, r7, r8)
            if (r1 == 0) goto L_0x0047
            return r1
        L_0x0018:
            boolean r1 = r6.isReferenceType()
            if (r1 == 0) goto L_0x0026
            r1 = r6
            com.fasterxml.jackson.databind.type.ReferenceType r1 = (com.fasterxml.jackson.databind.type.ReferenceType) r1
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.findReferenceSerializer(r5, r1, r7, r8)
            goto L_0x0041
        L_0x0026:
            java.lang.Iterable r1 = r4.customSerializers()
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.Serializers r2 = (com.fasterxml.jackson.databind.ser.Serializers) r2
            com.fasterxml.jackson.databind.JsonSerializer r2 = r2.findSerializer(r0, r6, r7)
            if (r2 == 0) goto L_0x002e
        L_0x0040:
            r1 = r2
        L_0x0041:
            if (r1 != 0) goto L_0x0047
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.findSerializerByAnnotations(r5, r6, r7)
        L_0x0047:
            if (r1 != 0) goto L_0x0063
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.findSerializerByLookup(r6, r0, r7, r8)
            if (r1 != 0) goto L_0x0063
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.findSerializerByPrimaryType(r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0063
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.findBeanOrAddOnSerializer(r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0063
            java.lang.Class r6 = r7.getBeanClass()
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.getUnknownTypeSerializer(r6)
        L_0x0063:
            if (r1 == 0) goto L_0x0088
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r5 = r4._factoryConfig
            boolean r5 = r5.hasSerializerModifiers()
            if (r5 == 0) goto L_0x0088
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r5 = r4._factoryConfig
            java.lang.Iterable r5 = r5.serializerModifiers()
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r5.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r6 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r6
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.modifySerializer(r0, r7, r1)
            goto L_0x0077
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public JsonSerializer<Object> constructBeanOrAddOnSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        SerializerProvider serializerProvider2 = serializerProvider;
        BeanDescription beanDescription2 = beanDescription;
        Class<Object> cls = Object.class;
        if (beanDescription.getBeanClass() == cls) {
            return serializerProvider2.getUnknownTypeSerializer(cls);
        }
        SerializationConfig config = serializerProvider.getConfig();
        BeanSerializerBuilder constructBeanSerializerBuilder = constructBeanSerializerBuilder(beanDescription2);
        constructBeanSerializerBuilder.setConfig(config);
        List<BeanPropertyWriter> findBeanProperties = findBeanProperties(serializerProvider2, beanDescription2, constructBeanSerializerBuilder);
        List<BeanPropertyWriter> arrayList = findBeanProperties == null ? new ArrayList<>() : removeOverlappingTypeIds(serializerProvider2, beanDescription2, constructBeanSerializerBuilder, findBeanProperties);
        serializerProvider.getAnnotationIntrospector().findAndAddVirtualProperties(config, beanDescription.getClassInfo(), arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier changeProperties : this._factoryConfig.serializerModifiers()) {
                arrayList = changeProperties.changeProperties(config, beanDescription2, arrayList);
            }
        }
        List<BeanPropertyWriter> filterBeanProperties = filterBeanProperties(config, beanDescription2, arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier orderProperties : this._factoryConfig.serializerModifiers()) {
                filterBeanProperties = orderProperties.orderProperties(config, beanDescription2, filterBeanProperties);
            }
        }
        constructBeanSerializerBuilder.setObjectIdWriter(constructObjectIdHandler(serializerProvider2, beanDescription2, filterBeanProperties));
        constructBeanSerializerBuilder.setProperties(filterBeanProperties);
        constructBeanSerializerBuilder.setFilterId(findFilterId(config, beanDescription2));
        AnnotatedMember findAnyGetter = beanDescription.findAnyGetter();
        if (findAnyGetter != null) {
            JavaType type = findAnyGetter.getType();
            JavaType contentType = type.getContentType();
            TypeSerializer createTypeSerializer = createTypeSerializer(config, contentType);
            JsonSerializer findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider2, findAnyGetter);
            if (findSerializerFromAnnotation == null) {
                findSerializerFromAnnotation = MapSerializer.construct((Set<String>) null, type, config.isEnabled(MapperFeature.USE_STATIC_TYPING), createTypeSerializer, (JsonSerializer<Object>) null, (JsonSerializer<Object>) null, (Object) null);
            }
            constructBeanSerializerBuilder.setAnyGetter(new AnyGetterWriter(new BeanProperty.Std(PropertyName.construct(findAnyGetter.getName()), contentType, (PropertyName) null, findAnyGetter, PropertyMetadata.STD_OPTIONAL), findAnyGetter, findSerializerFromAnnotation));
        }
        processViews(config, constructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier updateBuilder : this._factoryConfig.serializerModifiers()) {
                constructBeanSerializerBuilder = updateBuilder.updateBuilder(config, beanDescription2, constructBeanSerializerBuilder);
            }
        }
        try {
            JsonSerializer<?> build = constructBeanSerializerBuilder.build();
            return (build == null && (build = findSerializerByAddonType(config, javaType, beanDescription2, z)) == null && beanDescription.hasKnownClassAnnotations()) ? constructBeanSerializerBuilder.createDummy() : build;
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            return (JsonSerializer) serializerProvider2.reportBadTypeDefinition(beanDescription2, "Failed to construct BeanSerializer for %s: (%s) %s", beanDescription.getType(), runtimeException.getClass().getName(), runtimeException.getMessage());
        }
    }

    @Deprecated
    public JsonSerializer<Object> constructBeanSerializer(SerializerProvider serializerProvider, BeanDescription beanDescription) throws JsonMappingException {
        return constructBeanOrAddOnSerializer(serializerProvider, beanDescription.getType(), beanDescription, serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beanDescription) {
        return new BeanSerializerBuilder(beanDescription);
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.constructViewBased(beanPropertyWriter, clsArr);
    }

    public ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerProvider, BeanDescription beanDescription, List<BeanPropertyWriter> list) throws JsonMappingException {
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        if (generatorType == ObjectIdGenerators.PropertyGenerator.class) {
            String simpleName = objectIdInfo.getPropertyName().getSimpleName();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                BeanPropertyWriter beanPropertyWriter = list.get(i);
                if (simpleName.equals(beanPropertyWriter.getName())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, beanPropertyWriter);
                    }
                    return ObjectIdWriter.construct(beanPropertyWriter.getType(), (PropertyName) null, new PropertyBasedObjectIdGenerator(objectIdInfo, beanPropertyWriter), objectIdInfo.getAlwaysAsId());
                }
            }
            StringBuilder h = C0072d.m201h("Invalid Object Id definition for ");
            h.append(beanDescription.getBeanClass().getName());
            h.append(": cannot find property with name '");
            h.append(simpleName);
            h.append("'");
            throw new IllegalArgumentException(h.toString());
        }
        return ObjectIdWriter.construct(serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), (Class<?>) ObjectIdGenerator.class)[0], objectIdInfo.getPropertyName(), serializerProvider.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo), objectIdInfo.getAlwaysAsId());
    }

    public PropertyBuilder constructPropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return new PropertyBuilder(serializationConfig, beanDescription);
    }

    public JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws JsonMappingException {
        JavaType javaType2;
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription introspect = config.introspect(javaType);
        JsonSerializer findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, introspect.getClassInfo());
        if (findSerializerFromAnnotation != null) {
            return findSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaType2 = javaType;
        } else {
            try {
                javaType2 = annotationIntrospector.refineSerializationType(config, introspect.getClassInfo(), javaType);
            } catch (JsonMappingException e) {
                return (JsonSerializer) serializerProvider.reportBadTypeDefinition(introspect, e.getMessage(), new Object[0]);
            }
        }
        if (javaType2 != javaType) {
            if (!javaType2.hasRawClass(javaType.getRawClass())) {
                introspect = config.introspect(javaType2);
            }
            z = true;
        }
        Converter<Object, Object> findSerializationConverter = introspect.findSerializationConverter();
        if (findSerializationConverter == null) {
            return _createSerializer2(serializerProvider, javaType2, introspect, z);
        }
        JavaType outputType = findSerializationConverter.getOutputType(serializerProvider.getTypeFactory());
        if (!outputType.hasRawClass(javaType2.getRawClass())) {
            introspect = config.introspect(outputType);
            findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, introspect.getClassInfo());
        }
        if (findSerializerFromAnnotation == null && !outputType.isJavaLangObject()) {
            findSerializerFromAnnotation = _createSerializer2(serializerProvider, outputType, introspect, true);
        }
        return new StdDelegatingSerializer(findSerializationConverter, outputType, findSerializerFromAnnotation);
    }

    public Iterable<Serializers> customSerializers() {
        return this._factoryConfig.serializers();
    }

    public List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyWriter> list) {
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        if (defaultPropertyIgnorals != null) {
            Set<String> findIgnoredForSerialization = defaultPropertyIgnorals.findIgnoredForSerialization();
            if (!findIgnoredForSerialization.isEmpty()) {
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (it.hasNext()) {
                    if (findIgnoredForSerialization.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        }
        return list;
    }

    public JsonSerializer<Object> findBeanOrAddOnSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        if (isPotentialBeanType(javaType.getRawClass()) || ClassUtil.isEnumType(javaType.getRawClass())) {
            return constructBeanOrAddOnSerializer(serializerProvider, javaType, beanDescription, z);
        }
        return null;
    }

    public List<BeanPropertyWriter> findBeanProperties(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder) throws JsonMappingException {
        List<BeanPropertyDefinition> findProperties = beanDescription.findProperties();
        SerializationConfig config = serializerProvider.getConfig();
        removeIgnorableTypes(config, beanDescription, findProperties);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, beanDescription, findProperties);
        }
        if (findProperties.isEmpty()) {
            return null;
        }
        boolean usesStaticTyping = usesStaticTyping(config, beanDescription, (TypeSerializer) null);
        PropertyBuilder constructPropertyBuilder = constructPropertyBuilder(config, beanDescription);
        ArrayList arrayList = new ArrayList(findProperties.size());
        for (BeanPropertyDefinition next : findProperties) {
            AnnotatedMember accessor = next.getAccessor();
            if (!next.isTypeId()) {
                AnnotationIntrospector.ReferenceProperty findReferenceType = next.findReferenceType();
                if (findReferenceType == null || !findReferenceType.isBackReference()) {
                    if (accessor instanceof AnnotatedMethod) {
                        arrayList.add(_constructWriter(serializerProvider, next, constructPropertyBuilder, usesStaticTyping, (AnnotatedMethod) accessor));
                    } else {
                        arrayList.add(_constructWriter(serializerProvider, next, constructPropertyBuilder, usesStaticTyping, (AnnotatedField) accessor));
                    }
                }
            } else if (accessor != null) {
                beanSerializerBuilder.setTypeId(accessor);
            }
        }
        return arrayList;
    }

    @Deprecated
    public JsonSerializer<Object> findBeanSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return findBeanOrAddOnSerializer(serializerProvider, javaType, beanDescription, serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public TypeSerializer findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        TypeResolverBuilder<?> findPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        return findPropertyContentTypeResolver == null ? createTypeSerializer(serializationConfig, contentType) : findPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        return findPropertyTypeResolver == null ? createTypeSerializer(serializationConfig, javaType) : findPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        return ClassUtil.canBeABeanType(cls) == null && !ClassUtil.isProxyType(cls);
    }

    public void processViews(SerializationConfig serializationConfig, BeanSerializerBuilder beanSerializerBuilder) {
        List<BeanPropertyWriter> properties = beanSerializerBuilder.getProperties();
        boolean isEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = properties.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BeanPropertyWriter beanPropertyWriter = properties.get(i2);
            Class[] views = beanPropertyWriter.getViews();
            if (views != null && views.length != 0) {
                i++;
                beanPropertyWriterArr[i2] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (isEnabled) {
                beanPropertyWriterArr[i2] = beanPropertyWriter;
            }
        }
        if (!isEnabled || i != 0) {
            beanSerializerBuilder.setFilteredProperties(beanPropertyWriterArr);
        }
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap hashMap = new HashMap();
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (next.getAccessor() == null) {
                it.remove();
            } else {
                Class<?> rawPrimaryType = next.getRawPrimaryType();
                Boolean bool = (Boolean) hashMap.get(rawPrimaryType);
                if (bool == null) {
                    bool = serializationConfig.getConfigOverride(rawPrimaryType).getIsIgnoredType();
                    if (bool == null && (bool = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(rawPrimaryType).getClassInfo())) == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(rawPrimaryType, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public List<BeanPropertyWriter> removeOverlappingTypeIds(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            TypeSerializer typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.getTypeInclusion() == JsonTypeInfo.C12506As.EXTERNAL_PROPERTY) {
                PropertyName construct = PropertyName.construct(typeSerializer.getPropertyName());
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        BeanPropertyWriter next = it.next();
                        if (next != beanPropertyWriter && next.wouldConflictWithName(construct)) {
                            beanPropertyWriter.assignTypeSerializer((TypeSerializer) null);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return list;
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (!next.couldDeserialize() && !next.isExplicitlyIncluded()) {
                it.remove();
            }
        }
    }

    public SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanSerializerFactory.class) {
            return new BeanSerializerFactory(serializerFactoryConfig);
        }
        StringBuilder h = C0072d.m201h("Subtype of BeanSerializerFactory (");
        h.append(getClass().getName());
        h.append(") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
        throw new IllegalStateException(h.toString());
    }
}
