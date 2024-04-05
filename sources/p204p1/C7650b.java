package p204p1;

import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.fragment.app.strictmode.Violation;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10453a;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.MoreFromShopRowViewHolder;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.uikit.viewholder.C12007s;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: p1.b */
public final /* synthetic */ class C7650b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f16948b;

    /* renamed from: c */
    public final /* synthetic */ Object f16949c;

    /* renamed from: d */
    public final /* synthetic */ Object f16950d;

    public /* synthetic */ C7650b(int i, Object obj, Object obj2) {
        this.f16948b = i;
        this.f16949c = obj;
        this.f16950d = obj2;
    }

    public final void run() {
        switch (this.f16948b) {
            case 0:
                Violation violation = (Violation) this.f16950d;
                C19383o.m32797g(violation, "$violation");
                Log.e("FragmentStrictMode", C19383o.m32802l((String) this.f16949c, "Policy violation with PENALTY_DEATH in "), violation);
                throw violation;
            case 1:
                C12007s sVar = (C12007s) this.f16949c;
                C10453a aVar = (C10453a) this.f16950d;
                int i = MoreFromShopRowViewHolder.f22931i;
                C19383o.m32797g(sVar, "$cardView");
                C19383o.m32797g(aVar, "$listing");
                ListingFullImageView a = sVar.mo38877a();
                a.setImageDrawable((Drawable) null);
                a.setImageInfo(aVar.f22945g);
                return;
            default:
                C0023f.m114o(this.f16949c);
                int i2 = AdsMediaSource.f31768j;
                throw null;
        }
    }
}
