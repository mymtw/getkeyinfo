package p407nf;

import androidx.viewpager.widget.ViewPager;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.uikit.viewholder.ListingCardImagesCoordinator;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import java.util.Map;

/* renamed from: nf.b */
public final class C13114b implements ViewPager.C3334i {

    /* renamed from: b */
    public final ListingCardImagesCoordinator f28834b;

    /* renamed from: c */
    public final C8672b f28835c;

    /* renamed from: d */
    public final ListingCardUiModel f28836d;

    /* renamed from: e */
    public int f28837e;

    public C13114b(ListingCardImagesCoordinator listingCardImagesCoordinator, C8672b bVar, ListingCardUiModel listingCardUiModel) {
        this.f28834b = listingCardImagesCoordinator;
        this.f28835c = bVar;
        this.f28836d = listingCardUiModel;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        String str;
        if (i > this.f28837e) {
            if (this.f28834b.mo38744a()) {
                this.f28835c.mo21333d("listing_card_fetch_additional_images", (Map<? extends AnalyticsProperty, Object>) null);
            }
            int listingImageCount = this.f28836d.getListingImageCount() - 1;
            if (!this.f28836d.getHasSwipedAllImages() && i == listingImageCount) {
                this.f28835c.mo21333d("listing_card_image_swiped_end", (Map<? extends AnalyticsProperty, Object>) null);
                this.f28836d.setHasSwipedAllImages(true);
            }
            str = "listing_card_image_swiped_forward";
        } else {
            str = "listing_card_image_swiped_backward";
        }
        this.f28835c.mo21333d(str, (Map<? extends AnalyticsProperty, Object>) null);
        this.f28837e = i;
    }
}
