package com.etsy.android.p327ui.user.review;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Transaction;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.AppreciationVideo;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.util.C12059p;
import com.etsy.android.util.C12060q;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;
import okhttp3.C20002r;
import okhttp3.C20004s;
import okhttp3.C20013v;
import okhttp3.C20016y;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p324cf.C8585b;
import p425q9.C13265p;
import p456ua.C13461f;
import p496za.C13943a;
import p514bk.C14088a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel */
public final class CreateReviewViewModel extends C2866i0 implements C8886e.C8888b {

    /* renamed from: A */
    public boolean f25909A;

    /* renamed from: B */
    public boolean f25910B;

    /* renamed from: C */
    public final Regex f25911C = new Regex("\\s+");

    /* renamed from: D */
    public File f25912D;

    /* renamed from: E */
    public Uri f25913E;

    /* renamed from: F */
    public File f25914F;

    /* renamed from: G */
    public Uri f25915G;

    /* renamed from: H */
    public C8585b f25916H;

    /* renamed from: I */
    public Transaction f25917I;

    /* renamed from: J */
    public final C7091a f25918J = new C7091a();

    /* renamed from: K */
    public Boolean f25919K;

    /* renamed from: L */
    public int f25920L = 30;

    /* renamed from: M */
    public C11719r.C11734o f25921M;

    /* renamed from: N */
    public C11719r.C11743x f25922N;

    /* renamed from: O */
    public MediaUploadAction f25923O = MediaUploadAction.TAKE_PHOTO;

    /* renamed from: b */
    public final C11715n f25924b;

    /* renamed from: c */
    public final C13461f f25925c;

    /* renamed from: d */
    public final C8703p f25926d;

    /* renamed from: e */
    public final C13265p f25927e;

    /* renamed from: f */
    public final C11786n f25928f;

    /* renamed from: g */
    public final C13943a f25929g;

    /* renamed from: h */
    public final C2895z<C11719r> f25930h;

    /* renamed from: i */
    public final C2895z f25931i;

    /* renamed from: j */
    public final C2895z<Boolean> f25932j;

    /* renamed from: k */
    public final C2895z f25933k;

    /* renamed from: l */
    public final C2895z<Alert> f25934l;

    /* renamed from: m */
    public final C2895z f25935m;

    /* renamed from: n */
    public final C2895z<C12059p<AlertData>> f25936n;

    /* renamed from: o */
    public final C2895z f25937o;

    /* renamed from: p */
    public final C2895z<C11744s> f25938p;

    /* renamed from: q */
    public final C2895z f25939q;

    /* renamed from: r */
    public final C2895z<C11700a> f25940r;

    /* renamed from: s */
    public final C2895z f25941s;

    /* renamed from: t */
    public final C2895z<C11745t> f25942t;

    /* renamed from: u */
    public final C2895z f25943u;

    /* renamed from: v */
    public final C2895z<C12059p<String>> f25944v;

    /* renamed from: w */
    public final C2895z f25945w;

    /* renamed from: x */
    public ReviewFlow f25946x;

    /* renamed from: y */
    public final ArrayList f25947y = new ArrayList();

    /* renamed from: z */
    public ReviewTrackingSource f25948z;

    /* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$a */
    public /* synthetic */ class C11692a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25949a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f25950b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f25951c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f25952d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f25953e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f25954f;

        static {
            int[] iArr = new int[NavigationAction.values().length];
            iArr[NavigationAction.NEXT.ordinal()] = 1;
            iArr[NavigationAction.SUBMIT.ordinal()] = 2;
            iArr[NavigationAction.SKIP.ordinal()] = 3;
            iArr[NavigationAction.BACK.ordinal()] = 4;
            f25949a = iArr;
            int[] iArr2 = new int[ReviewScreen.values().length];
            iArr2[ReviewScreen.OVERALL.ordinal()] = 1;
            iArr2[ReviewScreen.SUBRATINGS.ordinal()] = 2;
            iArr2[ReviewScreen.PHOTO.ordinal()] = 3;
            iArr2[ReviewScreen.VIDEO.ordinal()] = 4;
            f25950b = iArr2;
            int[] iArr3 = new int[ReviewFlowNavigationOptionType.values().length];
            iArr3[ReviewFlowNavigationOptionType.TAKE_PHOTO.ordinal()] = 1;
            iArr3[ReviewFlowNavigationOptionType.SELECT_PHOTO.ordinal()] = 2;
            iArr3[ReviewFlowNavigationOptionType.TAKE_VIDEO.ordinal()] = 3;
            iArr3[ReviewFlowNavigationOptionType.SELECT_VIDEO.ordinal()] = 4;
            iArr3[ReviewFlowNavigationOptionType.REMOVE_VIDEO.ordinal()] = 5;
            iArr3[ReviewFlowNavigationOptionType.REMOVE_PHOTO.ordinal()] = 6;
            iArr3[ReviewFlowNavigationOptionType.EDIT_PHOTO.ordinal()] = 7;
            iArr3[ReviewFlowNavigationOptionType.CLOSE.ordinal()] = 8;
            iArr3[ReviewFlowNavigationOptionType.SUBMIT.ordinal()] = 9;
            iArr3[ReviewFlowNavigationOptionType.EDIT_VIDEO.ordinal()] = 10;
            f25951c = iArr3;
            int[] iArr4 = new int[ReviewCardTypeId.values().length];
            iArr4[ReviewCardTypeId.PHOTO_UPLOAD.ordinal()] = 1;
            iArr4[ReviewCardTypeId.PHOTO_UPLOAD_LOW_RATING.ordinal()] = 2;
            iArr4[ReviewCardTypeId.PHOTO_UPLOAD_WITH_ICONS.ordinal()] = 3;
            f25952d = iArr4;
            int[] iArr5 = new int[RatingType.values().length];
            iArr5[RatingType.HIGH.ordinal()] = 1;
            iArr5[RatingType.LOW.ordinal()] = 2;
            f25953e = iArr5;
            int[] iArr6 = new int[MediaUploadAction.values().length];
            iArr6[MediaUploadAction.TAKE_PHOTO.ordinal()] = 1;
            iArr6[MediaUploadAction.SELECT_PHOTO.ordinal()] = 2;
            f25954f = iArr6;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$b */
    public static final class C11693b implements ITrackedObject {
        @JsonIgnore
        public final List<C8696j> getOnSeenTrackingEvents() {
            return new ArrayList();
        }

        @JsonIgnore
        public final int getTrackedPosition() {
            return 0;
        }

        public final String getTrackingName() {
            return "review_card_subrating_review_navigate_back";
        }

        @JsonIgnore
        public final Map<AnalyticsProperty, Object> getTrackingParameters() {
            return null;
        }

        @JsonIgnore
        public final void setOnSeenTrackingEvents(List<C8696j> list) {
            C19383o.m32797g(list, "onSeenTrackingEvents");
        }

        @JsonIgnore
        public final void setTrackedPosition(int i) {
        }

        public final void setTrackingName(String str) {
        }

        @JsonIgnore
        public final void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        }
    }

    public CreateReviewViewModel(C11715n nVar, C13461f fVar, C8703p pVar, C13265p pVar2, C11786n nVar2, C13943a aVar) {
        C19383o.m32797g(pVar2, "session");
        C19383o.m32797g(aVar, "sharedPreferencesProvider");
        this.f25924b = nVar;
        this.f25925c = fVar;
        this.f25926d = pVar;
        this.f25927e = pVar2;
        this.f25928f = nVar2;
        this.f25929g = aVar;
        C2895z<C11719r> zVar = new C2895z<>();
        this.f25930h = zVar;
        this.f25931i = zVar;
        C2895z<Boolean> zVar2 = new C2895z<>();
        this.f25932j = zVar2;
        this.f25933k = zVar2;
        C2895z<Alert> zVar3 = new C2895z<>();
        this.f25934l = zVar3;
        this.f25935m = zVar3;
        C2895z<C12059p<AlertData>> zVar4 = new C2895z<>();
        this.f25936n = zVar4;
        this.f25937o = zVar4;
        C2895z<C11744s> zVar5 = new C2895z<>();
        this.f25938p = zVar5;
        this.f25939q = zVar5;
        C2895z<C11700a> zVar6 = new C2895z<>();
        this.f25940r = zVar6;
        this.f25941s = zVar6;
        C2895z<C11745t> zVar7 = new C2895z<>();
        this.f25942t = zVar7;
        this.f25943u = zVar7;
        C2895z<C12059p<String>> zVar8 = new C2895z<>();
        this.f25944v = zVar8;
        this.f25945w = zVar8;
    }

