package com.etsy.android.shophome;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.uikit.viewholder.C12006r;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.collections.C19331x;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19543e0;
import p213q2.C7717a;
import p568fn.C17782b;

public final class ListingCardImagesAndVideoAdapter extends C7717a implements C8987a, C2885q {

    /* renamed from: d */
    public final C8672b f19831d;

    /* renamed from: e */
    public final boolean f19832e;

    /* renamed from: f */
    public ViewGroup f19833f;

    /* renamed from: g */
    public List<ListingImage> f19834g = EmptyList.INSTANCE;

    /* renamed from: h */
    public C12006r f19835h;

    /* renamed from: i */
    public int f19836i;

    /* renamed from: j */
    public CollagePlayerView f19837j;

    /* renamed from: k */
    public final LinkedHashMap f19838k = new LinkedHashMap();

    /* renamed from: l */
    public final LinkedHashMap f19839l = new LinkedHashMap();

    /* renamed from: m */
    public View f19840m;

    /* renamed from: n */
    public CollagePlayerView f19841n;

    /* renamed from: o */
    public float f19842o = 0.75f;

    /* renamed from: p */
    public ImageView.ScaleType f19843p = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: com.etsy.android.shophome.ListingCardImagesAndVideoAdapter$a */
    public /* synthetic */ class C8986a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19844a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            f19844a = iArr;
        }
    }

    public ListingCardImagesAndVideoAdapter(C8672b bVar, boolean z) {
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f19831d = bVar;
        this.f19832e = z;
    }

    /* renamed from: a */
    public final void mo30638a(float f) {
        this.f19842o = 1.0f;
    }

    /* renamed from: b */
    public final void mo30639b() {
        CollagePlayerView collagePlayerView = this.f19837j;
        if (collagePlayerView != null) {
            collagePlayerView.cleanUp();
        }
    }

    /* renamed from: c */
    public final ListingCardImagesAndVideoAdapter mo30640c() {
        return this;
    }

    /* renamed from: d */
    public final void mo30641d(ImageView.ScaleType scaleType) {
        C19383o.m32797g(scaleType, "<set-?>");
        this.f19843p = scaleType;
    }

    /* renamed from: e */
    public final void mo30642e(int i) {
        this.f19836i = i;
        if (mo30647w()) {
            CollagePlayerView collagePlayerView = this.f19837j;
            if (collagePlayerView != null && !collagePlayerView.isPlaying()) {
                collagePlayerView.resume();
                return;
            }
            return;
        }
        CollagePlayerView collagePlayerView2 = this.f19837j;
        boolean z = true;
        if (collagePlayerView2 == null || !collagePlayerView2.isPlaying()) {
            z = false;
        }
        if (z) {
            mo30646v();
        }
    }

    /* renamed from: f */
    public final void mo30643f(List<ListingImage> list) {
        C19383o.m32797g(list, "listingImages");
        this.f19834g = mo30645u(list, this.f19835h);
        ViewGroup viewGroup = this.f19833f;
        if (viewGroup != null) {
            Iterator<View> it = C19543e0.m33298O(viewGroup).iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                if (i >= 0) {
                    C19331x xVar = new C19331x(i, it.next());
                    ListingFullImageView listingFullImageView = (ListingFullImageView) ((View) xVar.f43191b).findViewById(R.id.image);
                    if (!listingFullImageView.isLoaded()) {
                        listingFullImageView.setImageInfo(list.get(xVar.f43190a));
                    }
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
        }
        mo20188p();
    }

    /* renamed from: g */
    public final void mo30644g(List<ListingImage> list, C12006r rVar) {
        this.f19835h = rVar;
        this.f19834g = mo30645u(list, rVar);
        mo20188p();
    }

    /* renamed from: h */
    public final void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        CollagePlayerView collagePlayerView;
        C19383o.m32797g(viewGroup, "container");
        C19383o.m32797g(obj, "view");
        viewGroup.removeView((View) obj);
        if (this.f19834g.get(i).isVideo() && (collagePlayerView = this.f19837j) != null) {
            collagePlayerView.cleanUp();
        }
    }

    /* renamed from: j */
    public final int mo20184j() {
        return this.f19834g.size();
    }

    /* renamed from: n */
    public final Object mo10625n(ViewGroup viewGroup, int i) {
        Lifecycle lifecycle;
        C19383o.m32797g(viewGroup, "container");
        this.f19833f = viewGroup;
        View inflate = View.inflate(viewGroup.getContext(), R.layout.listing_image_video_item, (ViewGroup) null);
        this.f19841n = (CollagePlayerView) inflate.findViewById(R.id.video_collage);
        ListingFullImageView listingFullImageView = (ListingFullImageView) inflate.findViewById(R.id.image);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.play_video_icon);
        this.f19840m = inflate.findViewById(R.id.loading_indicator);
        C2887s f0 = C15588c1.m25325f0(viewGroup);
        if (!(f0 == null || (lifecycle = f0.getLifecycle()) == null)) {
            lifecycle.mo10733a(this);
        }
        ListingImage listingImage = this.f19834g.get(i);
        if (!listingImage.isVideo() || !this.f19832e) {
            ViewExtensions.m12860d(this.f19841n);
            ViewExtensions.m12860d(this.f19840m);
            ViewExtensions.m12869m(listingFullImageView);
            listingFullImageView.setAspectRatio(this.f19842o);
            listingFullImageView.setScaleType(this.f19843p);
            listingFullImageView.setImageInfo(this.f19834g.get(i));
            if (!this.f19832e || i != 0 || this.f19835h == null) {
                ViewExtensions.m12860d(imageView);
            } else {
                ViewExtensions.m12869m(imageView);
            }
        } else {
            ViewExtensions.m12860d(listingFullImageView);
            ViewExtensions.m12860d(imageView);
            CollagePlayerView collagePlayerView = this.f19841n;
            if (collagePlayerView != null) {
                ViewExtensions.m12869m(collagePlayerView);
                collagePlayerView.setUseController(false);
                Uri parse = Uri.parse(listingImage.getVideoUrl());
                C19383o.m32796f(parse, "parse(listingImage.videoUrl)");
                collagePlayerView.setVideoURI(parse);
                collagePlayerView.setRepeating(true);
                collagePlayerView.setListener(new C8988b(this, collagePlayerView, parse));
                CollagePlayerView collagePlayerView2 = this.f19841n;
                this.f19837j = collagePlayerView2;
                if (i == this.f19836i && collagePlayerView2 != null && !collagePlayerView2.isPlaying()) {
                    collagePlayerView2.resume();
                }
            }
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: o */
    public final boolean mo10626o(View view, Object obj) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(obj, ResponseConstants.OBJECT);
        return C19383o.m32792b(obj, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r8 = (java.lang.Long) r6.f19838k.remove(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStateChanged(androidx.lifecycle.C2887s r7, androidx.lifecycle.Lifecycle.Event r8) {
        /*
            r6 = this;
            int[] r7 = com.etsy.android.shophome.ListingCardImagesAndVideoAdapter.C8986a.f19844a
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 1
            if (r7 == r8) goto L_0x004f
            r8 = 2
            if (r7 == r8) goto L_0x001a
            r8 = 3
            if (r7 == r8) goto L_0x0012
            goto L_0x0052
        L_0x0012:
            com.etsy.android.stylekit.views.CollagePlayerView r7 = r6.f19837j
            if (r7 == 0) goto L_0x0052
            r7.cleanUp()
            goto L_0x0052
        L_0x001a:
            com.etsy.android.stylekit.views.CollagePlayerView r7 = r6.f19837j
            if (r7 == 0) goto L_0x0052
            boolean r8 = r6.mo30647w()
            if (r8 == 0) goto L_0x0052
            android.net.Uri r8 = r7.getVideoURI()
            r0 = 0
            if (r8 == 0) goto L_0x003b
            java.util.LinkedHashMap r2 = r6.f19838k
            java.lang.Object r8 = r2.remove(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L_0x003b
            long r2 = r8.longValue()
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x004b
            long r4 = r7.currentPosition()
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x004b
            r7.seekTo(r2)
        L_0x004b:
            r7.resume()
            goto L_0x0052
        L_0x004f:
            r6.mo30646v()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.shophome.ListingCardImagesAndVideoAdapter.onStateChanged(androidx.lifecycle.s, androidx.lifecycle.Lifecycle$Event):void");
    }

    /* renamed from: u */
    public final List<ListingImage> mo30645u(List<ListingImage> list, C12006r rVar) {
        C12006r rVar2 = rVar;
        if (rVar2 == null || !this.f19832e) {
            return list;
        }
        ListingImage listingImage = new ListingImage((String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, 0, rVar2.f26761a, rVar2.f26762b, true, -1, 0, (DefaultConstructorMarker) null);
        ArrayList q1 = C19327t.m32661q1(list);
        q1.add(1, listingImage);
        return q1;
    }

    /* renamed from: v */
    public final void mo30646v() {
        CollagePlayerView collagePlayerView = this.f19837j;
        if (collagePlayerView != null && collagePlayerView.isPlaying()) {
            collagePlayerView.pause();
            long currentPosition = collagePlayerView.currentPosition();
            Uri videoURI = collagePlayerView.getVideoURI();
            if (videoURI != null) {
                this.f19838k.put(videoURI, Long.valueOf(currentPosition));
            }
        }
    }

    /* renamed from: w */
    public final boolean mo30647w() {
        if (this.f19834g.get(this.f19836i).isVideo()) {
            CollagePlayerView collagePlayerView = this.f19837j;
            if (collagePlayerView != null && !collagePlayerView.isPlaying()) {
                return true;
            }
        }
        return false;
    }
}
