package com.etsy.android.p327ui.core.listinggallery;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C6127f;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.core.listinggallery.C9643b;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.uikit.view.C11951f;
import com.etsy.android.uikit.view.draggable.DraggablePhotoViewWithShrink;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p302z4.C8448i;
import p455u9.C13448b;
import p487ya.C13895a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.listinggallery.ImageViewHolder */
public final class ImageViewHolder extends RecyclerView.C3084b0 implements C9679d {

    /* renamed from: b */
    public final int f21325b;

    /* renamed from: c */
    public final int f21326c;

    /* renamed from: d */
    public final C13895a f21327d;

    /* renamed from: e */
    public final C11951f f21328e;

    /* renamed from: f */
    public final C9643b.C9644a f21329f;

    /* renamed from: g */
    public final DraggablePhotoViewWithShrink f21330g;

    /* renamed from: h */
    public final View f21331h;

    /* renamed from: com.etsy.android.ui.core.listinggallery.ImageViewHolder$a */
    public static final class C9630a implements C6127f<Drawable> {

        /* renamed from: b */
        public final /* synthetic */ ImageViewHolder f21332b;

        public C9630a(ImageViewHolder imageViewHolder) {
            this.f21332b = imageViewHolder;
        }

        /* renamed from: f */
        public final boolean mo17169f(GlideException glideException, Object obj, C8448i iVar) {
            C19383o.m32797g(obj, "model");
            C19383o.m32797g(iVar, "target");
            return false;
        }

        /* renamed from: h */
        public final boolean mo17172h(Object obj, Object obj2, C8448i iVar, DataSource dataSource) {
            Drawable drawable = (Drawable) obj;
            C19383o.m32797g(obj2, "model");
            C19383o.m32797g(iVar, "target");
            C19383o.m32797g(dataSource, "dataSource");
            ViewExtensions.m12860d(this.f21332b.f21331h);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(ViewGroup viewGroup, int i, int i2, C13895a aVar, C11951f fVar, C9643b.C9644a aVar2) {
        super(C0114h.m305j0(viewGroup, R.layout.imageview_loading_photoview_listing_gallery, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(aVar, "fileSupport");
        C19383o.m32797g(fVar, "eventTracker");
        this.f21325b = i;
        this.f21326c = i2;
        this.f21327d = aVar;
        this.f21328e = fVar;
        this.f21329f = aVar2;
        View findViewById = this.itemView.findViewById(R.id.video_collage);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.video_collage)");
        View findViewById2 = this.itemView.findViewById(R.id.image);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.image)");
        DraggablePhotoViewWithShrink draggablePhotoViewWithShrink = (DraggablePhotoViewWithShrink) findViewById2;
        this.f21330g = draggablePhotoViewWithShrink;
        View findViewById3 = this.itemView.findViewById(R.id.activity_indicator);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.activity_indicator)");
        this.f21331h = findViewById3;
        ViewExtensions.m12860d((CollagePlayerView) findViewById);
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            public final /* synthetic */ ImageViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public void onViewAttachedToWindow(View view) {
                C19383o.m32797g(view, "p0");
            }

            public void onViewDetachedFromWindow(View view) {
                C19383o.m32797g(view, "p0");
                this.this$0.f21330g.cleanup();
            }
        });
        draggablePhotoViewWithShrink.getAttacher().setOnScaleChangeListener(fVar);
        draggablePhotoViewWithShrink.setImageDoubleTapListener(new C19846a<C19394m>(this) {
            public final /* synthetic */ ImageViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.f21328e.f26550a.mo21333d("listing_gallery_double_tap_to_zoom", (Map<? extends AnalyticsProperty, Object>) null);
            }
        });
        draggablePhotoViewWithShrink.setImageSwipeDownListener(new C19846a<C19394m>(this) {
            public final /* synthetic */ ImageViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.f21328e.f26550a.mo21333d("listing_gallery_swipe_to_dismiss", (Map<? extends AnalyticsProperty, Object>) null);
                C9643b.C9644a aVar = this.this$0.f21329f;
                if (aVar != null) {
                    aVar.onImageDismissed();
                }
                this.this$0.f21330g.cleanup();
            }
        });
        draggablePhotoViewWithShrink.setOnDragStartListener(new C19846a<C19394m>(this) {
            public final /* synthetic */ ImageViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                C9643b.C9644a aVar = this.this$0.f21329f;
                if (aVar != null) {
                    aVar.onDragStarted();
                }
            }
        });
        draggablePhotoViewWithShrink.setOnDragEndListener(new C19846a<C19394m>(this) {
            public final /* synthetic */ ImageViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                C9643b.C9644a aVar = this.this$0.f21329f;
                if (aVar != null) {
                    aVar.onDragStopped();
                }
            }
        });
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        view.setOnTouchListener(new C9642a(new GestureDetector(view.getContext(), new ImageViewHolder$createSingleTapListener$1()), new ScaleGestureDetector(view.getContext(), new ImageViewHolder$createPinchToZoomListener$1())));
    }

    /* renamed from: a */
    public final void mo32305a(Object obj) {
        String str;
        C19394m mVar;
        if (obj instanceof BaseModelImageCompat) {
            int i = this.f21325b;
            if (i <= 0 ? (str = ((BaseModelImageCompat) obj).getImageUrl()) == null : (str = ((BaseModelImageCompat) obj).getImageUrlForPixelWidth(i)) == null) {
                str = "";
            }
            this.f21327d.getClass();
            if (C13895a.m21420c(str)) {
                C13448b g0 = C0114h.m272C0(this.f21330g).load(str).mo17160t(new ColorDrawable(0)).mo16818O(new C9630a(this));
                C19383o.m32796f(g0, "override fun bind(item: …on.gone()\n        }\n    }");
                if (this.f21325b > 0 && this.f21326c > 0) {
                    int i2 = C8914m.m17347e(this.f21330g.getContext()) ? this.f21326c : this.f21325b;
                    C13448b bVar = (C13448b) g0.mo17158r(i2, i2);
                }
                g0.mo16816M(this.f21330g);
                return;
            }
            ViewExtensions.m12860d(this.f21331h);
            ViewExtensions.m12869m(this.itemView.findViewById(R.id.unsupported_view));
            View findViewById = this.itemView.findViewById(R.id.view_btn);
            C9643b.C9644a aVar = this.f21329f;
            if (aVar != null) {
                findViewById.setOnClickListener(new ImageViewHolder$bind$1$1(PredefinedAnalyticsProperty.URL, str, aVar));
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(findViewById);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo32306b() {
        this.f21330g.setScale(1.0f, true);
        this.f21330g.cleanup();
    }
}
