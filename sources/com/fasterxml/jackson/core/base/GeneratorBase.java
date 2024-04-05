package com.fasterxml.jackson.core.base;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public abstract class GeneratorBase extends JsonGenerator {
    public static final int DERIVED_FEATURES_MASK = ((JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask());
    public static final int MAX_BIG_DECIMAL_SCALE = 9999;
    public static final int SURR1_FIRST = 55296;
    public static final int SURR1_LAST = 56319;
    public static final int SURR2_FIRST = 56320;
    public static final int SURR2_LAST = 57343;
    public static final String WRITE_BINARY = "write a binary value";
    public static final String WRITE_BOOLEAN = "write a boolean value";
    public static final String WRITE_NULL = "write a null";
    public static final String WRITE_NUMBER = "write a number";
    public static final String WRITE_RAW = "write a raw (unencoded) value";
    public static final String WRITE_STRING = "write a string";
    public boolean _cfgNumbersAsStrings;
    public boolean _closed;
    public int _features;
    public ObjectCodec _objectCodec;
    public JsonWriteContext _writeContext;

    public GeneratorBase(int i, ObjectCodec objectCodec) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector((JsonGenerator) this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    public String _asString(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > 9999) {
            _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}));
        }
        return bigDecimal.toPlainString();
    }

    public void _checkStdFeatureChanges(int i, int i2) {
        if ((DERIVED_FEATURES_MASK & i2) != 0) {
            this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
            JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
            if (feature.enabledIn(i2)) {
                if (feature.enabledIn(i)) {
                    setHighestNonEscapedChar(127);
                } else {
                    setHighestNonEscapedChar(0);
                }
            }
            JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            if (!feature2.enabledIn(i2)) {
                return;
            }
            if (!feature2.enabledIn(i)) {
                this._writeContext = this._writeContext.withDupDetector((DupDetector) null);
            } else if (this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector((JsonGenerator) this));
            }
        }
    }

    public PrettyPrinter _constructDefaultPrettyPrinter() {
        return new DefaultPrettyPrinter();
    }

    public final int _decodeSurrogate(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            StringBuilder h = C0072d.m201h("Incomplete surrogate pair: first char 0x");
            h.append(Integer.toHexString(i));
            h.append(", second 0x");
            h.append(Integer.toHexString(i2));
            _reportError(h.toString());
        }
        return (i2 - 56320) + ((i - 55296) << 10) + 65536;
    }

    public abstract void _releaseBuffers();

    public abstract void _verifyValueWrite(String str) throws IOException;

    public void close() throws IOException {
        this._closed = true;
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= ~mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector((DupDetector) null);
            }
        }
        return this;
    }

    public JsonGenerator enable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features |= mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = true;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(127);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION && this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector((JsonGenerator) this));
            }
        }
        return this;
    }

    public abstract void flush() throws IOException;

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public Object getCurrentValue() {
        return this._writeContext.getCurrentValue();
    }

    public int getFeatureMask() {
        return this._features;
    }

    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    public JsonGenerator overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public void setCurrentValue(Object obj) {
        JsonWriteContext jsonWriteContext = this._writeContext;
        if (jsonWriteContext != null) {
            jsonWriteContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        int i2 = this._features ^ i;
        this._features = i;
        if (i2 != 0) {
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    public JsonGenerator useDefaultPrettyPrinter() {
        return getPrettyPrinter() != null ? this : setPrettyPrinter(_constructDefaultPrettyPrinter());
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        _reportUnsupportedOperation();
        return 0;
    }

    public void writeFieldName(SerializableString serializableString) throws IOException {
        writeFieldName(serializableString.getValue());
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    public void writeRawValue(String str) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        if (obj != null) {
            setCurrentValue(obj);
        }
    }

    public void writeString(SerializableString serializableString) throws IOException {
        writeString(serializableString.getValue());
    }

    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, treeNode);
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined");
    }

    public void writeRawValue(String str, int i, int i2) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str, i, i2);
    }

    public void writeRawValue(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(cArr, i, i2);
    }

    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }

    public GeneratorBase(int i, ObjectCodec objectCodec, JsonWriteContext jsonWriteContext) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._writeContext = jsonWriteContext;
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }
}
