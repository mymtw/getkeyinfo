package com.appboy.models.outgoing;

import androidx.compose.animation.C0391c;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0035b;
import p753kq.C19846a;

public final class AttributionData implements C0035b<JSONObject> {
    private static final String ADGROUP_KEY = "adgroup";
    private static final String CAMPAIGN_KEY = "campaign";
    private static final String CREATIVE_KEY = "ad";
    public static final C4920a Companion = new C4920a((DefaultConstructorMarker) null);
    private static final String NETWORK_KEY = "source";
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

    /* renamed from: com.appboy.models.outgoing.AttributionData$a */
    public static final class C4920a {
        private C4920a() {
        }

        public /* synthetic */ C4920a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.appboy.models.outgoing.AttributionData$b */
    public static final class C4921b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4921b f11112b = new C4921b();

        public C4921b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating AttributionData Json.";
        }
    }

    public AttributionData(String str, String str2, String str3, String str4) {
        C0391c.m1060g(str, "network", str2, CAMPAIGN_KEY, str3, "adGroup", str4, "creative");
        this.network = str;
        this.campaign = str2;
        this.adGroup = str3;
        this.creative = str4;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!C19457k.m33020X0(this.network)) {
                jSONObject.put(NETWORK_KEY, this.network);
            }
            if (!C19457k.m33020X0(this.campaign)) {
                jSONObject.put(CAMPAIGN_KEY, this.campaign);
            }
            if (!C19457k.m33020X0(this.adGroup)) {
                jSONObject.put(ADGROUP_KEY, this.adGroup);
            }
            if (!C19457k.m33020X0(this.creative)) {
                jSONObject.put(CREATIVE_KEY, this.creative);
            }
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4921b.f11112b, 4);
        }
        return jSONObject;
    }
}
