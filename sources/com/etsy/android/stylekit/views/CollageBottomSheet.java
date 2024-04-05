package com.etsy.android.stylekit.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435rb.C13350a;
import p753kq.C19857l;

public final class CollageBottomSheet extends BottomSheetDialog {
    public static final int $stable = 8;
    private boolean isPopover;
    private C19857l<? super C19394m, C19394m> onBackPressedListener;
    private final int popoverMinHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageBottomSheet(Context context, int i) {
        super(context, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.popoverMinHeight = C13350a.m21014e(240, context);
    }

    private final View wrapInCollageView(int i, View view, ViewGroup.LayoutParams layoutParams) {
        View inflate = View.inflate(getContext(), R.layout.clg_bottom_sheet, (ViewGroup) null);
        C19383o.m32795e(inflate, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
        if (this.isPopover) {
            nestedScrollView.setMinimumHeight(this.popoverMinHeight);
        }
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, nestedScrollView, false);
        }
        if (layoutParams == null) {
            nestedScrollView.addView(view);
        } else {
            nestedScrollView.addView(view, layoutParams);
        }
        return nestedScrollView;
    }

    public static /* synthetic */ View wrapInCollageView$default(CollageBottomSheet collageBottomSheet, int i, View view, ViewGroup.LayoutParams layoutParams, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            view = null;
        }
        if ((i2 & 4) != 0) {
            layoutParams = null;
        }
        return collageBottomSheet.wrapInCollageView(i, view, layoutParams);
    }

    public final boolean isPopover() {
        return this.isPopover;
    }

    public void onBackPressed() {
        C19857l<? super C19394m, C19394m> lVar = this.onBackPressedListener;
        if (lVar == null) {
            super.onBackPressed();
        } else if (lVar != null) {
            lVar.invoke(C19394m.f43287a);
        }
    }

    public void setContentView(int i) {
        super.setContentView(wrapInCollageView$default(this, i, (View) null, (ViewGroup.LayoutParams) null, 6, (Object) null));
    }

    public final void setOnBackPressedListener(C19857l<? super C19394m, C19394m> lVar) {
        this.onBackPressedListener = lVar;
    }

    public final void setPopover(boolean z) {
        this.isPopover = z;
    }

    public void setContentView(View view) {
        C19383o.m32797g(view, "view");
        super.setContentView(wrapInCollageView$default(this, 0, view, (ViewGroup.LayoutParams) null, 5, (Object) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageBottomSheet(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C19383o.m32797g(view, "view");
        super.setContentView(wrapInCollageView$default(this, 0, view, layoutParams, 1, (Object) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageBottomSheet(Context context) {
        this(context, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
