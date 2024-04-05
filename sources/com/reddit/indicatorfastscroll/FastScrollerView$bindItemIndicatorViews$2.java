package com.reddit.indicatorfastscroll;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.etsy.android.R;
import com.reddit.indicatorfastscroll.C17346a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FastScrollerView$bindItemIndicatorViews$2 extends Lambda implements C19857l<List<? extends C17346a.C17348b>, TextView> {
    public final /* synthetic */ FastScrollerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerView$bindItemIndicatorViews$2(FastScrollerView fastScrollerView) {
        super(1);
        this.this$0 = fastScrollerView;
    }

    public final TextView invoke(List<C17346a.C17348b> list) {
        C19383o.m32798h(list, "textIndicators");
        View inflate = LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.fast_scroller_indicator_text, this.this$0, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setTextAppearance(this.this$0.getTextAppearanceRes());
            ColorStateList textColor = this.this$0.getTextColor();
            if (textColor != null) {
                textView.setTextColor(textColor);
            }
            textView.setPadding(textView.getPaddingLeft(), (int) this.this$0.getTextPadding(), textView.getPaddingRight(), (int) this.this$0.getTextPadding());
            textView.setLineSpacing(this.this$0.getTextPadding(), textView.getLineSpacingMultiplier());
            textView.setText(C19327t.m32644Z0(list, "\n", (String) null, (String) null, FastScrollerView$bindItemIndicatorViews$2$1$2.INSTANCE, 30));
            textView.setTag(list);
            return textView;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
