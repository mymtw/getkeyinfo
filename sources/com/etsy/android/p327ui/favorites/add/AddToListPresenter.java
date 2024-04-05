package com.etsy.android.p327ui.favorites.add;

import androidx.compose.animation.C0388a;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionsChangeState;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.CollageAlert;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListPresenter */
public final class AddToListPresenter {

    /* renamed from: a */
    public final AddToListFragment f21551a;

    /* renamed from: b */
    public final C13461f f21552b;

    /* renamed from: c */
    public final C9766h f21553c;

    /* renamed from: d */
    public final FavoriteAndCollectionRepository f21554d;

    /* renamed from: e */
    public final C13265p f21555e;

    /* renamed from: f */
    public final C8703p f21556f;

    /* renamed from: g */
    public C9768i f21557g;

    /* renamed from: h */
    public AddToListAdapter f21558h;

    /* renamed from: i */
    public C7091a f21559i = new C7091a();

    /* renamed from: j */
    public Set<? extends CheckableListingCollection> f21560j = EmptySet.INSTANCE;

    /* renamed from: k */
    public ListingLike f21561k;

    /* renamed from: com.etsy.android.ui.favorites.add.AddToListPresenter$a */
    public /* synthetic */ class C9746a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21562a;

        static {
            int[] iArr = new int[CollectionUtil$ListingCollectionsChangeState.values().length];
            iArr[CollectionUtil$ListingCollectionsChangeState.ADDED_TO_COLLECTIONS.ordinal()] = 1;
            iArr[CollectionUtil$ListingCollectionsChangeState.REMOVED_FROM_COLLECTIONS.ordinal()] = 2;
            iArr[CollectionUtil$ListingCollectionsChangeState.REMOVED_AND_ADDED_TO_COLLECTIONS.ordinal()] = 3;
            iArr[CollectionUtil$ListingCollectionsChangeState.UNCHANGED.ordinal()] = 4;
            f21562a = iArr;
        }
    }

    public AddToListPresenter(AddToListFragment addToListFragment, C13461f fVar, C9766h hVar, FavoriteAndCollectionRepository favoriteAndCollectionRepository, C13265p pVar, C8703p pVar2) {
        C19383o.m32797g(addToListFragment, "fragment");
        C19383o.m32797g(pVar, "session");
        this.f21551a = addToListFragment;
        this.f21552b = fVar;
        this.f21553c = hVar;
        this.f21554d = favoriteAndCollectionRepository;
        this.f21555e = pVar;
        this.f21556f = pVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32709a() {
        /*
            r19 = this;
            r0 = r19
            com.etsy.android.lib.models.interfaces.ListingLike r1 = r0.f21561k
            r2 = 0
            java.lang.String r3 = "listing"
            if (r1 == 0) goto L_0x035a
            java.util.HashMap r4 = new java.util.HashMap
            r5 = 0
            r4.<init>(r5)
            java.util.Set<? extends com.etsy.android.lib.models.apiv3.CheckableListingCollection> r6 = r0.f21560j
            java.util.Iterator r6 = r6.iterator()
        L_0x0015:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0049
            java.lang.Object r7 = r6.next()
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r7 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r7
            boolean r8 = r7.getWasChanged()
            if (r8 == 0) goto L_0x0015
            boolean r8 = r7.getIncludesListing()
            java.lang.String r9 = "collection.key"
            if (r8 == 0) goto L_0x003c
            java.lang.String r7 = r7.getKey()
            kotlin.jvm.internal.C19383o.m32796f(r7, r9)
            com.etsy.android.ui.util.CollectionUtil$ListingCollectionAction r8 = com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionAction.REMOVE
            r4.put(r7, r8)
            goto L_0x0015
        L_0x003c:
            java.lang.String r7 = r7.getKey()
            kotlin.jvm.internal.C19383o.m32796f(r7, r9)
            com.etsy.android.ui.util.CollectionUtil$ListingCollectionAction r8 = com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionAction.ADD
            r4.put(r7, r8)
            goto L_0x0015
        L_0x0049:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.etsy.android.ui.util.CollectionUtil$ListingCollectionsChangeState r6 = r0.mo32710b(r6)
            boolean r7 = r4.isEmpty()
            r8 = 1
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0354
            java.util.Set<? extends com.etsy.android.lib.models.apiv3.CheckableListingCollection> r7 = r0.f21560j
            java.lang.String r9 = "collections"
            kotlin.jvm.internal.C19383o.m32797g(r7, r9)
            int r10 = r4.size()
            java.lang.String r11 = "favoriteList.get(0).key"
            java.lang.String r12 = ""
            if (r10 != r8) goto L_0x00a8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0074:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x008b
            java.lang.Object r13 = r7.next()
            r14 = r13
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r14 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r14
            boolean r14 = r14.isTypeFavorites()
            if (r14 == 0) goto L_0x0074
            r10.add(r13)
            goto L_0x0074
        L_0x008b:
            boolean r7 = kotlinx.coroutines.C19543e0.m33306Y(r10)
            if (r7 == 0) goto L_0x009f
            java.lang.Object r7 = r10.get(r5)
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r7 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r7
            java.lang.String r7 = r7.getKey()
            kotlin.jvm.internal.C19383o.m32796f(r7, r11)
            goto L_0x00a0
        L_0x009f:
            r7 = r12
        L_0x00a0:
            boolean r7 = r4.containsKey(r7)
            if (r7 == 0) goto L_0x00a8
            r7 = r8
            goto L_0x00a9
        L_0x00a8:
            r7 = r5
        L_0x00a9:
            java.lang.String r10 = "compositeDisposable"
            if (r7 == 0) goto L_0x00e4
            com.etsy.android.ui.favorites.add.f r2 = new com.etsy.android.ui.favorites.add.f
            r2.<init>(r0, r4, r1)
            io.reactivex.internal.operators.single.SingleCreate r1 = new io.reactivex.internal.operators.single.SingleCreate
            r1.<init>(r2)
            ua.f r2 = r0.f21552b
            r2.getClass()
            tp.r r2 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.single.SingleSubscribeOn r1 = r1.mo20660i(r2)
            ua.f r2 = r0.f21552b
            io.reactivex.internal.operators.single.SingleObserveOn r1 = androidx.compose.animation.C0391c.m1056b(r2, r1)
            com.etsy.android.b r2 = new com.etsy.android.b
            r3 = 6
            r2.<init>(r0, r3)
            com.etsy.android.c r3 = new com.etsy.android.c
            r4 = 5
            r3.<init>(r0, r4)
            io.reactivex.internal.observers.ConsumerSingleObserver r1 = r1.mo20658g(r2, r3)
            io.reactivex.disposables.a r2 = r0.f21559i
            kotlin.jvm.internal.C19383o.m32798h(r2, r10)
            r2.mo19403b(r1)
            goto L_0x0359
        L_0x00e4:
            com.etsy.android.ui.favorites.add.f r7 = new com.etsy.android.ui.favorites.add.f
            r7.<init>(r0, r4, r1)
            io.reactivex.internal.operators.single.SingleCreate r13 = new io.reactivex.internal.operators.single.SingleCreate
            r13.<init>(r7)
            tp.n r7 = r13.mo20661k()
            java.util.LinkedHashMap r4 = kotlin.collections.C19294b0.m32558A0(r4)
            java.util.Set<? extends com.etsy.android.lib.models.apiv3.CheckableListingCollection> r13 = r0.f21560j
            kotlin.jvm.internal.C19383o.m32797g(r13, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0104:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x011b
            java.lang.Object r14 = r13.next()
            r15 = r14
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r15 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r15
            boolean r15 = r15.isTypeFavorites()
            if (r15 == 0) goto L_0x0104
            r9.add(r14)
            goto L_0x0104
        L_0x011b:
            boolean r13 = kotlinx.coroutines.C19543e0.m33306Y(r9)
            if (r13 == 0) goto L_0x012e
            java.lang.Object r9 = r9.get(r5)
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r9 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r9
            java.lang.String r12 = r9.getKey()
            kotlin.jvm.internal.C19383o.m32796f(r12, r11)
        L_0x012e:
            r4.remove(r12)
            com.etsy.android.ui.favorites.add.c0 r9 = new com.etsy.android.ui.favorites.add.c0
            com.etsy.android.lib.models.datatypes.EtsyId r11 = r1.getListingId()
            java.lang.String r12 = "listing.listingId"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)
            r9.<init>(r11, r1, r4, r6)
            com.etsy.android.ui.favorites.add.FavoriteAndCollectionRepository r1 = r0.f21554d
            java.util.Set<? extends com.etsy.android.lib.models.apiv3.CheckableListingCollection> r4 = r0.f21560j
            r1.getClass()
            java.lang.String r6 = "allCollections"
            kotlin.jvm.internal.C19383o.m32797g(r4, r6)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            java.util.Set r4 = kotlin.collections.C19327t.m32663s1(r4)
            r11.element = r4
            java.util.Iterator r12 = r4.iterator()
        L_0x015a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x016e
            java.lang.Object r13 = r12.next()
            r14 = r13
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r14 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r14
            boolean r14 = r14.isTypeFavorites()
            if (r14 == 0) goto L_0x015a
            goto L_0x016f
        L_0x016e:
            r13 = r2
        L_0x016f:
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r13 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r13
            kotlin.jvm.internal.C19389t.m32907a(r4)
            r4.remove(r13)
            kotlin.jvm.internal.Ref$IntRef r4 = new kotlin.jvm.internal.Ref$IntRef
            r4.<init>()
            T r12 = r11.element
            java.util.Set r12 = (java.util.Set) r12
            kotlin.jvm.internal.C19383o.m32797g(r12, r6)
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L_0x018b
            r12 = r5
            goto L_0x01af
        L_0x018b:
            java.util.Iterator r6 = r12.iterator()
            r12 = r5
        L_0x0190:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x01af
            java.lang.Object r13 = r6.next()
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r13 = (com.etsy.android.lib.models.apiv3.CheckableListingCollection) r13
            boolean r13 = r13.getIsChecked()
            if (r13 == 0) goto L_0x0190
            int r12 = r12 + 1
            if (r12 < 0) goto L_0x01a7
            goto L_0x0190
        L_0x01a7:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "Count overflow has happened."
            r1.<init>(r2)
            throw r1
        L_0x01af:
            r4.element = r12
            if (r12 <= 0) goto L_0x01da
            com.etsy.android.lib.models.datatypes.EtsyId r6 = r9.f21591a
            long r13 = r6.getIdAsLongDeprecated()
            r15 = 1
            T r6 = r11.element
            java.util.Set r6 = (java.util.Set) r6
            java.util.ArrayList r16 = androidx.compose.foundation.layout.C0761x.m1699W(r6)
            com.etsy.android.lib.models.interfaces.ListingLike r6 = r9.f21592b
            io.reactivex.subjects.PublishSubject<mf.b> r12 = p400mf.C13079d.f28754a
            kotlin.jvm.internal.C19383o.m32797g(r6, r3)
            io.reactivex.subjects.PublishSubject<mf.b> r3 = p400mf.C13079d.f28754a
            mf.b$a r12 = new mf.b$a
            r18 = r12
            r17 = r6
            r12.<init>(r13, r15, r16, r17)
            r6 = r18
            r3.onNext(r6)
            goto L_0x01fa
        L_0x01da:
            com.etsy.android.lib.models.datatypes.EtsyId r6 = r9.f21591a
            long r13 = r6.getIdAsLongDeprecated()
            r15 = 0
            r16 = 0
            com.etsy.android.lib.models.interfaces.ListingLike r6 = r9.f21592b
            io.reactivex.subjects.PublishSubject<mf.b> r12 = p400mf.C13079d.f28754a
            kotlin.jvm.internal.C19383o.m32797g(r6, r3)
            io.reactivex.subjects.PublishSubject<mf.b> r3 = p400mf.C13079d.f28754a
            mf.b$a r12 = new mf.b$a
            r18 = r12
            r17 = r6
            r12.<init>(r13, r15, r16, r17)
            r6 = r18
            r3.onNext(r6)
        L_0x01fa:
            com.etsy.android.ui.favorites.add.h r3 = r1.f21564b
            r3.getClass()
            com.etsy.android.ui.favorites.add.k r3 = r3.f21604a
            com.etsy.android.lib.models.datatypes.EtsyId r6 = r9.f21591a
            java.lang.String r6 = r6.getId()
            com.etsy.android.lib.models.datatypes.EtsyId r12 = r9.f21591a
            boolean r12 = r12.hasId()
            r13 = 2
            if (r12 == 0) goto L_0x02db
            java.util.Map<java.lang.String, com.etsy.android.ui.util.CollectionUtil$ListingCollectionAction> r12 = r9.f21593c
            if (r12 == 0) goto L_0x021a
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x021b
        L_0x021a:
            r5 = r8
        L_0x021b:
            if (r5 == 0) goto L_0x021f
            goto L_0x02db
        L_0x021f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Map<java.lang.String, com.etsy.android.ui.util.CollectionUtil$ListingCollectionAction> r12 = r9.f21593c
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0233:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0262
            java.lang.Object r14 = r12.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getValue()
            com.etsy.android.ui.util.CollectionUtil$ListingCollectionAction r15 = (com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionAction) r15
            int[] r16 = com.etsy.android.p327ui.favorites.add.C9766h.C9767a.f21605a
            int r15 = r15.ordinal()
            r15 = r16[r15]
            if (r15 == r8) goto L_0x025a
            if (r15 == r13) goto L_0x0252
            goto L_0x0233
        L_0x0252:
            java.lang.Object r14 = r14.getKey()
            r2.add(r14)
            goto L_0x0233
        L_0x025a:
            java.lang.Object r14 = r14.getKey()
            r5.add(r14)
            goto L_0x0233
        L_0x0262:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x026b:
            boolean r14 = r2.hasNext()
            java.lang.String r15 = ","
            if (r14 == 0) goto L_0x028d
            java.lang.Object r14 = r2.next()
            java.lang.String r14 = (java.lang.String) r14
            int r16 = r12.length()
            if (r16 <= 0) goto L_0x0282
            r16 = r8
            goto L_0x0284
        L_0x0282:
            r16 = 0
        L_0x0284:
            if (r16 == 0) goto L_0x0289
            r12.append(r15)
        L_0x0289:
            r12.append(r14)
            goto L_0x026b
        L_0x028d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0296:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x02b6
            java.lang.Object r14 = r5.next()
            java.lang.String r14 = (java.lang.String) r14
            int r16 = r2.length()
            if (r16 <= 0) goto L_0x02ab
            r16 = r8
            goto L_0x02ad
        L_0x02ab:
            r16 = 0
        L_0x02ad:
            if (r16 == 0) goto L_0x02b2
            r2.append(r15)
        L_0x02b2:
            r2.append(r14)
            goto L_0x0296
        L_0x02b6:
            kotlin.Pair[] r5 = new kotlin.Pair[r13]
            java.lang.String r12 = r12.toString()
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r15 = "add_to_collection_keys"
            r14.<init>(r15, r12)
            r12 = 0
            r5[r12] = r14
            java.lang.String r2 = r2.toString()
            kotlin.Pair r12 = new kotlin.Pair
            java.lang.String r14 = "remove_from_collection_keys"
            r12.<init>(r14, r2)
            r5[r8] = r12
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            kotlin.collections.C19294b0.m32566w0(r2, r5)
        L_0x02db:
            tp.n r2 = r3.mo32777c(r6, r2)
            ba.a r3 = new ba.a
            r3.<init>(r9, r13)
            tp.n r2 = r2.mo20634d(r3)
            java.lang.String r3 = "endpoint.update(\n       …)\n            }\n        }"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            com.etsy.android.ui.favorites.add.n r3 = new com.etsy.android.ui.favorites.add.n
            r3.<init>(r11, r4, r1, r9)
            io.reactivex.internal.operators.observable.q r1 = new io.reactivex.internal.operators.observable.q
            r1.<init>(r2, r3)
            com.etsy.android.ui.favorites.add.e r2 = new com.etsy.android.ui.favorites.add.e
            r2.<init>(r0)
            if (r7 == 0) goto L_0x034c
            io.reactivex.internal.functions.Functions$a r3 = new io.reactivex.internal.functions.Functions$a
            r3.<init>(r2)
            int r2 = p248tp.C8054g.f17572b
            tp.q[] r4 = new p248tp.C8065q[r13]
            r5 = 0
            r4[r5] = r7
            r4[r8] = r1
            java.lang.String r1 = "bufferSize"
            p145io.reactivex.internal.functions.C12965a.m20651c(r2, r1)
            io.reactivex.internal.operators.observable.ObservableZip r1 = new io.reactivex.internal.operators.observable.ObservableZip
            r1.<init>(r4, r3, r2)
            ua.f r2 = r0.f21552b
            r2.getClass()
            tp.r r2 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.observable.ObservableSubscribeOn r1 = r1.mo20639i(r2)
            ua.f r2 = r0.f21552b
            r2.getClass()
            tp.r r2 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.observable.ObservableObserveOn r1 = r1.mo20635e(r2)
            com.etsy.android.lib.network.oauth2.p r2 = new com.etsy.android.lib.network.oauth2.p
            r3 = 3
            r2.<init>(r0, r3)
            com.etsy.android.checkout.c r4 = new com.etsy.android.checkout.c
            r4.<init>(r0, r3)
            io.reactivex.internal.functions.Functions$c r3 = p145io.reactivex.internal.functions.Functions.f28539c
            io.reactivex.internal.functions.Functions$d r5 = p145io.reactivex.internal.functions.Functions.f28540d
            io.reactivex.disposables.Disposable r1 = r1.mo20636f(r2, r4, r3, r5)
            io.reactivex.disposables.a r2 = r0.f21559i
            kotlin.jvm.internal.C19383o.m32798h(r2, r10)
            r2.mo19403b(r1)
            goto L_0x0359
        L_0x034c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "source1 is null"
            r1.<init>(r2)
            throw r1
        L_0x0354:
            com.etsy.android.ui.favorites.add.AddToListFragment r1 = r0.f21551a
            r1.dismiss()
        L_0x0359:
            return
        L_0x035a:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.add.AddToListPresenter.mo32709a():void");
    }

    /* renamed from: b */
    public final CollectionUtil$ListingCollectionsChangeState mo32710b(List<CheckableListingCollection> list) {
        if (this.f21560j.isEmpty()) {
            return CollectionUtil$ListingCollectionsChangeState.UNCHANGED;
        }
        boolean z = false;
        boolean z2 = false;
        for (CheckableListingCollection checkableListingCollection : this.f21560j) {
            if (checkableListingCollection.getWasChanged()) {
                if (checkableListingCollection.getIncludesListing()) {
                    z2 = true;
                } else {
                    z = true;
                }
                list.add(checkableListingCollection);
            }
        }
        return (!z || z2) ? (!z2 || z) ? (!z2 || !z) ? CollectionUtil$ListingCollectionsChangeState.UNCHANGED : CollectionUtil$ListingCollectionsChangeState.REMOVED_AND_ADDED_TO_COLLECTIONS : CollectionUtil$ListingCollectionsChangeState.REMOVED_FROM_COLLECTIONS : CollectionUtil$ListingCollectionsChangeState.ADDED_TO_COLLECTIONS;
    }

    /* renamed from: c */
    public final void mo32711c() {
        C9768i iVar = this.f21557g;
        if (iVar != null) {
            iVar.showError();
        }
        C9768i iVar2 = this.f21557g;
        if (iVar2 != null) {
            iVar2.onFinishedLoading();
        }
    }

    /* renamed from: d */
    public final void mo32712d() {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        int i = C9746a.f21562a[mo32710b(arrayList).ordinal()];
        Integer num2 = null;
        int i2 = R.drawable.clg_icon_core_heart_v1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str5 = "";
                } else {
                    String string = this.f21551a.getString(R.string.listing_added_and_removed_from_collections_alert);
                    C19383o.m32796f(string, "fragment.getString(R.str…d_from_collections_alert)");
                    str5 = C0388a.m1049e(new Object[]{Integer.valueOf(arrayList.size())}, 1, string, "format(format, *args)");
                }
            } else if (arrayList.size() > 1) {
                String string2 = this.f21551a.getString(R.string.remove_multiple_listings_from_collection_alert);
                C19383o.m32796f(string2, "fragment.getString(R.str…gs_from_collection_alert)");
                str5 = C0388a.m1049e(new Object[]{Integer.valueOf(arrayList.size())}, 1, string2, "format(format, *args)");
            } else {
                String string3 = this.f21551a.getString(R.string.remove_single_listing_from_collection_alert);
                C19383o.m32796f(string3, "fragment.getString(R.str…ng_from_collection_alert)");
                str5 = C0388a.m1049e(new Object[]{((CheckableListingCollection) arrayList.get(0)).getName()}, 1, string3, "format(format, *args)");
            }
            str2 = str5;
            str = null;
            num = null;
        } else {
            if (arrayList.size() > 1) {
                String string4 = this.f21551a.getString(R.string.add_multiple_listings_to_collection_alert);
                C19383o.m32796f(string4, "fragment.getString(R.str…ings_to_collection_alert)");
                str4 = C0388a.m1049e(new Object[]{Integer.valueOf(arrayList.size())}, 1, string4, "format(format, *args)");
                str3 = null;
            } else {
                String string5 = this.f21551a.getString(R.string.add_single_listing_to_collection_alert);
                C19383o.m32796f(string5, "fragment.getString(R.str…ting_to_collection_alert)");
                String e = C0388a.m1049e(new Object[]{((CheckableListingCollection) arrayList.get(0)).getName()}, 1, string5, "format(format, *args)");
                String string6 = this.f21551a.getString(((CheckableListingCollection) arrayList.get(0)).getPrivacyLevel().getLabel());
                num2 = Integer.valueOf(((CheckableListingCollection) arrayList.get(0)).getPrivacyLevel().getIcon());
                str4 = e;
                str3 = string6;
            }
            i2 = R.drawable.clg_icon_core_heart_fill_v1;
            str2 = str4;
            str = str3;
            num = num2;
        }
        int i3 = i2;
        C9768i iVar = this.f21557g;
        if (iVar != null) {
            iVar.showAlert(new AlertData(i3, str2, str, num, CollageAlert.AlertType.SUCCESS, 3000, new AddToListPresenter$handleSuccess$1(this)));
        }
        C9768i iVar2 = this.f21557g;
        if (iVar2 != null) {
            iVar2.onFinishedLoading();
        }
        C9768i iVar3 = this.f21557g;
        if (iVar3 != null) {
            iVar3.dismiss();
        }
    }
}
