package com.etsy.android.p327ui.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v4.media.session.C0087d;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.animation.C0388a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.exceptions.ThreeArmSweaterException;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.CollectionDetails;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.datatypes.UntrackedObject;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.favorites.C9792b;
import com.etsy.android.p327ui.favorites.C9895t;
import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import com.etsy.android.p327ui.favorites.search.C9885a;
import com.etsy.android.p327ui.favorites.search.C9890d;
import com.etsy.android.p327ui.favorites.search.C9891e;
import com.etsy.android.p327ui.favorites.search.FavoriteSearchAnalytics;
import com.etsy.android.p327ui.favorites.search.SearchView;
import com.etsy.android.p327ui.favorites.search.filters.Filter;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.EditCollectionBottomSheetKey;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10744d;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageEmptyStateView;
import com.etsy.android.stylekit.views.CollageTextView;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.VespaBaseFragment;
import com.etsy.android.vespa.viewholders.C12086e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19456j;
import kotlinx.coroutines.C19543e0;
import okhttp3.C19928a0;
import p001a0.C0005b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.observable.C19156d0;
import p145io.reactivex.internal.operators.observable.C19168j;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p251u1.C8115a;
import p260v0.C8184a;
import p277w8.C8267e;
import p321cc.C8568b;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12788a;
import p356ge.C12790b;
import p357gf.C12796e;
import p400mf.C13074b;
import p400mf.C13078c;
import p412oc.C13149a;
import p412oc.C13150b;
import p412oc.C13151c;
import p415of.C13171a;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13179h;
import p415of.C13182k;
import p415of.C13186o;
import p420pc.C13212a;
import p420pc.C13213b;
import p420pc.C13215d;
import p425q9.C13265p;
import p435rb.C13351b;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13380b;
import p456ua.C13458c;
import p456ua.C13459d;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p486y9.C13888d;
import p504ai.C13983i;
import p568fn.C17782b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.core.CollectionFragment */
public final class CollectionFragment extends VespaBaseFragment<Page> implements C13366a, C9890d, C9885a {
    public static final int $stable = 8;
    public static final int COLLECTION_HEADER_POSITION = 0;
    public static final int COLLECTION_LISTINGS_START_POSITION = 1;
    public static final C9609f Companion = new C9609f();
    public static final int FILTER_NOT_SELECTED = 0;
    public static final int FILTER_SELECTED = 1;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    public C8672b analyticsTracker;
    private final CollectionFragment$broadcastReceiver$1 broadcastReceiver = new CollectionFragment$broadcastReceiver$1(this);
    public C13150b clusterRepository;
    public C13149a clustersEligibility;
    /* access modifiers changed from: private */
    public Collection collection;
    private final C19285c collectionFiltersBottomSheetHelper$delegate = C19350d.m32677b(new CollectionFragment$collectionFiltersBottomSheetHelper$2(this));
    public C9792b collectionHeaderEligibility;
    private String collectionKey;
    public C9617e collectionRepository;
    private String collectionSlug;
    private String creatorUsername;
    public C13888d currentLocale;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    private final C7091a disposable = new C7091a();
    private CollageEmptyStateView emptyStateView;
    public C11780h favoriteRepository;
    private HeartMonitor heartMonitor;
    private boolean isAvailableSelected;
    private boolean isOnSaleSelected;
    private ListingCardViewHolderOptions listingCardOptions;
    public C8694h logCat;
    private RecyclerView.C3108s onScrollListener;
    private C9895t onUpdateCollectionListener;
    private final C19285c paginationForNextLink$delegate = C19350d.m32677b(CollectionFragment$paginationForNextLink$2.INSTANCE);
    /* access modifiers changed from: private */
    public String query;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    private C9891e searchInFavoritesListItem;
    public C10865h searchUriParser;
    private final C19285c searchView$delegate = C19350d.m32677b(new CollectionFragment$searchView$2(this));
    public C13265p session;

    /* renamed from: com.etsy.android.ui.core.CollectionFragment$a */
    public static final class C9604a extends UntrackedObject implements C13186o {

        /* renamed from: b */
        public final Collection f21294b;

        /* renamed from: c */
        public final boolean f21295c;

        public C9604a(Collection collection, boolean z) {
            this.f21294b = collection;
            this.f21295c = z;
        }

        public final int getViewType() {
            return R.layout.collection_header;
        }
    }

    /* renamed from: com.etsy.android.ui.core.CollectionFragment$b */
    public final class C9605b extends C13171a<C9604a> {

