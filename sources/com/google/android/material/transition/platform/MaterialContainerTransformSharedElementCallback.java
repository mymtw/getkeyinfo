package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.BlendModeCompat;
import com.etsy.android.R;
import com.google.android.material.shape.C15401a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p289y0.C8349a;
import p550dl.C17585k;
import p597jl.C18032s;
import p597jl.C18035v;

public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    /* access modifiers changed from: private */
    public static WeakReference<View> capturedSharedElement;
    private boolean entering = true;
    private Rect returnEndBounds;
    private C15556d shapeProvider = new C15557e();
    private boolean sharedElementReenterTransitionEnabled = false;
    private boolean transparentWindowBackgroundEnabled = true;

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$a */
    public class C15553a extends C18032s {

        /* renamed from: a */
        public final /* synthetic */ Window f34996a;

        public C15553a(Window window) {
            this.f34996a = window;
        }

        public final void onTransitionEnd(Transition transition) {
            MaterialContainerTransformSharedElementCallback.restoreWindowBackground(this.f34996a);
        }

        public final void onTransitionStart(Transition transition) {
            MaterialContainerTransformSharedElementCallback.removeWindowBackground(this.f34996a);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$b */
    public class C15554b extends C18032s {

        /* renamed from: a */
        public final /* synthetic */ Activity f34997a;

        public C15554b(Activity activity) {
            this.f34997a = activity;
        }

        public final void onTransitionEnd(Transition transition) {
            View view;
            if (!(MaterialContainerTransformSharedElementCallback.capturedSharedElement == null || (view = (View) MaterialContainerTransformSharedElementCallback.capturedSharedElement.get()) == null)) {
                view.setAlpha(1.0f);
                WeakReference unused = MaterialContainerTransformSharedElementCallback.capturedSharedElement = null;
            }
            this.f34997a.finish();
            this.f34997a.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$c */
    public class C15555c extends C18032s {

        /* renamed from: a */
        public final /* synthetic */ Window f34998a;

        public C15555c(Window window) {
            this.f34998a = window;
        }

        public final void onTransitionStart(Transition transition) {
            MaterialContainerTransformSharedElementCallback.removeWindowBackground(this.f34998a);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$d */
    public interface C15556d {
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$e */
    public static class C15557e implements C15556d {
    }

    private static Drawable getWindowBackground(Window window) {
        return window.getDecorView().getBackground();
    }

    /* access modifiers changed from: private */
    public static void removeWindowBackground(Window window) {
        Drawable windowBackground = getWindowBackground(window);
        if (windowBackground != null) {
            windowBackground.mutate().setColorFilter(C8349a.m16658a(BlendModeCompat.CLEAR));
        }
    }

    /* access modifiers changed from: private */
    public static void restoreWindowBackground(Window window) {
        Drawable windowBackground = getWindowBackground(window);
        if (windowBackground != null) {
            windowBackground.mutate().clearColorFilter();
        }
    }

    private void setUpEnterTransform(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.sharedElementReenterTransitionEnabled) {
                window.setSharedElementReenterTransition((Transition) null);
            }
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new C15553a(window));
            }
        }
    }

    private void setUpReturnTransform(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new C15554b(activity));
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new C15555c(window));
            }
        }
    }

    private static void updateBackgroundFadeDuration(Window window, MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }

    public C15556d getShapeProvider() {
        return this.shapeProvider;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.sharedElementReenterTransitionEnabled;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.transparentWindowBackgroundEnabled;
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        capturedSharedElement = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (!(onCreateSnapshotView == null || (weakReference = capturedSharedElement) == null || this.shapeProvider == null || (view = weakReference.get()) == null)) {
            ((C15557e) this.shapeProvider).getClass();
            C15401a shapeAppearanceModel = view instanceof C17585k ? ((C17585k) view).getShapeAppearanceModel() : null;
            if (shapeAppearanceModel != null) {
                onCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, shapeAppearanceModel);
            }
        }
        return onCreateSnapshotView;
    }

    public void onMapSharedElements(List<String> list, Map<String, View> map) {
        View view;
        Activity activity;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                Window window = activity.getWindow();
                if (this.entering) {
                    setUpEnterTransform(window);
                } else {
                    setUpReturnTransform(activity, window);
                }
            }
        }
    }

    public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, (Object) null);
        }
        if (!this.entering && !list2.isEmpty()) {
            View view = list2.get(0);
            RectF rectF = C18035v.f39454a;
            this.returnEndBounds = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        this.entering = false;
    }

    public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.entering && !list2.isEmpty() && this.returnEndBounds != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.height(), 1073741824));
            Rect rect = this.returnEndBounds;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setShapeProvider(C15556d dVar) {
        this.shapeProvider = dVar;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.sharedElementReenterTransitionEnabled = z;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.transparentWindowBackgroundEnabled = z;
    }
}
