package p694vi;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p636oi.C18296a;

/* renamed from: vi.d */
public final class C18650d {

    /* renamed from: a */
    public final String f41216a;

    /* renamed from: b */
    public final String f41217b;

    /* renamed from: c */
    public final boolean f41218c;

    /* renamed from: d */
    public final long f41219d;

    /* renamed from: e */
    public final long f41220e;

    /* renamed from: f */
    public final C18652f f41221f;

    /* renamed from: g */
    public final String[] f41222g;

    /* renamed from: h */
    public final String f41223h;

    /* renamed from: i */
    public final String f41224i;

    /* renamed from: j */
    public final C18650d f41225j;

    /* renamed from: k */
    public final HashMap<String, Integer> f41226k;

    /* renamed from: l */
    public final HashMap<String, Integer> f41227l;

    /* renamed from: m */
    public ArrayList f41228m;

    public C18650d(String str, String str2, long j, long j2, C18652f fVar, String[] strArr, String str3, String str4, C18650d dVar) {
        this.f41216a = str;
        this.f41217b = str2;
        this.f41224i = str4;
        this.f41221f = fVar;
        this.f41222g = strArr;
        this.f41218c = str2 != null;
        this.f41219d = j;
        this.f41220e = j2;
        str3.getClass();
        this.f41223h = str3;
        this.f41225j = dVar;
        this.f41226k = new HashMap<>();
        this.f41227l = new HashMap<>();
    }

    /* renamed from: a */
    public static C18650d m31470a(String str) {
        return new C18650d((String) null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (C18652f) null, (String[]) null, "", (String) null, (C18650d) null);
    }

