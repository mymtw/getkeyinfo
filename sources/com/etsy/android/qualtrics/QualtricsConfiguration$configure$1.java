package com.etsy.android.qualtrics;

import androidx.fragment.app.FragmentActivity;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class QualtricsConfiguration$configure$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ FragmentActivity $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QualtricsConfiguration$configure$1(FragmentActivity fragmentActivity) {
        super(1);
        this.$context = fragmentActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "url");
        FragmentActivity fragmentActivity = this.$context;
        C8949a aVar = new C8949a();
        C19383o.m32797g(fragmentActivity, "fragmentActivity");
        fragmentActivity.getLifecycle().mo10733a(new BOEQualtricsPromptDisplay$Companion$showPrompt$1(fragmentActivity, aVar, str));
    }
}
