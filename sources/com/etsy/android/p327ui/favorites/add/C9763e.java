package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.lib.models.apiv3.CollectionsUpdateResponse;
import com.etsy.android.p327ui.favorites.add.C9760d0;
import com.etsy.android.p327ui.favorites.add.C9775p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p287xp.C8335c;

/* renamed from: com.etsy.android.ui.favorites.add.e */
public final /* synthetic */ class C9763e implements C8335c {

    /* renamed from: b */
    public final /* synthetic */ AddToListPresenter f21598b;

    public /* synthetic */ C9763e(AddToListPresenter addToListPresenter) {
        this.f21598b = addToListPresenter;
    }

    public final Object apply(Object obj, Object obj2) {
        String str;
        AddToListPresenter addToListPresenter = this.f21598b;
        C9775p pVar = (C9775p) obj;
        C9760d0 d0Var = (C9760d0) obj2;
        C19383o.m32797g(addToListPresenter, "this$0");
        C19383o.m32797g(pVar, "favoriteUpdateState");
        C19383o.m32797g(d0Var, "updateCollectionResult");
        if (!(pVar instanceof C9775p.C9776a) || !(d0Var instanceof C9760d0.C9762b)) {
            return d0Var;
        }
        Set<? extends CheckableListingCollection> set = addToListPresenter.f21560j;
        C19383o.m32797g(set, "collections");
        ArrayList arrayList = new ArrayList();
        for (T next : set) {
            if (((CheckableListingCollection) next).isTypeFavorites()) {
                arrayList.add(next);
            }
        }
        if (C19543e0.m33306Y(arrayList)) {
            str = ((CheckableListingCollection) arrayList.get(0)).getKey();
            C19383o.m32796f(str, "favoriteList.get(0).key");
        } else {
            str = "";
        }
        C9760d0.C9762b bVar = (C9760d0.C9762b) d0Var;
        List<String> failedCollectionKeys = bVar.f21597a.getFailedCollectionKeys();
        ArrayList q1 = failedCollectionKeys != null ? C19327t.m32661q1(failedCollectionKeys) : null;
        if (q1 == null) {
            q1 = new ArrayList();
        }
        q1.add(str);
        return new C9760d0.C9762b(new CollectionsUpdateResponse(bVar.f21597a.getSocialInvitesFlag(), q1));
    }
}
