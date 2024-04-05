package com.etsy.android.p327ui.home.editorspicks;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.finds.FindsPage;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.home.editorspicks.C9930e;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.vespa.VespaBaseFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowImpl;
import p145io.reactivex.disposables.C7091a;
import p277w8.C8267e;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p400mf.C13078c;
import p425q9.C13265p;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13382d;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksFragment */
public final class EditorsPicksFragment extends VespaBaseFragment<Page> implements C9731e0.C9733b, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    private String anchorListing;
    public C12724a deepLinkEligibility;
    private final C7091a disposables = new C7091a();
    public EditorPicksRepository editorPicksRepository;
    private final C19285c editorsPicksViewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(C9940h.class), new EditorsPicksFragment$special$$inlined$viewModels$default$2(new EditorsPicksFragment$special$$inlined$viewModels$default$1(this)), new EditorsPicksFragment$editorsPicksViewModel$2(this));
    public C8618c etsyConfigMap;
    private final Map<String, Boolean> eventsTracked = new HashMap();
    public C11780h favoriteRepository;
    public C12703a grafana;
    private boolean isDraft;
    public C12796e listingImagesRepository;
    private final C13379a paginationField = new C13382d();
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    private String section;
    public C13265p session;
    private String slug = "";
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$a */
    public static final class C9920a extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ EditorsPicksFragment f21877b;

        public C9920a(EditorsPicksFragment editorsPicksFragment) {
            this.f21877b = editorsPicksFragment;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C19383o.m32794d(adapter);
            int itemCount = adapter.getItemCount() - 1;
            EtsyId etsyId = null;
            Integer valueOf = gridLayoutManager != null ? Integer.valueOf(gridLayoutManager.mo11283T0()) : null;
            C9940h access$getEditorsPicksViewModel = this.f21877b.getEditorsPicksViewModel();
            access$getEditorsPicksViewModel.getClass();
            if (valueOf != null && itemCount == valueOf.intValue()) {
                StateFlowImpl stateFlowImpl = access$getEditorsPicksViewModel.f21902d;
                FindsPage findsPage = access$getEditorsPicksViewModel.f21908j;
                EtsyId findsPageId = findsPage != null ? findsPage.getFindsPageId() : null;
                FindsPage findsPage2 = access$getEditorsPicksViewModel.f21908j;
                if (findsPage2 != null) {
                    etsyId = findsPage2.getFindsPagePublishedId();
                }
                C9940h.m18145b(stateFlowImpl, new C9930e.C9937g(findsPageId, etsyId));
            }
        }
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$b */
    public static final class C9921b implements C13078c {

        /* renamed from: a */
        public final /* synthetic */ EditorsPicksFragment f21878a;

        public C9921b(EditorsPicksFragment editorsPicksFragment) {
            this.f21878a = editorsPicksFragment;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: kotlin.collections.EmptyList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo31411a(p400mf.C13074b r12) {
            /*
                r11 = this;
                java.lang.String r0 = "update"
                kotlin.jvm.internal.C19383o.m32797g(r12, r0)
                com.etsy.android.ui.home.editorspicks.EditorsPicksFragment r0 = r11.f21878a
                com.etsy.android.ui.home.editorspicks.h r0 = r0.getEditorsPicksViewModel()
                com.etsy.android.ui.home.editorspicks.EditorsPicksFragment r1 = r11.f21878a
                com.etsy.android.uikit.adapter.a r1 = r1.adapter
                r2 = 0
                if (r1 == 0) goto L_0x0019
                java.util.List r1 = r1.getItems()
                goto L_0x001a
            L_0x0019:
                r1 = r2
            L_0x001a:
                r0.getClass()
                r3 = 0
                if (r1 == 0) goto L_0x0029
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r4 = r3
                goto L_0x002a
            L_0x0029:
                r4 = 1
            L_0x002a:
                if (r4 == 0) goto L_0x002e
                goto L_0x00e0
            L_0x002e:
                boolean r4 = r12 instanceof p400mf.C13074b.C13075a
                if (r4 == 0) goto L_0x0077
                mf.b$a r12 = (p400mf.C13074b.C13075a) r12
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x003d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x00c2
                java.lang.Object r5 = r1.next()
                int r6 = r3 + 1
                if (r3 < 0) goto L_0x0073
                of.o r5 = (p415of.C13186o) r5
                boolean r7 = r5 instanceof com.etsy.android.lib.models.interfaces.ListingLike
                if (r7 == 0) goto L_0x0054
                com.etsy.android.lib.models.interfaces.ListingLike r5 = (com.etsy.android.lib.models.interfaces.ListingLike) r5
                goto L_0x0055
            L_0x0054:
                r5 = r2
            L_0x0055:
                if (r5 == 0) goto L_0x0071
                com.etsy.android.lib.models.datatypes.EtsyId r7 = r5.getListingId()
                long r7 = r7.getIdAsLongDeprecated()
                long r9 = r12.f28745a
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 != 0) goto L_0x0071
                boolean r7 = r12.f28746b
                r5.setHasCollections(r7)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4.add(r3)
            L_0x0071:
                r3 = r6
                goto L_0x003d
            L_0x0073:
                p568fn.C17782b.m29877o0()
                throw r2
            L_0x0077:
                boolean r4 = r12 instanceof p400mf.C13074b.C13076b
                if (r4 == 0) goto L_0x00c0
                mf.b$b r12 = (p400mf.C13074b.C13076b) r12
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0086:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x00c2
                java.lang.Object r5 = r1.next()
                int r6 = r3 + 1
                if (r3 < 0) goto L_0x00bc
                of.o r5 = (p415of.C13186o) r5
                boolean r7 = r5 instanceof com.etsy.android.lib.models.interfaces.ListingLike
                if (r7 == 0) goto L_0x009d
                com.etsy.android.lib.models.interfaces.ListingLike r5 = (com.etsy.android.lib.models.interfaces.ListingLike) r5
                goto L_0x009e
            L_0x009d:
                r5 = r2
            L_0x009e:
                if (r5 == 0) goto L_0x00ba
                com.etsy.android.lib.models.datatypes.EtsyId r7 = r5.getListingId()
                long r7 = r7.getIdAsLongDeprecated()
                long r9 = r12.f28749a
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 != 0) goto L_0x00ba
                boolean r7 = r12.f28750b
                r5.setIsFavorite(r7)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4.add(r3)
            L_0x00ba:
                r3 = r6
                goto L_0x0086
            L_0x00bc:
                p568fn.C17782b.m29877o0()
                throw r2
            L_0x00c0:
                kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
            L_0x00c2:
                kotlinx.coroutines.flow.StateFlowImpl r12 = r0.f21902d
                java.lang.Object r0 = r12.getValue()
                com.etsy.android.ui.home.editorspicks.f r0 = (com.etsy.android.p327ui.home.editorspicks.C9938f) r0
                com.etsy.android.ui.home.editorspicks.e$b r1 = new com.etsy.android.ui.home.editorspicks.e$b
                r1.<init>(r4)
                r0.getClass()
                java.util.List<com.etsy.android.ui.home.editorspicks.e> r0 = r0.f21895a
                java.util.ArrayList r0 = kotlin.collections.C19327t.m32651g1(r0, r1)
                com.etsy.android.ui.home.editorspicks.f r1 = new com.etsy.android.ui.home.editorspicks.f
                r1.<init>(r0)
                r12.setValue(r1)
            L_0x00e0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.editorspicks.EditorsPicksFragment.C9921b.mo31411a(mf.b):void");
        }
    }

    private final C9929d getEditorsPicksAdapter() {
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.home.editorspicks.EditorsPicksAdapter");
        return (C9929d) aVar;
    }

    /* access modifiers changed from: private */
    public final C9940h getEditorsPicksViewModel() {
        return (C9940h) this.editorsPicksViewModel$delegate.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleSideEffect(com.etsy.android.p327ui.home.editorspicks.C9930e r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.etsy.android.p327ui.home.editorspicks.C9930e.C9934d
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00ab
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r12.swipeRefreshLayout
            boolean r0 = r0.isRefreshing()
            if (r0 == 0) goto L_0x0016
            com.etsy.android.ui.home.editorspicks.d r0 = r12.getEditorsPicksAdapter()
            r0.clear()
        L_0x0016:
            r0 = r13
            com.etsy.android.ui.home.editorspicks.e$d r0 = (com.etsy.android.p327ui.home.editorspicks.C9930e.C9934d) r0
            com.etsy.android.lib.models.finds.FindsPage r4 = r0.f21889a
            com.etsy.android.lib.models.datatypes.EtsyId r4 = r4.getFindsPageId()
            com.etsy.android.lib.models.finds.FindsPage r5 = r0.f21889a
            com.etsy.android.lib.models.datatypes.EtsyId r5 = r5.getFindsPagePublishedId()
            r12.trackPageLoad(r4, r5)
            com.etsy.android.ui.home.editorspicks.d r4 = r12.getEditorsPicksAdapter()
            com.etsy.android.lib.models.finds.FindsPage r0 = r0.f21889a
            r4.getClass()
            java.lang.String r5 = "page"
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            java.util.ArrayList r5 = r4.f21885i
            r5.clear()
            java.util.List r5 = r0.getHeroListings()
            boolean r5 = r5.isEmpty()
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x0063
            com.etsy.android.ui.home.editorspicks.viewholder.i r3 = new com.etsy.android.ui.home.editorspicks.viewholder.i
            java.lang.String r5 = r0.getTitle()
            java.lang.String r6 = r0.getSubtitle()
            java.util.List r7 = r0.getHeroListings()
            r3.<init>(r5, r6, r7)
            r4.addItem(r3)
            java.util.ArrayList r3 = r4.f21885i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x0063:
            java.util.List r0 = r0.getModules()
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x009c
            java.lang.Object r2 = r0.next()
            com.etsy.android.lib.models.finds.FindsModule r2 = (com.etsy.android.lib.models.finds.FindsModule) r2
            java.util.List r2 = r2.getCardViewElements()
            int r3 = r2.size()
            java.util.Iterator r2 = r2.iterator()
        L_0x0083:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x006b
            java.lang.Object r5 = r2.next()
            of.o r5 = (p415of.C13186o) r5
            java.util.ArrayList r6 = r4.f21885i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6.add(r7)
            r4.addItem(r5)
            goto L_0x0083
        L_0x009c:
            r4.notifyDataSetChanged()
            r12.onLoadComplete(r1)
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            r0.invalidateOptionsMenu()
            goto L_0x0188
        L_0x00ab:
            boolean r0 = r13 instanceof com.etsy.android.p327ui.home.editorspicks.C9930e.C9933c
            if (r0 == 0) goto L_0x00b4
            r12.onLoadFailure()
            goto L_0x0188
        L_0x00b4:
            boolean r0 = r13 instanceof com.etsy.android.p327ui.home.editorspicks.C9930e.C9935e
            if (r0 == 0) goto L_0x0127
            androidx.recyclerview.widget.RecyclerView r0 = r12.recyclerView
            com.etsy.android.ui.home.editorspicks.d r4 = r12.getEditorsPicksAdapter()
            java.lang.String r5 = r12.section
            if (r5 != 0) goto L_0x00c6
            r4.getClass()
            goto L_0x0123
        L_0x00c6:
            java.util.List r6 = r4.getItems()
            java.util.List r4 = r4.getItems()
            java.lang.String r7 = "items"
            kotlin.jvm.internal.C19383o.m32796f(r4, r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x00d7:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x011f
            java.lang.Object r7 = r4.next()
            r8 = r7
            of.o r8 = (p415of.C13186o) r8
            boolean r9 = r8 instanceof com.etsy.android.lib.models.finds.FindsHeadingModule
            if (r9 == 0) goto L_0x011b
            com.etsy.android.lib.models.finds.FindsHeadingModule r8 = (com.etsy.android.lib.models.finds.FindsHeadingModule) r8
            java.lang.String r8 = r8.getText()
            java.lang.String r9 = "it.text"
            kotlin.jvm.internal.C19383o.m32796f(r8, r9)
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = "getDefault()"
            kotlin.jvm.internal.C19383o.m32796f(r9, r10)
            java.lang.String r8 = r8.toLowerCase(r9)
            java.lang.String r9 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r8, r9)
            java.util.Locale r11 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r11, r10)
            java.lang.String r10 = r5.toLowerCase(r11)
            kotlin.jvm.internal.C19383o.m32796f(r10, r9)
            boolean r8 = kotlin.text.C19459m.m33036e1(r8, r10, r2)
            if (r8 == 0) goto L_0x011b
            r8 = r3
            goto L_0x011c
        L_0x011b:
            r8 = r2
        L_0x011c:
            if (r8 == 0) goto L_0x00d7
            r1 = r7
        L_0x011f:
            int r2 = r6.indexOf(r1)
        L_0x0123:
            r0.scrollToPosition(r2)
            goto L_0x0188
        L_0x0127:
            boolean r0 = r13 instanceof com.etsy.android.p327ui.home.editorspicks.C9930e.C9931a
            if (r0 == 0) goto L_0x013c
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            java.lang.String r1 = "No slug has been set for this editors picks page."
            r0.mo21310e(r1)
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            p356ge.C12788a.m20426e(r0)
            goto L_0x0188
        L_0x013c:
            boolean r0 = r13 instanceof com.etsy.android.p327ui.home.editorspicks.C9930e.C9932b
            if (r0 == 0) goto L_0x015f
            r0 = r13
            com.etsy.android.ui.home.editorspicks.e$b r0 = (com.etsy.android.p327ui.home.editorspicks.C9930e.C9932b) r0
            java.util.List<java.lang.Integer> r0 = r0.f21887a
            java.util.Iterator r0 = r0.iterator()
        L_0x0149:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0188
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.etsy.android.uikit.adapter.a<T> r2 = r12.adapter
            r2.notifyItemChanged(r1)
            goto L_0x0149
        L_0x015f:
            boolean r0 = r13 instanceof com.etsy.android.p327ui.home.editorspicks.C9930e.C9936f
            if (r0 == 0) goto L_0x017a
            r0 = r13
            com.etsy.android.ui.home.editorspicks.e$f r0 = (com.etsy.android.p327ui.home.editorspicks.C9930e.C9936f) r0
            java.lang.String r1 = r0.f21891a
            r12.trackShareListing(r1)
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            java.lang.String r2 = "requireActivity()"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            java.lang.String r0 = r0.f21891a
            androidx.compose.p015ui.text.input.C1993m.m4365Z(r1, r0)
            goto L_0x0188
        L_0x017a:
            boolean r0 = r13 instanceof com.etsy.android.p327ui.home.editorspicks.C9930e.C9937g
            if (r0 == 0) goto L_0x0188
            r0 = r13
            com.etsy.android.ui.home.editorspicks.e$g r0 = (com.etsy.android.p327ui.home.editorspicks.C9930e.C9937g) r0
            com.etsy.android.lib.models.datatypes.EtsyId r1 = r0.f21893a
            com.etsy.android.lib.models.datatypes.EtsyId r0 = r0.f21894b
            r12.trackScrollToBottom(r1, r0)
        L_0x0188:
            com.etsy.android.ui.home.editorspicks.h r0 = r12.getEditorsPicksViewModel()
            r0.getClass()
            java.lang.String r1 = "sideEffect"
            kotlin.jvm.internal.C19383o.m32797g(r13, r1)
            kotlinx.coroutines.flow.StateFlowImpl r0 = r0.f21902d
            java.lang.Object r1 = r0.getValue()
            com.etsy.android.ui.home.editorspicks.f r1 = (com.etsy.android.p327ui.home.editorspicks.C9938f) r1
            r1.getClass()
            java.util.List<com.etsy.android.ui.home.editorspicks.e> r1 = r1.f21895a
            java.util.ArrayList r13 = kotlin.collections.C19327t.m32649e1(r13, r1)
            com.etsy.android.ui.home.editorspicks.f r1 = new com.etsy.android.ui.home.editorspicks.f
            r1.<init>(r13)
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.editorspicks.EditorsPicksFragment.handleSideEffect(com.etsy.android.ui.home.editorspicks.e):void");
    }

    /* access modifiers changed from: private */
    public final void handleState(C9938f fVar) {
        C9930e eVar = (C9930e) C19327t.m32640V0(fVar.f21895a);
        if (eVar != null) {
            handleSideEffect(eVar);
        }
    }

    private final void trackPageLoad(EtsyId etsyId, EtsyId etsyId2) {
        if (!this.eventsTracked.containsKey("finds_page")) {
            getAnalyticsContext().mo21333d("finds_page", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.FINDS_PAGE_ID, etsyId), new Pair(PredefinedAnalyticsProperty.FINDS_PAGE_PUBLISHED_ID, etsyId2), new Pair(PredefinedAnalyticsProperty.FINDS_PAGE_SLUG, this.slug)));
            this.eventsTracked.put("finds_page", Boolean.TRUE);
        }
    }

    private final void trackScrollToBottom(EtsyId etsyId, EtsyId etsyId2) {
        if (!this.eventsTracked.containsKey("scroll_to_bottom")) {
            this.eventsTracked.put("scroll_to_bottom", Boolean.TRUE);
            getAnalyticsContext().mo21333d("scroll_to_bottom", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.FINDS_PAGE_ID, etsyId), new Pair(PredefinedAnalyticsProperty.FINDS_PAGE_PUBLISHED_ID, etsyId2), new Pair(PredefinedAnalyticsProperty.FINDS_PAGE_SLUG, this.slug)));
        }
    }

    private final void trackShareListing(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(PredefinedAnalyticsProperty.URL, str);
        getAnalyticsContext().mo21333d("share_editors_picks", hashMap);
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

    public final C8267e getAdImpressionRepository() {
        C8267e eVar = this.adImpressionRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("adImpressionRepository");
        throw null;
    }

    public String getApiUrl() {
        return "";
    }

    public final C12724a getDeepLinkEligibility() {
        C12724a aVar = this.deepLinkEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEligibility");
        throw null;
    }

    public final EditorPicksRepository getEditorPicksRepository() {
        EditorPicksRepository editorPicksRepository2 = this.editorPicksRepository;
        if (editorPicksRepository2 != null) {
            return editorPicksRepository2;
        }
        C19383o.m32805o("editorPicksRepository");
        throw null;
    }

    public final C8618c getEtsyConfigMap() {
        C8618c cVar = this.etsyConfigMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("etsyConfigMap");
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

    public int getFragmentTitle() {
        return R.string.editors_picks;
    }

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public final C12796e getListingImagesRepository() {
        C12796e eVar = this.listingImagesRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("listingImagesRepository");
        throw null;
    }

    public C13379a getPagination() {
        return this.paginationField;
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

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public void initAdapter() {
        if (this.adapter == null) {
            C8703p analyticsContext = getAnalyticsContext();
            C19383o.m32796f(analyticsContext, "analyticsContext");
            this.adapter = new C9929d(this, analyticsContext, getFavoriteRepository(), getRxSchedulers(), getSession(), getAdImpressionRepository(), getDeepLinkEligibility(), getRouteInspector(), getListingImagesRepository());
        }
        if (getActivity() != null) {
            getAdapter().mo45897p(R.id.view_type_listing_card, new C9125j(this, getAdapter(), getAnalyticsContext(), (C9126k.C9128b) null, getAdImpressionRepository()));
            getAdapter().mo45897p(R.id.view_type_finds_hero_listing, new C9125j(this, getAdapter(), getAnalyticsContext(), (C9126k.C9128b) null, getAdImpressionRepository()));
            getAdapter().mo45897p(R.id.view_type_finds_two_titled_listing, new C9125j(this, getAdapter(), getAnalyticsContext(), (C9126k.C9128b) null, getAdImpressionRepository()));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.slug = requireArguments.getString("finds_slug");
        this.anchorListing = requireArguments.getString("ANCHOR_LISTING_ID");
        this.section = requireArguments.getString("FINDS_ANCHOR_TAG");
        this.isDraft = requireArguments.getBoolean("finds_is_draft");
        setHasOptionsMenu(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            android.view.View r9 = super.onCreateView(r8, r9, r10)
            java.lang.String r10 = "super.onCreateView(infla…iner, savedInstanceState)"
            kotlin.jvm.internal.C19383o.m32796f(r9, r10)
            com.etsy.android.ui.home.editorspicks.h r10 = r7.getEditorsPicksViewModel()
            java.lang.String r0 = r7.slug
            java.lang.String r1 = r7.anchorListing
            boolean r2 = r7.isDraft
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = r7.section
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x002e
            r10.getClass()
            int r6 = r0.length()
            if (r6 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r6 = r4
            goto L_0x002f
        L_0x002e:
            r6 = r5
        L_0x002f:
            if (r6 == 0) goto L_0x0040
            fa.a r0 = r10.f21901c
            java.lang.String r1 = "cbf.home.editors_picks.error.missing_slug"
            r0.mo45474a(r1)
            kotlinx.coroutines.flow.StateFlowImpl r10 = r10.f21902d
            com.etsy.android.ui.home.editorspicks.e$a r0 = com.etsy.android.p327ui.home.editorspicks.C9930e.C9931a.f21886a
            com.etsy.android.p327ui.home.editorspicks.C9940h.m18145b(r10, r0)
            goto L_0x0048
        L_0x0040:
            r10.f21904f = r0
            r10.f21905g = r1
            r10.f21906h = r2
            r10.f21907i = r3
        L_0x0048:
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2131165632(0x7f0701c0, float:1.7945487E38)
            float r10 = r10.getDimension(r0)
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = android.util.TypedValue.applyDimension(r5, r10, r8)
            int r8 = (int) r8
            androidx.recyclerview.widget.RecyclerView r10 = r7.recyclerView
            int r0 = r8 / 2
            r10.setPadding(r0, r4, r0, r8)
            androidx.recyclerview.widget.RecyclerView r8 = r7.recyclerView
            com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$a r10 = new com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$a
            r10.<init>(r7)
            r8.addOnScrollListener(r10)
            com.etsy.android.uikit.adapter.a<T> r8 = r7.adapter
            java.lang.String r10 = "null cannot be cast to non-null type com.etsy.android.ui.home.editorspicks.EditorsPicksAdapter"
            kotlin.jvm.internal.C19383o.m32795e(r8, r10)
            com.etsy.android.ui.home.editorspicks.d r8 = (com.etsy.android.p327ui.home.editorspicks.C9929d) r8
            int r8 = r8.getItemCount()
            if (r8 != 0) goto L_0x008b
            r7.resetAndLoadContent()
        L_0x008b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.editorspicks.EditorsPicksFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.disposables.mo19405d();
    }

    public void onLoadContent() {
        C9940h editorsPicksViewModel = getEditorsPicksViewModel();
        editorsPicksViewModel.getClass();
        C19697g.m33468f(C19388s.m32866i0(editorsPicksViewModel), (CoroutineContext) null, (CoroutineStart) null, new EditorsPicksViewModel$loadPage$1(editorsPicksViewModel, (C19340c<? super EditorsPicksViewModel$loadPage$1>) null), 3);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        C9940h editorsPicksViewModel = getEditorsPicksViewModel();
        editorsPicksViewModel.f21901c.mo45474a("cbf.home.editors_picks.share_url");
        FindsPage findsPage = editorsPicksViewModel.f21908j;
        if (findsPage != null) {
            String url = findsPage.getUrl();
            String imageUrl = findsPage.getHeroListings().isEmpty() ^ true ? ((ListingCard) C19327t.m32638T0(findsPage.getHeroListings())).getListingImage().getImageUrl() : null;
            if (C18263b.m30839d0(url)) {
                C9940h.m18145b(editorsPicksViewModel.f21902d, new C9930e.C9936f(url, imageUrl));
            }
        }
        return true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C19383o.m32797g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.menu_share);
        if (findItem != null) {
            FindsPage findsPage = getEditorsPicksViewModel().f21908j;
            findItem.setVisible(C18263b.m30839d0(findsPage != null ? findsPage.getUrl() : null));
        }
    }

    public void onRefresh() {
        this.eventsTracked.remove("finds_page");
        super.onRefresh();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19697g.m33468f(C15588c1.m25329i0(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new EditorsPicksFragment$onViewCreated$1(this, (C19340c<? super EditorsPicksFragment$onViewCreated$1>) null), 3);
        Lifecycle lifecycle = getLifecycle();
        C19383o.m32796f(lifecycle, "lifecycle");
        new HeartMonitor(lifecycle, new C9921b(this));
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setEditorPicksRepository(EditorPicksRepository editorPicksRepository2) {
        C19383o.m32797g(editorPicksRepository2, "<set-?>");
        this.editorPicksRepository = editorPicksRepository2;
    }

    public final void setEtsyConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.etsyConfigMap = cVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setListingImagesRepository(C12796e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.listingImagesRepository = eVar;
    }

    public final void setRouteInspector(C12741o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.routeInspector = oVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
