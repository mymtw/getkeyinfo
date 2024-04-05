package com.etsy.android.lib.models.finds;

import android.text.TextUtils;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p415of.C13186o;

public class FindsTwoTitledListingsModule extends FindsModule {

    public static class Footer extends FindsModule {
        public String mBottomText;
        public String mUrl;

        public boolean canDisplay() {
            return !TextUtils.isEmpty(this.mBottomText) && this.mUrl != null;
        }

        public String getBottomText() {
            return this.mBottomText;
        }

        public String getUrl() {
            return this.mUrl;
        }

        public int getViewType() {
            return R.id.view_type_finds_two_titled_footer;
        }
    }

    public static class Header extends FindsHeadingModule {
        public int getViewType() {
            return R.id.view_type_finds_two_titled_heading;
        }
    }

    public static class Listing extends ListingCard {
        public int getViewType() {
            return R.id.view_type_finds_two_titled_listing;
        }
    }

    public static class Section extends BaseFieldModel {
        private static String FIELD_BOTTOM_TEXT = "bottom_text";
        private static String FIELD_LISTINGS = "listings";
        private static String FIELD_TITLE = "title";
        private static String FIELD_TITLE_LINK = "title_link";
        private static String FIELD_URL = "url";
        public Footer mFooter = new Footer();
        public Header mHeader = new Header();
        public List<Listing> mListings;

        public boolean parseField(JsonParser jsonParser, String str) throws IOException {
            if (FIELD_TITLE.equals(str)) {
                this.mHeader.mText = BaseModel.parseString(jsonParser);
                return true;
            } else if (FIELD_LISTINGS.equals(str)) {
                this.mListings = BaseModel.parseArray(jsonParser, Listing.class);
                return true;
            } else if (FIELD_BOTTOM_TEXT.equals(str)) {
                this.mFooter.mBottomText = BaseModel.parseString(jsonParser);
                return true;
            } else if (!FIELD_URL.equals(str)) {
                return false;
            } else {
                this.mFooter.mUrl = BaseModel.parseStringURL(jsonParser);
                return true;
            }
        }
    }

    public List<? extends C13186o> getCardViewElements() {
        ArrayList arrayList = new ArrayList();
        for (Section next : this.mSections) {
            arrayList.add(next.mHeader);
            arrayList.addAll(next.mListings);
            arrayList.add(next.mFooter);
        }
        return arrayList;
    }

    public void setFromGeneric(FindsModule findsModule) {
        super.setFromGeneric(findsModule);
        this.mSections = findsModule.mSections;
    }
}
