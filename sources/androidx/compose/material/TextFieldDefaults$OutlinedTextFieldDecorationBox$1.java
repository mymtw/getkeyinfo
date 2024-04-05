package androidx.compose.material;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$1(boolean z, boolean z2, C0639i iVar, C1166a2 a2Var, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = iVar;
        this.$colors = a2Var;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f2324a;
            boolean z = this.$enabled;
            boolean z2 = this.$isError;
            C0639i iVar = this.$interactionSource;
            C1166a2 a2Var = this.$colors;
            int i2 = this.$$dirty;
            textFieldDefaults.mo5164a(z, z2, iVar, a2Var, (C1530k0) null, 0.0f, 0.0f, dVar, 12582912 | ((i2 >> 6) & 14) | ((i2 >> 15) & 112) | ((i2 >> 9) & 896) | ((this.$$dirty1 << 6) & 7168), 112);
            return;
        }
        dVar.mo5396C();
    }
}
