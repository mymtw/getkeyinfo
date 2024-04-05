package com.fasterxml.jackson.core.base;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.p333io.JsonEOFException;
import com.fasterxml.jackson.core.p333io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.google.android.gms.common.api.Api;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.cli.HelpFormatter;
import p010a9.C0048b;

public abstract class ParserMinimalBase extends JsonParser {
    public static final BigDecimal BD_MAX_INT;
    public static final BigDecimal BD_MAX_LONG;
    public static final BigDecimal BD_MIN_INT;
    public static final BigDecimal BD_MIN_LONG;
    public static final BigInteger BI_MAX_INT;
    public static final BigInteger BI_MAX_LONG;
    public static final BigInteger BI_MIN_INT;
    public static final BigInteger BI_MIN_LONG;
    public static final char CHAR_NULL = '\u0000';
    public static final int INT_0 = 48;
    public static final int INT_9 = 57;
    public static final int INT_APOS = 39;
    public static final int INT_ASTERISK = 42;
    public static final int INT_BACKSLASH = 92;
    public static final int INT_COLON = 58;
    public static final int INT_COMMA = 44;
    public static final int INT_CR = 13;
    public static final int INT_E = 69;
    public static final int INT_HASH = 35;
    public static final int INT_LBRACKET = 91;
    public static final int INT_LCURLY = 123;
    public static final int INT_LF = 10;
    public static final int INT_MINUS = 45;
    public static final int INT_PERIOD = 46;
    public static final int INT_PLUS = 43;
    public static final int INT_QUOTE = 34;
    public static final int INT_RBRACKET = 93;
    public static final int INT_RCURLY = 125;
    public static final int INT_SLASH = 47;
    public static final int INT_SPACE = 32;
    public static final int INT_TAB = 9;
    public static final int INT_e = 101;
    public static final int MAX_ERROR_TOKEN_LENGTH = 256;
    public static final double MAX_INT_D = 2.147483647E9d;
    public static final long MAX_INT_L = 2147483647L;
    public static final double MAX_LONG_D = 9.223372036854776E18d;
    public static final double MIN_INT_D = -2.147483648E9d;
    public static final long MIN_INT_L = -2147483648L;
    public static final double MIN_LONG_D = -9.223372036854776E18d;
    public static final byte[] NO_BYTES = new byte[0];
    public static final int[] NO_INTS = new int[0];
    public static final int NR_BIGDECIMAL = 16;
    public static final int NR_BIGINT = 4;
    public static final int NR_DOUBLE = 8;
    public static final int NR_FLOAT = 32;
    public static final int NR_INT = 1;
    public static final int NR_LONG = 2;
    public static final int NR_UNKNOWN = 0;
    public JsonToken _currToken;
    public JsonToken _lastClearedToken;

    static {
        BigInteger valueOf = BigInteger.valueOf(MIN_INT_L);
        BI_MIN_INT = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(MAX_INT_L);
        BI_MAX_INT = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        BI_MAX_LONG = valueOf4;
        BD_MIN_LONG = new BigDecimal(valueOf3);
        BD_MAX_LONG = new BigDecimal(valueOf4);
        BD_MIN_INT = new BigDecimal(valueOf);
        BD_MAX_INT = new BigDecimal(valueOf2);
    }

    public ParserMinimalBase() {
    }

