package com.etsy.android.uikit.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.models.ISupportsListingVideo;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.uikit.adapter.C11840k;
import com.etsy.android.uikit.util.EtsyImageUrlManipulator$ImageSize;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.uikit.zoom.C12030b;
import com.etsy.android.uikit.zoom.C12031c;
import com.etsy.android.uikit.zoom.ZoomTouchListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p173m.C7279a;
import p487ya.C13895a;

/* renamed from: com.etsy.android.uikit.adapter.l */
public class C11842l extends C11840k<ListingImage> {

    /* renamed from: l */
    public final ImageView.ScaleType f26329l;

    /* renamed from: m */
    public final boolean f26330m;

    /* renamed from: n */
    public final boolean f26331n = true;

    /* renamed from: o */
    public int f26332o;

    /* renamed from: p */
    public C11840k.C11841a f26333p;

    /* renamed from: q */
    public final C11850r<ListingImage> f26334q = new C11850r<>(this, new ListingImagesPagerAdapter$supportVideoViewDelegate$1(this));

    /* renamed from: r */
    public boolean f26335r;

    /* renamed from: com.etsy.android.uikit.adapter.l$a */
    public static final class C11843a {
        /* renamed from: a */
        public static int m19524a(ListingImage listingImage, int i) {
            if (listingImage.getFullWidth() <= 0 || listingImage.getFullHeight() <= 0) {
                return -1;
            }
            float fullWidth = (((float) listingImage.getFullWidth()) / ((float) listingImage.getFullHeight())) * ((float) i);
            if (!(!Float.isInfinite(fullWidth) && !Float.isNaN(fullWidth)) || fullWidth >= 2.14748365E9f) {
                return -1;
            }
            return C7279a.m13954l(fullWidth);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11842l(BOEActivity bOEActivity, ImageView.ScaleType scaleType, C13895a aVar, boolean z) {
        super(bOEActivity, aVar);
        C19383o.m32797g(bOEActivity, "activity");
        C19383o.m32797g(scaleType, "imageViewScaleType");
        C19383o.m32797g(aVar, "fileSupport");
        this.f26329l = scaleType;
        this.f26330m = z;
    }

    /* renamed from: A */
    public static final String m19513A(C11842l lVar, ListingImage listingImage, int i, int i2) {
        String str;
        if (i == 0 || i2 == 0 || !lVar.f26330m) {
            String v = super.mo38314v(listingImage);
            C19383o.m32796f(v, "{\n            super.getImageUrl(image)\n        }");
            return v;
        }
        int a = C11843a.m19524a(listingImage, i2);
        if (a == -1 || a <= 0) {
            str = super.mo38314v(listingImage);
        } else {
            String imageUrl = listingImage.getImageUrl();
            String size = EtsyImageUrlManipulator$ImageSize.SIZE_570xN.getSize();
            int a2 = C11843a.m19524a(listingImage, i2);
            C19383o.m32797g(imageUrl, "url");
            C19383o.m32797g(size, "fromSize");
            String a1 = C19457k.m33023a1(imageUrl, "/d/il", "/r/il", false);
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append('x');
            sb.append(i2);
            String sb2 = sb.toString();
            C19383o.m32797g(sb2, "toSize");
            str = C19457k.m33023a1(a1, size, sb2, false);
        }
        C19383o.m32796f(str, "{\n            // we coul…)\n            }\n        }");
        return str;
    }

    /* renamed from: B */
    public final ListingVideoPosition mo38319B() {
        CollagePlayerView collagePlayerView;
        Uri videoURI;
        C11850r<ListingImage> rVar = this.f26334q;
        Iterator it = rVar.f26348d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                collagePlayerView = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            BaseModelImageCompat baseModelImageCompat = (BaseModelImageCompat) rVar.f26345a.f26322e.get(((Number) entry.getValue()).intValue());
            if ((baseModelImageCompat instanceof ISupportsListingVideo) && ((ISupportsListingVideo) baseModelImageCompat).isVideo()) {
                C19383o.m32795e(key, "null cannot be cast to non-null type android.view.View");
                collagePlayerView = (CollagePlayerView) ((View) key).findViewById(R.id.video_collage);
                break;
            }
        }
        if (collagePlayerView != null && collagePlayerView.isPlaying()) {
            long currentPosition = collagePlayerView.currentPosition();
            if (currentPosition > 0 && (videoURI = collagePlayerView.getVideoURI()) != null) {
                return new ListingVideoPosition(videoURI, currentPosition);
            }
        }
        Map.Entry entry2 = (Map.Entry) C19327t.m32639U0(rVar.f26349e.entrySet());
        if (entry2 != null) {
            return new ListingVideoPosition((Uri) entry2.getKey(), ((Number) entry2.getValue()).longValue());
        }
        return null;
    }

