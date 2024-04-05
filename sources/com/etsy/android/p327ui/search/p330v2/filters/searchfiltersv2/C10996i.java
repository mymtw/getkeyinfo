package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.filters.AttributeValue;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11007n;
import com.etsy.android.stylekit.views.CollageActionGroupItem;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageColorSwatch;
import com.etsy.android.stylekit.views.CollageTextView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p441sb.C13367a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.i */
public final class C10996i extends C3200w<ValueFacet, RecyclerView.C3084b0> {

    /* renamed from: c */
    public List<ValueFacet> f24388c;

    /* renamed from: d */
    public final SearchFiltersV2Type f24389d;

    /* renamed from: e */
    public final C19861p<ValueFacet, Boolean, C19394m> f24390e;

    /* renamed from: f */
    public Map<String, ? extends C11007n> f24391f = C19294b0.m32559p0();

    /* renamed from: g */
    public List<ValueFacet> f24392g = EmptyList.INSTANCE;

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.i$a */
    public final class C10997a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final CollageColorSwatch f24393b;

        /* renamed from: c */
        public final CollageTextView f24394c;

        public C10997a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.colorSwatch);
            C19383o.m32796f(findViewById, "containerView.findViewById(R.id.colorSwatch)");
            this.f24393b = (CollageColorSwatch) findViewById;
            View findViewById2 = view.findViewById(R.id.colorName);
            C19383o.m32796f(findViewById2, "containerView.findViewById(R.id.colorName)");
            this.f24394c = (CollageTextView) findViewById2;
        }

        /* renamed from: e */
        public final void mo36554e(boolean z) {
            if (z) {
                C19388s.m32810A0(this.f24394c, new C13367a.C13368a());
            } else {
                C19388s.m32810A0(this.f24394c, new C13367a.C13370c());
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.i$b */
    public static final class C10998b extends C3167n.C3172e<ValueFacet> {

        /* renamed from: a */
        public static final C10998b f24396a = new C10998b();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            ValueFacet valueFacet = (ValueFacet) obj;
            ValueFacet valueFacet2 = (ValueFacet) obj2;
            AttributeValue attributeValue = valueFacet.getAttributeValue();
            String str = null;
            String id = attributeValue != null ? attributeValue.getId() : null;
            AttributeValue attributeValue2 = valueFacet2.getAttributeValue();
            if (attributeValue2 != null) {
                str = attributeValue2.getId();
            }
            if (!C19383o.m32792b(id, str) || !C19383o.m32792b(valueFacet.getCount(), valueFacet2.getCount())) {
                if (C19383o.m32792b(valueFacet.getCount(), valueFacet2.getCount())) {
                    return false;
                }
                String count = valueFacet2.getCount();
                if ((count != null ? Integer.parseInt(count) : 0) <= 0) {
                    return false;
                }
                String count2 = valueFacet.getCount();
                return (count2 != null ? Integer.parseInt(count2) : 0) > 0;
            }
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            ValueFacet valueFacet = (ValueFacet) obj2;
            AttributeValue attributeValue = ((ValueFacet) obj).getAttributeValue();
            String str = null;
            String id = attributeValue != null ? attributeValue.getId() : null;
            AttributeValue attributeValue2 = valueFacet.getAttributeValue();
            if (attributeValue2 != null) {
                str = attributeValue2.getId();
            }
            return C19383o.m32792b(id, str);
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.i$c */
    public final class C10999c extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final CollageCheckbox f24397b;

        public C10999c(View view) {
            super(view);
            View findViewById = this.itemView.findViewById(R.id.checkbox);
            C19383o.m32796f(findViewById, "itemView.findViewById(R.id.checkbox)");
            this.f24397b = (CollageCheckbox) findViewById;
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.i$d */
    public final class C11000d extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final CollageActionGroupItem f24399b;

        public C11000d(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.size);
            C19383o.m32796f(findViewById, "containerView.findViewById(R.id.size)");
            this.f24399b = (CollageActionGroupItem) findViewById;
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.i$e */
    public /* synthetic */ class C11001e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24401a;

        static {
            int[] iArr = new int[SearchFiltersV2Type.values().length];
            iArr[SearchFiltersV2Type.MULTI_SELECT.ordinal()] = 1;
            iArr[SearchFiltersV2Type.SIZE.ordinal()] = 2;
            iArr[SearchFiltersV2Type.COLOR.ordinal()] = 3;
            f24401a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10996i(List<ValueFacet> list, SearchFiltersV2Type searchFiltersV2Type, C19861p<? super ValueFacet, ? super Boolean, C19394m> pVar) {
        super(C10998b.f24396a);
        C19383o.m32797g(list, ResponseConstants.SELECTED_VALUES);
        this.f24388c = list;
        this.f24389d = searchFiltersV2Type;
        this.f24390e = pVar;
    }

    public final int getItemViewType(int i) {
        SearchFiltersV2Type searchFiltersV2Type = this.f24389d;
        int i2 = searchFiltersV2Type == null ? -1 : C11001e.f24401a[searchFiltersV2Type.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: k */
    public final void mo36553k(List<ValueFacet> list, List<ValueFacet> list2) {
        C19383o.m32797g(list, "valueFacets");
        C19383o.m32797g(list2, ResponseConstants.SELECTED_VALUES);
        this.f24388c = list2;
        this.f24392g = list;
        mo11950j(list);
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        Image image;
        C19383o.m32797g(b0Var, "holder");
        int itemViewType = getItemViewType(i);
        String str = null;
        if (itemViewType != 0) {
            boolean z = false;
            if (itemViewType == 1) {
                C11000d dVar = (C11000d) b0Var;
                Object item = getItem(i);
                C19383o.m32796f(item, "getItem(position)");
                ValueFacet valueFacet = (ValueFacet) item;
                AttributeValue attributeValue = valueFacet.getAttributeValue();
                if ((attributeValue != null ? attributeValue.getName() : null) != null) {
                    CollageActionGroupItem collageActionGroupItem = dVar.f24399b;
                    AttributeValue attributeValue2 = valueFacet.getAttributeValue();
                    if (attributeValue2 != null) {
                        str = attributeValue2.getName();
                    }
                    collageActionGroupItem.setText(str);
                }
                if (C19383o.m32792b(valueFacet.getCount(), "0")) {
                    dVar.f24399b.setEnabled(false);
                }
                if (C10996i.this.f24388c.contains(valueFacet)) {
                    dVar.f24399b.setChecked(true);
                    dVar.f24399b.setOnCheckedChangeListener(new C11003k(C10996i.this, valueFacet));
                    return;
                }
                dVar.f24399b.setOnCheckedChangeListener(new C11004l(C10996i.this, valueFacet));
            } else if (itemViewType == 2) {
                C10997a aVar = (C10997a) b0Var;
                Object item2 = getItem(i);
                C19383o.m32796f(item2, "getItem(position)");
                ValueFacet valueFacet2 = (ValueFacet) item2;
                AttributeValue attributeValue3 = valueFacet2.getAttributeValue();
                if (String.valueOf(attributeValue3 != null ? attributeValue3.getName() : null).length() > 0) {
                    z = true;
                }
                if (z) {
                    aVar.f24394c.setText(attributeValue3 != null ? attributeValue3.getName() : null);
                    aVar.f24393b.setContentDescription(attributeValue3 != null ? attributeValue3.getName() : null);
                }
                C11007n nVar = (C11007n) C10996i.this.f24391f.get(attributeValue3 != null ? attributeValue3.getId() : null);
                if (nVar instanceof C11007n.C11008a) {
                    aVar.f24393b.setColor(Color.parseColor(((C11007n.C11008a) nVar).f24411a));
                } else if (nVar instanceof C11007n.C11009b) {
                    aVar.f24393b.setDrawableRes(((C11007n.C11009b) nVar).f24412a);
                } else {
                    CollageColorSwatch collageColorSwatch = aVar.f24393b;
                    if (!(attributeValue3 == null || (image = attributeValue3.getImage()) == null)) {
                        str = image.getUrl();
                    }
                    collageColorSwatch.setImageUrl(str);
                }
                if (C10996i.this.f24388c.contains(valueFacet2)) {
                    aVar.f24393b.setChecked(true);
                    aVar.mo36554e(true);
                    aVar.f24393b.setOnCheckedChangeListener(new C10994g(aVar, C10996i.this, valueFacet2));
                    return;
                }
                aVar.f24393b.setOnCheckedChangeListener(new C10995h(aVar, C10996i.this, valueFacet2));
            }
        } else {
            C10999c cVar = (C10999c) b0Var;
            Object item3 = getItem(i);
            C19383o.m32796f(item3, "getItem(position)");
            ValueFacet valueFacet3 = (ValueFacet) item3;
            CollageCheckbox collageCheckbox = cVar.f24397b;
            AttributeValue attributeValue4 = valueFacet3.getAttributeValue();
            if (attributeValue4 != null) {
                str = attributeValue4.getName();
            }
            collageCheckbox.setText(str);
            cVar.f24397b.setEnabled(!C19383o.m32792b(valueFacet3.getCount(), "0"));
            C10996i iVar = C10996i.this;
            C11002j jVar = new C11002j(iVar, valueFacet3);
            if (iVar.f24388c.contains(valueFacet3)) {
                cVar.f24397b.setChecked(true);
                cVar.f24397b.setOnCheckedChangeListener(jVar);
                return;
            }
            cVar.f24397b.setOnCheckedChangeListener(jVar);
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        String id;
        C11007n nVar;
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.list_item_filter_multi_select, viewGroup, false);
            C19383o.m32796f(inflate, "inflater.inflate(\n      …  false\n                )");
            return new C10999c(inflate);
        } else if (i == 1) {
            View inflate2 = from.inflate(R.layout.list_item_filters_size, viewGroup, false);
            C19383o.m32796f(inflate2, "view");
            return new C11000d(inflate2);
        } else if (i != 2) {
            View inflate3 = from.inflate(R.layout.list_item_filter_multi_select, viewGroup, false);
            C19383o.m32796f(inflate3, "inflater.inflate(\n      …  false\n                )");
            return new C10999c(inflate3);
        } else {
            List<ValueFacet> list = this.f24392g;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap t0 = C19294b0.m32563t0(new Pair("1213", new C11007n.C11008a("#F5F5DC")), new Pair(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new C11007n.C11008a("#000000")), new Pair("2", new C11007n.C11008a("#0000FF")), new Pair("1216", new C11007n.C11009b(R.drawable.search_filter_color_bronze)), new Pair("3", new C11007n.C11008a("#A52A2A")), new Pair("2308", new C11007n.C11008a("#FFE4C4")), new Pair("1219", new C11007n.C11009b(R.drawable.search_filter_color_clear)), new Pair("2309", new C11007n.C11009b(R.drawable.search_filter_color_colorless)), new Pair("1218", new C11007n.C11009b(R.drawable.search_filter_color_copper)), new Pair("1214", new C11007n.C11009b(R.drawable.search_filter_color_gold)), new Pair("5", new C11007n.C11008a("#808080")), new Pair("4", new C11007n.C11008a("#008000")), new Pair("6", new C11007n.C11008a("#FFA500")), new Pair("7", new C11007n.C11008a("#FFC0CB")), new Pair("8", new C11007n.C11008a("#800080")), new Pair("1220", new C11007n.C11009b(R.drawable.search_filter_color_rainbow)), new Pair("9", new C11007n.C11008a("#FF0000")), new Pair("1217", new C11007n.C11009b(R.drawable.search_filter_color_rose_gold)), new Pair("1215", new C11007n.C11009b(R.drawable.search_filter_color_silver)), new Pair("10", new C11007n.C11009b(R.drawable.search_filter_color_white)), new Pair("11", new C11007n.C11008a("#FFFF00")));
            for (ValueFacet attributeValue : list) {
                AttributeValue attributeValue2 = attributeValue.getAttributeValue();
                if (!(attributeValue2 == null || (id = attributeValue2.getId()) == null || (nVar = (C11007n) t0.get(id)) == null)) {
                    linkedHashMap.put(id, nVar);
                }
            }
            this.f24391f = linkedHashMap;
            View inflate4 = from.inflate(R.layout.list_item_filters_color, viewGroup, false);
            C19383o.m32796f(inflate4, "inflater.inflate(\n      …                   false)");
            return new C10997a(inflate4);
        }
    }
}
