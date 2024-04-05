package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class CheckboxKt$Checkbox$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ C12152g $direction;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ String $helperText;
    public final /* synthetic */ String $metaText;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onClick;
    public final /* synthetic */ C12155h $size;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$2(String str, boolean z, C19857l<? super Boolean, C19394m> lVar, C1436d dVar, String str2, String str3, C12155h hVar, C12152g gVar, boolean z2, int i, int i2) {
        super(2);
        this.$text = str;
        this.$checked = z;
        this.$onClick = lVar;
        this.$modifier = dVar;
        this.$helperText = str2;
        this.$metaText = str3;
        this.$size = hVar;
        this.$direction = gVar;
        this.$enabled = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CheckboxKt.m19947a(this.$text, this.$checked, this.$onClick, this.$modifier, this.$helperText, this.$metaText, this.$size, this.$direction, this.$enabled, dVar, this.$$changed | 1, this.$$default);
    }
}
