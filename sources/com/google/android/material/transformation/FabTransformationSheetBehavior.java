package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.reflect.C19421p;
import p629nk.C18269b;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public HashMap f34941i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: a */
    public final void mo55227a(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f34941i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        HashMap hashMap = this.f34941i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f34941i.get(childAt)).intValue();
                            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                            C2364y.C2368d.m5229s(childAt, intValue);
                        }
                    } else {
                        this.f34941i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                        C2364y.C2368d.m5229s(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f34941i = null;
            }
        }
        super.mo55227a(view, view2, z, z2);
    }

    /* renamed from: h */
    public final FabTransformationBehavior.C15543b mo55233h(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C15543b bVar = new FabTransformationBehavior.C15543b();
        bVar.f34935a = C18269b.m30886b(context, i);
        bVar.f34936b = new C19421p();
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
