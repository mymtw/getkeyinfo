package p357gf;

import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.search.savedsearch.C8981e;
import com.etsy.android.uikit.viewholder.C12009u;
import java.util.List;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p456ua.C13458c;
import retrofit2.C20145v;

/* renamed from: gf.e */
public final class C12796e implements C12009u {

    /* renamed from: a */
    public final C12795d f28268a;

    public C12796e(C12795d dVar) {
        this.f28268a = dVar;
    }

    /* renamed from: a */
    public final C19211l mo38889a(long j, long j2) {
        C8071s<C20145v<List<ListingImage>>> a = this.f28268a.mo45568a(j, j2);
        C13458c cVar = new C13458c(this, 7);
        a.getClass();
        return new C19211l(new C19208j(a, cVar), new C8981e(4));
    }
}
