package com.appboy.models.push;

import android.content.Context;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.C5382c;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import p250u0.C8109u;
import p753kq.C19846a;

public final class BrazeNotificationPayload {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private BrazeConfigurationProvider configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private boolean shouldFetchTestTriggers;
    private boolean shouldSyncGeofences;
    private String summaryText;
    private String titleText;

    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle bundle, int i) {
            C19383o.m32797g(bundle, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.type = companion.getTemplateFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_ID_KEY_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_URI_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE);
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_TEXT_KEY_TEMPLATE);
        }

        public final String getActionId() {
            return this.actionId;
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUri() {
            return this.uri;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void putIntoBundle(Bundle bundle) {
            C19383o.m32797g(bundle, "destination");
            bundle.putInt(Constants.APPBOY_ACTION_INDEX_KEY, this.actionIndex);
            bundle.putString(Constants.APPBOY_ACTION_TYPE_KEY, this.type);
            bundle.putString(Constants.APPBOY_ACTION_ID_KEY, this.actionId);
            bundle.putString(Constants.APPBOY_ACTION_URI_KEY, this.uri);
            bundle.putString(Constants.APPBOY_ACTION_USE_WEBVIEW_KEY, this.useWebview);
        }

        public final void setActionId(String str) {
            this.actionId = str;
        }

        public final void setActionIndex(int i) {
            this.actionIndex = i;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setUri(String str) {
            this.uri = str;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("Type", this.type));
            sb.append(companion.stringAndKey("Id", this.actionId));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            sb.append(companion.stringAndKey("Text", this.text));
            return sb.toString();
        }
    }

    public static final class Companion {

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$a */
        public static final class C4926a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4926a f11115b = new C4926a();

            public C4926a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse action field boolean. Returning default.";
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$b */
        public static final class C4927b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4927b f11116b = new C4927b();

            public C4927b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse action field long. Returning default.";
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$c */
        public static final class C4928c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11117b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11118c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4928c(String str, Bundle bundle) {
                super(0);
                this.f11117b = str;
                this.f11118c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse long with key ");
                h.append(this.f11117b);
                h.append(" and bundle: ");
                h.append(this.f11118c);
                return h.toString();
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$d */
        public static final class C4929d extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11119b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11120c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4929d(String str, Bundle bundle) {
                super(0);
                this.f11119b = str;
                this.f11120c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse non blank string with key ");
                h.append(this.f11119b);
                h.append(" and bundle: ");
                h.append(this.f11120c);
                return h.toString();
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$e */
        public static final class C4930e extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11121b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11122c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4930e(String str, Bundle bundle) {
                super(0);
                this.f11121b = str;
                this.f11122c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse string as int with key ");
                h.append(this.f11121b);
                h.append(" and bundle: ");
                h.append(this.f11122c);
                return h.toString();
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$f */
        public static final class C4931f extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11123b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11124c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4931f(String str, Bundle bundle) {
                super(0);
                this.f11123b = str;
                this.f11124c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse string with key ");
                h.append(this.f11123b);
                h.append(" and bundle: ");
                h.append(this.f11124c);
                return h.toString();
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$g */
        public static final class C4932g extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11125b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11126c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4932g(String str, Bundle bundle) {
                super(0);
                this.f11125b = str;
                this.f11126c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse string as boolean with key ");
                h.append(this.f11125b);
                h.append(" and bundle: ");
                h.append(this.f11126c);
                return h.toString();
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$h */
        public static final class C4933h extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11127b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11128c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4933h(String str, Bundle bundle) {
                super(0);
                this.f11127b = str;
                this.f11128c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse string as color int with key ");
                h.append(this.f11127b);
                h.append(" and bundle: ");
                h.append(this.f11128c);
                return h.toString();
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$i */
        public static final class C4934i extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11129b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11130c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4934i(String str, Bundle bundle) {
                super(0);
                this.f11129b = str;
                this.f11130c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse string as int with key ");
                h.append(this.f11129b);
                h.append(" and bundle: ");
                h.append(this.f11130c);
                return h.toString();
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$j */
        public static final class C4935j extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11131b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f11132c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4935j(String str, Bundle bundle) {
                super(0);
                this.f11131b = str;
                this.f11132c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Failed to parse string as long with key ");
                h.append(this.f11131b);
                h.append(" and bundle: ");
                h.append(this.f11132c);
                return h.toString();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String stringAndKey(String str, Object obj) {
            if (obj == null) {
                return "";
            }
            return 10 + str + " = " + obj;
        }

        public final Bundle getAttachedAppboyExtras(Bundle bundle) {
            return getAttachedBrazeExtras(bundle);
        }

        public final Bundle getAttachedBrazeExtras(Bundle bundle) {
            if (bundle == null) {
                return new Bundle();
            }
            if (bundle.containsKey(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED) && !bundle.getBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                Bundle bundle2 = bundle.getBundle(Constants.APPBOY_PUSH_EXTRAS_KEY);
                return bundle2 == null ? new Bundle() : bundle2;
            } else if (C5382c.f11528a) {
                return new Bundle(bundle);
            } else {
                Object obj = bundle.get(Constants.APPBOY_PUSH_EXTRAS_KEY);
                return obj instanceof String ? JsonUtils.m11318i((String) obj) : obj instanceof Bundle ? (Bundle) obj : new Bundle();
            }
        }

        public final int getPushStoryGravityAtIndex(int i, Bundle bundle, String str) {
            C19383o.m32797g(bundle, "notificationExtras");
            C19383o.m32797g(str, "actionFieldKeyTemplate");
            boolean z = false;
            String string = bundle.getString(C19457k.m33023a1(str, "*", String.valueOf(i), false));
            if (string == null || C19457k.m33020X0(string)) {
                z = true;
            }
            if (!z) {
                int hashCode = string.hashCode();
                if (hashCode == -1364013995) {
                    string.equals("center");
                } else if (hashCode == 100571) {
                    return !string.equals(ResponseConstants.PROMOTION_END) ? 17 : 8388613;
                } else {
                    if (hashCode == 109757538 && string.equals("start")) {
                        return 8388611;
                    }
                }
            }
        }

        public final String getTemplateFieldAtIndex(int i, Bundle bundle, String str) {
            C19383o.m32797g(bundle, "notificationExtras");
            C19383o.m32797g(str, "actionFieldKeyTemplate");
            return getTemplateFieldAtIndex(i, bundle, str, "");
        }

        public final Long parseLong(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    return Long.valueOf(bundle.getLong(str));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4928c(str, bundle), 7);
                return null;
            }
        }

        public final String parseNonBlankString(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                String parseString = parseString(bundle, str);
                if (!(parseString == null || C19457k.m33020X0(parseString))) {
                    return parseString;
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4929d(str, bundle), 7);
                return null;
            }
        }

        public final int parseObjectAsInteger(Bundle bundle, String str, int i) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        return Integer.parseInt(obj.toString());
                    }
                }
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4930e(str, bundle), 7);
            }
            return i;
        }

        public final String parseString(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    return bundle.getString(str);
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4931f(str, bundle), 7);
                return null;
            }
        }

        public final boolean parseStringAsBoolean(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return false;
                }
                return Boolean.parseBoolean(string);
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4932g(str, bundle), 7);
                return false;
            }
        }

        public final Integer parseStringAsColorInt(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                return Integer.valueOf((int) Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4933h(str, bundle), 7);
                return null;
            }
        }

        public final Integer parseStringAsInteger(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(string));
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4934i(str, bundle), 7);
                return null;
            }
        }

        public final Long parseStringAsLong(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4935j(str, bundle), 7);
                return null;
            }
        }

        public final String getTemplateFieldAtIndex(int i, Bundle bundle, String str, String str2) {
            C19383o.m32797g(bundle, "notificationExtras");
            C19383o.m32797g(str, "actionFieldKeyTemplate");
            String string = bundle.getString(C19457k.m33023a1(str, "*", String.valueOf(i), false));
            return string == null ? str2 : string;
        }

        public final boolean getTemplateFieldAtIndex(int i, Bundle bundle, String str, boolean z) {
            C19383o.m32797g(bundle, "notificationExtras");
            C19383o.m32797g(str, "actionFieldKeyTemplate");
            String string = bundle.getString(C19457k.m33023a1(str, "*", String.valueOf(i), false));
            if (string == null) {
                return z;
            }
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4926a.f11115b, 4);
                return z;
            }
        }

        public final long getTemplateFieldAtIndex(int i, Bundle bundle, String str, long j) {
            C19383o.m32797g(bundle, "notificationExtras");
            C19383o.m32797g(str, "actionFieldKeyTemplate");
            String string = bundle.getString(C19457k.m33023a1(str, "*", String.valueOf(i), false));
            if (string == null) {
                return j;
            }
            try {
                return Long.parseLong(string);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4927b.f11116b, 4);
                return j;
            }
        }
    }

    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle bundle, int i) {
            C19383o.m32797g(bundle, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.message = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            this.timestamp = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE, 0);
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("Message", this.message));
            sb.append(companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)));
            sb.append(companion.stringAndKey("PersonId", this.personId));
            return sb.toString();
        }
    }

    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle bundle, int i) {
            C19383o.m32797g(bundle, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            this.name = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE, (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE, false);
            this.isBot = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE, false);
        }

        public final String getName() {
            return this.name;
        }

        public final C8109u getPerson() {
            C8109u.C8110a aVar = new C8109u.C8110a();
            aVar.f17708c = this.personId;
            aVar.f17706a = this.name;
            aVar.f17707b = this.uri;
            aVar.f17709d = this.isBot;
            aVar.f17710e = this.isImportant;
            return new C8109u(aVar);
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final String getUri() {
            return this.uri;
        }

        public final boolean isBot() {
            return this.isBot;
        }

        public final boolean isImportant() {
            return this.isImportant;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("PersonId", this.personId));
            sb.append(companion.stringAndKey("Name", this.name));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)));
            sb.append(companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot)));
            return sb.toString();
        }
    }

    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle bundle, int i) {
            C19383o.m32797g(bundle, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.campaignId = companion.parseString(bundle, Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_TITLE_KEY_TEMPLATE);
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_SUBTITLE_KEY_TEMPLATE);
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_ID_KEY_TEMPLATE, "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE);
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void setActionIndex(int i) {
            this.actionIndex = i;
        }

        public final void setBitmapUrl(String str) {
            this.bitmapUrl = str;
        }

        public final void setDeeplink(String str) {
            this.deeplink = str;
        }

        public final void setStoryPageId(String str) {
            this.storyPageId = str;
        }

        public final void setSubtitle(String str) {
            this.subtitle = str;
        }

        public final void setSubtitleGravity(int i) {
            this.subtitleGravity = i;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTitleGravity(int i) {
            this.titleGravity = i;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("CampaignId", this.campaignId));
            sb.append(companion.stringAndKey("Title", this.title));
            sb.append(companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity)));
            sb.append(companion.stringAndKey("Subtitle", this.subtitle));
            sb.append(companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity)));
            sb.append(companion.stringAndKey("BitmapUrl", this.bitmapUrl));
            sb.append(companion.stringAndKey("StoryPageId", this.storyPageId));
            sb.append(companion.stringAndKey("Deeplink", this.deeplink));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            return sb.toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle) {
        this(bundle, (Bundle) null, (Context) null, (BrazeConfigurationProvider) null, 14, (DefaultConstructorMarker) null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2, (Context) null, (BrazeConfigurationProvider) null, 12, (DefaultConstructorMarker) null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context2) {
        this(bundle, bundle2, context2, (BrazeConfigurationProvider) null, 8, (DefaultConstructorMarker) null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context2, BrazeConfigurationProvider brazeConfigurationProvider) {
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.context = context2;
        this.configurationProvider = brazeConfigurationProvider;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    public static final Bundle getAttachedAppboyExtras(Bundle bundle) {
        return Companion.getAttachedAppboyExtras(bundle);
    }

    public static final Bundle getAttachedBrazeExtras(Bundle bundle) {
        return Companion.getAttachedBrazeExtras(bundle);
    }

    public static final int getPushStoryGravityAtIndex(int i, Bundle bundle, String str) {
        return Companion.getPushStoryGravityAtIndex(i, bundle, str);
    }

    public static final long getTemplateFieldAtIndex(int i, Bundle bundle, String str, long j) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, j);
    }

    public static final String getTemplateFieldAtIndex(int i, Bundle bundle, String str) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str);
    }

    public static final String getTemplateFieldAtIndex(int i, Bundle bundle, String str, String str2) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, str2);
    }

    public static final boolean getTemplateFieldAtIndex(int i, Bundle bundle, String str, boolean z) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, z);
    }

    public static final Long parseLong(Bundle bundle, String str) {
        return Companion.parseLong(bundle, str);
    }

    public static final String parseNonBlankString(Bundle bundle, String str) {
        return Companion.parseNonBlankString(bundle, str);
    }

    public static final int parseObjectAsInteger(Bundle bundle, String str, int i) {
        return Companion.parseObjectAsInteger(bundle, str, i);
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            if (!(templateFieldAtIndex == null || C19457k.m33020X0(templateFieldAtIndex))) {
                brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i));
                i++;
            } else {
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        String parseNonBlankString = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY);
        brazeNotificationPayload.bigImageUrl = parseNonBlankString;
        if (parseNonBlankString == null || C19457k.m33020X0(parseNonBlankString)) {
            brazeNotificationPayload.bigImageUrl = companion.parseNonBlankString(brazeNotificationPayload.brazeExtras, Constants.APPBOY_PUSH_BIG_IMAGE_URL_KEY);
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_BIG_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_BIG_TITLE_TEXT_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CONTENT_CARD_SYNC_DATA_KEY);
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY);
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY);
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            if (templateFieldAtIndex == null || C19457k.m33020X0(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i));
            i++;
        }
        int i2 = 0;
        while (true) {
            String templateFieldAtIndex2 = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            if (!(templateFieldAtIndex2 == null || C19457k.m33020X0(templateFieldAtIndex2))) {
                ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i2);
                brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
                i2++;
            } else {
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_DURATION_KEY);
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey(Constants.APPBOY_PUSH_STORY_KEY);
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CATEGORY_KEY);
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_VISIBILITY_KEY);
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_BADGE_COUNT_KEY);
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_PUBLIC_NOTIFICATION_KEY);
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "n");
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS);
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey(Constants.APPBOY_PUSH_INLINE_IMAGE_STYLE_KEY);
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY);
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_PRIORITY_KEY);
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY);
        brazeNotificationPayload.shouldSyncGeofences = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_SYNC_GEOFENCES_KEY);
        brazeNotificationPayload.isUninstallTrackingPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.APPBOY_PUSH_UNINSTALL_TRACKING_KEY) || brazeNotificationPayload.brazeExtras.containsKey(Constants.APPBOY_PUSH_UNINSTALL_TRACKING_KEY);
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.pushStoryPageIndex = Companion.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_STORY_INDEX_KEY, 0);
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            if (!(templateFieldAtIndex == null || C19457k.m33020X0(templateFieldAtIndex))) {
                brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i));
                i++;
            } else {
                brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED, false);
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_TITLE_KEY);
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CONTENT_KEY);
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_LARGE_ICON_KEY);
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_KEY);
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_ACCENT_KEY);
    }

    public static final String parseString(Bundle bundle, String str) {
        return Companion.parseString(bundle, str);
    }

    public static final boolean parseStringAsBoolean(Bundle bundle, String str) {
        return Companion.parseStringAsBoolean(bundle, str);
    }

    public static final Integer parseStringAsColorInt(Bundle bundle, String str) {
        return Companion.parseStringAsColorInt(bundle, str);
    }

    public static final Integer parseStringAsInteger(Bundle bundle, String str) {
        return Companion.parseStringAsInteger(bundle, str);
    }

    public static final Long parseStringAsLong(Bundle bundle, String str) {
        return Companion.parseStringAsLong(bundle, str);
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final Long getNotificationReceivedTimestampMillis() {
        return this.notificationReceivedTimestampMillis;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldSyncGeofences() {
        return this.shouldSyncGeofences;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final boolean isConversationalPush() {
        return this.isConversationalPush;
    }

    public final boolean isInlineImagePush() {
        return this.isInlineImagePush;
    }

    public final boolean isNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    public final boolean isPushStory() {
        return this.isPushStory;
    }

    public final boolean isUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setAccentColor(Integer num) {
        this.accentColor = num;
    }

    public final void setActionButtons(List<ActionButton> list) {
        C19383o.m32797g(list, "actionButtons");
        this.actionButtonsInternal = list;
    }

    public final void setBigImageUrl(String str) {
        this.bigImageUrl = str;
    }

    public final void setBigSummaryText(String str) {
        this.bigSummaryText = str;
    }

    public final void setBigTitleText(String str) {
        this.bigTitleText = str;
    }

    public final void setBrazeExtras(Bundle bundle) {
        C19383o.m32797g(bundle, "<set-?>");
        this.brazeExtras = bundle;
    }

    public final void setConfigurationProvider(BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setContentCardSyncData(String str) {
        this.contentCardSyncData = str;
    }

    public final void setContentCardSyncUserId(String str) {
        this.contentCardSyncUserId = str;
    }

    public final void setContentText(String str) {
        this.contentText = str;
    }

    public final void setContext(Context context2) {
        this.context = context2;
    }

    public final void setConversationShortcutId(String str) {
        this.conversationShortcutId = str;
    }

    public final void setConversationalPush(boolean z) {
        this.isConversationalPush = z;
    }

    public final void setCustomNotificationId(Integer num) {
        this.customNotificationId = num;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final void setInlineImagePush(boolean z) {
        this.isInlineImagePush = z;
    }

    public final void setIsInlineImagePush(boolean z) {
        this.isInlineImagePush = z;
    }

    public final void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public final void setNewlyReceivedPushStory(boolean z) {
        this.isNewlyReceivedPushStory = z;
    }

    public final void setNotificationBadgeNumber(Integer num) {
        this.notificationBadgeNumber = num;
    }

    public final void setNotificationCategory(String str) {
        this.notificationCategory = str;
    }

    public final void setNotificationChannelId(String str) {
        this.notificationChannelId = str;
    }

    public final void setNotificationPriorityInt(Integer num) {
        this.notificationPriorityInt = num;
    }

    public final void setNotificationReceivedTimestampMillis(Long l) {
        this.notificationReceivedTimestampMillis = l;
    }

    public final void setNotificationSound(String str) {
        this.notificationSound = str;
    }

    public final void setNotificationVisibility(Integer num) {
        this.notificationVisibility = num;
    }

    public final void setPublicNotificationExtras(String str) {
        this.publicNotificationExtras = str;
    }

    public final void setPushDuration(Integer num) {
        this.pushDuration = num;
    }

    public final void setPushStory(boolean z) {
        this.isPushStory = z;
    }

    public final void setPushStoryPageIndex(int i) {
        this.pushStoryPageIndex = i;
    }

    public final void setPushStoryPages(List<PushStoryPage> list) {
        C19383o.m32797g(list, "pushStoryPages");
        this.pushStoryPagesInternal = list;
    }

    public final void setShouldFetchTestTriggers(boolean z) {
        this.shouldFetchTestTriggers = z;
    }

    public final void setShouldSyncGeofences(boolean z) {
        this.shouldSyncGeofences = z;
    }

    public final void setSummaryText(String str) {
        this.summaryText = str;
    }

    public final void setTitleText(String str) {
        this.titleText = str;
    }

    public final void setUninstallTrackingPush(boolean z) {
        this.isUninstallTrackingPush = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Companion companion = Companion;
        sb.append(companion.stringAndKey("PushDuration", this.pushDuration));
        sb.append(companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory)));
        sb.append(companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush)));
        sb.append(companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush)));
        sb.append(companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras));
        sb.append(companion.stringAndKey("NotificationChannelId", this.notificationChannelId));
        sb.append(companion.stringAndKey("NotificationCategory", this.notificationCategory));
        sb.append(companion.stringAndKey("NotificationVisibility", this.notificationVisibility));
        sb.append(companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber));
        sb.append(companion.stringAndKey("CustomNotificationId", this.customNotificationId));
        sb.append(companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis));
        sb.append(companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData));
        sb.append(companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId));
        sb.append(companion.stringAndKey("TitleText", this.titleText));
        sb.append(companion.stringAndKey("ContentText", this.contentText));
        sb.append(companion.stringAndKey("LargeIcon", this.largeIcon));
        sb.append(companion.stringAndKey("NotificationSound", this.notificationSound));
        sb.append(companion.stringAndKey("SummaryText", this.summaryText));
        sb.append(companion.stringAndKey("AccentColor", this.accentColor));
        sb.append(companion.stringAndKey("BigSummaryText", this.bigSummaryText));
        sb.append(companion.stringAndKey("BigTitleText", this.bigTitleText));
        sb.append(companion.stringAndKey("BigImageUrl", this.bigImageUrl));
        sb.append(companion.stringAndKey("ActionButtons", getActionButtons()));
        sb.append(companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex)));
        sb.append(companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal));
        sb.append(companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal));
        sb.append(companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal));
        sb.append(companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId));
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context2, BrazeConfigurationProvider brazeConfigurationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, (i & 2) != 0 ? Companion.getAttachedBrazeExtras(bundle) : bundle2, (i & 4) != 0 ? null : context2, (i & 8) != 0 ? null : brazeConfigurationProvider);
    }
}
