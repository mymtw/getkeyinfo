package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import kotlin.reflect.C19421p;
import p184n0.C7363c;

/* renamed from: androidx.constraintlayout.motion.widget.j */
public final class C2140j extends C2142k {

    /* renamed from: f */
    public String f4855f = null;

    /* renamed from: g */
    public int f4856g = -1;

    /* renamed from: h */
    public int f4857h = 0;

    /* renamed from: i */
    public float f4858i = Float.NaN;

    /* renamed from: j */
    public float f4859j = Float.NaN;

    /* renamed from: k */
    public float f4860k = Float.NaN;

    /* renamed from: l */
    public float f4861l = Float.NaN;

    /* renamed from: m */
    public float f4862m = Float.NaN;

    /* renamed from: n */
    public float f4863n = Float.NaN;

    /* renamed from: o */
    public int f4864o = 0;

    /* renamed from: androidx.constraintlayout.motion.widget.j$a */
    public static class C2141a {

        /* renamed from: a */
        public static SparseIntArray f4865a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4865a = sparseIntArray;
            sparseIntArray.append(4, 1);
            f4865a.append(2, 2);
            f4865a.append(11, 3);
            f4865a.append(0, 4);
            f4865a.append(1, 5);
            f4865a.append(8, 6);
            f4865a.append(9, 7);
            f4865a.append(3, 9);
            f4865a.append(10, 8);
            f4865a.append(7, 11);
            f4865a.append(6, 12);
            f4865a.append(5, 10);
        }
    }

    /* renamed from: a */
    public final void mo8136a(HashMap<String, C2154r> hashMap) {
    }

    /* renamed from: c */
    public final void mo8138c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43332v);
        SparseIntArray sparseIntArray = C2141a.f4865a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C2141a.f4865a.get(index)) {
                case 1:
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
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f4796c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    }
                case 2:
                    this.f4794a = obtainStyledAttributes.getInt(index, this.f4794a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f4855f = C7363c.f16409c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        this.f4855f = obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    this.f4866e = obtainStyledAttributes.getInteger(index, this.f4866e);
                    break;
                case 5:
                    this.f4857h = obtainStyledAttributes.getInt(index, this.f4857h);
                    break;
                case 6:
                    this.f4860k = obtainStyledAttributes.getFloat(index, this.f4860k);
                    break;
                case 7:
                    this.f4861l = obtainStyledAttributes.getFloat(index, this.f4861l);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.f4859j);
                    this.f4858i = f;
                    this.f4859j = f;
                    break;
                case 9:
                    this.f4864o = obtainStyledAttributes.getInt(index, this.f4864o);
                    break;
                case 10:
                    this.f4856g = obtainStyledAttributes.getInt(index, this.f4856g);
                    break;
                case 11:
                    this.f4858i = obtainStyledAttributes.getFloat(index, this.f4858i);
                    break;
                case 12:
                    this.f4859j = obtainStyledAttributes.getFloat(index, this.f4859j);
                    break;
                default:
                    StringBuilder h = C0072d.m201h("unused attribute 0x");
                    h.append(Integer.toHexString(index));
                    h.append("   ");
                    h.append(C2141a.f4865a.get(index));
                    Log.e("KeyPosition", h.toString());
                    break;
            }
        }
        if (this.f4794a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
