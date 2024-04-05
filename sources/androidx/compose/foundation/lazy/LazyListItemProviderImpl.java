package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C0837b;
import androidx.compose.foundation.lazy.layout.C0848i;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import p753kq.C19857l;

public final class LazyListItemProviderImpl implements C0829l {

    /* renamed from: a */
    public final C1342k1<LazyListItemsSnapshot> f1583a;

    /* renamed from: b */
    public final C0778e f1584b = new C0778e();

    public LazyListItemProviderImpl(DerivedSnapshotState derivedSnapshotState) {
        this.f1583a = derivedSnapshotState;
    }

    /* renamed from: a */
    public final Object mo4197a(int i) {
        C0837b.C0838a<C0826i> aVar = this.f1583a.getValue().f1586a.get(i);
        return ((C0826i) aVar.f1795c).f1782b.invoke(Integer.valueOf(i - aVar.f1793a));
    }

    /* renamed from: b */
    public final C0778e mo4198b() {
        return this.f1584b;
    }

    /* renamed from: c */
    public final void mo4199c(int i, C1302d dVar, int i2) {
        int i3;
        ComposerImpl h = dVar.mo5440h(1704733014);
        if ((i2 & 14) == 0) {
            i3 = (h.mo5432d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= h.mo5408I(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !h.mo5442i()) {
            this.f1583a.getValue().mo4207a(this.f1584b, i, h, ((i3 << 3) & 112) | RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LazyListItemProviderImpl$Item$1(this, i, i2);
        }
    }

    /* renamed from: d */
    public final Map<Object, Integer> mo4200d() {
        return this.f1583a.getValue().f1588c;
    }

    /* renamed from: e */
    public final Object mo4201e(int i) {
        C0837b.C0838a<C0826i> aVar = this.f1583a.getValue().f1586a.get(i);
        int i2 = i - aVar.f1793a;
        C19857l<Integer, Object> lVar = ((C0826i) aVar.f1795c).f1781a;
        Object invoke = lVar != null ? lVar.invoke(Integer.valueOf(i2)) : null;
        return invoke == null ? C0848i.m1891a(i) : invoke;
    }

    /* renamed from: f */
    public final List<Integer> mo4202f() {
        return this.f1583a.getValue().f1587b;
    }

    public final int getItemCount() {
        return this.f1583a.getValue().f1586a.mo4382a();
    }
}
