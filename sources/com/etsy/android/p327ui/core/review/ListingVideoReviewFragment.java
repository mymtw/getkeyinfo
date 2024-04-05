package com.etsy.android.p327ui.core.review;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.p327ui.common.listingreview.redesign.ReviewViewRedesign;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageContentToggleShort;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.p526ui.PlayerControlView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19543e0;
import p364hf.C12826b;
import p381kc.C12991b;
import p392lf.C13020a;
import p435rb.C13350a;
import p440s9.C13366a;
import p594jh.C17884a1;
import p594jh.C17919i;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment */
public final class ListingVideoReviewFragment extends TrackingBaseFragment implements C13366a, C13020a {
    public static final int $stable = 8;
    public static final C9704a Companion = new C9704a();
    public static final int LINE_COUNT_IN_COLLAPSED_STATE = 2;
    public static final int VIDEO_CONTROLLER_AUTO_HIDE_DURATION = 3000;
    public Map<Integer, View> _$_findViewCache;
    private final C12991b listener;
    /* access modifiers changed from: private */
    public FrameLayout loadingView;
    private ConstraintLayout replayOverlayView;
    /* access modifiers changed from: private */
    public ConstraintLayout reviewDetails;
    /* access modifiers changed from: private */
    public CollagePlayerView videoViewCollage;
    public C9715e viewModel;

    /* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$a */
    public static final class C9704a {
    }

    /* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$b */
    public static final class C9705b extends C17919i {

        /* renamed from: d */
        public final C8672b f21485d;

        public C9705b(C8703p pVar) {
            this.f21485d = pVar;
        }

        /* renamed from: h */
        public final void mo32478h(C17884a1 a1Var, boolean z) {
            C19383o.m32797g(a1Var, "player");
            if (z) {
                this.f21485d.mo21333d(DisplayVideoReviewsEvent.VIDEO_REVIEW_PLAY.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
            } else {
                this.f21485d.mo21333d(DisplayVideoReviewsEvent.VIDEO_REVIEW_PAUSE.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
            }
            a1Var.mo69329l(z);
        }

        /* renamed from: i */
        public final void mo32479i(C17884a1 a1Var, int i, long j) {
            C19383o.m32797g(a1Var, "player");
            this.f21485d.mo21333d(DisplayVideoReviewsEvent.VIDEO_REVIEW_SCRUBBER_USED.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
            a1Var.mo69347w(i, j);
        }
    }

    /* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$c */
    public static final class C9706c implements C17884a1.C17888d {

        /* renamed from: b */
        public final /* synthetic */ ListingVideoReviewFragment f21486b;

        public C9706c(ListingVideoReviewFragment listingVideoReviewFragment) {
            this.f21486b = listingVideoReviewFragment;
        }

        public final void onPlaybackStateChanged(int i) {
            if (i == 2) {
                this.f21486b.onPlaybackBuffering();
            } else if (i == 3) {
                this.f21486b.onPlaybackReady();
            } else if (i != 4) {
                FrameLayout access$getLoadingView$p = this.f21486b.loadingView;
                if (access$getLoadingView$p != null) {
                    ViewExtensions.m12860d(access$getLoadingView$p);
                } else {
                    C19383o.m32805o("loadingView");
                    throw null;
                }
            } else {
                this.f21486b.onPlaybackEnded();
            }
        }

        public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C19383o.m32797g(exoPlaybackException, "error");
            this.f21486b.onPlayerError();
        }
    }

    /* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$d */
    public static final class C9707d implements PlayerControlView.C14396c {

        /* renamed from: b */
        public final /* synthetic */ ListingVideoReviewFragment f21487b;

        /* renamed from: c */
        public final /* synthetic */ float f21488c;

        public C9707d(ListingVideoReviewFragment listingVideoReviewFragment, float f) {
            this.f21487b = listingVideoReviewFragment;
            this.f21488c = f;
        }

        /* renamed from: a */
        public final void mo32480a(int i) {
            if (i == 0) {
                ConstraintLayout access$getReviewDetails$p = this.f21487b.reviewDetails;
                if (access$getReviewDetails$p != null) {
                    C12826b bVar = new C12826b(access$getReviewDetails$p);
                    float f = this.f21488c;
                    bVar.f28308c.add(new C12826b.C12827a(6, PropertyValuesHolder.ofFloat("translationY", new float[]{f, 0.0f})));
                    bVar.f28312g = new DecelerateInterpolator();
                    bVar.mo45610a();
                    return;
                }
                C19383o.m32805o("reviewDetails");
                throw null;
            }
            ConstraintLayout access$getReviewDetails$p2 = this.f21487b.reviewDetails;
            if (access$getReviewDetails$p2 != null) {
                C12826b bVar2 = new C12826b(access$getReviewDetails$p2);
                float f2 = this.f21488c;
                bVar2.f28308c.add(new C12826b.C12827a(6, PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f, f2})));
                bVar2.f28312g = new AccelerateInterpolator();
                bVar2.mo45610a();
                return;
            }
            C19383o.m32805o("reviewDetails");
            throw null;
        }
    }

