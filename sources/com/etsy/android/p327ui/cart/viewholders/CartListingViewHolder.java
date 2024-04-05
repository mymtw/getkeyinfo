package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.CartPersonalization;
import com.etsy.android.lib.models.Nudge;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartListing;
import com.etsy.android.lib.models.apiv3.cart.CartVariation;
import com.etsy.android.lib.models.apiv3.cart.Promotion;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.cart.PromotionCountdownTimer;
import com.etsy.android.p327ui.cart.clicklisteners.C9283h;
import com.etsy.android.stylekit.views.CollageContentToggleShort;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p396mb.C13044i;
import p396mb.C13045j;
import p404nb.C13100a;
import p435rb.C13350a;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartListingViewHolder */
public final class CartListingViewHolder extends C9370c {

    /* renamed from: A */
    public final TextView f20699A;

    /* renamed from: B */
    public final TextView f20700B;

    /* renamed from: C */
    public final CollageContentToggleShort f20701C;

    /* renamed from: D */
    public PromotionCountdownTimer f20702D;

    /* renamed from: c */
    public final C9283h f20703c;

    /* renamed from: d */
    public final C8672b f20704d;

    /* renamed from: e */
    public final boolean f20705e;

    /* renamed from: f */
    public final ViewGroup f20706f;

    /* renamed from: g */
    public final View f20707g = mo38986f(R.id.disabled_overlay);

    /* renamed from: h */
    public final CollageHeadingTextView f20708h;

    /* renamed from: i */
    public final ListingFullImageView f20709i;

    /* renamed from: j */
    public final TextView f20710j;

    /* renamed from: k */
    public final TextView f20711k;

    /* renamed from: l */
    public final TextView f20712l;

    /* renamed from: m */
    public final ViewGroup f20713m;

    /* renamed from: n */
    public final View f20714n;

    /* renamed from: o */
    public final View f20715o;

    /* renamed from: p */
    public final TextView f20716p;

    /* renamed from: q */
    public final TextView f20717q;

    /* renamed from: r */
    public final TextView f20718r;

    /* renamed from: s */
    public final TextView f20719s;

    /* renamed from: t */
    public final ViewGroup f20720t;

    /* renamed from: u */
    public final TextView f20721u;

    /* renamed from: v */
    public final View f20722v;

    /* renamed from: w */
    public final Button f20723w;

    /* renamed from: x */
    public final Button f20724x;

    /* renamed from: y */
    public final Button f20725y;

