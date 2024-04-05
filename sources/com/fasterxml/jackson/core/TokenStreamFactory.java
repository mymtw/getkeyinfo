package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p333io.DataOutputAsStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.URL;

public abstract class TokenStreamFactory implements Versioned, Serializable {
    private static final long serialVersionUID = 2;

    public OutputStream _createDataOutputWrapper(DataOutput dataOutput) {
        return new DataOutputAsStream(dataOutput);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r3.getHost();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream _optimizedStreamFromURL(java.net.URL r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = r3.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r3.getHost()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002e
        L_0x0018:
            java.lang.String r0 = r3.getPath()
            r1 = 37
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L_0x002e
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r3 = r3.getPath()
            r0.<init>(r3)
            return r0
        L_0x002e:
            java.io.InputStream r3 = r3.openStream()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.TokenStreamFactory._optimizedStreamFromURL(java.net.URL):java.io.InputStream");
    }

    public abstract boolean canHandleBinaryNatively();

    public abstract boolean canParseAsync();

    public abstract boolean canUseSchema(FormatSchema formatSchema);

    public abstract JsonGenerator createGenerator(DataOutput dataOutput) throws IOException;

    public abstract JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException;

    public abstract JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException;

    public abstract JsonGenerator createGenerator(OutputStream outputStream) throws IOException;

    public abstract JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException;

    public abstract JsonGenerator createGenerator(Writer writer) throws IOException;

    public abstract JsonParser createNonBlockingByteArrayParser() throws IOException;

    public abstract JsonParser createParser(DataInput dataInput) throws IOException;

    public abstract JsonParser createParser(File file) throws IOException;

    public abstract JsonParser createParser(InputStream inputStream) throws IOException;

    public abstract JsonParser createParser(Reader reader) throws IOException;

    public abstract JsonParser createParser(String str) throws IOException;

    public abstract JsonParser createParser(URL url) throws IOException;

    public abstract JsonParser createParser(byte[] bArr) throws IOException;

    public abstract JsonParser createParser(byte[] bArr, int i, int i2) throws IOException;

    public abstract JsonParser createParser(char[] cArr) throws IOException;

    public abstract JsonParser createParser(char[] cArr, int i, int i2) throws IOException;

    public abstract int getFormatGeneratorFeatures();

    public abstract String getFormatName();

    public abstract int getFormatParserFeatures();

    public abstract Class<? extends FormatFeature> getFormatReadFeatureType();

    public abstract Class<? extends FormatFeature> getFormatWriteFeatureType();

    public abstract int getGeneratorFeatures();

    public abstract int getParserFeatures();

    public abstract boolean isEnabled(JsonGenerator.Feature feature);

    public abstract boolean isEnabled(JsonParser.Feature feature);

    public abstract boolean requiresPropertyOrdering();
}
