package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p288y.C8343c;
import p288y.C8345d;

public enum SelectionMode {
    ;

    public static final class Horizontal extends SelectionMode {
        public Horizontal(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: compare-3MmeM6k$foundation_release  reason: not valid java name */
        public int m34733compare3MmeM6k$foundation_release(long j, C8345d dVar) {
            C19383o.m32797g(dVar, "bounds");
            if (dVar.mo20926a(j)) {
                return 0;
            }
            if (C8343c.m16642c(j) < dVar.f18301a) {
                return -1;
            }
            return (C8343c.m16643d(j) >= dVar.f18302b || C8343c.m16642c(j) >= dVar.f18303c) ? 1 : -1;
        }
    }

    public static final class Vertical extends SelectionMode {
        public Vertical(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: compare-3MmeM6k$foundation_release  reason: not valid java name */
        public int m34734compare3MmeM6k$foundation_release(long j, C8345d dVar) {
            C19383o.m32797g(dVar, "bounds");
            if (dVar.mo20926a(j)) {
                return 0;
            }
            if (C8343c.m16643d(j) < dVar.f18302b) {
                return -1;
            }
            return (C8343c.m16642c(j) >= dVar.f18301a || C8343c.m16643d(j) >= dVar.f18304d) ? 1 : -1;
        }
    }

    /* renamed from: compare-3MmeM6k$foundation_release  reason: not valid java name */
    public abstract int m34731compare3MmeM6k$foundation_release(long j, C8345d dVar);

    /* renamed from: isSelected-2x9bVx0$foundation_release  reason: not valid java name */
    public final boolean m34732isSelected2x9bVx0$foundation_release(C8345d dVar, long j, long j2) {
        C19383o.m32797g(dVar, "bounds");
        boolean z = true;
        if (dVar.mo20926a(j) || dVar.mo20926a(j2)) {
            return true;
        }
        int r4 = m34731compare3MmeM6k$foundation_release(j, dVar);
        int r3 = m34731compare3MmeM6k$foundation_release(j2, dVar);
        boolean z2 = r4 > 0;
        if (r3 <= 0) {
            z = false;
        }
        return z2 ^ z;
    }
}
