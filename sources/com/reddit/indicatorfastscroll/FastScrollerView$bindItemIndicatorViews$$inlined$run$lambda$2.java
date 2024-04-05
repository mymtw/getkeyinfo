package com.reddit.indicatorfastscroll;

import android.widget.ImageView;
import com.reddit.indicatorfastscroll.C17346a;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class FastScrollerView$bindItemIndicatorViews$$inlined$run$lambda$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ FastScrollerView$bindItemIndicatorViews$1 $createIconView$1$inlined;
    public final /* synthetic */ FastScrollerView$bindItemIndicatorViews$2 $createTextView$2$inlined;
    public final /* synthetic */ C17346a $indicator;
    public final /* synthetic */ ArrayList $viewCreators$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerView$bindItemIndicatorViews$$inlined$run$lambda$2(C17346a aVar, ArrayList arrayList, FastScrollerView$bindItemIndicatorViews$2 fastScrollerView$bindItemIndicatorViews$2, FastScrollerView$bindItemIndicatorViews$1 fastScrollerView$bindItemIndicatorViews$1) {
        super(0);
        this.$indicator = aVar;
        this.$viewCreators$inlined = arrayList;
        this.$createTextView$2$inlined = fastScrollerView$bindItemIndicatorViews$2;
        this.$createIconView$1$inlined = fastScrollerView$bindItemIndicatorViews$1;
    }

    public final ImageView invoke() {
        return this.$createIconView$1$inlined.invoke((C17346a.C17347a) this.$indicator);
    }
}
