package com.braze.p044ui.contentcards;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C3128b;
import androidx.recyclerview.widget.C3144f0;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3185q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.p044ui.contentcards.adapters.C5637c;
import com.braze.p044ui.contentcards.adapters.ContentCardAdapter;
import com.braze.p044ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.p044ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.p044ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.p044ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19729m;
import p030bo.app.C4284x6;
import p030bo.app.C4308y6;
import p091e4.C6715a;
import p091e4.C6717c;
import p301z3.C8433c;
import p301z3.C8434d;
import p301z3.C8437g;

/* renamed from: com.braze.ui.contentcards.ContentCardsFragment */
public class ContentCardsFragment extends Fragment implements SwipeRefreshLayout.C3293j {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    public static final C5633a Companion = new C5633a();
    private static final String KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY = "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY";
    private static final String LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY = "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY";
    private static final int MAX_CONTENT_CARDS_TTL_SECONDS = 60;
    private static final long NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY = "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY";
    private static final String VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY = "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY";
    public ContentCardAdapter cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private C8434d<C8433c> contentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler customContentCardUpdateHandler;
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();
    private C5637c defaultEmptyContentCardsAdapter = new C5637c();
    private C19699g1 networkUnavailableJob;
    private C8434d<C8437g> sdkDataWipeEventSubscriber;

    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$a */
    public static final class C5633a {
    }

