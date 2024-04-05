package com.etsy.android.p327ui.favorites.createalist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListView */
public final class NameAListView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NameAListView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NameAListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }

    private final void setListImage(ListingImage listingImage) {
        ListingFullImageView listingFullImageView;
        if (listingImage != null) {
            ViewExtensions.m12869m((ListingFullImageView) _$_findCachedViewById(R.id.favorites_list_image));
            listingFullImageView = (ListingFullImageView) _$_findCachedViewById(R.id.favorites_list_image);
            listingFullImageView.setUseStandardRatio(true);
            listingFullImageView.setImageInfo(listingImage);
        } else {
            listingFullImageView = null;
        }
        if (listingFullImageView == null) {
            ViewExtensions.m12860d((ListingFullImageView) _$_findCachedViewById(R.id.favorites_list_image));
        }
    }

    private final void setPlaceholderImageVisibility(int i) {
        ((ImageView) _$_findCachedViewById(R.id.favorites_list_placeholder_image)).setVisibility(i);
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

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            C15588c1.m25340p0(this);
        }
    }

    public final void setViewState(C9832r rVar) {
        C19383o.m32797g(rVar, "viewState");
        C9826o oVar = rVar.f21731a;
        setListImage(oVar != null ? oVar.f21723a : null);
        setPlaceholderImageVisibility(rVar.f21732b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NameAListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
