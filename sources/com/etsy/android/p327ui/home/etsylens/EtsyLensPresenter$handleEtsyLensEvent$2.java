package com.etsy.android.p327ui.home.etsylens;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.util.C8886e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter$handleEtsyLensEvent$2 */
final class EtsyLensPresenter$handleEtsyLensEvent$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public static final EtsyLensPresenter$handleEtsyLensEvent$2 INSTANCE = new EtsyLensPresenter$handleEtsyLensEvent$2();

    public EtsyLensPresenter$handleEtsyLensEvent$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        RuntimeException runtimeException = new RuntimeException("Received error from " + C19386q.m32807a(C8886e.class) + ": " + th);
        if (C0326j.m869n(BuildTarget.Companion)) {
            throw runtimeException;
        }
    }
}
