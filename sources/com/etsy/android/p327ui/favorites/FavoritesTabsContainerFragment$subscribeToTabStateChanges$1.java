package com.etsy.android.p327ui.favorites;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabsContainerFragment$subscribeToTabStateChanges$1 */
public /* synthetic */ class FavoritesTabsContainerFragment$subscribeToTabStateChanges$1 extends FunctionReferenceImpl implements C19857l<C9876s, C19394m> {
    public FavoritesTabsContainerFragment$subscribeToTabStateChanges$1(Object obj) {
        super(1, obj, FavoritesTabsContainerFragment.class, "processSelectedTabState", "processSelectedTabState(Lcom/etsy/android/ui/favorites/FavoritesTabsSelectedTab;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9876s) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9876s sVar) {
        C19383o.m32797g(sVar, "p0");
        ((FavoritesTabsContainerFragment) this.receiver).processSelectedTabState(sVar);
    }
}
