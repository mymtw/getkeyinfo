package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p174m0.C7280a;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends Lambda implements C19861p<C1696m0, C7280a, C1712w> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $body;
    public final /* synthetic */ C19862q<Integer, C1302d, Integer, C19394m> $bottomSheet;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ C1342k1<Float> $sheetOffset;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ C1211m $sheetState;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$a */
    public /* synthetic */ class C1057a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2180a;

        static {
            int[] iArr = new int[BottomSheetValue.values().length];
            iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
            iArr[BottomSheetValue.Expanded.ordinal()] = 2;
            f2180a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(C1342k1<Float> k1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i, float f, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C1211m mVar, C19862q<? super Integer, ? super C1302d, ? super Integer, C19394m> qVar, int i2, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar2) {
        super(2);
        this.$sheetOffset = k1Var;
        this.$topBar = pVar;
        this.$floatingActionButton = pVar2;
        this.$floatingActionButtonPosition = i;
        this.$sheetPeekHeight = f;
        this.$snackbarHost = pVar3;
        this.$sheetState = mVar;
        this.$bottomSheet = qVar;
        this.$$dirty = i2;
        this.$body = qVar2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34746invoke0kLqBqw((C1696m0) obj, ((C7280a) obj2).f16152a);
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final C1712w m34746invoke0kLqBqw(C1696m0 m0Var, long j) {
        int i;
        C1696m0 m0Var2 = m0Var;
        C19383o.m32797g(m0Var2, "$this$SubcomposeLayout");
        int h = C7280a.m13963h(j);
        int g = C7280a.m13962g(j);
        long a = C7280a.m13956a(j, 0, 0, 0, 0, 10);
        C1686i0 J = m0Var2.mo6700T(BottomSheetScaffoldLayoutSlot.Sheet, C18263b.m30807B(new C1059xb0851876(this.$bottomSheet, g, this.$$dirty), 520491296, true)).get(0).mo6665J(a);
        int l = C7279a.m13954l(this.$sheetOffset.getValue().floatValue());
        C19861p<C1302d, Integer, C19394m> pVar = this.$topBar;
        C1686i0 J2 = pVar != null ? m0Var2.mo6700T(BottomSheetScaffoldLayoutSlot.TopBar, C18263b.m30807B(new C1060x64c48d6(pVar, this.$$dirty), 1988456983, true)).get(0).mo6665J(a) : null;
        int i2 = J2 != null ? J2.f3723c : 0;
        C1686i0 i0Var = J2;
        final C1686i0 J3 = m0Var2.mo6700T(BottomSheetScaffoldLayoutSlot.Body, C18263b.m30807B(new C1058xcc9d0b25(this.$body, this.$sheetPeekHeight, this.$$dirty), 1466287989, true)).get(0).mo6665J(C7280a.m13956a(a, 0, 0, 0, g - i2, 7));
        C19861p<C1302d, Integer, C19394m> pVar2 = this.$floatingActionButton;
        C1686i0 J4 = pVar2 != null ? m0Var2.mo6700T(BottomSheetScaffoldLayoutSlot.Fab, pVar2).get(0).mo6665J(a) : null;
        int i3 = J4 != null ? J4.f3722b : 0;
        int i4 = J4 != null ? J4.f3723c : 0;
        final int V = this.$floatingActionButtonPosition == 0 ? (h - i3) / 2 : (h - i3) - m0Var2.mo3791V(C1205k.f2506a);
        int i5 = i4 / 2;
        final int V2 = m0Var2.mo3789B0(this.$sheetPeekHeight) < ((float) i5) ? (l - i4) - m0Var2.mo3791V(C1205k.f2506a) : l - i5;
        C1686i0 J5 = m0Var2.mo6700T(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost).get(0).mo6665J(a);
        final int i6 = (h - J5.f3722b) / 2;
        int i7 = C1057a.f2180a[((BottomSheetValue) this.$sheetState.mo5116d()).ordinal()];
        if (i7 == 1) {
            i = V2 - J5.f3723c;
        } else if (i7 == 2) {
            i = g - J5.f3723c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        final int i8 = i;
        final int i9 = i2;
        final C1686i0 i0Var2 = i0Var;
        final C1686i0 i0Var3 = J;
        final int i10 = l;
        final C1686i0 i0Var4 = J4;
        final C1686i0 i0Var5 = J5;
        return m0Var2.mo4387Z(h, g, C19294b0.m32559p0(), new C19857l<C1686i0.C1687a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1686i0.C1687a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1686i0.C1687a aVar) {
                C19383o.m32797g(aVar, "$this$layout");
                C1686i0.C1687a.m3583e(aVar, J3, 0, i9);
                C1686i0 i0Var = i0Var2;
                if (i0Var != null) {
                    C1686i0.C1687a.m3583e(aVar, i0Var, 0, 0);
                }
                C1686i0.C1687a.m3583e(aVar, i0Var3, 0, i10);
                C1686i0 i0Var2 = i0Var4;
                if (i0Var2 != null) {
                    C1686i0.C1687a.m3583e(aVar, i0Var2, V, V2);
                }
                C1686i0.C1687a.m3583e(aVar, i0Var5, i6, i8);
            }
        });
    }
}
