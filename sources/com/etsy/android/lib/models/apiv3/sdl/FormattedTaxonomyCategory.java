package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.DynamicAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.lib.models.interfaces.ITaxonomyCategory;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p415of.C13186o;

@C17403o(generateAdapter = true)
public final class FormattedTaxonomyCategory implements C13186o, IFormattedTaxonomyCategory, C8698l {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_TYPE = "formattedTaxonomyCategory";
    private transient ITaxonomyCategory category;
    private TaxonomyCategory categoryField;
    private transient List<? extends FormattedTaxonomyCategory.Format> formats;
    private List<String> formatsField;
    private transient List<? extends ISdlEvent> sdlEvents;
    private List<DelegateSdlEvent> sdlEventsField;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FormattedTaxonomyCategory(@C17402n(name = "formats") List<String> list, @C17402n(name = "category") TaxonomyCategory taxonomyCategory, @C17402n(name = "client_events") List<DelegateSdlEvent> list2) {
        C19383o.m32797g(list, "formatsField");
        this.formatsField = list;
        this.categoryField = taxonomyCategory;
        this.sdlEventsField = list2;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (String str : list) {
            FormattedTaxonomyCategory.Format format = FormattedTaxonomyCategory.Format.IMAGE_FIRST_SEPARATE_TEXT;
            if (!C19383o.m32792b(str, format.getFormatName())) {
                FormattedTaxonomyCategory.Format format2 = FormattedTaxonomyCategory.Format.IMAGE_FIRST_LAYERED_TEXT;
                if (!C19383o.m32792b(str, format2.getFormatName())) {
                    format2 = FormattedTaxonomyCategory.Format.TEXT_FIRST;
                    if (!C19383o.m32792b(str, format2.getFormatName())) {
                        format2 = FormattedTaxonomyCategory.Format.IMAGE_FIRST_SEPARATE_TEXT_WITH_ANCHOR_NODE;
                        if (!C19383o.m32792b(str, format2.getFormatName())) {
                            format2 = FormattedTaxonomyCategory.Format.IMAGE_FIRST_LAYERED_TEXT_WITH_ANCHOR_NODE;
                            if (!C19383o.m32792b(str, format2.getFormatName())) {
                                format2 = FormattedTaxonomyCategory.Format.IMAGE_LEFT_PILL;
                                if (!C19383o.m32792b(str, format2.getFormatName())) {
                                    format2 = FormattedTaxonomyCategory.Format.CIRCLE_IMAGE_SEPARATE_TEXT;
                                    if (!C19383o.m32792b(str, format2.getFormatName())) {
                                        format2 = FormattedTaxonomyCategory.Format.SMALL_CIRCLE_IMAGE_SEPARATE_TEXT;
                                        if (!C19383o.m32792b(str, format2.getFormatName())) {
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
        this.formats = arrayList;
        this.category = this.categoryField;
        this.sdlEvents = this.sdlEventsField;
    }

    public static /* synthetic */ FormattedTaxonomyCategory copy$default(FormattedTaxonomyCategory formattedTaxonomyCategory, List<String> list, TaxonomyCategory taxonomyCategory, List<DelegateSdlEvent> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = formattedTaxonomyCategory.formatsField;
        }
        if ((i & 2) != 0) {
            taxonomyCategory = formattedTaxonomyCategory.categoryField;
        }
        if ((i & 4) != 0) {
            list2 = formattedTaxonomyCategory.sdlEventsField;
        }
        return formattedTaxonomyCategory.copy(list, taxonomyCategory, list2);
    }

    public final List<String> component1() {
        return this.formatsField;
    }

    public final TaxonomyCategory component2() {
        return this.categoryField;
    }

    public final List<DelegateSdlEvent> component3() {
        return this.sdlEventsField;
    }

    public final FormattedTaxonomyCategory copy(@C17402n(name = "formats") List<String> list, @C17402n(name = "category") TaxonomyCategory taxonomyCategory, @C17402n(name = "client_events") List<DelegateSdlEvent> list2) {
        C19383o.m32797g(list, "formatsField");
        return new FormattedTaxonomyCategory(list, taxonomyCategory, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedTaxonomyCategory)) {
            return false;
        }
        FormattedTaxonomyCategory formattedTaxonomyCategory = (FormattedTaxonomyCategory) obj;
        return C19383o.m32792b(this.formatsField, formattedTaxonomyCategory.formatsField) && C19383o.m32792b(this.categoryField, formattedTaxonomyCategory.categoryField) && C19383o.m32792b(this.sdlEventsField, formattedTaxonomyCategory.sdlEventsField);
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

    public final TaxonomyCategory getCategoryField() {
        return this.categoryField;
    }

    public List<FormattedTaxonomyCategory.Format> getFormats() {
        return this.formats;
    }

    public final List<String> getFormatsField() {
        return this.formatsField;
    }

    public List<ISdlEvent> getSdlEvents() {
        return this.sdlEvents;
    }

    public final List<DelegateSdlEvent> getSdlEventsField() {
        return this.sdlEventsField;
    }

    public int getViewType() {
        String str = this.formatsField.get(0);
        return C19383o.m32792b(str, FormattedTaxonomyCategory.Format.IMAGE_LEFT_PILL.getFormatName()) ? R.id.view_type_formatted_taxonomy_categories_pills : C19383o.m32792b(str, FormattedTaxonomyCategory.Format.SMALL_CIRCLE_IMAGE_SEPARATE_TEXT.getFormatName()) ? R.id.view_type_formatted_taxonomy_featured_category : R.id.view_type_formatted_taxonomy_category;
    }

    public int hashCode() {
        int hashCode = this.formatsField.hashCode() * 31;
        TaxonomyCategory taxonomyCategory = this.categoryField;
        int i = 0;
        int hashCode2 = (hashCode + (taxonomyCategory == null ? 0 : taxonomyCategory.hashCode())) * 31;
        List<DelegateSdlEvent> list = this.sdlEventsField;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public void setCategory(ITaxonomyCategory iTaxonomyCategory) {
        this.category = iTaxonomyCategory;
    }

    public final void setCategoryField(TaxonomyCategory taxonomyCategory) {
        this.categoryField = taxonomyCategory;
    }

    public void setFormats(List<? extends FormattedTaxonomyCategory.Format> list) {
        C19383o.m32797g(list, "<set-?>");
        this.formats = list;
    }

    public final void setFormatsField(List<String> list) {
        C19383o.m32797g(list, "<set-?>");
        this.formatsField = list;
    }

    public void setSdlEvents(List<? extends ISdlEvent> list) {
        this.sdlEvents = list;
    }

    public final void setSdlEventsField(List<DelegateSdlEvent> list) {
        this.sdlEventsField = list;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("FormattedTaxonomyCategory(formatsField=");
        h.append(this.formatsField);
        h.append(", categoryField=");
        h.append(this.categoryField);
        h.append(", sdlEventsField=");
        return C0070b.m186i(h, this.sdlEventsField, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FormattedTaxonomyCategory(List list, TaxonomyCategory taxonomyCategory, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, taxonomyCategory, (i & 4) != 0 ? EmptyList.INSTANCE : list2);
    }
}
