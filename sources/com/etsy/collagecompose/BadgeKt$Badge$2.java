package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class BadgeKt$Badge$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Integer $iconRes;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ BadgeStyle $style;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$Badge$2(String str, BadgeStyle badgeStyle, C1436d dVar, Integer num, int i, int i2) {
        super(2);
        this.$text = str;
        this.$style = badgeStyle;
        this.$modifier = dVar;
        this.$iconRes = num;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        BadgeKt.m19938a(this.$text, this.$style, this.$modifier, this.$iconRes, dVar, this.$$changed | 1, this.$$default);
    }
}
