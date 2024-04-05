package p125h3;

import android.graphics.PointF;
import java.util.Collections;
import p125h3.C6928a;
import p214q3.C7718a;

/* renamed from: h3.m */
public final class C6941m extends C6928a<PointF, PointF> {

    /* renamed from: l */
    public final PointF f15374l = new PointF();

    /* renamed from: m */
    public final C6928a<Float, Float> f15375m;

    /* renamed from: n */
    public final C6928a<Float, Float> f15376n;

    public C6941m(C6931c cVar, C6931c cVar2) {
        super(Collections.emptyList());
        this.f15375m = cVar;
        this.f15376n = cVar2;
        mo19086j(this.f15352d);
    }

    /* renamed from: g */
    public final Object mo19083g() {
        return this.f15374l;
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        return this.f15374l;
    }

    /* renamed from: j */
    public final void mo19086j(float f) {
        this.f15375m.mo19086j(f);
        this.f15376n.mo19086j(f);
        this.f15374l.set(this.f15375m.mo19083g().floatValue(), this.f15376n.mo19083g().floatValue());
        for (int i = 0; i < this.f15349a.size(); i++) {
            ((C6928a.C6929a) this.f15349a.get(i)).mo14602a();
        }
    }
}
