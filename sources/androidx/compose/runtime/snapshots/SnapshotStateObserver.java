package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.C1385f;
import java.util.HashSet;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p219r.C7731c;
import p219r.C7733d;
import p219r.C7734e;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SnapshotStateObserver {

    /* renamed from: a */
    public final C19857l<C19846a<C19394m>, C19394m> f2999a;

    /* renamed from: b */
    public final C19861p<Set<? extends Object>, C1385f, C19394m> f3000b = new SnapshotStateObserver$applyObserver$1(this);

    /* renamed from: c */
    public final C19857l<Object, C19394m> f3001c = new SnapshotStateObserver$readObserver$1(this);

    /* renamed from: d */
    public final C7734e<C1377a<?>> f3002d = new C7734e<>(new C1377a[16]);

    /* renamed from: e */
    public C1384e f3003e;

    /* renamed from: f */
    public boolean f3004f;

    /* renamed from: g */
    public C1377a<?> f3005g;

    /* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$a */
    public static final class C1377a<T> {

        /* renamed from: a */
        public final C19857l<T, C19394m> f3006a;

        /* renamed from: b */
        public final C7733d<T> f3007b = new C7733d<>();

        /* renamed from: c */
        public final HashSet<Object> f3008c = new HashSet<>();

        /* renamed from: d */
        public T f3009d;

        public C1377a(C19857l<? super T, C19394m> lVar) {
            C19383o.m32797g(lVar, "onChanged");
            this.f3006a = lVar;
        }
    }

    public SnapshotStateObserver(C19857l<? super C19846a<C19394m>, C19394m> lVar) {
        this.f2999a = lVar;
    }

    /* renamed from: a */
    public final void mo5984a() {
        synchronized (this.f3002d) {
            C7734e<C1377a<?>> eVar = this.f3002d;
            int i = eVar.f17157d;
            if (i > 0) {
                T[] tArr = eVar.f17155b;
                int i2 = 0;
                do {
                    C7733d<T> dVar = ((C1377a) tArr[i2]).f3007b;
                    int length = dVar.f17153c.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        C7731c<T> cVar = dVar.f17153c[i3];
                        if (cVar != null) {
                            cVar.clear();
                        }
                        dVar.f17151a[i3] = i3;
                        dVar.f17152b[i3] = null;
                    }
                    dVar.f17154d = 0;
                    i2++;
                } while (i2 < i);
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: b */
    public final <T> void mo5985b(T t, C19857l<? super T, C19394m> lVar, C19846a<C19394m> aVar) {
        int i;
        C1377a<?> aVar2;
        C19383o.m32797g(t, "scope");
        C19383o.m32797g(lVar, "onValueChangedForScope");
        C19383o.m32797g(aVar, "block");
        C1377a<?> aVar3 = this.f3005g;
        boolean z = this.f3004f;
        synchronized (this.f3002d) {
            C7734e<C1377a<?>> eVar = this.f3002d;
            int i2 = eVar.f17157d;
            if (i2 > 0) {
                T[] tArr = eVar.f17155b;
                i = 0;
                while (true) {
                    if (!(((C1377a) tArr[i]).f3006a == lVar)) {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                i = -1;
            }
            if (i == -1) {
                aVar2 = new C1377a<>(lVar);
                this.f3002d.mo20232c(aVar2);
            } else {
                aVar2 = (C1377a) this.f3002d.f17155b[i];
            }
            aVar2.f3007b.mo20229e(t);
        }
        T t2 = aVar2.f3009d;
        aVar2.f3009d = t;
        this.f3005g = aVar2;
        this.f3004f = false;
        C1385f.C1386a.m2992a(aVar, this.f3001c);
        this.f3005g = aVar3;
        aVar2.f3009d = t2;
        this.f3004f = z;
    }

    /* renamed from: c */
    public final void mo5986c() {
        C19861p<Set<? extends Object>, C1385f, C19394m> pVar = this.f3000b;
        C19383o.m32797g(pVar, "observer");
        SnapshotKt.m2907f(SnapshotKt.f2987a);
        synchronized (SnapshotKt.f2989c) {
            SnapshotKt.f2993g.add(pVar);
        }
        this.f3003e = new C1384e(pVar);
    }
}