    public ListingVideoReviewFragment() {
        this((C12991b) null, 1, (DefaultConstructorMarker) null);
    }

    public ListingVideoReviewFragment(C12991b bVar) {
        this._$_findViewCache = new LinkedHashMap();
        this.listener = bVar;
    }

    private final String getFormattedReviewText(ReviewUiModel reviewUiModel) {
        MachineTranslationViewState translationState = reviewUiModel.getTranslationState();
        String review = (!translationState.getShouldShowTranslation() || !translationState.isTranslated()) ? reviewUiModel.getReview() : reviewUiModel.getTranslatedReview();
        if (review == null) {
            return null;
        }
        boolean z = true;
        if (!C18263b.m30810E(review)) {
            z = false;
        }
        return z ? C19457k.m33023a1(review, "<br />", "", false) : C19457k.m33023a1(review, "\n", "", false);
    }

    private final int getMaxCharactersInCollapsedState(CollageContentToggleShort collageContentToggleShort) {
        return (C19388s.m32857c0(collageContentToggleShort) * 2) - (getString(R.string.shop_home_tab_title_more).length() + 3);
    }

    private final ListingVideoReviewFragment$getSwipeDownListener$1 getSwipeDownListener() {
        return new ListingVideoReviewFragment$getSwipeDownListener$1(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m34964onCreate$lambda0(ListingVideoReviewFragment listingVideoReviewFragment, C9716f fVar) {
        C19383o.m32797g(listingVideoReviewFragment, "this$0");
        listingVideoReviewFragment.setReviewData(fVar.f21508b);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final C2348w0 m34965onCreateView$lambda1(ViewGroup viewGroup, ListingVideoReviewFragment listingVideoReviewFragment, View view, C2348w0 w0Var) {
        C19383o.m32797g(listingVideoReviewFragment, "this$0");
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5274u(viewGroup, (C2325q) null);
        listingVideoReviewFragment.updateDismissButtonMargins(w0Var.mo8942b(1).f18321b);
        return w0Var;
    }

    /* access modifiers changed from: private */
    public final void onPlaybackBuffering() {
        FrameLayout frameLayout = this.loadingView;
        if (frameLayout != null) {
            ViewExtensions.m12869m(frameLayout);
            CollagePlayerView collagePlayerView = this.videoViewCollage;
            if (collagePlayerView != null) {
                ViewExtensions.m12869m(collagePlayerView);
                ConstraintLayout constraintLayout = this.replayOverlayView;
                if (constraintLayout != null) {
                    ViewExtensions.m12860d(constraintLayout);
                } else {
                    C19383o.m32805o("replayOverlayView");
                    throw null;
                }
            } else {
                C19383o.m32805o("videoViewCollage");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void onPlaybackEnded() {
        ConstraintLayout constraintLayout = this.replayOverlayView;
        if (constraintLayout != null) {
            ViewExtensions.m12869m(constraintLayout);
            Context context = getContext();
            Integer valueOf = context != null ? Integer.valueOf(C13350a.m21012c(context, R.color.exo_black_opacity_70)) : null;
            if (valueOf != null) {
                CollagePlayerView collagePlayerView = this.videoViewCollage;
                if (collagePlayerView != null) {
                    View findViewById = collagePlayerView.findViewById(R.id.exo_overlay);
                    if (findViewById != null) {
                        findViewById.setBackgroundColor(valueOf.intValue());
                    }
                } else {
                    C19383o.m32805o("videoViewCollage");
                    throw null;
                }
            }
            ConstraintLayout constraintLayout2 = this.replayOverlayView;
            if (constraintLayout2 != null) {
                Button button = (Button) constraintLayout2.findViewById(R.id.video_review_replay_button);
                if (button != null) {
                    ViewExtensions.m12866j(button, new ListingVideoReviewFragment$onPlaybackEnded$1(this));
                    return;
                }
                return;
            }
            C19383o.m32805o("replayOverlayView");
            throw null;
        }
        C19383o.m32805o("replayOverlayView");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void onPlaybackReady() {
        FrameLayout frameLayout = this.loadingView;
        if (frameLayout != null) {
            ViewExtensions.m12860d(frameLayout);
            CollagePlayerView collagePlayerView = this.videoViewCollage;
            if (collagePlayerView != null) {
                ViewExtensions.m12869m(collagePlayerView);
                ConstraintLayout constraintLayout = this.replayOverlayView;
                if (constraintLayout != null) {
                    ViewExtensions.m12860d(constraintLayout);
                    CollagePlayerView collagePlayerView2 = this.videoViewCollage;
                    if (collagePlayerView2 != null) {
                        View findViewById = collagePlayerView2.findViewById(R.id.exo_overlay);
                        if (findViewById != null) {
                            findViewById.setBackgroundColor(0);
                            return;
                        }
                        return;
                    }
                    C19383o.m32805o("videoViewCollage");
                    throw null;
                }
                C19383o.m32805o("replayOverlayView");
                throw null;
            }
            C19383o.m32805o("videoViewCollage");
            throw null;
        }
        C19383o.m32805o("loadingView");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void onPlayerError() {
        FrameLayout frameLayout = this.loadingView;
        if (frameLayout != null) {
            ViewExtensions.m12869m(frameLayout);
            CollagePlayerView collagePlayerView = this.videoViewCollage;
            if (collagePlayerView != null) {
                ViewExtensions.m12860d(collagePlayerView);
                ConstraintLayout constraintLayout = this.reviewDetails;
                if (constraintLayout != null) {
                    ViewExtensions.m12869m(constraintLayout);
                } else {
                    C19383o.m32805o("reviewDetails");
                    throw null;
                }
            } else {
                C19383o.m32805o("videoViewCollage");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }

    private final C17884a1.C17888d onVideoPlaybackStateChanged() {
        return new C9706c(this);
    }

    private final void requestAudioFocus() {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("audio") : null;
        C19383o.m32795e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).requestAudioFocus(new AudioFocusRequest.Builder(1).build());
    }

    /* access modifiers changed from: private */
    public final void restartVideo() {
        CollagePlayerView collagePlayerView = this.videoViewCollage;
        if (collagePlayerView != null) {
            collagePlayerView.seekTo(0);
            CollagePlayerView collagePlayerView2 = this.videoViewCollage;
            if (collagePlayerView2 != null) {
                collagePlayerView2.resume();
                CollagePlayerView collagePlayerView3 = this.videoViewCollage;
                if (collagePlayerView3 != null) {
                    C17884a1 player = collagePlayerView3.getPlayer();
                    if (player != null) {
                        player.mo69329l(true);
                        return;
                    }
                    return;
                }
                C19383o.m32805o("videoViewCollage");
                throw null;
            }
            C19383o.m32805o("videoViewCollage");
            throw null;
        }
        C19383o.m32805o("videoViewCollage");
        throw null;
    }

    private final void setReviewData(ReviewUiModel reviewUiModel) {
        setReviewVideo(reviewUiModel.getAppreciationVideo());
        slideReviewDetailsWithController();
        setUserDisplayName(reviewUiModel.getBuyerDisplayName());
        setReviewRating(reviewUiModel.getRating());
        setReviewText(reviewUiModel);
        updateElevationToShowGradient();
        setUpExitBehavior();
    }

    private final void setReviewRating(Float f) {
        CollageRatingView collageRatingView = (CollageRatingView) requireView().findViewById(R.id.video_review_star_rating);
        if (collageRatingView != null) {
            collageRatingView.setRating(f != null ? f.floatValue() : 0.0f);
        }
    }

    private final void setReviewText(ReviewUiModel reviewUiModel) {
        CollageContentToggleShort collageContentToggleShort = (CollageContentToggleShort) requireView().findViewById(R.id.video_review_expandable_text);
        if (collageContentToggleShort != null) {
            String formattedReviewText = getFormattedReviewText(reviewUiModel);
            if (C18263b.m30839d0(formattedReviewText)) {
                ViewExtensions.m12869m(collageContentToggleShort);
                collageContentToggleShort.setContentText((CharSequence) formattedReviewText);
                collageContentToggleShort.setMaxChars(getMaxCharactersInCollapsedState(collageContentToggleShort));
                collageContentToggleShort.setOnClickListener(new C9714d(this, reviewUiModel, 0));
                collageContentToggleShort.setOnExpandListener(new ListingVideoReviewFragment$setReviewText$1$1$2(this, reviewUiModel));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setReviewText$lambda-6$lambda-5$lambda-4  reason: not valid java name */
    public static final void m34966setReviewText$lambda6$lambda5$lambda4(ListingVideoReviewFragment listingVideoReviewFragment, ReviewUiModel reviewUiModel, View view) {
        C19383o.m32797g(listingVideoReviewFragment, "this$0");
        C19383o.m32797g(reviewUiModel, "$review");
        listingVideoReviewFragment.showReviewBottomSheet(reviewUiModel);
    }

    private final void setReviewVideo(Video video) {
        if (video != null) {
            CollagePlayerView collagePlayerView = this.videoViewCollage;
            if (collagePlayerView != null) {
                ViewExtensions.m12869m(collagePlayerView);
                collagePlayerView.setResizeMode(4);
                View controlsView = collagePlayerView.getControlsView();
                if (controlsView != null) {
                    controlsView.setBackgroundResource(R.drawable.foreground_gradient);
                }
                Uri parse = Uri.parse(video.getUrl());
                C19383o.m32796f(parse, "parse(video.url)");
                collagePlayerView.setVideoURI(parse);
                collagePlayerView.setControllerShowTimeoutMs(3000);
                collagePlayerView.setListener(onVideoPlaybackStateChanged());
                C8703p analyticsContext = getAnalyticsContext();
                C19383o.m32796f(analyticsContext, "analyticsContext");
                collagePlayerView.setControlDispatcher(new C9705b(analyticsContext));
                C17884a1 player = collagePlayerView.getPlayer();
                if (player != null) {
                    player.mo69329l(true);
                    return;
                }
                return;
            }
            C19383o.m32805o("videoViewCollage");
            throw null;
        }
    }

    private final void setUpExitBehavior() {
        Button button = (Button) requireView().findViewById(R.id.video_review_close_button);
        if (button != null) {
            ViewExtensions.m12866j(button, new ListingVideoReviewFragment$setUpExitBehavior$1$1(this));
        }
    }

    private final void setUserDisplayName(String str) {
        TextView textView = (TextView) requireView().findViewById(R.id.video_review_username);
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* access modifiers changed from: private */
    public final void showReviewBottomSheet(ReviewUiModel reviewUiModel) {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(requireContext);
        Context context = collageBottomSheet.getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ReviewViewRedesign reviewViewRedesign = new ReviewViewRedesign(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        collageBottomSheet.setContentView((View) reviewViewRedesign);
        boolean z = true;
        reviewViewRedesign.setShowFullReview(true);
        if (reviewUiModel.getTranslatedReview() == null) {
            z = false;
        }
        ReviewViewRedesign.setData$default(reviewViewRedesign, reviewUiModel, z, (C19857l) null, (C19857l) null, 12, (Object) null);
        reviewViewRedesign.hideAppreciationVideo();
        collageBottomSheet.show();
        getAnalyticsContext().mo21333d(DisplayVideoReviewsEvent.VIDEO_REVIEW_SEE_FULL_REVIEW.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
    }

    private final void slideReviewDetailsWithController() {
        CollagePlayerView collagePlayerView = this.videoViewCollage;
        if (collagePlayerView != null) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!C2364y.C2371g.m5246c(collagePlayerView) || collagePlayerView.isLayoutRequested()) {
                collagePlayerView.addOnLayoutChangeListener(new C9708xc42f239a(this));
                return;
            }
            View controlsView = collagePlayerView.getControlsView();
            Integer valueOf = controlsView != null ? Integer.valueOf(controlsView.getHeight()) : null;
            if (valueOf != null) {
                updateBottomMargin(valueOf.intValue());
                Context requireContext = requireContext();
                C19383o.m32796f(requireContext, "requireContext()");
                float intValue = ((float) valueOf.intValue()) - ((float) C19543e0.m33295K(20, requireContext));
                CollagePlayerView access$getVideoViewCollage$p = this.videoViewCollage;
                if (access$getVideoViewCollage$p != null) {
                    access$getVideoViewCollage$p.setControllerVisibilityListener(new C9707d(this, intValue));
                } else {
                    C19383o.m32805o("videoViewCollage");
                    throw null;
                }
            }
        } else {
            C19383o.m32805o("videoViewCollage");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void updateBottomMargin(int i) {
        ConstraintLayout constraintLayout = this.reviewDetails;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            layoutParams2.bottomMargin = C19543e0.m33295K(8, requireContext) + i;
            ConstraintLayout constraintLayout2 = this.reviewDetails;
            if (constraintLayout2 != null) {
                constraintLayout2.setLayoutParams(layoutParams2);
            } else {
                C19383o.m32805o("reviewDetails");
                throw null;
            }
        } else {
            C19383o.m32805o("reviewDetails");
            throw null;
        }
    }

    private final void updateDismissButtonMargins(int i) {
        Button button = (Button) requireView().findViewById(R.id.video_review_close_button);
        if (getActivity() != null) {
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            layoutParams2.topMargin = C19543e0.m33295K(8, requireContext) + i;
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            layoutParams2.rightMargin = C19543e0.m33295K(8, requireContext2);
            button.setLayoutParams(layoutParams2);
        }
    }

    private final void updateElevationToShowGradient() {
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(R.dimen.clg_elevation_8);
        CollagePlayerView collagePlayerView = this.videoViewCollage;
        if (collagePlayerView != null) {
            collagePlayerView.setElevation(dimensionPixelSize);
            ConstraintLayout constraintLayout = this.reviewDetails;
            if (constraintLayout != null) {
                constraintLayout.setElevation(dimensionPixelSize);
            } else {
                C19383o.m32805o("reviewDetails");
                throw null;
            }
        } else {
            C19383o.m32805o("videoViewCollage");
            throw null;
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

    public final C12991b getListener() {
        return this.listener;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "buyer_photo";
    }

    public final C9715e getViewModel() {
        C9715e eVar = this.viewModel;
        if (eVar != null) {
            return eVar;
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
                return;
            }
        }
        getViewModel().f21506c.observe(this, new C9498g(this, 1));
        C9715e viewModel2 = getViewModel();
        viewModel2.getClass();
        int i = bundle.getInt("transaction-data", -1);
        if (i != -1) {
            List list = (List) viewModel2.f21504a.mo38342a(i);
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            int i2 = bundle.getInt(ListingReviewNavigationKey.INITIAL_REVIEW_POSITION, 0);
            if (true ^ list.isEmpty()) {
                viewModel2.f21505b.setValue(new C9716f(i2, (ReviewUiModel) list.get(i2), list));
            }
        }
        getAnalyticsContext().mo21333d(DisplayVideoReviewsEvent.VIDEO_REVIEW_OPENED.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_review_video, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.video_review_player);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.video_review_player)");
        this.videoViewCollage = (CollagePlayerView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.loading_indicator);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.loading_indicator)");
        this.loadingView = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.video_review_details);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.video_review_details)");
        this.reviewDetails = (ConstraintLayout) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.replay_overlay_view);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.replay_overlay_view)");
        this.replayOverlayView = (ConstraintLayout) findViewById4;
        if (getConfigMap().mo21132b(C8592b.f18847y1)) {
            CollagePlayerView collagePlayerView = this.videoViewCollage;
            if (collagePlayerView != null) {
                collagePlayerView.setOnTouchListener(getSwipeDownListener());
            } else {
                C19383o.m32805o("videoViewCollage");
                throw null;
            }
        }
        C19383o.m32794d(viewGroup);
        C9713c cVar = new C9713c(viewGroup, this);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5274u(viewGroup, cVar);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        CollagePlayerView collagePlayerView = this.videoViewCollage;
        if (collagePlayerView != null) {
            collagePlayerView.cleanUp();
        } else {
            C19383o.m32805o("videoViewCollage");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        CollagePlayerView collagePlayerView = this.videoViewCollage;
        if (collagePlayerView != null) {
            collagePlayerView.resume();
            CollagePlayerView collagePlayerView2 = this.videoViewCollage;
            if (collagePlayerView2 != null) {
                collagePlayerView2.showController();
                requestAudioFocus();
                return;
            }
            C19383o.m32805o("videoViewCollage");
            throw null;
        }
        C19383o.m32805o("videoViewCollage");
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C9715e viewModel2 = getViewModel();
        viewModel2.getClass();
        C9716f fVar = (C9716f) viewModel2.f21506c.getValue();
        if (fVar != null) {
            bundle.putInt("transaction-data", viewModel2.f21504a.mo38343b(fVar.f21509c));
            bundle.putInt(ListingReviewNavigationKey.INITIAL_REVIEW_POSITION, 0);
        }
    }

    public void onStop() {
        super.onStop();
        CollagePlayerView collagePlayerView = this.videoViewCollage;
        if (collagePlayerView != null) {
            collagePlayerView.pause();
        } else {
            C19383o.m32805o("videoViewCollage");
            throw null;
        }
    }

    public final void setViewModel(C9715e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.viewModel = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingVideoReviewFragment(C12991b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bVar);
    }
}
