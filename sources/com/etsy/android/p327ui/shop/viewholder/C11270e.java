package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: com.etsy.android.ui.shop.viewholder.e */
public final class C11270e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ TextView f24882b;

    public C11270e(TextView textView) {
        this.f24882b = textView;
    }

    public final void onGlobalLayout() {
        try {
            if (this.f24882b.getLayout() != null && this.f24882b.getMaxLines() == 3) {
                StringBuffer stringBuffer = new StringBuffer("");
                int maxLines = this.f24882b.getMaxLines();
                for (int i = 0; i < maxLines; i++) {
                    int lineStart = this.f24882b.getLayout().getLineStart(i);
                    int lineEnd = this.f24882b.getLayout().getLineEnd(i);
                    if (lineEnd >= lineStart) {
                        if (lineEnd < this.f24882b.getText().length()) {
                            stringBuffer.append(this.f24882b.getText().subSequence(lineStart, lineEnd));
                        }
                    }
                }
                this.f24882b.setContentDescription(stringBuffer.toString());
            }
        } catch (Exception unused) {
        }
    }
}
