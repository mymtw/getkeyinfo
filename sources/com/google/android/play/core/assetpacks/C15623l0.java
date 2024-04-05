package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.l0 */
public final class C15623l0 extends FilterInputStream {

    /* renamed from: b */
    public final C15648r1 f35228b = new C15648r1();

    /* renamed from: c */
    public byte[] f35229c = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: d */
    public long f35230d;

    /* renamed from: e */
    public boolean f35231e = false;

    /* renamed from: f */
    public boolean f35232f = false;

    public C15623l0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final C15615j0 mo55445a() throws IOException {
        byte[] bArr;
        if (this.f35230d > 0) {
            do {
                bArr = this.f35229c;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f35231e || this.f35232f) {
            return new C15615j0((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!mo55446b(30)) {
            this.f35231e = true;
            return this.f35228b.mo55483b();
        }
        C15615j0 b = this.f35228b.mo55483b();
        if (b.f35203e) {
            this.f35232f = true;
            return b;
        } else if (b.f35200b != UnsignedInteger.INT_MASK) {
            int i = this.f35228b.f35310f - 30;
            long j = (long) i;
            int length = this.f35229c.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f35229c = Arrays.copyOf(this.f35229c, length);
            }
            if (!mo55446b(i)) {
                this.f35231e = true;
                return this.f35228b.mo55483b();
            }
            C15615j0 b2 = this.f35228b.mo55483b();
            this.f35230d = b2.f35200b;
            return b2;
        } else {
            throw new zzck("Files bigger than 4GiB are not supported.");
        }
    }

    /* renamed from: b */
    public final boolean mo55446b(int i) throws IOException {
        int max = Math.max(0, super.read(this.f35229c, 0, i));
        if (max != i) {
            int i2 = i - max;
            if (Math.max(0, super.read(this.f35229c, max, i2)) != i2) {
                this.f35228b.mo55482a(0, max, this.f35229c);
                return false;
            }
        }
        this.f35228b.mo55482a(0, i, this.f35229c);
        return true;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f35230d;
        if (j <= 0 || this.f35231e) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i, (int) Math.min(j, (long) i2)));
        this.f35230d -= (long) max;
        if (max != 0) {
            return max;
        }
        this.f35231e = true;
        return 0;
    }
}
