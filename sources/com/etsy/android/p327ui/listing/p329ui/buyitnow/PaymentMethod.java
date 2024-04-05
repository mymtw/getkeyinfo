package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.PaymentMethod */
public final class PaymentMethod implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
    private final CardType cardType;
    private final String name;
    private final String value;

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.PaymentMethod$Creator */
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        public final PaymentMethod createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new PaymentMethod(parcel.readString(), parcel.readString(), CardType.valueOf(parcel.readString()));
        }

        public final PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    }

    public PaymentMethod() {
        this((String) null, (String) null, (CardType) null, 7, (DefaultConstructorMarker) null);
    }

    public PaymentMethod(String str, String str2, CardType cardType2) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "value");
        C19383o.m32797g(cardType2, "cardType");
        this.name = str;
        this.value = str2;
        this.cardType = cardType2;
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, CardType cardType2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethod.name;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethod.value;
        }
        if ((i & 4) != 0) {
            cardType2 = paymentMethod.cardType;
        }
        return paymentMethod.copy(str, str2, cardType2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final CardType component3() {
        return this.cardType;
    }

    public final PaymentMethod copy(String str, String str2, CardType cardType2) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "value");
        C19383o.m32797g(cardType2, "cardType");
        return new PaymentMethod(str, str2, cardType2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return C19383o.m32792b(this.name, paymentMethod.name) && C19383o.m32792b(this.value, paymentMethod.value) && this.cardType == paymentMethod.cardType;
    }

    public final CardType getCardType() {
        return this.cardType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.cardType.hashCode() + C0023f.m105e(this.value, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PaymentMethod(name=");
        h.append(this.name);
        h.append(", value=");
        h.append(this.value);
        h.append(", cardType=");
        h.append(this.cardType);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeString(this.cardType.name());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentMethod(String str, String str2, CardType cardType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CardType.GENERIC : cardType2);
    }
}
