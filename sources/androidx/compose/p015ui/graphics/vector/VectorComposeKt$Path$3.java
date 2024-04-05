package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3 */
public final class VectorComposeKt$Path$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1533m $fill;
    public final /* synthetic */ float $fillAlpha;
    public final /* synthetic */ String $name;
    public final /* synthetic */ List<C1556d> $pathData;
    public final /* synthetic */ int $pathFillType;
    public final /* synthetic */ C1533m $stroke;
    public final /* synthetic */ float $strokeAlpha;
    public final /* synthetic */ int $strokeLineCap;
    public final /* synthetic */ int $strokeLineJoin;
    public final /* synthetic */ float $strokeLineMiter;
    public final /* synthetic */ float $strokeLineWidth;
    public final /* synthetic */ float $trimPathEnd;
    public final /* synthetic */ float $trimPathOffset;
    public final /* synthetic */ float $trimPathStart;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorComposeKt$Path$3(List<? extends C1556d> list, int i, String str, C1533m mVar, float f, C1533m mVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, int i5, int i6) {
        super(2);
        this.$pathData = list;
        this.$pathFillType = i;
        this.$name = str;
        this.$fill = mVar;
        this.$fillAlpha = f;
        this.$stroke = mVar2;
        this.$strokeAlpha = f2;
        this.$strokeLineWidth = f3;
        this.$strokeLineCap = i2;
        this.$strokeLineJoin = i3;
        this.$strokeLineMiter = f4;
        this.$trimPathStart = f5;
        this.$trimPathEnd = f6;
        this.$trimPathOffset = f7;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        List<C1556d> list = this.$pathData;
        List<C1556d> list2 = list;
        VectorComposeKt.m3386b(list2, this.$pathFillType, this.$name, this.$fill, this.$fillAlpha, this.$stroke, this.$strokeAlpha, this.$strokeLineWidth, this.$strokeLineCap, this.$strokeLineJoin, this.$strokeLineMiter, this.$trimPathStart, this.$trimPathEnd, this.$trimPathOffset, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
