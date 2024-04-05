package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class FindsCard extends BaseModel {
    public static final int $stable = 8;
    private String contentSource = "";
    private EtsyId findsPageId = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
    private int findsViewType = R.id.view_type_finds_card;
    private List<ListingImage> images = new ArrayList(0);
    private boolean isPublic;
    private String language;
    private ListingImage listingImage;
    private String slug;
    private String title;
    private String url;

    public final String getContentSource() {
        return this.contentSource;
    }

    public final EtsyId getFindsPageId() {
        return this.findsPageId;
    }

    public final List<ListingImage> getImages() {
        return this.images;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final ListingImage getListingImage() {
        return this.listingImage;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int getViewType() {
        return this.findsViewType;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        C19383o.m32797g(jsonParser, "jp");
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                C19383o.m32796f(currentName, "fieldName");
                if (parseField(jsonParser, currentName)) {
                }
            }
            jsonParser.skipChildren();
        }
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", ResponseConstants.FINDS_PAGE_ID, str)) {
            this.findsPageId.setIdKt(BaseModel.Companion.parseString(jsonParser));
            return true;
        } else if (C19383o.m32792b("slug", str)) {
            this.slug = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (C19383o.m32792b("url", str)) {
            this.url = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (C19383o.m32792b("title", str)) {
            this.title = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (C19383o.m32792b("language", str)) {
            this.language = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (C19383o.m32792b(ResponseConstants.IMG, str)) {
            this.listingImage = (ListingImage) BaseModel.Companion.parseObject(jsonParser, ListingImage.class);
            return true;
        } else if (C19383o.m32792b("images", str)) {
            List<ListingImage> parseArray = BaseModel.Companion.parseArray(jsonParser, ListingImage.class);
            if (parseArray == null) {
                return true;
            }
            this.images.add(parseArray.get(0));
            return true;
        } else if (C19383o.m32792b(ResponseConstants.IS_PUBLIC, str)) {
            this.isPublic = jsonParser.getValueAsBoolean();
            return true;
        } else if (!C19383o.m32792b(ResponseConstants.CONTENT_SOURCE, str)) {
            return false;
        } else {
            this.contentSource = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public void setViewType(int i) {
        this.findsViewType = i;
    }
}
