package p302z4;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.activity.C0114h;
import com.bumptech.glide.request.C6124d;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z4.d */
public abstract class C8441d<T extends View, Z> implements C8448i<Z> {

    /* renamed from: b */
    public final C8442a f18458b;

    /* renamed from: c */
    public final T f18459c;

    /* renamed from: z4.d$a */
    public static final class C8442a {

        /* renamed from: d */
        public static Integer f18460d;

        /* renamed from: a */
        public final View f18461a;

        /* renamed from: b */
        public final ArrayList f18462b = new ArrayList();

        /* renamed from: c */
        public C8443a f18463c;

        /* renamed from: z4.d$a$a */
        public static final class C8443a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<C8442a> f18464b;

            public C8443a(C8442a aVar) {
                this.f18464b = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                Log.isLoggable("CustomViewTarget", 2);
                C8442a aVar = this.f18464b.get();
                if (aVar != null && !aVar.f18462b.isEmpty()) {
                    int c = aVar.mo21025c();
                    int b = aVar.mo21024b();
                    boolean z = false;
                    if (c > 0 || c == Integer.MIN_VALUE) {
                        if (b > 0 || b == Integer.MIN_VALUE) {
                            z = true;
                        }
                    }
                    if (z) {
                        Iterator it = new ArrayList(aVar.f18462b).iterator();
                        while (it.hasNext()) {
                            ((C8447h) it.next()).mo17122b(c, b);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f18461a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f18463c);
                        }
                        aVar.f18463c = null;
                        aVar.f18462b.clear();
                    }
                }
                return true;
            }
        }

        public C8442a(View view) {
            this.f18461a = view;
        }

        /* renamed from: a */
        public final int mo21023a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f18461a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f18461a.getContext();
            if (f18460d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C0114h.m281L(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f18460d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f18460d.intValue();
        }

        /* renamed from: b */
        public final int mo21024b() {
            int paddingBottom = this.f18461a.getPaddingBottom() + this.f18461a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f18461a.getLayoutParams();
            return mo21023a(this.f18461a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* renamed from: c */
        public final int mo21025c() {
            int paddingRight = this.f18461a.getPaddingRight() + this.f18461a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f18461a.getLayoutParams();
            return mo21023a(this.f18461a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public C8441d(T t) {
        C0114h.m281L(t);
        this.f18459c = t;
        this.f18458b = new C8442a(t);
    }

    /* renamed from: a */
    public final void mo16749a(C8447h hVar) {
        C8442a aVar = this.f18458b;
        int c = aVar.mo21025c();
        int b = aVar.mo21024b();
        boolean z = false;
        if (c > 0 || c == Integer.MIN_VALUE) {
            if (b > 0 || b == Integer.MIN_VALUE) {
                z = true;
            }
        }
        if (z) {
            hVar.mo17122b(c, b);
            return;
        }
        if (!aVar.f18462b.contains(hVar)) {
            aVar.f18462b.add(hVar);
        }
        if (aVar.f18463c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f18461a.getViewTreeObserver();
            C8442a.C8443a aVar2 = new C8442a.C8443a(aVar);
            aVar.f18463c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    /* renamed from: c */
    public final void mo16751c(Drawable drawable) {
    }

    /* renamed from: d */
    public final void mo16752d(Drawable drawable) {
        C8442a aVar = this.f18458b;
        ViewTreeObserver viewTreeObserver = aVar.f18461a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f18463c);
        }
        aVar.f18463c = null;
        aVar.f18462b.clear();
        mo16809e();
    }

    /* renamed from: e */
    public abstract void mo16809e();

    /* renamed from: g */
    public final void mo16753g(C6124d dVar) {
        this.f18459c.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public final C6124d getRequest() {
        Object tag = this.f18459c.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C6124d) {
            return (C6124d) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* renamed from: j */
    public final void mo16756j(C8447h hVar) {
        this.f18458b.f18462b.remove(hVar);
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Target for: ");
        h.append(this.f18459c);
        return h.toString();
    }
}
