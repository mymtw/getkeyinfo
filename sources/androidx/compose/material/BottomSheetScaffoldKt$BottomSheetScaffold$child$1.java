package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0742j;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p010a9.C0048b;
import p173m.C7279a;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ C1338j0<Float> $bottomSheetHeight$delegate;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ float $peekHeightPx;
    public final /* synthetic */ C1208l $scaffoldState;
    public final /* synthetic */ C1436d $semantics;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ boolean $sheetGesturesEnabled;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ C1530k0 $sheetShape;
    public final /* synthetic */ C19862q<C1254t1, C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1(C1208l lVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, float f, int i, int i2, int i3, int i4, float f2, boolean z, C1436d dVar, C1338j0<Float> j0Var, C1530k0 k0Var, long j, long j2, float f3, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar2, C19862q<? super C1254t1, ? super C1302d, ? super Integer, C19394m> qVar3) {
        super(2);
        this.$scaffoldState = lVar;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$floatingActionButton = pVar2;
        this.$sheetPeekHeight = f;
        this.$floatingActionButtonPosition = i;
        this.$$dirty = i2;
        this.$$dirty2 = i3;
        this.$$dirty1 = i4;
        this.$peekHeightPx = f2;
        this.$sheetGesturesEnabled = z;
        this.$semantics = dVar;
        this.$bottomSheetHeight$delegate = j0Var;
        this.$sheetShape = k0Var;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetElevation = f3;
        this.$sheetContent = qVar2;
        this.$snackbarHost = qVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            final C1208l lVar = this.$scaffoldState;
            C1211m mVar = lVar.f2515b;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = mVar.f2282e;
            C19861p<C1302d, Integer, C19394m> pVar = this.$topBar;
            C19862q<C0759v, C1302d, Integer, C19394m> qVar = this.$content;
            final float f = this.$peekHeightPx;
            final boolean z = this.$sheetGesturesEnabled;
            final C1436d dVar3 = this.$semantics;
            float f2 = this.$sheetPeekHeight;
            C1338j0<Float> j0Var = this.$bottomSheetHeight$delegate;
            C1530k0 k0Var = this.$sheetShape;
            long j = this.$sheetBackgroundColor;
            C19861p<C1302d, Integer, C19394m> pVar2 = pVar;
            C19862q<C0759v, C1302d, Integer, C19394m> qVar2 = qVar;
            long j2 = this.$sheetContentColor;
            float f3 = this.$sheetElevation;
            C1211m mVar2 = mVar;
            int i2 = this.$$dirty;
            final int i3 = this.$$dirty1;
            final float f4 = f3;
            final float f5 = f2;
            final C1338j0<Float> j0Var2 = j0Var;
            final C1530k0 k0Var2 = k0Var;
            final long j3 = j;
            final long j4 = j2;
            final int i4 = i2;
            final C19862q<C0739i, C1302d, Integer, C19394m> qVar3 = this.$sheetContent;
            C1302d dVar4 = dVar;
            ComposableLambdaImpl A = C18263b.m30805A(dVar4, -1378534681, new C19862q<Integer, C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke(((Number) obj).intValue(), (C1302d) obj2, ((Number) obj3).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(int i, C1302d dVar, int i2) {
                    int i3;
                    C1436d dVar2;
                    Map map;
                    int i4 = i;
                    C1302d dVar3 = dVar;
                    if ((i2 & 14) == 0) {
                        i3 = i2 | (dVar3.mo5432d(i4) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 91) != 18 || !dVar.mo5442i()) {
                        C1338j0<Float> j0Var = j0Var2;
                        float f = C1205k.f2506a;
                        Float value = j0Var.getValue();
                        if (value == null) {
                            dVar2 = C1436d.C1437a.f3125b;
                        } else {
                            if (C7279a.m13954l(value.floatValue()) == C7279a.m13954l(f)) {
                                map = C19421p.m32931U(new Pair(Float.valueOf(((float) i4) - value.floatValue()), BottomSheetValue.Collapsed));
                            } else {
                                float f2 = (float) i4;
                                Float value2 = j0Var2.getValue();
                                C19383o.m32794d(value2);
                                map = C19294b0.m32562s0(new Pair(Float.valueOf(f2 - value2.floatValue()), BottomSheetValue.Expanded), new Pair(Float.valueOf(f2 - f), BottomSheetValue.Collapsed));
                            }
                            dVar2 = C1261v1.m2395d(C1436d.C1437a.f3125b, lVar.f2515b, map, Orientation.Vertical, z, false, (C0640j) null, (C19861p) null, (C1213m1) null, 0.0f, 368);
                        }
                        C1436d g = SizeKt.m1487g(NestedScrollModifierKt.m3433a(C1436d.C1437a.f3125b, lVar.f2515b.f2525q, (NestedScrollDispatcher) null).mo6148i0(dVar2).mo6148i0(dVar3));
                        float f3 = f5;
                        C19383o.m32797g(g, "$this$requiredHeightIn");
                        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
                        C1436d i0 = g.mo6148i0(new SizeModifier(0.0f, f3, 0.0f, Float.NaN, false, 5));
                        C1338j0<Float> j0Var2 = j0Var2;
                        dVar3.mo5465u(1157296644);
                        boolean I = dVar3.mo5408I(j0Var2);
                        Object v = dVar.mo5467v();
                        if (I || v == C1302d.C1303a.f2828a) {
                            v = new BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1(j0Var2);
                            dVar3.mo5454o(v);
                        }
                        dVar.mo5406H();
                        C1436d j0 = C18263b.m30849j0(i0, (C19857l) v);
                        C1530k0 k0Var = k0Var2;
                        long j = j3;
                        long j2 = j4;
                        float f4 = f4;
                        final C19862q<C0739i, C1302d, Integer, C19394m> qVar = qVar3;
                        final int i5 = i4;
                        ComposableLambdaImpl A = C18263b.m30805A(dVar3, -698903261, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                if ((i & 11) != 2 || !dVar.mo5442i()) {
                                    C19862q<C0739i, C1302d, Integer, C19394m> qVar = qVar;
                                    int i2 = (i5 << 9) & 7168;
                                    dVar.mo5465u(-483455358);
                                    C1436d.C1437a aVar = C1436d.C1437a.f3125b;
                                    C1711v a = ColumnKt.m1461a(C0718d.f1478c, C1428a.C1429a.f3116l, dVar);
                                    dVar.mo5465u(-1323940314);
                                    C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
                                    LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
                                    C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
                                    ComposeUiNode.f3776c0.getClass();
                                    C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
                                    ComposableLambdaImpl a2 = C1700o.m3617a(aVar);
                                    int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
                                    if (dVar.mo5446k() instanceof C1299c) {
                                        dVar.mo5392A();
                                        if (dVar.mo5436f()) {
                                            dVar.mo5450m(aVar2);
                                        } else {
                                            dVar.mo5452n();
                                        }
                                        dVar.mo5394B();
                                        Updater.m2571b(dVar, a, ComposeUiNode.Companion.f3781e);
                                        Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                                        Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                                        a2.invoke(C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, Integer.valueOf((i3 >> 3) & 112));
                                        dVar.mo5465u(2058660585);
                                        dVar.mo5465u(-1163856341);
                                        if (((i3 >> 9) & 14 & 11) != 2 || !dVar.mo5442i()) {
                                            qVar.invoke(C0742j.f1527a, dVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
                                        } else {
                                            dVar.mo5396C();
                                        }
                                        C0048b.m166e(dVar);
                                        return;
                                    }
                                    C0005b.m45j0();
                                    throw null;
                                }
                                dVar.mo5396C();
                            }
                        });
                        int i6 = i4;
                        int i7 = i3 << 6;
                        SurfaceKt.m2234a(j0, k0Var, j, j2, (C0556g) null, f4, A, dVar, 1572864 | ((i6 >> 21) & 112) | (i7 & 896) | (i7 & 7168) | ((i6 >> 12) & 458752), 16);
                        return;
                    }
                    dVar.mo5396C();
                }
            });
            C19861p<C1302d, Integer, C19394m> pVar3 = this.$floatingActionButton;
            final C19862q<C1254t1, C1302d, Integer, C19394m> qVar4 = this.$snackbarHost;
            final C1208l lVar2 = this.$scaffoldState;
            final int i5 = this.$$dirty;
            ComposableLambdaImpl A2 = C18263b.m30805A(dVar4, -486138068, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        qVar4.invoke(lVar2.f2516c, dVar, Integer.valueOf((i5 >> 9) & 112));
                    } else {
                        dVar.mo5396C();
                    }
                }
            });
            float f6 = this.$sheetPeekHeight;
            int i6 = this.$floatingActionButtonPosition;
            int i7 = this.$$dirty;
            C1205k.m2335a(pVar2, qVar2, A, pVar3, A2, f6, i6, parcelableSnapshotMutableState, mVar2, dVar4, ((i7 >> 9) & 14) | 24960 | ((this.$$dirty2 >> 3) & 112) | ((i7 >> 6) & 7168) | (458752 & (this.$$dirty1 << 9)) | (i7 & 3670016));
            return;
        }
        dVar.mo5396C();
    }
}
