package com.etsy.collagecompose;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SwitchKt$TextSwitch$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ String $description;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onClick;
    public final /* synthetic */ boolean $smallText;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$TextSwitch$4(String str, String str2, boolean z, C19857l<? super Boolean, C19394m> lVar, boolean z2, int i, int i2) {
        super(2);
        this.$title = str;
        this.$description = str2;
        this.$checked = z;
        this.$onClick = lVar;
        this.$smallText = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SwitchKt.m19957b(this.$title, this.$description, this.$checked, this.$onClick, this.$smallText, dVar, this.$$changed | 1, this.$$default);
    }
}
