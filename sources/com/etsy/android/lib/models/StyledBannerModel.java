package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.models.apiv3.Button;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.lib.models.apiv3.cart.PaymentMethod;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p628nj.C18263b;

public final class StyledBannerModel extends BaseBackgroundColorFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String FAVORITED = "favorited";
    public static final String STAR = "star";
    private String backgroundColorDark = "";
    private String backgroundColorLight = "";
    private Image backgroundImage;
    private String backgroundImageColorDark = "";
    private String backgroundImageColorLight = "";
    private List<Button> buttons = EmptyList.INSTANCE;
    private String deepLink = "";
    private DismissAction dismissAction;
    private Image foregroundImage;
    private String icon = "";
    private InfoModal infoModal;
    private Layout layout = Layout.FLAG;
    private ListSection listSection;
    private List<MessageModel> messages = new ArrayList();
    private List<String> styles = new ArrayList();
    private String uniqueBannerAnalyticsName = "";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum Layout {
        FLAG("flag"),
        CAMPAIGN("campaign-banner"),
        EDITORIAL("editorial-banner"),
        PERSONALIZED("personalized-banner"),
        MESSAGE_STACK("message-stack"),
        ICON_MESSAGE_BUTTON_STACK("icon-message-button-stack");
        
        private final String layoutName;

        private Layout(String str) {
            this.layoutName = str;
        }

        public final String getLayoutName() {
            return this.layoutName;
        }
    }

    public final String getAnalyticsName() {
        return C18263b.m30839d0(this.uniqueBannerAnalyticsName) ? this.uniqueBannerAnalyticsName : C19388s.m32863g0(this);
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final String getBackgroundColorLight() {
        return this.backgroundColorLight;
    }

    public final Image getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getBackgroundImageColorDark() {
        return this.backgroundImageColorDark;
    }

    public final String getBackgroundImageColorLight() {
        return this.backgroundImageColorLight;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final DismissAction getDismissAction() {
        return this.dismissAction;
    }

    public final Image getForegroundImage() {
        return this.foregroundImage;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final InfoModal getInfoModal() {
        return this.infoModal;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final ListSection getListSection() {
        return this.listSection;
    }

    public final List<MessageModel> getMessages() {
        return this.messages;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    public final List<String> getStyles() {
        return this.styles;
    }

    public int getViewType() {
        return R.id.view_type_styled_banner;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        Layout layout2;
        int i = 0;
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1896990881:
                if (str.equals(ResponseConstants.FOREGROUND_IMAGE)) {
                    this.foregroundImage = (Image) BaseModel.Companion.parseObject(jsonParser, Image.class);
                    break;
                } else {
                    return false;
                }
            case -1406027381:
                if (str.equals("dismiss_action")) {
                    this.dismissAction = (DismissAction) BaseModel.Companion.parseObject(jsonParser, DismissAction.class);
                    break;
                } else {
                    return false;
                }
            case -1109722326:
                if (str.equals(ResponseConstants.LAYOUT)) {
                    String parseString = BaseModel.Companion.parseString(jsonParser);
                    Layout[] values = Layout.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            layout2 = values[i];
                            if (!C19383o.m32792b(layout2.getLayoutName(), parseString)) {
                                i++;
                            }
                        } else {
                            layout2 = null;
                        }
                    }
                    if (layout2 == null) {
                        layout2 = Layout.FLAG;
                    }
                    this.layout = layout2;
                    break;
                } else {
                    return false;
                }
            case -891774750:
                if (str.equals(ResponseConstants.STYLES)) {
                    this.styles = BaseModel.Companion.parseStringArray(jsonParser);
                    break;
                } else {
                    return false;
                }
            case -480049188:
                if (str.equals(PaymentMethod.INFO_MODAL)) {
                    this.infoModal = (InfoModal) BaseModel.Companion.parseObject(jsonParser, InfoModal.class);
                    break;
                } else {
                    return false;
                }
            case -462094004:
                if (str.equals(ResponseConstants.MESSAGES)) {
                    this.messages = BaseModel.Companion.parseArray(jsonParser, MessageModel.class);
                    break;
                } else {
                    return false;
                }
            case 3226745:
                if (str.equals(ResponseConstants.ICON)) {
                    this.icon = BaseModel.Companion.parseString(jsonParser);
                    break;
                } else {
                    return false;
                }
            case 241352577:
                if (str.equals(ResponseConstants.BUTTONS)) {
                    this.buttons = BaseModel.Companion.parseArray(jsonParser, Button.class);
                    break;
                } else {
                    return false;
                }
            case 523834781:
                if (str.equals(ResponseConstants.DEEP_LINK_URL)) {
                    this.deepLink = BaseModel.Companion.parseString(jsonParser);
                    break;
                } else {
                    return false;
                }
            case 764360331:
                if (str.equals(ResponseConstants.BACKGROUND_IMAGE_COLOR_PAIR)) {
                    Object parseObject = BaseModel.Companion.parseObject(jsonParser, ColorPairModel.class);
                    C19383o.m32794d(parseObject);
                    ColorPairModel colorPairModel = (ColorPairModel) parseObject;
                    this.backgroundImageColorLight = colorPairModel.getBackgroundColorDefault();
                    this.backgroundImageColorDark = colorPairModel.getBackgroundColorDark();
                    break;
                } else {
                    return false;
                }
            case 1052661828:
                if (str.equals(ResponseConstants.LIST_SECTION)) {
                    this.listSection = (ListSection) BaseModel.Companion.parseObject(jsonParser, ListSection.class);
                    break;
                } else {
                    return false;
                }
            case 1273617316:
                if (str.equals(ResponseConstants.ANALYTICS_NAME)) {
                    this.uniqueBannerAnalyticsName = BaseModel.Companion.parseString(jsonParser);
                    C19388s.m32896y0(this, getAnalyticsName());
                    break;
                } else {
                    return false;
                }
            case 1811392999:
                if (str.equals(ResponseConstants.BACKGROUND_COLOR_PAIR)) {
                    Object parseObject2 = BaseModel.Companion.parseObject(jsonParser, ColorPairModel.class);
                    C19383o.m32794d(parseObject2);
                    ColorPairModel colorPairModel2 = (ColorPairModel) parseObject2;
                    this.backgroundColorLight = colorPairModel2.getBackgroundColorDefault();
                    this.backgroundColorDark = colorPairModel2.getBackgroundColorDark();
                    break;
                } else {
                    return false;
                }
            case 2036780306:
                if (str.equals(ResponseConstants.BACKGROUND_COLOR)) {
                    String parseString2 = BaseModel.Companion.parseString(jsonParser);
                    if (!C19457k.m33025c1(parseString2, "#", false)) {
                        parseString2 = '#' + parseString2;
                    }
                    this.backgroundColorLight = parseString2;
                    break;
                } else {
                    return false;
                }
            case 2042251018:
                if (str.equals(ResponseConstants.BACKGROUND_IMAGE)) {
                    this.backgroundImage = (Image) BaseModel.Companion.parseObject(jsonParser, Image.class);
                    break;
                } else {
                    return false;
                }
            default:
                return false;
        }
        return true;
    }

    public final void setBackgroundColorDark(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.backgroundColorDark = str;
    }

    public final void setBackgroundColorLight(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.backgroundColorLight = str;
    }

    public final void setBackgroundImage(Image image) {
        this.backgroundImage = image;
    }

    public final void setBackgroundImageColorDark(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.backgroundImageColorDark = str;
    }

    public final void setBackgroundImageColorLight(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.backgroundImageColorLight = str;
    }

    public final void setButtons(List<Button> list) {
        C19383o.m32797g(list, "<set-?>");
        this.buttons = list;
    }

    public final void setDeepLink(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.deepLink = str;
    }

    public final void setForegroundImage(Image image) {
        this.foregroundImage = image;
    }

    public final void setIcon(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.icon = str;
    }

    public final void setLayout(Layout layout2) {
        C19383o.m32797g(layout2, "<set-?>");
        this.layout = layout2;
    }

    public final void setListSection(ListSection listSection2) {
        this.listSection = listSection2;
    }

    public final void setMessages(List<MessageModel> list) {
        C19383o.m32797g(list, "<set-?>");
        this.messages = list;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "value");
    }

    public final void setStyles(List<String> list) {
        C19383o.m32797g(list, "<set-?>");
        this.styles = list;
    }
}
