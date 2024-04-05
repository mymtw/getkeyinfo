package p407nf;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.stylekit.views.FavHeartButton;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: nf.a */
public abstract class C13113a extends C13171a<ListingLike> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13113a(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
    }

    /* renamed from: d */
    public abstract void mo31348d(ListingCard listingCard, FavHeartButton favHeartButton, int i);

    /* renamed from: e */
    public abstract void mo31349e(ListingLike listingLike, boolean z, Bundle bundle);

    /* renamed from: f */
    public abstract void mo31350f(ListingCard listingCard);
}