    /* renamed from: h */
    public static boolean m19413h(ReviewCard reviewCard) {
        Iterable iterable;
        ArrayList arrayList;
        boolean z;
        String str;
        boolean z2;
        Integer num;
        if (reviewCard == null) {
            return false;
        }
        ReviewFlowCheckboxControl reviewFlowCheckboxControl = reviewCard.f25968j;
        if (reviewFlowCheckboxControl == null || (iterable = reviewFlowCheckboxControl.f25990b) == null) {
            iterable = EmptyList.INSTANCE;
        }
        if (reviewFlowCheckboxControl != null ? reviewFlowCheckboxControl.f25991c : false) {
            List<ReviewFlowRatingControl> list = reviewCard.f25967i;
            ArrayList arrayList2 = new ArrayList();
            for (T next : list) {
                if (!C19327t.m32634P0(((ReviewFlowRatingControl) next).f26013b, iterable)) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = reviewCard.f25967i;
        }
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ReviewFlowSubratingControl reviewFlowSubratingControl = ((ReviewFlowRatingControl) it.next()).f26014c;
                if (((reviewFlowSubratingControl == null || (num = reviewFlowSubratingControl.f26022a) == null) ? 0 : num.intValue()) != 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ReviewFlowTextFieldControl reviewFlowTextFieldControl = reviewCard.f25969k;
        return z || ((reviewFlowTextFieldControl == null || (str = reviewFlowTextFieldControl.f26025c) == null) ? false : C18263b.m30839d0(str));
    }

    /* renamed from: s */
    public static void m19414s(CreateReviewViewModel createReviewViewModel, Bitmap bitmap, File file, String str, int i) {
        C19394m mVar;
        Pair pair;
        Bitmap bitmap2 = (i & 1) != 0 ? null : bitmap;
        if ((i & 2) != 0) {
            file = null;
        }
        String str2 = (i & 4) != 0 ? null : str;
        ReviewFlow reviewFlow = createReviewViewModel.f25946x;
        if (reviewFlow != null) {
            Integer num = reviewFlow.f25980a.f26037c;
            ReviewCard e = createReviewViewModel.mo37847e(num != null ? num.intValue() : 0);
            if (e != null) {
                String str3 = "";
                String str4 = str3;
                ReviewFlowNavigationOption reviewFlowNavigationOption = null;
                ReviewFlowNavigationOption reviewFlowNavigationOption2 = null;
                ReviewFlowNavigationOption.C11699a aVar = null;
                for (ReviewFlowNavigationOption reviewFlowNavigationOption3 : e.f25962d) {
                    int i2 = C11692a.f25951c[reviewFlowNavigationOption3.f25998a.ordinal()];
                    if (i2 == 1) {
                        str3 = reviewFlowNavigationOption3.f26004g;
                        if (str3 == null) {
                            str3 = "";
                        }
                    } else if (i2 == 7) {
                        str4 = reviewFlowNavigationOption3.f25999b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        aVar = reviewFlowNavigationOption3.f26007j;
                    } else if (i2 == 8) {
                        reviewFlowNavigationOption2 = reviewFlowNavigationOption3;
                    } else if (i2 == 9) {
                        reviewFlowNavigationOption = reviewFlowNavigationOption3;
                    }
                }
                if (reviewFlowNavigationOption != null) {
                    pair = new Pair(reviewFlowNavigationOption.f25999b, reviewFlowNavigationOption.f26007j);
                } else {
                    pair = new Pair(reviewFlowNavigationOption2 != null ? reviewFlowNavigationOption2.f25999b : null, reviewFlowNavigationOption2 != null ? reviewFlowNavigationOption2.f26007j : null);
                }
                String str5 = (String) pair.component1();
                createReviewViewModel.f25912D = file;
                C11719r.C11734o oVar = new C11719r.C11734o(str3, str4, aVar, (ITrackedObject) pair.component2(), bitmap2, str2, 128);
                createReviewViewModel.f25921M = oVar;
                createReviewViewModel.f25930h.postValue(oVar);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                createReviewViewModel.mo37857p(ReviewScreen.PHOTO);
            }
            createReviewViewModel.f25926d.mo21333d("review_form_upload_photo", (Map<? extends AnalyticsProperty, Object>) null);
            return;
        }
        C19383o.m32805o("reviewFlowModel");
        throw null;
    }

    /* renamed from: v */
    public static void m19415v(CreateReviewViewModel createReviewViewModel, Uri uri, String str, int i) {
        C19394m mVar;
        Pair pair;
        Uri uri2 = (i & 1) != 0 ? null : uri;
        String str2 = (i & 2) != 0 ? null : str;
        ReviewFlow reviewFlow = createReviewViewModel.f25946x;
        if (reviewFlow != null) {
            Integer num = reviewFlow.f25980a.f26037c;
            ReviewCard e = createReviewViewModel.mo37847e(num != null ? num.intValue() : 0);
            if (e != null) {
                String str3 = "";
                String str4 = str3;
                ReviewFlowNavigationOption reviewFlowNavigationOption = null;
                ReviewFlowNavigationOption reviewFlowNavigationOption2 = null;
                ReviewFlowNavigationOption.C11699a aVar = null;
                for (ReviewFlowNavigationOption reviewFlowNavigationOption3 : e.f25962d) {
                    int i2 = C11692a.f25951c[reviewFlowNavigationOption3.f25998a.ordinal()];
                    if (i2 != 3) {
                        switch (i2) {
                            case 8:
                                reviewFlowNavigationOption2 = reviewFlowNavigationOption3;
                                break;
                            case 9:
                                reviewFlowNavigationOption = reviewFlowNavigationOption3;
                                break;
                            case 10:
                                str4 = reviewFlowNavigationOption3.f25999b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                aVar = reviewFlowNavigationOption3.f26007j;
                                break;
                        }
                    } else {
                        str3 = reviewFlowNavigationOption3.f26004g;
                        if (str3 == null) {
                            str3 = "";
                        }
                    }
                }
                if (reviewFlowNavigationOption != null) {
                    pair = new Pair(reviewFlowNavigationOption.f25999b, reviewFlowNavigationOption.f26007j);
                } else {
                    pair = new Pair(reviewFlowNavigationOption2 != null ? reviewFlowNavigationOption2.f25999b : null, reviewFlowNavigationOption2 != null ? reviewFlowNavigationOption2.f26007j : null);
                }
                createReviewViewModel.f25913E = uri2;
                C11719r.C11743x xVar = new C11719r.C11743x(str3, str4, aVar, (String) pair.component1(), (ITrackedObject) pair.component2(), uri2, str2, 128);
                createReviewViewModel.f25922N = xVar;
                createReviewViewModel.f25930h.postValue(xVar);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                createReviewViewModel.mo37857p(ReviewScreen.VIDEO);
            }
            createReviewViewModel.f25926d.mo21333d("review_form_upload_video", (Map<? extends AnalyticsProperty, Object>) null);
            return;
        }
        C19383o.m32805o("reviewFlowModel");
        throw null;
    }

    /* renamed from: b */
    public final void mo37844b() {
        C2895z<C11719r> zVar = this.f25930h;
        Transaction transaction = this.f25917I;
        zVar.setValue(new C11719r.C11727h(transaction == null ? 412 : 411, transaction));
    }

    /* renamed from: c */
    public final String mo37845c(String str, Throwable th) {
        return th instanceof IOException ? this.f25928f.mo38059c(R.string.network_unavailable, new Object[0]) : str == null ? this.f25928f.mo38059c(R.string.whoops_somethings_wrong, new Object[0]) : str;
    }

    /* renamed from: d */
    public final ReviewCard mo37846d() {
        try {
            ReviewFlow reviewFlow = this.f25946x;
            if (reviewFlow != null) {
                return reviewFlow.f25981b.get(0);
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final ReviewCard mo37847e(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        r6 = null;
        if (C19383o.m32792b(this.f25919K, Boolean.TRUE)) {
            if (i >= 4) {
                ReviewFlow reviewFlow = this.f25946x;
                if (reviewFlow != null) {
                    for (ReviewCard reviewCard : reviewFlow.f25981b) {
                        if (reviewCard.f25961c == ReviewCardTypeId.PHOTO_UPLOAD_WITH_ICONS.getId()) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                C19383o.m32805o("reviewFlowModel");
                throw null;
            }
            ReviewFlow reviewFlow2 = this.f25946x;
            if (reviewFlow2 != null) {
                for (ReviewCard reviewCard2 : reviewFlow2.f25981b) {
                    if (reviewCard2.f25961c == ReviewCardTypeId.PHOTO_UPLOAD_LOW_RATING.getId()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        } else if (i < 4) {
            return reviewCard2;
        } else {
            ReviewFlow reviewFlow3 = this.f25946x;
            if (reviewFlow3 != null) {
                for (ReviewCard reviewCard22 : reviewFlow3.f25981b) {
                    if (reviewCard22.f25961c == ReviewCardTypeId.PHOTO_UPLOAD.getId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        }
        return reviewCard22;
    }

    /* renamed from: f */
    public final ReviewCard mo37848f() {
        try {
            ReviewFlow reviewFlow = this.f25946x;
            if (reviewFlow != null) {
                return reviewFlow.f25981b.get(1);
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final C11744s mo37849g(ReviewCard reviewCard) {
        C11744s sVar;
        ReviewFlowNavigationOption reviewFlowNavigationOption;
        List<ReviewFlowNavigationOption> list;
        T t;
        boolean z;
        ReviewFlowNavigationOption reviewFlowNavigationOption2;
        List<ReviewFlowNavigationOption> list2;
        T t2;
        boolean z2;
        ReviewFlowNavigationOption.C11699a aVar = null;
        if (!m19413h(reviewCard)) {
            ReviewFlow reviewFlow = this.f25946x;
            if (reviewFlow != null) {
                Integer num = reviewFlow.f25980a.f26037c;
                if ((num != null ? num.intValue() : 0) == 5 || !C19383o.m32792b(this.f25919K, Boolean.FALSE)) {
                    ReviewFlowNavigationOption q = C14088a.m21788q(reviewCard.f25962d);
                    if (q == null || (list2 = q.f26003f) == null) {
                        reviewFlowNavigationOption2 = null;
                    } else {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            if (((ReviewFlowNavigationOption) t2).f25998a == ReviewFlowNavigationOptionType.NO_RATINGS) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                        reviewFlowNavigationOption2 = (ReviewFlowNavigationOption) t2;
                    }
                    String str = reviewFlowNavigationOption2 != null ? reviewFlowNavigationOption2.f25999b : null;
                    if (reviewFlowNavigationOption2 != null) {
                        aVar = reviewFlowNavigationOption2.f26007j;
                    }
                    sVar = new C11744s(str, aVar, NavigationAction.SKIP);
                    return sVar;
                }
            } else {
                C19383o.m32805o("reviewFlowModel");
                throw null;
            }
        }
        ReviewFlowNavigationOption q2 = C14088a.m21788q(reviewCard.f25962d);
        if (q2 == null || (list = q2.f26003f) == null) {
            reviewFlowNavigationOption = null;
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                if (((ReviewFlowNavigationOption) t).f25998a == ReviewFlowNavigationOptionType.NEXT) {
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
            reviewFlowNavigationOption = (ReviewFlowNavigationOption) t;
        }
        String str2 = reviewFlowNavigationOption != null ? reviewFlowNavigationOption.f25999b : null;
        if (reviewFlowNavigationOption != null) {
            aVar = reviewFlowNavigationOption.f26007j;
        }
        sVar = new C11744s(str2, aVar, NavigationAction.NEXT);
        return sVar;
    }

    /* renamed from: i */
    public final void mo37850i(Integer num, String str, boolean z) {
        C19383o.m32797g(str, "transactionId");
        if (this.f25927e.mo45960e()) {
            this.f25930h.setValue(C11719r.C11729j.f26100b);
            C11715n nVar = this.f25924b;
            nVar.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f25925c, C0072d.m199f(this.f25925c, nVar.f26065a.mo37977c(str))), new CreateReviewViewModel$loadReviewFlow$1(this, str, num, z), new CreateReviewViewModel$loadReviewFlow$2(this, str, num, z));
            C7091a aVar = this.f25918J;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
            return;
        }
        C12060q.m19871b(this.f25944v, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37851j(com.etsy.android.p327ui.user.review.NavigationAction r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "navigationAction"
            r2 = r18
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            int[] r1 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25949a
            int r2 = r18.ordinal()
            r1 = r1[r2]
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = 1
            r6 = 2
            if (r1 == r5) goto L_0x008e
            if (r1 == r6) goto L_0x0089
            r7 = 4
            r8 = 3
            if (r1 == r8) goto L_0x0059
            if (r1 == r7) goto L_0x0022
            goto L_0x01cb
        L_0x0022:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r1 = r0.f25930h
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.user.review.r r1 = (com.etsy.android.p327ui.user.review.C11719r) r1
            if (r1 == 0) goto L_0x002f
            com.etsy.android.ui.user.review.ReviewScreen r1 = r1.f26067a
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            if (r1 != 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            int[] r4 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25950b
            int r1 = r1.ordinal()
            r4 = r4[r1]
        L_0x003b:
            if (r4 == r5) goto L_0x0054
            if (r4 == r6) goto L_0x004f
            if (r4 == r8) goto L_0x004a
            if (r4 == r7) goto L_0x0045
            goto L_0x01cb
        L_0x0045:
            r0.mo37861u(r5)
            goto L_0x01cb
        L_0x004a:
            r0.mo37861u(r5)
            goto L_0x01cb
        L_0x004f:
            r0.mo37859r(r2, r3, r5)
            goto L_0x01cb
        L_0x0054:
            r17.mo37844b()
            goto L_0x01cb
        L_0x0059:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r1 = r0.f25930h
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.user.review.r r1 = (com.etsy.android.p327ui.user.review.C11719r) r1
            if (r1 == 0) goto L_0x0066
            com.etsy.android.ui.user.review.ReviewScreen r1 = r1.f26067a
            goto L_0x0067
        L_0x0066:
            r1 = r2
        L_0x0067:
            if (r1 != 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            int[] r3 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25950b
            int r1 = r1.ordinal()
            r4 = r3[r1]
        L_0x0072:
            if (r4 == r6) goto L_0x0084
            if (r4 == r8) goto L_0x007f
            if (r4 == r7) goto L_0x007a
            goto L_0x01cb
        L_0x007a:
            r0.mo37863x(r2)
            goto L_0x01cb
        L_0x007f:
            r0.mo37863x(r2)
            goto L_0x01cb
        L_0x0084:
            r17.mo37860t()
            goto L_0x01cb
        L_0x0089:
            r17.mo37854m()
            goto L_0x01cb
        L_0x008e:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r1 = r0.f25930h
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.user.review.r r1 = (com.etsy.android.p327ui.user.review.C11719r) r1
            if (r1 == 0) goto L_0x009b
            com.etsy.android.ui.user.review.ReviewScreen r1 = r1.f26067a
            goto L_0x009c
        L_0x009b:
            r1 = r2
        L_0x009c:
            if (r1 != 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            int[] r4 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25950b
            int r1 = r1.ordinal()
            r4 = r4[r1]
        L_0x00a7:
            if (r4 == r5) goto L_0x01c8
            if (r4 == r6) goto L_0x00ad
            goto L_0x01cb
        L_0x00ad:
            com.etsy.android.ui.user.review.ReviewCard r1 = r17.mo37848f()
            boolean r1 = m19413h(r1)
            if (r1 != 0) goto L_0x00e0
            com.etsy.android.ui.user.review.ReviewFlow r1 = r0.f25946x
            if (r1 == 0) goto L_0x00da
            com.etsy.android.ui.user.review.ReviewMetadata r1 = r1.f25980a
            java.lang.Integer r1 = r1.f26037c
            if (r1 == 0) goto L_0x00c6
            int r1 = r1.intValue()
            goto L_0x00c7
        L_0x00c6:
            r1 = r3
        L_0x00c7:
            r4 = 5
            if (r1 == r4) goto L_0x00d5
            java.lang.Boolean r1 = r0.f25919K
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r4)
            if (r1 == 0) goto L_0x00d5
            goto L_0x00e0
        L_0x00d5:
            r17.mo37853l()
            goto L_0x01cb
        L_0x00da:
            java.lang.String r1 = "reviewFlowModel"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x00e0:
            com.etsy.android.ui.user.review.ReviewCard r1 = r17.mo37848f()
            if (r1 == 0) goto L_0x00e9
            com.etsy.android.ui.user.review.ReviewFlowTextFieldControl r1 = r1.f25969k
            goto L_0x00ea
        L_0x00e9:
            r1 = r2
        L_0x00ea:
            if (r1 == 0) goto L_0x00ef
            java.lang.String r4 = r1.f26025c
            goto L_0x00f0
        L_0x00ef:
            r4 = r2
        L_0x00f0:
            if (r4 == 0) goto L_0x00fa
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00f9
            goto L_0x00fa
        L_0x00f9:
            r5 = r3
        L_0x00fa:
            if (r5 == 0) goto L_0x0184
            com.etsy.android.ui.user.review.ReviewCard r1 = r17.mo37848f()
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0171
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r1 = r1.f25962d
            if (r1 == 0) goto L_0x0171
            java.util.Iterator r1 = r1.iterator()
            r4 = r2
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0111:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0169
            java.lang.Object r9 = r1.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r9 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r9
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r10 = r9.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r11 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.CLOSE
            if (r10 != r11) goto L_0x0111
            com.etsy.android.ui.user.review.ReviewFlowPromptAction r5 = r9.f26002e
            if (r5 == 0) goto L_0x012b
            java.lang.String r6 = r5.f26009a
            if (r6 != 0) goto L_0x012c
        L_0x012b:
            r6 = r3
        L_0x012c:
            if (r5 == 0) goto L_0x0132
            java.lang.String r9 = r5.f26010b
            if (r9 != 0) goto L_0x0133
        L_0x0132:
            r9 = r3
        L_0x0133:
            if (r5 == 0) goto L_0x0167
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r5 = r5.f26011c
            if (r5 == 0) goto L_0x0167
            java.util.Iterator r5 = r5.iterator()
        L_0x013d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0167
            java.lang.Object r10 = r5.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r10 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r10
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r11 = r10.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r12 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.CANCEL
            if (r11 != r12) goto L_0x0159
            java.lang.String r2 = r10.f25999b
            if (r2 != 0) goto L_0x0155
            r7 = r3
            goto L_0x0156
        L_0x0155:
            r7 = r2
        L_0x0156:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r2 = r10.f26007j
            goto L_0x013d
        L_0x0159:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r12 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.CONFIRM
            if (r11 != r12) goto L_0x013d
            java.lang.String r4 = r10.f25999b
            if (r4 != 0) goto L_0x0163
            r8 = r3
            goto L_0x0164
        L_0x0163:
            r8 = r4
        L_0x0164:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r4 = r10.f26007j
            goto L_0x013d
        L_0x0167:
            r5 = r9
            goto L_0x0111
        L_0x0169:
            r16 = r2
            r15 = r4
            r12 = r5
            r11 = r6
            r13 = r7
            r14 = r8
            goto L_0x0178
        L_0x0171:
            r15 = r2
            r16 = r15
            r11 = r3
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0178:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r1 = r0.f25930h
            com.etsy.android.ui.user.review.r$r r2 = new com.etsy.android.ui.user.review.r$r
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.postValue(r2)
            goto L_0x01cb
        L_0x0184:
            if (r1 == 0) goto L_0x018e
            java.lang.Boolean r3 = r1.f26029g
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
        L_0x018e:
            if (r3 != 0) goto L_0x01c4
            if (r1 == 0) goto L_0x0195
            java.lang.Integer r3 = r1.f26027e
            goto L_0x0196
        L_0x0195:
            r3 = r2
        L_0x0196:
            if (r1 == 0) goto L_0x019a
            java.lang.String r2 = r1.f26025c
        L_0x019a:
            if (r3 == 0) goto L_0x01ac
            if (r2 == 0) goto L_0x01ac
            int r1 = r2.length()
            int r2 = r3.intValue()
            if (r1 <= r2) goto L_0x01ac
            r1 = 2131952457(0x7f130349, float:1.9541357E38)
            goto L_0x01af
        L_0x01ac:
            r1 = 2131952144(0x7f130210, float:1.9540722E38)
        L_0x01af:
            r5 = r1
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r1 = r0.f25930h
            com.etsy.android.ui.user.review.r$f r8 = new com.etsy.android.ui.user.review.r$f
            com.etsy.android.ui.user.review.ReviewScreen r3 = com.etsy.android.p327ui.user.review.ReviewScreen.SUBRATINGS
            r4 = 2131952140(0x7f13020c, float:1.9540714E38)
            r6 = 0
            r7 = 42
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.postValue(r8)
            goto L_0x01cb
        L_0x01c4:
            r17.mo37853l()
            goto L_0x01cb
        L_0x01c8:
            r17.mo37858q()
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewViewModel.mo37851j(com.etsy.android.ui.user.review.NavigationAction):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37852k() {
        /*
            r10 = this;
            com.etsy.android.ui.user.review.ReviewFlow r0 = r10.f25946x
            r1 = 0
            if (r0 == 0) goto L_0x0098
            com.etsy.android.ui.user.review.ReviewMetadata r0 = r0.f25980a
            java.lang.Integer r0 = r0.f26037c
            r2 = 0
            if (r0 == 0) goto L_0x0011
            int r0 = r0.intValue()
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            com.etsy.android.ui.user.review.ReviewCard r0 = r10.mo37847e(r0)
            if (r0 == 0) goto L_0x0090
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r0 = r0.f25962d
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = r0.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r3 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r3
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r4 = r3.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r5 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.TAKE_PHOTO
            r6 = 1
            if (r4 != r5) goto L_0x0033
            r4 = r6
            goto L_0x0034
        L_0x0033:
            r4 = r2
        L_0x0034:
            if (r4 == 0) goto L_0x001e
            com.etsy.android.ui.user.review.ReviewFlowPromptAction r0 = r3.f26002e
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0079
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r0 = r0.f26011c
            if (r0 == 0) goto L_0x0079
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
            r4 = r2
            r5 = r4
        L_0x0047:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0077
            java.lang.Object r7 = r0.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r7 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r7
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r8 = r7.f25998a
            int[] r9 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25951c
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r6) goto L_0x006d
            r9 = 2
            if (r8 == r9) goto L_0x0063
            goto L_0x0047
        L_0x0063:
            java.lang.String r3 = r7.f25999b
            if (r3 != 0) goto L_0x0069
            r5 = r2
            goto L_0x006a
        L_0x0069:
            r5 = r3
        L_0x006a:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r3 = r7.f26007j
            goto L_0x0047
        L_0x006d:
            java.lang.String r1 = r7.f25999b
            if (r1 != 0) goto L_0x0073
            r4 = r2
            goto L_0x0074
        L_0x0073:
            r4 = r1
        L_0x0074:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r1 = r7.f26007j
            goto L_0x0047
        L_0x0077:
            r2 = r4
            goto L_0x007b
        L_0x0079:
            r3 = r1
            r5 = r2
        L_0x007b:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r0 = r10.f25930h
            com.etsy.android.ui.user.review.r$a r4 = new com.etsy.android.ui.user.review.r$a
            r4.<init>(r2, r5, r1, r3)
            r0.postValue(r4)
            kotlin.m r1 = kotlin.C19394m.f43287a
            goto L_0x0090
        L_0x0088:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x0090:
            if (r1 != 0) goto L_0x0097
            com.etsy.android.ui.user.review.ReviewScreen r0 = com.etsy.android.p327ui.user.review.ReviewScreen.PHOTO
            r10.mo37857p(r0)
        L_0x0097:
            return
        L_0x0098:
            java.lang.String r0 = "reviewFlowModel"
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewViewModel.mo37852k():void");
    }

    /* renamed from: l */
    public final void mo37853l() {
        ReviewFlow reviewFlow = this.f25946x;
        if (reviewFlow != null) {
            Integer num = reviewFlow.f25980a.f26037c;
            if ((num != null ? num.intValue() : 0) == 5 || C19383o.m32792b(this.f25919K, Boolean.TRUE)) {
                mo37860t();
            } else {
                mo37854m();
            }
        } else {
            C19383o.m32805o("reviewFlowModel");
            throw null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5 A[Catch:{ Exception -> 0x0129, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37854m() {
        /*
            r25 = this;
            r1 = r25
            java.lang.Boolean r0 = r1.f25919K
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
            r2 = 0
            if (r0 == 0) goto L_0x024d
            android.net.Uri r3 = r1.f25915G
            if (r3 == 0) goto L_0x0249
            cf.a r4 = new cf.a
            androidx.lifecycle.z<com.etsy.android.ui.user.review.t> r0 = r1.f25942t
            r4.<init>(r0)
            cf.b r5 = r1.f25916H
            if (r5 == 0) goto L_0x0250
            com.etsy.android.ui.user.review.a0 r6 = r5.f18682b
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x006d
            ya.a r0 = r6.f26046b     // Catch:{ Exception -> 0x0053 }
            java.lang.String r9 = "compressed_etsy_video_"
            java.lang.String r10 = ".mp4"
            r0.getClass()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = p487ya.C13895a.m21419b(r9, r10)     // Catch:{ Exception -> 0x0053 }
            java.io.File r9 = r6.f26050f     // Catch:{ Exception -> 0x0053 }
            if (r9 == 0) goto L_0x0045
            boolean r9 = r9.exists()     // Catch:{ Exception -> 0x0053 }
            if (r9 != r8) goto L_0x003b
            r9 = r8
            goto L_0x003c
        L_0x003b:
            r9 = r7
        L_0x003c:
            if (r9 == 0) goto L_0x0045
            java.io.File r9 = r6.f26050f     // Catch:{ Exception -> 0x0053 }
            if (r9 == 0) goto L_0x0045
            r9.delete()     // Catch:{ Exception -> 0x0053 }
        L_0x0045:
            ya.a r9 = r6.f26046b     // Catch:{ Exception -> 0x0053 }
            androidx.appcompat.app.AppCompatActivity r10 = r6.f26045a     // Catch:{ Exception -> 0x0053 }
            r9.getClass()     // Catch:{ Exception -> 0x0053 }
            java.io.File r0 = p487ya.C13895a.m21418a(r10, r0)     // Catch:{ Exception -> 0x0053 }
            r6.f26050f = r0     // Catch:{ Exception -> 0x0053 }
            goto L_0x006e
        L_0x0053:
            r0 = move-exception
            r0.printStackTrace()
            fa.a r6 = r6.f26047c
            java.lang.String r9 = "video_reviews_compressed_file_creation_error."
            java.lang.StringBuilder r9 = android.support.p013v4.media.C0072d.m201h(r9)
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r6.mo45474a(r0)
        L_0x006d:
            r0 = r2
        L_0x006e:
            r5.f18685e = r0
            nj.b r6 = new nj.b
            r6.<init>()
            java.lang.String r9 = "frame-rate"
            android.media.MediaMetadataRetriever r10 = new android.media.MediaMetadataRetriever
            r10.<init>()
            android.content.Context r0 = r5.f18681a     // Catch:{ Exception -> 0x00a1 }
            r10.setDataSource(r0, r3)     // Catch:{ Exception -> 0x00a1 }
            r0 = 18
            java.lang.String r0 = r10.extractMetadata(r0)     // Catch:{ Exception -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00a1 }
            r11 = 19
            java.lang.String r11 = r10.extractMetadata(r11)     // Catch:{ Exception -> 0x00a1 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00a1 }
            kotlin.Pair r12 = new kotlin.Pair     // Catch:{ Exception -> 0x00a1 }
            r12.<init>(r0, r11)     // Catch:{ Exception -> 0x00a1 }
            r10.release()
            goto L_0x00a9
        L_0x009e:
            r0 = move-exception
            goto L_0x0245
        L_0x00a1:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x009e }
            r10.release()
            r12 = r2
        L_0x00a9:
            android.media.MediaFormat r10 = new android.media.MediaFormat
            r10.<init>()
            java.lang.String r11 = "mime"
            java.lang.String r0 = "video/avc"
            r10.setString(r11, r0)
            if (r12 == 0) goto L_0x00c2
            java.lang.Object r0 = r12.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00c4
        L_0x00c2:
            r0 = 1080(0x438, float:1.513E-42)
        L_0x00c4:
            java.lang.String r13 = "width"
            r10.setInteger(r13, r0)
            if (r12 == 0) goto L_0x00d6
            java.lang.Object r0 = r12.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00d8
        L_0x00d6:
            r0 = 1920(0x780, float:2.69E-42)
        L_0x00d8:
            java.lang.String r12 = "height"
            r10.setInteger(r12, r0)
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
            java.lang.String r12 = "bitrate"
            r10.setInteger(r12, r0)
            android.media.MediaExtractor r12 = new android.media.MediaExtractor
            r12.<init>()
            android.content.Context r0 = r5.f18681a     // Catch:{ Exception -> 0x0129 }
            r12.setDataSource(r0, r3, r2)     // Catch:{ Exception -> 0x0129 }
            int r0 = r12.getTrackCount()     // Catch:{ Exception -> 0x0129 }
            if (r0 < 0) goto L_0x012d
            r2 = r7
        L_0x00f6:
            android.media.MediaFormat r13 = r12.getTrackFormat(r2)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r14 = "extractor.getTrackFormat(i)"
            kotlin.jvm.internal.C19383o.m32796f(r13, r14)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r14 = r13.getString(r11)     // Catch:{ Exception -> 0x0129 }
            if (r14 == 0) goto L_0x010f
            java.lang.String r15 = "video/"
            boolean r14 = kotlin.text.C19457k.m33025c1(r14, r15, r7)     // Catch:{ Exception -> 0x0129 }
            if (r14 != r8) goto L_0x010f
            r14 = r8
            goto L_0x0110
        L_0x010f:
            r14 = r7
        L_0x0110:
            if (r14 == 0) goto L_0x0121
            boolean r14 = r13.containsKey(r9)     // Catch:{ Exception -> 0x0129 }
            if (r14 == 0) goto L_0x0121
            int r0 = r13.getInteger(r9)     // Catch:{ Exception -> 0x0129 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0129 }
            goto L_0x012e
        L_0x0121:
            if (r2 == r0) goto L_0x012d
            int r2 = r2 + 1
            goto L_0x00f6
        L_0x0126:
            r0 = move-exception
            goto L_0x0241
        L_0x0129:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0126 }
        L_0x012d:
            r0 = 0
        L_0x012e:
            r12.release()
            if (r0 == 0) goto L_0x0138
            int r0 = r0.intValue()
            goto L_0x013a
        L_0x0138:
            r0 = 30
        L_0x013a:
            r10.setInteger(r9, r0)
            r0 = 5
            java.lang.String r2 = "i-frame-interval"
            r10.setInteger(r2, r0)
            com.etsy.android.ui.user.review.a0 r0 = r5.f18682b
            if (r0 == 0) goto L_0x0250
            java.io.File r0 = r0.f26050f
            if (r0 == 0) goto L_0x0250
            eo.b r2 = r5.f18683c
            java.lang.String r5 = r5.f18684d
            java.lang.String r0 = r0.getPath()
            r2.getClass()
            java.io.File r9 = new java.io.File
            r9.<init>(r0)
            android.net.Uri r14 = android.net.Uri.fromFile(r9)
            jo.a r0 = new jo.a     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            android.content.Context r9 = r2.f38537a     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r0.<init>(r9, r3, r6)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            boolean r3 = r10.containsKey(r11)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r3 == 0) goto L_0x0186
            java.lang.String r3 = r10.getString(r11)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            java.lang.String r6 = "video/x-vnd.on2.vp9"
            boolean r3 = android.text.TextUtils.equals(r3, r6)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r3 != 0) goto L_0x0184
            java.lang.String r3 = r10.getString(r11)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            java.lang.String r6 = "video/x-vnd.on2.vp8"
            boolean r3 = android.text.TextUtils.equals(r3, r6)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r3 == 0) goto L_0x0186
        L_0x0184:
            r3 = r8
            goto L_0x0187
        L_0x0186:
            r3 = r7
        L_0x0187:
            jo.b r6 = new jo.b     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            android.content.Context r13 = r2.f38537a     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            int r15 = r0.mo69602e()     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            int r9 = r0.f39458c     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r3 == 0) goto L_0x0196
            r17 = r8
            goto L_0x0198
        L_0x0196:
            r17 = r7
        L_0x0198:
            r12 = r6
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            int r8 = r0.mo69602e()     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r9.<init>(r8)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
        L_0x01a7:
            if (r7 >= r8) goto L_0x0233
            android.media.MediaFormat r12 = r0.mo69606h(r7)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            boolean r13 = r12.containsKey(r11)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r13 == 0) goto L_0x01b8
            java.lang.String r13 = r12.getString(r11)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            goto L_0x01b9
        L_0x01b8:
            r13 = 0
        L_0x01b9:
            if (r13 != 0) goto L_0x01d4
            java.lang.String r12 = "b"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r13.<init>()     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            java.lang.String r14 = "Mime type is null for track "
            r13.append(r14)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r13.append(r7)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            java.lang.String r13 = r13.toString()     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            android.util.Log.e(r12, r13)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r24 = r8
            goto L_0x022d
        L_0x01d4:
            go.d r14 = new go.d     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r14.<init>()     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            go.e r15 = new go.e     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r15.<init>()     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r24 = r8
            java.lang.String r8 = "video"
            boolean r8 = r13.startsWith(r8)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r8 == 0) goto L_0x01ef
            lo.c r8 = new lo.c     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r8.<init>()     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r12 = r10
            goto L_0x0207
        L_0x01ef:
            java.lang.String r8 = "audio"
            boolean r8 = r13.startsWith(r8)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r8 == 0) goto L_0x0210
            lo.b r8 = new lo.b     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r13 = 0
            r8.<init>(r15, r13)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            if (r3 == 0) goto L_0x0202
            java.lang.String r13 = "audio/opus"
            goto L_0x0203
        L_0x0202:
            r13 = 0
        L_0x0203:
            android.media.MediaFormat r12 = p561eo.C17729b.m29729a(r12, r13)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
        L_0x0207:
            r18 = r8
            r21 = r12
            r17 = r14
            r19 = r15
            goto L_0x021c
        L_0x0210:
            r8 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = r8
            r18 = r12
            r19 = r13
            r21 = r14
        L_0x021c:
            eo.c r8 = new eo.c     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r15 = r8
            r16 = r0
            r20 = r6
            r22 = r7
            r23 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            r9.add(r8)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
        L_0x022d:
            int r7 = r7 + 1
            r8 = r24
            goto L_0x01a7
        L_0x0233:
            r0 = 100
            r2.mo68984b(r5, r9, r4, r0)     // Catch:{ MediaSourceException -> 0x023b, MediaTargetException -> 0x0239 }
            goto L_0x0250
        L_0x0239:
            r0 = move-exception
            goto L_0x023c
        L_0x023b:
            r0 = move-exception
        L_0x023c:
            r2 = 0
            r4.mo21090a(r5, r0, r2)
            goto L_0x0250
        L_0x0241:
            r12.release()
            throw r0
        L_0x0245:
            r10.release()
            throw r0
        L_0x0249:
            r1.mo37863x(r2)
            goto L_0x0250
        L_0x024d:
            r1.mo37863x(r2)
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewViewModel.mo37854m():void");
    }

    /* renamed from: n */
    public final void mo37855n(int i, String str) {
        List<ReviewFlowRatingControl> list;
        T t;
        ReviewCard f = mo37848f();
        ReviewFlowSubratingControl reviewFlowSubratingControl = null;
        if (!(f == null || (list = f.f25967i) == null)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C19383o.m32792b(((ReviewFlowRatingControl) t).f26013b, str)) {
                    break;
                }
            }
            ReviewFlowRatingControl reviewFlowRatingControl = (ReviewFlowRatingControl) t;
            if (reviewFlowRatingControl != null) {
                reviewFlowSubratingControl = reviewFlowRatingControl.f26014c;
            }
        }
        if (reviewFlowSubratingControl != null) {
            reviewFlowSubratingControl.f26022a = Integer.valueOf(i);
        }
        ReviewCard f2 = mo37848f();
        if (f2 == null) {
            mo37857p(ReviewScreen.SUBRATINGS);
        } else {
            this.f25938p.postValue(mo37849g(f2));
        }
    }

    /* renamed from: o */
    public final boolean mo37856o() {
        ReviewFlow reviewFlow = this.f25946x;
        Alert alert = null;
        if (reviewFlow != null) {
            Integer num = reviewFlow.f25980a.f26037c;
            if ((num == null || num.intValue() == 0 || num.intValue() >= 4) ? false : true) {
                ReviewCard d = mo37846d();
                if (d != null) {
                    alert = d.f25963e;
                }
                if (alert != null) {
                    return true;
                }
            }
            return false;
        }
        C19383o.m32805o("reviewFlowModel");
        throw null;
    }

    public final void onCleared() {
        super.onCleared();
        this.f25918J.mo19405d();
        C8585b bVar = this.f25916H;
        if (bVar != null) {
            bVar.f18683c.f38538b.shutdownNow();
        }
    }

    public final void onImageSaveFail(Object obj, File file) {
        this.f25930h.postValue(new C11719r.C11725f(ReviewScreen.PHOTO, R.string.image_save_fail, R.string.camera_helper_image_load_error, false, 42));
    }

    public final void onImageSaveSuccess(Object obj, Bitmap bitmap, File file) {
        m19414s(this, bitmap, file, (String) null, 4);
    }

    public final void onNoAvailableActivities() {
        this.f25930h.postValue(new C11719r.C11725f(ReviewScreen.PHOTO, R.string.error_no_image_chooser_app_found, R.string.camera_helper_image_load_error, false, 42));
    }

    public final void onPermissionGranted() {
        int i = C11692a.f25954f[this.f25923O.ordinal()];
        if (i == 1) {
            this.f25930h.postValue(C11719r.C11722c.f26076b);
        } else if (i == 2) {
            this.f25930h.postValue(C11719r.C11736q.f26123b);
        }
    }

    public final Object onPreImageSave() {
        return C19394m.f43287a;
    }

    public final void onRequestCrop(Uri uri, Uri uri2) {
    }

    /* renamed from: p */
    public final void mo37857p(ReviewScreen reviewScreen) {
        String str;
        int i = C11692a.f25950b[reviewScreen.ordinal()];
        if (i == 1) {
            str = "review_overall_rating_card_missing";
        } else if (i == 2) {
            str = "review_subrating_card_missing";
        } else if (i == 3) {
            str = "review_photo_card_missing";
        } else if (i == 4) {
            str = "review_video_card_missing";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f25926d.mo21333d(str, (Map<? extends AnalyticsProperty, Object>) null);
        this.f25930h.postValue(new C11719r.C11725f(reviewScreen, R.string.error_loading_uhoh_footer, R.string.whoops_somethings_wrong, true, 10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37858q() {
        /*
            r5 = this;
            com.etsy.android.ui.user.review.ReviewCard r0 = r5.mo37846d()
            r1 = 0
            if (r0 == 0) goto L_0x0032
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r0 = r0.f25962d
            if (r0 == 0) goto L_0x0032
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r3 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r3
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r3 = r3.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r4 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.NEXT
            if (r3 != r4) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r3 == 0) goto L_0x000f
            goto L_0x0029
        L_0x0028:
            r2 = r1
        L_0x0029:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r2 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r2
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = r2.f26004g
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            androidx.lifecycle.z<com.etsy.android.lib.models.apiv3.Alert> r2 = r5.f25934l
            r2.postValue(r1)
            androidx.lifecycle.z<com.etsy.android.ui.user.review.s> r2 = r5.f25938p
            r2.postValue(r1)
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r1 = r5.f25930h
            com.etsy.android.ui.user.review.r$l r2 = new com.etsy.android.ui.user.review.r$l
            r2.<init>(r0)
            r1.postValue(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewViewModel.mo37858q():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r8 = r6.f26018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0138 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013d  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37859r(java.lang.Integer r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            r2 = 0
            java.lang.String r3 = "reviewFlowModel"
            if (r21 == 0) goto L_0x0034
            int r4 = r21.intValue()
            r5 = 3
            if (r4 <= r5) goto L_0x0023
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            com.etsy.android.ui.search.filters.b r3 = new com.etsy.android.ui.search.filters.b
            r3.<init>(r0, r4, r1)
            r4 = 200(0xc8, double:9.9E-322)
            r2.postDelayed(r3, r4)
            return
        L_0x0023:
            com.etsy.android.ui.user.review.ReviewFlow r5 = r0.f25946x
            if (r5 == 0) goto L_0x0030
            com.etsy.android.ui.user.review.ReviewMetadata r5 = r5.f25980a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.f26037c = r4
            goto L_0x0034
        L_0x0030:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r2
        L_0x0034:
            com.etsy.android.ui.user.review.ReviewCard r4 = r20.mo37846d()
            if (r4 != 0) goto L_0x0041
            com.etsy.android.ui.user.review.ReviewScreen r1 = com.etsy.android.p327ui.user.review.ReviewScreen.OVERALL
            r0.mo37857p(r1)
            goto L_0x0174
        L_0x0041:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r5 = r0.f25930h
            com.etsy.android.ui.user.review.ReviewFlowShopInfo r6 = r4.f25964f
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0050
            java.lang.String r8 = r6.f26018a
            if (r8 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r10 = r8
            goto L_0x0051
        L_0x0050:
            r10 = r7
        L_0x0051:
            com.etsy.android.ui.user.review.ReviewFlowListingInfo r8 = r4.f25965g
            if (r8 == 0) goto L_0x0059
            com.etsy.android.lib.models.apiv3.listing.ListingImage r9 = r8.f25997c
            r11 = r9
            goto L_0x005a
        L_0x0059:
            r11 = r2
        L_0x005a:
            if (r6 == 0) goto L_0x0063
            java.lang.String r6 = r6.f26021d
            if (r6 != 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r12 = r6
            goto L_0x0064
        L_0x0063:
            r12 = r7
        L_0x0064:
            if (r8 == 0) goto L_0x006d
            java.lang.String r6 = r8.f25995a
            if (r6 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r13 = r6
            goto L_0x006e
        L_0x006d:
            r13 = r7
        L_0x006e:
            if (r8 == 0) goto L_0x0077
            java.lang.String r6 = r8.f25996b
            if (r6 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r14 = r6
            goto L_0x0078
        L_0x0077:
            r14 = r7
        L_0x0078:
            com.etsy.android.ui.user.review.ReviewFlowRatingControl r6 = r4.f25966h
            if (r6 == 0) goto L_0x0083
            java.lang.String r6 = r6.f26012a
            if (r6 != 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r15 = r6
            goto L_0x0084
        L_0x0083:
            r15 = r7
        L_0x0084:
            com.etsy.android.ui.user.review.ReviewFlow r6 = r0.f25946x
            if (r6 == 0) goto L_0x0179
            com.etsy.android.ui.user.review.ReviewMetadata r6 = r6.f25980a
            java.lang.Integer r6 = r6.f26037c
            if (r6 == 0) goto L_0x0095
            int r6 = r6.intValue()
            r16 = r6
            goto L_0x0097
        L_0x0095:
            r16 = 0
        L_0x0097:
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r6 = r4.f25962d
            java.util.Iterator r6 = r6.iterator()
        L_0x009d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00b6
            java.lang.Object r8 = r6.next()
            r9 = r8
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r9 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r9
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r9 = r9.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r7 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.CLOSE
            if (r9 != r7) goto L_0x00b2
            r7 = r1
            goto L_0x00b3
        L_0x00b2:
            r7 = 0
        L_0x00b3:
            if (r7 == 0) goto L_0x009d
            goto L_0x00b7
        L_0x00b6:
            r8 = r2
        L_0x00b7:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r8 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r8
            if (r8 == 0) goto L_0x00c0
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r6 = r8.f26007j
            r17 = r6
            goto L_0x00c2
        L_0x00c0:
            r17 = r2
        L_0x00c2:
            com.etsy.android.lib.models.Transaction r6 = r0.f25917I
            if (r6 == 0) goto L_0x00c9
            r19 = r1
            goto L_0x00cb
        L_0x00c9:
            r19 = 0
        L_0x00cb:
            com.etsy.android.ui.user.review.r$k r6 = new com.etsy.android.ui.user.review.r$k
            r9 = r6
            r18 = r23
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5.postValue(r6)
            com.etsy.android.ui.user.review.ReviewFlow r5 = r0.f25946x
            if (r5 == 0) goto L_0x0175
            com.etsy.android.ui.user.review.ReviewMetadata r3 = r5.f25980a
            java.lang.Integer r3 = r3.f26037c
            if (r3 == 0) goto L_0x00ed
            int r3 = r3.intValue()
            if (r3 <= 0) goto L_0x00e8
            r3 = r1
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            if (r3 != r1) goto L_0x00ed
            r3 = r1
            goto L_0x00ee
        L_0x00ed:
            r3 = 0
        L_0x00ee:
            if (r3 == 0) goto L_0x010e
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r3 = r4.f25962d
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r3 = p514bk.C14088a.m21788q(r3)
            androidx.lifecycle.z<com.etsy.android.ui.user.review.s> r5 = r0.f25938p
            com.etsy.android.ui.user.review.s r6 = new com.etsy.android.ui.user.review.s
            if (r3 == 0) goto L_0x00ff
            java.lang.String r7 = r3.f25999b
            goto L_0x0100
        L_0x00ff:
            r7 = r2
        L_0x0100:
            if (r3 == 0) goto L_0x0105
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r3 = r3.f26007j
            goto L_0x0106
        L_0x0105:
            r3 = r2
        L_0x0106:
            com.etsy.android.ui.user.review.NavigationAction r8 = com.etsy.android.p327ui.user.review.NavigationAction.NEXT
            r6.<init>(r7, r3, r8)
            r5.postValue(r6)
        L_0x010e:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.a> r3 = r0.f25940r
            com.etsy.android.ui.user.review.a r5 = new com.etsy.android.ui.user.review.a
            com.etsy.android.ui.user.review.BackType r6 = com.etsy.android.p327ui.user.review.BackType.CLOSE
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r7 = r4.f25962d
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r7, r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x011f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0138
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r9 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r9
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r9 = r9.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r10 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.CLOSE
            if (r9 != r10) goto L_0x0134
            r9 = r1
            goto L_0x0135
        L_0x0134:
            r9 = 0
        L_0x0135:
            if (r9 == 0) goto L_0x011f
            goto L_0x0139
        L_0x0138:
            r8 = r2
        L_0x0139:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r8 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r8
            if (r8 == 0) goto L_0x0140
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r7 = r8.f26007j
            goto L_0x0141
        L_0x0140:
            r7 = r2
        L_0x0141:
            com.etsy.android.ui.user.review.NavigationAction r8 = com.etsy.android.p327ui.user.review.NavigationAction.BACK
            r5.<init>(r6, r7, r8)
            r3.postValue(r5)
            boolean r3 = r20.mo37856o()
            if (r3 == 0) goto L_0x0159
            androidx.lifecycle.z<com.etsy.android.lib.models.apiv3.Alert> r2 = r0.f25934l
            com.etsy.android.lib.models.apiv3.Alert r3 = r4.f25963e
            r2.postValue(r3)
            r0.f25909A = r1
            goto L_0x015e
        L_0x0159:
            androidx.lifecycle.z<com.etsy.android.lib.models.apiv3.Alert> r1 = r0.f25934l
            r1.postValue(r2)
        L_0x015e:
            if (r22 == 0) goto L_0x0174
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            androidx.compose.ui.platform.q r2 = new androidx.compose.ui.platform.q
            r3 = 4
            r2.<init>(r0, r3)
            r3 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r2, r3)
        L_0x0174:
            return
        L_0x0175:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r2
        L_0x0179:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewViewModel.mo37859r(java.lang.Integer, boolean, boolean):void");
    }

    /* renamed from: t */
    public final void mo37860t() {
        ReviewFlow reviewFlow = this.f25946x;
        ReviewCardTypeId reviewCardTypeId = null;
        if (reviewFlow != null) {
            Integer num = reviewFlow.f25980a.f26037c;
            ReviewCard e = mo37847e(num != null ? num.intValue() : 0);
            if (e != null) {
                reviewCardTypeId = e.mo37874a();
            }
            int i = reviewCardTypeId == null ? -1 : C11692a.f25952d[reviewCardTypeId.ordinal()];
            if (i == -1) {
                mo37857p(ReviewScreen.PHOTO);
            } else if (i == 1) {
                mo37864y(e, RatingType.HIGH);
            } else if (i == 2) {
                mo37864y(e, RatingType.LOW);
            } else if (i == 3) {
                mo37864y(e, RatingType.HIGH);
            }
        } else {
            C19383o.m32805o("reviewFlowModel");
            throw null;
        }
    }

    /* renamed from: u */
    public final void mo37861u(boolean z) {
        ReviewFlow reviewFlow = this.f25946x;
        if (reviewFlow != null) {
            Integer num = reviewFlow.f25980a.f26037c;
            ReviewCard f = mo37848f();
            if (f == null) {
                mo37857p(ReviewScreen.SUBRATINGS);
                return;
            }
            ReviewFlow reviewFlow2 = this.f25946x;
            if (reviewFlow2 != null) {
                for (ReviewFlowScenario reviewFlowScenario : reviewFlow2.f25980a.f26036b) {
                    if (C19327t.m32634P0(num, reviewFlowScenario.f26015a)) {
                        C2895z<C11719r> zVar = this.f25930h;
                        String str = reviewFlowScenario.f26017c;
                        if (str == null) {
                            str = "";
                        }
                        zVar.postValue(new C11719r.C11738s(str, f.f25967i, f.f25968j, f.f25969k, f.f25963e, z));
                        this.f25938p.postValue(mo37849g(f));
                        if (C19383o.m32792b(this.f25919K, Boolean.TRUE)) {
                            this.f25940r.postValue(new C11700a(BackType.BACK, new C11693b(), NavigationAction.BACK));
                        }
                    }
                }
                return;
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        }
        C19383o.m32805o("reviewFlowModel");
        throw null;
    }

    /* renamed from: w */
    public final void mo37862w(File file, String str) {
        C11719r value = this.f25930h.getValue();
        this.f25930h.postValue(C11719r.C11729j.f26100b);
        C11715n nVar = this.f25924b;
        nVar.getClass();
        C20004s.C20007c.C20008a aVar = C20004s.C20007c.f44276c;
        String name = file.getName();
        C20016y.C20017a aVar2 = C20016y.f44360a;
        C20002r.C20003a aVar3 = C20002r.f44260f;
        String e0 = C0114h.m300e0(file);
        if (e0 == null) {
            e0 = "mp4";
        }
        aVar3.getClass();
        C20002r b = C20002r.C20003a.m34244b(e0);
        aVar2.getClass();
        C20013v a = C20016y.C20017a.m34280a(file, b);
        aVar.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f25925c, C0072d.m199f(this.f25925c, nVar.f26065a.mo37976b(C11715n.m19447a(ResponseConstants.TRANSACTION_ID, str), C20004s.C20007c.C20008a.m34255c("video", name, a)))), new CreateReviewViewModel$submitAppreciationVideo$1(this, value), new CreateReviewViewModel$submitAppreciationVideo$2(this));
        C7091a aVar4 = this.f25918J;
        C19383o.m32798h(aVar4, "compositeDisposable");
        aVar4.mo19403b(e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bf  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37863x(java.lang.String r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r2 = r0.f25930h
            java.lang.Object r2 = r2.getValue()
            com.etsy.android.ui.user.review.r r2 = (com.etsy.android.p327ui.user.review.C11719r) r2
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r3 = r0.f25930h
            com.etsy.android.ui.user.review.r$j r4 = com.etsy.android.p327ui.user.review.C11719r.C11729j.f26100b
            r3.postValue(r4)
            com.etsy.android.ui.user.review.n r3 = r0.f25924b
            com.etsy.android.ui.user.review.ReviewFlow r4 = r0.f25946x
            if (r4 == 0) goto L_0x01cf
            com.etsy.android.ui.user.review.ReviewMetadata r4 = r4.f25980a
            java.lang.String r5 = r4.f26038d
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0022
            r5 = r6
        L_0x0022:
            java.lang.Integer r4 = r4.f26037c
            r7 = 0
            if (r4 == 0) goto L_0x002c
            int r4 = r4.intValue()
            goto L_0x002d
        L_0x002c:
            r4 = r7
        L_0x002d:
            com.etsy.android.ui.user.review.ReviewCard r8 = r21.mo37848f()
            if (r8 == 0) goto L_0x007e
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowRatingControl> r8 = r8.f25967i
            if (r8 == 0) goto L_0x007e
            int r9 = kotlin.collections.C19322o.m32624F0(r8)
            int r9 = kotlin.reflect.C19421p.m32930T(r9)
            r10 = 16
            if (r9 >= r10) goto L_0x0044
            r9 = r10
        L_0x0044:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x004d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x007f
            java.lang.Object r9 = r8.next()
            com.etsy.android.ui.user.review.ReviewFlowRatingControl r9 = (com.etsy.android.p327ui.user.review.ReviewFlowRatingControl) r9
            java.lang.String r11 = r9.f26013b
            com.etsy.android.ui.user.review.ReviewFlowSubratingControl r9 = r9.f26014c
            if (r9 == 0) goto L_0x0068
            java.lang.Integer r9 = r9.f26022a
            if (r9 == 0) goto L_0x0068
            int r9 = r9.intValue()
            goto L_0x0069
        L_0x0068:
            r9 = r7
        L_0x0069:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r11, r9)
            java.lang.Object r9 = r12.getFirst()
            java.lang.Object r11 = r12.getSecond()
            r10.put(r9, r11)
            goto L_0x004d
        L_0x007e:
            r10 = 0
        L_0x007f:
            com.etsy.android.ui.user.review.ReviewCard r8 = r21.mo37848f()
            if (r8 == 0) goto L_0x008f
            com.etsy.android.ui.user.review.ReviewFlowTextFieldControl r8 = r8.f25969k
            if (r8 == 0) goto L_0x008f
            java.lang.String r8 = r8.f26025c
            if (r8 != 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r6 = r8
        L_0x008f:
            java.io.File r8 = r0.f25912D
            r9 = 1
            if (r8 != 0) goto L_0x00a0
            com.etsy.android.ui.user.review.r$o r11 = r0.f25921M
            if (r11 == 0) goto L_0x009b
            java.lang.String r11 = r11.f26120g
            goto L_0x009c
        L_0x009b:
            r11 = 0
        L_0x009c:
            if (r11 != 0) goto L_0x00a0
            r11 = r9
            goto L_0x00a1
        L_0x00a0:
            r11 = r7
        L_0x00a1:
            java.io.File r12 = r0.f25914F
            if (r12 != 0) goto L_0x00b0
            com.etsy.android.ui.user.review.r$x r12 = r0.f25922N
            if (r12 == 0) goto L_0x00ac
            java.lang.String r12 = r12.f26173h
            goto L_0x00ad
        L_0x00ac:
            r12 = 0
        L_0x00ad:
            if (r12 != 0) goto L_0x00b0
            r7 = r9
        L_0x00b0:
            r3.getClass()
            if (r8 == 0) goto L_0x00df
            okhttp3.s$c$a r9 = okhttp3.C20004s.C20007c.f44276c
            java.lang.String r12 = r8.getName()
            okhttp3.y$a r13 = okhttp3.C20016y.f44360a
            okhttp3.r$a r14 = okhttp3.C20002r.f44260f
            java.lang.String r15 = androidx.activity.C0114h.m300e0(r8)
            if (r15 != 0) goto L_0x00c7
            java.lang.String r15 = "jpeg"
        L_0x00c7:
            r14.getClass()
            okhttp3.r r14 = okhttp3.C20002r.C20003a.m34244b(r15)
            r13.getClass()
            okhttp3.v r8 = okhttp3.C20016y.C20017a.m34280a(r8, r14)
            r9.getClass()
            java.lang.String r9 = "image"
            okhttp3.s$c r8 = okhttp3.C20004s.C20007c.C20008a.m34255c(r9, r12, r8)
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            r19 = r8
            com.etsy.android.ui.user.review.l r12 = r3.f26065a
            java.lang.String r8 = "transaction_id"
            okhttp3.s$c r13 = com.etsy.android.p327ui.user.review.C11715n.m19447a(r8, r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "rating"
            okhttp3.s$c r14 = com.etsy.android.p327ui.user.review.C11715n.m19447a(r5, r4)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            if (r10 == 0) goto L_0x0140
            java.util.Set r4 = r10.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0103:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            okhttp3.s$c$a r8 = okhttp3.C20004s.C20007c.f44276c
            java.lang.String r9 = "subratings["
            java.lang.StringBuilder r9 = android.support.p013v4.media.C0072d.m201h(r9)
            java.lang.Object r10 = r5.getKey()
            java.lang.String r10 = (java.lang.String) r10
            r16 = r4
            r4 = 93
            java.lang.String r4 = androidx.compose.animation.C0391c.m1057c(r9, r10, r4)
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r8.getClass()
            okhttp3.s$c r4 = okhttp3.C20004s.C20007c.C20008a.m34254b(r4, r5)
            r15.add(r4)
            r4 = r16
            goto L_0x0103
        L_0x0140:
            java.lang.String r4 = "review"
            okhttp3.s$c r16 = com.etsy.android.p327ui.user.review.C11715n.m19447a(r4, r6)
            java.lang.String r4 = "1"
            if (r11 == 0) goto L_0x0151
            java.lang.String r5 = "remove_image"
            okhttp3.s$c r5 = com.etsy.android.p327ui.user.review.C11715n.m19447a(r5, r4)
            goto L_0x0152
        L_0x0151:
            r5 = 0
        L_0x0152:
            r17 = r5
            if (r7 == 0) goto L_0x015d
            java.lang.String r5 = "remove_video"
            okhttp3.s$c r4 = com.etsy.android.p327ui.user.review.C11715n.m19447a(r5, r4)
            goto L_0x015e
        L_0x015d:
            r4 = 0
        L_0x015e:
            r18 = r4
            if (r1 == 0) goto L_0x0169
            java.lang.String r4 = "video_id"
            okhttp3.s$c r1 = com.etsy.android.p327ui.user.review.C11715n.m19447a(r4, r1)
            goto L_0x016a
        L_0x0169:
            r1 = 0
        L_0x016a:
            r20 = r1
            tp.s r1 = r12.mo37975a(r13, r14, r15, r16, r17, r18, r19, r20)
            bo.app.f7 r4 = new bo.app.f7
            r5 = 5
            r4.<init>(r3, r5)
            r1.getClass()
            io.reactivex.internal.operators.single.j r5 = new io.reactivex.internal.operators.single.j
            r5.<init>(r1, r4)
            com.etsy.android.lib.push.registration.l r1 = new com.etsy.android.lib.push.registration.l
            r4 = 4
            r1.<init>(r3, r4)
            io.reactivex.internal.operators.single.l r3 = new io.reactivex.internal.operators.single.l
            r3.<init>(r5, r1)
            ua.f r1 = r0.f25925c
            io.reactivex.internal.operators.single.SingleSubscribeOn r1 = androidx.compose.animation.C0472h.m1243e(r1, r3)
            ua.f r3 = r0.f25925c
            io.reactivex.internal.operators.single.SingleObserveOn r1 = androidx.compose.animation.C0391c.m1056b(r3, r1)
            com.etsy.android.ui.user.review.CreateReviewViewModel$submitReview$2 r3 = new com.etsy.android.ui.user.review.CreateReviewViewModel$submitReview$2
            r3.<init>(r0, r2)
            com.etsy.android.ui.user.review.CreateReviewViewModel$submitReview$3 r4 = new com.etsy.android.ui.user.review.CreateReviewViewModel$submitReview$3
            r4.<init>(r0, r2)
            io.reactivex.internal.observers.ConsumerSingleObserver r1 = p145io.reactivex.rxkotlin.SubscribersKt.m32500e(r1, r3, r4)
            io.reactivex.disposables.a r2 = r0.f25918J
            java.lang.String r3 = "compositeDisposable"
            kotlin.jvm.internal.C19383o.m32798h(r2, r3)
            r2.mo19403b(r1)
            com.etsy.android.lib.logger.p r1 = r0.f25926d
            com.etsy.android.lib.logger.DynamicAnalyticsProperty r2 = new com.etsy.android.lib.logger.DynamicAnalyticsProperty
            java.lang.String r3 = "source"
            r2.<init>(r3)
            com.etsy.android.ui.user.review.ReviewTrackingSource r3 = r0.f25948z
            if (r3 == 0) goto L_0x01bf
            java.lang.String r3 = r3.getSource()
            goto L_0x01c0
        L_0x01bf:
            r3 = 0
        L_0x01c0:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r2, r3)
            java.util.Map r2 = kotlin.reflect.C19421p.m32931U(r4)
            java.lang.String r3 = "submit_review_form_app"
            r1.mo21333d(r3, r2)
            return
        L_0x01cf:
            java.lang.String r1 = "reviewFlowModel"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewViewModel.mo37863x(java.lang.String):void");
    }

    /* renamed from: y */
    public final void mo37864y(ReviewCard reviewCard, RatingType ratingType) {
        String str;
        String str2;
        ReviewCard reviewCard2 = reviewCard;
        ReviewFlowNavigationOption.C11699a aVar = null;
        if (this.f25921M == null) {
            AppreciationPhoto appreciationPhoto = reviewCard2.f25975q;
            this.f25921M = new C11719r.C11734o((String) null, (String) null, (ReviewFlowNavigationOption.C11699a) null, (ITrackedObject) null, (Bitmap) null, appreciationPhoto != null ? appreciationPhoto.getUrlFullxfull() : null, 191);
        }
        if (this.f25922N == null) {
            AppreciationVideo appreciationVideo = reviewCard2.f25976r;
            this.f25922N = new C11719r.C11743x((String) null, (String) null, (ReviewFlowNavigationOption.C11699a) null, (String) null, (ITrackedObject) null, (Uri) null, appreciationVideo != null ? appreciationVideo.getUrl() : null, 191);
        }
        C11719r.C11734o oVar = this.f25921M;
        if ((oVar != null ? oVar.f26120g : null) != null) {
            AppreciationPhoto appreciationPhoto2 = reviewCard2.f25975q;
            C19383o.m32795e(appreciationPhoto2, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto");
            m19414s(this, (Bitmap) null, (File) null, appreciationPhoto2.getUrlFullxfull(), 3);
            return;
        }
        File file = this.f25912D;
        if (file != null) {
            m19414s(this, (Bitmap) null, file, (String) null, 5);
            return;
        }
        C11719r.C11743x xVar = this.f25922N;
        if ((xVar != null ? xVar.f26173h : null) != null) {
            m19415v(this, (Uri) null, xVar != null ? xVar.f26173h : null, 1);
            return;
        }
        Uri uri = this.f25913E;
        if (uri != null) {
            m19415v(this, uri, (String) null, 2);
        } else if (C19383o.m32792b(this.f25919K, Boolean.TRUE)) {
            int i = C11692a.f25953e[ratingType.ordinal()];
            int i2 = 30;
            if (i != 1) {
                if (i == 2 && reviewCard.mo37874a() == ReviewCardTypeId.PHOTO_UPLOAD_LOW_RATING) {
                    Integer num = reviewCard2.f25974p;
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    this.f25920L = i2;
                    String str3 = null;
                    String str4 = null;
                    ReviewFlowNavigationOption.C11699a aVar2 = null;
                    ReviewFlowNavigationOption.C11699a aVar3 = null;
                    String str5 = "";
                    String str6 = str5;
                    String str7 = str6;
                    for (ReviewFlowNavigationOption reviewFlowNavigationOption : reviewCard2.f25962d) {
                        int i3 = C11692a.f25951c[reviewFlowNavigationOption.f25998a.ordinal()];
                        if (i3 == 1) {
                            String str8 = reviewFlowNavigationOption.f25999b;
                            str6 = str8 == null ? "" : str8;
                            str3 = reviewFlowNavigationOption.f26000c;
                            aVar2 = reviewFlowNavigationOption.f26007j;
                        } else if (i3 == 3) {
                            String str9 = reviewFlowNavigationOption.f25999b;
                            str7 = str9 == null ? "" : str9;
                            str4 = reviewFlowNavigationOption.f26000c;
                            aVar3 = reviewFlowNavigationOption.f26007j;
                        } else if (i3 == 8) {
                            String str10 = reviewFlowNavigationOption.f25999b;
                            str5 = str10 == null ? "" : str10;
                            aVar = reviewFlowNavigationOption.f26007j;
                        }
                    }
                    C2895z<C11719r> zVar = this.f25930h;
                    String str11 = reviewCard2.f25970l;
                    String str12 = str11 == null ? "" : str11;
                    String str13 = reviewCard2.f25971m;
                    zVar.postValue(new C11719r.C11742w(str12, str13 == null ? "" : str13, str6, str7, str3, str4, reviewCard2.f25977s, aVar2, aVar3));
                    this.f25938p.postValue(new C11744s(str5, aVar, NavigationAction.SKIP));
                    this.f25940r.postValue(new C11700a(BackType.BACK, new C11718q(), NavigationAction.BACK));
                }
            } else if (reviewCard.mo37874a() == ReviewCardTypeId.PHOTO_UPLOAD_WITH_ICONS) {
                Integer num2 = reviewCard2.f25974p;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                this.f25920L = i2;
                ReviewFlowNavigationOption reviewFlowNavigationOption2 = null;
                ReviewFlowNavigationOption reviewFlowNavigationOption3 = null;
                ReviewFlowNavigationOption reviewFlowNavigationOption4 = null;
                for (ReviewFlowNavigationOption reviewFlowNavigationOption5 : reviewCard2.f25962d) {
                    int i4 = C11692a.f25951c[reviewFlowNavigationOption5.f25998a.ordinal()];
                    if (i4 == 1) {
                        reviewFlowNavigationOption2 = reviewFlowNavigationOption5;
                    } else if (i4 == 3) {
                        reviewFlowNavigationOption3 = reviewFlowNavigationOption5;
                    } else if (i4 == 8) {
                        reviewFlowNavigationOption4 = reviewFlowNavigationOption5;
                    }
                }
                C2895z<C11719r> zVar2 = this.f25930h;
                String str14 = reviewCard2.f25970l;
                zVar2.postValue(new C11719r.C11741v(str14 == null ? "" : str14, (reviewFlowNavigationOption2 == null || (str2 = reviewFlowNavigationOption2.f25999b) == null) ? "" : str2, (reviewFlowNavigationOption3 == null || (str = reviewFlowNavigationOption3.f25999b) == null) ? "" : str, reviewFlowNavigationOption2 != null ? reviewFlowNavigationOption2.f26000c : null, reviewFlowNavigationOption3 != null ? reviewFlowNavigationOption3.f26000c : null, reviewCard2.f25977s, reviewFlowNavigationOption2 != null ? reviewFlowNavigationOption2.f26007j : null, reviewFlowNavigationOption3 != null ? reviewFlowNavigationOption3.f26007j : null, C19322o.m32625G0(reviewCard2.f25973o), Boolean.valueOf(!this.f25929g.mo46761a().getBoolean("video_reviews_tooltip", false))));
                if (!this.f25929g.mo46761a().getBoolean("video_reviews_tooltip", false)) {
                    SharedPreferences.Editor edit = this.f25929g.mo46761a().edit();
                    C19383o.m32796f(edit, "editor");
                    edit.putBoolean("video_reviews_tooltip", true);
                    edit.apply();
                }
                C2895z<C11744s> zVar3 = this.f25938p;
                String str15 = reviewFlowNavigationOption4 != null ? reviewFlowNavigationOption4.f25999b : null;
                if (reviewFlowNavigationOption4 != null) {
                    aVar = reviewFlowNavigationOption4.f26007j;
                }
                zVar3.postValue(new C11744s(str15, aVar, NavigationAction.SKIP));
                this.f25940r.postValue(new C11700a(BackType.BACK, new C11717p(), NavigationAction.BACK));
            }
        } else if (reviewCard.mo37874a() == ReviewCardTypeId.PHOTO_UPLOAD) {
            ReviewFlowNavigationOption.C11699a aVar4 = null;
            ReviewFlowNavigationOption.C11699a aVar5 = null;
            String str16 = "";
            String str17 = str16;
            String str18 = str17;
            for (ReviewFlowNavigationOption reviewFlowNavigationOption6 : reviewCard2.f25962d) {
                int i5 = C11692a.f25951c[reviewFlowNavigationOption6.f25998a.ordinal()];
                if (i5 == 1) {
                    String str19 = reviewFlowNavigationOption6.f25999b;
                    str17 = str19 == null ? "" : str19;
                    aVar4 = reviewFlowNavigationOption6.f26007j;
                } else if (i5 == 2) {
                    String str20 = reviewFlowNavigationOption6.f25999b;
                    str18 = str20 == null ? "" : str20;
                    aVar5 = reviewFlowNavigationOption6.f26007j;
                } else if (i5 == 8) {
                    String str21 = reviewFlowNavigationOption6.f25999b;
                    str16 = str21 == null ? "" : str21;
                    aVar = reviewFlowNavigationOption6.f26007j;
                }
            }
            C2895z<C11719r> zVar4 = this.f25930h;
            String str22 = reviewCard2.f25970l;
            String str23 = str22 == null ? "" : str22;
            String str24 = reviewCard2.f25971m;
            String str25 = str24 == null ? "" : str24;
            String str26 = reviewCard2.f25972n;
            zVar4.postValue(new C11719r.C11740u(str23, str25, str26 == null ? "" : str26, str17, str18, aVar4, aVar5));
            this.f25938p.postValue(new C11744s(str16, aVar, NavigationAction.SUBMIT));
            if (C19383o.m32792b(this.f25919K, Boolean.TRUE)) {
                this.f25940r.postValue(new C11700a(BackType.BACK, new C11716o(), NavigationAction.BACK));
            }
        }
    }
}
