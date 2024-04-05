package com.etsy.android.shophome;

import android.net.Uri;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p594jh.C17884a1;

/* renamed from: com.etsy.android.shophome.b */
public final class C8988b implements C17884a1.C17888d {

    /* renamed from: b */
    public final /* synthetic */ ListingCardImagesAndVideoAdapter f19845b;

    /* renamed from: c */
    public final /* synthetic */ CollagePlayerView f19846c;

    /* renamed from: d */
    public final /* synthetic */ Uri f19847d;

    public C8988b(ListingCardImagesAndVideoAdapter listingCardImagesAndVideoAdapter, CollagePlayerView collagePlayerView, Uri uri) {
        this.f19845b = listingCardImagesAndVideoAdapter;
        this.f19846c = collagePlayerView;
        this.f19847d = uri;
    }

    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            ViewExtensions.m12869m(this.f19845b.f19840m);
            ViewExtensions.m12869m(this.f19846c);
        } else if (i != 3) {
            ViewExtensions.m12860d(this.f19845b.f19840m);
            ViewExtensions.m12860d(this.f19846c);
        } else {
            ViewExtensions.m12860d(this.f19845b.f19840m);
            ViewExtensions.m12869m(this.f19846c);
        }
    }

    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        C19383o.m32797g(exoPlaybackException, "error");
        ViewExtensions.m12869m(this.f19845b.f19840m);
        ViewExtensions.m12860d(this.f19846c);
    }

    public final void onPositionDiscontinuity(C17884a1.C17889e eVar, C17884a1.C17889e eVar2, int i) {
        C19383o.m32797g(eVar, "oldPosition");
        C19383o.m32797g(eVar2, "newPosition");
        if (eVar2.f38848e == 0) {
            this.f19845b.f19831d.mo21333d("listing_card_video_did_loop", (Map<? extends AnalyticsProperty, Object>) null);
            if (this.f19845b.f19839l.get(this.f19847d) == null) {
                this.f19845b.f19831d.mo21333d("listing_card_video_did_finish_first_play", (Map<? extends AnalyticsProperty, Object>) null);
                this.f19845b.f19839l.put(this.f19847d, Boolean.TRUE);
            }
        }
    }
}
