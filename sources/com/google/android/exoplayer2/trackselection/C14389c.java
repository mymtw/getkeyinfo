package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroupArray;
import p718yi.C18888f;

/* renamed from: com.google.android.exoplayer2.trackselection.c */
public abstract class C14389c extends C18888f {

    /* renamed from: c */
    public C14390a f32403c;

    /* renamed from: com.google.android.exoplayer2.trackselection.c$a */
    public static final class C14390a {

        /* renamed from: a */
        public final int f32404a;

        /* renamed from: b */
        public final int[] f32405b;

        /* renamed from: c */
        public final TrackGroupArray[] f32406c;

        /* renamed from: d */
        public final int[] f32407d;

        /* renamed from: e */
        public final int[][][] f32408e;

        public C14390a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3) {
            this.f32405b = iArr;
            this.f32406c = trackGroupArrayArr;
            this.f32408e = iArr3;
            this.f32407d = iArr2;
            this.f32404a = iArr.length;
        }
    }

    /* renamed from: a */
    public final void mo47901a(Object obj) {
        this.f32403c = (C14390a) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0561, code lost:
        if (com.google.common.collect.C16206p.f36306a.mo57712e(r14.f32333c, r7.f32333c).mo57712e(r14.f32332b, r7.f32332b).mo57714g() > 0) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0880, code lost:
        if (r6 == 2) goto L_0x0886;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0278 A[LOOP:8: B:65:0x015c->B:106:0x0278, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0862  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0865  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0271 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p718yi.C18890g mo47902b(p594jh.C17908e1[] r48, com.google.android.exoplayer2.source.TrackGroupArray r49) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r47 = this;
            r0 = r48
            r1 = r49
            int r2 = r0.length
            r3 = 1
            int r2 = r2 + r3
            int[] r2 = new int[r2]
            int r4 = r0.length
            int r4 = r4 + r3
            com.google.android.exoplayer2.source.TrackGroup[][] r5 = new com.google.android.exoplayer2.source.TrackGroup[r4][]
            int r6 = r0.length
            int r6 = r6 + r3
            int[][][] r6 = new int[r6][][]
            r7 = 0
            r8 = r7
        L_0x0013:
            if (r8 >= r4) goto L_0x0022
            int r9 = r1.length
            com.google.android.exoplayer2.source.TrackGroup[] r10 = new com.google.android.exoplayer2.source.TrackGroup[r9]
            r5[r8] = r10
            int[][] r9 = new int[r9][]
            r6[r8] = r9
            int r8 = r8 + 1
            goto L_0x0013
        L_0x0022:
            int r4 = r0.length
            int[] r8 = new int[r4]
            r9 = r7
        L_0x0026:
            if (r9 >= r4) goto L_0x0033
            r10 = r0[r9]
            int r10 = r10.supportsMixedMimeTypeAdaptation()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0026
        L_0x0033:
            r4 = r7
        L_0x0034:
            int r9 = r1.length
            if (r4 >= r9) goto L_0x00c6
            com.google.android.exoplayer2.source.TrackGroup r9 = r1.get(r4)
            com.google.android.exoplayer2.Format r11 = r9.getFormat(r7)
            java.lang.String r11 = r11.sampleMimeType
            int r11 = p513bj.C14065m.m21678h(r11)
            r12 = 5
            if (r11 != r12) goto L_0x004b
            r11 = r3
            goto L_0x004c
        L_0x004b:
            r11 = r7
        L_0x004c:
            int r12 = r0.length
            r15 = r3
            r13 = r7
            r14 = r13
        L_0x0050:
            int r7 = r0.length
            if (r13 >= r7) goto L_0x008f
            r7 = r0[r13]
            r3 = 0
            r16 = 0
        L_0x0058:
            int r10 = r9.length
            if (r3 >= r10) goto L_0x0073
            com.google.android.exoplayer2.Format r10 = r9.getFormat(r3)
            int r10 = r7.supportsFormat(r10)
            r17 = 7
            r10 = r10 & 7
            r1 = r16
            int r16 = java.lang.Math.max(r1, r10)
            int r3 = r3 + 1
            r1 = r49
            goto L_0x0058
        L_0x0073:
            r1 = r16
            r3 = r2[r13]
            if (r3 != 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r1 > r14) goto L_0x0086
            if (r1 != r14) goto L_0x0089
            if (r11 == 0) goto L_0x0089
            if (r15 != 0) goto L_0x0089
            if (r3 == 0) goto L_0x0089
        L_0x0086:
            r14 = r1
            r15 = r3
            r12 = r13
        L_0x0089:
            int r13 = r13 + 1
            r1 = r49
            r3 = 1
            goto L_0x0050
        L_0x008f:
            int r1 = r0.length
            if (r12 != r1) goto L_0x0097
            int r1 = r9.length
            int[] r1 = new int[r1]
            goto L_0x00b0
        L_0x0097:
            r1 = r0[r12]
            int r3 = r9.length
            int[] r3 = new int[r3]
            r7 = 0
        L_0x009e:
            int r10 = r9.length
            if (r7 >= r10) goto L_0x00af
            com.google.android.exoplayer2.Format r10 = r9.getFormat(r7)
            int r10 = r1.supportsFormat(r10)
            r3[r7] = r10
            int r7 = r7 + 1
            goto L_0x009e
        L_0x00af:
            r1 = r3
        L_0x00b0:
            r3 = r2[r12]
            r7 = r5[r12]
            r7[r3] = r9
            r7 = r6[r12]
            r7[r3] = r1
            r1 = 1
            int r3 = r3 + r1
            r2[r12] = r3
            int r4 = r4 + 1
            r1 = r49
            r3 = 1
            r7 = 0
            goto L_0x0034
        L_0x00c6:
            int r1 = r0.length
            com.google.android.exoplayer2.source.TrackGroupArray[] r1 = new com.google.android.exoplayer2.source.TrackGroupArray[r1]
            int r3 = r0.length
            java.lang.String[] r3 = new java.lang.String[r3]
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x00d0:
            int r9 = r0.length
            if (r7 >= r9) goto L_0x0101
            r9 = r2[r7]
            com.google.android.exoplayer2.source.TrackGroupArray r10 = new com.google.android.exoplayer2.source.TrackGroupArray
            r11 = r5[r7]
            java.lang.Object[] r11 = p513bj.C14049b0.m21623D(r9, r11)
            com.google.android.exoplayer2.source.TrackGroup[] r11 = (com.google.android.exoplayer2.source.TrackGroup[]) r11
            r10.<init>((com.google.android.exoplayer2.source.TrackGroup[]) r11)
            r1[r7] = r10
            r10 = r6[r7]
            java.lang.Object[] r9 = p513bj.C14049b0.m21623D(r9, r10)
            int[][] r9 = (int[][]) r9
            r6[r7] = r9
            r9 = r0[r7]
            java.lang.String r9 = r9.getName()
            r3[r7] = r9
            r9 = r0[r7]
            int r9 = r9.getTrackType()
            r4[r7] = r9
            int r7 = r7 + 1
            goto L_0x00d0
        L_0x0101:
            int r3 = r0.length
            r2 = r2[r3]
            com.google.android.exoplayer2.source.TrackGroupArray r3 = new com.google.android.exoplayer2.source.TrackGroupArray
            int r0 = r0.length
            r0 = r5[r0]
            java.lang.Object[] r0 = p513bj.C14049b0.m21623D(r2, r0)
            com.google.android.exoplayer2.source.TrackGroup[] r0 = (com.google.android.exoplayer2.source.TrackGroup[]) r0
            r3.<init>((com.google.android.exoplayer2.source.TrackGroup[]) r0)
            com.google.android.exoplayer2.trackselection.c$a r0 = new com.google.android.exoplayer2.trackselection.c$a
            r0.<init>(r4, r1, r8, r6)
            r1 = r47
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector) r1
            java.util.concurrent.atomic.AtomicReference<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters> r2 = r1.f32317e
            java.lang.Object r2 = r2.get()
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r2
            int r3 = r0.f32404a
            com.google.android.exoplayer2.trackselection.b$a[] r4 = new com.google.android.exoplayer2.trackselection.C14386b.C14387a[r3]
            r10 = r0
            r11 = r2
            r5 = 0
            r7 = 0
            r9 = 0
        L_0x012c:
            r12 = 2
            if (r5 >= r3) goto L_0x036e
            int[] r15 = r10.f32405b
            r15 = r15[r5]
            if (r12 != r15) goto L_0x034f
            if (r9 != 0) goto L_0x0330
            com.google.android.exoplayer2.source.TrackGroupArray[] r9 = r10.f32406c
            r9 = r9[r5]
            r10 = r6[r5]
            r15 = r8[r5]
            boolean r14 = r11.forceHighestSupportedBitrate
            if (r14 != 0) goto L_0x0295
            boolean r14 = r11.forceLowestBitrate
            if (r14 != 0) goto L_0x0295
            boolean r14 = r11.allowVideoNonSeamlessAdaptiveness
            if (r14 == 0) goto L_0x014e
            r14 = 24
            goto L_0x0150
        L_0x014e:
            r14 = 16
        L_0x0150:
            boolean r13 = r11.allowVideoMixedMimeTypeAdaptiveness
            if (r13 == 0) goto L_0x015a
            r13 = r15 & r14
            if (r13 == 0) goto L_0x015a
            r13 = 1
            goto L_0x015b
        L_0x015a:
            r13 = 0
        L_0x015b:
            r15 = 0
        L_0x015c:
            int r12 = r9.length
            if (r15 >= r12) goto L_0x0295
            com.google.android.exoplayer2.source.TrackGroup r12 = r9.get(r15)
            r30 = r10[r15]
            r31 = r1
            int r1 = r11.maxVideoWidth
            r32 = r8
            int r8 = r11.maxVideoHeight
            r33 = r6
            int r6 = r11.maxVideoFrameRate
            r34 = r3
            int r3 = r11.maxVideoBitrate
            r35 = r7
            int r7 = r11.minVideoWidth
            r36 = r0
            int r0 = r11.minVideoHeight
            r37 = r4
            int r4 = r11.minVideoFrameRate
            r38 = r5
            int r5 = r11.minVideoBitrate
            r39 = r10
            int r10 = r11.viewportWidth
            r40 = r2
            int r2 = r11.viewportHeight
            boolean r11 = r11.viewportOrientationMayChange
            r41 = r9
            int r9 = r12.length
            r42 = r15
            r15 = 2
            if (r9 >= r15) goto L_0x019c
            int[] r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.f32313f
            goto L_0x01a8
        L_0x019c:
            java.util.ArrayList r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22762e(r12, r10, r2, r11)
            int r9 = r2.size()
            if (r9 >= r15) goto L_0x01ac
            int[] r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.f32313f
        L_0x01a8:
            r45 = r13
            goto L_0x026e
        L_0x01ac:
            if (r13 != 0) goto L_0x0226
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r11 = 0
            r15 = 0
            r43 = 0
        L_0x01b7:
            int r10 = r2.size()
            if (r11 >= r10) goto L_0x0223
            java.lang.Object r10 = r2.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            com.google.android.exoplayer2.Format r10 = r12.getFormat(r10)
            java.lang.String r10 = r10.sampleMimeType
            boolean r18 = r9.add(r10)
            if (r18 == 0) goto L_0x0216
            r44 = r9
            r46 = r11
            r45 = r13
            r9 = 0
            r13 = 0
        L_0x01db:
            int r11 = r2.size()
            if (r9 >= r11) goto L_0x0210
            java.lang.Object r11 = r2.get(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            com.google.android.exoplayer2.Format r18 = r12.getFormat(r11)
            r20 = r30[r11]
            r19 = r10
            r21 = r14
            r22 = r1
            r23 = r8
            r24 = r6
            r25 = r3
            r26 = r7
            r27 = r0
            r28 = r4
            r29 = r5
            boolean r11 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22764g(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r11 == 0) goto L_0x020d
            int r13 = r13 + 1
        L_0x020d:
            int r9 = r9 + 1
            goto L_0x01db
        L_0x0210:
            if (r13 <= r15) goto L_0x021c
            r43 = r10
            r15 = r13
            goto L_0x021c
        L_0x0216:
            r44 = r9
            r46 = r11
            r45 = r13
        L_0x021c:
            int r11 = r46 + 1
            r9 = r44
            r13 = r45
            goto L_0x01b7
        L_0x0223:
            r45 = r13
            goto L_0x022a
        L_0x0226:
            r45 = r13
            r43 = 0
        L_0x022a:
            int r9 = r2.size()
        L_0x022e:
            r10 = -1
            int r9 = r9 + r10
            if (r9 < 0) goto L_0x0260
            java.lang.Object r10 = r2.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            com.google.android.exoplayer2.Format r18 = r12.getFormat(r10)
            r20 = r30[r10]
            r19 = r43
            r21 = r14
            r22 = r1
            r23 = r8
            r24 = r6
            r25 = r3
            r26 = r7
            r27 = r0
            r28 = r4
            r29 = r5
            boolean r10 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22764g(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r10 != 0) goto L_0x022e
            r2.remove(r9)
            goto L_0x022e
        L_0x0260:
            int r0 = r2.size()
            r1 = 2
            if (r0 >= r1) goto L_0x026a
            int[] r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.f32313f
            goto L_0x026e
        L_0x026a:
            int[] r0 = com.google.common.primitives.Ints.m26385c(r2)
        L_0x026e:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0278
            com.google.android.exoplayer2.trackselection.b$a r1 = new com.google.android.exoplayer2.trackselection.b$a
            r2 = 0
            r1.<init>(r12, r0, r2)
            goto L_0x02ac
        L_0x0278:
            int r15 = r42 + 1
            r1 = r31
            r8 = r32
            r6 = r33
            r3 = r34
            r7 = r35
            r0 = r36
            r4 = r37
            r5 = r38
            r10 = r39
            r2 = r40
            r11 = r2
            r9 = r41
            r13 = r45
            goto L_0x015c
        L_0x0295:
            r36 = r0
            r31 = r1
            r40 = r2
            r34 = r3
            r37 = r4
            r38 = r5
            r33 = r6
            r35 = r7
            r32 = r8
            r41 = r9
            r39 = r10
            r1 = 0
        L_0x02ac:
            if (r1 != 0) goto L_0x0322
            r3 = r41
            r0 = 0
            r1 = 0
            r2 = 0
            r13 = -1
        L_0x02b4:
            int r4 = r3.length
            if (r2 >= r4) goto L_0x030f
            com.google.android.exoplayer2.source.TrackGroup r4 = r3.get(r2)
            r5 = r40
            int r6 = r5.viewportWidth
            int r7 = r5.viewportHeight
            boolean r8 = r5.viewportOrientationMayChange
            java.util.ArrayList r6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22762e(r4, r6, r7, r8)
            r7 = r39[r2]
            r8 = 0
        L_0x02cb:
            int r9 = r4.length
            if (r8 >= r9) goto L_0x030a
            com.google.android.exoplayer2.Format r9 = r4.getFormat(r8)
            int r10 = r9.roleFlags
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x02da
            goto L_0x0307
        L_0x02da:
            r10 = r7[r8]
            boolean r11 = r5.exceedRendererCapabilitiesIfNecessary
            boolean r10 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22763f(r10, r11)
            if (r10 == 0) goto L_0x0307
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$e r10 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$e
            r11 = r7[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r12 = r6.contains(r12)
            r10.<init>(r9, r5, r11, r12)
            boolean r9 = r10.f32372b
            if (r9 != 0) goto L_0x02fc
            boolean r9 = r5.exceedVideoConstraintsIfNecessary
            if (r9 != 0) goto L_0x02fc
            goto L_0x0307
        L_0x02fc:
            if (r1 == 0) goto L_0x0304
            int r9 = r10.compareTo(r1)
            if (r9 <= 0) goto L_0x0307
        L_0x0304:
            r0 = r4
            r13 = r8
            r1 = r10
        L_0x0307:
            int r8 = r8 + 1
            goto L_0x02cb
        L_0x030a:
            int r2 = r2 + 1
            r40 = r5
            goto L_0x02b4
        L_0x030f:
            r5 = r40
            if (r0 != 0) goto L_0x0315
            r14 = 0
            goto L_0x0320
        L_0x0315:
            com.google.android.exoplayer2.trackselection.b$a r14 = new com.google.android.exoplayer2.trackselection.b$a
            r1 = 1
            int[] r2 = new int[r1]
            r1 = 0
            r2[r1] = r13
            r14.<init>(r0, r2, r1)
        L_0x0320:
            r1 = r14
            goto L_0x0324
        L_0x0322:
            r5 = r40
        L_0x0324:
            r37[r38] = r1
            if (r1 == 0) goto L_0x032a
            r0 = 1
            goto L_0x032b
        L_0x032a:
            r0 = 0
        L_0x032b:
            r9 = r0
            r11 = r5
            r0 = r36
            goto L_0x033f
        L_0x0330:
            r31 = r1
            r34 = r3
            r37 = r4
            r38 = r5
            r33 = r6
            r35 = r7
            r32 = r8
            r5 = r2
        L_0x033f:
            com.google.android.exoplayer2.source.TrackGroupArray[] r1 = r0.f32406c
            r1 = r1[r38]
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0349
            r1 = 1
            goto L_0x034a
        L_0x0349:
            r1 = 0
        L_0x034a:
            r1 = r35 | r1
            r10 = r0
            r7 = r1
            goto L_0x035e
        L_0x034f:
            r31 = r1
            r34 = r3
            r37 = r4
            r38 = r5
            r33 = r6
            r35 = r7
            r32 = r8
            r5 = r2
        L_0x035e:
            int r1 = r38 + 1
            r2 = r5
            r8 = r32
            r6 = r33
            r3 = r34
            r4 = r37
            r5 = r1
            r1 = r31
            goto L_0x012c
        L_0x036e:
            r31 = r1
            r5 = r2
            r37 = r4
            r33 = r6
            r35 = r7
            r32 = r8
            r6 = r3
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = 0
        L_0x037e:
            if (r4 >= r6) goto L_0x04f8
            int[] r7 = r10.f32405b
            r7 = r7[r4]
            r8 = 1
            if (r8 != r7) goto L_0x04e0
            boolean r7 = r11.allowMultipleAdaptiveSelections
            if (r7 != 0) goto L_0x0390
            if (r35 != 0) goto L_0x038e
            goto L_0x0390
        L_0x038e:
            r7 = 0
            goto L_0x0391
        L_0x0390:
            r7 = 1
        L_0x0391:
            com.google.android.exoplayer2.source.TrackGroupArray[] r8 = r10.f32406c
            r8 = r8[r4]
            r9 = r33[r4]
            r10 = r32[r4]
            r10 = 0
            r12 = -1
            r13 = -1
            r14 = 0
        L_0x039d:
            int r15 = r8.length
            if (r14 >= r15) goto L_0x03f2
            com.google.android.exoplayer2.source.TrackGroup r15 = r8.get(r14)
            r18 = r9[r14]
            r19 = r12
            r20 = r13
            r12 = 0
        L_0x03ac:
            int r13 = r15.length
            if (r12 >= r13) goto L_0x03e9
            r13 = r18[r12]
            r21 = r1
            boolean r1 = r11.exceedRendererCapabilitiesIfNecessary
            boolean r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22763f(r13, r1)
            if (r1 == 0) goto L_0x03e0
            com.google.android.exoplayer2.Format r1 = r15.getFormat(r12)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a r13 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a
            r22 = r15
            r15 = r18[r12]
            r13.<init>(r1, r11, r15)
            boolean r1 = r13.f32318b
            if (r1 != 0) goto L_0x03d2
            boolean r1 = r11.exceedAudioConstraintsIfNecessary
            if (r1 != 0) goto L_0x03d2
            goto L_0x03e2
        L_0x03d2:
            if (r10 == 0) goto L_0x03da
            int r1 = r13.compareTo(r10)
            if (r1 <= 0) goto L_0x03e2
        L_0x03da:
            r20 = r12
            r10 = r13
            r19 = r14
            goto L_0x03e2
        L_0x03e0:
            r22 = r15
        L_0x03e2:
            int r12 = r12 + 1
            r1 = r21
            r15 = r22
            goto L_0x03ac
        L_0x03e9:
            r21 = r1
            int r14 = r14 + 1
            r12 = r19
            r13 = r20
            goto L_0x039d
        L_0x03f2:
            r21 = r1
            r1 = -1
            if (r12 != r1) goto L_0x0402
            r36 = r0
            r18 = r4
            r40 = r5
            r34 = r6
            r0 = 0
            goto L_0x04b1
        L_0x0402:
            com.google.android.exoplayer2.source.TrackGroup r1 = r8.get(r12)
            boolean r8 = r11.forceHighestSupportedBitrate
            if (r8 != 0) goto L_0x0494
            boolean r8 = r11.forceLowestBitrate
            if (r8 != 0) goto L_0x0494
            if (r7 == 0) goto L_0x0494
            r7 = r9[r12]
            int r8 = r11.maxAudioBitrate
            boolean r9 = r11.allowAudioMixedMimeTypeAdaptiveness
            boolean r12 = r11.allowAudioMixedSampleRateAdaptiveness
            boolean r11 = r11.allowAudioMixedChannelCountAdaptiveness
            com.google.android.exoplayer2.Format r14 = r1.getFormat(r13)
            int r15 = r1.length
            int[] r15 = new int[r15]
            r36 = r0
            r40 = r5
            r34 = r6
            r0 = 0
            r5 = 0
        L_0x042a:
            int r6 = r1.length
            if (r5 >= r6) goto L_0x0481
            if (r5 == r13) goto L_0x0471
            com.google.android.exoplayer2.Format r6 = r1.getFormat(r5)
            r18 = r4
            r4 = r7[r5]
            r19 = r7
            r7 = 0
            boolean r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22763f(r4, r7)
            if (r4 == 0) goto L_0x046d
            int r4 = r6.bitrate
            r7 = -1
            if (r4 == r7) goto L_0x046d
            if (r4 > r8) goto L_0x046d
            if (r11 != 0) goto L_0x0452
            int r4 = r6.channelCount
            if (r4 == r7) goto L_0x046d
            int r7 = r14.channelCount
            if (r4 != r7) goto L_0x046d
        L_0x0452:
            if (r9 != 0) goto L_0x0460
            java.lang.String r4 = r6.sampleMimeType
            if (r4 == 0) goto L_0x046d
            java.lang.String r7 = r14.sampleMimeType
            boolean r4 = android.text.TextUtils.equals(r4, r7)
            if (r4 == 0) goto L_0x046d
        L_0x0460:
            if (r12 != 0) goto L_0x046b
            int r4 = r6.sampleRate
            r6 = -1
            if (r4 == r6) goto L_0x046d
            int r6 = r14.sampleRate
            if (r4 != r6) goto L_0x046d
        L_0x046b:
            r4 = 1
            goto L_0x046e
        L_0x046d:
            r4 = 0
        L_0x046e:
            if (r4 == 0) goto L_0x047a
            goto L_0x0475
        L_0x0471:
            r18 = r4
            r19 = r7
        L_0x0475:
            int r4 = r0 + 1
            r15[r0] = r5
            r0 = r4
        L_0x047a:
            int r5 = r5 + 1
            r4 = r18
            r7 = r19
            goto L_0x042a
        L_0x0481:
            r18 = r4
            int[] r0 = java.util.Arrays.copyOf(r15, r0)
            int r4 = r0.length
            r5 = 1
            if (r4 <= r5) goto L_0x0492
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r5 = 0
            r4.<init>(r1, r0, r5)
            goto L_0x049e
        L_0x0492:
            r5 = 0
            goto L_0x049d
        L_0x0494:
            r36 = r0
            r18 = r4
            r40 = r5
            r34 = r6
            goto L_0x0492
        L_0x049d:
            r4 = 0
        L_0x049e:
            if (r4 != 0) goto L_0x04aa
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r0 = 1
            int[] r6 = new int[r0]
            r6[r5] = r13
            r4.<init>(r1, r6, r5)
        L_0x04aa:
            r10.getClass()
            android.util.Pair r0 = android.util.Pair.create(r4, r10)
        L_0x04b1:
            if (r0 == 0) goto L_0x04ea
            if (r2 == 0) goto L_0x04bf
            java.lang.Object r1 = r0.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C14376a) r1
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L_0x04ea
        L_0x04bf:
            r1 = -1
            if (r3 == r1) goto L_0x04c5
            r1 = 0
            r37[r3] = r1
        L_0x04c5:
            java.lang.Object r1 = r0.first
            com.google.android.exoplayer2.trackselection.b$a r1 = (com.google.android.exoplayer2.trackselection.C14386b.C14387a) r1
            r37[r18] = r1
            com.google.android.exoplayer2.source.TrackGroup r2 = r1.f32400a
            int[] r1 = r1.f32401b
            r3 = 0
            r1 = r1[r3]
            com.google.android.exoplayer2.Format r1 = r2.getFormat(r1)
            java.lang.String r1 = r1.language
            java.lang.Object r0 = r0.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C14376a) r0
            r2 = r0
            r3 = r18
            goto L_0x04ec
        L_0x04e0:
            r36 = r0
            r21 = r1
            r18 = r4
            r40 = r5
            r34 = r6
        L_0x04ea:
            r1 = r21
        L_0x04ec:
            int r4 = r18 + 1
            r6 = r34
            r0 = r36
            r10 = r0
            r5 = r40
            r11 = r5
            goto L_0x037e
        L_0x04f8:
            r36 = r0
            r21 = r1
            r40 = r5
            r2 = r6
            r0 = 0
            r1 = 0
            r10 = -1
        L_0x0502:
            if (r1 >= r2) goto L_0x0641
            r3 = r36
            int[] r4 = r3.f32405b
            r4 = r4[r1]
            r5 = 1
            if (r4 == r5) goto L_0x0633
            r5 = 2
            if (r4 == r5) goto L_0x0633
            r5 = 3
            if (r4 == r5) goto L_0x0598
            com.google.android.exoplayer2.source.TrackGroupArray[] r4 = r3.f32406c
            r4 = r4[r1]
            r5 = r33[r1]
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x051d:
            int r11 = r4.length
            if (r8 >= r11) goto L_0x0581
            com.google.android.exoplayer2.source.TrackGroup r11 = r4.get(r8)
            r12 = r5[r8]
            r13 = 0
        L_0x0528:
            int r14 = r11.length
            if (r13 >= r14) goto L_0x0576
            r14 = r12[r13]
            r18 = r4
            r15 = r40
            boolean r4 = r15.exceedRendererCapabilitiesIfNecessary
            boolean r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22763f(r14, r4)
            if (r4 == 0) goto L_0x0567
            com.google.android.exoplayer2.Format r4 = r11.getFormat(r13)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b r14 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b
            r19 = r5
            r5 = r12[r13]
            r14.<init>(r4, r5)
            if (r7 == 0) goto L_0x0563
            com.google.common.collect.p$a r4 = com.google.common.collect.C16206p.f36306a
            boolean r5 = r14.f32333c
            r20 = r6
            boolean r6 = r7.f32333c
            com.google.common.collect.p r4 = r4.mo57712e(r5, r6)
            boolean r5 = r14.f32332b
            boolean r6 = r7.f32332b
            com.google.common.collect.p r4 = r4.mo57712e(r5, r6)
            int r4 = r4.mo57714g()
            if (r4 <= 0) goto L_0x056b
        L_0x0563:
            r6 = r11
            r9 = r13
            r7 = r14
            goto L_0x056d
        L_0x0567:
            r19 = r5
            r20 = r6
        L_0x056b:
            r6 = r20
        L_0x056d:
            int r13 = r13 + 1
            r40 = r15
            r4 = r18
            r5 = r19
            goto L_0x0528
        L_0x0576:
            r18 = r4
            r19 = r5
            r20 = r6
            r15 = r40
            int r8 = r8 + 1
            goto L_0x051d
        L_0x0581:
            r15 = r40
            if (r6 != 0) goto L_0x0587
            r4 = 0
            goto L_0x0592
        L_0x0587:
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r5 = 1
            int[] r7 = new int[r5]
            r5 = 0
            r7[r5] = r9
            r4.<init>(r6, r7, r5)
        L_0x0592:
            r37[r1] = r4
            r11 = r21
            goto L_0x0637
        L_0x0598:
            r15 = r40
            com.google.android.exoplayer2.source.TrackGroupArray[] r4 = r3.f32406c
            r4 = r4[r1]
            r5 = r33[r1]
            r6 = 0
            r7 = 0
            r8 = -1
            r9 = 0
        L_0x05a4:
            int r11 = r4.length
            if (r9 >= r11) goto L_0x05fb
            com.google.android.exoplayer2.source.TrackGroup r11 = r4.get(r9)
            r12 = r5[r9]
            r13 = 0
        L_0x05af:
            int r14 = r11.length
            if (r13 >= r14) goto L_0x05f2
            r14 = r12[r13]
            r18 = r4
            boolean r4 = r15.exceedRendererCapabilitiesIfNecessary
            boolean r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22763f(r14, r4)
            if (r4 == 0) goto L_0x05e1
            com.google.android.exoplayer2.Format r4 = r11.getFormat(r13)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d r14 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d
            r19 = r5
            r5 = r12[r13]
            r20 = r11
            r11 = r21
            r14.<init>(r4, r15, r5, r11)
            boolean r4 = r14.f32363b
            if (r4 == 0) goto L_0x05e7
            if (r7 == 0) goto L_0x05dc
            int r4 = r14.compareTo(r7)
            if (r4 <= 0) goto L_0x05e7
        L_0x05dc:
            r8 = r13
            r7 = r14
            r6 = r20
            goto L_0x05e7
        L_0x05e1:
            r19 = r5
            r20 = r11
            r11 = r21
        L_0x05e7:
            int r13 = r13 + 1
            r21 = r11
            r4 = r18
            r5 = r19
            r11 = r20
            goto L_0x05af
        L_0x05f2:
            r18 = r4
            r19 = r5
            r11 = r21
            int r9 = r9 + 1
            goto L_0x05a4
        L_0x05fb:
            r11 = r21
            if (r6 != 0) goto L_0x0601
            r4 = 0
            goto L_0x0613
        L_0x0601:
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r5 = 1
            int[] r9 = new int[r5]
            r5 = 0
            r9[r5] = r8
            r4.<init>(r6, r9, r5)
            r7.getClass()
            android.util.Pair r4 = android.util.Pair.create(r4, r7)
        L_0x0613:
            if (r4 == 0) goto L_0x0637
            if (r0 == 0) goto L_0x0621
            java.lang.Object r5 = r4.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d r5 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C14379d) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x0637
        L_0x0621:
            r0 = -1
            if (r10 == r0) goto L_0x0627
            r0 = 0
            r37[r10] = r0
        L_0x0627:
            java.lang.Object r0 = r4.first
            com.google.android.exoplayer2.trackselection.b$a r0 = (com.google.android.exoplayer2.trackselection.C14386b.C14387a) r0
            r37[r1] = r0
            java.lang.Object r0 = r4.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C14379d) r0
            r10 = r1
            goto L_0x0637
        L_0x0633:
            r11 = r21
            r15 = r40
        L_0x0637:
            int r1 = r1 + 1
            r36 = r3
            r21 = r11
            r40 = r15
            goto L_0x0502
        L_0x0641:
            r3 = r36
            r15 = r40
            r0 = 0
        L_0x0646:
            if (r0 >= r2) goto L_0x0679
            boolean r1 = r15.getRendererDisabled(r0)
            if (r1 == 0) goto L_0x0652
            r1 = 0
            r37[r0] = r1
            goto L_0x0676
        L_0x0652:
            com.google.android.exoplayer2.source.TrackGroupArray[] r1 = r3.f32406c
            r1 = r1[r0]
            boolean r4 = r15.hasSelectionOverride(r0, r1)
            if (r4 == 0) goto L_0x0676
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r4 = r15.getSelectionOverride(r0, r1)
            if (r4 != 0) goto L_0x0664
            r1 = 0
            goto L_0x0674
        L_0x0664:
            com.google.android.exoplayer2.trackselection.b$a r5 = new com.google.android.exoplayer2.trackselection.b$a
            int r6 = r4.groupIndex
            com.google.android.exoplayer2.source.TrackGroup r1 = r1.get(r6)
            int[] r6 = r4.tracks
            int r4 = r4.type
            r5.<init>(r1, r6, r4)
            r1 = r5
        L_0x0674:
            r37[r0] = r1
        L_0x0676:
            int r0 = r0 + 1
            goto L_0x0646
        L_0x0679:
            r0 = r31
            com.google.android.exoplayer2.trackselection.b$b r1 = r0.f32316d
            aj.c r0 = r0.f42067b
            r0.getClass()
            com.google.android.exoplayer2.trackselection.a$b r1 = (com.google.android.exoplayer2.trackselection.C14383a.C14385b) r1
            r1.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4 = 0
        L_0x068d:
            r5 = 0
            if (r4 >= r2) goto L_0x06b3
            r7 = r37[r4]
            if (r7 == 0) goto L_0x06ac
            int[] r7 = r7.f32401b
            int r7 = r7.length
            r8 = 1
            if (r7 <= r8) goto L_0x06ac
            com.google.common.collect.ImmutableList$a r7 = com.google.common.collect.ImmutableList.builder()
            com.google.android.exoplayer2.trackselection.a$a r8 = new com.google.android.exoplayer2.trackselection.a$a
            r8.<init>(r5, r5)
            r7.mo56633b(r8)
            r1.add(r7)
            r7 = 0
            goto L_0x06b0
        L_0x06ac:
            r7 = 0
            r1.add(r7)
        L_0x06b0:
            int r4 = r4 + 1
            goto L_0x068d
        L_0x06b3:
            r7 = 0
            long[][] r4 = new long[r2][]
            r8 = 0
        L_0x06b7:
            if (r8 >= r2) goto L_0x06ea
            r9 = r37[r8]
            if (r9 != 0) goto L_0x06c3
            r10 = 0
            long[] r9 = new long[r10]
            r4[r8] = r9
            goto L_0x06e7
        L_0x06c3:
            int[] r10 = r9.f32401b
            int r10 = r10.length
            long[] r10 = new long[r10]
            r4[r8] = r10
            r10 = 0
        L_0x06cb:
            int[] r11 = r9.f32401b
            int r12 = r11.length
            if (r10 >= r12) goto L_0x06e2
            r12 = r4[r8]
            com.google.android.exoplayer2.source.TrackGroup r13 = r9.f32400a
            r11 = r11[r10]
            com.google.android.exoplayer2.Format r11 = r13.getFormat(r11)
            int r11 = r11.bitrate
            long r13 = (long) r11
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x06cb
        L_0x06e2:
            r9 = r4[r8]
            java.util.Arrays.sort(r9)
        L_0x06e7:
            int r8 = r8 + 1
            goto L_0x06b7
        L_0x06ea:
            int[] r8 = new int[r2]
            long[] r9 = new long[r2]
            r10 = 0
        L_0x06ef:
            if (r10 >= r2) goto L_0x0700
            r11 = r4[r10]
            int r12 = r11.length
            if (r12 != 0) goto L_0x06f8
            r13 = r5
            goto L_0x06fb
        L_0x06f8:
            r12 = 0
            r13 = r11[r12]
        L_0x06fb:
            r9[r10] = r13
            int r10 = r10 + 1
            goto L_0x06ef
        L_0x0700:
            com.google.android.exoplayer2.trackselection.C14383a.m22777q(r1, r9)
            com.google.common.collect.Ordering r5 = com.google.common.collect.Ordering.natural()
            r5.getClass()
            com.google.common.collect.e1 r6 = new com.google.common.collect.e1
            r6.<init>(r5)
            java.lang.String r5 = "expectedValuesPerKey"
            r10 = 2
            com.google.common.collect.C16203o.m26215b(r10, r5)
            com.google.common.collect.f1 r5 = new com.google.common.collect.f1
            r5.<init>(r6)
            com.google.common.collect.s0 r5 = r5.mo57660a()
            r6 = 0
        L_0x071f:
            if (r6 >= r2) goto L_0x0786
            r10 = r4[r6]
            int r11 = r10.length
            r12 = 1
            if (r11 > r12) goto L_0x0729
            r14 = r8
            goto L_0x0781
        L_0x0729:
            int r10 = r10.length
            double[] r11 = new double[r10]
            r12 = 0
        L_0x072d:
            r13 = r4[r6]
            int r14 = r13.length
            r18 = 0
            if (r12 >= r14) goto L_0x074a
            r14 = r8
            r7 = r13[r12]
            r20 = -1
            int r13 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r13 != 0) goto L_0x073e
            goto L_0x0743
        L_0x073e:
            double r7 = (double) r7
            double r18 = java.lang.Math.log(r7)
        L_0x0743:
            r11[r12] = r18
            int r12 = r12 + 1
            r8 = r14
            r7 = 0
            goto L_0x072d
        L_0x074a:
            r14 = r8
            int r10 = r10 + -1
            r7 = r11[r10]
            r12 = 0
            r20 = r11[r12]
            double r7 = r7 - r20
            r12 = 0
        L_0x0755:
            if (r12 >= r10) goto L_0x0781
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r22 = r11[r12]
            int r12 = r12 + 1
            r24 = r11[r12]
            double r22 = r22 + r24
            double r22 = r22 * r20
            int r13 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x076a
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0771
        L_0x076a:
            r13 = 0
            r20 = r11[r13]
            double r22 = r22 - r20
            double r20 = r22 / r7
        L_0x0771:
            java.lang.Double r13 = java.lang.Double.valueOf(r20)
            r20 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.put(r13, r7)
            r7 = r20
            goto L_0x0755
        L_0x0781:
            int r6 = r6 + 1
            r8 = r14
            r7 = 0
            goto L_0x071f
        L_0x0786:
            r14 = r8
            java.util.Collection r5 = r5.values()
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf(r5)
            r6 = 0
        L_0x0790:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x07b2
            java.lang.Object r7 = r5.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r14[r7]
            r10 = 1
            int r8 = r8 + r10
            r14[r7] = r8
            r10 = r4[r7]
            r11 = r10[r8]
            r9[r7] = r11
            com.google.android.exoplayer2.trackselection.C14383a.m22777q(r1, r9)
            int r6 = r6 + 1
            goto L_0x0790
        L_0x07b2:
            r4 = 0
        L_0x07b3:
            if (r4 >= r2) goto L_0x07c5
            java.lang.Object r5 = r1.get(r4)
            if (r5 == 0) goto L_0x07c2
            r5 = r9[r4]
            r7 = 2
            long r5 = r5 * r7
            r9[r4] = r5
        L_0x07c2:
            int r4 = r4 + 1
            goto L_0x07b3
        L_0x07c5:
            com.google.android.exoplayer2.trackselection.C14383a.m22777q(r1, r9)
            com.google.common.collect.ImmutableList$a r4 = com.google.common.collect.ImmutableList.builder()
            r5 = 0
        L_0x07cd:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x07ea
            java.lang.Object r6 = r1.get(r5)
            com.google.common.collect.ImmutableList$a r6 = (com.google.common.collect.ImmutableList.C15953a) r6
            if (r6 != 0) goto L_0x07e0
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.m25826of()
            goto L_0x07e4
        L_0x07e0:
            com.google.common.collect.ImmutableList r6 = r6.mo56664e()
        L_0x07e4:
            r4.mo56633b(r6)
            int r5 = r5 + 1
            goto L_0x07cd
        L_0x07ea:
            com.google.common.collect.ImmutableList r1 = r4.mo56664e()
            com.google.android.exoplayer2.trackselection.b[] r4 = new com.google.android.exoplayer2.trackselection.C14386b[r2]
            r5 = 0
        L_0x07f1:
            if (r5 >= r2) goto L_0x0845
            r6 = r37[r5]
            if (r6 == 0) goto L_0x0841
            int[] r7 = r6.f32401b
            int r8 = r7.length
            if (r8 != 0) goto L_0x07fd
            goto L_0x0841
        L_0x07fd:
            int r8 = r7.length
            r9 = 1
            if (r8 != r9) goto L_0x080e
            yi.c r8 = new yi.c
            com.google.android.exoplayer2.source.TrackGroup r9 = r6.f32400a
            r10 = 0
            r7 = r7[r10]
            int r6 = r6.f32402c
            r8.<init>(r9, r7, r6)
            goto L_0x083e
        L_0x080e:
            r10 = 0
            com.google.android.exoplayer2.source.TrackGroup r8 = r6.f32400a
            int r6 = r6.f32402c
            java.lang.Object r9 = r1.get(r5)
            r31 = r9
            com.google.common.collect.ImmutableList r31 = (com.google.common.collect.ImmutableList) r31
            com.google.android.exoplayer2.trackselection.a r9 = new com.google.android.exoplayer2.trackselection.a
            r11 = 10000(0x2710, float:1.4013E-41)
            long r11 = (long) r11
            r13 = 25000(0x61a8, float:3.5032E-41)
            long r13 = (long) r13
            r29 = 1060320051(0x3f333333, float:0.7)
            r30 = 1061158912(0x3f400000, float:0.75)
            bj.v r32 = p513bj.C14046a.f30907a
            r18 = r9
            r19 = r8
            r20 = r7
            r21 = r6
            r22 = r0
            r23 = r11
            r25 = r13
            r27 = r13
            r18.<init>(r19, r20, r21, r22, r23, r25, r27, r29, r30, r31, r32)
            r8 = r9
        L_0x083e:
            r4[r5] = r8
            goto L_0x0842
        L_0x0841:
            r10 = 0
        L_0x0842:
            int r5 = r5 + 1
            goto L_0x07f1
        L_0x0845:
            r10 = 0
            jh.f1[] r0 = new p594jh.C17911f1[r2]
            r1 = r10
        L_0x0849:
            if (r1 >= r2) goto L_0x086b
            boolean r5 = r15.getRendererDisabled(r1)
            if (r5 != 0) goto L_0x085e
            int[] r5 = r3.f32405b
            r5 = r5[r1]
            r6 = 7
            if (r5 == r6) goto L_0x085c
            r5 = r4[r1]
            if (r5 == 0) goto L_0x085f
        L_0x085c:
            r5 = 1
            goto L_0x0860
        L_0x085e:
            r6 = 7
        L_0x085f:
            r5 = r10
        L_0x0860:
            if (r5 == 0) goto L_0x0865
            jh.f1 r5 = p594jh.C17911f1.f38895b
            goto L_0x0866
        L_0x0865:
            r5 = 0
        L_0x0866:
            r0[r1] = r5
            int r1 = r1 + 1
            goto L_0x0849
        L_0x086b:
            boolean r1 = r15.tunnelingEnabled
            if (r1 == 0) goto L_0x08da
            r2 = r10
            r1 = -1
            r5 = -1
        L_0x0872:
            int r6 = r3.f32404a
            if (r2 >= r6) goto L_0x08c4
            int[] r6 = r3.f32405b
            r6 = r6[r2]
            r7 = r4[r2]
            r8 = 1
            if (r6 == r8) goto L_0x0885
            r8 = 2
            if (r6 != r8) goto L_0x0883
            goto L_0x0886
        L_0x0883:
            r6 = -1
            goto L_0x08c1
        L_0x0885:
            r8 = 2
        L_0x0886:
            if (r7 == 0) goto L_0x0883
            r9 = r33[r2]
            com.google.android.exoplayer2.source.TrackGroupArray[] r11 = r3.f32406c
            r11 = r11[r2]
            com.google.android.exoplayer2.source.TrackGroup r12 = r7.mo70315h()
            int r11 = r11.indexOf(r12)
            r12 = r10
        L_0x0897:
            int r13 = r7.length()
            if (r12 >= r13) goto L_0x08af
            r13 = r9[r11]
            int r14 = r7.mo70312d(r12)
            r13 = r13[r14]
            r14 = 32
            r13 = r13 & r14
            if (r13 == r14) goto L_0x08ac
            r7 = r10
            goto L_0x08b0
        L_0x08ac:
            int r12 = r12 + 1
            goto L_0x0897
        L_0x08af:
            r7 = 1
        L_0x08b0:
            if (r7 == 0) goto L_0x0883
            r7 = 1
            if (r6 != r7) goto L_0x08bb
            r6 = -1
            if (r5 == r6) goto L_0x08b9
            goto L_0x08be
        L_0x08b9:
            r5 = r2
            goto L_0x08c1
        L_0x08bb:
            r6 = -1
            if (r1 == r6) goto L_0x08c0
        L_0x08be:
            r2 = r10
            goto L_0x08c6
        L_0x08c0:
            r1 = r2
        L_0x08c1:
            int r2 = r2 + 1
            goto L_0x0872
        L_0x08c4:
            r6 = -1
            r2 = 1
        L_0x08c6:
            if (r5 == r6) goto L_0x08cc
            if (r1 == r6) goto L_0x08cc
            r7 = 1
            goto L_0x08cd
        L_0x08cc:
            r7 = r10
        L_0x08cd:
            r2 = r2 & r7
            if (r2 == 0) goto L_0x08da
            jh.f1 r2 = new jh.f1
            r6 = 1
            r2.<init>(r6)
            r0[r5] = r2
            r0[r1] = r2
        L_0x08da:
            android.util.Pair r0 = android.util.Pair.create(r0, r4)
            yi.g r1 = new yi.g
            java.lang.Object r2 = r0.first
            jh.f1[] r2 = (p594jh.C17911f1[]) r2
            java.lang.Object r0 = r0.second
            com.google.android.exoplayer2.trackselection.b[] r0 = (com.google.android.exoplayer2.trackselection.C14386b[]) r0
            r1.<init>(r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C14389c.mo47902b(jh.e1[], com.google.android.exoplayer2.source.TrackGroupArray):yi.g");
    }
}
