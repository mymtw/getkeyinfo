package p460ue;

import android.content.Context;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.etsy.android.R;
import com.etsy.android.uikit.util.EtsyLinkify;

/* renamed from: ue.b */
public final class C13492b extends C13493c {

    /* renamed from: b */
    public boolean f29523b = true;

    /* renamed from: a */
    public final CharSequence mo46159a(Context context) {
        return context.getResources().getString(R.string.announcement);
    }

    /* renamed from: b */
    public final CharSequence mo36825b(Context context) {
        SpannableString spannableString = new SpannableString((CharSequence) null);
        Linkify.addLinks(spannableString, 1);
        return EtsyLinkify.m19616j(context, spannableString);
    }
}
