package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class BasicTextFieldKt$BasicTextField$8 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1533m $cursorBrush;
    public final /* synthetic */ C19862q<C19861p<? super C1302d, ? super Integer, C19394m>, C1302d, Integer, C19394m> $decorationBox;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C0953g $keyboardActions;
    public final /* synthetic */ C0954h $keyboardOptions;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C2021q, C19394m> $onTextLayout;
    public final /* synthetic */ C19857l<TextFieldValue, C19394m> $onValueChange;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C2023s $textStyle;
    public final /* synthetic */ TextFieldValue $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$8(TextFieldValue textFieldValue, C19857l<? super TextFieldValue, C19394m> lVar, C1436d dVar, boolean z, boolean z2, C2023s sVar, C0954h hVar, C0953g gVar, boolean z3, int i, C2006x xVar, C19857l<? super C2021q, C19394m> lVar2, C0640j jVar, C1533m mVar, C19862q<? super C19861p<? super C1302d, ? super Integer, C19394m>, ? super C1302d, ? super Integer, C19394m> qVar, int i2, int i3, int i4) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = sVar;
        this.$keyboardOptions = hVar;
        this.$keyboardActions = gVar;
        this.$singleLine = z3;
        this.$maxLines = i;
        this.$visualTransformation = xVar;
        this.$onTextLayout = lVar2;
        this.$interactionSource = jVar;
        this.$cursorBrush = mVar;
        this.$decorationBox = qVar;
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
        TextFieldValue textFieldValue = this.$value;
        TextFieldValue textFieldValue2 = textFieldValue;
        BasicTextFieldKt.m1951a(textFieldValue2, this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$visualTransformation, this.$onTextLayout, this.$interactionSource, this.$cursorBrush, this.$decorationBox, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
