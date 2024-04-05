package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class GiftCardInfoV3JsonAdapter extends JsonAdapter<GiftCardInfoV3> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("recipient_name", "sender_name", "is_email", ResponseConstants.AMOUNT, "message", "design_id", "recipient_email");

    public GiftCardInfoV3JsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "recipientName");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isEmail");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "designId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(GiftCardInfoV3)";
    }

    public GiftCardInfoV3 fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new GiftCardInfoV3(str, str2, bool, str3, str4, num, str5);
    }

    public void toJson(C17412w wVar, GiftCardInfoV3 giftCardInfoV3) {
        C19383o.m32797g(wVar, "writer");
        if (giftCardInfoV3 != null) {
            wVar.mo68522b();
            wVar.mo68529h("recipient_name");
            this.nullableStringAdapter.toJson(wVar, giftCardInfoV3.getRecipientName());
            wVar.mo68529h("sender_name");
            this.nullableStringAdapter.toJson(wVar, giftCardInfoV3.getSenderName());
            wVar.mo68529h("is_email");
            this.nullableBooleanAdapter.toJson(wVar, giftCardInfoV3.isEmail());
            wVar.mo68529h(ResponseConstants.AMOUNT);
            this.nullableStringAdapter.toJson(wVar, giftCardInfoV3.getStringAmount());
            wVar.mo68529h("message");
            this.nullableStringAdapter.toJson(wVar, giftCardInfoV3.getMessage());
            wVar.mo68529h("design_id");
            this.nullableIntAdapter.toJson(wVar, giftCardInfoV3.getDesignId());
            wVar.mo68529h("recipient_email");
            this.nullableStringAdapter.toJson(wVar, giftCardInfoV3.getRecipientEmail());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
