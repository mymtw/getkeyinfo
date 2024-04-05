package p158k3;

import android.graphics.PointF;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6931c;
import p125h3.C6941m;
import p214q3.C7718a;

/* renamed from: k3.h */
public final class C7185h implements C7189l<PointF, PointF> {

    /* renamed from: b */
    public final C7179b f15953b;

    /* renamed from: c */
    public final C7179b f15954c;

    public C7185h(C7179b bVar, C7179b bVar2) {
        this.f15953b = bVar;
        this.f15954c = bVar2;
    }

    /* renamed from: a */
    public final C6928a<PointF, PointF> mo19485a() {
        return new C6941m((C6931c) this.f15953b.mo19485a(), (C6931c) this.f15954c.mo19485a());
    }

    /* renamed from: b */
    public final List<C7718a<PointF>> mo19486b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: c */
    public final boolean mo19487c() {
        return this.f15953b.mo19487c() && this.f15954c.mo19487c();
    }
}
