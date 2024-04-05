package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import kotlin.reflect.C19421p;

/* renamed from: androidx.constraintlayout.motion.widget.v */
public final class C2186v {

    /* renamed from: v */
    public static final float[][] f5027v = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: w */
    public static final float[][] f5028w = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: a */
    public int f5029a = 0;

    /* renamed from: b */
    public int f5030b = 0;

    /* renamed from: c */
    public int f5031c = 0;

    /* renamed from: d */
    public int f5032d = -1;

    /* renamed from: e */
    public int f5033e = -1;

    /* renamed from: f */
    public int f5034f = -1;

    /* renamed from: g */
    public float f5035g = 0.5f;

    /* renamed from: h */
    public float f5036h = 0.5f;

    /* renamed from: i */
    public float f5037i = 0.0f;

    /* renamed from: j */
    public float f5038j = 1.0f;

    /* renamed from: k */
    public boolean f5039k = false;

    /* renamed from: l */
    public float[] f5040l = new float[2];

    /* renamed from: m */
    public float f5041m;

    /* renamed from: n */
    public float f5042n;

    /* renamed from: o */
    public final MotionLayout f5043o;

    /* renamed from: p */
    public float f5044p = 4.0f;

    /* renamed from: q */
    public float f5045q = 1.2f;

    /* renamed from: r */
    public boolean f5046r = true;

    /* renamed from: s */
    public float f5047s = 1.0f;

    /* renamed from: t */
    public int f5048t = 0;

    /* renamed from: u */
    public float f5049u = 10.0f;

    public C2186v(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f5043o = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43305G);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 9) {
                this.f5032d = obtainStyledAttributes.getResourceId(index, this.f5032d);
            } else if (index == 10) {
                int i2 = obtainStyledAttributes.getInt(index, this.f5029a);
                this.f5029a = i2;
                float[] fArr = f5027v[i2];
                this.f5036h = fArr[0];
                this.f5035g = fArr[1];
            } else if (index == 0) {
                int i3 = obtainStyledAttributes.getInt(index, this.f5030b);
                this.f5030b = i3;
                float[] fArr2 = f5028w[i3];
                this.f5037i = fArr2[0];
                this.f5038j = fArr2[1];
            } else if (index == 5) {
                this.f5044p = obtainStyledAttributes.getFloat(index, this.f5044p);
            } else if (index == 4) {
                this.f5045q = obtainStyledAttributes.getFloat(index, this.f5045q);
            } else if (index == 6) {
                this.f5046r = obtainStyledAttributes.getBoolean(index, this.f5046r);
            } else if (index == 1) {
                this.f5047s = obtainStyledAttributes.getFloat(index, this.f5047s);
            } else if (index == 2) {
                this.f5049u = obtainStyledAttributes.getFloat(index, this.f5049u);
            } else if (index == 11) {
                this.f5033e = obtainStyledAttributes.getResourceId(index, this.f5033e);
            } else if (index == 8) {
                this.f5031c = obtainStyledAttributes.getInt(index, this.f5031c);
            } else if (index == 7) {
                this.f5048t = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f5034f = obtainStyledAttributes.getResourceId(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final RectF mo8191a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f5033e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: b */
    public final void mo8192b(boolean z) {
        if (z) {
            float[][] fArr = f5028w;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f5027v;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f5028w;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f5027v;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f5027v[this.f5029a];
        this.f5036h = fArr5[0];
        this.f5035g = fArr5[1];
        float[] fArr6 = f5028w[this.f5030b];
        this.f5037i = fArr6[0];
        this.f5038j = fArr6[1];
    }

    public final String toString() {
        return this.f5037i + " , " + this.f5038j;
    }
}
