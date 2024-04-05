package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p550dl.C17577c;
import p550dl.C17582h;
import p610kp.C18161c;

/* renamed from: com.google.android.material.timepicker.c */
public class C15528c extends ConstraintLayout {

    /* renamed from: b */
    public final C15529a f34888b;

    /* renamed from: c */
    public int f34889c;

    /* renamed from: d */
    public MaterialShapeDrawable f34890d;

    /* renamed from: com.google.android.material.timepicker.c$a */
    public class C15529a implements Runnable {
        public C15529a() {
        }

        public final void run() {
            C15528c.this.mo55188a();
        }
    }

    public C15528c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo55188a() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C2236a aVar = new C2236a();
        aVar.mo8487e(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.f34889c;
                C2236a.C2238b bVar = aVar.mo8490j(id).f5379d;
                bVar.f5442x = R.id.circle_center;
                bVar.f5443y = i4;
                bVar.f5444z = f;
                f = (360.0f / ((float) (childCount - i))) + f;
            }
        }
        aVar.mo8484b(this);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            view.setId(C2364y.C2369e.m5230a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f34888b);
            handler.post(this.f34888b);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        mo55188a();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f34888b);
            handler.post(this.f34888b);
        }
    }

    public final void setBackgroundColor(int i) {
        this.f34890d.setFillColor(ColorStateList.valueOf(i));
    }

    public C15528c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f34890d = materialShapeDrawable;
        materialShapeDrawable.setCornerSize((C17577c) new C17582h(0.5f));
        this.f34890d.setFillColor(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.f34890d;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5227q(this, materialShapeDrawable2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39676S, i, 0);
        this.f34889c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f34888b = new C15529a();
        obtainStyledAttributes.recycle();
    }
}
