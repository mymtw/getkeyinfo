package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.conversation.MessageDraft;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p193o.C7494b;
import p195o2.C7511a;
import p195o2.C7512b;
import p280x0.C8285c;
import p280x0.C8292f;
import p280x0.C8299j;
import p289y0.C8354f;

public class VectorDrawableCompat extends C7512b {
    private static final boolean DBG_VECTOR_DRAWABLE = false;
    public static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    public static final String LOGTAG = "VectorDrawableCompat";
    private static final int MAX_CACHED_BITMAP_SIZE = 2048;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";
    private static final String SHAPE_VECTOR = "vector";
    private boolean mAllowCaching;
    private Drawable.ConstantState mCachedConstantStateDelegate;
    private ColorFilter mColorFilter;
    private boolean mMutated;
    private PorterDuffColorFilter mTintFilter;
    private final Rect mTmpBounds;
    private final float[] mTmpFloats;
    private final Matrix mTmpMatrix;
    private C3317g mVectorState;

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$a */
    public static class C3311a extends C3315e {
        public C3311a() {
        }

        public C3311a(C3311a aVar) {
            super(aVar);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$d */
    public static abstract class C3314d {
        /* renamed from: a */
        public boolean mo12505a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo12506b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g */
    public static class C3317g extends Drawable.ConstantState {

        /* renamed from: a */
        public int f7769a;

        /* renamed from: b */
        public C3316f f7770b;

        /* renamed from: c */
        public ColorStateList f7771c;

        /* renamed from: d */
        public PorterDuff.Mode f7772d;

        /* renamed from: e */
        public boolean f7773e;

        /* renamed from: f */
        public Bitmap f7774f;

        /* renamed from: g */
        public ColorStateList f7775g;

        /* renamed from: h */
        public PorterDuff.Mode f7776h;

        /* renamed from: i */
        public int f7777i;

        /* renamed from: j */
        public boolean f7778j;

        /* renamed from: k */
        public boolean f7779k;

        /* renamed from: l */
        public Paint f7780l;

        public C3317g(C3317g gVar) {
            this.f7771c = null;
            this.f7772d = VectorDrawableCompat.DEFAULT_TINT_MODE;
            if (gVar != null) {
                this.f7769a = gVar.f7769a;
                C3316f fVar = new C3316f(gVar.f7770b);
                this.f7770b = fVar;
                if (gVar.f7770b.f7758e != null) {
                    fVar.f7758e = new Paint(gVar.f7770b.f7758e);
                }
                if (gVar.f7770b.f7757d != null) {
                    this.f7770b.f7757d = new Paint(gVar.f7770b.f7757d);
                }
                this.f7771c = gVar.f7771c;
                this.f7772d = gVar.f7772d;
                this.f7773e = gVar.f7773e;
            }
        }

        public int getChangingConfigurations() {
            return this.f7769a;
        }

        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public C3317g() {
            this.f7771c = null;
            this.f7772d = VectorDrawableCompat.DEFAULT_TINT_MODE;
            this.f7770b = new C3316f();
        }
    }

    public VectorDrawableCompat() {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mVectorState = new C3317g();
    }

    public static int applyAlpha(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public static VectorDrawableCompat create(Resources resources, int i, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        vectorDrawableCompat.mDelegateDrawable = resources.getDrawable(i, theme);
        vectorDrawableCompat.mCachedConstantStateDelegate = new C3318h(vectorDrawableCompat.mDelegateDrawable.getConstantState());
        return vectorDrawableCompat;
    }

    public static VectorDrawableCompat createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    private void inflateInternal(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        C3317g gVar = this.mVectorState;
        C3316f fVar = gVar.f7770b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f7760g);
        int eventType = xmlPullParser.getEventType();
        int i2 = 1;
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C3313c cVar = (C3313c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C3312b bVar = new C3312b();
                    TypedArray i3 = C8299j.m16596i(resources2, theme2, attributeSet2, C7511a.f16758c);
                    if (C8299j.m16595h(xmlPullParser2, "pathData")) {
                        String string = i3.getString(0);
                        if (string != null) {
                            bVar.f7750b = string;
                        }
                        String string2 = i3.getString(2);
                        if (string2 != null) {
                            bVar.f7749a = C8354f.m16673c(string2);
                        }
                        bVar.f7728g = C8299j.m16590c(i3, xmlPullParser2, theme2, "fillColor", 1);
                        bVar.f7730i = C8299j.m16591d(i3, xmlPullParser2, "fillAlpha", 12, bVar.f7730i);
                        int e = C8299j.m16592e(i3, xmlPullParser2, "strokeLineCap", 8, -1);
                        Paint.Cap cap = bVar.f7734m;
                        if (e == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (e == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (e == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        bVar.f7734m = cap;
                        int e2 = C8299j.m16592e(i3, xmlPullParser2, "strokeLineJoin", 9, -1);
                        Paint.Join join = bVar.f7735n;
                        if (e2 == 0) {
                            join = Paint.Join.MITER;
                        } else if (e2 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (e2 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        bVar.f7735n = join;
                        bVar.f7736o = C8299j.m16591d(i3, xmlPullParser2, "strokeMiterLimit", 10, bVar.f7736o);
                        bVar.f7726e = C8299j.m16590c(i3, xmlPullParser2, theme2, "strokeColor", 3);
                        bVar.f7729h = C8299j.m16591d(i3, xmlPullParser2, "strokeAlpha", 11, bVar.f7729h);
                        bVar.f7727f = C8299j.m16591d(i3, xmlPullParser2, "strokeWidth", 4, bVar.f7727f);
                        bVar.f7732k = C8299j.m16591d(i3, xmlPullParser2, "trimPathEnd", 6, bVar.f7732k);
                        bVar.f7733l = C8299j.m16591d(i3, xmlPullParser2, "trimPathOffset", 7, bVar.f7733l);
                        bVar.f7731j = C8299j.m16591d(i3, xmlPullParser2, "trimPathStart", 5, bVar.f7731j);
                        bVar.f7751c = C8299j.m16592e(i3, xmlPullParser2, "fillType", 13, bVar.f7751c);
                    }
                    i3.recycle();
                    cVar.f7738b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f7768o.put(bVar.getPathName(), bVar);
                    }
                    gVar.f7769a |= bVar.f7752d;
                    z = false;
                } else if (SHAPE_CLIP_PATH.equals(name)) {
                    C3311a aVar = new C3311a();
                    if (C8299j.m16595h(xmlPullParser2, "pathData")) {
                        TypedArray i4 = C8299j.m16596i(resources2, theme2, attributeSet2, C7511a.f16759d);
                        String string3 = i4.getString(0);
                        if (string3 != null) {
                            aVar.f7750b = string3;
                        }
                        String string4 = i4.getString(1);
                        if (string4 != null) {
                            aVar.f7749a = C8354f.m16673c(string4);
                        }
                        aVar.f7751c = C8299j.m16592e(i4, xmlPullParser2, "fillType", 2, 0);
                        i4.recycle();
                    }
                    cVar.f7738b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f7768o.put(aVar.getPathName(), aVar);
                    }
                    gVar.f7769a = aVar.f7752d | gVar.f7769a;
                } else if (SHAPE_GROUP.equals(name)) {
                    C3313c cVar2 = new C3313c();
                    TypedArray i5 = C8299j.m16596i(resources2, theme2, attributeSet2, C7511a.f16757b);
                    cVar2.f7739c = C8299j.m16591d(i5, xmlPullParser2, "rotation", 5, cVar2.f7739c);
                    i = 1;
                    cVar2.f7740d = i5.getFloat(1, cVar2.f7740d);
                    cVar2.f7741e = i5.getFloat(2, cVar2.f7741e);
                    cVar2.f7742f = C8299j.m16591d(i5, xmlPullParser2, "scaleX", 3, cVar2.f7742f);
                    cVar2.f7743g = C8299j.m16591d(i5, xmlPullParser2, "scaleY", 4, cVar2.f7743g);
                    cVar2.f7744h = C8299j.m16591d(i5, xmlPullParser2, "translateX", 6, cVar2.f7744h);
                    cVar2.f7745i = C8299j.m16591d(i5, xmlPullParser2, "translateY", 7, cVar2.f7745i);
                    String string5 = i5.getString(0);
                    if (string5 != null) {
                        cVar2.f7748l = string5;
                    }
                    cVar2.mo12523c();
                    i5.recycle();
                    cVar.f7738b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f7768o.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f7769a = cVar2.f7747k | gVar.f7769a;
                }
                i = 1;
            } else {
                i = i2;
                if (eventType == 3 && SHAPE_GROUP.equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i2 = i;
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean needMirroring() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    private static PorterDuff.Mode parseTintModeCompat(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void printGroupTree(C3313c cVar, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = C0326j.m864i(str, "    ");
        }
        cVar.getGroupName();
        cVar.getLocalMatrix().toString();
        for (int i3 = 0; i3 < cVar.f7738b.size(); i3++) {
            C3314d dVar = cVar.f7738b.get(i3);
            if (dVar instanceof C3313c) {
                printGroupTree((C3313c) dVar, i + 1);
            } else {
                C3315e eVar = (C3315e) dVar;
                int i4 = i + 1;
                String str2 = "";
                for (int i5 = 0; i5 < i4; i5++) {
                    eVar.getClass();
                    str2 = str2 + "    ";
                }
                C8354f.C8355a[] aVarArr = eVar.f7749a;
                String str3 = " ";
                for (int i6 = 0; i6 < aVarArr.length; i6++) {
                    StringBuilder h = C0072d.m201h(str3);
                    h.append(aVarArr[i6].f18325a);
                    h.append(MessageDraft.IMAGE_DELIMITER);
                    str3 = h.toString();
                    float[] fArr = aVarArr[i6].f18326b;
                    for (float append : fArr) {
                        StringBuilder h2 = C0072d.m201h(str3);
                        h2.append(append);
                        h2.append(",");
                        str3 = h2.toString();
                    }
                }
            }
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C3317g gVar = this.mVectorState;
        C3316f fVar = gVar.f7770b;
        gVar.f7772d = parseTintModeCompat(C8299j.m16592e(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList b = C8299j.m16589b(typedArray, xmlPullParser, theme);
        if (b != null) {
            gVar.f7771c = b;
        }
        boolean z = gVar.f7773e;
        if (C8299j.m16595h(xmlPullParser, "autoMirrored")) {
            z = typedArray.getBoolean(5, z);
        }
        gVar.f7773e = z;
        fVar.f7763j = C8299j.m16591d(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f7763j);
        float d = C8299j.m16591d(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f7764k);
        fVar.f7764k = d;
        if (fVar.f7763j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (d > 0.0f) {
            fVar.f7761h = typedArray.getDimension(3, fVar.f7761h);
            float dimension = typedArray.getDimension(2, fVar.f7762i);
            fVar.f7762i = dimension;
            if (fVar.f7761h <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                fVar.setAlpha(C8299j.m16591d(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.f7766m = string;
                    fVar.f7768o.put(string, fVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if ((r15 == r8.getWidth() && r3 == r6.f7774f.getHeight()) == false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.graphics.drawable.Drawable r2 = r0.mDelegateDrawable
            if (r2 == 0) goto L_0x000c
            r2.draw(r1)
            return
        L_0x000c:
            android.graphics.Rect r2 = r0.mTmpBounds
            r0.copyBounds(r2)
            android.graphics.Rect r2 = r0.mTmpBounds
            int r2 = r2.width()
            if (r2 <= 0) goto L_0x0188
            android.graphics.Rect r2 = r0.mTmpBounds
            int r2 = r2.height()
            if (r2 > 0) goto L_0x0023
            goto L_0x0188
        L_0x0023:
            android.graphics.ColorFilter r2 = r0.mColorFilter
            if (r2 != 0) goto L_0x0029
            android.graphics.PorterDuffColorFilter r2 = r0.mTintFilter
        L_0x0029:
            android.graphics.Matrix r3 = r0.mTmpMatrix
            r1.getMatrix(r3)
            android.graphics.Matrix r3 = r0.mTmpMatrix
            float[] r4 = r0.mTmpFloats
            r3.getValues(r4)
            float[] r3 = r0.mTmpFloats
            r4 = 0
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r5 = r0.mTmpFloats
            r6 = 4
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            float[] r6 = r0.mTmpFloats
            r7 = 1
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            float[] r8 = r0.mTmpFloats
            r9 = 3
            r8 = r8[r9]
            float r8 = java.lang.Math.abs(r8)
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r6 != 0) goto L_0x0064
            int r6 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0066
        L_0x0064:
            r3 = r10
            r5 = r3
        L_0x0066:
            android.graphics.Rect r6 = r0.mTmpBounds
            int r6 = r6.width()
            float r6 = (float) r6
            float r6 = r6 * r3
            int r3 = (int) r6
            android.graphics.Rect r6 = r0.mTmpBounds
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r5 = (int) r6
            r6 = 2048(0x800, float:2.87E-42)
            int r15 = java.lang.Math.min(r6, r3)
            int r3 = java.lang.Math.min(r6, r5)
            if (r15 <= 0) goto L_0x0188
            if (r3 > 0) goto L_0x0088
            goto L_0x0188
        L_0x0088:
            int r5 = r18.save()
            android.graphics.Rect r6 = r0.mTmpBounds
            int r8 = r6.left
            float r8 = (float) r8
            int r6 = r6.top
            float r6 = (float) r6
            r1.translate(r8, r6)
            boolean r6 = r17.needMirroring()
            if (r6 == 0) goto L_0x00ac
            android.graphics.Rect r6 = r0.mTmpBounds
            int r6 = r6.width()
            float r6 = (float) r6
            r1.translate(r6, r9)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r6, r10)
        L_0x00ac:
            android.graphics.Rect r6 = r0.mTmpBounds
            r6.offsetTo(r4, r4)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g r6 = r0.mVectorState
            android.graphics.Bitmap r8 = r6.f7774f
            if (r8 == 0) goto L_0x00ca
            int r8 = r8.getWidth()
            if (r15 != r8) goto L_0x00c7
            android.graphics.Bitmap r8 = r6.f7774f
            int r8 = r8.getHeight()
            if (r3 != r8) goto L_0x00c7
            r8 = r7
            goto L_0x00c8
        L_0x00c7:
            r8 = r4
        L_0x00c8:
            if (r8 != 0) goto L_0x00d4
        L_0x00ca:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r15, r3, r8)
            r6.f7774f = r8
            r6.f7779k = r7
        L_0x00d4:
            boolean r6 = r0.mAllowCaching
            if (r6 != 0) goto L_0x00f2
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g r6 = r0.mVectorState
            android.graphics.Bitmap r8 = r6.f7774f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f7774f
            r14.<init>(r8)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f r11 = r6.f7770b
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$c r12 = r11.f7760g
            android.graphics.Matrix r13 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.C3316f.f7753p
            r16 = r3
            r11.mo12543a(r12, r13, r14, r15, r16)
            goto L_0x014a
        L_0x00f2:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g r6 = r0.mVectorState
            boolean r8 = r6.f7779k
            if (r8 != 0) goto L_0x0116
            android.content.res.ColorStateList r8 = r6.f7775g
            android.content.res.ColorStateList r9 = r6.f7771c
            if (r8 != r9) goto L_0x0116
            android.graphics.PorterDuff$Mode r8 = r6.f7776h
            android.graphics.PorterDuff$Mode r9 = r6.f7772d
            if (r8 != r9) goto L_0x0116
            boolean r8 = r6.f7778j
            boolean r9 = r6.f7773e
            if (r8 != r9) goto L_0x0116
            int r8 = r6.f7777i
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f r6 = r6.f7770b
            int r6 = r6.getRootAlpha()
            if (r8 != r6) goto L_0x0116
            r6 = r7
            goto L_0x0117
        L_0x0116:
            r6 = r4
        L_0x0117:
            if (r6 != 0) goto L_0x014a
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g r6 = r0.mVectorState
            android.graphics.Bitmap r8 = r6.f7774f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f7774f
            r14.<init>(r8)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f r11 = r6.f7770b
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$c r12 = r11.f7760g
            android.graphics.Matrix r13 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.C3316f.f7753p
            r16 = r3
            r11.mo12543a(r12, r13, r14, r15, r16)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g r3 = r0.mVectorState
            android.content.res.ColorStateList r6 = r3.f7771c
            r3.f7775g = r6
            android.graphics.PorterDuff$Mode r6 = r3.f7772d
            r3.f7776h = r6
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f r6 = r3.f7770b
            int r6 = r6.getRootAlpha()
            r3.f7777i = r6
            boolean r6 = r3.f7773e
            r3.f7778j = r6
            r3.f7779k = r4
        L_0x014a:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g r3 = r0.mVectorState
            android.graphics.Rect r6 = r0.mTmpBounds
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f r8 = r3.f7770b
            int r8 = r8.getRootAlpha()
            r9 = 255(0xff, float:3.57E-43)
            if (r8 >= r9) goto L_0x0159
            r4 = r7
        L_0x0159:
            r8 = 0
            if (r4 != 0) goto L_0x0160
            if (r2 != 0) goto L_0x0160
            r2 = r8
            goto L_0x0180
        L_0x0160:
            android.graphics.Paint r4 = r3.f7780l
            if (r4 != 0) goto L_0x016e
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f7780l = r4
            r4.setFilterBitmap(r7)
        L_0x016e:
            android.graphics.Paint r4 = r3.f7780l
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f r7 = r3.f7770b
            int r7 = r7.getRootAlpha()
            r4.setAlpha(r7)
            android.graphics.Paint r4 = r3.f7780l
            r4.setColorFilter(r2)
            android.graphics.Paint r2 = r3.f7780l
        L_0x0180:
            android.graphics.Bitmap r3 = r3.f7774f
            r1.drawBitmap(r3, r8, r6, r2)
            r1.restoreToCount(r5)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getAlpha() : this.mVectorState.f7770b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.mVectorState.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getColorFilter() : this.mColorFilter;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new C3318h(this.mDelegateDrawable.getConstantState());
        }
        this.mVectorState.f7769a = getChangingConfigurations();
        return this.mVectorState;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.mVectorState.f7770b.f7762i;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.mVectorState.f7770b.f7761h;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public float getPixelSize() {
        C3316f fVar;
        C3317g gVar = this.mVectorState;
        if (gVar == null || (fVar = gVar.f7770b) == null) {
            return 1.0f;
        }
        float f = fVar.f7761h;
        if (f == 0.0f) {
            return 1.0f;
        }
        float f2 = fVar.f7762i;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = fVar.f7764k;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = fVar.f7763j;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f4 / f, f3 / f2);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public Object getTargetByName(String str) {
        return this.mVectorState.f7770b.f7768o.getOrDefault(str, null);
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.isAutoMirrored() : this.mVectorState.f7773e;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C3317g gVar = this.mVectorState;
            if (gVar != null) {
                C3316f fVar = gVar.f7770b;
                if (fVar.f7767n == null) {
                    fVar.f7767n = Boolean.valueOf(fVar.f7760g.mo12505a());
                }
                if (fVar.f7767n.booleanValue() || ((colorStateList = this.mVectorState.f7771c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.mMutated && super.mutate() == this) {
            this.mVectorState = new C3317g(this.mVectorState);
            this.mMutated = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C3317g gVar = this.mVectorState;
        ColorStateList colorStateList = gVar.f7771c;
        if (!(colorStateList == null || (mode = gVar.f7772d) == null)) {
            this.mTintFilter = updateTintFilter(this.mTintFilter, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C3316f fVar = gVar.f7770b;
        if (fVar.f7767n == null) {
            fVar.f7767n = Boolean.valueOf(fVar.f7760g.mo12505a());
        }
        if (fVar.f7767n.booleanValue()) {
            boolean b = gVar.f7770b.f7760g.mo12506b(iArr);
            gVar.f7779k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAllowCaching(boolean z) {
        this.mAllowCaching = z;
    }

    public void setAlpha(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.mVectorState.f7770b.getRootAlpha() != i) {
            this.mVectorState.f7770b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.mVectorState.f7773e = z;
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
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C3317g gVar = this.mVectorState;
        if (gVar.f7771c != colorStateList) {
            gVar.f7771c = colorStateList;
            this.mTintFilter = updateTintFilter(this.mTintFilter, colorStateList, gVar.f7772d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C3317g gVar = this.mVectorState;
        if (gVar.f7772d != mode) {
            gVar.f7772d = mode;
            this.mTintFilter = updateTintFilter(this.mTintFilter, gVar.f7771c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$h */
    public static class C3318h extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f7781a;

        public C3318h(Drawable.ConstantState constantState) {
            this.f7781a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f7781a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f7781a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.f7781a.newDrawable();
            return vectorDrawableCompat;
        }

        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.f7781a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.f7781a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.mColorFilter = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$e */
    public static abstract class C3315e extends C3314d {

        /* renamed from: a */
        public C8354f.C8355a[] f7749a = null;

        /* renamed from: b */
        public String f7750b;

        /* renamed from: c */
        public int f7751c = 0;

        /* renamed from: d */
        public int f7752d;

        public C3315e() {
        }

        public C8354f.C8355a[] getPathData() {
            return this.f7749a;
        }

        public String getPathName() {
            return this.f7750b;
        }

        public void setPathData(C8354f.C8355a[] aVarArr) {
            if (!C8354f.m16671a(this.f7749a, aVarArr)) {
                this.f7749a = C8354f.m16675e(aVarArr);
                return;
            }
            C8354f.C8355a[] aVarArr2 = this.f7749a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].f18325a = aVarArr[i].f18325a;
                int i2 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].f18326b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    aVarArr2[i].f18326b[i2] = fArr[i2];
                    i2++;
                }
            }
        }

        public C3315e(C3315e eVar) {
            this.f7750b = eVar.f7750b;
            this.f7752d = eVar.f7752d;
            this.f7749a = C8354f.m16675e(eVar.f7749a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3317g gVar = this.mVectorState;
        gVar.f7770b = new C3316f();
        TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C7511a.f16756a);
        updateStateFromTypedArray(i, xmlPullParser, theme);
        i.recycle();
        gVar.f7769a = getChangingConfigurations();
        gVar.f7779k = true;
        inflateInternal(resources, xmlPullParser, attributeSet, theme);
        this.mTintFilter = updateTintFilter(this.mTintFilter, gVar.f7771c, gVar.f7772d);
    }

    public VectorDrawableCompat(C3317g gVar) {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mVectorState = gVar;
        this.mTintFilter = updateTintFilter(this.mTintFilter, gVar.f7771c, gVar.f7772d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$b */
    public static class C3312b extends C3315e {

        /* renamed from: e */
        public C8285c f7726e;

        /* renamed from: f */
        public float f7727f = 0.0f;

        /* renamed from: g */
        public C8285c f7728g;

        /* renamed from: h */
        public float f7729h = 1.0f;

        /* renamed from: i */
        public float f7730i = 1.0f;

        /* renamed from: j */
        public float f7731j = 0.0f;

        /* renamed from: k */
        public float f7732k = 1.0f;

        /* renamed from: l */
        public float f7733l = 0.0f;

        /* renamed from: m */
        public Paint.Cap f7734m = Paint.Cap.BUTT;

        /* renamed from: n */
        public Paint.Join f7735n = Paint.Join.MITER;

        /* renamed from: o */
        public float f7736o = 4.0f;

        public C3312b() {
        }

        /* renamed from: a */
        public final boolean mo12505a() {
            return this.f7728g.mo20890b() || this.f7726e.mo20890b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo12506b(int[] r7) {
            /*
                r6 = this;
                x0.c r0 = r6.f7728g
                boolean r1 = r0.mo20890b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.content.res.ColorStateList r1 = r0.f18157b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f18158c
                if (r1 == r4) goto L_0x001c
                r0.f18158c = r1
                r0 = r2
                goto L_0x001d
            L_0x001c:
                r0 = r3
            L_0x001d:
                x0.c r1 = r6.f7726e
                boolean r4 = r1.mo20890b()
                if (r4 == 0) goto L_0x0036
                android.content.res.ColorStateList r4 = r1.f18157b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f18158c
                if (r7 == r4) goto L_0x0036
                r1.f18158c = r7
                goto L_0x0037
            L_0x0036:
                r2 = r3
            L_0x0037:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.C3312b.mo12506b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f7730i;
        }

        public int getFillColor() {
            return this.f7728g.f18158c;
        }

        public float getStrokeAlpha() {
            return this.f7729h;
        }

        public int getStrokeColor() {
            return this.f7726e.f18158c;
        }

        public float getStrokeWidth() {
            return this.f7727f;
        }

        public float getTrimPathEnd() {
            return this.f7732k;
        }

        public float getTrimPathOffset() {
            return this.f7733l;
        }

        public float getTrimPathStart() {
            return this.f7731j;
        }

        public void setFillAlpha(float f) {
            this.f7730i = f;
        }

        public void setFillColor(int i) {
            this.f7728g.f18158c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f7729h = f;
        }

        public void setStrokeColor(int i) {
            this.f7726e.f18158c = i;
        }

        public void setStrokeWidth(float f) {
            this.f7727f = f;
        }

        public void setTrimPathEnd(float f) {
            this.f7732k = f;
        }

        public void setTrimPathOffset(float f) {
            this.f7733l = f;
        }

        public void setTrimPathStart(float f) {
            this.f7731j = f;
        }

        public C3312b(C3312b bVar) {
            super(bVar);
            this.f7726e = bVar.f7726e;
            this.f7727f = bVar.f7727f;
            this.f7729h = bVar.f7729h;
            this.f7728g = bVar.f7728g;
            this.f7751c = bVar.f7751c;
            this.f7730i = bVar.f7730i;
            this.f7731j = bVar.f7731j;
            this.f7732k = bVar.f7732k;
            this.f7733l = bVar.f7733l;
            this.f7734m = bVar.f7734m;
            this.f7735n = bVar.f7735n;
            this.f7736o = bVar.f7736o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$c */
    public static class C3313c extends C3314d {

        /* renamed from: a */
        public final Matrix f7737a;

        /* renamed from: b */
        public final ArrayList<C3314d> f7738b;

        /* renamed from: c */
        public float f7739c;

        /* renamed from: d */
        public float f7740d;

        /* renamed from: e */
        public float f7741e;

        /* renamed from: f */
        public float f7742f;

        /* renamed from: g */
        public float f7743g;

        /* renamed from: h */
        public float f7744h;

        /* renamed from: i */
        public float f7745i;

        /* renamed from: j */
        public final Matrix f7746j;

        /* renamed from: k */
        public int f7747k;

        /* renamed from: l */
        public String f7748l;

        public C3313c() {
            this.f7737a = new Matrix();
            this.f7738b = new ArrayList<>();
            this.f7739c = 0.0f;
            this.f7740d = 0.0f;
            this.f7741e = 0.0f;
            this.f7742f = 1.0f;
            this.f7743g = 1.0f;
            this.f7744h = 0.0f;
            this.f7745i = 0.0f;
            this.f7746j = new Matrix();
            this.f7748l = null;
        }

        /* renamed from: a */
        public final boolean mo12505a() {
            for (int i = 0; i < this.f7738b.size(); i++) {
                if (this.f7738b.get(i).mo12505a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo12506b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f7738b.size(); i++) {
                z |= this.f7738b.get(i).mo12506b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public final void mo12523c() {
            this.f7746j.reset();
            this.f7746j.postTranslate(-this.f7740d, -this.f7741e);
            this.f7746j.postScale(this.f7742f, this.f7743g);
            this.f7746j.postRotate(this.f7739c, 0.0f, 0.0f);
            this.f7746j.postTranslate(this.f7744h + this.f7740d, this.f7745i + this.f7741e);
        }

        public String getGroupName() {
            return this.f7748l;
        }

        public Matrix getLocalMatrix() {
            return this.f7746j;
        }

        public float getPivotX() {
            return this.f7740d;
        }

        public float getPivotY() {
            return this.f7741e;
        }

        public float getRotation() {
            return this.f7739c;
        }

        public float getScaleX() {
            return this.f7742f;
        }

        public float getScaleY() {
            return this.f7743g;
        }

        public float getTranslateX() {
            return this.f7744h;
        }

        public float getTranslateY() {
            return this.f7745i;
        }

        public void setPivotX(float f) {
            if (f != this.f7740d) {
                this.f7740d = f;
                mo12523c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f7741e) {
                this.f7741e = f;
                mo12523c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f7739c) {
                this.f7739c = f;
                mo12523c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f7742f) {
                this.f7742f = f;
                mo12523c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f7743g) {
                this.f7743g = f;
                mo12523c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f7744h) {
                this.f7744h = f;
                mo12523c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f7745i) {
                this.f7745i = f;
                mo12523c();
            }
        }

        public C3313c(C3313c cVar, C7494b<String, Object> bVar) {
            C3315e eVar;
            this.f7737a = new Matrix();
            this.f7738b = new ArrayList<>();
            this.f7739c = 0.0f;
            this.f7740d = 0.0f;
            this.f7741e = 0.0f;
            this.f7742f = 1.0f;
            this.f7743g = 1.0f;
            this.f7744h = 0.0f;
            this.f7745i = 0.0f;
            Matrix matrix = new Matrix();
            this.f7746j = matrix;
            this.f7748l = null;
            this.f7739c = cVar.f7739c;
            this.f7740d = cVar.f7740d;
            this.f7741e = cVar.f7741e;
            this.f7742f = cVar.f7742f;
            this.f7743g = cVar.f7743g;
            this.f7744h = cVar.f7744h;
            this.f7745i = cVar.f7745i;
            String str = cVar.f7748l;
            this.f7748l = str;
            this.f7747k = cVar.f7747k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f7746j);
            ArrayList<C3314d> arrayList = cVar.f7738b;
            for (int i = 0; i < arrayList.size(); i++) {
                C3314d dVar = arrayList.get(i);
                if (dVar instanceof C3313c) {
                    this.f7738b.add(new C3313c((C3313c) dVar, bVar));
                } else {
                    if (dVar instanceof C3312b) {
                        eVar = new C3312b((C3312b) dVar);
                    } else if (dVar instanceof C3311a) {
                        eVar = new C3311a((C3311a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f7738b.add(eVar);
                    String str2 = eVar.f7750b;
                    if (str2 != null) {
                        bVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f */
    public static class C3316f {

        /* renamed from: p */
        public static final Matrix f7753p = new Matrix();

        /* renamed from: a */
        public final Path f7754a;

        /* renamed from: b */
        public final Path f7755b;

        /* renamed from: c */
        public final Matrix f7756c;

        /* renamed from: d */
        public Paint f7757d;

        /* renamed from: e */
        public Paint f7758e;

        /* renamed from: f */
        public PathMeasure f7759f;

        /* renamed from: g */
        public final C3313c f7760g;

        /* renamed from: h */
        public float f7761h;

        /* renamed from: i */
        public float f7762i;

        /* renamed from: j */
        public float f7763j;

        /* renamed from: k */
        public float f7764k;

        /* renamed from: l */
        public int f7765l;

        /* renamed from: m */
        public String f7766m;

        /* renamed from: n */
        public Boolean f7767n;

        /* renamed from: o */
        public final C7494b<String, Object> f7768o;

        public C3316f() {
            this.f7756c = new Matrix();
            this.f7761h = 0.0f;
            this.f7762i = 0.0f;
            this.f7763j = 0.0f;
            this.f7764k = 0.0f;
            this.f7765l = 255;
            this.f7766m = null;
            this.f7767n = null;
            this.f7768o = new C7494b<>();
            this.f7760g = new C3313c();
            this.f7754a = new Path();
            this.f7755b = new Path();
        }

        /* renamed from: a */
        public final void mo12543a(C3313c cVar, Matrix matrix, Canvas canvas, int i, int i2) {
            boolean z;
            C3313c cVar2 = cVar;
            Canvas canvas2 = canvas;
            cVar2.f7737a.set(matrix);
            cVar2.f7737a.preConcat(cVar2.f7746j);
            canvas.save();
            C3316f fVar = this;
            for (int i3 = 0; i3 < cVar2.f7738b.size(); i3++) {
                C3314d dVar = cVar2.f7738b.get(i3);
                if (dVar instanceof C3313c) {
                    mo12543a((C3313c) dVar, cVar2.f7737a, canvas, i, i2);
                } else if (dVar instanceof C3315e) {
                    C3315e eVar = (C3315e) dVar;
                    float f = ((float) i) / fVar.f7763j;
                    float f2 = ((float) i2) / fVar.f7764k;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = cVar2.f7737a;
                    fVar.f7756c.set(matrix2);
                    fVar.f7756c.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f3 = min;
                    float f4 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                    if (abs != 0.0f) {
                        Path path = this.f7754a;
                        eVar.getClass();
                        path.reset();
                        C8354f.C8355a[] aVarArr = eVar.f7749a;
                        if (aVarArr != null) {
                            C8354f.C8355a.m16677b(aVarArr, path);
                        }
                        Path path2 = this.f7754a;
                        this.f7755b.reset();
                        if (eVar instanceof C3311a) {
                            this.f7755b.setFillType(eVar.f7751c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            this.f7755b.addPath(path2, this.f7756c);
                            canvas2.clipPath(this.f7755b);
                        } else {
                            C3312b bVar = (C3312b) eVar;
                            float f5 = bVar.f7731j;
                            if (!(f5 == 0.0f && bVar.f7732k == 1.0f)) {
                                float f6 = bVar.f7733l;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (bVar.f7732k + f6) % 1.0f;
                                if (this.f7759f == null) {
                                    this.f7759f = new PathMeasure();
                                }
                                this.f7759f.setPath(this.f7754a, false);
                                float length = this.f7759f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path2.reset();
                                if (f9 > f10) {
                                    this.f7759f.getSegment(f9, length, path2, true);
                                    this.f7759f.getSegment(0.0f, f10, path2, true);
                                } else {
                                    this.f7759f.getSegment(f9, f10, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.f7755b.addPath(path2, this.f7756c);
                            C8285c cVar3 = bVar.f7728g;
                            if ((cVar3.f18156a != null) || cVar3.f18158c != 0) {
                                if (this.f7758e == null) {
                                    Paint paint = new Paint(1);
                                    this.f7758e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f7758e;
                                Shader shader = cVar3.f18156a;
                                if (shader != null) {
                                    shader.setLocalMatrix(this.f7756c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f7730i * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    paint2.setColor(VectorDrawableCompat.applyAlpha(cVar3.f18158c, bVar.f7730i));
                                }
                                paint2.setColorFilter((ColorFilter) null);
                                this.f7755b.setFillType(bVar.f7751c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(this.f7755b, paint2);
                            }
                            C8285c cVar4 = bVar.f7726e;
                            if ((cVar4.f18156a != null) || cVar4.f18158c != 0) {
                                if (this.f7757d == null) {
                                    z = true;
                                    Paint paint3 = new Paint(1);
                                    this.f7757d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z = true;
                                }
                                Paint paint4 = this.f7757d;
                                Paint.Join join = bVar.f7735n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f7734m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f7736o);
                                Shader shader2 = cVar4.f18156a;
                                if (shader2 == null) {
                                    z = false;
                                }
                                if (z) {
                                    shader2.setLocalMatrix(this.f7756c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f7729h * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    paint4.setColor(VectorDrawableCompat.applyAlpha(cVar4.f18158c, bVar.f7729h));
                                }
                                paint4.setColorFilter((ColorFilter) null);
                                paint4.setStrokeWidth(bVar.f7727f * abs * f3);
                                canvas2.drawPath(this.f7755b, paint4);
                            }
                        }
                    }
                    fVar = this;
                }
                int i4 = i;
                int i5 = i2;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f7765l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f7765l = i;
        }

        public C3316f(C3316f fVar) {
            this.f7756c = new Matrix();
            this.f7761h = 0.0f;
            this.f7762i = 0.0f;
            this.f7763j = 0.0f;
            this.f7764k = 0.0f;
            this.f7765l = 255;
            this.f7766m = null;
            this.f7767n = null;
            C7494b<String, Object> bVar = new C7494b<>();
            this.f7768o = bVar;
            this.f7760g = new C3313c(fVar.f7760g, bVar);
            this.f7754a = new Path(fVar.f7754a);
            this.f7755b = new Path(fVar.f7755b);
            this.f7761h = fVar.f7761h;
            this.f7762i = fVar.f7762i;
            this.f7763j = fVar.f7763j;
            this.f7764k = fVar.f7764k;
            this.f7765l = fVar.f7765l;
            this.f7766m = fVar.f7766m;
            String str = fVar.f7766m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f7767n = fVar.f7767n;
        }
    }
}
