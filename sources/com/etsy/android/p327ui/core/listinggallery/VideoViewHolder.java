package com.etsy.android.p327ui.core.listinggallery;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.listinggallery.C9643b;
import com.etsy.android.p327ui.core.listinggallery.ListingImageGalleryFragment;
import com.etsy.android.p327ui.core.listinggallery.VideoViewHolder$progressRunnable$2;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import com.etsy.android.uikit.view.C11951f;
import com.etsy.android.uikit.view.draggable.DraggablePhotoViewWithShrink;
import com.etsy.android.uikit.view.draggable.DraggableViewDelegateWithShrink;
import com.google.android.exoplayer2.ExoPlaybackException;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p594jh.C17884a1;

/* renamed from: com.etsy.android.ui.core.listinggallery.VideoViewHolder */
public final class VideoViewHolder extends RecyclerView.C3084b0 implements C9679d {

    /* renamed from: b */
    public final C11951f f21346b;

    /* renamed from: c */
    public final C9643b.C9644a f21347c;

    /* renamed from: d */
    public final CollagePlayerView f21348d;

    /* renamed from: e */
    public final DraggablePhotoViewWithShrink f21349e;

    /* renamed from: f */
    public final View f21350f;

    /* renamed from: g */
    public ListingImageGalleryFragment.C9632b f21351g;

    /* renamed from: h */
    public final C19285c f21352h = C19350d.m32677b(new VideoViewHolder$progressRunnable$2(this));

    /* renamed from: i */
    public DraggableViewDelegateWithShrink f21353i;

    /* renamed from: com.etsy.android.ui.core.listinggallery.VideoViewHolder$a */
    public static final class C9640a implements C17884a1.C17888d {

        /* renamed from: b */
        public final /* synthetic */ VideoViewHolder f21354b;

        public C9640a(VideoViewHolder videoViewHolder) {
            this.f21354b = videoViewHolder;
        }

        public final void onPlaybackStateChanged(int i) {
            if (i == 2) {
                ViewExtensions.m12869m(this.f21354b.f21350f);
                ViewExtensions.m12869m(this.f21354b.f21348d);
            } else if (i != 3) {
                ViewExtensions.m12860d(this.f21354b.f21350f);
                ViewExtensions.m12860d(this.f21354b.f21348d);
            } else {
                ViewExtensions.m12860d(this.f21354b.f21350f);
                ViewExtensions.m12869m(this.f21354b.f21348d);
            }
        }

        public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C19383o.m32797g(exoPlaybackException, "error");
            ViewExtensions.m12869m(this.f21354b.f21350f);
            ViewExtensions.m12860d(this.f21354b.f21348d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoViewHolder(ViewGroup viewGroup, C11951f fVar, C9643b.C9644a aVar) {
        super(C0114h.m305j0(viewGroup, R.layout.imageview_loading_photoview_listing_gallery, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(fVar, "eventTracker");
        this.f21346b = fVar;
        this.f21347c = aVar;
        View findViewById = this.itemView.findViewById(R.id.video_collage);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.video_collage)");
        this.f21348d = (CollagePlayerView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.image);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.image)");
        DraggablePhotoViewWithShrink draggablePhotoViewWithShrink = (DraggablePhotoViewWithShrink) findViewById2;
        this.f21349e = draggablePhotoViewWithShrink;
        View findViewById3 = this.itemView.findViewById(R.id.activity_indicator);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.activity_indicator)");
        this.f21350f = findViewById3;
        ViewExtensions.m12860d(draggablePhotoViewWithShrink);
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            public final /* synthetic */ VideoViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public void onViewAttachedToWindow(View view) {
                C19383o.m32797g(view, "p0");
            }

            public void onViewDetachedFromWindow(View view) {
                C19383o.m32797g(view, "p0");
                DraggableViewDelegateWithShrink draggableViewDelegateWithShrink = this.this$0.f21353i;
                if (draggableViewDelegateWithShrink != null) {
                    draggableViewDelegateWithShrink.cleanup();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo32305a(Object obj) {
        if (obj instanceof ListingImageGalleryFragment.C9632b) {
            ListingImageGalleryFragment.C9632b bVar = (ListingImageGalleryFragment.C9632b) obj;
            this.f21351g = bVar;
            this.f21349e.setImportantForAccessibility(2);
            CollagePlayerView collagePlayerView = this.f21348d;
            ViewExtensions.m12869m(collagePlayerView);
            Uri parse = Uri.parse(bVar.f21333a.getVideoUrl());
            C19383o.m32796f(parse, "parse(item.video.videoUrl)");
            collagePlayerView.setVideoURI(parse);
            collagePlayerView.setRepeating(true);
            collagePlayerView.setListener(new C9640a(this));
            DraggableViewDelegateWithShrink draggableViewDelegateWithShrink = this.f21353i;
            if (draggableViewDelegateWithShrink != null) {
                draggableViewDelegateWithShrink.cleanup();
            }
            DraggableViewDelegateWithShrink draggableViewDelegateWithShrink2 = new DraggableViewDelegateWithShrink(this.f21348d);
            draggableViewDelegateWithShrink2.setSwipeDownListener(new VideoViewHolder$bind$2$1(this, draggableViewDelegateWithShrink2));
            draggableViewDelegateWithShrink2.setOnDragStartListener(new VideoViewHolder$bind$2$2(this));
            draggableViewDelegateWithShrink2.setOnDragEndListener(new VideoViewHolder$bind$2$3(this));
            this.f21353i = draggableViewDelegateWithShrink2;
            RecyclerView.Adapter<? extends RecyclerView.C3084b0> bindingAdapter = getBindingAdapter();
            C9643b bVar2 = bindingAdapter instanceof C9643b ? (C9643b) bindingAdapter : null;
            if (bVar2 != null && bVar2.f21363g == getBindingAdapterPosition()) {
                mo32338f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo32306b() {
        this.itemView.removeCallbacks((VideoViewHolder$progressRunnable$2.C9641a) this.f21352h.getValue());
        DraggableViewDelegateWithShrink draggableViewDelegateWithShrink = this.f21353i;
        if (draggableViewDelegateWithShrink != null) {
            draggableViewDelegateWithShrink.cleanup();
        }
        this.f21348d.setListener((C17884a1.C17888d) null);
        this.f21348d.cleanUp();
        this.f21351g = null;
    }

    /* renamed from: e */
    public final void mo32337e() {
        ListingImageGalleryFragment.C9632b bVar;
        this.itemView.removeCallbacks((VideoViewHolder$progressRunnable$2.C9641a) this.f21352h.getValue());
        if (this.f21348d.isPlaying() && (bVar = this.f21351g) != null) {
            ListingVideoPosition copy$default = ListingVideoPosition.copy$default(bVar.f21334b, (Uri) null, this.f21348d.currentPosition(), 1, (Object) null);
            C19383o.m32797g(copy$default, "<set-?>");
            bVar.f21334b = copy$default;
        }
        this.f21348d.pause();
    }

    /* renamed from: f */
    public final void mo32338f() {
        ListingImageGalleryFragment.C9632b bVar = this.f21351g;
        if (bVar != null) {
            long currentPosition = bVar.f21334b.getCurrentPosition();
            if (currentPosition > 0) {
                this.f21348d.seekTo(currentPosition);
            }
            this.f21348d.resume();
            C9643b.C9644a aVar = this.f21347c;
            if (aVar != null) {
                aVar.onVideoStarted();
            }
            this.itemView.postDelayed((VideoViewHolder$progressRunnable$2.C9641a) this.f21352h.getValue(), 100);
        }
    }
}