    /* renamed from: z */
    public final TextView f20726z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CartListingViewHolder(android.view.ViewGroup r18, com.etsy.android.p327ui.cart.clicklisteners.C9283h r19, com.etsy.android.lib.logger.C8703p r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.String r3 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            java.lang.String r3 = "analyticsTracker"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            android.content.Context r3 = r18.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624393(0x7f0e01c9, float:1.8875964E38)
            r5 = 0
            android.view.View r1 = r3.inflate(r4, r1, r5)
            r0.<init>(r1)
            r1 = r19
            r0.f20703c = r1
            r0.f20704d = r2
            r1 = r21
            r0.f20705e = r1
            r1 = 2131428033(0x7f0b02c1, float:1.84777E38)
            android.view.View r1 = r0.mo38986f(r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.C19383o.m32795e(r1, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.f20706f = r1
            r1 = 2131428187(0x7f0b035b, float:1.8478011E38)
            android.view.View r1 = r0.mo38986f(r1)
            r0.f20707g = r1
            r1 = 2131430247(0x7f0b0b67, float:1.848219E38)
            android.view.View r1 = r0.mo38986f(r1)
            java.lang.String r3 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageHeadingTextView"
            kotlin.jvm.internal.C19383o.m32795e(r1, r3)
            com.etsy.android.stylekit.views.CollageHeadingTextView r1 = (com.etsy.android.stylekit.views.CollageHeadingTextView) r1
            r0.f20708h = r1
            r3 = 2131428672(0x7f0b0540, float:1.8478995E38)
            android.view.View r3 = r0.mo38986f(r3)
            java.lang.String r4 = "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingFullImageView"
            kotlin.jvm.internal.C19383o.m32795e(r3, r4)
            com.etsy.android.uikit.view.ListingFullImageView r3 = (com.etsy.android.uikit.view.ListingFullImageView) r3
            r0.f20709i = r3
            r4 = 2131430295(0x7f0b0b97, float:1.8482287E38)
            android.view.View r4 = r0.mo38986f(r4)
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.TextView"
            kotlin.jvm.internal.C19383o.m32795e(r4, r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f20710j = r4
            r7 = 2131430260(0x7f0b0b74, float:1.8482216E38)
            android.view.View r7 = r0.mo38986f(r7)
            kotlin.jvm.internal.C19383o.m32795e(r7, r6)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r8 = r7.getPaintFlags()
            r9 = 16
            r8 = r8 | r9
            r7.setPaintFlags(r8)
            r0.f20711k = r7
            r8 = 2131430296(0x7f0b0b98, float:1.8482289E38)
            android.view.View r8 = r0.mo38986f(r8)
            kotlin.jvm.internal.C19383o.m32795e(r8, r6)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0.f20712l = r8
            r10 = 2131430366(0x7f0b0bde, float:1.848243E38)
            android.view.View r10 = r0.mo38986f(r10)
            kotlin.jvm.internal.C19383o.m32795e(r10, r2)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0.f20713m = r10
            r10 = 2131430360(0x7f0b0bd8, float:1.8482419E38)
            android.view.View r10 = r0.mo38986f(r10)
            java.lang.String r11 = "findViewById(R.id.variation1_row)"
            kotlin.jvm.internal.C19383o.m32796f(r10, r11)
            r0.f20714n = r10
            r10 = 2131430362(0x7f0b0bda, float:1.8482423E38)
            android.view.View r10 = r0.mo38986f(r10)
            java.lang.String r11 = "findViewById(R.id.variation2_row)"
            kotlin.jvm.internal.C19383o.m32796f(r10, r11)
            r0.f20715o = r10
            r10 = 2131430299(0x7f0b0b9b, float:1.8482295E38)
            android.view.View r10 = r0.mo38986f(r10)
            kotlin.jvm.internal.C19383o.m32795e(r10, r6)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0.f20716p = r10
            r11 = 2131430298(0x7f0b0b9a, float:1.8482293E38)
            android.view.View r11 = r0.mo38986f(r11)
            kotlin.jvm.internal.C19383o.m32795e(r11, r6)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0.f20717q = r11
            r12 = 2131430301(0x7f0b0b9d, float:1.84823E38)
            android.view.View r12 = r0.mo38986f(r12)
            kotlin.jvm.internal.C19383o.m32795e(r12, r6)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0.f20718r = r12
            r13 = 2131430300(0x7f0b0b9c, float:1.8482297E38)
            android.view.View r13 = r0.mo38986f(r13)
            kotlin.jvm.internal.C19383o.m32795e(r13, r6)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0.f20719s = r13
            r14 = 2131428160(0x7f0b0340, float:1.8477957E38)
            android.view.View r14 = r0.mo38986f(r14)
            kotlin.jvm.internal.C19383o.m32795e(r14, r2)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r0.f20720t = r14
            r2 = 2131430246(0x7f0b0b66, float:1.8482188E38)
            android.view.View r2 = r0.mo38986f(r2)
            kotlin.jvm.internal.C19383o.m32795e(r2, r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f20721u = r2
            r14 = 2131428161(0x7f0b0341, float:1.8477959E38)
            android.view.View r14 = r0.mo38986f(r14)
            java.lang.String r15 = "findViewById(R.id.description_spacer)"
            kotlin.jvm.internal.C19383o.m32796f(r14, r15)
            r0.f20722v = r14
            r14 = 2131430265(0x7f0b0b79, float:1.8482226E38)
            android.view.View r14 = r0.mo38986f(r14)
            java.lang.String r15 = "null cannot be cast to non-null type android.widget.Button"
            kotlin.jvm.internal.C19383o.m32795e(r14, r15)
            android.widget.Button r14 = (android.widget.Button) r14
            r0.f20723w = r14
            r5 = 2131427609(0x7f0b0119, float:1.847684E38)
            android.view.View r5 = r0.mo38986f(r5)
            kotlin.jvm.internal.C19383o.m32795e(r5, r15)
            android.widget.Button r5 = (android.widget.Button) r5
            r0.f20724x = r5
            r9 = 2131427605(0x7f0b0115, float:1.847683E38)
            android.view.View r9 = r0.mo38986f(r9)
            kotlin.jvm.internal.C19383o.m32795e(r9, r15)
            android.widget.Button r9 = (android.widget.Button) r9
            r0.f20725y = r9
            r15 = 2131430230(0x7f0b0b56, float:1.8482155E38)
            android.view.View r15 = r0.mo38986f(r15)
            kotlin.jvm.internal.C19383o.m32795e(r15, r6)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0.f20726z = r15
            r19 = r3
            r3 = 2131430233(0x7f0b0b59, float:1.8482161E38)
            android.view.View r3 = r0.mo38986f(r3)
            kotlin.jvm.internal.C19383o.m32795e(r3, r6)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f20699A = r3
            r20 = r5
            r5 = 2131430254(0x7f0b0b6e, float:1.8482204E38)
            android.view.View r5 = r0.mo38986f(r5)
            kotlin.jvm.internal.C19383o.m32795e(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f20700B = r5
            r6 = 2131430256(0x7f0b0b70, float:1.8482208E38)
            android.view.View r6 = r0.mo38986f(r6)
            r21 = r9
            java.lang.String r9 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggleShort"
            kotlin.jvm.internal.C19383o.m32795e(r6, r9)
            com.etsy.android.stylekit.views.CollageContentToggleShort r6 = (com.etsy.android.stylekit.views.CollageContentToggleShort) r6
            r0.f20701C = r6
            com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames r9 = com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames.BUTTON
            com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt.m17423b(r1, r9)
            android.view.View r9 = r0.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C19383o.m32796f(r9, r0)
            r0 = 16
            int[] r0 = new int[r0]
            int r1 = r1.getId()
            r16 = 0
            r0[r16] = r1
            int r1 = r2.getId()
            r2 = 1
            r0[r2] = r1
            int r1 = r5.getId()
            r2 = 2
            r0[r2] = r1
            int r1 = r3.getId()
            r2 = 3
            r0[r2] = r1
            int r1 = r4.getId()
            r2 = 4
            r0[r2] = r1
            int r1 = r7.getId()
            r2 = 5
            r0[r2] = r1
            int r1 = r8.getId()
            r2 = 6
            r0[r2] = r1
            int r1 = r15.getId()
            r2 = 7
            r0[r2] = r1
            int r1 = r10.getId()
            r2 = 8
            r0[r2] = r1
            int r1 = r11.getId()
            r2 = 9
            r0[r2] = r1
            int r1 = r12.getId()
            r2 = 10
            r0[r2] = r1
            int r1 = r13.getId()
            r2 = 11
            r0[r2] = r1
            int r1 = r6.getId()
            r2 = 12
            r0[r2] = r1
            int r1 = r14.getId()
            r2 = 13
            r0[r2] = r1
            int r1 = r21.getId()
            r2 = 14
            r0[r2] = r1
            int r1 = r20.getId()
            r2 = 15
            r0[r2] = r1
            com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt.m17421b(r9, r0)
            r0 = r17
            android.view.View r1 = r0.itemView
            r2 = 0
            r1.setOnClickListener(r2)
            com.etsy.android.uikit.view.c$a r1 = new com.etsy.android.uikit.view.c$a
            android.view.View r2 = r0.itemView
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165331(0x7f070093, float:1.7944876E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            r1.<init>(r2)
            r3 = r19
            r3.setImageViewTransformation(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.viewholders.CartListingViewHolder.<init>(android.view.ViewGroup, com.etsy.android.ui.cart.clicklisteners.h, com.etsy.android.lib.logger.p, boolean):void");
    }

    /* renamed from: i */
    public static String m17730i(String str) {
        if (str == null) {
            return null;
        }
        String obj = C19459m.m33035H1(str).toString();
        return !C19457k.m33018V0(obj, MessageDraft.IMAGE_DELIMITER) ? C0326j.m864i(obj, MessageDraft.IMAGE_DELIMITER) : obj;
    }

    /* renamed from: j */
    public static void m17731j(ViewGroup viewGroup, C19857l lVar) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                C19383o.m32796f(childAt, "getChildAt(index)");
                lVar.invoke(childAt);
                if (childAt instanceof ViewGroup) {
                    m17731j((ViewGroup) childAt, lVar);
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        PromotionCountdownTimer promotionCountdownTimer = this.f20702D;
        if (promotionCountdownTimer != null) {
            promotionCountdownTimer.cancel();
        }
        this.f20702D = null;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        boolean z;
        boolean z2;
        boolean z3;
        String personalizationValue;
        String personalizationTitle;
        C19383o.m32797g(cartGroupItem, "item");
        CartListing cartListing = (CartListing) cartGroupItem.getData();
        if (cartListing == null) {
            ViewExtensions.m12860d(this.itemView);
            return;
        }
        ViewExtensions.m12869m(this.itemView);
        this.f20708h.setText(cartListing.getTitle());
        if (this.f20703c != null) {
            ViewExtensions.m12866j(this.f20708h, new CartListingViewHolder$bindTitle$1(this, cartListing));
        }
        ListingImage listingImage = cartListing.getListingImage();
        if (listingImage != null) {
            ViewExtensions.m12869m(this.f20709i);
            this.f20709i.setImageInfo(listingImage);
            this.f20709i.setContentDescription(cartListing.getTitle());
            if (this.f20703c != null) {
                this.f20709i.setOnClickListener(new CartListingViewHolder$bindImage$1(this, cartListing));
            }
        } else {
            ViewExtensions.m12860d(this.f20709i);
        }
        ViewExtensions.m12869m(this.f20710j);
        TextView textView = this.f20710j;
        textView.setText(cartListing.getTotalPriceString());
        boolean z4 = true;
        int i = 0;
        textView.setContentDescription(this.itemView.getContext().getString(R.string.new_price, new Object[]{cartListing.getTotalPriceString()}));
        Promotion promotion = cartListing.getPromotion();
        int i2 = C18263b.m30839d0(promotion != null ? promotion.getDescription() : null) ? R.attr.clg_color_text_urgency : R.attr.clg_color_text_primary;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        this.f20710j.setTextColor(C13350a.m21013d(context, i2));
        if (C18263b.m30839d0(cartListing.getUnitPriceString())) {
            this.f20712l.setText(cartListing.getUnitPriceString());
            ViewExtensions.m12869m(this.f20712l);
        } else {
            this.f20712l.setText("");
            ViewExtensions.m12860d(this.f20712l);
        }
        String complianceDescription = cartListing.getComplianceDescription();
        if (C18263b.m30839d0(complianceDescription)) {
            ViewExtensions.m12869m(this.f20721u);
            this.f20721u.setText(complianceDescription);
        } else {
            this.f20721u.setText("");
            ViewExtensions.m12860d(this.f20721u);
        }
        ViewExtensions.m12860d(this.f20700B);
        Nudge nudge = cartListing.getNudge();
        String displayText = nudge != null ? nudge.getDisplayText() : null;
        if (displayText == null) {
            displayText = "";
        }
        if (C18263b.m30839d0(displayText)) {
            this.f20700B.setText(displayText);
            ViewExtensions.m12869m(this.f20700B);
            this.f20700B.setFocusableInTouchMode(true);
            this.f20700B.setImportantForAccessibility(1);
            z = true;
        } else {
            this.f20700B.setText("");
            ViewExtensions.m12860d(this.f20700B);
            z = false;
        }
        Promotion promotion2 = cartListing.getPromotion();
        if (promotion2 == null || promotion2.getPrice() == null) {
            this.f20711k.setText("");
            ViewExtensions.m12860d(this.f20711k);
        } else {
            ViewExtensions.m12869m(this.f20711k);
            TextView textView2 = this.f20711k;
            textView2.setText(String.valueOf(promotion2.getPrice()));
            textView2.setContentDescription(this.itemView.getContext().getString(R.string.old_price, new Object[]{String.valueOf(promotion2.getPrice())}));
            TextView textView3 = this.f20710j;
            textView3.setContentDescription(textView3.getContext().getString(R.string.new_price, new Object[]{cartListing.getTotalPriceString()}) + ' ' + textView3.getContext().getString(R.string.parentheses, new Object[]{promotion2.getDescription()}));
            if (!z && promotion2.getSecondsUntilEnd() != null) {
                ViewExtensions.m12869m(this.f20700B);
                PromotionCountdownTimer promotionCountdownTimer = this.f20702D;
                if (promotionCountdownTimer != null) {
                    promotionCountdownTimer.cancel();
                }
                WeakReference weakReference = new WeakReference(this.f20700B);
                Integer secondsUntilEnd = promotion2.getSecondsUntilEnd();
                C19383o.m32794d(secondsUntilEnd);
                PromotionCountdownTimer promotionCountdownTimer2 = new PromotionCountdownTimer(weakReference, promotion2, (long) (secondsUntilEnd.intValue() * 1000), 1000);
                promotionCountdownTimer2.start();
                this.f20702D = promotionCountdownTimer2;
            }
        }
        if (cartListing.isCustomOrder()) {
            ViewExtensions.m12869m(this.f20726z);
        } else {
            ViewExtensions.m12860d(this.f20726z);
        }
        if (cartListing.isDigital()) {
            ViewExtensions.m12869m(this.f20699A);
        } else {
            ViewExtensions.m12860d(this.f20699A);
        }
        if (cartListing.hasVariations()) {
            List<CartVariation> variations = cartListing.getVariations();
            C19383o.m32796f(variations, ResponseConstants.VARIATIONS);
            CartVariation cartVariation = (CartVariation) C19327t.m32638T0(variations);
            String i3 = m17730i(cartVariation.getLabel());
            ViewExtensions.m12869m(this.f20714n);
            this.f20716p.setText(i3);
            this.f20716p.setContentDescription(this.itemView.getResources().getString(R.string.cart_listing_item_variation_desc, new Object[]{cartVariation.getLabel(), cartListing.getTitle()}));
            this.f20717q.setText(cartVariation.getDisplayValue());
            this.f20717q.setEnabled(true);
            this.f20717q.setBackground((Drawable) null);
            if (variations.size() > 1) {
                CartVariation cartVariation2 = variations.get(1);
                String i4 = m17730i(cartVariation2.getLabel());
                ViewExtensions.m12869m(this.f20715o);
                this.f20718r.setText(i4);
                this.f20718r.setContentDescription(this.itemView.getResources().getString(R.string.cart_listing_item_variation_desc, new Object[]{cartVariation2.getLabel(), cartListing.getTitle()}));
                this.f20719s.setText(cartVariation2.getDisplayValue());
                this.f20719s.setEnabled(true);
                this.f20719s.setBackground((Drawable) null);
            } else {
                ViewExtensions.m12860d(this.f20715o);
            }
        } else {
            ViewExtensions.m12860d(this.f20714n);
            ViewExtensions.m12860d(this.f20715o);
        }
        CartPersonalization personalization = cartListing.getPersonalization();
        String obj = (personalization == null || (personalizationTitle = personalization.getPersonalizationTitle()) == null) ? null : C19459m.m33035H1(personalizationTitle).toString();
        String obj2 = (personalization == null || (personalizationValue = personalization.getPersonalizationValue()) == null) ? null : C19459m.m33035H1(personalizationValue).toString();
        if (!C18263b.m30839d0(obj) || !C18263b.m30839d0(obj2)) {
            this.f20701C.setContentText((CharSequence) "");
            ViewExtensions.m12860d(this.f20701C);
        } else {
            String string = this.itemView.getResources().getString(R.string.cart_personalization_title_value, new Object[]{m17730i(obj), obj2});
            C19383o.m32796f(string, "itemView.resources.getSt… persoValue\n            )");
            ViewExtensions.m12869m(this.f20701C);
            this.f20701C.setContentText((CharSequence) string);
        }
        if (cartListing.getQuantity() <= 1 || cartListing.isSingleQuantity()) {
            this.f20723w.setText(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            this.f20723w.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f20723w.setBackground((Drawable) null);
            this.f20723w.setOnClickListener((View.OnClickListener) null);
        } else {
            this.f20723w.setText(String.valueOf(cartListing.getPurchaseQuantity()));
            this.f20723w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.clg_icon_core_directdown_v1, 0);
            this.f20723w.setBackgroundResource(R.drawable.clg_button_uncontained_small_bg);
            if (this.f20703c != null) {
                ViewExtensions.m12866j(this.f20723w, new CartListingViewHolder$bindQuantity$1(cartGroupItem, this, cartListing));
            }
        }
        if (this.f20703c != null) {
            String string2 = this.f20725y.getResources().getString(R.string.cart_listing_item_remove_desc, new Object[]{cartListing.getTitle()});
            C19383o.m32796f(string2, "btnRemove.resources.getS…sting.title\n            )");
            C13044i iVar = new C13044i(string2, new C9380h(cartGroupItem, this));
            this.f20725y.setContentDescription(string2);
            ViewExtensions.m12866j(this.f20725y, new CartListingViewHolder$bindButtons$1(cartGroupItem, this));
            String string3 = this.f20724x.getResources().getString(R.string.cart_listing_item_save_for_later_desc, new Object[]{cartListing.getTitle()});
            C19383o.m32796f(string3, "btnSaveForLater.resource…sting.title\n            )");
            C13045j jVar = new C13045j(string3, new C9386i(cartGroupItem, this));
            this.f20724x.setContentDescription(string3);
            ViewExtensions.m12866j(this.f20724x, new CartListingViewHolder$bindButtons$2(cartGroupItem, this));
            C13100a.m20770a(this.f20708h, jVar, iVar);
        }
        ViewGroup viewGroup = this.f20720t;
        int childCount = viewGroup.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                z2 = false;
                break;
            } else if (viewGroup.getChildAt(i5).getVisibility() == 0) {
                z2 = true;
                break;
            } else {
                i5++;
            }
        }
        ViewGroup viewGroup2 = this.f20713m;
        int childCount2 = viewGroup2.getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                z3 = false;
                break;
            } else if (viewGroup2.getChildAt(i6).getVisibility() == 0) {
                z3 = true;
                break;
            } else {
                i6++;
            }
        }
        if (!z2 || !z3) {
            z4 = false;
        }
        this.f20720t.setVisibility(z2 ? 0 : 8);
        this.f20713m.setVisibility(z3 ? 0 : 8);
        View view = this.f20722v;
        if (!z4) {
            i = 8;
        }
        view.setVisibility(i);
        m17731j(this.f20706f, new CartListingViewHolder$bindCartGroupItem$1(this));
        if (this.f20705e) {
            ViewExtensions.m12869m(this.f20707g);
        } else {
            ViewExtensions.m12860d(this.f20707g);
        }
    }
}
