package p030bo.app;

import com.appboy.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p005a4.C0035b;

/* renamed from: bo.app.c1 */
public enum C3600c1 implements C0035b<String> {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE(Constants.APPBOY_PUSH_PRIORITY_KEY),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("add"),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    INAPP_MESSAGE_DISPLAY_FAILURE("sfe"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    TEST_TYPE("tt"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar"),
    SUBSCRIPTION_GROUP_UPDATE("sgu"),
    UNKNOWN("");
    

    /* renamed from: c */
    public static final C3601a f8273c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<String, C3600c1> f8274d = null;

    /* renamed from: b */
    private final String f8297b;

    /* renamed from: bo.app.c1$a */
    public static final class C3601a {
        private C3601a() {
        }

        public /* synthetic */ C3601a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3600c1 mo13155a(String str) {
            C19383o.m32797g(str, "value");
            Object obj = C3600c1.f8274d.get(str);
            if (obj == null) {
                obj = C3600c1.UNKNOWN;
            }
            return (C3600c1) obj;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        int i2;
        f8273c = new C3601a((DefaultConstructorMarker) null);
        C3600c1[] values = values();
        int T = C19421p.m32930T(values.length);
        if (T >= 16) {
            i2 = T;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
        int length = values.length;
        while (i < length) {
            C3600c1 c1Var = values[i];
            i++;
            linkedHashMap.put(c1Var.f8297b, c1Var);
        }
        f8274d = linkedHashMap;
    }

    private C3600c1(String str) {
        this.f8297b = str;
    }

    /* renamed from: w */
    public String forJsonPut() {
        return this.f8297b;
    }
}
