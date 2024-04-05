package com.etsy.android.lib.models;

import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8900g;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.squareup.moshi.C17402n;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.StringEscapeUtils;
import p415of.C13186o;

public abstract class BaseModel implements Serializable, C13186o, ITrackedObject {
    public static final int $stable = 8;
    public static final long CREATION_MILLIS_OFFSET = 1000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = -4273544891826300016L;
    @JsonIgnore
    private List<C8696j> onSeenTrackingEvents = new ArrayList();
    @JsonIgnore
    private int trackedPosition;
    private String trackingName = "";
    @JsonIgnore
    private Map<AnalyticsProperty, Object> trackingParameters = new HashMap();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8900g<JsonParser, String> defaultKeyMapper() {
            return new BaseModel$Companion$defaultKeyMapper$1();
        }

        public final <T> List<T> parseArray(JsonParser jsonParser, Class<T> cls) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            C19383o.m32797g(cls, "clazz");
            return MoshiModelFactory.createList(jsonParser, cls);
        }

        public final List<EtsyId> parseEtsyIdArray(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            ArrayList arrayList = new ArrayList();
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    EtsyId etsyId = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
                    etsyId.setId(parseStringIdOrNumericValue(jsonParser));
                    arrayList.add(etsyId);
                }
            }
            return arrayList;
        }

        public final List<Integer> parseIntArray(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            ArrayList arrayList = new ArrayList();
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    arrayList.add(Integer.valueOf(jsonParser.getValueAsInt()));
                }
            } else if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                arrayList.add(Integer.valueOf(jsonParser.getValueAsInt()));
            }
            return arrayList;
        }

        public final Date parseIntoDate(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            long valueAsLong = jsonParser.getValueAsLong();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(valueAsLong * 1000);
            Date time = instance.getTime();
            C19383o.m32796f(time, "cal.time");
            return time;
        }

        public final <K, V> Map<K, V> parseMap(JsonParser jsonParser, C8900g<JsonParser, K> gVar, C8900g<JsonParser, V> gVar2) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            C19383o.m32797g(gVar, "keyMapper");
            C19383o.m32797g(gVar2, "valueMapper");
            HashMap hashMap = new HashMap();
            if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
                return hashMap;
            }
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                K exec = gVar.exec(jsonParser);
                jsonParser.nextToken();
                V exec2 = gVar2.exec(jsonParser);
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    hashMap.put(exec, exec2);
                }
            }
            return hashMap;
        }

        public final String parseNonNullString(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            return parseString(jsonParser, false);
        }

        public final <T> T parseObject(JsonParser jsonParser, Class<T> cls) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            C19383o.m32797g(cls, "clazz");
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                return MoshiModelFactory.create(jsonParser, cls);
            }
            return null;
        }

        public final List<String> parseRawStringArray(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            return parseStringArray(jsonParser, true);
        }

        public final String parseString(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            return parseString(jsonParser, false);
        }

        public final List<String> parseStringArray(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            return parseStringArray(jsonParser, false);
        }

        public final String parseStringIdOrNumericValue(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            return parseString(jsonParser, true);
        }

        public final String parseStringPreserveHTMLEscapeEncoding(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            return parseString(jsonParser, true);
        }

        public final String parseStringURL(JsonParser jsonParser) throws IOException {
            C19383o.m32797g(jsonParser, "jp");
            return parseString(jsonParser, true);
        }

        private final String parseString(JsonParser jsonParser, boolean z) throws IOException {
            String valueAsString = jsonParser.getValueAsString();
            if (!z) {
                valueAsString = StringEscapeUtils.unescapeHtml4(valueAsString);
            }
            C19383o.m32796f(valueAsString, "value");
            return valueAsString;
        }

        private final List<String> parseStringArray(JsonParser jsonParser, boolean z) throws IOException {
            ArrayList arrayList = new ArrayList();
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
                        String parseStringURL = z ? parseStringURL(jsonParser) : parseString(jsonParser);
                        if (parseStringURL != null) {
                            arrayList.add(parseStringURL);
                        }
                    } else {
                        throw new UnsupportedFormatException("Array of objects cannot be parsed as array of strings");
                    }
                }
            } else if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                String parseStringURL2 = z ? parseStringURL(jsonParser) : parseString(jsonParser);
                if (parseStringURL2 != null) {
                    arrayList.add(parseStringURL2);
                }
            }
            return arrayList;
        }
    }

    public static final class UnsupportedFormatException extends IOException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public static final C8900g<JsonParser, String> defaultKeyMapper() {
        return Companion.defaultKeyMapper();
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getOnSeenTrackingEvents$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackedPosition$annotations() {
    }

    public static /* synthetic */ void getTrackingName$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    public static final <T> List<T> parseArray(JsonParser jsonParser, Class<T> cls) throws IOException {
        return Companion.parseArray(jsonParser, cls);
    }

    public static final List<EtsyId> parseEtsyIdArray(JsonParser jsonParser) throws IOException {
        return Companion.parseEtsyIdArray(jsonParser);
    }

    public static final List<Integer> parseIntArray(JsonParser jsonParser) throws IOException {
        return Companion.parseIntArray(jsonParser);
    }

    public static final Date parseIntoDate(JsonParser jsonParser) throws IOException {
        return Companion.parseIntoDate(jsonParser);
    }

    public static final <K, V> Map<K, V> parseMap(JsonParser jsonParser, C8900g<JsonParser, K> gVar, C8900g<JsonParser, V> gVar2) throws IOException {
        return Companion.parseMap(jsonParser, gVar, gVar2);
    }

    public static final String parseNonNullString(JsonParser jsonParser) throws IOException {
        return Companion.parseNonNullString(jsonParser);
    }

    public static final <T> T parseObject(JsonParser jsonParser, Class<T> cls) throws IOException {
        return Companion.parseObject(jsonParser, cls);
    }

    public static final List<String> parseRawStringArray(JsonParser jsonParser) throws IOException {
        return Companion.parseRawStringArray(jsonParser);
    }

    public static final String parseString(JsonParser jsonParser) throws IOException {
        return Companion.parseString(jsonParser);
    }

    public static final List<String> parseStringArray(JsonParser jsonParser) throws IOException {
        return Companion.parseStringArray(jsonParser);
    }

    public static final String parseStringIdOrNumericValue(JsonParser jsonParser) throws IOException {
        return Companion.parseStringIdOrNumericValue(jsonParser);
    }

    public static final String parseStringPreserveHTMLEscapeEncoding(JsonParser jsonParser) throws IOException {
        return Companion.parseStringPreserveHTMLEscapeEncoding(jsonParser);
    }

    public static final String parseStringURL(JsonParser jsonParser) throws IOException {
        return Companion.parseStringURL(jsonParser);
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return this.onSeenTrackingEvents;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return this.trackedPosition;
    }

    public String getTrackingName() {
        return this.trackingName;
    }

    @JsonIgnore
    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return this.trackingParameters;
    }

    @JsonIgnore
    public int getViewType() {
        return R.id.view_type_undefined;
    }

    public abstract void parseData(JsonParser jsonParser) throws IOException;

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "<set-?>");
        this.onSeenTrackingEvents = list;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
        this.trackedPosition = i;
    }

    public void setTrackingName(String str) {
        this.trackingName = str;
    }

    @JsonIgnore
    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        this.trackingParameters = map;
    }

    public void setViewType(int i) {
        LogCatKt.m17045a().mo21310e("setViewType is a no-op for this class.");
    }
}
