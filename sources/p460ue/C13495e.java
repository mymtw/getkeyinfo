package p460ue;

import android.content.Context;
import android.text.SpannableString;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.SellerDetails;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;

/* renamed from: ue.e */
public final class C13495e extends C13493c {

    /* renamed from: b */
    public SellerDetails f29526b;

    public C13495e() {
    }

    /* renamed from: a */
    public final CharSequence mo46159a(Context context) {
        SpannableString spannableString = new SpannableString(context.getResources().getString(R.string.shop_section_more_information));
        spannableString.setSpan(new StyleKitSpan.BoldSpan(context), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: b */
    public final CharSequence mo36825b(Context context) {
        return "";
    }

    public C13495e(SellerDetails sellerDetails) {
        this.f29526b = sellerDetails;
    }
}
