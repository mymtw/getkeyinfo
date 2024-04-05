package com.etsy.android.vespa.viewholders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.SizeableText;
import com.etsy.android.lib.models.apiv3.vespa.SizeableTextPadding;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.vespa.viewholders.f0 */
public final class C12089f0 extends C12086e<SizeableText> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12089f0(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_sizeable_text, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String str;
        TextView textView;
        SizeableText sizeableText = (SizeableText) obj;
        if (sizeableText != null) {
            boolean z = C19383o.m32792b(sizeableText.getSize().getValue(), ResponseConstants.HEADING_01) || C19383o.m32792b(sizeableText.getSize().getValue(), ResponseConstants.HEADING_02);
            View view = this.itemView;
            ((TextView) (!z ? view.findViewById(R.id.sizeable_text_headline) : view.findViewById(R.id.sizeable_text_normal))).setVisibility(8);
            if (z) {
                textView = (TextView) this.itemView.findViewById(R.id.sizeable_text_headline);
                str = "itemView.sizeable_text_headline";
            } else {
                textView = (TextView) this.itemView.findViewById(R.id.sizeable_text_normal);
                str = "itemView.sizeable_text_normal";
            }
            C19383o.m32796f(textView, str);
            textView.setText(sizeableText.getText());
            textView.setVisibility(0);
            int paddingLeft = textView.getPaddingLeft();
            SizeableTextPadding paddingTop = sizeableText.getPaddingTop();
            Context context = textView.getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            int inDP = paddingTop.inDP(context);
            int paddingRight = textView.getPaddingRight();
            SizeableTextPadding paddingBottom = sizeableText.getPaddingBottom();
            Context context2 = textView.getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            textView.setPadding(paddingLeft, inDP, paddingRight, paddingBottom.inDP(context2));
            textView.setTextSize(0, textView.getContext().getResources().getDimension(sizeableText.getSize().getTextSize()));
        }
    }
}
