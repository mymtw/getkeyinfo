package com.etsy.android.p327ui.home.etsylens;

import android.view.View;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter$showEtsyLensAlert$1$1 */
final class EtsyLensPresenter$showEtsyLensAlert$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C19846a<C19394m> $onDismiss;
    public final /* synthetic */ View $target;
    public final /* synthetic */ ComposeView $this_apply;
    public final /* synthetic */ EtsyLensPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensPresenter$showEtsyLensAlert$1$1(View view, EtsyLensPresenter etsyLensPresenter, ComposeView composeView, C19846a<C19394m> aVar) {
        super(2);
        this.$target = view;
        this.this$0 = etsyLensPresenter;
        this.$this_apply = composeView;
        this.$onDismiss = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            final View view = this.$target;
            final EtsyLensPresenter etsyLensPresenter = this.this$0;
            final ComposeView composeView = this.$this_apply;
            final C19846a<C19394m> aVar = this.$onDismiss;
            C99661 r1 = new C19846a<C19394m>() {
                public final void invoke() {
                    EtsyLensPresenter.m18162a(etsyLensPresenter, composeView, aVar);
                    view.callOnClick();
                }
            };
            final EtsyLensPresenter etsyLensPresenter2 = this.this$0;
            final ComposeView composeView2 = this.$this_apply;
            final C19846a<C19394m> aVar2 = this.$onDismiss;
            C99672 r2 = new C19846a<C19394m>() {
                public final void invoke() {
                    EtsyLensPresenter.m18162a(etsyLensPresenter2, composeView2, aVar2);
                }
            };
            final EtsyLensPresenter etsyLensPresenter3 = this.this$0;
            final ComposeView composeView3 = this.$this_apply;
            final C19846a<C19394m> aVar3 = this.$onDismiss;
            final View view2 = this.$target;
            C99683 r3 = new C19846a<C19394m>() {
                public final void invoke() {
                    EtsyLensPresenter.m18162a(etsyLensPresenter3, composeView3, aVar3);
                    view2.performClick();
                }
            };
            final EtsyLensPresenter etsyLensPresenter4 = this.this$0;
            final ComposeView composeView4 = this.$this_apply;
            final C19846a<C19394m> aVar4 = this.$onDismiss;
            EtsyLensOnboardingPromptComposableKt.m18160a(view, r1, r2, r3, new C19846a<C19394m>() {
                public final void invoke() {
                    EtsyLensPresenter.m18162a(etsyLensPresenter4, composeView4, aVar4);
                }
            }, dVar, 8);
            return;
        }
        dVar.mo5396C();
    }
}
