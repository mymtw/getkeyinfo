package com.etsy.android.p327ui.shop.tabs.overview;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import com.etsy.android.p327ui.shop.tabs.Tab;
import com.etsy.collagecompose.TextKt;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt$LoadedState$1$1$1$1$2 */
public final class LoadedStateKt$LoadedState$1$1$1$1$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ Tab $tab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadedStateKt$LoadedState$1$1$1$1$2(Tab tab) {
        super(2);
        this.$tab = tab;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            TextKt.m19958a(C15588c1.m25305S0(this.$tab.f24780a.getLabelResId(), dVar), (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 2, false, 1, (C19857l<? super C2021q, C19394m>) null, (C2023s) null, dVar, 100663296, 6, 6910);
            return;
        }
        dVar.mo5396C();
    }
}
