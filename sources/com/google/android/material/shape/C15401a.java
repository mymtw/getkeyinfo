package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import p550dl.C17575a;
import p550dl.C17577c;
import p550dl.C17578d;
import p550dl.C17579e;
import p550dl.C17582h;
import p550dl.C17583i;
import p610kp.C18161c;

/* renamed from: com.google.android.material.shape.a */
public class C15401a {

    /* renamed from: m */
    public static final C17582h f34570m = new C17582h(0.5f);

    /* renamed from: a */
    public C19388s f34571a;

    /* renamed from: b */
    public C19388s f34572b;

    /* renamed from: c */
    public C19388s f34573c;

    /* renamed from: d */
    public C19388s f34574d;

    /* renamed from: e */
    public C17577c f34575e;

    /* renamed from: f */
    public C17577c f34576f;

    /* renamed from: g */
    public C17577c f34577g;

    /* renamed from: h */
    public C17577c f34578h;

    /* renamed from: i */
    public C17579e f34579i;

    /* renamed from: j */
    public C17579e f34580j;

    /* renamed from: k */
    public C17579e f34581k;

    /* renamed from: l */
    public C17579e f34582l;

    /* renamed from: com.google.android.material.shape.a$b */
    public interface C15403b {
        /* renamed from: a */
        C17577c mo54610a(C17577c cVar);
    }

    public C15401a(C15402a aVar) {
        this.f34571a = aVar.f34583a;
        this.f34572b = aVar.f34584b;
        this.f34573c = aVar.f34585c;
        this.f34574d = aVar.f34586d;
        this.f34575e = aVar.f34587e;
        this.f34576f = aVar.f34588f;
        this.f34577g = aVar.f34589g;
        this.f34578h = aVar.f34590h;
        this.f34579i = aVar.f34591i;
        this.f34580j = aVar.f34592j;
        this.f34581k = aVar.f34593k;
        this.f34582l = aVar.f34594l;
    }

    /* renamed from: a */
    public static C15402a m24980a(Context context, int i, int i2, C17577c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C18161c.f39680X);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C17577c d = m24983d(obtainStyledAttributes, 5, cVar);
            C17577c d2 = m24983d(obtainStyledAttributes, 8, d);
            C17577c d3 = m24983d(obtainStyledAttributes, 9, d);
            C17577c d4 = m24983d(obtainStyledAttributes, 7, d);
            C17577c d5 = m24983d(obtainStyledAttributes, 6, d);
            C15402a aVar = new C15402a();
            C19388s I = C19543e0.m33293I(i4);
            aVar.f34583a = I;
            float b = C15402a.m24987b(I);
            if (b != -1.0f) {
                aVar.mo54620f(b);
            }
            aVar.f34587e = d2;
            C19388s I2 = C19543e0.m33293I(i5);
            aVar.f34584b = I2;
            float b2 = C15402a.m24987b(I2);
            if (b2 != -1.0f) {
                aVar.mo54621g(b2);
            }
            aVar.f34588f = d3;
            C19388s I3 = C19543e0.m33293I(i6);
            aVar.f34585c = I3;
            float b3 = C15402a.m24987b(I3);
            if (b3 != -1.0f) {
                aVar.mo54619e(b3);
            }
            aVar.f34589g = d4;
            C19388s I4 = C19543e0.m33293I(i7);
            aVar.f34586d = I4;
            float b4 = C15402a.m24987b(I4);
            if (b4 != -1.0f) {
                aVar.mo54618d(b4);
            }
            aVar.f34590h = d5;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C15402a m24981b(Context context, AttributeSet attributeSet, int i, int i2) {
        return m24982c(context, attributeSet, i, i2, new C17575a((float) 0));
    }

