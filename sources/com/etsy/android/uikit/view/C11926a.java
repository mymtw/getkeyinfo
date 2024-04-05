package com.etsy.android.uikit.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.etsy.android.uikit.view.draggable.DraggableViewAttacher;

/* renamed from: com.etsy.android.uikit.view.a */
public final class C11926a {

    /* renamed from: a */
    public int f26492a = -1;

    /* renamed from: b */
    public int f26493b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f26494c;

    /* renamed from: d */
    public VelocityTracker f26495d;

    /* renamed from: e */
    public boolean f26496e;

    /* renamed from: f */
    public float f26497f;

    /* renamed from: g */
    public float f26498g;

    /* renamed from: h */
    public final float f26499h;

    /* renamed from: i */
    public DraggableViewAttacher.C11939d f26500i;

    /* renamed from: com.etsy.android.uikit.view.a$a */
    public class C11927a implements ScaleGestureDetector.OnScaleGestureListener {
        public C11927a() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            DraggableViewAttacher.C11939d dVar = C11926a.this.f26500i;
            scaleGestureDetector.getFocusX();
            scaleGestureDetector.getFocusY();
            dVar.getClass();
            return true;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C11926a(Context context, DraggableViewAttacher.C11939d dVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledMinimumFlingVelocity();
        this.f26499h = (float) viewConfiguration.getScaledTouchSlop();
        this.f26500i = dVar;
        this.f26494c = new ScaleGestureDetector(context, new C11927a());
    }

    /* renamed from: a */
    public final void mo38653a(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int action = motionEvent.getAction() & 255;
        int i = 0;
        if (action != 0) {
            int i2 = 1;
            if (action == 1) {
                this.f26492a = -1;
                if (this.f26496e && this.f26495d != null) {
                    try {
                        f3 = motionEvent.getX(this.f26493b);
                    } catch (Exception unused) {
                        f3 = motionEvent.getX();
                    }
                    this.f26497f = f3;
                    try {
                        f4 = motionEvent.getY(this.f26493b);
                    } catch (Exception unused2) {
                        f4 = motionEvent.getY();
                    }
                    this.f26498g = f4;
                    this.f26495d.addMovement(motionEvent);
                    this.f26495d.computeCurrentVelocity(1000);
                    Math.max(Math.abs(this.f26495d.getXVelocity()), Math.abs(this.f26495d.getYVelocity()));
                }
                VelocityTracker velocityTracker = this.f26495d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f26495d = null;
                }
            } else if (action == 2) {
                try {
                    f5 = motionEvent.getX(this.f26493b);
                } catch (Exception unused3) {
                    f5 = motionEvent.getX();
                }
                try {
                    f6 = motionEvent.getY(this.f26493b);
                } catch (Exception unused4) {
                    f6 = motionEvent.getY();
                }
                float f7 = f5 - this.f26497f;
                float f8 = f6 - this.f26498g;
                if (!this.f26496e) {
                    this.f26496e = Math.sqrt((double) ((f8 * f8) + (f7 * f7))) >= ((double) this.f26499h);
                }
                if (this.f26496e) {
                    DraggableViewAttacher.C11936a aVar = (DraggableViewAttacher.C11936a) this.f26500i;
                    if (!DraggableViewAttacher.this.mScaleDragDetector.f26494c.isInProgress()) {
                        if (DraggableViewAttacher.this.mOnViewDragListener != null) {
                            DraggableViewAttacher.this.mOnViewDragListener.onDrag(f7, f8);
                        }
                        ViewParent parent = DraggableViewAttacher.this.view.getParent();
                        if (!DraggableViewAttacher.this.mAllowParentInterceptOnEdge || DraggableViewAttacher.this.mBlockParentIntercept) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        } else if ((DraggableViewAttacher.this.mHorizontalScrollEdge == 2 || ((DraggableViewAttacher.this.mHorizontalScrollEdge == 0 && f7 >= 1.0f) || ((DraggableViewAttacher.this.mHorizontalScrollEdge == 1 && f7 <= -1.0f) || ((DraggableViewAttacher.this.mVerticalScrollEdge == 0 && f8 >= 1.0f) || (DraggableViewAttacher.this.mVerticalScrollEdge == 1 && f8 <= -1.0f))))) && parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    this.f26497f = f5;
                    this.f26498g = f6;
                    VelocityTracker velocityTracker2 = this.f26495d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f26492a = -1;
                VelocityTracker velocityTracker3 = this.f26495d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f26495d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f26492a) {
                    if (action2 != 0) {
                        i2 = 0;
                    }
                    this.f26492a = motionEvent.getPointerId(i2);
                    this.f26497f = motionEvent.getX(i2);
                    this.f26498g = motionEvent.getY(i2);
                }
            }
        } else {
            this.f26492a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f26495d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                f = motionEvent.getX(this.f26493b);
            } catch (Exception unused5) {
                f = motionEvent.getX();
            }
            this.f26497f = f;
            try {
                f2 = motionEvent.getY(this.f26493b);
            } catch (Exception unused6) {
                f2 = motionEvent.getY();
            }
            this.f26498g = f2;
            this.f26496e = false;
        }
        int i3 = this.f26492a;
        if (i3 != -1) {
            i = i3;
        }
        this.f26493b = motionEvent.findPointerIndex(i);
    }
}
