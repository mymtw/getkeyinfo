package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IHtmlText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p415of.C13186o;

@C17403o(generateAdapter = true)
public final class HtmlText implements C13186o, IHtmlText, ITrackedObject {
    public static final int $stable = 8;
    private final String alignment;
    private transient List<C8696j> onSeenTrackingEvents;
    private final String text;
    private transient String trackingName;

    public HtmlText() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public HtmlText(@C17402n(name = "text") String str, @C17402n(name = "alignment") String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, ResponseConstants.ALIGNMENT);
        this.text = str;
        this.alignment = str2;
        this.onSeenTrackingEvents = new ArrayList();
    }

    public static /* synthetic */ HtmlText copy$default(HtmlText htmlText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = htmlText.getText();
        }
        if ((i & 2) != 0) {
            str2 = htmlText.getAlignment();
        }
        return htmlText.copy(str, str2);
    }

    public final String component1() {
        return getText();
    }

    public final String component2() {
        return getAlignment();
    }

    public final HtmlText copy(@C17402n(name = "text") String str, @C17402n(name = "alignment") String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, ResponseConstants.ALIGNMENT);
        return new HtmlText(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HtmlText)) {
            return false;
        }
        HtmlText htmlText = (HtmlText) obj;
        return C19383o.m32792b(getText(), htmlText.getText()) && C19383o.m32792b(getAlignment(), htmlText.getAlignment());
    }

    public String getAlignment() {
        return this.alignment;
    }

    public int getGravity() {
        String alignment2 = getAlignment();
        int hashCode = alignment2.hashCode();
        if (hashCode == -1364013995) {
            return !alignment2.equals("center") ? 3 : 17;
        }
        if (hashCode != 3317767) {
            return (hashCode == 108511772 && alignment2.equals("right")) ? 5 : 3;
        }
        boolean equals = alignment2.equals("left");
        return 3;
    }

    public List<C8696j> getOnSeenTrackingEvents() {
        return this.onSeenTrackingEvents;
    }

    public String getText() {
        return this.text;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    public String getTrackingName() {
        return this.trackingName;
    }

    @JsonIgnore
    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return null;
    }

    public int getViewType() {
        return R.id.view_type_html_text;
    }

    public int hashCode() {
        return getAlignment().hashCode() + (getText().hashCode() * 31);
    }

    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "<set-?>");
        this.onSeenTrackingEvents = list;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    public void setTrackingName(String str) {
        this.trackingName = str;
    }

    @JsonIgnore
    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("HtmlText(text=");
        h.append(getText());
        h.append(", alignment=");
        h.append(getAlignment());
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HtmlText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
