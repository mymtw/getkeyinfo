package com.etsy.android.uikit.zoom;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.core.widget.C2399d;
import com.etsy.android.uikit.zoom.C12033e;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

public final class ZoomEventHandler {

    /* renamed from: a */
    public final ViewGroup f26810a;

    /* renamed from: b */
    public final View f26811b;

    /* renamed from: c */
    public final C12031c f26812c;

    /* renamed from: d */
    public final C12032d f26813d;

    /* renamed from: e */
    public ImageView f26814e;

    /* renamed from: f */
    public float f26815f = 1.0f;

    /* renamed from: g */
    public C12033e f26816g = C12033e.C12035b.f26826a;

    /* renamed from: h */
    public final C19285c f26817h = C19350d.m32677b(new ZoomEventHandler$shadowView$2(this));

    /* renamed from: i */
    public PointF f26818i = new PointF();

    /* renamed from: j */
    public PointF f26819j = new PointF();

    /* renamed from: k */
    public Point f26820k = new Point();

    /* renamed from: l */
    public final C2399d f26821l = new C2399d(this, 4);

    public ZoomEventHandler(ViewGroup viewGroup, View view, C12031c cVar, C12032d dVar) {
        C19383o.m32797g(viewGroup, "decorView");
        C19383o.m32797g(view, "target");
        C19383o.m32797g(cVar, "config");
        this.f26810a = viewGroup;
        this.f26811b = view;
        this.f26812c = cVar;
        this.f26813d = dVar;
    }

    /* renamed from: a */
    public static void m19849a(ViewParent viewParent) {
        viewParent.requestDisallowInterceptTouchEvent(true);
        if (viewParent.getParent() != null) {
            ViewParent parent = viewParent.getParent();
            C19383o.m32796f(parent, "view.parent");
            m19849a(parent);
        }
    }
}
