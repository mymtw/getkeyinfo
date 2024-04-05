package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class ScaffoldKt$ScaffoldLayout$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $bottomBar;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $fab;
    public final /* synthetic */ int $fabPosition;
    public final /* synthetic */ boolean $isFabDocked;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $snackbar;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$2(boolean z, int i, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, int i2) {
        super(2);
        this.$isFabDocked = z;
        this.$fabPosition = i;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$bottomBar = pVar4;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ScaffoldKt.m2209b(this.$isFabDocked, this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$bottomBar, dVar, this.$$changed | 1);
    }
}
