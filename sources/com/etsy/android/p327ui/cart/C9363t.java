package com.etsy.android.p327ui.cart;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.cart.CartGroup;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.lib.models.apiv3.cart.CartThankYouGroup;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.cart.viewholders.C9390k;
import com.etsy.android.uikit.nav.transactions.C11869a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p357gf.C12796e;
import p415of.C13173c;
import p415of.C13186o;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.cart.t */
public final class C9363t extends C13173c {

    /* renamed from: i */
    public int f20678i = 0;

    public C9363t(Fragment fragment, C8703p pVar, C9333r rVar) {
        super(fragment, pVar, rVar, (C13895a) null, (C8923u) null, (C12796e) null);
        this.f28994f = true;
    }

    /* renamed from: k */
    public final boolean mo31808k() {
        return true;
    }

    /* renamed from: n */
    public final void mo31809n(C11869a aVar) {
        if (aVar != null) {
            this.f20678i = aVar.mo38347d("last_loaded_page_start_index", 0);
        }
        super.mo31809n(aVar);
    }

    /* renamed from: o */
    public final void mo31810o(C11869a aVar) {
        super.mo31810o(aVar);
        if (aVar != null) {
            aVar.mo38349f("last_loaded_page_start_index", Integer.valueOf(this.f20678i));
        }
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(b0Var, i, list);
            return;
        }
        for (Object next : list) {
            if (next instanceof CartReceipt) {
                C9390k kVar = (C9390k) b0Var;
                CartReceipt cartReceipt = (CartReceipt) next;
                kVar.getClass();
                C19383o.m32797g(cartReceipt, "cartReceipt");
                C9419w wVar = kVar.f20796c;
                int i2 = 0;
                while (true) {
                    if (i2 >= wVar.f20895b.size()) {
                        i2 = -1;
                        break;
                    }
                    if (wVar.f20895b.get(i2) instanceof CartGroupItem) {
                        CartGroupItem cartGroupItem = (CartGroupItem) wVar.f20895b.get(i2);
                        if ((cartGroupItem.getData() instanceof CartReceipt) && cartReceipt.getReceiptId() == ((CartReceipt) cartGroupItem.getData()).getReceiptId()) {
                            break;
                        }
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    kVar.f20796c.notifyItemChanged(i2, cartReceipt);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [com.etsy.android.lib.models.BaseModel] */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.etsy.android.lib.models.BaseModel] */
    /* JADX WARNING: type inference failed for: r3v10, types: [com.etsy.android.lib.models.BaseModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo31811q() {
        /*
            r6 = this;
            java.util.List r0 = r6.getItems()
            java.lang.String r1 = "items"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r0.next()
            of.o r2 = (p415of.C13186o) r2
            boolean r3 = r2 instanceof com.etsy.android.lib.models.apiv3.cart.CartGroup
            if (r3 == 0) goto L_0x0012
            com.etsy.android.lib.models.apiv3.cart.CartGroup r2 = (com.etsy.android.lib.models.apiv3.cart.CartGroup) r2
            java.util.List r2 = r2.getItems()
            java.lang.String r3 = "it.items"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0031:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0012
            java.lang.Object r3 = r2.next()
            com.etsy.android.lib.models.apiv3.cart.CartGroupItem r3 = (com.etsy.android.lib.models.apiv3.cart.CartGroupItem) r3
            int r4 = r3.getViewType()
            r5 = 0
            switch(r4) {
                case 2131430499: goto L_0x005e;
                case 2131430500: goto L_0x0052;
                case 2131430501: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0069
        L_0x0046:
            com.etsy.android.lib.models.BaseModel r3 = r3.getData()
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.cart.CartListing
            if (r4 == 0) goto L_0x0069
            r5 = r3
            com.etsy.android.lib.models.apiv3.cart.CartListing r5 = (com.etsy.android.lib.models.apiv3.cart.CartListing) r5
            goto L_0x0069
        L_0x0052:
            com.etsy.android.lib.models.BaseModel r3 = r3.getData()
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.cart.CartListing
            if (r4 == 0) goto L_0x0069
            r5 = r3
            com.etsy.android.lib.models.apiv3.cart.CartListing r5 = (com.etsy.android.lib.models.apiv3.cart.CartListing) r5
            goto L_0x0069
        L_0x005e:
            com.etsy.android.lib.models.BaseModel r3 = r3.getData()
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.cart.CartListing
            if (r4 == 0) goto L_0x0069
            r5 = r3
            com.etsy.android.lib.models.apiv3.cart.CartListing r5 = (com.etsy.android.lib.models.apiv3.cart.CartListing) r5
        L_0x0069:
            if (r5 == 0) goto L_0x0031
            com.etsy.android.lib.models.datatypes.EtsyId r3 = r5.getListingId()
            long r3 = r3.getIdAsLongDeprecated()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.add(r3)
            goto L_0x0031
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.C9363t.mo31811q():java.util.ArrayList");
    }

    /* renamed from: r */
    public final List<CartReceipt> mo31812r() {
        List<CartReceipt> arrayList = new ArrayList<>();
        for (C13186o oVar : getItems()) {
            if (R.id.view_type_multishop_cart_thank_you_group == oVar.getViewType()) {
                arrayList = ((CartThankYouGroup) oVar).getReceipts();
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public final ArrayList mo31813s(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (getItemCount() == 0) {
            return arrayList;
        }
        List items = getItems();
        for (int i = z ? this.f20678i : 0; i < items.size(); i++) {
            C13186o oVar = (C13186o) items.get(i);
            if (R.id.view_type_multishop_cart_group == oVar.getViewType()) {
                arrayList.add(((CartGroup) oVar).getCartGroupId());
            }
        }
        return arrayList;
    }
}
