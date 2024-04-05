package com.etsy.android.p327ui.core.listinggallery;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.models.ISupportsListingVideo;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.lib.util.C8919r;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.core.listinggallery.C9643b;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9663d;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9664e;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9665f;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9666g;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.ProgressButton;
import com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.view.C11951f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import p356ge.C12788a;
import p440s9.C13366a;
import p449tb.C13389a;
import p487ya.C13895a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment */
public final class ListingImageGalleryFragment extends TrackingBaseFragment implements C9643b.C9644a, C13366a, C11324t.C11329b, C9090a.C9096b {
    public static final int $stable = 8;
    public static final C9631a Companion = new C9631a();
    public static final String ENABLE_SHOW_BUY_IT_NOW_BUTTON = "enable_show_add_to_cart_button";
    public static final String LISTING_VIDEO_POSITION = "listing_video_position";
    public static final String SCROLL_TO_REVIEWS = "scroll_to_reviews";
    public static final String SELECTED_IMAGE_POSITION = "selected_image_position";
    public static final String SHOW_VISUALLY_SIMILAR_ITEMS_BUTTON = "show_visually_similar_items_button";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C19285c adapter$delegate = C19350d.m32677b(new ListingImageGalleryFragment$adapter$2(this));
    /* access modifiers changed from: private */
    public boolean allowVisuallySimilarButton = true;
    public C9665f buyItNowPresenter;
    public C9666g buyItNowViewModel;
    private ImageButton dismissButton;
    private boolean dismissOnNextResume;
    private final C19285c eventTracker$delegate = C19350d.m32677b(new ListingImageGalleryFragment$eventTracker$2(this));
    public C13895a fileSupport;
    /* access modifiers changed from: private */
    public int initialPosition;
    private List<Object> itemArray = new ArrayList();
    public C10156h listingViewEligibility;
    /* access modifiers changed from: private */
    public LoopingCirclePageIndicator loopingPagerIndicator;
    private final C9634d onPageChangeCallback = new C9634d(this);
    private boolean shouldLogVideoStart = true;
    private int statusBarHeight;
    public C8890e0 systemTime;
    /* access modifiers changed from: private */
    public ViewPager2 viewPager;
    /* access modifiers changed from: private */
    public String visuallySimilarApiPath = "";

    /* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$a */
    public static final class C9631a {
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$b */
    public static final class C9632b {

        /* renamed from: a */
        public final ISupportsListingVideo f21333a;

        /* renamed from: b */
        public ListingVideoPosition f21334b;

        public C9632b(ISupportsListingVideo iSupportsListingVideo, ListingVideoPosition listingVideoPosition) {
            C19383o.m32797g(iSupportsListingVideo, "video");
            this.f21333a = iSupportsListingVideo;
            this.f21334b = listingVideoPosition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9632b)) {
                return false;
            }
            C9632b bVar = (C9632b) obj;
            return C19383o.m32792b(this.f21333a, bVar.f21333a) && C19383o.m32792b(this.f21334b, bVar.f21334b);
        }

