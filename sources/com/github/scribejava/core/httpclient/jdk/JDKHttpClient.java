package com.github.scribejava.core.httpclient.jdk;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Map;
import p477wg.C13849c;
import p477wg.C13850d;

public final class JDKHttpClient implements Closeable {

    public enum BodyType {
        BYTE_ARRAY {
            public void setBody(HttpURLConnection httpURLConnection, Object obj, boolean z) throws IOException {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                if (z || length > 0) {
                    OutputStream a = JDKHttpClient.m20293a(httpURLConnection, length);
                    if (length > 0) {
                        a.write(bArr);
                    }
                }
            }
        },
        MULTIPART {
            public void setBody(HttpURLConnection httpURLConnection, Object obj, boolean z) throws IOException {
                C13849c cVar = (C13849c) obj;
                for (Map.Entry next : cVar.f30476a.entrySet()) {
                    httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (z) {
                    ByteArrayOutputStream a = C13850d.m21384a(cVar);
                    int size = a.size();
                    OutputStream a2 = JDKHttpClient.m20293a(httpURLConnection, size);
                    if (size > 0) {
                        a.writeTo(a2);
                    }
                }
            }
        },
        STRING {
            public void setBody(HttpURLConnection httpURLConnection, Object obj, boolean z) throws IOException {
                byte[] bytes = ((String) obj).getBytes();
                int length = bytes.length;
                if (z || length > 0) {
                    OutputStream a = JDKHttpClient.m20293a(httpURLConnection, length);
                    if (length > 0) {
                        a.write(bytes);
                    }
                }
            }
        };

        public abstract void setBody(HttpURLConnection httpURLConnection, Object obj, boolean z) throws IOException;
    }

    /* renamed from: a */
    public static OutputStream m20293a(HttpURLConnection httpURLConnection, int i) throws IOException {
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(i));
        if (httpURLConnection.getRequestProperty("Content-Type") == null) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        }
        httpURLConnection.setDoOutput(true);
        return httpURLConnection.getOutputStream();
    }
}
