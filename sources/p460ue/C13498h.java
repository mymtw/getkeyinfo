package p460ue;

import android.content.Context;
import android.text.SpannableString;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: ue.h */
public final class C13498h extends C13493c {

    /* renamed from: c */
    public static final /* synthetic */ int f29533c = 0;

    /* renamed from: b */
    public boolean f29534b = true;

    /* renamed from: a */
    public final CharSequence mo46159a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SpannableString spannableString = new SpannableString(context.getString(R.string.shop_section_translations_heading));
        spannableString.setSpan(new StyleKitSpan.BoldSpan(context), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: b */
    public final CharSequence mo36825b(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        String string = context.getString(R.string.shop_section_translations_description);
        C19383o.m32796f(string, "context.getString(R.stri…translations_description)");
        return string;
    }
}
