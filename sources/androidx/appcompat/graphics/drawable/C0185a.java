package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.appcompat.graphics.drawable.C0189b;

/* renamed from: androidx.appcompat.graphics.drawable.a */
public class C0185a extends Drawable implements Drawable.Callback {
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_DITHER = true;
    private static final String TAG = "DrawableContainer";
    private int mAlpha = 255;
    private Runnable mAnimationRunnable;
    private C0187b mBlockInvalidateCallback;
    private int mCurIndex = -1;
    private Drawable mCurrDrawable;
    private C0188c mDrawableContainerState;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private boolean mHasAlpha;
    private Rect mHotspotBounds;
    private Drawable mLastDrawable;
    private boolean mMutated;

    /* renamed from: androidx.appcompat.graphics.drawable.a$a */
    public class C0186a implements Runnable {
        public C0186a() {
        }

        public final void run() {
            C0185a.this.animate(true);
            C0185a.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$b */
    public static class C0187b implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f470b;

        public final void invalidateDrawable(Drawable drawable) {
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f470b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f470b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$c */
    public static abstract class C0188c extends Drawable.ConstantState {

        /* renamed from: A */
        public int f471A = 0;

        /* renamed from: B */
        public boolean f472B;

        /* renamed from: C */
        public ColorFilter f473C;

        /* renamed from: D */
        public boolean f474D;

        /* renamed from: E */
        public ColorStateList f475E;

        /* renamed from: F */
        public PorterDuff.Mode f476F;

        /* renamed from: G */
        public boolean f477G;

        /* renamed from: H */
        public boolean f478H;

        /* renamed from: a */
        public final C0185a f479a;

        /* renamed from: b */
        public Resources f480b;

        /* renamed from: c */
        public int f481c;

        /* renamed from: d */
        public int f482d;

        /* renamed from: e */
        public int f483e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f484f;

        /* renamed from: g */
        public Drawable[] f485g;

        /* renamed from: h */
        public int f486h;

        /* renamed from: i */
        public boolean f487i = false;

        /* renamed from: j */
        public boolean f488j;

        /* renamed from: k */
        public Rect f489k;

        /* renamed from: l */
        public boolean f490l = false;

        /* renamed from: m */
        public boolean f491m;

        /* renamed from: n */
        public int f492n;

        /* renamed from: o */
        public int f493o;

        /* renamed from: p */
        public int f494p;

        /* renamed from: q */
        public int f495q;

        /* renamed from: r */
        public boolean f496r;

        /* renamed from: s */
        public int f497s;

        /* renamed from: t */
        public boolean f498t;

        /* renamed from: u */
        public boolean f499u;

        /* renamed from: v */
        public boolean f500v;

        /* renamed from: w */
        public boolean f501w;

        /* renamed from: x */
        public boolean f502x = true;

        /* renamed from: y */
        public int f503y;

        /* renamed from: z */
        public int f504z = 0;

        public C0188c(C0188c cVar, C0185a aVar, Resources resources) {
            this.f479a = aVar;
            Rect rect = null;
            this.f480b = resources != null ? resources : cVar != null ? cVar.f480b : null;
            int resolveDensity = C0185a.resolveDensity(resources, cVar != null ? cVar.f481c : 0);
            this.f481c = resolveDensity;
            if (cVar != null) {
                this.f482d = cVar.f482d;
                this.f483e = cVar.f483e;
                this.f500v = true;
                this.f501w = true;
                this.f487i = cVar.f487i;
                this.f490l = cVar.f490l;
                this.f502x = cVar.f502x;
                this.f503y = cVar.f503y;
                this.f504z = cVar.f504z;
                this.f471A = cVar.f471A;
                this.f472B = cVar.f472B;
                this.f473C = cVar.f473C;
                this.f474D = cVar.f474D;
                this.f475E = cVar.f475E;
                this.f476F = cVar.f476F;
                this.f477G = cVar.f477G;
                this.f478H = cVar.f478H;
                if (cVar.f481c == resolveDensity) {
                    if (cVar.f488j) {
                        this.f489k = cVar.f489k != null ? new Rect(cVar.f489k) : rect;
                        this.f488j = true;
                    }
                    if (cVar.f491m) {
                        this.f492n = cVar.f492n;
                        this.f493o = cVar.f493o;
                        this.f494p = cVar.f494p;
                        this.f495q = cVar.f495q;
                        this.f491m = true;
                    }
                }
                if (cVar.f496r) {
                    this.f497s = cVar.f497s;
                    this.f496r = true;
                }
                if (cVar.f498t) {
                    this.f499u = cVar.f499u;
                    this.f498t = true;
                }
                Drawable[] drawableArr = cVar.f485g;
                this.f485g = new Drawable[drawableArr.length];
                this.f486h = cVar.f486h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f484f;
                if (sparseArray != null) {
                    this.f484f = sparseArray.clone();
                } else {
                    this.f484f = new SparseArray<>(this.f486h);
                }
                int i = this.f486h;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f484f.put(i2, constantState);
                        } else {
                            this.f485g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f485g = new Drawable[10];
            this.f486h = 0;
        }

        /* renamed from: a */
        public final int mo1568a(Drawable drawable) {
            int i = this.f486h;
            if (i >= this.f485g.length) {
                int i2 = i + 10;
                C0189b.C0190a aVar = (C0189b.C0190a) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = aVar.f485g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                aVar.f485g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f505I, 0, iArr, 0, i);
                aVar.f505I = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f479a);
            this.f485g[i] = drawable;
            this.f486h++;
            this.f483e = drawable.getChangingConfigurations() | this.f483e;
            this.f496r = false;
            this.f498t = false;
            this.f489k = null;
            this.f488j = false;
            this.f491m = false;
            this.f500v = false;
            return i;
        }

        /* renamed from: b */
        public final void mo1569b() {
            this.f491m = true;
            mo1570c();
            int i = this.f486h;
            Drawable[] drawableArr = this.f485g;
            this.f493o = -1;
            this.f492n = -1;
            this.f495q = 0;
            this.f494p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f492n) {
                    this.f492n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f493o) {
                    this.f493o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f494p) {
                    this.f494p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f495q) {
                    this.f495q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void mo1570c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f484f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f484f.keyAt(i);
                    Drawable[] drawableArr = this.f485g;
                    Drawable newDrawable = this.f484f.valueAt(i).newDrawable(this.f480b);
                    newDrawable.setLayoutDirection(this.f503y);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f479a);
                    drawableArr[keyAt] = mutate;
                }
                this.f484f = null;
            }
        }

