package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListReminder;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.stylekit.views.C9061l;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p435rb.C13351b;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.n0 */
public final class C9200n0 extends C12086e<ListReminder> {

    /* renamed from: d */
    public static final /* synthetic */ int f20305d = 0;

    /* renamed from: c */
    public final C9194l0 f20306c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9200n0(C9194l0 l0Var, C8703p pVar, ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_card_view_list_reminder, false));
        C19383o.m32797g(l0Var, "clickHandler");
        C19383o.m32797g(pVar, "tracker");
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        this.f20306c = l0Var;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ListReminder listReminder = (ListReminder) obj;
        if (listReminder != null) {
            View view = this.itemView;
            ImageView imageView = (ImageView) view.findViewById(R.id.img_item_1);
            C19383o.m32796f(imageView, "img_item_1");
            ImageView imageView2 = (ImageView) view.findViewById(R.id.img_item_2);
            C19383o.m32796f(imageView2, "img_item_2");
            ImageView imageView3 = (ImageView) view.findViewById(R.id.img_item_3);
            C19383o.m32796f(imageView3, "img_item_3");
            ImageView imageView4 = (ImageView) view.findViewById(R.id.img_item_4);
            C19383o.m32796f(imageView4, "img_item_4");
            List e0 = C17782b.m29865e0(imageView, imageView2, imageView3, imageView4);
            for (int i = 0; i < 4; i++) {
                ListingCard listingCard = (ListingCard) C19327t.m32641W0(i, listReminder.getListings());
                ListingImage listingImage = listingCard != null ? listingCard.getListingImage() : null;
                if (listingImage != null) {
                    String str = listingImage.get4to3ImageUrlForPixelWidth(((ImageView) e0.get(i)).getWidth());
                    ImageView imageView5 = (ImageView) e0.get(i);
                    int imageColor = listingImage.getImageColor();
                    if (!(str == null || imageView5 == null)) {
                        imageView5.setBackground((Drawable) null);
                        C0114h.m270B0(this.itemView.getContext()).load(str).mo17160t(new ColorDrawable(imageColor)).mo16816M(imageView5);
                    }
                }
            }
            ((TextView) this.itemView.findViewById(R.id.list_name)).setText(listReminder.getName());
            ((TextView) this.itemView.findViewById(R.id.collection_subtitle)).setText(this.itemView.getResources().getQuantityString(R.plurals.item_lowercase_quantity, listReminder.getCount(), new Object[]{C8885d0.m17318b((double) listReminder.getCount())}));
            ((TextView) this.itemView.findViewById(R.id.collection_subtitle)).setContentDescription(this.itemView.getContext().getString(listReminder.getPrivacyLevel().getLabel()) + ' ' + ((TextView) this.itemView.findViewById(R.id.collection_subtitle)).getText());
            Context context = this.itemView.getContext();
            int icon = listReminder.getPrivacyLevel().getIcon();
            Object obj2 = C8184a.f17966a;
            Drawable b = C8184a.C8187c.m16466b(context, icon);
            if (b != null) {
                b.setBounds(0, 0, this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller));
            }
            TextView textView = (TextView) this.itemView.findViewById(R.id.collection_subtitle);
            C19383o.m32796f(textView, "itemView.collection_subtitle");
            C13351b.m21020d(textView, b, (Drawable) null, 14);
            this.itemView.setOnClickListener(new C9061l(1, this, listReminder));
        }
    }
}
