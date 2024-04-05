package com.etsy.android.p327ui.home.etsylens;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.collagecompose.ThemeKt;
import kotlin.C19394m;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.etsylens.CameraOrFileBottomSheetComposableKt */
public final class CameraOrFileBottomSheetComposableKt {
    /* renamed from: a */
    public static final void m18159a(C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C1302d dVar, int i, int i2) {
        int i3;
        ComposerImpl h = dVar.mo5440h(-1273859135);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.mo5408I(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= h.mo5408I(aVar2) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !h.mo5442i()) {
            if (i4 != 0) {
                aVar = C9951xcc5e7ac.INSTANCE;
            }
            if (i5 != 0) {
                aVar2 = C9952xcc5e7ad.INSTANCE;
            }
            ThemeKt.m19959a(false, C18263b.m30805A(h, 1495522557, new C9953xcc5e7ae(aVar, i3, aVar2)), h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new C9954xcc5e7af(aVar, aVar2, i, i2);
        }
    }
}
