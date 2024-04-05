package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1426z0;
import androidx.compose.runtime.snapshots.C1397o;
import androidx.compose.runtime.snapshots.C1402s;
import androidx.compose.runtime.snapshots.C1403t;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Iterator;
import java.util.Map;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p288y.C8343c;
import p288y.C8347f;
import p297z.C8406a;
import p297z.C8412e;
import p297z.C8413f;

public final class CommonRippleIndicationInstance extends C1243i implements C1426z0 {

    /* renamed from: c */
    public final boolean f2554c;

    /* renamed from: d */
    public final float f2555d;

    /* renamed from: e */
    public final C1342k1<C1545s> f2556e;

    /* renamed from: f */
    public final C1342k1<C1239e> f2557f;

    /* renamed from: g */
    public final C1397o<C0643m, RippleAnimation> f2558g;

    public CommonRippleIndicationInstance() {
        throw null;
    }

    public CommonRippleIndicationInstance(boolean z, float f, C1338j0 j0Var, C1338j0 j0Var2) {
        super(z, j0Var2);
        this.f2554c = z;
        this.f2555d = f;
        this.f2556e = j0Var;
        this.f2557f = j0Var2;
        this.f2558g = new C1397o<>();
    }

    /* renamed from: a */
    public final void mo3873a(C1741h hVar) {
        C1741h hVar2 = hVar;
        long j = this.f2556e.getValue().f3366a;
        hVar.mo6911O0();
        mo5336c(this.f2555d, j, hVar2);
        Iterator it = this.f2558g.f3039c.iterator();
        while (((C1403t) it).hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) ((C1402s) it).next()).getValue();
            float f = this.f2557f.getValue().f2594d;
            if (!(f == 0.0f)) {
                long b = C1545s.m3356b(j, f);
                rippleAnimation.getClass();
                if (rippleAnimation.f2564d == null) {
                    long b2 = hVar.mo6913b();
                    float f2 = C1240f.f2595a;
                    rippleAnimation.f2564d = Float.valueOf(Math.max(C8347f.m16656d(b2), C8347f.m16654b(b2)) * 0.3f);
                }
                if (rippleAnimation.f2565e == null) {
                    rippleAnimation.f2565e = Float.isNaN(rippleAnimation.f2562b) ? Float.valueOf(C1240f.m2364a(hVar2, rippleAnimation.f2563c, hVar.mo6913b())) : Float.valueOf(hVar2.mo3789B0(rippleAnimation.f2562b));
                }
                if (rippleAnimation.f2561a == null) {
                    rippleAnimation.f2561a = new C8343c(hVar.mo6907K0());
                }
                if (rippleAnimation.f2566f == null) {
                    rippleAnimation.f2566f = new C8343c(C19421p.m32952q(C8347f.m16656d(hVar.mo6913b()) / 2.0f, C8347f.m16654b(hVar.mo6913b()) / 2.0f));
                }
                float floatValue = (!((Boolean) rippleAnimation.f2572l.getValue()).booleanValue() || ((Boolean) rippleAnimation.f2571k.getValue()).booleanValue()) ? rippleAnimation.f2567g.mo3375e().floatValue() : 1.0f;
                Float f3 = rippleAnimation.f2564d;
                C19383o.m32794d(f3);
                float floatValue2 = f3.floatValue();
                Float f4 = rippleAnimation.f2565e;
                C19383o.m32794d(f4);
                float w0 = C15588c1.m25354w0(floatValue2, f4.floatValue(), rippleAnimation.f2568h.mo3375e().floatValue());
                C8343c cVar = rippleAnimation.f2561a;
                C19383o.m32794d(cVar);
                float c = C8343c.m16642c(cVar.f18299a);
                C8343c cVar2 = rippleAnimation.f2566f;
                C19383o.m32794d(cVar2);
                float w02 = C15588c1.m25354w0(c, C8343c.m16642c(cVar2.f18299a), rippleAnimation.f2569i.mo3375e().floatValue());
                C8343c cVar3 = rippleAnimation.f2561a;
                C19383o.m32794d(cVar3);
                float d = C8343c.m16643d(cVar3.f18299a);
                C8343c cVar4 = rippleAnimation.f2566f;
                C19383o.m32794d(cVar4);
                long q = C19421p.m32952q(w02, C15588c1.m25354w0(d, C8343c.m16643d(cVar4.f18299a), rippleAnimation.f2569i.mo3375e().floatValue()));
                long b3 = C1545s.m3356b(b, C1545s.m3358d(b) * floatValue);
                if (rippleAnimation.f2563c) {
                    float d2 = C8347f.m16656d(hVar.mo6913b());
                    float b4 = C8347f.m16654b(hVar.mo6913b());
                    C8406a.C8408b bVar = hVar2.f3917b.f18423c;
                    long b5 = bVar.mo20992b();
                    bVar.mo20991a().mo6264r();
                    bVar.f18430a.mo20995b(0.0f, 0.0f, d2, b4, 1);
                    C8406a.C8408b bVar2 = bVar;
                    C8412e.m16793y(hVar, b3, w0, q, (C8413f) null, 120);
                    bVar2.mo20991a().mo6261m();
                    bVar2.mo20993c(b5);
                } else {
                    C8412e.m16793y(hVar, b3, w0, q, (C8413f) null, 120);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo5301b(C0643m mVar, C19525d0 d0Var) {
        C19383o.m32797g(mVar, "interaction");
        C19383o.m32797g(d0Var, "scope");
        Iterator it = this.f2558g.f3039c.iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it.next()).getValue();
            rippleAnimation.f2572l.setValue(Boolean.TRUE);
            rippleAnimation.f2570j.mo72524n0(C19394m.f43287a);
        }
        RippleAnimation rippleAnimation2 = new RippleAnimation(this.f2554c ? new C8343c(mVar.f1381a) : null, this.f2555d, this.f2554c);
        this.f2558g.put(mVar, rippleAnimation2);
        C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation2, this, mVar, (C19340c<? super CommonRippleIndicationInstance$addRipple$2>) null), 3);
    }

    /* renamed from: d */
    public final void mo5302d(C0643m mVar) {
        C19383o.m32797g(mVar, "interaction");
        RippleAnimation rippleAnimation = this.f2558g.get(mVar);
        if (rippleAnimation != null) {
            rippleAnimation.f2572l.setValue(Boolean.TRUE);
            rippleAnimation.f2570j.mo72524n0(C19394m.f43287a);
        }
    }

    public final void onAbandoned() {
        this.f2558g.clear();
    }

    public final void onForgotten() {
        this.f2558g.clear();
    }

    public final void onRemembered() {
    }
}
