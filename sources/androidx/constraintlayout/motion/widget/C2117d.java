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

/* renamed from: androidx.constraintlayout.motion.widget.d */
public final class C2117d extends C2116c {

    /* renamed from: e */
    public int f4798e = -1;

    /* renamed from: f */
    public float f4799f = Float.NaN;

    /* renamed from: g */
    public float f4800g = Float.NaN;

    /* renamed from: h */
    public float f4801h = Float.NaN;

    /* renamed from: i */
    public float f4802i = Float.NaN;

    /* renamed from: j */
    public float f4803j = Float.NaN;

    /* renamed from: k */
    public float f4804k = Float.NaN;

    /* renamed from: l */
    public float f4805l = Float.NaN;

    /* renamed from: m */
    public float f4806m = Float.NaN;

    /* renamed from: n */
    public float f4807n = Float.NaN;

    /* renamed from: o */
    public float f4808o = Float.NaN;

    /* renamed from: p */
    public float f4809p = Float.NaN;

    /* renamed from: q */
    public float f4810q = Float.NaN;

    /* renamed from: r */
    public float f4811r = Float.NaN;

    /* renamed from: s */
    public float f4812s = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    public static class C2118a {

        /* renamed from: a */
        public static SparseIntArray f4813a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4813a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f4813a.append(11, 2);
            f4813a.append(7, 4);
            f4813a.append(8, 5);
            f4813a.append(9, 6);
            f4813a.append(1, 19);
            f4813a.append(2, 20);
            f4813a.append(5, 7);
            f4813a.append(17, 8);
            f4813a.append(16, 9);
            f4813a.append(15, 10);
            f4813a.append(13, 12);
            f4813a.append(12, 13);
            f4813a.append(6, 14);
            f4813a.append(3, 15);
            f4813a.append(4, 16);
            f4813a.append(10, 17);
            f4813a.append(14, 18);
        }
    }

    public C2117d() {
        this.f4797d = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8136a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C2154r> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01df
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.motion.widget.r r2 = (androidx.constraintlayout.motion.widget.C2154r) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003b
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.f4797d
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.widget.r$b r2 = (androidx.constraintlayout.motion.widget.C2154r.C2156b) r2
            int r3 = r6.f4794a
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f5008f
            r2.append(r3, r1)
            goto L_0x0008
        L_0x003b:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e1;
                case -1249320805: goto L_0x00d5;
                case -1225497657: goto L_0x00c9;
                case -1225497656: goto L_0x00bd;
                case -1225497655: goto L_0x00b2;
                case -1001078227: goto L_0x00a7;
                case -908189618: goto L_0x009c;
                case -908189617: goto L_0x0093;
                case -760884510: goto L_0x0087;
                case -760884509: goto L_0x007a;
                case -40300674: goto L_0x006d;
                case -4379043: goto L_0x0060;
                case 37232917: goto L_0x0053;
                case 92909918: goto L_0x0046;
                default: goto L_0x0043;
            }
        L_0x0043:
            r4 = r3
            goto L_0x00ec
        L_0x0046:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x004f
            goto L_0x0043
        L_0x004f:
            r4 = 13
            goto L_0x00ec
        L_0x0053:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005c
            goto L_0x0043
        L_0x005c:
            r4 = 12
            goto L_0x00ec
        L_0x0060:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0069
            goto L_0x0043
        L_0x0069:
            r4 = 11
            goto L_0x00ec
        L_0x006d:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0076
            goto L_0x0043
        L_0x0076:
            r4 = 10
            goto L_0x00ec
        L_0x007a:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0083
            goto L_0x0043
        L_0x0083:
            r4 = 9
            goto L_0x00ec
        L_0x0087:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0090
            goto L_0x0043
        L_0x0090:
            r4 = 8
            goto L_0x00ec
        L_0x0093:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00ec
            goto L_0x0043
        L_0x009c:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a5
            goto L_0x0043
        L_0x00a5:
            r4 = 6
            goto L_0x00ec
        L_0x00a7:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b0
            goto L_0x0043
        L_0x00b0:
            r4 = 5
            goto L_0x00ec
        L_0x00b2:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00bb
            goto L_0x0043
        L_0x00bb:
            r4 = 4
            goto L_0x00ec
        L_0x00bd:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00c7
            goto L_0x0043
        L_0x00c7:
            r4 = 3
            goto L_0x00ec
        L_0x00c9:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d3
            goto L_0x0043
        L_0x00d3:
            r4 = 2
            goto L_0x00ec
        L_0x00d5:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00df
            goto L_0x0043
        L_0x00df:
            r4 = 1
            goto L_0x00ec
        L_0x00e1:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00eb
            goto L_0x0043
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            switch(r4) {
                case 0: goto L_0x01ce;
                case 1: goto L_0x01bd;
                case 2: goto L_0x01ac;
                case 3: goto L_0x019b;
                case 4: goto L_0x018a;
                case 5: goto L_0x0179;
                case 6: goto L_0x0168;
                case 7: goto L_0x0157;
                case 8: goto L_0x0146;
                case 9: goto L_0x0135;
                case 10: goto L_0x0124;
                case 11: goto L_0x0113;
                case 12: goto L_0x0102;
                case 13: goto L_0x00f1;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            goto L_0x0008
        L_0x00f1:
            float r1 = r6.f4799f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4799f
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0102:
            float r1 = r6.f4806m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4806m
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0113:
            float r1 = r6.f4800g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4800g
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0124:
            float r1 = r6.f4801h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4801h
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0135:
            float r1 = r6.f4803j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4805l
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0146:
            float r1 = r6.f4802i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4804k
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0157:
            float r1 = r6.f4808o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4808o
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0168:
            float r1 = r6.f4807n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4807n
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x0179:
            float r1 = r6.f4812s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4812s
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x018a:
            float r1 = r6.f4811r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4811r
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x019b:
            float r1 = r6.f4810q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4810q
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x01ac:
            float r1 = r6.f4809p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4809p
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x01bd:
            float r1 = r6.f4803j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4803j
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x01ce:
            float r1 = r6.f4802i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f4794a
            float r3 = r6.f4802i
            r2.mo8180b(r3, r1)
            goto L_0x0008
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C2117d.mo8136a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public final void mo8137b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f4799f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f4800g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f4801h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f4802i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f4803j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f4804k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f4805l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f4809p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f4810q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f4811r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f4806m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f4807n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f4808o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f4812s)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43330t);
        SparseIntArray sparseIntArray = C2118a.f4813a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C2118a.f4813a.get(index)) {
                case 1:
                    this.f4799f = obtainStyledAttributes.getFloat(index, this.f4799f);
                    break;
                case 2:
                    this.f4800g = obtainStyledAttributes.getDimension(index, this.f4800g);
                    break;
                case 4:
                    this.f4801h = obtainStyledAttributes.getFloat(index, this.f4801h);
                    break;
                case 5:
                    this.f4802i = obtainStyledAttributes.getFloat(index, this.f4802i);
                    break;
                case 6:
                    this.f4803j = obtainStyledAttributes.getFloat(index, this.f4803j);
                    break;
                case 7:
                    this.f4807n = obtainStyledAttributes.getFloat(index, this.f4807n);
                    break;
                case 8:
                    this.f4806m = obtainStyledAttributes.getFloat(index, this.f4806m);
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
                    this.f4798e = obtainStyledAttributes.getInteger(index, this.f4798e);
                    break;
                case 14:
                    this.f4808o = obtainStyledAttributes.getFloat(index, this.f4808o);
                    break;
                case 15:
                    this.f4809p = obtainStyledAttributes.getDimension(index, this.f4809p);
                    break;
                case 16:
                    this.f4810q = obtainStyledAttributes.getDimension(index, this.f4810q);
                    break;
                case 17:
                    this.f4811r = obtainStyledAttributes.getDimension(index, this.f4811r);
                    break;
                case 18:
                    this.f4812s = obtainStyledAttributes.getFloat(index, this.f4812s);
                    break;
                case 19:
                    this.f4804k = obtainStyledAttributes.getDimension(index, this.f4804k);
                    break;
                case 20:
                    this.f4805l = obtainStyledAttributes.getDimension(index, this.f4805l);
                    break;
                default:
                    StringBuilder h = C0072d.m201h("unused attribute 0x");
                    h.append(Integer.toHexString(index));
                    h.append("   ");
                    h.append(C2118a.f4813a.get(index));
                    Log.e("KeyAttribute", h.toString());
                    break;
            }
        }
    }

    /* renamed from: d */
    public final void mo8139d(HashMap<String, Integer> hashMap) {
        if (this.f4798e != -1) {
            if (!Float.isNaN(this.f4799f)) {
                hashMap.put("alpha", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4800g)) {
                hashMap.put("elevation", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4801h)) {
                hashMap.put("rotation", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4802i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4803j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4804k)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4805l)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4809p)) {
                hashMap.put("translationX", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4810q)) {
                hashMap.put("translationY", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4811r)) {
                hashMap.put("translationZ", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4806m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4807n)) {
                hashMap.put("scaleX", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4808o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f4798e));
            }
            if (!Float.isNaN(this.f4812s)) {
                hashMap.put("progress", Integer.valueOf(this.f4798e));
            }
            if (this.f4797d.size() > 0) {
                for (String i : this.f4797d.keySet()) {
                    hashMap.put(C0326j.m864i("CUSTOM,", i), Integer.valueOf(this.f4798e));
                }
            }
        }
    }
}
