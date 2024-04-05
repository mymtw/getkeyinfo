package com.etsy.android.p327ui.favorites;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.p327ui.user.inappnotifications.C11541a0;
import com.etsy.android.p327ui.user.inappnotifications.InAppNotificationsFragment;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.view.C11952g;
import java.util.ArrayList;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.etsy.android.ui.favorites.r */
public final class C9866r extends C11952g {

    /* renamed from: k */
    public final C11541a0 f21775k;

    /* renamed from: l */
    public final ArrayList<HomeTab> f21776l;

    /* renamed from: m */
    public final C8707d f21777m;

    /* renamed from: n */
    public final int f21778n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9866r(FragmentManager fragmentManager, C11541a0 a0Var, ArrayList<HomeTab> arrayList, C8707d dVar, int i, String str) {
        super(str, fragmentManager);
        C19383o.m32797g(a0Var, "updatesNativeEligibility");
        C19383o.m32797g(arrayList, "tabData");
        this.f21775k = a0Var;
        this.f21776l = arrayList;
        this.f21777m = dVar;
        this.f21778n = i;
    }

    /* renamed from: j */
    public final int mo20184j() {
        return this.f21776l.size();
    }

    /* renamed from: l */
    public final CharSequence mo20186l(int i) {
        return this.f21776l.get(i).getTitle();
    }

    /* renamed from: w */
    public final Fragment mo31711w(int i) {
        Fragment inAppNotificationsFragment = this.f21775k.mo37551a() && i < this.f21776l.size() && C19383o.m32792b(this.f21776l.get(i).getDeepLinkPath(), "updates") ? new InAppNotificationsFragment() : new FavoritesTabFragment();
        if (inAppNotificationsFragment instanceof FavoritesTabFragment) {
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            TransactionDataRepository a = TransactionDataRepository.C11867a.m19552a();
            HomeTab homeTab = this.f21776l.get(i);
            C19383o.m32796f(homeTab, "tabData[position]");
            int b = a.mo38343b(homeTab);
            Bundle bundle = new Bundle();
            bundle.putInt("transaction-data", b);
            StringBuilder h = C0072d.m201h(FavoritesTabsContainerFragment.TRACKING_PAGE_IN_VIEW_PREFIX);
            HomeTab homeTab2 = this.f21776l.get(i);
            C19383o.m32796f(homeTab2, "tabData[position]");
            h.append(C19388s.m32863g0(homeTab2));
            bundle.putString("TRACKING_NAME", h.toString());
            FavoritesTabFragment favoritesTabFragment = (FavoritesTabFragment) inAppNotificationsFragment;
            favoritesTabFragment.setArguments(bundle);
            if (i == this.f21778n) {
                favoritesTabFragment.setTimeToFirstContent(this.f21777m);
            }
        }
        return inAppNotificationsFragment;
    }
}