        public final boolean canApplyTheme() {
            int i = this.f486h;
            Drawable[] drawableArr = this.f485g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f484f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable mo1572d(int i) {
            int indexOfKey;
            Drawable drawable = this.f485g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f484f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f484f.valueAt(indexOfKey).newDrawable(this.f480b);
            newDrawable.setLayoutDirection(this.f503y);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f479a);
            this.f485g[i] = mutate;
            this.f484f.removeAt(indexOfKey);
            if (this.f484f.size() == 0) {
                this.f484f = null;
            }
            return mutate;
        }

        /* renamed from: e */
        public abstract void mo1489e();

        public final int getChangingConfigurations() {
            return this.f482d | this.f483e;
        }
    }

    private void initializeDrawableForDisplay(Drawable drawable) {
        if (this.mBlockInvalidateCallback == null) {
            this.mBlockInvalidateCallback = new C0187b();
        }
        C0187b bVar = this.mBlockInvalidateCallback;
        bVar.f470b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.mDrawableContainerState.f504z <= 0 && this.mHasAlpha) {
                drawable.setAlpha(this.mAlpha);
            }
            C0188c cVar = this.mDrawableContainerState;
            if (cVar.f474D) {
                drawable.setColorFilter(cVar.f473C);
            } else {
                if (cVar.f477G) {
                    drawable.setTintList(cVar.f475E);
                }
                C0188c cVar2 = this.mDrawableContainerState;
                if (cVar2.f478H) {
                    drawable.setTintMode(cVar2.f476F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.mDrawableContainerState.f502x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.mDrawableContainerState.f472B);
            Rect rect = this.mHotspotBounds;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0187b bVar2 = this.mBlockInvalidateCallback;
            Drawable.Callback callback = bVar2.f470b;
            bVar2.f470b = null;
            drawable.setCallback(callback);
        }
    }

