package p174m0;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.common.api.Api;

/* renamed from: m0.a */
public final class C7280a {

    /* renamed from: b */
    public static final int[] f16149b = {18, 20, 17, 15};

    /* renamed from: c */
    public static final int[] f16150c = {SupportMenu.USER_MASK, 262143, 32767, 8191};

    /* renamed from: d */
    public static final int[] f16151d = {32767, 8191, SupportMenu.USER_MASK, 262143};

    /* renamed from: a */
    public final long f16152a;

    /* renamed from: m0.a$a */
    public static final class C7281a {
        /* renamed from: a */
        public static int m13967a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(C0069a.m175f("Can't represent a size of ", i, " in Constraints"));
        }

        /* renamed from: b */
        public static long m13968b(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int a = m13967a(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int a2 = m13967a(i6);
            if (a + a2 <= 31) {
                if (a2 == 13) {
                    j = 3;
                } else if (a2 == 18) {
                    j = 1;
                } else if (a2 == 15) {
                    j = 2;
                } else if (a2 == 16) {
                    j = 0;
                } else {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                int i7 = 0;
                int i8 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
                if (i4 != Integer.MAX_VALUE) {
                    i7 = i4 + 1;
                }
                int i9 = C7280a.f16149b[(int) j];
                return (((long) i8) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i7) << (i9 + 31));
            }
            throw new IllegalArgumentException(C0070b.m183e("Can't represent a width of ", i6, " and height of ", i5, " in Constraints"));
        }

        /* renamed from: c */
        public static long m13969c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return m13968b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(C0070b.m183e("width(", i, ") and height(", i2, ") must be >= 0").toString());
        }

        /* renamed from: d */
        public static long m13970d(int i) {
            if (i >= 0) {
                return m13968b(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, i, i);
            }
            throw new IllegalArgumentException(C0069a.m175f("height(", i, ") must be >= 0").toString());
        }

        /* renamed from: e */
        public static long m13971e(int i) {
            if (i >= 0) {
                return m13968b(i, i, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            throw new IllegalArgumentException(C0069a.m175f("width(", i, ") must be >= 0").toString());
        }
    }

    public /* synthetic */ C7280a(long j) {
        this.f16152a = j;
    }

    /* renamed from: a */
    public static long m13956a(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = m13965j(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m13963h(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m13964i(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m13962g(j);
        }
        boolean z = false;
        if (i3 >= 0 && i >= 0) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
                    z = true;
                }
                if (z) {
                    return C7281a.m13968b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        throw new IllegalArgumentException(C0070b.m183e("minHeight(", i3, ") and minWidth(", i, ") must be >= 0").toString());
    }

    /* renamed from: b */
    public static final boolean m13957b(long j, long j2) {
        return j == j2;
    }

    /* renamed from: c */
    public static final boolean m13958c(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> (f16149b[i] + 31))) & f16151d[i]) != 0;
    }

    /* renamed from: d */
    public static final boolean m13959d(long j) {
        return (((int) (j >> 33)) & f16150c[(int) (3 & j)]) != 0;
    }

    /* renamed from: e */
    public static final boolean m13960e(long j) {
        return m13962g(j) == m13964i(j);
    }

    /* renamed from: f */
    public static final boolean m13961f(long j) {
        return m13963h(j) == m13965j(j);
    }

    /* renamed from: g */
    public static final int m13962g(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (f16149b[i] + 31))) & f16151d[i];
        return i2 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 - 1;
    }

    /* renamed from: h */
    public static final int m13963h(long j) {
        int i = ((int) (j >> 33)) & f16150c[(int) (3 & j)];
        return i == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i - 1;
    }

    /* renamed from: i */
    public static final int m13964i(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> f16149b[i])) & f16151d[i];
    }

    /* renamed from: j */
    public static final int m13965j(long j) {
        return ((int) (j >> 2)) & f16150c[(int) (3 & j)];
    }

    /* renamed from: k */
    public static String m13966k(long j) {
        int h = m13963h(j);
        String str = "Infinity";
        String valueOf = h == Integer.MAX_VALUE ? str : String.valueOf(h);
        int g = m13962g(j);
        if (g != Integer.MAX_VALUE) {
            str = String.valueOf(g);
        }
        StringBuilder h2 = C0072d.m201h("Constraints(minWidth = ");
        h2.append(m13965j(j));
        h2.append(", maxWidth = ");
        h2.append(valueOf);
        h2.append(", minHeight = ");
        h2.append(m13964i(j));
        h2.append(", maxHeight = ");
        h2.append(str);
        h2.append(')');
        return h2.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7280a) && this.f16152a == ((C7280a) obj).f16152a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16152a);
    }

    public final String toString() {
        return m13966k(this.f16152a);
    }
}
