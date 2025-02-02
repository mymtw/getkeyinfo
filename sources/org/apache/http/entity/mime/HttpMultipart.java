package org.apache.http.entity.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.util.ByteArrayBuffer;

public class HttpMultipart {
    private static final ByteArrayBuffer CR_LF;
    private static final ByteArrayBuffer FIELD_SEP;
    private static final ByteArrayBuffer TWO_DASHES;
    private final String boundary;
    private final Charset charset;
    private final HttpMultipartMode mode;
    private final List<FormBodyPart> parts;
    private final String subType;

    /* renamed from: org.apache.http.entity.mime.HttpMultipart$1 */
    public static /* synthetic */ class C200481 {
        public static final /* synthetic */ int[] $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.apache.http.entity.mime.HttpMultipartMode[] r0 = org.apache.http.entity.mime.HttpMultipartMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode = r0
                org.apache.http.entity.mime.HttpMultipartMode r1 = org.apache.http.entity.mime.HttpMultipartMode.STRICT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode     // Catch:{ NoSuchFieldError -> 0x001d }
                org.apache.http.entity.mime.HttpMultipartMode r1 = org.apache.http.entity.mime.HttpMultipartMode.BROWSER_COMPATIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.entity.mime.HttpMultipart.C200481.<clinit>():void");
        }
    }

    static {
        Charset charset2 = MIME.DEFAULT_CHARSET;
        FIELD_SEP = encode(charset2, ": ");
        CR_LF = encode(charset2, "\r\n");
        TWO_DASHES = encode(charset2, HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
    }

    public HttpMultipart(String str, Charset charset2, String str2, HttpMultipartMode httpMultipartMode) {
        if (str == null) {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        } else if (str2 != null) {
            this.subType = str;
            this.charset = charset2 == null ? MIME.DEFAULT_CHARSET : charset2;
            this.boundary = str2;
            this.parts = new ArrayList();
            this.mode = httpMultipartMode;
        } else {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        }
    }

    private void doWriteTo(HttpMultipartMode httpMultipartMode, OutputStream outputStream, boolean z) throws IOException {
        ByteArrayBuffer encode = encode(this.charset, getBoundary());
        for (FormBodyPart next : this.parts) {
            writeBytes(TWO_DASHES, outputStream);
            writeBytes(encode, outputStream);
            writeBytes(CR_LF, outputStream);
            Header header = next.getHeader();
            int i = C200481.$SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[httpMultipartMode.ordinal()];
            if (i == 1) {
                Iterator<MinimalField> it = header.iterator();
                while (it.hasNext()) {
                    writeField(it.next(), outputStream);
                }
            } else if (i == 2) {
                writeField(next.getHeader().getField(MIME.CONTENT_DISPOSITION), this.charset, outputStream);
                if (next.getBody().getFilename() != null) {
                    writeField(next.getHeader().getField("Content-Type"), this.charset, outputStream);
                }
            }
            ByteArrayBuffer byteArrayBuffer = CR_LF;
            writeBytes(byteArrayBuffer, outputStream);
            if (z) {
                next.getBody().writeTo(outputStream);
            }
            writeBytes(byteArrayBuffer, outputStream);
        }
        ByteArrayBuffer byteArrayBuffer2 = TWO_DASHES;
        writeBytes(byteArrayBuffer2, outputStream);
        writeBytes(encode, outputStream);
        writeBytes(byteArrayBuffer2, outputStream);
        writeBytes(CR_LF, outputStream);
    }

    private static ByteArrayBuffer encode(Charset charset2, String str) {
        ByteBuffer encode = charset2.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    private static void writeBytes(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) throws IOException {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    private static void writeField(MinimalField minimalField, OutputStream outputStream) throws IOException {
        writeBytes(minimalField.getName(), outputStream);
        writeBytes(FIELD_SEP, outputStream);
        writeBytes(minimalField.getBody(), outputStream);
        writeBytes(CR_LF, outputStream);
    }

    public void addBodyPart(FormBodyPart formBodyPart) {
        if (formBodyPart != null) {
            this.parts.add(formBodyPart);
        }
    }

    public List<FormBodyPart> getBodyParts() {
        return this.parts;
    }

    public String getBoundary() {
        return this.boundary;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public HttpMultipartMode getMode() {
        return this.mode;
    }

    public String getSubType() {
        return this.subType;
    }

    public long getTotalLength() {
        long j = 0;
        for (FormBodyPart body : this.parts) {
            long contentLength = body.getBody().getContentLength();
            if (contentLength < 0) {
                return -1;
            }
            j += contentLength;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            doWriteTo(this.mode, byteArrayOutputStream, false);
            return j + ((long) byteArrayOutputStream.toByteArray().length);
        } catch (IOException unused) {
            return -1;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        doWriteTo(this.mode, outputStream, true);
    }

    private static void writeBytes(String str, Charset charset2, OutputStream outputStream) throws IOException {
        writeBytes(encode(charset2, str), outputStream);
    }

    private static void writeBytes(String str, OutputStream outputStream) throws IOException {
        writeBytes(encode(MIME.DEFAULT_CHARSET, str), outputStream);
    }

    private static void writeField(MinimalField minimalField, Charset charset2, OutputStream outputStream) throws IOException {
        writeBytes(minimalField.getName(), charset2, outputStream);
        writeBytes(FIELD_SEP, outputStream);
        writeBytes(minimalField.getBody(), charset2, outputStream);
        writeBytes(CR_LF, outputStream);
    }

    public HttpMultipart(String str, Charset charset2, String str2) {
        this(str, charset2, str2, HttpMultipartMode.STRICT);
    }

    public HttpMultipart(String str, String str2) {
        this(str, (Charset) null, str2);
    }
}
