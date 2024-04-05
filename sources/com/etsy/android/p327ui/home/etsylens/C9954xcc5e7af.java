package com.etsy.android.p327ui.home.etsylens;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.CameraOrFileBottomSheetComposableKt$CameraOrFileBottomSheetComposable$4 */
public final class C9954xcc5e7af extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19846a<C19394m> $onSelectFileClicked;
    public final /* synthetic */ C19846a<C19394m> $onTakePictureClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9954xcc5e7af(C19846a<C19394m> aVar, C19846a<C19394m> aVar2, int i, int i2) {
        super(2);
        this.$onTakePictureClicked = aVar;
        this.$onSelectFileClicked = aVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CameraOrFileBottomSheetComposableKt.m18159a(this.$onTakePictureClicked, this.$onSelectFileClicked, dVar, this.$$changed | 1, this.$$default);
    }
}
