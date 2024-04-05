package org.apache.commons.codec.binary;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseNCodecInputStream extends FilterInputStream {
    private final BaseNCodec baseNCodec;
    private final boolean doEncode;
    private final byte[] singleByte = new byte[1];

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec2, boolean z) {
        super(inputStream);
        this.doEncode = z;
        this.baseNCodec = baseNCodec2;
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int read = read(this.singleByte, 0, 1);
        while (read == 0) {
            read = read(this.singleByte, 0, 1);
        }
        if (read <= 0) {
            return -1;
        }
        byte b = this.singleByte[0];
        return b < 0 ? b + 256 : b;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i > bArr.length || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            int i3 = 0;
            while (i3 == 0) {
                if (!this.baseNCodec.hasData()) {
                    byte[] bArr2 = new byte[(this.doEncode ? RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT : 8192)];
                    int read = this.in.read(bArr2);
                    if (this.doEncode) {
                        this.baseNCodec.encode(bArr2, 0, read);
                    } else {
                        this.baseNCodec.decode(bArr2, 0, read);
                    }
                }
                i3 = this.baseNCodec.readResults(bArr, i, i2);
            }
            return i3;
        }
    }
}
