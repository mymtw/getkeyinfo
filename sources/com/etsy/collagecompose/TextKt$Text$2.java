package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class TextKt$Text$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1952g $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ C1957k $fontStyle;
    public final /* synthetic */ C1959m $fontWeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C2021q, C19394m> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C2023s $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ C2029d $textAlign;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextKt$Text$2(String str, C1436d dVar, long j, long j2, C1957k kVar, C1959m mVar, C1952g gVar, C2029d dVar2, int i, boolean z, int i2, C19857l<? super C2021q, C19394m> lVar, C2023s sVar, int i3, int i4, int i5) {
        super(2);
        this.$text = str;
        this.$modifier = dVar;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = kVar;
        this.$fontWeight = mVar;
        this.$fontFamily = gVar;
        this.$textAlign = dVar2;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$onTextLayout = lVar;
        this.$style = sVar;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        String str = this.$text;
        String str2 = str;
        TextKt.m19958a(str2, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$textAlign, this.$overflow, this.$softWrap, this.$maxLines, this.$onTextLayout, this.$style, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
