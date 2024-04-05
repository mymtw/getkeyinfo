package androidx.compose.material;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextFieldImplKt$CommonDecorationBox$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $border;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $innerTextField;
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;
    public final /* synthetic */ TextFieldType $type;
    public final /* synthetic */ String $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$4(TextFieldType textFieldType, String str, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C2006x xVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, C19861p<? super C1302d, ? super Integer, C19394m> pVar5, boolean z, boolean z2, boolean z3, C0639i iVar, C0759v vVar, C1166a2 a2Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar6, int i, int i2, int i3) {
        super(2);
        this.$type = textFieldType;
        this.$value = str;
        this.$innerTextField = pVar;
        this.$visualTransformation = xVar;
        this.$label = pVar2;
        this.$placeholder = pVar3;
        this.$leadingIcon = pVar4;
        this.$trailingIcon = pVar5;
        this.$singleLine = z;
        this.$enabled = z2;
        this.$isError = z3;
        this.$interactionSource = iVar;
        this.$contentPadding = vVar;
        this.$colors = a2Var;
        this.$border = pVar6;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        TextFieldType textFieldType = this.$type;
        TextFieldType textFieldType2 = textFieldType;
        TextFieldImplKt.m2267a(textFieldType2, this.$value, this.$innerTextField, this.$visualTransformation, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$singleLine, this.$enabled, this.$isError, this.$interactionSource, this.$contentPadding, this.$colors, this.$border, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
