package com.fasterxml.jackson.databind.util;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import p003a2.C0023f;

public class TokenBuffer extends JsonGenerator {
    public static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    public int _appendAt;
    public boolean _closed;
    public Segment _first;
    public boolean _forceBigDecimal;
    public int _generatorFeatures;
    public boolean _hasNativeId;
    public boolean _hasNativeObjectIds;
    public boolean _hasNativeTypeIds;
    public Segment _last;
    public boolean _mayHaveNativeIds;
    public ObjectCodec _objectCodec;
    public Object _objectId;
    public JsonStreamContext _parentContext;
    public Object _typeId;
    public JsonWriteContext _writeContext;

    public static final class Parser extends ParserMinimalBase {
        public transient ByteArrayBuilder _byteBuilder;
        public boolean _closed;
        public ObjectCodec _codec;
        public final boolean _hasNativeIds;
        public final boolean _hasNativeObjectIds;
        public final boolean _hasNativeTypeIds;
        public JsonLocation _location;
        public TokenBufferReadContext _parsingContext;
        public Segment _segment;
        public int _segmentPtr;

        @Deprecated
        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2) {
            this(segment, objectCodec, z, z2, (JsonStreamContext) null);
        }

        private final boolean _smallerThanInt(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean _smallerThanLong(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        public final void _checkIsNumber() throws JsonParseException {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                StringBuilder h = C0072d.m201h("Current token (");
                h.append(this._currToken);
                h.append(") not numeric, cannot use numeric value accessors");
                throw _constructError(h.toString());
            }
        }

        public int _convertNumberToInt(Number number) throws IOException {
            if (number instanceof Long) {
                long longValue = number.longValue();
                int i = (int) longValue;
                if (((long) i) != longValue) {
                    reportOverflowInt();
                }
                return i;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_INT.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue < -2.147483648E9d || doubleValue > 2.147483647E9d) {
                    reportOverflowInt();
                }
                return (int) doubleValue;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (ParserMinimalBase.BD_MIN_INT.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(bigDecimal) < 0) {
                    reportOverflowInt();
                }
            } else {
                _throwInternal();
            }
            return number.intValue();
        }