        /* renamed from: d */
        public final /* synthetic */ CollectionFragment f21296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9605b(CollectionFragment collectionFragment, Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
            C19383o.m32797g(fragment, "fragment");
            this.f21296d = collectionFragment;
        }

        /* renamed from: d */
        public final void mo31328c(C9604a aVar) {
            C19383o.m32797g(aVar, "data");
            Collection access$getCollection$p = this.f21296d.collection;
            if (access$getCollection$p != null) {
                CollectionFragment collectionFragment = this.f21296d;
                C12790b.m20430b(collectionFragment, new EditCollectionBottomSheetKey(C19421p.m32935c0(collectionFragment.getActivity()), access$getCollection$p));
            }
        }
    }

    /* renamed from: com.etsy.android.ui.core.CollectionFragment$c */
    public static final class C9606c extends C12086e<C9604a> {

        /* renamed from: c */
        public final C9605b f21297c;

        /* renamed from: d */
        public final TextView f21298d = ((TextView) this.itemView.findViewById(R.id.collection_title));

        /* renamed from: e */
        public final TextView f21299e = ((TextView) this.itemView.findViewById(R.id.collection_subtitle));

        /* renamed from: f */
        public final TextView f21300f = ((TextView) this.itemView.findViewById(R.id.collection_edit_button));

