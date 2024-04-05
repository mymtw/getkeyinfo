package p177m3;

import com.airbnb.lottie.model.layer.C4845a;
import p125h3.C6928a;
import p125h3.C6931c;

/* renamed from: m3.a */
public final class C7313a implements C6928a.C6929a {

    /* renamed from: a */
    public final /* synthetic */ C6931c f16206a;

    /* renamed from: b */
    public final /* synthetic */ C4845a f16207b;

    public C7313a(C4845a aVar, C6931c cVar) {
        this.f16207b = aVar;
        this.f16206a = cVar;
    }

    /* renamed from: a */
    public final void mo14602a() {
        C4845a aVar = this.f16207b;
        boolean z = this.f16206a.mo19089l() == 1.0f;
        if (z != aVar.f11004u) {
            aVar.f11004u = z;
            aVar.f10996m.invalidateSelf();
        }
    }
}
