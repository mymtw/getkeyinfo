package com.etsy.android.config.flags;

import com.etsy.android.config.flags.events.C6350c;
import com.etsy.android.config.flags.events.C6374t;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$4$1 extends Lambda implements C19861p<String, String, C19394m> {
    public final /* synthetic */ C19857l<C6350c, C19394m> $dispatch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$4$1(C19857l<? super C6350c, C19394m> lVar) {
        super(2);
        this.$dispatch = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, String str2) {
        C19383o.m32797g(str, "name");
        this.$dispatch.invoke(new C6374t(str, str2));
    }
}
