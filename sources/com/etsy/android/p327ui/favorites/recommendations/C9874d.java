package com.etsy.android.p327ui.favorites.recommendations;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.core.CollectionFragment;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.view.C11952g;
import java.util.List;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.recommendations.d */
public final class C9874d extends C11952g {

    /* renamed from: k */
    public final List<C9873c> f21792k;

    /* renamed from: l */
    public Collection f21793l;

    /* renamed from: m */
    public String f21794m;

    /* renamed from: n */
    public String f21795n;

    /* renamed from: o */
    public int f21796o;

    /* renamed from: p */
    public String f21797p;

    /* renamed from: q */
    public RecyclerView.C3108s f21798q;

    /* renamed from: r */
    public String f21799r;

    /* renamed from: s */
    public String f21800s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9874d(String str, FragmentManager fragmentManager, List<C9873c> list, Collection collection, String str2, String str3, int i, String str4, RecyclerView.C3108s sVar, String str5, String str6) {
        super(str, fragmentManager);
        C19383o.m32797g(list, "tabData");
        this.f21792k = list;
        this.f21793l = collection;
        this.f21794m = str2;
        this.f21795n = str3;
        this.f21796o = i;
        this.f21797p = str4;
        this.f21798q = sVar;
        this.f21799r = str5;
        this.f21800s = str6;
    }

    /* renamed from: j */
    public final int mo20184j() {
        return this.f21792k.size();
    }

    /* renamed from: l */
    public final CharSequence mo20186l(int i) {
        return this.f21792k.get(i).f21789a;
    }

    /* renamed from: w */
    public final Fragment mo31711w(int i) {
        if (i == 0) {
            return mo32974x();
        }
        if (i != 1) {
            return mo32974x();
        }
        ListRecommendationsFragment listRecommendationsFragment = new ListRecommendationsFragment();
        Bundle bundle = new Bundle();
        Collection collection = this.f21793l;
        if (collection == null) {
            bundle.putSerializable(ListRecommendationsFragment.COLLECTION_KEY, this.f21794m);
            bundle.putSerializable(ResponseConstants.COLLECTION_ID, this.f21797p);
            bundle.putSerializable(ResponseConstants.COUNT, Integer.valueOf(this.f21796o));
            bundle.putSerializable("slug", this.f21795n);
        } else {
            bundle.putSerializable(Collection.TYPE_COLLECTION, collection);
        }
        bundle.putSerializable("deepLink", this.f21800s);
        listRecommendationsFragment.setArguments(bundle);
        listRecommendationsFragment.addOnScrollListener(this.f21798q);
        return listRecommendationsFragment;
    }

    /* renamed from: x */
    public final CollectionFragment mo32974x() {
        CollectionFragment collectionFragment = new CollectionFragment();
        Bundle bundle = new Bundle();
        if (this.f21793l == null) {
            bundle.putString(ListRecommendationsFragment.COLLECTION_KEY, this.f21794m);
        } else {
            C11869a aVar = new C11869a();
            aVar.mo38349f(Collection.TYPE_COLLECTION, this.f21793l);
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            bundle.putInt("transaction-data", TransactionDataRepository.C11867a.m19552a().mo38343b(aVar));
        }
        bundle.putString("slug", this.f21795n);
        bundle.putString(ResponseConstants.USERNAME, this.f21799r);
        collectionFragment.setArguments(bundle);
        collectionFragment.addOnScrollListener(this.f21798q);
        collectionFragment.addUpdateCollectionListener(this.f21792k.get(0).f21791c);
        return collectionFragment;
    }
}
