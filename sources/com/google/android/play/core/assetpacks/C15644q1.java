package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: com.google.android.play.core.assetpacks.q1 */
public final class C15644q1 extends InputStream {

    /* renamed from: b */
    public final Enumeration f35292b;

    /* renamed from: c */
    public FileInputStream f35293c;

    public C15644q1(Enumeration enumeration) throws IOException {
        this.f35292b = enumeration;
        mo55478a();
    }

    /* renamed from: a */
    public final void mo55478a() throws IOException {
        FileInputStream fileInputStream = this.f35293c;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        this.f35293c = this.f35292b.hasMoreElements() ? new FileInputStream((File) this.f35292b.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        FileInputStream fileInputStream = this.f35293c;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f35293c = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            FileInputStream fileInputStream = this.f35293c;
            if (fileInputStream == null) {
                return -1;
            }
            int read = fileInputStream.read();
            if (read != -1) {
                return read;
            }
            mo55478a();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f35293c == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f35293c.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo55478a();
            } while (this.f35293c != null);
            return -1;
        }
    }
}
