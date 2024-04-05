package p186n2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: n2.y */
public final class C7439y {

    /* renamed from: a */
    public static final C7389c0 f16624a;

    /* renamed from: b */
    public static final C7440a f16625b = new C7440a();

    /* renamed from: n2.y$a */
    public static class C7440a extends Property<View, Float> {
        public C7440a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(C7439y.f16624a.mo19746q((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            C7439y.f16624a.mo19747r(floatValue, (View) obj);
        }
    }

    /* renamed from: n2.y$b */
    public static class C7441b extends Property<View, Rect> {
        public C7441b(Class cls) {
            super(cls, "clipBounds");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            return C2364y.C2370f.m5241a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2370f.m5243c((View) obj, (Rect) obj2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f16624a = new C7392d0();
        } else {
            f16624a = new C7389c0();
        }
        new C7441b(Rect.class);
    }

    /* renamed from: a */
    public static void m14373a(View view, int i, int i2, int i3, int i4) {
        f16624a.mo19739u(view, i, i2, i3, i4);
    }
}
