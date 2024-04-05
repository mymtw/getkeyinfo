package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class OneLine$ListItem$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;
    public final /* synthetic */ OneLine $tmp0_rcvr;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneLine$ListItem$2(OneLine oneLine, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = oneLine;
        this.$modifier = dVar;
        this.$icon = pVar;
        this.$text = pVar2;
        this.$trailing = pVar3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.mo4976a(this.$modifier, this.$icon, this.$text, this.$trailing, dVar, this.$$changed | 1, this.$$default);
    }
}
