package com.etsy.android.feedback;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.feedback.data.SortType;
import com.etsy.android.feedback.view.RatingBottomSheet;
import com.etsy.android.feedback.view.ReviewsSortFilterHeader;
import com.etsy.android.feedback.view.SortBottomSheet;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.RatingsPercents;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ReviewImage;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.extensions.ListingFetchExtensionsKt;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.feedback.RatingStarBarsView;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingVideoReviewBottomSheetNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingVideoReviewNavigationKey;
import com.etsy.android.p327ui.shop.C11132b1;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.shop.C11309y0;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.uikit.EndlessRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.viewholder.ItemDividerDecoration;
import com.etsy.android.util.C12059p;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p003a2.C0023f;
import p131h9.C6962a;
import p260v0.C8184a;
import p321cc.C8569c;
import p344ef.C12697a;
import p356ge.C12788a;
import p356ge.C12790b;
import p425q9.C13265p;
import p456ua.C13461f;
import p486y9.C13888d;
import p568fn.C17782b;

public final class ItemReviewsFragment extends EndlessRecyclerViewListFragment<ReviewUiModel> implements C9731e0.C9732a {
    public static final int $stable = 8;
    public static final C6453a Companion = new C6453a();
    public static final String ITEM_REVIEWS_DATA = "items_reviews_data";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C13888d currentLocale;
    private final C8569c listingRepository;
    /* access modifiers changed from: private */
    public View photosCarouselView;
    private CollageBottomSheet ratingBottomSheet;
    private RatingBottomSheet ratingBottomSheetContent;
    /* access modifiers changed from: private */
    public RatingStarBarsView ratingsStarBarsView;
    private final C11786n resourceProvider;
    private ItemReviewsUiData reviewsData;
    private final C11201t reviewsTranslationRepository;
    private final C13461f rxSchedulers;
    private final C13265p session;
    private final C11309y0 shopInfoRepository;
    private final C11132b1 shopReviewsRepository;
    private CollageBottomSheet sortingBottomSheet;
    private SortBottomSheet sortingBottomSheetContent;
    /* access modifiers changed from: private */
    public ReviewsSortFilterHeader stickySortFilterHeader;
    private final C8923u translationHelper;
    /* access modifiers changed from: private */
    public FeedbackViewModel viewModel;

    /* renamed from: com.etsy.android.feedback.ItemReviewsFragment$a */
    public static final class C6453a {
    }

    /* renamed from: com.etsy.android.feedback.ItemReviewsFragment$b */
    public static final class C6454b implements ReviewsSortFilterHeader.C6481a {

        /* renamed from: a */
        public final /* synthetic */ ItemReviewsFragment f14305a;

        public C6454b(ItemReviewsFragment itemReviewsFragment) {
            this.f14305a = itemReviewsFragment;
        }

        /* renamed from: a */
        public final void mo18422a() {
            FeedbackViewModel access$getViewModel$p = this.f14305a.viewModel;
            if (access$getViewModel$p != null) {
                access$getViewModel$p.mo18348h();
                this.f14305a.getAnalyticsContext().mo21333d("see_all_reviews_filter_videos", (Map<? extends AnalyticsProperty, Object>) null);
                return;
            }
            C19383o.m32805o("viewModel");
            throw null;
        }

