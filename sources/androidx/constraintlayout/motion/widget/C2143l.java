package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.appcompat.widget.C0326j;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.C19421p;

/* renamed from: androidx.constraintlayout.motion.widget.l */
public final class C2143l extends C2116c {

    /* renamed from: e */
    public int f4867e = -1;

    /* renamed from: f */
    public float f4868f = Float.NaN;

    /* renamed from: g */
    public float f4869g = Float.NaN;

    /* renamed from: h */
    public float f4870h = Float.NaN;

    /* renamed from: i */
    public float f4871i = Float.NaN;

    /* renamed from: j */
    public float f4872j = Float.NaN;

    /* renamed from: k */
    public float f4873k = Float.NaN;

    /* renamed from: l */
    public float f4874l = Float.NaN;

    /* renamed from: m */
    public float f4875m = Float.NaN;

    /* renamed from: n */
    public float f4876n = Float.NaN;

    /* renamed from: o */
    public float f4877o = Float.NaN;

    /* renamed from: p */
    public float f4878p = Float.NaN;

    /* renamed from: q */
    public float f4879q = Float.NaN;

    /* renamed from: r */
    public int f4880r = 0;

    /* renamed from: s */
    public float f4881s = Float.NaN;

    /* renamed from: t */
    public float f4882t = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    public static class C2144a {

        /* renamed from: a */
        public static SparseIntArray f4883a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4883a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f4883a.append(9, 2);
            f4883a.append(5, 4);
            f4883a.append(6, 5);
            f4883a.append(7, 6);
            f4883a.append(3, 7);
            f4883a.append(15, 8);
            f4883a.append(14, 9);
            f4883a.append(13, 10);
            f4883a.append(11, 12);
            f4883a.append(10, 13);
            f4883a.append(4, 14);
            f4883a.append(1, 15);
            f4883a.append(2, 16);
            f4883a.append(8, 17);
            f4883a.append(12, 18);
            f4883a.append(18, 20);
            f4883a.append(17, 21);
            f4883a.append(19, 19);
        }
    }

    public C2143l() {
        this.f4797d = new HashMap<>();
    }

    /* renamed from: a */
    public final void mo8136a(HashMap<String, C2154r> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public final void mo8137b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f4868f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f4869g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f4870h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f4871i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f4872j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f4876n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f4877o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f4878p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f4873k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f4874l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f4875m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f4879q)) {
            hashSet.add("progress");
        }
        if (this.f4797d.size() > 0) {
            for (String str : this.f4797d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: c */
    public final void mo8138c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43333w);
        SparseIntArray sparseIntArray = C2144a.f4883a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C2144a.f4883a.get(index)) {
                case 1:
                    this.f4868f = obtainStyledAttributes.getFloat(index, this.f4868f);
                    break;
                case 2:
                    this.f4869g = obtainStyledAttributes.getDimension(index, this.f4869g);
                    break;
                case 4:
                    this.f4870h = obtainStyledAttributes.getFloat(index, this.f4870h);
                    break;
                case 5:
                    this.f4871i = obtainStyledAttributes.getFloat(index, this.f4871i);
                    break;
                case 6:
                    this.f4872j = obtainStyledAttributes.getFloat(index, this.f4872j);
                    break;
                case 7:
                    this.f4874l = obtainStyledAttributes.getFloat(index, this.f4874l);
                    break;
                case 8:
                    this.f4873k = obtainStyledAttributes.getFloat(index, this.f4873k);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f4794a = obtainStyledAttributes.getInt(index, this.f4794a);
                    break;
                case 13:
                    this.f4867e = obtainStyledAttributes.getInteger(index, this.f4867e);
                    break;
                case 14:
                    this.f4875m = obtainStyledAttributes.getFloat(index, this.f4875m);
                    break;
                case 15:
                    this.f4876n = obtainStyledAttributes.getDimension(index, this.f4876n);
                    break;
                case 16:
                    this.f4877o = obtainStyledAttributes.getDimension(index, this.f4877o);
                    break;
                case 17:
                    this.f4878p = obtainStyledAttributes.getDimension(index, this.f4878p);
                    break;
                case 18:
                    this.f4879q = obtainStyledAttributes.getFloat(index, this.f4879q);
                    break;
                case 19:
                    this.f4880r = obtainStyledAttributes.getInt(index, this.f4880r);
                    break;
                case 20:
                    this.f4881s = obtainStyledAttributes.getFloat(index, this.f4881s);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.f4882t = obtainStyledAttributes.getFloat(index, this.f4882t);
                        break;
                    } else {
                        this.f4882t = obtainStyledAttributes.getDimension(index, this.f4882t);
                        break;
                    }
                default:
                    StringBuilder h = C0072d.m201h("unused attribute 0x");
                    h.append(Integer.toHexString(index));
                    h.append("   ");
                    h.append(C2144a.f4883a.get(index));
                    Log.e("KeyTimeCycle", h.toString());
                    break;
            }
        }
    }

    /* renamed from: d */
    public final void mo8139d(HashMap<String, Integer> hashMap) {
        if (this.f4867e != -1) {
            if (!Float.isNaN(this.f4868f)) {
                hashMap.put("alpha", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4869g)) {
                hashMap.put("elevation", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4870h)) {
                hashMap.put("rotation", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4871i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4872j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4876n)) {
                hashMap.put("translationX", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4877o)) {
                hashMap.put("translationY", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4878p)) {
                hashMap.put("translationZ", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4873k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4874l)) {
                hashMap.put("scaleX", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4874l)) {
                hashMap.put("scaleY", Integer.valueOf(this.f4867e));
            }
            if (!Float.isNaN(this.f4879q)) {
                hashMap.put("progress", Integer.valueOf(this.f4867e));
            }
            if (this.f4797d.size() > 0) {
                for (String i : this.f4797d.keySet()) {
                    hashMap.put(C0326j.m864i("CUSTOM,", i), Integer.valueOf(this.f4867e));
                }
            }
        }
    }
}
