package p707wn;

import android.support.p013v4.media.C0073e;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: wn.a */
public final class C18753a {

    /* renamed from: g */
    public static final C18753a f41524g = new C18753a(4201, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: h */
    public static final C18753a f41525h = new C18753a(1033, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, 1);

    /* renamed from: i */
    public static final C18753a f41526i = new C18753a(67, 64, 1);

    /* renamed from: j */
    public static final C18753a f41527j = new C18753a(19, 16, 1);

    /* renamed from: k */
    public static final C18753a f41528k = new C18753a(285, 256, 0);

    /* renamed from: l */
    public static final C18753a f41529l = new C18753a(301, 256, 1);

    /* renamed from: a */
    public final int[] f41530a;

    /* renamed from: b */
    public final int[] f41531b;

    /* renamed from: c */
    public final C18754b f41532c;

    /* renamed from: d */
    public final int f41533d;

    /* renamed from: e */
    public final int f41534e;

    /* renamed from: f */
    public final int f41535f;

    public C18753a(int i, int i2, int i3) {
        this.f41534e = i;
        this.f41533d = i2;
        this.f41535f = i3;
        this.f41530a = new int[i2];
        this.f41531b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f41530a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f41531b[this.f41530a[i6]] = i6;
        }
        this.f41532c = new C18754b(this, new int[]{0});
        new C18754b(this, new int[]{1});
    }

    /* renamed from: a */
    public final int mo70239a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f41530a;
        int[] iArr2 = this.f41531b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f41533d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f41534e));
        sb.append(',');
        return C0073e.m208h(sb, this.f41533d, ')');
    }
}
