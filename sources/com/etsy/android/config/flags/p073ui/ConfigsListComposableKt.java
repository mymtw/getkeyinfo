package com.etsy.android.config.flags.p073ui;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt */
public final class ConfigsListComposableKt {
    /* renamed from: a */
    public static final void m12826a(List<? extends C6403c> list, C19857l<? super String, C19394m> lVar, C19861p<? super String, ? super String, C19394m> pVar, C1302d dVar, int i) {
        List<? extends C6403c> list2 = list;
        C19857l<? super String, C19394m> lVar2 = lVar;
        C19861p<? super String, ? super String, C19394m> pVar2 = pVar;
        int i2 = i;
        C19383o.m32797g(list2, "listItems");
        C19383o.m32797g(lVar2, "onClickSwitchConfig");
        C19383o.m32797g(pVar2, "onClickTextConfig");
        ComposerImpl h = dVar.mo5440h(2040367484);
        LazyDslKt.m1771a((C1436d) null, (LazyListState) null, (C0759v) null, false, (C0718d.C0729k) null, (C1428a.C1430b) null, (C0608f) null, false, new ConfigsListComposableKt$ConfigsList$1(list2, lVar2, i2, pVar2), h, 0, 255);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ConfigsListComposableKt$ConfigsList$2(list2, lVar2, pVar2, i2);
        }
    }
}