        /* renamed from: b */
        public final void mo18423b() {
            FeedbackViewModel access$getViewModel$p = this.f14305a.viewModel;
            if (access$getViewModel$p != null) {
                access$getViewModel$p.f14281s.postValue(new FeedbackViewModel.C6448c.C6452d(access$getViewModel$p.f14280r.f15444a));
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        }

        /* renamed from: c */
        public final void mo18424c() {
            FeedbackViewModel access$getViewModel$p = this.f14305a.viewModel;
            if (access$getViewModel$p != null) {
                access$getViewModel$p.f14281s.postValue(new FeedbackViewModel.C6448c.C6450b(access$getViewModel$p.f14280r.f15445b));
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        }

        /* renamed from: d */
        public final void mo18425d() {
            FeedbackViewModel access$getViewModel$p = this.f14305a.viewModel;
            if (access$getViewModel$p != null) {
                access$getViewModel$p.mo18347g();
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        }

        /* renamed from: e */
        public final void mo18426e() {
            FeedbackViewModel access$getViewModel$p = this.f14305a.viewModel;
            if (access$getViewModel$p != null) {
                access$getViewModel$p.mo18352l(Rating.NONE);
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        }
    }

    /* renamed from: com.etsy.android.feedback.ItemReviewsFragment$c */
    public static final class C6455c extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ C12697a f14306b;

        /* renamed from: c */
        public final /* synthetic */ ItemReviewsFragment f14307c;

        /* renamed from: d */
        public final /* synthetic */ int f14308d;

        public C6455c(C12697a aVar, ItemReviewsFragment itemReviewsFragment, int i) {
            this.f14306b = aVar;
            this.f14307c = itemReviewsFragment;
            this.f14308d = i;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f14306b.mo45458a(recyclerView, i2);
            boolean z = true;
            if (!recyclerView.canScrollVertically(-1)) {
                RatingStarBarsView access$getRatingsStarBarsView$p = this.f14307c.ratingsStarBarsView;
                if (access$getRatingsStarBarsView$p != null) {
                    access$getRatingsStarBarsView$p.setElevation(0.0f);
                    ReviewsSortFilterHeader access$getStickySortFilterHeader$p = this.f14307c.stickySortFilterHeader;
                    if (access$getStickySortFilterHeader$p != null) {
                        access$getStickySortFilterHeader$p.setElevation(0.0f);
                        View access$getPhotosCarouselView$p = this.f14307c.photosCarouselView;
                        if (access$getPhotosCarouselView$p != null) {
                            if (access$getPhotosCarouselView$p.getVisibility() != 0) {
                                z = false;
                            }
                            if (z) {
                                View access$getPhotosCarouselView$p2 = this.f14307c.photosCarouselView;
                                if (access$getPhotosCarouselView$p2 != null) {
                                    access$getPhotosCarouselView$p2.setElevation(0.0f);
                                } else {
                                    C19383o.m32805o("photosCarouselView");
                                    throw null;
                                }
                            }
                        } else {
                            C19383o.m32805o("photosCarouselView");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("stickySortFilterHeader");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("ratingsStarBarsView");
                    throw null;
                }
            } else {
                RatingStarBarsView access$getRatingsStarBarsView$p2 = this.f14307c.ratingsStarBarsView;
                if (access$getRatingsStarBarsView$p2 != null) {
                    if (access$getRatingsStarBarsView$p2.getElevation() == 0.0f) {
                        RatingStarBarsView access$getRatingsStarBarsView$p3 = this.f14307c.ratingsStarBarsView;
                        if (access$getRatingsStarBarsView$p3 != null) {
                            access$getRatingsStarBarsView$p3.setElevation((float) this.f14308d);
                            ReviewsSortFilterHeader access$getStickySortFilterHeader$p2 = this.f14307c.stickySortFilterHeader;
                            if (access$getStickySortFilterHeader$p2 != null) {
                                access$getStickySortFilterHeader$p2.setElevation((float) this.f14308d);
                                View access$getPhotosCarouselView$p3 = this.f14307c.photosCarouselView;
                                if (access$getPhotosCarouselView$p3 != null) {
                                    if (access$getPhotosCarouselView$p3.getVisibility() != 0) {
                                        z = false;
                                    }
                                    if (z) {
                                        View access$getPhotosCarouselView$p4 = this.f14307c.photosCarouselView;
                                        if (access$getPhotosCarouselView$p4 != null) {
                                            access$getPhotosCarouselView$p4.setElevation((float) this.f14308d);
                                        } else {
                                            C19383o.m32805o("photosCarouselView");
                                            throw null;
                                        }
                                    }
                                } else {
                                    C19383o.m32805o("photosCarouselView");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("stickySortFilterHeader");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("ratingsStarBarsView");
                            throw null;
                        }
                    }
                } else {
                    C19383o.m32805o("ratingsStarBarsView");
                    throw null;
                }
            }
        }
    }

    public ItemReviewsFragment(C8569c cVar, C11309y0 y0Var, C11132b1 b1Var, C11201t tVar, C13461f fVar, C13265p pVar, C13888d dVar, C8923u uVar, C11786n nVar) {
        C19383o.m32797g(cVar, "listingRepository");
        C19383o.m32797g(y0Var, "shopInfoRepository");
        C19383o.m32797g(b1Var, "shopReviewsRepository");
        C19383o.m32797g(tVar, "reviewsTranslationRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(nVar, "resourceProvider");
        this.listingRepository = cVar;
        this.shopInfoRepository = y0Var;
        this.shopReviewsRepository = b1Var;
        this.reviewsTranslationRepository = tVar;
        this.rxSchedulers = fVar;
        this.session = pVar;
        this.currentLocale = dVar;
        this.translationHelper = uVar;
        this.resourceProvider = nVar;
    }

    /* access modifiers changed from: private */
    public final void handleContactShopVisibilityChanged(Boolean bool) {
        requireActivity().invalidateOptionsMenu();
    }

    /* access modifiers changed from: private */
    public final void handleEvent(C12059p<FeedbackViewModel.C6438a> pVar) {
        FeedbackViewModel.C6438a a;
        if (pVar != null && (a = pVar.mo38935a()) != null && (a instanceof FeedbackViewModel.C6438a.C6439a)) {
            navigateToConvoCompose((FeedbackViewModel.C6438a.C6439a) a);
        }
    }

    /* access modifiers changed from: private */
    public final void handleSortFilterEvent(FeedbackViewModel.C6448c cVar) {
        if (cVar instanceof FeedbackViewModel.C6448c.C6450b) {
            showRatingBottomSheet(((FeedbackViewModel.C6448c.C6450b) cVar).f14302a);
        } else if (cVar instanceof FeedbackViewModel.C6448c.C6452d) {
            showSortBottomSheet(((FeedbackViewModel.C6448c.C6452d) cVar).f14304a);
        } else if (cVar instanceof FeedbackViewModel.C6448c.C6451c) {
            onSortFiltersUpdated(((FeedbackViewModel.C6448c.C6451c) cVar).f14303a);
        } else if (cVar instanceof FeedbackViewModel.C6448c.C6449a) {
            ReviewsSortFilterHeader reviewsSortFilterHeader = this.stickySortFilterHeader;
            if (reviewsSortFilterHeader != null) {
                reviewsSortFilterHeader.setData(((FeedbackViewModel.C6448c.C6449a) cVar).f14301a);
            } else {
                C19383o.m32805o("stickySortFilterHeader");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleState(FeedbackViewModel.C6440b bVar) {
        if (C19383o.m32792b(bVar, FeedbackViewModel.C6440b.C6441a.f14291a)) {
            onLoadFailure();
        } else if (C19383o.m32792b(bVar, FeedbackViewModel.C6440b.C6442b.f14292a)) {
        } else {
            if (bVar instanceof FeedbackViewModel.C6440b.C6443c) {
                onReviewsLoaded((FeedbackViewModel.C6440b.C6443c) bVar);
            } else if (bVar instanceof FeedbackViewModel.C6440b.C6444d) {
            } else {
                if (bVar instanceof FeedbackViewModel.C6440b.C6446f) {
                    updateReview(((FeedbackViewModel.C6440b.C6446f) bVar).f14299a);
                } else if (bVar instanceof FeedbackViewModel.C6440b.C6447g) {
                    updateReview(((FeedbackViewModel.C6440b.C6447g) bVar).f14300a);
                } else if (C19383o.m32792b(bVar, FeedbackViewModel.C6440b.C6445e.f14298a)) {
                    this.adapter.clearData();
                    showLoadingView();
                }
            }
        }
    }

    private final void hideFilteredResultCount() {
        ReviewsSortFilterHeader reviewsSortFilterHeader = this.stickySortFilterHeader;
        if (reviewsSortFilterHeader != null) {
            reviewsSortFilterHeader.hideResultCount();
            C11829a<T> aVar = this.adapter;
            C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.feedback.ItemReviewsAdapter");
            C6465j jVar = (C6465j) aVar;
            jVar.f14358g = false;
            jVar.notifyItemChanged(0);
            return;
        }
        C19383o.m32805o("stickySortFilterHeader");
        throw null;
    }

    private final void navigateToConvoCompose(FeedbackViewModel.C6438a.C6439a aVar) {
        C12790b.m20430b(this, new ConversationComposeNavigationKey(C19421p.m32935c0(requireActivity()), this.session.mo45960e(), aVar.f14286a, aVar.f14287b, aVar.f14288c, aVar.f14289d, aVar.f14290e, false, (Bundle) null, 384, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final void onReviewCarouselImageClicked(int i) {
        ItemReviewsUiData itemReviewsUiData = this.reviewsData;
        if (itemReviewsUiData != null) {
            List<ReviewImage> reviewImages = itemReviewsUiData.getReviewImages();
            if (reviewImages != null) {
                FragmentActivity activity = getActivity();
                ListingReviewNavigationKey.C10703a aVar = ListingReviewNavigationKey.Companion;
                boolean b = getConfigMap().mo21132b(C8592b.f18847y1);
                String c0 = C19421p.m32935c0(getActivity());
                List<com.etsy.android.lib.models.ReviewImage> v2 = ListingFetchExtensionsKt.toV2(reviewImages);
                aVar.getClass();
                C12788a.m20424c(activity, ListingReviewNavigationKey.C10703a.m18610a(b, c0, v2, i));
                return;
            }
            return;
        }
        C19383o.m32805o("reviewsData");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void onReviewVideoClicked(ReviewUiModel reviewUiModel) {
        getAnalyticsContext().mo21333d("see_all_reviews_video_thumbnail_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        ListingVideoReviewNavigationKey.C10704a aVar = ListingVideoReviewNavigationKey.Companion;
        boolean b = getConfigMap().mo21132b(C8592b.f18847y1);
        String d = C12790b.m20432d(this);
        List d0 = C17782b.m29864d0(reviewUiModel);
        aVar.getClass();
        C12790b.m20430b(this, b ? new ListingVideoReviewBottomSheetNavigationKey(d, d0, 0) : new ListingVideoReviewNavigationKey(d, d0, 0));
    }

    private final void onReviewsLoaded(FeedbackViewModel.C6440b.C6443c cVar) {
        C19394m mVar;
        RatingsPercents ratingsPercents = cVar.f14296d;
        if (ratingsPercents != null) {
            RatingStarBarsView ratingStarBarsView = this.ratingsStarBarsView;
            if (ratingStarBarsView != null) {
                ratingStarBarsView.setData(ratingsPercents);
                mVar = C19394m.f43287a;
            } else {
                C19383o.m32805o("ratingsStarBarsView");
                throw null;
            }
        } else {
            mVar = null;
        }
        if (mVar == null) {
            RatingStarBarsView ratingStarBarsView2 = this.ratingsStarBarsView;
            if (ratingStarBarsView2 != null) {
                ViewExtensions.m12860d(ratingStarBarsView2);
            } else {
                C19383o.m32805o("ratingsStarBarsView");
                throw null;
            }
        }
        int i = cVar.f14295c;
        if (i == 0) {
            hideFilteredResultCount();
        } else {
            showFilteredResultCount(i, cVar.f14294b);
        }
        this.adapter.clearData();
        onLoadSuccess(cVar.f14293a, cVar.f14294b);
    }

    private final void onSortFiltersUpdated(C6962a aVar) {
        CollageBottomSheet collageBottomSheet;
        CollageBottomSheet collageBottomSheet2 = this.sortingBottomSheet;
        boolean z = true;
        if (collageBottomSheet2 != null && collageBottomSheet2.isShowing()) {
            CollageBottomSheet collageBottomSheet3 = this.sortingBottomSheet;
            if (collageBottomSheet3 != null) {
                collageBottomSheet3.hide();
            }
        } else {
            CollageBottomSheet collageBottomSheet4 = this.ratingBottomSheet;
            if (collageBottomSheet4 == null || !collageBottomSheet4.isShowing()) {
                z = false;
            }
            if (z && (collageBottomSheet = this.ratingBottomSheet) != null) {
                collageBottomSheet.hide();
            }
        }
        ReviewsSortFilterHeader reviewsSortFilterHeader = this.stickySortFilterHeader;
        if (reviewsSortFilterHeader != null) {
            reviewsSortFilterHeader.setData(aVar);
            hideFilteredResultCount();
            ItemReviewsUiData itemReviewsUiData = this.reviewsData;
            if (itemReviewsUiData != null) {
                if (itemReviewsUiData.getShowVideoReviews()) {
                    ReviewsSortFilterHeader reviewsSortFilterHeader2 = this.stickySortFilterHeader;
                    if (reviewsSortFilterHeader2 != null) {
                        reviewsSortFilterHeader2.updateRemovableRatingFilter(aVar.f15445b);
                    } else {
                        C19383o.m32805o("stickySortFilterHeader");
                        throw null;
                    }
                }
                RatingStarBarsView ratingStarBarsView = this.ratingsStarBarsView;
                if (ratingStarBarsView != null) {
                    ratingStarBarsView.ratingSelected(aVar.f15445b);
                } else {
                    C19383o.m32805o("ratingsStarBarsView");
                    throw null;
                }
            } else {
                C19383o.m32805o("reviewsData");
                throw null;
            }
        } else {
            C19383o.m32805o("stickySortFilterHeader");
            throw null;
        }
    }

    private final void showFilteredResultCount(int i, int i2) {
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.feedback.ItemReviewsAdapter");
        C6465j jVar = (C6465j) aVar;
        jVar.f14358g = true;
        jVar.notifyItemChanged(0);
        ReviewsSortFilterHeader reviewsSortFilterHeader = this.stickySortFilterHeader;
        if (reviewsSortFilterHeader != null) {
            reviewsSortFilterHeader.updateResultCount(i, i2);
        } else {
            C19383o.m32805o("stickySortFilterHeader");
            throw null;
        }
    }

    private final void showRatingBottomSheet(Rating rating) {
        if (this.ratingBottomSheet == null) {
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            this.ratingBottomSheet = new CollageBottomSheet(requireContext);
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            RatingBottomSheet ratingBottomSheet2 = new RatingBottomSheet(requireContext2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            this.ratingBottomSheetContent = ratingBottomSheet2;
            FeedbackViewModel feedbackViewModel = this.viewModel;
            if (feedbackViewModel != null) {
                ratingBottomSheet2.setRatingClickListener(new ItemReviewsFragment$showRatingBottomSheet$1(feedbackViewModel));
                CollageBottomSheet collageBottomSheet = this.ratingBottomSheet;
                if (collageBottomSheet != null) {
                    RatingBottomSheet ratingBottomSheet3 = this.ratingBottomSheetContent;
                    C19383o.m32794d(ratingBottomSheet3);
                    collageBottomSheet.setContentView((View) ratingBottomSheet3);
                }
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        }
        RatingBottomSheet ratingBottomSheet4 = this.ratingBottomSheetContent;
        if (ratingBottomSheet4 != null) {
            ratingBottomSheet4.setSelectedRating(rating);
        }
        CollageBottomSheet collageBottomSheet2 = this.ratingBottomSheet;
        if (collageBottomSheet2 != null) {
            collageBottomSheet2.show();
        }
    }

    private final void showSortBottomSheet(SortType sortType) {
        if (this.sortingBottomSheet == null) {
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            this.sortingBottomSheet = new CollageBottomSheet(requireContext);
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            SortBottomSheet sortBottomSheet = new SortBottomSheet(requireContext2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            this.sortingBottomSheetContent = sortBottomSheet;
            FeedbackViewModel feedbackViewModel = this.viewModel;
            if (feedbackViewModel != null) {
                sortBottomSheet.setSortClickListener(new ItemReviewsFragment$showSortBottomSheet$1(feedbackViewModel));
                CollageBottomSheet collageBottomSheet = this.sortingBottomSheet;
                if (collageBottomSheet != null) {
                    SortBottomSheet sortBottomSheet2 = this.sortingBottomSheetContent;
                    C19383o.m32794d(sortBottomSheet2);
                    collageBottomSheet.setContentView((View) sortBottomSheet2);
                }
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        }
        SortBottomSheet sortBottomSheet3 = this.sortingBottomSheetContent;
        if (sortBottomSheet3 != null) {
            sortBottomSheet3.setSelectedSortType(sortType);
        }
        CollageBottomSheet collageBottomSheet2 = this.sortingBottomSheet;
        if (collageBottomSheet2 != null) {
            collageBottomSheet2.show();
        }
    }

    private final void updateReview(ReviewUiModel reviewUiModel) {
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.feedback.ItemReviewsAdapter");
        C6465j jVar = (C6465j) aVar;
        C19383o.m32797g(reviewUiModel, "review");
        List items = jVar.getItems();
        C19383o.m32796f(items, ResponseConstants.ITEMS);
        Iterator it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C19383o.m32792b(((ReviewUiModel) it.next()).getTransactionId(), reviewUiModel.getTransactionId())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            jVar.getItems().set(i, reviewUiModel);
            jVar.notifyItemChanged(jVar.getHeaderCount() + i);
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

    public String getFragmentTitleString() {
        ItemReviewsUiData itemReviewsUiData = this.reviewsData;
        if (itemReviewsUiData == null) {
            C19383o.m32805o("reviewsData");
            throw null;
        } else if (itemReviewsUiData.getItemReviewsCount() == 0) {
            String string = getResources().getString(R.string.reviews);
            C19383o.m32796f(string, "{\n            resources.…string.reviews)\n        }");
            return string;
        } else {
            NumberFormat numberInstance = NumberFormat.getNumberInstance(this.currentLocale.mo46718b());
            ItemReviewsUiData itemReviewsUiData2 = this.reviewsData;
            if (itemReviewsUiData2 != null) {
                String format = numberInstance.format(Integer.valueOf(itemReviewsUiData2.getItemReviewsCount()));
                String string2 = getResources().getString(R.string.reviews_with_count, new Object[]{format});
                C19383o.m32796f(string2, "{\n            val format…formattedCount)\n        }");
                return string2;
            }
            C19383o.m32805o("reviewsData");
            throw null;
        }
    }

    public int getLayoutId() {
        return R.layout.fragment_item_reviews;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey(ITEM_REVIEWS_DATA)) {
            throw new IllegalStateException("Reviews data is required");
        }
        Parcelable parcelable = arguments.getParcelable(ITEM_REVIEWS_DATA);
        C19383o.m32794d(parcelable);
        this.reviewsData = (ItemReviewsUiData) parcelable;
        this.adapter = new C6465j(getActivity(), this.translationHelper, new ItemReviewsFragment$onCreate$1(this), new ItemReviewsFragment$onCreate$2(this), new ItemReviewsFragment$onCreate$3(this));
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_listing_item_all_reviews, menu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            android.view.View r7 = super.onCreateView(r5, r6, r7)
            java.lang.String r0 = "super.onCreateView(infla…iner, savedInstanceState)"
            kotlin.jvm.internal.C19383o.m32796f(r7, r0)
            r0 = 2131624792(0x7f0e0358, float:1.8876774E38)
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r6 = 2131428743(0x7f0b0587, float:1.847914E38)
            android.view.View r6 = r5.findViewById(r6)
            java.lang.String r0 = "emptyView.findViewById<V…em_reviews_clear_filters)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r0)
            com.etsy.android.feedback.ItemReviewsFragment$onCreateView$1 r0 = new com.etsy.android.feedback.ItemReviewsFragment$onCreateView$1
            r0.<init>(r4)
            com.etsy.android.extensions.ViewExtensions.m12866j(r6, r0)
            r4.setEmptyView(r5)
            r5 = 2131428746(0x7f0b058a, float:1.8479145E38)
            android.view.View r5 = r7.findViewById(r5)
            java.lang.String r6 = "view.findViewById(R.id.i…reviews_rating_star_bars)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            com.etsy.android.ui.feedback.RatingStarBarsView r5 = (com.etsy.android.p327ui.feedback.RatingStarBarsView) r5
            r4.ratingsStarBarsView = r5
            com.etsy.android.feedback.ItemReviewsFragment$onCreateView$2 r6 = new com.etsy.android.feedback.ItemReviewsFragment$onCreateView$2
            r6.<init>(r4)
            r5.setOnRatingClicked(r6)
            r5 = 2131428745(0x7f0b0589, float:1.8479143E38)
            android.view.View r5 = r7.findViewById(r5)
            java.lang.String r6 = "view.findViewById(R.id.item_reviews_photos)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            r4.photosCarouselView = r5
            com.etsy.android.feedback.ItemReviewsFragment$ItemReviewsUiData r5 = r4.reviewsData
            r6 = 0
            java.lang.String r0 = "reviewsData"
            if (r5 == 0) goto L_0x0147
            java.util.List r5 = r5.getReviewImages()
            if (r5 == 0) goto L_0x00a2
            boolean r2 = r5.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x00a2
            com.etsy.android.feedback.ItemReviewsFragment$ItemReviewsUiData r2 = r4.reviewsData
            if (r2 == 0) goto L_0x009e
            boolean r2 = r2.getShowVideoReviews()
            if (r2 != 0) goto L_0x00a2
            com.etsy.android.ui.common.listingreview.a r2 = new com.etsy.android.ui.common.listingreview.a
            com.etsy.android.feedback.ItemReviewsFragment$onCreateView$photosAdapter$1 r3 = new com.etsy.android.feedback.ItemReviewsFragment$onCreateView$photosAdapter$1
            r3.<init>(r4)
            r2.<init>(r3)
            java.util.ArrayList<com.etsy.android.lib.models.apiv3.listing.ReviewImage> r3 = r2.f20933d
            r3.clear()
            java.util.ArrayList<com.etsy.android.lib.models.apiv3.listing.ReviewImage> r3 = r2.f20933d
            r3.addAll(r5)
            r5 = 2131429490(0x7f0b0872, float:1.8480654E38)
            android.view.View r5 = r7.findViewById(r5)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.getContext()
            r3.<init>(r1, r1)
            r5.setLayoutManager(r3)
            r5.setAdapter(r2)
            goto L_0x00a9
        L_0x009e:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x00a2:
            android.view.View r5 = r4.photosCarouselView
            if (r5 == 0) goto L_0x0141
            com.etsy.android.extensions.ViewExtensions.m12860d(r5)
        L_0x00a9:
            r5 = 2131428747(0x7f0b058b, float:1.8479147E38)
            android.view.View r5 = r7.findViewById(r5)
            java.lang.String r1 = "view.findViewById(R.id.i…views_sort_filter_header)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r1)
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r5 = (com.etsy.android.feedback.view.ReviewsSortFilterHeader) r5
            r4.stickySortFilterHeader = r5
            com.etsy.android.feedback.ItemReviewsFragment$b r1 = new com.etsy.android.feedback.ItemReviewsFragment$b
            r1.<init>(r4)
            r5.setClickHandler(r1)
            com.etsy.android.feedback.ItemReviewsFragment$ItemReviewsUiData r5 = r4.reviewsData
            if (r5 == 0) goto L_0x013d
            boolean r5 = r5.getShowVideoReviews()
            java.lang.String r0 = "stickySortFilterHeader"
            if (r5 == 0) goto L_0x00f2
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r5 = r4.stickySortFilterHeader
            if (r5 == 0) goto L_0x00ee
            r5.showVideosFilter()
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r5 = r4.stickySortFilterHeader
            if (r5 == 0) goto L_0x00ea
            r5.hideRatingsFilter()
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r5 = r4.stickySortFilterHeader
            if (r5 == 0) goto L_0x00e6
            r1 = 2132017858(0x7f1402c2, float:1.9674006E38)
            r5.updateFilterStyle(r1)
            goto L_0x010a
        L_0x00e6:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x00ea:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x00ee:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x00f2:
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r5 = r4.stickySortFilterHeader
            if (r5 == 0) goto L_0x0139
            r5.hideVideosFilter()
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r5 = r4.stickySortFilterHeader
            if (r5 == 0) goto L_0x0135
            r5.showRatingsFilter()
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r5 = r4.stickySortFilterHeader
            if (r5 == 0) goto L_0x0131
            r1 = 2132017857(0x7f1402c1, float:1.9674004E38)
            r5.updateFilterStyle(r1)
        L_0x010a:
            android.content.res.Resources r5 = r4.getResources()
            r1 = 2131165358(0x7f0700ae, float:1.794493E38)
            int r5 = r5.getDimensionPixelSize(r1)
            ef.a r1 = new ef.a
            com.etsy.android.feedback.view.ReviewsSortFilterHeader r2 = r4.stickySortFilterHeader
            if (r2 == 0) goto L_0x012d
            com.etsy.android.lib.logger.p r6 = r4.getAnalyticsContext()
            r1.<init>(r2, r6)
            androidx.recyclerview.widget.RecyclerView r6 = r4.recyclerView
            com.etsy.android.feedback.ItemReviewsFragment$c r0 = new com.etsy.android.feedback.ItemReviewsFragment$c
            r0.<init>(r1, r4, r5)
            r6.addOnScrollListener(r0)
            return r7
        L_0x012d:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x0131:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x0135:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x0139:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x013d:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        L_0x0141:
            java.lang.String r5 = "photosCarouselView"
            kotlin.jvm.internal.C19383o.m32805o(r5)
            throw r6
        L_0x0147:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.ItemReviewsFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onLoadContent() {
        showLoadingView();
        FeedbackViewModel feedbackViewModel = this.viewModel;
        if (feedbackViewModel != null) {
            int apiOffset = getApiOffset();
            ItemReviewsUiData itemReviewsUiData = this.reviewsData;
            if (itemReviewsUiData != null) {
                feedbackViewModel.mo18346f((String) null, apiOffset, (String) null, itemReviewsUiData.getShowVideoReviews());
            } else {
                C19383o.m32805o("reviewsData");
                throw null;
            }
        } else {
            C19383o.m32805o("viewModel");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_contact_shop) {
            return super.onOptionsItemSelected(menuItem);
        }
        getAnalyticsContext().mo21333d("see_all_reviews_contact_shop_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        FeedbackViewModel feedbackViewModel = this.viewModel;
        if (feedbackViewModel != null) {
            feedbackViewModel.mo18344c();
            return true;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C19383o.m32797g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.menu_contact_shop);
        if (findItem != null) {
            FeedbackViewModel feedbackViewModel = this.viewModel;
            if (feedbackViewModel != null) {
                Boolean bool = (Boolean) feedbackViewModel.f14285w.getValue();
                findItem.setVisible(bool == null ? false : bool.booleanValue());
                return;
            }
            C19383o.m32805o("viewModel");
            throw null;
        }
    }

    public final void onReviewClicked(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "review");
        ListingReviewNavigationKey.C10703a aVar = ListingReviewNavigationKey.Companion;
        boolean b = getConfigMap().mo21132b(C8592b.f18847y1);
        String c0 = C19421p.m32935c0(getActivity());
        List d0 = C17782b.m29864d0(C0005b.m19M(reviewUiModel, true));
        aVar.getClass();
        C12790b.m20430b(this, ListingReviewNavigationKey.C10703a.m18610a(b, c0, d0, 0));
    }

    public final void onTranslationButtonClicked(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "review");
        FeedbackViewModel feedbackViewModel = this.viewModel;
        if (feedbackViewModel != null) {
            feedbackViewModel.mo18349i(reviewUiModel);
        } else {
            C19383o.m32805o("viewModel");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        Context requireContext = requireContext();
        Object obj = C8184a.f17966a;
        this.recyclerView.addItemDecoration(new ItemDividerDecoration(C8184a.C8187c.m16466b(requireContext, R.drawable.list_divider), dimensionPixelSize));
        Reviews.ReviewType reviewType = Reviews.ReviewType.LISTING;
        ItemReviewsUiData itemReviewsUiData = this.reviewsData;
        if (itemReviewsUiData != null) {
            Long valueOf = Long.valueOf(itemReviewsUiData.getListingId());
            ItemReviewsUiData itemReviewsUiData2 = this.reviewsData;
            if (itemReviewsUiData2 != null) {
                String listingTitle = itemReviewsUiData2.getListingTitle();
                ItemReviewsUiData itemReviewsUiData3 = this.reviewsData;
                if (itemReviewsUiData3 != null) {
                    String listingUrl = itemReviewsUiData3.getListingUrl();
                    ItemReviewsUiData itemReviewsUiData4 = this.reviewsData;
                    if (itemReviewsUiData4 != null) {
                        String valueOf2 = String.valueOf(itemReviewsUiData4.getShopId());
                        ItemReviewsUiData itemReviewsUiData5 = this.reviewsData;
                        if (itemReviewsUiData5 != null) {
                            Long shopOwnerId = itemReviewsUiData5.getShopOwnerId();
                            ItemReviewsUiData itemReviewsUiData6 = this.reviewsData;
                            if (itemReviewsUiData6 != null) {
                                String shopName = itemReviewsUiData6.getShopName();
                                ItemReviewsUiData itemReviewsUiData7 = this.reviewsData;
                                if (itemReviewsUiData7 != null) {
                                    String shopLoginName = itemReviewsUiData7.getShopLoginName();
                                    ItemReviewsUiData itemReviewsUiData8 = this.reviewsData;
                                    if (itemReviewsUiData8 != null) {
                                        String shopDisplayName = itemReviewsUiData8.getShopDisplayName();
                                        ItemReviewsUiData itemReviewsUiData9 = this.reviewsData;
                                        if (itemReviewsUiData9 != null) {
                                            C6462g gVar = new C6462g(reviewType, valueOf, listingTitle, listingUrl, valueOf2, shopOwnerId, shopName, shopLoginName, shopDisplayName, Integer.valueOf(itemReviewsUiData9.getItemReviewsCount()));
                                            C8569c cVar = this.listingRepository;
                                            C11309y0 y0Var = this.shopInfoRepository;
                                            C11132b1 b1Var = this.shopReviewsRepository;
                                            C11201t tVar = this.reviewsTranslationRepository;
                                            C13888d dVar = this.currentLocale;
                                            C13265p pVar = this.session;
                                            C13461f fVar = this.rxSchedulers;
                                            C8623e configMap = getConfigMap();
                                            C19383o.m32796f(configMap, "configMap");
                                            FeedbackViewModel feedbackViewModel = (FeedbackViewModel) new C2870k0((C2880m0) this, (C2870k0.C2872b) new C6463h(gVar, cVar, y0Var, b1Var, tVar, dVar, pVar, fVar, true, new C6473r(configMap), this.resourceProvider)).mo10829a(FeedbackViewModel.class);
                                            this.viewModel = feedbackViewModel;
                                            feedbackViewModel.f14276n.observe(getViewLifecycleOwner(), new C6466k(this, 0));
                                            FeedbackViewModel feedbackViewModel2 = this.viewModel;
                                            if (feedbackViewModel2 != null) {
                                                feedbackViewModel2.f14282t.observe(getViewLifecycleOwner(), new C6467l(this, 0));
                                                FeedbackViewModel feedbackViewModel3 = this.viewModel;
                                                if (feedbackViewModel3 != null) {
                                                    feedbackViewModel3.f14285w.observe(getViewLifecycleOwner(), new C6468m(this, 0));
                                                    ItemReviewsUiData itemReviewsUiData10 = this.reviewsData;
                                                    if (itemReviewsUiData10 != null) {
                                                        if (itemReviewsUiData10.getWithPhotosFilter()) {
                                                            FeedbackViewModel feedbackViewModel4 = this.viewModel;
                                                            if (feedbackViewModel4 != null) {
                                                                feedbackViewModel4.mo18347g();
                                                            } else {
                                                                C19383o.m32805o("viewModel");
                                                                throw null;
                                                            }
                                                        } else {
                                                            ItemReviewsUiData itemReviewsUiData11 = this.reviewsData;
                                                            if (itemReviewsUiData11 == null) {
                                                                C19383o.m32805o("reviewsData");
                                                                throw null;
                                                            } else if (itemReviewsUiData11.getShowVideoReviews()) {
                                                                ItemReviewsUiData itemReviewsUiData12 = this.reviewsData;
                                                                if (itemReviewsUiData12 == null) {
                                                                    C19383o.m32805o("reviewsData");
                                                                    throw null;
                                                                } else if (itemReviewsUiData12.getWithVideosFilter()) {
                                                                    FeedbackViewModel feedbackViewModel5 = this.viewModel;
                                                                    if (feedbackViewModel5 != null) {
                                                                        feedbackViewModel5.mo18348h();
                                                                    } else {
                                                                        C19383o.m32805o("viewModel");
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        FeedbackViewModel feedbackViewModel6 = this.viewModel;
                                                        if (feedbackViewModel6 != null) {
                                                            feedbackViewModel6.f14278p.observe(getViewLifecycleOwner(), new C6469n(this, 0));
                                                            onLoadContent();
                                                            return;
                                                        }
                                                        C19383o.m32805o("viewModel");
                                                        throw null;
                                                    }
                                                    C19383o.m32805o("reviewsData");
                                                    throw null;
                                                }
                                                C19383o.m32805o("viewModel");
                                                throw null;
                                            }
                                            C19383o.m32805o("viewModel");
                                            throw null;
                                        }
                                        C19383o.m32805o("reviewsData");
                                        throw null;
                                    }
                                    C19383o.m32805o("reviewsData");
                                    throw null;
                                }
                                C19383o.m32805o("reviewsData");
                                throw null;
                            }
                            C19383o.m32805o("reviewsData");
                            throw null;
                        }
                        C19383o.m32805o("reviewsData");
                        throw null;
                    }
                    C19383o.m32805o("reviewsData");
                    throw null;
                }
                C19383o.m32805o("reviewsData");
                throw null;
            }
            C19383o.m32805o("reviewsData");
            throw null;
        }
        C19383o.m32805o("reviewsData");
        throw null;
    }

    public static final class ItemReviewsUiData implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ItemReviewsUiData> CREATOR = new Creator();
        private final int itemReviewsCount;
        private final long listingId;
        private final String listingTitle;
        private final String listingUrl;
        private final List<ReviewImage> reviewImages;
        private final String shopDisplayName;
        private final long shopId;
        private final String shopLoginName;
        private final String shopName;
        private final Long shopOwnerId;
        private final boolean showVideoReviews;
        private final boolean withPhotosFilter;
        private final boolean withVideosFilter;

        public static final class Creator implements Parcelable.Creator<ItemReviewsUiData> {
            public final ItemReviewsUiData createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                C19383o.m32797g(parcel2, "parcel");
                long readLong = parcel.readLong();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                long readLong2 = parcel.readLong();
                ArrayList arrayList = null;
                Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    for (int i = 0; i != readInt2; i++) {
                        arrayList.add(ReviewImage.CREATOR.createFromParcel(parcel2));
                    }
                }
                return new ItemReviewsUiData(readLong, readString, readString2, readLong2, valueOf, readString3, readString4, readString5, readInt, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            public final ItemReviewsUiData[] newArray(int i) {
                return new ItemReviewsUiData[i];
            }
        }

        public ItemReviewsUiData(long j, String str, String str2, long j2, Long l, String str3, String str4, String str5, int i, List<ReviewImage> list, boolean z, boolean z2, boolean z3) {
            C19383o.m32797g(str, "listingTitle");
            C19383o.m32797g(str2, "listingUrl");
            this.listingId = j;
            this.listingTitle = str;
            this.listingUrl = str2;
            this.shopId = j2;
            this.shopOwnerId = l;
            this.shopName = str3;
            this.shopLoginName = str4;
            this.shopDisplayName = str5;
            this.itemReviewsCount = i;
            this.reviewImages = list;
            this.withPhotosFilter = z;
            this.showVideoReviews = z2;
            this.withVideosFilter = z3;
        }

        public static /* synthetic */ ItemReviewsUiData copy$default(ItemReviewsUiData itemReviewsUiData, long j, String str, String str2, long j2, Long l, String str3, String str4, String str5, int i, List list, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            ItemReviewsUiData itemReviewsUiData2 = itemReviewsUiData;
            int i3 = i2;
            return itemReviewsUiData.copy((i3 & 1) != 0 ? itemReviewsUiData2.listingId : j, (i3 & 2) != 0 ? itemReviewsUiData2.listingTitle : str, (i3 & 4) != 0 ? itemReviewsUiData2.listingUrl : str2, (i3 & 8) != 0 ? itemReviewsUiData2.shopId : j2, (i3 & 16) != 0 ? itemReviewsUiData2.shopOwnerId : l, (i3 & 32) != 0 ? itemReviewsUiData2.shopName : str3, (i3 & 64) != 0 ? itemReviewsUiData2.shopLoginName : str4, (i3 & 128) != 0 ? itemReviewsUiData2.shopDisplayName : str5, (i3 & 256) != 0 ? itemReviewsUiData2.itemReviewsCount : i, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? itemReviewsUiData2.reviewImages : list, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? itemReviewsUiData2.withPhotosFilter : z, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? itemReviewsUiData2.showVideoReviews : z2, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? itemReviewsUiData2.withVideosFilter : z3);
        }

        public final long component1() {
            return this.listingId;
        }

        public final List<ReviewImage> component10() {
            return this.reviewImages;
        }

        public final boolean component11() {
            return this.withPhotosFilter;
        }

        public final boolean component12() {
            return this.showVideoReviews;
        }

        public final boolean component13() {
            return this.withVideosFilter;
        }

        public final String component2() {
            return this.listingTitle;
        }

        public final String component3() {
            return this.listingUrl;
        }

        public final long component4() {
            return this.shopId;
        }

        public final Long component5() {
            return this.shopOwnerId;
        }

        public final String component6() {
            return this.shopName;
        }

        public final String component7() {
            return this.shopLoginName;
        }

        public final String component8() {
            return this.shopDisplayName;
        }

        public final int component9() {
            return this.itemReviewsCount;
        }

        public final ItemReviewsUiData copy(long j, String str, String str2, long j2, Long l, String str3, String str4, String str5, int i, List<ReviewImage> list, boolean z, boolean z2, boolean z3) {
            String str6 = str;
            C19383o.m32797g(str6, "listingTitle");
            String str7 = str2;
            C19383o.m32797g(str7, "listingUrl");
            return new ItemReviewsUiData(j, str6, str7, j2, l, str3, str4, str5, i, list, z, z2, z3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemReviewsUiData)) {
                return false;
            }
            ItemReviewsUiData itemReviewsUiData = (ItemReviewsUiData) obj;
            return this.listingId == itemReviewsUiData.listingId && C19383o.m32792b(this.listingTitle, itemReviewsUiData.listingTitle) && C19383o.m32792b(this.listingUrl, itemReviewsUiData.listingUrl) && this.shopId == itemReviewsUiData.shopId && C19383o.m32792b(this.shopOwnerId, itemReviewsUiData.shopOwnerId) && C19383o.m32792b(this.shopName, itemReviewsUiData.shopName) && C19383o.m32792b(this.shopLoginName, itemReviewsUiData.shopLoginName) && C19383o.m32792b(this.shopDisplayName, itemReviewsUiData.shopDisplayName) && this.itemReviewsCount == itemReviewsUiData.itemReviewsCount && C19383o.m32792b(this.reviewImages, itemReviewsUiData.reviewImages) && this.withPhotosFilter == itemReviewsUiData.withPhotosFilter && this.showVideoReviews == itemReviewsUiData.showVideoReviews && this.withVideosFilter == itemReviewsUiData.withVideosFilter;
        }

        public final int getItemReviewsCount() {
            return this.itemReviewsCount;
        }

        public final long getListingId() {
            return this.listingId;
        }

        public final String getListingTitle() {
            return this.listingTitle;
        }

        public final String getListingUrl() {
            return this.listingUrl;
        }

        public final List<ReviewImage> getReviewImages() {
            return this.reviewImages;
        }

        public final String getShopDisplayName() {
            return this.shopDisplayName;
        }

        public final long getShopId() {
            return this.shopId;
        }

        public final String getShopLoginName() {
            return this.shopLoginName;
        }

        public final String getShopName() {
            return this.shopName;
        }

        public final Long getShopOwnerId() {
            return this.shopOwnerId;
        }

        public final boolean getShowVideoReviews() {
            return this.showVideoReviews;
        }

        public final boolean getWithPhotosFilter() {
            return this.withPhotosFilter;
        }

        public final boolean getWithVideosFilter() {
            return this.withVideosFilter;
        }

        public int hashCode() {
            int b = C0071c.m190b(this.shopId, C0023f.m105e(this.listingUrl, C0023f.m105e(this.listingTitle, Long.hashCode(this.listingId) * 31, 31), 31), 31);
            Long l = this.shopOwnerId;
            int i = 0;
            int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.shopName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.shopLoginName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.shopDisplayName;
            int a = C0069a.m170a(this.itemReviewsCount, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
            List<ReviewImage> list = this.reviewImages;
            if (list != null) {
                i = list.hashCode();
            }
            int i2 = (a + i) * 31;
            boolean z = this.withPhotosFilter;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.showVideoReviews;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.withVideosFilter;
            if (!z4) {
                z2 = z4;
            }
            return i4 + (z2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("ItemReviewsUiData(listingId=");
            h.append(this.listingId);
            h.append(", listingTitle=");
            h.append(this.listingTitle);
            h.append(", listingUrl=");
            h.append(this.listingUrl);
            h.append(", shopId=");
            h.append(this.shopId);
            h.append(", shopOwnerId=");
            h.append(this.shopOwnerId);
            h.append(", shopName=");
            h.append(this.shopName);
            h.append(", shopLoginName=");
            h.append(this.shopLoginName);
            h.append(", shopDisplayName=");
            h.append(this.shopDisplayName);
            h.append(", itemReviewsCount=");
            h.append(this.itemReviewsCount);
            h.append(", reviewImages=");
            h.append(this.reviewImages);
            h.append(", withPhotosFilter=");
            h.append(this.withPhotosFilter);
            h.append(", showVideoReviews=");
            h.append(this.showVideoReviews);
            h.append(", withVideosFilter=");
            return C0391c.m1058d(h, this.withVideosFilter, ')');
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            parcel.writeLong(this.listingId);
            parcel.writeString(this.listingTitle);
            parcel.writeString(this.listingUrl);
            parcel.writeLong(this.shopId);
            Long l = this.shopOwnerId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                C0069a.m180k(parcel, 1, l);
            }
            parcel.writeString(this.shopName);
            parcel.writeString(this.shopLoginName);
            parcel.writeString(this.shopDisplayName);
            parcel.writeInt(this.itemReviewsCount);
            List<ReviewImage> list = this.reviewImages;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (ReviewImage writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, i);
                }
            }
            parcel.writeInt(this.withPhotosFilter ? 1 : 0);
            parcel.writeInt(this.showVideoReviews ? 1 : 0);
            parcel.writeInt(this.withVideosFilter ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ItemReviewsUiData(long r20, java.lang.String r22, java.lang.String r23, long r24, java.lang.Long r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, java.util.List r31, boolean r32, boolean r33, boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
            /*
                r19 = this;
                r0 = r35
                r1 = r0 & 1024(0x400, float:1.435E-42)
                r2 = 0
                if (r1 == 0) goto L_0x000a
                r16 = r2
                goto L_0x000c
            L_0x000a:
                r16 = r32
            L_0x000c:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x0013
                r17 = r2
                goto L_0x0015
            L_0x0013:
                r17 = r33
            L_0x0015:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x001c
                r18 = r2
                goto L_0x001e
            L_0x001c:
                r18 = r34
            L_0x001e:
                r3 = r19
                r4 = r20
                r6 = r22
                r7 = r23
                r8 = r24
                r10 = r26
                r11 = r27
                r12 = r28
                r13 = r29
                r14 = r30
                r15 = r31
                r3.<init>(r4, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.ItemReviewsFragment.ItemReviewsUiData.<init>(long, java.lang.String, java.lang.String, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
