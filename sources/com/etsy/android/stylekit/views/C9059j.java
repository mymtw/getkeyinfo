package com.etsy.android.stylekit.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.stylekit.views.ratings.CollageRatingButtons;
import com.etsy.android.uikit.view.ListingFullImageView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p415of.C13178g;
import p423pf.C13239i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.stylekit.views.j */
public final /* synthetic */ class C9059j implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19935b;

    /* renamed from: c */
    public final /* synthetic */ Object f19936c;

    public /* synthetic */ C9059j(Object obj, int i) {
        this.f19935b = i;
        this.f19936c = obj;
    }

    public final void onClick(View view) {
        Context requireContext;
        switch (this.f19935b) {
            case 0:
                CollagePlayerView.m34890onFinishInflate$lambda2((CollagePlayerView) this.f19936c, view);
                return;
            case 1:
                CollageRatingButtons.m34907_init_$lambda1((CollageRatingButtons) this.f19936c, view);
                return;
            case 2:
                ((ShopHomeFragment) this.f19936c).lambda$handleCoupon$3(view);
                return;
            default:
                C13178g gVar = (C13178g) this.f19936c;
                C19383o.m32797g(gVar, "this$0");
                C13239i iVar = gVar.f29005e;
                String shopName = gVar.f29003c.getGiftWrap().getShopName();
                String description = gVar.f29003c.getGiftWrap().getDescription();
                Image previewImage = gVar.f29003c.getGiftWrap().getPreviewImage();
                Context context = gVar.f29001a.getContext();
                C19394m mVar = null;
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_gift_wrap_details, (ViewGroup) null, false);
                C19383o.m32796f(inflate, "from(context)\n          …rap_details, null, false)");
                TextView textView = (TextView) inflate.findViewById(R.id.gift_wrap_description_title);
                ListingFullImageView listingFullImageView = (ListingFullImageView) inflate.findViewById(R.id.gift_wrap_photo);
                TextView textView2 = (TextView) inflate.findViewById(R.id.gift_wrap_description);
                if (C18263b.m30839d0(shopName)) {
                    ViewExtensions.m12869m(textView);
                    textView.setText(context.getString(R.string.listing_gift_wrap_dialog_title, new Object[]{shopName}));
                } else {
                    ViewExtensions.m12860d(textView);
                }
                if (C18263b.m30837c0(description)) {
                    ViewExtensions.m12869m(textView2);
                    textView2.setText(description);
                } else {
                    ViewExtensions.m12860d(textView2);
                }
                if (previewImage != null) {
                    ViewExtensions.m12869m(listingFullImageView);
                    listingFullImageView.setImageInfo(previewImage);
                    mVar = C19394m.f43287a;
                }
                if (mVar == null) {
                    ViewExtensions.m12860d(listingFullImageView);
                }
                listingFullImageView.setImageInfo(previewImage);
                iVar.getClass();
                Fragment a = iVar.mo45889a();
                if (a != null && (requireContext = a.requireContext()) != null) {
                    iVar.f28980b.mo21333d("open_gift_wrap_description", iVar.mo45938d());
                    C9056g gVar2 = new C9056g(requireContext);
                    gVar2.setView(inflate);
                    gVar2.create().show();
                    return;
                }
                return;
        }
    }
}
