package com.etsy.android.lib.models.apiv3.square;

import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Connection extends BaseModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LAST_SYNCED_DATE = "last_synced_date";
    private static final String LOCATION_ID = "location_id";
    private static final String LOCATION_NAME = "location_name";
    private String lastSyncedDate;
    private String locationId;
    private String locationName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Connection() {
        this.lastSyncedDate = "";
        this.locationName = "";
    }

    public final String getLastSyncedDate() {
        return this.lastSyncedDate;
    }

    public final String getLocationId() {
        return this.locationId;
    }

    public final String getLocationName() {
        return this.locationName;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        C19383o.m32797g(jsonParser, "jp");
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (currentName != null) {
                    int hashCode = currentName.hashCode();
                    if (hashCode != -1796793131) {
                        if (hashCode != 552319461) {
                            if (hashCode == 1684813866 && currentName.equals(LAST_SYNCED_DATE)) {
                                this.lastSyncedDate = BaseModel.Companion.parseString(jsonParser);
                            }
                        } else if (currentName.equals(LOCATION_ID)) {
                            this.locationId = BaseModel.Companion.parseString(jsonParser);
                        }
                    } else if (currentName.equals(LOCATION_NAME)) {
                        this.locationName = BaseModel.Companion.parseString(jsonParser);
                    }
                }
                jsonParser.skipChildren();
            }
        }
    }

    public Connection(String str, String str2, String str3) {
        this.locationName = str;
        this.locationId = str2;
        this.lastSyncedDate = str3;
    }
}
