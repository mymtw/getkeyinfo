package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C0837b;
import androidx.compose.foundation.lazy.layout.C0849j;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p764pq.C20057i;

public final class LazyListItemsSnapshot {

    /* renamed from: a */
    public final C0837b<C0826i> f1586a;

    /* renamed from: b */
    public final List<Integer> f1587b;

    /* renamed from: c */
    public final Map<Object, Integer> f1588c;

    public LazyListItemsSnapshot(C0849j jVar, EmptyList emptyList, C20057i iVar) {
        Map<Object, Integer> map;
        C19383o.m32797g(jVar, "intervals");
        C19383o.m32797g(emptyList, "headerIndexes");
        C19383o.m32797g(iVar, "nearestItemsRange");
        this.f1586a = jVar;
        this.f1587b = emptyList;
        int i = iVar.f44414b;
        if (i >= 0) {
            int min = Math.min(iVar.f44415c, jVar.f1813b - 1);
            if (min < i) {
                map = C19294b0.m32559p0();
            } else {
                HashMap hashMap = new HashMap();
                jVar.mo4391d(i, min, new LazyListItemProviderImplKt$generateKeyToIndexMap$1$1(i, min, hashMap));
                map = hashMap;
            }
            this.f1588c = map;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final void mo4207a(C0777d dVar, int i, C1302d dVar2, int i2) {
        C19383o.m32797g(dVar, "scope");
        ComposerImpl h = dVar2.mo5440h(1922528915);
        C0837b.C0838a<C0826i> aVar = this.f1586a.get(i);
        ((C0826i) aVar.f1795c).f1783c.invoke(dVar, Integer.valueOf(i - aVar.f1793a), h, Integer.valueOf(i2 & 14));
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LazyListItemsSnapshot$Item$1(this, dVar, i, i2);
        }
    }
}
