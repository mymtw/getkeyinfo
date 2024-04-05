package p710xi;

import p513bj.C14077r;
import p636oi.C18298b;

/* renamed from: xi.h */
public final class C18782h extends C18298b {

    /* renamed from: m */
    public final C14077r f41648m = new C14077r();

    /* renamed from: n */
    public final C18771a f41649n = new C18771a();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010f, code lost:
        if (")".equals(p710xi.C18771a.m31673b(r10, r11)) == false) goto L_0x0111;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0312 A[EDGE_INSN: B:202:0x0312->B:163:0x0312 ?: BREAK  
    EDGE_INSN: B:203:0x0312->B:163:0x0312 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p636oi.C18300d mo69840g(int r21, boolean r22, byte[] r23) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r20 = this;
            r1 = r20
            bj.r r0 = r1.f41648m
            r2 = r21
            r3 = r23
            r0.mo46933x(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            bj.r r2 = r1.f41648m     // Catch:{ ParserException -> 0x0368 }
            p710xi.C18783i.m31694d(r2)     // Catch:{ ParserException -> 0x0368 }
        L_0x0015:
            bj.r r2 = r1.f41648m
            java.lang.String r2 = r2.mo46913d()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0027:
            bj.r r3 = r1.f41648m
            r4 = 3
            r5 = 2
            r6 = -1
            r7 = 0
            r8 = 1
            r9 = r6
            r10 = r7
        L_0x0030:
            if (r9 != r6) goto L_0x0052
            int r10 = r3.f30987b
            java.lang.String r9 = r3.mo46913d()
            if (r9 != 0) goto L_0x003c
            r9 = r7
            goto L_0x0030
        L_0x003c:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L_0x0046
            r9 = r5
            goto L_0x0030
        L_0x0046:
            java.lang.String r11 = "NOTE"
            boolean r9 = r9.startsWith(r11)
            if (r9 == 0) goto L_0x0050
            r9 = r8
            goto L_0x0030
        L_0x0050:
            r9 = r4
            goto L_0x0030
        L_0x0052:
            r3.mo46935z(r10)
            if (r9 == 0) goto L_0x0362
            if (r9 != r8) goto L_0x0066
            bj.r r3 = r1.f41648m
        L_0x005b:
            java.lang.String r4 = r3.mo46913d()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x005b
        L_0x0066:
            if (r9 != r5) goto L_0x031f
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0317
            bj.r r4 = r1.f41648m
            r4.mo46913d()
            xi.a r4 = r1.f41649n
            bj.r r9 = r1.f41648m
            java.lang.StringBuilder r10 = r4.f41602b
            r10.setLength(r7)
            int r10 = r9.f30987b
        L_0x007e:
            java.lang.String r11 = r9.mo46913d()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x007e
            bj.r r11 = r4.f41601a
            byte[] r12 = r9.f30986a
            int r9 = r9.f30987b
            r11.mo46933x(r9, r12)
            bj.r r9 = r4.f41601a
            r9.mo46935z(r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x009b:
            bj.r r10 = r4.f41601a
            java.lang.StringBuilder r11 = r4.f41602b
            p710xi.C18771a.m31674c(r10)
            int r12 = r10.f30988c
            int r13 = r10.f30987b
            int r12 = r12 - r13
            r13 = 5
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            if (r12 >= r13) goto L_0x00b0
            goto L_0x0111
        L_0x00b0:
            java.lang.String r12 = r10.mo46922m(r13)
            java.lang.String r13 = "::cue"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00bd
            goto L_0x0111
        L_0x00bd:
            int r12 = r10.f30987b
            java.lang.String r13 = p710xi.C18771a.m31673b(r10, r11)
            if (r13 != 0) goto L_0x00c6
            goto L_0x0111
        L_0x00c6:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00d1
            r10.mo46935z(r12)
            r3 = r15
            goto L_0x0112
        L_0x00d1:
            java.lang.String r12 = "("
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0104
            int r12 = r10.f30987b
            int r13 = r10.f30988c
            r16 = r7
        L_0x00df:
            if (r12 >= r13) goto L_0x00f6
            if (r16 != 0) goto L_0x00f6
            byte[] r3 = r10.f30986a
            int r16 = r12 + 1
            byte r3 = r3[r12]
            char r3 = (char) r3
            r12 = 41
            if (r3 != r12) goto L_0x00f0
            r3 = r8
            goto L_0x00f1
        L_0x00f0:
            r3 = r7
        L_0x00f1:
            r12 = r16
            r16 = r3
            goto L_0x00df
        L_0x00f6:
            int r12 = r12 + -1
            int r3 = r10.f30987b
            int r12 = r12 - r3
            java.lang.String r3 = r10.mo46922m(r12)
            java.lang.String r3 = r3.trim()
            goto L_0x0105
        L_0x0104:
            r3 = 0
        L_0x0105:
            java.lang.String r10 = p710xi.C18771a.m31673b(r10, r11)
            java.lang.String r11 = ")"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0112
        L_0x0111:
            r3 = 0
        L_0x0112:
            if (r3 == 0) goto L_0x0312
            bj.r r10 = r4.f41601a
            java.lang.StringBuilder r11 = r4.f41602b
            java.lang.String r10 = p710xi.C18771a.m31673b(r10, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0124
            goto L_0x0312
        L_0x0124:
            xi.d r10 = new xi.d
            r10.<init>()
            boolean r11 = r15.equals(r3)
            if (r11 == 0) goto L_0x0130
            goto L_0x0196
        L_0x0130:
            r11 = 91
            int r11 = r3.indexOf(r11)
            if (r11 == r6) goto L_0x0155
            java.util.regex.Pattern r12 = p710xi.C18771a.f41600c
            java.lang.String r13 = r3.substring(r11)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r13 = r12.matches()
            if (r13 == 0) goto L_0x0151
            java.lang.String r12 = r12.group(r8)
            r12.getClass()
            r10.f41608d = r12
        L_0x0151:
            java.lang.String r3 = r3.substring(r7, r11)
        L_0x0155:
            int r11 = p513bj.C14049b0.f30913a
            java.lang.String r11 = "\\."
            java.lang.String[] r3 = r3.split(r11, r6)
            r11 = r3[r7]
            r12 = 35
            int r12 = r11.indexOf(r12)
            if (r12 == r6) goto L_0x0176
            java.lang.String r13 = r11.substring(r7, r12)
            r10.f41606b = r13
            int r12 = r12 + 1
            java.lang.String r11 = r11.substring(r12)
            r10.f41605a = r11
            goto L_0x0178
        L_0x0176:
            r10.f41606b = r11
        L_0x0178:
            int r11 = r3.length
            if (r11 <= r8) goto L_0x0196
            int r11 = r3.length
            int r12 = r3.length
            if (r11 > r12) goto L_0x0181
            r12 = r8
            goto L_0x0182
        L_0x0181:
            r12 = r7
        L_0x0182:
            p513bj.C14075p.m21691c(r12)
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r3, r8, r11)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.HashSet r11 = new java.util.HashSet
            java.util.List r3 = java.util.Arrays.asList(r3)
            r11.<init>(r3)
            r10.f41607c = r11
        L_0x0196:
            r3 = r7
            r11 = 0
        L_0x0198:
            java.lang.String r12 = "}"
            if (r3 != 0) goto L_0x02fd
            bj.r r3 = r4.f41601a
            int r11 = r3.f30987b
            java.lang.StringBuilder r13 = r4.f41602b
            java.lang.String r3 = p710xi.C18771a.m31673b(r3, r13)
            if (r3 == 0) goto L_0x01b1
            boolean r13 = r12.equals(r3)
            if (r13 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r13 = r7
            goto L_0x01b2
        L_0x01b1:
            r13 = r8
        L_0x01b2:
            if (r13 != 0) goto L_0x02ec
            bj.r r14 = r4.f41601a
            r14.mo46935z(r11)
            bj.r r11 = r4.f41601a
            java.lang.StringBuilder r14 = r4.f41602b
            p710xi.C18771a.m31674c(r11)
            java.lang.String r6 = p710xi.C18771a.m31672a(r11, r14)
            boolean r16 = r15.equals(r6)
            if (r16 == 0) goto L_0x01cc
            goto L_0x02ec
        L_0x01cc:
            java.lang.String r7 = p710xi.C18771a.m31673b(r11, r14)
            java.lang.String r5 = ":"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x01de
            r17 = r3
            r18 = r4
            goto L_0x0270
        L_0x01de:
            p710xi.C18771a.m31674c(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = 0
        L_0x01e7:
            java.lang.String r8 = ";"
            if (r7 != 0) goto L_0x0213
            r17 = r3
            int r3 = r11.f30987b
            r18 = r4
            java.lang.String r4 = p710xi.C18771a.m31673b(r11, r14)
            if (r4 != 0) goto L_0x01f9
            r3 = 0
            goto L_0x021b
        L_0x01f9:
            boolean r19 = r12.equals(r4)
            if (r19 != 0) goto L_0x020a
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0206
            goto L_0x020a
        L_0x0206:
            r5.append(r4)
            goto L_0x020e
        L_0x020a:
            r11.mo46935z(r3)
            r7 = 1
        L_0x020e:
            r3 = r17
            r4 = r18
            goto L_0x01e7
        L_0x0213:
            r17 = r3
            r18 = r4
            java.lang.String r3 = r5.toString()
        L_0x021b:
            if (r3 == 0) goto L_0x0270
            boolean r4 = r15.equals(r3)
            if (r4 == 0) goto L_0x0224
            goto L_0x0270
        L_0x0224:
            int r4 = r11.f30987b
            java.lang.String r5 = p710xi.C18771a.m31673b(r11, r14)
            boolean r7 = r8.equals(r5)
            if (r7 == 0) goto L_0x0231
            goto L_0x023a
        L_0x0231:
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0270
            r11.mo46935z(r4)
        L_0x023a:
            java.lang.String r4 = "color"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x024c
            r4 = 1
            int r3 = p513bj.C14048b.m21619a(r3, r4)
            r10.f41610f = r3
            r10.f41611g = r4
            goto L_0x0270
        L_0x024c:
            r4 = 1
            java.lang.String r5 = "background-color"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x025e
            int r3 = p513bj.C14048b.m21619a(r3, r4)
            r10.f41612h = r3
            r10.f41613i = r4
            goto L_0x0270
        L_0x025e:
            java.lang.String r5 = "ruby-position"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0280
            java.lang.String r5 = "over"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0274
            r10.f41619o = r4
        L_0x0270:
            r4 = 2
        L_0x0271:
            r5 = 1
            goto L_0x02f2
        L_0x0274:
            java.lang.String r4 = "under"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0270
            r4 = 2
            r10.f41619o = r4
            goto L_0x0271
        L_0x0280:
            r4 = 2
            java.lang.String r5 = "text-combine-upright"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02a0
            java.lang.String r5 = "all"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x029c
            java.lang.String r5 = "digits"
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x029a
            goto L_0x029c
        L_0x029a:
            r3 = 0
            goto L_0x029d
        L_0x029c:
            r3 = 1
        L_0x029d:
            r10.f41620p = r3
            goto L_0x0271
        L_0x02a0:
            java.lang.String r5 = "text-decoration"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02b5
            java.lang.String r5 = "underline"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0271
            r3 = 1
            r10.f41615k = r3
            r5 = r3
            goto L_0x02f2
        L_0x02b5:
            java.lang.String r5 = "font-family"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02c4
            java.lang.String r3 = p001a0.C0005b.m56q0(r3)
            r10.f41609e = r3
            goto L_0x0271
        L_0x02c4:
            java.lang.String r5 = "font-weight"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02d8
            java.lang.String r5 = "bold"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0271
            r5 = 1
            r10.f41616l = r5
            goto L_0x02f2
        L_0x02d8:
            r5 = 1
            java.lang.String r7 = "font-style"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x02f2
            java.lang.String r6 = "italic"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x02f2
            r10.f41617m = r5
            goto L_0x02f2
        L_0x02ec:
            r17 = r3
            r18 = r4
            r4 = r5
            r5 = r8
        L_0x02f2:
            r8 = r5
            r3 = r13
            r11 = r17
            r6 = -1
            r7 = 0
            r5 = r4
            r4 = r18
            goto L_0x0198
        L_0x02fd:
            r18 = r4
            r4 = r5
            r5 = r8
            boolean r3 = r12.equals(r11)
            if (r3 == 0) goto L_0x030a
            r9.add(r10)
        L_0x030a:
            r8 = r5
            r6 = -1
            r7 = 0
            r5 = r4
            r4 = r18
            goto L_0x009b
        L_0x0312:
            r0.addAll(r9)
            goto L_0x0027
        L_0x0317:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r2 = "A style block was found after the first cue."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x031f:
            if (r9 != r4) goto L_0x0027
            bj.r r3 = r1.f41648m
            java.util.regex.Pattern r4 = p710xi.C18777g.f41624a
            java.lang.String r4 = r3.mo46913d()
            if (r4 != 0) goto L_0x032d
            r3 = 0
            goto L_0x035b
        L_0x032d:
            java.util.regex.Pattern r5 = p710xi.C18777g.f41624a
            java.util.regex.Matcher r6 = r5.matcher(r4)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L_0x033f
            r7 = 0
            xi.e r3 = p710xi.C18777g.m31684d(r7, r6, r3, r0)
            goto L_0x035b
        L_0x033f:
            r7 = 0
            java.lang.String r6 = r3.mo46913d()
            if (r6 != 0) goto L_0x0347
            goto L_0x035a
        L_0x0347:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x035a
            java.lang.String r4 = r4.trim()
            xi.e r3 = p710xi.C18777g.m31684d(r4, r5, r3, r0)
            goto L_0x035b
        L_0x035a:
            r3 = r7
        L_0x035b:
            if (r3 == 0) goto L_0x0027
            r2.add(r3)
            goto L_0x0027
        L_0x0362:
            xi.j r0 = new xi.j
            r0.<init>(r2)
            return r0
        L_0x0368:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p710xi.C18782h.mo69840g(int, boolean, byte[]):oi.d");
    }
}
