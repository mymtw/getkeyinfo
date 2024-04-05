package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1415u;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import p753kq.C19862q;

public final class ScrollKt$scroll$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0608f $flingBehavior;
    public final /* synthetic */ boolean $isScrollable;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ boolean $reverseScrolling;
    public final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2(boolean z, ScrollState scrollState, boolean z2, C0608f fVar, boolean z3) {
        super(3);
        this.$isVertical = z;
        this.$state = scrollState;
        this.$isScrollable = z2;
        this.$flingBehavior = fVar;
        this.$reverseScrolling = z3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1478351300);
        C1030w b0 = C19421p.m32934b0(dVar2);
        dVar2.mo5465u(773894976);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar2));
            dVar2.mo5454o(mVar);
            v = mVar;
        }
        dVar2.mo5406H();
        C19525d0 d0Var = ((C1346m) v).f2939b;
        dVar2.mo5406H();
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        boolean z = false;
        C1436d a = SemanticsModifierKt.m4174a(aVar, false, new ScrollKt$scroll$2$semantics$1(this.$reverseScrolling, this.$isVertical, this.$isScrollable, this.$state, d0Var));
        boolean z2 = this.$isVertical;
        Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
        boolean z3 = !this.$reverseScrolling;
        if (dVar2.mo5410J(CompositionLocalsKt.f4025k) == LayoutDirection.Rtl) {
            z = true;
        }
        boolean z4 = (!z || z2) ? z3 : !z3;
        ScrollState scrollState = this.$state;
        C1436d i0 = C15588c1.m25275D0(C0621i.m1438a(a, orientation), b0).mo6148i0(ScrollableKt.m1398b(aVar, scrollState, orientation, b0, this.$isScrollable, z4, this.$flingBehavior, scrollState.f1281b)).mo6148i0(new ScrollingLayoutModifier(this.$state, this.$reverseScrolling, this.$isVertical, b0));
        dVar2.mo5406H();
        return i0;
    }
}
