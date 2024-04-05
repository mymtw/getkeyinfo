package androidx.compose.animation;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p174m0.C7290i;
import p753kq.C19861p;

public final class SizeAnimationModifier extends C0481p {

    /* renamed from: b */
    public final C0422e<C7290i> f992b;

    /* renamed from: c */
    public final C19525d0 f993c;

    /* renamed from: d */
    public C19861p<? super C7290i, ? super C7290i, C19394m> f994d;

    /* renamed from: e */
    public C0386a f995e;

    /* renamed from: androidx.compose.animation.SizeAnimationModifier$a */
    public static final class C0386a {

        /* renamed from: a */
        public final Animatable<C7290i, C0428h> f996a;

        /* renamed from: b */
        public long f997b;

        public C0386a() {
            throw null;
        }

        public C0386a(Animatable animatable, long j) {
            this.f996a = animatable;
            this.f997b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0386a)) {
                return false;
            }
            C0386a aVar = (C0386a) obj;
            return C19383o.m32792b(this.f996a, aVar.f996a) && C7290i.m13994a(this.f997b, aVar.f997b);
        }

        public final int hashCode() {
            return Long.hashCode(this.f997b) + (this.f996a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnimData(anim=");
            h.append(this.f996a);
            h.append(", startSize=");
            h.append(C7290i.m13996c(this.f997b));
            h.append(')');
            return h.toString();
        }
    }

    public SizeAnimationModifier(C0454t tVar, C19525d0 d0Var) {
        C19383o.m32797g(tVar, "animSpec");
        C19383o.m32797g(d0Var, "scope");
        this.f992b = tVar;
        this.f993c = d0Var;
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        long a = C0761x.m1707a(J.f3722b, J.f3723c);
        C0386a aVar = this.f995e;
        if (aVar == null) {
            aVar = new C0386a(new Animatable(new C7290i(a), VectorConvertersKt.f1083h, new C7290i(C0761x.m1707a(1, 1))), a);
        } else if (!C7290i.m13994a(a, ((C7290i) aVar.f996a.f1010e.getValue()).f16171a)) {
            aVar.f997b = aVar.f996a.mo3375e().f16171a;
            C19697g.m33468f(this.f993c, (CoroutineContext) null, (CoroutineStart) null, new SizeAnimationModifier$animateTo$data$1$1(aVar, a, this, (C19340c<? super SizeAnimationModifier$animateTo$data$1$1>) null), 3);
        }
        this.f995e = aVar;
        long j2 = aVar.f996a.mo3375e().f16171a;
        return xVar.mo4387Z((int) (j2 >> 32), C7290i.m13995b(j2), C19294b0.m32559p0(), new SizeAnimationModifier$measure$1(J));
    }
}
