package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.etsy.android.lib.logger.C8694h;

public class TouchImageView extends AppCompatImageView {
    public static final int CLICK = 3;
    public static final int DRAG = 1;
    public static final int NONE = 0;
    public static final int ZOOM = 2;
    public Context context;
    public PointF last = new PointF();

    /* renamed from: m */
    public float[] f26487m;
    public GestureDetector mDoubleTapDetector;
    public ScaleGestureDetector mScaleDetector;
    public Matrix matrix;
    public float maxScale = 3.0f;
    public float minScale = 1.0f;
    public int mode = 0;
    public int oldMeasuredHeight;
    public int oldMeasuredWidth;
    public float origHeight;
    public float origWidth;
    public float saveScale = 1.0f;
    public PointF start = new PointF();
    public int viewHeight;
    public int viewWidth;

    /* renamed from: com.etsy.android.uikit.view.TouchImageView$a */
    public class C11923a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: com.etsy.android.uikit.view.TouchImageView$a$a */
        public class C11924a implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ MotionEvent f26489a;

            public C11924a(MotionEvent motionEvent) {
                this.f26489a = motionEvent;
            }

            public final void onAnimationEnd(Animation animation) {
                TouchImageView.this.clearAnimation();
                TouchImageView.this.matrix.postScale(1.5f, 1.5f, this.f26489a.getX(), this.f26489a.getY());
                TouchImageView.this.fixTrans();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.matrix);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        }

        public C11923a() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            TouchImageView touchImageView = TouchImageView.this;
            float f = touchImageView.saveScale;
            touchImageView.saveScale = 1.5f * f;
            if (f > 1.0f) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(f, 1.0f, f, 1.0f, motionEvent.getX(), motionEvent.getY());
                scaleAnimation.setDuration(250);
                TouchImageView.this.startAnimation(scaleAnimation);
                TouchImageView.this.resetZoom();
                return true;
            }
            float x = motionEvent.getX();
            TouchImageView touchImageView2 = TouchImageView.this;
            float fixTrans = touchImageView.getFixTrans(x, (float) touchImageView2.viewWidth, touchImageView2.origWidth * touchImageView2.saveScale);
            TouchImageView touchImageView3 = TouchImageView.this;
            float y = motionEvent.getY();
            TouchImageView touchImageView4 = TouchImageView.this;
            float fixTrans2 = touchImageView3.getFixTrans(y, (float) touchImageView4.viewHeight, touchImageView4.origHeight * touchImageView4.saveScale);
            if (fixTrans == 0.0f && fixTrans2 == 0.0f) {
                new ScaleAnimation(f, 1.5f, f, 1.5f, motionEvent.getX(), motionEvent.getY());
            } else {
                new ScaleAnimation(f, 1.5f, f, 1.5f, fixTrans, fixTrans2);
            }
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(f, 1.5f, f, 1.5f, motionEvent.getX(), motionEvent.getY());
            scaleAnimation2.setDuration(250);
            scaleAnimation2.setAnimationListener(new C11924a(motionEvent));
            TouchImageView.this.startAnimation(scaleAnimation2);
            return true;
        }
    }

    /* renamed from: com.etsy.android.uikit.view.TouchImageView$b */
    public class C11925b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C11925b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onScale(android.view.ScaleGestureDetector r7) {
            /*
                r6 = this;
                float r0 = r7.getScaleFactor()
                com.etsy.android.uikit.view.TouchImageView r1 = com.etsy.android.uikit.view.TouchImageView.this
                float r2 = r1.saveScale
                float r3 = r2 * r0
                r1.saveScale = r3
                float r4 = r1.maxScale
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x0017
                r1.saveScale = r4
            L_0x0014:
                float r0 = r4 / r2
                goto L_0x0020
            L_0x0017:
                float r4 = r1.minScale
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L_0x0020
                r1.saveScale = r4
                goto L_0x0014
            L_0x0020:
                float r2 = r1.origWidth
                float r3 = r1.saveScale
                float r2 = r2 * r3
                int r4 = r1.viewWidth
                float r5 = (float) r4
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 <= 0) goto L_0x0045
                float r2 = r1.origHeight
                float r2 = r2 * r3
                int r3 = r1.viewHeight
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x0037
                goto L_0x0045
            L_0x0037:
                android.graphics.Matrix r1 = r1.matrix
                float r2 = r7.getFocusX()
                float r7 = r7.getFocusY()
                r1.postScale(r0, r0, r2, r7)
                goto L_0x0052
            L_0x0045:
                android.graphics.Matrix r7 = r1.matrix
                int r4 = r4 / 2
                float r2 = (float) r4
                int r1 = r1.viewHeight
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.postScale(r0, r0, r2, r1)
            L_0x0052:
                com.etsy.android.uikit.view.TouchImageView r7 = com.etsy.android.uikit.view.TouchImageView.this
                r7.fixTrans()
                r7 = 1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.view.TouchImageView.C11925b.onScale(android.view.ScaleGestureDetector):boolean");
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.mode = 2;
            return true;
        }
    }

    public TouchImageView(Context context2) {
        super(context2);
        sharedConstructing(context2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$sharedConstructing$0(View view, MotionEvent motionEvent) {
        this.mScaleDetector.onTouchEvent(motionEvent);
        this.mDoubleTapDetector.onTouchEvent(motionEvent);
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        if (action == 0) {
            this.last.set(pointF);
            this.start.set(this.last);
            this.mode = 1;
        } else if (action == 1) {
            this.mode = 0;
            int abs = (int) Math.abs(pointF.x - this.start.x);
            int abs2 = (int) Math.abs(pointF.y - this.start.y);
            if (abs < 3 && abs2 < 3) {
                performClick();
            }
        } else if (action != 2) {
            if (action == 6) {
                this.mode = 0;
            }
        } else if (this.mode == 1) {
            float f = pointF.x;
            PointF pointF2 = this.last;
            float f2 = f - pointF2.x;
            float f3 = pointF.y - pointF2.y;
            this.matrix.postTranslate(getFixDragTrans(f2, (float) this.viewWidth, this.origWidth * this.saveScale), getFixDragTrans(f3, (float) this.viewHeight, this.origHeight * this.saveScale));
            fixTrans();
            this.last.set(pointF.x, pointF.y);
        }
        setImageMatrix(this.matrix);
        invalidate();
        return true;
    }

    private void sharedConstructing(Context context2) {
        super.setClickable(true);
        this.context = context2;
        this.mScaleDetector = new ScaleGestureDetector(context2, new C11925b());
        this.mDoubleTapDetector = new GestureDetector(context2, new C11923a());
        Matrix matrix2 = new Matrix();
        this.matrix = matrix2;
        this.f26487m = new float[9];
        setImageMatrix(matrix2);
        setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(new C11953h(this));
    }

    public void fixTrans() {
        this.matrix.getValues(this.f26487m);
        float[] fArr = this.f26487m;
        float f = fArr[2];
        float f2 = fArr[5];
        float fixTrans = getFixTrans(f, (float) this.viewWidth, this.origWidth * this.saveScale);
        float fixTrans2 = getFixTrans(f2, (float) this.viewHeight, this.origHeight * this.saveScale);
        if (fixTrans != 0.0f || fixTrans2 != 0.0f) {
            this.matrix.postTranslate(fixTrans, fixTrans2);
        }
    }

    public float getFixDragTrans(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    public float getFixTrans(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = 0.0f;
        } else {
            f5 = f2 - f3;
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.viewWidth = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.viewHeight = size;
        int i3 = this.oldMeasuredHeight;
        int i4 = this.viewWidth;
        if ((i3 != i4 || i3 != size) && i4 != 0 && size != 0) {
            this.oldMeasuredHeight = size;
            this.oldMeasuredWidth = i4;
            if (this.saveScale == 1.0f) {
                Drawable drawable = getDrawable();
                if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    C8694h hVar = C8694h.f19097a;
                    hVar.mo21310e("bmWidth: " + intrinsicWidth + " bmHeight : " + intrinsicHeight);
                    float f = (float) intrinsicWidth;
                    float f2 = (float) intrinsicHeight;
                    float min = Math.min(((float) this.viewWidth) / f, ((float) this.viewHeight) / f2);
                    this.matrix.setScale(min, min);
                    float f3 = (((float) this.viewHeight) - (f2 * min)) / 2.0f;
                    float f4 = (((float) this.viewWidth) - (min * f)) / 2.0f;
                    this.matrix.postTranslate(f4, f3);
                    this.origWidth = ((float) this.viewWidth) - (f4 * 2.0f);
                    this.origHeight = ((float) this.viewHeight) - (f3 * 2.0f);
                    setImageMatrix(this.matrix);
                } else {
                    return;
                }
            }
            fixTrans();
        }
    }

    public void resetZoom() {
        int i;
        int i2 = this.oldMeasuredHeight;
        int i3 = this.viewWidth;
        if ((i2 != i3 || i2 != this.viewHeight) && i3 != 0 && (i = this.viewHeight) != 0) {
            this.oldMeasuredHeight = i;
            this.oldMeasuredWidth = i3;
            this.saveScale = 1.0f;
            Drawable drawable = getDrawable();
            if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                float f = (float) intrinsicWidth;
                float intrinsicHeight = (float) drawable.getIntrinsicHeight();
                float min = Math.min(((float) this.viewWidth) / f, ((float) this.viewHeight) / intrinsicHeight);
                this.matrix.setScale(min, min);
                float f2 = (((float) this.viewHeight) - (intrinsicHeight * min)) / 2.0f;
                float f3 = (((float) this.viewWidth) - (min * f)) / 2.0f;
                this.matrix.postTranslate(f3, f2);
                this.origWidth = ((float) this.viewWidth) - (f3 * 2.0f);
                this.origHeight = ((float) this.viewHeight) - (f2 * 2.0f);
                setImageMatrix(this.matrix);
                fixTrans();
            }
        }
    }

    public void setMaxZoom(float f) {
        this.maxScale = f;
    }

    public TouchImageView(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        sharedConstructing(context2);
    }
}
