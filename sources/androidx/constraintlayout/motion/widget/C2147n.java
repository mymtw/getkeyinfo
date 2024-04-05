package androidx.constraintlayout.motion.widget;

import android.util.Log;
import androidx.constraintlayout.motion.widget.C2154r;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.apache.commons.lang3.CharUtils;
import p184n0.C7363c;

/* renamed from: androidx.constraintlayout.motion.widget.n */
public final class C2147n implements Comparable<C2147n> {

    /* renamed from: b */
    public float f4904b = 1.0f;

    /* renamed from: c */
    public int f4905c = 0;

    /* renamed from: d */
    public int f4906d;

    /* renamed from: e */
    public float f4907e = 0.0f;

    /* renamed from: f */
    public float f4908f = 0.0f;

    /* renamed from: g */
    public float f4909g = 0.0f;

    /* renamed from: h */
    public float f4910h = 0.0f;

    /* renamed from: i */
    public float f4911i = 1.0f;

    /* renamed from: j */
    public float f4912j = 1.0f;

    /* renamed from: k */
    public float f4913k = Float.NaN;

    /* renamed from: l */
    public float f4914l = Float.NaN;

    /* renamed from: m */
    public float f4915m = 0.0f;

    /* renamed from: n */
    public float f4916n = 0.0f;

    /* renamed from: o */
    public float f4917o = 0.0f;

    /* renamed from: p */
    public float f4918p = Float.NaN;

    /* renamed from: q */
    public float f4919q = Float.NaN;

    /* renamed from: r */
    public LinkedHashMap<String, ConstraintAttribute> f4920r = new LinkedHashMap<>();

    /* renamed from: c */
    public static boolean m4611c(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: a */
    public final void mo8149a(HashMap<String, C2154r> hashMap, int i) {
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
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = CharUtils.f44393CR;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f4909g)) {
                        f2 = this.f4909g;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 1:
                    if (!Float.isNaN(this.f4910h)) {
                        f2 = this.f4910h;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 2:
                    if (!Float.isNaN(this.f4915m)) {
                        f2 = this.f4915m;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 3:
                    if (!Float.isNaN(this.f4916n)) {
                        f2 = this.f4916n;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 4:
                    if (!Float.isNaN(this.f4917o)) {
                        f2 = this.f4917o;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 5:
                    if (!Float.isNaN(this.f4919q)) {
                        f2 = this.f4919q;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 6:
                    if (!Float.isNaN(this.f4911i)) {
                        f = this.f4911i;
                    }
                    rVar.mo8180b(f, i);
                    break;
                case 7:
                    if (!Float.isNaN(this.f4912j)) {
                        f = this.f4912j;
                    }
                    rVar.mo8180b(f, i);
                    break;
                case 8:
                    if (!Float.isNaN(this.f4913k)) {
                        f2 = this.f4913k;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 9:
                    if (!Float.isNaN(this.f4914l)) {
                        f2 = this.f4914l;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 10:
                    if (!Float.isNaN(this.f4908f)) {
                        f2 = this.f4908f;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 11:
                    if (!Float.isNaN(this.f4907e)) {
                        f2 = this.f4907e;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 12:
                    if (!Float.isNaN(this.f4918p)) {
                        f2 = this.f4918p;
                    }
                    rVar.mo8180b(f2, i);
                    break;
                case 13:
                    if (!Float.isNaN(this.f4904b)) {
                        f = this.f4904b;
                    }
                    rVar.mo8180b(f, i);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        Log.e("MotionPaths", "UNKNOWN spline " + next);
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f4920r.containsKey(str)) {
                            Log.e("MotionPaths", "UNKNOWN customName " + str);
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.f4920r.get(str);
                            if (!(rVar instanceof C2154r.C2156b)) {
                                Log.e("MotionPaths", next + " splineSet not a CustomSet frame = " + i + ", value" + constraintAttribute.mo8402b() + rVar);
                                break;
                            } else {
                                ((C2154r.C2156b) rVar).f5008f.append(i, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    public final int compareTo(Object obj) {
        ((C2147n) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* renamed from: e */
    public final void mo8151e(ConstraintWidget constraintWidget, C2236a aVar, int i) {
        constraintWidget.mo8290s();
        constraintWidget.mo8291t();
        C2236a.C2237a j = aVar.mo8490j(i);
        C2236a.C2240d dVar = j.f5377b;
        int i2 = dVar.f5455c;
        this.f4905c = i2;
        int i3 = dVar.f5454b;
        this.f4906d = i3;
        this.f4904b = (i3 == 0 || i2 != 0) ? dVar.f5456d : 0.0f;
        C2236a.C2241e eVar = j.f5380e;
        boolean z = eVar.f5470l;
        this.f4907e = eVar.f5471m;
        this.f4908f = eVar.f5460b;
        this.f4909g = eVar.f5461c;
        this.f4910h = eVar.f5462d;
        this.f4911i = eVar.f5463e;
        this.f4912j = eVar.f5464f;
        this.f4913k = eVar.f5465g;
        this.f4914l = eVar.f5466h;
        this.f4915m = eVar.f5467i;
        this.f4916n = eVar.f5468j;
        this.f4917o = eVar.f5469k;
        C7363c.m14180c(j.f5378c.f5448c);
        this.f4918p = j.f5378c.f5452g;
        this.f4919q = j.f5377b.f5457e;
        for (String next : j.f5381f.keySet()) {
            ConstraintAttribute constraintAttribute = j.f5381f.get(next);
            if (constraintAttribute.f5354b != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.f4920r.put(next, constraintAttribute);
            }
        }
    }
}
