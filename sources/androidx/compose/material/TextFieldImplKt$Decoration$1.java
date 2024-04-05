package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextFieldImplKt$Decoration$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ Float $contentAlpha;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C2023s $typography;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$Decoration$1(long j, C2023s sVar, Float f, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$contentColor = j;
        this.$typography = sVar;
        this.$contentAlpha = f;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        TextFieldImplKt.m2268b(this.$contentColor, this.$typography, this.$contentAlpha, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
