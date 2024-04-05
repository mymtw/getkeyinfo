package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ScaffoldKt$Scaffold$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $bottomBar;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ boolean $drawerGesturesEnabled;
    public final /* synthetic */ long $drawerScrimColor;
    public final /* synthetic */ C1530k0 $drawerShape;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ boolean $isFloatingActionButtonDocked;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1216n1 $scaffoldState;
    public final /* synthetic */ C19862q<C1254t1, C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$2(C1436d dVar, C1216n1 n1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19862q<? super C1254t1, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, int i, boolean z, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar2, boolean z2, C1530k0 k0Var, float f, long j, long j2, long j3, long j4, long j5, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar3, int i2, int i3, int i4) {
        super(2);
        this.$modifier = dVar;
        this.$scaffoldState = n1Var;
        this.$topBar = pVar;
        this.$bottomBar = pVar2;
        this.$snackbarHost = qVar;
        this.$floatingActionButton = pVar3;
        this.$floatingActionButtonPosition = i;
        this.$isFloatingActionButtonDocked = z;
        this.$drawerContent = qVar2;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = k0Var;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$backgroundColor = j4;
        this.$contentColor = j5;
        this.$content = qVar3;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C1436d dVar3 = this.$modifier;
        C1436d dVar4 = dVar3;
        ScaffoldKt.m2208a(dVar4, this.$scaffoldState, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$isFloatingActionButtonDocked, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
