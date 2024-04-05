package com.etsy.android.slice;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceProvider;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.C6125e;
import com.etsy.android.BOEApplication;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseMainImage;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction;
import com.etsy.android.lib.models.pastpurchase.ReceiptStatus;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.p327ui.user.purchases.C11651i;
import com.etsy.android.p327ui.user.purchases.C11652j;
import com.etsy.android.p327ui.user.purchases.PurchasesRepository;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import p001a0.C0005b;
import p033c2.C4362a;
import p033c2.C4366c;
import p033c2.C4367d;
import p033c2.C4368e;
import p036c5.C4416e;
import p040c9.C4579j1;
import p078d2.C6627d;
import p346fa.C12703a;
import p425q9.C13265p;
import p486y9.C13888d;
import p568fn.C17782b;

public final class PurchasesSliceProvider extends SliceProvider {
    public static final int $stable = 8;
    public static final C9009a Companion = new C9009a();
    private static final String GRAFANA_RECENT_SLICE = "recent_order_slice";
    private final C8672b analyticsTracker = new C8672b("google_slice");
    private final C19525d0 coroutineScope = C19697g.m33463a(C0005b.m44j().plus(C19760n0.f43720b));
    public C13888d currentLocale;
    /* access modifiers changed from: private */
    public C9010b currentRecentOrderFetchStatus = C9010b.C9015e.f19884a;
    private final C19285c dateFormat$delegate = C19350d.m32677b(new PurchasesSliceProvider$dateFormat$2(this));
    public C8630b etsyMoneyFactory;
    public C12703a grafana;
    private boolean hasInjectedSelf;
    public PurchasesRepository purchasesRepository;
    public C13265p session;

    /* renamed from: com.etsy.android.slice.PurchasesSliceProvider$a */
    public static final class C9009a {
    }

    /* renamed from: com.etsy.android.slice.PurchasesSliceProvider$b */
    public static abstract class C9010b {

        /* renamed from: com.etsy.android.slice.PurchasesSliceProvider$b$a */
        public static final class C9011a extends C9010b {

            /* renamed from: a */
            public static final C9011a f19879a = new C9011a();
        }

        /* renamed from: com.etsy.android.slice.PurchasesSliceProvider$b$b */
        public static final class C9012b extends C9010b {

            /* renamed from: a */
            public final PastPurchaseReceipt f19880a;

            /* renamed from: b */
            public final List<Bitmap> f19881b;

            public C9012b(PastPurchaseReceipt pastPurchaseReceipt, List<Bitmap> list) {
                C19383o.m32797g(list, "recentOrderListingImages");
                this.f19880a = pastPurchaseReceipt;
                this.f19881b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9012b)) {
                    return false;
                }
                C9012b bVar = (C9012b) obj;
                return C19383o.m32792b(this.f19880a, bVar.f19880a) && C19383o.m32792b(this.f19881b, bVar.f19881b);
            }

            public final int hashCode() {
                return this.f19881b.hashCode() + (this.f19880a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Complete(recentOrder=");
                h.append(this.f19880a);
                h.append(", recentOrderListingImages=");
                return C0070b.m186i(h, this.f19881b, ')');
            }
        }

        /* renamed from: com.etsy.android.slice.PurchasesSliceProvider$b$c */
        public static final class C9013c extends C9010b {

            /* renamed from: a */
            public static final C9013c f19882a = new C9013c();
        }

        /* renamed from: com.etsy.android.slice.PurchasesSliceProvider$b$d */
        public static final class C9014d extends C9010b {

            /* renamed from: a */
            public static final C9014d f19883a = new C9014d();
        }

        /* renamed from: com.etsy.android.slice.PurchasesSliceProvider$b$e */
        public static final class C9015e extends C9010b {

            /* renamed from: a */
            public static final C9015e f19884a = new C9015e();
        }
    }

    private final Slice createAuthSlice(Context context, Uri uri) {
        String b = C8915n.m17350b(DeepLinkEntity.SIGN_IN, C17782b.m29864d0(new Pair("from_google_app_action", "true")));
        C4366c cVar = new C4366c(context, uri);
        C4362a aVar = new C4362a();
        aVar.f9603a = context.getString(R.string.sign_in_dialog_view_purchases_desc_text);
        aVar.f9604b = false;
        aVar.f9607e = new C4368e(PendingIntent.getActivity(context, 0, Intent.parseUri(b, 0), 0), IconCompat.m4960b(context, R.drawable.clg_icon_core_rightarrow_v1), context.getString(R.string.sign_in));
        cVar.f9602d.mo18809b(aVar);
        return ((C6627d) cVar.f9602d).mo18813f();
    }

    private final Slice createEmptyLoadingSlice(Context context, Uri uri) {
        return ((C6627d) new C4366c(context, uri).f9602d).mo18813f();
    }

    private final Slice createErrorSlice(Context context, Uri uri) {
        C4366c cVar = new C4366c(context, uri);
        C4362a aVar = new C4362a();
        aVar.f9603a = context.getString(R.string.save_search_error);
        aVar.f9604b = false;
        cVar.f9602d.mo18809b(aVar);
        return ((C6627d) cVar.f9602d).mo18813f();
    }

