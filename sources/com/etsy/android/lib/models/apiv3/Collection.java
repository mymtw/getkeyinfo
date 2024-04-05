package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collection extends BaseModel implements Comparable<Collection> {
    public static final String TYPE_COLLECTION = "collection";
    public static final String TYPE_FAVORITES = "favorites";
    private static final long serialVersionUID = -7526871588189118812L;
    public Long creatorId;
    public EtsyId mCollectionId;
    public User mCreator;
    public boolean mIsNew;
    public String mKey;
    public int mListingsCount;
    public String mName;
    public PrivacyLevel mPrivacyLevel;
    public List<Listing> mRepresentativeListings;
    public String mSlug;
    public String mType;
    public String mUrl;

    public enum PrivacyLevel {
        PRIVATE("private", R.string.collection_privacy_level_private, R.drawable.clg_icon_core_lock_v1),
        PUBLIC("public", R.string.collection_privacy_level_public, R.drawable.clg_icon_core_globeamericas_v1);
        
        private final int icon;
        private final int label;
        private final String slug;

        private PrivacyLevel(String str, int i, int i2) {
            this.slug = str;
            this.label = i;
            this.icon = i2;
        }

        public static PrivacyLevel fromSlug(String str) {
            PrivacyLevel privacyLevel = PRIVATE;
            return str.equals(privacyLevel.slug) ? privacyLevel : PUBLIC;
        }

        public int getIcon() {
            return this.icon;
        }

        public int getLabel() {
            return this.label;
        }

        public String getSlug() {
            return this.slug;
        }
    }

    public Collection() {
        this.mPrivacyLevel = PrivacyLevel.PUBLIC;
        this.mType = "";
        this.mName = "";
        this.mSlug = "";
        this.mKey = "";
        this.mUrl = "";
        this.mCreator = null;
        this.mIsNew = false;
        this.creatorId = 0L;
        this.mListingsCount = 0;
        this.mCollectionId = new EtsyId();
        this.mRepresentativeListings = new ArrayList(0);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Collection) && this.mKey.equals(((Collection) obj).getKey());
    }

    public EtsyId getCollectionId() {
        return this.mCollectionId;
    }

    public User getCreator() {
        return this.mCreator;
    }

    public Long getCreatorId() {
        User user = this.mCreator;
        return user != null ? Long.valueOf(user.getUserId().getIdAsLong()) : this.creatorId;
    }

    public boolean getIsNew() {
        return this.mIsNew;
    }

    public String getKey() {
        return this.mKey;
    }

    public int getListingsCount() {
        return this.mListingsCount;
    }

    public String getName() {
        return this.mName;
    }

    public PrivacyLevel getPrivacyLevel() {
        return this.mPrivacyLevel;
    }

    public List<Listing> getRepresentativeListings() {
        return this.mRepresentativeListings;
    }

    public String getSlug() {
        return this.mSlug;
    }

    public String getType() {
        return this.mType;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int getViewType() {
        return R.id.view_type_listing_collection;
    }

    public int hashCode() {
        return this.mKey.hashCode();
    }

    public boolean isPrivate() {
        return this.mPrivacyLevel == PrivacyLevel.PRIVATE;
    }

    public boolean isPublic() {
        return this.mPrivacyLevel == PrivacyLevel.PUBLIC;
    }

    public boolean isTypeCollection() {
        return TYPE_COLLECTION.equalsIgnoreCase(this.mType);
    }

    public boolean isTypeFavorites() {
        return TYPE_FAVORITES.equalsIgnoreCase(this.mType);
    }

    public void parseCollectionField(JsonParser jsonParser, String str) throws IOException {
        if ("id".equals(str) || ResponseConstants.COLLECTION_ID.equals(str)) {
            this.mCollectionId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if (ResponseConstants.PRIVACY_LEVEL.equals(str)) {
            this.mPrivacyLevel = PrivacyLevel.fromSlug(BaseModel.parseString(jsonParser));
        } else if ("type".equals(str)) {
            this.mType = BaseModel.parseString(jsonParser);
        } else if ("name".equals(str)) {
            this.mName = BaseModel.parseString(jsonParser);
        } else if ("slug".equals(str)) {
            this.mSlug = BaseModel.parseString(jsonParser);
        } else if ("key".equals(str)) {
            this.mKey = BaseModel.parseString(jsonParser);
        } else if ("url".equals(str)) {
            this.mUrl = BaseModel.parseStringURL(jsonParser);
        } else if (ResponseConstants.LISTINGS_COUNT.equals(str)) {
            this.mListingsCount = jsonParser.getValueAsInt();
        } else if ("representative_listings".equals(str)) {
            this.mRepresentativeListings = BaseModel.parseArray(jsonParser, Listing.class);
        } else if ("creator".equals(str)) {
            this.mCreator = (User) BaseModel.parseObject(jsonParser, User.class);
        } else {
            C8694h.f19097a.mo21306a(String.format("Field %s not found on Collection Model", new Object[]{str}));
            jsonParser.skipChildren();
        }
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                parseCollectionField(jsonParser, currentName);
            }
        }
    }

    public void setIsNew(boolean z) {
        this.mIsNew = z;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setListingsCount(int i) {
        this.mListingsCount = i;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setPrivacy(PrivacyLevel privacyLevel) {
        this.mPrivacyLevel = privacyLevel;
    }

    public void setRepresentativeListings(List<Listing> list) {
        this.mRepresentativeListings = list;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void update(Collection collection) {
        update(collection, false);
    }

    public int compareTo(Collection collection) {
        if (this == collection) {
            return 0;
        }
        User user = this.mCreator;
        if (user == null && collection.mCreator != null) {
            return -1;
        }
        if (user != null && collection.mCreator == null) {
            return 1;
        }
        if (user == null || collection.mCreator == null || user.getUserId().equals(collection.getCreator().getUserId())) {
            return this.mCollectionId.getId().compareTo(collection.getCollectionId().getId());
        }
        return this.mCreator.getUserId().getId().compareTo(collection.getCreator().getUserId().getId());
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.COLLECTION_KEY, this.mKey);
        return hashMap;
    }

    public void update(Collection collection, boolean z) {
        this.mName = collection.mName;
        this.mPrivacyLevel = collection.mPrivacyLevel;
        this.mUrl = collection.mUrl;
        this.mSlug = collection.mSlug;
        if (z) {
            this.mListingsCount = collection.mListingsCount;
        }
    }

    public void update(CollectionDetails collectionDetails) {
        this.mCollectionId = new EtsyId(collectionDetails.getId());
        this.mPrivacyLevel = collectionDetails.getPrivacyLevel();
        this.mType = collectionDetails.getType();
        this.mName = collectionDetails.getName();
        this.mSlug = collectionDetails.getSlug();
        this.mKey = collectionDetails.getKey();
        this.mUrl = collectionDetails.getUrl();
        this.mListingsCount = collectionDetails.getListingsCount();
        this.creatorId = Long.valueOf(collectionDetails.getCreatorId());
    }

    public Collection(Collection collection) {
        this.mPrivacyLevel = PrivacyLevel.PUBLIC;
        this.mType = "";
        this.mName = "";
        this.mSlug = "";
        this.mKey = "";
        this.mUrl = "";
        this.mCreator = null;
        this.mIsNew = false;
        this.creatorId = 0L;
        this.mListingsCount = 0;
        this.mCollectionId = collection.getCollectionId();
        this.mPrivacyLevel = collection.mPrivacyLevel;
        this.mType = collection.mType;
        this.mName = collection.mName;
        this.mSlug = collection.mSlug;
        this.mKey = collection.mKey;
        this.mUrl = collection.mUrl;
        this.mCreator = collection.mCreator;
        this.mIsNew = collection.mIsNew;
        this.mListingsCount = collection.mListingsCount;
        this.mRepresentativeListings = collection.mRepresentativeListings;
    }

    public Collection(CollectionV3 collectionV3) {
        this.mPrivacyLevel = PrivacyLevel.PUBLIC;
        this.mType = "";
        this.mName = "";
        this.mSlug = "";
        this.mKey = "";
        this.mUrl = "";
        this.mCreator = null;
        this.mIsNew = false;
        this.creatorId = 0L;
        this.mListingsCount = 0;
        this.mCollectionId = new EtsyId(collectionV3.getCollectionId());
        this.mPrivacyLevel = collectionV3.getPrivacyLevel();
        this.mType = collectionV3.getType();
        this.mName = collectionV3.getName();
        this.mSlug = collectionV3.getSlug();
        this.mKey = collectionV3.getKey();
        this.mUrl = collectionV3.getUrl();
        this.mListingsCount = collectionV3.getListingsCount();
        this.mCreator = new User();
        if (collectionV3.getCreator().getUserId() != null) {
            this.mCreator.setUserId(new EtsyId(collectionV3.getCreator().getUserId().longValue()));
        }
        if (collectionV3.getRepresentativeListings() != null) {
            this.mRepresentativeListings = collectionV3.getRepresentativeListings();
        }
    }

    public Collection(CollectionDetails collectionDetails) {
        this.mPrivacyLevel = PrivacyLevel.PUBLIC;
        this.mType = "";
        this.mName = "";
        this.mSlug = "";
        this.mKey = "";
        this.mUrl = "";
        this.mCreator = null;
        this.mIsNew = false;
        this.creatorId = 0L;
        this.mListingsCount = 0;
        update(collectionDetails);
    }
}
