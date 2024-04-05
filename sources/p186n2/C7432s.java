package p186n2;

import android.os.Build;

/* renamed from: n2.s */
public final class C7432s {

    /* renamed from: a */
    public static final boolean f16603a = true;

    /* renamed from: b */
    public static final boolean f16604b = true;

    /* renamed from: c */
    public static final boolean f16605c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f16605c = z;
    }
}
