package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.MessageType;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C4230u0;
import p030bo.app.C4274x1;

/* renamed from: com.braze.models.inappmessage.j */
public final class C5492j extends InAppMessageImmersiveBase {
    public C5492j() {
    }

    /* renamed from: P */
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = super.mo15961P();
            try {
                jSONObject.put("type", MessageType.MODAL.name());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: R */
    public final MessageType mo16002R() {
        return MessageType.MODAL;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5492j(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        CropType cropType;
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
        if (this.f11813H == ImageStyle.GRAPHIC) {
            cropType = CropType.CENTER_CROP;
        } else {
            cropType = CropType.FIT_CENTER;
        }
        try {
            C4230u0 u0Var = C4230u0.f9378a;
            String string = jSONObject.getString("crop_type");
            C19383o.m32796f(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
            String upperCase = string.toUpperCase(locale);
            C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            CropType[] values = CropType.values();
            int i = 0;
            int length = values.length;
            while (i < length) {
                CropType cropType2 = values[i];
                i++;
                if (C19383o.m32792b(cropType2.name(), upperCase)) {
                    cropType = cropType2;
                    C19383o.m32797g(cropType, "<set-?>");
                    this.f11762m = cropType;
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }
}
