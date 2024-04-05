package com.etsy.android.p327ui.favorites.add;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey;
import java.lang.ref.WeakReference;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p356ge.C12790b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListPresenter$handleCollectionCreatedSuccess$1 */
final class NameAListPresenter$handleCollectionCreatedSuccess$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ WeakReference<NameAListFragment> $weakFragmentReference;
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$handleCollectionCreatedSuccess$1(WeakReference<NameAListFragment> weakReference, NameAListPresenter nameAListPresenter) {
        super(1);
        this.$weakFragmentReference = weakReference;
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19383o.m32797g(view, "it");
        C12790b.m20430b(this.$weakFragmentReference.get(), new FavoritesTabKey(C12790b.m20432d(this.this$0.f21568a), (String) null, (String) null, 0, false, (Bundle) null, 54, (DefaultConstructorMarker) null));
    }
}
