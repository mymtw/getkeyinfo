package com.braze.models.inappmessage;

import android.graphics.Bitmap;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C4274x1;

/* renamed from: com.braze.models.inappmessage.k */
public abstract class C5493k extends InAppMessageBase implements C5487e {

    /* renamed from: A */
    public boolean f11844A;

    /* renamed from: B */
    public String f11845B;

    /* renamed from: C */
    public String f11846C;

    /* renamed from: z */
    public Bitmap f11847z;

    public C5493k() {
    }

    /* renamed from: A */
    public final String mo16031A() {
        return this.f11845B;
    }

    /* renamed from: G */
    public final void mo15954G(Map<String, String> map) {
        C19383o.m32797g(map, "remotePathToLocalAssetMap");
        if (!map.isEmpty()) {
            Object[] array = map.values().toArray(new String[0]);
            if (array != null) {
                this.f11845B = ((String[]) array)[0];
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    /* renamed from: M */
    public final List<String> mo15958M() {
        ArrayList arrayList = new ArrayList();
        String str = this.f11846C;
        if (str != null && (!C19457k.m33020X0(str))) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: P */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = super.forJsonPut();
            try {
                jSONObject.putOpt(ResponseConstants.IMAGE_URL, this.f11846C);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: v */
    public final String mo16032v() {
        return this.f11846C;
    }

    /* renamed from: w */
    public final Bitmap mo16033w() {
        return this.f11847z;
    }

    /* renamed from: x */
    public final void mo16034x() {
        this.f11845B = null;
    }

    /* renamed from: y */
    public final void mo16035y() {
        this.f11844A = true;
    }

    /* renamed from: z */
    public final void mo16036z(Bitmap bitmap) {
        this.f11847z = bitmap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5493k(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
        this.f11846C = jSONObject.optString(ResponseConstants.IMAGE_URL);
    }
}