        public final int hashCode() {
            return this.f21334b.hashCode() + (this.f21333a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("VideoStateWrapper(video=");
            h.append(this.f21333a);
            h.append(", videoPosition=");
            h.append(this.f21334b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$c */
    public static final class C9633c implements C13389a {
        public final int getCount() {
            return 1;
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$d */
    public static final class C9634d extends ViewPager2.C3349i {

        /* renamed from: a */
        public final /* synthetic */ ListingImageGalleryFragment f21335a;

        public C9634d(ListingImageGalleryFragment listingImageGalleryFragment) {
            this.f21335a = listingImageGalleryFragment;
        }

        /* renamed from: a */
        public final void mo12762a(int i) {
            LoopingCirclePageIndicator access$getLoopingPagerIndicator$p = this.f21335a.loopingPagerIndicator;
            if (access$getLoopingPagerIndicator$p != null) {
                access$getLoopingPagerIndicator$p.onPageScrollStateChanged(i);
            } else {
                C19383o.m32805o("loopingPagerIndicator");
                throw null;
            }
        }

        /* renamed from: b */
        public final void mo12781b(int i, float f, int i2) {
            LoopingCirclePageIndicator access$getLoopingPagerIndicator$p = this.f21335a.loopingPagerIndicator;
            if (access$getLoopingPagerIndicator$p != null) {
                access$getLoopingPagerIndicator$p.onPageScrolled(i, f, i2);
            } else {
                C19383o.m32805o("loopingPagerIndicator");
                throw null;
            }
        }

        /* renamed from: c */
        public final void mo12763c(int i) {
            this.f21335a.getAnalyticsContext().mo21333d(i > this.f21335a.getAdapter().f21363g ? "listing_gallery_swipe_forward" : "listing_gallery_swipe_backward", (Map<? extends AnalyticsProperty, Object>) null);
            this.f21335a.getAdapter().mo32344j(i);
            if (this.f21335a.isCurrentItemFeaturedReview()) {
                this.f21335a.getAnalyticsContext().mo21333d("listing_gallery_review_cta_view", (Map<? extends AnalyticsProperty, Object>) null);
            }
            LoopingCirclePageIndicator access$getLoopingPagerIndicator$p = this.f21335a.loopingPagerIndicator;
            if (access$getLoopingPagerIndicator$p != null) {
                access$getLoopingPagerIndicator$p.onPageSelected(i);
                if (this.f21335a.allowVisuallySimilarButton) {
                    if (this.f21335a.visuallySimilarApiPath.length() > 0) {
                        if (i == this.f21335a.initialPosition) {
                            Button button = (Button) this.f21335a._$_findCachedViewById(R.id.view_visually_similar);
                            if (button != null) {
                                ViewExtensions.m12869m(button);
                            }
                        } else {
                            Button button2 = (Button) this.f21335a._$_findCachedViewById(R.id.view_visually_similar);
                            if (button2 != null) {
                                ViewExtensions.m12860d(button2);
                            }
                        }
                    }
                } else {
                    Button button3 = (Button) this.f21335a._$_findCachedViewById(R.id.view_visually_similar);
                    if (button3 != null) {
                        ViewExtensions.m12860d(button3);
                    }
                }
                C9666g buyItNowViewModel = this.f21335a.getBuyItNowViewModel();
                boolean z = !this.f21335a.isCurrentItemFeaturedReview();
                C9649b value = buyItNowViewModel.f21411d.getValue();
                if (z) {
                    if (value instanceof C9649b.C9654e) {
                        buyItNowViewModel.f21411d.setValue(((C9649b.C9654e) value).f21373a);
                    }
                } else if (value != null && !(value instanceof C9649b.C9654e)) {
                    buyItNowViewModel.f21411d.setValue(new C9649b.C9654e(value));
                }
                ViewPager2 access$getViewPager$p = this.f21335a.viewPager;
                if (access$getViewPager$p != null) {
                    NavigationExtensionsKt.m17420a(access$getViewPager$p, 100);
                } else {
                    C19383o.m32805o("viewPager");
                    throw null;
                }
            } else {
                C19383o.m32805o("loopingPagerIndicator");
                throw null;
            }
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$e */
    public static final class C9635e implements C13389a {

        /* renamed from: a */
        public final /* synthetic */ ListingImageGalleryFragment f21336a;

        public C9635e(ListingImageGalleryFragment listingImageGalleryFragment) {
            this.f21336a = listingImageGalleryFragment;
        }

        public final int getCount() {
            return this.f21336a.getAdapter().f21364h.size();
        }
    }

    /* access modifiers changed from: private */
    public final C9643b getAdapter() {
        return (C9643b) this.adapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C11951f getEventTracker() {
        return (C11951f) this.eventTracker$delegate.getValue();
    }

    private final int getRealCurrentItem() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            return viewPager2.getCurrentItem() % getAdapter().f21364h.size();
        }
        C19383o.m32805o("viewPager");
        throw null;
    }

    /* access modifiers changed from: private */
    public final boolean isCurrentItemFeaturedReview() {
        return getAdapter().f21364h.get(getRealCurrentItem()) instanceof ShopReview;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final C2348w0 m34962onCreateView$lambda2(ViewGroup viewGroup, ListingImageGalleryFragment listingImageGalleryFragment, View view, C2348w0 w0Var) {
        C19383o.m32797g(listingImageGalleryFragment, "this$0");
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5274u(viewGroup, (C2325q) null);
        listingImageGalleryFragment.statusBarHeight = w0Var.mo8942b(1).f18321b;
        listingImageGalleryFragment.updateDismissButtonMargins();
        return w0Var;
    }

    private final void sendResults(boolean z) {
        ListingVideoPosition listingVideoPosition;
        int realCurrentItem = getRealCurrentItem();
        if (isCurrentItemFeaturedReview()) {
            realCurrentItem--;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(SELECTED_IMAGE_POSITION, realCurrentItem);
        Iterator it = getAdapter().f21364h.iterator();
        while (true) {
            if (!it.hasNext()) {
                listingVideoPosition = null;
                break;
            }
            Object next = it.next();
            if (next instanceof C9632b) {
                listingVideoPosition = ((C9632b) next).f21334b;
                break;
            }
        }
        if (listingVideoPosition != null) {
            bundle.putParcelable(LISTING_VIDEO_POSITION, listingVideoPosition);
        }
        bundle.putBoolean(SCROLL_TO_REVIEWS, z);
        C19388s.m32892w0(this, "DETAIL_IMAGE_SELECTED", bundle);
    }

    public static /* synthetic */ void sendResults$default(ListingImageGalleryFragment listingImageGalleryFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        listingImageGalleryFragment.sendResults(z);
    }

    private final void setupPagerIndicator() {
        boolean z = true;
        if (getAdapter().f21364h.size() <= 1) {
            z = false;
        }
        if (!z) {
            LoopingCirclePageIndicator loopingCirclePageIndicator = this.loopingPagerIndicator;
            if (loopingCirclePageIndicator != null) {
                ViewExtensions.m12863g(loopingCirclePageIndicator);
            } else {
                C19383o.m32805o("loopingPagerIndicator");
                throw null;
            }
        } else {
            LoopingCirclePageIndicator loopingCirclePageIndicator2 = this.loopingPagerIndicator;
            if (loopingCirclePageIndicator2 != null) {
                loopingCirclePageIndicator2.setPagerCallback(new C9635e(this));
                LoopingCirclePageIndicator loopingCirclePageIndicator3 = this.loopingPagerIndicator;
                if (loopingCirclePageIndicator3 != null) {
                    ViewExtensions.m12869m(loopingCirclePageIndicator3);
                } else {
                    C19383o.m32805o("loopingPagerIndicator");
                    throw null;
                }
            } else {
                C19383o.m32805o("loopingPagerIndicator");
                throw null;
            }
        }
    }

    private final void setupVisuallySimilarButton() {
        if (this.allowVisuallySimilarButton) {
            if (this.visuallySimilarApiPath.length() > 0) {
                Button button = (Button) _$_findCachedViewById(R.id.view_visually_similar);
                if (button != null) {
                    LandingPageLink landingPageLink = new LandingPageLink();
                    landingPageLink.setApiPath(this.visuallySimilarApiPath);
                    landingPageLink.setPageTitle(getResources().getString(R.string.visually_similar_page_title));
                    landingPageLink.setPaginateForNext(true);
                    landingPageLink.setPageType("page");
                    button.setOnClickListener(new C9636xef5e56ac(this, landingPageLink));
                    ViewPager2 viewPager2 = this.viewPager;
                    if (viewPager2 == null) {
                        C19383o.m32805o("viewPager");
                        throw null;
                    } else if (viewPager2.getCurrentItem() == this.initialPosition) {
                        ViewExtensions.m12869m(button);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        Button button2 = (Button) _$_findCachedViewById(R.id.view_visually_similar);
        if (button2 != null) {
            ViewExtensions.m12860d(button2);
        }
    }

    private final void updateDismissButtonMargins() {
        if (getActivity() != null) {
            ImageButton imageButton = this.dismissButton;
            if (imageButton != null) {
                ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
                C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = this.statusBarHeight;
                FragmentActivity requireActivity = requireActivity();
                C19383o.m32796f(requireActivity, "requireActivity()");
                marginLayoutParams.rightMargin = C19543e0.m33295K(8, requireActivity);
                imageButton.setLayoutParams(marginLayoutParams);
                return;
            }
            C19383o.m32805o("dismissButton");
            throw null;
        }
    }

    private final void wrapVideos() {
        ListingVideoPosition listingVideoPosition;
        int i = 0;
        for (T next : this.itemArray) {
            int i2 = i + 1;
            if (i >= 0) {
                if ((next instanceof BaseModelImageCompat) && (next instanceof ISupportsListingVideo)) {
                    ISupportsListingVideo iSupportsListingVideo = (ISupportsListingVideo) next;
                    if (iSupportsListingVideo.isVideo()) {
                        Uri parse = Uri.parse(iSupportsListingVideo.getVideoUrl());
                        C19383o.m32796f(parse, "parse(item.videoUrl)");
                        C9632b bVar = new C9632b(iSupportsListingVideo, new ListingVideoPosition(parse, 0, 2, (DefaultConstructorMarker) null));
                        Bundle arguments = getArguments();
                        if (!(arguments == null || (listingVideoPosition = (ListingVideoPosition) arguments.getParcelable(LISTING_VIDEO_POSITION)) == null)) {
                            ListingVideoPosition copy$default = ListingVideoPosition.copy$default(bVar.f21334b, (Uri) null, listingVideoPosition.getCurrentPosition(), 1, (Object) null);
                            C19383o.m32797g(copy$default, "<set-?>");
                            bVar.f21334b = copy$default;
                            Bundle arguments2 = getArguments();
                            if (arguments2 != null) {
                                arguments2.remove(LISTING_VIDEO_POSITION);
                            }
                        }
                        this.itemArray.set(i, bVar);
                    }
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
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

    public final C9665f getBuyItNowPresenter() {
        C9665f fVar = this.buyItNowPresenter;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("buyItNowPresenter");
        throw null;
    }

    public final C9666g getBuyItNowViewModel() {
        C9666g gVar = this.buyItNowViewModel;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("buyItNowViewModel");
        throw null;
    }

    public final C13895a getFileSupport() {
        C13895a aVar = this.fileSupport;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("fileSupport");
        throw null;
    }

    public final C10156h getListingViewEligibility() {
        C10156h hVar = this.listingViewEligibility;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("listingViewEligibility");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8890e0 getSystemTime() {
        C8890e0 e0Var = this.systemTime;
        if (e0Var != null) {
            return e0Var;
        }
        C19383o.m32805o("systemTime");
        throw null;
    }

    public String getTrackingName() {
        return "image_zoom";
    }

    public boolean handleBackPressed() {
        sendResults$default(this, false, 1, (Object) null);
        return super.handleBackPressed();
    }

    public void onBrowseAllReviewImages() {
        getAnalyticsContext().mo21333d("listing_gallery_browse_review_photos_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        sendResults(true);
        C12788a.m20426e(getActivity());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.initialPosition = arguments.getInt("position");
            String string = arguments.getString("visuallySimilarApiPath", "");
            C19383o.m32796f(string, "it.getString(Nav.VISUALLY_SIMILAR_API_PATH, \"\")");
            this.visuallySimilarApiPath = string;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        if (this.dismissOnNextResume) {
            C12788a.m20426e(getActivity());
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_listing_image_gallery, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.viewpager2);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.viewpager2)");
        this.viewPager = (ViewPager2) findViewById;
        View findViewById2 = inflate.findViewById(R.id.looping_circle_page_indicator);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.l…ng_circle_page_indicator)");
        this.loopingPagerIndicator = (LoopingCirclePageIndicator) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.button_dismiss);
        ImageButton imageButton = (ImageButton) findViewById3;
        C19383o.m32796f(imageButton, "");
        ViewExtensions.m12866j(imageButton, new ListingImageGalleryFragment$onCreateView$1$1(this));
        C19383o.m32796f(findViewById3, "view.findViewById<ImageB…)\n            }\n        }");
        this.dismissButton = (ImageButton) findViewById3;
        LoopingCirclePageIndicator loopingCirclePageIndicator = this.loopingPagerIndicator;
        if (loopingCirclePageIndicator != null) {
            loopingCirclePageIndicator.setPagerCallback(new C9633c());
            C19383o.m32794d(viewGroup);
            C9678c cVar = new C9678c(viewGroup, this);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2373i.m5274u(viewGroup, cVar);
            return inflate;
        }
        C19383o.m32805o("loopingPagerIndicator");
        throw null;
    }

    public void onDestroyView() {
        C9665f buyItNowPresenter2 = getBuyItNowPresenter();
        buyItNowPresenter2.f21407g = null;
        buyItNowPresenter2.f21408h = null;
        buyItNowPresenter2.mo32380c();
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.onPageChangeCallback);
            ViewPager2 viewPager22 = this.viewPager;
            if (viewPager22 != null) {
                viewPager22.setAdapter((RecyclerView.Adapter) null);
                super.onDestroyView();
                return;
            }
            C19383o.m32805o("viewPager");
            throw null;
        }
        C19383o.m32805o("viewPager");
        throw null;
    }

    public void onDragStarted() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(false);
        } else {
            C19383o.m32805o("viewPager");
            throw null;
        }
    }

    public void onDragStopped() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(true);
        } else {
            C19383o.m32805o("viewPager");
            throw null;
        }
    }

    public void onImageDismissed() {
        sendResults$default(this, false, 1, (Object) null);
        C12788a.m20426e(getActivity());
    }

    public void onPause() {
        super.onPause();
        C9643b adapter = getAdapter();
        RecyclerView recyclerView = adapter.f21365i;
        RecyclerView.C3084b0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(adapter.f21363g) : null;
        if (findViewHolderForAdapterPosition instanceof VideoViewHolder) {
            ((VideoViewHolder) findViewHolderForAdapterPosition).mo32337e();
        }
    }

    public void onResume() {
        super.onResume();
        C9643b adapter = getAdapter();
        RecyclerView recyclerView = adapter.f21365i;
        RecyclerView.C3084b0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(adapter.f21363g) : null;
        if (findViewHolderForAdapterPosition instanceof VideoViewHolder) {
            ((VideoViewHolder) findViewHolderForAdapterPosition).mo32338f();
        }
    }

    public void onVideoStarted() {
        if (this.shouldLogVideoStart) {
            getAnalyticsContext().mo21333d("listing_gallery_video_autoplay", (Map<? extends AnalyticsProperty, Object>) null);
        }
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            String string = viewPager2.getContext().getString(R.string.listing_video_playing_desc);
            C19383o.m32796f(string, "context.getString(text)");
            ViewsExtensionsKt.m17422a(viewPager2, string, 500);
            this.shouldLogVideoStart = false;
            return;
        }
        C19383o.m32805o("viewPager");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        ShopReview shopReview;
        List<BaseModelImageCompat> list;
        Map<Long, ListingImage> map;
        Map<Long, Long> variationImages;
        Set<Map.Entry<Long, Long>> entrySet;
        ListingImage listingImage;
        ListingFetch listingFetch;
        List<ListingImage> listingImages;
        T t;
        boolean z;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C9665f buyItNowPresenter2 = getBuyItNowPresenter();
        C9666g buyItNowViewModel2 = getBuyItNowViewModel();
        View findViewById = view.findViewById(R.id.button_buy_it_now);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.button_buy_it_now)");
        buyItNowPresenter2.getClass();
        C19383o.m32797g(buyItNowViewModel2, "buyItNowViewModel");
        buyItNowPresenter2.f21407g = this;
        buyItNowPresenter2.f21408h = buyItNowViewModel2;
        buyItNowViewModel2.f21414g.observe(getViewLifecycleOwner(), new C9663d(buyItNowPresenter2, 0));
        buyItNowViewModel2.f21412e.observe(getViewLifecycleOwner(), new C9664e(buyItNowPresenter2, (ProgressButton) findViewById));
        if (bundle == null && (arguments = getArguments()) != null) {
            boolean z2 = arguments.getBoolean(ENABLE_SHOW_BUY_IT_NOW_BUTTON, false);
            this.allowVisuallySimilarButton = arguments.getBoolean(SHOW_VISUALLY_SIMILAR_ITEMS_BUTTON, true);
            int i = arguments.getInt("transaction-data", -1);
            if (i != -1) {
                C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
                C9680e eVar = (C9680e) TransactionDataRepository.C11867a.m19552a().mo38342a(i);
                if (z2) {
                    if ((eVar != null ? eVar.f21440a : null) != null) {
                        ListingExpressCheckout listingExpressCheckout = eVar.f21441b;
                        if (listingExpressCheckout != null ? C19383o.m32792b(listingExpressCheckout.isExpressCheckoutEligible(), Boolean.TRUE) : false) {
                            this.allowVisuallySimilarButton = false;
                            eVar = C9680e.m18017a(eVar, getAnalyticsContext().f19059a, 111);
                            C9666g buyItNowViewModel3 = getBuyItNowViewModel();
                            buyItNowViewModel3.getClass();
                            C9680e a = C9680e.m18017a(eVar, (String) null, 127);
                            buyItNowViewModel3.f21416i = a;
                            ListingFetch listingFetch2 = a.f21440a;
                            if (listingFetch2 == null || (variationImages = listingFetch2.getVariationImages()) == null || (entrySet = variationImages.entrySet()) == null) {
                                map = null;
                            } else {
                                int T = C19421p.m32930T(C19322o.m32624F0(entrySet));
                                if (T < 16) {
                                    T = 16;
                                }
                                map = new LinkedHashMap<>(T);
                                for (Map.Entry entry : entrySet) {
                                    long longValue = ((Number) entry.getKey()).longValue();
                                    long longValue2 = ((Number) entry.getValue()).longValue();
                                    C9680e eVar2 = buyItNowViewModel3.f21416i;
                                    if (eVar2 == null || (listingFetch = eVar2.f21440a) == null || (listingImages = listingFetch.getListingImages()) == null) {
                                        listingImage = null;
                                    } else {
                                        Iterator<T> it = listingImages.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it.next();
                                            if (t.getImageId().getIdAsLong() == longValue2) {
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
                                        listingImage = (ListingImage) t;
                                    }
                                    Pair pair = new Pair(Long.valueOf(longValue), listingImage);
                                    map.put(pair.getFirst(), pair.getSecond());
                                }
                            }
                            if (map == null) {
                                map = C19294b0.m32559p0();
                            }
                            buyItNowViewModel3.f21417j = map;
                            C9680e eVar3 = buyItNowViewModel3.f21416i;
                            if ((eVar3 != null ? eVar3.f21441b : null) != null) {
                                buyItNowViewModel3.f21411d.setValue(C9649b.C9650a.f21369a);
                            } else {
                                buyItNowViewModel3.f21411d.setValue(C9649b.C9652c.f21371a);
                            }
                        }
                    }
                }
                if (!(eVar == null || (list = eVar.f21446g) == null)) {
                    if (!this.itemArray.containsAll(list)) {
                        this.itemArray.addAll(list);
                    }
                    wrapVideos();
                }
                if (!(eVar == null || (shopReview = eVar.f21445f) == null)) {
                    this.itemArray.add(shopReview);
                }
            }
        }
        if (this.itemArray.size() > 1) {
            this.initialPosition = (1073741823 - (1073741823 % this.itemArray.size())) + this.initialPosition;
        }
        C9643b adapter = getAdapter();
        List<Object> list2 = this.itemArray;
        adapter.getClass();
        C19383o.m32797g(list2, ResponseConstants.ITEMS);
        adapter.f21364h.clear();
        adapter.f21364h.addAll(list2);
        adapter.notifyDataSetChanged();
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(getAdapter());
            ViewPager2 viewPager22 = this.viewPager;
            if (viewPager22 != null) {
                viewPager22.setCurrentItem(this.initialPosition, false);
                getAdapter().mo32344j(this.initialPosition);
                ViewPager2 viewPager23 = this.viewPager;
                if (viewPager23 != null) {
                    viewPager23.registerOnPageChangeCallback(this.onPageChangeCallback);
                    setupPagerIndicator();
                    setupVisuallySimilarButton();
                    ViewPager2 viewPager24 = this.viewPager;
                    if (viewPager24 != null) {
                        NavigationExtensionsKt.m17420a(viewPager24, 100);
                        if (this.itemArray.isEmpty()) {
                            C12788a.m20426e(getActivity());
                            return;
                        }
                        return;
                    }
                    C19383o.m32805o("viewPager");
                    throw null;
                }
                C19383o.m32805o("viewPager");
                throw null;
            }
            C19383o.m32805o("viewPager");
            throw null;
        }
        C19383o.m32805o("viewPager");
        throw null;
    }

    public void onViewUnsupportedImage(String str) {
        C19383o.m32797g(str, "url");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            getFileSupport().getClass();
            Random random = C8919r.f19677a;
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                activity.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                C8694h hVar = C8694h.f19097a;
                hVar.mo21309d("No application found to open url: " + str, e);
            }
        }
    }

    public final void setBuyItNowPresenter(C9665f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.buyItNowPresenter = fVar;
    }

    public final void setBuyItNowViewModel(C9666g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.buyItNowViewModel = gVar;
    }

    public final void setFileSupport(C13895a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.fileSupport = aVar;
    }

    public final void setListingViewEligibility(C10156h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.listingViewEligibility = hVar;
    }

    public final void setSystemTime(C8890e0 e0Var) {
        C19383o.m32797g(e0Var, "<set-?>");
        this.systemTime = e0Var;
    }

    public C9090a.C9091a.C9095d getActionBarOverrides() {
        return C9090a.C9091a.C9095d.f19993c;
    }

    public C11324t.C11325a.C11327b getBottomTabsOverrides() {
        return C11324t.C11325a.C11327b.f24989c;
    }
}
