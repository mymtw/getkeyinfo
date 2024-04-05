package com.fasterxml.jackson.databind.deser;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_SERIALIZABLE = Serializable.class;
    private static final Class<?> CLASS_STRING = String.class;
    public static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");
    public final DeserializerFactoryConfig _factoryConfig;

    public static class ContainerDefaultMappings {
        public static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
        public static final HashMap<String, Class<? extends Map>> _mapFallbacks;

        static {
            HashMap<String, Class<? extends Collection>> hashMap = new HashMap<>();
            Class<ArrayList> cls = ArrayList.class;
            Class<HashSet> cls2 = HashSet.class;
            hashMap.put(Collection.class.getName(), cls);
            hashMap.put(List.class.getName(), cls);
            hashMap.put(Set.class.getName(), cls2);
            hashMap.put(SortedSet.class.getName(), TreeSet.class);
            hashMap.put(Queue.class.getName(), LinkedList.class);
            hashMap.put(AbstractList.class.getName(), cls);
            hashMap.put(AbstractSet.class.getName(), cls2);
            hashMap.put(Deque.class.getName(), LinkedList.class);
            hashMap.put(NavigableSet.class.getName(), TreeSet.class);
            _collectionFallbacks = hashMap;
            HashMap<String, Class<? extends Map>> hashMap2 = new HashMap<>();
            Class<LinkedHashMap> cls3 = LinkedHashMap.class;
            hashMap2.put(Map.class.getName(), cls3);
            hashMap2.put(AbstractMap.class.getName(), cls3);
            hashMap2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            hashMap2.put(SortedMap.class.getName(), TreeMap.class);
            hashMap2.put(NavigableMap.class.getName(), TreeMap.class);
            hashMap2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            _mapFallbacks = hashMap2;
        }

        public static Class<?> findCollectionFallback(JavaType javaType) {
            return _collectionFallbacks.get(javaType.getRawClass().getName());
        }

        public static Class<?> findMapFallback(JavaType javaType) {
            return _mapFallbacks.get(javaType.getRawClass().getName());
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$a */
    public static /* synthetic */ class C12519a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27656a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonCreator$Mode[] r0 = com.fasterxml.jackson.annotation.JsonCreator.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27656a = r0
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27656a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27656a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.C12519a.<clinit>():void");
        }
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean _checkIfCreatorPropertyBased(com.fasterxml.jackson.databind.AnnotationIntrospector r3, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r4, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r5) {
        /*
            r2 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0009
            boolean r1 = r5.isExplicitlyNamed()
            if (r1 != 0) goto L_0x0014
        L_0x0009:
            r1 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r4 = r4.getParameter(r1)
            com.fasterxml.jackson.annotation.JacksonInject$Value r3 = r3.findInjectableValue(r4)
            if (r3 == 0) goto L_0x0015
        L_0x0014:
            return r0
        L_0x0015:
            if (r5 == 0) goto L_0x002a
            java.lang.String r3 = r5.getName()
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r5.couldSerialize()
            if (r3 == 0) goto L_0x002a
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._checkIfCreatorPropertyBased(com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition):boolean");
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible((AnnotatedMember) next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i2);
                        PropertyName _findParamName = _findParamName(parameter, annotationIntrospector);
                        if (_findParamName == null || _findParamName.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, _findParamName, parameter.getIndex(), parameter, (JacksonInject.Value) null);
                        i2++;
                    } else if (annotatedWithParams2 != null) {
                        break;
                    } else {
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        BeanDescription introspect = config.introspect(javaType);
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueAccessor());
        for (AnnotatedMethod next : introspect.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, next)) {
                if (next.getParameterCount() != 1 || !next.getRawReturnType().isAssignableFrom(rawClass)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsuitable method (");
                    sb.append(next);
                    sb.append(") decorated with @JsonCreator (for Enum type ");
                    throw new IllegalArgumentException(C0326j.m863h(rawClass, sb, ")"));
                } else if (next.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(next.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, next);
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotatedParameter == null || annotationIntrospector == null) {
            return null;
        }
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (findNameForDeserialization != null) {
            return findNameForDeserialization;
        }
        String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        for (AbstractTypeResolver findTypeMapping : this._factoryConfig.abstractTypeResolvers()) {
            JavaType findTypeMapping2 = findTypeMapping.findTypeMapping(deserializationConfig, javaType);
            if (findTypeMapping2 != null && !findTypeMapping2.hasRawClass(rawClass)) {
                return findTypeMapping2;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext r27, com.fasterxml.jackson.databind.BeanDescription r28, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r29, com.fasterxml.jackson.databind.AnnotationIntrospector r30, com.fasterxml.jackson.databind.deser.impl.CreatorCollector r31, java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]> r32) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r0 = r32
            boolean r1 = r28.isNonStaticInnerClass()
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r1 = r28.findDefaultConstructor()
            if (r1 == 0) goto L_0x002a
            boolean r2 = r31.hasDefaultCreator()
            if (r2 == 0) goto L_0x0027
            boolean r2 = r7._hasCreatorAnnotation(r8, r1)
            if (r2 == 0) goto L_0x002a
        L_0x0027:
            r12.setDefaultCreator(r1)
        L_0x002a:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List r2 = r28.getConstructors()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x0038:
            boolean r4 = r2.hasNext()
            r14 = 2
            r15 = 0
            r6 = 1
            if (r4 == 0) goto L_0x009c
            java.lang.Object r4 = r2.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r4 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r4
            com.fasterxml.jackson.databind.DeserializationConfig r5 = r27.getConfig()
            com.fasterxml.jackson.annotation.JsonCreator$Mode r5 = r11.findCreatorAnnotation(r5, r4)
            com.fasterxml.jackson.annotation.JsonCreator$Mode r13 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r13 != r5) goto L_0x0054
            goto L_0x0038
        L_0x0054:
            if (r5 != 0) goto L_0x006a
            boolean r5 = r10.isCreatorVisible((com.fasterxml.jackson.databind.introspect.AnnotatedMember) r4)
            if (r5 == 0) goto L_0x0038
            java.lang.Object r5 = r0.get(r4)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r5 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r5
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r5)
            r1.add(r4)
            goto L_0x0038
        L_0x006a:
            int[] r13 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.C12519a.f27656a
            int r5 = r5.ordinal()
            r5 = r13[r5]
            if (r5 == r6) goto L_0x0092
            if (r5 == r14) goto L_0x0084
            java.lang.Object r5 = r0.get(r4)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r5 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r5
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r5)
            r7._addExplicitAnyCreator(r8, r9, r12, r4)
            goto L_0x0099
        L_0x0084:
            java.lang.Object r5 = r0.get(r4)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r5 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r5
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r5)
            r7._addExplicitPropertyCreator(r8, r9, r12, r4)
            goto L_0x0099
        L_0x0092:
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r15)
            r7._addExplicitDelegatingCreator(r8, r9, r12, r4)
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x009c:
            if (r3 <= 0) goto L_0x009f
            return
        L_0x009f:
            java.util.Iterator r13 = r1.iterator()
            r17 = r15
        L_0x00a5:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r13.next()
            r5 = r0
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r5 = (com.fasterxml.jackson.databind.deser.impl.CreatorCandidate) r5
            int r4 = r5.paramCount()
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r3 = r5.creator()
            if (r4 != r6) goto L_0x010b
            r2 = 0
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r0 = r5.propertyDef(r2)
            boolean r1 = r7._checkIfCreatorPropertyBased(r11, r3, r0)
            if (r1 == 0) goto L_0x00f5
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r4 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r6]
            com.fasterxml.jackson.databind.PropertyName r16 = r5.paramName(r2)
            r18 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r19 = r5.parameter(r2)
            com.fasterxml.jackson.annotation.JacksonInject$Value r20 = r5.injection(r2)
            r0 = r26
            r1 = r27
            r5 = r2
            r2 = r28
            r15 = r3
            r3 = r16
            r14 = r4
            r4 = r18
            r5 = r19
            r18 = r6
            r6 = r20
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r1 = 0
            r14[r1] = r0
            r12.addPropertyCreator(r15, r1, r14)
            goto L_0x0107
        L_0x00f5:
            r1 = r2
            r15 = r3
            r18 = r6
            boolean r2 = r10.isCreatorVisible((com.fasterxml.jackson.databind.introspect.AnnotatedMember) r15)
            r7._handleSingleArgumentCreator(r12, r15, r1, r2)
            if (r0 == 0) goto L_0x0107
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r0 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r0
            r0.removeConstructors()
        L_0x0107:
            r24 = r13
            goto L_0x01bc
        L_0x010b:
            r15 = r3
            r18 = r6
            r0 = -1
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r14 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r4]
            r6 = r0
            r3 = 0
            r19 = 0
            r20 = 0
        L_0x0117:
            if (r3 >= r4) goto L_0x0199
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r2 = r15.getParameter(r3)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r0 = r5.propertyDef(r3)
            com.fasterxml.jackson.annotation.JacksonInject$Value r21 = r11.findInjectableValue(r2)
            if (r0 != 0) goto L_0x012a
            r22 = 0
            goto L_0x0130
        L_0x012a:
            com.fasterxml.jackson.databind.PropertyName r1 = r0.getFullName()
            r22 = r1
        L_0x0130:
            if (r0 == 0) goto L_0x015a
            boolean r0 = r0.isExplicitlyNamed()
            if (r0 == 0) goto L_0x015a
            int r19 = r19 + 1
            r0 = r26
            r1 = r27
            r32 = r2
            r2 = r28
            r23 = r3
            r3 = r22
            r10 = r4
            r4 = r23
            r24 = r13
            r13 = r5
            r5 = r32
            r25 = r13
            r13 = r6
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r14[r23] = r0
            goto L_0x017c
        L_0x015a:
            r32 = r2
            r23 = r3
            r10 = r4
            r25 = r5
            r24 = r13
            r13 = r6
            if (r21 == 0) goto L_0x017e
            int r20 = r20 + 1
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r22
            r4 = r23
            r5 = r32
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r14[r23] = r0
        L_0x017c:
            r6 = r13
            goto L_0x018e
        L_0x017e:
            r0 = r32
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r11.findUnwrappingNameTransformer(r0)
            if (r1 == 0) goto L_0x018a
            r7._reportUnwrappedCreatorProperty(r8, r9, r0)
            goto L_0x017c
        L_0x018a:
            if (r13 >= 0) goto L_0x017c
            r6 = r23
        L_0x018e:
            int r3 = r23 + 1
            r4 = r10
            r13 = r24
            r5 = r25
            r10 = r29
            goto L_0x0117
        L_0x0199:
            r10 = r4
            r25 = r5
            r24 = r13
            r13 = r6
            int r0 = r19 + 0
            if (r19 > 0) goto L_0x01a9
            if (r20 <= 0) goto L_0x01a6
            goto L_0x01a9
        L_0x01a6:
            r0 = 2
            r3 = 0
            goto L_0x01e5
        L_0x01a9:
            int r0 = r0 + r20
            if (r0 != r10) goto L_0x01b2
            r0 = 0
            r12.addPropertyCreator(r15, r0, r14)
            goto L_0x01bc
        L_0x01b2:
            r0 = 0
            if (r19 != 0) goto L_0x01c6
            int r1 = r20 + 1
            if (r1 != r10) goto L_0x01c6
            r12.addDelegatingCreator(r15, r0, r14, r0)
        L_0x01bc:
            r10 = r29
            r6 = r18
            r13 = r24
            r14 = 2
        L_0x01c3:
            r15 = 0
            goto L_0x00a5
        L_0x01c6:
            r0 = r25
            com.fasterxml.jackson.databind.PropertyName r0 = r0.findImplicitParamName(r13)
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a6
        L_0x01d4:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r3 = 0
            r1[r3] = r2
            r1[r18] = r15
            java.lang.String r2 = "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.reportBadTypeDefinition(r9, r2, r1)
        L_0x01e5:
            boolean r1 = r31.hasDefaultCreator()
            if (r1 != 0) goto L_0x01fa
            if (r17 != 0) goto L_0x01f3
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L_0x01f5
        L_0x01f3:
            r1 = r17
        L_0x01f5:
            r1.add(r15)
            r17 = r1
        L_0x01fa:
            r10 = r29
            r14 = r0
            r6 = r18
            r13 = r24
            goto L_0x01c3
        L_0x0202:
            if (r17 == 0) goto L_0x0221
            boolean r0 = r31.hasDelegatingCreator()
            if (r0 != 0) goto L_0x0221
            boolean r0 = r31.hasPropertyBasedCreator()
            if (r0 != 0) goto L_0x0221
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r17
            r0._checkImplicitlyNamedConstructors(r1, r2, r3, r4, r5, r6)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.deser.impl.CreatorCollector, java.util.Map):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedParameter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedParameter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedParameter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: com.fasterxml.jackson.databind.PropertyName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: com.fasterxml.jackson.databind.PropertyName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext r27, com.fasterxml.jackson.databind.BeanDescription r28, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r29, com.fasterxml.jackson.databind.AnnotationIntrospector r30, com.fasterxml.jackson.databind.deser.impl.CreatorCollector r31, java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]> r32) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r1 = r28.getFactoryMethods()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x001c:
            boolean r3 = r1.hasNext()
            r15 = 2
            r6 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r3
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r27.getConfig()
            com.fasterxml.jackson.annotation.JsonCreator$Mode r4 = r11.findCreatorAnnotation(r4, r3)
            int r14 = r3.getParameterCount()
            if (r4 != 0) goto L_0x0049
            if (r14 != r5) goto L_0x001c
            boolean r4 = r10.isCreatorVisible((com.fasterxml.jackson.databind.introspect.AnnotatedMember) r3)
            if (r4 == 0) goto L_0x001c
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r6)
            r0.add(r3)
            goto L_0x001c
        L_0x0049:
            com.fasterxml.jackson.annotation.JsonCreator$Mode r6 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r4 != r6) goto L_0x004e
            goto L_0x001c
        L_0x004e:
            if (r14 != 0) goto L_0x0054
            r12.setDefaultCreator(r3)
            goto L_0x001c
        L_0x0054:
            int[] r6 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.C12519a.f27656a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L_0x007c
            if (r4 == r15) goto L_0x006e
            java.lang.Object r4 = r13.get(r3)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r4 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r4
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r4)
            r7._addExplicitAnyCreator(r8, r9, r12, r3)
            goto L_0x0084
        L_0x006e:
            java.lang.Object r4 = r13.get(r3)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r4 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r4
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r4)
            r7._addExplicitPropertyCreator(r8, r9, r12, r3)
            goto L_0x0084
        L_0x007c:
            r6 = 0
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r6)
            r7._addExplicitDelegatingCreator(r8, r9, r12, r3)
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0087:
            if (r2 <= 0) goto L_0x008a
            return
        L_0x008a:
            java.util.Iterator r14 = r0.iterator()
        L_0x008e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r0 = r14.next()
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r0 = (com.fasterxml.jackson.databind.deser.impl.CreatorCandidate) r0
            int r4 = r0.paramCount()
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r3 = r0.creator()
            java.lang.Object r1 = r13.get(r3)
            r16 = r1
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r16 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r16
            if (r4 == r5) goto L_0x00ad
            goto L_0x008e
        L_0x00ad:
            r1 = 0
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r0 = r0.propertyDef(r1)
            boolean r2 = r7._checkIfCreatorPropertyBased(r11, r3, r0)
            if (r2 != 0) goto L_0x00c7
            boolean r2 = r10.isCreatorVisible((com.fasterxml.jackson.databind.introspect.AnnotatedMember) r3)
            r7._handleSingleArgumentCreator(r12, r3, r1, r2)
            if (r0 == 0) goto L_0x008e
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r0 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r0
            r0.removeConstructors()
            goto L_0x008e
        L_0x00c7:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r2 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r4]
            r19 = r6
            r1 = 0
            r17 = 0
            r18 = 0
        L_0x00d0:
            if (r1 >= r4) goto L_0x0158
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r0 = r3.getParameter(r1)
            if (r16 != 0) goto L_0x00db
            r20 = r6
            goto L_0x00dd
        L_0x00db:
            r20 = r16[r1]
        L_0x00dd:
            com.fasterxml.jackson.annotation.JacksonInject$Value r21 = r11.findInjectableValue(r0)
            if (r20 != 0) goto L_0x00e6
            r22 = r6
            goto L_0x00ea
        L_0x00e6:
            com.fasterxml.jackson.databind.PropertyName r22 = r20.getFullName()
        L_0x00ea:
            if (r20 == 0) goto L_0x0114
            boolean r20 = r20.isExplicitlyNamed()
            if (r20 == 0) goto L_0x0114
            int r17 = r17 + 1
            r20 = r0
            r0 = r26
            r23 = r1
            r1 = r27
            r15 = r2
            r2 = r28
            r10 = r3
            r3 = r22
            r13 = r4
            r4 = r23
            r24 = r5
            r5 = r20
            r25 = r6
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0148
        L_0x0114:
            r20 = r0
            r23 = r1
            r15 = r2
            r10 = r3
            r13 = r4
            r24 = r5
            r25 = r6
            if (r21 == 0) goto L_0x0138
            int r18 = r18 + 1
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r22
            r4 = r23
            r5 = r20
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0148
        L_0x0138:
            r0 = r20
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r11.findUnwrappingNameTransformer(r0)
            if (r1 == 0) goto L_0x0144
            r7._reportUnwrappedCreatorProperty(r8, r9, r0)
            goto L_0x0148
        L_0x0144:
            if (r19 != 0) goto L_0x0148
            r19 = r0
        L_0x0148:
            int r1 = r23 + 1
            r3 = r10
            r4 = r13
            r2 = r15
            r5 = r24
            r6 = r25
            r15 = 2
            r10 = r29
            r13 = r32
            goto L_0x00d0
        L_0x0158:
            r15 = r2
            r10 = r3
            r13 = r4
            r24 = r5
            r25 = r6
            int r0 = r17 + 0
            if (r17 > 0) goto L_0x0169
            if (r18 <= 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r0 = 0
        L_0x0167:
            r1 = 2
            goto L_0x0191
        L_0x0169:
            int r0 = r0 + r18
            if (r0 != r13) goto L_0x0172
            r0 = 0
            r12.addPropertyCreator(r10, r0, r15)
            goto L_0x0167
        L_0x0172:
            r0 = 0
            if (r17 != 0) goto L_0x017d
            int r1 = r18 + 1
            if (r1 != r13) goto L_0x017d
            r12.addDelegatingCreator(r10, r0, r15, r0)
            goto L_0x0167
        L_0x017d:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r19.getIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            r2[r24] = r10
            java.lang.String r3 = "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.reportBadTypeDefinition(r9, r3, r2)
        L_0x0191:
            r10 = r29
            r13 = r32
            r15 = r1
            r5 = r24
            r6 = r25
            goto L_0x008e
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.deser.impl.CreatorCollector, java.util.Map):void");
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        if (1 != creatorCandidate.paramCount()) {
            int findOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection();
            if (findOnlyParamWithoutInjection < 0 || creatorCandidate.paramName(findOnlyParamWithoutInjection) != null) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            }
        } else {
            AnnotatedParameter parameter = creatorCandidate.parameter(0);
            JacksonInject.Value injection = creatorCandidate.injection(0);
            PropertyName explicitParamName = creatorCandidate.explicitParamName(0);
            BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
            boolean z = (explicitParamName == null && injection == null) ? false : true;
            if (!z && propertyDef != null) {
                explicitParamName = creatorCandidate.paramName(0);
                z = explicitParamName != null && propertyDef.couldSerialize();
            }
            PropertyName propertyName = explicitParamName;
            if (z) {
                creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, parameter, injection)});
                return;
            }
            _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
            }
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        CreatorCollector creatorCollector2 = creatorCollector;
        CreatorCandidate creatorCandidate2 = creatorCandidate;
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        int i = -1;
        for (int i2 = 0; i2 < paramCount; i2++) {
            AnnotatedParameter parameter = creatorCandidate2.parameter(i2);
            JacksonInject.Value injection = creatorCandidate2.injection(i2);
            if (injection != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, (PropertyName) null, i2, parameter, injection);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext2.reportBadTypeDefinition(beanDescription2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), creatorCandidate2);
            }
        }
        if (i < 0) {
            deserializationContext2.reportBadTypeDefinition(beanDescription2, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate2);
        }
        if (paramCount == 1) {
            _handleSingleArgumentCreator(creatorCollector2, creatorCandidate.creator(), true, true);
            BeanPropertyDefinition propertyDef = creatorCandidate2.propertyDef(0);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
                return;
            }
            return;
        }
        creatorCollector2.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i);
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        for (int i = 0; i < paramCount; i++) {
            JacksonInject.Value injection = creatorCandidate.injection(i);
            AnnotatedParameter parameter = creatorCandidate.parameter(i);
            PropertyName paramName = creatorCandidate.paramName(i);
            if (paramName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(parameter) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                }
                paramName = creatorCandidate.findImplicitParamName(i);
                if (paramName == null && injection == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i), creatorCandidate);
                }
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, paramName, i, parameter, injection);
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        VisibilityChecker<?> defaultVisibilityChecker = deserializationContext.getConfig().getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, beanDescription);
        _addDeserializerFactoryMethods(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        }
        return creatorCollector.constructValueInstantiator(deserializationContext);
    }

    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> emptyMap = Collections.emptyMap();
        for (BeanPropertyDefinition next : beanDescription.findProperties()) {
            Iterator<AnnotatedParameter> constructorParameters = next.getConstructorParameters();
            while (constructorParameters.hasNext()) {
                AnnotatedParameter next2 = constructorParameters.next();
                AnnotatedWithParams owner = next2.getOwner();
                BeanPropertyDefinition[] beanPropertyDefinitionArr = emptyMap.get(owner);
                int index = next2.getIndex();
                if (beanPropertyDefinitionArr == null) {
                    if (emptyMap.isEmpty()) {
                        emptyMap = new LinkedHashMap<>();
                    }
                    beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                    emptyMap.put(owner, beanPropertyDefinitionArr);
                } else if (beanPropertyDefinitionArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], next);
                }
                beanPropertyDefinitionArr[index] = next;
            }
        }
        return emptyMap;
    }

    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findArrayDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findBeanDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findCollectionDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findEnumDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findMapDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findReferenceDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findReferenceDeserializer2 = findReferenceDeserializer.findReferenceDeserializer(referenceType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findReferenceDeserializer2 != null) {
                return findReferenceDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).findJsonValueMethod();
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    public PropertyMetadata _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nulls;
        JsonSetter.Value findSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nulls2 = null;
        if (member != null) {
            if (annotationIntrospector == null || (findSetterInfo = annotationIntrospector.findSetterInfo(member)) == null) {
                nulls = null;
            } else {
                nulls2 = findSetterInfo.nonDefaultValueNulls();
                nulls = findSetterInfo.nonDefaultContentNulls();
            }
            JsonSetter.Value setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (nulls2 == null) {
                    nulls2 = setterInfo.nonDefaultValueNulls();
                }
                if (nulls == null) {
                    nulls = setterInfo.nonDefaultContentNulls();
                }
            }
        } else {
            nulls = null;
        }
        JsonSetter.Value defaultSetterInfo = config.getDefaultSetterInfo();
        if (nulls2 == null) {
            nulls2 = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (nulls == null) {
            nulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        return (nulls2 == null && nulls == null) ? propertyMetadata : propertyMetadata.withNulls(nulls2, nulls);
    }

    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                creatorCollector.addStringCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                creatorCollector.addIntCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                creatorCollector.addLongCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z);
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            creatorCollector.addDelegatingCreator(annotatedWithParams, z, (SettableBeanProperty[]) null, 0);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r0.findCreatorAnnotation(r3.getConfig(), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean _hasCreatorAnnotation(com.fasterxml.jackson.databind.DeserializationContext r3, com.fasterxml.jackson.databind.introspect.Annotated r4) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r3.getAnnotationIntrospector()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r3.getConfig()
            com.fasterxml.jackson.annotation.JsonCreator$Mode r3 = r0.findCreatorAnnotation(r3, r4)
            if (r3 == 0) goto L_0x0016
            com.fasterxml.jackson.annotation.JsonCreator$Mode r4 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r3 == r4) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._hasCreatorAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated):boolean");
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> findCollectionFallback = ContainerDefaultMappings.findCollectionFallback(javaType);
        if (findCollectionFallback != null) {
            return (CollectionType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, findCollectionFallback, true);
        }
        return null;
    }

    public MapType _mapAbstractMapType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> findMapFallback = ContainerDefaultMappings.findMapFallback(javaType);
        if (findMapFallback != null) {
            return (MapType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, findMapFallback, true);
        }
        return null;
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", new Object[]{Integer.valueOf(annotatedParameter.getIndex())}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r4 = r0.valueInstantiatorInstance(r3, r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.ValueInstantiator _valueInstantiatorInstance(com.fasterxml.jackson.databind.DeserializationConfig r3, com.fasterxml.jackson.databind.introspect.Annotated r4, java.lang.Object r5) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.fasterxml.jackson.databind.deser.ValueInstantiator
            if (r1 == 0) goto L_0x000b
            com.fasterxml.jackson.databind.deser.ValueInstantiator r5 = (com.fasterxml.jackson.databind.deser.ValueInstantiator) r5
            return r5
        L_0x000b:
            boolean r1 = r5 instanceof java.lang.Class
            if (r1 == 0) goto L_0x004a
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r1 = com.fasterxml.jackson.databind.util.ClassUtil.isBogusClass(r5)
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.Class<com.fasterxml.jackson.databind.deser.ValueInstantiator> r0 = com.fasterxml.jackson.databind.deser.ValueInstantiator.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L_0x0038
            com.fasterxml.jackson.databind.cfg.HandlerInstantiator r0 = r3.getHandlerInstantiator()
            if (r0 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r0.valueInstantiatorInstance(r3, r4, r5)
            if (r4 == 0) goto L_0x002d
            return r4
        L_0x002d:
            boolean r3 = r3.canOverrideAccessModifiers()
            java.lang.Object r3 = com.fasterxml.jackson.databind.util.ClassUtil.createInstance(r5, r3)
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = (com.fasterxml.jackson.databind.deser.ValueInstantiator) r3
            return r3
        L_0x0038:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.String r4 = androidx.appcompat.widget.C0326j.m863h(r5, r4, r0)
            r3.<init>(r4)
            throw r3
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "AnnotationIntrospector returned key deserializer definition of type "
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            java.lang.String r0 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            java.lang.String r4 = p504ai.C13983i.m21493l(r5, r4, r0)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._valueInstantiatorInstance(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object):com.fasterxml.jackson.databind.deser.ValueInstantiator");
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        DeserializationContext deserializationContext2 = deserializationContext;
        AnnotatedParameter annotatedParameter2 = annotatedParameter;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        PropertyMetadata construct = annotationIntrospector == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter2), annotationIntrospector.findPropertyDescription(annotatedParameter2), annotationIntrospector.findPropertyIndex(annotatedParameter2), annotationIntrospector.findPropertyDefaultValue(annotatedParameter2));
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter2, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, resolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter2), annotatedParameter, construct);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        CreatorProperty construct2 = CreatorProperty.construct(propertyName, resolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializer, beanDescription.getClassAnnotations(), annotatedParameter, i, value, _getSetterInfo(deserializationContext, std, construct));
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter2);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? construct2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, construct2, resolveMemberAndTypeAnnotations)) : construct2;
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector());
    }

    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializer2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyArrayDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomArrayDeserializer = modifyArrayDeserializer.modifyArrayDeserializer(config, arrayType, beanDescription, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (jsonDeserializer == null && EnumSet.class.isAssignableFrom(rawClass)) {
                _findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, (JsonDeserializer<?>) null);
            }
        }
        if (_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType _mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (_mapAbstractCollectionType != null) {
                    beanDescription = config.introspectForCreation(_mapAbstractCollectionType);
                    collectionType = _mapAbstractCollectionType;
                } else if (collectionType.getTypeHandler() != null) {
                    _findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(beanDescription);
                } else {
                    throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                }
            }
            if (_findCustomCollectionDeserializer == null) {
                ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
                if (!findValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, jsonDeserializer, typeDeserializer2, findValueInstantiator);
                    }
                    JsonDeserializer<?> findForCollection = JavaUtilCollectionsDeserializers.findForCollection(deserializationContext, collectionType);
                    if (findForCollection != null) {
                        return findForCollection;
                    }
                }
                _findCustomCollectionDeserializer = contentType.hasRawClass(String.class) ? new StringCollectionDeserializer(collectionType, jsonDeserializer, findValueInstantiator) : new CollectionDeserializer(collectionType, jsonDeserializer, typeDeserializer2, findValueInstantiator);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionDeserializer = modifyCollectionDeserializer.modifyCollectionDeserializer(config, collectionType, beanDescription, _findCustomCollectionDeserializer);
            }
        }
        return _findCustomCollectionDeserializer;
    }

    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        JsonDeserializer<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionLikeDeserializer = modifyCollectionLikeDeserializer.modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            if (rawClass == Enum.class) {
                return AbstractDeserializer.constructForNonPOJO(beanDescription);
            }
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            SettableBeanProperty[] fromObjectArguments = _constructDefaultValueInstantiator == null ? null : _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (_hasCreatorAnnotation(deserializationContext, next)) {
                    if (next.getParameterCount() == 0) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                    } else {
                        if (!next.getRawReturnType().isAssignableFrom(rawClass)) {
                            deserializationContext.reportBadDefinition(javaType, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", new Object[]{next.toString()}));
                        }
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, next, _constructDefaultValueInstantiator, fromObjectArguments);
                    }
                }
            }
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyEnumDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomEnumDeserializer = modifyEnumDeserializer.modifyEnumDeserializer(config, javaType, beanDescription, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001b A[LOOP:0: B:3:0x001b->B:6:0x002b, LOOP_START, PHI: r2 
      PHI: (r2v9 com.fasterxml.jackson.databind.KeyDeserializer) = (r2v0 com.fasterxml.jackson.databind.KeyDeserializer), (r2v12 com.fasterxml.jackson.databind.KeyDeserializer) binds: [B:2:0x000d, B:6:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.KeyDeserializer createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.JavaType r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r6.getConfig()
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r5._factoryConfig
            boolean r1 = r1.hasKeyDeserializers()
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.fasterxml.jackson.databind.BeanDescription r1 = r0.introspectClassAnnotations((com.fasterxml.jackson.databind.JavaType) r7)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r5._factoryConfig
            java.lang.Iterable r3 = r3.keyDeserializers()
            java.util.Iterator r3 = r3.iterator()
        L_0x001b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r2 = r3.next()
            com.fasterxml.jackson.databind.deser.KeyDeserializers r2 = (com.fasterxml.jackson.databind.deser.KeyDeserializers) r2
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r2.findKeyDeserializer(r7, r0, r1)
            if (r2 == 0) goto L_0x001b
            goto L_0x002f
        L_0x002e:
            r1 = r2
        L_0x002f:
            if (r2 != 0) goto L_0x0054
            if (r1 != 0) goto L_0x003b
            java.lang.Class r1 = r7.getRawClass()
            com.fasterxml.jackson.databind.BeanDescription r1 = r0.introspectClassAnnotations((java.lang.Class<?>) r1)
        L_0x003b:
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r1 = r1.getClassInfo()
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r5.findKeyDeserializerFromAnnotation(r6, r1)
            if (r2 != 0) goto L_0x0054
            boolean r1 = r7.isEnumType()
            if (r1 == 0) goto L_0x0050
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r5._createEnumKeyDeserializer(r6, r7)
            goto L_0x0054
        L_0x0050:
            com.fasterxml.jackson.databind.KeyDeserializer r2 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(r0, r7)
        L_0x0054:
            if (r2 == 0) goto L_0x0079
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            boolean r6 = r6.hasDeserializerModifiers()
            if (r6 == 0) goto L_0x0079
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            java.lang.Iterable r6 = r6.deserializerModifiers()
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r6.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r1 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r1
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r1.modifyKeyDeserializer(r0, r7, r2)
            goto L_0x0068
        L_0x0079:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.KeyDeserializer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r20, com.fasterxml.jackson.databind.type.MapType r21, com.fasterxml.jackson.databind.BeanDescription r22) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            com.fasterxml.jackson.databind.DeserializationConfig r10 = r20.getConfig()
            com.fasterxml.jackson.databind.JavaType r11 = r21.getKeyType()
            com.fasterxml.jackson.databind.JavaType r0 = r21.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            r16 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r16 = (com.fasterxml.jackson.databind.JsonDeserializer) r16
            java.lang.Object r1 = r11.getValueHandler()
            r15 = r1
            com.fasterxml.jackson.databind.KeyDeserializer r15 = (com.fasterxml.jackson.databind.KeyDeserializer) r15
            java.lang.Object r1 = r0.getTypeHandler()
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r1
            if (r1 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r7.findTypeDeserializer(r10, r0)
            r17 = r0
            goto L_0x0032
        L_0x0030:
            r17 = r1
        L_0x0032:
            r0 = r19
            r1 = r21
            r2 = r10
            r3 = r22
            r4 = r15
            r5 = r17
            r6 = r16
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._findCustomMapDeserializer(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00f4
            java.lang.Class r1 = r21.getRawClass()
            java.lang.Class<java.util.EnumMap> r2 = java.util.EnumMap.class
            boolean r2 = r2.isAssignableFrom(r1)
            r18 = 0
            if (r2 == 0) goto L_0x007f
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r1 != r0) goto L_0x005b
            r12 = r22
            r2 = r18
            goto L_0x0062
        L_0x005b:
            r12 = r22
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.findValueInstantiator(r8, r12)
            r2 = r0
        L_0x0062:
            boolean r0 = r11.isEnumImplType()
            if (r0 == 0) goto L_0x0077
            com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
            r3 = 0
            r6 = 0
            r0 = r11
            r1 = r21
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0081
        L_0x0077:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x007f:
            r12 = r22
        L_0x0081:
            if (r0 != 0) goto L_0x00f6
            boolean r1 = r21.isInterface()
            if (r1 != 0) goto L_0x009b
            boolean r1 = r21.isAbstract()
            if (r1 == 0) goto L_0x0090
            goto L_0x009b
        L_0x0090:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForMap(r20, r21)
            if (r0 == 0) goto L_0x0097
            return r0
        L_0x0097:
            r2 = r0
            r1 = r9
        L_0x0099:
            r0 = r12
            goto L_0x00b7
        L_0x009b:
            com.fasterxml.jackson.databind.type.MapType r1 = r7._mapAbstractMapType(r9, r10)
            if (r1 == 0) goto L_0x00aa
            r1.getRawClass()
            com.fasterxml.jackson.databind.BeanDescription r2 = r10.introspectForCreation(r1)
            r12 = r2
            goto L_0x00b5
        L_0x00aa:
            java.lang.Object r0 = r21.getTypeHandler()
            if (r0 == 0) goto L_0x00dd
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r0 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r22)
            r1 = r9
        L_0x00b5:
            r2 = r0
            goto L_0x0099
        L_0x00b7:
            if (r2 != 0) goto L_0x00da
            com.fasterxml.jackson.databind.deser.ValueInstantiator r14 = r7.findValueInstantiator(r8, r0)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r12 = r2
            r13 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r4 = r0.getClassInfo()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r3 = r10.getDefaultPropertyIgnorals(r3, r4)
            if (r3 != 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            java.util.Set r18 = r3.findIgnoredForDeserialization()
        L_0x00d5:
            r3 = r18
            r2.setIgnorableProperties((java.util.Set<java.lang.String>) r3)
        L_0x00da:
            r12 = r0
            r0 = r2
            goto L_0x00f7
        L_0x00dd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find a deserializer for non-concrete Map type "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f4:
            r12 = r22
        L_0x00f6:
            r1 = r9
        L_0x00f7:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r7._factoryConfig
            boolean r2 = r2.hasDeserializerModifiers()
            if (r2 == 0) goto L_0x011a
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r7._factoryConfig
            java.lang.Iterable r2 = r2.deserializerModifiers()
            java.util.Iterator r2 = r2.iterator()
        L_0x0109:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011a
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r3 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r3
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.modifyMapDeserializer(r10, r1, r12, r0)
            goto L_0x0109
        L_0x011a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomMapLikeDeserializer = modifyMapLikeDeserializer.modifyMapLikeDeserializer(config, mapLikeType, beanDescription, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomReferenceDeserializer != null || !referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            if (_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyReferenceDeserializer : this._factoryConfig.deserializerModifiers()) {
                    _findCustomReferenceDeserializer = modifyReferenceDeserializer.modifyReferenceDeserializer(config, referenceType, beanDescription, _findCustomReferenceDeserializer);
                }
            }
            return _findCustomReferenceDeserializer;
        }
        return new AtomicReferenceDeserializer(referenceType, referenceType.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, beanDescription), typeDeserializer2, jsonDeserializer);
    }

    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        return _findCustomTreeNodeDeserializer != null ? _findCustomTreeNodeDeserializer : JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findContentDeserializer);
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType javaType2;
        JavaType javaType3;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT || rawClass == CLASS_SERIALIZABLE) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = _findRemappedType(config, List.class);
                javaType3 = _findRemappedType(config, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        } else if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        } else {
            Class<?> cls = CLASS_ITERABLE;
            if (rawClass == cls) {
                TypeFactory typeFactory = deserializationContext.getTypeFactory();
                JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, cls);
                return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType((Class<? extends Collection>) Collection.class, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]), beanDescription);
            } else if (rawClass == CLASS_MAP_ENTRY) {
                JavaType containedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
                JavaType containedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
                TypeDeserializer typeDeserializer = (TypeDeserializer) containedTypeOrUnknown2.getTypeHandler();
                if (typeDeserializer == null) {
                    typeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), containedTypeOrUnknown2);
                }
                return new MapEntryDeserializer(javaType, (KeyDeserializer) containedTypeOrUnknown.getValueHandler(), (JsonDeserializer<Object>) (JsonDeserializer) containedTypeOrUnknown2.getValueHandler(), typeDeserializer);
            } else {
                String name = rawClass.getName();
                if (rawClass.isPrimitive() || name.startsWith("java.")) {
                    JsonDeserializer<?> find = NumberDeserializers.find(rawClass, name);
                    if (find == null) {
                        find = DateDeserializers.find(rawClass, name);
                    }
                    if (find != null) {
                        return find;
                    }
                }
                if (rawClass == TokenBuffer.class) {
                    return new TokenBufferDeserializer();
                }
                JsonDeserializer<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
                return findOptionalStdDeserializer != null ? findOptionalStdDeserializer : JdkDeserializers.find(rawClass, name);
            }
        }
    }

    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findDeserializer);
    }

    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
    }

    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        return findPropertyContentTypeResolver == null ? findTypeDeserializer(deserializationConfig, contentType) : findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        try {
            return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException e) {
            InvalidDefinitionException from = InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e), javaType);
            from.initCause(e);
            throw from;
        }
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collection;
        JavaType mapAbstractType;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
            collection = null;
        } else {
            collection = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        }
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (mapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !mapAbstractType.hasRawClass(javaType.getRawClass())) {
            findTypeResolver = findTypeResolver.defaultImpl(mapAbstractType.getRawClass());
        }
        try {
            return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collection);
        } catch (IllegalArgumentException e) {
            InvalidDefinitionException from = InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e), javaType);
            from.initCause(e);
            throw from;
        }
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator _valueInstantiatorInstance = findValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, findValueInstantiator) : null;
        if (_valueInstantiatorInstance == null && (_valueInstantiatorInstance = JDKValueInstantiators.findStdValueInstantiator(config, beanDescription.getBeanClass())) == null) {
            _valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators next : this._factoryConfig.valueInstantiators()) {
                _valueInstantiatorInstance = next.findValueInstantiator(config, beanDescription, _valueInstantiatorInstance);
                if (_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", next.getClass().getName());
                }
            }
        }
        if (_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return _valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = _valueInstantiatorInstance.getIncompleteParameter();
        AnnotatedWithParams owner = incompleteParameter.getOwner();
        StringBuilder h = C0072d.m201h("Argument #");
        h.append(incompleteParameter.getIndex());
        h.append(" of constructor ");
        h.append(owner);
        h.append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
        throw new IllegalArgumentException(h.toString());
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        if (!name.startsWith("java.")) {
            return name.startsWith("com.fasterxml.") ? JsonNode.class.isAssignableFrom(cls) || cls == TokenBuffer.class : OptionalHandlerFactory.instance.hasDeserializerFor(cls);
        }
        if (!Collection.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return Number.class.isAssignableFrom(cls) ? NumberDeserializers.find(cls, name) != null : JdkDeserializers.hasDeserializerFor(cls) || cls == CLASS_STRING || cls == Boolean.class || cls == EnumMap.class || cls == AtomicReference.class || DateDeserializers.hasDeserializerFor(cls);
        }
        return true;
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
            } else {
                javaType = _mapAbstractType2;
            }
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + _mapAbstractType2 + ": latter is not a subtype of former");
    }

    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return annotationIntrospector == null ? javaType : annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotated, javaType);
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        boolean isMapLikeType = javaType.isMapLikeType();
        MapLikeType mapLikeType = javaType;
        if (isMapLikeType) {
            JavaType keyType = javaType.getKeyType();
            mapLikeType = javaType;
            if (keyType != null) {
                KeyDeserializer keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember));
                mapLikeType = javaType;
                if (keyDeserializerInstance != null) {
                    MapLikeType withKeyValueHandler = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                    withKeyValueHandler.getKeyType();
                    mapLikeType = withKeyValueHandler;
                }
            }
        }
        boolean hasContentType = mapLikeType.hasContentType();
        JavaType javaType2 = mapLikeType;
        if (hasContentType) {
            JsonDeserializer<Object> deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            JavaType javaType3 = mapLikeType;
            if (deserializerInstance != null) {
                javaType3 = mapLikeType.withContentValueHandler(deserializerInstance);
            }
            TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType3, annotatedMember);
            javaType2 = javaType3;
            if (findPropertyContentTypeDeserializer != null) {
                javaType2 = javaType3.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType2, annotatedMember);
        JavaType javaType4 = javaType2;
        if (findPropertyTypeDeserializer != null) {
            javaType4 = javaType2.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType4);
    }

    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, BeanDescription beanDescription, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractTypeResolver));
    }

    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(deserializers));
    }

    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(keyDeserializers));
    }

    public abstract DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        return withConfig(this._factoryConfig.withDeserializerModifier(beanDeserializerModifier));
    }

    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators) {
        return withConfig(this._factoryConfig.withValueInstantiators(valueInstantiators));
    }
}
