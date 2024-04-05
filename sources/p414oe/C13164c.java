package p414oe;

import com.etsy.android.R;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType;
import com.etsy.android.p327ui.util.C11786n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C19383o;

/* renamed from: oe.c */
public final class C13164c {

    /* renamed from: a */
    public final C8630b f28962a;

    /* renamed from: b */
    public final C8629a f28963b;

    /* renamed from: c */
    public final C11786n f28964c;

    /* renamed from: d */
    public SearchOptions f28965d;

    /* renamed from: e */
    public int f28966e;

    /* renamed from: f */
    public boolean f28967f;

    /* renamed from: oe.c$a */
    public /* synthetic */ class C13165a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28968a;

        static {
            int[] iArr = new int[PriceFilterOptionType.values().length];
            iArr[PriceFilterOptionType.ANY_PRICE.ordinal()] = 1;
            iArr[PriceFilterOptionType.PRICE_RANGE.ordinal()] = 2;
            iArr[PriceFilterOptionType.CUSTOM.ordinal()] = 3;
            f28968a = iArr;
        }
    }

    public C13164c(C8630b bVar, C8629a aVar, C11786n nVar) {
        C19383o.m32797g(bVar, "moneyFactory");
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f28962a = bVar;
        this.f28963b = aVar;
        this.f28964c = nVar;
    }

    /* renamed from: b */
    public static void m20817b(C13166d dVar, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C13166d) next).f28971c != dVar.f28971c) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((C13166d) it2.next()).f28972d = false;
        }
    }

    /* renamed from: d */
    public static int m20818d(ArrayList arrayList) {
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            if (((C13166d) listIterator.previous()).f28972d) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static BigDecimal m20819e(C13166d dVar, ArrayList arrayList) {
        C19383o.m32797g(dVar, "selectedOption");
        PriceFilterOptionType priceFilterOptionType = dVar.f28971c;
        if (priceFilterOptionType == PriceFilterOptionType.ANY_PRICE || priceFilterOptionType == PriceFilterOptionType.CUSTOM) {
            return dVar.f28969a.f28950b;
        }
        int d = m20818d(arrayList);
        return (d == -1 || d >= arrayList.size()) ? (BigDecimal) SearchOptions.DEFAULT_HIGH_PRICE : ((C13166d) arrayList.get(d)).f28969a.f28950b;
    }

    /* renamed from: f */
    public static BigDecimal m20820f(C13166d dVar, ArrayList arrayList) {
        C19383o.m32797g(dVar, "selectedOption");
        PriceFilterOptionType priceFilterOptionType = dVar.f28971c;
        int i = 0;
        if (priceFilterOptionType == PriceFilterOptionType.ANY_PRICE || priceFilterOptionType == PriceFilterOptionType.CUSTOM) {
            return dVar.f28969a.f28949a;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((C13166d) it.next()).f28972d) {
                break;
            } else {
                i++;
            }
        }
        return (i == -1 || i >= arrayList.size()) ? SearchOptions.DEFAULT_LOW_PRICE : ((C13166d) arrayList.get(i)).f28969a.f28949a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: oe.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: oe.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: oe.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: oe.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m20821h(p414oe.C13166d r5, java.util.List r6, boolean r7) {
        /*
            java.lang.String r0 = "selectedOption"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            java.lang.String r0 = "existingPriceOptions"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.C19322o.m32624F0(r6)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0017:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r6.next()
            oe.d r1 = (p414oe.C13166d) r1
            oe.d r1 = p414oe.C13166d.m20828a(r1)
            r0.add(r1)
            goto L_0x0017
        L_0x002b:
            java.util.Iterator r6 = r0.iterator()
        L_0x002f:
            boolean r1 = r6.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r6.next()
            r3 = r1
            oe.d r3 = (p414oe.C13166d) r3
            oe.a r3 = r3.f28969a
            oe.a r4 = r5.f28969a
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x002f
            goto L_0x0049
        L_0x0048:
            r1 = r2
        L_0x0049:
            oe.d r1 = (p414oe.C13166d) r1
            if (r1 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1.f28972d = r7
        L_0x0050:
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r6 = r5.f28971c
            int[] r7 = p414oe.C13164c.C13165a.f28968a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            r7 = 1
            if (r6 == r7) goto L_0x00de
            r1 = 2
            if (r6 == r1) goto L_0x006a
            r7 = 3
            if (r6 == r7) goto L_0x0065
            goto L_0x00e1
        L_0x0065:
            m20817b(r5, r0)
            goto L_0x00e1
        L_0x006a:
            java.util.Iterator r5 = r0.iterator()
        L_0x006e:
            boolean r6 = r5.hasNext()
            r1 = 0
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r5.next()
            r3 = r6
            oe.d r3 = (p414oe.C13166d) r3
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r3 = r3.f28971c
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r4 = com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType.ANY_PRICE
            if (r3 != r4) goto L_0x0084
            r3 = r7
            goto L_0x0085
        L_0x0084:
            r3 = r1
        L_0x0085:
            if (r3 == 0) goto L_0x006e
            goto L_0x0089
        L_0x0088:
            r6 = r2
        L_0x0089:
            oe.d r6 = (p414oe.C13166d) r6
            if (r6 != 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r6.f28972d = r1
        L_0x0090:
            java.util.Iterator r5 = r0.iterator()
        L_0x0094:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r6 = r5.next()
            r3 = r6
            oe.d r3 = (p414oe.C13166d) r3
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r3 = r3.f28971c
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r4 = com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType.CUSTOM
            if (r3 != r4) goto L_0x00a9
            r3 = r7
            goto L_0x00aa
        L_0x00a9:
            r3 = r1
        L_0x00aa:
            if (r3 == 0) goto L_0x0094
            r2 = r6
        L_0x00ad:
            oe.d r2 = (p414oe.C13166d) r2
            if (r2 != 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r2.f28972d = r1
        L_0x00b4:
            java.util.Iterator r5 = r0.iterator()
        L_0x00b8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r6 = r5.next()
            oe.d r6 = (p414oe.C13166d) r6
            boolean r6 = r6.f28972d
            if (r6 == 0) goto L_0x00c9
            goto L_0x00cd
        L_0x00c9:
            int r1 = r1 + 1
            goto L_0x00b8
        L_0x00cc:
            r1 = -1
        L_0x00cd:
            int r5 = m20818d(r0)
        L_0x00d1:
            if (r1 >= r5) goto L_0x00e1
            java.lang.Object r6 = r0.get(r1)
            oe.d r6 = (p414oe.C13166d) r6
            r6.f28972d = r7
            int r1 = r1 + 1
            goto L_0x00d1
        L_0x00de:
            m20817b(r5, r0)
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p414oe.C13164c.m20821h(oe.d, java.util.List, boolean):java.util.ArrayList");
    }

    /* renamed from: j */
    public static boolean m20822j(BigDecimal bigDecimal, List list) {
        return C19383o.m32792b(bigDecimal, BigDecimal.ZERO) || bigDecimal == null || list.contains(Integer.valueOf(bigDecimal.intValue()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p414oe.C13163b mo45881a(com.etsy.android.p327ui.search.p330v2.SearchOptions r19, java.util.List r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "priceList"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            java.lang.String r3 = "searchOptions"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r0.f28965d = r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r4 = r18.mo45884i()
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L_0x0096
            com.etsy.android.ui.search.v2.SearchOptions r4 = r0.f28965d
            if (r4 == 0) goto L_0x0092
            boolean r4 = r4.getUserSpecifiedMin()
            if (r4 != 0) goto L_0x0096
            com.etsy.android.ui.search.v2.SearchOptions r4 = r0.f28965d
            if (r4 == 0) goto L_0x008e
            boolean r4 = r4.getUserSpecifiedMax()
            if (r4 == 0) goto L_0x0034
            goto L_0x0096
        L_0x0034:
            com.etsy.android.ui.search.v2.SearchOptions r4 = r0.f28965d
            if (r4 == 0) goto L_0x008a
            java.math.BigDecimal r4 = r4.getMinPrice()
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L_0x005b
            com.etsy.android.ui.search.v2.SearchOptions r4 = r0.f28965d
            if (r4 == 0) goto L_0x0057
            java.math.BigDecimal r3 = r4.getMaxPrice()
            boolean r3 = m20822j(r3, r2)
            goto L_0x0097
        L_0x0057:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r6
        L_0x005b:
            com.etsy.android.ui.search.v2.SearchOptions r4 = r0.f28965d
            if (r4 == 0) goto L_0x0086
            java.math.BigDecimal r4 = r4.getMaxPrice()
            if (r4 == 0) goto L_0x006e
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x006f
        L_0x006e:
            r4 = r6
        L_0x006f:
            boolean r4 = kotlin.collections.C19327t.m32634P0(r4, r2)
            if (r4 == 0) goto L_0x0096
            com.etsy.android.ui.search.v2.SearchOptions r4 = r0.f28965d
            if (r4 == 0) goto L_0x0082
            java.math.BigDecimal r3 = r4.getMinPrice()
            boolean r3 = m20822j(r3, r2)
            goto L_0x0097
        L_0x0082:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r6
        L_0x0086:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r6
        L_0x008a:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r6
        L_0x008e:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r6
        L_0x0092:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r6
        L_0x0096:
            r3 = r5
        L_0x0097:
            r0.f28967f = r3
            boolean r3 = r20.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0217
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r10 = "ZERO"
            if (r21 != 0) goto L_0x00d7
            java.math.BigDecimal r11 = java.math.BigDecimal.ZERO
            java.lang.String r12 = r0.mo45882c(r11)
            java.lang.Void r13 = com.etsy.android.p327ui.search.p330v2.SearchOptions.DEFAULT_HIGH_PRICE
            oe.a r14 = new oe.a
            kotlin.jvm.internal.C19383o.m32796f(r11, r10)
            java.math.BigDecimal r13 = (java.math.BigDecimal) r13
            r15 = 8
            r14.<init>((java.math.BigDecimal) r11, (java.math.BigDecimal) r13, (java.lang.String) r12, (int) r15)
            oe.d r11 = new oe.d
            com.etsy.android.ui.util.n r12 = r0.f28964c
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r15 = 2131953398(0x7f1306f6, float:1.9543266E38)
            java.lang.String r12 = r12.mo38059c(r15, r13)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r13 = com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType.ANY_PRICE
            boolean r15 = r18.mo45884i()
            r11.<init>(r14, r12, r13, r15)
            r3.add(r11)
        L_0x00d7:
            oe.a r11 = new oe.a
            java.math.BigDecimal r12 = java.math.BigDecimal.ZERO
            kotlin.jvm.internal.C19383o.m32796f(r12, r10)
            java.lang.Object r10 = kotlin.collections.C19327t.m32640V0(r20)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.String r13 = "valueOf(this.toLong())"
            if (r10 == 0) goto L_0x00f5
            int r10 = r10.intValue()
            long r14 = (long) r10
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r14)
            kotlin.jvm.internal.C19383o.m32796f(r10, r13)
            goto L_0x00f6
        L_0x00f5:
            r10 = r6
        L_0x00f6:
            java.math.BigDecimal r14 = java.math.BigDecimal.ZERO
            java.lang.String r14 = r0.mo45882c(r14)
            java.lang.Object r15 = kotlin.collections.C19327t.m32640V0(r20)
            java.lang.Integer r15 = (java.lang.Integer) r15
            if (r15 == 0) goto L_0x0113
            int r15 = r15.intValue()
            r16 = r7
            long r6 = (long) r15
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r6)
            kotlin.jvm.internal.C19383o.m32796f(r6, r13)
            goto L_0x0116
        L_0x0113:
            r16 = r7
            r6 = 0
        L_0x0116:
            java.lang.String r6 = r0.mo45882c(r6)
            r11.<init>((java.math.BigDecimal) r12, (java.math.BigDecimal) r10, (java.lang.String) r14, (java.lang.String) r6)
            oe.d r7 = new oe.d
            com.etsy.android.ui.util.n r10 = r0.f28964c
            r12 = 2131953400(0x7f1306f8, float:1.954327E38)
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r14[r5] = r6
            java.lang.String r6 = r10.mo38059c(r12, r14)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r10 = com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType.PRICE_RANGE
            boolean r12 = r0.mo45885k(r11)
            r7.<init>(r11, r6, r10, r12)
            r3.add(r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r20.size()
            int r7 = r7 - r4
            r10 = r5
        L_0x0143:
            if (r10 >= r7) goto L_0x01c2
            oe.a r11 = new oe.a
            java.lang.Object r12 = r2.get(r10)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            long r14 = (long) r12
            java.math.BigDecimal r12 = java.math.BigDecimal.valueOf(r14)
            kotlin.jvm.internal.C19383o.m32796f(r12, r13)
            int r14 = r10 + 1
            java.lang.Object r15 = r2.get(r14)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            long r4 = (long) r15
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4)
            kotlin.jvm.internal.C19383o.m32796f(r4, r13)
            java.lang.Object r5 = r2.get(r10)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            long r8 = (long) r5
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r8)
            kotlin.jvm.internal.C19383o.m32796f(r5, r13)
            java.lang.String r5 = r0.mo45882c(r5)
            java.lang.Object r8 = r2.get(r14)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            long r8 = (long) r8
            java.math.BigDecimal r8 = java.math.BigDecimal.valueOf(r8)
            kotlin.jvm.internal.C19383o.m32796f(r8, r13)
            java.lang.String r8 = r0.mo45882c(r8)
            r11.<init>((java.math.BigDecimal) r12, (java.math.BigDecimal) r4, (java.lang.String) r5, (java.lang.String) r8)
            oe.d r4 = new oe.d
            com.etsy.android.ui.util.n r9 = r0.f28964c
            r12 = 2
            java.lang.Object[] r15 = new java.lang.Object[r12]
            r12 = r15
            r17 = 0
            r12[r17] = r5
            r5 = 1
            r12[r5] = r8
            r5 = 2131953403(0x7f1306fb, float:1.9543276E38)
            java.lang.String r8 = r9.mo38059c(r5, r12)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r5 = com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType.PRICE_RANGE
            boolean r9 = r0.mo45885k(r11)
            r4.<init>(r11, r8, r5, r9)
            r6.add(r4)
            r10 = r14
            r4 = 1
            r5 = 0
            goto L_0x0143
        L_0x01c2:
            r3.addAll(r6)
            java.lang.Object r2 = kotlin.collections.C19327t.m32645a1(r20)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            oe.a r4 = new oe.a
            long r5 = (long) r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r5)
            kotlin.jvm.internal.C19383o.m32796f(r2, r13)
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r5)
            kotlin.jvm.internal.C19383o.m32796f(r5, r13)
            java.lang.String r5 = r0.mo45882c(r5)
            r6 = 10
            r7 = 0
            r4.<init>((java.math.BigDecimal) r2, (java.math.BigDecimal) r7, (java.lang.String) r5, (int) r6)
            oe.d r2 = new oe.d
            com.etsy.android.ui.util.n r6 = r0.f28964c
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r5
            r5 = 2131953402(0x7f1306fa, float:1.9543274E38)
            java.lang.String r5 = r6.mo38059c(r5, r8)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r6 = com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType.PRICE_RANGE
            boolean r7 = r0.mo45885k(r4)
            r2.<init>(r4, r5, r6, r7)
            r3.add(r2)
            if (r21 == 0) goto L_0x020b
            r2 = 0
            goto L_0x020f
        L_0x020b:
            int r2 = r3.size()
        L_0x020f:
            r0.f28966e = r2
            r2 = r16
            r2.addAll(r3)
            goto L_0x0218
        L_0x0217:
            r2 = r7
        L_0x0218:
            if (r21 != 0) goto L_0x029b
            boolean r3 = r18.mo45884i()
            if (r3 != 0) goto L_0x022b
            boolean r3 = r0.f28967f
            if (r3 != 0) goto L_0x022b
            r3 = 1
            r1.setUserSpecifiedMin(r3)
            r1.setUserSpecifiedMax(r3)
        L_0x022b:
            boolean r3 = r19.getUserSpecifiedMin()
            if (r3 == 0) goto L_0x023a
            boolean r3 = r0.f28967f
            if (r3 != 0) goto L_0x023a
            java.math.BigDecimal r7 = r19.getMinPrice()
            goto L_0x023b
        L_0x023a:
            r7 = 0
        L_0x023b:
            boolean r3 = r19.getUserSpecifiedMax()
            if (r3 == 0) goto L_0x024a
            boolean r3 = r0.f28967f
            if (r3 != 0) goto L_0x024a
            java.math.BigDecimal r3 = r19.getMaxPrice()
            goto L_0x024b
        L_0x024a:
            r3 = 0
        L_0x024b:
            oe.a r4 = new oe.a
            if (r7 != 0) goto L_0x0252
            java.math.BigDecimal r5 = java.math.BigDecimal.ZERO
            goto L_0x0253
        L_0x0252:
            r5 = r7
        L_0x0253:
            java.lang.String r6 = "customMinPrice ?: BigDecimal.ZERO"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            java.lang.String r6 = r0.mo45882c(r7)
            java.lang.String r7 = r0.mo45882c(r3)
            r4.<init>((java.math.BigDecimal) r5, (java.math.BigDecimal) r3, (java.lang.String) r6, (java.lang.String) r7)
            oe.d r3 = new oe.d
            com.etsy.android.ui.util.n r5 = r0.f28964c
            r8 = 2131952719(0x7f13044f, float:1.9541889E38)
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.String r5 = r5.mo38059c(r8, r11)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.price.PriceFilterOptionType r8 = com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType.CUSTOM
            boolean r9 = r0.f28967f
            if (r9 != 0) goto L_0x027f
            boolean r9 = r18.mo45884i()
            if (r9 != 0) goto L_0x027f
            r9 = 1
            goto L_0x0280
        L_0x027f:
            r9 = 0
        L_0x0280:
            r3.<init>(r4, r5, r8, r9)
            com.etsy.android.ui.util.n r4 = r0.f28964c
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = 0
            r5[r8] = r6
            r6 = 1
            r5[r6] = r7
            r7 = 2131953403(0x7f1306fb, float:1.9543276E38)
            java.lang.String r4 = r4.mo38059c(r7, r5)
            r3.f28973e = r4
            r2.add(r3)
            goto L_0x029c
        L_0x029b:
            r6 = 1
        L_0x029c:
            java.util.Iterator r3 = r2.iterator()
            r4 = 0
        L_0x02a1:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02d6
            java.lang.Object r5 = r3.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x02d1
            oe.d r5 = (p414oe.C13166d) r5
            oe.a r8 = r5.f28969a
            java.math.BigDecimal r8 = r8.f28949a
            java.math.BigDecimal r9 = r19.getMinPrice()
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r8 == 0) goto L_0x02cf
            oe.a r5 = r5.f28969a
            java.math.BigDecimal r5 = r5.f28950b
            java.math.BigDecimal r8 = r19.getMaxPrice()
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r8)
            if (r5 == 0) goto L_0x02cf
            r9 = r4
            goto L_0x02d9
        L_0x02cf:
            r4 = r7
            goto L_0x02a1
        L_0x02d1:
            p568fn.C17782b.m29877o0()
            r1 = 0
            throw r1
        L_0x02d6:
            int r3 = r0.f28966e
            r9 = r3
        L_0x02d9:
            com.etsy.android.ui.util.n r3 = r0.f28964c
            r4 = 2131953247(0x7f13065f, float:1.954296E38)
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r3 = r3.mo38059c(r4, r7)
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r7 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.PRICE
            com.etsy.android.lib.currency.b r4 = r0.f28962a
            com.etsy.android.lib.currency.a r8 = r0.f28963b
            java.lang.String r8 = r8.mo21246a()
            java.lang.String r10 = "0"
            com.etsy.android.lib.currency.EtsyMoney r4 = r4.mo21248a(r10, r8)
            java.lang.String r8 = r4.getCurrencySymbol()
            boolean r4 = r19.getUserSpecifiedMin()
            if (r4 != 0) goto L_0x0308
            boolean r4 = r19.getUserSpecifiedMax()
            if (r4 == 0) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            r10 = r5
            goto L_0x0309
        L_0x0308:
            r10 = r6
        L_0x0309:
            int r11 = r0.f28966e
            oe.b r12 = new oe.b
            r4 = r12
            r5 = r3
            r6 = r7
            r7 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.math.BigDecimal r2 = r19.getMinPrice()
            java.math.BigDecimal r1 = r19.getMaxPrice()
            java.lang.String r1 = r0.mo45883g(r2, r1)
            r12.f28960h = r1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p414oe.C13164c.mo45881a(com.etsy.android.ui.search.v2.SearchOptions, java.util.List, boolean):oe.b");
    }

    /* renamed from: c */
    public final String mo45882c(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "";
        }
        return this.f28962a.mo21248a(bigDecimal.toString(), this.f28963b.mo21246a()).setMaximumFractionDigits(bigDecimal.scale() <= 0 ? 0 : 2).format();
    }

    /* renamed from: g */
    public final String mo45883g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        String str = null;
        String c = bigDecimal != null ? mo45882c(bigDecimal) : null;
        if (bigDecimal2 != null) {
            str = mo45882c(bigDecimal2);
        }
        if (C19383o.m32792b(bigDecimal, BigDecimal.ZERO) && bigDecimal2 == null) {
            return this.f28964c.mo38059c(R.string.search_filters_any_price, new Object[0]);
        }
        if ((bigDecimal == null || C19383o.m32792b(bigDecimal, BigDecimal.ZERO)) && bigDecimal2 != null) {
            return this.f28964c.mo38059c(R.string.search_filters_price_max_bound_desc, str);
        } else if (bigDecimal == null || (bigDecimal2 != null && !C19383o.m32792b(bigDecimal2, BigDecimal.ZERO))) {
            return this.f28964c.mo38059c(R.string.search_filters_price_range_desc, c, str);
        } else {
            return this.f28964c.mo38059c(R.string.search_filters_price_min_bound_desc, c);
        }
    }

    /* renamed from: i */
    public final boolean mo45884i() {
        SearchOptions searchOptions = this.f28965d;
        if (searchOptions != null) {
            if (C19383o.m32792b(searchOptions.getMinPrice(), BigDecimal.ZERO)) {
                SearchOptions searchOptions2 = this.f28965d;
                if (searchOptions2 == null) {
                    C19383o.m32805o("searchOptions");
                    throw null;
                } else if (searchOptions2.getMaxPrice() == null) {
                    return true;
                }
            }
            return false;
        }
        C19383o.m32805o("searchOptions");
        throw null;
    }

    /* renamed from: k */
    public final boolean mo45885k(C13162a aVar) {
        int i;
        if (!this.f28967f) {
            return false;
        }
        SearchOptions searchOptions = this.f28965d;
        if (searchOptions != null) {
            if (searchOptions.getMaxPrice() == null && aVar.f28950b == null) {
                i = 0;
            } else {
                SearchOptions searchOptions2 = this.f28965d;
                if (searchOptions2 == null) {
                    C19383o.m32805o("searchOptions");
                    throw null;
                } else if (searchOptions2.getMaxPrice() == null) {
                    i = -1;
                } else {
                    BigDecimal bigDecimal = aVar.f28950b;
                    if (bigDecimal == null) {
                        i = 1;
                    } else {
                        SearchOptions searchOptions3 = this.f28965d;
                        if (searchOptions3 != null) {
                            i = bigDecimal.compareTo(searchOptions3.getMaxPrice());
                        } else {
                            C19383o.m32805o("searchOptions");
                            throw null;
                        }
                    }
                }
            }
            BigDecimal bigDecimal2 = aVar.f28949a;
            SearchOptions searchOptions4 = this.f28965d;
            if (searchOptions4 != null) {
                return bigDecimal2.compareTo(searchOptions4.getMinPrice()) >= 0 && (i == -1 || i == 0);
            }
            C19383o.m32805o("searchOptions");
            throw null;
        }
        C19383o.m32805o("searchOptions");
        throw null;
    }
}
