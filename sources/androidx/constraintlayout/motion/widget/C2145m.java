package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.C19421p;

/* renamed from: androidx.constraintlayout.motion.widget.m */
public final class C2145m extends C2116c {

    /* renamed from: e */
    public String f4884e = null;

    /* renamed from: f */
    public int f4885f = -1;

    /* renamed from: g */
    public String f4886g = null;

    /* renamed from: h */
    public String f4887h = null;

    /* renamed from: i */
    public int f4888i = -1;

    /* renamed from: j */
    public int f4889j = -1;

    /* renamed from: k */
    public View f4890k = null;

    /* renamed from: l */
    public float f4891l = 0.1f;

    /* renamed from: m */
    public boolean f4892m = true;

    /* renamed from: n */
    public boolean f4893n = true;

    /* renamed from: o */
    public boolean f4894o = true;

    /* renamed from: p */
    public float f4895p = Float.NaN;

    /* renamed from: q */
    public Method f4896q;

    /* renamed from: r */
    public Method f4897r;

    /* renamed from: s */
    public Method f4898s;

    /* renamed from: t */
    public float f4899t;

    /* renamed from: u */
    public boolean f4900u = false;

    /* renamed from: v */
    public RectF f4901v = new RectF();

    /* renamed from: w */
    public RectF f4902w = new RectF();

    /* renamed from: androidx.constraintlayout.motion.widget.m$a */
    public static class C2146a {

        /* renamed from: a */
        public static SparseIntArray f4903a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4903a = sparseIntArray;
            sparseIntArray.append(0, 8);
            f4903a.append(4, 4);
            f4903a.append(5, 1);
            f4903a.append(6, 2);
            f4903a.append(1, 7);
            f4903a.append(7, 6);
            f4903a.append(9, 5);
            f4903a.append(3, 9);
            f4903a.append(2, 10);
            f4903a.append(8, 11);
        }
    }

    public C2145m() {
        this.f4797d = new HashMap<>();
    }

    /* renamed from: e */
    public static void m4607e(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: a */
    public final void mo8136a(HashMap<String, C2154r> hashMap) {
    }

    /* renamed from: b */
    public final void mo8137b(HashSet<String> hashSet) {
    }

    /* renamed from: c */
    public final void mo8138c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43334x);
        SparseIntArray sparseIntArray = C2146a.f4903a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C2146a.f4903a.get(index)) {
                case 1:
                    this.f4886g = obtainStyledAttributes.getString(index);
                    continue;
                case 2:
                    this.f4887h = obtainStyledAttributes.getString(index);
                    continue;
                case 4:
                    this.f4884e = obtainStyledAttributes.getString(index);
                    continue;
                case 5:
                    this.f4891l = obtainStyledAttributes.getFloat(index, this.f4891l);
                    continue;
                case 6:
                    this.f4888i = obtainStyledAttributes.getResourceId(index, this.f4888i);
                    continue;
                case 7:
                    if (!MotionLayout.IS_IN_EDIT_MODE) {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f4795b = obtainStyledAttributes.getResourceId(index, this.f4795b);
                            break;
                        } else {
                            this.f4796c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f4795b);
                        this.f4795b = resourceId;
                        if (resourceId == -1) {
                            this.f4796c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            continue;
                        }
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f4794a);
                    this.f4794a = integer;
                    this.f4895p = (((float) integer) + 0.5f) / 100.0f;
                    continue;
                case 9:
                    this.f4889j = obtainStyledAttributes.getResourceId(index, this.f4889j);
                    continue;
                case 10:
                    this.f4900u = obtainStyledAttributes.getBoolean(index, this.f4900u);
                    continue;
                case 11:
                    this.f4885f = obtainStyledAttributes.getResourceId(index, this.f4885f);
                    break;
            }
            StringBuilder h = C0072d.m201h("unused attribute 0x");
            h.append(Integer.toHexString(index));
            h.append("   ");
            h.append(C2146a.f4903a.get(index));
            Log.e("KeyTrigger", h.toString());
        }
    }
}
