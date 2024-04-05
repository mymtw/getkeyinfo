package com.etsy.android.uikit.p331ui.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.uikit.util.AnimationUtil;
import com.etsy.android.uikit.util.C11914o;
import java.util.WeakHashMap;

/* renamed from: com.etsy.android.uikit.ui.core.ArrowIndicator */
public class ArrowIndicator extends AppCompatImageView {
    /* access modifiers changed from: private */
    public View mAnimateTo;
    private ViewPropertyAnimator mAnimator;
    private RecyclerView.C3105p mOnChildAttachStateChangeListener;
    /* access modifiers changed from: private */
    public RecyclerView mRecyclerView;
    private RecyclerView.C3108s mRecyclerViewScrollListener;
    /* access modifiers changed from: private */
    public int mSelectedPosition = -1;
    private int mTwoPaneArrowYOffset;

    /* renamed from: com.etsy.android.uikit.ui.core.ArrowIndicator$a */
    public class C11879a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final /* synthetic */ View f26422b;

        public C11879a(View view) {
            this.f26422b = view;
        }

        public final void onGlobalLayout() {
            C11914o.m19630b(this.f26422b.getViewTreeObserver(), this);
            View access$000 = ArrowIndicator.this.mAnimateTo;
            View view = this.f26422b;
            if (access$000 == view) {
                ArrowIndicator.this.animateArrowToView(view);
            }
        }
    }

    /* renamed from: com.etsy.android.uikit.ui.core.ArrowIndicator$b */
    public class C11880b extends RecyclerView.C3108s {
        public C11880b() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ArrowIndicator arrowIndicator = ArrowIndicator.this;
            arrowIndicator.setTranslationY(arrowIndicator.getTranslationY() - ((float) i2));
        }
    }

    /* renamed from: com.etsy.android.uikit.ui.core.ArrowIndicator$c */
    public class C11881c implements RecyclerView.C3105p {

        /* renamed from: com.etsy.android.uikit.ui.core.ArrowIndicator$c$a */
        public class C11882a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ View f26426b;

            public C11882a(View view) {
                this.f26426b = view;
            }

            public final void run() {
                ArrowIndicator.this.moveArrowToView(this.f26426b);
            }
        }

        public C11881c() {
        }

        /* renamed from: a */
        public final void mo11683a(View view) {
            ArrowIndicator.this.mRecyclerView.getLayoutManager().getClass();
            if (ArrowIndicator.this.mSelectedPosition == RecyclerView.C3100o.m7396I(view)) {
                ArrowIndicator.this.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo11684b(View view) {
            ArrowIndicator.this.mRecyclerView.getLayoutManager().getClass();
            if (ArrowIndicator.this.mSelectedPosition == RecyclerView.C3100o.m7396I(view)) {
                RecyclerView.C3100o layoutManager = ArrowIndicator.this.mRecyclerView.getLayoutManager();
                C11882a aVar = new C11882a(view);
                RecyclerView recyclerView = layoutManager.f7072b;
                if (recyclerView != null) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5223m(recyclerView, aVar);
                }
            }
        }
    }

    public ArrowIndicator(Context context) {
        super(context);
        init();
    }

    private void animateArrowToY(View view) {
        int newY = getNewY(view);
        if (getVisibility() == 8) {
            setTranslationY((float) newY);
            AnimationUtil.m19606b(200, this);
            return;
        }
        ViewPropertyAnimator duration = animate().translationY((float) newY).setDuration(200);
        this.mAnimator = duration;
        duration.start();
        setVisibility(0);
    }

    private int getNewY(View view) {
        View view2 = (View) view.getParent();
        int i = 0;
        while (view2 != null && view2 != getParent()) {
            i += view2.getTop();
            view2 = (View) view2.getParent();
        }
        return ((view.getHeight() / 2) + (view.getTop() + i)) - this.mTwoPaneArrowYOffset;
    }

    private void init() {
        this.mTwoPaneArrowYOffset = getResources().getDimensionPixelSize(R.dimen.tpane_arrow_height);
    }

    public void animateArrowToView(View view) {
        if (view != null) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!C2364y.C2371g.m5246c(view) || view.isDirty()) {
                this.mAnimateTo = view;
                C11914o.m19629a(view.getViewTreeObserver(), new C11879a(view));
                return;
            }
            animateArrowToY(view);
        }
    }

    public void follow(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        recyclerView.removeOnScrollListener(this.mRecyclerViewScrollListener);
        C11880b bVar = new C11880b();
        this.mRecyclerViewScrollListener = bVar;
        recyclerView.addOnScrollListener(bVar);
        recyclerView.removeOnChildAttachStateChangeListener(this.mOnChildAttachStateChangeListener);
        C11881c cVar = new C11881c();
        this.mOnChildAttachStateChangeListener = cVar;
        recyclerView.addOnChildAttachStateChangeListener(cVar);
    }

    public void moveArrowToView(View view) {
        if (view != null) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2371g.m5246c(view)) {
                setTranslationY((float) getNewY(view));
                setVisibility(0);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAnimateTo = null;
        ViewPropertyAnimator viewPropertyAnimator = this.mAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.mAnimator = null;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.mRecyclerViewScrollListener);
            this.mRecyclerView.removeOnChildAttachStateChangeListener(this.mOnChildAttachStateChangeListener);
            this.mRecyclerView = null;
        }
    }

    public void setSelectedPosition(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int i2 = this.mSelectedPosition;
            if (i != i2) {
                RecyclerView.C3084b0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2);
                RecyclerView.C3084b0 findViewHolderForAdapterPosition2 = this.mRecyclerView.findViewHolderForAdapterPosition(i);
                if (!(i2 == -1 || findViewHolderForAdapterPosition == null)) {
                    moveArrowToView(findViewHolderForAdapterPosition.itemView);
                }
                this.mSelectedPosition = i;
                if (findViewHolderForAdapterPosition2 != null) {
                    animateArrowToView(findViewHolderForAdapterPosition2.itemView);
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("ArrowIndicator must be following a RecyclerView to set the selected position");
    }

    public ArrowIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ArrowIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
