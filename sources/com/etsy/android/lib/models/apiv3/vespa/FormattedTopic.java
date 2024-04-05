package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.DynamicAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.sdl.ISdlEvent;
import com.etsy.android.lib.models.cardviewelement.stats.SdlEvent;
import com.etsy.android.lib.models.interfaces.IFormattedTopic;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FormattedTopic extends BaseFieldModel implements IFormattedTopic {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_TYPE = "formattedTopic";
    private List<? extends Format> formats = EmptyList.INSTANCE;
    private List<? extends ISdlEvent> sdlEvents;
    private Topic topic;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum Format {
        FIRST_FEATURED_TRIPLET("first_featured_triplet"),
        LAYERED_TEXT_GRADIENT("layered_text_with_gradient");
        
        private final String formatName;

        private Format(String str) {
            this.formatName = str;
        }

        public final String getFormatName() {
            return this.formatName;
        }
    }

    public List<Pair<String, Map<AnalyticsProperty, Object>>> extractOnTappedEventParameters() {
        Map<String, Object> clientEventProperties;
        ArrayList arrayList = new ArrayList();
        List<ISdlEvent> sdlEvents2 = getSdlEvents();
        if (sdlEvents2 != null) {
            for (ISdlEvent iSdlEvent : sdlEvents2) {
                if (C19383o.m32792b(iSdlEvent.getClientEventTrigger(), "tapped")) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (!(iSdlEvent.getClientEventProperties() == null || (clientEventProperties = iSdlEvent.getClientEventProperties()) == null)) {
                        for (Map.Entry next : clientEventProperties.entrySet()) {
                            linkedHashMap.put(new DynamicAnalyticsProperty((String) next.getKey()), next.getValue());
                        }
                    }
                    arrayList.add(new Pair(iSdlEvent.getClientEventName(), linkedHashMap));
                }
            }
        }
        return arrayList;
    }

    public List<Format> getFormats() {
        return this.formats;
    }

    public List<ISdlEvent> getSdlEvents() {
        return this.sdlEvents;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public int getViewType() {
        return R.id.view_type_formatted_topic;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != -677443748) {
            if (c != 110546223) {
                if (c == 172761101 && str.equals(ResponseConstants.CLIENT_EVENTS)) {
                    setSdlEvents(BaseModel.Companion.parseArray(jsonParser, SdlEvent.class));
                    return true;
                }
            } else if (str.equals(ResponseConstants.TOPIC)) {
                setTopic((Topic) BaseModel.Companion.parseObject(jsonParser, Topic.class));
                return true;
            }
        } else if (str.equals(ResponseConstants.FORMATS)) {
            List<String> parseStringArray = BaseModel.Companion.parseStringArray(jsonParser);
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(parseStringArray));
            for (String str2 : parseStringArray) {
                Format format = Format.FIRST_FEATURED_TRIPLET;
                if (!C19383o.m32792b(str2, format.getFormatName())) {
                    format = Format.LAYERED_TEXT_GRADIENT;
                    C19383o.m32792b(str2, format.getFormatName());
                }
                arrayList.add(format);
            }
            setFormats(arrayList);
            return true;
        }
        return false;
    }

    public void setFormats(List<? extends Format> list) {
        C19383o.m32797g(list, "<set-?>");
        this.formats = list;
    }

    public void setSdlEvents(List<? extends ISdlEvent> list) {
        this.sdlEvents = list;
    }

    public void setTopic(Topic topic2) {
        this.topic = topic2;
    }
}
