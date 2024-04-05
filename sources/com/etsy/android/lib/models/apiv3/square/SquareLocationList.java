package com.etsy.android.lib.models.apiv3.square;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SquareLocationList extends BaseModel {
    public static final int $stable = 8;
    private static final String AVAILABLE_LOCATIONS = "availableLocations";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String UNAVAILABLE_LOCATIONS = "unavailableLocations";
    private List<SquareLocation> availableLocations;
    private List<SquareLocation> unavailableLocations;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SquareLocationList() {
        EmptyList emptyList = EmptyList.INSTANCE;
        this.availableLocations = emptyList;
        this.unavailableLocations = emptyList;
    }

    public final List<SquareLocation> getAvailableLocations() {
        return this.availableLocations;
    }

    public final List<SquareLocation> getUnavailableLocations() {
        return this.unavailableLocations;
    }

    public void parseData(JsonParser jsonParser) {
        C19383o.m32797g(jsonParser, "jp");
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (C19383o.m32792b(currentName, AVAILABLE_LOCATIONS)) {
                    this.availableLocations = BaseModel.Companion.parseArray(jsonParser, SquareLocation.class);
                } else if (C19383o.m32792b(currentName, UNAVAILABLE_LOCATIONS)) {
                    this.unavailableLocations = BaseModel.Companion.parseArray(jsonParser, SquareLocation.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SquareLocationList(availableLocations=");
        h.append(this.availableLocations);
        h.append(", unavailableLocations=");
        return C0070b.m186i(h, this.unavailableLocations, ')');
    }
}
