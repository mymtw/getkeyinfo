package p611lh;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: lh.b */
public final class C18164b {

    /* renamed from: a */
    public static final int[] f39728a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f39729b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f39730c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f39731d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f39732e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN, 576, 640};

    /* renamed from: f */
    public static final int[] f39733f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m30678a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f39729b;
        if (i >= 3 || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f39733f;
        if (i3 >= 19) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return ((i2 % 2) + iArr2[i3]) * 2;
        }
        int i5 = f39732e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
