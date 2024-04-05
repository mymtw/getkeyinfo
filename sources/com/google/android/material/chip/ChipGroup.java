package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p088e1.C6689b;

public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = 2132018591;
    /* access modifiers changed from: private */
    public int checkedId;
    /* access modifiers changed from: private */
    public final C15245a checkedStateTracker;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private C15246b onCheckedChangeListener;
    private C15247c passThroughListener;
    /* access modifiers changed from: private */
    public boolean protectFromCheckedChange;
    /* access modifiers changed from: private */
    public boolean selectionRequired;
    /* access modifiers changed from: private */
    public boolean singleSelection;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    public class C15245a implements CompoundButton.OnCheckedChangeListener {
        public C15245a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.protectFromCheckedChange) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.selectionRequired) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.checkedId == -1 || ChipGroup.this.checkedId == id || !ChipGroup.this.singleSelection)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.setCheckedStateForView(chipGroup.checkedId, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.checkedId == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.setCheckedStateForView(compoundButton.getId(), true);
                    ChipGroup.this.setCheckedId(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public interface C15246b {
        /* renamed from: a */
        void mo53695a();
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public class C15247c implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public ViewGroup.OnHierarchyChangeListener f34196b;

        public C15247c() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    view2.setId(C2364y.C2369e.m5230a());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).check(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.checkedStateTracker);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f34196b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f34196b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        setCheckedId(i, true);
    }

    /* access modifiers changed from: private */
    public void setCheckedStateForView(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.protectFromCheckedChange = true;
            ((Chip) findViewById).setChecked(z);
            this.protectFromCheckedChange = false;
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.checkedId;
                if (i2 != -1 && this.singleSelection) {
                    setCheckedStateForView(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public void check(int i) {
        int i2 = this.checkedId;
        if (i != i2) {
            if (i2 != -1 && this.singleSelection) {
                setCheckedStateForView(i2, false);
            }
            if (i != -1) {
                setCheckedStateForView(i, true);
            }
            setCheckedId(i);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void clearCheck() {
        this.protectFromCheckedChange = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.protectFromCheckedChange = false;
        setCheckedId(-1);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.singleSelection) {
            return this.checkedId;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.singleSelection) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public int getIndexOfChip(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.checkedId;
        if (i != -1) {
            setCheckedStateForView(i, true);
            setCheckedId(this.checkedId);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6689b.C6691b.m13081a(getRowCount(), isSingleLine() ? getChipCount() : -1, isSingleSelection() ? 1 : 2).f14782a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.chipSpacingHorizontal != i) {
            this.chipSpacingHorizontal = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.chipSpacingVertical != i) {
            this.chipSpacingVertical = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C15246b bVar) {
        this.onCheckedChangeListener = bVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.f34196b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearCheck();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i, boolean z) {
        this.checkedId = i;
        C15246b bVar = this.onCheckedChangeListener;
        if (bVar != null && this.singleSelection && z) {
            bVar.mo53695a();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r8 = p574gl.C17790a.m29918a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$a r8 = new com.google.android.material.chip.ChipGroup$a
            r8.<init>()
            r7.checkedStateTracker = r8
            com.google.android.material.chip.ChipGroup$c r8 = new com.google.android.material.chip.ChipGroup$c
            r8.<init>()
            r7.passThroughListener = r8
            r8 = -1
            r7.checkedId = r8
            r6 = 0
            r7.protectFromCheckedChange = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = p610kp.C18161c.f39696l
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            r10 = 1
            int r0 = r9.getDimensionPixelOffset(r10, r6)
            r1 = 2
            int r1 = r9.getDimensionPixelOffset(r1, r0)
            r7.setChipSpacingHorizontal(r1)
            r1 = 3
            int r0 = r9.getDimensionPixelOffset(r1, r0)
            r7.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r9.getBoolean(r0, r6)
            r7.setSingleLine((boolean) r0)
            r0 = 6
            boolean r0 = r9.getBoolean(r0, r6)
            r7.setSingleSelection((boolean) r0)
            r0 = 4
            boolean r0 = r9.getBoolean(r0, r6)
            r7.setSelectionRequired(r0)
            int r0 = r9.getResourceId(r6, r8)
            if (r0 == r8) goto L_0x0060
            r7.checkedId = r0
        L_0x0060:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$c r8 = r7.passThroughListener
            super.setOnHierarchyChangeListener(r8)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r8 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5229s(r7, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
