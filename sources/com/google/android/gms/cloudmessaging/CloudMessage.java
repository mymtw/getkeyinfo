package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
import p193o.C7494b;

@SafeParcelable.Class(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    @SafeParcelable.Field(mo49213id = 1)
    public Intent zza;
    private Map<String, String> zzb;

    @SafeParcelable.Constructor
    public CloudMessage(@SafeParcelable.Param(mo49216id = 1) Intent intent) {
        this.zza = intent;
    }

    private static int zza(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String getCollapseKey() {
        return this.zza.getStringExtra("collapse_key");
    }

    public synchronized Map<String, String> getData() {
        if (this.zzb == null) {
            Bundle extras = this.zza.getExtras();
            C7494b bVar = new C7494b();
            if (extras != null) {
                for (String next : extras.keySet()) {
                    Object obj = extras.get(next);
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!next.startsWith("google.") && !next.equals(ResponseConstants.FROM) && !next.equals("message_type") && !next.equals("collapse_key")) {
                            bVar.put(next, str);
                        }
                    }
                }
            }
            this.zzb = bVar;
        }
        return this.zzb;
    }

    public String getFrom() {
        return this.zza.getStringExtra(ResponseConstants.FROM);
    }

    public Intent getIntent() {
        return this.zza;
    }

    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra("google.message_id");
        return stringExtra == null ? this.zza.getStringExtra("message_id") : stringExtra;
    }

    public String getMessageType() {
        return this.zza.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra("google.original_priority");
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zza(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.zza.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.zza.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zza(stringExtra);
    }

    public byte[] getRawData() {
        return this.zza.getByteArrayExtra("rawData");
    }

    public String getSenderId() {
        return this.zza.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.sent_time") : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(valueOf);
            Log.w("CloudMessage", sb.toString());
            return 0;
        }
    }

    public String getTo() {
        return this.zza.getStringExtra("google.to");
    }

    public int getTtl() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.ttl") : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("CloudMessage", sb.toString());
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
