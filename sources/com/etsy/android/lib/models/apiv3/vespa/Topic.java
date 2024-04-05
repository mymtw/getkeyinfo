package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.DeepLink;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;

public final class Topic extends BaseFieldModel {
    public static final int $stable = 8;
    private DeepLink deepLink;
    private List<ListingImage> images;
    private LandingPageLink pageLink;
    private String topicName;

    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final List<ListingImage> getImages() {
        return this.images;
    }

    public final LandingPageLink getPageLink() {
        return this.pageLink;
    }

    public final String getTopicName() {
        return this.topicName;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1980522643:
                if (str.equals(ResponseConstants.DEEP_LINK)) {
                    this.deepLink = (DeepLink) BaseModel.Companion.parseObject(jsonParser, DeepLink.class);
                    return true;
                }
                break;
            case -1755408457:
                if (str.equals(ResponseConstants.LANDING_PAGE)) {
                    LandingPageLink landingPageLink = (LandingPageLink) BaseModel.Companion.parseObject(jsonParser, LandingPageLink.class);
                    this.pageLink = landingPageLink;
                    if (landingPageLink == null) {
                        return true;
                    }
                    landingPageLink.setPaginateForNext(true);
                    return true;
                }
                break;
            case -1185250696:
                if (str.equals("images")) {
                    this.images = BaseModel.Companion.parseArray(jsonParser, ListingImage.class);
                    return true;
                }
                break;
            case -834450533:
                if (str.equals(ResponseConstants.TOPIC_NAME)) {
                    this.topicName = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setDeepLink(DeepLink deepLink2) {
        this.deepLink = deepLink2;
    }

    public final void setImages(List<ListingImage> list) {
        this.images = list;
    }

    public final void setPageLink(LandingPageLink landingPageLink) {
        this.pageLink = landingPageLink;
    }

    public final void setTopicName(String str) {
        this.topicName = str;
    }
}
