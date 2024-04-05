package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0326j;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLException;
import p149j3.C7103d;
import p206p3.C7655a;
import p206p3.C7656b;
import p206p3.C7659e;
import p214q3.C7719b;
import p214q3.C7720c;
import p214q3.C7722e;
import p772tq.C20203a;

public class LottieAnimationView extends AppCompatImageView {
    /* access modifiers changed from: private */
    public static final C4838i<Throwable> DEFAULT_FAILURE_LISTENER = new C4804a();
    private static final String TAG = "LottieAnimationView";
    private String animationName;
    private int animationResId;
    private boolean autoPlay = false;
    private int buildDrawingCacheDepth = 0;
    private C4828c composition;
    private C4849n<C4828c> compositionTask;
    /* access modifiers changed from: private */
    public C4838i<Throwable> failureListener;
    /* access modifiers changed from: private */
    public int fallbackResource = 0;
    private boolean isInitialized;
    private final C4838i<C4828c> loadedListener = new C4805b();
    private final LottieDrawable lottieDrawable = new LottieDrawable();
    private Set<C4839j> lottieOnCompositionLoadedListeners = new HashSet();
    private RenderMode renderMode = RenderMode.AUTOMATIC;
    private boolean wasAnimatingWhenDetached = false;
    private boolean wasAnimatingWhenNotShown = false;
    private final C4838i<Throwable> wrappedFailureListener = new C4806c();

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4803a();

        /* renamed from: b */
        public String f10800b;

        /* renamed from: c */
        public int f10801c;

        /* renamed from: d */
        public float f10802d;

        /* renamed from: e */
        public boolean f10803e;

        /* renamed from: f */
        public String f10804f;

        /* renamed from: g */
        public int f10805g;

