package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.layout.C1670c;
import androidx.compose.runtime.C1302d;
import com.etsy.android.p327ui.shop.tabs.Tab;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt$LoadedState$1$1$1$1$3 */
public final class LoadedStateKt$LoadedState$1$1$1$1$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ Tab $tab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadedStateKt$LoadedState$1$1$1$1$3(Tab tab) {
        super(2);
        this.$tab = tab;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            ImageKt.m1308a(C19388s.m32878p0(this.$tab.f24780a.getIconResId(), dVar), "", (C1436d) null, (C1428a) null, (C1670c) null, 0.0f, (C1546t) null, dVar, 56, 124);
        } else {
            dVar.mo5396C();
        }
    }
}
