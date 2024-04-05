package p113g3;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6931c;

/* renamed from: g3.r */
public final class C6859r implements C6841b, C6928a.C6929a {

    /* renamed from: a */
    public final boolean f15166a;

    /* renamed from: b */
    public final ArrayList f15167b = new ArrayList();

    /* renamed from: c */
    public final ShapeTrimPath.Type f15168c;

    /* renamed from: d */
    public final C6931c f15169d;

    /* renamed from: e */
    public final C6931c f15170e;

    /* renamed from: f */
    public final C6931c f15171f;

    public C6859r(C4845a aVar, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f15166a = shapeTrimPath.f10948e;
        this.f15168c = shapeTrimPath.f10944a;
        C6928a<Float, Float> a = shapeTrimPath.f10945b.mo19485a();
        this.f15169d = (C6931c) a;
        C6928a<Float, Float> a2 = shapeTrimPath.f10946c.mo19485a();
        this.f15170e = (C6931c) a2;
        C6928a<Float, Float> a3 = shapeTrimPath.f10947d.mo19485a();
        this.f15171f = (C6931c) a3;
        aVar.mo14606e(a);
        aVar.mo14606e(a2);
        aVar.mo14606e(a3);
        a.mo19077a(this);
        a2.mo19077a(this);
        a3.mo19077a(this);
    }

    /* renamed from: a */
    public final void mo14602a() {
        for (int i = 0; i < this.f15167b.size(); i++) {
            ((C6928a.C6929a) this.f15167b.get(i)).mo14602a();
        }
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
    }

    /* renamed from: c */
    public final void mo18981c(C6928a.C6929a aVar) {
        this.f15167b.add(aVar);
    }
}