        /* renamed from: h */
        public int f10806h;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        public class C4803a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f10800b);
            parcel.writeFloat(this.f10802d);
            parcel.writeInt(this.f10803e ? 1 : 0);
            parcel.writeString(this.f10804f);
            parcel.writeInt(this.f10805g);
            parcel.writeInt(this.f10806h);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f10800b = parcel.readString();
            this.f10802d = parcel.readFloat();
            this.f10803e = parcel.readInt() != 1 ? false : true;
            this.f10804f = parcel.readString();
            this.f10805g = parcel.readInt();
            this.f10806h = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C4804a implements C4838i<Throwable> {
        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            PathMeasure pathMeasure = C7659e.f16963a;
            if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
                C7656b.f16960a.getClass();
                HashSet hashSet = C7655a.f16959a;
                if (!hashSet.contains("Unable to load composition.")) {
                    Log.w("LOTTIE", "Unable to load composition.", th);
                    hashSet.add("Unable to load composition.");
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public class C4805b implements C4838i<C4828c> {
        public C4805b() {
        }

        public final void onResult(Object obj) {
            LottieAnimationView.this.setComposition((C4828c) obj);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public class C4806c implements C4838i<Throwable> {
        public C4806c() {
        }

        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            if (LottieAnimationView.this.fallbackResource != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (LottieAnimationView.this.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : LottieAnimationView.this.failureListener).onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    public class C4807d extends C7720c<T> {
        public C4807d(C7722e eVar) {
        }

        /* renamed from: a */
        public final T mo14498a(C7719b<T> bVar) {
            throw null;
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$e */
    public static /* synthetic */ class C4808e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10809a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.RenderMode[] r0 = com.airbnb.lottie.RenderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10809a = r0
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10809a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10809a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C4808e.<clinit>():void");
        }
    }

    static {
        Class<LottieAnimationView> cls = LottieAnimationView.class;
    }

    public LottieAnimationView(Context context) {
        super(context);
        init((AttributeSet) null);
    }

    private void cancelLoaderTask() {
        C4849n<C4828c> nVar = this.compositionTask;
        if (nVar != null) {
            C4838i<C4828c> iVar = this.loadedListener;
            synchronized (nVar) {
                nVar.f11016a.remove(iVar);
            }
            C4849n<C4828c> nVar2 = this.compositionTask;
            C4838i<Throwable> iVar2 = this.wrappedFailureListener;
            synchronized (nVar2) {
                nVar2.f11017b.remove(iVar2);
            }
        }
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.clearComposition();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void enableOrDisableHardwareLayer() {
        /*
            r6 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C4808e.f10809a
            com.airbnb.lottie.RenderMode r1 = r6.renderMode
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0030
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = r2
            goto L_0x0030
        L_0x0015:
            com.airbnb.lottie.c r0 = r6.composition
            r3 = 0
            if (r0 == 0) goto L_0x0025
            boolean r4 = r0.f10854n
            if (r4 == 0) goto L_0x0025
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L_0x0025
            goto L_0x002e
        L_0x0025:
            if (r0 == 0) goto L_0x002d
            int r0 = r0.f10855o
            r4 = 4
            if (r0 <= r4) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0013
        L_0x0030:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L_0x003a
            r0 = 0
            r6.setLayerType(r1, r0)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.enableOrDisableHardwareLayer():void");
    }

    private void init(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15588c1.f35080f);
        boolean z = false;
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(14);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(4);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(14)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(3, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.wasAnimatingWhenDetached = true;
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.lottieDrawable.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatMode(obtainStyledAttributes.getInt(11, 1));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatCount(obtainStyledAttributes.getInt(10, -1));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            setSpeed(obtainStyledAttributes.getFloat(13, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(5));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(2, false));
        if (obtainStyledAttributes.hasValue(1)) {
            addValueCallback(new C7103d("**"), C4840k.f10874B, new C7720c(new SimpleColorFilter(obtainStyledAttributes.getColor(1, 0))));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.lottieDrawable.setScale(obtainStyledAttributes.getFloat(12, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            RenderMode renderMode2 = RenderMode.AUTOMATIC;
            int i = obtainStyledAttributes.getInt(9, renderMode2.ordinal());
            if (i >= RenderMode.values().length) {
                i = renderMode2.ordinal();
            }
            setRenderMode(RenderMode.values()[i]);
        }
        obtainStyledAttributes.recycle();
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        Context context = getContext();
        PathMeasure pathMeasure = C7659e.f16963a;
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            z = true;
        }
        lottieDrawable2.setSystemAnimationsAreEnabled(Boolean.valueOf(z));
        enableOrDisableHardwareLayer();
        this.isInitialized = true;
    }

    private void setCompositionTask(C4849n<C4828c> nVar) {
        clearComposition();
        cancelLoaderTask();
        nVar.mo14619a(this.loadedListener);
        C4838i<Throwable> iVar = this.wrappedFailureListener;
        synchronized (nVar) {
            if (!(nVar.f11019d == null || nVar.f11019d.f10903b == null)) {
                iVar.onResult(nVar.f11019d.f10903b);
            }
            nVar.f11017b.add(iVar);
        }
        this.compositionTask = nVar;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(C4839j jVar) {
        if (this.composition != null) {
            jVar.mo14590a();
        }
        return this.lottieOnCompositionLoadedListeners.add(jVar);
    }

    public <T> void addValueCallback(C7103d dVar, T t, C7720c<T> cVar) {
        this.lottieDrawable.addValueCallback(dVar, t, cVar);
    }

    public void buildDrawingCache(boolean z) {
        this.buildDrawingCacheDepth++;
        super.buildDrawingCache(z);
        if (this.buildDrawingCacheDepth == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.buildDrawingCacheDepth--;
        C20203a.m34518A();
    }

    public void cancelAnimation() {
        this.wasAnimatingWhenNotShown = false;
        this.lottieDrawable.cancelAnimation();
        enableOrDisableHardwareLayer();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.enableMergePathsForKitKatAndAbove(z);
    }

    public C4828c getComposition() {
        return this.composition;
    }

    public long getDuration() {
        C4828c cVar = this.composition;
        if (cVar != null) {
            return (long) cVar.mo14582b();
        }
        return 0;
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    public C4851o getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getScale() {
        return this.lottieDrawable.getScale();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        if (drawable2 == lottieDrawable2) {
            super.invalidateDrawable(lottieDrawable2);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isMergePathsEnabledForKitKatAndAbove();
    }

    @Deprecated
    public void loop(boolean z) {
        this.lottieDrawable.setRepeatCount(z ? -1 : 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.autoPlay || this.wasAnimatingWhenDetached) {
            playAnimation();
            this.autoPlay = false;
            this.wasAnimatingWhenDetached = false;
        }
    }

    public void onDetachedFromWindow() {
        if (isAnimating()) {
            cancelAnimation();
            this.wasAnimatingWhenDetached = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f10800b;
        this.animationName = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.animationName);
        }
        int i = savedState.f10801c;
        this.animationResId = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f10802d);
        if (savedState.f10803e) {
            playAnimation();
        }
        this.lottieDrawable.setImagesAssetsFolder(savedState.f10804f);
        setRepeatMode(savedState.f10805g);
        setRepeatCount(savedState.f10806h);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10800b = this.animationName;
        savedState.f10801c = this.animationResId;
        savedState.f10802d = this.lottieDrawable.getProgress();
        savedState.f10803e = this.lottieDrawable.isAnimating();
        savedState.f10804f = this.lottieDrawable.getImageAssetsFolder();
        savedState.f10805g = this.lottieDrawable.getRepeatMode();
        savedState.f10806h = this.lottieDrawable.getRepeatCount();
        return savedState;
    }

    public void onVisibilityChanged(View view, int i) {
        if (this.isInitialized) {
            if (isShown()) {
                if (this.wasAnimatingWhenNotShown) {
                    resumeAnimation();
                    this.wasAnimatingWhenNotShown = false;
                }
            } else if (isAnimating()) {
                pauseAnimation();
                this.wasAnimatingWhenNotShown = true;
            }
        }
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.lottieDrawable.pauseAnimation();
        enableOrDisableHardwareLayer();
    }

    public void playAnimation() {
        if (isShown()) {
            this.lottieDrawable.playAnimation();
            enableOrDisableHardwareLayer();
            return;
        }
        this.wasAnimatingWhenNotShown = true;
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(C4839j jVar) {
        return this.lottieOnCompositionLoadedListeners.remove(jVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<C7103d> resolveKeyPath(C7103d dVar) {
        return this.lottieDrawable.resolveKeyPath(dVar);
    }

    public void resumeAnimation() {
        if (isShown()) {
            this.lottieDrawable.resumeAnimation();
            enableOrDisableHardwareLayer();
            return;
        }
        this.wasAnimatingWhenNotShown = true;
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(C4829d.m10418a(str, new C4836g(inputStream, str)));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        Context context = getContext();
        HashMap hashMap = C4829d.f10856a;
        setCompositionTask(C4829d.m10418a(C0326j.m864i("url_", str), new C4834e(context, str)));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.setApplyingOpacityToLayersEnabled(z);
    }

    public void setComposition(C4828c cVar) {
        this.lottieDrawable.setCallback(this);
        this.composition = cVar;
        boolean composition2 = this.lottieDrawable.setComposition(cVar);
        enableOrDisableHardwareLayer();
        if (getDrawable() != this.lottieDrawable || composition2) {
            setImageDrawable((Drawable) null);
            setImageDrawable(this.lottieDrawable);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (C4839j a : this.lottieOnCompositionLoadedListeners) {
                a.mo14590a();
            }
        }
    }

    public void setFailureListener(C4838i<Throwable> iVar) {
        this.failureListener = iVar;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(C4826a aVar) {
        this.lottieDrawable.setFontAssetDelegate(aVar);
    }

    public void setFrame(int i) {
        this.lottieDrawable.setFrame(i);
    }

    public void setImageAssetDelegate(C4827b bVar) {
        this.lottieDrawable.setImageAssetDelegate(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.setMaxFrame(i);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.setMaxProgress(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.setMinAndMaxProgress(f, f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.setMinFrame(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.setMinProgress(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(float f) {
        this.lottieDrawable.setProgress(f);
    }

    public void setRenderMode(RenderMode renderMode2) {
        this.renderMode = renderMode2;
        enableOrDisableHardwareLayer();
    }

    public void setRepeatCount(int i) {
        this.lottieDrawable.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.lottieDrawable.setRepeatMode(i);
    }

    public void setScale(float f) {
        this.lottieDrawable.setScale(f);
        if (getDrawable() == this.lottieDrawable) {
            setImageDrawable((Drawable) null);
            setImageDrawable(this.lottieDrawable);
        }
    }

    public void setSpeed(float f) {
        this.lottieDrawable.setSpeed(f);
    }

    public void setTextDelegate(C4853p pVar) {
        this.lottieDrawable.setTextDelegate(pVar);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(C7103d dVar, T t, C7722e<T> eVar) {
        this.lottieDrawable.addValueCallback(dVar, t, new C4807d(eVar));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.setMinAndMaxFrame(i, i2);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.setMinFrame(str);
    }

    public void setAnimation(int i) {
        this.animationResId = i;
        this.animationName = null;
        setCompositionTask(C4829d.m10421d(getContext(), i));
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        Context context = getContext();
        HashMap hashMap = C4829d.f10856a;
        setCompositionTask(C4829d.m10418a(str, new C4835f(context.getApplicationContext(), str)));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
