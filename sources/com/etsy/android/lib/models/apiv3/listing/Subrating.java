package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class Subrating {
    public static final int $stable = 0;
    private final Float average;

    @C17403o(generateAdapter = true)
    public static final class ItemQuality extends Subrating implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ItemQuality> CREATOR = new Creator();
        private final Float average;

        public static final class Creator implements Parcelable.Creator<ItemQuality> {
            public final ItemQuality createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return new ItemQuality(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            public final ItemQuality[] newArray(int i) {
                return new ItemQuality[i];
            }
        }

        public ItemQuality(@C17402n(name = "average") Float f) {
            super(f, (DefaultConstructorMarker) null);
            this.average = f;
        }

        public static /* synthetic */ ItemQuality copy$default(ItemQuality itemQuality, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = itemQuality.getAverage();
            }
            return itemQuality.copy(f);
        }

        public final Float component1() {
            return getAverage();
        }

        public final ItemQuality copy(@C17402n(name = "average") Float f) {
            return new ItemQuality(f);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemQuality) && C19383o.m32792b(getAverage(), ((ItemQuality) obj).getAverage());
        }

        public Float getAverage() {
            return this.average;
        }

        public int hashCode() {
            if (getAverage() == null) {
                return 0;
            }
            return getAverage().hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("ItemQuality(average=");
            h.append(getAverage());
            h.append(')');
            return h.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            Float f = this.average;
            if (f == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    @C17403o(generateAdapter = true)
    public static final class SellerCustomerService extends Subrating implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SellerCustomerService> CREATOR = new Creator();
        private final Float average;

        public static final class Creator implements Parcelable.Creator<SellerCustomerService> {
            public final SellerCustomerService createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return new SellerCustomerService(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            public final SellerCustomerService[] newArray(int i) {
                return new SellerCustomerService[i];
            }
        }

        public SellerCustomerService(@C17402n(name = "average") Float f) {
            super(f, (DefaultConstructorMarker) null);
            this.average = f;
        }

        public static /* synthetic */ SellerCustomerService copy$default(SellerCustomerService sellerCustomerService, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = sellerCustomerService.getAverage();
            }
            return sellerCustomerService.copy(f);
        }

        public final Float component1() {
            return getAverage();
        }

        public final SellerCustomerService copy(@C17402n(name = "average") Float f) {
            return new SellerCustomerService(f);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SellerCustomerService) && C19383o.m32792b(getAverage(), ((SellerCustomerService) obj).getAverage());
        }

        public Float getAverage() {
            return this.average;
        }

        public int hashCode() {
            if (getAverage() == null) {
                return 0;
            }
            return getAverage().hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("SellerCustomerService(average=");
            h.append(getAverage());
            h.append(')');
            return h.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            Float f = this.average;
            if (f == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    @C17403o(generateAdapter = true)
    public static final class Shipping extends Subrating implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private final Float average;

        public static final class Creator implements Parcelable.Creator<Shipping> {
            public final Shipping createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return new Shipping(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            public final Shipping[] newArray(int i) {
                return new Shipping[i];
            }
        }

        public Shipping(@C17402n(name = "average") Float f) {
            super(f, (DefaultConstructorMarker) null);
            this.average = f;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = shipping.getAverage();
            }
            return shipping.copy(f);
        }

        public final Float component1() {
            return getAverage();
        }

        public final Shipping copy(@C17402n(name = "average") Float f) {
            return new Shipping(f);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Shipping) && C19383o.m32792b(getAverage(), ((Shipping) obj).getAverage());
        }

        public Float getAverage() {
            return this.average;
        }

        public int hashCode() {
            if (getAverage() == null) {
                return 0;
            }
            return getAverage().hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Shipping(average=");
            h.append(getAverage());
            h.append(')');
            return h.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            Float f = this.average;
            if (f == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    private Subrating(Float f) {
        this.average = f;
    }

    public /* synthetic */ Subrating(Float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    public Float getAverage() {
        return this.average;
    }
}
