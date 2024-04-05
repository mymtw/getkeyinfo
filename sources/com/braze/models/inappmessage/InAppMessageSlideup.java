package com.braze.models.inappmessage;

import android.graphics.Color;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C3621d3;
import p030bo.app.C4274x1;
import p753kq.C19846a;

public final class InAppMessageSlideup extends C5493k {

    /* renamed from: D */
    public SlideFrom f11824D;

    /* renamed from: E */
    public int f11825E;

    /* renamed from: com.braze.models.inappmessage.InAppMessageSlideup$a */
    public static final class C5478a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5478a f11826b = new C5478a();

        public C5478a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageSlideup$b */
    public static final class C5479b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5479b f11827b = new C5479b();

        public C5479b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error creating JSON.";
        }
    }

    public InAppMessageSlideup() {
        this.f11824D = SlideFrom.BOTTOM;
        this.f11825E = Color.parseColor("#9B9B9B");
        TextAlign textAlign = TextAlign.START;
        C19383o.m32797g(textAlign, "<set-?>");
        this.f11763n = textAlign;
    }

    /* renamed from: P */
    public final JSONObject mo15961P() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = super.forJsonPut();
            try {
                jSONObject.put("slide_from", this.f11824D.toString());
                jSONObject.put("close_btn_color", this.f11825E);
                jSONObject.put("type", MessageType.SLIDEUP.name());
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5479b.f11827b, 4);
            }
        }
        return jSONObject;
    }

    /* renamed from: R */
    public final MessageType mo16002R() {
        return MessageType.SLIDEUP;
    }

    /* renamed from: e */
    public final void mo15972e() {
        super.mo15972e();
        C3621d3 d3Var = this.f11774y;
        if (d3Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.D, (Throwable) null, C5478a.f11826b, 6);
            return;
        }
        Integer b = d3Var.mo13198b();
        if ((b == null || b.intValue() != -1) && d3Var.mo13198b() != null) {
            this.f11825E = d3Var.mo13198b().intValue();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageSlideup(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
        SlideFrom slideFrom = SlideFrom.BOTTOM;
        SlideFrom slideFrom2 = (SlideFrom) JsonUtils.m11317h(jSONObject, "slide_from", SlideFrom.class, slideFrom);
        int optInt = jSONObject.optInt("close_btn_color");
        this.f11824D = slideFrom;
        this.f11825E = Color.parseColor("#9B9B9B");
        if (slideFrom2 != null) {
            this.f11824D = slideFrom2;
        }
        this.f11825E = optInt;
        CropType cropType = (CropType) JsonUtils.m11317h(jSONObject, "crop_type", CropType.class, CropType.FIT_CENTER);
        C19383o.m32797g(cropType, "<set-?>");
        this.f11762m = cropType;
        TextAlign textAlign = (TextAlign) JsonUtils.m11317h(jSONObject, "text_align_message", TextAlign.class, TextAlign.START);
        C19383o.m32797g(textAlign, "<set-?>");
        this.f11763n = textAlign;
    }
}
