package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

@SuppressLint({"BanParcelableUsage"})
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new ParcelableSnapshotMutableState$Companion$CREATOR$1();
    public static final C1282a Companion = new C1282a();
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    public static final class C1282a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, C1323f1<T> f1Var) {
        super(t, f1Var);
        C19383o.m32797g(f1Var, "policy");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C19383o.m32797g(parcel, "parcel");
        parcel.writeValue(getValue());
        C1323f1 policy = getPolicy();
        if (C19383o.m32792b(policy, C1341k0.f2935a)) {
            i2 = 0;
        } else if (C19383o.m32792b(policy, C1351n1.f2948a)) {
            i2 = 1;
        } else if (C19383o.m32792b(policy, C1422x0.f3093a)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