    /* renamed from: C */
    public final void mo38320C() {
        C11850r<ListingImage> rVar = this.f26334q;
        for (Map.Entry entry : rVar.f26348d.entrySet()) {
            Object key = entry.getKey();
            BaseModelImageCompat baseModelImageCompat = (BaseModelImageCompat) rVar.f26345a.f26322e.get(((Number) entry.getValue()).intValue());
            if ((baseModelImageCompat instanceof ISupportsListingVideo) && ((ISupportsListingVideo) baseModelImageCompat).isVideo()) {
                C19383o.m32795e(key, "null cannot be cast to non-null type android.view.View");
                CollagePlayerView collagePlayerView = (CollagePlayerView) ((View) key).findViewById(R.id.video_collage);
                C19383o.m32796f(collagePlayerView, "videoView");
                Uri videoURI = collagePlayerView.getVideoURI();
                if (videoURI != null) {
                    rVar.f26349e.put(videoURI, Long.valueOf(collagePlayerView.currentPosition()));
                }
                collagePlayerView.pause();
            }
        }
    }

    /* renamed from: D */
    public final void mo38321D() {
        C11850r<ListingImage> rVar = this.f26334q;
        for (Map.Entry entry : rVar.f26348d.entrySet()) {
            Object key = entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            BaseModelImageCompat baseModelImageCompat = (BaseModelImageCompat) rVar.f26345a.f26322e.get(intValue);
            if ((baseModelImageCompat instanceof ISupportsListingVideo) && ((ISupportsListingVideo) baseModelImageCompat).isVideo()) {
                C19383o.m32795e(key, "null cannot be cast to non-null type android.view.View");
                CollagePlayerView collagePlayerView = (CollagePlayerView) ((View) key).findViewById(R.id.video_collage);
                if (intValue == rVar.f26345a.f26328k) {
                    C19383o.m32796f(collagePlayerView, "videoView");
                    rVar.mo38330a(collagePlayerView);
                }
            }
        }
    }

    /* renamed from: E */
    public final void mo38322E(ArrayList arrayList) {
        this.f26334q.f26348d.clear();
        this.f26322e.clear();
        if (arrayList != null) {
            this.f26322e.addAll(arrayList);
        }
        mo20188p();
    }

    /* renamed from: h */
    public final void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        C19383o.m32797g(viewGroup, "container");
        C19383o.m32797g(obj, "view");
        super.mo10623h(viewGroup, i, obj);
        ListingFullImageView listingFullImageView = (ListingFullImageView) ((View) obj).findViewById(R.id.image);
        C19383o.m32796f(listingFullImageView, "imageView");
        listingFullImageView.setOnTouchListener((View.OnTouchListener) null);
        C11850r<ListingImage> rVar = this.f26334q;
        rVar.getClass();
        CollagePlayerView collagePlayerView = (CollagePlayerView) viewGroup.findViewById(R.id.video_collage);
        if (collagePlayerView != null) {
            collagePlayerView.cleanUp();
        }
        rVar.f26348d.remove(viewGroup);
    }

    /* renamed from: n */
    public Object mo10625n(ViewGroup viewGroup, int i) {
        View view;
        C19383o.m32797g(viewGroup, "container");
        C11850r<ListingImage> rVar = this.f26334q;
        rVar.getClass();
        BaseModelImageCompat baseModelImageCompat = (BaseModelImageCompat) rVar.f26345a.f26322e.get(i);
        if (baseModelImageCompat instanceof ISupportsListingVideo) {
            ISupportsListingVideo iSupportsListingVideo = (ISupportsListingVideo) baseModelImageCompat;
            if (iSupportsListingVideo.isVideo()) {
                view = rVar.f26345a.mo38316x(LayoutInflater.from(viewGroup.getContext()), viewGroup);
                C19383o.m32796f(view, "adapter.getLayout(Layout…iner.context), container)");
                CollagePlayerView collagePlayerView = (CollagePlayerView) view.findViewById(R.id.video_collage);
                View findViewById = view.findViewById(R.id.activity_indicator);
                C11840k<T> kVar = rVar.f26345a;
                View videoSurfaceView = collagePlayerView.getVideoSurfaceView();
                kVar.getClass();
                videoSurfaceView.setOnClickListener(new C11836g(kVar, i));
                rVar.f26345a.mo38313u(i, collagePlayerView.getVideoSurfaceView());
                ViewExtensions.m12860d((ImageView) view.findViewById(R.id.image));
                ViewExtensions.m12869m(collagePlayerView);
                Uri parse = Uri.parse(iSupportsListingVideo.getVideoUrl());
                C19383o.m32796f(parse, "parse(image.videoUrl)");
                collagePlayerView.setVideoURI(parse);
                collagePlayerView.setRepeating(true);
                collagePlayerView.setListener(new C11849q(collagePlayerView, findViewById));
                if (i == rVar.f26345a.f26328k) {
                    rVar.mo38330a(collagePlayerView);
                }
                viewGroup.addView(view);
                rVar.f26348d.put(view, Integer.valueOf(i));
                return view;
            }
        }
        view = rVar.f26345a.mo38318z(viewGroup, i);
        ViewExtensions.m12860d(view.findViewById(R.id.video_collage));
        rVar.f26348d.put(view, Integer.valueOf(i));
        return view;
    }

