package com.etsy.android.config.flags;

import android.support.p013v4.media.session.C0087d;
import com.etsy.android.config.flags.events.C6350c;
import com.etsy.android.config.flags.events.C6368o;
import java.util.Locale;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$2$1$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ C19857l<C6350c, C19394m> $dispatch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$2$1$1(C19857l<? super C6350c, C19394m> lVar) {
        super(1);
        this.$dispatch = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "newText");
        C19857l<C6350c, C19394m> lVar = this.$dispatch;
        Locale locale = Locale.ROOT;
        lVar.invoke(new C6368o(C0087d.m237g(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)")));
    }
}
