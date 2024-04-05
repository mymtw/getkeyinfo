package androidx.compose.p015ui.platform;

/* renamed from: androidx.compose.ui.platform.e */
public final class C1826e extends C1812a {

    /* renamed from: c */
    public static C1826e f4087c;

    public C1826e(int i) {
    }

    /* renamed from: a */
    public final int[] mo7194a(int i) {
        int length = mo7180d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && mo7180d().charAt(i) == 10 && !mo7206f(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !mo7205e(i2)) {
            i2++;
        }
        return mo7179c(i, i2);
    }

    /* renamed from: b */
    public final int[] mo7195b(int i) {
        int length = mo7180d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            int i2 = i - 1;
            if (mo7180d().charAt(i2) != 10 || mo7205e(i)) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && !mo7206f(i3)) {
            i3--;
        }
        return mo7179c(i3, i);
    }

    /* renamed from: e */
    public final boolean mo7205e(int i) {
        return i > 0 && mo7180d().charAt(i + -1) != 10 && (i == mo7180d().length() || mo7180d().charAt(i) == 10);
    }

    /* renamed from: f */
    public final boolean mo7206f(int i) {
        return mo7180d().charAt(i) != 10 && (i == 0 || mo7180d().charAt(i - 1) == 10);
    }
}
