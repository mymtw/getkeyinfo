package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import java.util.List;
import kotlin.C19394m;
import p174m0.C7280a;
import p753kq.C19861p;

/* renamed from: androidx.compose.foundation.lazy.grid.w */
public final class C0821w {

    /* renamed from: a */
    public final boolean f1770a;

    /* renamed from: b */
    public final int f1771b;

    /* renamed from: c */
    public final int f1772c;

    /* renamed from: d */
    public final C0819u f1773d;

    /* renamed from: e */
    public final LazyGridSpanLayoutProvider f1774e;

    /* renamed from: f */
    public final C0824z f1775f;

    /* renamed from: g */
    public final C19861p<Integer, Integer, C7280a> f1776g;

    public C0821w(boolean z, List list, int i, int i2, int i3, C0819u uVar, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1.C0790b bVar) {
        this.f1770a = z;
        this.f1771b = i2;
        this.f1772c = i3;
        this.f1773d = uVar;
        this.f1774e = lazyGridSpanLayoutProvider;
        this.f1775f = bVar;
        this.f1776g = new LazyMeasuredLineProvider$childConstraints$1(list, i, this);
    }

    /* renamed from: a */
    public final C0820v mo4354a(int i) {
        LazyGridSpanLayoutProvider.C0794b b = this.f1774e.mo4308b(i);
        int size = b.f1671b.size();
        int i2 = (size == 0 || b.f1670a + size == this.f1771b) ? 0 : this.f1772c;
        C0818t[] tVarArr = new C0818t[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (int) b.f1671b.get(i4).f1700a;
            C0818t a = this.f1773d.mo4352a(b.f1670a + i4, i2, this.f1776g.invoke(Integer.valueOf(i3), Integer.valueOf(i5)).f16152a);
            i3 += i5;
            C19394m mVar = C19394m.f43287a;
            tVarArr[i4] = a;
        }
        return this.f1775f.mo4294a(i, tVarArr, b.f1671b, i2);
    }
}
