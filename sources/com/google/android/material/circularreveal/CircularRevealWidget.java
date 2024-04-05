package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C15250b;

public interface CircularRevealWidget extends C15250b.C15251a {

    public static class CircularRevealEvaluator implements TypeEvaluator<C15248a> {
        public static final TypeEvaluator<C15248a> CIRCULAR_REVEAL = new CircularRevealEvaluator();
        private final C15248a revealInfo = new C15248a();

        public C15248a evaluate(float f, C15248a aVar, C15248a aVar2) {
            C15248a aVar3 = this.revealInfo;
            float f2 = aVar.f34198a;
            float f3 = 1.0f - f;
            float f4 = (aVar2.f34198a * f) + (f2 * f3);
            float f5 = aVar.f34199b;
            float f6 = aVar2.f34199b * f;
            float f7 = aVar.f34200c;
            float f8 = f * aVar2.f34200c;
            aVar3.f34198a = f4;
            aVar3.f34199b = f6 + (f5 * f3);
            aVar3.f34200c = f8 + (f3 * f7);
            return aVar3;
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, C15248a> {
        public static final Property<CircularRevealWidget, C15248a> CIRCULAR_REVEAL = new CircularRevealProperty("circularReveal");

        private CircularRevealProperty(String str) {
            super(C15248a.class, str);
        }

        public C15248a get(CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        public void set(CircularRevealWidget circularRevealWidget, C15248a aVar) {
            circularRevealWidget.setRevealInfo(aVar);
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {
        public static final Property<CircularRevealWidget, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealScrimColorProperty("circularRevealScrimColor");

        private CircularRevealScrimColorProperty(String str) {
            super(Integer.class, str);
        }

        public Integer get(CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        public void set(CircularRevealWidget circularRevealWidget, Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.CircularRevealWidget$a */
    public static class C15248a {

        /* renamed from: a */
        public float f34198a;

        /* renamed from: b */
        public float f34199b;

        /* renamed from: c */
        public float f34200c;

        public C15248a() {
        }

        public C15248a(float f, float f2, float f3) {
            this.f34198a = f;
            this.f34199b = f2;
            this.f34200c = f3;
        }

        public C15248a(C15248a aVar) {
            this(aVar.f34198a, aVar.f34199b, aVar.f34200c);
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    int getCircularRevealScrimColor();

    C15248a getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C15248a aVar);
}
