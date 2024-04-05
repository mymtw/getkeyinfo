package com.etsy.android.p327ui.user.purchases;

import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2895z;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.clickhandlers.C9135p;
import com.etsy.android.p327ui.user.purchases.C11639e;
import com.etsy.android.p327ui.user.purchases.module.C11656a;
import com.etsy.android.p327ui.user.purchases.module.C11661b;
import com.etsy.android.p327ui.user.purchases.module.ModuleViewHolder;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.C11673a;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.ReviewCarouselViewHolder;
import com.etsy.android.uikit.adapter.C11832c;
import com.etsy.android.util.C12059p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.PurchaseReceiptAdapter */
public final class PurchaseReceiptAdapter extends C11832c<C11639e> {

    /* renamed from: c */
    public final C11649g f25734c;

    /* renamed from: d */
    public final C9135p f25735d;

    /* renamed from: e */
    public final C2895z<C12059p<C11633d>> f25736e = new C2895z<>();

    /* renamed from: f */
    public final C11628a f25737f = new C11628a(new PurchaseReceiptAdapter$clickEventDispatcher$1(this));

    /* renamed from: g */
    public final C2895z<C12059p<C11656a>> f25738g;

    /* renamed from: h */
    public final C11661b f25739h;

    /* renamed from: com.etsy.android.ui.user.purchases.PurchaseReceiptAdapter$ViewType */
    public enum ViewType {
        CAROUSEL,
        HEADER,
        PURCHASE,
        MODULE
    }

    /* renamed from: com.etsy.android.ui.user.purchases.PurchaseReceiptAdapter$a */
    public /* synthetic */ class C11626a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25740a;

