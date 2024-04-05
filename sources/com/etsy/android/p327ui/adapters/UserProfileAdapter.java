package com.etsy.android.p327ui.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.apiv3.ShopIcon;
import com.etsy.android.lib.models.apiv3.UserProfilePage;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.cardview.clickhandlers.C9129l;
import com.etsy.android.p327ui.cardview.viewholders.ListingCollectionViewHolder;
import com.etsy.android.p327ui.cart.googlepay.C9306d;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.p327ui.user.profile.viewholders.ProfileUserShopViewHolder$bind$2;
import com.etsy.android.p327ui.user.profile.viewholders.UserActionButtonsViewHolder$bind$1;
import com.etsy.android.p327ui.user.profile.viewholders.UserActionButtonsViewHolder$bind$2;
import com.etsy.android.p327ui.util.C11773c;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.text.ClickableSpanTouchListener;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.uikit.viewholder.C11989e;
import com.etsy.android.uikit.viewholder.C12007s;
import com.etsy.android.uikit.viewholder.C12008t;
import com.etsy.android.uikit.viewholder.C12013v;
import com.etsy.android.uikit.viewholder.C12018z;
import com.etsy.android.uikit.viewholder.ListingCardViewHolder;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p277w8.C8267e;
import p311af.C8515a;
import p311af.C8517c;
import p311af.C8518d;
import p311af.C8519e;
import p311af.C8520f;
import p311af.C8522g;
import p351ff.C12745a;
import p351ff.C12746b;
import p356ge.C12788a;
import p357gf.C12796e;
import p415of.C13180i;
import p425q9.C13265p;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.adapters.UserProfileAdapter */
public final class UserProfileAdapter extends C11829a<Pair<?, Integer>> implements C13180i {

    /* renamed from: b */
    public final C8703p f20001b;

    /* renamed from: c */
    public final C9125j f20002c;

    /* renamed from: d */
    public final C9129l f20003d;

    /* renamed from: e */
    public UserProfilePage f20004e;

    /* renamed from: f */
    public final boolean f20005f;

    /* renamed from: g */
    public final C9104e f20006g;

    /* renamed from: h */
    public final C13265p f20007h;

    /* renamed from: i */
    public boolean f20008i;

    /* renamed from: j */
    public final HashMap<String, ArrayList<Integer>> f20009j = new HashMap<>();

    /* renamed from: k */
    public final C12008t f20010k;

    /* renamed from: l */
    public final C9100a f20011l = new C9100a(this.mContext.getResources().getDimensionPixelOffset(R.dimen.clg_space_8));

    /* renamed from: com.etsy.android.ui.adapters.UserProfileAdapter$UserListType */
    public enum UserListType {
        LIST_TYPE_COLLECTION,
        LIST_TYPE_FAVORITE_SHOP
    }

    /* renamed from: com.etsy.android.ui.adapters.UserProfileAdapter$a */
    public class C9100a extends C12013v {
        public C9100a(int i) {
            super(i);
        }

        /* renamed from: f */
        public final boolean mo31303f(View view, RecyclerView recyclerView) {
            return recyclerView.getChildViewHolder(view).getItemViewType() == 505;
        }
    }

