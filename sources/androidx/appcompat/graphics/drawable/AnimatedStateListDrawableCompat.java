package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.C0185a;
import androidx.appcompat.graphics.drawable.C0189b;
import androidx.appcompat.widget.C0323i0;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086e.C6680b;
import p086e.C6681c;
import p193o.C7498f;
import p193o.C7507j;
import p280x0.C8299j;

@SuppressLint({"RestrictedAPI"})
public class AnimatedStateListDrawableCompat extends C0189b {
    private static final String ELEMENT_ITEM = "item";
    private static final String ELEMENT_TRANSITION = "transition";
    private static final String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String LOGTAG = "AnimatedStateListDrawableCompat";
    private static final String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private boolean mMutated;
    private C0180b mState;
    private C0184f mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$a */
    public static class C0179a extends C0184f {

        /* renamed from: a */
        public final Animatable f459a;

        public C0179a(Animatable animatable) {
            this.f459a = animatable;
        }

        /* renamed from: c */
        public final void mo1487c() {
            this.f459a.start();
        }

        /* renamed from: d */
        public final void mo1488d() {
            this.f459a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$b */
    public static class C0180b extends C0189b.C0190a {

        /* renamed from: L */
        public static final /* synthetic */ int f460L = 0;

        /* renamed from: J */
        public C7498f<Long> f461J;

        /* renamed from: K */
        public C7507j<Integer> f462K;

        public C0180b(C0180b bVar, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(bVar, animatedStateListDrawableCompat, resources);
            if (bVar != null) {
                this.f461J = bVar.f461J;
                this.f462K = bVar.f462K;
                return;
            }
            this.f461J = new C7498f<>();
            this.f462K = new C7507j<>();
        }

        /* renamed from: e */
        public final void mo1489e() {
            this.f461J = this.f461J.clone();
            this.f462K = this.f462K.clone();
        }

        /* renamed from: g */
        public final int mo1490g(int i, int i2, Drawable drawable, boolean z) {
            int a = mo1568a(drawable);
            long j = (long) i;
            long j2 = (long) i2;
            long j3 = (j << 32) | j2;
            long j4 = z ? 8589934592L : 0;
            long j5 = (long) a;
            this.f461J.mo19884a(j3, Long.valueOf(j5 | j4));
            if (z) {
                this.f461J.mo19884a(j | (j2 << 32), Long.valueOf(4294967296L | j5 | j4));
            }
            return a;
        }

        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, (Resources) null);
        }

        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$c */
    public static class C0181c extends C0184f {

        /* renamed from: a */
        public final AnimatedVectorDrawableCompat f463a;

        public C0181c(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.f463a = animatedVectorDrawableCompat;
        }

        /* renamed from: c */
        public final void mo1487c() {
            this.f463a.start();
        }

        /* renamed from: d */
        public final void mo1488d() {
            this.f463a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$d */
    public static class C0182d extends C0184f {

        /* renamed from: a */
        public final ObjectAnimator f464a;

        /* renamed from: b */
        public final boolean f465b;

        public C0182d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0183e eVar = new C0183e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            C6680b.m13046a(ofInt, true);
            ofInt.setDuration((long) eVar.f468c);
            ofInt.setInterpolator(eVar);
            this.f465b = z2;
            this.f464a = ofInt;
        }

        /* renamed from: a */
        public final boolean mo1493a() {
            return this.f465b;
        }

        /* renamed from: b */
        public final void mo1494b() {
            this.f464a.reverse();
        }

        /* renamed from: c */
        public final void mo1487c() {
            this.f464a.start();
        }

        /* renamed from: d */
        public final void mo1488d() {
            this.f464a.cancel();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$e */
    public static class C0183e implements TimeInterpolator {

        /* renamed from: a */
        public int[] f466a;

        /* renamed from: b */
        public int f467b;

        /* renamed from: c */
        public int f468c;

        public C0183e(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f467b = numberOfFrames;
            int[] iArr = this.f466a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f466a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f466a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f468c = i;
        }

        public final float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f468c)) + 0.5f);
            int i2 = this.f467b;
            int[] iArr = this.f466a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f468c) : 0.0f);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$f */
    public static abstract class C0184f {
        /* renamed from: a */
        public boolean mo1493a() {
            return false;
        }

