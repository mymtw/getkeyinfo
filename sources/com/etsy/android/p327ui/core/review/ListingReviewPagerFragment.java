package com.etsy.android.p327ui.core.review;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.p327ui.core.review.C9711b;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.util.C12060q;
import com.etsy.android.util.C12061r;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075d.C6614a;
import p356ge.C12788a;
import p381kc.C12990a;
import p392lf.C13020a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.core.review.ListingReviewPagerFragment */
public final class ListingReviewPagerFragment extends TrackingBaseFragment implements C13366a, C13020a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final C12990a listener;
    public ListingReviewPagerAdapter pagerAdapter;
    private MaterialToolbar toolbar;
    public C9711b viewModel;
    private ViewPager viewPager;

    /* renamed from: com.etsy.android.ui.core.review.ListingReviewPagerFragment$a */
    public static final class C9703a implements ViewPager.C3334i {

        /* renamed from: b */
        public final /* synthetic */ ListingReviewPagerFragment f21484b;

        public C9703a(ListingReviewPagerFragment listingReviewPagerFragment) {
            this.f21484b = listingReviewPagerFragment;
        }

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            C9711b viewModel = this.f21484b.getViewModel();
            viewModel.f21495f = i;
            viewModel.f21491b.mo21333d("phodal_swipe", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    public ListingReviewPagerFragment() {
        this((C12990a) null, 1, (DefaultConstructorMarker) null);
    }

    public ListingReviewPagerFragment(C12990a aVar) {
        this._$_findViewCache = new LinkedHashMap();
        this.listener = aVar;
    }

    /* access modifiers changed from: private */
    public final void dismiss() {
        C12990a aVar;
        if (!getConfigMap().mo21132b(C8592b.f18847y1) || (aVar = this.listener) == null) {
            C12788a.m20426e(getActivity());
        } else {
            aVar.handleDismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m34963onViewCreated$lambda1(ListingReviewPagerFragment listingReviewPagerFragment, C9711b.C9712a aVar) {
        C19383o.m32797g(listingReviewPagerFragment, "this$0");
        MaterialToolbar materialToolbar = listingReviewPagerFragment.toolbar;
        if (materialToolbar != null) {
            materialToolbar.setTitle((CharSequence) listingReviewPagerFragment.getString(aVar.f21496a));
        }
        ListingReviewPagerAdapter pagerAdapter2 = listingReviewPagerFragment.getPagerAdapter();
        List<ReviewImage> list = aVar.f21498c;
        pagerAdapter2.getClass();
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        pagerAdapter2.f21480f = list;
        pagerAdapter2.mo20188p();
        C12990a aVar2 = listingReviewPagerFragment.listener;
        if (aVar2 != null) {
            ListingReviewPagerAdapter pagerAdapter3 = listingReviewPagerFragment.getPagerAdapter();
            pagerAdapter3.getClass();
            pagerAdapter3.f21483i = aVar2;
        }
        ViewPager viewPager2 = listingReviewPagerFragment.viewPager;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(aVar.f21497b, false);
        }
    }

    private final void setUpToolbar() {
        MaterialToolbar materialToolbar;
        if ((requireActivity() instanceof BaseActivity) && !getConfigMap().mo21132b(C8592b.f18847y1)) {
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
            AppBarHelper appBarHelper = ((BaseActivity) requireActivity).getAppBarHelper();
            C19383o.m32796f(appBarHelper, "requireActivity() as BaseActivity).appBarHelper");
            if (appBarHelper.isFullScreen(getActivity())) {
                MaterialToolbar materialToolbar2 = this.toolbar;
                ViewGroup.LayoutParams layoutParams = materialToolbar2 != null ? materialToolbar2.getLayoutParams() : null;
                C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (layoutParams2.height != appBarHelper.getToolbarHeight()) {
                    layoutParams2.height = appBarHelper.getToolbarHeight();
                    MaterialToolbar materialToolbar3 = this.toolbar;
                    if (materialToolbar3 != null) {
                        materialToolbar3.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
        MaterialToolbar materialToolbar4 = this.toolbar;
        if (materialToolbar4 != null) {
            materialToolbar4.setNavigationOnClickListener(new ListingReviewPagerFragment$setUpToolbar$1(this));
        }
        C9711b viewModel2 = getViewModel();
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        viewModel2.getClass();
        if (configMap.mo21132b(C8592b.f18847y1) && (materialToolbar = this.toolbar) != null) {
            materialToolbar.setBackground(C6614a.m12981a(requireContext(), R.drawable.bg_rounded_bottom_sheet));
        }
    }

    private final void setUpViewPager() {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(getPagerAdapter());
        }
        ViewPager viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            viewPager3.addOnPageChangeListener(new C9703a(this));
        }
        getPagerAdapter().f21479e = new ListingReviewPagerFragment$setUpViewPager$2(this);
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

    public final C12990a getListener() {
        return this.listener;
    }

    public final ListingReviewPagerAdapter getPagerAdapter() {
        ListingReviewPagerAdapter listingReviewPagerAdapter = this.pagerAdapter;
        if (listingReviewPagerAdapter != null) {
            return listingReviewPagerAdapter;
        }
        C19383o.m32805o("pagerAdapter");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "buyer_photo";
    }

    public final C9711b getViewModel() {
        C9711b bVar = this.viewModel;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            if (getArguments() != null) {
                bundle = getArguments();
                C19383o.m32795e(bundle, "null cannot be cast to non-null type android.os.Bundle");
            } else {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
        }
        C9711b viewModel2 = getViewModel();
        viewModel2.getClass();
        List list = (List) viewModel2.f21490a.mo38342a(bundle.getInt("transaction-data", -1));
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        int i = bundle.getInt(ListingReviewNavigationKey.INITIAL_REVIEW_POSITION, 0);
        if (i >= 0 && i < list.size()) {
            viewModel2.f21495f = i;
        }
        if (list.isEmpty()) {
            viewModel2.f21492c.mo45474a("buyer_review_phodal.empty_review_list");
            C12060q.m19871b(viewModel2.f21494e, C19394m.f43287a);
            return;
        }
        viewModel2.f21493d.setValue(new C9711b.C9712a(list, list.size() == 1 ? R.string.review : R.string.listing_photos_from_reviews, viewModel2.f21495f));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_listing_review_pager, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.toolbar = null;
        this.viewPager = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C9711b viewModel2 = getViewModel();
        viewModel2.getClass();
        C9711b.C9712a value = viewModel2.f21493d.getValue();
        if (value != null) {
            bundle.putInt("transaction-data", viewModel2.f21490a.mo38343b(value.f21498c));
            bundle.putInt(ListingReviewNavigationKey.INITIAL_REVIEW_POSITION, viewModel2.f21495f);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        this.toolbar = (MaterialToolbar) view.findViewById(R.id.toolbar);
        this.viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        setUpToolbar();
        setUpViewPager();
        getViewModel().f21493d.observe(getViewLifecycleOwner(), new C6456a(this, 2));
        getViewModel().f21494e.observe(getViewLifecycleOwner(), new C12061r(new ListingReviewPagerFragment$onViewCreated$2(this)));
    }

    public final void setPagerAdapter(ListingReviewPagerAdapter listingReviewPagerAdapter) {
        C19383o.m32797g(listingReviewPagerAdapter, "<set-?>");
        this.pagerAdapter = listingReviewPagerAdapter;
    }

    public final void setViewModel(C9711b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.viewModel = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingReviewPagerFragment(C12990a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
