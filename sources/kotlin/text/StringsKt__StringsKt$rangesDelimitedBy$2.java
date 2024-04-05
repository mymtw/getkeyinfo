package kotlin.text;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements C19861p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ List<String> $delimitersList;
    public final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$2(List<String> list, boolean z) {
        super(2);
        this.$delimitersList = list;
        this.$ignoreCase = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CharSequence) obj, ((Number) obj2).intValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> invoke(java.lang.CharSequence r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "$this$$receiver"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            java.util.List<java.lang.String> r0 = r13.$delimitersList
            boolean r7 = r13.$ignoreCase
            r1 = 0
            r8 = 0
            if (r7 != 0) goto L_0x002e
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = kotlin.collections.C19327t.m32654j1(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 4
            int r14 = kotlin.text.C19459m.m33043l1(r14, r0, r15, r1, r2)
            if (r14 >= 0) goto L_0x0023
            goto L_0x00be
        L_0x0023:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r14, r0)
            goto L_0x00bf
        L_0x002e:
            pq.i r2 = new pq.i
            if (r15 >= 0) goto L_0x0033
            r15 = r1
        L_0x0033:
            int r1 = r14.length()
            r2.<init>(r15, r1)
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L_0x007f
            int r9 = r2.f44415c
            int r10 = r2.f44416d
            if (r10 <= 0) goto L_0x0046
            if (r15 <= r9) goto L_0x004a
        L_0x0046:
            if (r10 >= 0) goto L_0x00be
            if (r9 > r15) goto L_0x00be
        L_0x004a:
            java.util.Iterator r11 = r0.iterator()
        L_0x004e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r12 = r11.next()
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r1 = 0
            r5 = r14
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r4.length()
            r2 = r15
            r6 = r7
            boolean r1 = kotlin.text.C19457k.m33021Y0(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x004e
            goto L_0x006d
        L_0x006c:
            r12 = r8
        L_0x006d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x007b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r14, r12)
            goto L_0x00bf
        L_0x007b:
            if (r15 == r9) goto L_0x00be
            int r15 = r15 + r10
            goto L_0x004a
        L_0x007f:
            int r9 = r2.f44415c
            int r10 = r2.f44416d
            if (r10 <= 0) goto L_0x0087
            if (r15 <= r9) goto L_0x008b
        L_0x0087:
            if (r10 >= 0) goto L_0x00be
            if (r9 > r15) goto L_0x00be
        L_0x008b:
            java.util.Iterator r11 = r0.iterator()
        L_0x008f:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r12 = r11.next()
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            int r6 = r1.length()
            r2 = r7
            r4 = r14
            r5 = r15
            boolean r1 = kotlin.text.C19459m.m33049r1(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x008f
            goto L_0x00ac
        L_0x00ab:
            r12 = r8
        L_0x00ac:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00ba
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r14, r12)
            goto L_0x00bf
        L_0x00ba:
            if (r15 == r9) goto L_0x00be
            int r15 = r15 + r10
            goto L_0x008b
        L_0x00be:
            r15 = r8
        L_0x00bf:
            if (r15 == 0) goto L_0x00d8
            java.lang.Object r14 = r15.getFirst()
            java.lang.Object r15 = r15.getSecond()
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r14, r15)
        L_0x00d8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2.invoke(java.lang.CharSequence, int):kotlin.Pair");
    }
}
