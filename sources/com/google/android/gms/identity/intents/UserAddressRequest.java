package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.List;

@SafeParcelable.Class(creator = "UserAddressRequestCreator")
@SafeParcelable.Reserved({1})
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new zzd();
    @SafeParcelable.Field(mo49213id = 2)
    public List<CountrySpecification> zzf;

    /* renamed from: com.google.android.gms.identity.intents.UserAddressRequest$a */
    public final class C14460a {
    }

    public UserAddressRequest() {
    }

    @SafeParcelable.Constructor
    public UserAddressRequest(@SafeParcelable.Param(mo49216id = 2) List<CountrySpecification> list) {
        this.zzf = list;
    }

    public static C14460a newBuilder() {
        new UserAddressRequest();
        return new C14460a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
