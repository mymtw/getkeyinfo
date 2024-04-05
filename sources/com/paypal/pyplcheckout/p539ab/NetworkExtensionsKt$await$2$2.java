package com.paypal.pyplcheckout.p539ab;

import kotlin.C19394m;
import okhttp3.C19944e;
import p753kq.C19857l;

/* renamed from: com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$2 */
public final class NetworkExtensionsKt$await$2$2 implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19944e $this_await;

    public NetworkExtensionsKt$await$2$2(C19944e eVar) {
        this.$this_await = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public void invoke(Throwable th) {
        this.$this_await.cancel();
    }
}
