package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $child;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ boolean $drawerGesturesEnabled;
    public final /* synthetic */ long $drawerScrimColor;
    public final /* synthetic */ C1530k0 $drawerShape;
    public final /* synthetic */ C1208l $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1208l lVar, boolean z, C1530k0 k0Var, float f, long j, long j2, long j3, int i) {
        super(2);
        this.$drawerContent = qVar;
        this.$child = pVar;
        this.$scaffoldState = lVar;
        this.$drawerGesturesEnabled = z;
        this.$drawerShape = k0Var;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$$dirty1 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) == 2 && dVar.mo5442i()) {
            dVar.mo5396C();
        } else if (this.$drawerContent == null) {
            dVar2.mo5465u(-249544858);
            this.$child.invoke(dVar2, 6);
            dVar.mo5406H();
        } else {
            dVar2.mo5465u(-249544821);
            C19862q<C0739i, C1302d, Integer, C19394m> qVar = this.$drawerContent;
            C1206k0 k0Var = this.$scaffoldState.f2514a;
            boolean z = this.$drawerGesturesEnabled;
            C1530k0 k0Var2 = this.$drawerShape;
            float f = this.$drawerElevation;
            long j = this.$drawerBackgroundColor;
            long j2 = this.$drawerContentColor;
            long j3 = this.$drawerScrimColor;
            C19861p<C1302d, Integer, C19394m> pVar = this.$child;
            int i2 = this.$$dirty1;
            DrawerKt.m2178a(qVar, (C1436d) null, k0Var, z, k0Var2, f, j, j2, j3, pVar, dVar, ((i2 >> 3) & 7168) | ((i2 >> 9) & 14) | 805306368 | ((i2 >> 3) & 57344) | ((i2 >> 3) & 458752) | ((i2 >> 3) & 3670016) | ((i2 >> 3) & 29360128) | ((i2 >> 3) & 234881024), 2);
            dVar.mo5406H();
        }
    }
}