        /* renamed from: b */
        public void mo1494b() {
        }

        /* renamed from: c */
        public abstract void mo1487c();

        /* renamed from: d */
        public abstract void mo1488d();
    }

    static {
        Class<AnimatedStateListDrawableCompat> cls = AnimatedStateListDrawableCompat.class;
    }

    public AnimatedStateListDrawableCompat() {
        this((C0180b) null, (Resources) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b A[Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat create(android.content.Context r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
            android.content.res.XmlResourceParser r7 = r1.getXml(r7)     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
        L_0x000e:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0020
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r6 = createFromXmlInner(r6, r1, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
            return r6
        L_0x0020:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
            throw r6     // Catch:{ XmlPullParserException -> 0x002f, IOException -> 0x0028 }
        L_0x0028:
            r6 = move-exception
            java.lang.String r7 = LOGTAG
            android.util.Log.e(r7, r0, r6)
            goto L_0x0035
        L_0x002f:
            r6 = move-exception
            java.lang.String r7 = LOGTAG
            android.util.Log.e(r7, r0, r6)
        L_0x0035:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.create(android.content.Context, int, android.content.res.Resources$Theme):androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat");
    }

    public static AnimatedStateListDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals(ELEMENT_ITEM)) {
                        parseItem(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals(ELEMENT_TRANSITION)) {
                        parseTransition(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void init() {
        onStateChange(getState());
    }

    private int parseItem(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C15588c1.f35084j);
        int resourceId = i.getResourceId(0, 0);
        int resourceId2 = i.getResourceId(1, -1);
        Drawable e = resourceId2 > 0 ? C0323i0.m848c().mo3065e(context, resourceId2) : null;
        i.recycle();
        int[] extractStateSet = extractStateSet(attributeSet);
        if (e == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                e = xmlPullParser.getName().equals("vector") ? VectorDrawableCompat.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : C6681c.m13047a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ITEM_MISSING_DRAWABLE_ERROR);
            }
        }
        if (e != null) {
            C0180b bVar = this.mState;
            int a = bVar.mo1568a(e);
            bVar.f505I[a] = extractStateSet;
            bVar.f462K.mo19994h(a, Integer.valueOf(resourceId));
            return a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ITEM_MISSING_DRAWABLE_ERROR);
    }

    private int parseTransition(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C15588c1.f35085k);
        int resourceId = i.getResourceId(2, -1);
        int resourceId2 = i.getResourceId(1, -1);
        int resourceId3 = i.getResourceId(0, -1);
        Drawable e = resourceId3 > 0 ? C0323i0.m848c().mo3065e(context, resourceId3) : null;
        boolean z = i.getBoolean(3, false);
        i.recycle();
        if (e == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                e = xmlPullParser.getName().equals("animated-vector") ? AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlPullParser, attributeSet, theme) : C6681c.m13047a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_DRAWABLE_ERROR);
            }
        }
        if (e == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_DRAWABLE_ERROR);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.mState.mo1490g(resourceId, resourceId2, e, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_FROM_TO_ID);
        }
    }

    private boolean selectTransition(int i) {
        int i2;
        int i3;
        C0184f fVar;
        C0184f fVar2 = this.mTransition;
        if (fVar2 == null) {
            i2 = getCurrentIndex();
        } else if (i == this.mTransitionToIndex) {
            return true;
        } else {
            if (i != this.mTransitionFromIndex || !fVar2.mo1493a()) {
                i2 = this.mTransitionToIndex;
                fVar2.mo1488d();
            } else {
                fVar2.mo1494b();
                this.mTransitionToIndex = this.mTransitionFromIndex;
                this.mTransitionFromIndex = i;
                return true;
            }
        }
        this.mTransition = null;
        this.mTransitionFromIndex = -1;
        this.mTransitionToIndex = -1;
        C0180b bVar = this.mState;
        boolean z = false;
        if (i2 < 0) {
            bVar.getClass();
            i3 = 0;
        } else {
            i3 = ((Integer) bVar.f462K.mo19993f(i2, 0)).intValue();
        }
        int intValue = i < 0 ? 0 : ((Integer) bVar.f462K.mo19993f(i, 0)).intValue();
        if (!(intValue == 0 || i3 == 0)) {
            int i4 = C0180b.f460L;
            long j = ((long) intValue) | (((long) i3) << 32);
            int longValue = (int) ((Long) bVar.f461J.mo19889f(j, -1L)).longValue();
            if (longValue < 0) {
                return false;
            }
            boolean z2 = (((Long) bVar.f461J.mo19889f(j, -1L)).longValue() & 8589934592L) != 0;
            selectDrawable(longValue);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                if ((((Long) bVar.f461J.mo19889f(j, -1L)).longValue() & 4294967296L) != 0) {
                    z = true;
                }
                fVar = new C0182d((AnimationDrawable) current, z, z2);
            } else if (current instanceof AnimatedVectorDrawableCompat) {
                fVar = new C0181c((AnimatedVectorDrawableCompat) current);
            } else if (current instanceof Animatable) {
                fVar = new C0179a((Animatable) current);
            }
            fVar.mo1487c();
            this.mTransition = fVar;
            this.mTransitionFromIndex = i2;
            this.mTransitionToIndex = i;
            return true;
        }
        return false;
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        C0180b bVar = this.mState;
        bVar.f482d |= C6681c.m13048b(typedArray);
        bVar.f487i = typedArray.getBoolean(2, bVar.f487i);
        bVar.f490l = typedArray.getBoolean(3, bVar.f490l);
        bVar.f504z = typedArray.getInt(4, bVar.f504z);
        bVar.f471A = typedArray.getInt(5, bVar.f471A);
        setDither(typedArray.getBoolean(0, bVar.f502x));
    }

    public /* bridge */ /* synthetic */ void addState(int[] iArr, Drawable drawable) {
        super.addState(iArr, drawable);
    }

    public <T extends Drawable & Animatable> void addTransition(int i, int i2, T t, boolean z) {
        if (t != null) {
            this.mState.mo1490g(i, i2, t, z);
            return;
        }
        throw new IllegalArgumentException("Transition drawable must not be null");
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public void inflate(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C15588c1.f35083i);
        setVisible(i.getBoolean(1, true), true);
        updateStateFromTypedArray(i);
        updateDensity(resources);
        i.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        init();
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0184f fVar = this.mTransition;
        if (fVar != null) {
            fVar.mo1488d();
            this.mTransition = null;
            selectDrawable(this.mTransitionToIndex);
            this.mTransitionToIndex = -1;
            this.mTransitionFromIndex = -1;
        }
    }

    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mState.mo1489e();
            this.mMutated = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public boolean onStateChange(int[] iArr) {
        C0180b bVar = this.mState;
        int f = bVar.mo1580f(iArr);
        if (f < 0) {
            f = bVar.mo1580f(StateSet.WILD_CARD);
        }
        boolean z = f != getCurrentIndex() && (selectTransition(f) || selectDrawable(f));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setConstantState(C0185a.C0188c cVar) {
        super.setConstantState(cVar);
        if (cVar instanceof C0180b) {
            this.mState = (C0180b) cVar;
        }
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setEnterFadeDuration(int i) {
        super.setEnterFadeDuration(i);
    }

    public /* bridge */ /* synthetic */ void setExitFadeDuration(int i) {
        super.setExitFadeDuration(i);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C0184f fVar = this.mTransition;
        if (fVar != null && (visible || z2)) {
            if (z) {
                fVar.mo1487c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public AnimatedStateListDrawableCompat(C0180b bVar, Resources resources) {
        super((C0189b.C0190a) null);
        this.mTransitionToIndex = -1;
        this.mTransitionFromIndex = -1;
        setConstantState(new C0180b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public void addState(int[] iArr, Drawable drawable, int i) {
        if (drawable != null) {
            C0180b bVar = this.mState;
            int a = bVar.mo1568a(drawable);
            bVar.f505I[a] = iArr;
            bVar.f462K.mo19994h(a, Integer.valueOf(i));
            onStateChange(getState());
            return;
        }
        throw new IllegalArgumentException("Drawable must not be null");
    }

    public C0180b cloneConstantState() {
        return new C0180b(this.mState, this, (Resources) null);
    }
}
