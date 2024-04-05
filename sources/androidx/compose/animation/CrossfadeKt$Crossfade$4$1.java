package androidx.compose.animation;

import androidx.compose.animation.core.C0437l0;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class CrossfadeKt$Crossfade$4$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C0454t<Float> $animationSpec;
    public final /* synthetic */ C19862q<T, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ T $stateForContent;
    public final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1(Transition<T> transition, int i, C0454t<Float> tVar, T t, C19862q<? super T, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i;
        this.$animationSpec = tVar;
        this.$stateForContent = t;
        this.$content = qVar;
    }

    /* renamed from: access$invoke$lambda-1  reason: not valid java name */
    public static final float m34617access$invoke$lambda1(C1342k1 k1Var) {
        return ((Number) k1Var.getValue()).floatValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            Transition<T> transition = this.$this_Crossfade;
            CrossfadeKt$Crossfade$4$1$alpha$2 crossfadeKt$Crossfade$4$1$alpha$2 = new CrossfadeKt$Crossfade$4$1$alpha$2(this.$animationSpec);
            T t = this.$stateForContent;
            int i2 = this.$$dirty & 14;
            dVar.mo5465u(-1338768149);
            C0437l0 l0Var = VectorConvertersKt.f1076a;
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            int i5 = (i4 & 57344) | i3 | (i4 & 896) | (i4 & 7168);
            dVar.mo5465u(-142660079);
            T b = transition.mo3410b();
            dVar.mo5465u(-438678252);
            float f = 1.0f;
            float f2 = C19383o.m32792b(b, t) ? 1.0f : 0.0f;
            dVar.mo5406H();
            Float valueOf = Float.valueOf(f2);
            T d = transition.mo3412d();
            dVar.mo5465u(-438678252);
            if (!C19383o.m32792b(d, t)) {
                f = 0.0f;
            }
            dVar.mo5406H();
            Transition.C0404d c = TransitionKt.m1101c(transition, valueOf, Float.valueOf(f), (C0454t) crossfadeKt$Crossfade$4$1$alpha$2.invoke(transition.mo3411c(), dVar, Integer.valueOf((i5 >> 3) & 112)), l0Var, "FloatAnimation", dVar);
            dVar.mo5406H();
            dVar.mo5406H();
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            dVar.mo5465u(1157296644);
            boolean I = dVar.mo5408I(c);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new CrossfadeKt$Crossfade$4$1$1$1(c);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            C1436d j0 = C19388s.m32868j0(aVar, (C19857l) v);
            C19862q<T, C1302d, Integer, C19394m> qVar = this.$content;
            T t2 = this.$stateForContent;
            int i6 = this.$$dirty;
            dVar.mo5465u(-1990474327);
            C1711v c2 = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar);
            dVar.mo5465u(1376089335);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(j0);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, c2, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                dVar.mo5430c();
                C0472h.m1246i(0, a, new C1295a1(dVar), dVar, 2058660585, -1253629305);
                dVar.mo5465u(-222715758);
                qVar.invoke(t2, dVar, Integer.valueOf((i6 >> 9) & 112));
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5456p();
                dVar.mo5406H();
                dVar.mo5406H();
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
