package com.reddit.indicatorfastscroll;

import android.widget.TextView;
import com.reddit.indicatorfastscroll.C17346a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class FastScrollerView$bindItemIndicatorViews$$inlined$run$lambda$1 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ FastScrollerView$bindItemIndicatorViews$1 $createIconView$1$inlined;
    public final /* synthetic */ FastScrollerView$bindItemIndicatorViews$2 $createTextView$2$inlined;
    public final /* synthetic */ List $textIndicatorsBatch;
    public final /* synthetic */ ArrayList $viewCreators$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerView$bindItemIndicatorViews$$inlined$run$lambda$1(List list, ArrayList arrayList, FastScrollerView$bindItemIndicatorViews$2 fastScrollerView$bindItemIndicatorViews$2, FastScrollerView$bindItemIndicatorViews$1 fastScrollerView$bindItemIndicatorViews$1) {
        super(0);
        this.$textIndicatorsBatch = list;
        this.$viewCreators$inlined = arrayList;
        this.$createTextView$2$inlined = fastScrollerView$bindItemIndicatorViews$2;
        this.$createIconView$1$inlined = fastScrollerView$bindItemIndicatorViews$1;
    }

    public final TextView invoke() {
        return this.$createTextView$2$inlined.invoke((List<C17346a.C17348b>) this.$textIndicatorsBatch);
    }
}
