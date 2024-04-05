package com.etsy.android.p327ui.shop;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.C3198u;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.uikit.recyclerview.StickyHeadersGridLayoutManager;

/* renamed from: com.etsy.android.ui.shop.ShopHomeLayoutManager */
public class ShopHomeLayoutManager extends StickyHeadersGridLayoutManager {

    /* renamed from: U */
    public C11121a f24599U;

    /* renamed from: com.etsy.android.ui.shop.ShopHomeLayoutManager$a */
    public class C11121a extends C3198u {
        public C11121a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final PointF mo11706a(int i) {
            return ShopHomeLayoutManager.this.mo11291a(i);
        }

        /* renamed from: l */
        public final int mo11947l() {
            return -1;
        }
    }

    public ShopHomeLayoutManager(Context context, int i) {
        super(i);
        this.f24599U = new C11121a(context);
    }

    /* renamed from: E0 */
    public final void mo11270E0(RecyclerView recyclerView, int i) {
        C11121a aVar = this.f24599U;
        aVar.f7107a = i;
        mo11650F0(aVar);
    }
}
