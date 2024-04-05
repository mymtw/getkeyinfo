package p460ue;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopPolicy;
import com.etsy.android.lib.models.apiv3.StructuredShopPolicies;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import kotlin.jvm.internal.C19383o;

/* renamed from: ue.g */
public final class C13497g extends C13493c {

    /* renamed from: b */
    public ShopPolicy f29529b;

    /* renamed from: c */
    public boolean f29530c;

    /* renamed from: d */
    public C11192q0 f29531d;

    /* renamed from: e */
    public StructuredShopPolicies f29532e;

    public C13497g() {
    }

    /* renamed from: a */
    public final CharSequence mo46159a(Context context) {
        Resources resources = context.getResources();
        String string = resources.getString(R.string.shop_structured_policies_heading);
        String string2 = resources.getString(R.string.last_updated_on, new Object[]{C13493c.f29524a.format(this.f29532e.getLastUpdatedDate())});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append("\n").append(string2);
        int length = string.length();
        spannableStringBuilder.setSpan(new StyleKitSpan.BoldSpan(context), 0, length, 33);
        int i = length + 1;
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelSize(R.dimen.text_small)), i, spannableStringBuilder.length(), 33);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.clg_color_text_secondary});
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            obtainStyledAttributes.recycle();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(colorStateList.getDefaultColor()), i, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final CharSequence mo36825b(Context context) {
        return "";
    }

    /* renamed from: c */
    public final MachineTranslationViewState mo46160c() {
        return this.f29532e.getPrivacy() != null ? this.f29532e.getPrivacy().getTranslationState() : new MachineTranslationViewState();
    }

    public C13497g(StructuredShopPolicies structuredShopPolicies, C11192q0 q0Var, ShopPolicy shopPolicy, boolean z) {
        this.f29532e = structuredShopPolicies;
        this.f29531d = q0Var;
        this.f29529b = shopPolicy;
        this.f29530c = z;
    }
}
