package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $it;
    public final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(long j, C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        super(2);
        this.$trailingIconColor = j;
        this.$it = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            TextFieldImplKt.m2268b(this.$trailingIconColor, (C2023s) null, (Float) null, this.$it, dVar, 0, 6);
        } else {
            dVar.mo5396C();
        }
    }
}
