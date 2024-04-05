package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextKt$ProvideTextStyle$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C2023s $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextKt$ProvideTextStyle$1(C2023s sVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$value = sVar;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        TextKt.m2282a(this.$value, this.$content, dVar, this.$$changed | 1);
    }
}
