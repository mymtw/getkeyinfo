package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class DrawerKt$ModalDrawer$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ C1530k0 $drawerShape;
    public final /* synthetic */ C1206k0 $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$2(C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, C1436d dVar, C1206k0 k0Var, boolean z, C1530k0 k0Var2, float f, long j, long j2, long j3, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$drawerContent = qVar;
        this.$modifier = dVar;
        this.$drawerState = k0Var;
        this.$gesturesEnabled = z;
        this.$drawerShape = k0Var2;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$scrimColor = j3;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        DrawerKt.m2178a(this.$drawerContent, this.$modifier, this.$drawerState, this.$gesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$scrimColor, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
