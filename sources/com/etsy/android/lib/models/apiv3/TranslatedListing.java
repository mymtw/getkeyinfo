package com.etsy.android.lib.models.apiv3;

import android.text.Html;
import com.etsy.android.lib.models.Listing;

public class TranslatedListing extends Listing {
    public String getDescription() {
        return String.valueOf(Html.fromHtml(this.mDescription));
    }

    public boolean isMachineTranslated() {
        return true;
    }
}