        public C9606c(ViewGroup viewGroup, C9605b bVar) {
            super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.collection_header, viewGroup, false));
            this.f21297c = bVar;
        }

        /* renamed from: a */
        public final void mo19450a(Object obj) {
            C9604a aVar = (C9604a) obj;
            C19383o.m32797g(aVar, "data");
            Collection collection = aVar.f21294b;
            this.f21298d.setText(collection.getName());
            Context context = this.itemView.getContext();
            int icon = collection.getPrivacyLevel().getIcon();
            Object obj2 = C8184a.f17966a;
            Drawable b = C8184a.C8187c.m16466b(context, icon);
            if (b != null) {
                b.setBounds(0, 0, C0087d.m233b(this.itemView, R.dimen.clg_icon_size_smaller), C0087d.m233b(this.itemView, R.dimen.clg_icon_size_smaller));
            }
            TextView textView = this.f21299e;
            C19383o.m32796f(textView, "subtitleTextView");
            C13351b.m21020d(textView, b, (Drawable) null, 14);
            this.f21299e.setText(this.itemView.getResources().getQuantityString(R.plurals.item_lowercase_quantity, collection.getListingsCount(), new Object[]{Integer.valueOf(collection.getListingsCount())}));
            TextView textView2 = this.f21299e;
            textView2.setContentDescription(this.itemView.getContext().getString(collection.getPrivacyLevel().getLabel()) + ' ' + this.f21299e.getText());
            if (aVar.f21295c) {
                this.f21300f.setVisibility(0);
                TextView textView3 = this.f21300f;
                C19383o.m32796f(textView3, "editButton");
                ViewExtensions.m12866j(textView3, new CollectionFragment$CollectionHeaderViewHolder$bind$1(this, aVar));
                return;
            }
            this.f21300f.setVisibility(8);
        }
    }

    /* renamed from: com.etsy.android.ui.core.CollectionFragment$d */
    public final class C9607d extends C13172b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9607d(CollectionFragment collectionFragment, Fragment fragment, C8703p pVar, C13173c cVar) {
            super(new C13179h(fragment, pVar, cVar, (C13182k) null));
            C19383o.m32797g(fragment, "fragment");
            this.f28982a.mo19994h(R.layout.collection_header, new C9605b(collectionFragment, fragment, pVar));
        }

        /* renamed from: b */
        public final C12086e<?> mo31854b(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            if (i != R.layout.collection_header) {
                return null;
            }
            Object f = this.f28982a.mo19993f(i, (Integer) null);
            C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.ui.core.CollectionFragment.CollectionHeaderClickHandler");
            return new C9606c(viewGroup, (C9605b) f);
        }

        /* renamed from: h */
        public final void mo32273h() {
        }
    }

    /* renamed from: com.etsy.android.ui.core.CollectionFragment$e */
    public static final class C9608e extends C9125j {

        /* renamed from: g */
        public final String f21301g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9608e(Fragment fragment, C13173c cVar, C8703p pVar, String str, C8267e eVar) {
            super(fragment, cVar, pVar, (C9126k.C9128b) null, eVar);
            C19383o.m32797g(fragment, "fragment");
            C19383o.m32797g(str, "collectionKey");
            C19383o.m32797g(eVar, "adImpressionRepository");
            this.f21301g = str;
        }

        /* renamed from: e */
        public final void mo31349e(ListingLike listingLike, boolean z, Bundle bundle) {
            C19383o.m32797g(listingLike, ResponseConstants.LISTING);
            this.f28980b.mo21333d("collection_tapped_listing", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.COLLECTION_KEY, this.f21301g), new Pair(PredefinedAnalyticsProperty.LISTING_ID, listingLike.getListingId()), new Pair(PredefinedAnalyticsProperty.CLUSTER_SOURCE, FavoriteSearchAnalytics.CLUSTER_FROM_FAVS_COLLECTION.getAnalyticsId())));
            super.mo31349e(listingLike, z, bundle);
        }
    }

    /* renamed from: com.etsy.android.ui.core.CollectionFragment$f */
    public static final class C9609f {
    }

    /* renamed from: com.etsy.android.ui.core.CollectionFragment$g */
    public static final class C9610g implements C13078c {

        /* renamed from: a */
        public final /* synthetic */ CollectionFragment f21302a;

        public C9610g(CollectionFragment collectionFragment) {
            this.f21302a = collectionFragment;
        }

        /* renamed from: a */
        public final void mo31411a(C13074b bVar) {
            C19383o.m32797g(bVar, "update");
            if (bVar instanceof C13074b.C13075a) {
                this.f21302a.handleCollectionEdited((C13074b.C13075a) bVar);
            } else if (bVar instanceof C13074b.C13076b) {
                this.f21302a.handleFavoriteUpdate((C13074b.C13076b) bVar);
            }
        }
    }

    private final void addSearchWithClusters() {
        if (shouldAddSearch()) {
            SearchView searchView = getSearchView();
            if (searchView != null) {
                searchView.bind(getSearchInFavoritesListItem());
                searchView.setOnCollectionMenuButtonClickedListener(new CollectionFragment$addSearchWithClusters$1$1(this));
            }
            FragmentActivity activity = getActivity();
            C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
            boolean z = true;
            ((BaseActivity) activity).getAppBarHelper().addViewBelowAppBar((View) getSearchView(), true);
            if (getClustersEligibility().mo45857a() && isYou() && isFavorites()) {
                String str = this.query;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    C7091a aVar = this.disposable;
                    C8071s<C13151c> a = getClusterRepository().mo45858a();
                    getRxSchedulers().getClass();
                    SingleSubscribeOn i = a.mo20660i(C13461f.m21235b());
                    getRxSchedulers().getClass();
                    aVar.mo19403b(SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new CollectionFragment$addSearchWithClusters$2(this), new CollectionFragment$addSearchWithClusters$3(this)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final Collection findCollection(Integer num) {
        if (!(num == null || num.intValue() == -1)) {
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            C11869a aVar = (C11869a) TransactionDataRepository.C11867a.m19552a().mo38342a(num.intValue());
            boolean z = true;
            if (aVar == null || !aVar.f26406a.containsKey(Collection.TYPE_COLLECTION)) {
                z = false;
            }
            if (z) {
                Object b = aVar.mo38345b(Collection.TYPE_COLLECTION);
                C19383o.m32795e(b, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.Collection");
                return (Collection) b;
            }
        }
        return null;
    }

    private final String getBodyMessage() {
        String str = this.query;
        if (str == null || str.length() == 0) {
            return getResources().getString(R.string.collection_error_state_body);
        }
        return null;
    }

    private final void getCollection(C9619g gVar) {
        C7091a aVar = this.disposable;
        C9617e collectionRepository2 = getCollectionRepository();
        collectionRepository2.getClass();
        C19383o.m32797g(gVar, "spec");
        C8071s<C20145v<C19928a0>> a = collectionRepository2.f21309a.mo32295a(gVar.f21312a, gVar.f21313b, gVar.f21314c, gVar.f21316e, gVar.f21315d, gVar.f21317f, gVar.f21318g, gVar.f21319h);
        C8568b bVar = new C8568b(1);
        a.getClass();
        C19208j jVar = new C19208j(a, bVar);
        getRxSchedulers().getClass();
        SingleSubscribeOn i = jVar.mo20660i(C13461f.m21235b());
        getRxSchedulers().getClass();
        aVar.mo19403b(SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new CollectionFragment$getCollection$1(this), new CollectionFragment$getCollection$2(this)));
    }

    private final C13212a getCollectionFiltersBottomSheetHelper() {
        return (C13212a) this.collectionFiltersBottomSheetHelper$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C19394m getCollectionHeaderClickHandler() {
        Collection collection2 = this.collection;
        if (collection2 == null) {
            return null;
        }
        C19383o.m32796f(getAnalyticsContext(), "analyticsContext");
        new WeakReference(this);
        new C9604a(collection2, isYou());
        Collection access$getCollection$p = this.collection;
        if (access$getCollection$p != null) {
            C12790b.m20430b(this, new EditCollectionBottomSheetKey(C19421p.m32935c0(getActivity()), access$getCollection$p));
        }
        return C19394m.f43287a;
    }

    private final String getErrorMessage() {
        String str = this.query;
        if (str == null || str.length() == 0) {
            String string = getResources().getString(R.string.collection_error_state_heading_v2);
            C19383o.m32796f(string, "{\n            resources.…ate_heading_v2)\n        }");
            return string;
        }
        String string2 = getResources().getString(R.string.collection_error_state_search);
        C19383o.m32796f(string2, "resources.getString(R.st…ction_error_state_search)");
        return C0388a.m1049e(new Object[]{this.query}, 1, string2, "format(format, *args)");
    }

    private final String getHint() {
        if (!isYou() || !isFavorites()) {
            String string = getResources().getString(R.string.hint_search_in_a_collection);
            C19383o.m32796f(string, "{\n            resources.…n_a_collection)\n        }");
            return string;
        }
        String string2 = getResources().getString(R.string.hint_search_in_your_favorites);
        C19383o.m32796f(string2, "{\n            resources.…your_favorites)\n        }");
        return string2;
    }

    private final C13380b getPaginationForNextLink() {
        return (C13380b) this.paginationForNextLink$delegate.getValue();
    }

    private final C9891e getSearchInFavoritesListItem() {
        C9891e eVar = new C9891e(getHint(), this, true, false, false, this.query, 88);
        this.searchInFavoritesListItem = eVar;
        return eVar;
    }

    /* access modifiers changed from: private */
    public final SearchView getSearchView() {
        return (SearchView) this.searchView$delegate.getValue();
    }

    private final int getUrlValueForFilter(boolean z) {
        return z ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public final void handleCollectionDeleted() {
        C12788a.m20426e(getActivity());
    }

    /* access modifiers changed from: private */
    public final void handleCollectionEdited(C13074b.C13075a aVar) {
        int indexOf;
        handleCollectionUpdate(aVar);
        Collection collection2 = this.collection;
        if (collection2 != null) {
            Long creatorId = collection2.getCreatorId();
            boolean z = creatorId != null && creatorId.longValue() == getSession().mo45958c().getIdAsLongDeprecated();
            if (z && !collection2.isTypeFavorites()) {
                List<String> list = aVar.f28747c;
                if (list != null && C19327t.m32634P0(this.collectionKey, list)) {
                    if (!this.adapter.getItems().contains(aVar.f28748d) && aVar.f28748d.getViewType() != -1) {
                        this.adapter.addItemAtPosition(1, aVar.f28748d);
                        this.adapter.notifyDataSetChanged();
                    }
                    collection2.setListingsCount(this.adapter.getItemCount() - 1);
                    this.adapter.notifyItemChanged(0);
                }
            }
            if (z && !collection2.isTypeFavorites() && (indexOf = this.adapter.getItems().indexOf(aVar.f28748d)) >= 1 && indexOf < this.adapter.getItemCount()) {
                removeItemAtPosition(indexOf);
            }
            collection2.setListingsCount(this.adapter.getItemCount() - 1);
            this.adapter.notifyItemChanged(0);
        }
    }

    private final void handleCollectionUpdate(C13074b.C13075a aVar) {
        Object obj;
        boolean z;
        List<T> items = this.adapter.getItems();
        C19383o.m32796f(items, "adapter.items");
        ArrayList arrayList = new ArrayList();
        for (T next : items) {
            if (((C13186o) next) instanceof ListingLike) {
                arrayList.add(next);
            }
        }
        if (!C19543e0.m33306Y(arrayList)) {
            return;
        }
        if (isSearchEnabled()) {
            onSearchCleared();
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C13186o oVar = (C13186o) obj;
            C19383o.m32795e(oVar, "null cannot be cast to non-null type com.etsy.android.lib.models.interfaces.ListingLike");
            if (((ListingLike) oVar).getListingId().getIdAsLongDeprecated() == aVar.f28745a) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C13186o oVar2 = (C13186o) obj;
        if (oVar2 != null) {
            ListingLike listingLike = (ListingLike) oVar2;
            listingLike.setHasCollections(aVar.f28746b);
            int indexOf = this.adapter.getItems().indexOf(listingLike);
            if (indexOf > 0) {
                this.adapter.notifyItemChanged(indexOf);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleFavoriteUpdate(C13074b.C13076b bVar) {
        Object obj;
        boolean z;
        List<T> items = this.adapter.getItems();
        C19383o.m32796f(items, "adapter.items");
        ArrayList arrayList = new ArrayList();
        for (T next : items) {
            if (((C13186o) next) instanceof ListingLike) {
                arrayList.add(next);
            }
        }
        if (!C19543e0.m33306Y(arrayList)) {
            return;
        }
        if (isSearchEnabled()) {
            onSearchCleared();
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C13186o oVar = (C13186o) obj;
            C19383o.m32795e(oVar, "null cannot be cast to non-null type com.etsy.android.lib.models.interfaces.ListingLike");
            if (((ListingLike) oVar).getListingId().getIdAsLongDeprecated() == bVar.f28749a) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C13186o oVar2 = (C13186o) obj;
        if (oVar2 != null) {
            ListingLike listingLike = (ListingLike) oVar2;
            listingLike.setIsFavorite(bVar.f28750b);
            int indexOf = this.adapter.getItems().indexOf(listingLike);
            if (indexOf > 0) {
                this.adapter.notifyItemChanged(indexOf);
            }
        }
    }

    private final boolean isFavorites() {
        Collection collection2 = this.collection;
        return C19383o.m32792b(collection2 != null ? collection2.getType() : null, Collection.TYPE_FAVORITES);
    }

    private final boolean isSearchEnabled() {
        return getConfigMap().mo21132b(C8592b.C8598f.f18872b);
    }

    private final boolean isYou() {
        Collection collection2 = this.collection;
        Long creatorId = collection2 != null ? collection2.getCreatorId() : null;
        EtsyId d = getSession().mo45959d();
        long idAsLongDeprecated = d != null ? d.getIdAsLongDeprecated() : 0;
        return (creatorId == null || idAsLongDeprecated != creatorId.longValue() || idAsLongDeprecated == 0) ? false : true;
    }

    /* access modifiers changed from: private */
    public final ListingCardUiModel mapListingCardToListingCardUiModel(ListingCard listingCard) {
        return new ListingCardUiModel(listingCard, true, false, false, 8, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final Page mapListingCardUiModelsToPage(List<ListingCardUiModel> list) {
        Page page = new Page();
        ListSection listSection = new ListSection();
        ArrayList arrayList = new ArrayList();
        if (shouldAddCollectionHeader()) {
            Collection collection2 = this.collection;
            C19383o.m32794d(collection2);
            arrayList.add(new C9604a(collection2, isYou()));
        }
        if (!list.isEmpty()) {
            C19324q.m32628J0(list, arrayList);
        } else {
            showErrorView();
        }
        listSection.setItems(arrayList);
        page.addListSection(listSection);
        return page;
    }

    /* access modifiers changed from: private */
    public final void onCollectionLoaded(C9618f fVar) {
        Collection collection2;
        C9895t tVar;
        CollectionDetails collectionDetails = fVar.f21310a;
        Collection collection3 = this.collection;
        if (collection3 != null) {
            collection3.update(collectionDetails);
        } else {
            this.adapter.replaceList(EmptyList.INSTANCE);
            this.collection = new Collection(collectionDetails);
        }
        if (!(!getCollectionHeaderEligibility().mo32787a() || (collection2 = this.collection) == null || (tVar = this.onUpdateCollectionListener) == null)) {
            tVar.onCollectionUpdated(collection2.getName(), Boolean.valueOf(collection2.isPublic()));
        }
        if (isFavorites()) {
            getAnalyticsContext().mo21333d("favorites_view", C0005b.m33a0(Boolean.TRUE));
        } else {
            getAnalyticsContext().mo21333d("collection_view", (Map<? extends AnalyticsProperty, Object>) null);
        }
        C8703p analyticsContext = getAnalyticsContext();
        C13173c adapter = getAdapter();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C19383o.m32796f(adapter, "getAdapter()");
        addDelegateViewHolderFactory(new C9607d(this, this, analyticsContext, adapter));
        C13172b bVar = getAdapter().f28991c;
        C13173c adapter2 = getAdapter();
        C19383o.m32796f(adapter2, "getAdapter()");
        C8703p analyticsContext2 = getAnalyticsContext();
        C19383o.m32796f(analyticsContext2, "analyticsContext");
        bVar.mo45894i(R.id.view_type_listing_card, new C9608e(this, adapter2, analyticsContext2, collectionDetails.getKey(), getAdImpressionRepository()));
        List<ListingCard> listings = collectionDetails.getListings();
        if (listings != null) {
            C19179q qVar = new C19179q(new C19168j(listings), new C13458c(this, 4));
            C12965a.m20651c(16, "capacityHint");
            C19208j jVar = new C19208j(new C19156d0(qVar), new C13459d(this, 3));
            getRxSchedulers().getClass();
            SingleSubscribeOn i = jVar.mo20660i(C13461f.m21234a());
            getRxSchedulers().getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new CollectionFragment$onCollectionLoaded$4(this), new CollectionFragment$onCollectionLoaded$5(this, fVar));
            C7091a aVar = this.disposable;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
            return;
        }
        throw new NullPointerException("source is null");
    }

    private final void resetFilters() {
        this.isOnSaleSelected = false;
        this.isAvailableSelected = false;
    }

    private final boolean shouldAddCollectionHeader() {
        return getPagination().mo46059b() && this.collection != null && !getCollectionHeaderEligibility().mo32787a() && !isFavorites();
    }

    private final boolean shouldAddSearch() {
        return isSearchEnabled() && isYou() && isFavorites();
    }

    /* access modifiers changed from: private */
    public final void updateFilter(C13213b bVar) {
        if (bVar.f29051a == Filter.ON_SALE) {
            this.isOnSaleSelected = bVar.f29052b;
        } else {
            this.isAvailableSelected = bVar.f29052b;
        }
    }

    private final void updateQuery(String str) {
        this.query = str;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void addOnScrollListener(RecyclerView.C3108s sVar) {
        this.onScrollListener = sVar;
    }

    public final void addUpdateCollectionListener(C9895t tVar) {
        this.onUpdateCollectionListener = tVar;
    }

    public final C8267e getAdImpressionRepository() {
        C8267e eVar = this.adImpressionRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("adImpressionRepository");
        throw null;
    }

    public final C8672b getAnalyticsTracker() {
        C8672b bVar = this.analyticsTracker;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("analyticsTracker");
        throw null;
    }

    public String getApiUrl() {
        return "/etsyapps/v3/bespoke/member/collections";
    }

    public final C13150b getClusterRepository() {
        C13150b bVar = this.clusterRepository;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("clusterRepository");
        throw null;
    }

    public final C13149a getClustersEligibility() {
        C13149a aVar = this.clustersEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("clustersEligibility");
        throw null;
    }

    public final C9792b getCollectionHeaderEligibility() {
        C9792b bVar = this.collectionHeaderEligibility;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("collectionHeaderEligibility");
        throw null;
    }

    public final C9617e getCollectionRepository() {
        C9617e eVar = this.collectionRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("collectionRepository");
        throw null;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public final C12724a getDeepLinkEligibility() {
        C12724a aVar = this.deepLinkEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEligibility");
        throw null;
    }

    public final C13851a getDeepLinkEntityChecker() {
        C13851a aVar = this.deepLinkEntityChecker;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEntityChecker");
        throw null;
    }

    public final C11780h getFavoriteRepository() {
        C11780h hVar = this.favoriteRepository;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("favoriteRepository");
        throw null;
    }

    public int getLayoutId() {
        return R.layout.fragment_collection;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public C13379a getPagination() {
        return getPaginationForNextLink();
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C12741o getRouteInspector() {
        C12741o oVar = this.routeInspector;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("routeInspector");
        throw null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public final C10865h getSearchUriParser() {
        C10865h hVar = this.searchUriParser;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("searchUriParser");
        throw null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 600 && intent != null) {
            Collection findCollection = findCollection(Integer.valueOf(intent.getIntExtra("transaction-data", -1)));
            if (!C19383o.m32792b(this.collection, findCollection)) {
                return;
            }
            if (i2 == 611) {
                handleCollectionDeleted();
            } else if (i2 == 612) {
                handleCollectionEdited(findCollection);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        Collection findCollection = findCollection(arguments != null ? Integer.valueOf(arguments.getInt("transaction-data", -1)) : null);
        if (findCollection != null) {
            this.collectionKey = findCollection.getKey();
        } else {
            this.collectionKey = requireArguments().getString(ListRecommendationsFragment.COLLECTION_KEY);
            this.creatorUsername = requireArguments().getString(ResponseConstants.USERNAME);
        }
        this.collectionSlug = requireArguments().getString("slug");
        if (this.listingCardOptions == null) {
            C8623e configMap = getConfigMap();
            C19383o.m32796f(configMap, "configMap");
            this.listingCardOptions = new ListingCardViewHolderOptions.C11970d(configMap);
        }
        C13173c adapter = getAdapter();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C13461f rxSchedulers2 = getRxSchedulers();
        C8703p analyticsContext = getAnalyticsContext();
        ListingCardViewHolderOptions listingCardViewHolderOptions = this.listingCardOptions;
        C8267e adImpressionRepository2 = getAdImpressionRepository();
        C12724a deepLinkEligibility2 = getDeepLinkEligibility();
        C12741o routeInspector2 = getRouteInspector();
        C13851a deepLinkEntityChecker2 = getDeepLinkEntityChecker();
        C10865h searchUriParser2 = getSearchUriParser();
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C13799a aVar = r0;
        C13799a aVar2 = new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository2, deepLinkEligibility2, routeInspector2, deepLinkEntityChecker2, searchUriParser2, this, listingCardViewHolderOptions, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 61440);
        addDelegateViewHolderFactory(new C13801b(aVar));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        this.emptyStateView = (CollageEmptyStateView) onCreateView.findViewById(R.id.collection_empty_state_view);
        getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.edge_edge_listing_spacing);
        this.recyclerView.addItemDecoration(new C10744d(dimensionPixelSize, dimensionPixelSize, true));
        this.recyclerView.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.card_view_margin));
        RecyclerView.C3108s sVar = this.onScrollListener;
        if (sVar != null) {
            this.recyclerView.addOnScrollListener(sVar);
        }
        return onCreateView;
    }

    public void onDestroyView() {
        RecyclerView recyclerView;
        C8115a.m16322a(requireActivity()).mo20710d(this.broadcastReceiver);
        this.disposable.mo19405d();
        this.emptyStateView = null;
        SearchView searchView = getSearchView();
        if (!(searchView == null || (recyclerView = this.recyclerView) == null)) {
            recyclerView.removeOnScrollListener(searchView.getSearchWithClustersOnScrollListener());
        }
        HeartMonitor heartMonitor2 = this.heartMonitor;
        if (heartMonitor2 != null) {
            heartMonitor2.onDestroy(this);
        }
        super.onDestroyView();
    }

    public void onFiltersClicked() {
        C13212a collectionFiltersBottomSheetHelper = getCollectionFiltersBottomSheetHelper();
        if (collectionFiltersBottomSheetHelper != null) {
            List e0 = C17782b.m29865e0(new C13213b(Filter.ON_SALE, this.isOnSaleSelected), new C13213b(Filter.AVAILABLE, this.isAvailableSelected));
            CollectionFragment$onFiltersClicked$1 collectionFragment$onFiltersClicked$1 = new CollectionFragment$onFiltersClicked$1(this);
            if (e0 == null) {
                collectionFiltersBottomSheetHelper.f29047a.dismiss();
                return;
            }
            CollageTextView collageTextView = collectionFiltersBottomSheetHelper.f29049c;
            if (collageTextView != null) {
                collageTextView.setText(collageTextView.getResources().getString(R.string.filter_by));
            }
            RecyclerView recyclerView = collectionFiltersBottomSheetHelper.f29050d;
            if (recyclerView != null) {
                recyclerView.setAdapter(new C13215d(collectionFragment$onFiltersClicked$1, e0));
                recyclerView.setLayoutManager(collectionFiltersBottomSheetHelper.f29048b);
            }
            CollageBottomSheet collageBottomSheet = collectionFiltersBottomSheetHelper.f29047a;
            collageBottomSheet.setPopover(true);
            collageBottomSheet.show();
        }
    }

    public void onLoadContent() {
        String contentUrl = getContentUrl();
        C19383o.m32796f(contentUrl, "contentUrl");
        LinkedHashMap W = C19388s.m32851W(contentUrl);
        String str = this.collectionKey;
        String str2 = this.collectionSlug;
        String str3 = this.creatorUsername;
        String str4 = (String) W.get("offset");
        Integer T0 = str4 != null ? C19456j.m33016T0(str4) : null;
        String str5 = (String) W.get("limit");
        getCollection(new C9619g(str, str2, str3, T0, str5 != null ? C19456j.m33016T0(str5) : null, this.query, Integer.valueOf(getUrlValueForFilter(this.isOnSaleSelected)), Integer.valueOf(getUrlValueForFilter(this.isAvailableSelected))));
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C19383o.m32797g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.menu_share);
        if (findItem != null) {
            findItem.setVisible(false);
            findItem.setEnabled(false);
        }
    }

    public void onRefresh() {
        super.onRefresh();
        ViewExtensions.m12860d(this.emptyStateView);
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    public void onSearch(String str) {
        setRefreshing(true);
        getPagination().mo46064g();
        Integer num = null;
        this.collection = null;
        updateQuery(str);
        String contentUrl = getContentUrl();
        C19383o.m32796f(contentUrl, "contentUrl");
        LinkedHashMap W = C19388s.m32851W(contentUrl);
        String str2 = this.collectionKey;
        String str3 = this.collectionSlug;
        String str4 = this.creatorUsername;
        String str5 = (String) W.get("offset");
        Integer T0 = str5 != null ? C19456j.m33016T0(str5) : null;
        String str6 = (String) W.get("limit");
        if (str6 != null) {
            num = C19456j.m33016T0(str6);
        }
        getCollection(new C9619g(str2, str3, str4, T0, num, this.query, Integer.valueOf(getUrlValueForFilter(this.isOnSaleSelected)), Integer.valueOf(getUrlValueForFilter(this.isAvailableSelected))));
    }

    public void onSearchCleared() {
        updateQuery((String) null);
        resetFilters();
        onRefresh();
    }

    public void onStop() {
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        ((BaseActivity) activity).getAppBarHelper().removeViewBelowAppBar(getSearchView(), false);
        super.onStop();
        this.swipeRefreshLayout.setRefreshing(false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EtsyAction.COLLECTION_EDITED.getIntentAction());
        intentFilter.addAction(EtsyAction.COLLECTION_DELETED.getIntentAction());
        C8115a.m16322a(requireActivity()).mo20708b(this.broadcastReceiver, intentFilter);
        Lifecycle lifecycle = getLifecycle();
        C19383o.m32796f(lifecycle, "lifecycle");
        this.heartMonitor = new HeartMonitor(lifecycle, new C9610g(this));
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setAnalyticsTracker(C8672b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.analyticsTracker = bVar;
    }

    public final void setClusterRepository(C13150b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.clusterRepository = bVar;
    }

    public final void setClustersEligibility(C13149a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.clustersEligibility = aVar;
    }

    public final void setCollectionHeaderEligibility(C9792b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.collectionHeaderEligibility = bVar;
    }

    public final void setCollectionRepository(C9617e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.collectionRepository = eVar;
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setDeepLinkEntityChecker(C13851a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEntityChecker = aVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setRouteInspector(C12741o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.routeInspector = oVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSearchUriParser(C10865h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.searchUriParser = hVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public void showEmptyView() {
        super.showEmptyView();
        ViewExtensions.m12869m(this.emptyStateView);
    }

    public void showErrorView() {
        this.swipeRefreshLayout.setRefreshing(false);
        CollageEmptyStateView collageEmptyStateView = this.emptyStateView;
        if (collageEmptyStateView != null) {
            collageEmptyStateView.setTitleText(getErrorMessage());
        }
        CollageEmptyStateView collageEmptyStateView2 = this.emptyStateView;
        if (collageEmptyStateView2 != null) {
            collageEmptyStateView2.setBodyText(getBodyMessage());
        }
        CollageEmptyStateView collageEmptyStateView3 = this.emptyStateView;
        if (collageEmptyStateView3 != null) {
            collageEmptyStateView3.setPrimaryButtonOnClickListener(new CollectionFragment$showErrorView$1(this));
        }
        CollageEmptyStateView collageEmptyStateView4 = this.emptyStateView;
        if (collageEmptyStateView4 != null) {
            collageEmptyStateView4.setSecondaryButtonOnClickListener(new CollectionFragment$showErrorView$2(this));
        }
        CollageEmptyStateView collageEmptyStateView5 = this.emptyStateView;
        if (collageEmptyStateView5 != null) {
            ThreeArmSweaterException.Companion companion = ThreeArmSweaterException.Companion;
            Context context = collageEmptyStateView5.getContext();
            C19383o.m32796f(context, "it.context");
            companion.getClass();
            ThreeArmSweaterException.Companion.m12856a(context);
        }
        showEmptyView();
    }

    public void showListView() {
        ViewExtensions.m12860d(this.emptyStateView);
        addSearchWithClusters();
        super.showListView();
    }

    /* access modifiers changed from: private */
    public final void handleCollectionEdited(Collection collection2) {
        C9895t tVar;
        if (collection2 != null) {
            this.collectionKey = collection2.getKey();
            Collection collection3 = this.collection;
            if (collection3 != null) {
                collection3.update(collection2);
            }
        }
        if (getCollectionHeaderEligibility().mo32787a() && (tVar = this.onUpdateCollectionListener) != null) {
            Collection collection4 = this.collection;
            Boolean bool = null;
            String name = collection4 != null ? collection4.getName() : null;
            Collection collection5 = this.collection;
            if (collection5 != null) {
                bool = Boolean.valueOf(collection5.isPublic());
            }
            tVar.onCollectionUpdated(name, bool);
        }
    }
}
