package p369id;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a;
import java.util.Iterator;
import p466vc.C13574d;

/* renamed from: id.c */
public final class C12935c {
    /* renamed from: a */
    public static C13574d m20639a(ListingViewState.C10092d dVar) {
        Iterator it = dVar.mo33485m().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C10423j jVar = (C10423j) it.next();
            if ((jVar instanceof C10279a) || (jVar instanceof C10285a)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return C13574d.C13575a.f29662a;
        }
        if (i > 0) {
            i--;
        }
        return new C13574d.C13576b.C13587k(i);
    }
}
