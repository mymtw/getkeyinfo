package com.etsy.android.p327ui.home.tabs;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.p327ui.home.home.HomeFragment;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.view.C11952g;
import java.util.List;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.home.tabs.b */
public final class C10052b extends C11952g {

    /* renamed from: k */
    public List<? extends HomeTab> f22149k;

    /* renamed from: l */
    public final C8707d f22150l;

    /* renamed from: m */
    public final C13265p f22151m;

    /* renamed from: n */
    public boolean f22152n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10052b(FragmentManager fragmentManager, List list, C8707d dVar, C13265p pVar, String str) {
        super(str, fragmentManager);
        C19383o.m32797g(list, "tabData");
        C19383o.m32797g(pVar, "session");
        this.f22149k = list;
        this.f22150l = dVar;
        this.f22151m = pVar;
        this.f22152n = pVar.mo45960e();
    }

    /* renamed from: j */
    public final int mo20184j() {
        return this.f22149k.size();
    }

    /* renamed from: k */
    public final int mo20185k(Object obj) {
        C19383o.m32797g(obj, ResponseConstants.OBJECT);
        if (this.f22151m.mo45960e() == this.f22152n) {
            return -1;
        }
        this.f22152n = this.f22151m.mo45960e();
        return -2;
    }

    /* renamed from: l */
    public final CharSequence mo20186l(int i) {
        return ((HomeTab) this.f22149k.get(i)).getTitle();
    }

    /* renamed from: v */
    public final long mo10632v(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(C19388s.m32863g0((HomeTab) this.f22149k.get(i)));
        if (this.f22151m.mo45960e()) {
            sb.append(this.f22151m.mo45958c().toString());
        }
        return (long) sb.toString().hashCode();
    }

    /* renamed from: w */
    public final Fragment mo31711w(int i) {
        HomeFragment homeFragment = new HomeFragment();
        if (i == 0) {
            homeFragment.setTimeToFirstContent(this.f22150l);
        }
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        int b = TransactionDataRepository.C11867a.m19552a().mo38343b(this.f22149k.get(i));
        Bundle bundle = new Bundle();
        bundle.putString("TRACKING_NAME", HomePagerFragment.TRACKING_PAGE_VIEW_PREFIX);
        bundle.putString(HomeFragment.API_URL, ((HomeTab) this.f22149k.get(i)).getApiUrl());
        bundle.putInt("transaction-data", b);
        homeFragment.setArguments(bundle);
        return homeFragment;
    }
}