    /* renamed from: e */
    public static SpannableStringBuilder m31471e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C18296a.C18297a aVar = new C18296a.C18297a();
            aVar.f40164a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((C18296a.C18297a) treeMap.get(str)).f40164a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: b */
    public final C18650d mo70154b(int i) {
        ArrayList arrayList = this.f41228m;
        if (arrayList != null) {
            return (C18650d) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public final int mo70155c() {
        ArrayList arrayList = this.f41228m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: d */
    public final void mo70156d(TreeSet<Long> treeSet, boolean z) {
        boolean equals = Constants.APPBOY_PUSH_PRIORITY_KEY.equals(this.f41216a);
        boolean equals2 = "div".equals(this.f41216a);
        if (z || equals || (equals2 && this.f41224i != null)) {
            long j = this.f41219d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f41220e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f41228m != null) {
            for (int i = 0; i < this.f41228m.size(); i++) {
                ((C18650d) this.f41228m.get(i)).mo70156d(treeSet, z || equals);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo70157f(long j) {
        long j2 = this.f41219d;
        return (j2 == -9223372036854775807L && this.f41220e == -9223372036854775807L) || (j2 <= j && this.f41220e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f41220e) || (j2 <= j && j < this.f41220e));
    }

    /* renamed from: g */
    public final void mo70158g(long j, String str, ArrayList arrayList) {
        if (!"".equals(this.f41223h)) {
            str = this.f41223h;
        }
        if (!mo70157f(j) || !"div".equals(this.f41216a) || this.f41224i == null) {
            for (int i = 0; i < mo70155c(); i++) {
                mo70154b(i).mo70158g(j, str, arrayList);
            }
            return;
        }
        arrayList.add(new Pair(str, this.f41224i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0267 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70159h(long r19, java.util.Map r21, java.util.Map r22, java.lang.String r23, java.util.TreeMap r24) {
        /*
            r18 = this;
            r0 = r18
            r8 = r21
            boolean r1 = r18.mo70157f(r19)
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r1 = r0.f41223h
            java.lang.String r2 = ""
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0018
            r9 = r23
            goto L_0x001b
        L_0x0018:
            java.lang.String r1 = r0.f41223h
            r9 = r1
        L_0x001b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f41227l
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x026b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f41226k
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x004c
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f41226k
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r5 == r2) goto L_0x0261
            r10 = r24
            java.lang.Object r4 = r10.get(r4)
            oi.a$a r4 = (p636oi.C18296a.C18297a) r4
            r4.getClass()
            r11 = r22
            java.lang.Object r6 = r11.get(r9)
            vi.e r6 = (p694vi.C18651e) r6
            r6.getClass()
            int r6 = r6.f41238j
            vi.f r7 = r0.f41221f
            java.lang.String[] r12 = r0.f41222g
            vi.f r7 = com.google.android.play.core.assetpacks.C15588c1.m25293M0(r7, r12, r8)
            java.lang.CharSequence r12 = r4.f40164a
            android.text.SpannableStringBuilder r12 = (android.text.SpannableStringBuilder) r12
            if (r12 != 0) goto L_0x0086
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            r4.f40164a = r12
        L_0x0086:
            if (r7 == 0) goto L_0x0265
            vi.d r13 = r0.f41225j
            int r14 = r7.f41246h
            r3 = -1
            if (r14 != r3) goto L_0x0094
            int r15 = r7.f41247i
            if (r15 != r3) goto L_0x0094
            goto L_0x00a2
        L_0x0094:
            r15 = 1
            if (r14 != r15) goto L_0x0099
            r14 = r15
            goto L_0x009a
        L_0x0099:
            r14 = 0
        L_0x009a:
            int r3 = r7.f41247i
            if (r3 != r15) goto L_0x00a0
            r3 = 2
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r3 = r3 | r14
        L_0x00a2:
            r15 = -1
            if (r3 == r15) goto L_0x00ca
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            int r14 = r7.f41246h
            r17 = r1
            if (r14 != r15) goto L_0x00b3
            int r1 = r7.f41247i
            if (r1 != r15) goto L_0x00b3
            r1 = -1
            goto L_0x00c1
        L_0x00b3:
            r1 = 1
            if (r14 != r1) goto L_0x00b8
            r14 = r1
            goto L_0x00b9
        L_0x00b8:
            r14 = 0
        L_0x00b9:
            int r15 = r7.f41247i
            if (r15 != r1) goto L_0x00bf
            r1 = 2
            goto L_0x00c0
        L_0x00bf:
            r1 = 0
        L_0x00c0:
            r1 = r1 | r14
        L_0x00c1:
            r3.<init>(r1)
            r1 = 33
            r12.setSpan(r3, r5, r2, r1)
            goto L_0x00ce
        L_0x00ca:
            r17 = r1
            r1 = 33
        L_0x00ce:
            int r3 = r7.f41244f
            r14 = 1
            if (r3 != r14) goto L_0x00d6
            r16 = r14
            goto L_0x00d8
        L_0x00d6:
            r16 = 0
        L_0x00d8:
            if (r16 == 0) goto L_0x00e2
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r1)
        L_0x00e2:
            int r3 = r7.f41245g
            if (r3 != r14) goto L_0x00e8
            r3 = 1
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            if (r3 == 0) goto L_0x00f3
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r1)
        L_0x00f3:
            boolean r1 = r7.f41241c
            if (r1 == 0) goto L_0x010e
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            boolean r3 = r7.f41241c
            if (r3 == 0) goto L_0x0106
            int r3 = r7.f41240b
            r1.<init>(r3)
            p568fn.C17782b.m29884s(r12, r1, r5, r2)
            goto L_0x010e
        L_0x0106:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Font color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x010e:
            boolean r1 = r7.f41243e
            if (r1 == 0) goto L_0x0129
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            boolean r3 = r7.f41243e
            if (r3 == 0) goto L_0x0121
            int r3 = r7.f41242d
            r1.<init>(r3)
            p568fn.C17782b.m29884s(r12, r1, r5, r2)
            goto L_0x0129
        L_0x0121:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Background color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x0129:
            java.lang.String r1 = r7.f41239a
            if (r1 == 0) goto L_0x0137
            android.text.style.TypefaceSpan r1 = new android.text.style.TypefaceSpan
            java.lang.String r3 = r7.f41239a
            r1.<init>(r3)
            p568fn.C17782b.m29884s(r12, r1, r5, r2)
        L_0x0137:
            vi.b r1 = r7.f41256r
            r3 = 3
            if (r1 == 0) goto L_0x015e
            int r14 = r1.f41197a
            r15 = -1
            if (r14 != r15) goto L_0x014e
            r15 = 2
            if (r6 == r15) goto L_0x014a
            r14 = 1
            if (r6 != r14) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r6 = 1
            goto L_0x014b
        L_0x014a:
            r6 = r3
        L_0x014b:
            r14 = r6
            r6 = 1
            goto L_0x0150
        L_0x014e:
            int r6 = r1.f41198b
        L_0x0150:
            int r1 = r1.f41199c
            r15 = -2
            if (r1 != r15) goto L_0x0156
            r1 = 1
        L_0x0156:
            si.d r15 = new si.d
            r15.<init>(r14, r6, r1)
            p568fn.C17782b.m29884s(r12, r15, r5, r2)
        L_0x015e:
            int r1 = r7.f41251m
            r6 = 2
            if (r1 == r6) goto L_0x0174
            if (r1 == r3) goto L_0x0169
            r6 = 4
            if (r1 == r6) goto L_0x0169
            goto L_0x01c7
        L_0x0169:
            vi.a r1 = new vi.a
            r1.<init>()
            r6 = 33
            r12.setSpan(r1, r5, r2, r6)
            goto L_0x01c7
        L_0x0174:
            if (r13 == 0) goto L_0x0189
            vi.f r6 = r13.f41221f
            java.lang.String[] r14 = r13.f41222g
            vi.f r6 = com.google.android.play.core.assetpacks.C15588c1.m25293M0(r6, r14, r8)
            if (r6 == 0) goto L_0x0186
            int r6 = r6.f41251m
            r14 = 1
            if (r6 != r14) goto L_0x0186
            goto L_0x018a
        L_0x0186:
            vi.d r13 = r13.f41225j
            goto L_0x0174
        L_0x0189:
            r13 = 0
        L_0x018a:
            if (r13 != 0) goto L_0x018d
            goto L_0x01c7
        L_0x018d:
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>()
            r6.push(r13)
        L_0x0195:
            boolean r14 = r6.isEmpty()
            if (r14 != 0) goto L_0x01c4
            java.lang.Object r14 = r6.pop()
            vi.d r14 = (p694vi.C18650d) r14
            vi.f r15 = r14.f41221f
            java.lang.String[] r1 = r14.f41222g
            vi.f r1 = com.google.android.play.core.assetpacks.C15588c1.m25293M0(r15, r1, r8)
            if (r1 == 0) goto L_0x01b1
            int r1 = r1.f41251m
            if (r1 != r3) goto L_0x01b1
            r1 = r14
            goto L_0x01c5
        L_0x01b1:
            int r1 = r14.mo70155c()
            r15 = -1
            int r1 = r1 + r15
        L_0x01b7:
            if (r1 < 0) goto L_0x0195
            vi.d r15 = r14.mo70154b(r1)
            r6.push(r15)
            int r1 = r1 + -1
            r15 = -1
            goto L_0x01b7
        L_0x01c4:
            r1 = 0
        L_0x01c5:
            if (r1 != 0) goto L_0x01c9
        L_0x01c7:
            r6 = 0
            goto L_0x01fc
        L_0x01c9:
            int r6 = r1.mo70155c()
            r14 = 1
            if (r6 != r14) goto L_0x01f4
            r6 = 0
            vi.d r14 = r1.mo70154b(r6)
            java.lang.String r14 = r14.f41217b
            if (r14 == 0) goto L_0x01f5
            vi.d r1 = r1.mo70154b(r6)
            java.lang.String r1 = r1.f41217b
            int r14 = p513bj.C14049b0.f30913a
            vi.f r13 = r13.f41221f
            if (r13 == 0) goto L_0x01e8
            int r13 = r13.f41252n
            goto L_0x01e9
        L_0x01e8:
            r13 = -1
        L_0x01e9:
            si.c r14 = new si.c
            r14.<init>(r1, r13)
            r1 = 33
            r12.setSpan(r14, r5, r2, r1)
            goto L_0x01fc
        L_0x01f4:
            r6 = 0
        L_0x01f5:
            java.lang.String r1 = "TtmlRenderUtil"
            java.lang.String r13 = "Skipping rubyText node without exactly one text child."
            android.util.Log.i(r1, r13)
        L_0x01fc:
            int r1 = r7.f41255q
            r13 = 1
            if (r1 != r13) goto L_0x0202
            r6 = r13
        L_0x0202:
            if (r6 == 0) goto L_0x020c
            si.a r1 = new si.a
            r1.<init>()
            p568fn.C17782b.m29884s(r12, r1, r5, r2)
        L_0x020c:
            int r1 = r7.f41248j
            r6 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r13) goto L_0x022f
            r13 = 2
            if (r1 == r13) goto L_0x0224
            if (r1 == r3) goto L_0x0218
            goto L_0x023b
        L_0x0218:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r3 = r7.f41249k
            float r3 = r3 / r6
            r1.<init>(r3)
            p568fn.C17782b.m29884s(r12, r1, r5, r2)
            goto L_0x023b
        L_0x0224:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r3 = r7.f41249k
            r1.<init>(r3)
            p568fn.C17782b.m29884s(r12, r1, r5, r2)
            goto L_0x023b
        L_0x022f:
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r3 = r7.f41249k
            int r3 = (int) r3
            r13 = 1
            r1.<init>(r3, r13)
            p568fn.C17782b.m29884s(r12, r1, r5, r2)
        L_0x023b:
            java.lang.String r1 = r0.f41216a
            java.lang.String r2 = "p"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0267
            float r1 = r7.f41257s
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0254
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r2
            float r1 = r1 / r6
            r4.f40180q = r1
        L_0x0254:
            android.text.Layout$Alignment r1 = r7.f41253o
            if (r1 == 0) goto L_0x025a
            r4.f40166c = r1
        L_0x025a:
            android.text.Layout$Alignment r1 = r7.f41254p
            if (r1 == 0) goto L_0x0267
            r4.f40167d = r1
            goto L_0x0267
        L_0x0261:
            r11 = r22
            r10 = r24
        L_0x0265:
            r17 = r1
        L_0x0267:
            r1 = r17
            goto L_0x0025
        L_0x026b:
            r11 = r22
            r10 = r24
            r6 = 0
            r12 = r6
        L_0x0271:
            int r1 = r18.mo70155c()
            if (r12 >= r1) goto L_0x028a
            vi.d r1 = r0.mo70154b(r12)
            r2 = r19
            r4 = r21
            r5 = r22
            r6 = r9
            r7 = r24
            r1.mo70159h(r2, r4, r5, r6, r7)
            int r12 = r12 + 1
            goto L_0x0271
        L_0x028a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p694vi.C18650d.mo70159h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    /* renamed from: i */
    public final void mo70160i(long j, boolean z, String str, TreeMap treeMap) {
        this.f41226k.clear();
        this.f41227l.clear();
        if (!ResponseConstants.METADATA.equals(this.f41216a)) {
            if (!"".equals(this.f41223h)) {
                str = this.f41223h;
            }
            if (this.f41218c && z) {
                SpannableStringBuilder e = m31471e(str, treeMap);
                String str2 = this.f41217b;
                str2.getClass();
                e.append(str2);
            } else if ("br".equals(this.f41216a) && z) {
                m31471e(str, treeMap).append(10);
            } else if (mo70157f(j)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((C18296a.C18297a) entry.getValue()).f40164a;
                    charSequence.getClass();
                    this.f41226k.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = Constants.APPBOY_PUSH_PRIORITY_KEY.equals(this.f41216a);
                for (int i = 0; i < mo70155c(); i++) {
                    mo70154b(i).mo70160i(j, z || equals, str, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e2 = m31471e(str, treeMap);
                    int length = e2.length();
                    do {
                        length--;
                        if (length < 0 || e2.charAt(length) != ' ') {
                            if (length >= 0 && e2.charAt(length) != 10) {
                                e2.append(10);
                            }
                        }
                        length--;
                        break;
                    } while (e2.charAt(length) != ' ');
                    e2.append(10);
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((C18296a.C18297a) entry2.getValue()).f40164a;
                    charSequence2.getClass();
                    this.f41227l.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
