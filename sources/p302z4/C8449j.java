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

@Deprecated
/* renamed from: z4.j */
public abstract class C8449j<T extends View, Z> extends C8438a<Z> {

    /* renamed from: b */
    public final T f18466b;

    /* renamed from: c */
    public final C8450a f18467c;

    /* renamed from: z4.j$a */
    public static final class C8450a {

        /* renamed from: d */
        public static Integer f18468d;

        /* renamed from: a */
        public final View f18469a;

        /* renamed from: b */
        public final ArrayList f18470b = new ArrayList();

        /* renamed from: c */
        public C8451a f18471c;

        /* renamed from: z4.j$a$a */
        public static final class C8451a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<C8450a> f18472b;

            public C8451a(C8450a aVar) {
                this.f18472b = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                C8450a aVar = this.f18472b.get();
                if (aVar != null && !aVar.f18470b.isEmpty()) {
                    int c = aVar.mo21031c();
                    int b = aVar.mo21030b();
                    boolean z = false;
                    if (c > 0 || c == Integer.MIN_VALUE) {
                        if (b > 0 || b == Integer.MIN_VALUE) {
                            z = true;
                        }
                    }
                    if (z) {
                        Iterator it = new ArrayList(aVar.f18470b).iterator();
                        while (it.hasNext()) {
                            ((C8447h) it.next()).mo17122b(c, b);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f18469a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f18471c);
                        }
                        aVar.f18471c = null;
                        aVar.f18470b.clear();
                    }
                }
                return true;
            }
        }

        public C8450a(View view) {
            this.f18469a = view;
        }

        /* renamed from: a */
        public final int mo21029a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f18469a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f18469a.getContext();
            if (f18468d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C0114h.m281L(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f18468d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f18468d.intValue();
        }

        /* renamed from: b */
        public final int mo21030b() {
            int paddingBottom = this.f18469a.getPaddingBottom() + this.f18469a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f18469a.getLayoutParams();
            return mo21029a(this.f18469a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* renamed from: c */
        public final int mo21031c() {
            int paddingRight = this.f18469a.getPaddingRight() + this.f18469a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f18469a.getLayoutParams();
            return mo21029a(this.f18469a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public C8449j(T t) {
        C0114h.m281L(t);
        this.f18466b = t;
        this.f18467c = new C8450a(t);
    }

    /* renamed from: a */
    public final void mo16749a(C8447h hVar) {
        C8450a aVar = this.f18467c;
        int c = aVar.mo21031c();
        int b = aVar.mo21030b();
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
        if (!aVar.f18470b.contains(hVar)) {
            aVar.f18470b.add(hVar);
        }
        if (aVar.f18471c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f18469a.getViewTreeObserver();
            C8450a.C8451a aVar2 = new C8450a.C8451a(aVar);
            aVar.f18471c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    /* renamed from: d */
    public void mo16752d(Drawable drawable) {
        C8450a aVar = this.f18467c;
        ViewTreeObserver viewTreeObserver = aVar.f18469a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f18471c);
        }
        aVar.f18471c = null;
        aVar.f18470b.clear();
    }

    /* renamed from: g */
    public final void mo16753g(C6124d dVar) {
        this.f18466b.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public final C6124d getRequest() {
        Object tag = this.f18466b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C6124d) {
            return (C6124d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: j */
    public final void mo16756j(C8447h hVar) {
        this.f18467c.f18470b.remove(hVar);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Target for: ");
        h.append(this.f18466b);
        return h.toString();
    }
}
