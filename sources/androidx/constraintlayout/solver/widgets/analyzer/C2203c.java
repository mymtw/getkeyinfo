package androidx.constraintlayout.solver.widgets.analyzer;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.c */
public final class C2203c extends WidgetRun {

    /* renamed from: k */
    public ArrayList<WidgetRun> f5219k = new ArrayList<>();

    /* renamed from: l */
    public int f5220l;

    public C2203c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        this.f5200f = i;
        ConstraintWidget constraintWidget3 = this.f5196b;
        ConstraintWidget q = constraintWidget3.mo8288q(i);
        while (true) {
            ConstraintWidget constraintWidget4 = q;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            }
            q = constraintWidget3.mo8288q(this.f5200f);
        }
        this.f5196b = constraintWidget2;
        ArrayList<WidgetRun> arrayList = this.f5219k;
        int i2 = this.f5200f;
        arrayList.add(i2 == 0 ? constraintWidget2.f5142d : i2 == 1 ? constraintWidget2.f5144e : null);
        ConstraintWidget p = constraintWidget2.mo8287p(this.f5200f);
        while (p != null) {
            ArrayList<WidgetRun> arrayList2 = this.f5219k;
            int i3 = this.f5200f;
            arrayList2.add(i3 == 0 ? p.f5142d : i3 == 1 ? p.f5144e : null);
            p = p.mo8287p(this.f5200f);
        }
        Iterator<WidgetRun> it = this.f5219k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i4 = this.f5200f;
            if (i4 == 0) {
                next.f5196b.f5138b = this;
            } else if (i4 == 1) {
                next.f5196b.f5140c = this;
            }
        }
        if ((this.f5200f == 0 && ((C2220d) this.f5196b.f5126Q).f5273t0) && this.f5219k.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.f5219k;
            this.f5196b = arrayList3.get(arrayList3.size() - 1).f5196b;
        }
        this.f5220l = this.f5200f == 0 ? this.f5196b.f5149g0 : this.f5196b.f5151h0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8301a(androidx.constraintlayout.solver.widgets.analyzer.C2204d r26) {
        /*
            r25 = this;
            r0 = r25
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            boolean r2 = r1.f5192j
            if (r2 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5203i
            boolean r3 = r2.f5192j
            if (r3 != 0) goto L_0x0010
            goto L_0x0418
        L_0x0010:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5126Q
            if (r3 == 0) goto L_0x001f
            boolean r5 = r3 instanceof androidx.constraintlayout.solver.widgets.C2220d
            if (r5 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.d r3 = (androidx.constraintlayout.solver.widgets.C2220d) r3
            boolean r3 = r3.f5273t0
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            int r2 = r2.f5189g
            int r1 = r1.f5189g
            int r2 = r2 - r1
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r1 = r0.f5219k
            int r1 = r1.size()
            r5 = 0
        L_0x002c:
            r6 = -1
            r7 = 8
            if (r5 >= r1) goto L_0x0042
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r8 = r0.f5219k
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r8.f5196b
            int r8 = r8.f5143d0
            if (r8 != r7) goto L_0x0043
            int r5 = r5 + 1
            goto L_0x002c
        L_0x0042:
            r5 = r6
        L_0x0043:
            int r8 = r1 + -1
            r9 = r8
        L_0x0046:
            if (r9 < 0) goto L_0x005a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.f5219k
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r10.f5196b
            int r10 = r10.f5143d0
            if (r10 != r7) goto L_0x0059
            int r9 = r9 + -1
            goto L_0x0046
        L_0x0059:
            r6 = r9
        L_0x005a:
            r9 = 0
        L_0x005b:
            r11 = 2
            if (r9 >= r11) goto L_0x00fa
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0065:
            if (r13 >= r1) goto L_0x00ec
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r0.f5219k
            java.lang.Object r4 = r4.get(r13)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r4.f5196b
            int r10 = r11.f5143d0
            if (r10 != r7) goto L_0x0077
            goto L_0x00e5
        L_0x0077:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0082
            if (r13 < r5) goto L_0x0082
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r4.f5202h
            int r10 = r10.f5188f
            int r14 = r14 + r10
        L_0x0082:
            androidx.constraintlayout.solver.widgets.analyzer.f r10 = r4.f5199e
            int r7 = r10.f5189g
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = r4.f5198d
            r19 = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 == r7) goto L_0x0090
            r7 = 1
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            if (r7 == 0) goto L_0x00af
            int r10 = r0.f5200f
            if (r10 != 0) goto L_0x00a0
            androidx.constraintlayout.solver.widgets.analyzer.k r12 = r11.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r12 = r12.f5199e
            boolean r12 = r12.f5192j
            if (r12 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r12 = 1
            if (r10 != r12) goto L_0x00ac
            androidx.constraintlayout.solver.widgets.analyzer.m r10 = r11.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r10 = r10.f5199e
            boolean r10 = r10.f5192j
            if (r10 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r20 = r7
            goto L_0x00c6
        L_0x00af:
            r20 = r7
            r12 = 1
            int r7 = r4.f5195a
            if (r7 != r12) goto L_0x00bd
            if (r9 != 0) goto L_0x00bd
            int r7 = r10.f5229m
            int r15 = r15 + 1
            goto L_0x00c3
        L_0x00bd:
            boolean r7 = r10.f5192j
            if (r7 == 0) goto L_0x00c6
            r7 = r19
        L_0x00c3:
            r20 = 1
            goto L_0x00c8
        L_0x00c6:
            r7 = r19
        L_0x00c8:
            if (r20 != 0) goto L_0x00da
            int r15 = r15 + 1
            float[] r7 = r11.f5153i0
            int r10 = r0.f5200f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00db
            float r17 = r17 + r7
            goto L_0x00db
        L_0x00da:
            int r14 = r14 + r7
        L_0x00db:
            if (r13 >= r8) goto L_0x00e5
            if (r13 >= r6) goto L_0x00e5
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.f5203i
            int r4 = r4.f5188f
            int r4 = -r4
            int r14 = r14 + r4
        L_0x00e5:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0065
        L_0x00ec:
            if (r14 < r2) goto L_0x00f7
            if (r15 != 0) goto L_0x00f1
            goto L_0x00f7
        L_0x00f1:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x005b
        L_0x00f7:
            r4 = r16
            goto L_0x00ff
        L_0x00fa:
            r4 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x00ff:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.f5202h
            int r7 = r7.f5189g
            if (r3 == 0) goto L_0x0109
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.f5203i
            int r7 = r7.f5189g
        L_0x0109:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x0120
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0119
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x0120
        L_0x0119:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x0120:
            if (r15 <= 0) goto L_0x0222
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x012c:
            if (r12 >= r1) goto L_0x01d6
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.f5219k
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r9.f5196b
            r20 = r14
            int r14 = r11.f5143d0
            r21 = r7
            r7 = 8
            if (r14 != r7) goto L_0x0146
            goto L_0x01be
        L_0x0146:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r9.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r14) goto L_0x01be
            androidx.constraintlayout.solver.widgets.analyzer.f r7 = r9.f5199e
            boolean r14 = r7.f5192j
            if (r14 != 0) goto L_0x01be
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0167
            float[] r14 = r11.f5153i0
            r22 = r3
            int r3 = r0.f5200f
            r3 = r14[r3]
            float r3 = r3 * r10
            float r3 = r3 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r14
            int r3 = (int) r3
            goto L_0x016b
        L_0x0167:
            r22 = r3
            r3 = r19
        L_0x016b:
            int r14 = r0.f5200f
            if (r14 != 0) goto L_0x0194
            int r14 = r11.f5167q
            int r11 = r11.f5166p
            r23 = r10
            int r10 = r9.f5195a
            r24 = r4
            r4 = 1
            if (r10 != r4) goto L_0x0183
            int r4 = r7.f5229m
            int r4 = java.lang.Math.min(r3, r4)
            goto L_0x0184
        L_0x0183:
            r4 = r3
        L_0x0184:
            int r4 = java.lang.Math.max(r11, r4)
            if (r14 <= 0) goto L_0x018e
            int r4 = java.lang.Math.min(r14, r4)
        L_0x018e:
            if (r4 == r3) goto L_0x01b8
            int r13 = r13 + 1
            r3 = r4
            goto L_0x01b8
        L_0x0194:
            r24 = r4
            r23 = r10
            int r4 = r11.f5170t
            int r10 = r11.f5169s
            int r11 = r9.f5195a
            r14 = 1
            if (r11 != r14) goto L_0x01a8
            int r7 = r7.f5229m
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x01a9
        L_0x01a8:
            r7 = r3
        L_0x01a9:
            int r7 = java.lang.Math.max(r10, r7)
            if (r4 <= 0) goto L_0x01b3
            int r7 = java.lang.Math.min(r4, r7)
        L_0x01b3:
            if (r7 == r3) goto L_0x01b8
            int r13 = r13 + 1
            r3 = r7
        L_0x01b8:
            androidx.constraintlayout.solver.widgets.analyzer.f r4 = r9.f5199e
            r4.mo8304d(r3)
            goto L_0x01c4
        L_0x01be:
            r22 = r3
            r24 = r4
            r23 = r10
        L_0x01c4:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r3 = r22
            r10 = r23
            r4 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x012c
        L_0x01d6:
            r22 = r3
            r24 = r4
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0213
            int r15 = r15 - r13
            r3 = 0
            r4 = 0
        L_0x01e3:
            if (r3 >= r1) goto L_0x0211
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r7 = r0.f5219k
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r7.f5196b
            int r9 = r9.f5143d0
            r10 = 8
            if (r9 != r10) goto L_0x01f6
            goto L_0x020e
        L_0x01f6:
            if (r3 <= 0) goto L_0x01ff
            if (r3 < r5) goto L_0x01ff
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.f5202h
            int r9 = r9.f5188f
            int r4 = r4 + r9
        L_0x01ff:
            androidx.constraintlayout.solver.widgets.analyzer.f r9 = r7.f5199e
            int r9 = r9.f5189g
            int r4 = r4 + r9
            if (r3 >= r8) goto L_0x020e
            if (r3 >= r6) goto L_0x020e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.f5203i
            int r7 = r7.f5188f
            int r7 = -r7
            int r4 = r4 + r7
        L_0x020e:
            int r3 = r3 + 1
            goto L_0x01e3
        L_0x0211:
            r14 = r4
            goto L_0x0215
        L_0x0213:
            r14 = r20
        L_0x0215:
            int r3 = r0.f5220l
            r4 = 2
            if (r3 != r4) goto L_0x0220
            if (r13 != 0) goto L_0x0220
            r3 = 0
            r0.f5220l = r3
            goto L_0x022c
        L_0x0220:
            r3 = 0
            goto L_0x022c
        L_0x0222:
            r22 = r3
            r24 = r4
            r21 = r7
            r20 = r14
            r3 = 0
            r4 = 2
        L_0x022c:
            if (r14 <= r2) goto L_0x0230
            r0.f5220l = r4
        L_0x0230:
            if (r24 <= 0) goto L_0x0238
            if (r15 != 0) goto L_0x0238
            if (r5 != r6) goto L_0x0238
            r0.f5220l = r4
        L_0x0238:
            int r4 = r0.f5220l
            r7 = 1
            if (r4 != r7) goto L_0x02da
            r9 = r24
            if (r9 <= r7) goto L_0x0246
            int r2 = r2 - r14
            int r4 = r9 + -1
            int r2 = r2 / r4
            goto L_0x024d
        L_0x0246:
            if (r9 != r7) goto L_0x024c
            int r2 = r2 - r14
            r4 = 2
            int r2 = r2 / r4
            goto L_0x024d
        L_0x024c:
            r2 = r3
        L_0x024d:
            if (r15 <= 0) goto L_0x0250
            r2 = r3
        L_0x0250:
            r4 = r3
            r7 = r21
        L_0x0253:
            if (r4 >= r1) goto L_0x0418
            if (r22 == 0) goto L_0x025c
            int r3 = r4 + 1
            int r3 = r1 - r3
            goto L_0x025d
        L_0x025c:
            r3 = r4
        L_0x025d:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.f5219k
            java.lang.Object r3 = r9.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r3.f5196b
            int r9 = r9.f5143d0
            r10 = 8
            if (r9 != r10) goto L_0x0278
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            r9.mo8304d(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5203i
            r3.mo8304d(r7)
            goto L_0x02d6
        L_0x0278:
            if (r4 <= 0) goto L_0x027f
            if (r22 == 0) goto L_0x027e
            int r7 = r7 - r2
            goto L_0x027f
        L_0x027e:
            int r7 = r7 + r2
        L_0x027f:
            if (r4 <= 0) goto L_0x0290
            if (r4 < r5) goto L_0x0290
            if (r22 == 0) goto L_0x028b
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            int r9 = r9.f5188f
            int r7 = r7 - r9
            goto L_0x0290
        L_0x028b:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            int r9 = r9.f5188f
            int r7 = r7 + r9
        L_0x0290:
            if (r22 == 0) goto L_0x0298
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5203i
            r9.mo8304d(r7)
            goto L_0x029d
        L_0x0298:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            r9.mo8304d(r7)
        L_0x029d:
            androidx.constraintlayout.solver.widgets.analyzer.f r9 = r3.f5199e
            int r10 = r9.f5189g
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r3.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02ae
            int r11 = r3.f5195a
            r12 = 1
            if (r11 != r12) goto L_0x02ae
            int r10 = r9.f5229m
        L_0x02ae:
            if (r22 == 0) goto L_0x02b2
            int r7 = r7 - r10
            goto L_0x02b3
        L_0x02b2:
            int r7 = r7 + r10
        L_0x02b3:
            if (r22 == 0) goto L_0x02bb
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            r9.mo8304d(r7)
            goto L_0x02c0
        L_0x02bb:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5203i
            r9.mo8304d(r7)
        L_0x02c0:
            r9 = 1
            r3.f5201g = r9
            if (r4 >= r8) goto L_0x02d6
            if (r4 >= r6) goto L_0x02d6
            if (r22 == 0) goto L_0x02d0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5203i
            int r3 = r3.f5188f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x02d6
        L_0x02d0:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5203i
            int r3 = r3.f5188f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x02d6:
            int r4 = r4 + 1
            goto L_0x0253
        L_0x02da:
            r9 = r24
            if (r4 != 0) goto L_0x036f
            int r2 = r2 - r14
            r4 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02e6
            r2 = r3
        L_0x02e6:
            r4 = r3
            r7 = r21
        L_0x02e9:
            if (r4 >= r1) goto L_0x0418
            if (r22 == 0) goto L_0x02f2
            int r3 = r4 + 1
            int r3 = r1 - r3
            goto L_0x02f3
        L_0x02f2:
            r3 = r4
        L_0x02f3:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.f5219k
            java.lang.Object r3 = r9.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r3.f5196b
            int r9 = r9.f5143d0
            r10 = 8
            if (r9 != r10) goto L_0x030e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            r9.mo8304d(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5203i
            r3.mo8304d(r7)
            goto L_0x036b
        L_0x030e:
            if (r22 == 0) goto L_0x0312
            int r7 = r7 - r2
            goto L_0x0313
        L_0x0312:
            int r7 = r7 + r2
        L_0x0313:
            if (r4 <= 0) goto L_0x0324
            if (r4 < r5) goto L_0x0324
            if (r22 == 0) goto L_0x031f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            int r9 = r9.f5188f
            int r7 = r7 - r9
            goto L_0x0324
        L_0x031f:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            int r9 = r9.f5188f
            int r7 = r7 + r9
        L_0x0324:
            if (r22 == 0) goto L_0x032c
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5203i
            r9.mo8304d(r7)
            goto L_0x0331
        L_0x032c:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            r9.mo8304d(r7)
        L_0x0331:
            androidx.constraintlayout.solver.widgets.analyzer.f r9 = r3.f5199e
            int r10 = r9.f5189g
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r3.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0346
            int r11 = r3.f5195a
            r12 = 1
            if (r11 != r12) goto L_0x0346
            int r9 = r9.f5229m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0346:
            if (r22 == 0) goto L_0x034a
            int r7 = r7 - r10
            goto L_0x034b
        L_0x034a:
            int r7 = r7 + r10
        L_0x034b:
            if (r22 == 0) goto L_0x0353
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5202h
            r9.mo8304d(r7)
            goto L_0x0358
        L_0x0353:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r3.f5203i
            r9.mo8304d(r7)
        L_0x0358:
            if (r4 >= r8) goto L_0x036b
            if (r4 >= r6) goto L_0x036b
            if (r22 == 0) goto L_0x0365
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5203i
            int r3 = r3.f5188f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x036b
        L_0x0365:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5203i
            int r3 = r3.f5188f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x036b:
            int r4 = r4 + 1
            goto L_0x02e9
        L_0x036f:
            r7 = 2
            if (r4 != r7) goto L_0x0418
            int r4 = r0.f5200f
            if (r4 != 0) goto L_0x037b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.f5196b
            float r4 = r4.f5137a0
            goto L_0x037f
        L_0x037b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.f5196b
            float r4 = r4.f5139b0
        L_0x037f:
            if (r22 == 0) goto L_0x0385
            r7 = 1065353216(0x3f800000, float:1.0)
            float r4 = r7 - r4
        L_0x0385:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0390
            if (r15 <= 0) goto L_0x0391
        L_0x0390:
            r2 = r3
        L_0x0391:
            if (r22 == 0) goto L_0x0396
            int r7 = r21 - r2
            goto L_0x0398
        L_0x0396:
            int r7 = r21 + r2
        L_0x0398:
            r4 = r3
        L_0x0399:
            if (r4 >= r1) goto L_0x0418
            if (r22 == 0) goto L_0x03a2
            int r2 = r4 + 1
            int r2 = r1 - r2
            goto L_0x03a3
        L_0x03a2:
            r2 = r4
        L_0x03a3:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r3 = r0.f5219k
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r2.f5196b
            int r3 = r3.f5143d0
            r9 = 8
            if (r3 != r9) goto L_0x03bf
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.f5202h
            r3.mo8304d(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5203i
            r2.mo8304d(r7)
            r12 = 1
            goto L_0x0415
        L_0x03bf:
            if (r4 <= 0) goto L_0x03d0
            if (r4 < r5) goto L_0x03d0
            if (r22 == 0) goto L_0x03cb
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.f5202h
            int r3 = r3.f5188f
            int r7 = r7 - r3
            goto L_0x03d0
        L_0x03cb:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.f5202h
            int r3 = r3.f5188f
            int r7 = r7 + r3
        L_0x03d0:
            if (r22 == 0) goto L_0x03d8
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.f5203i
            r3.mo8304d(r7)
            goto L_0x03dd
        L_0x03d8:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.f5202h
            r3.mo8304d(r7)
        L_0x03dd:
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r2.f5199e
            int r10 = r3.f5189g
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r2.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03ef
            int r11 = r2.f5195a
            r12 = 1
            if (r11 != r12) goto L_0x03f0
            int r10 = r3.f5229m
            goto L_0x03f0
        L_0x03ef:
            r12 = 1
        L_0x03f0:
            if (r22 == 0) goto L_0x03f4
            int r7 = r7 - r10
            goto L_0x03f5
        L_0x03f4:
            int r7 = r7 + r10
        L_0x03f5:
            if (r22 == 0) goto L_0x03fd
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.f5202h
            r3.mo8304d(r7)
            goto L_0x0402
        L_0x03fd:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.f5203i
            r3.mo8304d(r7)
        L_0x0402:
            if (r4 >= r8) goto L_0x0415
            if (r4 >= r6) goto L_0x0415
            if (r22 == 0) goto L_0x040f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5203i
            int r2 = r2.f5188f
            int r2 = -r2
            int r7 = r7 - r2
            goto L_0x0415
        L_0x040f:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5203i
            int r2 = r2.f5188f
            int r2 = -r2
            int r7 = r7 + r2
        L_0x0415:
            int r4 = r4 + 1
            goto L_0x0399
        L_0x0418:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2203c.mo8301a(androidx.constraintlayout.solver.widgets.analyzer.d):void");
    }

    /* renamed from: d */
    public final void mo8307d() {
        Iterator<WidgetRun> it = this.f5219k.iterator();
        while (it.hasNext()) {
            it.next().mo8307d();
        }
        int size = this.f5219k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.f5219k.get(0).f5196b;
            ConstraintWidget constraintWidget2 = this.f5219k.get(size - 1).f5196b;
            if (this.f5200f == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.f5114E;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.f5116G;
                DependencyNode i = WidgetRun.m4805i(constraintAnchor, 0);
                int e = constraintAnchor.mo8252e();
                ConstraintWidget m = mo8317m();
                if (m != null) {
                    e = m.f5114E.mo8252e();
                }
                if (i != null) {
                    WidgetRun.m4803b(this.f5202h, i, e);
                }
                DependencyNode i2 = WidgetRun.m4805i(constraintAnchor2, 0);
                int e2 = constraintAnchor2.mo8252e();
                ConstraintWidget n = mo8318n();
                if (n != null) {
                    e2 = n.f5116G.mo8252e();
                }
                if (i2 != null) {
                    WidgetRun.m4803b(this.f5203i, i2, -e2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.f5115F;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.f5117H;
                DependencyNode i3 = WidgetRun.m4805i(constraintAnchor3, 1);
                int e3 = constraintAnchor3.mo8252e();
                ConstraintWidget m2 = mo8317m();
                if (m2 != null) {
                    e3 = m2.f5115F.mo8252e();
                }
                if (i3 != null) {
                    WidgetRun.m4803b(this.f5202h, i3, e3);
                }
                DependencyNode i4 = WidgetRun.m4805i(constraintAnchor4, 1);
                int e4 = constraintAnchor4.mo8252e();
                ConstraintWidget n2 = mo8318n();
                if (n2 != null) {
                    e4 = n2.f5117H.mo8252e();
                }
                if (i4 != null) {
                    WidgetRun.m4803b(this.f5203i, i4, -e4);
                }
            }
            this.f5202h.f5183a = this;
            this.f5203i.f5183a = this;
        }
    }

    /* renamed from: e */
    public final void mo8308e() {
        for (int i = 0; i < this.f5219k.size(); i++) {
            this.f5219k.get(i).mo8308e();
        }
    }

    /* renamed from: f */
    public final void mo8309f() {
        this.f5197c = null;
        Iterator<WidgetRun> it = this.f5219k.iterator();
        while (it.hasNext()) {
            it.next().mo8309f();
        }
    }

    /* renamed from: j */
    public final long mo8311j() {
        int size = this.f5219k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.f5219k.get(i);
            j = ((long) widgetRun.f5203i.f5188f) + widgetRun.mo8311j() + j + ((long) widgetRun.f5202h.f5188f);
        }
        return j;
    }

    /* renamed from: k */
    public final boolean mo8312k() {
        int size = this.f5219k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f5219k.get(i).mo8312k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final ConstraintWidget mo8317m() {
        for (int i = 0; i < this.f5219k.size(); i++) {
            ConstraintWidget constraintWidget = this.f5219k.get(i).f5196b;
            if (constraintWidget.f5143d0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final ConstraintWidget mo8318n() {
        for (int size = this.f5219k.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.f5219k.get(size).f5196b;
            if (constraintWidget.f5143d0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ChainRun ");
        h.append(this.f5200f == 0 ? "horizontal : " : "vertical : ");
        String sb = h.toString();
        Iterator<WidgetRun> it = this.f5219k.iterator();
        while (it.hasNext()) {
            String i = C0326j.m864i(sb, "<");
            sb = C0326j.m864i(i + it.next(), "> ");
        }
        return sb;
    }
}
