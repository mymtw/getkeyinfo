package p382kd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.listingpanel.SaleEndsSoonBadgePicker;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;
import p368ic.C12930a;

/* renamed from: kd.b */
public final class C12994b extends C10424k {

    /* renamed from: b */
    public final C12930a f28604b = new C12930a(new SaleEndsSoonBadgePicker());

    /* renamed from: c */
    public final TextView f28605c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12994b(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_sale_ending_soon_badge, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.text_sale_ends_soon);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_sale_ends_soon)");
        this.f28605c = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C12992a) {
            this.f28604b.mo45704a(this.f28605c, ((C12992a) jVar).f28603a, false);
            return;
        }
        throw new IllegalArgumentException();
    }
}
