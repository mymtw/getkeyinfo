package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: androidx.compose.foundation.lazy.grid.q */
public final class C0815q {

    /* renamed from: a */
    public final ParcelableSnapshotMutableState f1736a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f1737b;

    /* renamed from: c */
    public boolean f1738c;

    /* renamed from: d */
    public Object f1739d;

    public C0815q(int i, int i2) {
        this.f1736a = C0761x.m1751w0(new C0802d(i), C1351n1.f2948a);
        this.f1737b = C0761x.m1751w0(Integer.valueOf(i2), C1351n1.f2948a);
    }

    /* renamed from: a */
    public final void mo4350a(int i, int i2) {
        boolean z = true;
        if (((float) i) >= 0.0f) {
            if (i != ((C0802d) this.f1736a.getValue()).f1701a) {
                z = false;
            }
            if (!z) {
                this.f1736a.setValue(new C0802d(i));
            }
            if (i2 != ((Number) this.f1737b.getValue()).intValue()) {
                this.f1737b.setValue(Integer.valueOf(i2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }
}
