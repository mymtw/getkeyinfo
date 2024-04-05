package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0115a();
    private final Intent mData;
    private final int mResultCode;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    public class C0115a implements Parcelable.Creator<ActivityResult> {
        public final Object createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        public final Object[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.mResultCode = i;
        this.mData = intent;
    }

    public static String resultCodeToString(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public int describeContents() {
        return 0;
    }

    public Intent getData() {
        return this.mData;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ActivityResult{resultCode=");
        h.append(resultCodeToString(this.mResultCode));
        h.append(", data=");
        h.append(this.mData);
        h.append('}');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mData == null ? 0 : 1);
        Intent intent = this.mData;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.mResultCode = parcel.readInt();
        this.mData = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
