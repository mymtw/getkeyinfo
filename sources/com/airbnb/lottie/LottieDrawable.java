package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.model.layer.C4847b;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.LottieValueAnimator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p003a2.C0023f;
import p010a9.C0048b;
import p137i3.C6985a;
import p137i3.C6986b;
import p149j3.C7103d;
import p149j3.C7104e;
import p149j3.C7106g;
import p149j3.C7107h;
import p158k3.C7179b;
import p158k3.C7186i;
import p158k3.C7187j;
import p158k3.C7188k;
import p196o3.C7540s;
import p206p3.C7655a;
import p206p3.C7656b;
import p206p3.C7658d;
import p206p3.C7659e;
import p214q3.C7719b;
import p214q3.C7720c;
import p214q3.C7722e;
import p772tq.C20203a;

public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private static final String TAG = "LottieDrawable";
    private int alpha;
    /* access modifiers changed from: private */
    public final LottieValueAnimator animator;
    private final Set<Object> colorFilterData;
    private C4828c composition;
    /* access modifiers changed from: private */
    public C4847b compositionLayer;
    private boolean enableMergePaths;
    public C4826a fontAssetDelegate;
    private C6985a fontAssetManager;
    private C4827b imageAssetDelegate;
    private C6986b imageAssetManager;
    private String imageAssetsFolder;
    private boolean isApplyingOpacityToLayersEnabled;
    private boolean isDirty;
    private final ArrayList<C4825q> lazyCompositionTasks;
    private final Matrix matrix = new Matrix();
    private boolean performanceTrackingEnabled;
    private final ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    private float scale;
    private boolean systemAnimationsEnabled;
    public C4853p textDelegate;

    /* renamed from: com.airbnb.lottie.LottieDrawable$a */
    public class C4809a implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ String f10810a;

        public C4809a(String str) {
            this.f10810a = str;
        }

        public final void run() {
            LottieDrawable.this.setMinAndMaxFrame(this.f10810a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$b */
    public class C4810b implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ int f10812a;

        /* renamed from: b */
        public final /* synthetic */ int f10813b;

        public C4810b(int i, int i2) {
            this.f10812a = i;
            this.f10813b = i2;
        }

        public final void run() {
            LottieDrawable.this.setMinAndMaxFrame(this.f10812a, this.f10813b);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$c */
    public class C4811c implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ float f10815a;

        /* renamed from: b */
        public final /* synthetic */ float f10816b;

        public C4811c(float f, float f2) {
            this.f10815a = f;
            this.f10816b = f2;
        }

        public final void run() {
            LottieDrawable.this.setMinAndMaxProgress(this.f10815a, this.f10816b);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$d */
    public class C4812d implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ int f10818a;

        public C4812d(int i) {
            this.f10818a = i;
        }

        public final void run() {
            LottieDrawable.this.setFrame(this.f10818a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$e */
    public class C4813e implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ float f10820a;

        public C4813e(float f) {
            this.f10820a = f;
        }

        public final void run() {
            LottieDrawable.this.setProgress(this.f10820a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$f */
    public class C4814f implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ C7103d f10822a;

        /* renamed from: b */
        public final /* synthetic */ Object f10823b;

        /* renamed from: c */
        public final /* synthetic */ C7720c f10824c;

        public C4814f(C7103d dVar, Object obj, C7720c cVar) {
            this.f10822a = dVar;
            this.f10823b = obj;
            this.f10824c = cVar;
        }

        public final void run() {
            LottieDrawable.this.addValueCallback(this.f10822a, this.f10823b, this.f10824c);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$g */
    public class C4815g extends C7720c<T> {
        public C4815g(C7722e eVar) {
        }

        /* renamed from: a */
        public final T mo14498a(C7719b<T> bVar) {
            throw null;
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$h */
    public class C4816h implements ValueAnimator.AnimatorUpdateListener {
        public C4816h() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (LottieDrawable.this.compositionLayer != null) {
                LottieDrawable.this.compositionLayer.mo14617o(LottieDrawable.this.animator.getAnimatedValueAbsolute());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$i */
    public class C4817i implements C4825q {
        public C4817i() {
        }

        public final void run() {
            LottieDrawable.this.playAnimation();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$j */
    public class C4818j implements C4825q {
        public C4818j() {
        }

        public final void run() {
            LottieDrawable.this.resumeAnimation();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$k */
    public class C4819k implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ int f10829a;

        public C4819k(int i) {
            this.f10829a = i;
        }

        public final void run() {
            LottieDrawable.this.setMinFrame(this.f10829a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$l */
    public class C4820l implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ float f10831a;

        public C4820l(float f) {
            this.f10831a = f;
        }

        public final void run() {
            LottieDrawable.this.setMinProgress(this.f10831a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$m */
    public class C4821m implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ int f10833a;

        public C4821m(int i) {
            this.f10833a = i;
        }

        public final void run() {
            LottieDrawable.this.setMaxFrame(this.f10833a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$n */
    public class C4822n implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ float f10835a;

        public C4822n(float f) {
            this.f10835a = f;
        }

        public final void run() {
            LottieDrawable.this.setMaxProgress(this.f10835a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$o */
    public class C4823o implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ String f10837a;

        public C4823o(String str) {
            this.f10837a = str;
        }

        public final void run() {
            LottieDrawable.this.setMinFrame(this.f10837a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$p */
    public class C4824p implements C4825q {

        /* renamed from: a */
        public final /* synthetic */ String f10839a;

        public C4824p(String str) {
            this.f10839a = str;
        }

        public final void run() {
            LottieDrawable.this.setMaxFrame(this.f10839a);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$q */
    public interface C4825q {
        void run();
    }

    static {
        Class<LottieDrawable> cls = LottieDrawable.class;
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.animator = lottieValueAnimator;
        this.scale = 1.0f;
        this.systemAnimationsEnabled = true;
        this.colorFilterData = new HashSet();
        this.lazyCompositionTasks = new ArrayList<>();
        C4816h hVar = new C4816h();
        this.progressUpdateListener = hVar;
        this.alpha = 255;
        this.isDirty = false;
        lottieValueAnimator.addUpdateListener(hVar);
    }

    private void buildCompositionLayer() {
        C4828c cVar = this.composition;
        JsonReader.C4854a aVar = C7540s.f16799a;
        Rect rect = cVar.f10850j;
        List emptyList = Collections.emptyList();
        Layer.LayerType layerType = Layer.LayerType.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C7188k kVar = r14;
        C7188k kVar2 = new C7188k();
        Layer layer = r2;
        Layer layer2 = new Layer(emptyList, cVar, "__container", -1, layerType, -1, (String) null, emptyList2, kVar, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), (C7186i) null, (C7187j) null, Collections.emptyList(), Layer.MatteType.NONE, (C7179b) null, false);
        C4828c cVar2 = this.composition;
        this.compositionLayer = new C4847b(this, layer, cVar2.f10849i, cVar2);
    }

    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private C6985a getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            this.fontAssetManager = new C6985a(getCallback());
        }
        return this.fontAssetManager;
    }

    private C6986b getImageAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        C6986b bVar = this.imageAssetManager;
        if (bVar != null) {
            Context context = getContext();
            if (!((context == null && bVar.f15481a == null) || bVar.f15481a.equals(context))) {
                this.imageAssetManager = null;
            }
        }
        if (this.imageAssetManager == null) {
            this.imageAssetManager = new C6986b(getCallback(), this.imageAssetsFolder, this.imageAssetDelegate, this.composition.f10844d);
        }
        return this.imageAssetManager;
    }

    private float getMaxScale(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.composition.f10850j.width()), ((float) canvas.getHeight()) / ((float) this.composition.f10850j.height()));
    }

    private void updateBounds() {
        if (this.composition != null) {
            float scale2 = getScale();
            setBounds(0, 0, (int) (((float) this.composition.f10850j.width()) * scale2), (int) (((float) this.composition.f10850j.height()) * scale2));
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(C7103d dVar, T t, C7720c<T> cVar) {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new C4814f(dVar, t, cVar));
            return;
        }
        C7104e eVar = dVar.f15804b;
        boolean z = true;
        if (eVar != null) {
            eVar.mo14604c(cVar, t);
        } else {
            List<C7103d> resolveKeyPath = resolveKeyPath(dVar);
            for (int i = 0; i < resolveKeyPath.size(); i++) {
                resolveKeyPath.get(i).f15804b.mo14604c(cVar, t);
            }
            z = true ^ resolveKeyPath.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == C4840k.f10873A) {
                setProgress(getProgress());
            }
        }
    }

    public void cancelAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
    }

    public void clearComposition() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        this.animator.clearComposition();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f;
        this.isDirty = false;
        if (this.compositionLayer != null) {
            float f2 = this.scale;
            float maxScale = getMaxScale(canvas);
            if (f2 > maxScale) {
                f = this.scale / maxScale;
            } else {
                maxScale = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.composition.f10850j.width()) / 2.0f;
                float height = ((float) this.composition.f10850j.height()) / 2.0f;
                float f3 = width * maxScale;
                float f4 = height * maxScale;
                canvas.translate((getScale() * width) - f3, (getScale() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.matrix.reset();
            this.matrix.preScale(maxScale, maxScale);
            this.compositionLayer.mo14607f(canvas, this.matrix, this.alpha);
            C20203a.m34518A();
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.endAnimation();
    }

    public int getAlpha() {
        return this.alpha;
    }

    public C4828c getComposition() {
        return this.composition;
    }

    public int getFrame() {
        return (int) this.animator.getFrame();
    }

    public Bitmap getImageAsset(String str) {
        C4837h hVar;
        C6986b imageAssetManager2 = getImageAssetManager();
        if (imageAssetManager2 == null || (hVar = imageAssetManager2.f15483c.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = hVar.f10872d;
        if (bitmap != null) {
            return bitmap;
        }
        imageAssetManager2.getClass();
        String str2 = hVar.f10871c;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(imageAssetManager2.f15482b)) {
                    AssetManager assets = imageAssetManager2.f15481a.getAssets();
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(imageAssetManager2.f15482b + str2), (Rect) null, options);
                    int i = hVar.f10869a;
                    int i2 = hVar.f10870b;
                    PathMeasure pathMeasure = C7659e.f16963a;
                    if (!(decodeStream.getWidth() == i && decodeStream.getHeight() == i2)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i, i2, true);
                        decodeStream.recycle();
                        decodeStream = createScaledBitmap;
                    }
                    imageAssetManager2.mo19154a(str, decodeStream);
                    return decodeStream;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e) {
                C7656b.f16960a.getClass();
                HashSet hashSet = C7655a.f16959a;
                if (hashSet.contains("Unable to open asset.")) {
                    return null;
                }
                Log.w("LOTTIE", "Unable to open asset.", e);
                hashSet.add("Unable to open asset.");
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                imageAssetManager2.mo19154a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                C7656b.f16960a.getClass();
                HashSet hashSet2 = C7655a.f16959a;
                if (hashSet2.contains("data URL did not have correct base64 format.")) {
                    return null;
                }
                Log.w("LOTTIE", "data URL did not have correct base64 format.", e2);
                hashSet2.add("data URL did not have correct base64 format.");
                return null;
            }
        }
    }

    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    public int getIntrinsicHeight() {
        C4828c cVar = this.composition;
        if (cVar == null) {
            return -1;
        }
        return (int) (getScale() * ((float) cVar.f10850j.height()));
    }

    public int getIntrinsicWidth() {
        C4828c cVar = this.composition;
        if (cVar == null) {
            return -1;
        }
        return (int) (getScale() * ((float) cVar.f10850j.width()));
    }

    public float getMaxFrame() {
        return this.animator.getMaxFrame();
    }

    public float getMinFrame() {
        return this.animator.getMinFrame();
    }

    public int getOpacity() {
        return -3;
    }

    public C4851o getPerformanceTracker() {
        C4828c cVar = this.composition;
        if (cVar != null) {
            return cVar.f10841a;
        }
        return null;
    }

    public float getProgress() {
        return this.animator.getAnimatedValueAbsolute();
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public float getScale() {
        return this.scale;
    }

    public float getSpeed() {
        return this.animator.getSpeed();
    }

    public C4853p getTextDelegate() {
        return null;
    }

    public Typeface getTypeface(String str, String str2) {
        C6985a fontAssetManager2 = getFontAssetManager();
        if (fontAssetManager2 == null) {
            return null;
        }
        C7107h hVar = fontAssetManager2.f15475a;
        hVar.f15811c = str;
        hVar.f15812d = str2;
        Typeface typeface = (Typeface) fontAssetManager2.f15476b.get(hVar);
        if (typeface == null) {
            typeface = (Typeface) fontAssetManager2.f15477c.get(str);
            if (typeface == null) {
                StringBuilder k = C0073e.m211k("fonts/", str);
                k.append(fontAssetManager2.f15479e);
                typeface = Typeface.createFromAsset(fontAssetManager2.f15478d, k.toString());
                fontAssetManager2.f15477c.put(str, typeface);
            }
            boolean contains = str2.contains("Italic");
            boolean contains2 = str2.contains("Bold");
            int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
            if (typeface.getStyle() != i) {
                typeface = Typeface.create(typeface, i);
            }
            fontAssetManager2.f15476b.put(fontAssetManager2.f15475a, typeface);
        }
        return typeface;
    }

    public boolean hasMasks() {
        C4847b bVar = this.compositionLayer;
        return bVar != null && bVar.mo14618p();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasMatte() {
        /*
            r5 = this;
            com.airbnb.lottie.model.layer.b r0 = r5.compositionLayer
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0048
            java.lang.Boolean r3 = r0.f11007A
            if (r3 != 0) goto L_0x003f
            com.airbnb.lottie.model.layer.a r3 = r0.f10999p
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r1
        L_0x0011:
            if (r3 == 0) goto L_0x0018
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f11007A = r3
            goto L_0x0036
        L_0x0018:
            java.util.ArrayList r3 = r0.f11010w
            int r3 = r3.size()
            int r3 = r3 - r2
        L_0x001f:
            if (r3 < 0) goto L_0x003b
            java.util.ArrayList r4 = r0.f11010w
            java.lang.Object r4 = r4.get(r3)
            com.airbnb.lottie.model.layer.a r4 = (com.airbnb.lottie.model.layer.C4845a) r4
            com.airbnb.lottie.model.layer.a r4 = r4.f10999p
            if (r4 == 0) goto L_0x002f
            r4 = r2
            goto L_0x0030
        L_0x002f:
            r4 = r1
        L_0x0030:
            if (r4 == 0) goto L_0x0038
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f11007A = r3
        L_0x0036:
            r0 = r2
            goto L_0x0045
        L_0x0038:
            int r3 = r3 + -1
            goto L_0x001f
        L_0x003b:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.f11007A = r3
        L_0x003f:
            java.lang.Boolean r0 = r0.f11007A
            boolean r0 = r0.booleanValue()
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            r1 = r2
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.hasMatte():boolean");
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.isDirty) {
            this.isDirty = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isAnimating() {
        return this.animator.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.isApplyingOpacityToLayersEnabled;
    }

    public boolean isLooping() {
        return this.animator.getRepeatCount() == -1;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z) {
        this.animator.setRepeatCount(z ? -1 : 0);
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.pauseAnimation();
    }

    public void playAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new C4817i());
            return;
        }
        if (this.systemAnimationsEnabled || getRepeatCount() == 0) {
            this.animator.playAnimation();
        }
        if (!this.systemAnimationsEnabled) {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        }
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public List<C7103d> resolveKeyPath(C7103d dVar) {
        if (this.compositionLayer == null) {
            C7656b.m14695b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.mo14608g(dVar, 0, arrayList, new C7103d(new String[0]));
        return arrayList;
    }

    public void resumeAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new C4818j());
        } else if (this.systemAnimationsEnabled) {
            this.animator.resumeAnimation();
        }
    }

    public void reverseAnimationSpeed() {
        this.animator.reverseAnimationSpeed();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        this.alpha = i;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.isApplyingOpacityToLayersEnabled = z;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C7656b.m14695b("Use addColorFilter instead.");
    }

    public boolean setComposition(C4828c cVar) {
        if (this.composition == cVar) {
            return false;
        }
        this.isDirty = false;
        clearComposition();
        this.composition = cVar;
        buildCompositionLayer();
        this.animator.setComposition(cVar);
        setProgress(this.animator.getAnimatedFraction());
        setScale(this.scale);
        updateBounds();
        Iterator it = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it.hasNext()) {
            ((C4825q) it.next()).run();
            it.remove();
        }
        this.lazyCompositionTasks.clear();
        cVar.f10841a.f11021a = this.performanceTrackingEnabled;
        return true;
    }

    public void setFontAssetDelegate(C4826a aVar) {
        C6985a aVar2 = this.fontAssetManager;
        if (aVar2 != null) {
            aVar2.getClass();
        }
    }

    public void setFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C4812d(i));
        } else {
            this.animator.setFrame((float) i);
        }
    }

    public void setImageAssetDelegate(C4827b bVar) {
        this.imageAssetDelegate = bVar;
        C6986b bVar2 = this.imageAssetManager;
        if (bVar2 != null) {
            bVar2.getClass();
        }
    }

    public void setImagesAssetsFolder(String str) {
        this.imageAssetsFolder = str;
    }

    public void setMaxFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C4821m(i));
        } else {
            this.animator.setMaxFrame(((float) i) + 0.99f);
        }
    }

    public void setMaxProgress(float f) {
        C4828c cVar = this.composition;
        if (cVar == null) {
            this.lazyCompositionTasks.add(new C4822n(f));
            return;
        }
        float f2 = cVar.f10851k;
        float f3 = cVar.f10852l;
        PointF pointF = C7658d.f16962a;
        setMaxFrame((int) C0023f.m103b(f3, f2, f, f2));
    }

    public void setMinAndMaxFrame(String str) {
        C4828c cVar = this.composition;
        if (cVar == null) {
            this.lazyCompositionTasks.add(new C4809a(str));
            return;
        }
        C7106g c = cVar.mo14583c(str);
        if (c != null) {
            int i = (int) c.f15808b;
            setMinAndMaxFrame(i, ((int) c.f15809c) + i);
            return;
        }
        throw new IllegalArgumentException(C0048b.m163a("Cannot find marker with name ", str, "."));
    }

    public void setMinAndMaxProgress(float f, float f2) {
        C4828c cVar = this.composition;
        if (cVar == null) {
            this.lazyCompositionTasks.add(new C4811c(f, f2));
            return;
        }
        float f3 = cVar.f10851k;
        float f4 = cVar.f10852l;
        PointF pointF = C7658d.f16962a;
        setMinAndMaxFrame((int) C0023f.m103b(f4, f3, f, f3), (int) C0023f.m103b(f4, f3, f2, f3));
    }

    public void setMinFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C4819k(i));
        } else {
            this.animator.setMinFrame(i);
        }
    }

    public void setMinProgress(float f) {
        C4828c cVar = this.composition;
        if (cVar == null) {
            this.lazyCompositionTasks.add(new C4820l(f));
            return;
        }
        float f2 = cVar.f10851k;
        float f3 = cVar.f10852l;
        PointF pointF = C7658d.f16962a;
        setMinFrame((int) C0023f.m103b(f3, f2, f, f2));
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTrackingEnabled = z;
        C4828c cVar = this.composition;
        if (cVar != null) {
            cVar.f10841a.f11021a = z;
        }
    }

    public void setProgress(float f) {
        C4828c cVar = this.composition;
        if (cVar == null) {
            this.lazyCompositionTasks.add(new C4813e(f));
            return;
        }
        LottieValueAnimator lottieValueAnimator = this.animator;
        float f2 = cVar.f10851k;
        float f3 = cVar.f10852l;
        PointF pointF = C7658d.f16962a;
        lottieValueAnimator.setFrame(((f3 - f2) * f) + f2);
        C20203a.m34518A();
    }

    public void setRepeatCount(int i) {
        this.animator.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.animator.setRepeatMode(i);
    }

    public void setScale(float f) {
        this.scale = f;
        updateBounds();
    }

    public void setSpeed(float f) {
        this.animator.setSpeed(f);
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.systemAnimationsEnabled = bool.booleanValue();
    }

    public void setTextDelegate(C4853p pVar) {
    }

    public void start() {
        playAnimation();
    }

    public void stop() {
        endAnimation();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        C6986b imageAssetManager2 = getImageAssetManager();
        if (imageAssetManager2 == null) {
            C7656b.m14695b("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        if (bitmap == null) {
            C4837h hVar = imageAssetManager2.f15483c.get(str);
            bitmap2 = hVar.f10872d;
            hVar.f10872d = null;
        } else {
            Bitmap bitmap3 = imageAssetManager2.f15483c.get(str).f10872d;
            imageAssetManager2.mo19154a(str, bitmap);
            bitmap2 = bitmap3;
        }
        invalidateSelf();
        return bitmap2;
    }

    public boolean useTextGlyphs() {
        return this.composition.f10847g.mo19995i() > 0;
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.enableMergePaths != z) {
            this.enableMergePaths = z;
            if (this.composition != null) {
                buildCompositionLayer();
            }
        }
    }

    public void setMaxFrame(String str) {
        C4828c cVar = this.composition;
        if (cVar == null) {
            this.lazyCompositionTasks.add(new C4824p(str));
            return;
        }
        C7106g c = cVar.mo14583c(str);
        if (c != null) {
            setMaxFrame((int) (c.f15808b + c.f15809c));
            return;
        }
        throw new IllegalArgumentException(C0048b.m163a("Cannot find marker with name ", str, "."));
    }

    public void setMinFrame(String str) {
        C4828c cVar = this.composition;
        if (cVar == null) {
            this.lazyCompositionTasks.add(new C4823o(str));
            return;
        }
        C7106g c = cVar.mo14583c(str);
        if (c != null) {
            setMinFrame((int) c.f15808b);
            return;
        }
        throw new IllegalArgumentException(C0048b.m163a("Cannot find marker with name ", str, "."));
    }

    public <T> void addValueCallback(C7103d dVar, T t, C7722e<T> eVar) {
        addValueCallback(dVar, t, new C4815g(eVar));
    }

    public void setMinAndMaxFrame(int i, int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C4810b(i, i2));
        } else {
            this.animator.setMinAndMaxFrames((float) i, ((float) i2) + 0.99f);
        }
    }
}
