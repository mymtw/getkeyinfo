package androidx.compose.animation;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1684h0;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.LinkedHashMap;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7290i;

public final class AnimatedContentScope<S> implements Transition.C0402b<S> {

    /* renamed from: a */
    public final Transition<S> f964a;

    /* renamed from: b */
    public C1428a f965b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f966c = C0761x.m1751w0(new C7290i(0), C1351n1.f2948a);

    /* renamed from: d */
    public final LinkedHashMap f967d = new LinkedHashMap();

    /* renamed from: e */
    public C1342k1<C7290i> f968e;

    public final class SizeModifier extends C0481p {

        /* renamed from: b */
        public final Transition<S>.a<C7290i, C0428h> f969b;

        /* renamed from: c */
        public final C1342k1<C0484s> f970c;

        /* renamed from: d */
        public final /* synthetic */ AnimatedContentScope<S> f971d;

        public SizeModifier(AnimatedContentScope animatedContentScope, Transition.C0400a aVar, C1338j0 j0Var) {
            C19383o.m32797g(aVar, "sizeAnimation");
            this.f971d = animatedContentScope;
            this.f969b = aVar;
            this.f970c = j0Var;
        }

        /* renamed from: v */
        public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
            C19383o.m32797g(xVar, "$this$measure");
            C19383o.m32797g(uVar, "measurable");
            C1686i0 J = uVar.mo6665J(j);
            Transition.C0400a.C0401a a = this.f969b.mo3418a(new AnimatedContentScope$SizeModifier$measure$size$1(this.f971d, this), new AnimatedContentScope$SizeModifier$measure$size$2(this.f971d));
            AnimatedContentScope<S> animatedContentScope = this.f971d;
            animatedContentScope.f968e = a;
            return xVar.mo4387Z((int) (((C7290i) a.getValue()).f16171a >> 32), C7290i.m13995b(((C7290i) a.getValue()).f16171a), C19294b0.m32559p0(), new AnimatedContentScope$SizeModifier$measure$1(J, animatedContentScope.f965b.mo6133a(C0761x.m1707a(J.f3722b, J.f3723c), ((C7290i) a.getValue()).f16171a, LayoutDirection.Ltr)));
        }
    }

    /* renamed from: androidx.compose.animation.AnimatedContentScope$a */
    public static final class C0377a implements C1684h0 {

        /* renamed from: b */
        public boolean f972b;

        public C0377a(boolean z) {
            this.f972b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0377a) && this.f972b == ((C0377a) obj).f972b;
        }

        public final int hashCode() {
            boolean z = this.f972b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        /* renamed from: o0 */
        public final Object mo3274o0(C1713x xVar, Object obj) {
            C19383o.m32797g(xVar, "<this>");
            return this;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("ChildData(isTarget="), this.f972b, ')');
        }
    }

    public AnimatedContentScope(Transition<S> transition, C1428a aVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(transition, "transition");
        C19383o.m32797g(aVar, "contentAlignment");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        this.f964a = transition;
        this.f965b = aVar;
    }

    /* renamed from: d */
    public static final long m1014d(AnimatedContentScope animatedContentScope, long j, long j2) {
        return animatedContentScope.f965b.mo6133a(j, j2, LayoutDirection.Ltr);
    }

    /* renamed from: e */
    public static final long m1015e(AnimatedContentScope animatedContentScope) {
        C1342k1<C7290i> k1Var = animatedContentScope.f968e;
        return k1Var != null ? k1Var.getValue().f16171a : ((C7290i) animatedContentScope.f966c.getValue()).f16171a;
    }

    /* renamed from: a */
    public final S mo3269a() {
        return this.f964a.mo3411c().mo3269a();
    }

    /* renamed from: b */
    public final S mo3270b() {
        return this.f964a.mo3411c().mo3270b();
    }
}
