package com.etsy.android.p327ui.core.listinggallery;

import android.net.Uri;
import com.etsy.android.p327ui.core.listinggallery.ListingImageGalleryFragment;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.listinggallery.VideoViewHolder$progressRunnable$2 */
public final class VideoViewHolder$progressRunnable$2 extends Lambda implements C19846a<C9641a> {
    public final /* synthetic */ VideoViewHolder this$0;

    /* renamed from: com.etsy.android.ui.core.listinggallery.VideoViewHolder$progressRunnable$2$a */
    public static final class C9641a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ VideoViewHolder f21355b;

        public C9641a(VideoViewHolder videoViewHolder) {
            this.f21355b = videoViewHolder;
        }

        public final void run() {
            VideoViewHolder videoViewHolder = this.f21355b;
            ListingImageGalleryFragment.C9632b bVar = videoViewHolder.f21351g;
            if (bVar != null && videoViewHolder.f21348d.isPlaying()) {
                ListingVideoPosition copy$default = ListingVideoPosition.copy$default(bVar.f21334b, (Uri) null, videoViewHolder.f21348d.currentPosition(), 1, (Object) null);
                C19383o.m32797g(copy$default, "<set-?>");
                bVar.f21334b = copy$default;
            }
            this.f21355b.itemView.postDelayed(this, 100);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoViewHolder$progressRunnable$2(VideoViewHolder videoViewHolder) {
        super(0);
        this.this$0 = videoViewHolder;
    }

    public final C9641a invoke() {
        return new C9641a(this.this$0);
    }
}
