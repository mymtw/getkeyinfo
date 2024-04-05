package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

public final class CollectionDetails extends BaseFieldModel {
    public static final int $stable = 8;
    private long creatorId;

    /* renamed from: id */
    private long f19138id;
    private String key = "";
    private List<? extends ListingCard> listings = EmptyList.INSTANCE;
    private int listingsCount;
    private String name = "";
    private Collection.PrivacyLevel privacyLevel = Collection.PrivacyLevel.PUBLIC;
    private String slug = "";
    private String type = "";
    private String url = "";

    public final long getCreatorId() {
        return this.creatorId;
    }

    public final long getId() {
        return this.f19138id;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<ListingCard> getListings() {
        return this.listings;
    }

    public final int getListingsCount() {
        return this.listingsCount;
    }

    public final String getName() {
        return this.name;
    }

    public final Collection.PrivacyLevel getPrivacyLevel() {
        return this.privacyLevel;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        String str2 = "";
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -821242276:
                if (!str.equals(ResponseConstants.COLLECTION_ID)) {
                    return false;
                }
                this.f19138id = jsonParser.getValueAsLong();
                return true;
            case 106079:
                if (!str.equals("key")) {
                    return false;
                }
                String parseString = BaseModel.Companion.parseString(jsonParser);
                if (parseString != null) {
                    str2 = parseString;
                }
                this.key = str2;
                return true;
            case 116079:
                if (!str.equals("url")) {
                    return false;
                }
                String parseStringURL = BaseModel.Companion.parseStringURL(jsonParser);
                if (parseStringURL != null) {
                    str2 = parseStringURL;
                }
                this.url = str2;
                return true;
            case 3373707:
                if (!str.equals("name")) {
                    return false;
                }
                String parseString2 = BaseModel.Companion.parseString(jsonParser);
                if (parseString2 != null) {
                    str2 = parseString2;
                }
                this.name = str2;
                return true;
            case 3533483:
                if (!str.equals("slug")) {
                    return false;
                }
                String parseString3 = BaseModel.Companion.parseString(jsonParser);
                if (parseString3 != null) {
                    str2 = parseString3;
                }
                this.slug = str2;
                return true;
            case 3575610:
                if (!str.equals("type")) {
                    return false;
                }
                String parseString4 = BaseModel.Companion.parseString(jsonParser);
                if (parseString4 != null) {
                    str2 = parseString4;
                }
                this.type = str2;
                return true;
            case 671972159:
                if (!str.equals(ResponseConstants.LISTINGS_COUNT)) {
                    return false;
                }
                this.listingsCount = jsonParser.getValueAsInt();
                return true;
            case 1346279023:
                if (!str.equals("listings")) {
                    return false;
                }
                this.listings = BaseModel.Companion.parseArray(jsonParser, ListingCard.class);
                return true;
            case 1379332622:
                if (!str.equals(ResponseConstants.CREATOR_ID)) {
                    return false;
                }
                this.creatorId = jsonParser.getValueAsLong();
                return true;
            case 1965579277:
                if (!str.equals(ResponseConstants.PRIVACY_LEVEL)) {
                    return false;
                }
                Collection.PrivacyLevel fromSlug = Collection.PrivacyLevel.fromSlug(BaseModel.Companion.parseString(jsonParser));
                C19383o.m32796f(fromSlug, "fromSlug(BaseModel.parseString(jp))");
                this.privacyLevel = fromSlug;
                return true;
            default:
                return false;
        }
    }

    public final void setCreatorId(long j) {
        this.creatorId = j;
    }

    public final void setId(long j) {
        this.f19138id = j;
    }

    public final void setKey(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.key = str;
    }

    public final void setListings(List<? extends ListingCard> list) {
        C19383o.m32797g(list, "<set-?>");
        this.listings = list;
    }

    public final void setListingsCount(int i) {
        this.listingsCount = i;
    }

    public final void setName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.name = str;
    }

    public final void setPrivacyLevel(Collection.PrivacyLevel privacyLevel2) {
        C19383o.m32797g(privacyLevel2, "<set-?>");
        this.privacyLevel = privacyLevel2;
    }

    public final void setSlug(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.slug = str;
    }

    public final void setType(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.type = str;
    }

    public final void setUrl(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.url = str;
    }
}
