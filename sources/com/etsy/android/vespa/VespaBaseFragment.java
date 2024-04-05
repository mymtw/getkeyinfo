package com.etsy.android.vespa;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C3144f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.C3249o;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.p043ui.C4950e;
import com.etsy.android.R;
import com.etsy.android.exceptions.ThreeArmSweaterException;
import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.SignedOutMessageCard;
import com.etsy.android.lib.models.cardviewelement.LoadingCardViewElement;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.shop.C11148h;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.EmptyMessageView;
import com.etsy.android.uikit.view.SignInView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p277w8.C8264b;
import p277w8.C8266d;
import p356ge.C12790b;
import p357gf.C12796e;
import p363he.C12821d;
import p377jf.C12979a;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13181j;
import p415of.C13182k;
import p415of.C13184m;
import p415of.C13185n;
import p415of.C13186o;
import p445sf.C13379a;
import p445sf.C13380b;
import p445sf.C13381c;
import p445sf.C13382d;
import p448ta.C13387c;
import p456ua.C13461f;
import p464va.C13546a;
import p464va.C13547b;
import p464va.C13548c;
import p464va.C13552e;
import p464va.C13554f;
import p487ya.C13895a;
import p628nj.C18263b;

public abstract class VespaBaseFragment<T extends Page> extends BaseRecyclerViewListFragment<C13186o> implements C13181j, C13182k {
    private final C7091a compositeDisposable = new C7091a();
    public EmptyMessageView emptyMessageView = null;
    public boolean isEndless = true;
    public boolean isStillLoading = false;
    public SignInView signinView = null;
    private TransactionViewModel<C11869a> transactionViewModel;

    /* renamed from: com.etsy.android.vespa.VespaBaseFragment$a */
    public class C12070a extends TrackingOnClickListener {
        public C12070a() {
        }

        public final void onViewClick(View view) {
            VespaBaseFragment.this.onRefresh();
        }
    }

    /* renamed from: com.etsy.android.vespa.VespaBaseFragment$b */
    public class C12071b extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ MessageCard f26925b;

        public C12071b(MessageCard messageCard) {
            this.f26925b = messageCard;
        }

