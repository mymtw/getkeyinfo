package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p003a2.C0015b;

/* renamed from: com.google.common.base.l */
public final class C15794l {
    /* renamed from: a */
    public static String m25607a(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C15803r.m25628a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C15803r.m25628a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(C0015b.m88g("negative size: ", i2));
        }
    }

    /* renamed from: b */
    public static void m25608b(int i, int i2, @NullableDecl String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C15803r.m25628a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: c */
    public static void m25609c(int i, @NullableDecl String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C15803r.m25628a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: d */
    public static void m25610d(long j, @NullableDecl String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C15803r.m25628a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: e */
    public static void m25611e(@NullableDecl Object obj, @NullableDecl String str, @NullableDecl Object obj2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C15803r.m25628a(str, obj, obj2));
        }
    }

    /* renamed from: f */
    public static void m25612f(@NullableDecl Object obj, @NullableDecl String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C15803r.m25628a(str, obj));
        }
    }

    /* renamed from: g */
    public static void m25613g(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: h */
    public static void m25614h(boolean z, @NullableDecl String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: i */
    public static void m25615i(boolean z, @NullableDecl String str, long j, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C15803r.m25628a(str, Long.valueOf(j), obj));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public static void m25616j(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = C15803r.m25628a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = C15803r.m25628a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(C0015b.m88g("negative size: ", i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    @NonNullDecl
    @CanIgnoreReturnValue
    /* renamed from: k */
    public static void m25617k(@NonNullDecl Object obj, @NullableDecl String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public static void m25618l(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m25607a(i, i2, "index"));
        }
    }

    /* renamed from: m */
    public static void m25619m(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m25607a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m25607a(i2, i3, "end index");
            } else {
                str = C15803r.m25628a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: n */
    public static void m25620n(int i, @NullableDecl String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C15803r.m25628a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: o */
    public static void m25621o(long j, @NullableDecl String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C15803r.m25628a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: p */
    public static void m25622p(@NullableDecl Object obj, @NullableDecl String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C15803r.m25628a(str, obj));
        }
    }

    /* renamed from: q */
    public static void m25623q(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    public static void m25624r(boolean z, @NullableDecl String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
