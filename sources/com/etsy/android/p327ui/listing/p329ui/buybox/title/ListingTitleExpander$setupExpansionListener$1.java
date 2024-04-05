package com.etsy.android.p327ui.listing.p329ui.buybox.title;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.title.ListingTitleExpander$setupExpansionListener$1 */
final class ListingTitleExpander$setupExpansionListener$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ TextView $listingTitle;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ C10310b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingTitleExpander$setupExpansionListener$1(C19846a<C19394m> aVar, C10310b bVar, TextView textView) {
        super(1);
        this.$onClick = aVar;
        this.this$0 = bVar;
        this.$listingTitle = textView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$onClick.invoke();
        C10310b bVar = this.this$0;
        TextView textView = this.$listingTitle;
        bVar.getClass();
        textView.setOnClickListener((View.OnClickListener) null);
        int maxLines = textView.getMaxLines();
        TextUtils.TruncateAt ellipsize = textView.getEllipsize();
        int measuredWidth = textView.getMeasuredWidth();
        textView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        textView.setEllipsize((TextUtils.TruncateAt) null);
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int lineCount = textView.getLineCount();
        int measuredHeight = textView.getMeasuredHeight();
        textView.setMaxLines(maxLines);
        textView.setEllipsize(ellipsize);
        if (lineCount > maxLines) {
            textView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            textView.setEllipsize((TextUtils.TruncateAt) null);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.height = textView.getHeight();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{textView.getHeight(), measuredHeight});
            ofInt.addUpdateListener(new C10309a(layoutParams, textView));
            ofInt.addListener(new ListingTitleExpander$animateExpansion$2(layoutParams, textView));
            ofInt.setDuration(200);
            ofInt.start();
        }
    }
}
