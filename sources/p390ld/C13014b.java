package p390ld;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p435rb.C13350a;

/* renamed from: ld.b */
public final class C13014b extends C10424k {

    /* renamed from: b */
    public final TextView f28671b;

    /* renamed from: ld.b$a */
    public /* synthetic */ class C13015a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28672a;

        static {
            int[] iArr = new int[StockIndicator.StockIndicatorValue.values().length];
            iArr[StockIndicator.StockIndicatorValue.LowStock.ordinal()] = 1;
            iArr[StockIndicator.StockIndicatorValue.OnlyOneLeft.ordinal()] = 2;
            iArr[StockIndicator.StockIndicatorValue.Sale.ordinal()] = 3;
            iArr[StockIndicator.StockIndicatorValue.InStock.ordinal()] = 4;
            iArr[StockIndicator.StockIndicatorValue.None.ordinal()] = 5;
            f28672a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13014b(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_stock_indicator, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.listing_stock_indicator);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.….listing_stock_indicator)");
        this.f28671b = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof StockIndicator) {
            Context context = this.itemView.getContext();
            TextView textView = this.f28671b;
            int i = C13015a.f28672a[((StockIndicator) jVar).f22646a.ordinal()];
            if (i == 1) {
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_urgency));
                textView.setText(context.getString(R.string.listing_stock_indicator_low_in_stock));
            } else if (i == 2) {
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_urgency));
                textView.setText(context.getString(R.string.only_one_available));
            } else if (i == 3 || i == 4) {
                Object obj = C8184a.f17966a;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_checksmall_v1), (Drawable) null, (Drawable) null, (Drawable) null);
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_primary));
                textView.setText(context.getString(R.string.listing_stock_indicator_in_stock));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
