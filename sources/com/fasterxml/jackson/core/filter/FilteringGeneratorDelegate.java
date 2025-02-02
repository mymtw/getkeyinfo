package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringGeneratorDelegate extends JsonGeneratorDelegate {
    public boolean _allowMultipleMatches;
    public TokenFilterContext _filterContext;
    @Deprecated
    public boolean _includeImmediateParent;
    public boolean _includePath;
    public TokenFilter _itemFilter;
    public int _matchCount;
    public TokenFilter rootFilter;

    public FilteringGeneratorDelegate(JsonGenerator jsonGenerator, TokenFilter tokenFilter, boolean z, boolean z2) {
        super(jsonGenerator, false);
        this.rootFilter = tokenFilter;
        this._itemFilter = tokenFilter;
        this._filterContext = TokenFilterContext.createRootContext(tokenFilter);
        this._includePath = z;
        this._allowMultipleMatches = z2;
    }

    public boolean _checkBinaryWrite() throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return false;
        }
        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
            return true;
        }
        if (!tokenFilter.includeBinary()) {
            return false;
        }
        _checkParentPath();
        return true;
    }

    public void _checkParentPath() throws IOException {
        this._matchCount++;
        if (this._includePath) {
            this._filterContext.writePath(this.delegate);
        }
        if (!this._allowMultipleMatches) {
            this._filterContext.skipParentChecks();
        }
    }

    public void _checkPropertyParentPath() throws IOException {
        this._matchCount++;
        if (this._includePath) {
            this._filterContext.writePath(this.delegate);
        } else if (this._includeImmediateParent) {
            this._filterContext.writeImmediatePath(this.delegate);
        }
        if (!this._allowMultipleMatches) {
            this._filterContext.skipParentChecks();
        }
    }

    public boolean _checkRawValueWrite() throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return false;
        }
        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
            return true;
        }
        if (!tokenFilter.includeRawValue()) {
            return false;
        }
        _checkParentPath();
        return true;
    }

    public TokenFilter getFilter() {
        return this.rootFilter;
    }

    public JsonStreamContext getFilterContext() {
        return this._filterContext;
    }

    public int getMatchCount() {
        return this._matchCount;
    }

    public JsonStreamContext getOutputContext() {
        return this._filterContext;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        if (_checkBinaryWrite()) {
            this.delegate.writeBinary(base64Variant, bArr, i, i2);
        }
    }

    public void writeBoolean(boolean z) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeBoolean(z)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeBoolean(z);
        }
    }

    public void writeEndArray() throws IOException {
        TokenFilterContext closeArray = this._filterContext.closeArray(this.delegate);
        this._filterContext = closeArray;
        if (closeArray != null) {
            this._itemFilter = closeArray.getFilter();
        }
    }

    public void writeEndObject() throws IOException {
        TokenFilterContext closeObject = this._filterContext.closeObject(this.delegate);
        this._filterContext = closeObject;
        if (closeObject != null) {
            this._itemFilter = closeObject.getFilter();
        }
    }

    public void writeFieldId(long j) throws IOException {
        writeFieldName(Long.toString(j));
    }

    public void writeFieldName(String str) throws IOException {
        TokenFilter fieldName = this._filterContext.setFieldName(str);
        if (fieldName == null) {
            this._itemFilter = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
        if (fieldName == tokenFilter) {
            this._itemFilter = fieldName;
            this.delegate.writeFieldName(str);
            return;
        }
        TokenFilter includeProperty = fieldName.includeProperty(str);
        this._itemFilter = includeProperty;
        if (includeProperty == tokenFilter) {
            _checkPropertyParentPath();
        }
    }

    public void writeNull() throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNull()) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNull();
        }
    }

    public void writeNumber(short s) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNumber((int) s)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(s);
        }
    }

    public void writeObjectId(Object obj) throws IOException {
        if (this._itemFilter != null) {
            this.delegate.writeObjectId(obj);
        }
    }

    public void writeObjectRef(Object obj) throws IOException {
        if (this._itemFilter != null) {
            this.delegate.writeObjectRef(obj);
        }
    }

    public void writeOmittedField(String str) throws IOException {
        if (this._itemFilter != null) {
            this.delegate.writeOmittedField(str);
        }
    }

    public void writeRaw(String str) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(str);
        }
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawUTF8String(bArr, i, i2);
        }
    }

    public void writeRawValue(String str) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawValue(str);
        }
    }

    public void writeStartArray() throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray();
            return;
        }
        TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = checkValue;
        if (checkValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        if (checkValue != tokenFilter2) {
            this._itemFilter = checkValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
            this.delegate.writeStartArray();
            return;
        }
        this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
    }

    public void writeStartObject() throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, true);
            this.delegate.writeStartObject();
            return;
        }
        TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
        if (checkValue != null) {
            if (checkValue != tokenFilter2) {
                checkValue = checkValue.filterStartObject();
            }
            if (checkValue == tokenFilter2) {
                _checkParentPath();
                this._filterContext = this._filterContext.createChildObjectContext(checkValue, true);
                this.delegate.writeStartObject();
                return;
            }
            this._filterContext = this._filterContext.createChildObjectContext(checkValue, false);
        }
    }

    public void writeString(String str) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeString(str)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeString(str);
        }
    }

    public void writeTypeId(Object obj) throws IOException {
        if (this._itemFilter != null) {
            this.delegate.writeTypeId(obj);
        }
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeUTF8String(bArr, i, i2);
        }
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        if (_checkBinaryWrite()) {
            return this.delegate.writeBinary(base64Variant, inputStream, i);
        }
        return -1;
    }

    public void writeRaw(String str, int i, int i2) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(str, i, i2);
        }
    }

    public void writeRawValue(String str, int i, int i2) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawValue(str, i, i2);
        }
    }

    public void writeRaw(SerializableString serializableString) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(serializableString);
        }
    }

    public void writeRawValue(char[] cArr, int i, int i2) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawValue(cArr, i, i2);
        }
    }

    public void writeNumber(int i) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNumber(i)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(i);
        }
    }

    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(cArr, i, i2);
        }
    }

    public void writeString(char[] cArr, int i, int i2) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                String str = new String(cArr, i, i2);
                TokenFilter checkValue = this._filterContext.checkValue(this._itemFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeString(str)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeString(cArr, i, i2);
        }
    }

    public void writeFieldName(SerializableString serializableString) throws IOException {
        TokenFilter fieldName = this._filterContext.setFieldName(serializableString.getValue());
        if (fieldName == null) {
            this._itemFilter = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
        if (fieldName == tokenFilter) {
            this._itemFilter = fieldName;
            this.delegate.writeFieldName(serializableString);
            return;
        }
        TokenFilter includeProperty = fieldName.includeProperty(serializableString.getValue());
        this._itemFilter = includeProperty;
        if (includeProperty == tokenFilter) {
            _checkPropertyParentPath();
        }
    }

    public void writeRaw(char c) throws IOException {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(c);
        }
    }

    public void writeStartObject(Object obj) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, true);
            this.delegate.writeStartObject(obj);
            return;
        }
        TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
        if (checkValue != null) {
            if (checkValue != tokenFilter2) {
                checkValue = checkValue.filterStartObject();
            }
            if (checkValue == tokenFilter2) {
                _checkParentPath();
                this._filterContext = this._filterContext.createChildObjectContext(checkValue, true);
                this.delegate.writeStartObject(obj);
                return;
            }
            this._filterContext = this._filterContext.createChildObjectContext(checkValue, false);
        }
    }

    public void writeNumber(long j) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNumber(j)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(j);
        }
    }

    public void writeStartArray(int i) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray(i);
            return;
        }
        TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = checkValue;
        if (checkValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        if (checkValue != tokenFilter2) {
            this._itemFilter = checkValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
            this.delegate.writeStartArray(i);
            return;
        }
        this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
    }

    public void writeString(SerializableString serializableString) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeString(serializableString.getValue())) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeString(serializableString);
        }
    }

    public void writeNumber(BigInteger bigInteger) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNumber(bigInteger)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(bigInteger);
        }
    }

    public void writeString(Reader reader, int i) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeString(reader, i)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeString(reader, i);
        }
    }

    public void writeStartObject(Object obj, int i) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, true);
            this.delegate.writeStartObject(obj, i);
            return;
        }
        TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
        if (checkValue != null) {
            if (checkValue != tokenFilter2) {
                checkValue = checkValue.filterStartObject();
            }
            if (checkValue == tokenFilter2) {
                _checkParentPath();
                this._filterContext = this._filterContext.createChildObjectContext(checkValue, true);
                this.delegate.writeStartObject(obj, i);
                return;
            }
            this._filterContext = this._filterContext.createChildObjectContext(checkValue, false);
        }
    }

    public void writeNumber(double d) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNumber(d)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(d);
        }
    }

    public void writeStartArray(Object obj) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray(obj);
            return;
        }
        TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = checkValue;
        if (checkValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        if (checkValue != tokenFilter2) {
            this._itemFilter = checkValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
            this.delegate.writeStartArray(obj);
            return;
        }
        this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
    }

    public void writeNumber(float f) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNumber(f)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(f);
        }
    }

    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeNumber(bigDecimal)) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(bigDecimal);
        }
    }

    public void writeStartArray(Object obj, int i) throws IOException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray(obj, i);
            return;
        }
        TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = checkValue;
        if (checkValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext((TokenFilter) null, false);
            return;
        }
        if (checkValue != tokenFilter2) {
            this._itemFilter = checkValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
            this.delegate.writeStartArray(obj, i);
            return;
        }
        this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
    }

    public void writeNumber(String str) throws IOException, UnsupportedOperationException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeRawValue()) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(str);
        }
    }

    public void writeNumber(char[] cArr, int i, int i2) throws IOException, UnsupportedOperationException {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter != null) {
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter != tokenFilter2) {
                TokenFilter checkValue = this._filterContext.checkValue(tokenFilter);
                if (checkValue != null) {
                    if (checkValue == tokenFilter2 || checkValue.includeRawValue()) {
                        _checkParentPath();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.delegate.writeNumber(cArr, i, i2);
        }
    }
}
