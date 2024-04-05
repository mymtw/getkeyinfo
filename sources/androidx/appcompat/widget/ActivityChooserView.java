package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.core.view.C2277b;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import p109g.C6826c;
import p628nj.C18263b;

public class ActivityChooserView extends ViewGroup {
    private final View mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    public final C0247f mAdapter;
    private final C0248g mCallbacks;
    private int mDefaultActionButtonContentDescription;
    public final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    public final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    public int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    public boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private C0311f0 mListPopupWindow;
    public final DataSetObserver mModelDataSetObserver;
    public PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    public C2277b mProvider;

    public static class InnerLayout extends LinearLayout {
        private static final int[] TINT_ATTRS = {16842964};

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r1 = r4.getResourceId(0, 0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InnerLayout(android.content.Context r3, android.util.AttributeSet r4) {
            /*
                r2 = this;
                r2.<init>(r3, r4)
                int[] r0 = TINT_ATTRS
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
                r0 = 0
                boolean r1 = r4.hasValue(r0)
                if (r1 == 0) goto L_0x001b
                int r1 = r4.getResourceId(r0, r0)
                if (r1 == 0) goto L_0x001b
                android.graphics.drawable.Drawable r3 = p075d.C6614a.m12981a(r3, r1)
                goto L_0x001f
            L_0x001b:
                android.graphics.drawable.Drawable r3 = r4.getDrawable(r0)
            L_0x001f:
                r2.setBackgroundDrawable(r3)
                r4.recycle()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.InnerLayout.<init>(android.content.Context, android.util.AttributeSet):void");
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0242a extends DataSetObserver {
        public C0242a() {
        }

        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mAdapter.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class C0243b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0243b() {
        }

        public final void onGlobalLayout() {
            C2277b.C2278a aVar;
            if (!ActivityChooserView.this.isShowingPopup()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().mo2003a();
            C2277b bVar = ActivityChooserView.this.mProvider;
            if (bVar != null && (aVar = bVar.f5535a) != null) {
                ((ActionMenuPresenter) aVar).mo2154d(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0244c extends View.AccessibilityDelegate {
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0245d extends ForwardingListener {
        public C0245d(FrameLayout frameLayout) {
            super(frameLayout);
        }

        public final C6826c getPopup() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        public final boolean onForwardingStarted() {
            ActivityChooserView.this.showPopup();
            return true;
        }

        public final boolean onForwardingStopped() {
            ActivityChooserView.this.dismissPopup();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0246e extends DataSetObserver {
        public C0246e() {
        }

        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.updateAppearance();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0247f extends BaseAdapter {
        public C0247f() {
        }

        public final int getCount() {
            throw null;
        }

        public final Object getItem(int i) {
            throw null;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            getItemViewType(i);
            if (view == null || view.getId() != R.id.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            getItem(i);
            throw null;
        }

        public final int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class C0248g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public C0248g() {
        }

        public final void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                activityChooserView.dismissPopup();
                ActivityChooserView.this.mAdapter.getClass();
                throw null;
            } else if (view == activityChooserView.mExpandActivityOverflowButton) {
                activityChooserView.mIsSelectingDefaultActivity = false;
                activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onDismiss() {
            C2277b.C2278a aVar;
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            C2277b bVar = ActivityChooserView.this.mProvider;
            if (bVar != null && (aVar = bVar.f5535a) != null) {
                ((ActionMenuPresenter) aVar).mo2154d(false);
            }
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((C0247f) adapterView.getAdapter()).getClass();
            ActivityChooserView.this.dismissPopup();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.mIsSelectingDefaultActivity) {
                activityChooserView.mAdapter.getClass();
                throw null;
            } else if (i > 0) {
                activityChooserView.mAdapter.getClass();
                throw null;
            }
        }

        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                activityChooserView.mAdapter.getClass();
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        return true;
    }

    public C0304c getDataModel() {
        this.mAdapter.getClass();
        return null;
    }

    public C0311f0 getListPopupWindow() {
        if (this.mListPopupWindow == null) {
            C0311f0 f0Var = new C0311f0(getContext());
            this.mListPopupWindow = f0Var;
            f0Var.mo2479m(this.mAdapter);
            C0311f0 f0Var2 = this.mListPopupWindow;
            f0Var2.f785p = this;
            f0Var2.f794y = true;
            f0Var2.f795z.setFocusable(true);
            C0311f0 f0Var3 = this.mListPopupWindow;
            C0248g gVar = this.mCallbacks;
            f0Var3.f786q = gVar;
            f0Var3.f795z.setOnDismissListener(gVar);
        }
        return this.mListPopupWindow;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().mo2004b();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAdapter.getClass();
        this.mIsAttachedToWindow = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAdapter.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mActivityChooserContent.layout(0, 0, i3 - i, i4 - i2);
        if (!isShowingPopup()) {
            dismissPopup();
        }
    }

    public void onMeasure(int i, int i2) {
        View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0304c cVar) {
        C0247f fVar = this.mAdapter;
        ActivityChooserView.this.mAdapter.getClass();
        fVar.notifyDataSetChanged();
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.mDefaultActionButtonContentDescription = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.mExpandActivityOverflowButtonImage.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.mInitialActivityCount = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setProvider(C2277b bVar) {
        this.mProvider = bVar;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    public void showPopupUnchecked(int i) {
        this.mAdapter.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public void updateAppearance() {
        this.mAdapter.getClass();
        throw null;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mModelDataSetObserver = new C0242a();
        this.mOnGlobalLayoutListener = new C0243b();
        this.mInitialActivityCount = 4;
        int[] iArr = C18263b.f40072k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C2364y.m5200o(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, this, true);
        C0248g gVar = new C0248g();
        this.mCallbacks = gVar;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.mActivityChooserContent = findViewById;
        this.mActivityChooserContentBackground = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.mDefaultActivityButton = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        this.mDefaultActivityButtonImage = (ImageView) frameLayout.findViewById(R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C0244c());
        frameLayout2.setOnTouchListener(new C0245d(frameLayout2));
        this.mExpandActivityOverflowButton = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.image);
        this.mExpandActivityOverflowButtonImage = imageView;
        imageView.setImageDrawable(drawable);
        C0247f fVar = new C0247f();
        this.mAdapter = fVar;
        fVar.registerDataSetObserver(new C0246e());
        Resources resources = context.getResources();
        this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }
}
