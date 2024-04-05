package com.fasterxml.jackson.databind;

import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.p333io.CharacterEscapes;
import com.fasterxml.jackson.core.p333io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class ObjectMapper extends ObjectCodec implements Serializable {
    public static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    public static final BaseSettings DEFAULT_BASE;
    private static final long serialVersionUID = 2;
    public final ConfigOverrides _configOverrides;
    public DeserializationConfig _deserializationConfig;
    public DefaultDeserializationContext _deserializationContext;
    public InjectableValues _injectableValues;
    public final JsonFactory _jsonFactory;
    public SimpleMixInResolver _mixIns;
    public Set<Object> _registeredModuleTypes;
    public final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    public SerializationConfig _serializationConfig;
    public SerializerFactory _serializerFactory;
    public DefaultSerializerProvider _serializerProvider;
    public SubtypeResolver _subtypeResolver;
    public TypeFactory _typeFactory;

    public static class DefaultTypeResolverBuilder extends StdTypeResolverBuilder implements Serializable {
        private static final long serialVersionUID = 1;
        public final DefaultTyping _appliesFor;
        public final PolymorphicTypeValidator _subtypeValidator;

        @Deprecated
        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this(defaultTyping, LaissezFaireSubTypeValidator.instance);
        }

        private static <T> T _requireNonNull(T t, String str) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException(str);
        }

        public static DefaultTypeResolverBuilder construct(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new DefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator);
        }

        public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
            return this._subtypeValidator;
        }

        public boolean useForType(JavaType javaType) {
            Class<TreeNode> cls = TreeNode.class;
            if (javaType.isPrimitive()) {
                return false;
            }
            int i = C12516c.f27652a[this._appliesFor.ordinal()];
            if (i == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i != 2) {
                if (i == 3) {
                    while (javaType.isArrayType()) {
                        javaType = javaType.getContentType();
                    }
                    while (javaType.isReferenceType()) {
                        javaType = javaType.getReferencedType();
                    }
                    return !javaType.isFinal() && !cls.isAssignableFrom(javaType.getRawClass());
                } else if (i != 4) {
                    return javaType.isJavaLangObject();
                } else {
                    return true;
                }
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            return javaType.isJavaLangObject() || (!javaType.isConcrete() && !cls.isAssignableFrom(javaType.getRawClass()));
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            this._appliesFor = (DefaultTyping) _requireNonNull(defaultTyping, "Can not pass `null` DefaultTyping");
            this._subtypeValidator = (PolymorphicTypeValidator) _requireNonNull(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
        }
    }

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$a */
    public class C12514a implements Module.SetupContext {
        public C12514a() {
        }

        public final void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
            DeserializerFactory withAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(abstractTypeResolver);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAbstractTypeResolver);
        }

        public final void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
            DeserializerFactory withDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(beanDeserializerModifier);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withDeserializerModifier);
        }

        public final void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
        }

        public final void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler) {
            ObjectMapper.this.addHandler(deserializationProblemHandler);
        }

        public final void addDeserializers(Deserializers deserializers) {
            DeserializerFactory withAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(deserializers);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalDeserializers);
        }

        public final void addKeyDeserializers(KeyDeserializers keyDeserializers) {
            DeserializerFactory withAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(keyDeserializers);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalKeyDeserializers);
        }

        public final void addKeySerializers(Serializers serializers) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(serializers);
        }

        public final void addSerializers(Serializers serializers) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
        }

        public final void addTypeModifier(TypeModifier typeModifier) {
            ObjectMapper.this.setTypeFactory(ObjectMapper.this._typeFactory.withModifier(typeModifier));
        }

        public final void addValueInstantiators(ValueInstantiators valueInstantiators) {
            DeserializerFactory withValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(valueInstantiators);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withValueInstantiators);
        }

        public final void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationConfig = (DeserializationConfig) objectMapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
            ObjectMapper objectMapper2 = ObjectMapper.this;
            objectMapper2._serializationConfig = (SerializationConfig) objectMapper2._serializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
        }

        public final MutableConfigOverride configOverride(Class<?> cls) {
            return ObjectMapper.this.configOverride(cls);
        }

        public final Version getMapperVersion() {
            return ObjectMapper.this.version();
        }

        public final <C extends ObjectCodec> C getOwner() {
            return ObjectMapper.this;
        }

        public final TypeFactory getTypeFactory() {
            return ObjectMapper.this._typeFactory;
        }

        public final void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationConfig = (DeserializationConfig) objectMapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
            ObjectMapper objectMapper2 = ObjectMapper.this;
            objectMapper2._serializationConfig = (SerializationConfig) objectMapper2._serializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
        }

        public final boolean isEnabled(MapperFeature mapperFeature) {
            return ObjectMapper.this.isEnabled(mapperFeature);
        }

        public final void registerSubtypes(Class<?>... clsArr) {
            ObjectMapper.this.registerSubtypes(clsArr);
        }

        public final void setClassIntrospector(ClassIntrospector classIntrospector) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationConfig = (DeserializationConfig) objectMapper._deserializationConfig.with(classIntrospector);
            ObjectMapper objectMapper2 = ObjectMapper.this;
            objectMapper2._serializationConfig = (SerializationConfig) objectMapper2._serializationConfig.with(classIntrospector);
        }

        public final void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
            ObjectMapper.this.addMixIn(cls, cls2);
        }

        public final void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
            ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
        }

        public final boolean isEnabled(DeserializationFeature deserializationFeature) {
            return ObjectMapper.this.isEnabled(deserializationFeature);
        }

        public final void registerSubtypes(NamedType... namedTypeArr) {
            ObjectMapper.this.registerSubtypes(namedTypeArr);
        }

        public final boolean isEnabled(SerializationFeature serializationFeature) {
            return ObjectMapper.this.isEnabled(serializationFeature);
        }

        public final void registerSubtypes(Collection<Class<?>> collection) {
            ObjectMapper.this.registerSubtypes(collection);
        }

        public final boolean isEnabled(JsonFactory.Feature feature) {
            return ObjectMapper.this.isEnabled(feature);
        }

        public final boolean isEnabled(JsonParser.Feature feature) {
            return ObjectMapper.this.isEnabled(feature);
        }

        public final boolean isEnabled(JsonGenerator.Feature feature) {
            return ObjectMapper.this.isEnabled(feature);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$b */
    public static class C12515b implements PrivilegedAction<ServiceLoader<T>> {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f27650a;

        /* renamed from: b */
        public final /* synthetic */ Class f27651b;

        public C12515b(Class cls, ClassLoader classLoader) {
            this.f27650a = classLoader;
            this.f27651b = cls;
        }

        public final Object run() {
            ClassLoader classLoader = this.f27650a;
            return classLoader == null ? ServiceLoader.load(this.f27651b) : ServiceLoader.load(this.f27651b, classLoader);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$c */
    public static /* synthetic */ class C12516c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27652a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping[] r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27652a = r0
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27652a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27652a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27652a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.EVERYTHING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27652a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.C12516c.<clinit>():void");
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings((ClassIntrospector) null, jacksonAnnotationIntrospector, (PropertyNamingStrategy) null, TypeFactory.defaultInstance(), (TypeResolverBuilder<?>) null, StdDateFormat.instance, (HandlerInstantiator) null, Locale.getDefault(), (TimeZone) null, Base64Variants.getDefaultVariant(), LaissezFaireSubTypeValidator.instance);
    }

    public ObjectMapper() {
        this((JsonFactory) null, (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE((JsonGenerator) null, closeable, e);
        }
    }

    public static List<Module> findModules() {
        return findModules((ClassLoader) null);
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(Class<T> cls, ClassLoader classLoader) {
        return System.getSecurityManager() == null ? classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader) : (ServiceLoader) AccessController.doPrivileged(new C12515b(cls, classLoader));
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            StringBuilder h = C0072d.m201h("Failed copy(): ");
            h.append(getClass().getName());
            h.append(" (version: ");
            h.append(version());
            h.append(") does not override copy(); it has to");
            throw new IllegalStateException(h.toString());
        }
    }

    @Deprecated
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        getSerializationConfig().initialize(jsonGenerator);
        _writeValueAndClose(jsonGenerator, obj);
    }

    public TypeResolverBuilder<?> _constructDefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return DefaultTypeResolverBuilder.construct(defaultTyping, polymorphicTypeValidator);
    }

    public Object _convert(Object obj, JavaType javaType) throws IllegalArgumentException {
        Object obj2;
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken _initForReading = _initForReading(asParser, javaType);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(asParser, deserializationConfig);
                obj2 = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(asParser, deserializationConfig);
                        obj2 = _findRootDeserializer(createDeserializationContext2, javaType).deserialize(asParser, createDeserializationContext2);
                    }
                }
                obj2 = null;
            }
            asParser.close();
            return obj2;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, findRootValueDeserializer);
        return findRootValueDeserializer;
    }

    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null || (currentToken = jsonParser.nextToken()) != null) {
            return currentToken;
        }
        throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        r11.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _readMapAndClose(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.JavaType r11) throws java.io.IOException {
        /*
            r9 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r9._initForReading(r10, r11)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.DeserializationConfig r7 = r9.getDeserializationConfig()     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r8 = r9.createDeserializationContext(r10, r7)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0019
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.getNullValue(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x0019:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x003e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            boolean r0 = r7.useRootWrapping()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0036
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r7
            r5 = r11
            java.lang.Object r0 = r1._unwrapAndDeserialize(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0050 }
            goto L_0x003a
        L_0x0036:
            java.lang.Object r0 = r6.deserialize(r10, r8)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            r8.checkUnresolvedObjectId()     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0050 }
            boolean r1 = r7.isEnabled(r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            r9._verifyNoTrailingTokens(r10, r8, r11)     // Catch:{ all -> 0x0050 }
        L_0x004a:
            if (r10 == 0) goto L_0x004f
            r10.close()
        L_0x004f:
            return r0
        L_0x0050:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            if (r10 == 0) goto L_0x005d
            r10.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r10 = move-exception
            r11.addSuppressed(r10)
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (r10 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        r0.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonNode _readTreeAndClose(com.fasterxml.jackson.core.JsonParser r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Class<com.fasterxml.jackson.databind.JsonNode> r0 = com.fasterxml.jackson.databind.JsonNode.class
            com.fasterxml.jackson.databind.JavaType r0 = r9.constructType(r0)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r9.getDeserializationConfig()     // Catch:{ all -> 0x006b }
            r4.initialize(r10)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.core.JsonToken r1 = r10.getCurrentToken()     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0025
            com.fasterxml.jackson.core.JsonToken r1 = r10.nextToken()     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0025
            com.fasterxml.jackson.databind.node.JsonNodeFactory r0 = r4.getNodeFactory()     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonNode r0 = r0.missingNode()     // Catch:{ all -> 0x006b }
            r10.close()
            return r0
        L_0x0025:
            com.fasterxml.jackson.databind.DeserializationFeature r2 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x006b }
            boolean r7 = r4.isEnabled(r2)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x006b }
            if (r1 != r2) goto L_0x0042
            com.fasterxml.jackson.databind.node.JsonNodeFactory r1 = r4.getNodeFactory()     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.node.NullNode r1 = r1.nullNode()     // Catch:{ all -> 0x006b }
            if (r7 != 0) goto L_0x003d
            r10.close()
            return r1
        L_0x003d:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r2 = r9.createDeserializationContext(r10, r4)     // Catch:{ all -> 0x006b }
            goto L_0x0062
        L_0x0042:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r8 = r9.createDeserializationContext(r10, r4)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r9._findRootDeserializer(r8, r0)     // Catch:{ all -> 0x006b }
            boolean r1 = r4.useRootWrapping()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x005b
            r1 = r9
            r2 = r10
            r3 = r8
            r5 = r0
            java.lang.Object r1 = r1._unwrapAndDeserialize(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonNode r1 = (com.fasterxml.jackson.databind.JsonNode) r1     // Catch:{ all -> 0x006b }
            goto L_0x0061
        L_0x005b:
            java.lang.Object r1 = r6.deserialize(r10, r8)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonNode r1 = (com.fasterxml.jackson.databind.JsonNode) r1     // Catch:{ all -> 0x006b }
        L_0x0061:
            r2 = r8
        L_0x0062:
            if (r7 == 0) goto L_0x0067
            r9._verifyNoTrailingTokens(r10, r2, r0)     // Catch:{ all -> 0x006b }
        L_0x0067:
            r10.close()
            return r1
        L_0x006b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            if (r10 == 0) goto L_0x0078
            r10.close()     // Catch:{ all -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r10 = move-exception
            r0.addSuppressed(r10)
        L_0x0078:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readTreeAndClose(com.fasterxml.jackson.core.JsonParser):com.fasterxml.jackson.databind.JsonNode");
    }

    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object obj;
        JsonToken _initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (_initForReading == JsonToken.VALUE_NULL) {
            obj = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
        } else if (_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT) {
            obj = null;
        } else {
            JsonDeserializer<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext, javaType);
            obj = deserializationConfig.useRootWrapping() ? _unwrapAndDeserialize(jsonParser, createDeserializationContext, deserializationConfig, javaType, _findRootDeserializer) : _findRootDeserializer.deserialize(jsonParser, createDeserializationContext);
        }
        jsonParser.clearCurrentToken();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, javaType);
        }
        return obj;
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        String simpleName = deserializationConfig.findRootName(javaType).getSimpleName();
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken != jsonToken) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        JsonToken nextToken = jsonParser.nextToken();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (nextToken != jsonToken2) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        String currentName = jsonParser.getCurrentName();
        if (!simpleName.equals(currentName)) {
            deserializationContext.reportPropertyInputMismatch(javaType, currentName, "Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
        }
        jsonParser.nextToken();
        Object deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken nextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (nextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, javaType);
        }
        return deserialize;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            deserializationContext.reportTrailingTokens(ClassUtil.rawClass(javaType), jsonParser, nextToken);
        }
    }

    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema != null && !this._jsonFactory.canUseSchema(formatSchema)) {
            StringBuilder h = C0072d.m201h("Cannot use FormatSchema of type ");
            h.append(formatSchema.getClass().getName());
            h.append(" for format ");
            h.append(this._jsonFactory.getFormatName());
            throw new IllegalArgumentException(h.toString());
        }
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e) {
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, e);
            }
        } else {
            _writeCloseable(jsonGenerator, obj, serializationConfig);
        }
    }

    public void acceptJsonFormatVisitor(Class<?> cls, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        acceptJsonFormatVisitor(this._typeFactory.constructType((Type) cls), jsonFormatVisitorWrapper);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        return activateDefaultTyping(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.C12507Id.CLASS, (TypeIdResolver) null).inclusion(JsonTypeInfo.C12506As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper addHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this._deserializationConfig = this._deserializationConfig.withHandler(deserializationProblemHandler);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext((JsonParser) null, getDeserializationConfig()).hasValueDeserializerFor(javaType, (AtomicReference<Throwable>) null);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, (AtomicReference<Throwable>) null);
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.findOrCreateOverride(cls);
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        MapperConfigBase mapperConfigBase;
        MapperConfigBase mapperConfigBase2;
        if (z) {
            mapperConfigBase = this._serializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            mapperConfigBase = this._serializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._serializationConfig = (SerializationConfig) mapperConfigBase;
        if (z) {
            mapperConfigBase2 = this._deserializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            mapperConfigBase2 = this._deserializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._deserializationConfig = (DeserializationConfig) mapperConfigBase2;
        return this;
    }

    public JavaType constructType(Type type) {
        _assertNotNull(Constants.APPBOY_PUSH_TITLE_KEY, type);
        return this._typeFactory.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return _convert(obj, this._typeFactory.constructType((Type) cls));
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        JsonParser createNonBlockingByteArrayParser = this._jsonFactory.createNonBlockingByteArrayParser();
        this._deserializationConfig.initialize(createNonBlockingByteArrayParser);
        return createNonBlockingByteArrayParser;
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        JsonParser createParser = this._jsonFactory.createParser(file);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public ObjectMapper deactivateDefaultTyping() {
        return setDefaultTyping((TypeResolverBuilder<?>) null);
    }

    public ClassIntrospector defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping((TypeResolverBuilder<?>) null);
    }

    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    @Deprecated
    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), defaultTyping, str);
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules((Iterable<? extends Module>) findModules());
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Deprecated
    public JsonSchema generateJsonSchema(Class<?> cls) throws JsonMappingException {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._deserializationConfig.getBaseSettings().getPolymorphicTypeValidator();
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public Set<Object> getRegisteredModuleIds() {
        Set<Object> set = this._registeredModuleTypes;
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public SerializerFactory getSerializerFactory() {
        return this._serializerFactory;
    }

    public SerializerProvider getSerializerProvider() {
        return this._serializerProvider;
    }

    public SerializerProvider getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException, JsonProcessingException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.getCurrentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        T t = (JsonNode) _readValue(deserializationConfig, jsonParser, constructType(JsonNode.class));
        return t == null ? getNodeFactory().nullNode() : t;
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectReader readerForArrayOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructArrayType(cls), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectReader readerForListOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructCollectionType((Class<? extends Collection>) List.class, cls), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectReader readerForMapOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructMapType((Class<? extends Map>) Map.class, (Class<?>) String.class, cls), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) obj.getClass()), obj, (FormatSchema) null, this._injectableValues);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectMapper registerModule(Module module) {
        Object typeId;
        _assertNotNull("module", module);
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        } else if (module.version() != null) {
            for (Module registerModule : module.getDependencies()) {
                registerModule(registerModule);
            }
            if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = module.getTypeId()) != null) {
                if (this._registeredModuleTypes == null) {
                    this._registeredModuleTypes = new LinkedHashSet();
                }
                if (!this._registeredModuleTypes.add(typeId)) {
                    return this;
                }
            }
            module.setupModule(new C12514a());
            return this;
        } else {
            throw new IllegalArgumentException("Module without defined version");
        }
    }

    public ObjectMapper registerModules(Module... moduleArr) {
        for (Module registerModule : moduleArr) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(base64Variant);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        _assertNotNull("config", deserializationConfig);
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public ObjectMapper setDefaultLeniency(Boolean bool) {
        this._configOverrides.setDefaultLeniency(bool);
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.setDefaultMergeable(bool);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(prettyPrinter);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.setDefaultSetterInfo(value);
        return this;
    }

    public ObjectMapper setDefaultTyping(TypeResolverBuilder<?> typeResolverBuilder) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(typeResolverBuilder);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(typeResolverBuilder);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.setDefaultVisibility(VisibilityChecker.Std.construct(value));
        return this;
    }

    public ObjectMapper setFilterProvider(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
        return this;
    }

    @Deprecated
    public void setFilters(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
    }

    public Object setHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(handlerInstantiator);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(handlerInstantiator);
        return this;
    }

    public ObjectMapper setInjectableValues(InjectableValues injectableValues) {
        this._injectableValues = injectableValues;
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(locale);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(locale);
        return this;
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    public ObjectMapper setMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        SimpleMixInResolver withOverrides = this._mixIns.withOverrides(mixInResolver);
        if (withOverrides != this._mixIns) {
            this._mixIns = withOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, withOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, withOverrides);
        }
        return this;
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._deserializationConfig = this._deserializationConfig._withBase(this._deserializationConfig.getBaseSettings().with(polymorphicTypeValidator));
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setSerializerFactory(SerializerFactory serializerFactory) {
        this._serializerFactory = serializerFactory;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(SubtypeResolver subtypeResolver) {
        this._subtypeResolver = subtypeResolver;
        this._deserializationConfig = this._deserializationConfig.with(subtypeResolver);
        this._serializationConfig = this._serializationConfig.with(subtypeResolver);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(timeZone);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(typeFactory);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.setDefaultVisibility(visibilityChecker);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public JsonFactory tokenStreamFactory() {
        return this._jsonFactory;
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        _assertNotNull("n", treeNode);
        return new TreeTraversingParser((JsonNode) treeNode, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r0 = ((com.fasterxml.jackson.databind.node.POJONode) r4).getPojo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T treeToValue(com.fasterxml.jackson.core.TreeNode r4, java.lang.Class<T> r5) throws com.fasterxml.jackson.core.JsonProcessingException {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class<com.fasterxml.jackson.core.TreeNode> r1 = com.fasterxml.jackson.core.TreeNode.class
            boolean r1 = r1.isAssignableFrom(r5)     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            if (r1 == 0) goto L_0x0017
            java.lang.Class r1 = r4.getClass()     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            boolean r1 = r5.isAssignableFrom(r1)     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            if (r1 == 0) goto L_0x0017
            return r4
        L_0x0017:
            com.fasterxml.jackson.core.JsonToken r1 = r4.asToken()     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            if (r1 != r2) goto L_0x0020
            return r0
        L_0x0020:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            if (r1 != r0) goto L_0x0038
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.node.POJONode     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            if (r0 == 0) goto L_0x0038
            r0 = r4
            com.fasterxml.jackson.databind.node.POJONode r0 = (com.fasterxml.jackson.databind.node.POJONode) r0     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            java.lang.Object r0 = r0.getPojo()     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            if (r0 == 0) goto L_0x0037
            boolean r1 = r5.isInstance(r0)     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            return r0
        L_0x0038:
            com.fasterxml.jackson.core.JsonParser r4 = r3.treeAsTokens(r4)     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            java.lang.Object r4 = r3.readValue((com.fasterxml.jackson.core.JsonParser) r4, r5)     // Catch:{ JsonProcessingException -> 0x004c, IOException -> 0x0041 }
            return r4
        L_0x0041:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r4.getMessage()
            r5.<init>(r0, r4)
            throw r5
        L_0x004c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.treeToValue(com.fasterxml.jackson.core.TreeNode, java.lang.Class):java.lang.Object");
    }

    public <T> T updateValue(T t, Object obj) throws JsonMappingException {
        if (t == null || obj == null) {
            return t;
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            T readValue = readerForUpdating(t).readValue(asParser);
            asParser.close();
            return readValue;
        } catch (IOException e) {
            if (e instanceof JsonMappingException) {
                throw ((JsonMappingException) e);
            }
            throw JsonMappingException.fromUnexpectedIOE(e);
        }
    }

    public <T extends JsonNode> T valueToTree(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return getNodeFactory().nullNode();
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            writeValue((JsonGenerator) tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            T t = (JsonNode) readTree(asParser);
            asParser.close();
            return t;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) throws IOException, JsonProcessingException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, treeNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            jsonGenerator.setPrettyPrinter(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        _writeCloseableValue(jsonGenerator, obj, serializationConfig);
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator((OutputStream) byteArrayBuilder, JsonEncoding.UTF8), obj);
            byte[] byteArray = byteArrayBuilder.toByteArray();
            byteArrayBuilder.release();
            return byteArray;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator((Writer) segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(Class<?> cls) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (cls == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType((Type) cls);
        }
        return _newWriter(serializationConfig, javaType, (PrettyPrinter) null);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, (JavaType) null, serializationConfig.getDefaultPrettyPrinter());
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (cls == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType((Type) cls);
        }
        return _newWriter(serializationConfig, javaType, (PrettyPrinter) null);
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }

    public static List<Module> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator<Module> it = secureGetServiceLoader(Module.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, formatSchema, injectableValues);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, FormatSchema formatSchema) {
        return new ObjectWriter(this, serializationConfig, formatSchema);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        if (javaType != null) {
            _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, jsonFormatVisitorWrapper);
            return;
        }
        throw new IllegalArgumentException("type must be provided");
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return activateDefaultTyping(polymorphicTypeValidator, defaultTyping, JsonTypeInfo.C12506As.WRAPPER_ARRAY);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public <T> T convertValue(Object obj, TypeReference<T> typeReference) throws IllegalArgumentException {
        return _convert(obj, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.C12506As.WRAPPER_ARRAY);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    public JsonNode missingNode() {
        return this._deserializationConfig.getNodeFactory().missingNode();
    }

    public JsonNode nullNode() {
        return this._deserializationConfig.getNodeFactory().nullNode();
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Include include) {
        this._configOverrides.setDefaultInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        JsonFactory copy = objectMapper._jsonFactory.copy();
        this._jsonFactory = copy;
        copy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver.copy();
        this._typeFactory = objectMapper._typeFactory;
        this._injectableValues = objectMapper._injectableValues;
        ConfigOverrides copy2 = objectMapper._configOverrides.copy();
        this._configOverrides = copy2;
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        ConfigOverrides configOverrides = copy2;
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverrides);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverrides);
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        return new ObjectWriter(this, serializationConfig, javaType, prettyPrinter);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, JsonTypeInfo.C12506As as) {
        if (as != JsonTypeInfo.C12506As.EXTERNAL_PROPERTY) {
            return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.C12507Id.CLASS, (TypeIdResolver) null).inclusion(as));
        }
        throw new IllegalArgumentException("Cannot use includeAs of " + as);
    }

    public <T> T convertValue(Object obj, JavaType javaType) throws IllegalArgumentException {
        return _convert(obj, javaType);
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.C12506As as) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), defaultTyping, as);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerFor(TypeReference<?> typeReference) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectMapper registerModules(Iterable<? extends Module> iterable) {
        _assertNotNull(ResponseConstants.MODULES, iterable);
        for (Module registerModule : iterable) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        _assertNotNull("config", serializationConfig);
        this._serializationConfig = serializationConfig;
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext((JsonParser) null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(outputStream, jsonEncoding);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        JsonParser createParser = this._jsonFactory.createParser(url);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException, JsonProcessingException {
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public ObjectWriter writerFor(TypeReference<?> typeReference) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (typeReference == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType(typeReference);
        }
        return _newWriter(serializationConfig, javaType, (PrettyPrinter) null);
    }

    @Deprecated
    public ObjectWriter writerWithType(TypeReference<?> typeReference) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (typeReference == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType(typeReference);
        }
        return _newWriter(serializationConfig, javaType, (PrettyPrinter) null);
    }

    @Deprecated
    public JsonToken _initForReading(JsonParser jsonParser) throws IOException {
        return _initForReading(jsonParser, (JavaType) null);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public final <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, (JavaType) resolvedType);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException, JsonProcessingException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new MappingIterator(javaType, jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), false, (Object) null);
    }

    public ObjectReader reader(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newReader(getDeserializationConfig(), (JavaType) null, (Object) null, formatSchema, this._injectableValues);
    }

    public ObjectWriter writer(PrettyPrinter prettyPrinter) {
        if (prettyPrinter == null) {
            prettyPrinter = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), (JavaType) null, prettyPrinter);
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public void writeTree(JsonGenerator jsonGenerator, JsonNode jsonNode) throws IOException, JsonProcessingException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, jsonNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(writer);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        JsonParser createParser = this._jsonFactory.createParser(inputStream);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return isEnabled(streamReadFeature.mappedFeature());
    }

    public JsonNode readTree(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    public ObjectReader reader(InjectableValues injectableValues) {
        return _newReader(getDeserializationConfig(), (JavaType) null, (Object) null, (FormatSchema) null, injectableValues);
    }

    public ObjectWriter writer(FilterProvider filterProvider) {
        return _newWriter(getSerializationConfig().withFilters(filterProvider));
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, (PrettyPrinter) null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, (PrettyPrinter) null);
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader((DeserializationConfig) getDeserializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newWriter(getSerializationConfig(), formatSchema);
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public JsonNode readTree(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(file, jsonEncoding);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        JsonParser createParser = this._jsonFactory.createParser(reader);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException, JsonProcessingException {
        return readValues(jsonParser, this._typeFactory.constructType((Type) cls));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter((SerializationConfig) getSerializationConfig().with(base64Variant));
    }

    public JsonNode readTree(String str) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(ResponseConstants.CONTENT, str);
        try {
            return _readTreeAndClose(this._jsonFactory.createParser(str));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(File file, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException, JsonProcessingException {
        return readValues(jsonParser, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public void writeValue(File file, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    @Deprecated
    public ObjectReader reader(TypeReference<?> typeReference) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(dataOutput);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, bArr);
        JsonParser createParser = this._jsonFactory.createParser(bArr);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(File file, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public void writeValue(Writer writer, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public JsonNode readTree(byte[] bArr) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((Type) cls));
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, bArr);
        JsonParser createParser = this._jsonFactory.createParser(bArr, i, i2);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public JsonNode readTree(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr, i, i2));
    }

    public <T> T readValue(URL url, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, str);
        JsonParser createParser = this._jsonFactory.createParser(str);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public JsonNode readTree(File file) throws IOException, JsonProcessingException {
        _assertNotNull(ResponseConstants.FILE, file);
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public <T> T readValue(URL url, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
        this._mixIns = simpleMixInResolver;
        BaseSettings withClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        BaseSettings baseSettings = withClassIntrospector;
        SimpleMixInResolver simpleMixInResolver2 = simpleMixInResolver;
        RootNameLookup rootNameLookup2 = rootNameLookup;
        ConfigOverrides configOverrides2 = configOverrides;
        this._serializationConfig = new SerializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        this._deserializationConfig = new DeserializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        boolean requiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature) ^ requiresPropertyOrdering) {
            configure(mapperFeature, requiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl((DeserializerFactory) BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public JsonNode readTree(URL url) throws IOException {
        _assertNotNull("source", url);
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    public <T> T readValue(String str, Class<T> cls) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(ResponseConstants.CONTENT, str);
        return readValue(str, this._typeFactory.constructType((Type) cls));
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, cArr);
        JsonParser createParser = this._jsonFactory.createParser(cArr);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(String str, TypeReference<T> typeReference) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(ResponseConstants.CONTENT, str);
        return readValue(str, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, cArr);
        JsonParser createParser = this._jsonFactory.createParser(cArr, i, i2);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(String str, JavaType javaType) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(ResponseConstants.CONTENT, str);
        try {
            return _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, dataInput);
        JsonParser createParser = this._jsonFactory.createParser(dataInput);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(Reader reader, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(Reader reader, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(InputStream inputStream, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i, int i2, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        _assertNotNull("src", dataInput);
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) throws IOException {
        _assertNotNull("src", dataInput);
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }
}
