package com.etsy.android.p327ui.home.etsylens;

import android.view.View;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$EtsyLensOnboardingPromptComposable$3 */
public final class C9965x883f9e2a extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19846a<C19394m> $onAltButtonClicked;
    public final /* synthetic */ C19846a<C19394m> $onBackgroundClicked;
    public final /* synthetic */ C19846a<C19394m> $onCameraButtonClicked;
    public final /* synthetic */ C19846a<C19394m> $onMainButtonClicked;
    public final /* synthetic */ View $target;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9965x883f9e2a(View view, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19846a<C19394m> aVar3, C19846a<C19394m> aVar4, int i) {
        super(2);
        this.$target = view;
        this.$onMainButtonClicked = aVar;
        this.$onAltButtonClicked = aVar2;
        this.$onCameraButtonClicked = aVar3;
        this.$onBackgroundClicked = aVar4;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        EtsyLensOnboardingPromptComposableKt.m18160a(this.$target, this.$onMainButtonClicked, this.$onAltButtonClicked, this.$onCameraButtonClicked, this.$onBackgroundClicked, dVar, this.$$changed | 1);
    }
}
