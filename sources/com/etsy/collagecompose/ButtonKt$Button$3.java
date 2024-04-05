package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class ButtonKt$Button$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Integer $iconRes;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $onLight;
    public final /* synthetic */ C12142d $size;
    public final /* synthetic */ C12145e $style;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonKt$Button$3(C12145e eVar, C19846a<C19394m> aVar, C1436d dVar, String str, String str2, C12142d dVar2, Integer num, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$style = eVar;
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$text = str;
        this.$contentDescription = str2;
        this.$size = dVar2;
        this.$iconRes = num;
        this.$enabled = z;
        this.$onLight = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ButtonKt.m19939a(this.$style, this.$onClick, this.$modifier, this.$text, this.$contentDescription, this.$size, this.$iconRes, this.$enabled, this.$onLight, dVar, this.$$changed | 1, this.$$default);
    }
}
