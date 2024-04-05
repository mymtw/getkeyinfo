package p452te;

import android.content.Context;
import android.text.SpannableString;
import com.etsy.android.R;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.p327ui.shop.viewholder.C11281j0;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.viewholder.C12001n;

/* renamed from: te.c */
public final class C13394c implements C12001n.C12002a, C11281j0.C11282a {

    /* renamed from: a */
    public Review f29331a;

    /* renamed from: b */
    public String f29332b;

    /* renamed from: c */
    public C11192q0 f29333c;

    /* renamed from: d */
    public MachineTranslationViewState f29334d;

    /* renamed from: e */
    public EtsyId f29335e;

    /* renamed from: f */
    public String f29336f;

    /* renamed from: g */
    public String f29337g;

    public C13394c() {
    }

    /* renamed from: a */
    public final Listing mo36971a() {
        return this.f29331a.getListing();
    }

    /* renamed from: b */
    public final CharSequence mo38866b(Context context) {
        String string = context.getString(R.string.shop_home_review_heading, new Object[]{this.f29336f, this.f29337g});
        int indexOf = string.indexOf(this.f29336f);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new StyleKitSpan.BoldSpan(context), indexOf, this.f29336f.length() + indexOf, 33);
        return spannableString;
    }

    /* renamed from: c */
    public final int mo38867c() {
        return 16;
    }

    /* renamed from: d */
    public final String mo36972d() {
        return this.f29331a.getListingTitle();
    }

    /* renamed from: e */
    public final ListingImage mo36973e() {
        return this.f29331a.getListingImage();
    }

    public final String getImageUrl() {
        return this.f29332b;
    }

    public final void getType() {
    }

    public C13394c(Review review, EtsyId etsyId, String str, String str2, String str3, C11192q0 q0Var) {
        this.f29331a = review;
        this.f29335e = etsyId;
        this.f29336f = str;
        this.f29337g = str3;
        this.f29334d = review.getTranslationState();
        this.f29332b = str2;
        this.f29333c = q0Var;
    }
}
