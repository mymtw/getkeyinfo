package com.google.android.exoplayer2.p526ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.p526ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14049b0;
import p636oi.C18296a;
import p726zi.C18906a;
import p726zi.C18928n;
import p726zi.C18931q;

/* renamed from: com.google.android.exoplayer2.ui.d */
public final class C14422d extends FrameLayout implements SubtitleView.C14411a {

    /* renamed from: b */
    public final C14415a f32465b;

    /* renamed from: c */
    public final C18931q f32466c;

    /* renamed from: d */
    public List<C18296a> f32467d = Collections.emptyList();

    /* renamed from: e */
    public C18906a f32468e = C18906a.f42117g;

    /* renamed from: f */
    public float f32469f = 0.0533f;

    /* renamed from: g */
    public int f32470g = 0;

    /* renamed from: h */
    public float f32471h = 0.08f;

    /* renamed from: com.google.android.exoplayer2.ui.d$a */
    public static /* synthetic */ class C14423a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32472a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32472a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32472a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32472a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p526ui.C14422d.C14423a.<clinit>():void");
        }
    }

    public C14422d(Context context) {
        super(context, (AttributeSet) null);
        C14415a aVar = new C14415a(context, (AttributeSet) null);
        this.f32465b = aVar;
        C18931q qVar = new C18931q(context);
        this.f32466c = qVar;
        qVar.setBackgroundColor(0);
        addView(aVar);
        addView(qVar);
    }

    /* renamed from: a */
    public final void mo48149a(List<C18296a> list, C18906a aVar, float f, int i, float f2) {
        this.f32468e = aVar;
        this.f32469f = f;
        this.f32470g = i;
        this.f32471h = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C18296a aVar2 = list.get(i2);
            if (aVar2.f40150d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f32467d.isEmpty() || !arrayList2.isEmpty()) {
            this.f32467d = arrayList2;
            mo48161c();
        }
        this.f32465b.mo48149a(arrayList, aVar, f, i, f2);
        invalidate();
    }

    /* renamed from: b */
    public final String mo48160b(float f, int i) {
        float b = C18928n.m32024b(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (b == -3.4028235E38f) {
            return "unset";
        }
        return C14049b0.m21640m("%.2fpx", Float.valueOf(b / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0498, code lost:
        if (((android.text.style.TypefaceSpan) r9).getFamily() != null) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e5, code lost:
        if (r4 != 0) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e8, code lost:
        if (r4 != 0) goto L_0x01ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x051f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48161c() {
        /*
            r42 = this;
            r0 = r42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            zi.a r4 = r0.f32468e
            int r4 = r4.f42118a
            java.lang.String r4 = p568fn.C17782b.m29881q0(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f32470g
            float r6 = r0.f32469f
            java.lang.String r4 = r0.mo48160b(r6, r4)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            zi.a r4 = r0.f32468e
            int r8 = r4.f42121d
            r9 = 3
            java.lang.String r10 = "unset"
            if (r8 == r6) goto L_0x006e
            if (r8 == r7) goto L_0x005d
            if (r8 == r9) goto L_0x004c
            if (r8 == r2) goto L_0x003b
            r2 = r10
            goto L_0x007e
        L_0x003b:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f42122e
            java.lang.String r4 = p568fn.C17782b.m29881q0(r4)
            r2[r5] = r4
            java.lang.String r4 = "-0.05em -0.05em 0.15em %s"
            java.lang.String r2 = p513bj.C14049b0.m21640m(r4, r2)
            goto L_0x007e
        L_0x004c:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f42122e
            java.lang.String r4 = p568fn.C17782b.m29881q0(r4)
            r2[r5] = r4
            java.lang.String r4 = "0.06em 0.08em 0.15em %s"
            java.lang.String r2 = p513bj.C14049b0.m21640m(r4, r2)
            goto L_0x007e
        L_0x005d:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f42122e
            java.lang.String r4 = p568fn.C17782b.m29881q0(r4)
            r2[r5] = r4
            java.lang.String r4 = "0.1em 0.12em 0.15em %s"
            java.lang.String r2 = p513bj.C14049b0.m21640m(r4, r2)
            goto L_0x007e
        L_0x006e:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f42122e
            java.lang.String r4 = p568fn.C17782b.m29881q0(r4)
            r2[r5] = r4
            java.lang.String r4 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r2 = p513bj.C14049b0.m21640m(r4, r2)
        L_0x007e:
            r3[r9] = r2
            java.lang.String r2 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r2 = p513bj.C14049b0.m21640m(r2, r3)
            r1.append(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "default_bg"
            java.lang.String r4 = p568fn.C17782b.m29849O(r3)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            zi.a r9 = r0.f32468e
            int r9 = r9.f42119b
            java.lang.String r9 = p568fn.C17782b.m29881q0(r9)
            r8[r5] = r9
            java.lang.String r9 = "background-color:%s;"
            java.lang.String r8 = p513bj.C14049b0.m21640m(r9, r8)
            r2.put(r4, r8)
            r4 = r5
        L_0x00aa:
            java.util.List<oi.a> r8 = r0.f32467d
            int r8 = r8.size()
            if (r5 >= r8) goto L_0x06c5
            java.util.List<oi.a> r8 = r0.f32467d
            java.lang.Object r8 = r8.get(r5)
            oi.a r8 = (p636oi.C18296a) r8
            float r11 = r8.f40154h
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            r14 = 1120403456(0x42c80000, float:100.0)
            if (r13 == 0) goto L_0x00c7
            float r11 = r11 * r14
            goto L_0x00c9
        L_0x00c7:
            r11 = 1112014848(0x42480000, float:50.0)
        L_0x00c9:
            int r13 = r8.f40155i
            r16 = -100
            if (r13 == r6) goto L_0x00d6
            if (r13 == r7) goto L_0x00d3
            r13 = r4
            goto L_0x00d8
        L_0x00d3:
            r13 = r16
            goto L_0x00d8
        L_0x00d6:
            r13 = -50
        L_0x00d8:
            float r15 = r8.f40151e
            int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r14 = "%.2f%%"
            if (r12 == 0) goto L_0x0151
            int r12 = r8.f40152f
            if (r12 == r6) goto L_0x011c
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r19 = 1120403456(0x42c80000, float:100.0)
            float r15 = r15 * r19
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r12[r4] = r15
            java.lang.String r12 = p513bj.C14049b0.m21640m(r14, r12)
            int r15 = r8.f40162p
            if (r15 != r6) goto L_0x010b
            int r15 = r8.f40153g
            if (r15 == r6) goto L_0x0107
            if (r15 == r7) goto L_0x0104
            r15 = r4
            goto L_0x0109
        L_0x0104:
            r15 = r16
            goto L_0x0109
        L_0x0107:
            r15 = -50
        L_0x0109:
            int r7 = -r15
            goto L_0x0119
        L_0x010b:
            int r15 = r8.f40153g
            if (r15 == r6) goto L_0x0116
            if (r15 == r7) goto L_0x0113
            r15 = r4
            goto L_0x0118
        L_0x0113:
            r15 = r16
            goto L_0x0118
        L_0x0116:
            r15 = -50
        L_0x0118:
            r7 = r15
        L_0x0119:
            r16 = r7
            goto L_0x014d
        L_0x011c:
            int r7 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            java.lang.String r12 = "%.2fem"
            if (r7 < 0) goto L_0x0136
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r16 = 1067030938(0x3f99999a, float:1.2)
            float r15 = r15 * r16
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r7[r4] = r15
            java.lang.String r12 = p513bj.C14049b0.m21640m(r12, r7)
            r16 = r4
            goto L_0x014d
        L_0x0136:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            float r15 = -r15
            float r15 = r15 - r19
            r16 = 1067030938(0x3f99999a, float:1.2)
            float r15 = r15 * r16
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r7[r4] = r15
            java.lang.String r12 = p513bj.C14049b0.m21640m(r12, r7)
            r16 = r4
            r4 = r6
        L_0x014d:
            r7 = r12
            r12 = 1120403456(0x42c80000, float:100.0)
            goto L_0x0165
        L_0x0151:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            float r12 = r0.f32471h
            float r19 = r19 - r12
            r12 = 1120403456(0x42c80000, float:100.0)
            float r19 = r19 * r12
            java.lang.Float r15 = java.lang.Float.valueOf(r19)
            r7[r4] = r15
            java.lang.String r7 = p513bj.C14049b0.m21640m(r14, r7)
        L_0x0165:
            float r15 = r8.f40156j
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 == 0) goto L_0x017f
            r17 = r13
            java.lang.Object[] r13 = new java.lang.Object[r6]
            float r15 = r15 * r12
            java.lang.Float r12 = java.lang.Float.valueOf(r15)
            r15 = 0
            r13[r15] = r12
            java.lang.String r12 = p513bj.C14049b0.m21640m(r14, r13)
            goto L_0x0183
        L_0x017f:
            r17 = r13
            java.lang.String r12 = "fit-content"
        L_0x0183:
            android.text.Layout$Alignment r13 = r8.f40148b
            java.lang.String r14 = "end"
            java.lang.String r15 = "start"
            java.lang.String r19 = "center"
            if (r13 != 0) goto L_0x0193
            r6 = 2
        L_0x018e:
            r21 = r14
            r13 = r19
            goto L_0x01a9
        L_0x0193:
            int[] r21 = com.google.android.exoplayer2.p526ui.C14422d.C14423a.f32472a
            int r13 = r13.ordinal()
            r13 = r21[r13]
            if (r13 == r6) goto L_0x01a5
            r6 = 2
            if (r13 == r6) goto L_0x01a1
            goto L_0x018e
        L_0x01a1:
            r13 = r14
            r21 = r13
            goto L_0x01a9
        L_0x01a5:
            r6 = 2
            r21 = r14
            r13 = r15
        L_0x01a9:
            int r14 = r8.f40162p
            r22 = r15
            r15 = 1
            if (r14 == r15) goto L_0x01b8
            if (r14 == r6) goto L_0x01b5
            java.lang.String r6 = "horizontal-tb"
            goto L_0x01ba
        L_0x01b5:
            java.lang.String r6 = "vertical-lr"
            goto L_0x01ba
        L_0x01b8:
            java.lang.String r6 = "vertical-rl"
        L_0x01ba:
            int r14 = r8.f40160n
            float r15 = r8.f40161o
            java.lang.String r14 = r0.mo48160b(r15, r14)
            boolean r15 = r8.f40158l
            if (r15 == 0) goto L_0x01c9
            int r15 = r8.f40159m
            goto L_0x01cd
        L_0x01c9:
            zi.a r15 = r0.f32468e
            int r15 = r15.f42120c
        L_0x01cd:
            java.lang.String r15 = p568fn.C17782b.m29881q0(r15)
            int r0 = r8.f40162p
            java.lang.String r23 = "left"
            java.lang.String r24 = "top"
            r25 = r3
            r3 = 1
            if (r0 == r3) goto L_0x01e8
            r3 = 2
            if (r0 == r3) goto L_0x01e5
            if (r4 == 0) goto L_0x01e3
            java.lang.String r24 = "bottom"
        L_0x01e3:
            r3 = 2
            goto L_0x01f4
        L_0x01e5:
            if (r4 == 0) goto L_0x01ed
            goto L_0x01eb
        L_0x01e8:
            if (r4 == 0) goto L_0x01eb
            goto L_0x01ed
        L_0x01eb:
            java.lang.String r23 = "right"
        L_0x01ed:
            r3 = 2
            r41 = r24
            r24 = r23
            r23 = r41
        L_0x01f4:
            if (r0 == r3) goto L_0x0203
            r3 = 1
            if (r0 != r3) goto L_0x01fa
            goto L_0x0203
        L_0x01fa:
            java.lang.String r0 = "width"
            r41 = r17
            r17 = r16
            r16 = r41
            goto L_0x0205
        L_0x0203:
            java.lang.String r0 = "height"
        L_0x0205:
            java.lang.CharSequence r3 = r8.f40147a
            android.content.Context r4 = r42.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            java.util.regex.Pattern r26 = com.google.android.exoplayer2.p526ui.C14416b.f32454a
            r26 = r1
            java.lang.String r1 = ""
            r27 = r8
            java.lang.String r8 = "</span>"
            if (r3 != 0) goto L_0x022d
            com.google.android.exoplayer2.ui.b$a r3 = new com.google.android.exoplayer2.ui.b$a
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableMap.m25853of()
            r3.<init>(r1, r4)
            r28 = r1
            goto L_0x0241
        L_0x022d:
            r28 = r1
            boolean r1 = r3 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x0253
            com.google.android.exoplayer2.ui.b$a r1 = new com.google.android.exoplayer2.ui.b$a
            java.lang.String r3 = com.google.android.exoplayer2.p526ui.C14416b.m22835a(r3)
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableMap.m25853of()
            r1.<init>(r3, r4)
            r3 = r1
        L_0x0241:
            r40 = r0
            r36 = r6
            r29 = r8
            r32 = r9
            r39 = r12
            r37 = r13
            r31 = r14
            r30 = r15
            goto L_0x05b9
        L_0x0253:
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r29 = r8
            int r8 = r3.length()
            r30 = r15
            java.lang.Class<android.text.style.BackgroundColorSpan> r15 = android.text.style.BackgroundColorSpan.class
            r31 = r14
            r14 = 0
            java.lang.Object[] r8 = r3.getSpans(r14, r8, r15)
            android.text.style.BackgroundColorSpan[] r8 = (android.text.style.BackgroundColorSpan[]) r8
            int r14 = r8.length
            r15 = 0
        L_0x026f:
            if (r15 >= r14) goto L_0x0285
            r32 = r8[r15]
            int r32 = r32.getBackgroundColor()
            r33 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r32)
            r1.add(r8)
            int r15 = r15 + 1
            r8 = r33
            goto L_0x026f
        L_0x0285:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x028e:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x02cc
            java.lang.Object r14 = r1.next()
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r32 = r1
            r1 = 14
            r15.<init>(r1)
            java.lang.String r1 = "bg_"
            r15.append(r1)
            r15.append(r14)
            java.lang.String r1 = r15.toString()
            java.lang.String r1 = p568fn.C17782b.m29849O(r1)
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r14 = p568fn.C17782b.m29881q0(r14)
            r33 = 0
            r15[r33] = r14
            java.lang.String r14 = p513bj.C14049b0.m21640m(r9, r15)
            r8.put(r1, r14)
            r1 = r32
            goto L_0x028e
        L_0x02cc:
            r1 = 0
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            int r15 = r3.length()
            r32 = r9
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Object[] r1 = r3.getSpans(r1, r15, r9)
            int r9 = r1.length
            r15 = 0
        L_0x02e0:
            if (r15 >= r9) goto L_0x0531
            r33 = r9
            r9 = r1[r15]
            r34 = r1
            boolean r1 = r9 instanceof android.text.style.StrikethroughSpan
            r35 = 0
            if (r1 == 0) goto L_0x0300
            java.lang.String r36 = "<span style='text-decoration:line-through;'>"
            r40 = r0
            r38 = r4
            r39 = r12
            r37 = r13
            r0 = r36
            r20 = 1120403456(0x42c80000, float:100.0)
            r36 = r6
            goto L_0x0472
        L_0x0300:
            r36 = r6
            boolean r6 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r6 == 0) goto L_0x0324
            r6 = r9
            android.text.style.ForegroundColorSpan r6 = (android.text.style.ForegroundColorSpan) r6
            r37 = r13
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r6 = r6.getForegroundColor()
            java.lang.String r6 = p568fn.C17782b.m29881q0(r6)
            r38 = 0
            r13[r38] = r6
            java.lang.String r6 = "<span style='color:%s;'>"
            java.lang.String r6 = p513bj.C14049b0.m21640m(r6, r13)
        L_0x0320:
            r20 = 1120403456(0x42c80000, float:100.0)
            goto L_0x03fc
        L_0x0324:
            r37 = r13
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r13 == 0) goto L_0x0343
            r13 = r9
            android.text.style.BackgroundColorSpan r13 = (android.text.style.BackgroundColorSpan) r13
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r13 = r13.getBackgroundColor()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r38 = 0
            r6[r38] = r13
            java.lang.String r13 = "<span class='bg_%s'>"
            java.lang.String r6 = p513bj.C14049b0.m21640m(r13, r6)
            goto L_0x0320
        L_0x0343:
            boolean r6 = r9 instanceof p670si.C18507a
            if (r6 == 0) goto L_0x034a
            java.lang.String r6 = "<span style='text-combine-upright:all;'>"
            goto L_0x0320
        L_0x034a:
            boolean r6 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r6 == 0) goto L_0x0375
            r6 = r9
            android.text.style.AbsoluteSizeSpan r6 = (android.text.style.AbsoluteSizeSpan) r6
            boolean r13 = r6.getDip()
            if (r13 == 0) goto L_0x035d
            int r6 = r6.getSize()
            float r6 = (float) r6
            goto L_0x0363
        L_0x035d:
            int r6 = r6.getSize()
            float r6 = (float) r6
            float r6 = r6 / r4
        L_0x0363:
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r38 = 0
            r13[r38] = r6
            java.lang.String r6 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r6 = p513bj.C14049b0.m21640m(r6, r13)
            goto L_0x0320
        L_0x0375:
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r13 == 0) goto L_0x0397
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r13 = r9
            android.text.style.RelativeSizeSpan r13 = (android.text.style.RelativeSizeSpan) r13
            float r13 = r13.getSizeChange()
            r20 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r20
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r38 = 0
            r6[r38] = r13
            java.lang.String r13 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r6 = p513bj.C14049b0.m21640m(r13, r6)
            goto L_0x03fc
        L_0x0397:
            r20 = 1120403456(0x42c80000, float:100.0)
            r38 = 0
            boolean r6 = r9 instanceof android.text.style.TypefaceSpan
            if (r6 == 0) goto L_0x03bc
            r6 = r9
            android.text.style.TypefaceSpan r6 = (android.text.style.TypefaceSpan) r6
            java.lang.String r6 = r6.getFamily()
            if (r6 == 0) goto L_0x03b4
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r38] = r6
            java.lang.String r6 = "<span style='font-family:\"%s\";'>"
            java.lang.String r6 = p513bj.C14049b0.m21640m(r6, r13)
            goto L_0x03fc
        L_0x03b4:
            r40 = r0
            r38 = r4
            r39 = r12
            goto L_0x0470
        L_0x03bc:
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.StyleSpan
            if (r13 == 0) goto L_0x03da
            r13 = r9
            android.text.style.StyleSpan r13 = (android.text.style.StyleSpan) r13
            int r13 = r13.getStyle()
            if (r13 == r6) goto L_0x03d7
            r6 = 2
            if (r13 == r6) goto L_0x03d4
            r6 = 3
            if (r13 == r6) goto L_0x03d1
            goto L_0x03b4
        L_0x03d1:
            java.lang.String r6 = "<b><i>"
            goto L_0x03fc
        L_0x03d4:
            java.lang.String r6 = "<i>"
            goto L_0x03fc
        L_0x03d7:
            java.lang.String r6 = "<b>"
            goto L_0x03fc
        L_0x03da:
            boolean r6 = r9 instanceof p670si.C18509c
            if (r6 == 0) goto L_0x03f6
            r6 = r9
            si.c r6 = (p670si.C18509c) r6
            int r6 = r6.f40769b
            r13 = -1
            if (r6 == r13) goto L_0x03f3
            r13 = 1
            if (r6 == r13) goto L_0x03f0
            r13 = 2
            if (r6 == r13) goto L_0x03ed
            goto L_0x03b4
        L_0x03ed:
            java.lang.String r6 = "<ruby style='ruby-position:under;'>"
            goto L_0x03fc
        L_0x03f0:
            java.lang.String r6 = "<ruby style='ruby-position:over;'>"
            goto L_0x03fc
        L_0x03f3:
            java.lang.String r6 = "<ruby style='ruby-position:unset;'>"
            goto L_0x03fc
        L_0x03f6:
            boolean r6 = r9 instanceof android.text.style.UnderlineSpan
            if (r6 == 0) goto L_0x0405
            java.lang.String r6 = "<u>"
        L_0x03fc:
            r40 = r0
            r38 = r4
            r0 = r6
            r39 = r12
            goto L_0x0472
        L_0x0405:
            boolean r6 = r9 instanceof p670si.C18510d
            if (r6 == 0) goto L_0x03b4
            r6 = r9
            si.d r6 = (p670si.C18510d) r6
            int r13 = r6.f40770a
            r38 = r4
            int r4 = r6.f40771b
            r39 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r40 = r0
            r0 = 1
            if (r4 == r0) goto L_0x0428
            r0 = 2
            if (r4 == r0) goto L_0x0422
            goto L_0x042e
        L_0x0422:
            java.lang.String r4 = "open "
            r12.append(r4)
            goto L_0x042e
        L_0x0428:
            r0 = 2
            java.lang.String r4 = "filled "
            r12.append(r4)
        L_0x042e:
            if (r13 == 0) goto L_0x044e
            r4 = 1
            if (r13 == r4) goto L_0x0448
            if (r13 == r0) goto L_0x0442
            r0 = 3
            if (r13 == r0) goto L_0x043c
            r12.append(r10)
            goto L_0x0453
        L_0x043c:
            java.lang.String r0 = "sesame"
            r12.append(r0)
            goto L_0x0453
        L_0x0442:
            java.lang.String r0 = "dot"
            r12.append(r0)
            goto L_0x0453
        L_0x0448:
            java.lang.String r0 = "circle"
            r12.append(r0)
            goto L_0x0453
        L_0x044e:
            java.lang.String r0 = "none"
            r12.append(r0)
        L_0x0453:
            java.lang.String r0 = r12.toString()
            int r4 = r6.f40772c
            r6 = 2
            if (r4 == r6) goto L_0x045f
            java.lang.String r4 = "over right"
            goto L_0x0461
        L_0x045f:
            java.lang.String r4 = "under left"
        L_0x0461:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r12 = 0
            r6[r12] = r0
            r0 = 1
            r6[r0] = r4
            java.lang.String r0 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r0 = p513bj.C14049b0.m21640m(r0, r6)
            goto L_0x0472
        L_0x0470:
            r0 = r35
        L_0x0472:
            if (r1 != 0) goto L_0x04e1
            boolean r1 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r1 != 0) goto L_0x04e1
            boolean r1 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r1 != 0) goto L_0x04e1
            boolean r1 = r9 instanceof p670si.C18507a
            if (r1 != 0) goto L_0x04e1
            boolean r1 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r1 != 0) goto L_0x04e1
            boolean r1 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r1 != 0) goto L_0x04e1
            boolean r1 = r9 instanceof p670si.C18510d
            if (r1 == 0) goto L_0x048d
            goto L_0x04e1
        L_0x048d:
            boolean r1 = r9 instanceof android.text.style.TypefaceSpan
            if (r1 == 0) goto L_0x049b
            r1 = r9
            android.text.style.TypefaceSpan r1 = (android.text.style.TypefaceSpan) r1
            java.lang.String r1 = r1.getFamily()
            if (r1 == 0) goto L_0x04de
            goto L_0x04e1
        L_0x049b:
            boolean r1 = r9 instanceof android.text.style.StyleSpan
            if (r1 == 0) goto L_0x04b9
            r1 = r9
            android.text.style.StyleSpan r1 = (android.text.style.StyleSpan) r1
            int r1 = r1.getStyle()
            r4 = 1
            if (r1 == r4) goto L_0x04b6
            r4 = 2
            if (r1 == r4) goto L_0x04b3
            r4 = 3
            if (r1 == r4) goto L_0x04b0
            goto L_0x04de
        L_0x04b0:
            java.lang.String r1 = "</i></b>"
            goto L_0x04d4
        L_0x04b3:
            java.lang.String r1 = "</i>"
            goto L_0x04d4
        L_0x04b6:
            java.lang.String r1 = "</b>"
            goto L_0x04d4
        L_0x04b9:
            boolean r1 = r9 instanceof p670si.C18509c
            if (r1 == 0) goto L_0x04d7
            r1 = r9
            si.c r1 = (p670si.C18509c) r1
            java.lang.String r1 = r1.f40768a
            java.lang.String r1 = com.google.android.exoplayer2.p526ui.C14416b.m22835a(r1)
            r4 = 16
            int r4 = androidx.compose.animation.C0391c.m1055a(r1, r4)
            java.lang.String r6 = "<rt>"
            java.lang.String r12 = "</rt></ruby>"
            java.lang.String r1 = p504ai.C13983i.m21492k(r4, r6, r1, r12)
        L_0x04d4:
            r35 = r1
            goto L_0x04de
        L_0x04d7:
            boolean r1 = r9 instanceof android.text.style.UnderlineSpan
            if (r1 == 0) goto L_0x04de
            java.lang.String r1 = "</u>"
            goto L_0x04d4
        L_0x04de:
            r1 = r35
            goto L_0x04e3
        L_0x04e1:
            r1 = r29
        L_0x04e3:
            int r4 = r3.getSpanStart(r9)
            int r6 = r3.getSpanEnd(r9)
            if (r0 == 0) goto L_0x051f
            r1.getClass()
            com.google.android.exoplayer2.ui.b$b r9 = new com.google.android.exoplayer2.ui.b$b
            r9.<init>(r4, r6, r0, r1)
            java.lang.Object r0 = r14.get(r4)
            com.google.android.exoplayer2.ui.b$c r0 = (com.google.android.exoplayer2.p526ui.C14416b.C14419c) r0
            if (r0 != 0) goto L_0x0505
            com.google.android.exoplayer2.ui.b$c r0 = new com.google.android.exoplayer2.ui.b$c
            r0.<init>()
            r14.put(r4, r0)
        L_0x0505:
            java.util.ArrayList r0 = r0.f32463a
            r0.add(r9)
            java.lang.Object r0 = r14.get(r6)
            com.google.android.exoplayer2.ui.b$c r0 = (com.google.android.exoplayer2.p526ui.C14416b.C14419c) r0
            if (r0 != 0) goto L_0x051a
            com.google.android.exoplayer2.ui.b$c r0 = new com.google.android.exoplayer2.ui.b$c
            r0.<init>()
            r14.put(r6, r0)
        L_0x051a:
            java.util.ArrayList r0 = r0.f32464b
            r0.add(r9)
        L_0x051f:
            int r15 = r15 + 1
            r9 = r33
            r1 = r34
            r6 = r36
            r13 = r37
            r4 = r38
            r12 = r39
            r0 = r40
            goto L_0x02e0
        L_0x0531:
            r40 = r0
            r36 = r6
            r39 = r12
            r37 = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            r0.<init>(r1)
            r1 = 0
            r4 = 0
        L_0x0544:
            int r6 = r14.size()
            if (r1 >= r6) goto L_0x05a1
            int r6 = r14.keyAt(r1)
            java.lang.CharSequence r4 = r3.subSequence(r4, r6)
            java.lang.String r4 = com.google.android.exoplayer2.p526ui.C14416b.m22835a(r4)
            r0.append(r4)
            java.lang.Object r4 = r14.get(r6)
            com.google.android.exoplayer2.ui.b$c r4 = (com.google.android.exoplayer2.p526ui.C14416b.C14419c) r4
            java.util.ArrayList r9 = r4.f32464b
            bo.app.c7 r12 = com.google.android.exoplayer2.p526ui.C14416b.C14418b.f32458f
            java.util.Collections.sort(r9, r12)
            java.util.ArrayList r9 = r4.f32464b
            java.util.Iterator r9 = r9.iterator()
        L_0x056c:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x057e
            java.lang.Object r12 = r9.next()
            com.google.android.exoplayer2.ui.b$b r12 = (com.google.android.exoplayer2.p526ui.C14416b.C14418b) r12
            java.lang.String r12 = r12.f32462d
            r0.append(r12)
            goto L_0x056c
        L_0x057e:
            java.util.ArrayList r9 = r4.f32463a
            c4.a r12 = com.google.android.exoplayer2.p526ui.C14416b.C14418b.f32457e
            java.util.Collections.sort(r9, r12)
            java.util.ArrayList r4 = r4.f32463a
            java.util.Iterator r4 = r4.iterator()
        L_0x058b:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x059d
            java.lang.Object r9 = r4.next()
            com.google.android.exoplayer2.ui.b$b r9 = (com.google.android.exoplayer2.p526ui.C14416b.C14418b) r9
            java.lang.String r9 = r9.f32461c
            r0.append(r9)
            goto L_0x058b
        L_0x059d:
            int r1 = r1 + 1
            r4 = r6
            goto L_0x0544
        L_0x05a1:
            int r1 = r3.length()
            java.lang.CharSequence r1 = r3.subSequence(r4, r1)
            java.lang.String r1 = com.google.android.exoplayer2.p526ui.C14416b.m22835a(r1)
            r0.append(r1)
            com.google.android.exoplayer2.ui.b$a r3 = new com.google.android.exoplayer2.ui.b$a
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r8)
        L_0x05b9:
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x05c1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05ed
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r2.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r2.put(r1, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x05e8
            java.lang.Object r1 = r2.get(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x05e6
            goto L_0x05e8
        L_0x05e6:
            r1 = 0
            goto L_0x05e9
        L_0x05e8:
            r1 = 1
        L_0x05e9:
            p513bj.C14075p.m21694f(r1)
            goto L_0x05c1
        L_0x05ed:
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r0[r4] = r1
            r1 = 1
            r0[r1] = r23
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r4 = 2
            r0[r4] = r1
            r1 = 3
            r0[r1] = r24
            r1 = 4
            r0[r1] = r7
            r1 = 5
            r0[r1] = r40
            r1 = 6
            r0[r1] = r39
            r1 = 7
            r0[r1] = r37
            r1 = 8
            r0[r1] = r36
            r1 = 9
            r0[r1] = r31
            r1 = 10
            r0[r1] = r30
            r1 = 11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r0[r1] = r4
            r1 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r0[r1] = r4
            r1 = 13
            r8 = r27
            float r4 = r8.f40163q
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0657
            int r6 = r8.f40162p
            r7 = 2
            r9 = 1
            if (r6 == r7) goto L_0x0643
            if (r6 != r9) goto L_0x0640
            goto L_0x0643
        L_0x0640:
            java.lang.String r6 = "skewX"
            goto L_0x0645
        L_0x0643:
            java.lang.String r6 = "skewY"
        L_0x0645:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r11 = 0
            r7[r11] = r6
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7[r9] = r4
            java.lang.String r4 = "%s(%.2fdeg)"
            java.lang.String r4 = p513bj.C14049b0.m21640m(r4, r7)
            goto L_0x065a
        L_0x0657:
            r9 = 1
            r4 = r28
        L_0x065a:
            r0[r1] = r4
            java.lang.String r1 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = p513bj.C14049b0.m21640m(r1, r0)
            r1 = r26
            r1.append(r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r4 = 0
            r0[r4] = r25
            java.lang.String r4 = "<span class='%s'>"
            java.lang.String r0 = p513bj.C14049b0.m21640m(r4, r0)
            r1.append(r0)
            android.text.Layout$Alignment r0 = r8.f40149c
            if (r0 == 0) goto L_0x06a8
            java.lang.Object[] r4 = new java.lang.Object[r9]
            int[] r6 = com.google.android.exoplayer2.p526ui.C14422d.C14423a.f32472a
            int r0 = r0.ordinal()
            r0 = r6[r0]
            r6 = 2
            if (r0 == r9) goto L_0x068e
            if (r0 == r6) goto L_0x068b
            r14 = r19
            goto L_0x0690
        L_0x068b:
            r14 = r21
            goto L_0x0690
        L_0x068e:
            r14 = r22
        L_0x0690:
            r0 = 0
            r4[r0] = r14
            java.lang.String r0 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r0 = p513bj.C14049b0.m21640m(r0, r4)
            r1.append(r0)
            java.lang.String r0 = r3.f32455a
            r1.append(r0)
            r0 = r29
            r1.append(r0)
            r7 = r6
            goto L_0x06b1
        L_0x06a8:
            r0 = r29
            r4 = 2
            java.lang.String r3 = r3.f32455a
            r1.append(r3)
            r7 = r4
        L_0x06b1:
            r1.append(r0)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r5 = r5 + 1
            r4 = 0
            r6 = 1
            r0 = r42
            r3 = r25
            r9 = r32
            goto L_0x00aa
        L_0x06c5:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "<html><head><style>"
            r0.append(r3)
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x06dc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x06ff
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x06dc
        L_0x06ff:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r42
            zi.q r2 = r0.f32466c
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = com.google.common.base.C15781b.f35562c
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p526ui.C14422d.mo48161c():void");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f32467d.isEmpty()) {
            mo48161c();
        }
    }
}
