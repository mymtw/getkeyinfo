package com.etsy.android.uikit.webview;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.util.C8886e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class EtsyChromeClient$onShowFileChooser$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public static final EtsyChromeClient$onShowFileChooser$1 INSTANCE = new EtsyChromeClient$onShowFileChooser$1();

    public EtsyChromeClient$onShowFileChooser$1() {
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
