package androidx.compose.foundation.text.selection;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.collections.C19323p;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;
import p753kq.C19864s;

/* renamed from: androidx.compose.foundation.text.selection.n */
public final class C1020n implements C1018l {

    /* renamed from: a */
    public boolean f2136a;

    /* renamed from: b */
    public final ArrayList f2137b = new ArrayList();

    /* renamed from: c */
    public final LinkedHashMap f2138c = new LinkedHashMap();

    /* renamed from: d */
    public AtomicLong f2139d = new AtomicLong(1);

    /* renamed from: e */
    public C19857l<? super Long, C19394m> f2140e;

    /* renamed from: f */
    public C19862q<? super C1689j, ? super C8343c, ? super SelectionAdjustment, C19394m> f2141f;

    /* renamed from: g */
    public C19857l<? super Long, C19394m> f2142g;

    /* renamed from: h */
    public C19864s<? super C1689j, ? super C8343c, ? super C8343c, ? super Boolean, ? super SelectionAdjustment, Boolean> f2143h;

    /* renamed from: i */
    public C19846a<C19394m> f2144i;

    /* renamed from: j */
    public C19857l<? super Long, C19394m> f2145j;

    /* renamed from: k */
    public C19857l<? super Long, C19394m> f2146k;

    /* renamed from: l */
    public final ParcelableSnapshotMutableState f2147l = C0761x.m1751w0(C19294b0.m32559p0(), C1351n1.f2948a);

    /* renamed from: a */
    public final long mo4712a() {
        long andIncrement = this.f2139d.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.f2139d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: b */
    public final Map<Long, C1011g> mo4713b() {
        return (Map) this.f2147l.getValue();
    }

    /* renamed from: c */
    public final void mo4714c(long j) {
        this.f2136a = false;
        C19857l<? super Long, C19394m> lVar = this.f2140e;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: d */
    public final void mo4715d(C1010f fVar) {
        if (this.f2138c.containsKey(Long.valueOf(fVar.mo4699e()))) {
            this.f2137b.remove(fVar);
            this.f2138c.remove(Long.valueOf(fVar.mo4699e()));
            C19857l<? super Long, C19394m> lVar = this.f2146k;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(fVar.mo4699e()));
            }
        }
    }

    /* renamed from: e */
    public final void mo4716e(C1689j jVar, long j) {
        SelectionAdjustment$Companion$Word$1 selectionAdjustment$Companion$Word$1 = SelectionAdjustment.Companion.f2055c;
        C19862q<? super C1689j, ? super C8343c, ? super SelectionAdjustment, C19394m> qVar = this.f2141f;
        if (qVar != null) {
            qVar.invoke(jVar, new C8343c(j), selectionAdjustment$Companion$Word$1);
        }
    }

    /* renamed from: f */
    public final void mo4717f(long j) {
        C19857l<? super Long, C19394m> lVar = this.f2145j;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: g */
    public final void mo4718g(long j) {
        C19857l<? super Long, C19394m> lVar = this.f2142g;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: h */
    public final void mo4719h() {
        C19846a<C19394m> aVar = this.f2144i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i */
    public final C1010f mo4720i(C1009e eVar) {
        long j = eVar.f2118a;
        if (!(j != 0)) {
            StringBuilder h = C0072d.m201h("The selectable contains an invalid id: ");
            h.append(eVar.f2118a);
            throw new IllegalArgumentException(h.toString().toString());
        } else if (!this.f2138c.containsKey(Long.valueOf(j))) {
            this.f2138c.put(Long.valueOf(eVar.f2118a), eVar);
            this.f2137b.add(eVar);
            this.f2136a = false;
            return eVar;
        } else {
            throw new IllegalArgumentException(("Another selectable with the id: " + eVar + ".selectableId has already subscribed.").toString());
        }
    }

    /* renamed from: j */
    public final boolean mo4721j(C1689j jVar, long j, long j2) {
        SelectionAdjustment.Companion.C0971b bVar = SelectionAdjustment.Companion.f2057e;
        C19864s<? super C1689j, ? super C8343c, ? super C8343c, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar = this.f2143h;
        if (sVar == null) {
            return true;
        }
        return sVar.invoke(jVar, new C8343c(j), new C8343c(j2), Boolean.FALSE, bVar).booleanValue();
    }

    /* renamed from: k */
    public final ArrayList mo4723k(C1689j jVar) {
        if (!this.f2136a) {
            C19323p.m32627I0(this.f2137b, new C1019m(jVar));
            this.f2136a = true;
        }
        return this.f2137b;
    }
}
