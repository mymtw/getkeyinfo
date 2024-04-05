package com.etsy.android.p327ui.conversation.list.legacy;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.conversation.list.C9569a;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LegacyConversationDetailsNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.viewholder.ItemDividerDecoration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p251u1.C8115a;
import p354gc.C12760a;
import p354gc.C12763b;
import p356ge.C12788a;
import p356ge.C12790b;
import p377jf.C12979a;
import p456ua.C13461f;
import p486y9.C13888d;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.LegacyConversationListFragment */
public final class LegacyConversationListFragment extends BaseRecyclerViewListFragment<C12760a> implements C9569a, C9731e0.C9733b, C11324t.C11329b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final LegacyConversationListFragment$convoActionBroadcastReceiver$1 convoActionBroadcastReceiver;
    private final C13888d currentLocale;
    /* access modifiers changed from: private */
    public boolean needsRefresh;
    /* access modifiers changed from: private */
    public final LegacyConversationListPresenter presenter;
    private final C8951c qualtricsWrapper;

    public LegacyConversationListFragment(LegacyConversationListPresenter legacyConversationListPresenter, C8951c cVar, C13888d dVar) {
        C19383o.m32797g(legacyConversationListPresenter, "presenter");
        C19383o.m32797g(cVar, "qualtricsWrapper");
        C19383o.m32797g(dVar, "currentLocale");
        this.presenter = legacyConversationListPresenter;
        this.qualtricsWrapper = cVar;
        this.currentLocale = dVar;
        this.convoActionBroadcastReceiver = new LegacyConversationListFragment$convoActionBroadcastReceiver$1(this);
        legacyConversationListPresenter.f21269e = this;
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

    public void addItemsToAdapter(List<? extends C12760a> list) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        this.adapter.addItems(list);
    }

    public C11324t.C11325a getBottomTabsOverrides() {
        return C11324t.C11325a.C11326a.f24988c;
    }

    public int getFragmentTitle() {
        return R.string.conversations;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public int getTab() {
        return R.id.menu_bottom_nav_you;
    }

    public String getTrackingName() {
        return "conversations";
    }

    public void launchConversation(C12763b bVar) {
        C19383o.m32797g(bVar, ResponseConstants.CONVO);
        C12790b.m20430b(this, new LegacyConversationDetailsNavigationKey(C12790b.m20432d(this), bVar.f28207a, false));
    }

    public void navigateToUserWebView(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "userId");
        C12788a.m20424c(getActivity(), new UserProfileKey(C19421p.m32935c0(getActivity()), etsyId, (Bundle) null, 4, (DefaultConstructorMarker) null));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.adapter = new LegacyConversationAdapter(getActivity(), new LegacyConversationListFragment$onCreate$1(this), new LegacyConversationListFragment$onCreate$2(this), new LegacyConversationListFragment$onCreate$3(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.etsy.android.convos.NEEDS_REFRESH");
        intentFilter.addAction("com.etsy.android.convos.MESSAGE_SENT");
        C8115a.m16322a(requireContext()).mo20708b(this.convoActionBroadcastReceiver, intentFilter);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        menuInflater.inflate(R.menu.menu_conversation_list_legacy, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        this.recyclerView.addItemDecoration(new ItemDividerDecoration(requireContext()));
        C8951c cVar = this.qualtricsWrapper;
        String locale = this.currentLocale.mo46719c().toString();
        C19383o.m32796f(locale, "currentLocale.getSystemLocale().toString()");
        cVar.mo30561a(C17782b.m29865e0(new C8952d.C8961i(locale, 0), C8952d.C8953a.f19751c));
        this.qualtricsWrapper.mo30562b(new LegacyConversationListFragment$onCreateView$1(this));
        return onCreateView;
    }

    public void onDestroy() {
        C8115a.m16322a(requireContext()).mo20710d(this.convoActionBroadcastReceiver);
        super.onDestroy();
    }

    public void onLoadContent() {
        this.needsRefresh = false;
        if (this.adapter.getDataItemCount() > 0 && isRefreshing()) {
            this.adapter.clear();
            this.presenter.f21272h = null;
        }
        this.presenter.mo32219b();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_new_message) {
            return super.onOptionsItemSelected(menuItem);
        }
        C12788a.m20424c(getActivity(), new ConversationComposeNavigationKey(C19421p.m32935c0(getActivity()), false, (String) null, (String) null, (Long) null, (String) null, (String) null, false, (Bundle) null, 510, (DefaultConstructorMarker) null));
        return true;
    }

    public void onStart() {
        super.onStart();
        if (this.needsRefresh) {
            this.needsRefresh = false;
            refreshConvos();
        } else if (canLoadContent() && isEmpty()) {
            loadContent();
        }
        LegacyConversationListPresenter legacyConversationListPresenter = this.presenter;
        C19179q a = legacyConversationListPresenter.f21267c.mo32082a();
        legacyConversationListPresenter.f21266b.getClass();
        ObservableSubscribeOn i = a.mo20639i(C13461f.m21235b());
        legacyConversationListPresenter.f21266b.getClass();
        legacyConversationListPresenter.f21273i = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new LegacyConversationListPresenter$startListeningForNotifications$1(legacyConversationListPresenter), new LegacyConversationListPresenter$startListeningForNotifications$2(legacyConversationListPresenter), 2);
    }

    public void onStop() {
        LambdaObserver lambdaObserver = this.presenter.f21273i;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        super.onStop();
    }

    public void refreshConvos() {
        setRefreshing(true);
        loadContent();
    }

    public void showErrorSnackbar(int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C12979a a = C12979a.C12980a.m20683a(activity);
            a.mo45785e(getResources().getString(i));
            a.mo45781a(CollageAlert.AlertType.ERROR);
            a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
            a.mo45786f();
        }
    }

    public void stopRefreshing() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        setLoading(false);
        setRefreshing(false);
    }
}