    /* access modifiers changed from: private */
    /* renamed from: onResume$lambda-0  reason: not valid java name */
    public static final void m34831onResume$lambda0(ContentCardsFragment contentCardsFragment, C8433c cVar) {
        C19383o.m32797g(contentCardsFragment, "this$0");
        C19383o.m32797g(cVar, "event");
        contentCardsFragment.handleContentCardsUpdatedEvent(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onResume$lambda-2  reason: not valid java name */
    public static final void m34832onResume$lambda2(ContentCardsFragment contentCardsFragment, C8437g gVar) {
        C19383o.m32797g(contentCardsFragment, "this$0");
        C19383o.m32797g(gVar, "it");
        contentCardsFragment.handleContentCardsUpdatedEvent(new C8433c(EmptyList.INSTANCE, (String) null, true, DateTimeUtils.m11302d()));
    }

    public final void attachSwipeHelperCallback() {
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            new C3185q(new C6717c(contentCardAdapter)).mo11917f(getContentCardsRecyclerView());
        }
    }

    public final Object contentCardsUpdate(C8433c cVar, C19340c<? super C19394m> cVar2) {
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardsFragment$contentCardsUpdate$2(cVar), 6);
        List<Card> handleCardUpdate = getContentCardUpdateHandler().handleCardUpdate(cVar);
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            synchronized (contentCardAdapter) {
                C19383o.m32797g(handleCardUpdate, "newCardData");
                C3167n.C3171d a = C3167n.m7760a(new ContentCardAdapter.C5634a(contentCardAdapter.f12039d, handleCardUpdate));
                contentCardAdapter.f12039d.clear();
                contentCardAdapter.f12039d.addAll(handleCardUpdate);
                a.mo11899a(new C3128b(contentCardAdapter));
            }
        }
        C19699g1 networkUnavailableJob2 = getNetworkUnavailableJob();
        if (networkUnavailableJob2 != null) {
            networkUnavailableJob2.mo72134a((CancellationException) null);
        }
        setNetworkUnavailableJob((C19699g1) null);
        if (cVar.f18450d) {
            if (TimeUnit.SECONDS.toMillis(cVar.f18449c + 60) < System.currentTimeMillis()) {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, ContentCardsFragment$contentCardsUpdate$3.INSTANCE, 6);
                Braze.Companion companion = Braze.f11170m;
                Context requireContext = requireContext();
                C19383o.m32796f(requireContext, "requireContext()");
                companion.mo15515f(requireContext).mo15509y(false);
                if (handleCardUpdate.isEmpty()) {
                    SwipeRefreshLayout contentCardsSwipeLayout2 = getContentCardsSwipeLayout();
                    if (contentCardsSwipeLayout2 != null) {
                        contentCardsSwipeLayout2.setRefreshing(true);
                    }
                    BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, ContentCardsFragment$contentCardsUpdate$4.INSTANCE, 7);
                    C19699g1 networkUnavailableJob3 = getNetworkUnavailableJob();
                    if (networkUnavailableJob3 != null) {
                        networkUnavailableJob3.mo72134a((CancellationException) null);
                    }
                    setNetworkUnavailableJob(BrazeCoroutineScope.f11696b.mo15906b(new Long(5000), C19729m.f43681a, new ContentCardsFragment$contentCardsUpdate$5(this, (C19340c<? super ContentCardsFragment$contentCardsUpdate$5>) null)));
                    return C19394m.f43287a;
                }
            }
        }
        if (!handleCardUpdate.isEmpty()) {
            ContentCardAdapter contentCardAdapter2 = this.cardAdapter;
            if (contentCardAdapter2 != null) {
                swapRecyclerViewAdapter(contentCardAdapter2);
            }
        } else {
            swapRecyclerViewAdapter(getEmptyCardsAdapter());
        }
        SwipeRefreshLayout contentCardsSwipeLayout3 = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout3 != null) {
            contentCardsSwipeLayout3.setRefreshing(false);
        }
        return C19394m.f43287a;
    }

    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    public final C8434d<C8433c> getContentCardsUpdatedSubscriber() {
        return this.contentCardsUpdatedSubscriber;
    }

    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    public final IContentCardsUpdateHandler getCustomContentCardUpdateHandler() {
        return this.customContentCardUpdateHandler;
    }

    public final IContentCardsViewBindingHandler getCustomContentCardsViewBindingHandler() {
        return this.customContentCardsViewBindingHandler;
    }

    public final IContentCardsUpdateHandler getDefaultContentCardUpdateHandler() {
        return this.defaultContentCardUpdateHandler;
    }

    public final IContentCardsViewBindingHandler getDefaultContentCardsViewBindingHandler() {
        return this.defaultContentCardsViewBindingHandler;
    }

    public final C5637c getDefaultEmptyContentCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final RecyclerView.Adapter<?> getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final C19699g1 getNetworkUnavailableJob() {
        return this.networkUnavailableJob;
    }

    public final C8434d<C8437g> getSdkDataWipeEventSubscriber() {
        return this.sdkDataWipeEventSubscriber;
    }

    public final void handleContentCardsUpdatedEvent(C8433c cVar) {
        C19383o.m32797g(cVar, "event");
        C19697g.m33468f(BrazeCoroutineScope.f11696b, C19729m.f43681a, (CoroutineStart) null, new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this, cVar, (C19340c<? super ContentCardsFragment$handleContentCardsUpdatedEvent$1>) null), 2);
    }

    public final void initializeRecyclerView() {
        getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(requireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        RecyclerView.C3094l itemAnimator = recyclerView3 == null ? null : recyclerView3.getItemAnimator();
        if (itemAnimator instanceof C3144f0) {
            ((C3144f0) itemAnimator).f7228g = false;
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            recyclerView4.addItemDecoration(new C6715a(requireContext2));
        }
    }

    public final Object networkUnavailable(C19340c<? super C19394m> cVar) {
        Context applicationContext;
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, ContentCardsFragment$networkUnavailable$2.INSTANCE, 6);
        Context context = getContext();
        if (!(context == null || (applicationContext = context.getApplicationContext()) == null)) {
            Toast.makeText(applicationContext, applicationContext.getString(C4940R.string.com_appboy_feed_connection_error_title), 1).show();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout contentCardsSwipeLayout2 = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout2 != null) {
            contentCardsSwipeLayout2.setRefreshing(false);
        }
        return C19394m.f43287a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C4940R.C4943layout.com_braze_content_cards, viewGroup, false);
        this.contentCardsRecyclerView = (RecyclerView) inflate.findViewById(C4940R.C4942id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C4940R.C4942id.appboy_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(C4940R.color.com_braze_content_cards_swipe_refresh_color_1, C4940R.color.com_braze_content_cards_swipe_refresh_color_2, C4940R.color.com_braze_content_cards_swipe_refresh_color_3, C4940R.color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return inflate;
    }

    public void onPause() {
        super.onPause();
        Braze.Companion companion = Braze.f11170m;
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        companion.mo15515f(requireContext).mo15491d(this.contentCardsUpdatedSubscriber, C8433c.class);
        Context requireContext2 = requireContext();
        C19383o.m32796f(requireContext2, "requireContext()");
        companion.mo15515f(requireContext2).mo15491d(this.sdkDataWipeEventSubscriber, C8437g.class);
        C19699g1 g1Var = this.networkUnavailableJob;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.mo16243l();
        }
    }

    public void onRefresh() {
        Braze.Companion companion = Braze.f11170m;
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        companion.mo15515f(requireContext).mo15509y(false);
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.f11696b;
        BrazeCoroutineScope.m11007c(Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS), new ContentCardsFragment$onRefresh$1(this, (C19340c<? super ContentCardsFragment$onRefresh$1>) null));
    }

    public void onResume() {
        Class<C8437g> cls = C8437g.class;
        super.onResume();
        Braze.Companion companion = Braze.f11170m;
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        companion.mo15515f(requireContext).mo15491d(this.contentCardsUpdatedSubscriber, C8433c.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new C4284x6(this, 2);
        }
        C8434d<C8433c> dVar = this.contentCardsUpdatedSubscriber;
        if (dVar != null) {
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            companion.mo15515f(requireContext2).mo15486C(dVar);
        }
        Context requireContext3 = requireContext();
        C19383o.m32796f(requireContext3, "requireContext()");
        companion.mo15515f(requireContext3).mo15509y(true);
        Context requireContext4 = requireContext();
        C19383o.m32796f(requireContext4, "requireContext()");
        companion.mo15515f(requireContext4).mo15491d(this.sdkDataWipeEventSubscriber, cls);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new C4308y6(this, 2);
        }
        C8434d<C8437g> dVar2 = this.sdkDataWipeEventSubscriber;
        if (dVar2 != null) {
            Context requireContext5 = requireContext();
            C19383o.m32796f(requireContext5, "requireContext()");
            companion.mo15515f(requireContext5).mo15494i(dVar2);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        RecyclerView.C3100o layoutManager;
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            bundle.putParcelable(LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, layoutManager.mo11306k0());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            bundle.putStringArrayList(KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY, new ArrayList(C19327t.m32660p1(contentCardAdapter.f12042g)));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            bundle.putParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            bundle.putParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsUpdateHandler);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            int i = Build.VERSION.SDK_INT;
            IContentCardsUpdateHandler iContentCardsUpdateHandler = i >= 33 ? (IContentCardsUpdateHandler) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsUpdateHandler.class) : (IContentCardsUpdateHandler) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            IContentCardsViewBindingHandler iContentCardsViewBindingHandler = i >= 33 ? (IContentCardsViewBindingHandler) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsViewBindingHandler.class) : (IContentCardsViewBindingHandler) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            C19697g.m33468f(BrazeCoroutineScope.f11696b, C19760n0.m33702a(), (CoroutineStart) null, new ContentCardsFragment$onViewStateRestored$1(bundle, this, (C19340c<? super ContentCardsFragment$onViewStateRestored$1>) null), 2);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public final void setContentCardsRecyclerView(RecyclerView recyclerView) {
        this.contentCardsRecyclerView = recyclerView;
    }

    public final void setContentCardsSwipeLayout(SwipeRefreshLayout swipeRefreshLayout) {
        this.contentCardsSwipeLayout = swipeRefreshLayout;
    }

    public final void setContentCardsUpdatedSubscriber(C8434d<C8433c> dVar) {
        this.contentCardsUpdatedSubscriber = dVar;
    }

    public final void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public final void setCustomContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public final void setCustomContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public final void setDefaultEmptyContentCardsAdapter(C5637c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.defaultEmptyContentCardsAdapter = cVar;
    }

    public final void setNetworkUnavailableJob(C19699g1 g1Var) {
        this.networkUnavailableJob = g1Var;
    }

    public final void setSdkDataWipeEventSubscriber(C8434d<C8437g> dVar) {
        this.sdkDataWipeEventSubscriber = dVar;
    }

    public final void swapRecyclerViewAdapter(RecyclerView.Adapter<?> adapter) {
        C19383o.m32797g(adapter, "newAdapter");
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && recyclerView.getAdapter() != adapter) {
            recyclerView.setAdapter(adapter);
        }
    }
}
