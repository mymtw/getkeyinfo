package org.apache.http.entity.mime.content;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.mime.MIME;

public class InputStreamBody extends AbstractContentBody {
    private final String filename;

    /* renamed from: in */
    private final InputStream f44404in;

    public InputStreamBody(InputStream inputStream, String str, String str2) {
        super(str);
        if (inputStream != null) {
            this.f44404in = inputStream;
            this.filename = str2;
            return;
        }
        throw new IllegalArgumentException("Input stream may not be null");
    }

    public String getCharset() {
        return null;
    }

    public long getContentLength() {
        return -1;
    }

    public String getFilename() {
        return this.filename;
    }

    public InputStream getInputStream() {
        return this.f44404in;
    }

    public String getTransferEncoding() {
        return MIME.ENC_BINARY;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            try {
                byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (true) {
                    int read = this.f44404in.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return;
                    }
                }
            } finally {
                this.f44404in.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    public InputStreamBody(InputStream inputStream, String str) {
        this(inputStream, "application/octet-stream", str);
    }
}
