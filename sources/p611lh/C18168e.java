package p611lh;

import androidx.compose.animation.C0391c;
import java.util.Arrays;

/* renamed from: lh.e */
public final class C18168e {

    /* renamed from: c */
    public static final C18168e f39744c = new C18168e(8, new int[]{2});

    /* renamed from: d */
    public static final C18168e f39745d = new C18168e(8, new int[]{2, 5, 6});

    /* renamed from: a */
    public final int[] f39746a;

    /* renamed from: b */
    public final int f39747b;

    public C18168e(int i, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f39746a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f39746a = new int[0];
        }
        this.f39747b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18168e)) {
            return false;
        }
        C18168e eVar = (C18168e) obj;
        return Arrays.equals(this.f39746a, eVar.f39746a) && this.f39747b == eVar.f39747b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f39746a) * 31) + this.f39747b;
    }

    public final String toString() {
        int i = this.f39747b;
        String arrays = Arrays.toString(this.f39746a);
        StringBuilder sb = new StringBuilder(C0391c.m1055a(arrays, 67));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
