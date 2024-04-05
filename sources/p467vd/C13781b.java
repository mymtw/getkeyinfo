package p467vd;

import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;

/* renamed from: vd.b */
public final class C13781b extends C10424k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13781b(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_space, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        C13780a aVar;
        if (jVar instanceof C13780a) {
            aVar = (C13780a) jVar;
        } else if (jVar instanceof C13783d) {
            C13783d dVar = (C13783d) jVar;
            int i = dVar.f30315a;
            aVar = i > 0 ? new C13780a(i) : new C13780a(dVar.f30316b);
        } else {
            throw new IllegalStateException();
        }
        this.itemView.setMinimumHeight(aVar.f30310a);
    }
}
