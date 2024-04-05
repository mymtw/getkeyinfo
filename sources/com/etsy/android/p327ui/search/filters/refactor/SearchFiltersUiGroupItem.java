package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.refactor.ItemTypeSelectItem;
import com.etsy.android.p327ui.search.filters.refactor.ShippingSelectItem;
import com.etsy.android.p327ui.search.filters.refactor.SortBySelectItem;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19318k;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem */
public abstract class SearchFiltersUiGroupItem {

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ColorSelect */
    public static final class ColorSelect extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23802a;

        /* renamed from: b */
        public final String f23803b;

        /* renamed from: c */
        public final boolean f23804c;

        /* renamed from: d */
        public final List<C10792c> f23805d;

        public ColorSelect(String str, List list, boolean z, String str2) {
            this.f23802a = str;
            this.f23803b = str2;
            this.f23804c = z;
            this.f23805d = list;
        }

        /* renamed from: f */
        public static ColorSelect m18689f(ColorSelect colorSelect, boolean z, ArrayList arrayList, int i) {
            String str = null;
            String str2 = (i & 1) != 0 ? colorSelect.f23802a : null;
            if ((i & 2) != 0) {
                str = colorSelect.f23803b;
            }
            if ((i & 4) != 0) {
                z = colorSelect.f23804c;
            }
            List list = arrayList;
            if ((i & 8) != 0) {
                list = colorSelect.f23805d;
            }
            C19383o.m32797g(str2, "id");
            C19383o.m32797g(str, "title");
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            return new ColorSelect(str2, list, z, str);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23804c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23802a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            List<C10792c> list = this.f23805d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C10792c) next).f23904d) {
                    arrayList.add(next);
                }
            }
            return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, SearchFiltersUiGroupItem$ColorSelect$subtitle$2.INSTANCE, 31);
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23803b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.COLOR;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorSelect)) {
                return false;
            }
            ColorSelect colorSelect = (ColorSelect) obj;
            return C19383o.m32792b(this.f23802a, colorSelect.f23802a) && C19383o.m32792b(this.f23803b, colorSelect.f23803b) && this.f23804c == colorSelect.f23804c && C19383o.m32792b(this.f23805d, colorSelect.f23805d);
        }

        /* renamed from: g */
        public final List<C10792c> mo35798g() {
            return this.f23805d;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23803b, this.f23802a.hashCode() * 31, 31);
            boolean z = this.f23804c;
            if (z) {
                z = true;
            }
            return this.f23805d.hashCode() + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ColorSelect(id=");
            h.append(this.f23802a);
            h.append(", title=");
            h.append(this.f23803b);
            h.append(", expanded=");
            h.append(this.f23804c);
            h.append(", items=");
            return C0070b.m186i(h, this.f23805d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ItemType */
    public static final class ItemType extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23806a;

        /* renamed from: b */
        public final String f23807b;

        /* renamed from: c */
        public final boolean f23808c;

        /* renamed from: d */
        public final List<ItemTypeSelectItem> f23809d;

        /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ItemType$a */
        public /* synthetic */ class C10777a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23810a;

            static {
                int[] iArr = new int[ItemTypeSelectItem.ItemTypeType.values().length];
                iArr[ItemTypeSelectItem.ItemTypeType.ALL_ITEMS_ID.ordinal()] = 1;
                iArr[ItemTypeSelectItem.ItemTypeType.HANDMADE_ID.ordinal()] = 2;
                iArr[ItemTypeSelectItem.ItemTypeType.VINTAGE_ID.ordinal()] = 3;
                f23810a = iArr;
            }
        }

        public ItemType(String str, List list, boolean z, String str2) {
            this.f23806a = str;
            this.f23807b = str2;
            this.f23808c = z;
            this.f23809d = list;
        }

        /* renamed from: f */
        public static ItemType m18696f(ItemType itemType, ArrayList arrayList) {
            String str = itemType.f23806a;
            String str2 = itemType.f23807b;
            C19383o.m32797g(str, "id");
            C19383o.m32797g(str2, "title");
            return new ItemType(str, arrayList, true, str2);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23808c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23806a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            List<ItemTypeSelectItem> list = this.f23809d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((ItemTypeSelectItem) next).f23784c) {
                    arrayList.add(next);
                }
            }
            return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, SearchFiltersUiGroupItem$ItemType$subtitle$2.INSTANCE, 31);
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23807b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.ITEM_TYPE;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemType)) {
                return false;
            }
            ItemType itemType = (ItemType) obj;
            return C19383o.m32792b(this.f23806a, itemType.f23806a) && C19383o.m32792b(this.f23807b, itemType.f23807b) && this.f23808c == itemType.f23808c && C19383o.m32792b(this.f23809d, itemType.f23809d);
        }

        /* renamed from: g */
        public final List<ItemTypeSelectItem> mo35802g() {
            return this.f23809d;
        }

        /* renamed from: h */
        public final SearchOptions.MarketPlace mo35803h() {
            T t;
            ItemTypeSelectItem.ItemTypeType itemTypeType;
            Iterator<T> it = this.f23809d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((ItemTypeSelectItem) t).f23784c) {
                    break;
                }
            }
            ItemTypeSelectItem itemTypeSelectItem = (ItemTypeSelectItem) t;
            if (itemTypeSelectItem == null || (itemTypeType = itemTypeSelectItem.f23785d) == null) {
                itemTypeType = ItemTypeSelectItem.ItemTypeType.ALL_ITEMS_ID;
            }
            int i = C10777a.f23810a[itemTypeType.ordinal()];
            if (i == 1) {
                return SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS;
            }
            if (i == 2) {
                return SearchOptions.MarketPlace.MARKETPLACE_HANDMADE;
            }
            if (i == 3) {
                return SearchOptions.MarketPlace.MARKETPLACE_VINTAGE;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23807b, this.f23806a.hashCode() * 31, 31);
            boolean z = this.f23808c;
            if (z) {
                z = true;
            }
            return this.f23809d.hashCode() + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ItemType(id=");
            h.append(this.f23806a);
            h.append(", title=");
            h.append(this.f23807b);
            h.append(", expanded=");
            h.append(this.f23808c);
            h.append(", items=");
            return C0070b.m186i(h, this.f23809d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$MultiSelect */
    public static final class MultiSelect extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23811a;

        /* renamed from: b */
        public final String f23812b;

        /* renamed from: c */
        public final boolean f23813c;

        /* renamed from: d */
        public final List<C10798d> f23814d;

        public MultiSelect(String str, List list, boolean z, String str2) {
            this.f23811a = str;
            this.f23812b = str2;
            this.f23813c = z;
            this.f23814d = list;
        }

        /* renamed from: f */
        public static MultiSelect m18704f(MultiSelect multiSelect, boolean z, ArrayList arrayList, int i) {
            String str = null;
            String str2 = (i & 1) != 0 ? multiSelect.f23811a : null;
            if ((i & 2) != 0) {
                str = multiSelect.f23812b;
            }
            if ((i & 4) != 0) {
                z = multiSelect.f23813c;
            }
            List list = arrayList;
            if ((i & 8) != 0) {
                list = multiSelect.f23814d;
            }
            C19383o.m32797g(str2, "id");
            C19383o.m32797g(str, "title");
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            return new MultiSelect(str2, list, z, str);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23813c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23811a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            List<C10798d> list = this.f23814d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C10798d) next).f23922d) {
                    arrayList.add(next);
                }
            }
            return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, SearchFiltersUiGroupItem$MultiSelect$subtitle$2.INSTANCE, 31);
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23812b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.MULTI_SELECT;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiSelect)) {
                return false;
            }
            MultiSelect multiSelect = (MultiSelect) obj;
            return C19383o.m32792b(this.f23811a, multiSelect.f23811a) && C19383o.m32792b(this.f23812b, multiSelect.f23812b) && this.f23813c == multiSelect.f23813c && C19383o.m32792b(this.f23814d, multiSelect.f23814d);
        }

        /* renamed from: g */
        public final List<C10798d> mo35807g() {
            return this.f23814d;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23812b, this.f23811a.hashCode() * 31, 31);
            boolean z = this.f23813c;
            if (z) {
                z = true;
            }
            return this.f23814d.hashCode() + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MultiSelect(id=");
            h.append(this.f23811a);
            h.append(", title=");
            h.append(this.f23812b);
            h.append(", expanded=");
            h.append(this.f23813c);
            h.append(", items=");
            return C0070b.m186i(h, this.f23814d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$OtherOptions */
    public static final class OtherOptions extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23815a;

        /* renamed from: b */
        public final String f23816b;

        /* renamed from: c */
        public final boolean f23817c;

        /* renamed from: d */
        public final C10798d f23818d;

        /* renamed from: e */
        public final C10798d f23819e;

        /* renamed from: f */
        public final C10798d f23820f;

        /* renamed from: g */
        public final C10798d f23821g;

        public OtherOptions(String str, String str2, boolean z, C10798d dVar, C10798d dVar2, C10798d dVar3, C10798d dVar4) {
            this.f23815a = str;
            this.f23816b = str2;
            this.f23817c = z;
            this.f23818d = dVar;
            this.f23819e = dVar2;
            this.f23820f = dVar3;
            this.f23821g = dVar4;
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23817c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23815a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            ArrayList c1 = C19318k.m32611c1(new C10798d[]{this.f23818d, this.f23819e, this.f23820f, this.f23821g});
            ArrayList arrayList = new ArrayList();
            Iterator it = c1.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((C10798d) next).f23922d) {
                    arrayList.add(next);
                }
            }
            return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, SearchFiltersUiGroupItem$OtherOptions$subtitle$2.INSTANCE, 31);
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23816b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.OTHER_OPTIONS;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtherOptions)) {
                return false;
            }
            OtherOptions otherOptions = (OtherOptions) obj;
            return C19383o.m32792b(this.f23815a, otherOptions.f23815a) && C19383o.m32792b(this.f23816b, otherOptions.f23816b) && this.f23817c == otherOptions.f23817c && C19383o.m32792b(this.f23818d, otherOptions.f23818d) && C19383o.m32792b(this.f23819e, otherOptions.f23819e) && C19383o.m32792b(this.f23820f, otherOptions.f23820f) && C19383o.m32792b(this.f23821g, otherOptions.f23821g);
        }

        /* renamed from: f */
        public final OtherOptions mo35811f(String str, boolean z) {
            C19383o.m32797g(str, "itemId");
            C10798d dVar = this.f23818d;
            String str2 = null;
            C10798d a = C19383o.m32792b(dVar != null ? dVar.f23919a : null, str) ? C10798d.m18802a(this.f23818d, z) : this.f23818d;
            C10798d dVar2 = this.f23819e;
            C10798d a2 = C19383o.m32792b(dVar2 != null ? dVar2.f23919a : null, str) ? C10798d.m18802a(this.f23819e, z) : this.f23819e;
            C10798d dVar3 = this.f23820f;
            C10798d a3 = C19383o.m32792b(dVar3 != null ? dVar3.f23919a : null, str) ? C10798d.m18802a(this.f23820f, z) : this.f23820f;
            C10798d dVar4 = this.f23821g;
            if (dVar4 != null) {
                str2 = dVar4.f23919a;
            }
            C10798d a4 = C19383o.m32792b(str2, str) ? C10798d.m18802a(this.f23821g, z) : this.f23821g;
            String str3 = this.f23815a;
            String str4 = this.f23816b;
            boolean z2 = this.f23817c;
            C19383o.m32797g(str3, "id");
            C19383o.m32797g(str4, "title");
            return new OtherOptions(str3, str4, z2, a, a2, a3, a4);
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23816b, this.f23815a.hashCode() * 31, 31);
            boolean z = this.f23817c;
            if (z) {
                z = true;
            }
            int i = (e + (z ? 1 : 0)) * 31;
            C10798d dVar = this.f23818d;
            int i2 = 0;
            int hashCode = (i + (dVar == null ? 0 : dVar.hashCode())) * 31;
            C10798d dVar2 = this.f23819e;
            int hashCode2 = (hashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            C10798d dVar3 = this.f23820f;
            int hashCode3 = (hashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
            C10798d dVar4 = this.f23821g;
            if (dVar4 != null) {
                i2 = dVar4.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("OtherOptions(id=");
            h.append(this.f23815a);
            h.append(", title=");
            h.append(this.f23816b);
            h.append(", expanded=");
            h.append(this.f23817c);
            h.append(", onSale=");
            h.append(this.f23818d);
            h.append(", acceptsGiftCards=");
            h.append(this.f23819e);
            h.append(", customizable=");
            h.append(this.f23820f);
            h.append(", giftWrapped=");
            h.append(this.f23821g);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$Shipping */
    public static final class Shipping extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23822a;

        /* renamed from: b */
        public final String f23823b;

        /* renamed from: c */
        public final boolean f23824c;

        /* renamed from: d */
        public final List<ShippingSelectItem> f23825d;

        /* renamed from: e */
        public final boolean f23826e;

        /* renamed from: f */
        public final ArrayList f23827f;

        /* renamed from: g */
        public final boolean f23828g;

        /* renamed from: h */
        public final boolean f23829h;

        /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$Shipping$a */
        public /* synthetic */ class C10778a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23830a;

            static {
                int[] iArr = new int[ShippingSelectItem.ShippingType.values().length];
                iArr[ShippingSelectItem.ShippingType.FREE_SHIPPING_ID.ordinal()] = 1;
                iArr[ShippingSelectItem.ShippingType.ONE_DAY_SHIPPING_ID.ordinal()] = 2;
                iArr[ShippingSelectItem.ShippingType.THREE_DAY_SHIPPING_ID.ordinal()] = 3;
                f23830a = iArr;
            }
        }

        public Shipping(String str, List list, boolean z, String str2) {
            boolean z2;
            Object obj;
            boolean z3;
            boolean z4;
            boolean z5;
            ShippingFilter shippingFilter;
            boolean z6;
            this.f23822a = str;
            this.f23823b = str2;
            this.f23824c = z;
            this.f23825d = list;
            Iterator it = list.iterator();
            while (true) {
                z2 = true;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ShippingSelectItem) obj).f23880d == ShippingSelectItem.ShippingType.FREE_SHIPPING_ID) {
                    z6 = true;
                    continue;
                } else {
                    z6 = false;
                    continue;
                }
                if (z6) {
                    break;
                }
            }
            ShippingSelectItem shippingSelectItem = (ShippingSelectItem) obj;
            this.f23826e = shippingSelectItem != null ? shippingSelectItem.f23879c : false;
            List<ShippingSelectItem> list2 = this.f23825d;
            ArrayList arrayList = new ArrayList();
            for (T next : list2) {
                if (((ShippingSelectItem) next).f23879c) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i = C10778a.f23830a[((ShippingSelectItem) it2.next()).f23880d.ordinal()];
                if (i == 1) {
                    shippingFilter = null;
                } else if (i == 2) {
                    shippingFilter = ShippingFilter.ONE_DAY_SHIPPING;
                } else if (i == 3) {
                    shippingFilter = ShippingFilter.THREE_DAY_SHIPPING;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (shippingFilter != null) {
                    arrayList2.add(shippingFilter);
                }
            }
            this.f23827f = arrayList2;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((ShippingFilter) it3.next()) == ShippingFilter.ONE_DAY_SHIPPING) {
                        z5 = true;
                        continue;
                    } else {
                        z5 = false;
                        continue;
                    }
                    if (z5) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            this.f23828g = z3;
            ArrayList arrayList3 = this.f23827f;
            if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((ShippingFilter) it4.next()) == ShippingFilter.THREE_DAY_SHIPPING) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
            }
            z2 = false;
            this.f23829h = z2;
        }

        /* renamed from: f */
        public static Shipping m18717f(Shipping shipping, ArrayList arrayList) {
            String str = shipping.f23822a;
            String str2 = shipping.f23823b;
            boolean z = shipping.f23824c;
            C19383o.m32797g(str, "id");
            C19383o.m32797g(str2, "title");
            return new Shipping(str, arrayList, z, str2);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23824c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23822a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            List<ShippingSelectItem> list = this.f23825d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((ShippingSelectItem) next).f23879c) {
                    arrayList.add(next);
                }
            }
            return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, SearchFiltersUiGroupItem$Shipping$subtitle$2.INSTANCE, 31);
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23823b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.SHIPPING;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) obj;
            return C19383o.m32792b(this.f23822a, shipping.f23822a) && C19383o.m32792b(this.f23823b, shipping.f23823b) && this.f23824c == shipping.f23824c && C19383o.m32792b(this.f23825d, shipping.f23825d);
        }

        /* renamed from: g */
        public final List<ShippingSelectItem> mo35815g() {
            return this.f23825d;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23823b, this.f23822a.hashCode() * 31, 31);
            boolean z = this.f23824c;
            if (z) {
                z = true;
            }
            return this.f23825d.hashCode() + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Shipping(id=");
            h.append(this.f23822a);
            h.append(", title=");
            h.append(this.f23823b);
            h.append(", expanded=");
            h.append(this.f23824c);
            h.append(", items=");
            return C0070b.m186i(h, this.f23825d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SizeSelect */
    public static final class SizeSelect extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23831a;

        /* renamed from: b */
        public final String f23832b;

        /* renamed from: c */
        public final boolean f23833c;

        /* renamed from: d */
        public final List<C10798d> f23834d;

        public SizeSelect(String str, List list, boolean z, String str2) {
            this.f23831a = str;
            this.f23832b = str2;
            this.f23833c = z;
            this.f23834d = list;
        }

        /* renamed from: f */
        public static SizeSelect m18724f(SizeSelect sizeSelect, boolean z, ArrayList arrayList, int i) {
            String str = null;
            String str2 = (i & 1) != 0 ? sizeSelect.f23831a : null;
            if ((i & 2) != 0) {
                str = sizeSelect.f23832b;
            }
            if ((i & 4) != 0) {
                z = sizeSelect.f23833c;
            }
            List list = arrayList;
            if ((i & 8) != 0) {
                list = sizeSelect.f23834d;
            }
            C19383o.m32797g(str2, "id");
            C19383o.m32797g(str, "title");
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            return new SizeSelect(str2, list, z, str);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23833c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23831a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            List<C10798d> list = this.f23834d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C10798d) next).f23922d) {
                    arrayList.add(next);
                }
            }
            return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, SearchFiltersUiGroupItem$SizeSelect$subtitle$2.INSTANCE, 31);
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23832b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.SIZE;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SizeSelect)) {
                return false;
            }
            SizeSelect sizeSelect = (SizeSelect) obj;
            return C19383o.m32792b(this.f23831a, sizeSelect.f23831a) && C19383o.m32792b(this.f23832b, sizeSelect.f23832b) && this.f23833c == sizeSelect.f23833c && C19383o.m32792b(this.f23834d, sizeSelect.f23834d);
        }

        /* renamed from: g */
        public final List<C10798d> mo35819g() {
            return this.f23834d;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23832b, this.f23831a.hashCode() * 31, 31);
            boolean z = this.f23833c;
            if (z) {
                z = true;
            }
            return this.f23834d.hashCode() + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SizeSelect(id=");
            h.append(this.f23831a);
            h.append(", title=");
            h.append(this.f23832b);
            h.append(", expanded=");
            h.append(this.f23833c);
            h.append(", items=");
            return C0070b.m186i(h, this.f23834d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SortBy */
    public static final class SortBy extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23835a;

        /* renamed from: b */
        public final String f23836b;

        /* renamed from: c */
        public final boolean f23837c;

        /* renamed from: d */
        public final List<SortBySelectItem> f23838d;

        /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SortBy$a */
        public /* synthetic */ class C10779a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23839a;

            static {
                int[] iArr = new int[SortBySelectItem.SortByType.values().length];
                iArr[SortBySelectItem.SortByType.RELEVANCY.ordinal()] = 1;
                iArr[SortBySelectItem.SortByType.MOST_RECENT.ordinal()] = 2;
                iArr[SortBySelectItem.SortByType.HIGHEST_PRICE.ordinal()] = 3;
                iArr[SortBySelectItem.SortByType.LOWEST_PRICE.ordinal()] = 4;
                f23839a = iArr;
            }
        }

        public SortBy(String str, List list, boolean z, String str2) {
            this.f23835a = str;
            this.f23836b = str2;
            this.f23837c = z;
            this.f23838d = list;
        }

        /* renamed from: f */
        public static SortBy m18731f(SortBy sortBy, ArrayList arrayList) {
            String str = sortBy.f23835a;
            String str2 = sortBy.f23836b;
            C19383o.m32797g(str, "id");
            C19383o.m32797g(str2, "title");
            return new SortBy(str, arrayList, true, str2);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23837c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23835a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            List<SortBySelectItem> list = this.f23838d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((SortBySelectItem) next).f23887c) {
                    arrayList.add(next);
                }
            }
            return C19327t.m32644Z0(arrayList, (String) null, (String) null, (String) null, SearchFiltersUiGroupItem$SortBy$subtitle$2.INSTANCE, 31);
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23836b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.SORT_BY;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortBy)) {
                return false;
            }
            SortBy sortBy = (SortBy) obj;
            return C19383o.m32792b(this.f23835a, sortBy.f23835a) && C19383o.m32792b(this.f23836b, sortBy.f23836b) && this.f23837c == sortBy.f23837c && C19383o.m32792b(this.f23838d, sortBy.f23838d);
        }

        /* renamed from: g */
        public final List<SortBySelectItem> mo35823g() {
            return this.f23838d;
        }

        /* renamed from: h */
        public final SortOrder mo35824h() {
            T t;
            SortBySelectItem.SortByType sortByType;
            Iterator<T> it = this.f23838d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((SortBySelectItem) t).f23887c) {
                    break;
                }
            }
            SortBySelectItem sortBySelectItem = (SortBySelectItem) t;
            if (sortBySelectItem == null || (sortByType = sortBySelectItem.f23888d) == null) {
                sortByType = SortBySelectItem.SortByType.RELEVANCY;
            }
            int i = C10779a.f23839a[sortByType.ordinal()];
            if (i == 1) {
                return SortOrder.RELEVANCY;
            }
            if (i == 2) {
                return SortOrder.MOST_RECENT;
            }
            if (i == 3) {
                return SortOrder.HIGHEST_PRICE;
            }
            if (i == 4) {
                return SortOrder.LOWEST_PRICE;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23836b, this.f23835a.hashCode() * 31, 31);
            boolean z = this.f23837c;
            if (z) {
                z = true;
            }
            return this.f23838d.hashCode() + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SortBy(id=");
            h.append(this.f23835a);
            h.append(", title=");
            h.append(this.f23836b);
            h.append(", expanded=");
            h.append(this.f23837c);
            h.append(", items=");
            return C0070b.m186i(h, this.f23838d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$a */
    public static final class C10780a extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public static final C10780a f23840a = new C10780a();

        /* renamed from: b */
        public static final String f23841b = C0069a.m174e("randomUUID().toString()");

        /* renamed from: c */
        public static final String f23842c = "";

        /* renamed from: d */
        public static final String f23843d = "";

        /* renamed from: a */
        public final boolean mo35792a() {
            return false;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return f23841b;
        }

        /* renamed from: c */
        public final String mo35794c() {
            return f23843d;
        }

        /* renamed from: d */
        public final String mo35795d() {
            return f23842c;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.BOTTOM_DIVIDER;
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$b */
    public static final class C10781b extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23844a = ResponseConstants.CATEGORY;

        /* renamed from: b */
        public final String f23845b;

        /* renamed from: c */
        public final boolean f23846c;

        /* renamed from: d */
        public final List<C10789b> f23847d;

        public C10781b(ArrayList arrayList, String str) {
            this.f23845b = str;
            this.f23846c = false;
            this.f23847d = arrayList;
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23846c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23844a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            String str;
            T t;
            Iterator<T> it = this.f23847d.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C10789b) t).f23892c) {
                    break;
                }
            }
            C10789b bVar = (C10789b) t;
            if (bVar != null) {
                str = bVar.f23895f;
            }
            return str == null ? "" : str;
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23845b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.CATEGORY;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10781b)) {
                return false;
            }
            C10781b bVar = (C10781b) obj;
            return C19383o.m32792b(this.f23844a, bVar.f23844a) && C19383o.m32792b(this.f23845b, bVar.f23845b) && this.f23846c == bVar.f23846c && C19383o.m32792b(this.f23847d, bVar.f23847d);
        }

        /* renamed from: f */
        public final String mo35828f() {
            T t;
            Iterator<T> it = this.f23847d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C10789b) t).f23892c) {
                    break;
                }
            }
            C10789b bVar = (C10789b) t;
            if (bVar != null) {
                return bVar.f23890a;
            }
            return null;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23845b, this.f23844a.hashCode() * 31, 31);
            boolean z = this.f23846c;
            if (z) {
                z = true;
            }
            return this.f23847d.hashCode() + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Category(id=");
            h.append(this.f23844a);
            h.append(", title=");
            h.append(this.f23845b);
            h.append(", expanded=");
            h.append(this.f23846c);
            h.append(", items=");
            return C0070b.m186i(h, this.f23847d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$c */
    public static final class C10782c extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23848a;

        /* renamed from: b */
        public final String f23849b;

        /* renamed from: c */
        public final String f23850c;

        /* renamed from: d */
        public final boolean f23851d;

        /* renamed from: e */
        public final List<C10803g> f23852e;

        /* renamed from: f */
        public final String f23853f;

        /* renamed from: g */
        public final String f23854g;

        /* renamed from: h */
        public final PriceRange f23855h;

        /* renamed from: i */
        public final boolean f23856i;

        public C10782c(String str, String str2, String str3, boolean z, List<C10803g> list, String str4, String str5, PriceRange priceRange, boolean z2) {
            C19383o.m32797g(str, "id");
            C19383o.m32797g(str4, "customMinLabel");
            C19383o.m32797g(str5, "customMaxLabel");
            C19383o.m32797g(priceRange, "customPriceRange");
            this.f23848a = str;
            this.f23849b = str2;
            this.f23850c = str3;
            this.f23851d = z;
            this.f23852e = list;
            this.f23853f = str4;
            this.f23854g = str5;
            this.f23855h = priceRange;
            this.f23856i = z2;
        }

        /* renamed from: f */
        public static C10782c m18750f(C10782c cVar, String str, boolean z, ArrayList arrayList, PriceRange priceRange, boolean z2, int i) {
            C10782c cVar2 = cVar;
            int i2 = i;
            String str2 = null;
            String str3 = (i2 & 1) != 0 ? cVar2.f23848a : null;
            String str4 = (i2 & 2) != 0 ? cVar2.f23849b : null;
            String str5 = (i2 & 4) != 0 ? cVar2.f23850c : str;
            boolean z3 = (i2 & 8) != 0 ? cVar2.f23851d : z;
            List list = (i2 & 16) != 0 ? cVar2.f23852e : arrayList;
            String str6 = (i2 & 32) != 0 ? cVar2.f23853f : null;
            if ((i2 & 64) != 0) {
                str2 = cVar2.f23854g;
            }
            String str7 = str2;
            PriceRange priceRange2 = (i2 & 128) != 0 ? cVar2.f23855h : priceRange;
            boolean z4 = (i2 & 256) != 0 ? cVar2.f23856i : z2;
            cVar.getClass();
            C19383o.m32797g(str3, "id");
            C19383o.m32797g(str4, "title");
            C19383o.m32797g(str5, "subtitle");
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            C19383o.m32797g(str6, "customMinLabel");
            C19383o.m32797g(str7, "customMaxLabel");
            C19383o.m32797g(priceRange2, "customPriceRange");
            return new C10782c(str3, str4, str5, z3, list, str6, str7, priceRange2, z4);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23851d;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23848a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            return this.f23850c;
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23849b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.PRICE_MULTI_SELECT;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10782c)) {
                return false;
            }
            C10782c cVar = (C10782c) obj;
            return C19383o.m32792b(this.f23848a, cVar.f23848a) && C19383o.m32792b(this.f23849b, cVar.f23849b) && C19383o.m32792b(this.f23850c, cVar.f23850c) && this.f23851d == cVar.f23851d && C19383o.m32792b(this.f23852e, cVar.f23852e) && C19383o.m32792b(this.f23853f, cVar.f23853f) && C19383o.m32792b(this.f23854g, cVar.f23854g) && C19383o.m32792b(this.f23855h, cVar.f23855h) && this.f23856i == cVar.f23856i;
        }

        /* renamed from: g */
        public final PriceRange mo35832g() {
            return this.f23855h;
        }

        /* renamed from: h */
        public final C10802f mo35833h() {
            List<C10803g> list = this.f23852e;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C10803g) next).f23938c) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                if (!(((C10803g) C19327t.m32638T0(arrayList)).f23941f == PriceSelectType.ANY_PRICE)) {
                    return ((C10803g) C19327t.m32638T0(arrayList)).mo35905d() ? new C10802f(this.f23855h.mo35765d(), this.f23855h.mo35764c(), true, true) : new C10802f(((C10803g) C19327t.m32638T0(arrayList)).f23939d, ((C10803g) C19327t.m32645a1(arrayList)).f23940e, false, false);
                }
            }
            return new C10802f((BigDecimal) null, (BigDecimal) null, false, false);
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23850c, C0023f.m105e(this.f23849b, this.f23848a.hashCode() * 31, 31), 31);
            boolean z = this.f23851d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (this.f23855h.hashCode() + C0023f.m105e(this.f23854g, C0023f.m105e(this.f23853f, C13983i.m21488g(this.f23852e, (e + (z ? 1 : 0)) * 31, 31), 31), 31)) * 31;
            boolean z3 = this.f23856i;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0078, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x00aa, code lost:
            r0 = r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0154  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10782c mo35835i(com.etsy.android.p327ui.search.filters.refactor.C10803g r13, boolean r14) {
            /*
                r12 = this;
                java.lang.String r0 = "toggledItem"
                kotlin.jvm.internal.C19383o.m32797g(r13, r0)
                java.util.List<com.etsy.android.ui.search.filters.refactor.g> r0 = r12.f23852e
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0010:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0031
                java.lang.Object r2 = r0.next()
                r3 = r2
                com.etsy.android.ui.search.filters.refactor.g r3 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r3
                java.lang.String r4 = r3.f23936a
                java.lang.String r5 = r13.f23936a
                boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
                if (r4 == 0) goto L_0x0029
                r3 = r14
                goto L_0x002b
            L_0x0029:
                boolean r3 = r3.f23938c
            L_0x002b:
                if (r3 == 0) goto L_0x0010
                r1.add(r2)
                goto L_0x0010
            L_0x0031:
                boolean r0 = r1.isEmpty()
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x003a
                goto L_0x0057
            L_0x003a:
                java.util.Iterator r0 = r1.iterator()
            L_0x003e:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0057
                java.lang.Object r4 = r0.next()
                com.etsy.android.ui.search.filters.refactor.g r4 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r4
                com.etsy.android.ui.search.filters.refactor.PriceSelectType r4 = r4.f23941f
                com.etsy.android.ui.search.filters.refactor.PriceSelectType r5 = com.etsy.android.p327ui.search.filters.refactor.PriceSelectType.PRICE_RANGE
                if (r4 != r5) goto L_0x0052
                r4 = r3
                goto L_0x0053
            L_0x0052:
                r4 = r2
            L_0x0053:
                if (r4 != 0) goto L_0x003e
                r0 = r2
                goto L_0x0058
            L_0x0057:
                r0 = r3
            L_0x0058:
                if (r0 == 0) goto L_0x0063
                boolean r0 = r1.isEmpty()
                r0 = r0 ^ r3
                if (r0 == 0) goto L_0x0063
                r0 = r3
                goto L_0x0064
            L_0x0063:
                r0 = r2
            L_0x0064:
                r4 = 59
                if (r0 == 0) goto L_0x0154
                java.util.Iterator r13 = r1.iterator()
                boolean r14 = r13.hasNext()
                java.lang.String r0 = "Empty collection can't be reduced."
                if (r14 == 0) goto L_0x014e
                java.lang.Object r14 = r13.next()
            L_0x0078:
                boolean r5 = r13.hasNext()
                if (r5 == 0) goto L_0x0098
                java.lang.Object r5 = r13.next()
                com.etsy.android.ui.search.filters.refactor.g r5 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r5
                com.etsy.android.ui.search.filters.refactor.g r14 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r14
                java.math.BigDecimal r6 = r14.f23939d
                if (r6 != 0) goto L_0x008b
                goto L_0x0078
            L_0x008b:
                java.math.BigDecimal r7 = r5.f23939d
                if (r7 != 0) goto L_0x0090
                goto L_0x0096
            L_0x0090:
                int r6 = r7.compareTo(r6)
                if (r6 >= 0) goto L_0x0078
            L_0x0096:
                r14 = r5
                goto L_0x0078
            L_0x0098:
                com.etsy.android.ui.search.filters.refactor.g r14 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r14
                java.math.BigDecimal r13 = r14.f23939d
                java.util.Iterator r14 = r1.iterator()
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L_0x0148
                java.lang.Object r0 = r14.next()
            L_0x00aa:
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L_0x00ca
                java.lang.Object r1 = r14.next()
                com.etsy.android.ui.search.filters.refactor.g r1 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r1
                com.etsy.android.ui.search.filters.refactor.g r0 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r0
                java.math.BigDecimal r5 = r0.f23940e
                if (r5 != 0) goto L_0x00bd
                goto L_0x00aa
            L_0x00bd:
                java.math.BigDecimal r6 = r1.f23940e
                if (r6 != 0) goto L_0x00c2
                goto L_0x00c8
            L_0x00c2:
                int r5 = r6.compareTo(r5)
                if (r5 <= 0) goto L_0x00aa
            L_0x00c8:
                r0 = r1
                goto L_0x00aa
            L_0x00ca:
                com.etsy.android.ui.search.filters.refactor.g r0 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r0
                java.math.BigDecimal r14 = r0.f23940e
                r6 = 0
                r7 = 0
                java.util.List<com.etsy.android.ui.search.filters.refactor.g> r0 = r12.f23852e
                java.util.ArrayList r8 = new java.util.ArrayList
                int r1 = kotlin.collections.C19322o.m32624F0(r0)
                r8.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x00df:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x013e
                java.lang.Object r1 = r0.next()
                com.etsy.android.ui.search.filters.refactor.g r1 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r1
                com.etsy.android.ui.search.filters.refactor.PriceSelectType r5 = r1.f23941f
                com.etsy.android.ui.search.filters.refactor.PriceSelectType r9 = com.etsy.android.p327ui.search.filters.refactor.PriceSelectType.PRICE_RANGE
                if (r5 != r9) goto L_0x00f3
                r5 = r3
                goto L_0x00f4
            L_0x00f3:
                r5 = r2
            L_0x00f4:
                if (r5 != 0) goto L_0x00f7
                goto L_0x013a
            L_0x00f7:
                if (r13 != 0) goto L_0x00fa
                goto L_0x0105
            L_0x00fa:
                java.math.BigDecimal r5 = r1.f23939d
                if (r5 != 0) goto L_0x00ff
                goto L_0x0107
            L_0x00ff:
                int r5 = r5.compareTo(r13)
                if (r5 < 0) goto L_0x0107
            L_0x0105:
                r5 = r3
                goto L_0x0108
            L_0x0107:
                r5 = r2
            L_0x0108:
                if (r14 != 0) goto L_0x010b
                goto L_0x0116
            L_0x010b:
                java.math.BigDecimal r9 = r1.f23940e
                if (r9 != 0) goto L_0x0110
                goto L_0x0118
            L_0x0110:
                int r9 = r9.compareTo(r14)
                if (r9 > 0) goto L_0x0118
            L_0x0116:
                r9 = r3
                goto L_0x0119
            L_0x0118:
                r9 = r2
            L_0x0119:
                if (r5 == 0) goto L_0x011f
                if (r9 == 0) goto L_0x011f
                r5 = r3
                goto L_0x0120
            L_0x011f:
                r5 = r2
            L_0x0120:
                if (r5 == 0) goto L_0x0135
                java.math.BigDecimal r9 = r1.f23939d
                boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r13)
                if (r9 != 0) goto L_0x0135
                java.math.BigDecimal r9 = r1.f23940e
                boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r14)
                if (r9 == 0) goto L_0x0133
                goto L_0x0135
            L_0x0133:
                r9 = r2
                goto L_0x0136
            L_0x0135:
                r9 = r3
            L_0x0136:
                com.etsy.android.ui.search.filters.refactor.g r1 = com.etsy.android.p327ui.search.filters.refactor.C10803g.m18808a(r1, r5, r9, r4)
            L_0x013a:
                r8.add(r1)
                goto L_0x00df
            L_0x013e:
                r9 = 0
                r10 = 0
                r11 = 495(0x1ef, float:6.94E-43)
                r5 = r12
                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$c r13 = m18750f(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0196
            L_0x0148:
                java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
                r13.<init>(r0)
                throw r13
            L_0x014e:
                java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
                r13.<init>(r0)
                throw r13
            L_0x0154:
                r0 = 0
                r5 = 0
                java.util.List<com.etsy.android.ui.search.filters.refactor.g> r1 = r12.f23852e
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = kotlin.collections.C19322o.m32624F0(r1)
                r6.<init>(r7)
                java.util.Iterator r1 = r1.iterator()
            L_0x0165:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L_0x0188
                java.lang.Object r7 = r1.next()
                com.etsy.android.ui.search.filters.refactor.g r7 = (com.etsy.android.p327ui.search.filters.refactor.C10803g) r7
                java.lang.String r8 = r7.f23936a
                java.lang.String r9 = r13.f23936a
                boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
                if (r8 == 0) goto L_0x0180
                com.etsy.android.ui.search.filters.refactor.g r7 = com.etsy.android.p327ui.search.filters.refactor.C10803g.m18808a(r7, r14, r3, r4)
                goto L_0x0184
            L_0x0180:
                com.etsy.android.ui.search.filters.refactor.g r7 = com.etsy.android.p327ui.search.filters.refactor.C10803g.m18808a(r7, r2, r3, r4)
            L_0x0184:
                r6.add(r7)
                goto L_0x0165
            L_0x0188:
                r13 = 0
                r14 = 0
                r7 = 495(0x1ef, float:6.94E-43)
                r1 = r12
                r2 = r0
                r3 = r5
                r4 = r6
                r5 = r13
                r6 = r14
                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$c r13 = m18750f(r1, r2, r3, r4, r5, r6, r7)
            L_0x0196:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10782c.mo35835i(com.etsy.android.ui.search.filters.refactor.g, boolean):com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$c");
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PriceMultiSelect(id=");
            h.append(this.f23848a);
            h.append(", title=");
            h.append(this.f23849b);
            h.append(", subtitle=");
            h.append(this.f23850c);
            h.append(", expanded=");
            h.append(this.f23851d);
            h.append(", items=");
            h.append(this.f23852e);
            h.append(", customMinLabel=");
            h.append(this.f23853f);
            h.append(", customMaxLabel=");
            h.append(this.f23854g);
            h.append(", customPriceRange=");
            h.append(this.f23855h);
            h.append(", isShowingKeyboard=");
            return C0391c.m1058d(h, this.f23856i, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$d */
    public static final class C10783d extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23857a;

        /* renamed from: b */
        public final String f23858b;

        /* renamed from: c */
        public final String f23859c;

        /* renamed from: d */
        public final boolean f23860d;

        /* renamed from: e */
        public final List<C10803g> f23861e;

        /* renamed from: f */
        public final String f23862f;

        /* renamed from: g */
        public final String f23863g;

        /* renamed from: h */
        public final PriceRange f23864h;

        /* renamed from: i */
        public final boolean f23865i;

        public C10783d(String str, String str2, String str3, boolean z, List<C10803g> list, String str4, String str5, PriceRange priceRange, boolean z2) {
            C19383o.m32797g(str, "id");
            C19383o.m32797g(str4, "customMinLabel");
            C19383o.m32797g(str5, "customMaxLabel");
            C19383o.m32797g(priceRange, "customPriceRange");
            this.f23857a = str;
            this.f23858b = str2;
            this.f23859c = str3;
            this.f23860d = z;
            this.f23861e = list;
            this.f23862f = str4;
            this.f23863g = str5;
            this.f23864h = priceRange;
            this.f23865i = z2;
        }

        /* renamed from: f */
        public static C10783d m18759f(C10783d dVar, String str, ArrayList arrayList, PriceRange priceRange, boolean z, int i) {
            C10783d dVar2 = dVar;
            int i2 = i;
            String str2 = null;
            String str3 = (i2 & 1) != 0 ? dVar2.f23857a : null;
            String str4 = (i2 & 2) != 0 ? dVar2.f23858b : null;
            String str5 = (i2 & 4) != 0 ? dVar2.f23859c : str;
            boolean z2 = (i2 & 8) != 0 ? dVar2.f23860d : true;
            List list = (i2 & 16) != 0 ? dVar2.f23861e : arrayList;
            String str6 = (i2 & 32) != 0 ? dVar2.f23862f : null;
            if ((i2 & 64) != 0) {
                str2 = dVar2.f23863g;
            }
            String str7 = str2;
            PriceRange priceRange2 = (i2 & 128) != 0 ? dVar2.f23864h : priceRange;
            boolean z3 = (i2 & 256) != 0 ? dVar2.f23865i : z;
            C19383o.m32797g(str3, "id");
            C19383o.m32797g(str4, "title");
            C19383o.m32797g(str5, "subtitle");
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            C19383o.m32797g(str6, "customMinLabel");
            C19383o.m32797g(str7, "customMaxLabel");
            C19383o.m32797g(priceRange2, "customPriceRange");
            return new C10783d(str3, str4, str5, z2, list, str6, str7, priceRange2, z3);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23860d;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23857a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            return this.f23859c;
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23858b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.PRICE;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10783d)) {
                return false;
            }
            C10783d dVar = (C10783d) obj;
            return C19383o.m32792b(this.f23857a, dVar.f23857a) && C19383o.m32792b(this.f23858b, dVar.f23858b) && C19383o.m32792b(this.f23859c, dVar.f23859c) && this.f23860d == dVar.f23860d && C19383o.m32792b(this.f23861e, dVar.f23861e) && C19383o.m32792b(this.f23862f, dVar.f23862f) && C19383o.m32792b(this.f23863g, dVar.f23863g) && C19383o.m32792b(this.f23864h, dVar.f23864h) && this.f23865i == dVar.f23865i;
        }

        /* renamed from: g */
        public final PriceRange mo35838g() {
            return this.f23864h;
        }

        /* renamed from: h */
        public final List<C10803g> mo35839h() {
            return this.f23861e;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23859c, C0023f.m105e(this.f23858b, this.f23857a.hashCode() * 31, 31), 31);
            boolean z = this.f23860d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (this.f23864h.hashCode() + C0023f.m105e(this.f23863g, C0023f.m105e(this.f23862f, C13983i.m21488g(this.f23861e, (e + (z ? 1 : 0)) * 31, 31), 31), 31)) * 31;
            boolean z3 = this.f23865i;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final C10802f mo35841i() {
            T t;
            Iterator<T> it = this.f23861e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C10803g) t).f23938c) {
                    break;
                }
            }
            C10803g gVar = (C10803g) t;
            return gVar == null ? new C10802f((BigDecimal) null, (BigDecimal) null, false, false) : gVar.mo35905d() ? new C10802f(this.f23864h.mo35765d(), this.f23864h.mo35764c(), mo35843k(), mo35842j()) : new C10802f(gVar.f23939d, gVar.f23940e, mo35843k(), mo35842j());
        }

        /* renamed from: j */
        public final boolean mo35842j() {
            T t;
            Iterator<T> it = this.f23861e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C10803g) t).f23938c) {
                    break;
                }
            }
            C10803g gVar = (C10803g) t;
            return (gVar == null || !gVar.mo35905d() || this.f23864h.mo35764c() == null) ? false : true;
        }

        /* renamed from: k */
        public final boolean mo35843k() {
            T t;
            Iterator<T> it = this.f23861e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C10803g) t).f23938c) {
                    break;
                }
            }
            C10803g gVar = (C10803g) t;
            return (gVar == null || !gVar.mo35905d() || this.f23864h.mo35765d() == null) ? false : true;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PriceSelect(id=");
            h.append(this.f23857a);
            h.append(", title=");
            h.append(this.f23858b);
            h.append(", subtitle=");
            h.append(this.f23859c);
            h.append(", expanded=");
            h.append(this.f23860d);
            h.append(", items=");
            h.append(this.f23861e);
            h.append(", customMinLabel=");
            h.append(this.f23862f);
            h.append(", customMaxLabel=");
            h.append(this.f23863g);
            h.append(", customPriceRange=");
            h.append(this.f23864h);
            h.append(", isShowingKeyboard=");
            return C0391c.m1058d(h, this.f23865i, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$e */
    public static final class C10784e extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23866a;

        /* renamed from: b */
        public final String f23867b;

        /* renamed from: c */
        public final boolean f23868c;

        /* renamed from: d */
        public final String f23869d;

        /* renamed from: e */
        public final String f23870e;

        public C10784e(boolean z, String str, String str2, String str3, String str4) {
            C0048b.m167f(str, "id", str3, "countryName", str4, "countryCode");
            this.f23866a = str;
            this.f23867b = str2;
            this.f23868c = z;
            this.f23869d = str3;
            this.f23870e = str4;
        }

        /* renamed from: f */
        public static C10784e m18770f(C10784e eVar, String str, String str2) {
            String str3 = eVar.f23866a;
            String str4 = eVar.f23867b;
            boolean z = eVar.f23868c;
            C19383o.m32797g(str3, "id");
            C19383o.m32797g(str4, "title");
            C19383o.m32797g(str, "countryName");
            C19383o.m32797g(str2, "countryCode");
            return new C10784e(z, str3, str4, str, str2);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23868c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23866a;
        }

        /* renamed from: c */
        public final String mo35794c() {
            return this.f23869d;
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23867b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.SHIPS_TO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10784e)) {
                return false;
            }
            C10784e eVar = (C10784e) obj;
            return C19383o.m32792b(this.f23866a, eVar.f23866a) && C19383o.m32792b(this.f23867b, eVar.f23867b) && this.f23868c == eVar.f23868c && C19383o.m32792b(this.f23869d, eVar.f23869d) && C19383o.m32792b(this.f23870e, eVar.f23870e);
        }

        /* renamed from: g */
        public final FilterCountry mo35846g() {
            return new FilterCountry(this.f23869d, this.f23870e);
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23867b, this.f23866a.hashCode() * 31, 31);
            boolean z = this.f23868c;
            if (z) {
                z = true;
            }
            return this.f23870e.hashCode() + C0023f.m105e(this.f23869d, (e + (z ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShipsTo(id=");
            h.append(this.f23866a);
            h.append(", title=");
            h.append(this.f23867b);
            h.append(", expanded=");
            h.append(this.f23868c);
            h.append(", countryName=");
            h.append(this.f23869d);
            h.append(", countryCode=");
            return C0391c.m1057c(h, this.f23870e, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$f */
    public static final class C10785f extends SearchFiltersUiGroupItem {

        /* renamed from: a */
        public final String f23871a;

        /* renamed from: b */
        public final String f23872b;

        /* renamed from: c */
        public final boolean f23873c;

        /* renamed from: d */
        public final C10799d0 f23874d;

        /* renamed from: e */
        public final C10801e0 f23875e;

        /* renamed from: f */
        public final C10793c0 f23876f;

        public C10785f(String str, String str2, boolean z, C10799d0 d0Var, C10801e0 e0Var, C10793c0 c0Var) {
            C19383o.m32797g(str, "id");
            this.f23871a = str;
            this.f23872b = str2;
            this.f23873c = z;
            this.f23874d = d0Var;
            this.f23875e = e0Var;
            this.f23876f = c0Var;
        }

        /* renamed from: f */
        public static C10785f m18777f(C10785f fVar, C10799d0 d0Var, C10801e0 e0Var, C10793c0 c0Var, int i) {
            String str = null;
            String str2 = (i & 1) != 0 ? fVar.f23871a : null;
            if ((i & 2) != 0) {
                str = fVar.f23872b;
            }
            String str3 = str;
            boolean z = (i & 4) != 0 ? fVar.f23873c : false;
            if ((i & 8) != 0) {
                d0Var = fVar.f23874d;
            }
            C10799d0 d0Var2 = d0Var;
            if ((i & 16) != 0) {
                e0Var = fVar.f23875e;
            }
            C10801e0 e0Var2 = e0Var;
            if ((i & 32) != 0) {
                c0Var = fVar.f23876f;
            }
            C10793c0 c0Var2 = c0Var;
            fVar.getClass();
            C19383o.m32797g(str2, "id");
            C19383o.m32797g(str3, "title");
            C19383o.m32797g(d0Var2, "anyWhereItem");
            C19383o.m32797g(e0Var2, "userCountryItem");
            C19383o.m32797g(c0Var2, "customLocationItem");
            return new C10785f(str2, str3, z, d0Var2, e0Var2, c0Var2);
        }

        /* renamed from: a */
        public final boolean mo35792a() {
            return this.f23873c;
        }

        /* renamed from: b */
        public final String mo35793b() {
            return this.f23871a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
            r0 = r0.f23910d;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo35794c() {
            /*
                r3 = this;
                com.etsy.android.ui.search.filters.refactor.d0 r0 = r3.f23874d
                boolean r1 = r0.f23926c
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000b
                java.lang.String r2 = r0.f23925b
                goto L_0x0020
            L_0x000b:
                com.etsy.android.ui.search.filters.refactor.e0 r0 = r3.f23875e
                boolean r1 = r0.f23930c
                if (r1 == 0) goto L_0x0014
                java.lang.String r2 = r0.f23929b
                goto L_0x0020
            L_0x0014:
                com.etsy.android.ui.search.filters.refactor.c0 r0 = r3.f23876f
                boolean r1 = r0.f23909c
                if (r1 == 0) goto L_0x0020
                java.lang.String r0 = r0.f23910d
                if (r0 != 0) goto L_0x001f
                goto L_0x0020
            L_0x001f:
                r2 = r0
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem.C10785f.mo35794c():java.lang.String");
        }

        /* renamed from: d */
        public final String mo35795d() {
            return this.f23872b;
        }

        /* renamed from: e */
        public final SearchFiltersViewType mo35796e() {
            return SearchFiltersViewType.SHOP_LOCATION;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10785f)) {
                return false;
            }
            C10785f fVar = (C10785f) obj;
            return C19383o.m32792b(this.f23871a, fVar.f23871a) && C19383o.m32792b(this.f23872b, fVar.f23872b) && this.f23873c == fVar.f23873c && C19383o.m32792b(this.f23874d, fVar.f23874d) && C19383o.m32792b(this.f23875e, fVar.f23875e) && C19383o.m32792b(this.f23876f, fVar.f23876f);
        }

        /* renamed from: g */
        public final C10785f mo35850g() {
            return m18777f(this, C10799d0.m18805a(this.f23874d, false), C10801e0.m18807a(this.f23875e, false), C10793c0.m18798a(this.f23876f, true, (String) null, 11), 7);
        }

        /* renamed from: h */
        public final C10793c0 mo35851h() {
            return this.f23876f;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f23872b, this.f23871a.hashCode() * 31, 31);
            boolean z = this.f23873c;
            if (z) {
                z = true;
            }
            int hashCode = this.f23874d.hashCode();
            int hashCode2 = this.f23875e.hashCode();
            return this.f23876f.hashCode() + ((hashCode2 + ((hashCode + ((e + (z ? 1 : 0)) * 31)) * 31)) * 31);
        }

        /* renamed from: i */
        public final C10785f mo35853i(String str, boolean z) {
            C19383o.m32797g(str, "id");
            return m18777f(this, C19383o.m32792b(this.f23874d.f23924a, str) ? C10799d0.m18805a(this.f23874d, z) : C10799d0.m18805a(this.f23874d, !z), C19383o.m32792b(this.f23875e.f23928a, str) ? C10801e0.m18807a(this.f23875e, z) : C10801e0.m18807a(this.f23875e, !z), C19383o.m32792b(this.f23876f.f23907a, str) ? C10793c0.m18798a(this.f23876f, z, (String) null, 11) : C10793c0.m18798a(this.f23876f, !z, (String) null, 11), 7);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopLocation(id=");
            h.append(this.f23871a);
            h.append(", title=");
            h.append(this.f23872b);
            h.append(", expanded=");
            h.append(this.f23873c);
            h.append(", anyWhereItem=");
            h.append(this.f23874d);
            h.append(", userCountryItem=");
            h.append(this.f23875e);
            h.append(", customLocationItem=");
            h.append(this.f23876f);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: a */
    public abstract boolean mo35792a();

    /* renamed from: b */
    public abstract String mo35793b();

    /* renamed from: c */
    public abstract String mo35794c();

    /* renamed from: d */
    public abstract String mo35795d();

    /* renamed from: e */
    public SearchFiltersViewType mo35796e() {
        return SearchFiltersViewType.NONE;
    }
}
