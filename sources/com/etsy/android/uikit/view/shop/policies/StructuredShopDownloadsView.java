package com.etsy.android.uikit.view.shop.policies;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.uikit.util.EtsyLinkify;
import java.util.List;
import p409o9.C13131k;
import p628nj.C18263b;

public class StructuredShopDownloadsView extends StructuredShopPoliciesView {
    public StructuredShopDownloadsView(Context context) {
        super(context);
    }

    public void init(Context context, LinearLayout linearLayout) {
        View.inflate(context, R.layout.view_structured_shop_downloads, linearLayout);
        TextView textView = (TextView) findViewById(R.id.txt_downloads_info);
        List<String> list = C8591a.f18700r;
        String f = C18263b.f40056T.f18706f.mo21136f(C13131k.f28868a);
        textView.setText(EtsyLinkify.m19616j(context, Html.fromHtml(getResources().getString(R.string.structured_shipping_digital_message, new Object[]{f}))));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public StructuredShopDownloadsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StructuredShopDownloadsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StructuredShopDownloadsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
