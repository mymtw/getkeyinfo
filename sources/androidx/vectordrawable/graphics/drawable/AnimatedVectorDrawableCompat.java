package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p193o.C7494b;
import p195o2.C7511a;
import p195o2.C7512b;
import p280x0.C8292f;
import p280x0.C8299j;

public class AnimatedVectorDrawableCompat extends C7512b implements Animatable2Compat {
    private static final String ANIMATED_VECTOR = "animated-vector";
    private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
    private static final String LOGTAG = "AnimatedVDCompat";
    private static final String TARGET = "target";
    private C3309c mAnimatedVectorState;
    public ArrayList<Animatable2Compat.C3306a> mAnimationCallbacks;
    private Animator.AnimatorListener mAnimatorListener;
    private ArgbEvaluator mArgbEvaluator;
    public C3310d mCachedConstantStateDelegate;
    public final Drawable.Callback mCallback;
    private Context mContext;

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$a */
    public class C3307a implements Drawable.Callback {
        public C3307a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$b */
    public class C3308b extends AnimatorListenerAdapter {
        public C3308b() {
        }

        public final void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.mAnimationCallbacks);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.C3306a) arrayList.get(i)).mo12418a();
            }
        }

        public final void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.mAnimationCallbacks);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.C3306a) arrayList.get(i)).getClass();
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$c */
    public static class C3309c extends Drawable.ConstantState {

        /* renamed from: a */
        public int f7718a;

        /* renamed from: b */
        public VectorDrawableCompat f7719b;

        /* renamed from: c */
        public AnimatorSet f7720c;

        /* renamed from: d */
        public ArrayList<Animator> f7721d;

        /* renamed from: e */
        public C7494b<Animator, String> f7722e;

        public C3309c(C3309c cVar, C3307a aVar, Resources resources) {
            if (cVar != null) {
                this.f7718a = cVar.f7718a;
                VectorDrawableCompat vectorDrawableCompat = cVar.f7719b;
                if (vectorDrawableCompat != null) {
                    Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.f7719b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f7719b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    VectorDrawableCompat vectorDrawableCompat2 = (VectorDrawableCompat) this.f7719b.mutate();
                    this.f7719b = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(aVar);
                    this.f7719b.setBounds(cVar.f7719b.getBounds());
                    this.f7719b.setAllowCaching(false);
                }
                ArrayList<Animator> arrayList = cVar.f7721d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f7721d = new ArrayList<>(size);
                    this.f7722e = new C7494b<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.f7721d.get(i);
                        Animator clone = animator.clone();
                        String orDefault = cVar.f7722e.getOrDefault(animator, null);
                        clone.setTarget(this.f7719b.getTargetByName(orDefault));
                        this.f7721d.add(clone);
                        this.f7722e.put(clone, orDefault);
                    }
                    if (this.f7720c == null) {
                        this.f7720c = new AnimatorSet();
                    }
                    this.f7720c.playTogether(this.f7721d);
                }
            }
        }

        public final int getChangingConfigurations() {
            return this.f7718a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat() {
        this((Context) null, (C3309c) null, (Resources) null);
    }

    public static AnimatedVectorDrawableCompat create(Context context, int i) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        Drawable drawable = resources.getDrawable(i, theme);
        animatedVectorDrawableCompat.mDelegateDrawable = drawable;
        drawable.setCallback(animatedVectorDrawableCompat.mCallback);
        animatedVectorDrawableCompat.mCachedConstantStateDelegate = new C3310d(animatedVectorDrawableCompat.mDelegateDrawable.getConstantState());
        return animatedVectorDrawableCompat;
    }

    public static AnimatedVectorDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    private static void registerPlatformCallback(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat.C3306a aVar) {
        if (aVar.f7715a == null) {
            aVar.f7715a = new C3319a(aVar);
        }
        animatedVectorDrawable.registerAnimationCallback(aVar.f7715a);
    }

    private void removeAnimatorSetListener() {
        Animator.AnimatorListener animatorListener = this.mAnimatorListener;
        if (animatorListener != null) {
            this.mAnimatedVectorState.f7720c.removeListener(animatorListener);
            this.mAnimatorListener = null;
        }
    }

    private void setupAnimatorsForTarget(String str, Animator animator) {
        animator.setTarget(this.mAnimatedVectorState.f7719b.getTargetByName(str));
        C3309c cVar = this.mAnimatedVectorState;
        if (cVar.f7721d == null) {
            cVar.f7721d = new ArrayList<>();
            this.mAnimatedVectorState.f7722e = new C7494b<>();
        }
        this.mAnimatedVectorState.f7721d.add(animator);
        this.mAnimatedVectorState.f7722e.put(animator, str);
    }

    private void setupColorAnimator(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                setupColorAnimator(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.mArgbEvaluator == null) {
                    this.mArgbEvaluator = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.mArgbEvaluator);
            }
        }
    }

    private static boolean unregisterPlatformCallback(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat.C3306a aVar) {
        if (aVar.f7715a == null) {
            aVar.f7715a = new C3319a(aVar);
        }
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.f7715a);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public void clearAnimationCallbacks() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        removeAnimatorSetListener();
        ArrayList<Animatable2Compat.C3306a> arrayList = this.mAnimationCallbacks;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.mAnimatedVectorState.f7719b.draw(canvas);
        if (this.mAnimatedVectorState.f7720c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getAlpha() : this.mAnimatedVectorState.f7719b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.mAnimatedVectorState.f7718a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getColorFilter() : this.mAnimatedVectorState.f7719b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new C3310d(this.mDelegateDrawable.getConstantState());
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicHeight() : this.mAnimatedVectorState.f7719b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicWidth() : this.mAnimatedVectorState.f7719b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getOpacity() : this.mAnimatedVectorState.f7719b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (ANIMATED_VECTOR.equals(name)) {
                    TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C7511a.f16760e);
                    int resourceId = i.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat create = VectorDrawableCompat.create(resources, resourceId, theme);
                        create.setAllowCaching(false);
                        create.setCallback(this.mCallback);
                        VectorDrawableCompat vectorDrawableCompat = this.mAnimatedVectorState.f7719b;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback((Drawable.Callback) null);
                        }
                        this.mAnimatedVectorState.f7719b = create;
                    }
                    i.recycle();
                } else if (TARGET.equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C7511a.f16761f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.mContext;
                        if (context != null) {
                            setupAnimatorsForTarget(string, AnimatorInflater.loadAnimator(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C3309c cVar = this.mAnimatedVectorState;
        if (cVar.f7720c == null) {
            cVar.f7720c = new AnimatorSet();
        }
        cVar.f7720c.playTogether(cVar.f7721d);
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.isAutoMirrored() : this.mAnimatedVectorState.f7719b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.mAnimatedVectorState.f7720c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.isStateful() : this.mAnimatedVectorState.f7719b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.mAnimatedVectorState.f7719b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.setLevel(i) : this.mAnimatedVectorState.f7719b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.setState(iArr) : this.mAnimatedVectorState.f7719b.setState(iArr);
    }

    public void registerAnimationCallback(Animatable2Compat.C3306a aVar) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            registerPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar != null) {
            if (this.mAnimationCallbacks == null) {
                this.mAnimationCallbacks = new ArrayList<>();
            }
            if (!this.mAnimationCallbacks.contains(aVar)) {
                this.mAnimationCallbacks.add(aVar);
                if (this.mAnimatorListener == null) {
                    this.mAnimatorListener = new C3308b();
                }
                this.mAnimatedVectorState.f7720c.addListener(this.mAnimatorListener);
            }
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.mAnimatedVectorState.f7719b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.mAnimatedVectorState.f7719b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.mAnimatedVectorState.f7719b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.mAnimatedVectorState.f7719b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.mAnimatedVectorState.f7719b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.mAnimatedVectorState.f7719b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.mAnimatedVectorState.f7720c.isStarted()) {
            this.mAnimatedVectorState.f7720c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.mAnimatedVectorState.f7720c.end();
        }
    }

    public boolean unregisterAnimationCallback(Animatable2Compat.C3306a aVar) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            unregisterPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<Animatable2Compat.C3306a> arrayList = this.mAnimationCallbacks;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.mAnimationCallbacks.size() == 0) {
            removeAnimatorSetListener();
        }
        return remove;
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, (C3309c) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.mAnimatedVectorState.f7719b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$d */
    public static class C3310d extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f7723a;

        public C3310d(Drawable.ConstantState constantState) {
            this.f7723a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f7723a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f7723a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f7723a.newDrawable();
            animatedVectorDrawableCompat.mDelegateDrawable = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }

        public final Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f7723a.newDrawable(resources);
            animatedVectorDrawableCompat.mDelegateDrawable = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f7723a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.mDelegateDrawable = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }
    }

    private AnimatedVectorDrawableCompat(Context context, C3309c cVar, Resources resources) {
        this.mArgbEvaluator = null;
        this.mAnimatorListener = null;
        this.mAnimationCallbacks = null;
        C3307a aVar = new C3307a();
        this.mCallback = aVar;
        this.mContext = context;
        if (cVar != null) {
            this.mAnimatedVectorState = cVar;
        } else {
            this.mAnimatedVectorState = new C3309c(cVar, aVar, resources);
        }
    }

    public static void clearAnimationCallbacks(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    public static boolean unregisterAnimationCallback(Drawable drawable, Animatable2Compat.C3306a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return unregisterPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
    }

    public static void registerAnimationCallback(Drawable drawable, Animatable2Compat.C3306a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            registerPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
