package com.etsy.android.p327ui.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.view.View;
import com.etsy.android.stylekit.views.CollageAlert;
import java.io.Serializable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.view.AlertData */
public final class AlertData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlertData> CREATOR = new Creator();
    private final CollageAlert.AlertType alertType;
    private final String body;
    private final Integer bodyIcon;
    private final long duration;
    private final int icon;
    private final C19857l<View, C19394m> onClickListener;
    private final String title;

    /* renamed from: com.etsy.android.ui.view.AlertData$Creator */
    public static final class Creator implements Parcelable.Creator<AlertData> {
        public final AlertData createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new AlertData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), CollageAlert.AlertType.valueOf(parcel.readString()), parcel.readLong(), (C19857l) parcel.readSerializable());
        }

        public final AlertData[] newArray(int i) {
            return new AlertData[i];
        }
    }

    public AlertData(int i, String str, String str2, Integer num, CollageAlert.AlertType alertType2, long j, C19857l<? super View, C19394m> lVar) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(alertType2, "alertType");
        this.icon = i;
        this.title = str;
        this.body = str2;
        this.bodyIcon = num;
        this.alertType = alertType2;
        this.duration = j;
        this.onClickListener = lVar;
    }

    public static /* synthetic */ AlertData copy$default(AlertData alertData, int i, String str, String str2, Integer num, CollageAlert.AlertType alertType2, long j, C19857l lVar, int i2, Object obj) {
        AlertData alertData2 = alertData;
        return alertData.copy((i2 & 1) != 0 ? alertData2.icon : i, (i2 & 2) != 0 ? alertData2.title : str, (i2 & 4) != 0 ? alertData2.body : str2, (i2 & 8) != 0 ? alertData2.bodyIcon : num, (i2 & 16) != 0 ? alertData2.alertType : alertType2, (i2 & 32) != 0 ? alertData2.duration : j, (i2 & 64) != 0 ? alertData2.onClickListener : lVar);
    }

    public final int component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final Integer component4() {
        return this.bodyIcon;
    }

    public final CollageAlert.AlertType component5() {
        return this.alertType;
    }

    public final long component6() {
        return this.duration;
    }

    public final C19857l<View, C19394m> component7() {
        return this.onClickListener;
    }

    public final AlertData copy(int i, String str, String str2, Integer num, CollageAlert.AlertType alertType2, long j, C19857l<? super View, C19394m> lVar) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(alertType2, "alertType");
        return new AlertData(i, str, str2, num, alertType2, j, lVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertData)) {
            return false;
        }
        AlertData alertData = (AlertData) obj;
        return this.icon == alertData.icon && C19383o.m32792b(this.title, alertData.title) && C19383o.m32792b(this.body, alertData.body) && C19383o.m32792b(this.bodyIcon, alertData.bodyIcon) && this.alertType == alertData.alertType && this.duration == alertData.duration && C19383o.m32792b(this.onClickListener, alertData.onClickListener);
    }

    public final CollageAlert.AlertType getAlertType() {
        return this.alertType;
    }

    public final String getBody() {
        return this.body;
    }

    public final Integer getBodyIcon() {
        return this.bodyIcon;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final C19857l<View, C19394m> getOnClickListener() {
        return this.onClickListener;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.title, Integer.hashCode(this.icon) * 31, 31);
        String str = this.body;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.bodyIcon;
        int b = C0071c.m190b(this.duration, (this.alertType.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
        C19857l<View, C19394m> lVar = this.onClickListener;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return b + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AlertData(icon=");
        h.append(this.icon);
        h.append(", title=");
        h.append(this.title);
        h.append(", body=");
        h.append(this.body);
        h.append(", bodyIcon=");
        h.append(this.bodyIcon);
        h.append(", alertType=");
        h.append(this.alertType);
        h.append(", duration=");
        h.append(this.duration);
        h.append(", onClickListener=");
        h.append(this.onClickListener);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C19383o.m32797g(parcel, "out");
        parcel.writeInt(this.icon);
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        Integer num = this.bodyIcon;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.alertType.name());
        parcel.writeLong(this.duration);
        parcel.writeSerializable((Serializable) this.onClickListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AlertData(int i, String str, String str2, Integer num, CollageAlert.AlertType alertType2, long j, C19857l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num, alertType2, (i2 & 32) != 0 ? 3000 : j, (i2 & 64) != 0 ? null : lVar);
    }
}
