package com.etsy.android.p327ui.user.review;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.C0120c;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.foundation.layout.C0761x;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.C2322o0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.C3218a0;
import androidx.room.C3254t;
import com.appboy.p043ui.C4950e;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.bumptech.glide.request.C6128g;
import com.etsy.android.R;
import com.etsy.android.exceptions.ThreeArmSweaterException;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.p327ui.C9110b;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.conversation.list.ccm.C9580d;
import com.etsy.android.p327ui.search.filters.C10764b;
import com.etsy.android.p327ui.user.addresses.C11442q;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.p327ui.user.review.C11745t;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.p327ui.view.StepIndicatorView;
import com.etsy.android.stylekit.views.C9052c;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageEmptyStateView;
import com.etsy.android.stylekit.views.CollageListItem;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.stylekit.views.ratings.CollageRatingButtons;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import com.etsy.android.util.C12061r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import p019b.C3443a;
import p019b.C3446c;
import p186n2.C7426q;
import p260v0.C8184a;
import p324cf.C8585b;
import p337de.C12647a;
import p337de.C12649c;
import p346fa.C12703a;
import p370ie.C12948h;
import p377jf.C12979a;
import p435rb.C13350a;
import p440s9.C13366a;
import p487ya.C13895a;
import p496za.C13943a;
import p590il.C17857d;
import p590il.C17858e;
import p628nj.C18263b;
import p672sk.C18519a;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity */
public final class CreateReviewActivity extends TrackingBaseActivity implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MaterialButton backButton;
    public C8886e cameraHelper;
    private CollageEmptyStateView emptyStateView;
    public C13895a fileSupport;
    /* access modifiers changed from: private */
    public Button forwardButton;
    public C12703a grafana;
    private final C11750u permissionsHelper = new C11750u(this);
    private View photoUploadHighRatingView;
    private View photoUploadLowRatingView;
    private View photoUploadView;
    /* access modifiers changed from: private */
    public final C0120c<Uri> recordVideoLauncher;
    private final C0120c<String[]> requestCameraPermissions;
    public C11786n resourceProvider;
    /* access modifiers changed from: private */
    public C11701a0 reviewsFileManager;
    /* access modifiers changed from: private */
    public final C0120c<String> selectVideoFromGalleryLauncher;
    private View selectedPhotoUploadView;
    public C13943a sharedPreferenceProvider;
    /* access modifiers changed from: private */
    public final C0120c<C12948h> signInForReviewResult;
    /* access modifiers changed from: private */
    public StepIndicatorView stepIndicatorView;
    private CollageAlert subratingAlert;
    private C8585b transformationUtil;
    private final long transitionAnimationDuration = 600;
    public CreateReviewViewModel viewModel;

    /* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$a */
    public static final class C11688a implements CollageRatingButtons.C9070a {

        /* renamed from: a */
        public final /* synthetic */ CreateReviewActivity f25904a;

        public C11688a(CreateReviewActivity createReviewActivity) {
            this.f25904a = createReviewActivity;
        }

        /* renamed from: a */
        public final void mo31180a(int i, boolean z) {
            if (z) {
                CreateReviewViewModel viewModel = this.f25904a.getViewModel();
                viewModel.getClass();
                new Handler(Looper.getMainLooper()).postDelayed(new C10764b(viewModel, i, 1), 200);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$b */
    public static final class C11689b implements CollageRatingButtons.C9070a {

        /* renamed from: a */
        public final /* synthetic */ CreateReviewActivity f25905a;

        /* renamed from: b */
        public final /* synthetic */ View f25906b;

        public C11689b(CreateReviewActivity createReviewActivity, View view) {
            this.f25905a = createReviewActivity;
            this.f25906b = view;
        }

        /* renamed from: a */
        public final void mo31180a(int i, boolean z) {
            CreateReviewViewModel viewModel = this.f25905a.getViewModel();
            Object tag = this.f25906b.getTag();
            C19383o.m32795e(tag, "null cannot be cast to non-null type kotlin.String");
            viewModel.mo37855n(i, (String) tag);
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$c */
    public static final class C11690c implements CollageCheckbox.C9027c {

        /* renamed from: a */
        public final /* synthetic */ CreateReviewActivity f25907a;

        /* renamed from: b */
        public final /* synthetic */ ReviewFlowCheckboxControl f25908b;

        public C11690c(CreateReviewActivity createReviewActivity, ReviewFlowCheckboxControl reviewFlowCheckboxControl) {
            this.f25907a = createReviewActivity;
            this.f25908b = reviewFlowCheckboxControl;
        }

        /* renamed from: a */
        public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
            C19383o.m32797g(collageCheckbox, "selectedButton");
            ReviewCard f = this.f25907a.getViewModel().mo37848f();
            ReviewFlowCheckboxControl reviewFlowCheckboxControl = f != null ? f.f25968j : null;
            if (reviewFlowCheckboxControl != null) {
                reviewFlowCheckboxControl.f25991c = z;
            }
            for (String next : this.f25908b.f25990b) {
                LinearLayout linearLayout = (LinearLayout) this.f25907a._$_findCachedViewById(R.id.subratings_container);
                C19383o.m32796f(linearLayout, "subratings_container");
                Iterator<View> it = C19543e0.m33298O(linearLayout).iterator();
                while (true) {
                    C2322o0 o0Var = (C2322o0) it;
                    if (o0Var.hasNext()) {
                        View view = (View) o0Var.next();
                        if (C19383o.m32792b(view.getTag(), next)) {
                            CollageRatingButtons collageRatingButtons = (CollageRatingButtons) view.findViewById(R.id.subrating_rating);
                            if (z) {
                                ViewExtensions.m12860d(collageRatingButtons);
                                collageRatingButtons.setRating(0);
                            } else {
                                ViewExtensions.m12869m(collageRatingButtons);
                            }
                            CreateReviewViewModel viewModel = this.f25907a.getViewModel();
                            Object tag = view.getTag();
                            C19383o.m32795e(tag, "null cannot be cast to non-null type kotlin.String");
                            viewModel.mo37855n(0, (String) tag);
                        }
                    }
                }
            }
        }
    }

    public CreateReviewActivity() {
        C0120c<C12948h> registerForActivityResult = registerForActivityResult(new C12649c(), new C11710i(this));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…        )\n        }\n    }");
        this.signInForReviewResult = registerForActivityResult;
        C0120c<String> registerForActivityResult2 = registerForActivityResult(new C11703b0(), new C11711j(this));
        C19383o.m32796f(registerForActivityResult2, "registerForActivityResul…}\n            }\n        }");
        this.selectVideoFromGalleryLauncher = registerForActivityResult2;
        C0120c<Uri> registerForActivityResult3 = registerForActivityResult(new C11755x(), new C3218a0(this, 1));
        C19383o.m32796f(registerForActivityResult3, "registerForActivityResul…)\n            }\n        }");
        this.recordVideoLauncher = registerForActivityResult3;
        C0120c<String[]> registerForActivityResult4 = registerForActivityResult(new C3446c(), new C9110b(this, 2));
        C19383o.m32796f(registerForActivityResult4, "registerForActivityResul…ssions(granted)\n        }");
        this.requestCameraPermissions = registerForActivityResult4;
    }

    private final void enableSubratingsSubmitButton() {
        ViewExtensions.m12860d((CollageAlert) _$_findCachedViewById(R.id.error_alert));
        ViewExtensions.m12860d(this.emptyStateView);
    }

    private final void finishReviewFlow(C11719r.C11727h hVar) {
        C11701a0 a0Var = this.reviewsFileManager;
        if (a0Var != null) {
            File file = a0Var.f26049e;
            if (file != null) {
                file.delete();
            }
            File file2 = a0Var.f26050f;
            if (file2 != null) {
                file2.delete();
            }
        }
        Intent intent = null;
        if (hVar.f26097c != null) {
            intent = new Intent();
            intent.putExtra("transaction", hVar.f26097c);
        }
        setResult(hVar.f26096b, intent);
        finish();
    }

    private final CreateReviewActivity getActivity() {
        return this;
    }

    /* access modifiers changed from: private */
    public final Drawable getDisplayIconDrawable(String str) {
        int b;
        if (!C18263b.m30839d0(str) || (b = getResourceProvider().mo38058b(str)) == 0) {
            return null;
        }
        Object obj = C8184a.f17966a;
        return C8184a.C8187c.m16466b(this, b);
    }

    private final Integer getPresetOverallRatingExtra() {
        Bundle extras = getIntent().getExtras();
        Integer valueOf = extras != null ? Integer.valueOf(extras.getInt(ResponseConstants.RATING, -1)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    private final Long getVideoDuration(Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Long l = null;
        try {
            mediaMetadataRetriever.setDataSource(this, uri);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata != null) {
                l = Long.valueOf(Long.parseLong(extractMetadata) / ((long) 1000));
            }
            return l;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    private final void handleVideoCompression(C11745t tVar) {
        if (tVar instanceof C11745t.C11749d) {
            showLoadingIndicator();
            return;
        }
        String str = "";
        File file = null;
        if (tVar instanceof C11745t.C11747b) {
            CreateReviewViewModel viewModel2 = getViewModel();
            viewModel2.getClass();
            C19383o.m32797g((C11745t.C11747b) tVar, "state");
            ReviewFlow reviewFlow = viewModel2.f25946x;
            if (reviewFlow != null) {
                String str2 = reviewFlow.f25980a.f26038d;
                if (str2 != null) {
                    str = str2;
                }
                C8585b bVar = viewModel2.f25916H;
                if ((bVar != null ? bVar.f18685e : null) != null) {
                    if (bVar != null) {
                        file = bVar.f18685e;
                    }
                    C19383o.m32795e(file, "null cannot be cast to non-null type java.io.File");
                    viewModel2.mo37862w(file, str);
                } else {
                    File file2 = viewModel2.f25914F;
                    C19383o.m32795e(file2, "null cannot be cast to non-null type java.io.File");
                    viewModel2.mo37862w(file2, str);
                }
                ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
                return;
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        } else if (tVar instanceof C11745t.C11746a) {
            ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
        } else if (tVar instanceof C11745t.C11748c) {
            CreateReviewViewModel viewModel3 = getViewModel();
            viewModel3.getClass();
            C19383o.m32797g((C11745t.C11748c) tVar, "state");
            ReviewFlow reviewFlow2 = viewModel3.f25946x;
            if (reviewFlow2 != null) {
                String str3 = reviewFlow2.f25980a.f26038d;
                if (str3 != null) {
                    str = str3;
                }
                File file3 = viewModel3.f25914F;
                C19383o.m32795e(file3, "null cannot be cast to non-null type java.io.File");
                viewModel3.mo37862w(file3, str);
                ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
                return;
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void hideKeyboardOnTouchOutsideTextInput() {
        ((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container)).setOnTouchListener(new C11712k(this, 0));
    }

    /* access modifiers changed from: private */
    /* renamed from: hideKeyboardOnTouchOutsideTextInput$lambda-29  reason: not valid java name */
    public static final boolean m35071hideKeyboardOnTouchOutsideTextInput$lambda29(CreateReviewActivity createReviewActivity, View view, MotionEvent motionEvent) {
        C19383o.m32797g(createReviewActivity, "this$0");
        ContentResolver contentResolver = createReviewActivity.getContentResolver();
        C19383o.m32796f(contentResolver, "contentResolver");
        if (createReviewActivity.isGestureNavigationEnabled(contentResolver)) {
            new Handler(Looper.getMainLooper()).postDelayed(new C11705d(createReviewActivity, 1), 500);
        } else {
            ViewExtensions.m12861e((CollageTextInput) createReviewActivity._$_findCachedViewById(R.id.review_input));
        }
        createReviewActivity.showTooltipForNewVideoReviews(Boolean.FALSE);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: hideKeyboardOnTouchOutsideTextInput$lambda-29$lambda-28  reason: not valid java name */
    public static final void m35072hideKeyboardOnTouchOutsideTextInput$lambda29$lambda28(CreateReviewActivity createReviewActivity) {
        C19383o.m32797g(createReviewActivity, "this$0");
        ViewExtensions.m12861e((CollageTextInput) createReviewActivity._$_findCachedViewById(R.id.review_input));
    }

    private final boolean isGestureNavigationEnabled(ContentResolver contentResolver) {
        return Build.VERSION.SDK_INT >= 29 && Settings.Secure.getInt(contentResolver, "navigation_mode", 0) == 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-11  reason: not valid java name */
    public static final void m35073onCreate$lambda11(CreateReviewActivity createReviewActivity, C11719r rVar) {
        C19383o.m32797g(createReviewActivity, "this$0");
        createReviewActivity.onViewStateChanged(rVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-12  reason: not valid java name */
    public static final void m35074onCreate$lambda12(CreateReviewActivity createReviewActivity, Boolean bool) {
        C19383o.m32797g(createReviewActivity, "this$0");
        C19383o.m32796f(bool, "it");
        createReviewActivity.setUpStepIndicator(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-13  reason: not valid java name */
    public static final void m35075onCreate$lambda13(CreateReviewActivity createReviewActivity, Alert alert) {
        C19383o.m32797g(createReviewActivity, "this$0");
        View findViewById = createReviewActivity.findViewById(R.id.rating_alert);
        C19383o.m32796f(findViewById, "findViewById(R.id.rating_alert)");
        createReviewActivity.setInlineBannerAlert((CollageAlert) findViewById, alert);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-14  reason: not valid java name */
    public static final void m35076onCreate$lambda14(CreateReviewActivity createReviewActivity, C11744s sVar) {
        C19383o.m32797g(createReviewActivity, "this$0");
        createReviewActivity.updateForwardButton(sVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-15  reason: not valid java name */
    public static final void m35077onCreate$lambda15(CreateReviewActivity createReviewActivity, C11700a aVar) {
        C19383o.m32797g(createReviewActivity, "this$0");
        C19383o.m32796f(aVar, "it");
        createReviewActivity.updateBackButton(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-16  reason: not valid java name */
    public static final void m35078onCreate$lambda16(CreateReviewActivity createReviewActivity, C11745t tVar) {
        C19383o.m32797g(createReviewActivity, "this$0");
        C19383o.m32796f(tVar, "it");
        createReviewActivity.handleVideoCompression(tVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-7  reason: not valid java name */
    public static final void m35079onCreate$lambda7(MaterialCardView materialCardView, int i, View view, int i2, int i3, int i4, int i5) {
        if (i5 == 0 && i3 > 0) {
            materialCardView.setElevation((float) i);
        } else if (i5 > 0 && i3 == 0) {
            materialCardView.setElevation(0.0f);
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [kotlin.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void onViewStateChanged(com.etsy.android.p327ui.user.review.C11719r r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11730k
            if (r0 == 0) goto L_0x000b
            com.etsy.android.ui.user.review.r$k r10 = (com.etsy.android.p327ui.user.review.C11719r.C11730k) r10
            r9.showOverallRatingStep(r10)
            goto L_0x01df
        L_0x000b:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11731l
            if (r0 == 0) goto L_0x0018
            com.etsy.android.ui.user.review.r$l r10 = (com.etsy.android.p327ui.user.review.C11719r.C11731l) r10
            java.lang.String r10 = r10.f26112b
            r9.showSuccessConfirmation(r10)
            goto L_0x01df
        L_0x0018:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11738s
            if (r0 == 0) goto L_0x0023
            com.etsy.android.ui.user.review.r$s r10 = (com.etsy.android.p327ui.user.review.C11719r.C11738s) r10
            r9.showSubratingsStep(r10)
            goto L_0x01df
        L_0x0023:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11739t
            if (r0 == 0) goto L_0x0039
            r0 = 2131429491(0x7f0b0873, float:1.8480656E38)
            android.view.View r0 = r9._$_findCachedViewById(r0)
            com.etsy.android.stylekit.views.CollageTextInput r0 = (com.etsy.android.stylekit.views.CollageTextInput) r0
            com.etsy.android.ui.user.review.r$t r10 = (com.etsy.android.p327ui.user.review.C11719r.C11739t) r10
            java.lang.String r10 = r10.f26137b
            r0.setErrorText(r10)
            goto L_0x01df
        L_0x0039:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11740u
            if (r0 == 0) goto L_0x0044
            com.etsy.android.ui.user.review.r$u r10 = (com.etsy.android.p327ui.user.review.C11719r.C11740u) r10
            r9.setUpPhotoUploadStep(r10)
            goto L_0x01df
        L_0x0044:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11741v
            if (r0 == 0) goto L_0x004f
            com.etsy.android.ui.user.review.r$v r10 = (com.etsy.android.p327ui.user.review.C11719r.C11741v) r10
            r9.setUpPhotoUploadHighRatingStep(r10)
            goto L_0x01df
        L_0x004f:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11742w
            if (r0 == 0) goto L_0x005a
            com.etsy.android.ui.user.review.r$w r10 = (com.etsy.android.p327ui.user.review.C11719r.C11742w) r10
            r9.setUpPhotoUploadLowRatingStep(r10)
            goto L_0x01df
        L_0x005a:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11720a
            if (r0 == 0) goto L_0x0065
            com.etsy.android.ui.user.review.r$a r10 = (com.etsy.android.p327ui.user.review.C11719r.C11720a) r10
            r9.showAddPhotoPopup(r10)
            goto L_0x01df
        L_0x0065:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11722c
            if (r0 == 0) goto L_0x0076
            com.etsy.android.lib.util.e r10 = r9.getCameraHelper()
            com.etsy.android.ui.user.review.CreateReviewActivity r0 = r9.getActivity()
            r10.mo30474a(r0)
            goto L_0x01df
        L_0x0076:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11736q
            r1 = 0
            if (r0 == 0) goto L_0x0088
            com.etsy.android.lib.util.e r10 = r9.getCameraHelper()
            com.etsy.android.ui.user.review.CreateReviewActivity r0 = r9.getActivity()
            r10.mo30481h(r0)
            goto L_0x01df
        L_0x0088:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11723d
            if (r0 == 0) goto L_0x0093
            com.etsy.android.ui.user.review.r$d r10 = (com.etsy.android.p327ui.user.review.C11719r.C11723d) r10
            r9.showEditPhotoPopup(r10)
            goto L_0x01df
        L_0x0093:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11724e
            if (r0 == 0) goto L_0x009e
            com.etsy.android.ui.user.review.r$e r10 = (com.etsy.android.p327ui.user.review.C11719r.C11724e) r10
            r9.showEditVideoPopup(r10)
            goto L_0x01df
        L_0x009e:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11734o
            if (r0 == 0) goto L_0x00a9
            com.etsy.android.ui.user.review.r$o r10 = (com.etsy.android.p327ui.user.review.C11719r.C11734o) r10
            r9.showPhotoConfirmationStep(r10)
            goto L_0x01df
        L_0x00a9:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11721b
            if (r0 == 0) goto L_0x00b4
            com.etsy.android.ui.user.review.r$b r10 = (com.etsy.android.p327ui.user.review.C11719r.C11721b) r10
            r9.showAddVideoPopup(r10)
            goto L_0x01df
        L_0x00b4:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11735p
            if (r0 == 0) goto L_0x00cd
            com.etsy.android.ui.user.review.u r10 = r9.permissionsHelper
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p568fn.C17782b.m29865e0(r0)
            androidx.activity.result.c<java.lang.String[]> r1 = r9.requestCameraPermissions
            r10.mo37993b(r0, r1)
            goto L_0x01df
        L_0x00cd:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11733n
            if (r0 == 0) goto L_0x0173
            com.etsy.android.ui.user.review.CreateReviewViewModel r10 = r9.getViewModel()
            com.etsy.android.ui.user.review.ReviewFlow r0 = r10.f25946x
            r2 = 0
            if (r0 == 0) goto L_0x016d
            com.etsy.android.ui.user.review.ReviewMetadata r0 = r0.f25980a
            java.lang.Integer r0 = r0.f26037c
            if (r0 == 0) goto L_0x00e5
            int r0 = r0.intValue()
            goto L_0x00e6
        L_0x00e5:
            r0 = r1
        L_0x00e6:
            com.etsy.android.ui.user.review.ReviewCard r0 = r10.mo37847e(r0)
            if (r0 == 0) goto L_0x0164
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r0 = r0.f25962d
            java.util.Iterator r0 = r0.iterator()
        L_0x00f2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x015c
            java.lang.Object r3 = r0.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r3 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r3
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r4 = r3.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r5 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.TAKE_VIDEO
            if (r4 != r5) goto L_0x0106
            r4 = 1
            goto L_0x0107
        L_0x0106:
            r4 = r1
        L_0x0107:
            if (r4 == 0) goto L_0x00f2
            com.etsy.android.ui.user.review.ReviewFlowPromptAction r0 = r3.f26002e
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x014d
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r0 = r0.f26011c
            if (r0 == 0) goto L_0x014d
            java.util.Iterator r0 = r0.iterator()
            r4 = r1
            r5 = r4
            r3 = r2
        L_0x011a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x014b
            java.lang.Object r6 = r0.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r6 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r6
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r7 = r6.f25998a
            int[] r8 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25951c
            int r7 = r7.ordinal()
            r7 = r8[r7]
            r8 = 3
            if (r7 == r8) goto L_0x0141
            r8 = 4
            if (r7 == r8) goto L_0x0137
            goto L_0x011a
        L_0x0137:
            java.lang.String r3 = r6.f25999b
            if (r3 != 0) goto L_0x013d
            r5 = r1
            goto L_0x013e
        L_0x013d:
            r5 = r3
        L_0x013e:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r3 = r6.f26007j
            goto L_0x011a
        L_0x0141:
            java.lang.String r2 = r6.f25999b
            if (r2 != 0) goto L_0x0147
            r4 = r1
            goto L_0x0148
        L_0x0147:
            r4 = r2
        L_0x0148:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r2 = r6.f26007j
            goto L_0x011a
        L_0x014b:
            r1 = r4
            goto L_0x014f
        L_0x014d:
            r5 = r1
            r3 = r2
        L_0x014f:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r0 = r10.f25930h
            com.etsy.android.ui.user.review.r$b r4 = new com.etsy.android.ui.user.review.r$b
            r4.<init>(r1, r5, r2, r3)
            r0.postValue(r4)
            kotlin.m r2 = kotlin.C19394m.f43287a
            goto L_0x0164
        L_0x015c:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r10.<init>(r0)
            throw r10
        L_0x0164:
            if (r2 != 0) goto L_0x01df
            com.etsy.android.ui.user.review.ReviewScreen r0 = com.etsy.android.p327ui.user.review.ReviewScreen.VIDEO
            r10.mo37857p(r0)
            goto L_0x01df
        L_0x016d:
            java.lang.String r10 = "reviewFlowModel"
            kotlin.jvm.internal.C19383o.m32805o(r10)
            throw r2
        L_0x0173:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11732m
            if (r0 == 0) goto L_0x0186
            com.etsy.android.ui.user.review.u r10 = r9.permissionsHelper
            r0 = 2131953656(0x7f1307f8, float:1.954379E38)
            android.content.Context r10 = r10.f26187a
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r1)
            r10.show()
            goto L_0x01df
        L_0x0186:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11743x
            if (r0 == 0) goto L_0x0190
            com.etsy.android.ui.user.review.r$x r10 = (com.etsy.android.p327ui.user.review.C11719r.C11743x) r10
            r9.showVideoConfirmationStep(r10)
            goto L_0x01df
        L_0x0190:
            com.etsy.android.ui.user.review.r$j r0 = com.etsy.android.p327ui.user.review.C11719r.C11729j.f26100b
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r10, r0)
            if (r0 == 0) goto L_0x019c
            r9.showLoadingIndicator()
            goto L_0x01df
        L_0x019c:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11728i
            if (r0 == 0) goto L_0x01a6
            com.etsy.android.ui.user.review.r$i r10 = (com.etsy.android.p327ui.user.review.C11719r.C11728i) r10
            r9.showHighFiveStep(r10)
            goto L_0x01df
        L_0x01a6:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11727h
            if (r0 == 0) goto L_0x01b0
            com.etsy.android.ui.user.review.r$h r10 = (com.etsy.android.p327ui.user.review.C11719r.C11727h) r10
            r9.finishReviewFlow(r10)
            goto L_0x01df
        L_0x01b0:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11725f
            if (r0 == 0) goto L_0x01cc
            com.etsy.android.ui.user.review.a0 r0 = r9.reviewsFileManager
            if (r0 == 0) goto L_0x01c6
            java.io.File r1 = r0.f26049e
            if (r1 == 0) goto L_0x01bf
            r1.delete()
        L_0x01bf:
            java.io.File r0 = r0.f26050f
            if (r0 == 0) goto L_0x01c6
            r0.delete()
        L_0x01c6:
            com.etsy.android.ui.user.review.r$f r10 = (com.etsy.android.p327ui.user.review.C11719r.C11725f) r10
            r9.showErrorPopup(r10)
            goto L_0x01df
        L_0x01cc:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11726g
            if (r0 == 0) goto L_0x01d6
            com.etsy.android.ui.user.review.r$g r10 = (com.etsy.android.p327ui.user.review.C11719r.C11726g) r10
            r9.showErrorWithRetry(r10)
            goto L_0x01df
        L_0x01d6:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.user.review.C11719r.C11737r
            if (r0 == 0) goto L_0x01df
            com.etsy.android.ui.user.review.r$r r10 = (com.etsy.android.p327ui.user.review.C11719r.C11737r) r10
            r9.showSubmitWarningPopup(r10)
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewActivity.onViewStateChanged(com.etsy.android.ui.user.review.r):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: recordVideoLauncher$lambda-5  reason: not valid java name */
    public static final void m35080recordVideoLauncher$lambda5(CreateReviewActivity createReviewActivity, Boolean bool) {
        Uri uri;
        C19383o.m32797g(createReviewActivity, "this$0");
        createReviewActivity.getAnalyticsContext().mo21333d(ReviewEvent.TAKES_VIDEO.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
        C11701a0 a0Var = createReviewActivity.reviewsFileManager;
        if (a0Var != null && (uri = a0Var.f26048d) != null) {
            createReviewActivity.transformationUtil = new C8585b(createReviewActivity, a0Var);
            CreateReviewViewModel viewModel2 = createReviewActivity.getViewModel();
            C8585b bVar = createReviewActivity.transformationUtil;
            C19383o.m32796f(bool, "success");
            boolean booleanValue = bool.booleanValue();
            viewModel2.getClass();
            if (booleanValue) {
                viewModel2.f25915G = uri;
                viewModel2.f25916H = bVar;
                CreateReviewViewModel.m19415v(viewModel2, uri, (String) null, 2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: requestCameraPermissions$lambda-6  reason: not valid java name */
    public static final void m35081requestCameraPermissions$lambda6(CreateReviewActivity createReviewActivity, Map map) {
        C19383o.m32797g(createReviewActivity, "this$0");
        C11750u uVar = createReviewActivity.permissionsHelper;
        C19383o.m32796f(map, "permissions");
        uVar.getClass();
        boolean a = C11750u.m19448a(map);
        CreateReviewViewModel viewModel2 = createReviewActivity.getViewModel();
        if (a) {
            viewModel2.f25930h.postValue(C11719r.C11733n.f26114b);
        } else {
            viewModel2.f25930h.postValue(C11719r.C11732m.f26113b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: selectVideoFromGalleryLauncher$lambda-3  reason: not valid java name */
    public static final void m35082selectVideoFromGalleryLauncher$lambda3(CreateReviewActivity createReviewActivity, Uri uri) {
        C19383o.m32797g(createReviewActivity, "this$0");
        if (uri != null) {
            String type = createReviewActivity.getContentResolver().getType(uri);
            boolean z = false;
            if (type != null) {
                z = C19459m.m33036e1(type, "video", false);
            }
            if (z) {
                Long videoDuration = createReviewActivity.getVideoDuration(uri);
                if (videoDuration == null || videoDuration.longValue() <= ((long) createReviewActivity.getViewModel().f25920L)) {
                    createReviewActivity.transformationUtil = new C8585b(createReviewActivity, createReviewActivity.reviewsFileManager);
                    CreateReviewViewModel viewModel2 = createReviewActivity.getViewModel();
                    C8585b bVar = createReviewActivity.transformationUtil;
                    viewModel2.getClass();
                    viewModel2.f25915G = uri;
                    viewModel2.f25916H = bVar;
                    CreateReviewViewModel.m19415v(viewModel2, uri, (String) null, 2);
                    createReviewActivity.getAnalyticsContext().mo21333d(ReviewEvent.SELECTS_VIDEO.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
                    return;
                }
                createReviewActivity.showVideoTooLongDialog();
            }
        }
    }

    private final void setInlineBannerAlert(CollageAlert collageAlert, Alert alert) {
        if (alert != null) {
            collageAlert.setTitleText(alert.getTitle());
            String body = alert.getBody();
            if (body == null) {
                body = "";
            }
            CollageAlert.setBodyText$default(collageAlert, Html.fromHtml(body, 63), (Drawable) null, 2, (Object) null);
            collageAlert.setIconDrawableRes(collageAlert.getResources().getIdentifier(alert.getIconId(), "drawable", getPackageName()));
            collageAlert.setAlertType(alert.getCollageType());
            ViewExtensions.m12869m(collageAlert);
            return;
        }
        ViewExtensions.m12860d(collageAlert);
        C19394m mVar = C19394m.f43287a;
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setUpPhotoUploadHighRatingStep(com.etsy.android.p327ui.user.review.C11719r.C11741v r9) {
        /*
            r8 = this;
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = (com.etsy.android.stylekit.views.CollageAlert) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            com.etsy.android.stylekit.views.CollageEmptyStateView r0 = r8.emptyStateView
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r8.photoUploadView
            r1 = 0
            if (r0 == 0) goto L_0x01d0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r8.photoUploadLowRatingView
            if (r0 == 0) goto L_0x01ca
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r8.photoUploadHighRatingView
            if (r0 == 0) goto L_0x01c4
            r8.selectedPhotoUploadView = r0
            com.etsy.android.lib.logger.ITrackedObject r0 = r9.f26151g
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = kotlin.jvm.internal.C19388s.m32863g0(r0)
            if (r0 == 0) goto L_0x0037
            com.etsy.android.lib.logger.p r2 = r8.getAnalyticsContext()
            r2.mo21333d(r0, r1)
        L_0x0037:
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowIcon> r0 = r9.f26154j
            boolean r0 = kotlinx.coroutines.C19543e0.m33306Y(r0)
            r2 = 2131429502(0x7f0b087e, float:1.8480679E38)
            if (r0 == 0) goto L_0x0068
            android.view.View r0 = r8.selectedPhotoUploadView
            if (r0 == 0) goto L_0x0068
            android.view.View r0 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            if (r0 == 0) goto L_0x0068
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.getContext()
            r3.<init>()
            r0.setLayoutManager(r3)
            com.etsy.android.ui.user.review.z r3 = new com.etsy.android.ui.user.review.z
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowIcon> r4 = r9.f26154j
            com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$2$1 r5 = new com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$2$1
            r5.<init>(r8)
            r3.<init>(r5, r4)
            r0.setAdapter(r3)
        L_0x0068:
            r0 = 2131429941(0x7f0b0a35, float:1.8481569E38)
            android.view.View r3 = r8._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r3 = (androidx.constraintlayout.widget.Group) r3
            java.lang.String r4 = "subratings"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            int r3 = r3.getVisibility()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0080
            r3 = r4
            goto L_0x0081
        L_0x0080:
            r3 = r5
        L_0x0081:
            r6 = 2131428101(0x7f0b0305, float:1.8477837E38)
            if (r3 == 0) goto L_0x00a2
            il.e r3 = new il.e
            r3.<init>(r4)
            long r4 = r8.transitionAnimationDuration
            r3.f16562d = r4
            android.view.View r4 = r8._$_findCachedViewById(r6)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            p186n2.C7426q.m14342a(r4, r3)
            android.view.View r0 = r8._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            goto L_0x0106
        L_0x00a2:
            r0 = 2131429258(0x7f0b078a, float:1.8480184E38)
            android.view.View r3 = r8._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r3 = (androidx.constraintlayout.widget.Group) r3
            java.lang.String r7 = "photo_confirmation"
            kotlin.jvm.internal.C19383o.m32796f(r3, r7)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x00b8
            r3 = r4
            goto L_0x00b9
        L_0x00b8:
            r3 = r5
        L_0x00b9:
            if (r3 == 0) goto L_0x00d7
            il.e r3 = new il.e
            r3.<init>(r5)
            long r4 = r8.transitionAnimationDuration
            r3.f16562d = r4
            android.view.View r4 = r8._$_findCachedViewById(r6)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            p186n2.C7426q.m14342a(r4, r3)
            android.view.View r0 = r8._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            goto L_0x0106
        L_0x00d7:
            r0 = 2131430376(0x7f0b0be8, float:1.8482451E38)
            android.view.View r3 = r8._$_findCachedViewById(r0)
            java.lang.String r7 = "video_confirmation"
            kotlin.jvm.internal.C19383o.m32796f(r3, r7)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r4 = r5
        L_0x00eb:
            if (r4 == 0) goto L_0x0106
            il.e r3 = new il.e
            r3.<init>(r5)
            long r4 = r8.transitionAnimationDuration
            r3.f16562d = r4
            android.view.View r4 = r8._$_findCachedViewById(r6)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            p186n2.C7426q.m14342a(r4, r3)
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
        L_0x0106:
            java.lang.Boolean r0 = r9.f26155k
            r8.showTooltipForNewVideoReviews(r0)
            com.etsy.android.ui.view.StepIndicatorView r0 = r8.stepIndicatorView
            if (r0 == 0) goto L_0x0114
            int r3 = r9.f26156l
            r0.setCurrentStepPosition(r3)
        L_0x0114:
            android.view.View r0 = r8.selectedPhotoUploadView
            if (r0 == 0) goto L_0x0122
            r1 = 2131430331(0x7f0b0bbb, float:1.848236E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0122:
            if (r1 != 0) goto L_0x0125
            goto L_0x012a
        L_0x0125:
            java.lang.String r0 = r9.f26146b
            r1.setText(r0)
        L_0x012a:
            android.view.View r0 = r8.selectedPhotoUploadView
            if (r0 == 0) goto L_0x0166
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowIcon> r1 = r9.f26154j
            boolean r1 = kotlinx.coroutines.C19543e0.m33306Y(r1)
            r3 = 2131429489(0x7f0b0871, float:1.8480652E38)
            if (r1 == 0) goto L_0x0150
            android.view.View r1 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x0144
            com.etsy.android.extensions.ViewExtensions.m12869m(r1)
        L_0x0144:
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0166
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            goto L_0x0166
        L_0x0150:
            android.view.View r1 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x015b
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
        L_0x015b:
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0166
            com.etsy.android.extensions.ViewExtensions.m12869m(r0)
        L_0x0166:
            android.view.View r0 = r8.selectedPhotoUploadView
            if (r0 == 0) goto L_0x0192
            r1 = 2131430003(0x7f0b0a73, float:1.8481695E38)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 == 0) goto L_0x0192
            java.lang.String r1 = r9.f26147c
            r0.setText(r1)
            java.lang.String r1 = r9.f26147c
            r0.setContentDescription(r1)
            java.lang.String r1 = r9.f26149e
            android.graphics.drawable.Drawable r1 = r8.getDisplayIconDrawable(r1)
            r0.setIcon(r1)
            com.etsy.android.lib.logger.ITrackedObject r1 = r9.f26152h
            com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$4$1 r2 = new com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$4$1
            r2.<init>(r9, r8)
            com.etsy.android.extensions.ViewExtensions.m12865i(r0, r1, r2)
        L_0x0192:
            android.view.View r0 = r8.selectedPhotoUploadView
            if (r0 == 0) goto L_0x01be
            r1 = 2131430006(0x7f0b0a76, float:1.84817E38)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 == 0) goto L_0x01be
            java.lang.String r1 = r9.f26148d
            r0.setText(r1)
            java.lang.String r1 = r9.f26148d
            r0.setContentDescription(r1)
            java.lang.String r1 = r9.f26150f
            android.graphics.drawable.Drawable r1 = r8.getDisplayIconDrawable(r1)
            r0.setIcon(r1)
            com.etsy.android.lib.logger.ITrackedObject r1 = r9.f26153i
            com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$5$1 r2 = new com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$5$1
            r2.<init>(r9, r8)
            com.etsy.android.extensions.ViewExtensions.m12865i(r0, r1, r2)
        L_0x01be:
            android.view.View r9 = r8.selectedPhotoUploadView
            com.etsy.android.extensions.ViewExtensions.m12869m(r9)
            return
        L_0x01c4:
            java.lang.String r9 = "photoUploadHighRatingView"
            kotlin.jvm.internal.C19383o.m32805o(r9)
            throw r1
        L_0x01ca:
            java.lang.String r9 = "photoUploadLowRatingView"
            kotlin.jvm.internal.C19383o.m32805o(r9)
            throw r1
        L_0x01d0:
            java.lang.String r9 = "photoUploadView"
            kotlin.jvm.internal.C19383o.m32805o(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewActivity.setUpPhotoUploadHighRatingStep(com.etsy.android.ui.user.review.r$v):void");
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setUpPhotoUploadLowRatingStep(com.etsy.android.p327ui.user.review.C11719r.C11742w r8) {
        /*
            r7 = this;
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = (com.etsy.android.stylekit.views.CollageAlert) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            com.etsy.android.stylekit.views.CollageEmptyStateView r0 = r7.emptyStateView
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r7.photoUploadView
            r1 = 0
            if (r0 == 0) goto L_0x0164
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r7.photoUploadHighRatingView
            if (r0 == 0) goto L_0x015e
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r7.photoUploadLowRatingView
            if (r0 == 0) goto L_0x0158
            r7.selectedPhotoUploadView = r0
            r0 = 2131429941(0x7f0b0a35, float:1.8481569E38)
            android.view.View r2 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r2 = (androidx.constraintlayout.widget.Group) r2
            java.lang.String r3 = "subratings"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            int r2 = r2.getVisibility()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x003e
            r2 = r3
            goto L_0x003f
        L_0x003e:
            r2 = r4
        L_0x003f:
            r5 = 2131428101(0x7f0b0305, float:1.8477837E38)
            if (r2 == 0) goto L_0x0060
            il.e r2 = new il.e
            r2.<init>(r3)
            long r3 = r7.transitionAnimationDuration
            r2.f16562d = r3
            android.view.View r3 = r7._$_findCachedViewById(r5)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            p186n2.C7426q.m14342a(r3, r2)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            goto L_0x00c4
        L_0x0060:
            r0 = 2131429258(0x7f0b078a, float:1.8480184E38)
            android.view.View r2 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r2 = (androidx.constraintlayout.widget.Group) r2
            java.lang.String r6 = "photo_confirmation"
            kotlin.jvm.internal.C19383o.m32796f(r2, r6)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0076
            r2 = r3
            goto L_0x0077
        L_0x0076:
            r2 = r4
        L_0x0077:
            if (r2 == 0) goto L_0x0095
            il.e r2 = new il.e
            r2.<init>(r4)
            long r3 = r7.transitionAnimationDuration
            r2.f16562d = r3
            android.view.View r3 = r7._$_findCachedViewById(r5)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            p186n2.C7426q.m14342a(r3, r2)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            goto L_0x00c4
        L_0x0095:
            r0 = 2131430376(0x7f0b0be8, float:1.8482451E38)
            android.view.View r2 = r7._$_findCachedViewById(r0)
            java.lang.String r6 = "video_confirmation"
            kotlin.jvm.internal.C19383o.m32796f(r2, r6)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r3 = r4
        L_0x00a9:
            if (r3 == 0) goto L_0x00c4
            il.e r2 = new il.e
            r2.<init>(r4)
            long r3 = r7.transitionAnimationDuration
            r2.f16562d = r3
            android.view.View r3 = r7._$_findCachedViewById(r5)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            p186n2.C7426q.m14342a(r3, r2)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
        L_0x00c4:
            com.etsy.android.ui.view.StepIndicatorView r0 = r7.stepIndicatorView
            if (r0 == 0) goto L_0x00cd
            int r2 = r8.f26166k
            r0.setCurrentStepPosition(r2)
        L_0x00cd:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x00db
            r2 = 2131430332(0x7f0b0bbc, float:1.8482362E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00dc
        L_0x00db:
            r0 = r1
        L_0x00dc:
            if (r0 != 0) goto L_0x00df
            goto L_0x00e4
        L_0x00df:
            java.lang.String r2 = r8.f26157b
            r0.setText(r2)
        L_0x00e4:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x00f2
            r1 = 2131430330(0x7f0b0bba, float:1.8482358E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x00f2:
            if (r1 != 0) goto L_0x00f5
            goto L_0x00fa
        L_0x00f5:
            java.lang.String r0 = r8.f26158c
            r1.setText(r0)
        L_0x00fa:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x0126
            r1 = 2131430002(0x7f0b0a72, float:1.8481693E38)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 == 0) goto L_0x0126
            java.lang.String r1 = r8.f26159d
            r0.setText(r1)
            java.lang.String r1 = r8.f26159d
            r0.setContentDescription(r1)
            java.lang.String r1 = r8.f26161f
            android.graphics.drawable.Drawable r1 = r7.getDisplayIconDrawable(r1)
            r0.setIcon(r1)
            com.etsy.android.lib.logger.ITrackedObject r1 = r8.f26164i
            com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadLowRatingStep$1$1 r2 = new com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadLowRatingStep$1$1
            r2.<init>(r8, r7)
            com.etsy.android.extensions.ViewExtensions.m12865i(r0, r1, r2)
        L_0x0126:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x0152
            r1 = 2131430005(0x7f0b0a75, float:1.8481699E38)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 == 0) goto L_0x0152
            java.lang.String r1 = r8.f26160e
            r0.setText(r1)
            java.lang.String r1 = r8.f26160e
            r0.setContentDescription(r1)
            java.lang.String r1 = r8.f26162g
            android.graphics.drawable.Drawable r1 = r7.getDisplayIconDrawable(r1)
            r0.setIcon(r1)
            com.etsy.android.lib.logger.ITrackedObject r1 = r8.f26165j
            com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadLowRatingStep$2$1 r2 = new com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadLowRatingStep$2$1
            r2.<init>(r8, r7)
            com.etsy.android.extensions.ViewExtensions.m12865i(r0, r1, r2)
        L_0x0152:
            android.view.View r8 = r7.selectedPhotoUploadView
            com.etsy.android.extensions.ViewExtensions.m12869m(r8)
            return
        L_0x0158:
            java.lang.String r8 = "photoUploadLowRatingView"
            kotlin.jvm.internal.C19383o.m32805o(r8)
            throw r1
        L_0x015e:
            java.lang.String r8 = "photoUploadHighRatingView"
            kotlin.jvm.internal.C19383o.m32805o(r8)
            throw r1
        L_0x0164:
            java.lang.String r8 = "photoUploadView"
            kotlin.jvm.internal.C19383o.m32805o(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewActivity.setUpPhotoUploadLowRatingStep(com.etsy.android.ui.user.review.r$w):void");
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setUpPhotoUploadStep(com.etsy.android.p327ui.user.review.C11719r.C11740u r8) {
        /*
            r7 = this;
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = (com.etsy.android.stylekit.views.CollageAlert) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            com.etsy.android.stylekit.views.CollageEmptyStateView r0 = r7.emptyStateView
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r7.photoUploadLowRatingView
            r1 = 0
            if (r0 == 0) goto L_0x012d
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r7.photoUploadHighRatingView
            if (r0 == 0) goto L_0x0127
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            android.view.View r0 = r7.photoUploadView
            if (r0 == 0) goto L_0x0121
            r7.selectedPhotoUploadView = r0
            r0 = 2131429941(0x7f0b0a35, float:1.8481569E38)
            android.view.View r2 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r2 = (androidx.constraintlayout.widget.Group) r2
            java.lang.String r3 = "subratings"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            int r2 = r2.getVisibility()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x003e
            r2 = r3
            goto L_0x003f
        L_0x003e:
            r2 = r4
        L_0x003f:
            r5 = 2131428101(0x7f0b0305, float:1.8477837E38)
            if (r2 == 0) goto L_0x0060
            il.e r2 = new il.e
            r2.<init>(r3)
            long r3 = r7.transitionAnimationDuration
            r2.f16562d = r3
            android.view.View r3 = r7._$_findCachedViewById(r5)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            p186n2.C7426q.m14342a(r3, r2)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            goto L_0x0093
        L_0x0060:
            r0 = 2131429258(0x7f0b078a, float:1.8480184E38)
            android.view.View r2 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r2 = (androidx.constraintlayout.widget.Group) r2
            java.lang.String r6 = "photo_confirmation"
            kotlin.jvm.internal.C19383o.m32796f(r2, r6)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = r4
        L_0x0076:
            if (r3 == 0) goto L_0x0093
            il.e r2 = new il.e
            r2.<init>(r4)
            long r3 = r7.transitionAnimationDuration
            r2.f16562d = r3
            android.view.View r3 = r7._$_findCachedViewById(r5)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            p186n2.C7426q.m14342a(r3, r2)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
        L_0x0093:
            com.etsy.android.ui.view.StepIndicatorView r0 = r7.stepIndicatorView
            if (r0 == 0) goto L_0x009c
            int r2 = r8.f26145i
            r0.setCurrentStepPosition(r2)
        L_0x009c:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x00aa
            r2 = 2131430332(0x7f0b0bbc, float:1.8482362E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00ab
        L_0x00aa:
            r0 = r1
        L_0x00ab:
            if (r0 != 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r2 = r8.f26138b
            r0.setText(r2)
        L_0x00b3:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x00c1
            r1 = 2131430330(0x7f0b0bba, float:1.8482358E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x00c1:
            if (r1 != 0) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            java.lang.String r0 = r8.f26139c
            r1.setText(r0)
        L_0x00c9:
            java.lang.String r0 = r8.f26140d
            boolean r0 = p628nj.C18263b.m30837c0(r0)
            if (r0 == 0) goto L_0x00df
            r0 = 2131430669(0x7f0b0d0d, float:1.8483045E38)
            android.view.View r0 = r7._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = r8.f26140d
            r0.setContentDescription(r1)
        L_0x00df:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x00fd
            r1 = 2131430002(0x7f0b0a72, float:1.8481693E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L_0x00fd
            java.lang.String r1 = r8.f26141e
            r0.setText(r1)
            com.etsy.android.lib.logger.ITrackedObject r1 = r8.f26143g
            com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadStep$1$1 r2 = new com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadStep$1$1
            r2.<init>(r7, r7)
            com.etsy.android.extensions.ViewExtensions.m12865i(r0, r1, r2)
        L_0x00fd:
            android.view.View r0 = r7.selectedPhotoUploadView
            if (r0 == 0) goto L_0x011b
            r1 = 2131429621(0x7f0b08f5, float:1.848092E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r8.f26142f
            r0.setText(r1)
            com.etsy.android.lib.logger.ITrackedObject r8 = r8.f26144h
            com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadStep$2$1 r1 = new com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadStep$2$1
            r1.<init>(r7, r7)
            com.etsy.android.extensions.ViewExtensions.m12865i(r0, r8, r1)
        L_0x011b:
            android.view.View r8 = r7.selectedPhotoUploadView
            com.etsy.android.extensions.ViewExtensions.m12869m(r8)
            return
        L_0x0121:
            java.lang.String r8 = "photoUploadView"
            kotlin.jvm.internal.C19383o.m32805o(r8)
            throw r1
        L_0x0127:
            java.lang.String r8 = "photoUploadHighRatingView"
            kotlin.jvm.internal.C19383o.m32805o(r8)
            throw r1
        L_0x012d:
            java.lang.String r8 = "photoUploadLowRatingView"
            kotlin.jvm.internal.C19383o.m32805o(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewActivity.setUpPhotoUploadStep(com.etsy.android.ui.user.review.r$u):void");
    }

    private final void setUpStepIndicator(boolean z) {
        if (z) {
            StepIndicatorView stepIndicatorView2 = (StepIndicatorView) findViewById(R.id.step_indicator_view);
            this.stepIndicatorView = stepIndicatorView2;
            ViewExtensions.m12869m(stepIndicatorView2);
            return;
        }
        ViewExtensions.m12860d(this.stepIndicatorView);
        this.stepIndicatorView = null;
    }

    private final void showAddPhotoPopup(C11719r.C11720a aVar) {
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(this);
        collageBottomSheet.setContentView((int) R.layout.create_review_edit_photo_menu);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.take_photo_item)).setText(aVar.f26068b);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.select_photo_item)).setText(aVar.f26069c);
        CollageListItem collageListItem = (CollageListItem) collageBottomSheet.findViewById(R.id.take_photo_item);
        C19383o.m32796f(collageListItem, "take_photo_item");
        ViewExtensions.m12865i(collageListItem, aVar.f26070d, new CreateReviewActivity$showAddPhotoPopup$1$1(aVar, collageBottomSheet, this, this));
        CollageListItem collageListItem2 = (CollageListItem) collageBottomSheet.findViewById(R.id.select_photo_item);
        C19383o.m32796f(collageListItem2, "select_photo_item");
        ViewExtensions.m12865i(collageListItem2, aVar.f26071e, new CreateReviewActivity$showAddPhotoPopup$1$2(aVar, collageBottomSheet, this, this));
        ViewExtensions.m12860d((CollageListItem) collageBottomSheet.findViewById(R.id.delete_photo_item));
        collageBottomSheet.show();
    }

    private final void showAddVideoPopup(C11719r.C11721b bVar) {
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(this);
        collageBottomSheet.setContentView((int) R.layout.create_review_add_video_menu);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.take_video_item)).setText(bVar.f26072b);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.select_video_item)).setText(bVar.f26073c);
        CollageListItem collageListItem = (CollageListItem) collageBottomSheet.findViewById(R.id.take_video_item);
        C19383o.m32796f(collageListItem, "take_video_item");
        ViewExtensions.m12865i(collageListItem, bVar.f26074d, new CreateReviewActivity$showAddVideoPopup$1$1(collageBottomSheet, this));
        CollageListItem collageListItem2 = (CollageListItem) collageBottomSheet.findViewById(R.id.select_video_item);
        C19383o.m32796f(collageListItem2, "select_video_item");
        ViewExtensions.m12865i(collageListItem2, bVar.f26075e, new CreateReviewActivity$showAddVideoPopup$1$2(collageBottomSheet, this, bVar));
        ViewExtensions.m12860d((CollageListItem) collageBottomSheet.findViewById(R.id.delete_video_item));
        collageBottomSheet.show();
    }

    private final void showEditPhotoPopup(C11719r.C11723d dVar) {
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(this);
        collageBottomSheet.setContentView((int) R.layout.create_review_edit_photo_menu);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.take_photo_item)).setText(dVar.f26077b);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.select_photo_item)).setText(dVar.f26078c);
        ViewExtensions.m12869m((CollageListItem) collageBottomSheet.findViewById(R.id.delete_photo_item));
        ((CollageListItem) collageBottomSheet.findViewById(R.id.delete_photo_item)).setText(dVar.f26079d);
        CollageListItem collageListItem = (CollageListItem) collageBottomSheet.findViewById(R.id.take_photo_item);
        C19383o.m32796f(collageListItem, "take_photo_item");
        ViewExtensions.m12865i(collageListItem, dVar.f26080e, new CreateReviewActivity$showEditPhotoPopup$1$1(collageBottomSheet, this, this, dVar));
        CollageListItem collageListItem2 = (CollageListItem) collageBottomSheet.findViewById(R.id.select_photo_item);
        C19383o.m32796f(collageListItem2, "select_photo_item");
        ViewExtensions.m12865i(collageListItem2, dVar.f26081f, new CreateReviewActivity$showEditPhotoPopup$1$2(collageBottomSheet, this, this, dVar));
        CollageListItem collageListItem3 = (CollageListItem) collageBottomSheet.findViewById(R.id.delete_photo_item);
        C19383o.m32796f(collageListItem3, "delete_photo_item");
        ViewExtensions.m12865i(collageListItem3, dVar.f26082g, new CreateReviewActivity$showEditPhotoPopup$1$3(collageBottomSheet, this, dVar));
        collageBottomSheet.show();
    }

    private final void showEditVideoPopup(C11719r.C11724e eVar) {
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(this);
        collageBottomSheet.setContentView((int) R.layout.create_review_add_video_menu);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.take_video_item)).setText(eVar.f26083b);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.select_video_item)).setText(eVar.f26084c);
        ((CollageListItem) collageBottomSheet.findViewById(R.id.delete_video_item)).setText(eVar.f26085d);
        ViewExtensions.m12869m((CollageListItem) collageBottomSheet.findViewById(R.id.delete_video_item));
        CollageListItem collageListItem = (CollageListItem) collageBottomSheet.findViewById(R.id.take_video_item);
        C19383o.m32796f(collageListItem, "take_video_item");
        ViewExtensions.m12865i(collageListItem, eVar.f26086e, new CreateReviewActivity$showEditVideoPopup$1$1(collageBottomSheet, this));
        CollageListItem collageListItem2 = (CollageListItem) collageBottomSheet.findViewById(R.id.select_video_item);
        C19383o.m32796f(collageListItem2, "select_video_item");
        ViewExtensions.m12865i(collageListItem2, eVar.f26087f, new CreateReviewActivity$showEditVideoPopup$1$2(collageBottomSheet, this, eVar));
        CollageListItem collageListItem3 = (CollageListItem) collageBottomSheet.findViewById(R.id.delete_video_item);
        C19383o.m32796f(collageListItem3, "delete_video_item");
        ViewExtensions.m12865i(collageListItem3, eVar.f26088g, new CreateReviewActivity$showEditVideoPopup$1$3(collageBottomSheet, this));
        collageBottomSheet.show();
    }

    private final void showErrorPopup(C11719r.C11725f fVar) {
        String str = fVar.f26089b;
        if (str == null) {
            str = getString(fVar.f26090c);
            C19383o.m32796f(str, "getString(state.errorTitleRes)");
        }
        String str2 = fVar.f26091d;
        if (str2 == null) {
            str2 = getString(fVar.f26092e);
            C19383o.m32796f(str2, "getString(state.errorMessageRes)");
        }
        ((CollageAlert) _$_findCachedViewById(R.id.error_alert)).setTitleText(str);
        CollageAlert collageAlert = (CollageAlert) _$_findCachedViewById(R.id.error_alert);
        C19383o.m32796f(collageAlert, "error_alert");
        CollageAlert.setBodyText$default(collageAlert, str2, (Drawable) null, 2, (Object) null);
        if (fVar.f26093f) {
            ViewExtensions.m12860d(this.backButton);
            CollageAlert collageAlert2 = (CollageAlert) _$_findCachedViewById(R.id.error_alert);
            C19383o.m32796f(collageAlert2, "error_alert");
            ViewExtensions.m12866j(collageAlert2, new CreateReviewActivity$showErrorPopup$1(this));
            ThreeArmSweaterException.Companion companion = ThreeArmSweaterException.Companion;
            Context context = ((CollageAlert) _$_findCachedViewById(R.id.error_alert)).getContext();
            C19383o.m32796f(context, "error_alert.context");
            companion.getClass();
            ThreeArmSweaterException.Companion.m12856a(context);
        }
        C17857d dVar = new C17857d();
        dVar.f16562d = 350;
        C7426q.m14342a((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container), dVar);
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
        ViewExtensions.m12869m((CollageAlert) _$_findCachedViewById(R.id.error_alert));
    }

    private final void showErrorWithRetry(C11719r.C11726g gVar) {
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
        CollageEmptyStateView collageEmptyStateView = this.emptyStateView;
        if (collageEmptyStateView != null) {
            ViewExtensions.m12869m(collageEmptyStateView);
            collageEmptyStateView.setTitleText(gVar.f26094b);
            collageEmptyStateView.setPrimaryButtonOnClickListener(new C9052c(gVar, 2));
            collageEmptyStateView.setPrimaryButtonText((int) R.string.retry);
            ThreeArmSweaterException.Companion companion = ThreeArmSweaterException.Companion;
            Context context = collageEmptyStateView.getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            companion.getClass();
            ThreeArmSweaterException.Companion.m12856a(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showErrorWithRetry$lambda-50$lambda-49  reason: not valid java name */
    public static final void m35083showErrorWithRetry$lambda50$lambda49(C11719r.C11726g gVar, View view) {
        C19383o.m32797g(gVar, "$state");
        gVar.f26095c.invoke();
    }

    /* access modifiers changed from: private */
    public final void showFloatingAlert(AlertData alertData) {
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
        C12979a a = C12979a.C12980a.m20683a(this);
        a.f28588b.setIconDrawableRes(alertData.getIcon());
        a.f28588b.setTitleText(alertData.getTitle());
        a.f28588b.setBodyText(alertData.getBody(), (Drawable) null);
        a.mo45781a(alertData.getAlertType());
        a.f28591e = alertData.getDuration();
        a.mo45786f();
    }

    /* access modifiers changed from: private */
    public final void showFullscreenVideoPreview(Uri uri) {
        getAnalyticsContext().mo21333d(ReviewEvent.VIDEO_THUMBNAIL_TAPPED.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C2740a aVar = new C2740a(supportFragmentManager);
        FullScreenVideoPlayerFragment fullScreenVideoPlayerFragment = new FullScreenVideoPlayerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(FullScreenVideoPlayerFragment.KEY_VIDEO_URI, uri);
        fullScreenVideoPlayerFragment.setArguments(bundle);
        aVar.mo10485g(R.id.full_screen_video_container, fullScreenVideoPlayerFragment, (String) null, 1);
        aVar.mo10529c((String) null);
        aVar.mo10483d();
    }

    private final void showHighFiveStep(C11719r.C11728i iVar) {
        ViewExtensions.m12860d((CollageAlert) _$_findCachedViewById(R.id.error_alert));
        ViewExtensions.m12860d(this.emptyStateView);
        ((TextView) _$_findCachedViewById(R.id.highfive_text)).setText(iVar.f26098b);
        C17858e eVar = new C17858e(true);
        eVar.f16562d = 200;
        C7426q.m14342a((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container), eVar);
        StepIndicatorView stepIndicatorView2 = this.stepIndicatorView;
        if (stepIndicatorView2 != null) {
            stepIndicatorView2.setCurrentStepPosition(iVar.f26099c);
        }
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.subratings));
        ViewExtensions.m12860d(this.selectedPhotoUploadView);
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.photo_confirmation));
        ViewExtensions.m12860d(_$_findCachedViewById(R.id.video_confirmation));
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
        ViewExtensions.m12869m((Group) _$_findCachedViewById(R.id.highfive));
    }

    private final void showLoadingIndicator() {
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.subratings));
        ViewExtensions.m12860d(this.selectedPhotoUploadView);
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.photo_confirmation));
        ViewExtensions.m12860d(_$_findCachedViewById(R.id.video_confirmation));
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.highfive));
        ViewExtensions.m12860d(this.forwardButton);
        ViewExtensions.m12869m((Group) _$_findCachedViewById(R.id.loading));
    }

    private final void showOverallRatingStep(C11719r.C11730k kVar) {
        String str;
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.loading));
        ViewExtensions.m12860d((CollageAlert) _$_findCachedViewById(R.id.error_alert));
        ViewExtensions.m12860d(this.emptyStateView);
        StepIndicatorView stepIndicatorView2 = this.stepIndicatorView;
        if (stepIndicatorView2 != null) {
            stepIndicatorView2.setCurrentStepPosition(kVar.f26109j);
        }
        if (kVar.f26110k) {
            C17858e eVar = new C17858e(false);
            eVar.f16562d = this.transitionAnimationDuration;
            C7426q.m14342a((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container), eVar);
            ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.subratings));
        } else if (kVar.f26111l) {
            C17858e eVar2 = new C17858e(true);
            eVar2.f16562d = this.transitionAnimationDuration;
            C7426q.m14342a((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container), eVar2);
        }
        ViewExtensions.m12869m((Group) _$_findCachedViewById(R.id.initial_rating));
        Glide.with((FragmentActivity) this).load(kVar.f26101b).mo16829a(C6128g.m12231I(new C6105w(getResources().getDimensionPixelSize(R.dimen.clg_space_8)))).mo16816M((ImageView) _$_findCachedViewById(R.id.shop_icon));
        RequestManager with = Glide.with((FragmentActivity) this);
        ListingImage listingImage = kVar.f26102c;
        if (listingImage == null || (str = C0761x.m1711b1(listingImage, ((ImageView) _$_findCachedViewById(R.id.listing_image)).getWidth())) == null) {
            str = "";
        }
        with.load(str).mo16816M((ImageView) _$_findCachedViewById(R.id.listing_image));
        ((TextView) _$_findCachedViewById(R.id.purchased_from_shop_name)).setText(kVar.f26103d);
        ((TextView) _$_findCachedViewById(R.id.listing_title)).setText(kVar.f26104e);
        ((TextView) _$_findCachedViewById(R.id.variation_value)).setText(kVar.f26105f);
        ((TextView) _$_findCachedViewById(R.id.rating_display_text)).setText(kVar.f26106g);
        ((CollageRatingButtons) _$_findCachedViewById(R.id.rating_buttons)).setLabelForAccessibility(kVar.f26104e);
        ((CollageRatingButtons) _$_findCachedViewById(R.id.rating_buttons)).setRating(kVar.f26107h);
        ((CollageRatingButtons) _$_findCachedViewById(R.id.rating_buttons)).setOnSelectedListener(new C11688a(this));
        MaterialButton materialButton = this.backButton;
        if (materialButton != null) {
            ViewExtensions.m12865i(materialButton, kVar.f26108i, new CreateReviewActivity$showOverallRatingStep$2(this));
        }
    }

    private final void showPhotoConfirmationStep(C11719r.C11734o oVar) {
        ViewExtensions.m12860d((CollageAlert) _$_findCachedViewById(R.id.error_alert));
        ViewExtensions.m12860d(this.emptyStateView);
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.subratings));
        Button button = this.forwardButton;
        if (button != null) {
            ViewExtensions.m12860d(button);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_12);
        if (oVar.f26119f != null) {
            Glide.with((FragmentActivity) this).load(oVar.f26119f).mo16829a(C6128g.m12231I(new C6105w(dimensionPixelSize))).mo16816M((ImageView) _$_findCachedViewById(R.id.your_photo));
        } else if (oVar.f26120g != null) {
            Glide.with((FragmentActivity) this).load(oVar.f26120g).mo16829a(C6128g.m12231I(new C6105w(dimensionPixelSize))).mo16816M((ImageView) _$_findCachedViewById(R.id.your_photo));
        }
        StepIndicatorView stepIndicatorView2 = this.stepIndicatorView;
        if (stepIndicatorView2 != null) {
            stepIndicatorView2.setCurrentStepPosition(oVar.f26121h);
        }
        C17858e eVar = new C17858e(true);
        eVar.f16562d = this.transitionAnimationDuration;
        C7426q.m14342a((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container), eVar);
        ViewExtensions.m12860d(this.selectedPhotoUploadView);
        ViewExtensions.m12869m((Group) _$_findCachedViewById(R.id.photo_confirmation));
        ((TextView) _$_findCachedViewById(R.id.photo_done_text)).setText(oVar.f26115b);
        ((Button) _$_findCachedViewById(R.id.edit_photo_button)).setText(oVar.f26116c);
        Button button2 = (Button) _$_findCachedViewById(R.id.submit_photo_review_button);
        C19383o.m32796f(button2, "submit_photo_review_button");
        ViewExtensions.m12865i(button2, oVar.f26118e, new CreateReviewActivity$showPhotoConfirmationStep$1(this));
        Button button3 = (Button) _$_findCachedViewById(R.id.edit_photo_button);
        C19383o.m32796f(button3, "edit_photo_button");
        ViewExtensions.m12865i(button3, oVar.f26117d, new CreateReviewActivity$showPhotoConfirmationStep$2(this));
    }

    private final void showSubmitWarningPopup(C11719r.C11737r rVar) {
        C18519a q = new C9056g(this).setTitle(rVar.f26124b);
        q.f286a.f264f = rVar.f26125c;
        q.mo70027p(rVar.f26126d, new C11442q(1, this, rVar));
        q.mo70025n(rVar.f26127e, new C11707f(this, rVar));
        q.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showSubmitWarningPopup$lambda-51  reason: not valid java name */
    public static final void m35084showSubmitWarningPopup$lambda51(CreateReviewActivity createReviewActivity, C11719r.C11737r rVar, DialogInterface dialogInterface, int i) {
        String str;
        C19383o.m32797g(createReviewActivity, "this$0");
        C19383o.m32797g(rVar, "$state");
        C19383o.m32797g(dialogInterface, "dialog");
        C8703p analyticsContext = createReviewActivity.getAnalyticsContext();
        ITrackedObject iTrackedObject = rVar.f26129g;
        if (iTrackedObject == null || (str = C19388s.m32863g0(iTrackedObject)) == null) {
            str = "";
        }
        analyticsContext.mo21333d(str, (Map<? extends AnalyticsProperty, Object>) null);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: showSubmitWarningPopup$lambda-52  reason: not valid java name */
    public static final void m35085showSubmitWarningPopup$lambda52(CreateReviewActivity createReviewActivity, C11719r.C11737r rVar, DialogInterface dialogInterface, int i) {
        String str;
        C19383o.m32797g(createReviewActivity, "this$0");
        C19383o.m32797g(rVar, "$state");
        C19383o.m32797g(dialogInterface, "dialog");
        dialogInterface.dismiss();
        C8703p analyticsContext = createReviewActivity.getAnalyticsContext();
        ITrackedObject iTrackedObject = rVar.f26128f;
        if (iTrackedObject == null || (str = C19388s.m32863g0(iTrackedObject)) == null) {
            str = "";
        }
        analyticsContext.mo21333d(str, (Map<? extends AnalyticsProperty, Object>) null);
        createReviewActivity.getViewModel().mo37853l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showSubratingsStep(com.etsy.android.p327ui.user.review.C11719r.C11738s r9) {
        /*
            r8 = this;
            r0 = 2131428908(0x7f0b062c, float:1.8479474E38)
            android.view.View r0 = r8._$_findCachedViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r8._$_findCachedViewById(r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = (com.etsy.android.stylekit.views.CollageAlert) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            com.etsy.android.stylekit.views.CollageEmptyStateView r0 = r8.emptyStateView
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            r0 = 2131429942(0x7f0b0a36, float:1.848157E38)
            android.view.View r1 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.removeAllViews()
            boolean r1 = r9.f26136h
            r2 = 0
            r3 = 2131428101(0x7f0b0305, float:1.8477837E38)
            r4 = 1
            if (r1 == 0) goto L_0x00a0
            il.e r1 = new il.e
            r1.<init>(r2)
            long r5 = r8.transitionAnimationDuration
            r1.f16562d = r5
            android.view.View r3 = r8._$_findCachedViewById(r3)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            p186n2.C7426q.m14342a(r3, r1)
            android.view.View r1 = r8.selectedPhotoUploadView
            if (r1 == 0) goto L_0x0055
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0050
            r1 = r4
            goto L_0x0051
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != r4) goto L_0x0055
            r1 = r4
            goto L_0x0056
        L_0x0055:
            r1 = r2
        L_0x0056:
            if (r1 == 0) goto L_0x005e
            android.view.View r1 = r8.selectedPhotoUploadView
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            goto L_0x00be
        L_0x005e:
            r1 = 2131429258(0x7f0b078a, float:1.8480184E38)
            android.view.View r3 = r8._$_findCachedViewById(r1)
            androidx.constraintlayout.widget.Group r3 = (androidx.constraintlayout.widget.Group) r3
            java.lang.String r5 = "photo_confirmation"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0074
            r3 = r4
            goto L_0x0075
        L_0x0074:
            r3 = r2
        L_0x0075:
            if (r3 == 0) goto L_0x0081
            android.view.View r1 = r8._$_findCachedViewById(r1)
            androidx.constraintlayout.widget.Group r1 = (androidx.constraintlayout.widget.Group) r1
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            goto L_0x00be
        L_0x0081:
            r1 = 2131430376(0x7f0b0be8, float:1.8482451E38)
            android.view.View r3 = r8._$_findCachedViewById(r1)
            java.lang.String r5 = "video_confirmation"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0095
            r3 = r4
            goto L_0x0096
        L_0x0095:
            r3 = r2
        L_0x0096:
            if (r3 == 0) goto L_0x00be
            android.view.View r1 = r8._$_findCachedViewById(r1)
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            goto L_0x00be
        L_0x00a0:
            il.e r1 = new il.e
            r1.<init>(r4)
            long r5 = r8.transitionAnimationDuration
            r1.f16562d = r5
            android.view.View r3 = r8._$_findCachedViewById(r3)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            p186n2.C7426q.m14342a(r3, r1)
            r1 = 2131429945(0x7f0b0a39, float:1.8481577E38)
            android.view.View r1 = r8._$_findCachedViewById(r1)
            androidx.constraintlayout.widget.Group r1 = (androidx.constraintlayout.widget.Group) r1
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
        L_0x00be:
            r1 = 2131429941(0x7f0b0a35, float:1.8481569E38)
            android.view.View r1 = r8._$_findCachedViewById(r1)
            androidx.constraintlayout.widget.Group r1 = (androidx.constraintlayout.widget.Group) r1
            com.etsy.android.extensions.ViewExtensions.m12869m(r1)
            com.etsy.android.ui.view.StepIndicatorView r1 = r8.stepIndicatorView
            if (r1 == 0) goto L_0x00d3
            int r3 = r9.f26134f
            r1.setCurrentStepPosition(r3)
        L_0x00d3:
            r1 = 2131429930(0x7f0b0a2a, float:1.8481547E38)
            android.view.View r1 = r8._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = r9.f26130b
            r1.setText(r3)
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowRatingControl> r1 = r9.f26131c
            java.util.Iterator r1 = r1.iterator()
        L_0x00e7:
            boolean r3 = r1.hasNext()
            java.lang.String r5 = "subratings_container"
            if (r3 == 0) goto L_0x0170
            java.lang.Object r3 = r1.next()
            com.etsy.android.ui.user.review.ReviewFlowRatingControl r3 = (com.etsy.android.p327ui.user.review.ReviewFlowRatingControl) r3
            android.view.View r6 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.C19383o.m32796f(r6, r5)
            r5 = 2131624074(0x7f0e008a, float:1.8875317E38)
            android.view.View r5 = androidx.activity.C0114h.m305j0(r6, r5, r2)
            r6 = 2131429940(0x7f0b0a34, float:1.8481567E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r3.f26012a
            r6.setText(r7)
            java.lang.String r6 = r3.f26013b
            r5.setTag(r6)
            r6 = 2131429934(0x7f0b0a2e, float:1.8481555E38)
            android.view.View r6 = r5.findViewById(r6)
            com.etsy.android.stylekit.views.ratings.CollageRatingButtons r6 = (com.etsy.android.stylekit.views.ratings.CollageRatingButtons) r6
            java.lang.String r7 = r3.f26012a
            if (r7 != 0) goto L_0x0127
            java.lang.String r7 = ""
        L_0x0127:
            r6.setLabelForAccessibility(r7)
            com.etsy.android.ui.user.review.CreateReviewActivity$b r7 = new com.etsy.android.ui.user.review.CreateReviewActivity$b
            r7.<init>(r8, r5)
            r6.setOnSelectedListener(r7)
            com.etsy.android.ui.user.review.ReviewFlowSubratingControl r7 = r3.f26014c
            if (r7 == 0) goto L_0x013f
            java.lang.Integer r7 = r7.f26022a
            if (r7 == 0) goto L_0x013f
            int r7 = r7.intValue()
            goto L_0x0140
        L_0x013f:
            r7 = r2
        L_0x0140:
            r6.setRating(r7)
            com.etsy.android.ui.user.review.ReviewFlowCheckboxControl r7 = r9.f26132d
            if (r7 == 0) goto L_0x0155
            java.util.List<java.lang.String> r7 = r7.f25990b
            if (r7 == 0) goto L_0x0155
            java.lang.String r3 = r3.f26013b
            boolean r3 = kotlin.collections.C19327t.m32634P0(r3, r7)
            if (r3 != r4) goto L_0x0155
            r3 = r4
            goto L_0x0156
        L_0x0155:
            r3 = r2
        L_0x0156:
            if (r3 == 0) goto L_0x0165
            com.etsy.android.ui.user.review.ReviewFlowCheckboxControl r3 = r9.f26132d
            boolean r3 = r3.f25991c
            if (r3 == 0) goto L_0x0162
            com.etsy.android.extensions.ViewExtensions.m12860d(r6)
            goto L_0x0165
        L_0x0162:
            com.etsy.android.extensions.ViewExtensions.m12869m(r6)
        L_0x0165:
            android.view.View r3 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3.addView(r5)
            goto L_0x00e7
        L_0x0170:
            com.etsy.android.ui.user.review.ReviewFlowCheckboxControl r1 = r9.f26132d
            if (r1 == 0) goto L_0x01a4
            android.view.View r3 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            r5 = 2131624075(0x7f0e008b, float:1.887532E38)
            android.view.View r2 = androidx.activity.C0114h.m305j0(r3, r5, r2)
            r3 = r2
            com.etsy.android.stylekit.views.CollageCheckbox r3 = (com.etsy.android.stylekit.views.CollageCheckbox) r3
            com.etsy.android.ui.user.review.ReviewFlowCheckboxControl r5 = r9.f26132d
            java.lang.String r5 = r5.f25989a
            r3.setText((java.lang.String) r5)
            com.etsy.android.ui.user.review.CreateReviewActivity$c r5 = new com.etsy.android.ui.user.review.CreateReviewActivity$c
            r5.<init>(r8, r1)
            r3.setOnCheckedChangeListener(r5)
            boolean r1 = r1.f25991c
            r3.setChecked(r1)
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.addView(r2)
        L_0x01a4:
            com.etsy.android.ui.user.review.ReviewFlowTextFieldControl r0 = r9.f26133e
            if (r0 == 0) goto L_0x0214
            r1 = 2131429491(0x7f0b0873, float:1.8480656E38)
            android.view.View r2 = r8._$_findCachedViewById(r1)
            com.etsy.android.stylekit.views.CollageTextInput r2 = (com.etsy.android.stylekit.views.CollageTextInput) r2
            java.lang.String r3 = r0.f26023a
            r2.setHelperText(r3)
            java.lang.Integer r2 = r0.f26027e
            if (r2 == 0) goto L_0x01d0
            int r2 = r2.intValue()
            android.view.View r3 = r8._$_findCachedViewById(r1)
            com.etsy.android.stylekit.views.CollageTextInput r3 = (com.etsy.android.stylekit.views.CollageTextInput) r3
            r3.setCounterEnabled(r4)
            android.view.View r3 = r8._$_findCachedViewById(r1)
            com.etsy.android.stylekit.views.CollageTextInput r3 = (com.etsy.android.stylekit.views.CollageTextInput) r3
            r3.setCounterMaxLength(r2)
        L_0x01d0:
            android.view.View r2 = r8._$_findCachedViewById(r1)
            com.etsy.android.stylekit.views.CollageTextInput r2 = (com.etsy.android.stylekit.views.CollageTextInput) r2
            java.lang.String r3 = "review_input"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            com.etsy.android.ui.user.review.CreateReviewActivity$showSubratingsStep$3$2 r3 = new com.etsy.android.ui.user.review.CreateReviewActivity$showSubratingsStep$3$2
            r3.<init>(r8)
            com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt.m18959a(r2, r3)
            android.view.View r2 = r8._$_findCachedViewById(r1)
            com.etsy.android.stylekit.views.CollageTextInput r2 = (com.etsy.android.stylekit.views.CollageTextInput) r2
            java.lang.String r0 = r0.f26025c
            r2.setText(r0)
            android.view.View r0 = r8._$_findCachedViewById(r1)
            com.etsy.android.stylekit.views.CollageTextInput r0 = (com.etsy.android.stylekit.views.CollageTextInput) r0
            com.etsy.android.ui.user.review.b r2 = new com.etsy.android.ui.user.review.b
            r2.<init>(r8)
            r0.setOnFocusChangeListener(r2)
            r8.hideKeyboardOnTouchOutsideTextInput()
            android.view.View r0 = r8._$_findCachedViewById(r1)
            com.etsy.android.stylekit.views.CollageTextInput r0 = (com.etsy.android.stylekit.views.CollageTextInput) r0
            r1 = 2131427857(0x7f0b0211, float:1.8477342E38)
            android.view.View r0 = r0.findViewById(r1)
            com.etsy.android.ui.user.review.c r1 = new com.etsy.android.ui.user.review.c
            r1.<init>()
            r0.setOnTouchListener(r1)
        L_0x0214:
            com.etsy.android.stylekit.views.CollageAlert r0 = r8.subratingAlert
            if (r0 == 0) goto L_0x021d
            com.etsy.android.lib.models.apiv3.Alert r9 = r9.f26135g
            r8.setInlineBannerAlert(r0, r9)
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewActivity.showSubratingsStep(com.etsy.android.ui.user.review.r$s):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: showSubratingsStep$lambda-26$lambda-24  reason: not valid java name */
    public static final void m35086showSubratingsStep$lambda26$lambda24(CreateReviewActivity createReviewActivity, View view, boolean z) {
        C19383o.m32797g(createReviewActivity, "this$0");
        ViewExtensions.m12861e((CollageTextInput) createReviewActivity._$_findCachedViewById(R.id.review_input));
    }

    /* access modifiers changed from: private */
    /* renamed from: showSubratingsStep$lambda-26$lambda-25  reason: not valid java name */
    public static final boolean m35087showSubratingsStep$lambda26$lambda25(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            view.performClick();
            return false;
        }
    }

    private final void showSuccessConfirmation(String str) {
        ViewExtensions.m12860d((CollageAlert) _$_findCachedViewById(R.id.error_alert));
        ViewExtensions.m12860d(this.emptyStateView);
        ((TextView) _$_findCachedViewById(R.id.success_text)).setText(str);
        C17858e eVar = new C17858e(true);
        eVar.f16562d = this.transitionAnimationDuration;
        C7426q.m14342a((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container), eVar);
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.initial_rating));
        ViewExtensions.m12869m((Group) _$_findCachedViewById(R.id.success));
        new Handler().postDelayed(new C3254t(this, 1), 750);
    }

    /* access modifiers changed from: private */
    /* renamed from: showSuccessConfirmation$lambda-21  reason: not valid java name */
    public static final void m35088showSuccessConfirmation$lambda21(CreateReviewActivity createReviewActivity) {
        C19383o.m32797g(createReviewActivity, "this$0");
        createReviewActivity.getViewModel().mo37861u(false);
    }

    /* access modifiers changed from: private */
    public final void showTooltipForNewVideoReviews(Boolean bool) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator withEndAction;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator withEndAction2;
        if (C19383o.m32792b(bool, Boolean.TRUE)) {
            CollageAlert collageAlert = (CollageAlert) _$_findCachedViewById(R.id.video_reviews_tooltip_high_rating);
            C19383o.m32796f(collageAlert, "video_reviews_tooltip_high_rating");
            if (!(collageAlert.getVisibility() == 0)) {
                CollageAlert collageAlert2 = (CollageAlert) _$_findCachedViewById(R.id.video_reviews_tooltip_high_rating);
                if (!(collageAlert2 == null || (animate2 = collageAlert2.animate()) == null || (duration2 = animate2.setDuration(500)) == null || (alpha2 = duration2.alpha(1.0f)) == null || (withEndAction2 = alpha2.withEndAction(new C4950e(this, 3))) == null)) {
                    withEndAction2.start();
                }
                View.OnClickListener dismissButtonClickListener = ((CollageAlert) _$_findCachedViewById(R.id.video_reviews_tooltip_high_rating)).getDismissButtonClickListener();
                if (dismissButtonClickListener != null) {
                    dismissButtonClickListener.onClick((CollageAlert) _$_findCachedViewById(R.id.video_reviews_tooltip_high_rating));
                    return;
                }
                return;
            }
        }
        CollageAlert collageAlert3 = (CollageAlert) _$_findCachedViewById(R.id.video_reviews_tooltip_high_rating);
        if (collageAlert3 != null && (animate = collageAlert3.animate()) != null && (duration = animate.setDuration(500)) != null && (alpha = duration.alpha(0.0f)) != null && (withEndAction = alpha.withEndAction(new C11705d(this, 0))) != null) {
            withEndAction.start();
        }
    }

    public static /* synthetic */ void showTooltipForNewVideoReviews$default(CreateReviewActivity createReviewActivity, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        createReviewActivity.showTooltipForNewVideoReviews(bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: showTooltipForNewVideoReviews$lambda-46  reason: not valid java name */
    public static final void m35089showTooltipForNewVideoReviews$lambda46(CreateReviewActivity createReviewActivity) {
        C19383o.m32797g(createReviewActivity, "this$0");
        CollageAlert collageAlert = (CollageAlert) createReviewActivity._$_findCachedViewById(R.id.video_reviews_tooltip_high_rating);
        if (collageAlert != null) {
            collageAlert.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showTooltipForNewVideoReviews$lambda-47  reason: not valid java name */
    public static final void m35090showTooltipForNewVideoReviews$lambda47(CreateReviewActivity createReviewActivity) {
        C19383o.m32797g(createReviewActivity, "this$0");
        CollageAlert collageAlert = (CollageAlert) createReviewActivity._$_findCachedViewById(R.id.video_reviews_tooltip_high_rating);
        if (collageAlert != null) {
            collageAlert.setVisibility(8);
        }
    }

    private final void showVideoConfirmationStep(C11719r.C11743x xVar) {
        Object obj;
        ViewExtensions.m12860d((CollageAlert) _$_findCachedViewById(R.id.error_alert));
        ViewExtensions.m12860d(this.emptyStateView);
        ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.subratings));
        Button button = this.forwardButton;
        if (button != null) {
            ViewExtensions.m12860d(button);
        }
        StepIndicatorView stepIndicatorView2 = this.stepIndicatorView;
        if (stepIndicatorView2 != null) {
            stepIndicatorView2.setCurrentStepPosition(xVar.f26174i);
        }
        Uri uri = xVar.f26172g;
        Object obj2 = null;
        if (uri != null) {
            C11701a0 a0Var = this.reviewsFileManager;
            getViewModel().f25914F = a0Var != null ? a0Var.mo37967b(this, uri) : null;
        }
        String str = xVar.f26173h;
        if (str != null) {
            Uri parse = Uri.parse(str);
            C19383o.m32796f(parse, "parse(this)");
            C11701a0 a0Var2 = this.reviewsFileManager;
            getViewModel().f25914F = a0Var2 != null ? a0Var2.mo37967b(this, parse) : null;
        }
        C17858e eVar = new C17858e(true);
        eVar.f16562d = this.transitionAnimationDuration;
        C7426q.m14342a((ConstraintLayout) _$_findCachedViewById(R.id.create_review_page_container), eVar);
        View view = this.photoUploadLowRatingView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.photoUploadHighRatingView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                ViewExtensions.m12869m(_$_findCachedViewById(R.id.video_confirmation));
                ((TextView) _$_findCachedViewById(R.id.upload_video_text)).setText(xVar.f26167b);
                ((Button) _$_findCachedViewById(R.id.edit_video_button)).setText(xVar.f26168c);
                ((Button) _$_findCachedViewById(R.id.submit_video_review_button)).setText(xVar.f26170e);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_12);
                ColorDrawable colorDrawable = new ColorDrawable(C13350a.m21013d(this, R.attr.clg_color_bg_image));
                if (xVar.f26173h != null) {
                    CreateReviewViewModel viewModel2 = getViewModel();
                    String str2 = xVar.f26173h;
                    C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
                    viewModel2.getClass();
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(str2);
                        obj = mediaMetadataRetriever.getFrameAtTime(0);
                    } catch (Exception e) {
                        e.printStackTrace();
                        obj = null;
                    }
                    RequestManager with = Glide.with((FragmentActivity) this);
                    if (obj == null) {
                        obj = xVar.f26173h;
                    }
                    ((C5959e) ((C5959e) with.load(obj).mo17160t(colorDrawable)).mo17152j(colorDrawable)).mo16829a(C6128g.m12231I(new C6105w(dimensionPixelSize))).mo16816M((ImageView) _$_findCachedViewById(R.id.video_thumbnail));
                    ImageView imageView = (ImageView) _$_findCachedViewById(R.id.video_thumbnail);
                    C19383o.m32796f(imageView, "video_thumbnail");
                    ViewExtensions.m12866j(imageView, new CreateReviewActivity$showVideoConfirmationStep$3(xVar, this));
                    Button button2 = (Button) _$_findCachedViewById(R.id.play_video_button);
                    C19383o.m32796f(button2, "play_video_button");
                    ViewExtensions.m12866j(button2, new CreateReviewActivity$showVideoConfirmationStep$4(xVar, this));
                }
                if (xVar.f26172g != null) {
                    CreateReviewViewModel viewModel3 = getViewModel();
                    File file = getViewModel().f25914F;
                    String path = file != null ? file.getPath() : null;
                    if (path == null) {
                        path = "";
                    }
                    viewModel3.getClass();
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        mediaMetadataRetriever2.setDataSource(path);
                        obj2 = mediaMetadataRetriever2.getFrameAtTime(0);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    RequestManager with2 = Glide.with((FragmentActivity) this);
                    if (obj2 == null) {
                        obj2 = xVar.f26172g;
                    }
                    ((C5959e) ((C5959e) with2.load(obj2).mo17160t(colorDrawable)).mo17152j(colorDrawable)).mo16829a(C6128g.m12231I(new C6105w(dimensionPixelSize))).mo16816M((ImageView) _$_findCachedViewById(R.id.video_thumbnail));
                    ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.video_thumbnail);
                    C19383o.m32796f(imageView2, "video_thumbnail");
                    ViewExtensions.m12866j(imageView2, new CreateReviewActivity$showVideoConfirmationStep$5(this, xVar));
                    Button button3 = (Button) _$_findCachedViewById(R.id.play_video_button);
                    C19383o.m32796f(button3, "play_video_button");
                    ViewExtensions.m12866j(button3, new CreateReviewActivity$showVideoConfirmationStep$6(this, xVar));
                }
                Button button4 = (Button) _$_findCachedViewById(R.id.submit_video_review_button);
                C19383o.m32796f(button4, "submit_video_review_button");
                ViewExtensions.m12865i(button4, xVar.f26171f, new CreateReviewActivity$showVideoConfirmationStep$7(this));
                Button button5 = (Button) _$_findCachedViewById(R.id.edit_video_button);
                C19383o.m32796f(button5, "edit_video_button");
                ViewExtensions.m12865i(button5, xVar.f26169d, new CreateReviewActivity$showVideoConfirmationStep$8(this));
                return;
            }
            C19383o.m32805o("photoUploadHighRatingView");
            throw null;
        }
        C19383o.m32805o("photoUploadLowRatingView");
        throw null;
    }

    private final void showVideoTooLongDialog() {
        C9056g gVar = new C9056g(this);
        gVar.mo70029r(R.string.video_too_long_to_send);
        gVar.f286a.f264f = getString(R.string.select_shorter_video_review, new Object[]{Integer.valueOf(getViewModel().f25920L)});
        AlertDialog create = gVar.setPositiveButton(R.string.okay, new C11706e(this)).create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showVideoTooLongDialog$lambda-48  reason: not valid java name */
    public static final void m35091showVideoTooLongDialog$lambda48(CreateReviewActivity createReviewActivity, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(createReviewActivity, "this$0");
        C19383o.m32797g(dialogInterface, "dialog");
        dialogInterface.dismiss();
        createReviewActivity.selectVideoFromGalleryLauncher.mo1157b("video/*");
    }

    /* access modifiers changed from: private */
    /* renamed from: signInForReviewResult$lambda-1  reason: not valid java name */
    public static final void m35092signInForReviewResult$lambda1(CreateReviewActivity createReviewActivity, C12647a aVar) {
        String id;
        C19383o.m32797g(createReviewActivity, "this$0");
        Bundle extras = createReviewActivity.getIntent().getExtras();
        Serializable serializable = extras != null ? extras.getSerializable(ResponseConstants.TRANSACTION_ID) : null;
        EtsyId etsyId = serializable instanceof EtsyId ? (EtsyId) serializable : null;
        if (etsyId != null && (id = etsyId.getId()) != null) {
            CreateReviewViewModel viewModel2 = createReviewActivity.getViewModel();
            int i = aVar.f27895a;
            Integer presetOverallRatingExtra = createReviewActivity.getPresetOverallRatingExtra();
            viewModel2.getClass();
            if (i == 311) {
                viewModel2.mo37850i(presetOverallRatingExtra, id, false);
            } else {
                viewModel2.f25930h.setValue(new C11719r.C11726g(viewModel2.mo37845c((String) null, (Throwable) null), new CreateReviewViewModel$onSignInResult$1(viewModel2, id)));
            }
        }
    }

    private final void updateBackButton(C11700a aVar) {
        int i = aVar.f26042a == BackType.BACK ? R.drawable.sk_ic_back_tinted : R.drawable.clg_icon_core_close_v1;
        MaterialButton materialButton = this.backButton;
        if (materialButton != null) {
            materialButton.setIconResource(i);
        }
        MaterialButton materialButton2 = this.backButton;
        if (materialButton2 != null) {
            ViewExtensions.m12865i(materialButton2, aVar.f26043b, new CreateReviewActivity$updateBackButton$1(aVar, this));
        }
    }

    private final void updateForwardButton(C11744s sVar) {
        if (sVar == null) {
            Button button = this.forwardButton;
            if (button != null) {
                button.setText("");
            }
            Button button2 = this.forwardButton;
            if (button2 != null) {
                ViewExtensions.m12860d(button2);
            }
            ViewExtensions.m12869m(this.stepIndicatorView);
            return;
        }
        Button button3 = this.forwardButton;
        if (button3 != null) {
            String str = sVar.f26175a;
            if (str == null || str.length() == 0) {
                ViewExtensions.m12860d(button3);
                return;
            }
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!C2364y.C2371g.m5246c(button3) || button3.isLayoutRequested()) {
                button3.addOnLayoutChangeListener(new C11691x25b3c1c7(this));
            } else if (ViewExtensions.m12858b(this.stepIndicatorView, this.forwardButton)) {
                ViewExtensions.m12860d(this.stepIndicatorView);
            } else {
                ViewExtensions.m12869m(this.stepIndicatorView);
            }
            button3.setText(sVar.f26175a);
            ViewExtensions.m12865i(button3, sVar.f26176b, new CreateReviewActivity$updateForwardButton$1$2(this, sVar));
            ViewExtensions.m12869m(button3);
        }
    }

    /* access modifiers changed from: private */
    public final void updateVideoDurationIntentExtra() {
        if (this.recordVideoLauncher.mo1156a() instanceof C11755x) {
            C3443a<Uri, ?> a = this.recordVideoLauncher.mo1156a();
            C19383o.m32795e(a, "null cannot be cast to non-null type com.etsy.android.ui.user.review.RecordVideoContract");
            ((C11755x) a).f26193a = Integer.valueOf(getViewModel().f25920L);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C8886e getCameraHelper() {
        C8886e eVar = this.cameraHelper;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("cameraHelper");
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

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public final C11786n getResourceProvider() {
        C11786n nVar = this.resourceProvider;
        if (nVar != null) {
            return nVar;
        }
        C19383o.m32805o("resourceProvider");
        throw null;
    }

    public final C13943a getSharedPreferenceProvider() {
        C13943a aVar = this.sharedPreferenceProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("sharedPreferenceProvider");
        throw null;
    }

    public final C8585b getTransformationUtil() {
        return this.transformationUtil;
    }

    public final CreateReviewViewModel getViewModel() {
        CreateReviewViewModel createReviewViewModel = this.viewModel;
        if (createReviewViewModel != null) {
            return createReviewViewModel;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        getCameraHelper().mo30479f(i, i2, intent);
    }

    public void onBackPressed() {
        List<ReviewFlowRatingControl> list;
        if (getSupportFragmentManager().mo10355E() > 0) {
            getSupportFragmentManager().mo10364Q();
            return;
        }
        CreateReviewViewModel viewModel2 = getViewModel();
        boolean z = true;
        if (C19383o.m32792b(viewModel2.f25919K, Boolean.TRUE)) {
            C11700a aVar = (C11700a) viewModel2.f25941s.getValue();
            if (aVar != null) {
                viewModel2.mo37851j(aVar.f26044c);
            }
            C8585b bVar = viewModel2.f25916H;
            if (bVar != null) {
                Future future = (Future) bVar.f18683c.f38540d.get(bVar.f18684d);
                if (future != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                    return;
                }
                return;
            }
            return;
        }
        C11719r value = viewModel2.f25930h.getValue();
        if (!(value instanceof C11719r.C11738s)) {
            z = value instanceof C11719r.C11739t;
        }
        if (z) {
            ReviewCard f = viewModel2.mo37848f();
            ReviewFlowTextFieldControl reviewFlowTextFieldControl = f != null ? f.f25969k : null;
            if (reviewFlowTextFieldControl != null) {
                reviewFlowTextFieldControl.f26025c = "";
            }
            ReviewCard f2 = viewModel2.mo37848f();
            if (!(f2 == null || (list = f2.f25967i) == null)) {
                for (ReviewFlowRatingControl reviewFlowRatingControl : list) {
                    ReviewFlowSubratingControl reviewFlowSubratingControl = reviewFlowRatingControl.f26014c;
                    if (reviewFlowSubratingControl != null) {
                        reviewFlowSubratingControl.f26022a = 0;
                    }
                }
            }
            viewModel2.mo37854m();
        } else if (value instanceof C11719r.C11740u) {
            viewModel2.mo37854m();
        } else if (value instanceof C11719r.C11734o) {
            viewModel2.mo37854m();
        } else {
            viewModel2.mo37844b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132018137);
        setContentView((int) R.layout.activity_create_review);
        this.emptyStateView = (CollageEmptyStateView) findViewById(R.id.review_empty_state_view);
        this.backButton = (MaterialButton) findViewById(R.id.back_button);
        this.forwardButton = (Button) findViewById(R.id.forward_button);
        this.subratingAlert = (CollageAlert) findViewById(R.id.subrating_alert);
        MaterialButton materialButton = this.backButton;
        if (materialButton != null) {
            ViewExtensions.m12866j(materialButton, new CreateReviewActivity$onCreate$1(this));
        }
        setCameraHelper(new C8886e(getApplicationContext(), bundle, getViewModel()));
        View findViewById = findViewById(R.id.create_review_photo_upload);
        C19383o.m32796f(findViewById, "findViewById(R.id.create_review_photo_upload)");
        this.photoUploadView = findViewById;
        View findViewById2 = findViewById(R.id.create_review_photo_upload_low_rating);
        C19383o.m32796f(findViewById2, "findViewById(R.id.create…_photo_upload_low_rating)");
        this.photoUploadLowRatingView = findViewById2;
        View findViewById3 = findViewById(R.id.create_review_photo_upload_high_rating);
        C19383o.m32796f(findViewById3, "findViewById(R.id.create…photo_upload_high_rating)");
        this.photoUploadHighRatingView = findViewById3;
        ((ScrollView) findViewById(R.id.scroll_view)).setOnScrollChangeListener(new C11708g((MaterialCardView) findViewById(R.id.toolbar), getResources().getDimensionPixelSize(R.dimen.app_bar_elevation)));
        ReviewTrackingSource reviewTrackingSource = null;
        if (getConfigMap().mo21132b(C8592b.C8595c.f18860d)) {
            Bundle extras = getIntent().getExtras();
            Serializable serializable = extras != null ? extras.getSerializable("transaction_ids") : null;
            List list = serializable instanceof List ? (List) serializable : null;
            if (list != null) {
                CreateReviewViewModel viewModel2 = getViewModel();
                Integer presetOverallRatingExtra = getPresetOverallRatingExtra();
                viewModel2.getClass();
                viewModel2.f25947y.addAll(list);
                viewModel2.mo37850i(presetOverallRatingExtra, ((EtsyId) viewModel2.f25947y.get(0)).getId(), false);
            } else {
                Bundle extras2 = getIntent().getExtras();
                Serializable serializable2 = extras2 != null ? extras2.getSerializable(ResponseConstants.TRANSACTION_ID) : null;
                EtsyId etsyId = serializable2 instanceof EtsyId ? (EtsyId) serializable2 : null;
                if (etsyId != null) {
                    getViewModel().mo37850i(getPresetOverallRatingExtra(), etsyId.getId(), false);
                }
            }
        } else {
            Bundle extras3 = getIntent().getExtras();
            Serializable serializable3 = extras3 != null ? extras3.getSerializable(ResponseConstants.TRANSACTION_ID) : null;
            EtsyId etsyId2 = serializable3 instanceof EtsyId ? (EtsyId) serializable3 : null;
            if (etsyId2 != null) {
                getViewModel().mo37850i(getPresetOverallRatingExtra(), etsyId2.getId(), false);
            }
        }
        getViewModel().f25945w.observe(this, new C12061r(new CreateReviewActivity$onCreate$6(this)));
        CreateReviewViewModel viewModel3 = getViewModel();
        Bundle extras4 = getIntent().getExtras();
        Object serializable4 = extras4 != null ? extras4.getSerializable("source") : null;
        if (serializable4 instanceof ReviewTrackingSource) {
            reviewTrackingSource = (ReviewTrackingSource) serializable4;
        }
        viewModel3.f25948z = reviewTrackingSource;
        getViewModel().f25931i.observe(this, new C9580d(this, 1));
        getViewModel().f25933k.observe(this, new C11709h(this, 0));
        getViewModel().f25935m.observe(this, new C6456a(this, 5));
        getViewModel().f25937o.observe(this, new C12061r(new CreateReviewActivity$onCreate$10(this)));
        getViewModel().f25939q.observe(this, new C6457b(this, 4));
        getViewModel().f25941s.observe(this, new C10077j(this, 2));
        getViewModel().f25943u.observe(this, new C9498g(this, 5));
        this.reviewsFileManager = new C11701a0(this, getFileSupport(), getGrafana());
    }

    public void onDestroy() {
        super.onDestroy();
        this.emptyStateView = null;
        this.stepIndicatorView = null;
    }

    public final void setCameraHelper(C8886e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.cameraHelper = eVar;
    }

    public final void setFileSupport(C13895a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.fileSupport = aVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setResourceProvider(C11786n nVar) {
        C19383o.m32797g(nVar, "<set-?>");
        this.resourceProvider = nVar;
    }

    public final void setSharedPreferenceProvider(C13943a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.sharedPreferenceProvider = aVar;
    }

    public final void setTransformationUtil(C8585b bVar) {
        this.transformationUtil = bVar;
    }

    public final void setViewModel(CreateReviewViewModel createReviewViewModel) {
        C19383o.m32797g(createReviewViewModel, "<set-?>");
        this.viewModel = createReviewViewModel;
    }
}
