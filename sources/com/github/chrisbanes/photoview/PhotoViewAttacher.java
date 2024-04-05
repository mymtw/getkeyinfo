package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import p003a2.C0023f;
import p462ug.C13524a;
import p462ug.C13526b;
import p462ug.C13527c;
import p462ug.C13528d;
import p462ug.C13529e;
import p462ug.C13530f;
import p462ug.C13531g;
import p462ug.C13532h;
import p462ug.C13533i;
import p462ug.C13534j;

public class PhotoViewAttacher implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static float DEFAULT_MAX_SCALE = 3.0f;
    private static float DEFAULT_MID_SCALE = 1.75f;
    /* access modifiers changed from: private */
    public static float DEFAULT_MIN_SCALE = 1.0f;
    private static int DEFAULT_ZOOM_DURATION = 200;
    private static final int HORIZONTAL_EDGE_BOTH = 2;
    private static final int HORIZONTAL_EDGE_LEFT = 0;
    private static final int HORIZONTAL_EDGE_NONE = -1;
    private static final int HORIZONTAL_EDGE_RIGHT = 1;
    /* access modifiers changed from: private */
    public static int SINGLE_TOUCH = 1;
    private static final int VERTICAL_EDGE_BOTH = 2;
    private static final int VERTICAL_EDGE_BOTTOM = 1;
    private static final int VERTICAL_EDGE_NONE = -1;
    private static final int VERTICAL_EDGE_TOP = 0;
    /* access modifiers changed from: private */
    public boolean mAllowParentInterceptOnEdge = true;
    private final Matrix mBaseMatrix = new Matrix();
    private float mBaseRotation;
    /* access modifiers changed from: private */
    public boolean mBlockParentIntercept = false;
    /* access modifiers changed from: private */
    public C12598f mCurrentFlingRunnable;
    private final RectF mDisplayRect = new RectF();
    private final Matrix mDrawMatrix = new Matrix();
    private GestureDetector mGestureDetector;
    /* access modifiers changed from: private */
    public int mHorizontalScrollEdge = 2;
    /* access modifiers changed from: private */
    public ImageView mImageView;
    /* access modifiers changed from: private */
    public Interpolator mInterpolator = new AccelerateDecelerateInterpolator();
    /* access modifiers changed from: private */
    public View.OnLongClickListener mLongClickListener;
    private C13527c mMatrixChangeListener;
    private final float[] mMatrixValues = new float[9];
    /* access modifiers changed from: private */
    public float mMaxScale = DEFAULT_MAX_SCALE;
    private float mMidScale = DEFAULT_MID_SCALE;
    private float mMinScale = DEFAULT_MIN_SCALE;
    /* access modifiers changed from: private */
    public View.OnClickListener mOnClickListener;
    /* access modifiers changed from: private */
    public C13532h mOnViewDragListener;
    /* access modifiers changed from: private */
    public C13528d mOutsidePhotoTapListener;
    /* access modifiers changed from: private */
    public C13529e mPhotoTapListener;
    /* access modifiers changed from: private */
    public C13530f mScaleChangeListener;
    /* access modifiers changed from: private */
    public C13524a mScaleDragDetector;
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER;
    /* access modifiers changed from: private */
    public C13531g mSingleFlingListener;
    /* access modifiers changed from: private */
    public final Matrix mSuppMatrix = new Matrix();
    /* access modifiers changed from: private */
    public int mVerticalScrollEdge = 2;
    /* access modifiers changed from: private */
    public C13533i mViewTapListener;
    /* access modifiers changed from: private */
    public int mZoomDuration = DEFAULT_ZOOM_DURATION;
    private boolean mZoomEnabled = true;
    /* access modifiers changed from: private */
    public C13526b onGestureListener = new C12593a();

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$a */
    public class C12593a implements C13526b {
        public C12593a() {
        }

        /* renamed from: a */
        public final void mo45349a(float f, float f2, float f3) {
            if (PhotoViewAttacher.this.getScale() < PhotoViewAttacher.this.mMaxScale || f < 1.0f) {
                if (PhotoViewAttacher.this.mScaleChangeListener != null) {
                    PhotoViewAttacher.this.mScaleChangeListener.mo38721a(f);
                }
                PhotoViewAttacher.this.mSuppMatrix.postScale(f, f, f2, f3);
                PhotoViewAttacher.this.checkAndDisplayMatrix();
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$b */
    public class C12594b extends GestureDetector.SimpleOnGestureListener {
        public C12594b() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PhotoViewAttacher.this.mSingleFlingListener == null || PhotoViewAttacher.this.getScale() > PhotoViewAttacher.DEFAULT_MIN_SCALE || motionEvent.getPointerCount() > PhotoViewAttacher.SINGLE_TOUCH || motionEvent2.getPointerCount() > PhotoViewAttacher.SINGLE_TOUCH) {
                return false;
            }
            return PhotoViewAttacher.this.mSingleFlingListener.mo46192a();
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (PhotoViewAttacher.this.mLongClickListener != null) {
                PhotoViewAttacher.this.mLongClickListener.onLongClick(PhotoViewAttacher.this.mImageView);
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$c */
    public class C12595c implements GestureDetector.OnDoubleTapListener {
        public C12595c() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float scale = PhotoViewAttacher.this.getScale();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (scale < PhotoViewAttacher.this.getMediumScale()) {
                    PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                    photoViewAttacher.setScale(photoViewAttacher.getMediumScale(), x, y, true);
                } else if (scale < PhotoViewAttacher.this.getMediumScale() || scale >= PhotoViewAttacher.this.getMaximumScale()) {
                    PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                    photoViewAttacher2.setScale(photoViewAttacher2.getMinimumScale(), x, y, true);
                } else {
                    PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                    photoViewAttacher3.setScale(photoViewAttacher3.getMaximumScale(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PhotoViewAttacher.this.mOnClickListener != null) {
                PhotoViewAttacher.this.mOnClickListener.onClick(PhotoViewAttacher.this.mImageView);
            }
            RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (PhotoViewAttacher.this.mViewTapListener != null) {
                C13533i access$1900 = PhotoViewAttacher.this.mViewTapListener;
                ImageView unused = PhotoViewAttacher.this.mImageView;
                access$1900.mo46193a();
            }
            if (displayRect == null) {
                return false;
            }
            if (displayRect.contains(x, y)) {
                displayRect.width();
                displayRect.height();
                if (PhotoViewAttacher.this.mPhotoTapListener == null) {
                    return true;
                }
                C13529e access$2000 = PhotoViewAttacher.this.mPhotoTapListener;
                ImageView unused2 = PhotoViewAttacher.this.mImageView;
                access$2000.mo46191a();
                return true;
            } else if (PhotoViewAttacher.this.mOutsidePhotoTapListener == null) {
                return false;
            } else {
                C13528d access$2100 = PhotoViewAttacher.this.mOutsidePhotoTapListener;
                ImageView unused3 = PhotoViewAttacher.this.mImageView;
                access$2100.mo46190a();
                return false;
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$d */
    public static /* synthetic */ class C12596d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27794a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27794a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27794a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27794a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27794a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.chrisbanes.photoview.PhotoViewAttacher.C12596d.<clinit>():void");
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$e */
    public class C12597e implements Runnable {

        /* renamed from: b */
        public final float f27795b;

        /* renamed from: c */
        public final float f27796c;

        /* renamed from: d */
        public final long f27797d = System.currentTimeMillis();

        /* renamed from: e */
        public final float f27798e;

        /* renamed from: f */
        public final float f27799f;

        public C12597e(float f, float f2, float f3, float f4) {
            this.f27795b = f3;
            this.f27796c = f4;
            this.f27798e = f;
            this.f27799f = f2;
        }

        public final void run() {
            float interpolation = PhotoViewAttacher.this.mInterpolator.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f27797d)) * 1.0f) / ((float) PhotoViewAttacher.this.mZoomDuration)));
            float f = this.f27798e;
            float b = C0023f.m103b(this.f27799f, f, interpolation, f) / PhotoViewAttacher.this.getScale();
            ((C12593a) PhotoViewAttacher.this.onGestureListener).mo45349a(b, this.f27795b, this.f27796c);
            if (interpolation < 1.0f) {
                PhotoViewAttacher.this.mImageView.postOnAnimation(this);
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$f */
    public class C12598f implements Runnable {

        /* renamed from: b */
        public final OverScroller f27801b;

        /* renamed from: c */
        public int f27802c;

        /* renamed from: d */
        public int f27803d;

        public C12598f(Context context) {
            this.f27801b = new OverScroller(context);
        }

        public final void run() {
            if (!this.f27801b.isFinished() && this.f27801b.computeScrollOffset()) {
                int currX = this.f27801b.getCurrX();
                int currY = this.f27801b.getCurrY();
                PhotoViewAttacher.this.mSuppMatrix.postTranslate((float) (this.f27802c - currX), (float) (this.f27803d - currY));
                PhotoViewAttacher.this.checkAndDisplayMatrix();
                this.f27802c = currX;
                this.f27803d = currY;
                PhotoViewAttacher.this.mImageView.postOnAnimation(this);
            }
        }
    }

    public PhotoViewAttacher(ImageView imageView) {
        this.mImageView = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.mBaseRotation = 0.0f;
            this.mScaleDragDetector = new C13524a(imageView.getContext(), this.onGestureListener);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C12594b());
            this.mGestureDetector = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new C12595c());
        }
    }

    private void cancelFling() {
        C12598f fVar = this.mCurrentFlingRunnable;
        if (fVar != null) {
            fVar.f27801b.forceFinished(true);
            this.mCurrentFlingRunnable = null;
        }
    }

    /* access modifiers changed from: private */
    public void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private boolean checkMatrixBounds() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF displayRect = getDisplayRect(getDrawMatrix());
        if (displayRect == null) {
            return false;
        }
        float height = displayRect.height();
        float width = displayRect.width();
        float imageViewHeight = (float) getImageViewHeight(this.mImageView);
        float f6 = 0.0f;
        if (height <= imageViewHeight) {
            int i = C12596d.f27794a[this.mScaleType.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f4 = (imageViewHeight - height) / 2.0f;
                    f5 = displayRect.top;
                } else {
                    f4 = imageViewHeight - height;
                    f5 = displayRect.top;
                }
                f = f4 - f5;
            } else {
                f = -displayRect.top;
            }
            this.mVerticalScrollEdge = 2;
        } else {
            float f7 = displayRect.top;
            if (f7 > 0.0f) {
                this.mVerticalScrollEdge = 0;
                f = -f7;
            } else {
                float f8 = displayRect.bottom;
                if (f8 < imageViewHeight) {
                    this.mVerticalScrollEdge = 1;
                    f = imageViewHeight - f8;
                } else {
                    this.mVerticalScrollEdge = -1;
                    f = 0.0f;
                }
            }
        }
        float imageViewWidth = (float) getImageViewWidth(this.mImageView);
        if (width <= imageViewWidth) {
            int i2 = C12596d.f27794a[this.mScaleType.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (imageViewWidth - width) / 2.0f;
                    f3 = displayRect.left;
                } else {
                    f2 = imageViewWidth - width;
                    f3 = displayRect.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -displayRect.left;
            }
            this.mHorizontalScrollEdge = 2;
        } else {
            float f9 = displayRect.left;
            if (f9 > 0.0f) {
                this.mHorizontalScrollEdge = 0;
                f6 = -f9;
            } else {
                float f10 = displayRect.right;
                if (f10 < imageViewWidth) {
                    f6 = imageViewWidth - f10;
                    this.mHorizontalScrollEdge = 1;
                } else {
                    this.mHorizontalScrollEdge = -1;
                }
            }
        }
        this.mSuppMatrix.postTranslate(f6, f);
        return true;
    }

    private Matrix getDrawMatrix() {
        this.mDrawMatrix.set(this.mBaseMatrix);
        this.mDrawMatrix.postConcat(this.mSuppMatrix);
        return this.mDrawMatrix;
    }

    /* access modifiers changed from: private */
    public int getImageViewHeight(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* access modifiers changed from: private */
    public int getImageViewWidth(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float getValue(Matrix matrix, int i) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i];
    }

    private void resetMatrix() {
        this.mSuppMatrix.reset();
        setRotationBy(this.mBaseRotation);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    private void setImageViewMatrix(Matrix matrix) {
        this.mImageView.setImageMatrix(matrix);
        if (this.mMatrixChangeListener != null && getDisplayRect(matrix) != null) {
            this.mMatrixChangeListener.mo46189a();
        }
    }

    private void updateBaseMatrix(Drawable drawable) {
        if (drawable != null) {
            float imageViewWidth = (float) getImageViewWidth(this.mImageView);
            float imageViewHeight = (float) getImageViewHeight(this.mImageView);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.mBaseMatrix.reset();
            float f = (float) intrinsicWidth;
            float f2 = imageViewWidth / f;
            float f3 = (float) intrinsicHeight;
            float f4 = imageViewHeight / f3;
            ImageView.ScaleType scaleType = this.mScaleType;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.mBaseMatrix.postTranslate((imageViewWidth - f) / 2.0f, (imageViewHeight - f3) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f2, f4);
                this.mBaseMatrix.postScale(max, max);
                this.mBaseMatrix.postTranslate((imageViewWidth - (f * max)) / 2.0f, (imageViewHeight - (f3 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f2, f4));
                this.mBaseMatrix.postScale(min, min);
                this.mBaseMatrix.postTranslate((imageViewWidth - (f * min)) / 2.0f, (imageViewHeight - (f3 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                RectF rectF2 = new RectF(0.0f, 0.0f, imageViewWidth, imageViewHeight);
                if (((int) this.mBaseRotation) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f3, f);
                }
                int i = C12596d.f27794a[this.mScaleType.ordinal()];
                if (i == 1) {
                    this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            resetMatrix();
        }
    }

    public void getDisplayMatrix(Matrix matrix) {
        matrix.set(getDrawMatrix());
    }

    public RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    public Matrix getImageMatrix() {
        return this.mDrawMatrix;
    }

    public float getMaximumScale() {
        return this.mMaxScale;
    }

    public float getMediumScale() {
        return this.mMidScale;
    }

    public float getMinimumScale() {
        return this.mMinScale;
    }

    public float getScale() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) getValue(this.mSuppMatrix, 0), 2.0d)) + ((float) Math.pow((double) getValue(this.mSuppMatrix, 3), 2.0d))));
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public void getSuppMatrix(Matrix matrix) {
        matrix.set(this.mSuppMatrix);
    }

    @Deprecated
    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public boolean isZoomable() {
        return this.mZoomEnabled;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            updateBaseMatrix(this.mImageView.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.mZoomEnabled
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00c5
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x00c5
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x0073
            if (r0 == r2) goto L_0x0020
            r3 = 3
            if (r0 == r3) goto L_0x0020
            goto L_0x007f
        L_0x0020:
            float r0 = r10.getScale()
            float r3 = r10.mMinScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L_0x007f
            com.github.chrisbanes.photoview.PhotoViewAttacher$e r9 = new com.github.chrisbanes.photoview.PhotoViewAttacher$e
            float r5 = r10.getScale()
            float r6 = r10.mMinScale
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L_0x0071
        L_0x0049:
            float r0 = r10.getScale()
            float r3 = r10.mMaxScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L_0x007f
            com.github.chrisbanes.photoview.PhotoViewAttacher$e r9 = new com.github.chrisbanes.photoview.PhotoViewAttacher$e
            float r5 = r10.getScale()
            float r6 = r10.mMaxScale
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L_0x0071:
            r11 = r2
            goto L_0x0080
        L_0x0073:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x007c
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x007c:
            r10.cancelFling()
        L_0x007f:
            r11 = r1
        L_0x0080:
            ug.a r0 = r10.mScaleDragDetector
            if (r0 == 0) goto L_0x00b9
            android.view.ScaleGestureDetector r11 = r0.f29592c
            boolean r11 = r11.isInProgress()
            ug.a r0 = r10.mScaleDragDetector
            boolean r3 = r0.f29594e
            android.view.ScaleGestureDetector r4 = r0.f29592c     // Catch:{ IllegalArgumentException -> 0x0096 }
            r4.onTouchEvent(r12)     // Catch:{ IllegalArgumentException -> 0x0096 }
            r0.mo46185a(r12)     // Catch:{ IllegalArgumentException -> 0x0096 }
        L_0x0096:
            if (r11 != 0) goto L_0x00a4
            ug.a r11 = r10.mScaleDragDetector
            android.view.ScaleGestureDetector r11 = r11.f29592c
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto L_0x00a4
            r11 = r2
            goto L_0x00a5
        L_0x00a4:
            r11 = r1
        L_0x00a5:
            if (r3 != 0) goto L_0x00af
            ug.a r0 = r10.mScaleDragDetector
            boolean r0 = r0.f29594e
            if (r0 != 0) goto L_0x00af
            r0 = r2
            goto L_0x00b0
        L_0x00af:
            r0 = r1
        L_0x00b0:
            if (r11 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            r1 = r2
        L_0x00b5:
            r10.mBlockParentIntercept = r1
            r1 = r2
            goto L_0x00ba
        L_0x00b9:
            r1 = r11
        L_0x00ba:
            android.view.GestureDetector r11 = r10.mGestureDetector
            if (r11 == 0) goto L_0x00c5
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00c5
            r1 = r2
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.chrisbanes.photoview.PhotoViewAttacher.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.mAllowParentInterceptOnEdge = z;
    }

    public void setBaseRotation(float f) {
        this.mBaseRotation = f % 360.0f;
        update();
        setRotationBy(this.mBaseRotation);
        checkAndDisplayMatrix();
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        } else if (this.mImageView.getDrawable() == null) {
            return false;
        } else {
            this.mSuppMatrix.set(matrix);
            checkAndDisplayMatrix();
            return true;
        }
    }

    public void setMaximumScale(float f) {
        C13534j.m21308a(this.mMinScale, this.mMidScale, f);
        this.mMaxScale = f;
    }

    public void setMediumScale(float f) {
        C13534j.m21308a(this.mMinScale, f, this.mMaxScale);
        this.mMidScale = f;
    }

    public void setMinimumScale(float f) {
        C13534j.m21308a(f, this.mMidScale, this.mMaxScale);
        this.mMinScale = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    public void setOnMatrixChangeListener(C13527c cVar) {
        this.mMatrixChangeListener = cVar;
    }

    public void setOnOutsidePhotoTapListener(C13528d dVar) {
        this.mOutsidePhotoTapListener = dVar;
    }

    public void setOnPhotoTapListener(C13529e eVar) {
        this.mPhotoTapListener = eVar;
    }

    public void setOnScaleChangeListener(C13530f fVar) {
        this.mScaleChangeListener = fVar;
    }

    public void setOnSingleFlingListener(C13531g gVar) {
        this.mSingleFlingListener = gVar;
    }

    public void setOnViewDragListener(C13532h hVar) {
        this.mOnViewDragListener = hVar;
    }

    public void setOnViewTapListener(C13533i iVar) {
        this.mViewTapListener = iVar;
    }

    public void setRotationBy(float f) {
        this.mSuppMatrix.postRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setRotationTo(float f) {
        this.mSuppMatrix.setRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setScale(float f) {
        setScale(f, false);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        C13534j.m21308a(f, f2, f3);
        this.mMinScale = f;
        this.mMidScale = f2;
        this.mMaxScale = f3;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z;
        if (scaleType == null) {
            z = false;
        } else if (C13534j.C13535a.f29601a[scaleType.ordinal()] != 1) {
            z = true;
        } else {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (z && scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            update();
        }
    }

    public void setZoomInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setZoomTransitionDuration(int i) {
        this.mZoomDuration = i;
    }

    public void setZoomable(boolean z) {
        this.mZoomEnabled = z;
        update();
    }

    public void update() {
        if (this.mZoomEnabled) {
            updateBaseMatrix(this.mImageView.getDrawable());
        } else {
            resetMatrix();
        }
    }

    public void setScale(float f, boolean z) {
        setScale(f, (float) (this.mImageView.getRight() / 2), (float) (this.mImageView.getBottom() / 2), z);
    }

    private RectF getDisplayRect(Matrix matrix) {
        Drawable drawable = this.mImageView.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.mDisplayRect.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.mDisplayRect);
        return this.mDisplayRect;
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        if (f < this.mMinScale || f > this.mMaxScale) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.mImageView.post(new C12597e(getScale(), f, f2, f3));
        } else {
            this.mSuppMatrix.setScale(f, f, f2, f3);
            checkAndDisplayMatrix();
        }
    }
}
