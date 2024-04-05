package com.etsy.android.p327ui.user;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.R;
import com.etsy.android.checkout.C6335b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.GiftCardInfo;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.Transaction;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.Variation;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.cart.saved.C9342c;
import com.etsy.android.p327ui.core.ListingMapper;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.adapter.BaseModelArrayAdapter;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p321cc.C8569c;
import p356ge.C12788a;
import p456ua.C13461f;
import p470w9.C13793a;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.TransactionAdapter */
public class TransactionAdapter extends BaseModelArrayAdapter<Transaction> {
    private ListingMapper listingMapper;
    private C8569c listingRepository;
    private boolean mIsSellerOrder = false;
    /* access modifiers changed from: private */
    public C11351e mTransactionClickListener;
    /* access modifiers changed from: private */
    public User mUser;
    private C13461f schedulers;
    private C8703p tracker;

    /* renamed from: com.etsy.android.ui.user.TransactionAdapter$a */
    public class C11347a extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C11517d f25017b;

        public C11347a(C11517d dVar) {
            this.f25017b = dVar;
        }

        public final void onViewClick(View view) {
            TransactionAdapter.this.mTransactionClickListener.onBuyThisAgainClick(this.f25017b);
        }
    }

    /* renamed from: com.etsy.android.ui.user.TransactionAdapter$b */
    public class C11348b extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ Transaction f25019b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11348b(C8698l[] lVarArr, Transaction transaction) {
            super(lVarArr);
            this.f25019b = transaction;
        }

        public final void onViewClick(View view) {
            if (this.f25019b.getListingId().getIdAsLong() != 0) {
                String c0 = C19421p.m32935c0(TransactionAdapter.this.getActivityContext());
                EtsyId listingId = this.f25019b.getListingId();
                C19383o.m32797g(listingId, "listingId");
                C12788a.m20424c(TransactionAdapter.this.getActivityContext(), new ListingKey(c0, listingId, true, true, (Bundle) null));
            }
        }
    }

    /* renamed from: com.etsy.android.ui.user.TransactionAdapter$c */
    public class C11349c extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ Transaction f25021b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11349c(C8698l[] lVarArr, Transaction transaction) {
            super(lVarArr);
            this.f25021b = transaction;
        }

        public final void onViewClick(View view) {
            if (TransactionAdapter.this.mTransactionClickListener != null) {
                TransactionAdapter.this.mTransactionClickListener.onTransactionClick(this.f25021b, TransactionAdapter.this.mUser);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.user.TransactionAdapter$d */
    public class C11350d extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ Transaction f25023b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11350d(C8698l[] lVarArr, Transaction transaction) {
            super(lVarArr);
            this.f25023b = transaction;
        }

        public final void onViewClick(View view) {
            if (TransactionAdapter.this.mTransactionClickListener != null) {
                TransactionAdapter.this.mTransactionClickListener.onTransactionClick(this.f25023b, TransactionAdapter.this.mUser);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.user.TransactionAdapter$e */
    public interface C11351e {
        void onBuyThisAgainClick(C11517d dVar);

        void onTransactionClick(Transaction transaction, User user);
    }

    /* renamed from: com.etsy.android.ui.user.TransactionAdapter$f */
    public static class C11352f {

        /* renamed from: a */
        public TextView f25025a;

        /* renamed from: b */
        public TextView f25026b;

        /* renamed from: c */
        public TextView f25027c;

        /* renamed from: d */
        public TextView f25028d;

        /* renamed from: e */
        public TextView f25029e;

        /* renamed from: f */
        public TextView f25030f;

        /* renamed from: g */
        public ImageView f25031g;

        /* renamed from: h */
        public CollageRatingView f25032h;

        /* renamed from: i */
        public TextView f25033i;

        /* renamed from: j */
        public TextView f25034j;

        /* renamed from: k */
        public Button f25035k;

        /* renamed from: l */
        public TextView f25036l;
    }

    public TransactionAdapter(FragmentActivity fragmentActivity, C8569c cVar, C13461f fVar, ListingMapper listingMapper2, C8703p pVar) {
        super(fragmentActivity, R.layout.list_item_transaction);
        this.listingRepository = cVar;
        this.schedulers = fVar;
        this.listingMapper = listingMapper2;
        this.tracker = pVar;
    }

    private C11352f createTransactionHolder(View view) {
        C11352f fVar = new C11352f();
        fVar.f25025a = (TextView) view.findViewById(R.id.text_receipt_listing_title);
        fVar.f25026b = (TextView) view.findViewById(R.id.text_receipt_listing_transaction_info);
        fVar.f25027c = (TextView) view.findViewById(R.id.text_receipt_listing_price);
        fVar.f25031g = (ImageView) view.findViewById(R.id.image_receipt_listing);
        fVar.f25028d = (TextView) view.findViewById(R.id.text_receipt_listing_variation_1);
        fVar.f25029e = (TextView) view.findViewById(R.id.text_receipt_listing_variation_2);
        fVar.f25030f = (TextView) view.findViewById(R.id.text_receipt_listing_variation_3);
        fVar.f25032h = (CollageRatingView) view.findViewById(R.id.rating_view);
        fVar.f25036l = (TextView) view.findViewById(R.id.txt_review_upcoming);
        TextView textView = (TextView) view.findViewById(R.id.txt_review_button);
        fVar.f25033i = textView;
        ViewsExtensionsKt.m17423b(textView, AccessibilityClassNames.BUTTON);
        fVar.f25035k = (Button) view.findViewById(R.id.buy_this_again_button);
        fVar.f25034j = (TextView) view.findViewById(R.id.review_edit_button);
        return fVar;
    }

    /* access modifiers changed from: private */
    public void lambda$queryListingForAnalyticsEvent$0(Transaction transaction, C8569c.C8570a aVar) throws Exception {
        Listing listing;
        C8703p pVar;
        if (aVar instanceof C8569c.C8570a.C8572b) {
            try {
                listing = this.listingMapper.mo32283a(((C8569c.C8570a.C8572b) aVar).f18662a);
            } catch (Exception unused) {
                listing = null;
            }
            if (listing != null && shouldLogReceiptWithVariationPhotoEvent(transaction.getMainImage(), listing.getImage()) && (pVar = this.tracker) != null) {
                pVar.mo21333d("view_receipt_with_variation_photo", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryListingForAnalyticsEvent$1(Throwable th) throws Exception {
    }

    private void populateImage(C11352f fVar, Transaction transaction) {
        C0114h.m270B0(fVar.f25031g.getContext()).load((!transaction.isGiftCard() || transaction.getGiftCardDesign() == null || transaction.getGiftCardDesign().getUrl150x119() == null) ? (!C8914m.m17345c(getActivityContext()) || transaction.getMainImage() == null || transaction.getMainImage().getUrl170x135() == null) ? (transaction.getMainImage() == null || transaction.getMainImage().getUrl75x75() == null) ? null : transaction.getMainImage().getUrl75x75() : transaction.getMainImage().getUrl170x135() : transaction.getGiftCardDesign().getUrl150x119()).mo17139B(new C6105w(fVar.f25031g.getContext().getResources().getDimensionPixelSize(R.dimen.clg_corner_radius))).mo16816M(fVar.f25031g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateRating(com.etsy.android.p327ui.user.TransactionAdapter.C11352f r11, com.etsy.android.lib.models.Transaction r12) {
        /*
            r10 = this;
            android.widget.TextView r0 = r11.f25033i
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r12.getTitle()
            com.etsy.android.lib.models.User r2 = r10.mUser
            if (r2 == 0) goto L_0x001f
            com.etsy.android.lib.models.Shop r2 = r2.getMainShop()
            if (r2 == 0) goto L_0x002e
            com.etsy.android.lib.models.User r2 = r10.mUser
            com.etsy.android.lib.models.Shop r2 = r2.getMainShop()
            java.lang.String r2 = r2.getShopName()
            goto L_0x002f
        L_0x001f:
            com.etsy.android.lib.models.Listing r2 = r12.getListing()
            if (r2 == 0) goto L_0x002e
            com.etsy.android.lib.models.Listing r2 = r12.getListing()
            java.lang.String r2 = r2.getShopName()
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            r6 = 2131952425(0x7f130329, float:1.9541292E38)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r5] = r1
            r7[r4] = r2
            java.lang.String r6 = r0.getString(r6, r7)
            goto L_0x004d
        L_0x0042:
            r6 = 2131952426(0x7f13032a, float:1.9541294E38)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r5] = r1
            java.lang.String r6 = r0.getString(r6, r7)
        L_0x004d:
            if (r2 == 0) goto L_0x005d
            r7 = 2131952115(0x7f1301f3, float:1.9540664E38)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r5] = r1
            r8[r4] = r2
            java.lang.String r7 = r0.getString(r7, r8)
            goto L_0x0068
        L_0x005d:
            r7 = 2131952116(0x7f1301f4, float:1.9540666E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r5] = r1
            java.lang.String r7 = r0.getString(r7, r8)
        L_0x0068:
            if (r2 == 0) goto L_0x0078
            r8 = 2131951726(0x7f13006e, float:1.9539875E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r5] = r1
            r9[r4] = r2
            java.lang.String r0 = r0.getString(r8, r9)
            goto L_0x0083
        L_0x0078:
            r2 = 2131951727(0x7f13006f, float:1.9539877E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r5] = r1
            java.lang.String r0 = r0.getString(r2, r8)
        L_0x0083:
            android.widget.TextView r1 = r11.f25033i
            r1.setContentDescription(r6)
            android.widget.TextView r1 = r11.f25034j
            r1.setContentDescription(r7)
            android.widget.Button r1 = r11.f25035k
            r1.setContentDescription(r0)
            com.etsy.android.stylekit.views.ratings.CollageRatingView r0 = r11.f25032h
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r11.f25033i
            r0.setVisibility(r1)
            android.widget.TextView r0 = r11.f25036l
            r0.setVisibility(r1)
            android.widget.TextView r0 = r11.f25034j
            if (r0 == 0) goto L_0x00aa
            r0.setVisibility(r1)
        L_0x00aa:
            boolean r0 = r10.mIsSellerOrder
            if (r0 != 0) goto L_0x010a
            boolean r0 = r12.isFeedbackMutable()
            if (r0 == 0) goto L_0x010a
            android.widget.TextView r0 = r11.f25033i
            r0.setVisibility(r5)
            com.etsy.android.lib.models.Review r0 = r12.getReview()
            if (r0 != 0) goto L_0x00c8
            android.widget.TextView r0 = r11.f25033i
            r1 = 2131952424(0x7f130328, float:1.954129E38)
            r0.setText(r1)
            goto L_0x00f7
        L_0x00c8:
            com.etsy.android.stylekit.views.ratings.CollageRatingView r0 = r11.f25032h
            r0.setVisibility(r5)
            com.etsy.android.stylekit.views.ratings.CollageRatingView r0 = r11.f25032h
            com.etsy.android.lib.models.Review r2 = r12.getReview()
            int r2 = r2.getRating()
            float r2 = (float) r2
            r0.setRating(r2)
            android.widget.TextView r0 = r11.f25033i
            r0.setVisibility(r1)
            android.widget.TextView r0 = r11.f25034j
            r0.setVisibility(r5)
            android.widget.TextView r0 = r11.f25034j
            com.etsy.android.ui.user.TransactionAdapter$c r1 = new com.etsy.android.ui.user.TransactionAdapter$c
            com.etsy.android.lib.logger.l[] r2 = new com.etsy.android.lib.logger.C8698l[r3]
            r2[r5] = r12
            com.etsy.android.lib.models.User r6 = r10.mUser
            r2[r4] = r6
            r1.<init>(r2, r12)
            r0.setOnClickListener(r1)
        L_0x00f7:
            android.widget.TextView r11 = r11.f25033i
            com.etsy.android.ui.user.TransactionAdapter$d r0 = new com.etsy.android.ui.user.TransactionAdapter$d
            com.etsy.android.lib.logger.l[] r1 = new com.etsy.android.lib.logger.C8698l[r3]
            r1[r5] = r12
            com.etsy.android.lib.models.User r2 = r10.mUser
            r1[r4] = r2
            r0.<init>(r1, r12)
            r11.setOnClickListener(r0)
            goto L_0x015f
        L_0x010a:
            boolean r0 = r10.mIsSellerOrder
            if (r0 != 0) goto L_0x0136
            boolean r0 = r12.hasFutureReviewDate()
            if (r0 == 0) goto L_0x0136
            android.widget.TextView r0 = r11.f25036l
            r0.setVisibility(r5)
            androidx.fragment.app.FragmentActivity r0 = r10.getActivityContext()
            r1 = 2131952270(0x7f13028e, float:1.9540978E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.util.Date r12 = r12.getFeedbackOpenDate()
            java.lang.String r12 = com.etsy.android.lib.util.C8885d0.m17321e(r12)
            r2[r5] = r12
            java.lang.String r12 = r0.getString(r1, r2)
            android.widget.TextView r11 = r11.f25036l
            r11.setText(r12)
            goto L_0x015f
        L_0x0136:
            com.etsy.android.lib.models.Review r0 = r12.getReview()
            if (r0 == 0) goto L_0x015f
            android.widget.TextView r0 = r11.f25034j
            if (r0 == 0) goto L_0x014c
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x014c
            android.widget.TextView r0 = r11.f25034j
            r1 = 4
            r0.setVisibility(r1)
        L_0x014c:
            com.etsy.android.stylekit.views.ratings.CollageRatingView r0 = r11.f25032h
            r0.setVisibility(r5)
            com.etsy.android.stylekit.views.ratings.CollageRatingView r11 = r11.f25032h
            com.etsy.android.lib.models.Review r12 = r12.getReview()
            int r12 = r12.getRating()
            float r12 = (float) r12
            r11.setRating(r12)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.TransactionAdapter.populateRating(com.etsy.android.ui.user.TransactionAdapter$f, com.etsy.android.lib.models.Transaction):void");
    }

    private void populateTransactionInfo(C11352f fVar, Transaction transaction) {
        StringBuilder sb = new StringBuilder();
        if (!transaction.isGiftCard() || transaction.getGiftCardInfo() == null) {
            sb.append(getContext().getString(R.string.quantity));
            sb.append(": ");
            sb.append(transaction.getQuantity());
        } else {
            GiftCardInfo giftCardInfo = transaction.getGiftCardInfo();
            if (giftCardInfo.getRecipientName() != null) {
                sb.append(getContext().getString(R.string.giftcard_to));
                sb.append(": ");
                sb.append(giftCardInfo.getRecipientName());
                sb.append("\n");
            }
            if (giftCardInfo.getSenderName() != null) {
                sb.append(getContext().getString(R.string.giftcard_from));
                sb.append(": ");
                sb.append(giftCardInfo.getSenderName());
                sb.append("\n");
            }
            if (giftCardInfo.isEmail() && giftCardInfo.getRecipientEmail() != null) {
                sb.append(getContext().getString(R.string.giftcard_email));
                sb.append(": ");
                sb.append(giftCardInfo.getRecipientEmail());
            }
        }
        fVar.f25026b.setText(sb.toString());
    }

    private void populateVariations(C11352f fVar, Transaction transaction) {
        List<Variation> variations = transaction.getVariations();
        if (variations.size() <= 0 || transaction.isGiftCard()) {
            fVar.f25028d.setVisibility(8);
        } else {
            TextView textView = fVar.f25028d;
            textView.setText(variations.get(0).getFormattedName() + ": " + variations.get(0).getFormattedValue());
            fVar.f25028d.setVisibility(0);
        }
        if (variations.size() <= 1 || transaction.isGiftCard()) {
            fVar.f25029e.setVisibility(8);
        } else {
            TextView textView2 = fVar.f25029e;
            textView2.setText(variations.get(1).getFormattedName() + ": " + variations.get(1).getFormattedValue());
            fVar.f25029e.setVisibility(0);
        }
        if (variations.size() <= 2 || transaction.isGiftCard()) {
            fVar.f25030f.setVisibility(8);
            return;
        }
        TextView textView3 = fVar.f25030f;
        textView3.setText(variations.get(2).getFormattedName() + ": " + variations.get(2).getFormattedValue());
        fVar.f25030f.setVisibility(0);
    }

    private void queryListingForAnalyticsEvent(Transaction transaction) {
        if (transaction != null) {
            long longValue = Long.valueOf(transaction.getListingId().getIdAsLong()).longValue();
            C8071s<C20145v<ListingFetch>> b = this.listingRepository.f18658a.mo32303b(longValue, longValue, false, false, false, false, Boolean.FALSE, false, false);
            C13793a aVar = new C13793a(1);
            b.getClass();
            C0391c.m1056b(this.schedulers, C0472h.m1243e(this.schedulers, new C19211l(new C19208j(b, aVar), new C9342c(1)))).mo20658g(new C11521e0(this, transaction), new C6335b(3));
        }
    }

    private boolean shouldLogReceiptWithVariationPhotoEvent(ListingImage listingImage, ListingImage listingImage2) {
        return listingImage != null && listingImage2 != null && !listingImage.getUrl75x75().equals(listingImage2.getUrl75x75()) && !listingImage.getUrl170x135().equals(listingImage2.getUrl170x135());
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C11352f fVar;
        if (view == null) {
            view = getLayoutInflater().inflate(getLayoutId(), (ViewGroup) null);
            fVar = createTransactionHolder(view);
            view.setTag(fVar);
        } else {
            fVar = (C11352f) view.getTag();
        }
        Transaction transaction = (Transaction) getItem(i);
        queryListingForAnalyticsEvent(transaction);
        fVar.f25025a.setText(transaction.getTitle());
        fVar.f25027c.setText(transaction.getFormattedPrice());
        populateTransactionInfo(fVar, transaction);
        populateVariations(fVar, transaction);
        populateImage(fVar, transaction);
        populateRating(fVar, transaction);
        if (fVar.f25035k != null) {
            C11517d dVar = new C11517d(transaction);
            if (dVar.f25405b) {
                fVar.f25035k.setVisibility(0);
                fVar.f25035k.setOnClickListener(new C11347a(dVar));
            } else {
                fVar.f25035k.setVisibility(8);
            }
        }
        if (!transaction.isGiftCard()) {
            view.setOnClickListener(new C11348b(new C8698l[]{transaction}, transaction));
        } else {
            EtsyLinkify.m19610d(getContext(), fVar.f25026b);
        }
        return view;
    }

    public void setIsSellOrder(boolean z) {
        this.mIsSellerOrder = z;
        notifyDataSetChanged();
    }

    public void setTransactionAdapterClickListener(C11351e eVar) {
        this.mTransactionClickListener = eVar;
    }

    public void setUser(User user) {
        this.mUser = user;
    }
}
