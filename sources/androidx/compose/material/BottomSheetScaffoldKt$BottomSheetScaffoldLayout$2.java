package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $body;
    public final /* synthetic */ C19862q<Integer, C1302d, Integer, C19394m> $bottomSheet;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ C1342k1<Float> $sheetOffset;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ C1211m $sheetState;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar, C19862q<? super Integer, ? super C1302d, ? super Integer, C19394m> qVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, float f, int i, C1342k1<Float> k1Var, C1211m mVar, int i2) {
        super(2);
        this.$topBar = pVar;
        this.$body = qVar;
        this.$bottomSheet = qVar2;
        this.$floatingActionButton = pVar2;
        this.$snackbarHost = pVar3;
        this.$sheetPeekHeight = f;
        this.$floatingActionButtonPosition = i;
        this.$sheetOffset = k1Var;
        this.$sheetState = mVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1205k.m2335a(this.$topBar, this.$body, this.$bottomSheet, this.$floatingActionButton, this.$snackbarHost, this.$sheetPeekHeight, this.$floatingActionButtonPosition, this.$sheetOffset, this.$sheetState, dVar, this.$$changed | 1);
    }
}
