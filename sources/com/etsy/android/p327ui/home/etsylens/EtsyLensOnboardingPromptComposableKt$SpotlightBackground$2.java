package com.etsy.android.p327ui.home.etsylens;

import android.view.View;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$2 */
public final class EtsyLensOnboardingPromptComposableKt$SpotlightBackground$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ View $target;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensOnboardingPromptComposableKt$SpotlightBackground$2(View view, int i) {
        super(2);
        this.$target = view;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        EtsyLensOnboardingPromptComposableKt.m18161b(this.$target, dVar, this.$$changed | 1);
    }
}
