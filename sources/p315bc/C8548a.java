package p315bc;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.saveforlater.C9361f;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p308ac.C8497a;

/* renamed from: bc.a */
public final class C8548a extends C9361f {

    /* renamed from: b */
    public final TextView f18617b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8548a(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.item_sfl_none, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.text_sfl_none);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_sfl_none)");
        this.f18617b = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo21074e(C8497a aVar) {
        TextView textView = this.f18617b;
        StringBuilder h = C0072d.m201h("Missing ViewHolder or viewtype() implementation for ");
        h.append(C19386q.m32807a(aVar.getClass()).mo71918b());
        textView.setText(h.toString());
    }
}
