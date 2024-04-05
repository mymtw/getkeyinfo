package p505aj;

import java.util.ArrayList;
import p513bj.C14049b0;

/* renamed from: aj.d */
public abstract class C13996d implements C13999g {

    /* renamed from: a */
    public final boolean f30761a;

    /* renamed from: b */
    public final ArrayList<C14014t> f30762b = new ArrayList<>(1);

    /* renamed from: c */
    public int f30763c;

    /* renamed from: d */
    public C14002i f30764d;

    public C13996d(boolean z) {
        this.f30761a = z;
    }

    /* renamed from: e */
    public final void mo46806e(C14014t tVar) {
        tVar.getClass();
        if (!this.f30762b.contains(tVar)) {
            this.f30762b.add(tVar);
            this.f30763c++;
        }
    }

    /* renamed from: k */
    public final void mo46807k(int i) {
        C14002i iVar = this.f30764d;
        int i2 = C14049b0.f30913a;
        for (int i3 = 0; i3 < this.f30763c; i3++) {
            this.f30762b.get(i3).mo46828f(iVar, this.f30761a, i);
        }
    }

    /* renamed from: l */
    public final void mo46808l() {
        C14002i iVar = this.f30764d;
        int i = C14049b0.f30913a;
        for (int i2 = 0; i2 < this.f30763c; i2++) {
            this.f30762b.get(i2).mo46829g(iVar, this.f30761a);
        }
        this.f30764d = null;
    }

    /* renamed from: m */
    public final void mo46809m(C14002i iVar) {
        for (int i = 0; i < this.f30763c; i++) {
            this.f30762b.get(i).mo46826a();
        }
    }

    /* renamed from: n */
    public final void mo46810n(C14002i iVar) {
        this.f30764d = iVar;
        for (int i = 0; i < this.f30763c; i++) {
            this.f30762b.get(i).mo46827e(iVar, this.f30761a);
        }
    }
}
