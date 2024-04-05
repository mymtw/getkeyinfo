package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.window.C2089b;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class DialogKt$Dialog$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19846a<C19394m> $confirmButtonOnClick;
    public final /* synthetic */ String $confirmButtonText;
    public final /* synthetic */ C19846a<C19394m> $dismissButtonOnClick;
    public final /* synthetic */ String $dismissButtonText;
    public final /* synthetic */ String $message;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2089b $properties;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogKt$Dialog$2(C19846a<C19394m> aVar, C1436d dVar, String str, String str2, String str3, C19846a<C19394m> aVar2, String str4, C19846a<C19394m> aVar3, C2089b bVar, int i, int i2) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$modifier = dVar;
        this.$title = str;
        this.$message = str2;
        this.$confirmButtonText = str3;
        this.$confirmButtonOnClick = aVar2;
        this.$dismissButtonText = str4;
        this.$dismissButtonOnClick = aVar3;
        this.$properties = bVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        DialogKt.m19950a(this.$onDismissRequest, this.$modifier, this.$title, this.$message, this.$confirmButtonText, this.$confirmButtonOnClick, this.$dismissButtonText, this.$dismissButtonOnClick, this.$properties, dVar, this.$$changed | 1, this.$$default);
    }
}
