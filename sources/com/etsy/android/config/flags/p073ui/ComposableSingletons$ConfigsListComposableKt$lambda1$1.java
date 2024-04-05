package com.etsy.android.config.flags.p073ui;

import androidx.compose.runtime.C1302d;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6421a;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.ComposableSingletons$ConfigsListComposableKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ConfigsListComposableKt$lambda1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public static final ComposableSingletons$ConfigsListComposableKt$lambda1$1 INSTANCE = new ComposableSingletons$ConfigsListComposableKt$lambda1$1();

    public ComposableSingletons$ConfigsListComposableKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            ConfigsListComposableKt.m12826a(C17782b.m29865e0(new C6417a("MyConfig1", (String) null, (String) null, false, (ConfigFlagStatus) null, (ConfigFlagOrigin) null, 118), new C6421a("MyConfig2", (String) null, (String) null, (String) null, (ConfigFlagStatus) null, (ConfigFlagOrigin) null, 126), new C6417a("MyConfig3", (String) null, (String) null, false, (ConfigFlagStatus) null, (ConfigFlagOrigin) null, 118)), C63881.INSTANCE, C63892.INSTANCE, dVar, 432);
            return;
        }
        dVar.mo5396C();
    }
}
