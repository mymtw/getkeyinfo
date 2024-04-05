package com.etsy.android.uikit.view.draggable;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.etsy.android.lib.models.ResponseConstants;
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

public final class DragEventHandlerWithShrink {

    /* renamed from: a */
    public final ViewGroup f26516a;

    /* renamed from: b */
    public final View f26517b;

    /* renamed from: c */
    public final C11949d f26518c;

    /* renamed from: d */
    public float f26519d;

    /* renamed from: e */
    public C11943b f26520e = C11943b.C11947d.f26549a;

    /* renamed from: f */
    public float f26521f;

    /* renamed from: g */
    public ImageView f26522g;

    /* renamed from: h */
    public View f26523h;

    /* renamed from: i */
    public C7233d f26524i;

    /* renamed from: j */
    public C7233d f26525j;

    /* renamed from: k */
    public C7233d f26526k;

    /* renamed from: l */
    public C7233d f26527l;

    /* renamed from: m */
    public C7233d f26528m;

    /* renamed from: n */
    public float f26529n;

    /* renamed from: o */
    public float f26530o;

    /* renamed from: p */
    public Point f26531p;

    /* renamed from: q */
    public final C19285c f26532q;

    /* renamed from: r */
    public final C19285c f26533r;

    /* renamed from: s */
    public final C11942a f26534s;

    public DragEventHandlerWithShrink(ViewGroup viewGroup, View view, C11949d dVar) {
        C19383o.m32797g(view, "target");
        this.f26516a = viewGroup;
        this.f26517b = view;
        this.f26518c = dVar;
        Context context = view.getContext();
        C19383o.m32796f(context, "target.context");
        this.f26521f = (float) C19543e0.m33295K(6, context);
        this.f26531p = new Point();
        this.f26532q = C19350d.m32677b(new DragEventHandlerWithShrink$dragDiffThreshold$2(this));
        this.f26533r = C19350d.m32677b(DragEventHandlerWithShrink$interpolator$2.INSTANCE);
        this.f26534s = new C11942a(this, 0);
    }

