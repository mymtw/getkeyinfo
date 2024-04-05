package androidx.compose.foundation.text;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class BasicTextKt$BasicText$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C2021q, C19394m> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C2023s $style;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$3(String str, C1436d dVar, C2023s sVar, C19857l<? super C2021q, C19394m> lVar, int i, boolean z, int i2, int i3, int i4) {
        super(2);
        this.$text = str;
        this.$modifier = dVar;
        this.$style = sVar;
        this.$onTextLayout = lVar;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        BasicTextKt.m1954b(this.$text, this.$modifier, this.$style, this.$onTextLayout, this.$overflow, this.$softWrap, this.$maxLines, dVar, this.$$changed | 1, this.$$default);
    }
}
