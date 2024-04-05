package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p002a1.C0007b;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.j0 */
public abstract class C2769j0 {
    /* renamed from: d */
    public static void m6635d(View view, List list) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (list.get(i) == view) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2373i.m5264k(view) != null) {
                list.add(view);
            }
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = (View) list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                z2 = false;
                                break;
                            } else if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z2 && C2364y.C2373i.m5264k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m6636g(View view, Rect rect) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2371g.m5245b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: h */
    public static boolean m6637h(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo10539a(View view, Object obj);

    /* renamed from: b */
    public abstract void mo10540b(ArrayList arrayList, Object obj);

    /* renamed from: c */
    public abstract void mo10541c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo10542e(Object obj);

    /* renamed from: f */
    public abstract Object mo10543f(Object obj);

    /* renamed from: i */
    public abstract Object mo10544i(Object obj, Object obj2, Object obj3);

    /* renamed from: j */
    public abstract Object mo10545j(Object obj, Object obj2);

    /* renamed from: k */
    public abstract void mo10546k(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: l */
    public abstract void mo10547l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* renamed from: m */
    public abstract void mo10548m(View view, Object obj);

    /* renamed from: n */
    public abstract void mo10549n(Object obj, Rect rect);

    /* renamed from: o */
    public void mo10550o(Object obj, C0007b bVar, C2770k kVar) {
        kVar.run();
    }

    /* renamed from: p */
    public abstract void mo10551p(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: q */
    public abstract void mo10552q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract Object mo10553r(Object obj);
}
