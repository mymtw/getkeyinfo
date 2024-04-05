package com.etsy.android.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.etsy.android.lib.logger.C8694h;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class EtsyArray extends BaseModel implements Parcelable {
    public static final Parcelable.Creator<EtsyArray> CREATOR = new C8713a();
    private static final long serialVersionUID = 8806610668463280833L;
    public JSONObject mData;

    /* renamed from: com.etsy.android.lib.models.EtsyArray$a */
    public class C8713a implements Parcelable.Creator<EtsyArray> {
        public final Object createFromParcel(Parcel parcel) {
            return new EtsyArray(parcel);
        }

        public final Object[] newArray(int i) {
            return new EtsyArray[i];
        }
    }

    public EtsyArray() {
    }

    public int describeContents() {
        return 0;
    }

    public JSONObject getData() {
        return this.mData;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        try {
            this.mData = new JSONObject(jsonParser.readValueAsTree().toString());
        } catch (JSONException e) {
            C8694h.f19097a.mo21309d("EtsyArray parseData error", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.mData;
        parcel.writeString(jSONObject != null ? jSONObject.toString() : "");
    }

    public EtsyArray(Parcel parcel) {
        try {
            this.mData = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            this.mData = null;
        }
    }
}
