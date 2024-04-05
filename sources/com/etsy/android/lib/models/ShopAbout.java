package com.etsy.android.lib.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShopAbout extends BaseModel {
    private static final long serialVersionUID = 5450494864709068115L;
    public List<ShopAboutImage> mImages = new ArrayList(0);
    public RelatedLinks mLinks;
    public List<ShopAboutMember> mMembers = new ArrayList(0);
    public String mStory = "";
    public String mStoryHeadline = "";
    public String mUrl = "";
    public List<ShopAboutVideo> mVideos;
    public String storyHeadlineTranslated = null;
    public String storyTranslated = null;

    public ShopAboutVideo getFirstReadyVideo() {
        List<ShopAboutVideo> list = this.mVideos;
        if (list == null) {
            return null;
        }
        for (ShopAboutVideo next : list) {
            if (next.videoIsReady()) {
                return next;
            }
        }
        return null;
    }

    public List<ShopAboutImage> getImages() {
        return this.mImages;
    }

    public List<ShopRelatedLink> getLinks() {
        RelatedLinks relatedLinks = this.mLinks;
        return relatedLinks != null ? relatedLinks.getLinks() : new ArrayList();
    }

    public List<ShopAboutMember> getMembers() {
        return this.mMembers;
    }

    public String getStory() {
        return this.mStory;
    }

    public String getStoryHeadline() {
        return this.mStoryHeadline;
    }

    public String getStoryHeadlineTranslated() {
        return this.storyHeadlineTranslated;
    }

    public String getStoryTranslated() {
        return this.storyTranslated;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public List<ShopAboutVideo> getVideos() {
        return this.mVideos;
    }

    public boolean hasProcessingVideo() {
        List<ShopAboutVideo> list = this.mVideos;
        return list != null && !list.isEmpty() && this.mVideos.get(0) != null && !this.mVideos.get(0).videoIsReady() && !this.mVideos.get(0).hasError();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2101383528:
                        if (currentName.equals("Images")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1818550440:
                        if (currentName.equals("story_machine_translated")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1732810888:
                        if (currentName.equals(ResponseConstants.Includes.VIDEOS)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1681432327:
                        if (currentName.equals(ResponseConstants.Includes.MEMBERS)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1514918961:
                        if (currentName.equals("story_headline_machine_translated")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1185250696:
                        if (currentName.equals("images")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -816678056:
                        if (currentName.equals(ResponseConstants.VIDEOS)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 116079:
                        if (currentName.equals("url")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 109770997:
                        if (currentName.equals(ResponseConstants.STORY)) {
                            c = 8;
                            break;
                        }
                        break;
                    case 482755237:
                        if (currentName.equals(ResponseConstants.RELATED_LINKS)) {
                            c = 9;
                            break;
                        }
                        break;
                    case 948881689:
                        if (currentName.equals(ResponseConstants.MEMBERS)) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1736706526:
                        if (currentName.equals(ResponseConstants.STORY_HEADLINE)) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 5:
                        this.mImages = BaseModel.parseArray(jsonParser, ShopAboutImage.class);
                        break;
                    case 1:
                        this.storyTranslated = BaseModel.parseString(jsonParser).trim();
                        break;
                    case 2:
                    case 6:
                        this.mVideos = BaseModel.parseArray(jsonParser, ShopAboutVideo.class);
                        break;
                    case 3:
                    case 10:
                        this.mMembers = BaseModel.parseArray(jsonParser, ShopAboutMember.class);
                        break;
                    case 4:
                        this.storyHeadlineTranslated = BaseModel.parseString(jsonParser).trim();
                        break;
                    case 7:
                        this.mUrl = BaseModel.parseStringPreserveHTMLEscapeEncoding(jsonParser);
                        break;
                    case 8:
                        this.mStory = BaseModel.parseString(jsonParser).trim();
                        break;
                    case 9:
                        if (jsonParser.getCurrentToken() != JsonToken.START_ARRAY) {
                            this.mLinks = (RelatedLinks) BaseModel.parseObject(jsonParser, RelatedLinks.class);
                            break;
                        } else {
                            this.mLinks = new RelatedLinks(BaseModel.parseArray(jsonParser, ShopRelatedLink.class));
                            break;
                        }
                    case 11:
                        this.mStoryHeadline = BaseModel.parseString(jsonParser).trim();
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setMembers(List<ShopAboutMember> list) {
        this.mMembers = list;
    }
}
