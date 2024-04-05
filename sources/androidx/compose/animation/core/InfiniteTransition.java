package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p219r.C7734e;

public final class InfiniteTransition {

    /* renamed from: a */
    public final C7734e<C0394a<?, ?>> f1017a = new C7734e<>(new C0394a[16]);

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f1018b = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    /* renamed from: c */
    public long f1019c = Long.MIN_VALUE;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1020d = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);

    /* renamed from: androidx.compose.animation.core.InfiniteTransition$a */
    public final class C0394a<T, V extends C0432j> implements C1342k1<T> {

        /* renamed from: b */
        public T f1021b;

        /* renamed from: c */
        public T f1022c;

        /* renamed from: d */
        public final C0435k0<T, V> f1023d;

        /* renamed from: e */
        public C0422e<T> f1024e;

        /* renamed from: f */
        public final ParcelableSnapshotMutableState f1025f;

        /* renamed from: g */
        public C0431i0<T, V> f1026g;

        /* renamed from: h */
        public boolean f1027h;

        /* renamed from: i */
        public boolean f1028i;

        /* renamed from: j */
        public long f1029j;

        /* renamed from: k */
        public final /* synthetic */ InfiniteTransition f1030k;

        public C0394a(InfiniteTransition infiniteTransition, Number number, Number number2, C0437l0 l0Var, C0422e eVar) {
            C19383o.m32797g(l0Var, "typeConverter");
            this.f1030k = infiniteTransition;
            this.f1021b = number;
            this.f1022c = number2;
            this.f1023d = l0Var;
            this.f1024e = eVar;
            this.f1025f = C0761x.m1751w0(number, C1351n1.f2948a);
            this.f1026g = new C0431i0<>(this.f1024e, l0Var, this.f1021b, this.f1022c);
        }

        public final T getValue() {
            return this.f1025f.getValue();
        }
    }

    /* renamed from: a */
    public final void mo3388a(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(-318043801);
        if (((Boolean) this.f1020d.getValue()).booleanValue() || ((Boolean) this.f1018b.getValue()).booleanValue()) {
            C1415u.m3031e(this, new InfiniteTransition$run$1(this, (C19340c<? super InfiniteTransition$run$1>) null), h);
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new InfiniteTransition$run$2(this, i);
        }
    }
}
