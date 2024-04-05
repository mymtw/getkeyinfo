package p460ue;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopPolicy;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: ue.f */
public final class C13496f extends C13493c {

    /* renamed from: b */
    public ShopPolicy f29527b;

    /* renamed from: c */
    public C11143e1 f29528c;

    public C13496f(ShopPolicy shopPolicy, C11192q0 q0Var) {
        this.f29527b = shopPolicy;
        this.f29528c = q0Var;
    }

    /* renamed from: a */
    public final CharSequence mo46159a(Context context) {
        Resources resources = context.getResources();
        if (this.f29527b == null) {
            return resources.getString(R.string.shop_policies);
        }
        String string = resources.getString(R.string.policies);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (this.f29527b.getUpdateDate() != null) {
            spannableStringBuilder.append("\n").append(resources.getString(R.string.last_updated_on, new Object[]{C13493c.f29524a.format(this.f29527b.getUpdateDate())}));
        }
        int length = string.length();
        spannableStringBuilder.setSpan(new StyleKitSpan.BoldSpan(context), 0, length, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelSize(R.dimen.text_small)), length, spannableStringBuilder.length(), 33);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.clg_color_text_secondary});
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            obtainStyledAttributes.recycle();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(colorStateList.getDefaultColor()), length, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final CharSequence mo36825b(Context context) {
        ShopPolicy shopPolicy = this.f29527b;
        if (shopPolicy == null) {
            return "";
        }
        String a = ((C11192q0) this.f29528c).mo36861a(shopPolicy.getWelcomeMessage(), this.f29527b.getWelcomeMessageTranslated());
        return !TextUtils.isEmpty(a) ? a.trim() : a;
    }
}
