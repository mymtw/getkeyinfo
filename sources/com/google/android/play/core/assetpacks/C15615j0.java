package com.google.android.play.core.assetpacks;

import android.support.p013v4.media.C0070b;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.j0 */
public final class C15615j0 extends C15637o2 {

    /* renamed from: a */
    public final String f35199a;

    /* renamed from: b */
    public final long f35200b;

    /* renamed from: c */
    public final int f35201c;

    /* renamed from: d */
    public final boolean f35202d;

    /* renamed from: e */
    public final boolean f35203e;

    /* renamed from: f */
    public final byte[] f35204f;

    public C15615j0(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f35199a = str;
        this.f35200b = j;
        this.f35201c = i;
        this.f35202d = z;
        this.f35203e = z2;
        this.f35204f = bArr;
    }

    /* renamed from: a */
    public final int mo55423a() {
        return this.f35201c;
    }

    /* renamed from: b */
    public final long mo55424b() {
        return this.f35200b;
    }

    /* renamed from: c */
    public final String mo55425c() {
        return this.f35199a;
    }

    /* renamed from: d */
    public final boolean mo55426d() {
        return this.f35203e;
    }

    /* renamed from: e */
    public final boolean mo55427e() {
        return this.f35202d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15637o2) {
            C15637o2 o2Var = (C15637o2) obj;
            String str = this.f35199a;
            if (str != null ? str.equals(o2Var.mo55425c()) : o2Var.mo55425c() == null) {
                if (this.f35200b == o2Var.mo55424b() && this.f35201c == o2Var.mo55423a() && this.f35202d == o2Var.mo55427e() && this.f35203e == o2Var.mo55426d()) {
                    if (Arrays.equals(this.f35204f, o2Var instanceof C15615j0 ? ((C15615j0) o2Var).f35204f : o2Var.mo55429f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final byte[] mo55429f() {
        return this.f35204f;
    }

    public final int hashCode() {
        String str = this.f35199a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f35200b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f35201c) * 1000003) ^ (true != this.f35202d ? 1237 : 1231)) * 1000003;
        if (true == this.f35203e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f35204f);
    }

    public final String toString() {
        String str = this.f35199a;
        long j = this.f35200b;
        int i = this.f35201c;
        boolean z = this.f35202d;
        boolean z2 = this.f35203e;
        String arrays = Arrays.toString(this.f35204f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return C0070b.m184f(sb, ", headerBytes=", arrays, "}");
    }
}