        public long _convertNumberToLong(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_LONG.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue < -9.223372036854776E18d || doubleValue > 9.223372036854776E18d) {
                    reportOverflowLong();
                }
                return (long) doubleValue;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (ParserMinimalBase.BD_MIN_LONG.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                    reportOverflowLong();
                }
            } else {
                _throwInternal();
            }
            return number.longValue();
        }

        public final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        public void _handleEOF() throws JsonParseException {
            _throwInternal();
        }

        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        public void close() throws IOException {
            if (!this._closed) {
                this._closed = true;
            }
        }

        public BigInteger getBigIntegerValue() throws IOException {
            Number numberValue = getNumberValue();
            return numberValue instanceof BigInteger ? (BigInteger) numberValue : getNumberType() == JsonParser.NumberType.BIG_DECIMAL ? ((BigDecimal) numberValue).toBigInteger() : BigInteger.valueOf(numberValue.longValue());
        }

        public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException, JsonParseException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken == JsonToken.VALUE_STRING) {
                String text = getText();
                if (text == null) {
                    return null;
                }
                ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
                if (byteArrayBuilder == null) {
                    byteArrayBuilder = new ByteArrayBuilder(100);
                    this._byteBuilder = byteArrayBuilder;
                } else {
                    byteArrayBuilder.reset();
                }
                _decodeBase64(text, byteArrayBuilder, base64Variant);
                return byteArrayBuilder.toByteArray();
            }
            StringBuilder h = C0072d.m201h("Current token (");
            h.append(this._currToken);
            h.append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            throw _constructError(h.toString());
        }

        public ObjectCodec getCodec() {
            return this._codec;
        }

        public JsonLocation getCurrentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.f27613NA : jsonLocation;
        }

        public String getCurrentName() {
            JsonToken jsonToken = this._currToken;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this._parsingContext.getParent().getCurrentName() : this._parsingContext.getCurrentName();
        }

        public BigDecimal getDecimalValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i = C12592a.f27790b[getNumberType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new BigDecimal((BigInteger) numberValue);
                }
                if (i != 5) {
                    return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        public int getIntValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Integer) || _smallerThanInt(numberValue)) ? numberValue.intValue() : _convertNumberToInt(numberValue);
        }

        public long getLongValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Long) || _smallerThanLong(numberValue)) ? numberValue.longValue() : _convertNumberToLong(numberValue);
        }

        public JsonParser.NumberType getNumberType() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValue instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValue instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValue instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValue instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValue instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValue instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        public final Number getNumberValue() throws IOException {
            _checkIsNumber();
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Number) {
                return (Number) _currentObject;
            }
            if (_currentObject instanceof String) {
                String str = (String) _currentObject;
                return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
            } else if (_currentObject == null) {
                return null;
            } else {
                throw new IllegalStateException(C0023f.m108i(_currentObject, C0072d.m201h("Internal error: entry should be a Number, but is of type ")));
            }
        }

        public Object getObjectId() {
            return this._segment.findObjectId(this._segmentPtr);
        }

        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        public String getText() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                return _currentObject instanceof String ? (String) _currentObject : ClassUtil.nullOrToString(_currentObject);
            } else if (jsonToken == null) {
                return null;
            } else {
                int i = C12592a.f27789a[jsonToken.ordinal()];
                return (i == 7 || i == 8) ? ClassUtil.nullOrToString(_currentObject()) : this._currToken.asString();
            }
        }

        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        public int getTextOffset() {
            return 0;
        }

        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        public Object getTypeId() {
            return this._segment.findTypeId(this._segmentPtr);
        }

        public boolean hasTextCharacters() {
            return false;
        }

        public boolean isClosed() {
            return this._closed;
        }

        public boolean isNaN() {
            if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Double) {
                Double d = (Double) _currentObject;
                return d.isNaN() || d.isInfinite();
            } else if (!(_currentObject instanceof Float)) {
                return false;
            } else {
                Float f = (Float) _currentObject;
                return f.isNaN() || f.isInfinite();
            }
        }

        public String nextFieldName() throws IOException {
            Segment segment;
            JsonToken jsonToken;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            if (i < 16 && segment.type(i) == (jsonToken = JsonToken.FIELD_NAME)) {
                this._segmentPtr = i;
                this._currToken = jsonToken;
                Object obj = this._segment.get(i);
                String obj2 = obj instanceof String ? (String) obj : obj.toString();
                this._parsingContext.setCurrentName(obj2);
                return obj2;
            } else if (nextToken() == JsonToken.FIELD_NAME) {
                return getCurrentName();
            } else {
                return null;
            }
        }

        public JsonToken nextToken() throws IOException {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            this._segmentPtr = i;
            if (i >= 16) {
                this._segmentPtr = 0;
                Segment next = segment.next();
                this._segment = next;
                if (next == null) {
                    return null;
                }
            }
            JsonToken type = this._segment.type(this._segmentPtr);
            this._currToken = type;
            if (type == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                this._parsingContext.setCurrentName(_currentObject instanceof String ? (String) _currentObject : _currentObject.toString());
            } else if (type == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext();
            } else if (type == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext();
            } else if (type == JsonToken.END_OBJECT || type == JsonToken.END_ARRAY) {
                this._parsingContext = this._parsingContext.parentOrCopy();
            } else {
                this._parsingContext.updateForValue();
            }
            return this._currToken;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
            if (r1 == com.fasterxml.jackson.core.JsonToken.START_ARRAY) goto L_0x000c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void overrideCurrentName(java.lang.String r4) {
            /*
                r3 = this;
                com.fasterxml.jackson.databind.util.TokenBufferReadContext r0 = r3._parsingContext
                com.fasterxml.jackson.core.JsonToken r1 = r3._currToken
                com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
                if (r1 == r2) goto L_0x000c
                com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
                if (r1 != r2) goto L_0x0010
            L_0x000c:
                com.fasterxml.jackson.core.JsonStreamContext r0 = r0.getParent()
            L_0x0010:
                boolean r1 = r0 instanceof com.fasterxml.jackson.databind.util.TokenBufferReadContext
                if (r1 == 0) goto L_0x0021
                com.fasterxml.jackson.databind.util.TokenBufferReadContext r0 = (com.fasterxml.jackson.databind.util.TokenBufferReadContext) r0     // Catch:{ IOException -> 0x001a }
                r0.setCurrentName(r4)     // Catch:{ IOException -> 0x001a }
                goto L_0x0021
            L_0x001a:
                r4 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r4)
                throw r0
            L_0x0021:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.TokenBuffer.Parser.overrideCurrentName(java.lang.String):void");
        }

        public JsonToken peekNextToken() throws IOException {
            if (this._closed) {
                return null;
            }
            Segment segment = this._segment;
            int i = this._segmentPtr + 1;
            if (i >= 16) {
                i = 0;
                segment = segment == null ? null : segment.next();
            }
            if (segment == null) {
                return null;
            }
            return segment.type(i);
        }

        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        public void setCodec(ObjectCodec objectCodec) {
            this._codec = objectCodec;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }

        public Version version() {
            return PackageVersion.VERSION;
        }

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            super(0);
            this._location = null;
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._parsingContext = TokenBufferReadContext.createRootContext(jsonStreamContext);
            this._hasNativeTypeIds = z;
            this._hasNativeObjectIds = z2;
            this._hasNativeIds = z | z2;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.TokenBuffer$a */
    public static /* synthetic */ class C12592a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27789a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f27790b;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bd */
        static {
            /*
                com.fasterxml.jackson.core.JsonParser$NumberType[] r0 = com.fasterxml.jackson.core.JsonParser.NumberType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27790b = r0
                r1 = 1
                com.fasterxml.jackson.core.JsonParser$NumberType r2 = com.fasterxml.jackson.core.JsonParser.NumberType.INT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27790b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.JsonParser$NumberType r3 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f27790b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.JsonParser$NumberType r4 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f27790b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.JsonParser$NumberType r5 = com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f27790b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.JsonParser$NumberType r6 = com.fasterxml.jackson.core.JsonParser.NumberType.LONG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.fasterxml.jackson.core.JsonToken[] r5 = com.fasterxml.jackson.core.JsonToken.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f27789a = r5
                com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f27789a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x008d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x00b1 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = f27789a     // Catch:{ NoSuchFieldError -> 0x00c9 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x00c9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c9 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c9 }
            L_0x00c9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.TokenBuffer.C12592a.<clinit>():void");
        }
    }

    public TokenBuffer(ObjectCodec objectCodec, boolean z) {
        this._hasNativeId = false;
        this._objectCodec = objectCodec;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext((DupDetector) null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = z;
        this._hasNativeObjectIds = z;
        this._mayHaveNativeIds = z | z;
    }

    private final void _appendNativeIds(StringBuilder sb) {
        Object access$000 = this._last.findObjectId(this._appendAt - 1);
        if (access$000 != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(access$000));
            sb.append(']');
        }
        Object access$100 = this._last.findTypeId(this._appendAt - 1);
        if (access$100 != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(access$100));
            sb.append(']');
        }
    }

    private final void _checkNativeIds(JsonParser jsonParser) throws IOException {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    private void _copyBufferValue(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (C12592a.f27789a[jsonToken.ordinal()]) {
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i = C12592a.f27790b[jsonParser.getNumberType().ordinal()];
                if (i == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                }
            case 8:
                if (this._forceBigDecimal) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                }
                int i2 = C12592a.f27790b[jsonParser.getNumberType().ordinal()];
                if (i2 == 3) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (i2 != 4) {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                } else {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    public static TokenBuffer asCopyOfValue(JsonParser jsonParser) throws IOException {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser);
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }

    public final void _appendEndMarker(JsonToken jsonToken) {
        Segment append = this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
            return;
        }
        this._last = append;
        this._appendAt = 1;
    }

    public final void _appendFieldName(Object obj) {
        Segment segment;
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    public final void _appendStartMarker(JsonToken jsonToken) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
            return;
        }
        this._last = append;
        this._appendAt = 1;
    }

    public final void _appendValue(JsonToken jsonToken) {
        Segment segment;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    public void _copyBufferContents(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != null) {
                int i2 = C12592a.f27789a[nextToken.ordinal()];
                if (i2 == 1) {
                    if (this._mayHaveNativeIds) {
                        _checkNativeIds(jsonParser);
                    }
                    writeStartObject();
                } else if (i2 == 2) {
                    writeEndObject();
                    i--;
                    if (i == 0) {
                        return;
                    }
                } else if (i2 == 3) {
                    if (this._mayHaveNativeIds) {
                        _checkNativeIds(jsonParser);
                    }
                    writeStartArray();
                } else if (i2 == 4) {
                    writeEndArray();
                    i--;
                    if (i == 0) {
                        return;
                    }
                } else if (i2 != 5) {
                    _copyBufferValue(jsonParser, nextToken);
                } else {
                    if (this._mayHaveNativeIds) {
                        _checkNativeIds(jsonParser);
                    }
                    writeFieldName(jsonParser.getCurrentName());
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) throws IOException {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer.canWriteTypeId();
        }
        if (!this._hasNativeObjectIds) {
            this._hasNativeObjectIds = tokenBuffer.canWriteObjectId();
        }
        this._mayHaveNativeIds = this._hasNativeTypeIds | this._hasNativeObjectIds;
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != null) {
            copyCurrentStructure(asParser);
        }
        return this;
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParserOnFirstToken() throws IOException {
        JsonParser asParser = asParser(this._objectCodec);
        asParser.nextToken();
        return asParser;
    }

    public boolean canWriteBinaryNatively() {
        return true;
    }

    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    public void close() throws IOException {
        this._closed = true;
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (C12592a.f27789a[jsonParser.currentToken().ordinal()]) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i = C12592a.f27790b[jsonParser.getNumberType().ordinal()];
                if (i == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                }
            case 8:
                if (this._forceBigDecimal) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                }
                int i2 = C12592a.f27790b[jsonParser.getNumberType().ordinal()];
                if (i2 == 3) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (i2 != 4) {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                } else {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                StringBuilder h = C0072d.m201h("Internal error: unexpected token: ");
                h.append(jsonParser.currentToken());
                throw new RuntimeException(h.toString());
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        } else if (currentToken == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i = C12592a.f27789a[currentToken.ordinal()];
        if (i == 1) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeStartObject();
            _copyBufferContents(jsonParser);
        } else if (i == 2) {
            writeEndObject();
        } else if (i == 3) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeStartArray();
            _copyBufferContents(jsonParser);
        } else if (i != 4) {
            _copyBufferValue(jsonParser, currentToken);
        } else {
            writeEndArray();
        }
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken nextToken;
        if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            nextToken = jsonParser.nextToken();
        } while (nextToken == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (nextToken != jsonToken) {
            deserializationContext.reportWrongTokenException((Class<?>) TokenBuffer.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + nextToken, new Object[0]);
        }
        writeEndObject();
        return this;
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    public void flush() throws IOException {
    }

    public TokenBuffer forceUseOfBigDecimal(boolean z) {
        this._forceBigDecimal = z;
        return this;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public TokenBuffer overrideParentContext(JsonStreamContext jsonStreamContext) {
        this._parentContext = jsonStreamContext;
        return this;
    }

    public JsonGenerator overrideStdFeatures(int i, int i2) {
        this._generatorFeatures = (i & i2) | (getFeatureMask() & (~i2));
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator) throws IOException {
        Segment segment = this._first;
        boolean z = this._mayHaveNativeIds;
        boolean z2 = z && segment.hasIds();
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                segment = segment.next();
                if (segment != null) {
                    z2 = z && segment.hasIds();
                    i = 0;
                } else {
                    return;
                }
            }
            JsonToken type = segment.type(i);
            if (type != null) {
                if (z2) {
                    Object access$000 = segment.findObjectId(i);
                    if (access$000 != null) {
                        jsonGenerator.writeObjectId(access$000);
                    }
                    Object access$100 = segment.findTypeId(i);
                    if (access$100 != null) {
                        jsonGenerator.writeTypeId(access$100);
                    }
                }
                switch (C12592a.f27789a[type.ordinal()]) {
                    case 1:
                        jsonGenerator.writeStartObject();
                        break;
                    case 2:
                        jsonGenerator.writeEndObject();
                        break;
                    case 3:
                        jsonGenerator.writeStartArray();
                        break;
                    case 4:
                        jsonGenerator.writeEndArray();
                        break;
                    case 5:
                        Object obj = segment.get(i);
                        if (!(obj instanceof SerializableString)) {
                            jsonGenerator.writeFieldName((String) obj);
                            break;
                        } else {
                            jsonGenerator.writeFieldName((SerializableString) obj);
                            break;
                        }
                    case 6:
                        Object obj2 = segment.get(i);
                        if (!(obj2 instanceof SerializableString)) {
                            jsonGenerator.writeString((String) obj2);
                            break;
                        } else {
                            jsonGenerator.writeString((SerializableString) obj2);
                            break;
                        }
                    case 7:
                        Object obj3 = segment.get(i);
                        if (!(obj3 instanceof Integer)) {
                            if (!(obj3 instanceof BigInteger)) {
                                if (!(obj3 instanceof Long)) {
                                    if (!(obj3 instanceof Short)) {
                                        jsonGenerator.writeNumber(((Number) obj3).intValue());
                                        break;
                                    } else {
                                        jsonGenerator.writeNumber(((Short) obj3).shortValue());
                                        break;
                                    }
                                } else {
                                    jsonGenerator.writeNumber(((Long) obj3).longValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.writeNumber((BigInteger) obj3);
                                break;
                            }
                        } else {
                            jsonGenerator.writeNumber(((Integer) obj3).intValue());
                            break;
                        }
                    case 8:
                        Object obj4 = segment.get(i);
                        if (obj4 instanceof Double) {
                            jsonGenerator.writeNumber(((Double) obj4).doubleValue());
                            break;
                        } else if (obj4 instanceof BigDecimal) {
                            jsonGenerator.writeNumber((BigDecimal) obj4);
                            break;
                        } else if (obj4 instanceof Float) {
                            jsonGenerator.writeNumber(((Float) obj4).floatValue());
                            break;
                        } else if (obj4 == null) {
                            jsonGenerator.writeNull();
                            break;
                        } else if (obj4 instanceof String) {
                            jsonGenerator.writeNumber((String) obj4);
                            break;
                        } else {
                            throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", new Object[]{obj4.getClass().getName()}), jsonGenerator);
                        }
                    case 9:
                        jsonGenerator.writeBoolean(true);
                        break;
                    case 10:
                        jsonGenerator.writeBoolean(false);
                        break;
                    case 11:
                        jsonGenerator.writeNull();
                        break;
                    case 12:
                        Object obj5 = segment.get(i);
                        if (!(obj5 instanceof RawValue)) {
                            if (!(obj5 instanceof JsonSerializable)) {
                                jsonGenerator.writeEmbeddedObject(obj5);
                                break;
                            } else {
                                jsonGenerator.writeObject(obj5);
                                break;
                            }
                        } else {
                            ((RawValue) obj5).serialize(jsonGenerator);
                            break;
                        }
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
            } else {
                return;
            }
        }
    }

    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        this._generatorFeatures = i;
        return this;
    }

    public String toString() {
        int i;
        StringBuilder h = C0072d.m201h("[TokenBuffer: ");
        JsonParser asParser = asParser();
        boolean z = false;
        if (this._hasNativeTypeIds || this._hasNativeObjectIds) {
            z = true;
            i = 0;
        } else {
            i = 0;
        }
        while (true) {
            try {
                JsonToken nextToken = asParser.nextToken();
                if (nextToken == null) {
                    break;
                }
                if (z) {
                    _appendNativeIds(h);
                }
                if (i < 100) {
                    if (i > 0) {
                        h.append(", ");
                    }
                    h.append(nextToken.toString());
                    if (nextToken == JsonToken.FIELD_NAME) {
                        h.append('(');
                        h.append(asParser.getCurrentName());
                        h.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            h.append(" ... (truncated ");
            h.append(i - 100);
            h.append(" entries)");
        }
        h.append(']');
        return h.toString();
    }

    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        writeObject(bArr2);
    }

    public void writeBoolean(boolean z) throws IOException {
        _appendValue(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    public void writeEmbeddedObject(Object obj) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    public final void writeEndArray() throws IOException {
        _appendEndMarker(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public final void writeEndObject() throws IOException {
        _appendEndMarker(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public final void writeFieldName(String str) throws IOException {
        this._writeContext.writeFieldName(str);
        _appendFieldName(str);
    }

    public void writeNull() throws IOException {
        _appendValue(JsonToken.VALUE_NULL);
    }

    public void writeNumber(short s) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            ObjectCodec objectCodec = this._objectCodec;
            if (objectCodec == null) {
                _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                objectCodec.writeValue(this, obj);
            }
        }
    }

    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    public void writeRaw(String str) throws IOException {
        _reportUnsupportedOperation();
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String str) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    public final void writeStartArray() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    public final void writeStartObject() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, treeNode);
        } else {
            objectCodec.writeTree(this, treeNode);
        }
    }

    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    public static final class Segment {
        public static final int TOKENS_PER_SEGMENT = 16;
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX;
        public TreeMap<Integer, Object> _nativeIds;
        public Segment _next;
        public long _tokenTypes;
        public final Object[] _tokens = new Object[16];

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            TOKEN_TYPES_BY_INDEX = jsonTokenArr;
            JsonToken[] values = JsonToken.values();
            System.arraycopy(values, 1, jsonTokenArr, 1, Math.min(15, values.length - 1));
        }

        private final int _objectIdIndex(int i) {
            return i + i + 1;
        }

        private final int _typeIdIndex(int i) {
            return i + i;
        }

        private final void assignNativeIds(int i, Object obj, Object obj2) {
            if (this._nativeIds == null) {
                this._nativeIds = new TreeMap<>();
            }
            if (obj != null) {
                this._nativeIds.put(Integer.valueOf(_objectIdIndex(i)), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(_typeIdIndex(i)), obj2);
            }
        }

        /* access modifiers changed from: private */
        public Object findObjectId(int i) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_objectIdIndex(i)));
        }

        /* access modifiers changed from: private */
        public Object findTypeId(int i) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_typeIdIndex(i)));
        }

        private void set(int i, JsonToken jsonToken) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
        }

        public Segment append(int i, JsonToken jsonToken) {
            if (i < 16) {
                set(i, jsonToken);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken);
            return this._next;
        }

        public Object get(int i) {
            return this._tokens[i];
        }

        public boolean hasIds() {
            return this._nativeIds != null;
        }

        public Segment next() {
            return this._next;
        }

        public int rawType(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return ((int) j) & 15;
        }

        public JsonToken type(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j) & 15];
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i, obj, obj2);
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2);
            return this._next;
        }

        private void set(int i, JsonToken jsonToken, Object obj) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i, obj2, obj3);
        }

        public Segment append(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                set(i, jsonToken, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2, obj3);
            return this._next;
        }
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
    }

    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    public void writeNumber(int i) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public void writeRaw(String str, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String str, int i, int i2) throws IOException {
        if (i > 0 || i2 != str.length()) {
            str = str.substring(i, i2 + i);
        }
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
        parser.setLocation(jsonParser.getTokenLocation());
        return parser;
    }

    public void writeFieldName(SerializableString serializableString) throws IOException {
        this._writeContext.writeFieldName(serializableString.getValue());
        _appendFieldName(serializableString);
    }

    public void writeNumber(long j) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    public void writeRaw(SerializableString serializableString) throws IOException {
        _reportUnsupportedOperation();
    }

    public void writeString(char[] cArr, int i, int i2) throws IOException {
        writeString(new String(cArr, i, i2));
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    public void writeNumber(double d) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    public final void writeStartArray(int i) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    public void writeStartObject(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    public void writeString(SerializableString serializableString) throws IOException {
        if (serializableString == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    public void writeNumber(float f) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public void writeRaw(char c) throws IOException {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(char[] cArr, int i, int i2) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new String(cArr, i, i2));
    }

    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public void writeStartArray(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    public final void _appendValue(JsonToken jsonToken, Object obj) {
        Segment segment;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public void writeStartObject(Object obj, int i) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    public void writeNumber(String str) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public void writeStartArray(Object obj, int i) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    public TokenBuffer(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean z = false;
        this._hasNativeId = false;
        this._objectCodec = jsonParser.getCodec();
        this._parentContext = jsonParser.getParsingContext();
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext((DupDetector) null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        boolean canReadObjectId = jsonParser.canReadObjectId();
        this._hasNativeObjectIds = canReadObjectId;
        this._mayHaveNativeIds = canReadObjectId | this._hasNativeTypeIds;
        this._forceBigDecimal = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : z;
    }
}
