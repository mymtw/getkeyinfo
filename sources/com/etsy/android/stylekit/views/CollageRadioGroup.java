package com.etsy.android.stylekit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CollageRadioGroup extends LinearLayout {
    public static final int $stable = 8;
    private CollageRadioButton checkedButton;
    private int checkedRadioButtonId;
    private C9044a onCheckedChangeListener;

    /* renamed from: com.etsy.android.stylekit.views.CollageRadioGroup$a */
    public interface C9044a {
        /* renamed from: a */
        void mo30994a(boolean z, CollageRadioButton collageRadioButton);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRadioGroup(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRadioGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageRadioGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void invokeOnCheckedChangeListener(CollageRadioButton collageRadioButton) {
        C9044a aVar = this.onCheckedChangeListener;
        if (aVar != null) {
            aVar.mo30994a(collageRadioButton.isChecked(), collageRadioButton);
        }
    }

    private final void setAllButtonsToUnselectedState() {
        int childCount;
        if (getChildCount() > 0 && (childCount = getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                CollageRadioButton collageRadioButton = (CollageRadioButton) getChildAt(i);
                if (collageRadioButton != null) {
                    collageRadioButton.setChecked(false);
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void setRadioButtonOnCheckListener(CollageRadioButton collageRadioButton) {
        collageRadioButton.setOnClickListener(new C9061l(0, this, collageRadioButton));
    }

    /* access modifiers changed from: private */
    /* renamed from: setRadioButtonOnCheckListener$lambda-0  reason: not valid java name */
    public static final void m34894setRadioButtonOnCheckListener$lambda0(CollageRadioGroup collageRadioGroup, CollageRadioButton collageRadioButton, View view) {
        C19383o.m32797g(collageRadioGroup, "this$0");
        C19383o.m32797g(collageRadioButton, "$radioButton");
        collageRadioGroup.setAllButtonsToUnselectedState();
        collageRadioGroup.setSelectedButtonToSelectedState(collageRadioButton);
        collageRadioGroup.invokeOnCheckedChangeListener(collageRadioButton);
    }

    private final void setSelectedButtonToSelectedState(CollageRadioButton collageRadioButton) {
        collageRadioButton.setChecked(true);
        this.checkedRadioButtonId = collageRadioButton.getId();
        this.checkedButton = collageRadioButton;
    }

    public void addView(View view) {
        if (view instanceof CollageRadioButton) {
            setRadioButtonOnCheckListener((CollageRadioButton) view);
            super.addView(view);
            return;
        }
        throw new IllegalArgumentException("View must be CollageRadioButton");
    }

    public final void check(int i) {
        int childCount;
        if (getChildCount() > 0 && (childCount = getChildCount()) >= 0) {
            int i2 = 0;
            while (true) {
                CollageRadioButton collageRadioButton = (CollageRadioButton) getChildAt(i2);
                if (collageRadioButton != null && collageRadioButton.getId() == i) {
                    collageRadioButton.setChecked(true);
                    invokeOnCheckedChangeListener(collageRadioButton);
                } else if (collageRadioButton != null) {
                    collageRadioButton.setChecked(false);
                }
                if (i2 != childCount) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final CollageRadioButton getCheckedButton() {
        return this.checkedButton;
    }

    public final int getCheckedRadioButtonId() {
        return this.checkedRadioButtonId;
    }

    public final void setCheckedButton(CollageRadioButton collageRadioButton) {
        this.checkedButton = collageRadioButton;
    }

    public final void setCheckedRadioButtonId(int i) {
        this.checkedRadioButtonId = i;
    }

    public final void setOnCheckedChangeListener(C9044a aVar) {
        this.onCheckedChangeListener = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageRadioGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.checkedRadioButtonId = -1;
        setOrientation(1);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof CollageRadioButton) {
            setRadioButtonOnCheckListener((CollageRadioButton) view);
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalArgumentException("View must be CollageRadioButton");
    }

    public final void check(CollageRadioButton collageRadioButton) {
        int childCount;
        C19383o.m32797g(collageRadioButton, "radioButton");
        if (getChildCount() > 0 && (childCount = getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                CollageRadioButton collageRadioButton2 = (CollageRadioButton) getChildAt(i);
                if (C19383o.m32792b(collageRadioButton2, collageRadioButton)) {
                    collageRadioButton.setChecked(true);
                    invokeOnCheckedChangeListener(collageRadioButton2);
                } else if (collageRadioButton2 != null) {
                    collageRadioButton2.setChecked(false);
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof CollageRadioButton) {
            setRadioButtonOnCheckListener((CollageRadioButton) view);
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalArgumentException("View must be CollageRadioButton");
    }

    public void addView(View view, int i) {
        if (view instanceof CollageRadioButton) {
            setRadioButtonOnCheckListener((CollageRadioButton) view);
            super.addView(view, i);
            return;
        }
        throw new IllegalArgumentException("View must be CollageRadioButton");
    }

    public void addView(View view, int i, int i2) {
        if (view instanceof CollageRadioButton) {
            setRadioButtonOnCheckListener((CollageRadioButton) view);
            super.addView(view, i, i2);
            return;
        }
        throw new IllegalArgumentException("View must be CollageRadioButton");
    }
}
