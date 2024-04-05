package com.etsy.android.uikit.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.p327ui.user.addresses.C11392c;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p753kq.C19846a;
import p753kq.C19857l;

public final class EtsyLinkify {

    public static class CustomColorUnderlineURLSpan extends UnderlineURLSpan {
        public static final int $stable = 0;
        private final int mColor;

        public CustomColorUnderlineURLSpan(int i, String str, boolean z) {
            super(str, z);
            this.mColor = i;
        }

        public void updateDrawState(TextPaint textPaint) {
            C19383o.m32797g(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.mColor);
        }
    }

    /* renamed from: a */
    public static final void m19607a(TextView textView, String str, String str2, View.OnClickListener onClickListener) {
        C19383o.m32797g(textView, "textView");
        C19383o.m32797g(str, "linkText");
        Linkify.addLinks(textView, Pattern.compile(str), str2);
        m19617k(textView, true, onClickListener);
        Context context = textView.getContext();
        C19383o.m32796f(context, "textView.context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.clg_color_text_primary});
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            obtainStyledAttributes.recycle();
            textView.setLinkTextColor(colorStateList.getDefaultColor());
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static final void m19608b(TextView textView, boolean z, boolean z2, View.OnClickListener onClickListener) {
        C19383o.m32797g(textView, "textView");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        m19617k(textView, z, onClickListener);
        if (z2) {
            Context context = textView.getContext();
            C19383o.m32796f(context, "textView.context");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.clg_color_text_primary});
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                obtainStyledAttributes.recycle();
                textView.setLinkTextColor(colorStateList.getDefaultColor());
                return;
            }
            throw new IllegalStateException();
        }
        textView.setLinkTextColor(textView.getTextColors().getDefaultColor());
    }

    /* renamed from: c */
    public static final void m19609c(TextView textView, boolean z, C19857l<? super String, C19394m> lVar) {
        C19383o.m32797g(textView, "textView");
        C19383o.m32797g(lVar, "onClickListener");
        WeakReference weakReference = new WeakReference(lVar);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        URLSpan[] urls = textView.getUrls();
        Context context = textView.getContext();
        C19383o.m32796f(urls, "urls");
        if (!(urls.length == 0)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
            for (URLSpan uRLSpan : urls) {
                String url = uRLSpan.getURL();
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                spannableStringBuilder.removeSpan(uRLSpan);
                spannableStringBuilder.setSpan(new EtsyLinkify$replaceUrlSpansWithCustomWeakListener$1(url, z, weakReference, context), spanStart, spanEnd, 33);
            }
            textView.setText(spannableStringBuilder);
        }
        Context context2 = textView.getContext();
        C19383o.m32796f(context2, "textView.context");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(new int[]{R.attr.clg_color_text_primary});
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            obtainStyledAttributes.recycle();
            textView.setLinkTextColor(colorStateList.getDefaultColor());
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public static final void m19610d(Context context, TextView textView) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(textView, "textview");
        m19612f(context, textView, false, (C19846a) null, 28);
    }

    /* renamed from: e */
    public static final void m19611e(Context context, TextView textView, boolean z, int i, C19846a<C19394m> aVar) {
        Context context2 = context;
        TextView textView2 = textView;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(textView2, "textview");
        Linkify.addLinks(textView2, i);
        if (textView.getLinkTextColors() == null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(new int[]{R.attr.clg_color_text_primary});
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                obtainStyledAttributes.recycle();
                textView2.setLinkTextColor(colorStateList.getDefaultColor());
            } else {
                throw new IllegalStateException();
            }
        }
        URLSpan[] urls = textView.getUrls();
        C19383o.m32796f(urls, "urls");
        if (!(urls.length == 0)) {
            AlertDialog.C0133a g = m19613g(context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
            for (URLSpan uRLSpan : urls) {
                String url = uRLSpan.getURL();
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                spannableStringBuilder.removeSpan(uRLSpan);
                spannableStringBuilder.setSpan(new EtsyLinkify$addLinks$1(url, z, aVar, context, g), spanStart, spanEnd, 33);
            }
            textView2.setText(spannableStringBuilder);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m19612f(Context context, TextView textView, boolean z, C19846a aVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        int i2 = (i & 8) != 0 ? 3 : 0;
        if ((i & 16) != 0) {
            aVar = null;
        }
        m19611e(context, textView, z, i2, aVar);
    }

    /* renamed from: g */
    public static AlertDialog.C0133a m19613g(Context context) {
        AlertDialog.C0133a aVar = new AlertDialog.C0133a(context);
        aVar.mo1238i(R.string.convo_external_link_warning_title);
        aVar.mo1229b(R.string.convo_external_link_warning_message);
        aVar.f286a.f271m = true;
        aVar.setNegativeButton(R.string.convo_external_link_warning_cancel_button, new C11392c(1));
        return aVar;
    }

    /* renamed from: h */
    public static final void m19614h(TextView textView) {
        if (textView != null && (textView.getText() instanceof Spannable)) {
            CharSequence text = textView.getText();
            C19383o.m32795e(text, "null cannot be cast to non-null type android.text.Spannable");
            Spannable spannable = (Spannable) text;
            Object[] spans = spannable.getSpans(0, textView.getText().length(), Object.class);
            C19383o.m32796f(spans, "spans");
            for (Object removeSpan : spans) {
                spannable.removeSpan(removeSpan);
            }
        }
    }

    /* renamed from: i */
    public static final Spanned m19615i(int i, Spanned spanned, boolean z) {
        boolean z2;
        C19383o.m32797g(spanned, "spanned");
        if (spanned.length() == 0) {
            return spanned;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
        C19383o.m32796f(uRLSpanArr, "urls");
        if (uRLSpanArr.length == 0) {
            return spanned;
        }
        SpannableString spannableString = new SpannableString(spanned);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spanned.getSpanStart(uRLSpan);
            int spanEnd = spanned.getSpanEnd(uRLSpan);
            String url = uRLSpan.getURL();
            spannableString.removeSpan(uRLSpan);
            if (z) {
                try {
                    z2 = C8915n.m17353e(new URL(url).getHost());
                } catch (MalformedURLException unused) {
                }
            } else {
                z2 = true;
            }
            if (z2) {
                spannableString.setSpan(new EtsyLinkify$replaceUrlSpansWithCustom$2(i, url, true, (View.OnClickListener) null), spanStart, spanEnd, 33);
            }
        }
        return spannableString;
    }

    /* renamed from: j */
    public static final Spanned m19616j(Context context, Spanned spanned) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(spanned, "spanned");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_text_link, typedValue, true);
        int i = typedValue.resourceId;
        Object obj = C8184a.f17966a;
        return m19615i(C8184a.C8188d.m16468a(context, i), spanned, true);
    }

    /* renamed from: k */
    public static void m19617k(TextView textView, boolean z, View.OnClickListener onClickListener) {
        if (textView != null) {
            URLSpan[] urls = textView.getUrls();
            Context context = textView.getContext();
            C19383o.m32796f(urls, "urls");
            if (!(urls.length == 0)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
                for (URLSpan uRLSpan : urls) {
                    String url = uRLSpan.getURL();
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new EtsyLinkify$replaceUrlSpansWithCustom$1(url, z, onClickListener, context), spanStart, spanEnd, 33);
                }
                textView.setText(spannableStringBuilder);
            }
        }
    }

    /* renamed from: l */
    public static void m19618l(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String packageName = context.getPackageName();
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        C19383o.m32796f(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        boolean z = true;
        if (!queryIntentActivities.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (C19383o.m32792b(next.activityInfo.packageName, packageName)) {
                    intent.setPackage(next.activityInfo.packageName);
                    intent.putExtra("NAV_INTERNAL_LINK", true);
                    break;
                }
            }
        }
        z = false;
        if (z) {
            context.startActivity(intent);
            return;
        }
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(context.getPackageManager(), 0);
        if (resolveActivityInfo == null || !resolveActivityInfo.exported) {
            C8901g0.m17337c(context, R.string.whoops_somethings_wrong);
        } else {
            context.startActivity(intent);
        }
    }

    public static class UnderlineURLSpan extends URLSpan {
        public static final int $stable = 8;
        private TrackingOnClickListener listener;
        private final boolean mShouldUnderline;
        private final boolean shouldUseCustomClickBehavior;

        public UnderlineURLSpan(String str, boolean z) {
            super(str);
            this.mShouldUnderline = z;
            this.shouldUseCustomClickBehavior = true;
        }

        public void onClick(View view) {
            TrackingOnClickListener trackingOnClickListener;
            C19383o.m32797g(view, "view");
            if (!this.shouldUseCustomClickBehavior || (trackingOnClickListener = this.listener) == null) {
                try {
                    URL url = new URL(getURL());
                    if (C8915n.m17353e(url.getHost())) {
                        Context context = view.getContext();
                        C19383o.m32796f(context, "view.context");
                        String a = C8915n.m17349a(url);
                        C19383o.m32796f(a, "checkForShopRedirectUrl(urlLink)");
                        EtsyLinkify.m19618l(context, a);
                        return;
                    }
                    Context context2 = view.getContext();
                    C19383o.m32796f(context2, "view.context");
                    String url2 = url.toString();
                    C19383o.m32796f(url2, "urlLink.toString()");
                    Context context3 = view.getContext();
                    C19383o.m32796f(context3, "view.context");
                    AlertDialog.C0133a g = EtsyLinkify.m19613g(context3);
                    g.setPositiveButton(R.string.convo_external_link_warning_open_button, new C11902f(context2, url2));
                    AlertDialog create = g.create();
                    C19383o.m32796f(create, "alertDialogBuilder.create()");
                    create.show();
                } catch (MalformedURLException unused) {
                    super.onClick(view);
                }
            } else {
                trackingOnClickListener.onClick(view);
            }
        }

        public final void setOnClickListener(TrackingOnClickListener trackingOnClickListener) {
            this.listener = trackingOnClickListener;
        }

        public void updateDrawState(TextPaint textPaint) {
            C19383o.m32797g(textPaint, "ds");
            super.updateDrawState(textPaint);
            if (!this.mShouldUnderline) {
                textPaint.setUnderlineText(false);
            }
        }

        public UnderlineURLSpan(String str, boolean z, boolean z2) {
            super(str);
            this.mShouldUnderline = z;
            this.shouldUseCustomClickBehavior = z2;
        }
    }
}
