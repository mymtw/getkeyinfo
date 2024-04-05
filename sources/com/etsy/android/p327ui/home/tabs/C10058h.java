package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.p327ui.home.etsylens.EtsyLensPresenter;
import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.stylekit.views.CollageImageView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.tabs.h */
public final /* synthetic */ class C10058h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ HomePagerFragment f22158b;

    public /* synthetic */ C10058h(HomePagerFragment homePagerFragment) {
        this.f22158b = homePagerFragment;
    }

    public final void run() {
        CollageImageView collageImageView;
        HomePagerFragment homePagerFragment = this.f22158b;
        C19383o.m32797g(homePagerFragment, "this$0");
        C10866i access$getSearchViewHelper$p = homePagerFragment.searchViewHelper;
        if (access$getSearchViewHelper$p != null && (collageImageView = access$getSearchViewHelper$p.f24106j) != null) {
            EtsyLensPresenter access$getEtsyLensPresenter$p = homePagerFragment.etsyLensPresenter;
            if (access$getEtsyLensPresenter$p != null) {
                access$getEtsyLensPresenter$p.mo33155c(collageImageView, new HomePagerFragment$onViewCreated$7$1$1$1(homePagerFragment));
            }
            homePagerFragment.getViewModel().f22139y = false;
        }
    }
}
