package com.etsy.android.lib.models.shopshare;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.BasicListingLike;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import p425q9.C13249a;

public class ShareAnnotation extends BaseModel {
    public static final int LISTING_OBJECT_TYPE = 5;
    private Coordinates mCoordinates = new Coordinates();
    private BaseModel mObject;
    private EtsyId mObjectId = new EtsyId();
    private int mObjectType;
    private Long mShareAnnotationId;

    public ShareAnnotation() {
        setShareAnnotationId();
    }

    /* renamed from: at */
    public static ShareAnnotation m17145at(Coordinates coordinates) {
        ShareAnnotation shareAnnotation = new ShareAnnotation();
        shareAnnotation.mCoordinates = coordinates;
        shareAnnotation.setShareAnnotationId();
        return shareAnnotation;
    }

    private BaseModel parseObject(JsonParser jsonParser, int i) throws IOException {
        if (i != 5) {
            return null;
        }
        return (BaseModel) BaseModel.parseObject(jsonParser, ListingCard.class);
    }

    public int getCoordX() {
        return this.mCoordinates.f19157x;
    }

    public int getCoordY() {
        return this.mCoordinates.f19158y;
    }

    public Coordinates getCoordinates() {
        return this.mCoordinates;
    }

    public BaseModel getObject() {
        return this.mObject;
    }

    public EtsyId getObjectId() {
        return this.mObjectId;
    }

    public int getObjectType() {
        return this.mObjectType;
    }

    public long getShareAnnotationId() {
        if (this.mShareAnnotationId == null) {
            setShareAnnotationId();
        }
        return this.mShareAnnotationId.longValue();
    }

    public boolean isObjectHydrated() {
        return this.mObject != null;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1489595877:
                        if (currentName.equals(ResponseConstants.OBJECT_ID)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1277176774:
                        if (currentName.equals(ResponseConstants.OBJECT_TYPE)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1023368385:
                        if (currentName.equals(ResponseConstants.OBJECT)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 952393134:
                        if (currentName.equals(ResponseConstants.COORD_X)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 952393135:
                        if (currentName.equals(ResponseConstants.COORD_Y)) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mObjectId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 1:
                        this.mObjectType = jsonParser.getValueAsInt();
                        break;
                    case 2:
                        this.mObject = parseObject(jsonParser, this.mObjectType);
                        break;
                    case 3:
                        this.mCoordinates.f19157x = jsonParser.getValueAsInt();
                        break;
                    case 4:
                        this.mCoordinates.f19158y = jsonParser.getValueAsInt();
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public ShareAnnotation setCoord(Coordinates coordinates) {
        this.mCoordinates = coordinates;
        return this;
    }

    public ShareAnnotation setListing(BasicListingLike basicListingLike) {
        this.mObjectId = basicListingLike.getListingId();
        this.mObjectType = 5;
        return this;
    }

    public void setShareAnnotationId() {
        if (this.mShareAnnotationId == null) {
            this.mShareAnnotationId = Long.valueOf(C13249a.f29104a.incrementAndGet());
        }
    }

    public static class Coordinates implements Serializable {

        /* renamed from: x */
        public int f19157x;

        /* renamed from: y */
        public int f19158y;

        public Coordinates() {
            this.f19157x = 0;
            this.f19158y = 0;
        }

        public Coordinates(int i, int i2) {
            this.f19157x = i;
            this.f19158y = i2;
        }
    }
}
