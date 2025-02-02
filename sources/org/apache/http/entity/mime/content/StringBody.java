package org.apache.http.entity.mime.content;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.entity.mime.MIME;

public class StringBody extends AbstractContentBody {
    private final Charset charset;
    private final byte[] content;

    public StringBody(String str, String str2, Charset charset2) throws UnsupportedEncodingException {
        super(str2);
        if (str != null) {
            charset2 = charset2 == null ? Charset.forName("US-ASCII") : charset2;
            this.content = str.getBytes(charset2.name());
            this.charset = charset2;
            return;
        }
        throw new IllegalArgumentException("Text may not be null");
    }

    public static StringBody create(String str, String str2, Charset charset2) throws IllegalArgumentException {
        try {
            return new StringBody(str, str2, charset2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("Charset " + charset2 + " is not supported", e);
        }
    }

    public String getCharset() {
        return this.charset.name();
    }

    public long getContentLength() {
        return (long) this.content.length;
    }

    public String getFilename() {
        return null;
    }

    public Reader getReader() {
        return new InputStreamReader(new ByteArrayInputStream(this.content), this.charset);
    }

    public String getTransferEncoding() {
        return MIME.ENC_8BIT;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.content);
            byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    public static StringBody create(String str, Charset charset2) throws IllegalArgumentException {
        return create(str, (String) null, charset2);
    }

    public static StringBody create(String str) throws IllegalArgumentException {
        return create(str, (String) null, (Charset) null);
    }

    public StringBody(String str, Charset charset2) throws UnsupportedEncodingException {
        this(str, "text/plain", charset2);
    }

    public StringBody(String str) throws UnsupportedEncodingException {
        this(str, "text/plain", (Charset) null);
    }
}
