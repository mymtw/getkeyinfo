package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
import p193o.C7494b;
import p517bn.C14130u;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    @SafeParcelable.Field(mo49213id = 2)
    public Bundle bundle;
    private Map<String, String> data;
    private C16583a notification;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$a */
    public static class C16583a {
        public C16583a(C14130u uVar) {
            uVar.mo47022i("gcm.n.title");
            uVar.mo47022i("gcm.n.title".concat("_loc_key"));
            Object[] f = uVar.mo47019f("gcm.n.title");
            if (f != null) {
                String[] strArr = new String[f.length];
                for (int i = 0; i < f.length; i++) {
                    strArr[i] = String.valueOf(f[i]);
                }
            }
            uVar.mo47022i("gcm.n.body");
            uVar.mo47022i("gcm.n.body".concat("_loc_key"));
            Object[] f2 = uVar.mo47019f("gcm.n.body");
            if (f2 != null) {
                String[] strArr2 = new String[f2.length];
                for (int i2 = 0; i2 < f2.length; i2++) {
                    strArr2[i2] = String.valueOf(f2[i2]);
                }
            }
            uVar.mo47022i("gcm.n.icon");
            if (TextUtils.isEmpty(uVar.mo47022i("gcm.n.sound2"))) {
                uVar.mo47022i("gcm.n.sound");
            }
            uVar.mo47022i("gcm.n.tag");
            uVar.mo47022i("gcm.n.color");
            uVar.mo47022i("gcm.n.click_action");
            uVar.mo47022i("gcm.n.android_channel_id");
            uVar.mo47018e();
            uVar.mo47022i("gcm.n.image");
            uVar.mo47022i("gcm.n.ticker");
            uVar.mo47015b("gcm.n.notification_priority");
            uVar.mo47015b("gcm.n.visibility");
            uVar.mo47015b("gcm.n.notification_count");
            uVar.mo47014a("gcm.n.sticky");
            uVar.mo47014a("gcm.n.local_only");
            uVar.mo47014a("gcm.n.default_sound");
            uVar.mo47014a("gcm.n.default_vibrate_timings");
            uVar.mo47014a("gcm.n.default_light_settings");
            uVar.mo47020g();
            uVar.mo47017d();
            uVar.mo47023j();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(mo49216id = 2) Bundle bundle2) {
        this.bundle = bundle2;
    }

    private int getMessagePriority(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String getCollapseKey() {
        return this.bundle.getString("collapse_key");
    }

    public Map<String, String> getData() {
        if (this.data == null) {
            Bundle bundle2 = this.bundle;
            C7494b bVar = new C7494b();
            for (String next : bundle2.keySet()) {
                Object obj = bundle2.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals(ResponseConstants.FROM) && !next.equals("message_type") && !next.equals("collapse_key")) {
                        bVar.put(next, str);
                    }
                }
            }
            this.data = bVar;
        }
        return this.data;
    }

    public String getFrom() {
        return this.bundle.getString(ResponseConstants.FROM);
    }

    public String getMessageId() {
        String string = this.bundle.getString("google.message_id");
        return string == null ? this.bundle.getString("message_id") : string;
    }

    public String getMessageType() {
        return this.bundle.getString("message_type");
    }

    public C16583a getNotification() {
        if (this.notification == null && C14130u.m21867k(this.bundle)) {
            this.notification = new C16583a(new C14130u(this.bundle));
        }
        return this.notification;
    }

    public int getOriginalPriority() {
        String string = this.bundle.getString("google.original_priority");
        if (string == null) {
            string = this.bundle.getString("google.priority");
        }
        return getMessagePriority(string);
    }

    public int getPriority() {
        String string = this.bundle.getString("google.delivered_priority");
        if (string == null) {
            if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.bundle.getString("google.priority");
        }
        return getMessagePriority(string);
    }

    @ShowFirstParty
    public byte[] getRawData() {
        return this.bundle.getByteArray("rawData");
    }

    public String getSenderId() {
        return this.bundle.getString("google.c.sender.id");
    }

    public long getSentTime() {
        Object obj = this.bundle.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: ".concat(String.valueOf(obj)));
            return 0;
        }
    }

    public String getTo() {
        return this.bundle.getString("google.to");
    }

    public int getTtl() {
        Object obj = this.bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(obj)));
            return 0;
        }
    }

    public void populateSendMessageIntent(Intent intent) {
        intent.putExtras(this.bundle);
    }

    @KeepForSdk
    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.bundle);
        return intent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        RemoteMessageCreator.writeToParcel(this, parcel, i);
    }
}
