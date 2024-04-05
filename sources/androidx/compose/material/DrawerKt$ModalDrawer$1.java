package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0735g;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
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

public final class DrawerKt$ModalDrawer$1 extends Lambda implements C19862q<C0735g, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ C1530k0 $drawerShape;
    public final /* synthetic */ C1206k0 $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ C19525d0 $scope;
    public final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1(C1206k0 k0Var, boolean z, int i, long j, C1530k0 k0Var2, long j2, long j3, float f, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19525d0 d0Var, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(3);
        this.$drawerState = k0Var;
        this.$gesturesEnabled = z;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = k0Var2;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$content = pVar;
        this.$scope = d0Var;
        this.$drawerContent = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0735g) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0735g gVar, C1302d dVar, int i) {
        int i2;
        C0735g gVar2 = gVar;
        C1302d dVar2 = dVar;
        C19383o.m32797g(gVar2, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (dVar2.mo5408I(gVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar.mo5442i()) {
            long b = gVar.mo4120b();
            if (C7280a.m13959d(b)) {
                float f = -((float) C7280a.m13963h(b));
                Float valueOf = Float.valueOf(0.0f);
                DrawerValue drawerValue = DrawerValue.Open;
                Map s0 = C19294b0.m32562s0(new Pair(Float.valueOf(f), DrawerValue.Closed), new Pair(valueOf, drawerValue));
                C1345l1 l1Var = CompositionLocalsKt.f4025k;
                boolean z = dVar2.mo5410J(l1Var) == LayoutDirection.Rtl;
                C1436d.C1437a aVar = C1436d.C1437a.f3125b;
                C1436d d = C1261v1.m2395d(aVar, this.$drawerState.f2507a, s0, Orientation.Horizontal, this.$gesturesEnabled, z, (C0640j) null, C10761.INSTANCE, (C1213m1) null, DrawerKt.f2204b, 32);
                C1206k0 k0Var = this.$drawerState;
                int i3 = this.$$dirty;
                long j = this.$scrimColor;
                C1530k0 k0Var2 = this.$drawerShape;
                long j2 = this.$drawerBackgroundColor;
                long j3 = j;
                float f2 = f;
                long j4 = this.$drawerContentColor;
                float f3 = this.$drawerElevation;
                long j5 = j4;
                C19861p<C1302d, Integer, C19394m> pVar = this.$content;
                boolean z2 = this.$gesturesEnabled;
                C19861p<C1302d, Integer, C19394m> pVar2 = pVar;
                C19525d0 d0Var = this.$scope;
                C19862q<C0739i, C1302d, Integer, C19394m> qVar = this.$drawerContent;
                dVar2.mo5465u(733328855);
                C1432b bVar = C1428a.C1429a.f3105a;
                long j6 = j2;
                C1711v c = BoxKt.m1457c(bVar, false, dVar2);
                dVar2.mo5465u(-1323940314);
                C1345l1 l1Var2 = CompositionLocalsKt.f4019e;
                C1345l1 l1Var3 = l1Var2;
                C7282b bVar2 = (C7282b) dVar2.mo5410J(l1Var2);
                C1530k0 k0Var3 = k0Var2;
                LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(l1Var);
                C19862q<C0739i, C1302d, Integer, C19394m> qVar2 = qVar;
                C1345l1 l1Var4 = CompositionLocalsKt.f4029o;
                float f4 = f3;
                C1843j1 j1Var = (C1843j1) dVar2.mo5410J(l1Var4);
                ComposeUiNode.f3776c0.getClass();
                C1345l1 l1Var5 = l1Var4;
                C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
                ComposableLambdaImpl a = C1700o.m3617a(d);
                if (dVar.mo5446k() instanceof C1299c) {
                    dVar.mo5392A();
                    if (dVar.mo5436f()) {
                        dVar2.mo5450m(aVar2);
                    } else {
                        dVar.mo5452n();
                    }
                    dVar.mo5394B();
                    C19861p<ComposeUiNode, C1711v, C19394m> pVar3 = ComposeUiNode.Companion.f3781e;
                    Updater.m2571b(dVar2, c, pVar3);
                    C19861p<ComposeUiNode, C7282b, C19394m> pVar4 = ComposeUiNode.Companion.f3780d;
                    Updater.m2571b(dVar2, bVar2, pVar4);
                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar5 = ComposeUiNode.Companion.f3782f;
                    Updater.m2571b(dVar2, layoutDirection, pVar5);
                    C19861p<ComposeUiNode, C1843j1, C19394m> pVar6 = ComposeUiNode.Companion.f3783g;
                    long j7 = b;
                    C19861p<ComposeUiNode, C1711v, C19394m> pVar7 = pVar3;
                    C19861p<ComposeUiNode, C7282b, C19394m> pVar8 = pVar4;
                    C1345l1 l1Var6 = l1Var3;
                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar9 = pVar5;
                    C1530k0 k0Var4 = k0Var3;
                    C19861p<ComposeUiNode, C1843j1, C19394m> pVar10 = pVar6;
                    DrawerValue drawerValue2 = drawerValue;
                    C19525d0 d0Var2 = d0Var;
                    C19862q<C0739i, C1302d, Integer, C19394m> qVar3 = qVar2;
                    C1206k0 k0Var5 = k0Var;
                    C19861p<C1302d, Integer, C19394m> pVar11 = pVar2;
                    C19846a<ComposeUiNode> aVar3 = aVar2;
                    boolean z3 = z2;
                    C0472h.m1246i(0, a, C0073e.m204d(dVar2, j1Var, pVar6, dVar2), dVar, 2058660585, -2137368960);
                    dVar2.mo5465u(-1263168067);
                    dVar2.mo5465u(733328855);
                    C1711v c2 = BoxKt.m1457c(bVar, false, dVar2);
                    dVar2.mo5465u(-1323940314);
                    C1345l1 l1Var7 = l1Var6;
                    C7282b bVar3 = (C7282b) dVar2.mo5410J(l1Var7);
                    LayoutDirection layoutDirection2 = (LayoutDirection) dVar2.mo5410J(l1Var);
                    C1843j1 j1Var2 = (C1843j1) dVar2.mo5410J(l1Var5);
                    ComposableLambdaImpl a2 = C1700o.m3617a(aVar);
                    if (dVar.mo5446k() instanceof C1299c) {
                        dVar.mo5392A();
                        if (dVar.mo5436f()) {
                            dVar2.mo5450m(aVar3);
                        } else {
                            dVar.mo5452n();
                        }
                        dVar.mo5394B();
                        Updater.m2571b(dVar2, c2, pVar7);
                        Updater.m2571b(dVar2, bVar3, pVar8);
                        Updater.m2571b(dVar2, layoutDirection2, pVar9);
                        Updater.m2571b(dVar2, j1Var2, pVar10);
                        dVar.mo5430c();
                        C0472h.m1246i(0, a2, new C1295a1(dVar2), dVar, 2058660585, -2137368960);
                        dVar2.mo5465u(32495683);
                        pVar11.invoke(dVar2, Integer.valueOf((i3 >> 27) & 14));
                        dVar.mo5406H();
                        dVar.mo5406H();
                        dVar.mo5406H();
                        dVar.mo5456p();
                        dVar.mo5406H();
                        dVar.mo5406H();
                        C1206k0 k0Var6 = k0Var5;
                        boolean z4 = k0Var6.f2507a.mo5116d() == drawerValue2;
                        C19525d0 d0Var3 = d0Var2;
                        DrawerKt$ModalDrawer$1$2$2 drawerKt$ModalDrawer$1$2$2 = new DrawerKt$ModalDrawer$1$2$2(z3, k0Var6, d0Var3);
                        Float valueOf2 = Float.valueOf(f2);
                        Float valueOf3 = Float.valueOf(0.0f);
                        dVar2.mo5465u(1618982084);
                        boolean I = dVar2.mo5408I(valueOf2) | dVar2.mo5408I(valueOf3) | dVar2.mo5408I(k0Var6);
                        Object v = dVar.mo5467v();
                        if (I || v == C1302d.C1303a.f2828a) {
                            v = new DrawerKt$ModalDrawer$1$2$3$1(f2, 0.0f, k0Var6);
                            dVar2.mo5454o(v);
                        }
                        dVar.mo5406H();
                        DrawerKt.m2180c(z4, drawerKt$ModalDrawer$1$2$2, (C19846a) v, j3, dVar, (i3 >> 15) & 7168);
                        String K = C1993m.m4350K(0, dVar2);
                        C7282b bVar4 = (C7282b) dVar2.mo5410J(l1Var7);
                        float p = bVar4.mo3797p(C7280a.m13965j(j7));
                        float p2 = bVar4.mo3797p(C7280a.m13964i(j7));
                        float p3 = bVar4.mo3797p(C7280a.m13963h(j7));
                        float p4 = bVar4.mo3797p(C7280a.m13962g(j7));
                        FillModifier fillModifier = SizeKt.f1427a;
                        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
                        SizeModifier sizeModifier = new SizeModifier(p, p2, p3, p4, true);
                        aVar.mo6148i0(sizeModifier);
                        dVar2.mo5465u(1157296644);
                        boolean I2 = dVar2.mo5408I(k0Var6);
                        Object v2 = dVar.mo5467v();
                        if (I2 || v2 == C1302d.C1303a.f2828a) {
                            v2 = new DrawerKt$ModalDrawer$1$2$5$1(k0Var6);
                            dVar2.mo5454o(v2);
                        }
                        dVar.mo5406H();
                        int i4 = i3 >> 12;
                        SurfaceKt.m2234a(SemanticsModifierKt.m4174a(C15588c1.m25287J0(C1993m.m4360U(sizeModifier, (C19857l) v2), 0.0f, 0.0f, DrawerKt.f2203a, 0.0f, 11), false, new DrawerKt$ModalDrawer$1$2$6(K, k0Var6, d0Var3)), k0Var4, j6, j5, (C0556g) null, f4, C18263b.m30805A(dVar2, -1941234439, new DrawerKt$ModalDrawer$1$2$7(qVar3, i3)), dVar, 1572864 | ((i3 >> 9) & 112) | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
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
                C0005b.m45j0();
                throw null;
            }
            throw new IllegalStateException("Drawer shouldn't have infinite width");
        }
        dVar.mo5396C();
    }
}