        public final void onViewClick(View view) {
            VespaBaseFragment.this.handleEmptyMessageClick(this.f26925b);
        }
    }

    /* renamed from: com.etsy.android.vespa.VespaBaseFragment$c */
    public class C12072c extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ SignedOutMessageCard f26927b;

        public C12072c(SignedOutMessageCard signedOutMessageCard) {
            this.f26927b = signedOutMessageCard;
        }

        public final void onViewClick(View view) {
            VespaBaseFragment.this.handleSignedOutMessageClick(this.f26927b);
        }
    }

    private Map<String, Object> buildBody(EtsyAssociativeArray etsyAssociativeArray) {
        HashMap hashMap = new HashMap();
        if (etsyAssociativeArray != null) {
            for (Map.Entry next : etsyAssociativeArray.getMap().entrySet()) {
                if (next.getValue() != null) {
                    if (next.getValue() instanceof EtsyAssociativeArray) {
                        hashMap.put((String) next.getKey(), buildBody((EtsyAssociativeArray) next.getValue()));
                    } else {
                        hashMap.put((String) next.getKey(), next.getValue());
                    }
                }
            }
        }
        return hashMap;
    }

    private Map<String, String> buildParams(EtsyAssociativeArray etsyAssociativeArray) {
        HashMap hashMap = new HashMap();
        if (etsyAssociativeArray != null) {
            for (Map.Entry next : buildBody(etsyAssociativeArray).entrySet()) {
                if (next.getValue() != null) {
                    hashMap.put((String) next.getKey(), next.getValue().toString());
                }
            }
        }
        return hashMap;
    }

    private Map<String, String> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(getPagination().mo46058a() != null ? getPagination().mo46058a() : new HashMap());
        hashMap.putAll(getRequestParams() != null ? getRequestParams() : new HashMap());
        return hashMap;
    }

    private void handleActionResultFailure() {
        showActionLoading(false);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            showFailureMessage(activity);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r2.equals(com.etsy.android.lib.models.apiv3.vespa.BaseServerDrivenActionResult.TYPE_REPLACE_NEXT_LINK) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        if (r1 >= getAdapter().getItemCount()) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleActionResults(com.etsy.android.vespa.PositionList r8, p464va.C13548c.C13550b r9) {
        /*
            r7 = this;
            int r8 = r8.getParentPosition()
            java.util.List<com.etsy.android.lib.models.apiv3.vespa.ListSectionActionResult> r0 = r9.f29632a
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x013c
            java.lang.Object r1 = r0.next()
            com.etsy.android.lib.models.apiv3.vespa.ListSectionActionResult r1 = (com.etsy.android.lib.models.apiv3.vespa.ListSectionActionResult) r1
            boolean r2 = r1.hasMessage()
            if (r2 == 0) goto L_0x0027
            android.view.View r2 = r7.getView()
            java.lang.String r3 = r1.getMessage()
            com.etsy.android.lib.util.C8901g0.m17336b(r2, r3)
        L_0x0027:
            java.util.List r2 = r1.getMessages()
            boolean r3 = r2.isEmpty()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x006a
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            jf.a r3 = p377jf.C12979a.C12980a.m20683a(r3)
            com.etsy.android.stylekit.views.CollageAlert$AlertType r6 = com.etsy.android.stylekit.views.CollageAlert.AlertType.SUCCESS
            r3.mo45781a(r6)
            java.lang.Object r6 = r2.get(r4)
            com.etsy.android.lib.models.MessageModel r6 = (com.etsy.android.lib.models.MessageModel) r6
            java.lang.String r6 = r6.getMessage()
            r3.mo45785e(r6)
            int r6 = r2.size()
            if (r6 <= r5) goto L_0x0061
            java.lang.Object r2 = r2.get(r5)
            com.etsy.android.lib.models.MessageModel r2 = (com.etsy.android.lib.models.MessageModel) r2
            java.lang.String r2 = r2.getMessage()
            r6 = 0
            r3.mo45782b(r2, r6)
        L_0x0061:
            r2 = 2131231349(0x7f080275, float:1.8078777E38)
            r3.mo45783c(r2)
            r3.mo45786f()
        L_0x006a:
            java.lang.String r2 = r1.getType()
            r2.getClass()
            r3 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case -1960928773: goto L_0x00b2;
                case -1411068134: goto L_0x00a7;
                case -934610812: goto L_0x009c;
                case 27439477: goto L_0x0091;
                case 1094496948: goto L_0x0086;
                case 1742801432: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            r4 = r3
            goto L_0x00bb
        L_0x007b:
            java.lang.String r4 = "remove_all_below"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0084
            goto L_0x0079
        L_0x0084:
            r4 = 5
            goto L_0x00bb
        L_0x0086:
            java.lang.String r4 = "replace"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x008f
            goto L_0x0079
        L_0x008f:
            r4 = 4
            goto L_0x00bb
        L_0x0091:
            java.lang.String r4 = "reload_page"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x009a
            goto L_0x0079
        L_0x009a:
            r4 = 3
            goto L_0x00bb
        L_0x009c:
            java.lang.String r4 = "remove"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00a5
            goto L_0x0079
        L_0x00a5:
            r4 = 2
            goto L_0x00bb
        L_0x00a7:
            java.lang.String r4 = "append"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00b0
            goto L_0x0079
        L_0x00b0:
            r4 = r5
            goto L_0x00bb
        L_0x00b2:
            java.lang.String r6 = "replace_next_link"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x00bb
            goto L_0x0079
        L_0x00bb:
            switch(r4) {
                case 0: goto L_0x0119;
                case 1: goto L_0x00eb;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00c0;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x000a
        L_0x00c0:
            int r1 = r8 + 1
            of.c r2 = r7.getAdapter()
            int r2 = r2.getItemCount()
            if (r1 >= r2) goto L_0x000a
            of.c r2 = r7.getAdapter()
            r2.removeItem((int) r1)
            goto L_0x00c0
        L_0x00d4:
            of.c r2 = r7.getAdapter()
            com.etsy.android.lib.models.cardviewelement.ListSection r1 = r1.getListSection()
            r2.replaceItem(r8, r1)
            goto L_0x000a
        L_0x00e1:
            r7.onRefresh()
            goto L_0x000a
        L_0x00e6:
            r7.removeItemAtPosition(r8)
            goto L_0x000a
        L_0x00eb:
            com.etsy.android.lib.models.cardviewelement.ListSection r1 = r1.getListSection()
            of.o r2 = r1.getHeader()
            if (r2 == 0) goto L_0x00fd
            of.c r2 = r7.getAdapter()
            r2.mo45895j(r1)
            goto L_0x0108
        L_0x00fd:
            of.c r2 = r7.getAdapter()
            java.util.List r1 = r1.getItems()
            r2.addItems(r1)
        L_0x0108:
            sf.a r1 = r7.getPagination()
            of.c r2 = r7.getAdapter()
            int r2 = r2.getItemCount()
            r1.mo46063f(r2)
            goto L_0x000a
        L_0x0119:
            sf.a r1 = r7.getPagination()
            boolean r2 = r1 instanceof p445sf.C13380b
            if (r2 == 0) goto L_0x0132
            sf.b r1 = (p445sf.C13380b) r1
            java.lang.String r2 = r9.f29633b
            of.c r3 = r7.getAdapter()
            int r3 = r3.getItemCount()
            r1.mo46065h(r3, r2)
            goto L_0x000a
        L_0x0132:
            boolean r2 = r1 instanceof p445sf.C13382d
            if (r2 == 0) goto L_0x000a
            sf.d r1 = (p445sf.C13382d) r1
            r1.f29307c = r5
            goto L_0x000a
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.vespa.VespaBaseFragment.handleActionResults(com.etsy.android.vespa.PositionList, va.c$b):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoadContent$2(C13554f fVar) throws Exception {
        if (fVar instanceof C13554f.C13556b) {
            onLoadSuccess((C13554f.C13556b) fVar);
        } else if (fVar instanceof C13554f.C13555a) {
            onLoadFailure();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoadContent$3(Throwable th) throws Exception {
        onLoadFailure();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performAction$4(PositionList positionList, C13548c cVar) throws Exception {
        if (cVar instanceof C13548c.C13550b) {
            showActionLoading(false);
            handleActionResults(positionList, (C13548c.C13550b) cVar);
        } else if (cVar instanceof C13548c.C13549a) {
            handleActionResultFailure();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performAction$5(Throwable th) throws Exception {
        handleActionResultFailure();
    }

    /* access modifiers changed from: private */
    public void lambda$startEndless$0() {
        C13173c adapter = getAdapter();
        adapter.getClass();
        adapter.addItem(new LoadingCardViewElement());
    }

    /* access modifiers changed from: private */
    public void lambda$stopEndless$1() {
        C13173c adapter = getAdapter();
        ArrayList<T> arrayList = adapter.mItems;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C13186o) arrayList.get(size)).getViewType() != R.id.view_type_loading);
        adapter.removeItem(size);
    }

    private void showFailureMessage(Activity activity) {
        C12979a a = C12979a.C12980a.m20683a(activity);
        a.f28588b.setTitleText(activity.getString(R.string.save_search_error));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_exclamation_v1);
        a.mo45786f();
    }

    public void addDelegateViewHolderFactory(C13172b bVar) {
        getAdapter().f28991c.mo45890a(bVar);
    }

    public void addPage(C13185n nVar, boolean z) {
        if (nVar != null) {
            SignedOutMessageCard signedOutMessageCard = nVar.getSignedOutMessageCard();
            MessageCard messageCard = nVar.getMessageCard();
            if (messageCard != null) {
                setServerMessage(messageCard);
            } else if (signedOutMessageCard != null) {
                String deeplinkUrl = signedOutMessageCard.getDeeplinkUrl();
                this.signinView.bind(signedOutMessageCard);
                if (C18263b.m30839d0(deeplinkUrl)) {
                    this.signinView.setButtonClickListener(new C12072c(signedOutMessageCard));
                }
            } else {
                if (z) {
                    getAdapter().clear();
                }
                C13173c adapter = getAdapter();
                adapter.getClass();
                for (C13184m j : nVar.getListSections()) {
                    adapter.mo45895j(j);
                }
                adapter.notifyDataSetChanged();
            }
        } else {
            onLoadFailure();
        }
    }

    public boolean canLoadContent() {
        return super.canLoadContent() && (getPagination().f29307c ^ true);
    }

    public final RecyclerView.C3100o createLayoutManager() {
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getAdapter().f28991c.f28990i);
        gridLayoutManager.f7008K = getAdapter().mo45896m();
        return gridLayoutManager;
    }

    public C13173c getAdapter() {
        return (C13173c) this.adapter;
    }

    public abstract String getApiUrl();

    public final String getContentUrl() {
        String str = getPagination().f29305a;
        return TextUtils.isEmpty(str) ? getApiUrl() : str;
    }

    public String getEmptyMessage() {
        return getString(R.string.empty_default);
    }

    public int getLayoutId() {
        return R.layout.fragment_vespa_recyclerview;
    }

    public int getLoadTriggerPosition() {
        return getPagination().f29306b;
    }

    public Class<T> getPageClass() {
        return Page.class;
    }

    public C13546a getPageSpec() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : getParams().entrySet()) {
            hashMap.put((String) next.getKey(), (String) next.getValue());
        }
        return new C13546a(getContentUrl(), hashMap, HttpMethod.GET);
    }

    public abstract C13379a getPagination();

    public C13547b getPerformActionSpec(IServerDrivenAction iServerDrivenAction) {
        return new C13547b(iServerDrivenAction.getPath(), buildParams(iServerDrivenAction.getParams()), HttpMethod.valueOf(iServerDrivenAction.getRequestMethod()));
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public Map<String, String> getRequestParams() {
        return null;
    }

    public C13172b getViewHolderFactory() {
        return getAdapter().f28991c;
    }

    public void handleEmptyMessageClick(MessageCard messageCard) {
        String deepLinkUrl = messageCard.getDeepLinkUrl();
        if (!TextUtils.isEmpty(deepLinkUrl)) {
            C12790b.m20430b(this, new C12821d(deepLinkUrl));
        }
    }

    public void handleSignedOutMessageClick(SignedOutMessageCard signedOutMessageCard) {
        String deeplinkUrl = signedOutMessageCard.getDeeplinkUrl();
        if (!TextUtils.isEmpty(deeplinkUrl)) {
            C12790b.m20430b(this, new C12821d(deeplinkUrl));
        }
    }

    public boolean hasRecyclerViewPadding() {
        return true;
    }

    public void hideListView() {
        this.recyclerView.setVisibility(8);
    }

    public void hideLoadingOverlay() {
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void initAdapter() {
        this.adapter = new C13173c(this, getAnalyticsContext(), this, (C13895a) null, (C8923u) null, (C12796e) null);
    }

    public void initEmptyStateViews(View view) {
        this.emptyMessageView = (EmptyMessageView) view.findViewById(R.id.empty_message_view);
        this.signinView = (SignInView) view.findViewById(R.id.signin_view);
        this.loadingView = view.findViewById(R.id.loading_view);
        EmptyMessageView emptyMessageView2 = this.emptyMessageView;
        this.emptyView = emptyMessageView2;
        this.errorView = emptyMessageView2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.transactionViewModel = C18263b.m30830Y(this, "vespa", new C11869a());
        initAdapter();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        RecyclerView.C3094l itemAnimator = this.recyclerView.getItemAnimator();
        getAdapter().f26308b = this;
        if (useConsistentRecyclerViewPadding()) {
            RecyclerView recyclerView = this.recyclerView;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.recyclerView.getPaddingBottom(), this.recyclerView.getPaddingRight(), this.recyclerView.getPaddingBottom());
        } else if (!hasRecyclerViewPadding()) {
            this.recyclerView.setPadding(0, 0, 0, 0);
        }
        if (itemAnimator instanceof C3144f0) {
            ((C3144f0) itemAnimator).f7228g = false;
        }
        return onCreateView;
    }

    public final void onLoadComplete(C13185n nVar) {
        boolean z;
        boolean z2 = false;
        setLoading(false);
        if (isRefreshing()) {
            setRefreshing(false);
            z = true;
        } else {
            SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
            if (swipeRefreshLayout == null || !swipeRefreshLayout.isRefreshing()) {
                z = false;
            } else {
                z = this.swipeRefreshLayout.isRefreshing();
                this.swipeRefreshLayout.setRefreshing(false);
            }
        }
        addPage(nVar, z);
        if (!(!isEmpty() || nVar == null || nVar.getSignedOutMessageCard() == null)) {
            z2 = true;
        }
        if (overrideLoadComplete()) {
            return;
        }
        if (z2) {
            showSignInView();
        } else if (isEmpty()) {
            showEmptyView();
        } else {
            showListView();
        }
    }

    public void onLoadContent() {
        C13552e eVar = C18263b.f40058W;
        C13461f fVar = C18263b.f40055S;
        C19208j a = eVar.mo46214a(getPageSpec());
        fVar.getClass();
        this.compositeDisposable.mo19403b(a.mo20660i(C13461f.m21235b()).mo20657f(C13461f.m21236c()).mo20658g(new C8266d(this, 8), new C13387c(this, 6)));
    }

    public void onLoadSuccess(C13554f.C13556b bVar) {
        onLoadComplete(bVar.f29640a);
        C13379a pagination = getPagination();
        if (pagination instanceof C13380b) {
            ((C13380b) pagination).mo46065h(getAdapter().getItemCount(), bVar.f29642c);
        } else if (pagination instanceof C13381c) {
            ((C13381c) pagination).mo46067h(bVar.f29641b, getAdapter().getItemCount());
        } else if (pagination instanceof C13382d) {
            ((C13382d) pagination).f29307c = true;
        }
    }

    public void onRefresh() {
        this.emptyView.setVisibility(8);
        getPagination().mo46064g();
        this.swipeRefreshLayout.setRefreshing(true);
        loadContent();
    }

    public void onResume() {
        super.onResume();
        if (isEmpty()) {
            onRefresh();
        } else {
            showListView();
        }
    }

    public void onRetry() {
        onRefresh();
    }

    public void onSaveInstanceState(Bundle bundle) {
        saveAdapterState((C11869a) this.transactionViewModel.f26405b);
        super.onSaveInstanceState(bundle);
    }

    public void onScrolledToLoadTrigger() {
        if (canLoadContent()) {
            startEndless();
        }
        loadContent();
    }

    public void onStop() {
        super.onStop();
        this.compositeDisposable.mo19405d();
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            restoreAdapterState((C11869a) this.transactionViewModel.f26405b);
        }
    }

    public boolean overrideLoadComplete() {
        return false;
    }

    public void performAction(PositionList positionList, IServerDrivenAction iServerDrivenAction) {
        C13552e eVar = C18263b.f40058W;
        C13461f fVar = C18263b.f40055S;
        C19208j b = eVar.mo46215b(getPerformActionSpec(iServerDrivenAction));
        fVar.getClass();
        ConsumerSingleObserver g = b.mo20660i(C13461f.m21235b()).mo20657f(C13461f.m21236c()).mo20658g(new C11148h(this, positionList, 1), new C8264b(this, 10));
        if (iServerDrivenAction.isImmediatelyRemovable()) {
            getAdapter().removeItem(positionList.getParentPosition());
        }
        if (iServerDrivenAction.getRefreshNeeded()) {
            showActionLoading(true);
        }
        this.compositeDisposable.mo19403b(g);
    }

    public void performActionWithToast(PositionList positionList, IServerDrivenAction iServerDrivenAction, int i) {
        C8901g0.m17337c(getContext(), i);
        performAction(positionList, iServerDrivenAction);
    }

    public void removeItemAtPosition(int i) {
        getAdapter().removeItem(i);
    }

    public void resetAndLoadContent() {
        getPagination().mo46064g();
        setLoading(false);
        loadContent();
    }

    public void restoreAdapterState(C11869a aVar) {
        getAdapter().mo31809n(aVar);
        getPagination().mo46062e(aVar);
    }

    public void saveAdapterState(C11869a aVar) {
        getAdapter().mo31810o(aVar);
        getPagination().mo46060c(aVar);
    }

    public void setLoading(boolean z) {
        super.setLoading(z);
        if (!z) {
            stopEndless();
        }
    }

    public void setServerMessage(MessageCard messageCard) {
        EmptyMessageView emptyMessageView2;
        if (messageCard != null && (emptyMessageView2 = this.emptyMessageView) != null) {
            emptyMessageView2.bind(messageCard);
            if (messageCard.isTryAgain()) {
                this.emptyMessageView.setButtonClickListener(new C12070a());
            } else if (!TextUtils.isEmpty(messageCard.getDeepLinkUrl())) {
                this.emptyMessageView.setButtonClickListener(new C12071b(messageCard));
            }
        }
    }

    public void showActionLoading(boolean z) {
        this.isStillLoading = z;
        if (z) {
            showLoadingOverlay();
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null) {
                recyclerView.setAlpha(0.5f);
                return;
            }
            return;
        }
        hideLoadingOverlay();
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAlpha(1.0f);
        }
    }

    public void showEmptyView() {
        View view = this.loadingView;
        if (view != null && this.recyclerView != null && this.emptyView != null) {
            view.setVisibility(8);
            this.recyclerView.setVisibility(8);
            this.emptyView.setVisibility(0);
            SignInView signInView = this.signinView;
            if (signInView != null) {
                signInView.setVisibility(8);
            }
        }
    }

    public void showErrorView() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null && this.emptyMessageView != null) {
            swipeRefreshLayout.setRefreshing(false);
            this.emptyMessageView.setTitle((int) R.string.loading_problem);
            this.emptyMessageView.setSubtitle((int) R.string.please_try_again);
            this.emptyMessageView.setImage(R.drawable.error_sorry_girl);
            this.emptyMessageView.setTryAgain();
            CrashUtil.m17307a().mo30457b(new ThreeArmSweaterException(this.emptyMessageView.getContext()));
            showEmptyView();
        }
    }

    public void showListView() {
        View view = this.loadingView;
        if (view != null && this.recyclerView != null && this.emptyView != null && this.signinView != null) {
            if (!this.isStillLoading) {
                view.setVisibility(8);
            }
            this.recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            this.signinView.setVisibility(8);
        }
    }

    public void showLoadingOverlay() {
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Deprecated
    public final void showLoadingView() {
    }

    public void showSignInView() {
        View view = this.loadingView;
        if (view != null && this.recyclerView != null && this.emptyView != null && this.signinView != null) {
            view.setVisibility(8);
            this.recyclerView.setVisibility(8);
            this.emptyView.setVisibility(8);
            this.signinView.setVisibility(0);
        }
    }

    public void startEndless() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && this.isEndless) {
            recyclerView.post(new C3249o(this, 1));
        }
    }

    public void stopEndless() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && this.isEndless) {
            recyclerView.post(new C4950e(this, 5));
        }
    }

    public boolean useConsistentRecyclerViewPadding() {
        return false;
    }

    public void onLoadSuccess(List list, int i) {
        throw new UnsupportedOperationException("Use the onLoadSuccess() methods defined in CardRecyclerViewBaseFragment instead of this base class method.");
    }

    public void onLoadSuccess(C13185n nVar, String str) {
        onLoadComplete(nVar);
        getPagination().mo46061d(getAdapter().getItemCount(), str);
    }

    public void onLoadSuccess(C13185n nVar, int i) {
        onLoadComplete(nVar);
        getPagination().mo46061d(getAdapter().getItemCount(), Integer.valueOf(i));
    }

    public void onLoadSuccess(C13185n nVar) {
        onLoadComplete(nVar);
        getPagination().mo46061d(getAdapter().getItemCount(), (Object) null);
    }
}
