package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.DynamicAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.lib.models.apiv3.sdl.ISdlEvent;
import com.etsy.android.lib.models.cardviewelement.stats.SdlEvent;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.lib.models.interfaces.ITaxonomyCategory;
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

public final class FormattedTaxonomyCategory extends BaseFieldModel implements IFormattedTaxonomyCategory {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_TYPE = "formattedTaxonomyCategory";
    private ITaxonomyCategory category;
    private List<? extends Format> formats = EmptyList.INSTANCE;
    private List<? extends ISdlEvent> sdlEvents;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum Format {
        IMAGE_FIRST_SEPARATE_TEXT("img_first_separate_text"),
        IMAGE_FIRST_LAYERED_TEXT("img_first_layered_text"),
        TEXT_FIRST("text_first"),
        IMAGE_FIRST_SEPARATE_TEXT_WITH_ANCHOR_NODE("img_first_separate_text_with_anchor_node"),
        IMAGE_FIRST_LAYERED_TEXT_WITH_ANCHOR_NODE("img_first_layered_text_with_anchor_node"),
        IMAGE_LEFT_PILL("img_left_pill"),
        SMALL_CIRCLE_IMAGE_SEPARATE_TEXT("smaller_circle_img_first_separate_text"),
        CIRCLE_IMAGE_SEPARATE_TEXT("circle_img_first_separate_text"),
        SELECTED(ResponseConstants.SELECTED);
        
        private final String formatName;

        private Format(String str) {
            this.formatName = str;
        }

        public final String getFormatName() {
            return this.formatName;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Format.values().length];
            iArr[Format.IMAGE_LEFT_PILL.ordinal()] = 1;
            iArr[Format.SMALL_CIRCLE_IMAGE_SEPARATE_TEXT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
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

    public ITaxonomyCategory getCategory() {
        return this.category;
    }

    public List<Format> getFormats() {
        return this.formats;
    }

    public List<ISdlEvent> getSdlEvents() {
        return this.sdlEvents;
    }

    public int getViewType() {
        int i = WhenMappings.$EnumSwitchMapping$0[getFormats().get(0).ordinal()];
        return i != 1 ? i != 2 ? R.id.view_type_formatted_taxonomy_category : R.id.view_type_formatted_taxonomy_featured_category : R.id.view_type_formatted_taxonomy_categories_pills;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != -677443748) {
            if (c != 50511102) {
                if (c == 172761101 && str.equals(ResponseConstants.CLIENT_EVENTS)) {
                    setSdlEvents(BaseModel.Companion.parseArray(jsonParser, SdlEvent.class));
                    return true;
                }
            } else if (str.equals(ResponseConstants.CATEGORY)) {
                setCategory((ITaxonomyCategory) BaseModel.Companion.parseObject(jsonParser, TaxonomyCategory.class));
                return true;
            }
        } else if (str.equals(ResponseConstants.FORMATS)) {
            List<String> parseStringArray = BaseModel.Companion.parseStringArray(jsonParser);
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(parseStringArray));
            for (String str2 : parseStringArray) {
                Format format = Format.IMAGE_FIRST_SEPARATE_TEXT;
                if (!C19383o.m32792b(str2, format.getFormatName())) {
                    Format format2 = Format.IMAGE_FIRST_LAYERED_TEXT;
                    if (!C19383o.m32792b(str2, format2.getFormatName())) {
                        format2 = Format.TEXT_FIRST;
                        if (!C19383o.m32792b(str2, format2.getFormatName())) {
                            format2 = Format.IMAGE_FIRST_SEPARATE_TEXT_WITH_ANCHOR_NODE;
                            if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                format2 = Format.IMAGE_FIRST_LAYERED_TEXT_WITH_ANCHOR_NODE;
                                if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                    format2 = Format.CIRCLE_IMAGE_SEPARATE_TEXT;
                                    if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                        format2 = Format.SMALL_CIRCLE_IMAGE_SEPARATE_TEXT;
                                        if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                            format2 = Format.SELECTED;
                                            if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    format = format2;
                }
                arrayList.add(format);
            }
            setFormats(arrayList);
            return true;
        }
        return false;
    }

    public void setCategory(ITaxonomyCategory iTaxonomyCategory) {
        this.category = iTaxonomyCategory;
    }

    public void setFormats(List<? extends Format> list) {
        C19383o.m32797g(list, "<set-?>");
        this.formats = list;
    }

    public void setSdlEvents(List<? extends ISdlEvent> list) {
        this.sdlEvents = list;
    }
}
