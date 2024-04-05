package com.etsy.android.p327ui.user;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.C0114h;
import androidx.activity.result.C0120c;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.resource.bitmap.C6087k;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.Coupon;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.Payment;
import com.etsy.android.lib.models.PaymentAdjustment;
import com.etsy.android.lib.models.Receipt;
import com.etsy.android.lib.models.ReceiptShipment;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.lib.models.Transaction;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.apiv3.ShopIcon;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.network.oauth2.C8758h;
import com.etsy.android.lib.network.oauth2.C8766p;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.p327ui.EtsyCommonListFragment;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.core.ListingMapper;
import com.etsy.android.p327ui.core.review.C9714d;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.OrderTrackingKey;
import com.etsy.android.p327ui.user.C11766y;
import com.etsy.android.p327ui.user.TransactionAdapter;
import com.etsy.android.p327ui.user.review.ReviewTrackingSource;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.p327ui.util.C11783k;
import com.etsy.android.p327ui.util.C11784l;
import com.etsy.android.p327ui.util.C11785m;
import com.etsy.android.qualtrics.BOEQualtricsPromptDisplay$Companion$showPrompt$1;
import com.etsy.android.qualtrics.C8949a;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.util.C12049i;
import com.etsy.android.util.OneShotOnResume;
import com.google.logging.type.LogSeverity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19459m;
import okhttp3.C19928a0;
import p001a0.C0005b;
import p143i9.C7003e;
import p143i9.C7007f;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p277w8.C8264b;
import p321cc.C8569c;
import p337de.C12647a;
import p337de.C12648b;
import p351ff.C12747c;
import p351ff.C12748d;
import p351ff.C12749e;
import p356ge.C12788a;
import p370ie.C12942b;
import p370ie.C12948h;
import p370ie.C12949i;
import p395ma.C13029b;
import p395ma.C13033c;
import p395ma.C13034d;
import p402n9.C13085e;
import p409o9.C13138q;
import p418pa.C13197c;
import p425q9.C13265p;
import p440s9.C13366a;
import p455u9.C13450d;
import p456ua.C13461f;
import p486y9.C13888d;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.ReceiptFragment */
public class ReceiptFragment extends EtsyCommonListFragment implements TransactionAdapter.C11351e, C13366a {
    private static final String OUT_IS_SELLER_ORDER = "is_seller_order";
    private static final String OUT_RECEIPT = "receipt";
    private static final String OUT_RECEIPT_ID = "receipt_id";
    private TransactionAdapter adapter;
    public C11488b addToCartRepository;
    public CartBadgeCountRepo cartBadgeCountRepo;
    private final C7091a compositeDisposable = new C7091a();
    private final C0120c<C12942b> createReviewForResult = registerForActivityResult(new C12648b(), new C11765x(this));
    public C13888d currentLocale;
    public C12049i eventTrack;
    public C11780h favoriteRepository;
    private View footerView;
    private C11785m headerUtil;
    private View headerView;
    public C13138q installInfo;
    private boolean isSellerOrder = false;
    public ListingMapper listingMapper;
    public C8569c listingRepository;
    private Payment payment;
    public C13034d paymentRepository;
    public C8951c qualtricsWrapper;
    private Receipt receipt;
    private long receiptId;
    public C11769z receiptRepository;
    private TextView receiptStatus;
    private TextView receiptStatusTracking;
    private C12747c refundHolder;
    public C7007f reviewPromptEligibility;
    public C13461f schedulers;
    public C13265p session;
    private boolean shouldNavigateToHelpWithOrder;
    private C12749e totalsHolder;
    private long transactionId;
    private TransactionViewModel<C11869a> transactionViewModel;
    private View view;

    /* renamed from: com.etsy.android.ui.user.ReceiptFragment$a */
    public class C11342a extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ String f25009b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11342a(C8698l[] lVarArr, String str) {
            super(lVarArr);
            this.f25009b = str;
        }

