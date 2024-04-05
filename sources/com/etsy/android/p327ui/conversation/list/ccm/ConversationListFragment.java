package com.etsy.android.p327ui.conversation.list.ccm;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.compose.p015ui.platform.C1858o;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.exceptions.ThreeArmSweaterException;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C11330u;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.conversation.list.ccm.C9587h;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.C9075u;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageEmptyStateView;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import com.etsy.android.stylekit.views.ratings.C9072a;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.viewholder.ItemDividerDecoration;
import com.etsy.android.util.C12061r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p354gc.C12763b;
import p356ge.C12790b;
import p377jf.C12979a;
import p440s9.C13366a;
import p486y9.C13888d;
import p568fn.C17782b;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListFragment */
public final class ConversationListFragment extends TrackingBaseFragment implements C9731e0.C9733b, C13366a, C11324t.C11329b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C13888d currentLocale;
    private CollageEmptyStateView emptyStateView;
    private ConversationListAdapter listAdapter;
    private LoadingIndicatorView loadingIndicator;
    public C8951c qualtricsWrapper;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(ConversationListViewModel.class), new ConversationListFragment$special$$inlined$viewModels$default$2(new ConversationListFragment$special$$inlined$viewModels$default$1(this)), new ConversationListFragment$viewModel$2(this));
    public C19011a<ConversationListViewModel> viewModelProvider;

    /* access modifiers changed from: private */
    public final ConversationListViewModel getViewModel() {
        return (ConversationListViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleViewState(C9587h hVar) {
        if (C19383o.m32792b(hVar, C9587h.C9588a.f21257a)) {
            stopLoadingIndicators();
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 != null) {
                ViewExtensions.m12860d(recyclerView2);
            }
            showEmptyView();
        } else if (C19383o.m32792b(hVar, C9587h.C9589b.f21258a)) {
            stopLoadingIndicators();
            RecyclerView recyclerView3 = this.recyclerView;
            if (recyclerView3 != null) {
                ViewExtensions.m12860d(recyclerView3);
            }
            showErrorView();
        } else if (hVar instanceof C9587h.C9590c) {
            if (!((C9587h.C9590c) hVar).f21259a) {
                ConversationListAdapter conversationListAdapter = this.listAdapter;
                if (conversationListAdapter == null) {
                    C19383o.m32805o("listAdapter");
                    throw null;
                } else if (conversationListAdapter.getItemCount() == 0) {
                    CollageEmptyStateView collageEmptyStateView = this.emptyStateView;
                    if (collageEmptyStateView != null) {
                        ViewExtensions.m12860d(collageEmptyStateView);
                    }
                    RecyclerView recyclerView4 = this.recyclerView;
                    if (recyclerView4 != null) {
                        ViewExtensions.m12860d(recyclerView4);
                    }
                    LoadingIndicatorView loadingIndicatorView = this.loadingIndicator;
                    if (loadingIndicatorView != null) {
                        ViewExtensions.m12869m(loadingIndicatorView);
                    }
                }
            }
        } else if (hVar instanceof C9587h.C9591d) {
            ConversationListAdapter conversationListAdapter2 = this.listAdapter;
            if (conversationListAdapter2 != null) {
                conversationListAdapter2.mo11950j(((C9587h.C9591d) hVar).f21260a);
                RecyclerView recyclerView5 = this.recyclerView;
                if (recyclerView5 != null) {
                    ViewExtensions.m12869m(recyclerView5);
                }
                stopLoadingIndicators();
                return;
            }
            C19383o.m32805o("listAdapter");
            throw null;
        }
    }

    private final void initializeSearchBar() {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        if (requireActivity instanceof BOEActivity) {
            C8703p analyticsContext = getAnalyticsContext();
            C19383o.m32796f(analyticsContext, "analyticsContext");
            String string = requireActivity.getString(R.string.messages_search_hint);
            C19383o.m32796f(string, "activity.getString(R.string.messages_search_hint)");
            new C10866i(requireActivity, analyticsContext, string, ((BOEActivity) requireActivity).getAppBarHelper(), new C9075u(this, 1), (SearchView.C0283l) null, new C9581e(), (C9072a) null, (C9053d) null, 832).mo36072d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initializeSearchBar$lambda-2  reason: not valid java name */
    public static final void m34955initializeSearchBar$lambda2(ConversationListFragment conversationListFragment, View view, boolean z) {
        C19383o.m32797g(conversationListFragment, "this$0");
        if (z) {
            conversationListFragment.getAnalyticsContext().mo21333d("messages_search_focused", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initializeSearchBar$lambda-3  reason: not valid java name */
    public static final void m34956initializeSearchBar$lambda3(View view) {
    }

    /* access modifiers changed from: private */
    public final void launchConversation(C12763b bVar) {
        C12790b.m20430b(this, new ConversationDetailsNavigationKey(C12790b.m20432d(this), (Bundle) null, Long.valueOf(bVar.f28208b.f28262d), (String) null, bVar.f28208b.f28259a, (Long) null, false, true, (String) null, false, 874, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m34957onViewCreated$lambda0(ConversationListFragment conversationListFragment) {
        C19383o.m32797g(conversationListFragment, "this$0");
        conversationListFragment.getViewModel().mo32203c(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m34958onViewCreated$lambda1(ConversationListFragment conversationListFragment, C9587h hVar) {
        C19383o.m32797g(conversationListFragment, "this$0");
        C19383o.m32796f(hVar, "it");
        conversationListFragment.handleViewState(hVar);
    }

    private final void showEmptyView() {
        CollageEmptyStateView collageEmptyStateView = this.emptyStateView;
        if (collageEmptyStateView != null) {
            collageEmptyStateView.setIconDrawable((int) R.drawable.clg_icon_brand_chatconvos_fill_v2);
            collageEmptyStateView.setTitleText((int) R.string.conversations_empty_title);
            collageEmptyStateView.setBodyText((int) R.string.conversations_empty_message);
            collageEmptyStateView.setPrimaryButtonText((String) null);
            ViewExtensions.m12869m(collageEmptyStateView);
        }
    }

    /* access modifiers changed from: private */
    public final void showErrorAlert(int i) {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(getResources().getString(i));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
        a.mo45786f();
    }

    private final void showErrorView() {
        CollageEmptyStateView collageEmptyStateView = this.emptyStateView;
        if (collageEmptyStateView != null) {
            collageEmptyStateView.setIconDrawable((int) R.drawable.clg_icon_brand_alert_v2);
            collageEmptyStateView.setTitleText((int) R.string.conversation_error_state_title);
            collageEmptyStateView.setBodyText((String) null);
            collageEmptyStateView.setPrimaryButtonText((int) R.string.try_again);
            collageEmptyStateView.setPrimaryButtonOnClickListener(new C9053d(this, 1));
            ThreeArmSweaterException.Companion companion = ThreeArmSweaterException.Companion;
            Context context = collageEmptyStateView.getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            companion.getClass();
            ThreeArmSweaterException.Companion.m12856a(context);
            ViewExtensions.m12869m(collageEmptyStateView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showErrorView$lambda-6$lambda-5  reason: not valid java name */
    public static final void m34959showErrorView$lambda6$lambda5(ConversationListFragment conversationListFragment, View view) {
        C19383o.m32797g(conversationListFragment, "this$0");
        conversationListFragment.getViewModel().mo32203c(false);
    }

    private final void stopLoadingIndicators() {
        LoadingIndicatorView loadingIndicatorView = this.loadingIndicator;
        if (loadingIndicatorView != null) {
            ViewExtensions.m12860d(loadingIndicatorView);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
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

    public C11324t.C11325a getBottomTabsOverrides() {
        return C11324t.C11325a.C11326a.f24988c;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.conversations;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8951c getQualtricsWrapper() {
        C8951c cVar = this.qualtricsWrapper;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("qualtricsWrapper");
        throw null;
    }

    public int getTab() {
        return R.id.menu_bottom_nav_you;
    }

    public String getTrackingName() {
        return "conversations";
    }

    public final C19011a<ConversationListViewModel> getViewModelProvider() {
        C19011a<ConversationListViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("viewModelProvider");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.listAdapter = new ConversationListAdapter(new ConversationListFragment$onCreate$3(this), new ConversationListFragment$onCreate$1(this), new ConversationListFragment$onCreate$2(this));
        getViewModel().mo32203c(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        menuInflater.inflate(R.menu.menu_conversation_list, menu);
        boolean b = getConfigMap().mo21132b(C8592b.C8595c.f18859c);
        MenuItem findItem = menu.findItem(R.id.menu_new_message);
        if (findItem != null) {
            findItem.setVisible(!b);
        }
        MenuItem findItem2 = menu.findItem(R.id.menu_search_messages);
        if (findItem2 != null) {
            findItem2.setVisible(false);
        }
        View findViewById = requireActivity().findViewById(R.id.menu_search_messages);
        if (findViewById != null) {
            findViewById.setAlpha(1.0f);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_conversation_list, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…n_list, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        this.swipeRefreshLayout = null;
        this.recyclerView = null;
        this.emptyStateView = null;
        this.loadingIndicator = null;
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_search_messages) {
            return super.onOptionsItemSelected(menuItem);
        }
        View findViewById = requireActivity().findViewById(R.id.menu_search_messages);
        if (findViewById != null) {
            findViewById.animate().setDuration(300).alpha(0.0f).withEndAction(new C1858o(findViewById, 3)).start();
        }
        initializeSearchBar();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C8951c qualtricsWrapper2 = getQualtricsWrapper();
        String locale = getCurrentLocale().mo46719c().toString();
        C19383o.m32796f(locale, "currentLocale.getSystemLocale().toString()");
        qualtricsWrapper2.mo30561a(C17782b.m29865e0(new C8952d.C8961i(locale, 0), C8952d.C8953a.f19751c));
        getQualtricsWrapper().mo30562b(new ConversationListFragment$onViewCreated$1(this));
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.swipeRefreshLayout = swipeRefreshLayout2;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnRefreshListener(new C9579c(this));
        }
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.recyclerView = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new ItemDividerDecoration(requireContext()));
        }
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(new C11330u());
        }
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 != null) {
            ConversationListAdapter conversationListAdapter = this.listAdapter;
            if (conversationListAdapter != null) {
                recyclerView4.setAdapter(conversationListAdapter);
            } else {
                C19383o.m32805o("listAdapter");
                throw null;
            }
        }
        this.emptyStateView = (CollageEmptyStateView) view.findViewById(R.id.empty_state_view);
        this.loadingIndicator = (LoadingIndicatorView) view.findViewById(R.id.loading_indicator);
        getViewModel().f21237e.observe(getViewLifecycleOwner(), new C9580d(this, 0));
        getViewModel().f21239g.observe(getViewLifecycleOwner(), new C12061r(new ConversationListFragment$onViewCreated$4(this)));
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setQualtricsWrapper(C8951c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.qualtricsWrapper = cVar;
    }

    public final void setViewModelProvider(C19011a<ConversationListViewModel> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.viewModelProvider = aVar;
    }
}
