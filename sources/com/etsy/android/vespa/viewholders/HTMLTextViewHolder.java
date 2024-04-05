package com.etsy.android.vespa.viewholders;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IHtmlText;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;
import p280x0.C8292f;

public final class HTMLTextViewHolder extends C12086e<IHtmlText> {

    /* renamed from: c */
    public TextView f26929c;

    /* renamed from: d */
    public boolean f26930d;

    public class CustomLinkSpan extends URLSpan {
        public CustomLinkSpan(String str) {
            super(str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            Context context = HTMLTextViewHolder.this.itemView.getContext();
            C19383o.m32797g(textPaint, "<this>");
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            textPaint.setTypeface(C8292f.m16582a(context, R.font.clg_typeface_bold));
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.clg_color_text_link});
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                obtainStyledAttributes.recycle();
                textPaint.setColor(colorStateList.getDefaultColor());
                textPaint.setUnderlineText(false);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public HTMLTextViewHolder(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_html_text, viewGroup, false));
        this.f26929c = (TextView) mo38986f(R.id.html_text);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IHtmlText iHtmlText = (IHtmlText) obj;
        Spanned fromHtml = Html.fromHtml(iHtmlText.getText(), 63);
        if (this.f26930d) {
            TextView textView = this.f26929c;
            SpannableString spannableString = new SpannableString(fromHtml);
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new CustomLinkSpan(uRLSpan.getURL()), spanStart, spanEnd, 0);
            }
            textView.setText(spannableString);
        } else {
            this.f26929c.setText(fromHtml);
        }
        this.f26929c.setMovementMethod(LinkMovementMethod.getInstance());
        this.f26929c.setGravity(iHtmlText.getGravity());
        EtsyLinkify.m19610d(this.itemView.getContext(), this.f26929c);
    }

    public HTMLTextViewHolder(ViewGroup viewGroup, int i) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_html_text, viewGroup, false));
        this.f26930d = true;
        this.f26929c = (TextView) mo38986f(R.id.html_text);
    }
}
