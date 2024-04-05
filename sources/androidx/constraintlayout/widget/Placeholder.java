package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.reflect.C19421p;

public class Placeholder extends View {
    private View mContent = null;
    private int mContentId = -1;
    private int mEmptyVisibility = 4;

    public Placeholder(Context context) {
        super(context);
        init((AttributeSet) null);
    }

    private void init(AttributeSet attributeSet) {
        super.setVisibility(this.mEmptyVisibility);
        this.mContentId = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19421p.f43326p);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.mContentId = obtainStyledAttributes.getResourceId(index, this.mContentId);
                } else if (index == 1) {
                    this.mEmptyVisibility = obtainStyledAttributes.getInt(index, this.mEmptyVisibility);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.mContent;
    }

    public int getEmptyVisibility() {
        return this.mEmptyVisibility;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.mContentId != i) {
            View view = this.mContent;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.mContent.getLayoutParams()).isInPlaceholder = false;
                this.mContent = null;
            }
            this.mContentId = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.mEmptyVisibility = i;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.mContent != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.mContent.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams2.widget;
            constraintWidget.f5143d0 = 0;
            ConstraintWidget constraintWidget2 = layoutParams.widget;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f5125P[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
            if (dimensionBehaviour != dimensionBehaviour2) {
                constraintWidget2.mo8272L(constraintWidget.mo8289r());
            }
            ConstraintWidget constraintWidget3 = layoutParams.widget;
            if (constraintWidget3.f5125P[1] != dimensionBehaviour2) {
                constraintWidget3.mo8269I(layoutParams2.widget.mo8286o());
            }
            layoutParams2.widget.f5143d0 = 8;
        }
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.mContentId == -1 && !isInEditMode()) {
            setVisibility(this.mEmptyVisibility);
        }
        View findViewById = constraintLayout.findViewById(this.mContentId);
        this.mContent = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).isInPlaceholder = true;
            this.mContent.setVisibility(0);
            setVisibility(0);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
