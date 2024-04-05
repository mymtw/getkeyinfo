package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C0837b;
import androidx.compose.foundation.lazy.layout.C0849j;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p764pq.C20057i;

/* renamed from: androidx.compose.foundation.lazy.grid.l */
public final class C0810l {

    /* renamed from: a */
    public final C0837b<C0804f> f1707a;

    /* renamed from: b */
    public final boolean f1708b = false;

    /* renamed from: c */
    public final LazyGridSpanLayoutProvider f1709c = new LazyGridSpanLayoutProvider(this);

    /* renamed from: d */
    public final Map<Object, Integer> f1710d;

    public C0810l(C0849j jVar, C20057i iVar) {
        Map<Object, Integer> map;
        C19383o.m32797g(jVar, "intervals");
        C19383o.m32797g(iVar, "nearestItemsRange");
        this.f1707a = jVar;
        boolean z = false;
        int i = iVar.f44414b;
        if (i >= 0 ? true : z) {
            int min = Math.min(iVar.f44415c, jVar.f1813b - 1);
            if (min < i) {
                map = C19294b0.m32559p0();
            } else {
                HashMap hashMap = new HashMap();
                jVar.mo4391d(i, min, new LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1(i, min, hashMap));
                map = hashMap;
            }
            this.f1710d = map;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
