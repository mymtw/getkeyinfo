package p362hd;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.C9064o;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: hd.d */
public final class C12816d extends C10424k {

    /* renamed from: d */
    public static final /* synthetic */ int f28299d = 0;

    /* renamed from: b */
    public final C13573c f28300b;

    /* renamed from: c */
    public final CollageAlert f28301c;

    static {
        int i = CollageAlert.$stable;
    }

    public C12816d(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_ineligible_shipping, false));
        this.f28300b = cVar;
        View findViewById = this.itemView.findViewById(R.id.clg_ineligible_shipping_alert);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…neligible_shipping_alert)");
        this.f28301c = (CollageAlert) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C12812a) {
            this.f28301c.setMainButtonClickListener(new C9064o(this, 1));
            return;
        }
        throw new IllegalArgumentException();
    }
}
