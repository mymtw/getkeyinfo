package com.etsy.android.p327ui.user.circles;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.user.circles.CirclesViewModel;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p425q9.C13265p;
import p440s9.C13366a;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.user.circles.CirclesFragment */
public final class CirclesFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C11495c circledUserAdapter = new C11495c();
    private Button emptyButton;
    private ImageView emptyImage;
    private TextView emptySubtext;
    private TextView emptyText;
    private View emptyView;
    private View errorView;
    private final C19285c isTypeFollowing$delegate = C19350d.m32677b(new CirclesFragment$isTypeFollowing$2(this));
    private View loadingView;
    private RecyclerView recyclerView;
    private View retryButton;
    public C13265p session;
    private SwipeRefreshLayout swipeRefreshLayout;
    private final C19285c userId$delegate = C19350d.m32677b(new CirclesFragment$userId$2(this));
    private final C19285c userLoginName$delegate = C19350d.m32677b(new CirclesFragment$userLoginName$2(this));
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(CirclesViewModel.class), new CirclesFragment$special$$inlined$viewModels$default$2(new CirclesFragment$special$$inlined$viewModels$default$1(this)), new CirclesFragment$viewModel$2(this));
    public C19011a<CirclesViewModel> viewModelProvider;

    /* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$a */
    public static final class C11493a extends C3167n.C3172e<C11506a> {

        /* renamed from: a */
        public static final C11493a f25363a = new C11493a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C11506a) obj, (C11506a) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((C11506a) obj).f25386a, ((C11506a) obj2).f25386a);
        }
    }

    /* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$b */
    public final class C11494b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final View f25364b;

        /* renamed from: c */
        public final TextView f25365c;

        /* renamed from: d */
        public final TextView f25366d;

        /* renamed from: e */
        public final LinearLayout f25367e;

        /* renamed from: f */
        public final ImageView f25368f;

        public C11494b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.click_region);
            C19383o.m32796f(findViewById, "itemView.findViewById(R.id.click_region)");
            this.f25364b = findViewById;
            View findViewById2 = view.findViewById(R.id.title);
            C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.title)");
            this.f25365c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.subtitle);
            C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.subtitle)");
            this.f25366d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.image_layout);
            C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.image_layout)");
            this.f25367e = (LinearLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.avatar);
            C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.avatar)");
            this.f25368f = (ImageView) findViewById5;
        }
    }

    /* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$c */
    public final class C11495c extends C3200w<C11506a, C11494b> {
        public C11495c() {
            super(C11493a.f25363a);
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C11494b bVar = (C11494b) b0Var;
            C19383o.m32797g(bVar, "holder");
            C11506a aVar = (C11506a) getItem(i);
            C19383o.m32796f(aVar, "circledUser");
            LogCatKt.m17045a().mo21310e("CircledUserHolder.bindCircledUser(" + aVar + ')');
            bVar.f25365c.setText(aVar.f25388c);
            TextView textView = bVar.f25366d;
            Resources resources = CirclesFragment.this.getResources();
            int i2 = aVar.f25389d;
            textView.setText(resources.getQuantityString(R.plurals.follower_counts, i2, new Object[]{C8885d0.m17318b((double) i2)}));
            bVar.f25368f.setVisibility(0);
            C0114h.m272C0(bVar.f25368f).load(aVar.f25390e).mo46137e0().mo16816M(bVar.f25368f);
            ViewExtensions.m12866j(bVar.f25364b, new CirclesFragment$CircledUserHolder$bindCircledUser$1(CirclesFragment.this, aVar));
            bVar.f25367e.removeAllViews();
            for (int i3 = 0; i3 < 3; i3++) {
                String str = (String) C19327t.m32641W0(i3, aVar.f25391f);
                FragmentActivity requireActivity = CirclesFragment.this.requireActivity();
                C19383o.m32796f(requireActivity, "requireActivity()");
                ListingFullImageView listingFullImageView = new ListingFullImageView(requireActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                listingFullImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                listingFullImageView.setUseStandardRatio(true);
                listingFullImageView.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
                if (str != null) {
                    C0114h.m272C0(listingFullImageView).load(str).mo16816M(listingFullImageView);
                } else if (i3 == 2) {
                    listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image);
                } else {
                    listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image_right_divider);
                }
                bVar.f25367e.addView(listingFullImageView);
            }
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            return new C11494b(C0114h.m305j0(viewGroup, R.layout.list_item_card_standard_full, false));
        }
    }

    private final EtsyId getUserId() {
        return (EtsyId) this.userId$delegate.getValue();
    }

    private final String getUserLoginName() {
        return (String) this.userLoginName$delegate.getValue();
    }

    private final boolean isTypeFollowing() {
        return ((Boolean) this.isTypeFollowing$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m35060onViewCreated$lambda0(CirclesFragment circlesFragment) {
        C19383o.m32797g(circlesFragment, "this$0");
        circlesFragment.getViewModel().mo37371b(true);
    }

    /* access modifiers changed from: private */
    public final void onViewState(CirclesViewModel.C11501a aVar) {
        if (C19383o.m32792b(aVar, CirclesViewModel.C11501a.C11504c.f25384a)) {
            CirclesViewModel viewModel = getViewModel();
            EtsyId userId = getUserId();
            boolean isTypeFollowing = isTypeFollowing();
            viewModel.getClass();
            C19383o.m32797g(userId, "userId");
            viewModel.f25379f = userId;
            viewModel.f25380g = isTypeFollowing;
            viewModel.mo37371b(false);
        } else if (aVar instanceof CirclesViewModel.C11501a.C11503b) {
            showLoading(((CirclesViewModel.C11501a.C11503b) aVar).f25383a);
        } else if (aVar instanceof CirclesViewModel.C11501a.C11505d) {
            showUsers(((CirclesViewModel.C11501a.C11505d) aVar).f25385a);
        } else if (aVar instanceof CirclesViewModel.C11501a.C11502a) {
            showError();
        }
    }

    private final void showError() {
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
            View view = this.emptyView;
            if (view != null) {
                view.setVisibility(8);
                View view2 = this.errorView;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.loadingView;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        RecyclerView recyclerView2 = this.recyclerView;
                        if (recyclerView2 != null) {
                            recyclerView2.setVisibility(8);
                        } else {
                            C19383o.m32805o("recyclerView");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("loadingView");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("errorView");
                    throw null;
                }
            } else {
                C19383o.m32805o("emptyView");
                throw null;
            }
        } else {
            C19383o.m32805o("swipeRefreshLayout");
            throw null;
        }
    }

    private final void showLoading(boolean z) {
        if (!z) {
            View view = this.emptyView;
            if (view != null) {
                view.setVisibility(8);
                View view2 = this.errorView;
                if (view2 != null) {
                    view2.setVisibility(8);
                    View view3 = this.loadingView;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        RecyclerView recyclerView2 = this.recyclerView;
                        if (recyclerView2 != null) {
                            recyclerView2.setVisibility(8);
                        } else {
                            C19383o.m32805o("recyclerView");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("loadingView");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("errorView");
                    throw null;
                }
            } else {
                C19383o.m32805o("emptyView");
                throw null;
            }
        }
    }

    private final void showUsers(List<C11506a> list) {
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
            View view = this.errorView;
            if (view != null) {
                view.setVisibility(8);
                View view2 = this.loadingView;
                if (view2 != null) {
                    view2.setVisibility(8);
                    if (list.isEmpty()) {
                        View view3 = this.emptyView;
                        if (view3 != null) {
                            view3.setVisibility(0);
                            RecyclerView recyclerView2 = this.recyclerView;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(8);
                            } else {
                                C19383o.m32805o("recyclerView");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("emptyView");
                            throw null;
                        }
                    } else {
                        View view4 = this.emptyView;
                        if (view4 != null) {
                            view4.setVisibility(8);
                            RecyclerView recyclerView3 = this.recyclerView;
                            if (recyclerView3 != null) {
                                recyclerView3.setVisibility(0);
                            } else {
                                C19383o.m32805o("recyclerView");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("emptyView");
                            throw null;
                        }
                    }
                    this.circledUserAdapter.mo11950j(list);
                    return;
                }
                C19383o.m32805o("loadingView");
                throw null;
            }
            C19383o.m32805o("errorView");
            throw null;
        }
        C19383o.m32805o("swipeRefreshLayout");
        throw null;
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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public final CirclesViewModel getViewModel() {
        return (CirclesViewModel) this.viewModel$delegate.getValue();
    }

    public final C19011a<CirclesViewModel> getViewModelProvider() {
        C19011a<CirclesViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("viewModelProvider");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_baserecyclerview, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.swipe_refresh_layout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.swipe_refresh_layout)");
        this.swipeRefreshLayout = (SwipeRefreshLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.recycler_view);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.recycler_view)");
        RecyclerView recyclerView2 = (RecyclerView) findViewById2;
        this.recyclerView = recyclerView2;
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.circledUserAdapter);
            View findViewById3 = inflate.findViewById(R.id.empty_view);
            C19383o.m32796f(findViewById3, "view.findViewById(R.id.empty_view)");
            this.emptyView = findViewById3;
            View findViewById4 = inflate.findViewById(R.id.empty_view_text);
            C19383o.m32796f(findViewById4, "view.findViewById(R.id.empty_view_text)");
            this.emptyText = (TextView) findViewById4;
            View findViewById5 = inflate.findViewById(R.id.empty_view_subtext);
            C19383o.m32796f(findViewById5, "view.findViewById(R.id.empty_view_subtext)");
            this.emptySubtext = (TextView) findViewById5;
            View findViewById6 = inflate.findViewById(R.id.empty_button);
            C19383o.m32796f(findViewById6, "view.findViewById(R.id.empty_button)");
            this.emptyButton = (Button) findViewById6;
            View findViewById7 = inflate.findViewById(R.id.empty_image);
            C19383o.m32796f(findViewById7, "view.findViewById(R.id.empty_image)");
            this.emptyImage = (ImageView) findViewById7;
            View findViewById8 = inflate.findViewById(R.id.no_internet);
            C19383o.m32796f(findViewById8, "view.findViewById(R.id.no_internet)");
            this.errorView = findViewById8;
            View findViewById9 = inflate.findViewById(R.id.loading_view);
            C19383o.m32796f(findViewById9, "view.findViewById(R.id.loading_view)");
            this.loadingView = findViewById9;
            View view = this.errorView;
            if (view != null) {
                View findViewById10 = view.findViewById(R.id.btn_retry_internet);
                C19383o.m32796f(findViewById10, "errorView.findViewById(R.id.btn_retry_internet)");
                this.retryButton = findViewById10;
                return inflate;
            }
            C19383o.m32805o("errorView");
            throw null;
        }
        C19383o.m32805o("recyclerView");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((RecyclerView.Adapter) null);
        } else {
            C19383o.m32805o("recyclerView");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = !getUserId().hasId() || getSession().mo45959d().equals(getUserId());
        int i = (!z || !isTypeFollowing()) ? (!z || isTypeFollowing()) ? (z || !isTypeFollowing()) ? R.string.empty_followers_user : R.string.empty_following_user : R.string.empty_followers_self : R.string.empty_following_self;
        TextView textView = this.emptyText;
        if (textView != null) {
            textView.setText(getString(i, getUserLoginName()));
            SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setOnRefreshListener(new C11508c(this));
                View view2 = this.retryButton;
                if (view2 != null) {
                    ViewExtensions.m12866j(view2, new CirclesFragment$onViewCreated$2(this));
                    C2887s viewLifecycleOwner = getViewLifecycleOwner();
                    C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
                    C19697g.m33468f(C15588c1.m25329i0(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CirclesFragment$onViewCreated$3(this, (C19340c<? super CirclesFragment$onViewCreated$3>) null), 3);
                    return;
                }
                C19383o.m32805o("retryButton");
                throw null;
            }
            C19383o.m32805o("swipeRefreshLayout");
            throw null;
        }
        C19383o.m32805o("emptyText");
        throw null;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setViewModelProvider(C19011a<CirclesViewModel> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.viewModelProvider = aVar;
    }
}
