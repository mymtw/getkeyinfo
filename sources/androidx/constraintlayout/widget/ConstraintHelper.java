package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.reflect.C19421p;
import p203p0.C7646a;
import p203p0.C7647b;
import p212q0.C7713c;

public abstract class ConstraintHelper extends View {
    public int mCount;
    public C7646a mHelperWidget;
    public int[] mIds = new int[32];
    private HashMap<Integer, String> mMap = new HashMap<>();
    public String mReferenceIds;
    public String mReferenceTags;
    public boolean mUseViewMeasure = false;
    private View[] mViews = null;
    public Context myContext;

    public ConstraintHelper(Context context) {
        super(context);
        this.myContext = context;
        init((AttributeSet) null);
    }

    private void addID(String str) {
        if (str != null && str.length() != 0 && this.myContext != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int findId = findId(trim);
            if (findId != 0) {
                this.mMap.put(Integer.valueOf(findId), trim);
                addRscID(findId);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void addRscID(int i) {
        if (i != getId()) {
            int i2 = this.mCount + 1;
            int[] iArr = this.mIds;
            if (i2 > iArr.length) {
                this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.mIds;
            int i3 = this.mCount;
            iArr2[i3] = i;
            this.mCount = i3 + 1;
        }
    }

    private void addTag(String str) {
        if (str != null && str.length() != 0 && this.myContext != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).constraintTag)) {
                    if (childAt.getId() == -1) {
                        StringBuilder h = C0072d.m201h("to use ConstraintTag view ");
                        h.append(childAt.getClass().getSimpleName());
                        h.append(" must have an ID");
                        Log.w("ConstraintHelper", h.toString());
                    } else {
                        addRscID(childAt.getId());
                    }
                }
            }
        }
    }

    private int[] convertReferenceString(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String trim : split) {
            int findId = findId(trim.trim());
            if (findId != 0) {
                iArr[i] = findId;
                i++;
            }
        }
        return i != split.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    private int findId(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = findId(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C7713c.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.myContext.getResources().getIdentifier(str, "id", this.myContext.getPackageName()) : i;
    }

    public void addView(View view) {
        if (view != this) {
            if (view.getId() == -1) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
            } else if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
            } else {
                this.mReferenceIds = null;
                addRscID(view.getId());
                requestLayout();
            }
        }
    }

    public void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.mCount; i++) {
            View viewById = constraintLayout.getViewById(this.mIds[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        for (int i = 0; i < this.mCount; i++) {
            this.mViews[i] = constraintLayout.getViewById(this.mIds[i]);
        }
        return this.mViews;
    }

    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19421p.f43325o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceTags = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void loadParameters(C2236a.C2237a aVar, C7647b bVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        C2236a.C2238b bVar2 = aVar.f5379d;
        int[] iArr = bVar2.f5418e0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f5420f0;
            if (str != null && str.length() > 0) {
                C2236a.C2238b bVar3 = aVar.f5379d;
                bVar3.f5418e0 = convertReferenceString(this, bVar3.f5420f0);
            }
        }
        bVar.mo20057b();
        if (aVar.f5379d.f5418e0 != null) {
            int i = 0;
            while (true) {
                int[] iArr2 = aVar.f5379d.f5418e0;
                if (i < iArr2.length) {
                    ConstraintWidget constraintWidget = sparseArray.get(iArr2[i]);
                    if (constraintWidget != null) {
                        bVar.mo20056a(constraintWidget);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void removeView(View view) {
        int i;
        int id = view.getId();
        if (id != -1) {
            this.mReferenceIds = null;
            int i2 = 0;
            while (true) {
                if (i2 >= this.mCount) {
                    break;
                } else if (this.mIds[i2] == id) {
                    while (true) {
                        i = this.mCount;
                        if (i2 >= i - 1) {
                            break;
                        }
                        int[] iArr = this.mIds;
                        int i3 = i2 + 1;
                        iArr[i2] = iArr[i3];
                        i2 = i3;
                    }
                    this.mIds[i - 1] = 0;
                    this.mCount = i - 1;
                } else {
                    i2++;
                }
            }
            requestLayout();
        }
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
    }

    public void setIds(String str) {
        this.mReferenceIds = str;
        if (str != null) {
            int i = 0;
            this.mCount = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    addID(str.substring(i));
                    return;
                } else {
                    addID(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.mReferenceTags = str;
        if (str != null) {
            int i = 0;
            this.mCount = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    addTag(str.substring(i));
                    return;
                } else {
                    addTag(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int addRscID : iArr) {
            addRscID(addRscID);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.mReferenceIds == null) {
            addRscID(i);
        }
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.mMap.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.mReferenceIds
            r5.setIds(r0)
        L_0x000b:
            p0.a r0 = r5.mHelperWidget
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo20057b()
            r0 = 0
        L_0x0014:
            int r1 = r5.mCount
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.mIds
            r1 = r1[r0]
            android.view.View r2 = r6.getViewById(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.mMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.findId(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.mIds
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.mMap
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.getViewById(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            p0.a r1 = r5.mHelperWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r6.getViewWidget(r2)
            r1.mo20056a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            p0.a r0 = r5.mHelperWidget
            androidx.constraintlayout.solver.widgets.d r6 = r6.mLayoutWidget
            r0.mo8356c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void validateParams() {
        if (this.mHelperWidget != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).widget = (ConstraintWidget) this.mHelperWidget;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myContext = context;
        init(attributeSet);
    }

    public void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            applyLayoutFeatures((ConstraintLayout) parent);
        }
    }

    private int findId(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myContext = context;
        init(attributeSet);
    }

    public void updatePreLayout(C2220d dVar, C7646a aVar, SparseArray<ConstraintWidget> sparseArray) {
        aVar.mo20057b();
        for (int i = 0; i < this.mCount; i++) {
            aVar.mo20056a(sparseArray.get(this.mIds[i]));
        }
    }
}
