package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.nestedscroll.C1617a;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import p753kq.C19862q;

public final class ScrollableKt$scrollable$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0608f $flingBehavior;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ C1030w $overscrollEffect;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ C0615m $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$2(Orientation orientation, C0615m mVar, boolean z, C0640j jVar, C0608f fVar, C1030w wVar, boolean z2) {
        super(3);
        this.$orientation = orientation;
        this.$state = mVar;
        this.$reverseDirection = z;
        this.$interactionSource = jVar;
        this.$flingBehavior = fVar;
        this.$overscrollEffect = wVar;
        this.$enabled = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C1302d dVar3 = dVar2;
        C19383o.m32797g(dVar, "$this$composed");
        dVar3.mo5465u(-629830927);
        dVar3.mo5465u(773894976);
        dVar3.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar3));
            dVar3.mo5454o(mVar);
            v = mVar;
        }
        dVar2.mo5406H();
        C19525d0 d0Var = ((C1346m) v).f2939b;
        dVar2.mo5406H();
        Object[] objArr = {d0Var, this.$orientation, this.$state, Boolean.valueOf(this.$reverseDirection)};
        Orientation orientation = this.$orientation;
        C0615m mVar2 = this.$state;
        boolean z = this.$reverseDirection;
        dVar3.mo5465u(-568225417);
        boolean z2 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z2 |= dVar3.mo5408I(objArr[i2]);
        }
        Object v2 = dVar2.mo5467v();
        if (z2 || v2 == C1302d.C1303a.f2828a) {
            v2 = new ContentInViewModifier(d0Var, orientation, mVar2, z);
            dVar3.mo5454o(v2);
        }
        dVar2.mo5406H();
        C1436d dVar4 = C1436d.C1437a.f3125b;
        C1436d i0 = FocusableKt.m1304a().mo6148i0(((ContentInViewModifier) v2).f1314i);
        C0640j jVar = this.$interactionSource;
        Orientation orientation2 = this.$orientation;
        boolean z3 = this.$reverseDirection;
        C0615m mVar3 = this.$state;
        C0608f fVar = this.$flingBehavior;
        C1030w wVar = this.$overscrollEffect;
        boolean z4 = this.$enabled;
        ScrollableKt.C0580a aVar = ScrollableKt.f1340a;
        dVar3.mo5465u(-2012025036);
        dVar3.mo5465u(-1730187034);
        if (fVar == null) {
            fVar = C19421p.m32919I(dVar2);
        }
        C0608f fVar2 = fVar;
        dVar2.mo5406H();
        dVar3.mo5465u(-492369756);
        Object v3 = dVar2.mo5467v();
        Object obj = C1302d.C1303a.f2828a;
        if (v3 == obj) {
            v3 = C0761x.m1751w0(new NestedScrollDispatcher(), C1351n1.f2948a);
            dVar3.mo5454o(v3);
        }
        dVar2.mo5406H();
        C1338j0 j0Var = (C1338j0) v3;
        ScrollingLogic scrollingLogic = r12;
        ScrollingLogic scrollingLogic2 = new ScrollingLogic(orientation2, z3, j0Var, mVar3, fVar2, wVar);
        C1338j0 E0 = C0761x.m1664E0(scrollingLogic, dVar3);
        Boolean valueOf = Boolean.valueOf(z4);
        dVar3.mo5465u(1157296644);
        boolean I = dVar3.mo5408I(valueOf);
        Object v4 = dVar2.mo5467v();
        if (I || v4 == obj) {
            v4 = new ScrollableKt$scrollableNestedScrollConnection$1(z4, E0);
            dVar3.mo5454o(v4);
        }
        dVar2.mo5406H();
        C1617a aVar2 = (C1617a) v4;
        dVar3.mo5465u(-492369756);
        Object v5 = dVar2.mo5467v();
        if (v5 == obj) {
            v5 = new ScrollDraggableState(E0);
            dVar3.mo5454o(v5);
        }
        dVar2.mo5406H();
        dVar3.mo5465u(-1485272842);
        dVar2.mo5406H();
        C19388s sVar = C19388s.f43271b;
        C19388s sVar2 = sVar;
        C1436d a = NestedScrollModifierKt.m3433a(SuspendingPointerInputFilterKt.m3483a(DraggableKt.m1375c(i0, new ScrollableKt$pointerScrollable$1((ScrollDraggableState) v5), ScrollableKt$pointerScrollable$2.INSTANCE, orientation2, z4, jVar, new ScrollableKt$pointerScrollable$3(E0), new DraggableKt$draggable$6((C19340c<? super DraggableKt$draggable$6>) null), new ScrollableKt$pointerScrollable$4(j0Var, E0, (C19340c<? super ScrollableKt$pointerScrollable$4>) null), false), E0, sVar2, new ScrollableKt$mouseWheelScroll$1(sVar2, E0, (C19340c<? super ScrollableKt$mouseWheelScroll$1>) null)), aVar2, (NestedScrollDispatcher) j0Var.getValue());
        dVar2.mo5406H();
        if (this.$enabled) {
            dVar4 = C0609g.f1359b;
        }
        C1436d i02 = a.mo6148i0(dVar4);
        dVar2.mo5406H();
        return i02;
    }
}