    /* renamed from: com.etsy.android.ui.adapters.UserProfileAdapter$b */
    public class C9101b extends BroadcastReceiver {
        public C9101b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(EtsyAction.STATE_CHANGE.getIntentAction())) {
                UserProfileAdapter.this.mo31301j(intent.getExtras());
            }
        }
    }

    /* renamed from: com.etsy.android.ui.adapters.UserProfileAdapter$c */
    public class C9102c extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ ShopCard f20013b;

        public C9102c(ShopCard shopCard) {
            this.f20013b = shopCard;
        }

        public final void onViewClick(View view) {
            C12788a.m20424c(UserProfileAdapter.this.mContext, new ShopHomeKey(C19421p.m32935c0(UserProfileAdapter.this.mContext), this.f20013b.getShopId(), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 256, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: com.etsy.android.ui.adapters.UserProfileAdapter$d */
    public static /* synthetic */ class C9103d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20015a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.etsy.android.ui.adapters.UserProfileAdapter$UserListType[] r0 = com.etsy.android.p327ui.adapters.UserProfileAdapter.UserListType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20015a = r0
                com.etsy.android.ui.adapters.UserProfileAdapter$UserListType r1 = com.etsy.android.p327ui.adapters.UserProfileAdapter.UserListType.LIST_TYPE_COLLECTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20015a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.ui.adapters.UserProfileAdapter$UserListType r1 = com.etsy.android.p327ui.adapters.UserProfileAdapter.UserListType.LIST_TYPE_FAVORITE_SHOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.adapters.UserProfileAdapter.C9103d.<clinit>():void");
        }
    }

    /* renamed from: com.etsy.android.ui.adapters.UserProfileAdapter$e */
    public static class C9104e {

        /* renamed from: a */
        public int f20016a;

        /* renamed from: b */
        public int f20017b;

        /* renamed from: c */
        public int f20018c;

        /* renamed from: d */
        public int f20019d;

        /* renamed from: e */
        public int f20020e;

        /* renamed from: f */
        public boolean f20021f;
    }

    public UserProfileAdapter(Fragment fragment, C8703p pVar, boolean z, C13265p pVar2, C8267e eVar, C12796e eVar2) {
        super(fragment.requireActivity());
        new C9101b();
        this.f20001b = pVar;
        this.f20002c = new C9125j(fragment, this, pVar, (C9126k.C9128b) null, eVar);
        this.f20003d = new C9129l(fragment, pVar);
        this.f20005f = z;
        this.f20007h = pVar2;
        FragmentActivity requireActivity = fragment.requireActivity();
        C9104e eVar3 = new C9104e();
        boolean z2 = requireActivity.getResources().getBoolean(R.bool.width_600);
        boolean e = C8914m.m17347e(requireActivity);
        eVar3.f20021f = e || z2;
        int integer = requireActivity.getResources().getInteger(R.integer.user_profile_max_span_count);
        eVar3.f20016a = integer;
        boolean z3 = eVar3.f20021f;
        eVar3.f20017b = z3 ? 4 : 3;
        int i = z3 ? integer / 2 : integer;
        eVar3.f20018c = i;
        int i2 = integer / i;
        eVar3.f20019d = (!z2 || !e) ? integer : integer / 4;
        if (z2 && e && !z) {
            integer = (integer * 3) / 4;
        }
        eVar3.f20020e = integer;
        this.f20006g = eVar3;
        this.f20010k = new C12008t(this.mContext, pVar, pVar.f19116n, C18263b.f40057V, eVar2);
    }

    /* renamed from: b */
    public final void mo31298b(int i) {
    }

    public final void clear() {
        super.clear();
        this.f20004e = null;
        this.f20008i = false;
        this.f20009j.clear();
    }

    public final int getListItemViewType(int i) {
        return ((Integer) ((Pair) this.mItems.get(i)).getSecond()).intValue();
    }

    /* renamed from: i */
    public final void mo31300i(int i) {
        notifyItemChanged(i);
    }

    /* renamed from: j */
    public final void mo31301j(Bundle bundle) {
        if (!this.f20008i) {
            for (int i = 0; i < this.mItems.size(); i++) {
                Object first = ((Pair) this.mItems.get(i)).getFirst();
                if (first instanceof ListingLike) {
                    String etsyId = ((ListingLike) first).getListingId().toString();
                    ArrayList arrayList = this.f20009j.get(etsyId);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f20009j.put(etsyId, arrayList);
                    }
                    arrayList.add(Integer.valueOf(i));
                }
            }
            this.f20008i = true;
        }
        String string = bundle.getString("id");
        if (!TextUtils.isEmpty(string) && this.f20009j.containsKey(string)) {
            for (Integer intValue : this.f20009j.get(string)) {
                int intValue2 = intValue.intValue();
                if (((Pair) this.mItems.get(intValue2)).getFirst() instanceof ListingLike) {
                    ListingLike listingLike = (ListingLike) ((Pair) this.mItems.get(intValue2)).getFirst();
                    if (bundle.containsKey(EtsyAction.STATE_FAVORITE)) {
                        listingLike.setIsFavorite(bundle.getBoolean(EtsyAction.STATE_FAVORITE));
                    }
                    if (bundle.containsKey(EtsyAction.STATE_COLLECTIONS)) {
                        listingLike.setHasCollections(bundle.getBoolean(EtsyAction.STATE_COLLECTIONS));
                    }
                    notifyItemChanged(intValue2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f1  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31302k(com.etsy.android.lib.models.apiv3.UserProfilePage r19) {
        /*
            r18 = this;
            r0 = r18
            com.etsy.android.lib.models.apiv3.UserProfileV3 r1 = r19.getUserProfile()
            java.util.ArrayList<T> r2 = r0.mItems
            kotlin.Pair r3 = new kotlin.Pair
            com.etsy.android.lib.models.apiv3.UserProfileV3 r4 = r19.getUserProfile()
            r5 = 501(0x1f5, float:7.02E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.<init>(r4, r5)
            r2.add(r3)
            boolean r2 = r0.f20005f
            if (r2 != 0) goto L_0x002e
            java.util.ArrayList<T> r2 = r0.mItems
            kotlin.Pair r3 = new kotlin.Pair
            r4 = 510(0x1fe, float:7.15E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r1, r4)
            r2.add(r3)
        L_0x002e:
            boolean r1 = r1.isSeller()
            r2 = 508(0x1fc, float:7.12E-43)
            if (r1 == 0) goto L_0x009b
            com.etsy.android.lib.models.apiv3.ShopCard r1 = r19.getShopCard()
            if (r1 == 0) goto L_0x009b
            java.util.ArrayList<T> r4 = r0.mItems
            kotlin.Pair r5 = new kotlin.Pair
            r6 = 503(0x1f7, float:7.05E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.<init>(r1, r6)
            r4.add(r5)
            java.util.List r4 = r1.getCardListings()
            java.util.List r5 = r1.getCardListings()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x007a
            int r6 = r5 % 4
            if (r6 != 0) goto L_0x007a
            r6 = 0
        L_0x005f:
            if (r6 >= r5) goto L_0x007a
            java.util.ArrayList<T> r7 = r0.mItems
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.Object r9 = r4.get(r6)
            com.etsy.android.lib.models.interfaces.ListingLike r9 = (com.etsy.android.lib.models.interfaces.ListingLike) r9
            r10 = 504(0x1f8, float:7.06E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.<init>(r9, r10)
            r7.add(r8)
            int r6 = r6 + 1
            goto L_0x005f
        L_0x007a:
            java.util.ArrayList<T> r4 = r0.mItems
            kotlin.Pair r5 = new kotlin.Pair
            com.etsy.android.uikit.viewholder.e$a r6 = new com.etsy.android.uikit.viewholder.e$a
            androidx.fragment.app.FragmentActivity r7 = r0.mContext
            r8 = 2131953732(0x7f130844, float:1.9543943E38)
            java.lang.String r7 = r7.getString(r8)
            com.etsy.android.ui.adapters.UserProfileAdapter$c r8 = new com.etsy.android.ui.adapters.UserProfileAdapter$c
            r8.<init>(r1)
            r6.<init>(r7, r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5.<init>(r6, r1)
            r4.add(r5)
        L_0x009b:
            com.etsy.android.ui.adapters.UserProfileAdapter$UserListType[] r1 = com.etsy.android.p327ui.adapters.UserProfileAdapter.UserListType.values()
            int r4 = r1.length
            r5 = 0
        L_0x00a1:
            if (r5 >= r4) goto L_0x020d
            r6 = r1[r5]
            com.etsy.android.lib.models.apiv3.UserProfileV3 r7 = r19.getUserProfile()
            androidx.fragment.app.FragmentActivity r8 = r0.mContext
            android.content.res.Resources r8 = r8.getResources()
            int[] r9 = com.etsy.android.p327ui.adapters.UserProfileAdapter.C9103d.f20015a
            int r10 = r6.ordinal()
            r10 = r9[r10]
            r12 = 2
            r13 = 1
            if (r10 == r13) goto L_0x010d
            if (r10 == r12) goto L_0x00be
            goto L_0x0113
        L_0x00be:
            int r10 = r7.getFavoriteShopsCount()
            if (r10 > 0) goto L_0x00c5
            goto L_0x0113
        L_0x00c5:
            java.util.List r14 = r19.getFavoriteShops()
            r15 = 2131952257(0x7f130281, float:1.9540952E38)
            java.lang.String r15 = r8.getString(r15)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r2 = " "
            r11.append(r2)
            r2 = 2131820578(0x7f110022, float:1.9273875E38)
            java.lang.String r2 = r8.getQuantityString(r2, r10)
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            r11 = 2131953428(0x7f130714, float:1.9543327E38)
            java.lang.String r8 = r8.getString(r11)
            int r6 = r6.ordinal()
            r6 = r9[r6]
            if (r6 == r13) goto L_0x0104
            if (r6 == r12) goto L_0x00fe
            r11 = 0
            goto L_0x0109
        L_0x00fe:
            com.etsy.android.ui.adapters.c r11 = new com.etsy.android.ui.adapters.c
            r11.<init>(r0, r7)
            goto L_0x0109
        L_0x0104:
            com.etsy.android.ui.adapters.b r11 = new com.etsy.android.ui.adapters.b
            r11.<init>(r0, r7)
        L_0x0109:
            r17 = r1
            goto L_0x0199
        L_0x010d:
            int r2 = r7.getFavoriteListingsCount()
            if (r2 > 0) goto L_0x0119
        L_0x0113:
            r17 = r1
        L_0x0115:
            r6 = 508(0x1fc, float:7.12E-43)
            goto L_0x0206
        L_0x0119:
            java.util.List r9 = r19.getCollections()
            int r10 = r9.size()
            java.util.List r9 = r19.getCollections()
            com.etsy.android.ui.adapters.UserProfileAdapter$e r11 = r0.f20006g
            int r11 = r11.f20017b
            boolean r14 = r0.f20005f
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r12 = r9.size()
            r3 = 0
            r13 = 0
        L_0x0136:
            if (r3 >= r11) goto L_0x015c
            if (r13 >= r12) goto L_0x015c
            java.lang.Object r16 = r9.get(r13)
            r17 = r1
            r1 = r16
            com.etsy.android.lib.models.apiv3.Collection r1 = (com.etsy.android.lib.models.apiv3.Collection) r1
            int r16 = r1.getListingsCount()
            if (r16 <= 0) goto L_0x0157
            if (r14 != 0) goto L_0x0152
            boolean r16 = r1.isPublic()
            if (r16 == 0) goto L_0x0157
        L_0x0152:
            r15.add(r1)
            int r3 = r3 + 1
        L_0x0157:
            int r13 = r13 + 1
            r1 = r17
            goto L_0x0136
        L_0x015c:
            r17 = r1
            r1 = 2131952253(0x7f13027d, float:1.9540944E38)
            java.lang.String r1 = r8.getString(r1)
            r3 = 2131820555(0x7f11000b, float:1.9273828E38)
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r13 = 0
            r11[r13] = r12
            java.lang.String r2 = r8.getQuantityString(r3, r2, r11)
            r3 = 2131953427(0x7f130713, float:1.9543325E38)
            java.lang.String r8 = r8.getString(r3)
            int[] r3 = com.etsy.android.p327ui.adapters.UserProfileAdapter.C9103d.f20015a
            int r6 = r6.ordinal()
            r3 = r3[r6]
            if (r3 == r9) goto L_0x0192
            r6 = 2
            if (r3 == r6) goto L_0x018c
            r11 = 0
            goto L_0x0197
        L_0x018c:
            com.etsy.android.ui.adapters.c r11 = new com.etsy.android.ui.adapters.c
            r11.<init>(r0, r7)
            goto L_0x0197
        L_0x0192:
            com.etsy.android.ui.adapters.b r11 = new com.etsy.android.ui.adapters.b
            r11.<init>(r0, r7)
        L_0x0197:
            r14 = r15
            r15 = r1
        L_0x0199:
            com.etsy.android.uikit.viewholder.z$a r1 = new com.etsy.android.uikit.viewholder.z$a
            r1.<init>(r15, r2)
            java.util.ArrayList<T> r2 = r0.mItems
            kotlin.Pair r3 = new kotlin.Pair
            r6 = 505(0x1f9, float:7.08E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.<init>(r1, r6)
            r2.add(r3)
            int r1 = r14.size()
            r13 = 0
        L_0x01b3:
            if (r13 >= r1) goto L_0x01ed
            java.lang.Object r2 = r14.get(r13)
            boolean r2 = r2 instanceof com.etsy.android.lib.models.apiv3.Collection
            if (r2 == 0) goto L_0x01d4
            java.util.ArrayList<T> r2 = r0.mItems
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.Object r6 = r14.get(r13)
            com.etsy.android.lib.models.BaseModel r6 = (com.etsy.android.lib.models.BaseModel) r6
            r7 = 511(0x1ff, float:7.16E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.<init>(r6, r7)
            r2.add(r3)
            goto L_0x01ea
        L_0x01d4:
            java.util.ArrayList<T> r2 = r0.mItems
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.Object r6 = r14.get(r13)
            com.etsy.android.lib.models.BaseModel r6 = (com.etsy.android.lib.models.BaseModel) r6
            r7 = 507(0x1fb, float:7.1E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.<init>(r6, r7)
            r2.add(r3)
        L_0x01ea:
            int r13 = r13 + 1
            goto L_0x01b3
        L_0x01ed:
            if (r10 != r1) goto L_0x01f1
            goto L_0x0115
        L_0x01f1:
            com.etsy.android.uikit.viewholder.e$a r1 = new com.etsy.android.uikit.viewholder.e$a
            r1.<init>(r8, r11)
            java.util.ArrayList<T> r2 = r0.mItems
            kotlin.Pair r3 = new kotlin.Pair
            r6 = 508(0x1fc, float:7.12E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.<init>(r1, r7)
            r2.add(r3)
        L_0x0206:
            int r5 = r5 + 1
            r2 = r6
            r1 = r17
            goto L_0x00a1
        L_0x020d:
            r1 = r19
            r0.f20004e = r1
            java.util.ArrayList<T> r1 = r0.mItems
            int r1 = r1.size()
            r2 = 0
            r0.notifyItemRangeInserted(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.adapters.UserProfileAdapter.mo31302k(com.etsy.android.lib.models.apiv3.UserProfilePage):void");
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        if (this.f20004e != null) {
            Pair pair = (Pair) getItem(i);
            int i2 = 8;
            switch (((Integer) pair.getSecond()).intValue()) {
                case 501:
                    C8522g gVar = (C8522g) b0Var;
                    UserProfileV3 userProfileV3 = (UserProfileV3) pair.getFirst();
                    FragmentActivity fragmentActivity = this.mContext;
                    if (userProfileV3 == null) {
                        gVar.f18557g.setVisibility(8);
                        gVar.f18556f.setVisibility(8);
                        return;
                    }
                    gVar.getClass();
                    String displayName = userProfileV3.getDisplayName();
                    String location = userProfileV3.getLocation();
                    View view = gVar.f18555e;
                    if (userProfileV3.isAdmin()) {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                    C0761x.m1708a0(gVar.f18560j, gVar.f18552b, userProfileV3.getAvatarUrl());
                    gVar.f18553c.setText(displayName);
                    NumberFormat instance = NumberFormat.getInstance();
                    Resources resources = fragmentActivity.getResources();
                    int followerCount = userProfileV3.getFollowerCount();
                    gVar.f18557g.setText(resources.getQuantityString(R.plurals.follower_counts, followerCount, new Object[]{instance.format((long) followerCount)}));
                    gVar.f18557g.setOnClickListener(new C8518d(fragmentActivity, userProfileV3));
                    gVar.f18557g.setVisibility(0);
                    gVar.f18556f.setText(resources.getString(R.string.following_count, new Object[]{instance.format((long) userProfileV3.getFollowingCount())}));
                    gVar.f18556f.setOnClickListener(new C8519e(fragmentActivity, userProfileV3));
                    gVar.f18556f.setVisibility(0);
                    if (!gVar.f18561k) {
                        if (C8885d0.m17324h(location)) {
                            gVar.f18554d.setVisibility(0);
                            gVar.f18554d.setText(location);
                        } else {
                            gVar.f18554d.setVisibility(8);
                        }
                        String trim = userProfileV3.getBio().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            gVar.f18558h.setVisibility(0);
                            gVar.f18558h.setText(trim);
                            EtsyLinkify.m19610d(fragmentActivity, gVar.f18558h);
                            gVar.f18558h.setMovementMethod((MovementMethod) null);
                            gVar.f18558h.setClickable(true);
                            gVar.f18558h.setOnTouchListener(new ClickableSpanTouchListener());
                            gVar.f18558h.post(new C8520f(gVar, fragmentActivity, trim));
                            return;
                        }
                        gVar.f18558h.setVisibility(8);
                        return;
                    }
                    return;
                case 503:
                    UserProfileV3 userProfile = this.f20004e.getUserProfile();
                    C8515a aVar = (C8515a) b0Var;
                    ShopCard shopCard = (ShopCard) pair.getFirst();
                    String firstName = userProfile.getFirstName();
                    int transactionsSoldCount = userProfile.getTransactionsSoldCount();
                    boolean z = this.f20005f;
                    aVar.getClass();
                    C19383o.m32797g(shopCard, "shopData");
                    aVar.f18531b.setText(shopCard.getShopName());
                    if (z) {
                        aVar.f18534e.setText(R.string.nav_shop);
                    } else {
                        TextView textView = aVar.f18534e;
                        String format = String.format(aVar.f18537h, Arrays.copyOf(new Object[]{firstName}, 1));
                        C19383o.m32796f(format, "format(format, *args)");
                        textView.setText(format);
                    }
                    if (shopCard.hasIcon()) {
                        aVar.f18532c.post(new C9306d(1, aVar, shopCard));
                        aVar.f18532c.setOnClickListener(new ProfileUserShopViewHolder$bind$2(aVar, shopCard));
                    } else {
                        aVar.f18532c.setVisibility(8);
                    }
                    String quantityString = aVar.itemView.getContext().getResources().getQuantityString(R.plurals.sales_pl_nt_sentence_case, transactionsSoldCount, new Object[]{Integer.valueOf(transactionsSoldCount)});
                    C19383o.m32796f(quantityString, "itemView.context.resourc…actionCount\n            )");
                    aVar.f18536g.setText(quantityString);
                    String string = aVar.itemView.getContext().getString(R.string.since, new Object[]{aVar.f18538i.format(shopCard.getOpenDate())});
                    C19383o.m32796f(string, "itemView.context.getStri…pData.openDate)\n        )");
                    aVar.f18535f.setText(string);
                    if (shopCard.getAverageRating() > ShadowDrawableWrapper.COS_45) {
                        aVar.f18533d.setRating((float) shopCard.getAverageRating());
                        CollageRatingView collageRatingView = aVar.f18533d;
                        StringBuilder k = C0326j.m866k('(');
                        k.append(shopCard.getNumRatings());
                        k.append(')');
                        collageRatingView.setText(k.toString());
                        return;
                    }
                    aVar.f18533d.setVisibility(8);
                    return;
                case 504:
                    ((ListingCardViewHolder) b0Var).mo38778g((ListingCard) pair.getFirst());
                    return;
                case 505:
                    C12018z zVar = (C12018z) b0Var;
                    C12018z.C12019a aVar2 = (C12018z.C12019a) pair.getFirst();
                    zVar.f26787c.setText(aVar2.f26789a);
                    zVar.f26788d.setText(aVar2.f26790b);
                    return;
                case 507:
                    C12746b bVar = (C12746b) b0Var;
                    ShopCard shopCard2 = (ShopCard) pair.getFirst();
                    bVar.getClass();
                    bVar.f28153c.setText(shopCard2.getShopName());
                    bVar.f28152b.setOnClickListener(new C12745a(PredefinedAnalyticsProperty.SHOP_ID, shopCard2.getShopId(), shopCard2));
                    if (bVar.f28159i > 0) {
                        List<? extends ListingLike> cardListings = shopCard2.getCardListings();
                        int i3 = 0;
                        while (i3 < bVar.f28159i) {
                            ListingFullImageView listingFullImageView = (ListingFullImageView) bVar.f28158h.get(i3);
                            ListingImage listingImage = cardListings.size() > i3 ? ((ListingLike) cardListings.get(i3)).getListingImage() : null;
                            if (listingImage != null) {
                                listingFullImageView.setImageInfo(listingImage);
                            } else if (i3 == bVar.f28159i - 1 || bVar.f28160j) {
                                listingFullImageView.setImageDrawable((Drawable) null);
                                listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image);
                            } else {
                                listingFullImageView.setImageDrawable((Drawable) null);
                                listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image_right_divider);
                            }
                            i3++;
                        }
                    }
                    bVar.f28156f.setVisibility(0);
                    Pair<Integer, String> pair2 = ShopIcon.IMG_SIZE_75;
                    String iconUrl = C8885d0.m17324h(shopCard2.getIconUrl(pair2.getFirst().intValue())) ? shopCard2.getIconUrl(pair2.getFirst().intValue()) : shopCard2.getAvatarUrl();
                    Context context = bVar.f28156f.getContext();
                    C19383o.m32797g(context, ResponseConstants.CONTEXT);
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.clg_color_bg_image});
                    C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttributes(styledAttrs)");
                    ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
                    if (colorStateList != null) {
                        obtainStyledAttributes.recycle();
                        C0114h.m272C0(bVar.f28156f).load(iconUrl).mo17160t(new ColorDrawable(colorStateList.getDefaultColor())).mo46137e0().mo16816M(bVar.f28156f);
                        bVar.f28155e.setVisibility(8);
                        if (!shopCard2.hasRatings() || shopCard2.getAverageRating() <= ShadowDrawableWrapper.COS_45) {
                            bVar.f28157g.setVisibility(8);
                            return;
                        }
                        bVar.f28157g.setVisibility(0);
                        bVar.f28157g.setRating((float) shopCard2.getAverageRating());
                        CollageRatingView collageRatingView2 = bVar.f28157g;
                        StringBuilder h = C0072d.m201h("(");
                        h.append(C8885d0.m17318b((double) shopCard2.getNumRatings()));
                        h.append(")");
                        collageRatingView2.setText(h.toString());
                        return;
                    }
                    throw new IllegalStateException();
                case 508:
                    C11989e eVar = (C11989e) b0Var;
                    C11989e.C11990a aVar3 = (C11989e.C11990a) pair.getFirst();
                    eVar.f26701c.setText(aVar3.f26702a);
                    TrackingOnClickListener trackingOnClickListener = aVar3.f26703b;
                    if (trackingOnClickListener != null) {
                        eVar.f26701c.setOnClickListener(trackingOnClickListener);
                    }
                    eVar.f26701c.setVisibility(0);
                    return;
                case 510:
                    C8517c cVar = (C8517c) b0Var;
                    UserProfileV3 userProfileV32 = (UserProfileV3) pair.getFirst();
                    FragmentActivity fragmentActivity2 = this.mContext;
                    cVar.getClass();
                    C19383o.m32797g(userProfileV32, Scopes.PROFILE);
                    cVar.mo21052e(userProfileV32.isFollowing());
                    cVar.f18543c.setOnClickListener(new UserActionButtonsViewHolder$bind$1(userProfileV32, fragmentActivity2));
                    C19383o.m32794d(fragmentActivity2);
                    cVar.f18542b.setOnClickListener(new UserActionButtonsViewHolder$bind$2(new C11773c(fragmentActivity2), userProfileV32, fragmentActivity2, cVar));
                    return;
                case 511:
                    ((ListingCollectionViewHolder) b0Var).mo31382g(new UserCollection((Collection) pair.getFirst(), this.f20004e.getUserProfile().getDisplayName(), this.f20004e.getUserProfile().getAvatarUrl()));
                    return;
                default:
                    return;
            }
        }
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 501:
                return new C8522g(this.mInflater.inflate(R.layout.user_profile_header, viewGroup, false));
            case 503:
                return new C8515a(this.mInflater.inflate(R.layout.user_profile_shop_info, viewGroup, false));
            case 504:
                return new ListingCardViewHolder(this.f20002c, false, false, this.f20010k, new ListingCardViewHolderOptions.C11973g(viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.clg_space_8), this.f20001b.f19116n), new C12007s(viewGroup));
            case 505:
                return new C12018z(this.mInflater.inflate(R.layout.layout_heading_and_description, viewGroup, false));
            case 507:
                View inflate = this.mInflater.inflate(R.layout.list_item_card_standard_full, viewGroup, false);
                C9104e eVar = this.f20006g;
                return new C12746b(inflate, eVar.f20017b, eVar.f20021f);
            case 508:
                return new C11989e(this.mInflater.inflate(R.layout.button_primary, viewGroup, false));
            case 510:
                return new C8517c(this.mInflater.inflate(R.layout.user_profile_action_buttons, viewGroup, false));
            case 511:
                return new ListingCollectionViewHolder(viewGroup, this.f20003d);
            default:
                return null;
        }
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        super.onViewRecycled(b0Var);
        int itemViewType = b0Var.getItemViewType();
        if (itemViewType == 504) {
            ((ListingCardViewHolder) b0Var).mo31374b();
        } else if (itemViewType == 507) {
            C12746b bVar = (C12746b) b0Var;
            bVar.f28154d.setVisibility(8);
            bVar.f28155e.setVisibility(0);
            bVar.f28156f.setVisibility(8);
            bVar.f28157g.setVisibility(8);
            int size = bVar.f28158h.size();
            for (int i = 0; i < size; i++) {
                ((ListingFullImageView) bVar.f28158h.get(i)).cleanUp();
            }
        }
    }
}
