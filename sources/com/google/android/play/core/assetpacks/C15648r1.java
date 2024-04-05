package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.util.Arrays;
import p568fn.C17782b;

/* renamed from: com.google.android.play.core.assetpacks.r1 */
public final class C15648r1 {

    /* renamed from: a */
    public byte[] f35305a = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b */
    public int f35306b = 0;

    /* renamed from: c */
    public long f35307c = -1;

    /* renamed from: d */
    public long f35308d = -1;

    /* renamed from: e */
    public int f35309e = -1;

    /* renamed from: f */
    public int f35310f = 30;

    /* renamed from: g */
    public int f35311g = -1;

    /* renamed from: h */
    public boolean f35312h = false;

    /* renamed from: i */
    public String f35313i = null;

    /* renamed from: a */
    public final int mo55482a(int i, int i2, byte[] bArr) {
        int c = mo55484c(30, i, i2, bArr);
        if (c == -1) {
            return -1;
        }
        if (this.f35307c == -1) {
            byte[] bArr2 = this.f35305a;
            long w0 = ((long) ((C17782b.m29893w0(2, bArr2) << 16) | C17782b.m29893w0(0, bArr2))) & UnsignedInteger.INT_MASK;
            this.f35307c = w0;
            if (w0 == 67324752) {
                this.f35312h = false;
                byte[] bArr3 = this.f35305a;
                this.f35308d = ((long) ((C17782b.m29893w0(20, bArr3) << 16) | C17782b.m29893w0(18, bArr3))) & UnsignedInteger.INT_MASK;
                this.f35311g = C17782b.m29893w0(8, this.f35305a);
                this.f35309e = C17782b.m29893w0(26, this.f35305a);
                int w02 = this.f35309e + 30 + C17782b.m29893w0(28, this.f35305a);
                this.f35310f = w02;
                int length = this.f35305a.length;
                if (length < w02) {
                    do {
                        length += length;
                    } while (length < w02);
                    this.f35305a = Arrays.copyOf(this.f35305a, length);
                }
            } else {
                this.f35312h = true;
            }
        }
        int c2 = mo55484c(this.f35310f, i + c, i2 - c, bArr);
        if (c2 == -1) {
            return -1;
        }
        int i3 = c + c2;
        if (!this.f35312h && this.f35313i == null) {
            this.f35313i = new String(this.f35305a, 30, this.f35309e);
        }
        return i3;
    }

    /* renamed from: b */
    public final C15615j0 mo55483b() {
        int i = this.f35306b;
        int i2 = this.f35310f;
        if (i < i2) {
            return new C15615j0(this.f35313i, this.f35308d, this.f35311g, true, this.f35312h, Arrays.copyOf(this.f35305a, i));
        }
        C15615j0 j0Var = new C15615j0(this.f35313i, this.f35308d, this.f35311g, false, this.f35312h, Arrays.copyOf(this.f35305a, i2));
        this.f35306b = 0;
        this.f35309e = -1;
        this.f35307c = -1;
        this.f35312h = false;
        this.f35310f = 30;
        this.f35308d = -1;
        this.f35311g = -1;
        this.f35313i = null;
        return j0Var;
    }

    /* renamed from: c */
    public final int mo55484c(int i, int i2, int i3, byte[] bArr) {
        int i4 = this.f35306b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f35305a, this.f35306b, min);
        int i5 = this.f35306b + min;
        this.f35306b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }
}