    private boolean needsMirroring() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public static int resolveDensity(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void animate(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.mHasAlpha = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.mCurrDrawable
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.mEnterAnimationEnd
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.mAlpha
            r3.setAlpha(r9)
            r13.mEnterAnimationEnd = r7
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.a$c r10 = r13.mDrawableContainerState
            int r10 = r10.f504z
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.mAlpha
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.mEnterAnimationEnd = r7
        L_0x0038:
            r3 = r6
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.mLastDrawable
            if (r9 == 0) goto L_0x0061
            long r10 = r13.mExitAnimationEnd
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r6, r6)
            r0 = 0
            r13.mLastDrawable = r0
            r13.mExitAnimationEnd = r7
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.a$c r4 = r13.mDrawableContainerState
            int r4 = r4.f471A
            int r3 = r3 / r4
            int r4 = r13.mAlpha
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.mExitAnimationEnd = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.mAnimationRunnable
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0185a.animate(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        C0188c cVar = this.mDrawableContainerState;
        if (theme != null) {
            cVar.mo1570c();
            int i = cVar.f486h;
            Drawable[] drawableArr = cVar.f485g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    cVar.f483e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f480b = resources;
                int resolveDensity = resolveDensity(resources, cVar.f481c);
                int i3 = cVar.f481c;
                cVar.f481c = resolveDensity;
                if (i3 != resolveDensity) {
                    cVar.f491m = false;
                    cVar.f488j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    public boolean canApplyTheme() {
        return this.mDrawableContainerState.canApplyTheme();
    }

    public void clearMutated() {
        this.mDrawableContainerState.getClass();
        this.mMutated = false;
    }

    public C0188c cloneConstantState() {
        return this.mDrawableContainerState;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.mLastDrawable;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0188c cVar = this.mDrawableContainerState;
        return changingConfigurations | cVar.f483e | cVar.f482d;
    }

    public final Drawable.ConstantState getConstantState() {
        C0188c cVar = this.mDrawableContainerState;
        boolean z = true;
        if (!cVar.f500v) {
            cVar.mo1570c();
            cVar.f500v = true;
            int i = cVar.f486h;
            Drawable[] drawableArr = cVar.f485g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    cVar.f501w = true;
                    break;
                } else if (drawableArr[i2].getConstantState() == null) {
                    cVar.f501w = false;
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            z = cVar.f501w;
        }
        if (!z) {
            return null;
        }
        this.mDrawableContainerState.f482d = getChangingConfigurations();
        return this.mDrawableContainerState;
    }

    public Drawable getCurrent() {
        return this.mCurrDrawable;
    }

    public int getCurrentIndex() {
        return this.mCurIndex;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.mHotspotBounds;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f490l) {
            if (!cVar.f491m) {
                cVar.mo1569b();
            }
            return cVar.f493o;
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f490l) {
            if (!cVar.f491m) {
                cVar.mo1569b();
            }
            return cVar.f492n;
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f490l) {
            if (!cVar.f491m) {
                cVar.mo1569b();
            }
            return cVar.f495q;
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f490l) {
            if (!cVar.f491m) {
                cVar.mo1569b();
            }
            return cVar.f494p;
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.mCurrDrawable;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f496r) {
            return cVar.f497s;
        }
        cVar.mo1570c();
        int i2 = cVar.f486h;
        Drawable[] drawableArr = cVar.f485g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        cVar.f497s = i;
        cVar.f496r = true;
        return i;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        C0188c cVar = this.mDrawableContainerState;
        Rect rect2 = null;
        boolean z = false;
        if (!cVar.f487i) {
            Rect rect3 = cVar.f489k;
            if (rect3 != null || cVar.f488j) {
                rect2 = rect3;
            } else {
                cVar.mo1570c();
                Rect rect4 = new Rect();
                int i = cVar.f486h;
                Drawable[] drawableArr = cVar.f485g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f488j = true;
                cVar.f489k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.mCurrDrawable;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (needsMirroring()) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar != null) {
            cVar.f496r = false;
            cVar.f498t = false;
        }
        if (drawable == this.mCurrDrawable && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.mDrawableContainerState.f472B;
    }

    public boolean isStateful() {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f498t) {
            return cVar.f499u;
        }
        cVar.mo1570c();
        int i = cVar.f486h;
        Drawable[] drawableArr = cVar.f485g;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        cVar.f499u = z;
        cVar.f498t = true;
        return z;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.mLastDrawable;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.mLastDrawable = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.mHasAlpha) {
                this.mCurrDrawable.setAlpha(this.mAlpha);
            }
        }
        if (this.mExitAnimationEnd != 0) {
            this.mExitAnimationEnd = 0;
            z = true;
        }
        if (this.mEnterAnimationEnd != 0) {
            this.mEnterAnimationEnd = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            C0188c cloneConstantState = cloneConstantState();
            cloneConstantState.mo1489e();
            setConstantState(cloneConstantState);
            this.mMutated = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        C0188c cVar = this.mDrawableContainerState;
        int currentIndex = getCurrentIndex();
        int i2 = cVar.f486h;
        Drawable[] drawableArr = cVar.f485g;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i3 == currentIndex) {
                    z = layoutDirection;
                }
            }
        }
        cVar.f503y = i;
        return z;
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.mCurrDrawable && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean selectDrawable(int r10) {
        /*
            r9 = this;
            int r0 = r9.mCurIndex
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.a$c r0 = r9.mDrawableContainerState
            int r0 = r0.f471A
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.mLastDrawable
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            if (r0 == 0) goto L_0x0029
            r9.mLastDrawable = r0
            androidx.appcompat.graphics.drawable.a$c r0 = r9.mDrawableContainerState
            int r0 = r0.f471A
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.mExitAnimationEnd = r0
            goto L_0x0035
        L_0x0029:
            r9.mLastDrawable = r4
            r9.mExitAnimationEnd = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            androidx.appcompat.graphics.drawable.a$c r0 = r9.mDrawableContainerState
            int r1 = r0.f486h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo1572d(r10)
            r9.mCurrDrawable = r0
            r9.mCurIndex = r10
            if (r0 == 0) goto L_0x005a
            androidx.appcompat.graphics.drawable.a$c r10 = r9.mDrawableContainerState
            int r10 = r10.f504z
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.mEnterAnimationEnd = r2
        L_0x0051:
            r9.initializeDrawableForDisplay(r0)
            goto L_0x005a
        L_0x0055:
            r9.mCurrDrawable = r4
            r10 = -1
            r9.mCurIndex = r10
        L_0x005a:
            long r0 = r9.mEnterAnimationEnd
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.mExitAnimationEnd
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.mAnimationRunnable
            if (r10 != 0) goto L_0x0073
            androidx.appcompat.graphics.drawable.a$a r10 = new androidx.appcompat.graphics.drawable.a$a
            r10.<init>()
            r9.mAnimationRunnable = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.animate(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0185a.selectDrawable(int):boolean");
    }

    public void setAlpha(int i) {
        if (!this.mHasAlpha || this.mAlpha != i) {
            this.mHasAlpha = true;
            this.mAlpha = i;
            Drawable drawable = this.mCurrDrawable;
            if (drawable == null) {
                return;
            }
            if (this.mEnterAnimationEnd == 0) {
                drawable.setAlpha(i);
            } else {
                animate(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f472B != z) {
            cVar.f472B = z;
            Drawable drawable = this.mCurrDrawable;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0188c cVar = this.mDrawableContainerState;
        cVar.f474D = true;
        if (cVar.f473C != colorFilter) {
            cVar.f473C = colorFilter;
            Drawable drawable = this.mCurrDrawable;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setConstantState(C0188c cVar) {
        this.mDrawableContainerState = cVar;
        int i = this.mCurIndex;
        if (i >= 0) {
            Drawable d = cVar.mo1572d(i);
            this.mCurrDrawable = d;
            if (d != null) {
                initializeDrawableForDisplay(d);
            }
        }
        this.mLastDrawable = null;
    }

    public void setCurrentIndex(int i) {
        selectDrawable(i);
    }

    public void setDither(boolean z) {
        C0188c cVar = this.mDrawableContainerState;
        if (cVar.f502x != z) {
            cVar.f502x = z;
            Drawable drawable = this.mCurrDrawable;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setEnterFadeDuration(int i) {
        this.mDrawableContainerState.f504z = i;
    }

    public void setExitFadeDuration(int i) {
        this.mDrawableContainerState.f471A = i;
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.mHotspotBounds;
        if (rect == null) {
            this.mHotspotBounds = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0188c cVar = this.mDrawableContainerState;
        cVar.f477G = true;
        if (cVar.f475E != colorStateList) {
            cVar.f475E = colorStateList;
            this.mCurrDrawable.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0188c cVar = this.mDrawableContainerState;
        cVar.f478H = true;
        if (cVar.f476F != mode) {
            cVar.f476F = mode;
            this.mCurrDrawable.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.mCurrDrawable && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public final void updateDensity(Resources resources) {
        C0188c cVar = this.mDrawableContainerState;
        if (resources != null) {
            cVar.f480b = resources;
            int resolveDensity = resolveDensity(resources, cVar.f481c);
            int i = cVar.f481c;
            cVar.f481c = resolveDensity;
            if (i != resolveDensity) {
                cVar.f491m = false;
                cVar.f488j = false;
                return;
            }
            return;
        }
        cVar.getClass();
    }
}
