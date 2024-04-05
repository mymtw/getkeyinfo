package org.apache.http.entity.mime;

import android.support.p013v4.media.C0072d;
import org.apache.http.entity.mime.content.ContentBody;

public class FormBodyPart {
    private final ContentBody body;
    private final Header header;
    private final String name;

    public FormBodyPart(String str, ContentBody contentBody) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (contentBody != null) {
            this.name = str;
            this.body = contentBody;
            this.header = new Header();
            generateContentDisp(contentBody);
            generateContentType(contentBody);
            generateTransferEncoding(contentBody);
        } else {
            throw new IllegalArgumentException("Body may not be null");
        }
    }

    public void addField(String str, String str2) {
        if (str != null) {
            this.header.addField(new MinimalField(str, str2));
            return;
        }
        throw new IllegalArgumentException("Field name may not be null");
    }

    public void generateContentDisp(ContentBody contentBody) {
        StringBuilder h = C0072d.m201h("form-data; name=\"");
        h.append(getName());
        h.append("\"");
        if (contentBody.getFilename() != null) {
            h.append("; filename=\"");
            h.append(contentBody.getFilename());
            h.append("\"");
        }
        addField(MIME.CONTENT_DISPOSITION, h.toString());
    }

    public void generateContentType(ContentBody contentBody) {
        StringBuilder sb = new StringBuilder();
        sb.append(contentBody.getMimeType());
        if (contentBody.getCharset() != null) {
            sb.append("; charset=");
            sb.append(contentBody.getCharset());
        }
        addField("Content-Type", sb.toString());
    }

    public void generateTransferEncoding(ContentBody contentBody) {
        addField(MIME.CONTENT_TRANSFER_ENC, contentBody.getTransferEncoding());
    }

    public ContentBody getBody() {
        return this.body;
    }

    public Header getHeader() {
        return this.header;
    }

    public String getName() {
        return this.name;
    }
}
