package p415of;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.cart.ShippingDetails;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p423pf.C13239i;

/* renamed from: of.s */
public final class C13190s {

    /* renamed from: a */
    public final View f29019a;

    /* renamed from: b */
    public final ShippingDetails f29020b;

    /* renamed from: c */
    public final List<ServerDrivenAction> f29021c;

    /* renamed from: d */
    public final C8703p f29022d;

    /* renamed from: e */
    public final C13171a<UserAction> f29023e;

    /* renamed from: f */
    public final CollageRadioGroup f29024f;

    /* renamed from: g */
    public String f29025g;

    public C13190s(View view, ShippingDetails shippingDetails, List list, C8703p pVar, C13239i iVar) {
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(iVar, "clickHandler");
        this.f29019a = view;
        this.f29020b = shippingDetails;
        this.f29021c = list;
        this.f29022d = pVar;
        this.f29023e = iVar;
        this.f29024f = (CollageRadioGroup) view.findViewById(R.id.cart_bottom_sheet_shipping_options);
        this.f29025g = shippingDetails.getSelectedOptionId();
    }
}
