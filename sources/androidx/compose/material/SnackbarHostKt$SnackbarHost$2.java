package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class SnackbarHostKt$SnackbarHost$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1254t1 $hostState;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19862q<C1251s1, C1302d, Integer, C19394m> $snackbar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$2(C1254t1 t1Var, C1436d dVar, C19862q<? super C1251s1, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$hostState = t1Var;
        this.$modifier = dVar;
        this.$snackbar = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SnackbarHostKt.m2226b(this.$hostState, this.$modifier, this.$snackbar, dVar, this.$$changed | 1, this.$$default);
    }
}
