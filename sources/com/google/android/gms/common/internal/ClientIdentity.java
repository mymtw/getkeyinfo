package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({1000})
public class ClientIdentity extends AbstractSafeParcelable {
    @RecentlyNonNull
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();
    @SafeParcelable.Field(defaultValueUnchecked = "0", mo49213id = 1)
    private final int zaa;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo49213id = 2)
    private final String zab;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) String str) {
        this.zaa = i;
        this.zab = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.zaa == this.zaa && Objects.equal(clientIdentity.zab, this.zab);
    }

    public int hashCode() {
        return this.zaa;
    }

    @RecentlyNonNull
    public String toString() {
        int i = this.zaa;
        String str = this.zab;
        StringBuilder sb = new StringBuilder(C0391c.m1055a(str, 12));
        sb.append(i);
        sb.append(MessageDraft.IMAGE_DELIMITER);
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
