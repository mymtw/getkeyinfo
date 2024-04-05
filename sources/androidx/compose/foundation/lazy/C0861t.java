package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: androidx.compose.foundation.lazy.t */
public final class C0861t {

    /* renamed from: a */
    public final ParcelableSnapshotMutableState f1847a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f1848b;

    /* renamed from: c */
    public boolean f1849c;

    /* renamed from: d */
    public Object f1850d;

    public C0861t(int i, int i2) {
        this.f1847a = C0761x.m1751w0(new C0774a(i), C1351n1.f2948a);
        this.f1848b = C0761x.m1751w0(Integer.valueOf(i2), C1351n1.f2948a);
    }

    /* renamed from: a */
    public final void mo4400a(int i, int i2) {
        boolean z = true;
        if (((float) i) >= 0.0f) {
            if (i != ((C0774a) this.f1847a.getValue()).f1620a) {
                z = false;
            }
            if (!z) {
                this.f1847a.setValue(new C0774a(i));
            }
            if (i2 != ((Number) this.f1848b.getValue()).intValue()) {
                this.f1848b.setValue(Integer.valueOf(i2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }
}
