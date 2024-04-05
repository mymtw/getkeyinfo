package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C0837b;
import androidx.compose.foundation.lazy.layout.C0848i;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import java.util.Map;

public final class LazyGridItemProviderImpl implements C0807i {

    /* renamed from: a */
    public final C1342k1<C0810l> f1645a;

    public LazyGridItemProviderImpl(DerivedSnapshotState derivedSnapshotState) {
        this.f1645a = derivedSnapshotState;
    }

    /* renamed from: a */
    public final Object mo4197a(int i) {
        C0837b.C0838a<C0804f> aVar = this.f1645a.getValue().f1707a.get(i);
        int i2 = aVar.f1793a;
        ((C0804f) aVar.f1795c).getClass();
        throw null;
    }

    /* renamed from: c */
    public final void mo4199c(int i, C1302d dVar, int i2) {
        int i3;
        ComposerImpl h = dVar.mo5440h(1959480708);
        if ((i2 & 14) == 0) {
            i3 = (h.mo5432d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= h.mo5408I(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !h.mo5442i()) {
            C0810l value = this.f1645a.getValue();
            value.getClass();
            h.mo5440h(-405085610);
            C0837b.C0838a<C0804f> aVar = value.f1707a.get(i);
            int i4 = aVar.f1793a;
            ((C0804f) aVar.f1795c).getClass();
            throw null;
        }
        h.mo5396C();
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LazyGridItemProviderImpl$Item$1(this, i, i2);
        }
    }

    /* renamed from: d */
    public final Map<Object, Integer> mo4200d() {
        return this.f1645a.getValue().f1710d;
    }

    /* renamed from: e */
    public final Object mo4201e(int i) {
        C0837b.C0838a<C0804f> aVar = this.f1645a.getValue().f1707a.get(i);
        int i2 = aVar.f1793a;
        ((C0804f) aVar.f1795c).getClass();
        return C0848i.m1891a(i);
    }

    /* renamed from: g */
    public final LazyGridSpanLayoutProvider mo4282g() {
        return this.f1645a.getValue().f1709c;
    }

    public final int getItemCount() {
        return this.f1645a.getValue().f1707a.mo4382a();
    }
}