    /* renamed from: c */
    public static C15402a m24982c(Context context, AttributeSet attributeSet, int i, int i2, C17577c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39667J, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m24980a(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: d */
    public static C17577c m24983d(TypedArray typedArray, int i, C17577c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C17575a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C17582h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: e */
    public final boolean mo54613e(RectF rectF) {
        Class<C17579e> cls = C17579e.class;
        boolean z = this.f34582l.getClass().equals(cls) && this.f34580j.getClass().equals(cls) && this.f34579i.getClass().equals(cls) && this.f34581k.getClass().equals(cls);
        float a = this.f34575e.mo68901a(rectF);
        return z && ((this.f34576f.mo68901a(rectF) > a ? 1 : (this.f34576f.mo68901a(rectF) == a ? 0 : -1)) == 0 && (this.f34578h.mo68901a(rectF) > a ? 1 : (this.f34578h.mo68901a(rectF) == a ? 0 : -1)) == 0 && (this.f34577g.mo68901a(rectF) > a ? 1 : (this.f34577g.mo68901a(rectF) == a ? 0 : -1)) == 0) && ((this.f34572b instanceof C17583i) && (this.f34571a instanceof C17583i) && (this.f34573c instanceof C17583i) && (this.f34574d instanceof C17583i));
    }

    /* renamed from: f */
    public final C15401a mo54614f(float f) {
        C15402a aVar = new C15402a(this);
        aVar.mo54617c(f);
        return new C15401a(aVar);
    }

    /* renamed from: g */
    public final C15401a mo54615g(C15403b bVar) {
        C15402a aVar = new C15402a(this);
        aVar.f34587e = bVar.mo54610a(this.f34575e);
        aVar.f34588f = bVar.mo54610a(this.f34576f);
        aVar.f34590h = bVar.mo54610a(this.f34578h);
        aVar.f34589g = bVar.mo54610a(this.f34577g);
        return new C15401a(aVar);
    }

    /* renamed from: com.google.android.material.shape.a$a */
    public static final class C15402a {

        /* renamed from: a */
        public C19388s f34583a = new C17583i();

        /* renamed from: b */
        public C19388s f34584b = new C17583i();

        /* renamed from: c */
        public C19388s f34585c = new C17583i();

        /* renamed from: d */
        public C19388s f34586d = new C17583i();

        /* renamed from: e */
        public C17577c f34587e = new C17575a(0.0f);

        /* renamed from: f */
        public C17577c f34588f = new C17575a(0.0f);

        /* renamed from: g */
        public C17577c f34589g = new C17575a(0.0f);

        /* renamed from: h */
        public C17577c f34590h = new C17575a(0.0f);

        /* renamed from: i */
        public C17579e f34591i = new C17579e();

        /* renamed from: j */
        public C17579e f34592j = new C17579e();

        /* renamed from: k */
        public C17579e f34593k = new C17579e();

        /* renamed from: l */
        public C17579e f34594l = new C17579e();

        public C15402a() {
        }

        /* renamed from: b */
        public static float m24987b(C19388s sVar) {
            if (sVar instanceof C17583i) {
                return ((C17583i) sVar).f38454n;
            }
            if (sVar instanceof C17578d) {
                return ((C17578d) sVar).f38449n;
            }
            return -1.0f;
        }

        /* renamed from: a */
        public final C15401a mo54616a() {
            return new C15401a(this);
        }

        /* renamed from: c */
        public final void mo54617c(float f) {
            mo54620f(f);
            mo54621g(f);
            mo54619e(f);
            mo54618d(f);
        }

        /* renamed from: d */
        public final void mo54618d(float f) {
            this.f34590h = new C17575a(f);
        }

        /* renamed from: e */
        public final void mo54619e(float f) {
            this.f34589g = new C17575a(f);
        }

        /* renamed from: f */
        public final void mo54620f(float f) {
            this.f34587e = new C17575a(f);
        }

        /* renamed from: g */
        public final void mo54621g(float f) {
            this.f34588f = new C17575a(f);
        }

        public C15402a(C15401a aVar) {
            this.f34583a = aVar.f34571a;
            this.f34584b = aVar.f34572b;
            this.f34585c = aVar.f34573c;
            this.f34586d = aVar.f34574d;
            this.f34587e = aVar.f34575e;
            this.f34588f = aVar.f34576f;
            this.f34589g = aVar.f34577g;
            this.f34590h = aVar.f34578h;
            this.f34591i = aVar.f34579i;
            this.f34592j = aVar.f34580j;
            this.f34593k = aVar.f34581k;
            this.f34594l = aVar.f34582l;
        }
    }

    public C15401a() {
        this.f34571a = new C17583i();
        this.f34572b = new C17583i();
        this.f34573c = new C17583i();
        this.f34574d = new C17583i();
        this.f34575e = new C17575a(0.0f);
        this.f34576f = new C17575a(0.0f);
        this.f34577g = new C17575a(0.0f);
        this.f34578h = new C17575a(0.0f);
        this.f34579i = new C17579e();
        this.f34580j = new C17579e();
        this.f34581k = new C17579e();
        this.f34582l = new C17579e();
    }
}
