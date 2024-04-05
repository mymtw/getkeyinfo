package p452te;

import android.content.Context;
import android.support.p013v4.media.C0073e;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.etsy.android.R;
import com.etsy.android.lib.models.ReviewResponse;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.uikit.viewholder.C12001n;
import java.text.SimpleDateFormat;
import p260v0.C8184a;

/* renamed from: te.b */
public final class C13393b implements C12001n.C12002a {

    /* renamed from: a */
    public ShopV3 f29328a;

    /* renamed from: b */
    public SimpleDateFormat f29329b;

    /* renamed from: c */
    public ReviewResponse f29330c;

    public C13393b() {
    }

    /* renamed from: b */
    public final CharSequence mo38866b(Context context) {
        String sellerName = this.f29328a.getSellerName();
        String string = context.getString(R.string.shop_home_review_response_heading, new Object[]{sellerName, this.f29329b.format(this.f29330c.getCreateDate())});
        int indexOf = string.indexOf(sellerName);
        StringBuilder k = C0073e.m211k(string, "\n\n");
        k.append(this.f29330c.getMessage());
        SpannableString spannableString = new SpannableString(k.toString());
        Object obj = C8184a.f17966a;
        spannableString.setSpan(new ForegroundColorSpan(C8184a.C8188d.m16468a(context, R.color.orange)), indexOf, sellerName.length() + indexOf, 33);
        return spannableString;
    }

    /* renamed from: c */
    public final int mo38867c() {
        return 16;
    }

    public final String getImageUrl() {
        return this.f29328a.getSellerAvatarUrl();
    }

    public final void getType() {
    }

    public C13393b(SimpleDateFormat simpleDateFormat, ShopV3 shopV3, ReviewResponse reviewResponse) {
        this.f29329b = simpleDateFormat;
        this.f29328a = shopV3;
        this.f29330c = reviewResponse;
    }
}
