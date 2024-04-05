package p390ld;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.listingpanel.SaleEndsSoonBadgePicker;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringUtils;
import p368ic.C12930a;
import p382kd.C12992a;
import p435rb.C13350a;

/* renamed from: ld.a */
public final class C13012a extends C10424k {

    /* renamed from: b */
    public final TextView f28668b;

    /* renamed from: c */
    public final C12930a f28669c = new C12930a(new SaleEndsSoonBadgePicker());

    /* renamed from: ld.a$a */
    public /* synthetic */ class C13013a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28670a;

        static {
            int[] iArr = new int[StockIndicator.StockIndicatorValue.values().length];
            iArr[StockIndicator.StockIndicatorValue.LowStock.ordinal()] = 1;
            iArr[StockIndicator.StockIndicatorValue.OnlyOneLeft.ordinal()] = 2;
            iArr[StockIndicator.StockIndicatorValue.InStock.ordinal()] = 3;
            iArr[StockIndicator.StockIndicatorValue.None.ordinal()] = 4;
            iArr[StockIndicator.StockIndicatorValue.Sale.ordinal()] = 5;
            f28670a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13012a(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_stock_indicator_redesign, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.listing_stock_indicator);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.….listing_stock_indicator)");
        this.f28668b = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof StockIndicator) {
            Context context = this.itemView.getContext();
            StockIndicator stockIndicator = (StockIndicator) jVar;
            TextView textView = this.f28668b;
            int i = C13013a.f28670a[stockIndicator.f22646a.ordinal()];
            if (i == 1) {
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_status_primary));
                textView.setText(StringUtils.upperCase(context.getString(R.string.listing_stock_indicator_low_in_stock)));
            } else if (i == 2) {
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_urgency));
                textView.setText(StringUtils.upperCase(context.getString(R.string.only_one_available)));
            } else if (i == 3) {
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_tertiary));
                textView.setText(StringUtils.upperCase(context.getString(R.string.listing_stock_indicator_in_stock)));
            } else if (i == 4) {
            } else {
                if (i == 5) {
                    C19383o.m32796f(context, ResponseConstants.CONTEXT);
                    textView.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_status_primary));
                    C12992a aVar = stockIndicator.f22647b;
                    if (aVar != null) {
                        this.f28669c.mo45704a(textView, aVar.f28603a, true);
                        return;
                    }
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
