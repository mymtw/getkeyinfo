package androidx.compose.material;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
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
    public final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;
    public final /* synthetic */ String $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$2(TextFieldDefaults textFieldDefaults, String str, C19861p<? super C1302d, ? super Integer, C19394m> pVar, boolean z, boolean z2, C2006x xVar, C0639i iVar, boolean z3, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, C19861p<? super C1302d, ? super Integer, C19394m> pVar5, C1166a2 a2Var, C0759v vVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar6, int i, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$value = str;
        this.$innerTextField = pVar;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = xVar;
        this.$interactionSource = iVar;
        this.$isError = z3;
        this.$label = pVar2;
        this.$placeholder = pVar3;
        this.$leadingIcon = pVar4;
        this.$trailingIcon = pVar5;
        this.$colors = a2Var;
        this.$contentPadding = vVar;
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
        TextFieldDefaults textFieldDefaults = this.$tmp0_rcvr;
        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
        textFieldDefaults2.mo5165b(this.$value, this.$innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$contentPadding, this.$border, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
