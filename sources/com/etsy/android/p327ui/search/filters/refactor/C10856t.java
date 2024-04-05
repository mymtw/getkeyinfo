package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.platform.C1830f0;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19318k;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.filters.refactor.t */
public final class C10856t {

    /* renamed from: a */
    public final SearchFiltersUiGroupItem.SortBy f24063a;

    /* renamed from: b */
    public final SearchFiltersUiGroupItem.C10781b f24064b;

    /* renamed from: c */
    public final SearchFiltersUiGroupItem.ItemType f24065c;

    /* renamed from: d */
    public final SearchFiltersUiGroupItem.C10782c f24066d;

    /* renamed from: e */
    public final SearchFiltersUiGroupItem.C10783d f24067e;

    /* renamed from: f */
    public final SearchFiltersUiGroupItem.Shipping f24068f;

    /* renamed from: g */
    public final SearchFiltersUiGroupItem.C10784e f24069g;

    /* renamed from: h */
    public final SearchFiltersUiGroupItem.C10785f f24070h;

    /* renamed from: i */
    public final List<SearchFiltersUiGroupItem> f24071i;

    /* renamed from: j */
    public final SearchFiltersUiGroupItem.OtherOptions f24072j;

    /* renamed from: k */
    public final SearchFiltersUiGroupItem.C10780a f24073k;

    /* renamed from: l */
    public final List<C10849q> f24074l;

    /* renamed from: m */
    public final Integer f24075m;

    /* renamed from: n */
    public final boolean f24076n;

    /* renamed from: o */
    public final boolean f24077o;

