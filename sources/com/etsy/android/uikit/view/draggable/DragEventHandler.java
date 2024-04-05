package com.etsy.android.uikit.view.draggable;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.C0342q0;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.uikit.view.draggable.C11943b;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p166l1.C7218b;
import p166l1.C7233d;

public final class DragEventHandler {

    /* renamed from: a */
    public final ViewGroup f26504a;

    /* renamed from: b */
    public final View f26505b;

    /* renamed from: c */
    public final C11949d f26506c;

    /* renamed from: d */
    public float f26507d;

    /* renamed from: e */
    public C11943b f26508e = C11943b.C11947d.f26549a;

    /* renamed from: f */
    public float f26509f;

    /* renamed from: g */
    public ImageView f26510g;

    /* renamed from: h */
    public C7233d f26511h;

    /* renamed from: i */
    public Point f26512i;

    /* renamed from: j */
    public final C19285c f26513j;

    /* renamed from: k */
    public final C19285c f26514k;

    /* renamed from: l */
    public final C0342q0 f26515l;

    public DragEventHandler(ViewGroup viewGroup, View view, C11949d dVar) {
        C19383o.m32797g(view, "target");
        this.f26504a = viewGroup;
        this.f26505b = view;
        this.f26506c = dVar;
        Context context = view.getContext();
        C19383o.m32796f(context, "target.context");
        this.f26509f = (float) C19543e0.m33295K(6, context);
        this.f26512i = new Point();
        this.f26513j = C19350d.m32677b(new DragEventHandler$dragDiffThreshold$2(this));
        this.f26514k = C19350d.m32677b(DragEventHandler$interpolator$2.INSTANCE);
        this.f26515l = new C0342q0(this, 4);
    }

    /* renamed from: a */
    public final void mo38662a(float f, float f2) {
        ImageView imageView;
        C11943b bVar = this.f26508e;
        if (C19383o.m32792b(bVar, C11943b.C11945b.f26547a)) {
            if (Math.abs(f) <= this.f26509f) {
                if (this.f26510g == null) {
                    View view = this.f26505b;
                    if (view instanceof PhotoView) {
                        PhotoView photoView = (PhotoView) view;
                        ImageView imageView2 = new ImageView(photoView.getContext());
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(photoView.getWidth(), photoView.getHeight()));
                        imageView2.setImageBitmap(C15588c1.m25323e0(view));
                        Point y0 = C15588c1.m25358y0(view);
                        this.f26512i = y0;
                        imageView2.setX((float) y0.x);
                        imageView2.setY((float) this.f26512i.y);
                        this.f26510g = imageView2;
                    } else if (view instanceof CollagePlayerView) {
                        CollagePlayerView collagePlayerView = (CollagePlayerView) view;
                        ImageView imageView3 = new ImageView(collagePlayerView.getContext());
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(collagePlayerView.getWidth(), collagePlayerView.getHeight()));
                        collagePlayerView.pause();
                        imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        imageView3.setImageBitmap(collagePlayerView.bitmap());
                        Point y02 = C15588c1.m25358y0(view);
                        this.f26512i = y02;
                        imageView3.setX((float) y02.x);
                        imageView3.setY((float) this.f26512i.y);
                        this.f26510g = imageView3;
                    } else {
                        ImageView imageView4 = new ImageView(view.getContext());
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(view.getWidth(), view.getHeight()));
                        imageView4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        imageView4.setImageBitmap(C15588c1.m25323e0(view));
                        Point y03 = C15588c1.m25358y0(view);
                        this.f26512i = y03;
                        imageView4.setX((float) y03.x);
                        imageView4.setY((float) this.f26512i.y);
                        this.f26510g = imageView4;
                    }
                    ImageView imageView5 = this.f26510g;
                    if (imageView5 != null) {
                        this.f26504a.addView(imageView5);
                        C19394m mVar = C19394m.f43287a;
                    }
                    this.f26511h = new C7233d(this.f26510g, C7218b.f16024s);
                    view.setVisibility(4);
                    C11943b.C11946c cVar = C11943b.C11946c.f26548a;
                    C19383o.m32797g(cVar, "<set-?>");
                    this.f26508e = cVar;
                    C19394m mVar2 = C19394m.f43287a;
                }
                ImageView imageView6 = this.f26510g;
                if (imageView6 != null) {
                    this.f26507d += f2;
                    float y = imageView6.getY() + f2;
                    C7233d dVar = this.f26511h;
                    if (dVar != null) {
                        dVar.mo19506c(y);
                    }
                }
            }
        } else if (C19383o.m32792b(bVar, C11943b.C11946c.f26548a) && (imageView = this.f26510g) != null) {
            this.f26507d += f2;
            float y2 = imageView.getY() + f2;
            C7233d dVar2 = this.f26511h;
            if (dVar2 != null) {
                dVar2.mo19506c(y2);
            }
        }
    }

    /* renamed from: b */
    public final void mo38663b(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            } else if (this.f26508e instanceof C11943b.C11947d) {
                C11943b.C11945b bVar = C11943b.C11945b.f26547a;
                C19383o.m32797g(bVar, "<set-?>");
                this.f26508e = bVar;
                return;
            } else {
                return;
            }
        }
        if (!(this.f26508e instanceof C11943b.C11946c)) {
            return;
        }
        if (((double) (Math.abs(this.f26507d) / ((float) ((Number) this.f26513j.getValue()).intValue()))) > 0.4d) {
            C11949d dVar = this.f26506c;
            if (dVar != null) {
                dVar.mo38680a();
                return;
            }
            return;
        }
        ImageView imageView = this.f26510g;
        if (imageView != null) {
            C11943b.C11944a aVar = C11943b.C11944a.f26546a;
            C19383o.m32797g(aVar, "<set-?>");
            this.f26508e = aVar;
            imageView.animate().y((float) this.f26512i.y).setInterpolator((AccelerateDecelerateInterpolator) this.f26514k.getValue()).withEndAction(this.f26515l).start();
        }
    }
}
