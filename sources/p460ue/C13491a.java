package p460ue;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.util.Linkify;
import com.etsy.android.R;
import com.etsy.android.lib.models.ShopAbout;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import com.etsy.android.uikit.util.EtsyLinkify;

/* renamed from: ue.a */
public final class C13491a extends C13493c {

    /* renamed from: b */
    public String f29520b;

    /* renamed from: c */
    public ShopAbout f29521c;

    /* renamed from: d */
    public C11143e1 f29522d;

    public C13491a(String str, ShopAbout shopAbout, C11192q0 q0Var) {
        this.f29520b = str;
        this.f29521c = shopAbout;
        this.f29522d = q0Var;
    }

    /* renamed from: a */
    public final CharSequence mo46159a(Context context) {
        String string = context.getResources().getString(R.string.shop_about_heading, new Object[]{this.f29520b});
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new StyleKitSpan.BoldSpan(context), 0, string.length(), 33);
        return spannableString;
    }

    /* renamed from: b */
    public final CharSequence mo36825b(Context context) {
        String a = ((C11192q0) this.f29522d).mo36861a(this.f29521c.getStoryHeadline(), this.f29521c.getStoryHeadlineTranslated());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = !TextUtils.isEmpty(a);
        if (z) {
            spannableStringBuilder.append(a);
            spannableStringBuilder.setSpan(new StyleKitSpan.BoldSpan(context), 0, a.length(), 33);
        }
        String a2 = ((C11192q0) this.f29522d).mo36861a(this.f29521c.getStory(), this.f29521c.getStoryTranslated());
        if (!TextUtils.isEmpty(a2)) {
            if (z) {
                spannableStringBuilder.append("\n\n");
            }
            spannableStringBuilder.append(a2);
        }
        Linkify.addLinks(spannableStringBuilder, 1);
        return EtsyLinkify.m19616j(context, spannableStringBuilder);
    }
}
