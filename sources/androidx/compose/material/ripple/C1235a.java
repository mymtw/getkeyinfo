package androidx.compose.material.ripple;

import android.graphics.Canvas;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1493c;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1426z0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p173m.C7279a;
import p288y.C8347f;
import p753kq.C19846a;

/* renamed from: androidx.compose.material.ripple.a */
public final class C1235a extends C1243i implements C1426z0 {

    /* renamed from: c */
    public final boolean f2577c;

    /* renamed from: d */
    public final float f2578d;

    /* renamed from: e */
    public final C1342k1<C1545s> f2579e;

    /* renamed from: f */
    public final C1342k1<C1239e> f2580f;

    /* renamed from: g */
    public final RippleContainer f2581g;

    /* renamed from: h */
    public final ParcelableSnapshotMutableState f2582h;

    /* renamed from: i */
    public final ParcelableSnapshotMutableState f2583i;

    /* renamed from: j */
    public long f2584j;

    /* renamed from: k */
    public int f2585k;

    /* renamed from: l */
    public final C19846a<C19394m> f2586l;

    public C1235a() {
        throw null;
    }

    public C1235a(boolean z, float f, C1338j0 j0Var, C1338j0 j0Var2, RippleContainer rippleContainer) {
        super(z, j0Var2);
        this.f2577c = z;
        this.f2578d = f;
        this.f2579e = j0Var;
        this.f2580f = j0Var2;
        this.f2581g = rippleContainer;
        this.f2582h = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2583i = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
        this.f2584j = C8347f.f18313b;
        this.f2585k = -1;
        this.f2586l = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    /* renamed from: a */
    public final void mo3873a(C1741h hVar) {
        this.f2584j = hVar.mo6913b();
        this.f2585k = Float.isNaN(this.f2578d) ? C7279a.m13954l(C1240f.m2364a(hVar, this.f2577c, hVar.mo6913b())) : hVar.mo3791V(this.f2578d);
        long j = this.f2579e.getValue().f3366a;
        float f = this.f2580f.getValue().f2594d;
        hVar.mo6911O0();
        mo5336c(this.f2578d, j, hVar);
        C1537o a = hVar.f3917b.f18423c.mo20991a();
        ((Boolean) this.f2583i.getValue()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.f2582h.getValue();
        if (rippleHostView != null) {
            rippleHostView.m34770updateRipplePropertiesbiQXAtU(hVar.mo6913b(), this.f2585k, j, f);
            Canvas canvas = C1493c.f3222a;
            C19383o.m32797g(a, "<this>");
            rippleHostView.draw(((C1491b) a).f3219a);
        }
    }

    /* renamed from: b */
    public final void mo5301b(C0643m mVar, C19525d0 d0Var) {
        C19383o.m32797g(mVar, "interaction");
        C19383o.m32797g(d0Var, "scope");
        RippleHostView rippleHostView = this.f2581g.getRippleHostView(this);
        rippleHostView.m34769addRippleKOepWvA(mVar, this.f2577c, this.f2584j, this.f2585k, this.f2579e.getValue().f3366a, this.f2580f.getValue().f2594d, this.f2586l);
        this.f2582h.setValue(rippleHostView);
    }

    /* renamed from: d */
    public final void mo5302d(C0643m mVar) {
        C19383o.m32797g(mVar, "interaction");
        RippleHostView rippleHostView = (RippleHostView) this.f2582h.getValue();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    public final void onAbandoned() {
        this.f2581g.disposeRippleIfNeeded(this);
    }

    public final void onForgotten() {
        this.f2581g.disposeRippleIfNeeded(this);
    }

    public final void onRemembered() {
    }
}
