package com.etsy.android.uikit.adapter;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.models.ISupportsListingVideo;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.listing.viewholders.ListingImagesViewHolder;
import com.etsy.android.stylekit.views.CollagePlayerView;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p487ya.C13895a;

/* renamed from: com.etsy.android.uikit.adapter.p */
public final class C11847p extends C11842l {

    /* renamed from: s */
    public C11848a f26342s;

    /* renamed from: com.etsy.android.uikit.adapter.p$a */
    public interface C11848a {
        /* renamed from: a */
        void mo34365a(int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11847p(BOEActivity bOEActivity, ImageView.ScaleType scaleType, C13895a aVar, C8618c cVar, boolean z, ListingImagesViewHolder.C10669b bVar) {
        super(bOEActivity, scaleType, aVar, z);
        C19383o.m32797g(bOEActivity, "activity");
        C19383o.m32797g(scaleType, "scaleType");
        C19383o.m32797g(aVar, "fileSupport");
        C19383o.m32797g(cVar, "configMap");
        this.f26342s = bVar;
    }

    /* renamed from: F */
    public final int mo38327F() {
        return super.mo20184j();
    }

    /* renamed from: G */
    public final void mo38328G(int i) {
        int j = i % super.mo20184j();
        this.f26328k = j;
        C11850r<ListingImage> rVar = this.f26334q;
        for (Map.Entry entry : rVar.f26348d.entrySet()) {
            Object key = entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            BaseModelImageCompat baseModelImageCompat = (BaseModelImageCompat) rVar.f26345a.f26322e.get(intValue);
            if ((baseModelImageCompat instanceof ISupportsListingVideo) && ((ISupportsListingVideo) baseModelImageCompat).isVideo()) {
                C19383o.m32795e(key, "null cannot be cast to non-null type android.view.View");
                CollagePlayerView collagePlayerView = (CollagePlayerView) ((View) key).findViewById(R.id.video_collage);
                if (intValue == j) {
                    C19383o.m32796f(collagePlayerView, "videoViewCollage");
                    rVar.mo38330a(collagePlayerView);
                } else {
                    C19383o.m32796f(collagePlayerView, "videoViewCollage");
                    Uri videoURI = collagePlayerView.getVideoURI();
                    if (videoURI != null) {
                        rVar.f26349e.put(videoURI, Long.valueOf(collagePlayerView.currentPosition()));
                    }
                    collagePlayerView.pause();
                }
            }
        }
        C11848a aVar = this.f26342s;
        if (aVar != null) {
            aVar.mo34365a(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r3 % super.mo20184j();
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo38329H(int r3) {
        /*
            r2 = this;
            int r0 = super.mo20184j()
            r1 = 0
            if (r0 > 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = super.mo20184j()
            int r3 = r3 % r0
            java.util.ArrayList<T> r0 = r2.f26322e
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0024
            java.util.ArrayList<T> r0 = r2.f26322e
            java.lang.Object r3 = r0.get(r3)
            com.etsy.android.lib.models.apiv3.listing.ListingImage r3 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r3
            boolean r3 = r3.isVideo()
            if (r3 == 0) goto L_0x0024
            r1 = 1
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.adapter.C11847p.mo38329H(int):boolean");
    }

    /* renamed from: j */
    public final int mo20184j() {
        if (super.mo20184j() <= 1) {
            return super.mo20184j();
        }
        return 20000;
    }

    /* renamed from: n */
    public final Object mo10625n(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, "container");
        return super.mo10625n(viewGroup, i % super.mo20184j());
    }
}
