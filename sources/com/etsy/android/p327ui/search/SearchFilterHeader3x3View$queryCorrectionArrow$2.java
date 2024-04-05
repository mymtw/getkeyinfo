package com.etsy.android.p327ui.search;

import android.widget.ImageView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.SearchFilterHeader3x3View$queryCorrectionArrow$2 */
public final class SearchFilterHeader3x3View$queryCorrectionArrow$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ SearchFilterHeader3x3View this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFilterHeader3x3View$queryCorrectionArrow$2(SearchFilterHeader3x3View searchFilterHeader3x3View) {
        super(0);
        this.this$0 = searchFilterHeader3x3View;
    }

    public final ImageView invoke() {
        return (ImageView) this.this$0.findViewById(R.id.query_correction_arrow);
    }
}
