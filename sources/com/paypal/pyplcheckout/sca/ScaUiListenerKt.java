package com.paypal.pyplcheckout.sca;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.material.ripple.C1242h;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public final class ScaUiListenerKt {
    public static final void runOnUiThread(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "block");
        new Handler(Looper.getMainLooper()).post(new C1242h(aVar, 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-0  reason: not valid java name */
    public static final void m35422runOnUiThread$lambda0(C19846a aVar) {
        C19383o.m32797g(aVar, "$block");
        aVar.invoke();
    }
}
