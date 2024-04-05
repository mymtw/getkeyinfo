package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4 */
public final class VectorComposeKt$Group$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ List<C1556d> $clipPathData;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ String $name;
    public final /* synthetic */ float $pivotX;
    public final /* synthetic */ float $pivotY;
    public final /* synthetic */ float $rotation;
    public final /* synthetic */ float $scaleX;
    public final /* synthetic */ float $scaleY;
    public final /* synthetic */ float $translationX;
    public final /* synthetic */ float $translationY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorComposeKt$Group$4(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends C1556d> list, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$name = str;
        this.$rotation = f;
        this.$pivotX = f2;
        this.$pivotY = f3;
        this.$scaleX = f4;
        this.$scaleY = f5;
        this.$translationX = f6;
        this.$translationY = f7;
        this.$clipPathData = list;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        VectorComposeKt.m3385a(this.$name, this.$rotation, this.$pivotX, this.$pivotY, this.$scaleX, this.$scaleY, this.$translationX, this.$translationY, this.$clipPathData, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