    @Deprecated
    public static String _ascii(byte[] bArr) {
        try {
            return new String(bArr, "US-ASCII");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public static byte[] _asciiBytes(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static final String _getCharDesc(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return C0069a.m175f("(CTRL-CHAR, code ", i, ")");
        }
        if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        }
        return "'" + c + "' (code " + i + ")";
    }

    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException((JsonParser) this, str, th);
    }

    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e) {
            _reportError(e.getMessage());
        }
    }

    public abstract void _handleEOF() throws JsonParseException;

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public String _longIntegerDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    public String _longNumberDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    public final void _reportError(String str) throws JsonParseException {
        throw _constructError(str);
    }

    public void _reportInputCoercion(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    public void _reportInvalidEOF() throws JsonParseException {
        StringBuilder h = C0072d.m201h(" in ");
        h.append(this._currToken);
        _reportInvalidEOF(h.toString(), this._currToken);
    }

    public void _reportInvalidEOFInValue(JsonToken jsonToken) throws JsonParseException {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        _reportInvalidEOF(str, jsonToken);
    }

    public void _reportMissingRootWS(int i) throws JsonParseException {
        _reportUnexpectedChar(i, "Expected space separating root-level values");
    }

    public void _reportUnexpectedChar(int i, String str) throws JsonParseException {
        if (i < 0) {
            _reportInvalidEOF();
        }
        String format = String.format("Unexpected character (%s)", new Object[]{_getCharDesc(i)});
        if (str != null) {
            format = C0048b.m163a(format, ": ", str);
        }
        _reportError(format);
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public void _throwInvalidSpace(int i) throws JsonParseException {
        StringBuilder h = C0072d.m201h("Illegal character (");
        h.append(_getCharDesc((char) i));
        h.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        _reportError(h.toString());
    }

    public final void _wrapError(String str, Throwable th) throws JsonParseException {
        throw _constructError(str, th);
    }

    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    public abstract void close() throws IOException;

    public JsonToken currentToken() {
        return this._currToken;
    }

    public int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.mo41203id();
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant) throws IOException;

    public abstract String getCurrentName() throws IOException;

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.mo41203id();
    }

    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    public abstract JsonStreamContext getParsingContext();

    public abstract String getText() throws IOException;

    public abstract char[] getTextCharacters() throws IOException;

    public abstract int getTextLength() throws IOException;

    public abstract int getTextOffset() throws IOException;

    public boolean getValueAsBoolean(boolean z) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            switch (jsonToken.mo41203id()) {
                case 6:
                    String trim = getText().trim();
                    if ("true".equals(trim)) {
                        return true;
                    }
                    if (!"false".equals(trim) && !_hasTextualNull(trim)) {
                        return z;
                    }
                    return false;
                case 7:
                    return getIntValue() != 0;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Boolean) {
                        return ((Boolean) embeddedObject).booleanValue();
                    }
                    break;
            }
        }
        return z;
    }

    public double getValueAsDouble(double d) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return d;
        }
        switch (jsonToken.mo41203id()) {
            case 6:
                String text = getText();
                return _hasTextualNull(text) ? ShadowDrawableWrapper.COS_45 : NumberInput.parseAsDouble(text, d);
            case 7:
            case 8:
                return getDoubleValue();
            case 9:
                return 1.0d;
            case 10:
            case 11:
                return ShadowDrawableWrapper.COS_45;
            case 12:
                Object embeddedObject = getEmbeddedObject();
                return embeddedObject instanceof Number ? ((Number) embeddedObject).doubleValue() : d;
            default:
                return d;
        }
    }

    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        return getValueAsInt(0);
    }

    public long getValueAsLong() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        return getValueAsLong(0);
    }

    public String getValueAsString() throws IOException {
        return getValueAsString((String) null);
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public abstract boolean hasTextCharacters();

    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i == 0 : jsonToken.mo41203id() == i;
    }

    public abstract boolean isClosed();

    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    public abstract JsonToken nextToken() throws IOException;

    public JsonToken nextValue() throws IOException {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    public abstract void overrideCurrentName(String str);

    public void reportInvalidNumber(String str) throws JsonParseException {
        _reportError("Invalid numeric value: " + str);
    }

    public void reportOverflowInt() throws IOException {
        reportOverflowInt(getText());
    }

    public void reportOverflowLong() throws IOException {
        reportOverflowLong(getText());
    }

    public void reportUnexpectedNumberChar(int i, String str) throws JsonParseException {
        String format = String.format("Unexpected character (%s) in numeric value", new Object[]{_getCharDesc(i)});
        if (str != null) {
            format = C0048b.m163a(format, ": ", str);
        }
        _reportError(format);
    }

    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                _handleEOF();
                return this;
            } else if (nextToken.isStructStart()) {
                i++;
            } else if (nextToken.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (nextToken == JsonToken.NOT_AVAILABLE) {
                _reportError("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    public ParserMinimalBase(int i) {
        super(i);
    }

    public final void _reportError(String str, Object obj) throws JsonParseException {
        throw _constructError(String.format(str, new Object[]{obj}));
    }

    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }

    public void reportOverflowInt(String str) throws IOException {
        reportOverflowInt(str, currentToken());
    }

    public void reportOverflowLong(String str) throws IOException {
        reportOverflowLong(str, currentToken());
    }

    public final void _reportError(String str, Object obj, Object obj2) throws JsonParseException {
        throw _constructError(String.format(str, new Object[]{obj, obj2}));
    }

    public void reportOverflowInt(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{_longIntegerDesc(str), Integer.MIN_VALUE, Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER)}), jsonToken, Integer.TYPE);
    }

    public void reportOverflowLong(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{_longIntegerDesc(str), Long.MIN_VALUE, Long.MAX_VALUE}), jsonToken, Long.TYPE);
    }

    @Deprecated
    public void _reportInvalidEOFInValue() throws JsonParseException {
        _reportInvalidEOF(" in a value");
    }

    public int getValueAsInt(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken == null) {
            return i;
        }
        int id = jsonToken.mo41203id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).intValue();
                    }
                    return i;
                default:
                    return i;
            }
        } else {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0;
            }
            return NumberInput.parseAsInt(text, i);
        }
    }

    public long getValueAsLong(long j) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken == null) {
            return j;
        }
        int id = jsonToken.mo41203id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).longValue();
                    }
                    return j;
                default:
                    return j;
            }
        } else {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0;
            }
            return NumberInput.parseAsLong(text, j);
        }
    }

    public void _reportInvalidEOF(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, C0326j.m864i("Unexpected end-of-input", str));
    }

    @Deprecated
    public void _reportInvalidEOF(String str) throws JsonParseException {
        throw new JsonEOFException(this, (JsonToken) null, C0326j.m864i("Unexpected end-of-input", str));
    }
}
