package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class TextFieldDefaults$indicatorLine$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ float $focusedIndicatorLineThickness;
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ float $unfocusedIndicatorLineThickness;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLine$2(boolean z, boolean z2, C0639i iVar, C1166a2 a2Var, float f, float f2) {
        super(3);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = iVar;
        this.$colors = a2Var;
        this.$focusedIndicatorLineThickness = f;
        this.$unfocusedIndicatorLineThickness = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1398930845);
        C1338j0 u = C15588c1.m25349u(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$focusedIndicatorLineThickness, this.$unfocusedIndicatorLineThickness, dVar2, 0);
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        C0556g gVar = (C0556g) u.getValue();
        float f = TextFieldKt.f2334a;
        C19383o.m32797g(gVar, "indicatorBorder");
        C1436d c = DrawModifierKt.m3072c(aVar, new TextFieldKt$drawIndicatorLine$1(gVar.f1304a, gVar));
        dVar2.mo5406H();
        return c;
    }
}
