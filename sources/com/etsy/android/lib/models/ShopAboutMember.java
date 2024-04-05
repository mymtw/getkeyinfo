package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.lang3.text.WordUtils;

public class ShopAboutMember extends BaseModel {
    public static final String DEFAULT_IMAGE_AVATAR_PATH_190 = "/images/avatars/default_avatar_190x190.png";
    private static final long serialVersionUID = 5450494864709068115L;
    public String bioTranslated = null;
    public String mBio = "";
    public EtsyId mId = new EtsyId();
    public Image mImage;
    public String mImageUrl190x190 = "";
    public String mImageUrl90x90 = "";
    public String mName = "";
    public String mRole = "";

    public String getBio() {
        return this.mBio;
    }

    public String getBioTranslated() {
        return this.bioTranslated;
    }

    public String[] getCapitalizedRoleList() {
        return WordUtils.capitalize(this.mRole, ',').split(",");
    }

    public EtsyId getId() {
        return this.mId;
    }

    public Image getImage() {
        return this.mImage;
    }

    public String getImageUrl190x190() {
        return this.mImageUrl190x190;
    }

    public String getImageUrl90x90() {
        return this.mImageUrl90x90;
    }

    public String getName() {
        return this.mName;
    }

    public String getRole() {
        return this.mRole;
    }

    public String[] getRoleList() {
        return this.mRole.split(",");
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.SHOP_ABOUT_MEMBER_ID.equals(currentName)) {
                    this.mId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if ("name".equals(currentName)) {
                    this.mName = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.ROLE.equals(currentName)) {
                    this.mRole = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.BIO.equals(currentName)) {
                    this.mBio = BaseModel.parseString(jsonParser).trim();
                } else if ("bio_machine_translated".equals(currentName)) {
                    this.bioTranslated = BaseModel.parseString(jsonParser).trim();
                } else if ("url_90x90".equals(currentName)) {
                    this.mImageUrl90x90 = BaseModel.parseStringURL(jsonParser);
                } else if ("url_190x190".equals(currentName)) {
                    this.mImageUrl190x190 = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.IMAGE.equals(currentName)) {
                    this.mImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setBio(String str) {
        this.mBio = str;
    }

    public void setId(EtsyId etsyId) {
        this.mId = etsyId;
    }

    public void setImage(Image image) {
        this.mImage = image;
    }

    public void setImageUrl190x190(String str) {
        this.mImageUrl190x190 = str;
    }

    public void setImageUrl90x90(String str) {
        this.mImageUrl90x90 = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setRole(String str) {
        this.mRole = str;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.SHOP_ID, this.mId.getId());
        return hashMap;
    }
}
