package com.etsy.android.p327ui.favorites.add;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.favorites.add.C9760d0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19543e0;
import p145io.reactivex.subjects.PublishSubject;
import p287xp.C8339g;
import p400mf.C13074b;
import p400mf.C13079d;

/* renamed from: com.etsy.android.ui.favorites.add.n */
public final /* synthetic */ class C9773n implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f21614b;

    /* renamed from: c */
    public final /* synthetic */ Ref$IntRef f21615c;

    /* renamed from: d */
    public final /* synthetic */ FavoriteAndCollectionRepository f21616d;

    /* renamed from: e */
    public final /* synthetic */ C9758c0 f21617e;

    public /* synthetic */ C9773n(Ref$ObjectRef ref$ObjectRef, Ref$IntRef ref$IntRef, FavoriteAndCollectionRepository favoriteAndCollectionRepository, C9758c0 c0Var) {
        this.f21614b = ref$ObjectRef;
        this.f21615c = ref$IntRef;
        this.f21616d = favoriteAndCollectionRepository;
        this.f21617e = c0Var;
    }

    public final Object apply(Object obj) {
        Ref$ObjectRef ref$ObjectRef = this.f21614b;
        Ref$IntRef ref$IntRef = this.f21615c;
        FavoriteAndCollectionRepository favoriteAndCollectionRepository = this.f21616d;
        C9758c0 c0Var = this.f21617e;
        C9760d0 d0Var = (C9760d0) obj;
        C19383o.m32797g(ref$ObjectRef, "$mutableCollections");
        C19383o.m32797g(ref$IntRef, "$numCollections");
        C19383o.m32797g(favoriteAndCollectionRepository, "this$0");
        C19383o.m32797g(c0Var, "$spec");
        C19383o.m32797g(d0Var, "it");
        if (d0Var instanceof C9760d0.C9762b) {
            List<String> failedCollectionKeys = ((C9760d0.C9762b) d0Var).f21597a.getFailedCollectionKeys();
            if (C19543e0.m33306Y(failedCollectionKeys)) {
                for (String next : failedCollectionKeys) {
                    for (CheckableListingCollection checkableListingCollection : (Iterable) ref$ObjectRef.element) {
                        if (next.equals(checkableListingCollection.getKey())) {
                            checkableListingCollection.setIsChecked(!checkableListingCollection.getIsChecked());
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                Set<CheckableListingCollection> set = (Set) ref$ObjectRef.element;
                C19383o.m32797g(set, "allCollections");
                int i = 0;
                if (!set.isEmpty()) {
                    for (CheckableListingCollection isChecked : set) {
                        if (isChecked.getIsChecked() && (i = i + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                ref$IntRef.element = i;
                if (i > 0) {
                    long idAsLongDeprecated = c0Var.f21591a.getIdAsLongDeprecated();
                    ArrayList W = C0761x.m1699W((Set) ref$ObjectRef.element);
                    ListingLike listingLike = c0Var.f21592b;
                    PublishSubject<C13074b> publishSubject = C13079d.f28754a;
                    C19383o.m32797g(listingLike, ResponseConstants.LISTING);
                    C13079d.f28754a.onNext(new C13074b.C13075a(idAsLongDeprecated, true, W, listingLike));
                } else {
                    long idAsLongDeprecated2 = c0Var.f21591a.getIdAsLongDeprecated();
                    ListingLike listingLike2 = c0Var.f21592b;
                    PublishSubject<C13074b> publishSubject2 = C13079d.f28754a;
                    C19383o.m32797g(listingLike2, ResponseConstants.LISTING);
                    C13079d.f28754a.onNext(new C13074b.C13075a(idAsLongDeprecated2, false, (List<String>) null, listingLike2));
                }
            }
        } else {
            boolean z = d0Var instanceof C9760d0.C9761a;
        }
        return d0Var;
    }
}
