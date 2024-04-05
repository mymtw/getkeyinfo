package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.C19421p;

/* renamed from: androidx.constraintlayout.motion.widget.f */
public final class C2120f extends C2116c {

    /* renamed from: e */
    public int f4815e = 0;

    /* renamed from: f */
    public int f4816f = -1;

    /* renamed from: g */
    public float f4817g = Float.NaN;

    /* renamed from: h */
    public float f4818h = 0.0f;

    /* renamed from: i */
    public float f4819i = Float.NaN;

    /* renamed from: j */
    public int f4820j = -1;

    /* renamed from: k */
    public float f4821k = Float.NaN;

    /* renamed from: l */
    public float f4822l = Float.NaN;

    /* renamed from: m */
    public float f4823m = Float.NaN;

    /* renamed from: n */
    public float f4824n = Float.NaN;

    /* renamed from: o */
    public float f4825o = Float.NaN;

    /* renamed from: p */
    public float f4826p = Float.NaN;

    /* renamed from: q */
    public float f4827q = Float.NaN;

    /* renamed from: r */
    public float f4828r = Float.NaN;

    /* renamed from: s */
    public float f4829s = Float.NaN;

    /* renamed from: t */
    public float f4830t = Float.NaN;

    /* renamed from: u */
    public float f4831u = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    public static class C2121a {

        /* renamed from: a */
        public static SparseIntArray f4832a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4832a = sparseIntArray;
            sparseIntArray.append(13, 1);
            f4832a.append(11, 2);
            f4832a.append(14, 3);
            f4832a.append(10, 4);
            f4832a.append(18, 5);
            f4832a.append(17, 6);
            f4832a.append(16, 7);
            f4832a.append(19, 8);
            f4832a.append(0, 9);
            f4832a.append(9, 10);
            f4832a.append(5, 11);
            f4832a.append(6, 12);
            f4832a.append(7, 13);
            f4832a.append(15, 14);
            f4832a.append(3, 15);
            f4832a.append(4, 16);
            f4832a.append(1, 17);
            f4832a.append(2, 18);
            f4832a.append(8, 19);
            f4832a.append(12, 20);
        }
    }

    public C2120f() {
        this.f4797d = new HashMap<>();
    }

    /* renamed from: a */
    public final void mo8136a(HashMap<String, C2154r> hashMap) {
        hashMap.size();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i = 1; i <= min; i++) {
            stackTrace[i].getFileName();
            stackTrace[i].getLineNumber();
            stackTrace[i].getMethodName();
            str = str + " ";
        }
        for (String next : hashMap.keySet()) {
            C2154r rVar = hashMap.get(next);
            next.getClass();
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 8;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 9;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 10;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 156108012:
                    if (next.equals("waveOffset")) {
                        c = 12;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    rVar.mo8180b(this.f4825o, this.f4794a);
                    break;
                case 1:
                    rVar.mo8180b(this.f4826p, this.f4794a);
                    break;
                case 2:
                    rVar.mo8180b(this.f4829s, this.f4794a);
                    break;
                case 3:
                    rVar.mo8180b(this.f4830t, this.f4794a);
                    break;
                case 4:
                    rVar.mo8180b(this.f4831u, this.f4794a);
                    break;
                case 5:
                    rVar.mo8180b(this.f4819i, this.f4794a);
                    break;
                case 6:
                    rVar.mo8180b(this.f4827q, this.f4794a);
                    break;
                case 7:
                    rVar.mo8180b(this.f4828r, this.f4794a);
                    break;
                case 8:
                    rVar.mo8180b(this.f4823m, this.f4794a);
                    break;
                case 9:
                    rVar.mo8180b(this.f4822l, this.f4794a);
                    break;
                case 10:
                    rVar.mo8180b(this.f4824n, this.f4794a);
                    break;
                case 11:
                    rVar.mo8180b(this.f4821k, this.f4794a);
                    break;
                case 12:
                    rVar.mo8180b(this.f4818h, this.f4794a);
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo8137b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f4821k)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f4822l)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f4823m)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f4825o)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f4826p)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f4827q)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f4828r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f4824n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f4829s)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f4830t)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f4831u)) {
            hashSet.add("translationZ");
        }
        if (this.f4797d.size() > 0) {
            for (String str : this.f4797d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: c */
    public final void mo8138c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43331u);
        SparseIntArray sparseIntArray = C2121a.f4832a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C2121a.f4832a.get(index)) {
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
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f4815e = obtainStyledAttributes.getInteger(index, this.f4815e);
                    break;
                case 5:
                    this.f4816f = obtainStyledAttributes.getInt(index, this.f4816f);
                    break;
                case 6:
                    this.f4817g = obtainStyledAttributes.getFloat(index, this.f4817g);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.f4818h = obtainStyledAttributes.getFloat(index, this.f4818h);
                        break;
                    } else {
                        this.f4818h = obtainStyledAttributes.getDimension(index, this.f4818h);
                        break;
                    }
                case 8:
                    this.f4820j = obtainStyledAttributes.getInt(index, this.f4820j);
                    break;
                case 9:
                    this.f4821k = obtainStyledAttributes.getFloat(index, this.f4821k);
                    break;
                case 10:
                    this.f4822l = obtainStyledAttributes.getDimension(index, this.f4822l);
                    break;
                case 11:
                    this.f4823m = obtainStyledAttributes.getFloat(index, this.f4823m);
                    break;
                case 12:
                    this.f4825o = obtainStyledAttributes.getFloat(index, this.f4825o);
                    break;
                case 13:
                    this.f4826p = obtainStyledAttributes.getFloat(index, this.f4826p);
                    break;
                case 14:
                    this.f4824n = obtainStyledAttributes.getFloat(index, this.f4824n);
                    break;
                case 15:
                    this.f4827q = obtainStyledAttributes.getFloat(index, this.f4827q);
                    break;
                case 16:
                    this.f4828r = obtainStyledAttributes.getFloat(index, this.f4828r);
                    break;
                case 17:
                    this.f4829s = obtainStyledAttributes.getDimension(index, this.f4829s);
                    break;
                case 18:
                    this.f4830t = obtainStyledAttributes.getDimension(index, this.f4830t);
                    break;
                case 19:
                    this.f4831u = obtainStyledAttributes.getDimension(index, this.f4831u);
                    break;
                case 20:
                    this.f4819i = obtainStyledAttributes.getFloat(index, this.f4819i);
                    break;
                default:
                    StringBuilder h = C0072d.m201h("unused attribute 0x");
                    h.append(Integer.toHexString(index));
                    h.append("   ");
                    h.append(C2121a.f4832a.get(index));
                    Log.e("KeyCycle", h.toString());
                    break;
            }
        }
    }
}
