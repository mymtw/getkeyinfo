package com.etsy.android.p327ui.user.review;

import android.graphics.Bitmap;
import android.net.Uri;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.Transaction;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.user.review.ReviewCard;
import com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.review.r */
public abstract class C11719r {

    /* renamed from: a */
    public final ReviewScreen f26067a;

    /* renamed from: com.etsy.android.ui.user.review.r$a */
    public static final class C11720a extends C11719r {

        /* renamed from: b */
        public final String f26068b;

        /* renamed from: c */
        public final String f26069c;

        /* renamed from: d */
        public final ITrackedObject f26070d;

        /* renamed from: e */
        public final ITrackedObject f26071e;

        public C11720a(String str, String str2, ReviewFlowNavigationOption.C11699a aVar, ReviewFlowNavigationOption.C11699a aVar2) {
            super(ReviewScreen.PHOTO);
            this.f26068b = str;
            this.f26069c = str2;
            this.f26070d = aVar;
            this.f26071e = aVar2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$b */
    public static final class C11721b extends C11719r {

        /* renamed from: b */
        public final String f26072b;

        /* renamed from: c */
        public final String f26073c;

        /* renamed from: d */
        public final ITrackedObject f26074d;

        /* renamed from: e */
        public final ITrackedObject f26075e;

        public C11721b(String str, String str2, ReviewFlowNavigationOption.C11699a aVar, ReviewFlowNavigationOption.C11699a aVar2) {
            super(ReviewScreen.VIDEO);
            this.f26072b = str;
            this.f26073c = str2;
            this.f26074d = aVar;
            this.f26075e = aVar2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$c */
    public static final class C11722c extends C11719r {

        /* renamed from: b */
        public static final C11722c f26076b = new C11722c();

        public C11722c() {
            super(ReviewScreen.PHOTO);
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$d */
    public static final class C11723d extends C11719r {

        /* renamed from: b */
        public final String f26077b;

        /* renamed from: c */
        public final String f26078c;

        /* renamed from: d */
        public final String f26079d;

        /* renamed from: e */
        public final ITrackedObject f26080e;

        /* renamed from: f */
        public final ITrackedObject f26081f;

        /* renamed from: g */
        public final ITrackedObject f26082g;

        public C11723d(String str, String str2, String str3, ReviewFlowNavigationOption.C11699a aVar, ReviewFlowNavigationOption.C11699a aVar2, ReviewFlowNavigationOption.C11699a aVar3) {
            super(ReviewScreen.PHOTO);
            this.f26077b = str;
            this.f26078c = str2;
            this.f26079d = str3;
            this.f26080e = aVar;
            this.f26081f = aVar2;
            this.f26082g = aVar3;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$e */
    public static final class C11724e extends C11719r {

        /* renamed from: b */
        public final String f26083b;

        /* renamed from: c */
        public final String f26084c;

        /* renamed from: d */
        public final String f26085d;

        /* renamed from: e */
        public final ITrackedObject f26086e;

        /* renamed from: f */
        public final ITrackedObject f26087f;

        /* renamed from: g */
        public final ITrackedObject f26088g;

        public C11724e(String str, String str2, String str3, ReviewFlowNavigationOption.C11699a aVar, ReviewFlowNavigationOption.C11699a aVar2, ReviewFlowNavigationOption.C11699a aVar3) {
            super(ReviewScreen.VIDEO);
            this.f26083b = str;
            this.f26084c = str2;
            this.f26085d = str3;
            this.f26086e = aVar;
            this.f26087f = aVar2;
            this.f26088g = aVar3;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$f */
    public static final class C11725f extends C11719r {

        /* renamed from: b */
        public final String f26089b;

        /* renamed from: c */
        public final int f26090c;

        /* renamed from: d */
        public final String f26091d;

        /* renamed from: e */
        public final int f26092e;

        /* renamed from: f */
        public final boolean f26093f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11725f(ReviewScreen reviewScreen, int i, int i2, boolean z, int i3) {
            super(reviewScreen);
            i = (i3 & 4) != 0 ? 0 : i;
            i2 = (i3 & 16) != 0 ? 0 : i2;
            z = (i3 & 32) != 0 ? false : z;
            this.f26089b = null;
            this.f26090c = i;
            this.f26091d = null;
            this.f26092e = i2;
            this.f26093f = z;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$g */
    public static final class C11726g extends C11719r {

        /* renamed from: b */
        public final String f26094b;

        /* renamed from: c */
        public final C19846a<C19394m> f26095c;

        public C11726g(String str, C19846a<C19394m> aVar) {
            super(ReviewScreen.OVERALL);
            this.f26094b = str;
            this.f26095c = aVar;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$h */
    public static final class C11727h extends C11719r {

        /* renamed from: b */
        public final int f26096b;

        /* renamed from: c */
        public final Transaction f26097c;

        public C11727h(int i, Transaction transaction) {
            super(ReviewScreen.OVERALL);
            this.f26096b = i;
            this.f26097c = transaction;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$i */
    public static final class C11728i extends C11719r {

        /* renamed from: b */
        public final String f26098b;

        /* renamed from: c */
        public final int f26099c = 2;

        public C11728i(String str) {
            super((ReviewScreen) null);
            this.f26098b = str;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$j */
    public static final class C11729j extends C11719r {

        /* renamed from: b */
        public static final C11729j f26100b = new C11729j();

        public C11729j() {
            super((ReviewScreen) null);
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$k */
    public static final class C11730k extends C11719r {

        /* renamed from: b */
        public final String f26101b;

        /* renamed from: c */
        public final ListingImage f26102c;

        /* renamed from: d */
        public final String f26103d;

        /* renamed from: e */
        public final String f26104e;

        /* renamed from: f */
        public final String f26105f;

        /* renamed from: g */
        public final String f26106g;

        /* renamed from: h */
        public final int f26107h;

        /* renamed from: i */
        public final ITrackedObject f26108i;

        /* renamed from: j */
        public final int f26109j = 0;

        /* renamed from: k */
        public final boolean f26110k;

        /* renamed from: l */
        public final boolean f26111l;

        public C11730k(String str, ListingImage listingImage, String str2, String str3, String str4, String str5, int i, ReviewFlowNavigationOption.C11699a aVar, boolean z, boolean z2) {
            super(ReviewScreen.OVERALL);
            this.f26101b = str;
            this.f26102c = listingImage;
            this.f26103d = str2;
            this.f26104e = str3;
            this.f26105f = str4;
            this.f26106g = str5;
            this.f26107h = i;
            this.f26108i = aVar;
            this.f26110k = z;
            this.f26111l = z2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$l */
    public static final class C11731l extends C11719r {

        /* renamed from: b */
        public final String f26112b;

        public C11731l(String str) {
            super(ReviewScreen.OVERALL);
            this.f26112b = str;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$m */
    public static final class C11732m extends C11719r {

        /* renamed from: b */
        public static final C11732m f26113b = new C11732m();

        public C11732m() {
            super(ReviewScreen.VIDEO);
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$n */
    public static final class C11733n extends C11719r {

        /* renamed from: b */
        public static final C11733n f26114b = new C11733n();

        public C11733n() {
            super(ReviewScreen.VIDEO);
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$o */
    public static final class C11734o extends C11719r {

        /* renamed from: b */
        public String f26115b;

        /* renamed from: c */
        public String f26116c;

        /* renamed from: d */
        public ITrackedObject f26117d;

        /* renamed from: e */
        public ITrackedObject f26118e;

        /* renamed from: f */
        public Bitmap f26119f;

        /* renamed from: g */
        public String f26120g;

        /* renamed from: h */
        public final int f26121h;

        public C11734o() {
            this((String) null, (String) null, (ReviewFlowNavigationOption.C11699a) null, (ITrackedObject) null, (Bitmap) null, (String) null, 255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11734o(String str, String str2, ReviewFlowNavigationOption.C11699a aVar, ITrackedObject iTrackedObject, Bitmap bitmap, String str3, int i) {
            super(ReviewScreen.PHOTO);
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            aVar = (i & 4) != 0 ? null : aVar;
            iTrackedObject = (i & 16) != 0 ? null : iTrackedObject;
            bitmap = (i & 32) != 0 ? null : bitmap;
            str3 = (i & 64) != 0 ? null : str3;
            int i2 = (i & 128) != 0 ? 2 : 0;
            this.f26115b = str;
            this.f26116c = str2;
            this.f26117d = aVar;
            this.f26118e = iTrackedObject;
            this.f26119f = bitmap;
            this.f26120g = str3;
            this.f26121h = i2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$p */
    public static final class C11735p extends C11719r {

        /* renamed from: b */
        public static final C11735p f26122b = new C11735p();

        public C11735p() {
            super(ReviewScreen.VIDEO);
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$q */
    public static final class C11736q extends C11719r {

        /* renamed from: b */
        public static final C11736q f26123b = new C11736q();

        public C11736q() {
            super(ReviewScreen.PHOTO);
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$r */
    public static final class C11737r extends C11719r {

        /* renamed from: b */
        public final String f26124b;

        /* renamed from: c */
        public final String f26125c;

        /* renamed from: d */
        public final String f26126d;

        /* renamed from: e */
        public final String f26127e;

        /* renamed from: f */
        public final ITrackedObject f26128f;

        /* renamed from: g */
        public final ITrackedObject f26129g;

        public C11737r(String str, String str2, String str3, String str4, ReviewFlowNavigationOption.C11699a aVar, ReviewFlowNavigationOption.C11699a aVar2) {
            super(ReviewScreen.SUBRATINGS);
            this.f26124b = str;
            this.f26125c = str2;
            this.f26126d = str3;
            this.f26127e = str4;
            this.f26128f = aVar;
            this.f26129g = aVar2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$s */
    public static final class C11738s extends C11719r {

        /* renamed from: b */
        public final String f26130b;

        /* renamed from: c */
        public final List<ReviewFlowRatingControl> f26131c;

        /* renamed from: d */
        public final ReviewFlowCheckboxControl f26132d;

        /* renamed from: e */
        public final ReviewFlowTextFieldControl f26133e;

        /* renamed from: f */
        public final int f26134f;

        /* renamed from: g */
        public final Alert f26135g;

        /* renamed from: h */
        public final boolean f26136h;

        public C11738s() {
            throw null;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11738s(String str, List list, ReviewFlowCheckboxControl reviewFlowCheckboxControl, ReviewFlowTextFieldControl reviewFlowTextFieldControl, Alert alert, boolean z) {
            super(ReviewScreen.SUBRATINGS);
            C19383o.m32797g(list, "subratingControls");
            this.f26130b = str;
            this.f26131c = list;
            this.f26132d = reviewFlowCheckboxControl;
            this.f26133e = reviewFlowTextFieldControl;
            this.f26134f = 1;
            this.f26135g = alert;
            this.f26136h = z;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$t */
    public static final class C11739t extends C11719r {

        /* renamed from: b */
        public final String f26137b;

        public C11739t(String str) {
            super(ReviewScreen.SUBRATINGS);
            this.f26137b = str;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$u */
    public static final class C11740u extends C11719r {

        /* renamed from: b */
        public final String f26138b;

        /* renamed from: c */
        public final String f26139c;

        /* renamed from: d */
        public final String f26140d;

        /* renamed from: e */
        public final String f26141e;

        /* renamed from: f */
        public final String f26142f;

        /* renamed from: g */
        public final ITrackedObject f26143g;

        /* renamed from: h */
        public final ITrackedObject f26144h;

        /* renamed from: i */
        public final int f26145i = 2;

        public C11740u(String str, String str2, String str3, String str4, String str5, ReviewFlowNavigationOption.C11699a aVar, ReviewFlowNavigationOption.C11699a aVar2) {
            super(ReviewScreen.PHOTO);
            this.f26138b = str;
            this.f26139c = str2;
            this.f26140d = str3;
            this.f26141e = str4;
            this.f26142f = str5;
            this.f26143g = aVar;
            this.f26144h = aVar2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$v */
    public static final class C11741v extends C11719r {

        /* renamed from: b */
        public final String f26146b;

        /* renamed from: c */
        public final String f26147c;

        /* renamed from: d */
        public final String f26148d;

        /* renamed from: e */
        public final String f26149e;

        /* renamed from: f */
        public final String f26150f;

        /* renamed from: g */
        public final ITrackedObject f26151g;

        /* renamed from: h */
        public final ITrackedObject f26152h;

        /* renamed from: i */
        public final ITrackedObject f26153i;

        /* renamed from: j */
        public final List<ReviewFlowIcon> f26154j;

        /* renamed from: k */
        public final Boolean f26155k;

        /* renamed from: l */
        public final int f26156l;

        public C11741v() {
            throw null;
        }

        public C11741v(String str, String str2, String str3, String str4, String str5, ReviewCard.C11697a aVar, ReviewFlowNavigationOption.C11699a aVar2, ReviewFlowNavigationOption.C11699a aVar3, ArrayList arrayList, Boolean bool) {
            super(ReviewScreen.PHOTO);
            this.f26146b = str;
            this.f26147c = str2;
            this.f26148d = str3;
            this.f26149e = str4;
            this.f26150f = str5;
            this.f26151g = aVar;
            this.f26152h = aVar2;
            this.f26153i = aVar3;
            this.f26154j = arrayList;
            this.f26155k = bool;
            this.f26156l = 2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$w */
    public static final class C11742w extends C11719r {

        /* renamed from: b */
        public final String f26157b;

        /* renamed from: c */
        public final String f26158c;

        /* renamed from: d */
        public final String f26159d;

        /* renamed from: e */
        public final String f26160e;

        /* renamed from: f */
        public final String f26161f;

        /* renamed from: g */
        public final String f26162g;

        /* renamed from: h */
        public final ITrackedObject f26163h;

        /* renamed from: i */
        public final ITrackedObject f26164i;

        /* renamed from: j */
        public final ITrackedObject f26165j;

        /* renamed from: k */
        public final int f26166k = 2;

        public C11742w(String str, String str2, String str3, String str4, String str5, String str6, ReviewCard.C11697a aVar, ReviewFlowNavigationOption.C11699a aVar2, ReviewFlowNavigationOption.C11699a aVar3) {
            super(ReviewScreen.PHOTO);
            this.f26157b = str;
            this.f26158c = str2;
            this.f26159d = str3;
            this.f26160e = str4;
            this.f26161f = str5;
            this.f26162g = str6;
            this.f26163h = aVar;
            this.f26164i = aVar2;
            this.f26165j = aVar3;
        }
    }

    /* renamed from: com.etsy.android.ui.user.review.r$x */
    public static final class C11743x extends C11719r {

        /* renamed from: b */
        public String f26167b;

        /* renamed from: c */
        public String f26168c;

        /* renamed from: d */
        public ITrackedObject f26169d;

        /* renamed from: e */
        public String f26170e;

        /* renamed from: f */
        public ITrackedObject f26171f;

        /* renamed from: g */
        public Uri f26172g;

        /* renamed from: h */
        public String f26173h;

        /* renamed from: i */
        public final int f26174i;

        public C11743x() {
            this((String) null, (String) null, (ReviewFlowNavigationOption.C11699a) null, (String) null, (ITrackedObject) null, (Uri) null, (String) null, 255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11743x(String str, String str2, ReviewFlowNavigationOption.C11699a aVar, String str3, ITrackedObject iTrackedObject, Uri uri, String str4, int i) {
            super(ReviewScreen.VIDEO);
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            aVar = (i & 4) != 0 ? null : aVar;
            str3 = (i & 8) != 0 ? null : str3;
            iTrackedObject = (i & 16) != 0 ? null : iTrackedObject;
            uri = (i & 32) != 0 ? null : uri;
            str4 = (i & 64) != 0 ? null : str4;
            int i2 = (i & 128) != 0 ? 2 : 0;
            this.f26167b = str;
            this.f26168c = str2;
            this.f26169d = aVar;
            this.f26170e = str3;
            this.f26171f = iTrackedObject;
            this.f26172g = uri;
            this.f26173h = str4;
            this.f26174i = i2;
        }
    }

    public C11719r(ReviewScreen reviewScreen) {
        this.f26067a = reviewScreen;
    }
}
