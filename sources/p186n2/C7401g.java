package p186n2;

import android.view.View;
import java.util.ArrayList;

/* renamed from: n2.g */
public final class C7401g extends C7425p {

    /* renamed from: a */
    public final /* synthetic */ Object f16536a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f16537b;

    /* renamed from: c */
    public final /* synthetic */ Object f16538c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f16539d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f16540e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f16541f;

    /* renamed from: g */
    public final /* synthetic */ C7395f f16542g;

    public C7401g(C7395f fVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f16542g = fVar;
        this.f16536a = obj;
        this.f16537b = arrayList;
        this.f16540e = obj2;
        this.f16541f = arrayList2;
    }

    public final void onTransitionEnd(C7418m mVar) {
        mVar.mo19793z(this);
    }

    public final void onTransitionStart(C7418m mVar) {
        Object obj = this.f16536a;
        if (obj != null) {
            this.f16542g.mo19749s(obj, this.f16537b, (ArrayList<View>) null);
        }
        Object obj2 = this.f16538c;
        if (obj2 != null) {
            this.f16542g.mo19749s(obj2, this.f16539d, (ArrayList<View>) null);
        }
        Object obj3 = this.f16540e;
        if (obj3 != null) {
            this.f16542g.mo19749s(obj3, this.f16541f, (ArrayList<View>) null);
        }
    }
}