    public C10856t() {
        this((SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (List) null, (SearchFiltersUiGroupItem.OtherOptions) null, (EmptyList) null, 32767);
    }

    public C10856t(SearchFiltersUiGroupItem.SortBy sortBy, SearchFiltersUiGroupItem.C10781b bVar, SearchFiltersUiGroupItem.ItemType itemType, SearchFiltersUiGroupItem.C10782c cVar, SearchFiltersUiGroupItem.C10783d dVar, SearchFiltersUiGroupItem.Shipping shipping, SearchFiltersUiGroupItem.C10784e eVar, SearchFiltersUiGroupItem.C10785f fVar, List<? extends SearchFiltersUiGroupItem> list, SearchFiltersUiGroupItem.OtherOptions otherOptions, SearchFiltersUiGroupItem.C10780a aVar, List<? extends C10849q> list2, Integer num, boolean z, boolean z2) {
        SearchFiltersUiGroupItem.C10780a aVar2 = aVar;
        List<? extends C10849q> list3 = list2;
        C19383o.m32797g(list, "dynamicFilters");
        C19383o.m32797g(aVar2, "bottomDivider");
        C19383o.m32797g(list3, "sideEffects");
        this.f24063a = sortBy;
        this.f24064b = bVar;
        this.f24065c = itemType;
        this.f24066d = cVar;
        this.f24067e = dVar;
        this.f24068f = shipping;
        this.f24069g = eVar;
        this.f24070h = fVar;
        this.f24071i = list;
        this.f24072j = otherOptions;
        this.f24073k = aVar2;
        this.f24074l = list3;
        this.f24075m = num;
        this.f24076n = z;
        this.f24077o = z2;
    }

    /* renamed from: a */
    public static C10856t m18854a(C10856t tVar, SearchFiltersUiGroupItem.SortBy sortBy, SearchFiltersUiGroupItem.C10781b bVar, SearchFiltersUiGroupItem.ItemType itemType, SearchFiltersUiGroupItem.C10782c cVar, SearchFiltersUiGroupItem.C10783d dVar, SearchFiltersUiGroupItem.Shipping shipping, SearchFiltersUiGroupItem.C10784e eVar, SearchFiltersUiGroupItem.C10785f fVar, ArrayList arrayList, SearchFiltersUiGroupItem.OtherOptions otherOptions, ArrayList arrayList2, Integer num, boolean z, boolean z2, int i) {
        C10856t tVar2 = tVar;
        int i2 = i;
        SearchFiltersUiGroupItem.SortBy sortBy2 = (i2 & 1) != 0 ? tVar2.f24063a : sortBy;
        SearchFiltersUiGroupItem.C10781b bVar2 = (i2 & 2) != 0 ? tVar2.f24064b : bVar;
        SearchFiltersUiGroupItem.ItemType itemType2 = (i2 & 4) != 0 ? tVar2.f24065c : itemType;
        SearchFiltersUiGroupItem.C10782c cVar2 = (i2 & 8) != 0 ? tVar2.f24066d : cVar;
        SearchFiltersUiGroupItem.C10783d dVar2 = (i2 & 16) != 0 ? tVar2.f24067e : dVar;
        SearchFiltersUiGroupItem.Shipping shipping2 = (i2 & 32) != 0 ? tVar2.f24068f : shipping;
        SearchFiltersUiGroupItem.C10784e eVar2 = (i2 & 64) != 0 ? tVar2.f24069g : eVar;
        SearchFiltersUiGroupItem.C10785f fVar2 = (i2 & 128) != 0 ? tVar2.f24070h : fVar;
        List<SearchFiltersUiGroupItem> list = (i2 & 256) != 0 ? tVar2.f24071i : arrayList;
        SearchFiltersUiGroupItem.OtherOptions otherOptions2 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? tVar2.f24072j : otherOptions;
        SearchFiltersUiGroupItem.C10780a aVar = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? tVar2.f24073k : null;
        List<C10849q> list2 = (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? tVar2.f24074l : arrayList2;
        Integer num2 = (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? tVar2.f24075m : num;
        boolean z3 = (i2 & 8192) != 0 ? tVar2.f24076n : z;
        boolean z4 = (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? tVar2.f24077o : z2;
        tVar.getClass();
        C19383o.m32797g(list, "dynamicFilters");
        C19383o.m32797g(aVar, "bottomDivider");
        C19383o.m32797g(list2, "sideEffects");
        return new C10856t(sortBy2, bVar2, itemType2, cVar2, dVar2, shipping2, eVar2, fVar2, list, otherOptions2, aVar, list2, num2, z3, z4);
    }

    /* renamed from: b */
    public final ArrayList mo36033b() {
        C1830f0 f0Var = new C1830f0(10);
        f0Var.mo7209a(this.f24063a);
        f0Var.mo7209a(this.f24064b);
        f0Var.mo7209a(this.f24065c);
        Object obj = this.f24066d;
        if (obj == null) {
            obj = this.f24067e;
        }
        f0Var.mo7209a(obj);
        f0Var.mo7209a(this.f24068f);
        f0Var.mo7209a(this.f24069g);
        f0Var.mo7209a(this.f24070h);
        Object[] array = this.f24071i.toArray(new SearchFiltersUiGroupItem[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f0Var.mo7210b(array);
        f0Var.mo7209a(this.f24072j);
        f0Var.mo7209a(this.f24073k);
        Object[] array2 = ((ArrayList) f0Var.f4088a).toArray(new SearchFiltersUiGroupItem[((ArrayList) f0Var.f4088a).size()]);
        C19383o.m32797g(array2, "elements");
        return C19318k.m32611c1(array2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo36034c() {
        /*
            r7 = this;
            java.util.List<com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem> r0 = r7.f24071i
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x010c
            java.lang.Object r2 = r0.next()
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem r2 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem) r2
            boolean r3 = r2 instanceof com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.MultiSelect
            if (r3 == 0) goto L_0x005d
            r3 = r2
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$MultiSelect r3 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.MultiSelect) r3
            java.util.List<com.etsy.android.ui.search.filters.refactor.d> r3 = r3.f23814d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0029:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.etsy.android.ui.search.filters.refactor.d r6 = (com.etsy.android.p327ui.search.filters.refactor.C10798d) r6
            boolean r6 = r6.f23922d
            if (r6 == 0) goto L_0x0029
            r4.add(r5)
            goto L_0x0029
        L_0x003e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = kotlin.collections.C19322o.m32624F0(r4)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x004b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r4.next()
            com.etsy.android.ui.search.filters.refactor.d r5 = (com.etsy.android.p327ui.search.filters.refactor.C10798d) r5
            java.lang.String r5 = r5.f23919a
            r3.add(r5)
            goto L_0x004b
        L_0x005d:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.SizeSelect
            if (r3 == 0) goto L_0x00a3
            r3 = r2
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SizeSelect r3 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.SizeSelect) r3
            java.util.List<com.etsy.android.ui.search.filters.refactor.d> r3 = r3.f23834d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x006f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.etsy.android.ui.search.filters.refactor.d r6 = (com.etsy.android.p327ui.search.filters.refactor.C10798d) r6
            boolean r6 = r6.f23922d
            if (r6 == 0) goto L_0x006f
            r4.add(r5)
            goto L_0x006f
        L_0x0084:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = kotlin.collections.C19322o.m32624F0(r4)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0091:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r4.next()
            com.etsy.android.ui.search.filters.refactor.d r5 = (com.etsy.android.p327ui.search.filters.refactor.C10798d) r5
            java.lang.String r5 = r5.f23919a
            r3.add(r5)
            goto L_0x0091
        L_0x00a3:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.ColorSelect
            if (r3 == 0) goto L_0x00e9
            r3 = r2
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ColorSelect r3 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.ColorSelect) r3
            java.util.List<com.etsy.android.ui.search.filters.refactor.c> r3 = r3.f23805d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ca
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.etsy.android.ui.search.filters.refactor.c r6 = (com.etsy.android.p327ui.search.filters.refactor.C10792c) r6
            boolean r6 = r6.f23904d
            if (r6 == 0) goto L_0x00b5
            r4.add(r5)
            goto L_0x00b5
        L_0x00ca:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = kotlin.collections.C19322o.m32624F0(r4)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x00d7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r4.next()
            com.etsy.android.ui.search.filters.refactor.c r5 = (com.etsy.android.p327ui.search.filters.refactor.C10792c) r5
            java.lang.String r5 = r5.f23901a
            r3.add(r5)
            goto L_0x00d7
        L_0x00e9:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x00eb:
            if (r3 == 0) goto L_0x00f6
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r4 = 0
            goto L_0x00f7
        L_0x00f6:
            r4 = 1
        L_0x00f7:
            if (r4 == 0) goto L_0x00fb
            r2 = 0
            goto L_0x0105
        L_0x00fb:
            java.lang.String r2 = r2.mo35793b()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r2, r3)
            r2 = r4
        L_0x0105:
            if (r2 == 0) goto L_0x000b
            r1.add(r2)
            goto L_0x000b
        L_0x010c:
            java.util.Map r0 = kotlin.collections.C19294b0.m32567x0(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.C10856t.mo36034c():java.util.Map");
    }

    /* renamed from: d */
    public final List<SearchFiltersUiGroupItem> mo36035d() {
        return this.f24071i;
    }

    /* renamed from: e */
    public final SearchFiltersUiGroupItem.ItemType mo36036e() {
        return this.f24065c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10856t)) {
            return false;
        }
        C10856t tVar = (C10856t) obj;
        return C19383o.m32792b(this.f24063a, tVar.f24063a) && C19383o.m32792b(this.f24064b, tVar.f24064b) && C19383o.m32792b(this.f24065c, tVar.f24065c) && C19383o.m32792b(this.f24066d, tVar.f24066d) && C19383o.m32792b(this.f24067e, tVar.f24067e) && C19383o.m32792b(this.f24068f, tVar.f24068f) && C19383o.m32792b(this.f24069g, tVar.f24069g) && C19383o.m32792b(this.f24070h, tVar.f24070h) && C19383o.m32792b(this.f24071i, tVar.f24071i) && C19383o.m32792b(this.f24072j, tVar.f24072j) && C19383o.m32792b(this.f24073k, tVar.f24073k) && C19383o.m32792b(this.f24074l, tVar.f24074l) && C19383o.m32792b(this.f24075m, tVar.f24075m) && this.f24076n == tVar.f24076n && this.f24077o == tVar.f24077o;
    }

    /* renamed from: f */
    public final SearchFiltersUiGroupItem.OtherOptions mo36038f() {
        return this.f24072j;
    }

    /* renamed from: g */
    public final SearchFiltersUiGroupItem.C10783d mo36039g() {
        return this.f24067e;
    }

    /* renamed from: h */
    public final SearchFiltersUiGroupItem.C10782c mo36040h() {
        return this.f24066d;
    }

    public final int hashCode() {
        SearchFiltersUiGroupItem.SortBy sortBy = this.f24063a;
        int i = 0;
        int hashCode = (sortBy == null ? 0 : sortBy.hashCode()) * 31;
        SearchFiltersUiGroupItem.C10781b bVar = this.f24064b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        SearchFiltersUiGroupItem.ItemType itemType = this.f24065c;
        int hashCode3 = (hashCode2 + (itemType == null ? 0 : itemType.hashCode())) * 31;
        SearchFiltersUiGroupItem.C10782c cVar = this.f24066d;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        SearchFiltersUiGroupItem.C10783d dVar = this.f24067e;
        int hashCode5 = (hashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        SearchFiltersUiGroupItem.Shipping shipping = this.f24068f;
        int hashCode6 = (hashCode5 + (shipping == null ? 0 : shipping.hashCode())) * 31;
        SearchFiltersUiGroupItem.C10784e eVar = this.f24069g;
        int hashCode7 = (hashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        SearchFiltersUiGroupItem.C10785f fVar = this.f24070h;
        int g = C13983i.m21488g(this.f24071i, (hashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
        SearchFiltersUiGroupItem.OtherOptions otherOptions = this.f24072j;
        int g2 = C13983i.m21488g(this.f24074l, (this.f24073k.hashCode() + ((g + (otherOptions == null ? 0 : otherOptions.hashCode())) * 31)) * 31, 31);
        Integer num = this.f24075m;
        if (num != null) {
            i = num.hashCode();
        }
        int i2 = (g2 + i) * 31;
        boolean z = this.f24076n;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f24077o;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final SearchFiltersUiGroupItem.Shipping mo36042i() {
        return this.f24068f;
    }

    /* renamed from: j */
    public final SearchFiltersUiGroupItem.C10784e mo36043j() {
        return this.f24069g;
    }

    /* renamed from: k */
    public final SearchFiltersUiGroupItem.C10785f mo36044k() {
        return this.f24070h;
    }

    /* renamed from: l */
    public final SearchFiltersUiGroupItem.SortBy mo36045l() {
        return this.f24063a;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchFiltersUi(sortBy=");
        h.append(this.f24063a);
        h.append(", category=");
        h.append(this.f24064b);
        h.append(", itemType=");
        h.append(this.f24065c);
        h.append(", priceMultiSelect=");
        h.append(this.f24066d);
        h.append(", price=");
        h.append(this.f24067e);
        h.append(", shipping=");
        h.append(this.f24068f);
        h.append(", shipsTo=");
        h.append(this.f24069g);
        h.append(", shopLocation=");
        h.append(this.f24070h);
        h.append(", dynamicFilters=");
        h.append(this.f24071i);
        h.append(", otherOptions=");
        h.append(this.f24072j);
        h.append(", bottomDivider=");
        h.append(this.f24073k);
        h.append(", sideEffects=");
        h.append(this.f24074l);
        h.append(", numberOfResults=");
        h.append(this.f24075m);
        h.append(", isLoading=");
        h.append(this.f24076n);
        h.append(", isResetEnabled=");
        return C0391c.m1058d(h, this.f24077o, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10856t(com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.SortBy r20, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10781b r21, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.ItemType r22, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10782c r23, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10783d r24, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.Shipping r25, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10784e r26, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10785f r27, java.util.List r28, com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.OtherOptions r29, kotlin.collections.EmptyList r30, int r31) {
        /*
            r19 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r20
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r21
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r22
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r23
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r24
        L_0x002b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r25
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0039
            r10 = r2
            goto L_0x003b
        L_0x0039:
            r10 = r26
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r27
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004b
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            r12 = r1
            goto L_0x004d
        L_0x004b:
            r12 = r28
        L_0x004d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0053
            r13 = r2
            goto L_0x0055
        L_0x0053:
            r13 = r29
        L_0x0055:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005b
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$a r2 = com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10780a.f23840a
        L_0x005b:
            r14 = r2
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0064
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r15 = r0
            goto L_0x0066
        L_0x0064:
            r15 = r30
        L_0x0066:
            r16 = 0
            r17 = 0
            r18 = 0
            r3 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.C10856t.<init>(com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SortBy, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$b, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ItemType, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$c, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$d, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$Shipping, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$e, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$f, java.util.List, com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$OtherOptions, kotlin.collections.EmptyList, int):void");
    }
}
