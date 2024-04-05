package p462ug;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

/* renamed from: ug.a */
public final class C13524a {

    /* renamed from: a */
    public int f29590a = -1;

    /* renamed from: b */
    public int f29591b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f29592c;

    /* renamed from: d */
    public VelocityTracker f29593d;

    /* renamed from: e */
    public boolean f29594e;

    /* renamed from: f */
    public float f29595f;

    /* renamed from: g */
    public float f29596g;

    /* renamed from: h */
    public final float f29597h;

    /* renamed from: i */
    public final float f29598i;

    /* renamed from: j */
    public C13526b f29599j;

    /* renamed from: ug.a$a */
    public class C13525a implements ScaleGestureDetector.OnScaleGestureListener {
        public C13525a() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            ((PhotoViewAttacher.C12593a) C13524a.this.f29599j).mo45349a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C13524a(Context context, C13526b bVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f29598i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29597h = (float) viewConfiguration.getScaledTouchSlop();
        this.f29599j = bVar;
        this.f29592c = new ScaleGestureDetector(context, new C13525a());
    }

    /* renamed from: a */
    public final void mo46185a(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        int i4;
        float f5;
        float f6;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        int i5 = 0;
        if (action != 0) {
            int i6 = 1;
            if (action == 1) {
                this.f29590a = -1;
                if (this.f29594e && this.f29593d != null) {
                    try {
                        f3 = motionEvent2.getX(this.f29591b);
                    } catch (Exception unused) {
                        f3 = motionEvent.getX();
                    }
                    this.f29595f = f3;
                    try {
                        f4 = motionEvent2.getY(this.f29591b);
                    } catch (Exception unused2) {
                        f4 = motionEvent.getY();
                    }
                    this.f29596g = f4;
                    this.f29593d.addMovement(motionEvent2);
                    this.f29593d.computeCurrentVelocity(1000);
                    float xVelocity = this.f29593d.getXVelocity();
                    float yVelocity = this.f29593d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f29598i) {
                        PhotoViewAttacher.C12593a aVar = (PhotoViewAttacher.C12593a) this.f29599j;
                        PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                        PhotoViewAttacher.C12598f unused3 = photoViewAttacher.mCurrentFlingRunnable = new PhotoViewAttacher.C12598f(photoViewAttacher.mImageView.getContext());
                        PhotoViewAttacher.C12598f access$900 = PhotoViewAttacher.this.mCurrentFlingRunnable;
                        PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                        int access$1000 = photoViewAttacher2.getImageViewWidth(photoViewAttacher2.mImageView);
                        PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                        int access$1100 = photoViewAttacher3.getImageViewHeight(photoViewAttacher3.mImageView);
                        int i7 = (int) (-xVelocity);
                        int i8 = (int) (-yVelocity);
                        RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
                        if (displayRect != null) {
                            int round = Math.round(-displayRect.left);
                            float f7 = (float) access$1000;
                            if (f7 < displayRect.width()) {
                                i2 = Math.round(displayRect.width() - f7);
                                i = 0;
                            } else {
                                i2 = round;
                                i = i2;
                            }
                            int round2 = Math.round(-displayRect.top);
                            float f8 = (float) access$1100;
                            if (f8 < displayRect.height()) {
                                i4 = Math.round(displayRect.height() - f8);
                                i3 = 0;
                            } else {
                                i4 = round2;
                                i3 = i4;
                            }
                            access$900.f27802c = round;
                            access$900.f27803d = round2;
                            if (!(round == i2 && round2 == i4)) {
                                access$900.f27801b.fling(round, round2, i7, i8, i, i2, i3, i4, 0, 0);
                            }
                        }
                        PhotoViewAttacher.this.mImageView.post(PhotoViewAttacher.this.mCurrentFlingRunnable);
                    }
                }
                VelocityTracker velocityTracker = this.f29593d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f29593d = null;
                }
            } else if (action == 2) {
                try {
                    f5 = motionEvent2.getX(this.f29591b);
                } catch (Exception unused4) {
                    f5 = motionEvent.getX();
                }
                try {
                    f6 = motionEvent2.getY(this.f29591b);
                } catch (Exception unused5) {
                    f6 = motionEvent.getY();
                }
                float f9 = f5 - this.f29595f;
                float f10 = f6 - this.f29596g;
                if (!this.f29594e) {
                    this.f29594e = Math.sqrt((double) ((f10 * f10) + (f9 * f9))) >= ((double) this.f29597h);
                }
                if (this.f29594e) {
                    PhotoViewAttacher.C12593a aVar2 = (PhotoViewAttacher.C12593a) this.f29599j;
                    if (!PhotoViewAttacher.this.mScaleDragDetector.f29592c.isInProgress()) {
                        if (PhotoViewAttacher.this.mOnViewDragListener != null) {
                            PhotoViewAttacher.this.mOnViewDragListener.onDrag(f9, f10);
                        }
                        PhotoViewAttacher.this.mSuppMatrix.postTranslate(f9, f10);
                        PhotoViewAttacher.this.checkAndDisplayMatrix();
                        ViewParent parent = PhotoViewAttacher.this.mImageView.getParent();
                        if (!PhotoViewAttacher.this.mAllowParentInterceptOnEdge || PhotoViewAttacher.this.mScaleDragDetector.f29592c.isInProgress() || PhotoViewAttacher.this.mBlockParentIntercept) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        } else if ((PhotoViewAttacher.this.mHorizontalScrollEdge == 2 || ((PhotoViewAttacher.this.mHorizontalScrollEdge == 0 && f9 >= 1.0f) || ((PhotoViewAttacher.this.mHorizontalScrollEdge == 1 && f9 <= -1.0f) || ((PhotoViewAttacher.this.mVerticalScrollEdge == 0 && f10 >= 1.0f) || (PhotoViewAttacher.this.mVerticalScrollEdge == 1 && f10 <= -1.0f))))) && parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    this.f29595f = f5;
                    this.f29596g = f6;
                    VelocityTracker velocityTracker2 = this.f29593d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent2);
                    }
                }
            } else if (action == 3) {
                this.f29590a = -1;
                VelocityTracker velocityTracker3 = this.f29593d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f29593d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent2.getPointerId(action2) == this.f29590a) {
                    if (action2 != 0) {
                        i6 = 0;
                    }
                    this.f29590a = motionEvent2.getPointerId(i6);
                    this.f29595f = motionEvent2.getX(i6);
                    this.f29596g = motionEvent2.getY(i6);
                }
            }
        } else {
            this.f29590a = motionEvent2.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f29593d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent2);
            }
            try {
                f = motionEvent2.getX(this.f29591b);
            } catch (Exception unused6) {
                f = motionEvent.getX();
            }
            this.f29595f = f;
            try {
                f2 = motionEvent2.getY(this.f29591b);
            } catch (Exception unused7) {
                f2 = motionEvent.getY();
            }
            this.f29596g = f2;
            this.f29594e = false;
        }
        int i9 = this.f29590a;
        if (i9 != -1) {
            i5 = i9;
        }
        this.f29591b = motionEvent2.findPointerIndex(i5);
    }
}