        static {
            int[] iArr = new int[ViewType.values().length];
            iArr[ViewType.CAROUSEL.ordinal()] = 1;
            iArr[ViewType.HEADER.ordinal()] = 2;
            iArr[ViewType.PURCHASE.ordinal()] = 3;
            iArr[ViewType.MODULE.ordinal()] = 4;
            f25740a = iArr;
        }
    }

    public PurchaseReceiptAdapter(FragmentActivity fragmentActivity, C11649g gVar, C9135p pVar) {
        super(fragmentActivity);
        this.f25734c = gVar;
        this.f25735d = pVar;
        C2895z<C12059p<C11656a>> zVar = new C2895z<>();
        this.f25738g = zVar;
        this.f25739h = new C11661b(new PurchaseReceiptAdapter$moduleClickEventDispatcher$1(zVar));
    }

    public final int getListItemViewType(int i) {
        C11639e eVar = (C11639e) this.mItems.get(i);
        if (eVar instanceof C11639e.C11643d) {
            return ViewType.CAROUSEL.ordinal();
        }
        if (eVar instanceof C11639e.C11640a) {
            return ViewType.HEADER.ordinal();
        }
        if (eVar instanceof C11639e.C11642c) {
            return ViewType.PURCHASE.ordinal();
        }
        if (eVar instanceof C11639e.C11641b) {
            return ViewType.MODULE.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindListItemViewHolder(androidx.recyclerview.widget.RecyclerView.C3084b0 r47, int r48) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            r2 = r48
            boolean r3 = r1 instanceof com.etsy.android.p327ui.user.purchases.C11680v
            if (r3 == 0) goto L_0x0287
            com.etsy.android.ui.user.purchases.v r1 = (com.etsy.android.p327ui.user.purchases.C11680v) r1
            java.util.ArrayList<T> r3 = r0.mItems
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r3 = "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchaseListItem.PurchaseItem"
            kotlin.jvm.internal.C19383o.m32795e(r2, r3)
            com.etsy.android.ui.user.purchases.e$c r2 = (com.etsy.android.p327ui.user.purchases.C11639e.C11642c) r2
            com.etsy.android.ui.user.purchases.g r4 = r0.f25734c
            r1.getClass()
            java.lang.String r3 = "dependencies"
            kotlin.jvm.internal.C19383o.m32797g(r4, r3)
            android.view.View r3 = r1.itemView
            java.lang.String r5 = "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchasesReceiptView"
            kotlin.jvm.internal.C19383o.m32795e(r3, r5)
            r15 = r3
            com.etsy.android.ui.user.purchases.PurchasesReceiptView r15 = (com.etsy.android.p327ui.user.purchases.PurchasesReceiptView) r15
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt r2 = r2.f25766a
            com.etsy.android.ui.user.purchases.a r5 = r1.f25882b
            java.lang.String r1 = "receipt"
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            java.lang.String r1 = "dispatcher"
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            com.etsy.android.ui.user.purchases.s r1 = new com.etsy.android.ui.user.purchases.s
            long r6 = r2.getReceiptId()
            com.etsy.android.lib.models.pastpurchase.PastPurchaseUser r3 = r2.getSeller()
            if (r3 == 0) goto L_0x004c
            java.util.List r3 = r3.getShops()
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            boolean r9 = kotlinx.coroutines.C19543e0.m33306Y(r3)
            r10 = 0
            if (r9 == 0) goto L_0x0060
            java.lang.Object r3 = r3.get(r10)
            com.etsy.android.lib.models.pastpurchase.PastPurchaseShop r3 = (com.etsy.android.lib.models.pastpurchase.PastPurchaseShop) r3
            java.lang.String r3 = r3.getShopName()
            r9 = r3
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            com.etsy.android.lib.models.pastpurchase.PastPurchaseUser r3 = r2.getSeller()
            if (r3 == 0) goto L_0x0097
            com.etsy.android.lib.models.pastpurchase.PastPurchaseShop r12 = com.etsy.android.lib.models.pastpurchase.extensions.PastPurchaseUserExtensionsKt.getMainShop(r3)
            if (r12 == 0) goto L_0x007c
            java.lang.String r13 = r12.getIcon()
            boolean r13 = p628nj.C18263b.m30839d0(r13)
            if (r13 == 0) goto L_0x007c
            java.lang.String r12 = r12.getIcon()
            goto L_0x007d
        L_0x007c:
            r12 = 0
        L_0x007d:
            if (r12 == 0) goto L_0x0088
            int r13 = r12.length()
            if (r13 != 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r13 = r10
            goto L_0x0089
        L_0x0088:
            r13 = 1
        L_0x0089:
            if (r13 == 0) goto L_0x0098
            com.etsy.android.lib.models.pastpurchase.PastPurchaseUserProfile r3 = r3.getProfile()
            if (r3 == 0) goto L_0x0097
            java.lang.String r3 = r3.getUrl75x75()
            r12 = r3
            goto L_0x0098
        L_0x0097:
            r12 = 0
        L_0x0098:
            com.etsy.android.lib.currency.b r3 = r4.f25774b
            com.etsy.android.lib.currency.EtsyMoney r3 = com.etsy.android.lib.models.pastpurchase.extensions.PastPurchaseReceiptExtensionsKt.getGrandTotalPrice(r2, r3)
            java.lang.String r13 = r3.format()
            java.util.Date r3 = new java.util.Date
            long r16 = r2.getCreationDate()
            r18 = 1000(0x3e8, double:4.94E-321)
            r48 = r9
            long r8 = r16 * r18
            r3.<init>(r8)
            java.lang.String r14 = com.etsy.android.lib.util.C8885d0.m17321e(r3)
            java.lang.String r3 = "formatShortDate(Date(rec…pt.creationDate * 1000L))"
            kotlin.jvm.internal.C19383o.m32796f(r14, r3)
            java.lang.String r3 = r2.getMultiShopNote()
            if (r3 == 0) goto L_0x00c9
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r3 = r10
            goto L_0x00ca
        L_0x00c9:
            r3 = 1
        L_0x00ca:
            if (r3 == 0) goto L_0x00cf
            r38 = 8
            goto L_0x00d1
        L_0x00cf:
            r38 = r10
        L_0x00d1:
            java.lang.String r39 = r2.getMultiShopNote()
            com.etsy.android.lib.models.pastpurchase.ReceiptStatus r3 = new com.etsy.android.lib.models.pastpurchase.ReceiptStatus
            r3.<init>()
            android.content.res.Resources r9 = r4.f25773a
            java.text.SimpleDateFormat r8 = r4.f25775c
            java.lang.String r40 = r3.getStatus(r9, r8, r2)
            java.util.List r3 = r2.getTransactions()
            if (r3 == 0) goto L_0x00ed
            int r3 = r3.size()
            goto L_0x00ee
        L_0x00ed:
            r3 = r10
        L_0x00ee:
            r8 = r10
            r16 = 0
        L_0x00f1:
            if (r8 >= r3) goto L_0x026b
            int r9 = r3 + -1
            if (r8 != r9) goto L_0x00f9
            r9 = 1
            goto L_0x00fa
        L_0x00f9:
            r9 = r10
        L_0x00fa:
            if (r16 != 0) goto L_0x0101
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
        L_0x0101:
            r41 = r16
            android.content.res.Resources r10 = r4.f25773a
            com.etsy.android.lib.currency.b r11 = r4.f25774b
            java.lang.String r16 = r2.getTransparentPricingMessage()
            r43 = r3
            java.lang.String r3 = "resources"
            kotlin.jvm.internal.C19383o.m32797g(r10, r3)
            java.lang.String r3 = "etsyMoneyFactory"
            kotlin.jvm.internal.C19383o.m32797g(r11, r3)
            java.util.List r3 = r2.getTransactions()
            kotlin.jvm.internal.C19383o.m32794d(r3)
            java.lang.Object r3 = r3.get(r8)
            com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction r3 = (com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction) r3
            long r18 = r2.getReceiptId()
            r44 = r2
            java.lang.String r2 = "transaction"
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            com.etsy.android.ui.user.purchases.w r2 = new com.etsy.android.ui.user.purchases.w
            long r20 = r3.getTransactionId()
            com.etsy.android.lib.models.pastpurchase.PastPurchaseListing r17 = r3.getListing()
            if (r17 == 0) goto L_0x0140
            long r22 = r17.getListingId()
            goto L_0x0142
        L_0x0140:
            r22 = 0
        L_0x0142:
            if (r9 == 0) goto L_0x0147
            r24 = 0
            goto L_0x0149
        L_0x0147:
            r24 = 8
        L_0x0149:
            java.lang.String r9 = r3.getTitle()
            if (r9 == 0) goto L_0x0156
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r25 = r9
            goto L_0x0158
        L_0x0156:
            r25 = 0
        L_0x0158:
            java.lang.String r9 = r3.getTitle()
            r45 = r15
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            if (r9 == 0) goto L_0x0168
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            goto L_0x0169
        L_0x0168:
            r9 = 0
        L_0x0169:
            r42 = 0
            r0[r42] = r9
            r9 = 2131952393(0x7f130309, float:1.9541227E38)
            java.lang.String r26 = r10.getString(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r9 = 2131953393(0x7f1306f1, float:1.9543256E38)
            java.lang.String r9 = r10.getString(r9)
            r0.append(r9)
            java.lang.String r9 = ": "
            r0.append(r9)
            com.etsy.android.lib.currency.EtsyMoney r11 = com.etsy.android.lib.models.pastpurchase.extensions.PastPurchaseTransactionExtensionsKt.getItemPrice(r3, r11)
            java.lang.String r11 = r11.format()
            r0.append(r11)
            java.lang.String r27 = r0.toString()
            int r0 = r3.getQuantity()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r15 = 2131953296(0x7f130690, float:1.9543059E38)
            java.lang.String r10 = r10.getString(r15)
            r11.append(r10)
            r11.append(r9)
            r11.append(r0)
            java.lang.String r28 = r11.toString()
            boolean r0 = p628nj.C18263b.m30839d0(r16)
            if (r0 == 0) goto L_0x01bd
            r29 = r42
            goto L_0x01bf
        L_0x01bd:
            r29 = 8
        L_0x01bf:
            if (r16 == 0) goto L_0x01c8
            android.text.Spanned r0 = p628nj.C18263b.m30867s0(r16)
            r30 = r0
            goto L_0x01ca
        L_0x01c8:
            r30 = 0
        L_0x01ca:
            com.etsy.android.lib.models.pastpurchase.ReceiptUserReview r0 = r3.getUserReview()
            if (r0 == 0) goto L_0x01d3
            r31 = r42
            goto L_0x01d5
        L_0x01d3:
            r31 = 8
        L_0x01d5:
            com.etsy.android.lib.models.pastpurchase.ReceiptUserReview r0 = r3.getUserReview()
            if (r0 == 0) goto L_0x01e8
            java.lang.Integer r0 = r0.getRating()
            if (r0 == 0) goto L_0x01e8
            int r0 = r0.intValue()
            r32 = r0
            goto L_0x01ea
        L_0x01e8:
            r32 = r42
        L_0x01ea:
            boolean r0 = r3.isFeedbackMutable()
            if (r0 == 0) goto L_0x01f9
            com.etsy.android.lib.models.pastpurchase.ReceiptUserReview r0 = r3.getUserReview()
            if (r0 != 0) goto L_0x01f9
            r33 = r42
            goto L_0x01fb
        L_0x01f9:
            r33 = 8
        L_0x01fb:
            boolean r0 = com.etsy.android.p327ui.user.purchases.C11681w.C11682a.m19387a(r3)
            if (r0 == 0) goto L_0x0204
            r34 = r42
            goto L_0x0206
        L_0x0204:
            r34 = 8
        L_0x0206:
            boolean r35 = com.etsy.android.p327ui.user.purchases.C11681w.C11682a.m19387a(r3)
            com.etsy.android.lib.models.pastpurchase.PastPurchaseListing r0 = r3.getListing()
            if (r0 == 0) goto L_0x021f
            boolean r9 = com.etsy.android.lib.models.pastpurchase.extensions.PastPurchasesReceiptListingStateExtensionsKt.isActive(r0)
            if (r9 == 0) goto L_0x021f
            boolean r0 = r0.isPersonalizable()
            if (r0 != 0) goto L_0x021f
            r36 = 1
            goto L_0x0221
        L_0x021f:
            r36 = r42
        L_0x0221:
            boolean r0 = r3.isGiftCard()
            if (r0 == 0) goto L_0x0239
            com.etsy.android.lib.models.pastpurchase.PastPurchasesGiftCardDesign r0 = r3.getGiftCardDesign()
            if (r0 == 0) goto L_0x0239
            com.etsy.android.lib.models.pastpurchase.PastPurchasesGiftCardDesign r0 = r3.getGiftCardDesign()
            kotlin.jvm.internal.C19383o.m32794d(r0)
            java.lang.String r0 = r0.getUrl150x119()
            goto L_0x024a
        L_0x0239:
            com.etsy.android.lib.models.pastpurchase.PastPurchaseMainImage r0 = r3.getMainImage()
            if (r0 == 0) goto L_0x024d
            com.etsy.android.lib.models.pastpurchase.PastPurchaseMainImage r0 = r3.getMainImage()
            kotlin.jvm.internal.C19383o.m32794d(r0)
            java.lang.String r0 = r0.getUrl170x135()
        L_0x024a:
            r37 = r0
            goto L_0x024f
        L_0x024d:
            r37 = 0
        L_0x024f:
            r16 = r2
            r17 = r5
            r16.<init>(r17, r18, r20, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0 = r41
            r0.add(r2)
            int r8 = r8 + 1
            r16 = r0
            r10 = r42
            r3 = r43
            r2 = r44
            r15 = r45
            r0 = r46
            goto L_0x00f1
        L_0x026b:
            r45 = r15
            r3 = r1
            r8 = r48
            r9 = r12
            r10 = r13
            r11 = r14
            r12 = r38
            r13 = r39
            r14 = r40
            r0 = r45
            r15 = r16
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.setViewState(r1)
            r3 = r46
            goto L_0x030b
        L_0x0287:
            boolean r0 = r1 instanceof com.etsy.android.p327ui.user.purchases.reviewcarousel.C11673a
            if (r0 == 0) goto L_0x02da
            r0 = r1
            com.etsy.android.ui.user.purchases.reviewcarousel.a r0 = (com.etsy.android.p327ui.user.purchases.reviewcarousel.C11673a) r0
            r3 = r46
            java.util.ArrayList<T> r1 = r3.mItems
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchaseListItem.Header"
            kotlin.jvm.internal.C19383o.m32795e(r1, r2)
            com.etsy.android.ui.user.purchases.e$a r1 = (com.etsy.android.p327ui.user.purchases.C11639e.C11640a) r1
            r0.getClass()
            android.view.View r2 = r0.itemView
            r4 = 2131430161(0x7f0b0b11, float:1.8482015E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r4 = r0.itemView
            r5 = 2131427529(0x7f0b00c9, float:1.8476677E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r0 = r0.itemView
            android.content.Context r0 = r0.getContext()
            int r5 = r1.f25763a
            java.lang.CharSequence r0 = r0.getText(r5)
            r2.setText(r0)
            int r0 = r1.f25764b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.setText(r0)
            int r0 = r1.f25764b
            if (r0 <= 0) goto L_0x02d6
            com.etsy.android.extensions.ViewExtensions.m12869m(r4)
            goto L_0x030b
        L_0x02d6:
            com.etsy.android.extensions.ViewExtensions.m12860d(r4)
            goto L_0x030b
        L_0x02da:
            r3 = r46
            boolean r0 = r1 instanceof com.etsy.android.p327ui.user.purchases.reviewcarousel.ReviewCarouselViewHolder
            if (r0 == 0) goto L_0x02f4
            r0 = r1
            com.etsy.android.ui.user.purchases.reviewcarousel.ReviewCarouselViewHolder r0 = (com.etsy.android.p327ui.user.purchases.reviewcarousel.ReviewCarouselViewHolder) r0
            java.util.ArrayList<T> r1 = r3.mItems
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchaseListItem.ReviewCarousel"
            kotlin.jvm.internal.C19383o.m32795e(r1, r2)
            com.etsy.android.ui.user.purchases.e$d r1 = (com.etsy.android.p327ui.user.purchases.C11639e.C11643d) r1
            r0.mo19450a(r1)
            goto L_0x030b
        L_0x02f4:
            boolean r0 = r1 instanceof com.etsy.android.p327ui.user.purchases.module.ModuleViewHolder
            if (r0 == 0) goto L_0x030b
            r0 = r1
            com.etsy.android.ui.user.purchases.module.ModuleViewHolder r0 = (com.etsy.android.p327ui.user.purchases.module.ModuleViewHolder) r0
            java.util.ArrayList<T> r1 = r3.mItems
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchaseListItem.ModuleItem"
            kotlin.jvm.internal.C19383o.m32795e(r1, r2)
            com.etsy.android.ui.user.purchases.e$b r1 = (com.etsy.android.p327ui.user.purchases.C11639e.C11641b) r1
            r0.mo37747e(r1)
        L_0x030b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.purchases.PurchaseReceiptAdapter.onBindListItemViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        int i2 = C11626a.f25740a[ViewType.values()[i].ordinal()];
        if (i2 == 1) {
            return new ReviewCarouselViewHolder(viewGroup, this.f25735d);
        }
        if (i2 == 2) {
            int i3 = C11673a.f25854b;
            return new C11673a(C0114h.m305j0(viewGroup, R.layout.list_item_purchases_header, false));
        } else if (i2 == 3) {
            int i4 = C11680v.f25881c;
            return new C11680v(C0114h.m305j0(viewGroup, R.layout.list_item_purchases_receipt, false), this.f25737f);
        } else if (i2 == 4) {
            int i5 = ModuleViewHolder.f25782o;
            return new ModuleViewHolder(C0114h.m305j0(viewGroup, R.layout.list_item_purchase_module, false), this.f25739h);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
