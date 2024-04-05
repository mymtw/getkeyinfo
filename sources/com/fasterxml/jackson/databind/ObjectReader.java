package com.fasterxml.jackson.databind;

import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.JsonPointerBasedFilter;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import p504ai.C13983i;

public class ObjectReader extends ObjectCodec implements Serializable {
    private static final long serialVersionUID = 2;
    public final DeserializationConfig _config;
    public final DefaultDeserializationContext _context;
    public final DataFormatReaders _dataFormatReaders;
    private final TokenFilter _filter;
    public final InjectableValues _injectableValues;
    public transient JavaType _jsonNodeType;
    public final JsonFactory _parserFactory;
    public final JsonDeserializer<Object> _rootDeserializer;
    public final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    public final FormatSchema _schema;
    public final boolean _unwrapRoot;
    public final Object _valueToUpdate;
    public final JavaType _valueType;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, (JavaType) null, (Object) null, (FormatSchema) null, (InjectableValues) null);
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public Object _bind(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken _initForReading = _initForReading(createDeserializationContext, jsonParser);
        if (_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(createDeserializationContext).getNullValue(createDeserializationContext);
            }
        } else if (!(_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT)) {
            JsonDeserializer<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext);
            obj = this._unwrapRoot ? _unwrapAndDeserialize(jsonParser, createDeserializationContext, this._valueType, _findRootDeserializer) : obj == null ? _findRootDeserializer.deserialize(jsonParser, createDeserializationContext) : _findRootDeserializer.deserialize(jsonParser, createDeserializationContext, obj);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, this._valueType);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r5 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        r0.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _bindAndClose(com.fasterxml.jackson.core.JsonParser r5) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r0 = r4.createDeserializationContext(r5)     // Catch:{ all -> 0x0057 }
            com.fasterxml.jackson.core.JsonToken r1 = r4._initForReading(r0, r5)     // Catch:{ all -> 0x0057 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x0057 }
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0042
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x0057 }
            java.lang.Object r1 = r1.getNullValue(r0)     // Catch:{ all -> 0x0057 }
            goto L_0x0042
        L_0x0019:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x0057 }
            if (r1 == r2) goto L_0x0040
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x0057 }
            if (r1 != r2) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x0057 }
            boolean r2 = r4._unwrapRoot     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0031
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x0057 }
            java.lang.Object r1 = r4._unwrapAndDeserialize(r5, r0, r2, r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0042
        L_0x0031:
            java.lang.Object r2 = r4._valueToUpdate     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x003a
            java.lang.Object r1 = r1.deserialize(r5, r0)     // Catch:{ all -> 0x0057 }
            goto L_0x0042
        L_0x003a:
            r1.deserialize(r5, r0, r2)     // Catch:{ all -> 0x0057 }
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x0057 }
            goto L_0x0042
        L_0x0040:
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x0057 }
        L_0x0042:
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r4._config     // Catch:{ all -> 0x0057 }
            com.fasterxml.jackson.databind.DeserializationFeature r3 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0057 }
            boolean r2 = r2.isEnabled(r3)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0051
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x0057 }
            r4._verifyNoTrailingTokens(r5, r0, r2)     // Catch:{ all -> 0x0057 }
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r5.close()
        L_0x0056:
            return r1
        L_0x0057:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            if (r5 == 0) goto L_0x0064
            r5.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r5 = move-exception
            r0.addSuppressed(r5)
        L_0x0064:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndClose(com.fasterxml.jackson.core.JsonParser):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        r0.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r3 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonNode _bindAndCloseAsTree(com.fasterxml.jackson.core.JsonParser r3) throws java.io.IOException {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.JsonNode r0 = r2._bindAsTree(r3)     // Catch:{ all -> 0x000a }
            if (r3 == 0) goto L_0x0009
            r3.close()
        L_0x0009:
            return r0
        L_0x000a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000c }
        L_0x000c:
            r1 = move-exception
            if (r3 == 0) goto L_0x0017
            r3.close()     // Catch:{ all -> 0x0013 }
            goto L_0x0017
        L_0x0013:
            r3 = move-exception
            r0.addSuppressed(r3)
        L_0x0017:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndCloseAsTree(com.fasterxml.jackson.core.JsonParser):com.fasterxml.jackson.databind.JsonNode");
    }

    public <T> MappingIterator<T> _bindAndReadValues(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        _initForMultiRead(createDeserializationContext, jsonParser);
        jsonParser.nextToken();
        return _newIterator(jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext), true);
    }

    public final JsonNode _bindAsTree(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext defaultDeserializationContext;
        JsonNode jsonNode;
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            return this._config.getNodeFactory().missingNode();
        }
        DeserializationConfig deserializationConfig = this._config;
        DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_TRAILING_TOKENS;
        boolean isEnabled = deserializationConfig.isEnabled(deserializationFeature);
        if (currentToken == JsonToken.VALUE_NULL) {
            jsonNode = this._config.getNodeFactory().nullNode();
            if (!isEnabled) {
                return jsonNode;
            }
            defaultDeserializationContext = createDeserializationContext(jsonParser);
        } else {
            defaultDeserializationContext = createDeserializationContext(jsonParser);
            JsonDeserializer<Object> _findTreeDeserializer = _findTreeDeserializer(defaultDeserializationContext);
            jsonNode = this._unwrapRoot ? (JsonNode) _unwrapAndDeserialize(jsonParser, defaultDeserializationContext, _jsonNodeType(), _findTreeDeserializer) : (JsonNode) _findTreeDeserializer.deserialize(jsonParser, defaultDeserializationContext);
        }
        if (this._config.isEnabled(deserializationFeature)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContext, _jsonNodeType());
        }
        return jsonNode;
    }

    public final JsonNode _bindAsTreeOrNull(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext defaultDeserializationContext;
        JsonNode jsonNode;
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            return null;
        }
        boolean isEnabled = this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        if (currentToken == JsonToken.VALUE_NULL) {
            jsonNode = this._config.getNodeFactory().nullNode();
            if (!isEnabled) {
                return jsonNode;
            }
            defaultDeserializationContext = createDeserializationContext(jsonParser);
        } else {
            defaultDeserializationContext = createDeserializationContext(jsonParser);
            JsonDeserializer<Object> _findTreeDeserializer = _findTreeDeserializer(defaultDeserializationContext);
            jsonNode = this._unwrapRoot ? (JsonNode) _unwrapAndDeserialize(jsonParser, defaultDeserializationContext, _jsonNodeType(), _findTreeDeserializer) : (JsonNode) _findTreeDeserializer.deserialize(jsonParser, defaultDeserializationContext);
        }
        if (isEnabled) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContext, _jsonNodeType());
        }
        return jsonNode;
    }

    public JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || FilteringParserDelegate.class.isInstance(jsonParser)) ? jsonParser : new FilteringParserDelegate(jsonParser, this._filter, false, z);
    }

    public Object _detectBindAndClose(byte[] bArr, int i, int i2) throws IOException {
        DataFormatReaders.Match findFormat = this._dataFormatReaders.findFormat(bArr, i, i2);
        if (!findFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, findFormat);
        }
        return findFormat.getReader()._bindAndClose(findFormat.createParserWithMatch());
    }

    public JsonNode _detectBindAndCloseAsTree(InputStream inputStream) throws IOException {
        DataFormatReaders.Match findFormat = this._dataFormatReaders.findFormat(inputStream);
        if (!findFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, findFormat);
        }
        JsonParser createParserWithMatch = findFormat.createParserWithMatch();
        createParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return findFormat.getReader()._bindAndCloseAsTree(createParserWithMatch);
    }

    public <T> MappingIterator<T> _detectBindAndReadValues(DataFormatReaders.Match match, boolean z) throws IOException {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser createParserWithMatch = match.createParserWithMatch();
        if (z) {
            createParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndReadValues(createParserWithMatch);
    }

    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, findRootValueDeserializer);
        return findRootValueDeserializer;
    }

    public JsonDeserializer<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType _jsonNodeType2 = _jsonNodeType();
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(_jsonNodeType2);
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findRootValueDeserializer(_jsonNodeType2);
            if (jsonDeserializer == null) {
                deserializationContext.reportBadDefinition(_jsonNodeType2, "Cannot find a deserializer for type " + _jsonNodeType2);
            }
            this._rootDeserializers.put(_jsonNodeType2, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    public void _initForMultiRead(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
    }

    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return currentToken;
    }

    public InputStream _inputStream(URL url) throws IOException {
        return url.openStream();
    }

    public final JavaType _jsonNodeType() {
        JavaType javaType = this._jsonNodeType;
        if (javaType != null) {
            return javaType;
        }
        JavaType constructType = getTypeFactory().constructType((Type) JsonNode.class);
        this._jsonNodeType = constructType;
        return constructType;
    }

    public ObjectReader _new(ObjectReader objectReader, JsonFactory jsonFactory) {
        return new ObjectReader(objectReader, jsonFactory);
    }

    public <T> MappingIterator<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z) {
        return new MappingIterator(this._valueType, jsonParser, deserializationContext, jsonDeserializer, z, this._valueToUpdate);
    }

    public JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer == null) {
            try {
                jsonDeserializer = createDeserializationContext((JsonParser) null).findRootValueDeserializer(javaType);
                if (jsonDeserializer != null) {
                    this._rootDeserializers.put(javaType, jsonDeserializer);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return jsonDeserializer;
    }

    public void _reportUndetectableSource(Object obj) throws JsonParseException {
        throw new JsonParseException((JsonParser) null, C13983i.m21493l(obj, C0072d.m201h("Cannot use source of type "), " with format auto-detection: must be byte- not char-based"));
    }

    public void _reportUnkownFormat(DataFormatReaders dataFormatReaders, DataFormatReaders.Match match) throws JsonProcessingException {
        StringBuilder h = C0072d.m201h("Cannot detect format from input, does not look like any of detectable formats ");
        h.append(dataFormatReaders.toString());
        throw new JsonParseException((JsonParser) null, h.toString());
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        Object obj;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
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
        Object obj2 = this._valueToUpdate;
        if (obj2 == null) {
            obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            jsonDeserializer.deserialize(jsonParser, deserializationContext, obj2);
            obj = this._valueToUpdate;
        }
        JsonToken nextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (nextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, this._valueType);
        }
        return obj;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            Class<?> rawClass = ClassUtil.rawClass(javaType);
            if (rawClass == null && (obj = this._valueToUpdate) != null) {
                rawClass = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(rawClass, jsonParser, nextToken);
        }
    }

    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema != null && !this._parserFactory.canUseSchema(formatSchema)) {
            StringBuilder h = C0072d.m201h("Cannot use FormatSchema of type ");
            h.append(formatSchema.getClass().getName());
            h.append(" for format ");
            h.append(this._parserFactory.getFormatName());
            throw new IllegalArgumentException(h.toString());
        }
    }

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader _new = _new(this, deserializationConfig);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        return dataFormatReaders != null ? _new.withFormatDetection(dataFormatReaders.with(deserializationConfig)) : _new;
    }

    /* renamed from: at */
    public ObjectReader mo42657at(String str) {
        _assertNotNull("pointerExpr", str);
        return new ObjectReader(this, (TokenFilter) new JsonPointerBasedFilter(str));
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        JsonParser createNonBlockingByteArrayParser = this._parserFactory.createNonBlockingByteArrayParser();
        this._config.initialize(createNonBlockingByteArrayParser);
        return createNonBlockingByteArrayParser;
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        JsonParser createParser = this._parserFactory.createParser(file);
        this._config.initialize(createParser);
        return createParser;
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        JsonDeserializer<Object> _prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            dataFormatReaders = dataFormatReaders.withType(javaType);
        }
        return _new(this, this._config, javaType, _prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return _bindAsTreeOrNull(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return _bind(jsonParser, this._valueToUpdate);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        _assertNotNull("n", treeNode);
        return new TreeTraversingParser((JsonNode) treeNode, withValueToUpdate((Object) null));
    }

    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("n", treeNode);
        try {
            return readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    public ObjectReader withAttribute(Object obj, Object obj2) {
        return _with((DeserializationConfig) this._config.withAttribute(obj, obj2));
    }

    public ObjectReader withAttributes(Map<?, ?> map) {
        return _with((DeserializationConfig) this._config.withAttributes(map));
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new DataFormatReaders(objectReaderArr));
    }

    public ObjectReader withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        return _with(this._config.withHandler(deserializationProblemHandler));
    }

    public ObjectReader withRootName(String str) {
        return _with((DeserializationConfig) this._config.withRootName(str));
    }

    @Deprecated
    public ObjectReader withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, (Object) null, this._schema, this._injectableValues, this._dataFormatReaders);
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            javaType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaType, this._rootDeserializer, obj, this._schema, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withView(Class<?> cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader withoutAttribute(Object obj) {
        return _with((DeserializationConfig) this._config.withoutAttribute(obj));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public ObjectReader withoutRootName() {
        return _with(this._config.withRootName(PropertyName.NO_NAME));
    }

    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) {
        throw new UnsupportedOperationException();
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    public InputStream _inputStream(File file) throws IOException {
        return new FileInputStream(file);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    public JsonNode createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    public JsonNode createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public JsonNode missingNode() {
        return this._config.getNodeFactory().missingNode();
    }

    public JsonNode nullNode() {
        return this._config.getNodeFactory().nullNode();
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withFeatures(featureArr));
    }

    public ObjectReader withFormatDetection(DataFormatReaders dataFormatReaders) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ObjectReader withRootName(PropertyName propertyName) {
        return _with(this._config.withRootName(propertyName));
    }

    @Deprecated
    public ObjectReader withType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withoutFeatures(featureArr));
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, jsonDeserializer, obj, formatSchema, injectableValues, dataFormatReaders);
    }

    /* renamed from: at */
    public ObjectReader mo42656at(JsonPointer jsonPointer) {
        _assertNotNull("pointer", jsonPointer);
        return new ObjectReader(this, (TokenFilter) new JsonPointerBasedFilter(jsonPointer));
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._config.isEnabled(feature, this._parserFactory);
    }

    public JsonNode readTree(InputStream inputStream) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndCloseAsTree(inputStream);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(inputStream), false));
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return forType((Class<?>) cls).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return forType((TypeReference<?>) typeReference).readValues(jsonParser);
    }

    public ObjectReader with(JsonParser.Feature feature) {
        return _with(this._config.with(feature));
    }

    public ObjectReader withFeatures(FormatFeature... formatFeatureArr) {
        return _with(this._config.withFeatures(formatFeatureArr));
    }

    @Deprecated
    public ObjectReader withType(Type type) {
        return forType(this._config.getTypeFactory().constructType(type));
    }

    public ObjectReader without(JsonParser.Feature feature) {
        return _with(this._config.without(feature));
    }

    public ObjectReader withoutFeatures(FormatFeature... formatFeatureArr) {
        return _with(this._config.withoutFeatures(formatFeatureArr));
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        JsonParser createParser = this._parserFactory.createParser(url);
        this._config.initialize(createParser);
        return createParser;
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return this._config.isEnabled(streamReadFeature.mappedFeature(), this._parserFactory);
    }

    public ObjectReader with(StreamReadFeature streamReadFeature) {
        return _with(this._config.with(streamReadFeature.mappedFeature()));
    }

    @Deprecated
    public ObjectReader withType(TypeReference<?> typeReference) {
        return forType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    public ObjectReader without(StreamReadFeature streamReadFeature) {
        return _with(this._config.without(streamReadFeature.mappedFeature()));
    }

    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return forType((TypeReference<?>) typeReference).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public ObjectReader with(FormatFeature formatFeature) {
        return _with(this._config.with(formatFeature));
    }

    public ObjectReader without(FormatFeature formatFeature) {
        return _with(this._config.without(formatFeature));
    }

    public Object _detectBindAndClose(DataFormatReaders.Match match, boolean z) throws IOException {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser createParserWithMatch = match.createParserWithMatch();
        if (z) {
            createParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndClose(createParserWithMatch);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public JsonNode readTree(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(reader), false));
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        JsonParser createParser = this._parserFactory.createParser(inputStream);
        this._config.initialize(createParser);
        return createParser;
    }

    public ObjectReader forType(TypeReference<?> typeReference) {
        return forType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    public <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return forType((JavaType) resolvedType).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return forType(javaType).readValues(jsonParser);
    }

    public ObjectReader with(InjectableValues injectableValues) {
        if (this._injectableValues == injectableValues) {
            return this;
        }
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, injectableValues, this._dataFormatReaders);
    }

    public JsonNode readTree(String str) throws JsonProcessingException, JsonMappingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndCloseAsTree(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        return forType(javaType).readValue(jsonParser);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser) throws IOException {
        _assertNotNull(Constants.APPBOY_PUSH_PRIORITY_KEY, jsonParser);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext), false);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        JsonParser createParser = this._parserFactory.createParser(reader);
        this._config.initialize(createParser);
        return createParser;
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._parserFactory) {
            return this;
        }
        ObjectReader _new = _new(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(_new);
        }
        return _new;
    }

    public <T> T readValue(InputStream inputStream) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndClose(dataFormatReaders.findFormat(inputStream), false);
        }
        return _bindAndClose(_considerFilter(createParser(inputStream), false));
    }

    public <T> MappingIterator<T> readValues(InputStream inputStream) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(inputStream), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(inputStream), true));
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, bArr);
        JsonParser createParser = this._parserFactory.createParser(bArr);
        this._config.initialize(createParser);
        return createParser;
    }

    public JsonNode readTree(byte[] bArr) throws IOException {
        _assertNotNull("json", bArr);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr), false));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(inputStream);
    }

    public ObjectReader with(FormatSchema formatSchema) {
        if (this._schema == formatSchema) {
            return this;
        }
        _verifySchemaType(formatSchema);
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, formatSchema, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = jsonDeserializer;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndClose(_considerFilter(createParser(reader), false));
    }

    public <T> MappingIterator<T> readValues(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser _considerFilter = _considerFilter(createParser(reader), true);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(_considerFilter);
        _initForMultiRead(createDeserializationContext, _considerFilter);
        _considerFilter.nextToken();
        return _newIterator(_considerFilter, createDeserializationContext, _findRootDeserializer(createDeserializationContext), true);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, bArr);
        JsonParser createParser = this._parserFactory.createParser(bArr, i, i2);
        this._config.initialize(createParser);
        return createParser;
    }

    public ObjectReader with(Locale locale) {
        return _with((DeserializationConfig) this._config.with(locale));
    }

    public JsonNode readTree(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr, i, i2), false));
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(reader);
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with((DeserializationConfig) this._config.with(timeZone));
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, str);
        JsonParser createParser = this._parserFactory.createParser(str);
        this._config.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(String str) throws JsonProcessingException, JsonMappingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndClose(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with((DeserializationConfig) this._config.with(base64Variant));
    }

    public ObjectReader with(ContextAttributes contextAttributes) {
        return _with(this._config.with(contextAttributes));
    }

    public JsonNode readTree(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(dataInput), false));
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, cArr);
        JsonParser createParser = this._parserFactory.createParser(cArr);
        this._config.initialize(createParser);
        return createParser;
    }

    public <T> MappingIterator<T> readValues(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser _considerFilter = _considerFilter(createParser(str), true);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(_considerFilter);
        _initForMultiRead(createDeserializationContext, _considerFilter);
        _considerFilter.nextToken();
        return _newIterator(_considerFilter, createDeserializationContext, _findRootDeserializer(createDeserializationContext), true);
    }

    public <T> T readValue(String str, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(str);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, cArr);
        JsonParser createParser = this._parserFactory.createParser(cArr, i, i2);
        this._config.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndClose(bArr, 0, bArr.length);
        }
        return _bindAndClose(_considerFilter(createParser(bArr), false));
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, dataInput);
        JsonParser createParser = this._parserFactory.createParser(dataInput);
        this._config.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(bArr);
    }

    public <T> T readValue(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndClose(bArr, i, i2);
        }
        return _bindAndClose(_considerFilter(createParser(bArr, i, i2), false));
    }

    public <T> MappingIterator<T> readValues(byte[] bArr, int i, int i2) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(bArr, i, i2), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(bArr, i, i2), true));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(bArr, i, i2);
    }

    public final <T> MappingIterator<T> readValues(byte[] bArr) throws IOException {
        _assertNotNull("src", bArr);
        return readValues(bArr, 0, bArr.length);
    }

    public <T> T readValue(File file) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(file)), true);
        }
        return _bindAndClose(_considerFilter(createParser(file), false));
    }

    public <T> MappingIterator<T> readValues(File file) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(file)), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(file), true));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(file);
    }

    public <T> T readValue(URL url) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return _bindAndClose(_considerFilter(createParser(url), false));
    }

    public <T> MappingIterator<T> readValues(URL url) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return _bindAndReadValues(_considerFilter(createParser(url), true));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(url);
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = (DeserializationConfig) objectReader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = jsonFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(JsonNode jsonNode) throws IOException {
        _assertNotNull(ResponseConstants.CONTENT, jsonNode);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(jsonNode);
        }
        return _bindAndClose(_considerFilter(treeAsTokens(jsonNode), false));
    }

    public <T> MappingIterator<T> readValues(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndReadValues(_considerFilter(createParser(dataInput), true));
    }

    public <T> T readValue(JsonNode jsonNode, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(jsonNode);
    }

    public <T> T readValue(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndClose(_considerFilter(createParser(dataInput), false));
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(dataInput);
    }

    public ObjectReader(ObjectReader objectReader, TokenFilter tokenFilter) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = tokenFilter;
    }
}
