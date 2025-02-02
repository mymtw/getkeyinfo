package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.reflect.C19421p;

public class Constraints extends ViewGroup {
    public static final String TAG = "Constraints";
    public C2236a myConstraintSet;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void init(AttributeSet attributeSet) {
    }

    public C2236a getConstraintSet() {
        if (this.myConstraintSet == null) {
            this.myConstraintSet = new C2236a();
        }
        C2236a aVar = this.myConstraintSet;
        aVar.getClass();
        int childCount = getChildCount();
        aVar.f5375c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!aVar.f5374b || id != -1) {
                if (!aVar.f5375c.containsKey(Integer.valueOf(id))) {
                    aVar.f5375c.put(Integer.valueOf(id), new C2236a.C2237a());
                }
                C2236a.C2237a aVar2 = aVar.f5375c.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    aVar2.mo8497c(id, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        C2236a.C2238b bVar = aVar2.f5379d;
                        bVar.f5416d0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        bVar.f5412b0 = barrier.getType();
                        aVar2.f5379d.f5418e0 = barrier.getReferencedIds();
                        aVar2.f5379d.f5414c0 = barrier.getMargin();
                    }
                }
                aVar2.mo8497c(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.myConstraintSet;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
        super.setVisibility(8);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float alpha;
        public boolean applyElevation;
        public float elevation;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ConstraintLayout.LayoutParams) layoutParams);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43327q);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == 28) {
                    this.elevation = obtainStyledAttributes.getFloat(index, this.elevation);
                    this.applyElevation = true;
                } else if (index == 23) {
                    this.rotationX = obtainStyledAttributes.getFloat(index, this.rotationX);
                } else if (index == 24) {
                    this.rotationY = obtainStyledAttributes.getFloat(index, this.rotationY);
                } else if (index == 22) {
                    this.rotation = obtainStyledAttributes.getFloat(index, this.rotation);
                } else if (index == 20) {
                    this.scaleX = obtainStyledAttributes.getFloat(index, this.scaleX);
                } else if (index == 21) {
                    this.scaleY = obtainStyledAttributes.getFloat(index, this.scaleY);
                } else if (index == 16) {
                    this.transformPivotX = obtainStyledAttributes.getFloat(index, this.transformPivotX);
                } else if (index == 17) {
                    this.transformPivotY = obtainStyledAttributes.getFloat(index, this.transformPivotY);
                } else if (index == 18) {
                    this.translationX = obtainStyledAttributes.getFloat(index, this.translationX);
                } else if (index == 19) {
                    this.translationY = obtainStyledAttributes.getFloat(index, this.translationY);
                } else if (index == 27) {
                    this.translationZ = obtainStyledAttributes.getFloat(index, this.translationZ);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
