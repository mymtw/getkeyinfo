package androidx.compose.material;

import androidx.compose.animation.core.C0418c0;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class AndroidMenu_androidKt$DropdownMenu$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0418c0<Boolean> $expandedStates;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1338j0<C1540p0> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$1(C0418c0<Boolean> c0Var, C1338j0<C1540p0> j0Var, C1436d dVar, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, int i) {
        super(2);
        this.$expandedStates = c0Var;
        this.$transformOriginState = j0Var;
        this.$modifier = dVar;
        this.$content = qVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C0418c0<Boolean> c0Var = this.$expandedStates;
            C1338j0<C1540p0> j0Var = this.$transformOriginState;
            C1436d dVar2 = this.$modifier;
            C19862q<C0739i, C1302d, Integer, C19394m> qVar = this.$content;
            int i2 = this.$$dirty;
            MenuKt.m2191a(c0Var, j0Var, dVar2, qVar, dVar, 48 | (i2 & 896) | ((i2 >> 6) & 7168), 0);
            return;
        }
        dVar.mo5396C();
    }
}
