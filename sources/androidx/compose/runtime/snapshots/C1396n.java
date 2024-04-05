package androidx.compose.runtime.snapshots;

/* renamed from: androidx.compose.runtime.snapshots.n */
public final class C1396n {

    /* renamed from: a */
    public static final Object f3037a = new Object();

    /* renamed from: a */
    public static final void m2995a(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}