    private final Slice createNoRecentPurchasesSlice(Context context, Uri uri) {
        C4366c cVar = new C4366c(context, uri);
        C4362a aVar = new C4362a();
        aVar.f9603a = context.getString(R.string.empty_purchases);
        aVar.f9604b = false;
        cVar.f9602d.mo18809b(aVar);
        return ((C6627d) cVar.f9602d).mo18813f();
    }

    private final Slice createRecentPurchaseSlice(PastPurchaseReceipt pastPurchaseReceipt, List<Bitmap> list, Context context, Uri uri) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, Intent.parseUri(C8915n.m17350b(DeepLinkEntity.PURCHASES, C17782b.m29864d0(new Pair("from_google_app_action", "true"))), 0), 67108864);
        C4366c cVar = new C4366c(context, uri);
        C4362a aVar = new C4362a();
        ReceiptStatus receiptStatus = new ReceiptStatus();
        Resources resources = context.getResources();
        C19383o.m32796f(resources, "context.resources");
        aVar.f9603a = receiptStatus.getStatus(resources, getDateFormat(), pastPurchaseReceipt);
        aVar.f9604b = false;
        aVar.f9605c = getEtsyMoneyFactory().mo21248a(pastPurchaseReceipt.getGrandTotal(), pastPurchaseReceipt.getCurrencyCode()).format();
        aVar.f9606d = false;
        aVar.f9607e = new C4368e(activity, IconCompat.m4960b(context, R.drawable.abc_ic_arrow_forward), context.getString(R.string.open));
        cVar.f9602d.mo18809b(aVar);
        List<PastPurchaseTransaction> transactions = pastPurchaseReceipt.getTransactions();
        if (transactions != null) {
            int size = transactions.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                PastPurchaseTransaction pastPurchaseTransaction = transactions.get(i);
                if (i != 3) {
                    Bitmap bitmap = null;
                    if (!(i == list.size())) {
                        bitmap = list.get(i);
                    } else {
                        getGrafana().mo45474a("recent_order_slice.more_transactions_than_listing_images");
                    }
                    if (bitmap != null) {
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f5518b = bitmap;
                        C4367d dVar = new C4367d();
                        String title = pastPurchaseTransaction.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        dVar.f9612e = title;
                        dVar.f9613f = false;
                        if (pastPurchaseTransaction.getQuantity() > 1) {
                            dVar.f9614g = context.getString(R.string.quantity) + " : " + pastPurchaseTransaction.getQuantity();
                            dVar.f9615h = false;
                        }
                        dVar.f9611d = iconCompat;
                        dVar.f9610c = 2;
                        dVar.f9609b = false;
                        cVar.f9602d.mo18811d(dVar);
                        i++;
                    } else {
                        throw new IllegalArgumentException("Bitmap must not be null.");
                    }
                } else if (!cVar.f9601c) {
                    cVar.f9602d.mo18810c(activity);
                    cVar.f9601c = true;
                } else {
                    throw new IllegalArgumentException("Trying to add see more action when one has already been added");
                }
            }
        }
        return ((C6627d) cVar.f9602d).mo18813f();
    }

    /* access modifiers changed from: private */
    public final List<Bitmap> fetchItemImages(List<PastPurchaseTransaction> list) {
        Bitmap bitmap;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            if (getContext() == null || list.get(i).getMainImage() == null) {
                bitmap = null;
            } else {
                Context context = getContext();
                C19383o.m32794d(context);
                C5959e<Bitmap> asBitmap = Glide.with(context).asBitmap();
                PastPurchaseMainImage mainImage = list.get(i).getMainImage();
                C19383o.m32794d(mainImage);
                C5959e<Bitmap> W = asBitmap.mo16825W(mainImage.getUrl170x135());
                W.getClass();
                C6125e eVar = new C6125e();
                W.mo16817N(eVar, eVar, W, C4416e.f9695b);
                bitmap = (Bitmap) eVar.get();
            }
            arrayList.add(bitmap);
        }
        return arrayList;
    }

    private final void fetchRecentPurchase(Context context, Uri uri) {
        C19697g.m33468f(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PurchasesSliceProvider$fetchRecentPurchase$1(this, context, uri, (C19340c<? super PurchasesSliceProvider$fetchRecentPurchase$1>) null), 3);
    }

    private final SimpleDateFormat getDateFormat() {
        return (SimpleDateFormat) this.dateFormat$delegate.getValue();
    }

    private final void logGoogleAppActionEvent(String str) {
        this.analyticsTracker.mo21333d("google_app_action", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.ACTION, str), new Pair(PredefinedAnalyticsProperty.TYPE, "slice")));
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public final C8630b getEtsyMoneyFactory() {
        C8630b bVar = this.etsyMoneyFactory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("etsyMoneyFactory");
        throw null;
    }

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public final PurchasesRepository getPurchasesRepository() {
        PurchasesRepository purchasesRepository2 = this.purchasesRepository;
        if (purchasesRepository2 != null) {
            return purchasesRepository2;
        }
        C19383o.m32805o("purchasesRepository");
        throw null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public Slice onBindSlice(Uri uri) {
        C19383o.m32797g(uri, "sliceUri");
        if (!this.hasInjectedSelf) {
            C4579j1 j1Var = (C4579j1) BOEApplication.getAppComponent();
            C0114h hVar = j1Var.f10247h;
            C8731g gVar = (C8731g) j1Var.f10091D0.get();
            hVar.getClass();
            C19383o.m32797g(gVar, "retrofit");
            Object b = gVar.f19177a.mo74387b(C11652j.class);
            C19383o.m32796f(b, "retrofit.v3moshiRetrofit…asesEndpoint::class.java)");
            this.purchasesRepository = new PurchasesRepository((C11652j) b, j1Var.f10146O0.get(), new C11651i(j1Var.mo14404m()));
            this.session = (C13265p) j1Var.f10101F0.get();
            this.currentLocale = j1Var.f10298q0.get();
            this.etsyMoneyFactory = j1Var.f10141N0.get();
            this.grafana = (C12703a) j1Var.f10308s0.get();
            this.hasInjectedSelf = true;
        }
        if (!getSession().mo45960e()) {
            this.currentRecentOrderFetchStatus = C9010b.C9011a.f19879a;
        }
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (C19383o.m32792b(uri.getPath(), "/recentPurchase")) {
            C9010b bVar = this.currentRecentOrderFetchStatus;
            if (bVar instanceof C9010b.C9015e) {
                getGrafana().mo45475b("recent_order_slice.success.fetch_in_progress", 0.1d);
                fetchRecentPurchase(context, uri);
                return createEmptyLoadingSlice(context, uri);
            } else if (bVar instanceof C9010b.C9011a) {
                this.currentRecentOrderFetchStatus = C9010b.C9015e.f19884a;
                if (uri.getQueryParameter("from_google_app_action") != null) {
                    logGoogleAppActionEvent("recent_purchase");
                }
                return createAuthSlice(context, uri);
            } else if (bVar instanceof C9010b.C9013c) {
                this.currentRecentOrderFetchStatus = C9010b.C9015e.f19884a;
                getGrafana().mo45474a("recent_order_slice.error.fetch_status");
                return createErrorSlice(context, uri);
            } else if (bVar instanceof C9010b.C9014d) {
                getGrafana().mo45475b("recent_order_slice.success.no_recent_purchases", 1.0d);
                this.currentRecentOrderFetchStatus = C9010b.C9015e.f19884a;
                if (uri.getQueryParameter("from_google_app_action") != null) {
                    logGoogleAppActionEvent("recent_purchase");
                }
                return createNoRecentPurchasesSlice(context, uri);
            } else if (bVar instanceof C9010b.C9012b) {
                getGrafana().mo45475b("recent_order_slice.success.fetch_complete", 0.1d);
                C9010b bVar2 = this.currentRecentOrderFetchStatus;
                C19383o.m32795e(bVar2, "null cannot be cast to non-null type com.etsy.android.slice.PurchasesSliceProvider.RecentOrderFetchStatus.Complete");
                PastPurchaseReceipt pastPurchaseReceipt = ((C9010b.C9012b) bVar2).f19880a;
                C9010b bVar3 = this.currentRecentOrderFetchStatus;
                C19383o.m32795e(bVar3, "null cannot be cast to non-null type com.etsy.android.slice.PurchasesSliceProvider.RecentOrderFetchStatus.Complete");
                List<Bitmap> list = ((C9010b.C9012b) bVar3).f19881b;
                this.currentRecentOrderFetchStatus = C9010b.C9015e.f19884a;
                if (uri.getQueryParameter("from_google_app_action") != null) {
                    logGoogleAppActionEvent("recent_purchase");
                }
                return createRecentPurchaseSlice(pastPurchaseReceipt, list, context, uri);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            getGrafana().mo45474a("recent_order_slice.error.invalid_path");
            return createErrorSlice(context, uri);
        }
    }

    public boolean onCreateSliceProvider() {
        return true;
    }

    public Uri onMapIntentToUri(Intent intent) {
        Uri.Builder scheme = new Uri.Builder().scheme(ResponseConstants.CONTENT);
        if (intent == null) {
            Uri build = scheme.build();
            C19383o.m32796f(build, "uriBuilder.build()");
            return build;
        }
        Uri data = intent.getData();
        if (!(data == null || data.getPath() == null)) {
            String path = data.getPath();
            C19383o.m32794d(path);
            scheme = scheme.path(C19457k.m33023a1(path, "/", "", false));
        }
        Context context = getContext();
        if (context != null) {
            scheme = scheme.authority(context.getPackageName());
        }
        Uri build2 = scheme.build();
        C19383o.m32796f(build2, "uriBuilder.build()");
        return build2;
    }

    public void onSliceUnpinned(Uri uri) {
        C19697g.m33465c(this.coroutineScope);
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setEtsyMoneyFactory(C8630b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.etsyMoneyFactory = bVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setPurchasesRepository(PurchasesRepository purchasesRepository2) {
        C19383o.m32797g(purchasesRepository2, "<set-?>");
        this.purchasesRepository = purchasesRepository2;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }
}