    /* renamed from: a */
    public final void mo38664a(float f, float f2) {
        C11943b bVar = this.f26520e;
        if (C19383o.m32792b(bVar, C11943b.C11945b.f26547a)) {
            if (Math.abs(f) <= this.f26521f) {
                if (this.f26522g == null) {
                    View view = this.f26517b;
                    if (view instanceof PhotoView) {
                        PhotoView photoView = (PhotoView) view;
                        ImageView imageView = new ImageView(photoView.getContext());
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(photoView.getWidth(), photoView.getHeight()));
                        imageView.setImageBitmap(C15588c1.m25323e0(view));
                        Point y0 = C15588c1.m25358y0(view);
                        this.f26531p = y0;
                        imageView.setX((float) y0.x);
                        imageView.setY((float) this.f26531p.y);
                        this.f26522g = imageView;
                    } else if (view instanceof CollagePlayerView) {
                        CollagePlayerView collagePlayerView = (CollagePlayerView) view;
                        ImageView imageView2 = new ImageView(collagePlayerView.getContext());
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(collagePlayerView.getWidth(), collagePlayerView.getHeight()));
                        collagePlayerView.pause();
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        imageView2.setImageBitmap(collagePlayerView.bitmap());
                        Point y02 = C15588c1.m25358y0(view);
                        this.f26531p = y02;
                        imageView2.setX((float) y02.x);
                        imageView2.setY((float) this.f26531p.y);
                        this.f26522g = imageView2;
                    } else {
                        ImageView imageView3 = new ImageView(view.getContext());
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(view.getWidth(), view.getHeight()));
                        imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        imageView3.setImageBitmap(C15588c1.m25323e0(view));
                        Context context = imageView3.getContext();
                        C19383o.m32796f(context, ResponseConstants.CONTEXT);
                        imageView3.setElevation((float) C19543e0.m33295K(20, context));
                        Point y03 = C15588c1.m25358y0(view);
                        this.f26531p = y03;
                        imageView3.setX((float) y03.x);
                        imageView3.setY((float) this.f26531p.y);
                        this.f26522g = imageView3;
                    }
                    View view2 = new View(view.getContext());
                    view2.setLayoutParams(new ViewGroup.LayoutParams(this.f26516a.getWidth(), this.f26516a.getHeight()));
                    view2.setBackgroundColor(-1);
                    view2.setAlpha(0.0f);
                    this.f26523h = view2;
                    this.f26516a.addView(view2);
                    C19394m mVar = C19394m.f43287a;
                    ImageView imageView4 = this.f26522g;
                    if (imageView4 != null) {
                        this.f26516a.addView(imageView4);
                    }
                    this.f26524i = new C7233d(this.f26522g, C7218b.f16023r);
                    this.f26525j = new C7233d(this.f26522g, C7218b.f16024s);
                    this.f26526k = new C7233d(this.f26523h, C7218b.f16025t);
                    this.f26528m = new C7233d(this.f26522g, C7218b.f16018m);
                    this.f26527l = new C7233d(this.f26522g, C7218b.f16019n);
                    view.setVisibility(4);
                    C11943b.C11946c cVar = C11943b.C11946c.f26548a;
                    C19383o.m32797g(cVar, "<set-?>");
                    this.f26520e = cVar;
                }
                mo38666c(f, f2);
            }
        } else if (C19383o.m32792b(bVar, C11943b.C11946c.f26548a)) {
            mo38666c(f, f2);
        }
    }

    /* renamed from: b */
    public final float mo38665b() {
        return Math.abs(this.f26519d) / ((float) ((Number) this.f26532q.getValue()).intValue());
    }

    /* renamed from: c */
    public final void mo38666c(float f, float f2) {
        ImageView imageView = this.f26522g;
        if (imageView != null) {
            this.f26519d += f2;
            this.f26530o = imageView.getX() + f;
            this.f26529n = imageView.getY() + f2;
            C7233d dVar = this.f26524i;
            if (dVar != null) {
                dVar.mo19506c(this.f26530o);
            }
            C7233d dVar2 = this.f26525j;
            if (dVar2 != null) {
                dVar2.mo19506c(this.f26529n);
            }
            float b = mo38665b();
            if (b > 1.0f) {
                b = 1.0f;
            }
            C7233d dVar3 = this.f26526k;
            if (dVar3 != null) {
                dVar3.mo19506c(b);
            }
            float b2 = ((float) 1) - (mo38665b() / 2.0f);
            if (b2 < 0.0f) {
                b2 = 0.0f;
            }
            C7233d dVar4 = this.f26528m;
            if (dVar4 != null) {
                dVar4.mo19506c(b2);
            }
            C7233d dVar5 = this.f26527l;
            if (dVar5 != null) {
                dVar5.mo19506c(b2);
            }
        }
    }

    /* renamed from: d */
    public final void mo38667d(MotionEvent motionEvent) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator interpolator;
        C19383o.m32797g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            } else if (this.f26520e instanceof C11943b.C11947d) {
                C11943b.C11945b bVar = C11943b.C11945b.f26547a;
                C19383o.m32797g(bVar, "<set-?>");
                this.f26520e = bVar;
                return;
            } else {
                return;
            }
        }
        if (!(this.f26520e instanceof C11943b.C11946c)) {
            return;
        }
        if (((double) mo38665b()) > 0.4d) {
            C11949d dVar = this.f26518c;
            if (dVar != null) {
                dVar.mo38680a();
                return;
            }
            return;
        }
        ImageView imageView = this.f26522g;
        if (imageView != null) {
            C11943b.C11944a aVar = C11943b.C11944a.f26546a;
            C19383o.m32797g(aVar, "<set-?>");
            this.f26520e = aVar;
            imageView.animate().x((float) this.f26531p.x).y((float) this.f26531p.y).scaleX(1.0f).scaleY(1.0f).setInterpolator((AccelerateDecelerateInterpolator) this.f26533r.getValue()).withEndAction(this.f26534s).start();
        }
        View view = this.f26523h;
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (interpolator = alpha.setInterpolator((AccelerateDecelerateInterpolator) this.f26533r.getValue())) != null) {
            interpolator.start();
        }
    }
}
