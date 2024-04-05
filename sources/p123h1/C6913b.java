package p123h1;

import android.graphics.Rect;
import java.util.Comparator;
import p088e1.C6689b;
import p123h1.C6909a;

/* renamed from: h1.b */
public final class C6913b {

    /* renamed from: h1.b$a */
    public interface C6914a<T> {
    }

    /* renamed from: h1.b$b */
    public static class C6915b<T> implements Comparator<T> {

        /* renamed from: b */
        public final Rect f15303b = new Rect();

        /* renamed from: c */
        public final Rect f15304c = new Rect();

        /* renamed from: d */
        public final boolean f15305d;

        /* renamed from: e */
        public final C6914a<T> f15306e;

        public C6915b(boolean z, C6909a.C6910a aVar) {
            this.f15305d = z;
            this.f15306e = aVar;
        }

        public final int compare(T t, T t2) {
            Rect rect = this.f15303b;
            Rect rect2 = this.f15304c;
            ((C6909a.C6910a) this.f15306e).getClass();
            ((C6689b) t).mo18854e(rect);
            ((C6909a.C6910a) this.f15306e).getClass();
            ((C6689b) t2).mo18854e(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f15305d ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f15305d ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f15305d ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f15305d ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13370a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m13371b(r9, r10, r11)
            boolean r1 = m13371b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = r6
            goto L_0x0046
        L_0x0045:
            r7 = r2
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = m13373d(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = r6
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p123h1.C6913b.m13370a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public static boolean m13371b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static boolean m13372c(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: d */
    public static int m13373d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i2);
    }

    /* renamed from: e */
    public static int m13374e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
