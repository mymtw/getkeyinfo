package com.etsy.android.p327ui.user.inappnotifications;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.user.inappnotifications.IANShopUiModel;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANShopCardViewHolderBinder */
public final class IANShopCardViewHolderBinder {

    /* renamed from: com.etsy.android.ui.user.inappnotifications.IANShopCardViewHolderBinder$a */
    public /* synthetic */ class C11535a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25440a;

        static {
            int[] iArr = new int[IANShopUiModel.ShopCardType.values().length];
            iArr[IANShopUiModel.ShopCardType.SCROLLING_SHOP.ordinal()] = 1;
            iArr[IANShopUiModel.ShopCardType.CHIP_SHOP.ordinal()] = 2;
            f25440a = iArr;
        }
    }

    /* renamed from: b */
    public static void m19304b(View view, List list, IANShopUiModel.ShopCardType shopCardType) {
        int i;
        int i2 = C11535a.f25440a[shopCardType.ordinal()];
        if (i2 == 1) {
            i = 4;
        } else if (i2 == 2) {
            i = 3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = 0;
        while (i3 < i && i3 < list.size()) {
            ImageView imageView = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? null : (ImageView) view.findViewById(R.id.img_item_4) : (ImageView) view.findViewById(R.id.img_item_3) : (ImageView) view.findViewById(R.id.img_item_2) : (ImageView) view.findViewById(R.id.img_item_1);
            String str = (String) list.get(i3);
            if (imageView != null) {
                imageView.addOnLayoutChangeListener(new C11537xd6ea9b14(imageView, str));
            }
            i3++;
        }
    }

    /* renamed from: d */
    public static void m19305d(CollageButton collageButton, boolean z, String str) {
        int i;
        String str2;
        Resources resources = collageButton.getContext().getResources();
        if (z) {
            i = R.drawable.clg_icon_favorited;
        } else if (!z) {
            i = R.drawable.clg_icon_unfavorited;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            str2 = resources.getString(R.string.unfollow_shop_hint, new Object[]{str});
        } else if (!z) {
            str2 = resources.getString(R.string.follow_shop_hint, new Object[]{str});
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C19383o.m32796f(str2, "when (isFavorite) {\n    …hint, shopName)\n        }");
        collageButton.setContentDescription(str2);
        collageButton.setIconResource(i);
    }

    /* renamed from: e */
    public static void m19306e(View view, Float f, Integer num) {
        if (f == null || num == null) {
            ViewExtensions.m12863g((NumericRatingView) view.findViewById(R.id.shop_rating));
            return;
        }
        ViewExtensions.m12869m((NumericRatingView) view.findViewById(R.id.shop_rating));
        ((NumericRatingView) view.findViewById(R.id.shop_rating)).setRatingData(f.floatValue(), num.intValue(), NumericRatingView.ReviewCountDisplayType.COMPACT, NumericRatingView.ReviewCountColor.GRAY);
    }

    /* renamed from: a */
    public final void mo37431a(View view, IANShopUiModel iANShopUiModel, C11557j jVar) {
        int i = C11535a.f25440a[iANShopUiModel.f25447g.ordinal()];
        if (i == 1) {
            ViewExtensions.m12866j(view, new IANShopCardViewHolderBinder$bindScrollingShop$1(jVar));
            ((TextView) view.findViewById(R.id.shop_name)).setText(iANShopUiModel.f25441a);
            String str = iANShopUiModel.f25445e;
            if (str != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.shop_avatar);
                C19383o.m32796f(imageView, "shopView.shop_avatar");
                imageView.addOnLayoutChangeListener(new C11536xb0cb93d0(view, str));
            }
            m19306e(view, iANShopUiModel.f25442b, iANShopUiModel.f25443c);
            mo37432c(jVar, view, iANShopUiModel.f25441a, iANShopUiModel.f25444d);
            m19304b(view, iANShopUiModel.f25446f, iANShopUiModel.f25447g);
        } else if (i == 2) {
            ViewExtensions.m12866j(view, new IANShopCardViewHolderBinder$bindChipShop$1(jVar));
            ((TextView) view.findViewById(R.id.shop_name)).setText(iANShopUiModel.f25441a);
            m19306e(view, iANShopUiModel.f25442b, iANShopUiModel.f25443c);
            mo37432c(jVar, view, iANShopUiModel.f25441a, iANShopUiModel.f25444d);
            m19304b(view, iANShopUiModel.f25446f, iANShopUiModel.f25447g);
        }
    }

    /* renamed from: c */
    public final void mo37432c(C11557j jVar, View view, String str, boolean z) {
        CollageButton collageButton = (CollageButton) view.findViewById(R.id.shop_follow_button);
        C19383o.m32796f(collageButton, "this");
        m19305d(collageButton, z, str);
        ViewExtensions.m12866j(collageButton, new IANShopCardViewHolderBinder$bindFavorite$1$1(z, view, this, collageButton, str, jVar));
    }
}
