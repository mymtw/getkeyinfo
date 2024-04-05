package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0735g;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p001a0.C0005b;
import p174m0.C7280a;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class DrawerKt$BottomDrawer$1 extends Lambda implements C19862q<C0735g, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ C1530k0 $drawerShape;
    public final /* synthetic */ C1185g $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ C19525d0 $scope;
    public final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1(boolean z, C1185g gVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, long j, C1530k0 k0Var, long j2, long j3, float f, C19525d0 d0Var, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = gVar;
        this.$content = pVar;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = k0Var;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$scope = d0Var;
        this.$drawerContent = qVar;
    }

    /* renamed from: access$invoke$lambda-2  reason: not valid java name */
    public static final void m34748access$invoke$lambda2(C1338j0 j0Var, float f) {
        j0Var.setValue(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0735g) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0735g gVar, C1302d dVar, int i) {
        int i2;
        Map map;
        C0735g gVar2 = gVar;
        C1302d dVar2 = dVar;
        C19383o.m32797g(gVar2, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (dVar2.mo5408I(gVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar.mo5442i()) {
            float g = (float) C7280a.m13962g(gVar.mo4120b());
            Float valueOf = Float.valueOf(g);
            dVar2.mo5465u(1157296644);
            boolean I = dVar2.mo5408I(valueOf);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = C0761x.m1751w0(Float.valueOf(g), C1351n1.f2948a);
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            C1338j0 j0Var = (C1338j0) v;
            boolean z = C7280a.m13963h(gVar.mo4120b()) > C7280a.m13962g(gVar.mo4120b());
            float f = 0.5f * g;
            float max = Math.max(0.0f, g - ((Number) j0Var.getValue()).floatValue());
            if (((Number) j0Var.getValue()).floatValue() < f || z) {
                map = C19294b0.m32562s0(new Pair(Float.valueOf(g), BottomDrawerValue.Closed), new Pair(Float.valueOf(max), BottomDrawerValue.Expanded));
            } else {
                map = C19294b0.m32562s0(new Pair(Float.valueOf(g), BottomDrawerValue.Closed), new Pair(Float.valueOf(f), BottomDrawerValue.Open), new Pair(Float.valueOf(max), BottomDrawerValue.Expanded));
            }
            Map map2 = map;
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) dVar2.mo5410J(l1Var);
            C1436d dVar3 = C1436d.C1437a.f3125b;
            C1436d n = SizeKt.m1494n(dVar3, 0.0f, 0.0f, bVar.mo3797p(C7280a.m13963h(gVar.mo4120b())), bVar.mo3797p(C7280a.m13962g(gVar.mo4120b())), 3);
            C1436d a = this.$gesturesEnabled ? NestedScrollModifierKt.m3433a(dVar3, this.$drawerState.f2444q, (NestedScrollDispatcher) null) : dVar3;
            C19383o.m32797g(a, "other");
            C1436d d = C1261v1.m2395d(a, this.$drawerState, map2, Orientation.Vertical, this.$gesturesEnabled, false, (C0640j) null, (C19861p) null, (C1213m1) null, 0.0f, 368);
            C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            int i3 = this.$$dirty;
            long j = this.$scrimColor;
            C1185g gVar3 = this.$drawerState;
            C1530k0 k0Var = this.$drawerShape;
            long j2 = this.$drawerBackgroundColor;
            long j3 = this.$drawerContentColor;
            long j4 = j2;
            float f2 = this.$drawerElevation;
            boolean z2 = this.$gesturesEnabled;
            float f3 = f2;
            C19525d0 d0Var = this.$scope;
            C19862q<C0739i, C1302d, Integer, C19394m> qVar = this.$drawerContent;
            dVar2.mo5465u(733328855);
            long j5 = j3;
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar2 = (C7282b) dVar2.mo5410J(l1Var);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            boolean z3 = z2;
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(d);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar2, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C19862q<C0739i, C1302d, Integer, C19394m> qVar2 = qVar;
                C19525d0 d0Var2 = d0Var;
                C1530k0 k0Var2 = k0Var;
                C19525d0 d0Var3 = d0Var2;
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -2137368960);
                dVar2.mo5465u(-1660053078);
                pVar.invoke(dVar2, Integer.valueOf((i3 >> 27) & 14));
                DrawerKt.m2179b(j, new DrawerKt$BottomDrawer$1$1$1(z3, gVar3, d0Var3), gVar3.mo5117e() != BottomDrawerValue.Closed, dVar, (i3 >> 24) & 14);
                String K = C1993m.m4350K(0, dVar2);
                dVar2.mo5465u(1157296644);
                boolean I2 = dVar2.mo5408I(gVar3);
                Object v2 = dVar.mo5467v();
                if (I2 || v2 == C1302d.C1303a.f2828a) {
                    v2 = new DrawerKt$BottomDrawer$1$1$2$1(gVar3);
                    dVar2.mo5454o(v2);
                }
                dVar.mo5406H();
                C1436d U = C1993m.m4360U(n, (C19857l) v2);
                dVar2.mo5465u(1157296644);
                boolean I3 = dVar2.mo5408I(j0Var);
                Object v3 = dVar.mo5467v();
                if (I3 || v3 == C1302d.C1303a.f2828a) {
                    v3 = new DrawerKt$BottomDrawer$1$1$3$1(j0Var);
                    dVar2.mo5454o(v3);
                }
                dVar.mo5406H();
                int i4 = i3 >> 12;
                SurfaceKt.m2234a(SemanticsModifierKt.m4174a(C15588c1.m25270A0(U, (C19857l) v3), false, new DrawerKt$BottomDrawer$1$1$4(K, gVar3, d0Var3)), k0Var2, j4, j5, (C0556g) null, f3, C18263b.m30805A(dVar2, 457750254, new DrawerKt$BottomDrawer$1$1$5(qVar2, i3)), dVar, 1572864 | ((i3 >> 9) & 112) | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
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
