package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class IconKt$Icon$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ Painter $painter;
    public final /* synthetic */ long $tint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$1(Painter painter, String str, C1436d dVar, long j, int i, int i2) {
        super(2);
        this.$painter = painter;
        this.$contentDescription = str;
        this.$modifier = dVar;
        this.$tint = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        IconKt.m2185a(this.$painter, this.$contentDescription, this.$modifier, this.$tint, dVar, this.$$changed | 1, this.$$default);
    }
}
