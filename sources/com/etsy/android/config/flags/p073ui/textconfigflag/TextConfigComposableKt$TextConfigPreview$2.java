package com.etsy.android.config.flags.p073ui.textconfigflag;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.collagecompose.ThemeKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.textconfigflag.TextConfigComposableKt$TextConfigPreview$2 */
final class TextConfigComposableKt$TextConfigPreview$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $flagValue;
    public final /* synthetic */ String $statusText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextConfigComposableKt$TextConfigPreview$2(String str, String str2, int i, int i2) {
        super(2);
        this.$flagValue = str;
        this.$statusText = str2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        String str = this.$flagValue;
        String str2 = this.$statusText;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        ComposerImpl h = dVar.mo5440h(-1538173698);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(str) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        int i6 = i4 & 2;
        if (i6 != 0) {
            i2 |= 48;
        } else if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(str2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            if (i5 != 0) {
                str = "collage_small_lots_of_text_wow_lots";
            }
            if (i6 != 0) {
                str2 = "Clean up";
            }
            ThemeKt.m19959a(false, C18263b.m30805A(h, -517136830, new TextConfigComposableKt$TextConfigPreview$1(str, str2, i2)), h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new TextConfigComposableKt$TextConfigPreview$2(str, str2, i3, i4);
        }
    }
}
