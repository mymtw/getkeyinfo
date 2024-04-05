package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class TabKt$Tab$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ long $selectedContentColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;
    public final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$3(boolean z, C19846a<C19394m> aVar, C1436d dVar, boolean z2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C0640j jVar, long j, long j2, int i, int i2) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$text = pVar;
        this.$icon = pVar2;
        this.$interactionSource = jVar;
        this.$selectedContentColor = j;
        this.$unselectedContentColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        boolean z = this.$selected;
        C19846a<C19394m> aVar = this.$onClick;
        C1436d dVar2 = this.$modifier;
        boolean z2 = this.$enabled;
        C19861p<C1302d, Integer, C19394m> pVar = this.$text;
        C19861p<C1302d, Integer, C19394m> pVar2 = this.$icon;
        C0640j jVar = this.$interactionSource;
        TabKt.m2255a(this.$$changed | 1, this.$$default, this.$selectedContentColor, this.$unselectedContentColor, jVar, dVar, dVar2, aVar, pVar, pVar2, z, z2);
    }
}
