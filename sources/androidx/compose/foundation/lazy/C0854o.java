package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.C0779f;
import androidx.compose.foundation.lazy.layout.C0850k;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import androidx.compose.p015ui.layout.C1690j0;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;

/* renamed from: androidx.compose.foundation.lazy.o */
public final class C0854o implements C6765c<C0850k>, C6764b, C0850k {

    /* renamed from: e */
    public static final C0855a f1822e = new C0855a();

    /* renamed from: b */
    public final LazyListState f1823b;

    /* renamed from: c */
    public final C0779f f1824c;

    /* renamed from: d */
    public C0850k f1825d;

    /* renamed from: androidx.compose.foundation.lazy.o$a */
    public static final class C0855a implements C0850k.C0851a {
        /* renamed from: a */
        public final void mo4393a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.o$b */
    public static final class C0856b implements C0850k.C0851a {

        /* renamed from: a */
        public final C0850k.C0851a f1826a;

        /* renamed from: b */
        public final C0779f.C0780a f1827b;

        /* renamed from: c */
        public final /* synthetic */ C0854o f1828c;

        /* renamed from: d */
        public final /* synthetic */ C0779f f1829d;

        public C0856b(C0854o oVar, C0779f fVar) {
            this.f1828c = oVar;
            this.f1829d = fVar;
            C0850k kVar = oVar.f1825d;
            this.f1826a = kVar != null ? kVar.mo4392a() : null;
            C0779f.C0780a aVar = new C0779f.C0780a(fVar.mo4246b(), fVar.mo4245a());
            fVar.f1627a.mo20232c(aVar);
            this.f1827b = aVar;
        }

        /* renamed from: a */
        public final void mo4393a() {
            C0779f fVar = this.f1829d;
            C0779f.C0780a aVar = this.f1827b;
            fVar.getClass();
            C19383o.m32797g(aVar, "interval");
            fVar.f1627a.mo20241o(aVar);
            C0850k.C0851a aVar2 = this.f1826a;
            if (aVar2 != null) {
                aVar2.mo4393a();
            }
            C1690j0 j0Var = (C1690j0) this.f1828c.f1823b.f1611k.getValue();
            if (j0Var != null) {
                j0Var.mo6690b();
            }
        }
    }

    public C0854o(LazyListState lazyListState, C0779f fVar) {
        C19383o.m32797g(lazyListState, "state");
        this.f1823b = lazyListState;
        this.f1824c = fVar;
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        this.f1825d = (C0850k) dVar.mo6818a(PinnableParentKt.f1791a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r1 = r0.mo4392a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.layout.C0850k.C0851a mo4392a() {
        /*
            r2 = this;
            androidx.compose.foundation.lazy.f r0 = r2.f1824c
            r.e<androidx.compose.foundation.lazy.f$a> r1 = r0.f1627a
            boolean r1 = r1.mo20240n()
            if (r1 == 0) goto L_0x0010
            androidx.compose.foundation.lazy.o$b r1 = new androidx.compose.foundation.lazy.o$b
            r1.<init>(r2, r0)
            goto L_0x001c
        L_0x0010:
            androidx.compose.foundation.lazy.layout.k r0 = r2.f1825d
            if (r0 == 0) goto L_0x001a
            androidx.compose.foundation.lazy.layout.k$a r1 = r0.mo4392a()
            if (r1 != 0) goto L_0x001c
        L_0x001a:
            androidx.compose.foundation.lazy.o$a r1 = f1822e
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.C0854o.mo4392a():androidx.compose.foundation.lazy.layout.k$a");
    }

    public final C6767e<C0850k> getKey() {
        return PinnableParentKt.f1791a;
    }

    public final Object getValue() {
        return this;
    }
}
