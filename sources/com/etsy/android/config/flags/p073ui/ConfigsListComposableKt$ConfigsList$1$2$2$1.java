package com.etsy.android.config.flags.p073ui;

import com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsList$1$2$2$1 */
public final class ConfigsListComposableKt$ConfigsList$1$2$2$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ C19861p<String, String, C19394m> $onClickTextConfig;
    public final /* synthetic */ C6417a $uiModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigsListComposableKt$ConfigsList$1$2$2$1(C19861p<? super String, ? super String, C19394m> pVar, C6417a aVar) {
        super(1);
        this.$onClickTextConfig = pVar;
        this.$uiModel = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        this.$onClickTextConfig.invoke(this.$uiModel.f14225a, String.valueOf(z));
    }
}
