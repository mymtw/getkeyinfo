package p406nd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;

/* renamed from: nd.b */
public final class C13112b extends C10424k {

    /* renamed from: b */
    public final TextView f28833b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13112b(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_unit_pricing, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.text_unit_price);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_unit_price)");
        this.f28833b = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C13111a) {
            this.f28833b.setText(((C13111a) jVar).f28832a);
            return;
        }
        throw new IllegalStateException();
    }
}
