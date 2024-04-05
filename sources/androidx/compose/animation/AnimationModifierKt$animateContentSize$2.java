package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19543e0;
import p174m0.C7290i;
import p753kq.C19861p;
import p753kq.C19862q;

final class AnimationModifierKt$animateContentSize$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0454t<C7290i> $animationSpec;
    public final /* synthetic */ C19861p<C7290i, C7290i, C19394m> $finishedListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimationModifierKt$animateContentSize$2(C19861p<? super C7290i, ? super C7290i, C19394m> pVar, C0454t<C7290i> tVar) {
        super(3);
        this.$finishedListener = pVar;
        this.$animationSpec = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-843180607);
        dVar2.mo5465u(773894976);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
        if (v == aVar) {
            C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar2));
            dVar2.mo5454o(mVar);
            v = mVar;
        }
        dVar2.mo5406H();
        C19525d0 d0Var = ((C1346m) v).f2939b;
        dVar2.mo5406H();
        C0454t<C7290i> tVar = this.$animationSpec;
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(d0Var);
        Object v2 = dVar2.mo5467v();
        if (I || v2 == aVar) {
            v2 = new SizeAnimationModifier(tVar, d0Var);
            dVar2.mo5454o(v2);
        }
        dVar2.mo5406H();
        SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) v2;
        sizeAnimationModifier.f994d = this.$finishedListener;
        C1436d i0 = C19543e0.m33287C(dVar).mo6148i0(sizeAnimationModifier);
        dVar2.mo5406H();
        return i0;
    }
}
