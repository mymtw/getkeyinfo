package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.lib.models.apiv3.cart.SavedCartListing;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.uikit.view.C11929c;
import com.etsy.android.uikit.view.ListingFullImageView;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p367ib.C12924b;
import p396mb.C13039e;
import p396mb.C13040f;
import p396mb.C13041g;
import p396mb.C13042h;
import p396mb.C13044i;
import p404nb.C13100a;
import p435rb.C13350a;
import p504ai.C13983i;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView */
public final class SavedCartListingView extends LinearLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    public C19846a<Integer> adapterPositionCallback;
    private final Button btnMoveToCart;
    private final Button btnMoveToFavorites;
    private final Button btnRemove;
    private final View cartLoadingView;
    private SavedCartClickHandler clickListener;
    private final ListingFullImageView listingImage;
    private final TextView listingPrice;
    private final TextView listingTitle;
    private final TextView originalPrice;
    private final View plusShipping;
    private final TextView shopName;
    private final View unavailableMessageBubble;

    /* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView$a */
    public static final class C9151a implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ SavedCartListingView f20127a;

        /* renamed from: b */
        public final /* synthetic */ SavedCart f20128b;

        public C9151a(SavedCartListingView savedCartListingView, SavedCart savedCart) {
            this.f20127a = savedCartListingView;
            this.f20128b = savedCart;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f20127a.handleMoveToCart(this.f20128b);
            return true;
        }
    }

    /* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView$b */
    public static final class C9152b implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ SavedCartListingView f20129a;

        /* renamed from: b */
        public final /* synthetic */ SavedCart f20130b;

        public C9152b(SavedCartListingView savedCartListingView, SavedCart savedCart) {
            this.f20129a = savedCartListingView;
            this.f20130b = savedCart;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f20129a.handleMoveToFavorites(this.f20130b);
            return true;
        }
    }

    /* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView$c */
    public static final class C9153c implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ SavedCartListingView f20131a;

        /* renamed from: b */
        public final /* synthetic */ SavedCart f20132b;

        public C9153c(SavedCartListingView savedCartListingView, SavedCart savedCart) {
            this.f20131a = savedCartListingView;
            this.f20132b = savedCart;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f20131a.handleRemove(this.f20132b);
            return true;
        }
    }

    /* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView$d */
    public static final class C9154d implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ SavedCartListingView f20133a;

        /* renamed from: b */
        public final /* synthetic */ SavedCart f20134b;

        public C9154d(SavedCartListingView savedCartListingView, SavedCart savedCart) {
            this.f20133a = savedCartListingView;
            this.f20134b = savedCart;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f20133a.handleViewListing(this.f20134b.getCartListing());
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedCartListingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        C0114h.m305j0(this, R.layout.view_saved_cart_listing, true);
        View findViewById = findViewById(R.id.cart_view_loading);
        C19383o.m32796f(findViewById, "findViewById(R.id.cart_view_loading)");
        this.cartLoadingView = findViewById;
        View findViewById2 = findViewById(R.id.btn_remove);
        C19383o.m32795e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) findViewById2;
        this.btnRemove = button;
        View findViewById3 = findViewById(R.id.btn_move_to_cart);
        C19383o.m32795e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        Button button2 = (Button) findViewById3;
        this.btnMoveToCart = button2;
        View findViewById4 = findViewById(R.id.btn_move_to_favorites);
        C19383o.m32795e(findViewById4, "null cannot be cast to non-null type android.widget.Button");
        Button button3 = (Button) findViewById4;
        this.btnMoveToFavorites = button3;
        View findViewById5 = findViewById(R.id.listing_title);
        C19383o.m32795e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById5;
        this.listingTitle = textView;
        View findViewById6 = findViewById(R.id.shop_name);
        C19383o.m32795e(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById6;
        this.shopName = textView2;
        View findViewById7 = findViewById(R.id.listing_image);
        C19383o.m32795e(findViewById7, "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingFullImageView");
        ListingFullImageView listingFullImageView = (ListingFullImageView) findViewById7;
        this.listingImage = listingFullImageView;
        View findViewById8 = findViewById(R.id.txt_total_price);
        C19383o.m32795e(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById8;
        this.listingPrice = textView3;
        View findViewById9 = findViewById(R.id.txt_price);
        C19383o.m32795e(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById9;
        this.originalPrice = textView4;
        View findViewById10 = findViewById(R.id.shipping_text);
        C19383o.m32796f(findViewById10, "findViewById(R.id.shipping_text)");
        this.plusShipping = findViewById10;
        View findViewById11 = findViewById(R.id.unavailable_msg_bubble);
        C19383o.m32796f(findViewById11, "findViewById(R.id.unavailable_msg_bubble)");
        this.unavailableMessageBubble = findViewById11;
        setOrientation(1);
        textView4.setPaintFlags(textView4.getPaintFlags() | 16);
        listingFullImageView.setImageViewTransformation(new C11929c.C11930a((int) context.getResources().getDimension(R.dimen.saved_cart_listing_image_corner_radius)));
        NavigationExtensionsKt.m17421b(this, textView2.getId(), textView.getId(), textView3.getId(), textView4.getId(), findViewById10.getId(), button3.getId(), button.getId(), button2.getId(), findViewById11.getId());
        Object obj = C8184a.f17966a;
        setForeground(C8184a.C8187c.m16466b(context, R.drawable.clg_touch_feedback));
    }

    private final void bindListing(C9163b1 b1Var) {
        this.listingTitle.setText(b1Var.f20154c);
        setOnClickListener(new SavedCartListingView$bindListing$1(this, b1Var, new C8698l[]{b1Var.f20152a, b1Var.f20153b}));
        bindPrice(b1Var);
        ViewExtensions.m12870n(this.plusShipping, new SavedCartListingView$bindListing$2(b1Var));
        ListingImage listingImage2 = b1Var.f20159h;
        if (listingImage2 != null) {
            this.listingImage.setVisibility(0);
            this.listingImage.setImageInfo(listingImage2);
            return;
        }
        this.listingImage.setVisibility(4);
    }

    private final void bindPrice(C9163b1 b1Var) {
        String str = b1Var.f20160i;
        String str2 = b1Var.f20161j;
        if (b1Var.f20163l) {
            this.originalPrice.setVisibility(0);
            this.originalPrice.setText(str);
            this.originalPrice.setContentDescription(getContext().getString(R.string.old_price, new Object[]{str}));
            this.listingPrice.setContentDescription(getContext().getString(R.string.new_price, new Object[]{str2}));
            this.listingPrice.setText(str2);
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            this.listingPrice.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_urgency));
            return;
        }
        this.originalPrice.setVisibility(8);
        this.originalPrice.setText("");
        this.listingPrice.setText(str);
        this.listingPrice.setContentDescription(getContext().getString(R.string.price_content_description, new Object[]{str}));
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        this.listingPrice.setTextColor(C13350a.m21013d(context2, R.attr.clg_color_text_secondary));
    }

    private final void bindShop(C9163b1 b1Var) {
        this.shopName.setText(b1Var.f20158g);
        this.shopName.setOnClickListener(new SavedCartListingView$bindShop$1(this, b1Var, new C8698l[]{b1Var.f20152a, b1Var.f20153b}));
    }

    /* access modifiers changed from: private */
    public final void handleMoveToCart(SavedCart savedCart) {
        SavedCartClickHandler savedCartClickHandler = this.clickListener;
        if (savedCartClickHandler != null) {
            savedCartClickHandler.mo31336h(new C12924b.C12925a(savedCart), getAdapterPositionCallback().invoke().intValue(), savedCartClickHandler.mo45889a().getString(R.string.toast_move_to_cart));
        }
    }

    /* access modifiers changed from: private */
    public final void handleMoveToFavorites(SavedCart savedCart) {
        SavedCartClickHandler savedCartClickHandler = this.clickListener;
        if (savedCartClickHandler != null) {
            savedCartClickHandler.mo31333e(savedCart, getAdapterPositionCallback().invoke().intValue());
        }
    }

    /* access modifiers changed from: private */
    public final void handleRemove(SavedCart savedCart) {
        SavedCartClickHandler savedCartClickHandler = this.clickListener;
        if (savedCartClickHandler != null) {
            savedCartClickHandler.mo31332d(savedCart, getAdapterPositionCallback().invoke().intValue());
        }
    }

    /* access modifiers changed from: private */
    public final void handleViewListing(SavedCartListing savedCartListing) {
        SavedCartClickHandler savedCartClickHandler = this.clickListener;
        if (savedCartClickHandler != null) {
            savedCartClickHandler.mo31335g(savedCartListing);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void bind(SavedCart savedCart) {
        SavedCartListing cartListing = savedCart != null ? savedCart.getCartListing() : null;
        if (cartListing != null) {
            C9163b1 b1Var = new C9163b1(savedCart, cartListing);
            String str = b1Var.f20154c;
            ViewExtensions.m12870n(this.cartLoadingView, new SavedCartListingView$bind$1(b1Var));
            bindShop(b1Var);
            bindListing(b1Var);
            boolean z = b1Var.f20156e;
            ViewExtensions.m12870n(this.unavailableMessageBubble, new SavedCartListingView$bind$2(z));
            String string = getResources().getString(R.string.cart_listing_item_view_listing_desc, new Object[]{str});
            C19383o.m32796f(string, "resources.getString(R.st…view_listing_desc, title)");
            String string2 = getResources().getString(R.string.cart_listing_item_move_to_cart_desc, new Object[]{str});
            C19383o.m32796f(string2, "resources.getString(R.st…move_to_cart_desc, title)");
            String string3 = getResources().getString(R.string.cart_listing_item_remove_desc, new Object[]{str});
            C19383o.m32796f(string3, "resources.getString(R.st…_item_remove_desc, title)");
            String string4 = getResources().getString(R.string.cart_listing_item_move_to_favorites_desc, new Object[]{str});
            C19383o.m32796f(string4, "resources.getString(R.st…to_favorites_desc, title)");
            C13041g gVar = new C13041g(string, new C9154d(this, savedCart));
            C13039e eVar = new C13039e(string2, new C9151a(this, savedCart));
            C13044i iVar = new C13044i(string3, new C9153c(this, savedCart));
            C13100a.m20770a(this.listingTitle, gVar, eVar, new C13040f(string4, new C9152b(this, savedCart)), iVar);
            ViewExtensions.m12870n(this.btnMoveToCart, new SavedCartListingView$bind$3(z));
            this.btnMoveToCart.setContentDescription(string2);
            this.btnMoveToCart.setOnClickListener(new SavedCartListingView$bind$4(this, savedCart, new C8698l[]{savedCart, cartListing}));
            this.btnRemove.setContentDescription(string3);
            this.btnRemove.setOnClickListener(new SavedCartListingView$bind$5(this, savedCart, new C8698l[]{savedCart, cartListing}));
            this.btnMoveToFavorites.setContentDescription(string4);
            this.btnMoveToFavorites.setOnClickListener(new SavedCartListingView$bind$6(this, savedCart, new C8698l[]{savedCart, cartListing}));
        }
    }

    public final C19846a<Integer> getAdapterPositionCallback() {
        C19846a<Integer> aVar = this.adapterPositionCallback;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("adapterPositionCallback");
        throw null;
    }

    public final SavedCartClickHandler getClickListener() {
        return this.clickListener;
    }

    public final void setAdapterPositionCallback(C19846a<Integer> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.adapterPositionCallback = aVar;
    }

    public final void setClickListener(SavedCartClickHandler savedCartClickHandler) {
        this.clickListener = savedCartClickHandler;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SavedCartListingView(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavedCartListingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SavedCartListingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SavedCartListingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
