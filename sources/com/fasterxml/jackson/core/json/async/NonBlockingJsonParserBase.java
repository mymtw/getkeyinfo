package com.fasterxml.jackson.core.json.async;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.p333io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public abstract class NonBlockingJsonParserBase extends ParserBase {
    public static final int MAJOR_ARRAY_ELEMENT_FIRST = 5;
    public static final int MAJOR_ARRAY_ELEMENT_NEXT = 6;
    public static final int MAJOR_CLOSED = 7;
    public static final int MAJOR_INITIAL = 0;
    public static final int MAJOR_OBJECT_FIELD_FIRST = 2;
    public static final int MAJOR_OBJECT_FIELD_NEXT = 3;
    public static final int MAJOR_OBJECT_VALUE = 4;
    public static final int MAJOR_ROOT = 1;
    public static final int MINOR_COMMENT_C = 53;
    public static final int MINOR_COMMENT_CLOSING_ASTERISK = 52;
    public static final int MINOR_COMMENT_CPP = 54;
    public static final int MINOR_COMMENT_LEADING_SLASH = 51;
    public static final int MINOR_COMMENT_YAML = 55;
    public static final int MINOR_FIELD_APOS_NAME = 9;
    public static final int MINOR_FIELD_LEADING_COMMA = 5;
    public static final int MINOR_FIELD_LEADING_WS = 4;
    public static final int MINOR_FIELD_NAME = 7;
    public static final int MINOR_FIELD_NAME_ESCAPE = 8;
    public static final int MINOR_FIELD_UNQUOTED_NAME = 10;
    public static final int MINOR_NUMBER_EXPONENT_DIGITS = 32;
    public static final int MINOR_NUMBER_EXPONENT_MARKER = 31;
    public static final int MINOR_NUMBER_FRACTION_DIGITS = 30;
    public static final int MINOR_NUMBER_INTEGER_DIGITS = 26;
    public static final int MINOR_NUMBER_MINUS = 23;
    public static final int MINOR_NUMBER_MINUSZERO = 25;
    public static final int MINOR_NUMBER_ZERO = 24;
    public static final int MINOR_ROOT_BOM = 1;
    public static final int MINOR_ROOT_GOT_SEPARATOR = 3;
    public static final int MINOR_ROOT_NEED_SEPARATOR = 2;
    public static final int MINOR_VALUE_APOS_STRING = 45;
    public static final int MINOR_VALUE_EXPECTING_COLON = 14;
    public static final int MINOR_VALUE_EXPECTING_COMMA = 13;
    public static final int MINOR_VALUE_LEADING_WS = 12;
    public static final int MINOR_VALUE_STRING = 40;
    public static final int MINOR_VALUE_STRING_ESCAPE = 41;
    public static final int MINOR_VALUE_STRING_UTF8_2 = 42;
    public static final int MINOR_VALUE_STRING_UTF8_3 = 43;
    public static final int MINOR_VALUE_STRING_UTF8_4 = 44;
    public static final int MINOR_VALUE_TOKEN_ERROR = 50;
    public static final int MINOR_VALUE_TOKEN_FALSE = 18;
    public static final int MINOR_VALUE_TOKEN_NON_STD = 19;
    public static final int MINOR_VALUE_TOKEN_NULL = 16;
    public static final int MINOR_VALUE_TOKEN_TRUE = 17;
    public static final int MINOR_VALUE_WS_AFTER_COMMA = 15;
    public static final String[] NON_STD_TOKENS = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public static final int NON_STD_TOKEN_INFINITY = 1;
    public static final int NON_STD_TOKEN_MINUS_INFINITY = 3;
    public static final int NON_STD_TOKEN_NAN = 0;
    public static final int NON_STD_TOKEN_PLUS_INFINITY = 2;
    public static final double[] NON_STD_TOKEN_VALUES = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    public int _currBufferStart = 0;
    public int _currInputRowAlt = 1;
    public boolean _endOfInput = false;
    public int _majorState;
    public int _majorStateAfterValue;
    public int _minorState;
    public int _minorStateAfterSplit;
    public int _nonStdTokenType;
    public int _pending32;
    public int _pendingBytes;
    public int _quad1;
    public int[] _quadBuffer = new int[8];
    public int _quadLength;
    public int _quoted32;
    public int _quotedDigits;
    public final ByteQuadsCanonicalizer _symbols;

    public NonBlockingJsonParserBase(IOContext iOContext, int i, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i);
        this._symbols = byteQuadsCanonicalizer;
        this._currToken = null;
        this._majorState = 0;
        this._majorStateAfterValue = 1;
    }

    public static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String _addName(int[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            com.fasterxml.jackson.core.util.TextBuffer r8 = r0._textBuffer
            char[] r8 = r8.emptyAndGetCurrentSegment()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00f5
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00e2
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r5 = 1
            if (r13 != r14) goto L_0x0044
            r12 = r12 & 31
            r13 = r5
            goto L_0x005d
        L_0x0044:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x004e
            r12 = r12 & 15
            r13 = 2
            goto L_0x005d
        L_0x004e:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x0058
            r12 = r12 & 7
            r13 = r7
            goto L_0x005d
        L_0x0058:
            r0._reportInvalidInitial(r12)
            r12 = r5
            r13 = r12
        L_0x005d:
            int r14 = r10 + r13
            if (r14 <= r4) goto L_0x0068
            com.fasterxml.jackson.core.JsonToken r14 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            java.lang.String r6 = " in field name"
            r0._reportInvalidEOF(r6, r14)
        L_0x0068:
            int r6 = r10 >> 2
            r6 = r1[r6]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r6 = r6 >> r14
            int r10 = r10 + 1
            r14 = r6 & 192(0xc0, float:2.69E-43)
            r15 = 128(0x80, float:1.794E-43)
            if (r14 == r15) goto L_0x007d
            r0._reportInvalidOther(r6)
        L_0x007d:
            int r12 = r12 << 6
            r6 = r6 & 63
            r6 = r6 | r12
            if (r13 <= r5) goto L_0x00be
            int r5 = r10 >> 2
            r5 = r1[r5]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r5 = r5 >> r12
            int r10 = r10 + 1
            r12 = r5 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x0097
            r0._reportInvalidOther(r5)
        L_0x0097:
            int r6 = r6 << 6
            r5 = r5 & 63
            r5 = r5 | r6
            r6 = 2
            if (r13 <= r6) goto L_0x00bb
            int r6 = r10 >> 2
            r6 = r1[r6]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r6 = r6 >> r12
            int r10 = r10 + 1
            r12 = r6 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x00b4
            r12 = r6 & 255(0xff, float:3.57E-43)
            r0._reportInvalidOther(r12)
        L_0x00b4:
            int r5 = r5 << 6
            r6 = r6 & 63
            r5 = r5 | r6
            r12 = r5
            goto L_0x00bf
        L_0x00bb:
            r12 = r5
            r5 = r6
            goto L_0x00c0
        L_0x00be:
            r12 = r6
        L_0x00bf:
            r5 = 2
        L_0x00c0:
            if (r13 <= r5) goto L_0x00e2
            r5 = 65536(0x10000, float:9.18355E-41)
            int r12 = r12 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00cf
            com.fasterxml.jackson.core.util.TextBuffer r5 = r0._textBuffer
            char[] r5 = r5.expandCurrentSegment()
            r8 = r5
        L_0x00cf:
            int r5 = r11 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r13 = r12 >> 10
            int r13 = r13 + r6
            char r6 = (char) r13
            r8[r11] = r6
            r6 = 56320(0xdc00, float:7.8921E-41)
            r11 = r12 & 1023(0x3ff, float:1.434E-42)
            r12 = r11 | r6
            r11 = r5
        L_0x00e2:
            int r5 = r8.length
            if (r11 < r5) goto L_0x00ec
            com.fasterxml.jackson.core.util.TextBuffer r5 = r0._textBuffer
            char[] r5 = r5.expandCurrentSegment()
            r8 = r5
        L_0x00ec:
            int r5 = r11 + 1
            char r6 = (char) r12
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00f5:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x0102
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x0102:
            com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer r3 = r0._symbols
            java.lang.String r1 = r3.addName((java.lang.String) r4, (int[]) r1, (int) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase._addName(int[], int, int):java.lang.String");
    }

    public final JsonToken _closeArrayScope() throws IOException {
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i;
        this._majorStateAfterValue = i;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public void _closeInput() throws IOException {
        this._currBufferStart = 0;
        this._inputEnd = 0;
    }

    public final JsonToken _closeObjectScope() throws IOException {
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i;
        this._majorStateAfterValue = i;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _eofAsNextToken() throws IOException {
        this._majorState = 7;
        if (!this._parsingContext.inRoot()) {
            _handleEOF();
        }
        close();
        this._currToken = null;
        return null;
    }

    public final JsonToken _fieldComplete(String str) throws IOException {
        this._majorState = 4;
        this._parsingContext.setCurrentName(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final String _findName(int i, int i2) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i, i2);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return _addName(iArr, 1, i2);
    }

    public final String _getText2(JsonToken jsonToken) {
        int id;
        if (jsonToken == null || (id = jsonToken.mo41203id()) == -1) {
            return null;
        }
        return id != 5 ? (id == 6 || id == 7 || id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    public final String _nonStdToken(int i) {
        return NON_STD_TOKENS[i];
    }

    public void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this._symbols.release();
    }

    public void _reportInvalidChar(int i) throws JsonParseException {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    public void _reportInvalidInitial(int i) throws JsonParseException {
        StringBuilder h = C0072d.m201h("Invalid UTF-8 start byte 0x");
        h.append(Integer.toHexString(i));
        _reportError(h.toString());
    }

    public void _reportInvalidOther(int i) throws JsonParseException {
        StringBuilder h = C0072d.m201h("Invalid UTF-8 middle byte 0x");
        h.append(Integer.toHexString(i));
        _reportError(h.toString());
    }

    public final JsonToken _startArrayScope() throws IOException {
        this._parsingContext = this._parsingContext.createChildArrayContext(-1, -1);
        this._majorState = 5;
        this._majorStateAfterValue = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _startObjectScope() throws IOException {
        this._parsingContext = this._parsingContext.createChildObjectContext(-1, -1);
        this._majorState = 2;
        this._majorStateAfterValue = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final void _updateTokenLocation() {
        this._tokenInputRow = Math.max(this._currInputRow, this._currInputRowAlt);
        int i = this._inputPtr;
        this._tokenInputCol = i - this._currInputRowStart;
        this._tokenInputTotal = this._currInputProcessed + ((long) (i - this._currBufferStart));
    }

    public final JsonToken _valueComplete(JsonToken jsonToken) throws IOException {
        this._majorState = this._majorStateAfterValue;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueCompleteInt(int i, String str) throws IOException {
        this._textBuffer.resetWithString(str);
        this._intLength = str.length();
        this._numTypesValid = 1;
        this._numberInt = i;
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueNonStdNumberComplete(int i) throws IOException {
        String str = NON_STD_TOKENS[i];
        this._textBuffer.resetWithString(str);
        if (!isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            _reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        this._intLength = 0;
        this._numTypesValid = 8;
        this._numberDouble = NON_STD_TOKEN_VALUES[i];
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public boolean canParseAsync() {
        return true;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", jsonToken);
        }
        if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    public ObjectCodec getCodec() {
        return null;
    }

    public JsonLocation getCurrentLocation() {
        int i = (this._inputPtr - this._currInputRowStart) + 1;
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) (this._inputPtr - this._currBufferStart)), -1, Math.max(this._currInputRow, this._currInputRowAlt), i);
    }

    public Object getEmbeddedObject() throws IOException {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this._binaryValue;
        }
        return null;
    }

    public Object getInputSource() {
        return null;
    }

    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        return _getText2(jsonToken);
    }

    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.mo41203id();
        if (id != 5) {
            return (id == 6 || id == 7 || id == 8) ? this._textBuffer.getTextBuffer() : this._currToken.asCharArray();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.mo41203id();
        return id != 5 ? (id == 6 || id == 7 || id == 8) ? this._textBuffer.size() : this._currToken.asCharArray().length : this._parsingContext.getCurrentName().length();
    }

    public int getTextOffset() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.mo41203id();
        if (id == 6 || id == 7 || id == 8) {
            return this._textBuffer.getTextOffset();
        }
        return 0;
    }

    public JsonLocation getTokenLocation() {
        return new JsonLocation(_getSourceReference(), this._tokenInputTotal, -1, this._tokenInputRow, this._tokenInputCol);
    }

    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString((String) null);
    }

    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.hasTextAsCharacters();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    public abstract int releaseBuffered(OutputStream outputStream) throws IOException;

    public void setCodec(ObjectCodec objectCodec) {
        throw new UnsupportedOperationException("Can not use ObjectMapper with non-blocking parser");
    }

    public ByteQuadsCanonicalizer symbolTableForTests() {
        return this._symbols;
    }

    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        } else if (jsonToken == null) {
            return 0;
        } else {
            if (jsonToken.isNumeric()) {
                return this._textBuffer.contentsToWriter(writer);
            }
            if (jsonToken == JsonToken.NOT_AVAILABLE) {
                _reportError("Current token not available: can not call this method");
            }
            char[] asCharArray = jsonToken.asCharArray();
            writer.write(asCharArray);
            return asCharArray.length;
        }
    }

    public final String _findName(int i, int i2, int i3) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(i, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = _padLastQuad;
        return _addName(iArr, 2, i3);
    }

    public void _reportInvalidOther(int i, int i2) throws JsonParseException {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    public final String _findName(int i, int i2, int i3, int i4) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i, i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(_padLastQuad, i4);
        return _addName(iArr, 3, i4);
    }
}
