package com.etsy.android.uikit.view.draggable;

import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.etsy.android.uikit.view.C11926a;
import p462ug.C13532h;

public class DraggableViewAttacher implements View.OnTouchListener {
    private static final int HORIZONTAL_EDGE_BOTH = 2;
    private static final int HORIZONTAL_EDGE_LEFT = 0;
    private static final int HORIZONTAL_EDGE_RIGHT = 1;
    private static final int VERTICAL_EDGE_BOTH = 2;
    private static final int VERTICAL_EDGE_BOTTOM = 1;
    private static final int VERTICAL_EDGE_TOP = 0;
    /* access modifiers changed from: private */
    public boolean mAllowParentInterceptOnEdge = true;
    /* access modifiers changed from: private */
    public boolean mBlockParentIntercept = false;
    private GestureDetector mGestureDetector;
    /* access modifiers changed from: private */
    public int mHorizontalScrollEdge = 2;
    /* access modifiers changed from: private */
    public View.OnLongClickListener mLongClickListener;
    /* access modifiers changed from: private */
    public View.OnClickListener mOnClickListener;
    /* access modifiers changed from: private */
    public C13532h mOnViewDragListener;
    /* access modifiers changed from: private */
    public C11926a mScaleDragDetector;
    /* access modifiers changed from: private */
    public int mVerticalScrollEdge = 2;
    private C11939d onGestureListener = new C11936a();
    /* access modifiers changed from: private */
    public View view;

    /* renamed from: com.etsy.android.uikit.view.draggable.DraggableViewAttacher$a */
    public class C11936a implements C11939d {
        public C11936a() {
        }
    }

    /* renamed from: com.etsy.android.uikit.view.draggable.DraggableViewAttacher$b */
    public class C11937b extends GestureDetector.SimpleOnGestureListener {
        public C11937b() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (DraggableViewAttacher.this.mLongClickListener != null) {
                DraggableViewAttacher.this.mLongClickListener.onLongClick(DraggableViewAttacher.this.view);
            }
        }
    }

    /* renamed from: com.etsy.android.uikit.view.draggable.DraggableViewAttacher$c */
    public class C11938c implements GestureDetector.OnDoubleTapListener {
        public C11938c() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (DraggableViewAttacher.this.mOnClickListener == null) {
                return false;
            }
            DraggableViewAttacher.this.mOnClickListener.onClick(DraggableViewAttacher.this.view);
            return false;
        }
    }

    /* renamed from: com.etsy.android.uikit.view.draggable.DraggableViewAttacher$d */
    public interface C11939d {
    }

    public DraggableViewAttacher(View view2) {
        this.view = view2;
        view2.setOnTouchListener(this);
        if (!view2.isInEditMode()) {
            this.mScaleDragDetector = new C11926a(view2.getContext(), this.onGestureListener);
            GestureDetector gestureDetector = new GestureDetector(view2.getContext(), new C11937b());
            this.mGestureDetector = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new C11938c());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view2, MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getAction() == 0 && (parent = view2.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        C11926a aVar = this.mScaleDragDetector;
        boolean z = false;
        if (aVar != null) {
            boolean z2 = aVar.f26496e;
            try {
                aVar.f26494c.onTouchEvent(motionEvent);
                aVar.mo38653a(motionEvent);
            } catch (IllegalArgumentException unused) {
            }
            if (!z2 && !this.mScaleDragDetector.f26496e) {
                z = true;
            }
            this.mBlockParentIntercept = z;
            z = true;
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) {
            return z;
        }
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    public void setOnViewDragListener(C13532h hVar) {
        this.mOnViewDragListener = hVar;
    }
}
