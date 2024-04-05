package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.text.C0953g;
import androidx.compose.foundation.text.C0954h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class OutlinedTextFieldKt$OutlinedTextField$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C0953g $keyboardActions;
    public final /* synthetic */ C0954h $keyboardOptions;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<String, C19394m> $onValueChange;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C2023s $textStyle;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;
    public final /* synthetic */ String $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$3(String str, C19857l<? super String, C19394m> lVar, C1436d dVar, boolean z, boolean z2, C2023s sVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, boolean z3, C2006x xVar, C0954h hVar, C0953g gVar, boolean z4, int i, C0640j jVar, C1530k0 k0Var, C1166a2 a2Var, int i2, int i3, int i4) {
        super(2);
        this.$value = str;
        this.$onValueChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = sVar;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$isError = z3;
        this.$visualTransformation = xVar;
        this.$keyboardOptions = hVar;
        this.$keyboardActions = gVar;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$interactionSource = jVar;
        this.$shape = k0Var;
        this.$colors = a2Var;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        String str = this.$value;
        String str2 = str;
        OutlinedTextFieldKt.m2198a(str2, this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$isError, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$interactionSource, this.$shape, this.$colors, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
