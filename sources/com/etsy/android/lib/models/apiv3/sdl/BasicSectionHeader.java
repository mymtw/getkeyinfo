package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class BasicSectionHeader implements IVespaListSectionHeader, ITrackedObject {
    public static final int $stable = 8;
    private final ServerDrivenAction action;
    private transient List<C8696j> onSeenTrackingEventsField;
    private LandingPageLink pageLinkField;
    private final List<IVespaListSectionHeader.Style> styles;
    private String subtitleField;
    private String titleField;
    private String trackingNameField;
    private transient Map<AnalyticsProperty, Object> trackingParametersField;
    private final String viewTitle;

    public BasicSectionHeader(@C17402n(name = "title") String str, @C17402n(name = "sub_title") String str2, @C17402n(name = "view_type") String str3, @C17402n(name = "action") ServerDrivenAction serverDrivenAction, List<? extends IVespaListSectionHeader.Style> list) {
        C19383o.m32797g(str, "titleField");
        this.titleField = str;
        this.subtitleField = str2;
        this.viewTitle = str3;
        this.action = serverDrivenAction;
        this.styles = list;
        this.trackingNameField = "";
        this.onSeenTrackingEventsField = new ArrayList();
        this.trackingParametersField = new LinkedHashMap();
    }

    public static /* synthetic */ BasicSectionHeader copy$default(BasicSectionHeader basicSectionHeader, String str, String str2, String str3, ServerDrivenAction serverDrivenAction, List<IVespaListSectionHeader.Style> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basicSectionHeader.titleField;
        }
        if ((i & 2) != 0) {
            str2 = basicSectionHeader.subtitleField;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = basicSectionHeader.viewTitle;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            serverDrivenAction = basicSectionHeader.action;
        }
        ServerDrivenAction serverDrivenAction2 = serverDrivenAction;
        if ((i & 16) != 0) {
            list = basicSectionHeader.styles;
        }
        return basicSectionHeader.copy(str, str4, str5, serverDrivenAction2, list);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getOnSeenTrackingEvents$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getOnSeenTrackingEventsField$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingName$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParametersField$annotations() {
    }

    public final String component1() {
        return this.titleField;
    }

    public final String component2() {
        return this.subtitleField;
    }

    public final String component3() {
        return this.viewTitle;
    }

    public final ServerDrivenAction component4() {
        return this.action;
    }

    public final List<IVespaListSectionHeader.Style> component5() {
        return this.styles;
    }

    public final BasicSectionHeader copy(@C17402n(name = "title") String str, @C17402n(name = "sub_title") String str2, @C17402n(name = "view_type") String str3, @C17402n(name = "action") ServerDrivenAction serverDrivenAction, List<? extends IVespaListSectionHeader.Style> list) {
        C19383o.m32797g(str, "titleField");
        return new BasicSectionHeader(str, str2, str3, serverDrivenAction, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicSectionHeader)) {
            return false;
        }
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) obj;
        return C19383o.m32792b(this.titleField, basicSectionHeader.titleField) && C19383o.m32792b(this.subtitleField, basicSectionHeader.subtitleField) && C19383o.m32792b(this.viewTitle, basicSectionHeader.viewTitle) && C19383o.m32792b(this.action, basicSectionHeader.action) && C19383o.m32792b(this.styles, basicSectionHeader.styles);
    }

    public final ServerDrivenAction getAction() {
        return this.action;
    }

    public List<C8696j> getOnSeenTrackingEvents() {
        return this.onSeenTrackingEventsField;
    }

    public final List<C8696j> getOnSeenTrackingEventsField() {
        return this.onSeenTrackingEventsField;
    }

    public final LandingPageLink getPageLinkField() {
        return this.pageLinkField;
    }

    public final List<IVespaListSectionHeader.Style> getStyles() {
        return this.styles;
    }

    public String getSubtitle() {
        return this.subtitleField;
    }

    public final String getSubtitleField() {
        return this.subtitleField;
    }

    public String getTitle() {
        return this.titleField;
    }

    public final String getTitleField() {
        return this.titleField;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    public String getTrackingName() {
        return this.trackingNameField;
    }

    public final String getTrackingNameField() {
        return this.trackingNameField;
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return this.trackingParametersField;
    }

    public final Map<AnalyticsProperty, Object> getTrackingParametersField() {
        return this.trackingParametersField;
    }

    public List<IVespaListSectionHeader.Style> getViewStyles() {
        return this.styles;
    }

    public final String getViewTitle() {
        return this.viewTitle;
    }

    public int getViewType() {
        return R.id.view_type_section_header_with_page_link;
    }

    public int hashCode() {
        int hashCode = this.titleField.hashCode() * 31;
        String str = this.subtitleField;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.viewTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ServerDrivenAction serverDrivenAction = this.action;
        int hashCode4 = (hashCode3 + (serverDrivenAction == null ? 0 : serverDrivenAction.hashCode())) * 31;
        List<IVespaListSectionHeader.Style> list = this.styles;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "value");
        this.onSeenTrackingEventsField = list;
    }

    public final void setOnSeenTrackingEventsField(List<C8696j> list) {
        C19383o.m32797g(list, "<set-?>");
        this.onSeenTrackingEventsField = list;
    }

    public final void setPageLinkField(LandingPageLink landingPageLink) {
        this.pageLinkField = landingPageLink;
    }

    public void setSubtitle(String str) {
        this.subtitleField = str;
    }

    public final void setSubtitleField(String str) {
        this.subtitleField = str;
    }

    public void setTitle(String str) {
        C19383o.m32797g(str, "title");
        this.titleField = str;
    }

    public final void setTitleField(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.titleField = str;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    public void setTrackingName(String str) {
        if (str == null) {
            str = "";
        }
        this.trackingNameField = str;
    }

    public final void setTrackingNameField(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.trackingNameField = str;
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        this.trackingParametersField = map;
    }

    public final void setTrackingParametersField(Map<AnalyticsProperty, Object> map) {
        C19383o.m32797g(map, "<set-?>");
        this.trackingParametersField = map;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BasicSectionHeader(titleField=");
        h.append(this.titleField);
        h.append(", subtitleField=");
        h.append(this.subtitleField);
        h.append(", viewTitle=");
        h.append(this.viewTitle);
        h.append(", action=");
        h.append(this.action);
        h.append(", styles=");
        return C0070b.m186i(h, this.styles, ')');
    }

    /* renamed from: getAction  reason: collision with other method in class */
    public IServerDrivenAction m34865getAction() {
        return this.action;
    }

    public LandingPageLink getPageLink() {
        return this.pageLinkField;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasicSectionHeader(String str, String str2, String str3, ServerDrivenAction serverDrivenAction, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : serverDrivenAction, (i & 16) != 0 ? null : list);
    }
}