    /* renamed from: v */
    public final String mo38314v(BaseModelImageCompat baseModelImageCompat) {
        C19383o.m32797g((ListingImage) baseModelImageCompat, ResponseConstants.IMAGE);
        return "";
    }

    /* renamed from: w */
    public final ImageView mo38315w(int i, View view) {
        ImageView.ScaleType scaleType;
        ListingFullImageView listingFullImageView = (ListingFullImageView) view.findViewById(R.id.image);
        ListingImage listingImage = (ListingImage) this.f26322e.get(i);
        listingFullImageView.setAspectRatio(-3423432.0f);
        C19383o.m32795e(listingImage, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.listing.ListingImage");
        listingFullImageView.setImageInfo(listingImage);
        listingFullImageView.setImageLoadedListener(new C11846o(this, listingImage, view));
        boolean z = true;
        if (!listingImage.isVideo()) {
            String altText = listingImage.getAltText();
            if (altText != null) {
                if (!(altText.length() > 0)) {
                    altText = null;
                }
                if (altText != null) {
                    listingFullImageView.setContentDescription(listingFullImageView.getContext().getString(R.string.listing_image_al_text_desc, new Object[]{altText, Integer.valueOf(i + 1), Integer.valueOf(this.f26322e.size())}));
                }
            }
            listingFullImageView.setContentDescription(listingFullImageView.getContext().getString(R.string.listing_image_desc, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(this.f26322e.size())}));
        }
        listingFullImageView.setLoadProgressiveJpegs(this.f26335r);
        if (i != 0 || !this.f26331n) {
            listingFullImageView.setScaleType(this.f26329l);
        } else {
            T t = this.f26322e.get(0);
            C19383o.m32795e(t, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.listing.ListingImage");
            Context context = listingFullImageView.getContext();
            C19383o.m32796f(context, "imageView.context");
            C11833d dVar = new C11833d((ListingImage) t, context);
            if (!(dVar.mo38309a() == 1.0f)) {
                if (dVar.mo38309a() != 0.8f) {
                    z = false;
                }
                if (!z) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                    listingFullImageView.setScaleType(scaleType);
                }
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
            listingFullImageView.setScaleType(scaleType);
        }
        int i2 = this.f26332o;
        if (i2 > 0) {
            listingFullImageView.setBackgroundColor(i2);
        }
        ViewExtensions.m12866j(listingFullImageView, new ListingImagesPagerAdapter$activateZoom$1(this, i));
        C11845n nVar = new C11845n(this, i);
        C11844m mVar = new C11844m(this, i);
        Activity activity = (Activity) this.f26321d.get();
        if (activity != null) {
            Window window = activity.getWindow();
            C19383o.m32796f(window, "it.window");
            C12031c cVar = new C12031c(0);
            View decorView = window.getDecorView();
            C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            listingFullImageView.setOnTouchListener(new ZoomTouchListener((ViewGroup) decorView, listingFullImageView, cVar, (C12030b) null, mVar, nVar));
        }
        return listingFullImageView;
    }

    /* renamed from: x */
    public final View mo38316x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C19383o.m32797g(layoutInflater, "inflater");
        C19383o.m32797g(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.imageview_loading_full_imageview, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…geview, container, false)");
        return inflate;
    }

    /* renamed from: y */
    public final int mo38317y(BaseModelImageCompat baseModelImageCompat) {
        ListingImage listingImage = (ListingImage) baseModelImageCompat;
        C19383o.m32797g(listingImage, ResponseConstants.IMAGE);
        int i = this.f26332o;
        return i != 0 ? i : listingImage.getImageColor();
    }
}
