package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import java.util.List;

public interface ILink {
    Integer getBackgroundColor();

    List<ListingImage> getImages();

    String getLink();

    String getTitle();
}
