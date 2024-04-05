package com.etsy.android.config.flags.p073ui;

import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsList$2 */
public final class ConfigsListComposableKt$ConfigsList$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ List<C6403c> $listItems;
    public final /* synthetic */ C19857l<String, C19394m> $onClickSwitchConfig;
    public final /* synthetic */ C19861p<String, String, C19394m> $onClickTextConfig;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigsListComposableKt$ConfigsList$2(List<? extends C6403c> list, C19857l<? super String, C19394m> lVar, C19861p<? super String, ? super String, C19394m> pVar, int i) {
        super(2);
        this.$listItems = list;
        this.$onClickSwitchConfig = lVar;
        this.$onClickTextConfig = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ConfigsListComposableKt.m12826a(this.$listItems, this.$onClickSwitchConfig, this.$onClickTextConfig, dVar, this.$$changed | 1);
    }
}
