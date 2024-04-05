package com.etsy.collagecompose;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

final class DialogKt$DialogsPreview$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $preOpenDialog;
    public final /* synthetic */ boolean $preShowConfirmButton;
    public final /* synthetic */ boolean $preShowDismissButton;
    public final /* synthetic */ boolean $preUseLongText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogKt$DialogsPreview$2(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        super(2);
        this.$preOpenDialog = z;
        this.$preShowConfirmButton = z2;
        this.$preShowDismissButton = z3;
        this.$preUseLongText = z4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        boolean z = this.$preOpenDialog;
        boolean z2 = this.$preShowConfirmButton;
        boolean z3 = this.$preShowDismissButton;
        boolean z4 = this.$preUseLongText;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        ComposerImpl h = dVar.mo5440h(-509948892);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5427a(z) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        int i6 = i4 & 2;
        if (i6 != 0) {
            i2 |= 48;
        } else if ((i3 & 112) == 0) {
            i2 |= h.mo5427a(z2) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i2 |= 384;
        } else if ((i3 & 896) == 0) {
            i2 |= h.mo5427a(z3) ? 256 : 128;
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i2 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i2 |= h.mo5427a(z4) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            if (i5 != 0) {
                z = false;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (i7 != 0) {
                z3 = false;
            }
            if (i8 != 0) {
                z4 = false;
            }
            ThemeKt.m19959a(false, C18263b.m30805A(h, 1475288928, new DialogKt$DialogsPreview$1(z, z2, z3, z4)), h, 48, 1);
        } else {
            h.mo5396C();
        }
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new DialogKt$DialogsPreview$2(z5, z6, z7, z8, i3, i4);
        }
    }
}