        public final void onViewClick(View view) {
            C12788a.m20424c(ReceiptFragment.this.getActivity(), new OrderTrackingKey(C19421p.m32935c0(ReceiptFragment.this.getActivity()), this.f25009b, (EtsyId) null, (EtsyId) null, (Bundle) null));
        }
    }

    /* renamed from: com.etsy.android.ui.user.ReceiptFragment$b */
    public class C11343b extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ Receipt f25011b;

        public C11343b(Receipt receipt) {
            this.f25011b = receipt;
        }

        public final void onViewClick(View view) {
            ReceiptFragment.this.onHelpWithOrderClicked(this.f25011b.getReceiptId());
        }
    }

    /* renamed from: com.etsy.android.ui.user.ReceiptFragment$c */
    public class C11344c extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ String f25013b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11344c(C8698l[] lVarArr, String str) {
            super(lVarArr);
            this.f25013b = str;
        }

        public final void onViewClick(View view) {
            C12788a.m20424c(ReceiptFragment.this.getActivity(), new OrderTrackingKey(C19421p.m32935c0(ReceiptFragment.this.getActivity()), this.f25013b, (EtsyId) null, (EtsyId) null, (Bundle) null));
        }
    }

    public ReceiptFragment() {
        super(R.layout.fragment_receipt);
    }

    private View addShipmentSection(ViewGroup viewGroup) {
        return requireActivity().getLayoutInflater().inflate(R.layout.receipt_shipping_status, viewGroup, false);
    }

    private void createListLayout() {
        this.headerView = requireActivity().getLayoutInflater().inflate(R.layout.receipt_header, (ViewGroup) null);
        this.footerView = requireActivity().getLayoutInflater().inflate(R.layout.receipt_footer, (ViewGroup) null);
        this.mListView.addHeaderView(this.headerView);
        this.mListView.addFooterView(this.footerView);
        this.mListView.setDivider((Drawable) null);
        this.mListView.setHeaderDividersEnabled(false);
    }

    private void fetchPayment() {
        String valueOf = String.valueOf(this.receiptId);
        C19383o.m32797g(valueOf, "receiptId");
        if (!C19459m.m33037f1(valueOf, ',')) {
            C13034d dVar = this.paymentRepository;
            dVar.getClass();
            C8071s<C20145v<C19928a0>> a = dVar.f28691a.mo45811a(valueOf);
            C8758h hVar = new C8758h(dVar, 1);
            a.getClass();
            this.compositeDisposable.mo19403b(C0391c.m1056b(this.schedulers, C0472h.m1243e(this.schedulers, new C19211l(new C19208j(a, hVar), new C13033c(dVar, 0)))).mo20658g(new C13197c(this, 3), new C8766p(this, 7)));
            return;
        }
        throw new IllegalArgumentException("No multiple receipt ids are allowed. Introduce a single receipt id.".toString());
    }

    private ReceiptShipment getDisplayShipment(Receipt receipt2) {
        ReceiptShipment receiptShipment = null;
        for (ReceiptShipment next : receipt2.getShipments()) {
            if (receiptShipment == null || next.getStatus().compareTo(receiptShipment.getStatus()) == 1) {
                receiptShipment = next;
            }
        }
        return receiptShipment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getReceipt() {
        /*
            r6 = this;
            r6.showLoadingView()
            long r0 = r6.receiptId
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x001b
            long r4 = r6.transactionId
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x001b
            com.etsy.android.ui.user.q r0 = new com.etsy.android.ui.user.q
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r0.<init>(r1)
            goto L_0x0025
        L_0x001b:
            com.etsy.android.ui.user.p r2 = new com.etsy.android.ui.user.p
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            r0 = r2
        L_0x0025:
            com.etsy.android.ui.user.z r1 = r6.receiptRepository
            r1.getClass()
            boolean r2 = r0 instanceof com.etsy.android.p327ui.user.C11614p
            if (r2 == 0) goto L_0x0047
            com.etsy.android.ui.user.p r0 = (com.etsy.android.p327ui.user.C11614p) r0
            java.lang.String r0 = r0.f25716a
            com.etsy.android.ui.user.u r2 = r1.f26214a
            tp.s r0 = r2.mo38005a(r0)
            o9.g r2 = new o9.g
            r3 = 5
            r2.<init>(r1, r3)
            r0.getClass()
            io.reactivex.internal.operators.single.j r3 = new io.reactivex.internal.operators.single.j
            r3.<init>(r0, r2)
            goto L_0x0063
        L_0x0047:
            boolean r2 = r0 instanceof com.etsy.android.p327ui.user.C11683q
            if (r2 == 0) goto L_0x008e
            com.etsy.android.ui.user.q r0 = (com.etsy.android.p327ui.user.C11683q) r0
            java.lang.String r0 = r0.f25901a
            com.etsy.android.ui.user.u r2 = r1.f26214a
            tp.s r0 = r2.mo38006b(r0)
            com.etsy.android.lib.push.registration.g r2 = new com.etsy.android.lib.push.registration.g
            r3 = 6
            r2.<init>(r1, r3)
            r0.getClass()
            io.reactivex.internal.operators.single.SingleFlatMap r3 = new io.reactivex.internal.operators.single.SingleFlatMap
            r3.<init>(r0, r2)
        L_0x0063:
            n9.g r0 = new n9.g
            r2 = 4
            r0.<init>(r1, r2)
            io.reactivex.internal.operators.single.l r1 = new io.reactivex.internal.operators.single.l
            r1.<init>(r3, r0)
            ua.f r0 = r6.schedulers
            io.reactivex.internal.operators.single.SingleSubscribeOn r0 = androidx.compose.animation.C0472h.m1243e(r0, r1)
            ua.f r1 = r6.schedulers
            io.reactivex.internal.operators.single.SingleObserveOn r0 = androidx.compose.animation.C0391c.m1056b(r1, r0)
            n9.o r1 = new n9.o
            r1.<init>(r6, r2)
            n9.c r3 = new n9.c
            r3.<init>(r6, r2)
            io.reactivex.internal.observers.ConsumerSingleObserver r0 = r0.mo20658g(r1, r3)
            io.reactivex.disposables.a r1 = r6.compositeDisposable
            r1.mo19403b(r0)
            return
        L_0x008e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.ReceiptFragment.getReceipt():void");
    }

    /* access modifiers changed from: private */
    public void handlePaymentError(Throwable th) {
        C8694h.f19097a.error(th);
    }

    /* access modifiers changed from: private */
    public void handlePaymentResult(C13029b bVar) {
        if (bVar instanceof C13029b.C13030a) {
            C8694h.f19097a.mo21308c();
        } else if (bVar instanceof C13029b.C13031b) {
            C8694h.f19097a.mo21306a(((C13029b.C13031b) bVar).f28685a);
        } else {
            updateRefundStatus(((C13029b.C13032c) bVar).f28688a);
        }
    }

    private void handleRequestSignIn(Intent intent) {
        if (EtsyAction.SHOW_ORDER_RELATED_HELP.equals(EtsyAction.fromIntentAction(intent.getAction())) && intent.getExtras().containsKey("url")) {
            String string = intent.getExtras().getString("url");
            String c0 = C19421p.m32935c0(getActivity());
            C19383o.m32797g(string, "url");
            C12788a.m20423b(getActivity(), new GenericHelpKey(c0, string));
        }
    }

    private void handleRequireSignIn(Intent intent) {
        if (EtsyAction.VIEW_ORDER.equals(EtsyAction.fromIntentAction(intent.getAction()))) {
            onUserSignedIn();
        } else {
            onUserCanceledSignIn();
        }
    }

    private void handleReviewUpdated(Bundle bundle) {
        Transaction transaction;
        TransactionAdapter transactionAdapter = this.adapter;
        if (transactionAdapter != null && transactionAdapter.getCount() > 0 && (transaction = (Transaction) bundle.getSerializable("transaction")) != null) {
            List<Transaction> transactions = this.receipt.getTransactions();
            Iterator<Transaction> it = transactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Transaction next = it.next();
                if (next.getTransactionId().equals(transaction.getTransactionId())) {
                    showInAppReviewPrompt(transaction);
                    if (next.getReview() == null) {
                        next.setReview(new Review());
                    }
                    next.getReview().setRating(transaction.getReview().getRating());
                }
            }
            this.adapter.clear();
            this.adapter.addAll(transactions);
            this.adapter.notifyDataSetChanged();
        }
    }

    private boolean isSeller(User user) {
        if (user == null) {
            return false;
        }
        EtsyId d = this.session.mo45959d();
        return d.hasId() && d.equals(user.getUserId());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getReceipt$5(Throwable th) throws Exception {
        showErrorView();
    }

    /* access modifiers changed from: private */
    public void lambda$new$0(C12647a aVar) {
        Intent intent;
        if (aVar.f27895a == 411 && (intent = aVar.f27896b) != null) {
            handleReviewUpdated(intent.getExtras());
        }
    }

    /* access modifiers changed from: private */
    public void lambda$onBuyThisAgainClick$2(AddToCartResponse addToCartResponse) throws Exception {
        Integer num = addToCartResponse.f24990a;
        if (num != null) {
            this.cartBadgeCountRepo.mo31438c(num.intValue());
        } else {
            this.cartBadgeCountRepo.mo31437b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onBuyThisAgainClick$3(Throwable th) throws Exception {
        Toast.makeText(getContext(), R.string.cart_error, 0).show();
    }

    /* access modifiers changed from: private */
    public C19394m lambda$onCreateView$1(String str) {
        FragmentActivity requireActivity = requireActivity();
        C8949a aVar = new C8949a();
        C19383o.m32797g(str, "url");
        C19383o.m32797g(requireActivity, "fragmentActivity");
        requireActivity.getLifecycle().mo10733a(new BOEQualtricsPromptDisplay$Companion$showPrompt$1(requireActivity, aVar, str));
        return null;
    }

    /* access modifiers changed from: private */
    public C19394m lambda$showInAppReviewPrompt$4(Activity activity) {
        this.compositeDisposable.mo19403b(new C7003e(this.reviewPromptEligibility, getAnalyticsContext(), C0005b.m28V(activity)).mo19183a(activity).mo20658g(Functions.f28540d, Functions.f28541e));
        return null;
    }

    /* access modifiers changed from: private */
    public void onGetReceiptPostExecute(C11766y yVar) {
        if (yVar instanceof C11766y.C11767a) {
            C8694h.f19097a.mo21306a(((C11766y.C11767a) yVar).f26210a);
            showErrorView();
            return;
        }
        Receipt receipt2 = ((C11766y.C11768b) yVar).f26213a;
        this.receipt = receipt2;
        populateViews(receipt2);
        showListView();
        if (this.shouldNavigateToHelpWithOrder) {
            this.shouldNavigateToHelpWithOrder = false;
            onHelpWithOrderClicked(this.receiptId);
        }
    }

    /* access modifiers changed from: private */
    public void onHelpWithOrderClicked(long j) {
        String entityName = DeepLinkEntity.YOUR.getEntityName();
        String c = C8915n.m17351c(entityName, DeepLinkEntity.PURCHASES.getEntityName() + "/" + j + "/" + DeepLinkEntity.HELP.getEntityName());
        if (!this.session.mo45960e()) {
            Bundle bundle = new Bundle();
            bundle.putString("url", c);
            EtsyAction.C8658a aVar = EtsyAction.Companion;
            String c0 = C19421p.m32935c0(getActivity());
            EtsyAction etsyAction = EtsyAction.SHOW_ORDER_RELATED_HELP;
            C19383o.m32797g(etsyAction, "signInAction");
            C12788a.m20424c(getActivity(), new C12949i(new C12948h(c0, etsyAction, bundle, (String) null, (String) null, (String) null, 32), (Fragment) this, (int) LogSeverity.NOTICE_VALUE));
        } else {
            String c02 = C19421p.m32935c0(getActivity());
            C19383o.m32797g(c, "url");
            C12788a.m20423b(getActivity(), new GenericHelpKey(c02, c));
        }
        getAnalyticsContext().mo21333d("help_with_order_button_new_link_tapped_receipt", (Map<? extends AnalyticsProperty, Object>) null);
    }

    private void onUserCanceledSignIn() {
        C12788a.m20426e(getActivity());
    }

    private void onUserSignedIn() {
        Receipt receipt2 = this.receipt;
        if (receipt2 == null) {
            getReceipt();
        } else if (this.shouldNavigateToHelpWithOrder) {
            this.shouldNavigateToHelpWithOrder = false;
            onHelpWithOrderClicked(this.receiptId);
        } else {
            populateViews(receipt2);
        }
    }

    private void populateHelpWithOrder(Receipt receipt2, View view2) {
        Button button = (Button) view2.findViewById(R.id.help_with_order_button);
        button.setContentDescription(getString(R.string.help_with_order_number_desc, String.valueOf(receipt2.getReceiptId())));
        button.setVisibility(0);
        button.setOnClickListener(new C11343b(receipt2));
    }

    private void populateInPersonInfo(Receipt receipt2, View view2) {
        if (receipt2.isInPerson()) {
            TextView textView = (TextView) view2.findViewById(R.id.purchase_location_title);
            if (receipt2.getLocation() != null) {
                if (!TextUtils.isEmpty(receipt2.getLocation().getLocationName())) {
                    textView.setText(receipt2.getLocation().getLocationName());
                } else {
                    textView.setText(R.string.ipp_no_location_name);
                }
                ImageView imageView = (ImageView) view2.findViewById(R.id.in_person_map);
                String mapUrl = receipt2.getLocation().getMapUrl();
                C19383o.m32797g(imageView, "<this>");
                if (C0761x.m1714c1(imageView, mapUrl)) {
                    C0761x.m1705Z(new C13450d(imageView, mapUrl));
                    return;
                }
                return;
            }
            textView.setText(R.string.ipp_no_location);
            view2.findViewById(R.id.in_person_map).setVisibility(8);
            return;
        }
        view2.findViewById(R.id.in_person_info_layout).setVisibility(8);
    }

    private void populateMessageFromBuyer(Receipt receipt2, View view2) {
        if (receipt2.isGiftCardReceipt() || !C8885d0.m17324h(receipt2.getMessageFromBuyer())) {
            view2.findViewById(R.id.buyer_message_layout).setVisibility(8);
            return;
        }
        ((TextView) view2.findViewById(R.id.buyer_message_title)).setText(this.isSellerOrder ? R.string.message_from_buyer : R.string.message_to_seller_header);
        TextView textView = (TextView) view2.findViewById(R.id.message_from_buyer);
        textView.setText(receipt2.getMessageFromBuyer());
        EtsyLinkify.m19610d(this.mActivity, textView);
    }

    private void populateMessageFromSeller(Receipt receipt2, View view2) {
        if (receipt2.isGiftCardReceipt() || !C8885d0.m17324h(receipt2.getMessageFromSeller())) {
            view2.findViewById(R.id.seller_message_layout).setVisibility(8);
            return;
        }
        ((TextView) view2.findViewById(R.id.seller_message_title)).setText(this.isSellerOrder ? R.string.your_message_to_buyer : R.string.message_from_seller_header);
        TextView textView = (TextView) view2.findViewById(R.id.message_from_seller);
        textView.setText(receipt2.getMessageFromSeller());
        EtsyLinkify.m19610d(this.mActivity, textView);
    }

    private void populateOtherUserView(Receipt receipt2) {
        if (this.view != null) {
            String str = "";
            if (this.isSellerOrder && receipt2.getBuyer() != null) {
                C11785m mVar = this.headerUtil;
                User buyer = receipt2.getBuyer();
                View findViewById = this.view.findViewById(R.id.shop_header);
                TextView textView = (TextView) this.view.findViewById(R.id.shop_header_name);
                ImageView imageView = (ImageView) this.view.findViewById(R.id.shop_header_avatar);
                TextView textView2 = (TextView) this.view.findViewById(R.id.shop_header_location);
                mVar.getClass();
                findViewById.setVisibility(0);
                textView.setText(C8885d0.m17320d(buyer));
                ViewsExtensionsKt.m17423b(textView, AccessibilityClassNames.BUTTON);
                if (buyer.getProfile() != null) {
                    C0114h.m270B0(imageView.getContext()).load(buyer.getProfile().getImageUrl75x75()).mo17139B(new C6087k()).mo16816M(imageView);
                }
                if (buyer.getProfile() != null) {
                    str = C8885d0.m17319c(buyer.getProfile());
                }
                if (C8885d0.m17324h(str)) {
                    textView2.setText(str);
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                if (buyer.getUserId().hasId()) {
                    findViewById.setOnClickListener(new C11784l(mVar, new C8698l[]{buyer}, buyer));
                }
            } else if (receipt2.getSeller() != null && receipt2.getSeller().getMainShop() != null) {
                Shop mainShop = receipt2.getSeller().getMainShop();
                C11785m mVar2 = this.headerUtil;
                View findViewById2 = this.view.findViewById(R.id.shop_header);
                TextView textView3 = (TextView) this.view.findViewById(R.id.shop_header_name);
                ImageView imageView2 = (ImageView) this.view.findViewById(R.id.shop_header_avatar);
                TextView textView4 = (TextView) this.view.findViewById(R.id.shop_header_location);
                mVar2.getClass();
                User seller = receipt2.getSeller();
                findViewById2.setVisibility(0);
                textView3.setText(mainShop.getShopName());
                ViewsExtensionsKt.m17423b(textView3, AccessibilityClassNames.BUTTON);
                Pair<Integer, String> pair = ShopIcon.IMG_SIZE_75;
                C0114h.m270B0(imageView2.getContext()).load(C8885d0.m17324h(mainShop.getIconUrl(pair.getFirst().intValue())) ? mainShop.getIconUrl(pair.getFirst().intValue()) : seller.getProfile() != null ? seller.getProfile().getImageUrl75x75() : null).mo17139B(new C6087k()).mo16816M(imageView2);
                if (seller.getProfile() != null) {
                    str = C8885d0.m17319c(seller.getProfile());
                }
                if (C8885d0.m17324h(str)) {
                    textView4.setText(str);
                    textView4.setVisibility(0);
                } else {
                    textView4.setVisibility(8);
                }
                if (!mainShop.getShopId().hasId() || receipt2.isGiftCardReceipt()) {
                    findViewById2.setOnClickListener((View.OnClickListener) null);
                } else {
                    findViewById2.setOnClickListener(new C11783k(mVar2, new C8698l[]{mainShop}, seller, mainShop));
                }
            }
        }
    }

    private void populatePaymentMethod(Receipt receipt2, View view2) {
        StringBuilder sb = new StringBuilder();
        if (receipt2.getPaymentMethodName() != null) {
            sb.append(receipt2.getPaymentMethodName());
        }
        if (receipt2.getWasGiftCardBalanceApplied()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(getString(R.string.payment_method_label_gift_card));
        }
        TextView textView = (TextView) view2.findViewById(R.id.payment_method_name);
        String sb2 = sb.toString();
        if (C8885d0.m17324h(sb2)) {
            textView.setText(sb2);
        } else {
            textView.setVisibility(8);
        }
    }

    private void populateReceiptDetails(Receipt receipt2) {
        List<String> vatCreditNoteIds;
        String str;
        String str2;
        Receipt receipt3 = receipt2;
        View view2 = this.footerView;
        if (view2 != null && this.totalsHolder != null) {
            populateHelpWithOrder(receipt3, view2);
            populatePaymentMethod(receipt3, view2);
            populateShippingStatus(receipt3, view2);
            populateInPersonInfo(receipt3, view2);
            C12749e eVar = this.totalsHolder;
            FragmentActivity requireActivity = requireActivity();
            eVar.f28171c.setText(R.string.item_total);
            eVar.f28172d.setText(receipt2.getTotalPrice().format());
            eVar.f28175g.setText(R.string.order_total);
            eVar.f28174f.setText(receipt2.getGrandTotal().format());
            Resources resources = requireActivity.getResources();
            Coupon coupon = receipt2.getCoupon();
            boolean z = eVar.f28179k == null;
            if (coupon == null || receipt2.isInPerson()) {
                eVar.f28176h.setVisibility(8);
                TextView textView = eVar.f28179k;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                if (coupon.isFreeShipping()) {
                    str = resources.getString(R.string.coupon_free_shipping);
                    TextView textView2 = eVar.f28173e;
                    textView2.setPaintFlags(textView2.getPaintFlags() | 16);
                    str2 = z ? String.format(resources.getString(R.string.coupon_with_code), new Object[]{coupon.getCouponCode()}) : String.format(resources.getString(R.string.coupon_details_text_freeshipping), new Object[]{coupon.getCouponCode()});
                } else if (coupon.isPercentDiscount()) {
                    StringBuilder h = C0072d.m201h("- ");
                    h.append(receipt2.getShopDiscount().format());
                    str = h.toString();
                    str2 = z ? String.format(resources.getString(R.string.coupon_with_code_and_percentage), new Object[]{coupon.getCouponCode(), String.valueOf(coupon.getPercentDiscount())}) : String.format(resources.getString(R.string.coupon_details_text_discount), new Object[]{coupon.getCouponCode(), Integer.valueOf(coupon.getPercentDiscount())});
                } else {
                    String format = receipt2.getShopDiscount().format();
                    String i = C0326j.m864i("- ", format);
                    if (z) {
                        str2 = String.format(resources.getString(R.string.coupon_with_code), new Object[]{coupon.getCouponCode()});
                    } else {
                        String formattedFixedDiscount = coupon.getFormattedFixedDiscount();
                        if (C8885d0.m17324h(formattedFixedDiscount)) {
                            format = formattedFixedDiscount;
                        }
                        str2 = String.format(resources.getString(R.string.coupon_details_text_fixed_discount), new Object[]{coupon.getCouponCode(), format});
                    }
                    str = i;
                }
                eVar.f28178j.setText(str);
                if (z) {
                    eVar.f28177i.setText(str2);
                } else {
                    eVar.f28179k.setText(str2);
                }
            }
            if (receipt2.areShippingDetailsRelevant()) {
                eVar.f28173e.setText(receipt2.getTotalShippingCost().format());
            } else {
                eVar.f28170b.setVisibility(8);
            }
            if (receipt2.getTotalTaxCost().compareTo(0) == 0) {
                eVar.f28180l.setVisibility(8);
            } else {
                eVar.f28181m.setText(receipt2.getTotalTaxCost().format());
            }
            if (eVar.f28186r != null) {
                if (receipt2.getTotalVatCost().compareTo(0) == 0) {
                    eVar.f28188t.setVisibility(8);
                    eVar.f28186r.setVisibility(8);
                    eVar.f28189u.setVisibility(8);
                } else {
                    eVar.f28187s.setText(receipt2.getTotalVatCost().format());
                    eVar.f28171c.setText(R.string.item_total_excluding_vat);
                    eVar.f28175g.setText(R.string.order_total_including_vat);
                    String f = eVar.f28193y.f19116n.mo21136f(C8592b.f18800j);
                    if (!TextUtils.isEmpty(f)) {
                        eVar.f28188t.setText(Html.fromHtml(eVar.f28188t.getResources().getString(R.string.vat_desc, new Object[]{f})));
                        eVar.f28188t.setVisibility(0);
                        eVar.f28188t.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    String f2 = eVar.f28193y.f19116n.mo21136f(C8592b.f18803k);
                    if (!TextUtils.isEmpty(f2)) {
                        eVar.f28189u.setText(Html.fromHtml(String.format(eVar.f28189u.getResources().getString(R.string.vat_view_invoice, new Object[]{f2}), new Object[]{String.valueOf(receipt2.getReceiptId())})));
                        eVar.f28189u.setVisibility(0);
                        eVar.f28189u.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    String f3 = eVar.f28193y.f19116n.mo21136f(C8592b.f18806l);
                    if (!TextUtils.isEmpty(f3) && eVar.f28192x != null && (vatCreditNoteIds = receipt2.getVatCreditNoteIds()) != null && vatCreditNoteIds.size() > 0) {
                        LayoutInflater layoutInflater = (LayoutInflater) eVar.f28192x.getContext().getSystemService("layout_inflater");
                        Resources resources2 = eVar.f28192x.getResources();
                        String valueOf = String.valueOf(receipt2.getReceiptId());
                        for (String next : vatCreditNoteIds) {
                            TextView textView3 = (TextView) layoutInflater.inflate(R.layout.textview_vat_credit_note_redesign, (ViewGroup) null);
                            textView3.setText(Html.fromHtml(resources2.getString(R.string.vat_credit_note, new Object[]{String.format(f3, new Object[]{valueOf, next}), next})));
                            textView3.setMovementMethod(LinkMovementMethod.getInstance());
                            eVar.f28192x.addView(textView3);
                            f3 = f3;
                        }
                    }
                }
            }
            if (receipt2.hasTransparentPriceMessage()) {
                eVar.f28191w.setText(Html.fromHtml(receipt2.getTransparentPriceMessage()));
                TextView textView4 = eVar.f28191w;
                URLSpan[] urls = textView4.getUrls();
                if (urls.length > 0) {
                    EtsyLinkify.m19608b(textView4, true, false, new C12748d(requireActivity, urls[0].getURL()));
                }
                eVar.f28191w.setVisibility(0);
            } else {
                eVar.f28191w.setVisibility(8);
            }
            if (receipt2.getShopDiscount() == null || receipt2.getShopDiscount().compareTo(0) != 1) {
                eVar.f28182n.setVisibility(8);
            } else {
                eVar.f28183o.setText(eVar.f28169a.getContext().getString(R.string.receipt_subtraction, new Object[]{receipt2.getShopDiscount().format()}));
                eVar.f28182n.setVisibility(0);
            }
            if (receipt2.getEtsyDiscount() == null || receipt2.getEtsyDiscount().compareTo(0) != 1) {
                eVar.f28184p.setVisibility(8);
            } else {
                eVar.f28185q.setText(C0326j.m864i("- ", receipt2.getEtsyDiscount().format()));
                eVar.f28184p.setVisibility(0);
            }
            if (!C8885d0.m17322f(receipt2.getDonationDescription())) {
                eVar.f28190v.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(receipt2.getDonationDescription() + " ");
                SpannableString spannableString = new SpannableString(receipt2.getDonationTermsLinkText());
                spannableString.setSpan(new URLSpan(receipt2.getDonationTermsLinkUrl()), 0, receipt2.getDonationTermsLinkText().length(), 33);
                spannableStringBuilder.append(spannableString);
                eVar.f28190v.setText(spannableStringBuilder);
                EtsyLinkify.m19607a(eVar.f28190v, receipt2.getDonationTermsLinkText(), receipt2.getDonationTermsLinkUrl(), new C9714d(requireActivity, receipt3, 1));
            }
            TextView textView5 = (TextView) eVar.f28169a.findViewById(R.id.gift_card_applied_label);
            TextView textView6 = (TextView) eVar.f28169a.findViewById(R.id.gift_card_applied_amount);
            TextView textView7 = (TextView) eVar.f28169a.findViewById(R.id.multi_shop_purchase_note);
            EtsyMoney giftCardAmountApplied = receipt2.getGiftCardAmountApplied();
            if (giftCardAmountApplied == null || giftCardAmountApplied.compareTo(0) != 1) {
                textView5.setVisibility(8);
                textView6.setVisibility(8);
                textView7.setVisibility(8);
            } else {
                textView5.setVisibility(0);
                if (C8885d0.m17324h(receipt2.getMultiShopNote())) {
                    textView5.setText(R.string.receipt_gift_card_applied_label);
                    textView7.setText(eVar.f28169a.getContext().getString(R.string.receipt_gift_card_applied_disclaimer, new Object[]{receipt2.getMultiShopNote(), giftCardAmountApplied.format()}));
                    textView7.setVisibility(0);
                } else {
                    textView5.setText(R.string.receipt_gift_card_credit_label);
                    textView6.setText(eVar.f28169a.getContext().getString(R.string.receipt_subtraction, new Object[]{giftCardAmountApplied.format()}));
                    textView6.setVisibility(0);
                }
            }
            populateMessageFromSeller(receipt3, this.footerView);
            populateMessageFromBuyer(receipt3, this.footerView);
            populateSellerInformation(receipt3, this.footerView);
        }
    }

    private void populateReceiptShipment(ReceiptShipment receiptShipment, View view2) {
        String majorTrackingState = receiptShipment.getMajorTrackingState();
        if (!C8885d0.m17323g(majorTrackingState)) {
            majorTrackingState = requireActivity().getString(receiptShipment.getStatus().getStringResource());
        }
        ((TextView) view2.findViewById(R.id.shipping_status)).setText(majorTrackingState);
        TextView textView = (TextView) view2.findViewById(R.id.shipping_service);
        TextView textView2 = (TextView) view2.findViewById(R.id.shipping_details);
        if (C8885d0.m17324h(receiptShipment.getCarrierName())) {
            textView.setText(receiptShipment.getCarrierName());
        } else {
            textView.setText(R.string.shipping_carrier_unknown);
        }
        StringBuilder sb = new StringBuilder();
        View findViewById = view2.findViewById(R.id.track_package);
        if (C8885d0.m17324h(receiptShipment.getTrackingCode()) || receiptShipment.isEtsyOnlyTracking()) {
            if (receiptShipment.isEtsyOnlyTracking()) {
                sb.append(getResources().getString(R.string.tracked_on_etsy));
            } else {
                sb.append(receiptShipment.getTrackingCode());
            }
            sb.append("\n");
            String trackingUrl = receiptShipment.getTrackingUrl();
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C11344c(new C8698l[]{receiptShipment, this.receipt}, trackingUrl));
        } else {
            findViewById.setVisibility(8);
        }
        if (receiptShipment.getShippedDate() != null) {
            sb.append(getString(receiptShipment.getShippingString()));
            sb.append(" ");
            sb.append(C8885d0.m17321e(receiptShipment.getShippedDate()));
        }
        if (C8885d0.m17324h(sb.toString())) {
            textView2.setText(sb.toString());
        } else {
            textView2.setVisibility(8);
        }
    }

    private void populateSellerInformation(Receipt receipt2, View view2) {
        if (!C8885d0.m17324h(receipt2.getSellerEmail()) || this.isSellerOrder) {
            view2.findViewById(R.id.seller_info_layout).setVisibility(8);
            return;
        }
        TextView textView = (TextView) view2.findViewById(R.id.seller_information);
        textView.setText(getString(R.string.sellers_email) + " " + receipt2.getSellerEmail());
        EtsyLinkify.m19610d(this.mActivity, textView);
    }

    private void populateShippingAddress(Receipt receipt2, View view2) {
        ((TextView) view2.findViewById(R.id.shipping_address)).setText(receipt2.getFormattedAddressWithLineBreaks());
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateShippingHeader(com.etsy.android.lib.models.Receipt r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 2131429680(0x7f0b0930, float:1.848104E38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r10.getShippingNote()
            boolean r1 = com.etsy.android.lib.util.C8885d0.m17324h(r1)
            r2 = 8
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = r10.getShippingNote()
            r0.setText(r1)
            com.etsy.android.uikit.BaseActivity r1 = r9.mActivity
            com.etsy.android.uikit.util.EtsyLinkify.m19610d(r1, r0)
            goto L_0x0025
        L_0x0022:
            r0.setVisibility(r2)
        L_0x0025:
            com.etsy.android.lib.models.Payment r0 = r9.payment
            r1 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.hasRefund()
            if (r0 == 0) goto L_0x0035
            r0 = 2131953321(0x7f1306a9, float:1.954311E38)
            goto L_0x003e
        L_0x0035:
            boolean r0 = r10.isInPerson()
            if (r0 == 0) goto L_0x0042
            r0 = 2131952389(0x7f130305, float:1.954122E38)
        L_0x003e:
            r4 = r3
            r5 = r4
            goto L_0x00c2
        L_0x0042:
            boolean r0 = r10.areAllListingsDigitalDownloads()
            if (r0 == 0) goto L_0x0056
            boolean r0 = r10.wasShipped()
            if (r0 == 0) goto L_0x0052
            r0 = 2131952089(0x7f1301d9, float:1.954061E38)
            goto L_0x003e
        L_0x0052:
            r0 = 2131952725(0x7f130455, float:1.95419E38)
            goto L_0x003e
        L_0x0056:
            boolean r0 = r10.wasShipped()
            if (r0 == 0) goto L_0x00a9
            com.etsy.android.lib.models.ReceiptShipment r0 = r9.getDisplayShipment(r10)
            if (r0 == 0) goto L_0x0096
            java.lang.String r3 = r0.getMajorTrackingState()
            boolean r4 = com.etsy.android.lib.util.C8885d0.m17323g(r3)
            if (r4 != 0) goto L_0x0075
            com.etsy.android.lib.models.ReceiptShipment$ShippingState r4 = r0.getStatus()
            int r4 = r4.getStringResource()
            goto L_0x0076
        L_0x0075:
            r4 = r1
        L_0x0076:
            java.lang.String r5 = r0.getTrackingUrl()
            java.util.Date r6 = r0.getStatusDate()
            if (r6 == 0) goto L_0x008e
            com.etsy.android.lib.models.ReceiptShipment$ShippingState r6 = r0.getStatus()
            com.etsy.android.lib.models.ReceiptShipment$ShippingState r7 = com.etsy.android.lib.models.ReceiptShipment.ShippingState.IN_TRANSIT
            if (r6 != r7) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            java.util.Date r0 = r0.getStatusDate()
            goto L_0x0092
        L_0x008e:
            java.util.Date r0 = r0.getShippedDate()
        L_0x0092:
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x00c2
        L_0x0096:
            int r0 = r10.daysUntilShipped()
            if (r0 <= 0) goto L_0x00a0
            r0 = 2131953465(0x7f130739, float:1.9543402E38)
            goto L_0x00a3
        L_0x00a0:
            r0 = 2131953452(0x7f13072c, float:1.9543375E38)
        L_0x00a3:
            java.util.Date r4 = r10.getShippingNotificationDate()
            r5 = r3
            goto L_0x00c2
        L_0x00a9:
            boolean r0 = r10.wasPaid()
            if (r0 == 0) goto L_0x00b3
            r0 = 2131952731(0x7f13045b, float:1.9541913E38)
            goto L_0x003e
        L_0x00b3:
            boolean r0 = r10.isFlaggedForManualFraudReview()
            if (r0 == 0) goto L_0x00bd
            r0 = 2131952757(0x7f130475, float:1.9541966E38)
            goto L_0x003e
        L_0x00bd:
            r0 = 2131953676(0x7f13080c, float:1.954383E38)
            goto L_0x003e
        L_0x00c2:
            android.widget.TextView r6 = r9.receiptStatus
            if (r6 == 0) goto L_0x0122
            android.widget.TextView r7 = r9.receiptStatusTracking
            if (r7 == 0) goto L_0x0122
            if (r3 == 0) goto L_0x00d5
            r6.setText(r3)
            android.widget.TextView r0 = r9.receiptStatusTracking
            r0.setText(r3)
            goto L_0x00df
        L_0x00d5:
            if (r0 == r1) goto L_0x00df
            r6.setText(r0)
            android.widget.TextView r1 = r9.receiptStatusTracking
            r1.setText(r0)
        L_0x00df:
            boolean r0 = com.etsy.android.lib.util.C8885d0.m17324h(r5)
            android.widget.TextView r1 = r9.receiptStatusTracking
            r3 = 0
            if (r0 == 0) goto L_0x00ea
            r6 = r3
            goto L_0x00eb
        L_0x00ea:
            r6 = r2
        L_0x00eb:
            r1.setVisibility(r6)
            android.widget.TextView r1 = r9.receiptStatus
            if (r0 == 0) goto L_0x00f4
            r6 = r2
            goto L_0x00f5
        L_0x00f4:
            r6 = r3
        L_0x00f5:
            r1.setVisibility(r6)
            if (r0 == 0) goto L_0x0109
            android.widget.TextView r0 = r9.receiptStatusTracking
            com.etsy.android.ui.user.ReceiptFragment$a r1 = new com.etsy.android.ui.user.ReceiptFragment$a
            r6 = 1
            com.etsy.android.lib.logger.l[] r6 = new com.etsy.android.lib.logger.C8698l[r6]
            r6[r3] = r10
            r1.<init>(r6, r5)
            r0.setOnClickListener(r1)
        L_0x0109:
            r10 = 2131430085(0x7f0b0ac5, float:1.848186E38)
            android.view.View r10 = r11.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r4 == 0) goto L_0x011f
            java.lang.String r11 = com.etsy.android.lib.util.C8885d0.m17321e(r4)
            r10.setText(r11)
            r10.setVisibility(r3)
            goto L_0x0122
        L_0x011f:
            r10.setVisibility(r2)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.ReceiptFragment.populateShippingHeader(com.etsy.android.lib.models.Receipt, android.view.View):void");
    }

    private void populateShippingStatus(Receipt receipt2, View view2) {
        if (receipt2.areShippingDetailsRelevant()) {
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.shipments);
            viewGroup.removeAllViews();
            if (receipt2.getShipments().size() > 0) {
                for (ReceiptShipment populateReceiptShipment : receipt2.getShipments()) {
                    View addShipmentSection = addShipmentSection(viewGroup);
                    populateReceiptShipment(populateReceiptShipment, addShipmentSection);
                    viewGroup.addView(addShipmentSection);
                }
            } else if (receipt2.wasShipped()) {
                ReceiptShipment receiptShipment = new ReceiptShipment(receipt2);
                View addShipmentSection2 = addShipmentSection(viewGroup);
                populateReceiptShipment(receiptShipment, addShipmentSection2);
                viewGroup.addView(addShipmentSection2);
            }
            populateShippingAddress(receipt2, view2);
            return;
        }
        view2.findViewById(R.id.shipping_status_layout).setVisibility(8);
    }

    private void populateViews(Receipt receipt2) {
        boolean isSeller = isSeller(receipt2.getSeller());
        this.isSellerOrder = isSeller;
        this.adapter.setIsSellOrder(isSeller);
        this.adapter.setUser(receipt2.getSeller());
        populateOtherUserView(receipt2);
        View view2 = this.headerView;
        if (view2 != null) {
            populateShippingHeader(receipt2, view2);
        }
        populateReceiptDetails(receipt2);
        this.adapter.clear();
        if (receipt2.getTransactions().size() > 0) {
            this.adapter.addAll(receipt2.getTransactions());
        }
        this.adapter.notifyDataSetChanged();
    }

    private void requireSignIn() {
        if (!this.session.mo45960e()) {
            EtsyAction.C8658a aVar = EtsyAction.Companion;
            String c0 = C19421p.m32935c0(getActivity());
            EtsyAction etsyAction = EtsyAction.VIEW_ORDER;
            C19383o.m32797g(etsyAction, "signInAction");
            C12788a.m20424c(getActivity(), new C12949i(new C12948h(c0, etsyAction, (Bundle) null, (String) null, (String) null, (String) null, 32), (Fragment) this, 301));
            return;
        }
        onUserSignedIn();
    }

    private void setTitle() {
        String string = getActivity().getResources().getString(R.string.order);
        if (this.receiptId != 0) {
            BaseActivity baseActivity = this.mActivity;
            StringBuilder k = C0073e.m211k(string, " #");
            k.append(this.receiptId);
            baseActivity.setTitle(k.toString());
            return;
        }
        this.mActivity.setTitle(string);
    }

    private void showInAppReviewPrompt(Transaction transaction) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && transaction != null && transaction.getReview() != null && transaction.getReview().getRating() == 5 && this.reviewPromptEligibility.f15562b.mo21132b(C8592b.f18784d1)) {
            new OneShotOnResume(getViewLifecycleOwner().getLifecycle(), new C11764w(this, activity));
        }
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "view_receipt";
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 300) {
            if (i == 301) {
                if (i2 == 311) {
                    handleRequireSignIn(intent);
                } else {
                    onUserCanceledSignIn();
                }
            }
        } else if (i2 == 311) {
            handleRequestSignIn(intent);
        }
    }

    @SuppressLint({"CheckResult"})
    public void onBuyThisAgainClick(C11517d dVar) {
        Listing listing = dVar.f25404a;
        if (listing != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, listing.getListingId());
            getAnalyticsContext().mo21333d("buy_this_again_button_tapped_receipts", hashMap);
            if (dVar.f25406c) {
                C0391c.m1056b(this.schedulers, C0072d.m199f(this.schedulers, this.addToCartRepository.mo37350a(new C11490c(listing.getListingId().getId(), getAnalyticsContext().f19059a, this.session.mo45960e(), (Integer) null, this.installInfo.f28895a, (String) null, (Long) null, (List<Pair<Variation, VariationValue>>) null, false, false)))).mo20658g(new C8264b(this, 8), new C13085e(this, 2));
                C12788a.m20424c(getActivity(), new CartWithSavedKey(C19421p.m32935c0(getActivity()), (String) null, (Bundle) null));
                return;
            }
            String c0 = C19421p.m32935c0(getActivity());
            EtsyId listingId = listing.getListingId();
            C19383o.m32797g(listingId, "listingId");
            C12788a.m20424c(getActivity(), new ListingKey(c0, listingId, true, true, (Bundle) null));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TransactionViewModel<C11869a> W = C18263b.m30828W(this, new C11869a());
        this.transactionViewModel = W;
        C11869a aVar = (C11869a) W.f26405b;
        if (aVar.f26406a.containsKey("receipt_id")) {
            long j = aVar.f26406a.get("receipt_id");
            if (j == null) {
                j = 0L;
            }
            this.receiptId = ((Long) j).longValue();
        } else if (getArguments() != null && getArguments().containsKey("receipt_id")) {
            this.receiptId = getArguments().getLong("receipt_id");
            if (getArguments().getBoolean("TO_HELP_WITH_ORDER")) {
                if (this.session.mo45960e()) {
                    onHelpWithOrderClicked(this.receiptId);
                } else {
                    this.shouldNavigateToHelpWithOrder = true;
                }
            }
        } else if (getArguments() != null && getArguments().containsKey("receipt_transaction_id")) {
            this.transactionId = getArguments().getLong("receipt_transaction_id");
        }
        if (aVar.f26406a.containsKey("receipt")) {
            this.receipt = (Receipt) aVar.mo38345b("receipt");
        }
        this.isSellerOrder = aVar.mo38346c(OUT_IS_SELLER_ORDER, false);
        this.headerUtil = new C11785m();
        setHasOptionsMenu(true);
        this.adapter = new TransactionAdapter(getActivity(), this.listingRepository, this.schedulers, this.listingMapper, getAnalyticsContext());
    }

    public void onCreateOptionsMenuWithIcons(Menu menu, MenuInflater menuInflater) {
        menu.removeItem(R.id.menu_share);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_receipt, (ViewGroup) null);
        this.view = inflate;
        onCreateListView(inflate);
        onCreateCommonViews(this.view);
        createListLayout();
        this.receiptStatus = (TextView) this.view.findViewById(R.id.text_order_details);
        this.receiptStatusTracking = (TextView) this.view.findViewById(R.id.text_order_details_tracking);
        this.totalsHolder = new C12749e(this.view.findViewById(R.id.totals_layout), getAnalyticsContext());
        this.refundHolder = new C12747c(this.view);
        this.qualtricsWrapper.mo30561a(new ArrayList(Arrays.asList(new C8952d[]{new C8952d.C8961i(this.currentLocale.mo46719c().toString()), C8952d.C8957e.f19755c})));
        this.qualtricsWrapper.mo30562b(new C11763v(this));
        return this.view;
    }

    public void onDestroyView() {
        this.view = null;
        this.headerView = null;
        this.footerView = null;
        this.receiptStatus = null;
        this.receiptStatusTracking = null;
        this.totalsHolder = null;
        this.refundHolder = null;
        super.onDestroyView();
    }

    public void onFragmentResume() {
        super.onFragmentResume();
        this.mActivity.invalidateOptionsMenu();
        setTitle();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.mActivity.invalidateOptionsMenu();
        setTitle();
    }

    public void onRetryClicked() {
        getReceipt();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C11869a aVar = (C11869a) this.transactionViewModel.f26405b;
        long j = this.receiptId;
        aVar.getClass();
        aVar.f26406a.put("receipt_id", Long.valueOf(j));
        aVar.mo38349f("receipt", this.receipt);
        aVar.f26406a.put(OUT_IS_SELLER_ORDER, Boolean.valueOf(this.isSellerOrder));
    }

    public void onStart() {
        super.onStart();
        if (this.session.mo45960e()) {
            onUserSignedIn();
        } else {
            requireSignIn();
        }
    }

    public void onStop() {
        super.onStop();
        this.compositeDisposable.mo19405d();
    }

    public void onTransactionClick(Transaction transaction, User user) {
        String c0 = C19421p.m32935c0(getActivity());
        EtsyId transactionId2 = transaction.getTransactionId();
        ReviewTrackingSource reviewTrackingSource = ReviewTrackingSource.RECEIPT_SCREEN;
        C19383o.m32797g(reviewTrackingSource, "source");
        this.createReviewForResult.mo1157b(new C12942b(c0, transactionId2, (List<EtsyId>) null, reviewTrackingSource, (Integer) null, (Bundle) null));
    }

    public void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        Payment payment2 = this.payment;
        if (payment2 == null) {
            fetchPayment();
        } else {
            updateRefundStatus(payment2);
        }
        C11785m mVar = this.headerUtil;
        BaseActivity baseActivity = this.mActivity;
        mVar.getClass();
        mVar.f26256a = new WeakReference<>(baseActivity);
        this.adapter.setTransactionAdapterClickListener(this);
        this.mListView.setAdapter(this.adapter);
    }

    public void updateRefundStatus(Payment payment2) {
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        this.payment = payment2;
        if (payment2.isFullRefund() && (textView2 = this.receiptStatus) != null) {
            textView2.setText(R.string.refunded);
        } else if (payment2.hasRefund() && (textView = this.receiptStatus) != null) {
            textView.setText(R.string.partially_refunded);
        }
        C12747c cVar = this.refundHolder;
        if (cVar != null && (linearLayout = cVar.f28162b) != null) {
            linearLayout.removeAllViews();
            if (payment2.hasRefund()) {
                LayoutInflater from = LayoutInflater.from(cVar.f28162b.getContext());
                for (PaymentAdjustment next : payment2.getAdjustments()) {
                    View inflate = from.inflate(cVar.f28164d, cVar.f28162b, false);
                    StringBuilder h = C0072d.m201h("- ");
                    h.append(next.getRefundAmount());
                    ((TextView) inflate.findViewById(cVar.f28165e)).setText(h.toString());
                    ((TextView) inflate.findViewById(cVar.f28166f)).setText(next.getFormattedReason());
                    cVar.f28162b.addView(inflate);
                }
                cVar.f28163c.setText(payment2.getFormattedAdjustedTotal());
                cVar.f28161a.setVisibility(0);
                return;
            }
            cVar.f28161a.setVisibility(8);
        }
    }
}
