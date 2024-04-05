package androidx.compose.foundation;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.layout.C1670c;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ImageKt$Image$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1428a $alignment;
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ C1546t $colorFilter;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ C1670c $contentScale;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ Painter $painter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$3(Painter painter, String str, C1436d dVar, C1428a aVar, C1670c cVar, float f, C1546t tVar, int i, int i2) {
        super(2);
        this.$painter = painter;
        this.$contentDescription = str;
        this.$modifier = dVar;
        this.$alignment = aVar;
        this.$contentScale = cVar;
        this.$alpha = f;
        this.$colorFilter = tVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ImageKt.m1308a(this.$painter, this.$contentDescription, this.$modifier, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter, dVar, this.$$changed | 1, this.$$default);
    }
}
