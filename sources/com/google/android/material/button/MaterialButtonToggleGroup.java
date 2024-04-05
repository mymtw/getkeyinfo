package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C15370j;
import com.google.android.material.shape.C15401a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p550dl.C17575a;
import p550dl.C17577c;

public class MaterialButtonToggleGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = 2132018605;
    private static final String LOG_TAG = "MaterialButtonToggleGroup";
    /* access modifiers changed from: private */
    public int checkedId;
    private final C15235c checkedStateTracker;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private final LinkedHashSet<C15237e> onButtonCheckedListeners;
    private final List<C15236d> originalCornerData;
    private final C15238f pressedStateTracker;
    private boolean selectionRequired;
    /* access modifiers changed from: private */
    public boolean singleSelection;
    /* access modifiers changed from: private */
    public boolean skipCheckedStateTracker;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C15233a implements Comparator<MaterialButton> {
        public C15233a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C15234b extends C2273a {
        public C15234b() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.mo18869s(C6689b.C6692c.m13082a(0, 1, MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public class C15235c implements MaterialButton.C15231a {
        public C15235c() {
        }

        /* renamed from: a */
        public final void mo53296a(MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.skipCheckedStateTracker) {
                if (MaterialButtonToggleGroup.this.singleSelection) {
                    int unused = MaterialButtonToggleGroup.this.checkedId = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.updateCheckedStates(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.dispatchOnButtonChecked(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public static class C15236d {

        /* renamed from: e */
        public static final C17575a f34167e = new C17575a(0.0f);

        /* renamed from: a */
        public C17577c f34168a;

        /* renamed from: b */
        public C17577c f34169b;

        /* renamed from: c */
        public C17577c f34170c;

        /* renamed from: d */
        public C17577c f34171d;

        public C15236d(C17577c cVar, C17577c cVar2, C17577c cVar3, C17577c cVar4) {
            this.f34168a = cVar;
            this.f34169b = cVar3;
            this.f34170c = cVar4;
            this.f34171d = cVar2;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface C15237e {
        /* renamed from: a */
        void mo53320a(int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    public class C15238f implements MaterialButton.C15232b {
        public C15238f() {
        }
    }

    static {
        Class<MaterialButtonToggleGroup> cls = MaterialButtonToggleGroup.class;
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton childButton = getChildButton(i);
                int min = Math.min(childButton.getStrokeWidth(), getChildButton(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(childButton);
                if (getOrientation() == 0) {
                    buildLayoutParams.setMarginEnd(0);
                    buildLayoutParams.setMarginStart(-min);
                    buildLayoutParams.topMargin = 0;
                } else {
                    buildLayoutParams.bottomMargin = 0;
                    buildLayoutParams.topMargin = -min;
                    buildLayoutParams.setMarginStart(0);
                }
                childButton.setLayoutParams(buildLayoutParams);
            }
            resetChildMargins(firstVisibleChildIndex);
        }
    }

    private LinearLayout.LayoutParams buildLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void checkForced(int i, boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(i);
        if (materialButton != null) {
            materialButton.setChecked(z);
        }
    }

    /* access modifiers changed from: private */
    public void dispatchOnButtonChecked(int i, boolean z) {
        Iterator<C15237e> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo53320a(i, z);
        }
    }

    private MaterialButton getChildButton(int i) {
        return (MaterialButton) getChildAt(i);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible(i)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && isChildVisible(i2)) {
                i++;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private C15236d getNewCornerData(int i, int i2, int i3) {
        C15236d dVar = this.originalCornerData.get(i);
        if (i2 == i3) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            if (!z) {
                C17577c cVar = dVar.f34168a;
                C17575a aVar = C15236d.f34167e;
                return new C15236d(cVar, aVar, dVar.f34169b, aVar);
            } else if (C15370j.m24963d(this)) {
                C17575a aVar2 = C15236d.f34167e;
                return new C15236d(aVar2, aVar2, dVar.f34169b, dVar.f34170c);
            } else {
                C17577c cVar2 = dVar.f34168a;
                C17577c cVar3 = dVar.f34171d;
                C17575a aVar3 = C15236d.f34167e;
                return new C15236d(cVar2, cVar3, aVar3, aVar3);
            }
        } else if (i != i3) {
            return null;
        } else {
            if (!z) {
                C17575a aVar4 = C15236d.f34167e;
                return new C15236d(aVar4, dVar.f34171d, aVar4, dVar.f34170c);
            } else if (C15370j.m24963d(this)) {
                C17577c cVar4 = dVar.f34168a;
                C17577c cVar5 = dVar.f34171d;
                C17575a aVar5 = C15236d.f34167e;
                return new C15236d(cVar4, cVar5, aVar5, aVar5);
            } else {
                C17575a aVar6 = C15236d.f34167e;
                return new C15236d(aVar6, aVar6, dVar.f34169b, dVar.f34170c);
            }
        }
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && isChildVisible(i2)) {
                i++;
            }
        }
        return i;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void resetChildMargins(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setCheckedId(int i) {
        this.checkedId = i;
        dispatchOnButtonChecked(i, true);
    }

    private void setCheckedStateForView(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.skipCheckedStateTracker = false;
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            materialButton.setId(C2364y.C2369e.m5230a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.addOnCheckedChangeListener(this.checkedStateTracker);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void updateBuilderWithCornerData(C15401a.C15402a aVar, C15236d dVar) {
        if (dVar == null) {
            aVar.mo54617c(0.0f);
            return;
        }
        aVar.f34587e = dVar.f34168a;
        aVar.f34590h = dVar.f34171d;
        aVar.f34588f = dVar.f34169b;
        aVar.f34589g = dVar.f34170c;
    }

    /* access modifiers changed from: private */
    public boolean updateCheckedStates(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.selectionRequired || !checkedButtonIds.isEmpty()) {
            if (z && this.singleSelection) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    setCheckedStateForView(intValue2, false);
                    dispatchOnButtonChecked(intValue2, false);
                }
            }
            return true;
        }
        setCheckedStateForView(i, true);
        this.checkedId = i;
        return false;
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), Integer.valueOf(i));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void addOnButtonCheckedListener(C15237e eVar) {
        this.onButtonCheckedListeners.add(eVar);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            updateCheckedStates(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C15401a shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.originalCornerData.add(new C15236d(shapeAppearanceModel.f34575e, shapeAppearanceModel.f34578h, shapeAppearanceModel.f34576f, shapeAppearanceModel.f34577g));
        C2364y.m5201p(materialButton, new C15234b());
    }

    public void check(int i) {
        if (i != this.checkedId) {
            checkForced(i, true);
        }
    }

    public void clearChecked() {
        this.skipCheckedStateTracker = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton childButton = getChildButton(i);
            childButton.setChecked(false);
            dispatchOnButtonChecked(childButton.getId(), false);
        }
        this.skipCheckedStateTracker = false;
        setCheckedId(-1);
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    public void dispatchDraw(Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.singleSelection) {
            return this.checkedId;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton childButton = getChildButton(i);
            if (childButton.isChecked()) {
                arrayList.add(Integer.valueOf(childButton.getId()));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.childOrder;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(LOG_TAG, "Child order wasn't updated");
        return i2;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.checkedId;
        if (i != -1) {
            checkForced(i, true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6689b.C6691b.m13081a(1, getVisibleButtonCount(), isSingleSelection() ? 1 : 2).f14782a);
    }

    public void onMeasure(int i, int i2) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.removeOnCheckedChangeListener(this.checkedStateTracker);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.C15232b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.originalCornerData.remove(indexOfChild);
        }
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
    }

    public void removeOnButtonCheckedListener(C15237e eVar) {
        this.onButtonCheckedListeners.remove(eVar);
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearChecked();
        }
    }

    public void uncheck(int i) {
        checkForced(i, false);
    }

    public void updateChildShapes() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton childButton = getChildButton(i);
            if (childButton.getVisibility() != 8) {
                C15401a shapeAppearanceModel = childButton.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C15401a.C15402a aVar = new C15401a.C15402a(shapeAppearanceModel);
                updateBuilderWithCornerData(aVar, getNewCornerData(i, firstVisibleChildIndex, lastVisibleChildIndex));
                childButton.setShapeAppearanceModel(aVar.mo54616a());
            }
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r7 = p574gl.C17790a.m29918a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.originalCornerData = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r7.<init>()
            r6.checkedStateTracker = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>()
            r6.pressedStateTracker = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.onButtonCheckedListeners = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.childOrderComparator = r7
            r7 = 0
            r6.skipCheckedStateTracker = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = p610kp.C18161c.f39660C
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            r9 = 2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            r9 = -1
            int r9 = r8.getResourceId(r7, r9)
            r6.checkedId = r9
            r9 = 1
            boolean r7 = r8.getBoolean(r9, r7)
            r6.selectionRequired = r7
            r6.setChildrenDrawingOrderEnabled(r9)
            r8.recycle()
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r7 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5229s(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
