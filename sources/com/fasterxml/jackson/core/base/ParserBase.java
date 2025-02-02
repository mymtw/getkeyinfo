package com.fasterxml.jackson.core.base;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.p333io.IOContext;
import com.fasterxml.jackson.core.p333io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import p010a9.C0048b;

public abstract class ParserBase extends ParserMinimalBase {
    public byte[] _binaryValue;
    public ByteArrayBuilder _byteArrayBuilder;
    public boolean _closed;
    public long _currInputProcessed;
    public int _currInputRow = 1;
    public int _currInputRowStart;
    public int _expLength;
    public int _fractLength;
    public int _inputEnd;
    public int _inputPtr;
    public int _intLength;
    public final IOContext _ioContext;
    public boolean _nameCopied;
    public char[] _nameCopyBuffer;
    public JsonToken _nextToken;
    public int _numTypesValid = 0;
    public BigDecimal _numberBigDecimal;
    public BigInteger _numberBigInt;
    public double _numberDouble;
    public int _numberInt;
    public long _numberLong;
    public boolean _numberNegative;
    public JsonReadContext _parsingContext;
    public final TextBuffer _textBuffer;
    public int _tokenInputCol;
    public int _tokenInputRow = 1;
    public long _tokenInputTotal;

    public ParserBase(IOContext iOContext, int i) {
        super(i);
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector((JsonParser) this) : null);
    }

    private void _parseSlowFloat(int i) throws IOException {
        if (i == 16) {
            try {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
            } catch (NumberFormatException e) {
                StringBuilder h = C0072d.m201h("Malformed numeric value (");
                h.append(_longNumberDesc(this._textBuffer.contentsAsString()));
                h.append(")");
                _wrapError(h.toString(), e);
            }
        } else {
            this._numberDouble = this._textBuffer.contentsAsDouble();
            this._numTypesValid = 8;
        }
    }

    private void _parseSlowInt(int i) throws IOException {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            int i2 = this._intLength;
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            boolean z = this._numberNegative;
            if (z) {
                textOffset++;
            }
            if (NumberInput.inLongRange(textBuffer, textOffset, i2, z)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
                return;
            }
            if (i == 1 || i == 2) {
                _reportTooLongIntegral(i, contentsAsString);
            }
            if (i != 8) {
                if (i != 32) {
                    this._numberBigInt = new BigInteger(contentsAsString);
                    this._numTypesValid = 4;
                    return;
                }
            }
            this._numberDouble = NumberInput.parseDouble(contentsAsString);
            this._numTypesValid = 8;
        } catch (NumberFormatException e) {
            StringBuilder h = C0072d.m201h("Malformed numeric value (");
            h.append(_longNumberDesc(contentsAsString));
            h.append(")");
            _wrapError(h.toString(), e);
        }
    }

    public static int[] growArrayBy(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public void _checkStdFeatureChanges(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) != 0 && (i & mask) != 0) {
            if (this._parsingContext.getDupDetector() == null) {
                this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector((JsonParser) this));
            } else {
                this._parsingContext = this._parsingContext.withDupDetector((DupDetector) null);
            }
        }
    }

    public abstract void _closeInput() throws IOException;

    public final int _decodeBase64Escape(Base64Variant base64Variant, int i, int i2) throws IOException {
        if (i == 92) {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i2 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char((int) _decodeEscaped);
            if (decodeBase64Char >= 0 || decodeBase64Char == -2) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i2);
        }
        throw reportInvalidBase64Char(base64Variant, i, i2);
    }

    public char _decodeEscaped() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final int _eofAsNextChar() throws JsonParseException {
        _handleEOF();
        return -1;
    }

    public void _finishString() throws IOException {
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    public Object _getSourceReference() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features)) {
            return this._ioContext.getSourceReference();
        }
        return null;
    }

    public void _handleBase64MissingPadding(Base64Variant base64Variant) throws IOException {
        _reportError(base64Variant.missingPaddingMessage());
    }

    public void _handleEOF() throws JsonParseException {
        if (!this._parsingContext.inRoot()) {
            _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", new Object[]{this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.getStartLocation(_getSourceReference())}), (JsonToken) null);
        }
    }

    public char _handleUnrecognizedCharacterEscape(char c) throws JsonProcessingException {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        StringBuilder h = C0072d.m201h("Unrecognized character escape ");
        h.append(ParserMinimalBase._getCharDesc(c));
        _reportError(h.toString());
        return c;
    }

    public int _parseIntValue() throws IOException {
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int contentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = contentsAsInt;
        this._numTypesValid = 1;
        return contentsAsInt;
    }

    public void _parseNumericValue(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._intLength;
            if (i2 <= 9) {
                this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
                this._numTypesValid = 1;
            } else if (i2 <= 18) {
                long contentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
                if (i2 == 10) {
                    if (this._numberNegative) {
                        if (contentsAsLong >= ParserMinimalBase.MIN_INT_L) {
                            this._numberInt = (int) contentsAsLong;
                            this._numTypesValid = 1;
                            return;
                        }
                    } else if (contentsAsLong <= ParserMinimalBase.MAX_INT_L) {
                        this._numberInt = (int) contentsAsLong;
                        this._numTypesValid = 1;
                        return;
                    }
                }
                this._numberLong = contentsAsLong;
                this._numTypesValid = 2;
            } else {
                _parseSlowInt(i);
            }
        } else if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            _parseSlowFloat(i);
        } else {
            _reportError("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
        }
    }

    public void _releaseBuffers() throws IOException {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    public void _reportMismatchedEndMarker(int i, char c) throws JsonParseException {
        JsonReadContext parsingContext = getParsingContext();
        _reportError(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i), Character.valueOf(c), parsingContext.typeDesc(), parsingContext.getStartLocation(_getSourceReference())}));
    }

    public void _reportTooLongIntegral(int i, String str) throws IOException {
        if (i == 1) {
            reportOverflowInt(str);
        } else {
            reportOverflowLong(str);
        }
    }

    public void _throwUnquotedSpace(int i, String str) throws JsonParseException {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            StringBuilder h = C0072d.m201h("Illegal unquoted character (");
            h.append(ParserMinimalBase._getCharDesc((char) i));
            h.append("): has to be escaped using backslash to be included in ");
            h.append(str);
            _reportError(h.toString());
        }
    }

    public String _validJsonTokenList() throws IOException {
        return _validJsonValueList();
    }

    public String _validJsonValueList() throws IOException {
        return isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public void close() throws IOException {
        if (!this._closed) {
            this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
            this._closed = true;
            try {
                _closeInput();
            } finally {
                _releaseBuffers();
            }
        }
    }

    public void convertNumberToBigDecimal() throws IOException {
        int i = this._numTypesValid;
        if ((i & 8) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
        } else if ((i & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf((long) this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    public void convertNumberToBigInteger() throws IOException {
        int i = this._numTypesValid;
        if ((i & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf((long) this._numberInt);
        } else if ((i & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    public void convertNumberToDouble() throws IOException {
        int i = this._numTypesValid;
        if ((i & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i & 2) != 0) {
            this._numberDouble = (double) this._numberLong;
        } else if ((i & 1) != 0) {
            this._numberDouble = (double) this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    public void convertNumberToInt() throws IOException {
        int i = this._numTypesValid;
        if ((i & 2) != 0) {
            long j = this._numberLong;
            int i2 = (int) j;
            if (((long) i2) != j) {
                reportOverflowInt(getText(), currentToken());
            }
            this._numberInt = i2;
        } else if ((i & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_INT.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i & 8) != 0) {
            double d = this._numberDouble;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i & 16) != 0) {
            if (ParserMinimalBase.BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    public void convertNumberToLong() throws IOException {
        int i = this._numTypesValid;
        if ((i & 1) != 0) {
            this._numberLong = (long) this._numberInt;
        } else if ((i & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i & 8) != 0) {
            double d = this._numberDouble;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i & 16) != 0) {
            if (ParserMinimalBase.BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    public JsonParser disable(JsonParser.Feature feature) {
        this._features &= ~feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION) {
            this._parsingContext = this._parsingContext.withDupDetector((DupDetector) null);
        }
        return this;
    }

    public JsonParser enable(JsonParser.Feature feature) {
        this._features |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector((JsonParser) this));
        }
        return this;
    }

    public BigInteger getBigIntegerValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 4) == 0) {
            if (i == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._binaryValue == null) {
            if (this._currToken != JsonToken.VALUE_STRING) {
                StringBuilder h = C0072d.m201h("Current token (");
                h.append(this._currToken);
                h.append(") not VALUE_STRING, can not access as binary");
                _reportError(h.toString());
            }
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), -1, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2._parsingContext.getParent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getCurrentName() throws java.io.IOException {
        /*
            r2 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r2._currToken
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 == r1) goto L_0x000a
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 != r1) goto L_0x0017
        L_0x000a:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r2._parsingContext
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r0.getParent()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.getCurrentName()
            return r0
        L_0x0017:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r2._parsingContext
            java.lang.String r0 = r0.getCurrentName()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.base.ParserBase.getCurrentName():java.lang.String");
    }

    public Object getCurrentValue() {
        return this._parsingContext.getCurrentValue();
    }

    public BigDecimal getDecimalValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 16) == 0) {
            if (i == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    public double getDoubleValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 8) == 0) {
            if (i == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    public float getFloatValue() throws IOException {
        return (float) getDoubleValue();
    }

    public int getIntValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 1) == 0) {
            if (i == 0) {
                return _parseIntValue();
            }
            if ((i & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public long getLongValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 2) == 0) {
            if (i == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    public JsonParser.NumberType getNumberType() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT) {
            return (this._numTypesValid & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.DOUBLE;
        }
        int i = this._numTypesValid;
        return (i & 1) != 0 ? JsonParser.NumberType.INT : (i & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
    }

    public Number getNumberValue() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i = this._numTypesValid;
            return (i & 1) != 0 ? Integer.valueOf(this._numberInt) : (i & 2) != 0 ? Long.valueOf(this._numberLong) : (i & 4) != 0 ? this._numberBigInt : this._numberBigDecimal;
        }
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i2 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    public long getTokenCharacterOffset() {
        return this._tokenInputTotal;
    }

    public int getTokenColumnNr() {
        int i = this._tokenInputCol;
        return i < 0 ? i : i + 1;
    }

    public int getTokenLineNr() {
        return this._tokenInputRow;
    }

    public JsonLocation getTokenLocation() {
        return new JsonLocation(_getSourceReference(), -1, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public boolean isNaN() {
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT || (this._numTypesValid & 8) == 0) {
            return false;
        }
        double d = this._numberDouble;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    @Deprecated
    public boolean loadMore() throws IOException {
        return false;
    }

    @Deprecated
    public void loadMoreGuaranteed() throws IOException {
        if (!loadMore()) {
            _reportInvalidEOF();
        }
    }

    public void overrideCurrentName(String str) {
        JsonReadContext jsonReadContext = this._parsingContext;
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            jsonReadContext = jsonReadContext.getParent();
        }
        try {
            jsonReadContext.setCurrentName(str);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public JsonParser overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2) throws IllegalArgumentException {
        return reportInvalidBase64Char(base64Variant, i, i2, (String) null);
    }

    public final JsonToken reset(boolean z, int i, int i2, int i3) {
        return (i2 >= 1 || i3 >= 1) ? resetFloat(z, i, i2, i3) : resetInt(z, i);
    }

    public final JsonToken resetAsNaN(String str, double d) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetFloat(boolean z, int i, int i2, int i3) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = i2;
        this._expLength = i3;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetInt(boolean z, int i) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Deprecated
    public JsonParser setFeatureMask(int i) {
        int i2 = this._features ^ i;
        if (i2 != 0) {
            this._features = i;
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", new Object[]{Integer.toHexString(i), Integer.valueOf(i2 + 1)});
        } else if (base64Variant.usesPaddingChar(i)) {
            StringBuilder h = C0072d.m201h("Unexpected padding character ('");
            h.append(base64Variant.getPaddingChar());
            h.append("') as character #");
            h.append(i2 + 1);
            h.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            str2 = h.toString();
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            StringBuilder h2 = C0072d.m201h("Illegal character (code 0x");
            h2.append(Integer.toHexString(i));
            h2.append(") in base64 content");
            str2 = h2.toString();
        } else {
            StringBuilder h3 = C0072d.m201h("Illegal character '");
            h3.append((char) i);
            h3.append("' (code 0x");
            h3.append(Integer.toHexString(i));
            h3.append(") in base64 content");
            str2 = h3.toString();
        }
        if (str != null) {
            str2 = C0048b.m163a(str2, ": ", str);
        }
        return new IllegalArgumentException(str2);
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, char c, int i) throws IOException {
        if (c == '\\') {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
            if (decodeBase64Char >= 0 || (decodeBase64Char == -2 && i >= 2)) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i);
        }
        throw reportInvalidBase64Char(base64Variant, c, i);
    }
}
