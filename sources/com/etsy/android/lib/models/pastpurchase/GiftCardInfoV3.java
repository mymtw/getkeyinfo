package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class GiftCardInfoV3 {
    public static final int $stable = 0;
    private final Integer designId;
    private final Boolean isEmail;
    private final String message;
    private final String recipientEmail;
    private final String recipientName;
    private final String senderName;
    private final String stringAmount;

    public GiftCardInfoV3(@C17402n(name = "recipient_name") String str, @C17402n(name = "sender_name") String str2, @C17402n(name = "is_email") Boolean bool, @C17402n(name = "amount") String str3, @C17402n(name = "message") String str4, @C17402n(name = "design_id") Integer num, @C17402n(name = "recipient_email") String str5) {
        this.recipientName = str;
        this.senderName = str2;
        this.isEmail = bool;
        this.stringAmount = str3;
        this.message = str4;
        this.designId = num;
        this.recipientEmail = str5;
    }

    public static /* synthetic */ GiftCardInfoV3 copy$default(GiftCardInfoV3 giftCardInfoV3, String str, String str2, Boolean bool, String str3, String str4, Integer num, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftCardInfoV3.recipientName;
        }
        if ((i & 2) != 0) {
            str2 = giftCardInfoV3.senderName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            bool = giftCardInfoV3.isEmail;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str3 = giftCardInfoV3.stringAmount;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = giftCardInfoV3.message;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            num = giftCardInfoV3.designId;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            str5 = giftCardInfoV3.recipientEmail;
        }
        return giftCardInfoV3.copy(str, str6, bool2, str7, str8, num2, str5);
    }

    public final String component1() {
        return this.recipientName;
    }

    public final String component2() {
        return this.senderName;
    }

    public final Boolean component3() {
        return this.isEmail;
    }

    public final String component4() {
        return this.stringAmount;
    }

    public final String component5() {
        return this.message;
    }

    public final Integer component6() {
        return this.designId;
    }

    public final String component7() {
        return this.recipientEmail;
    }

    public final GiftCardInfoV3 copy(@C17402n(name = "recipient_name") String str, @C17402n(name = "sender_name") String str2, @C17402n(name = "is_email") Boolean bool, @C17402n(name = "amount") String str3, @C17402n(name = "message") String str4, @C17402n(name = "design_id") Integer num, @C17402n(name = "recipient_email") String str5) {
        return new GiftCardInfoV3(str, str2, bool, str3, str4, num, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardInfoV3)) {
            return false;
        }
        GiftCardInfoV3 giftCardInfoV3 = (GiftCardInfoV3) obj;
        return C19383o.m32792b(this.recipientName, giftCardInfoV3.recipientName) && C19383o.m32792b(this.senderName, giftCardInfoV3.senderName) && C19383o.m32792b(this.isEmail, giftCardInfoV3.isEmail) && C19383o.m32792b(this.stringAmount, giftCardInfoV3.stringAmount) && C19383o.m32792b(this.message, giftCardInfoV3.message) && C19383o.m32792b(this.designId, giftCardInfoV3.designId) && C19383o.m32792b(this.recipientEmail, giftCardInfoV3.recipientEmail);
    }

    public final Integer getDesignId() {
        return this.designId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRecipientEmail() {
        return this.recipientEmail;
    }

    public final String getRecipientName() {
        return this.recipientName;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final String getStringAmount() {
        return this.stringAmount;
    }

    public int hashCode() {
        String str = this.recipientName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.senderName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isEmail;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.stringAmount;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.designId;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.recipientEmail;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    public final Boolean isEmail() {
        return this.isEmail;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GiftCardInfoV3(recipientName=");
        h.append(this.recipientName);
        h.append(", senderName=");
        h.append(this.senderName);
        h.append(", isEmail=");
        h.append(this.isEmail);
        h.append(", stringAmount=");
        h.append(this.stringAmount);
        h.append(", message=");
        h.append(this.message);
        h.append(", designId=");
        h.append(this.designId);
        h.append(", recipientEmail=");
        return C0391c.m1057c(h, this.recipientEmail, ')');
    }
}
