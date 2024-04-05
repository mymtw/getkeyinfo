package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import kotlin.jvm.internal.C19383o;

public final class ParcelableSnapshotMutableState$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
    public ParcelableSnapshotMutableState<Object>[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        C1323f1 f1Var;
        C19383o.m32797g(parcel, "parcel");
        if (classLoader == null) {
            classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            f1Var = C1341k0.f2935a;
        } else if (readInt == 1) {
            f1Var = C1351n1.f2948a;
        } else if (readInt == 2) {
            f1Var = C1422x0.f3093a;
        } else {
            throw new IllegalStateException(C0069a.m175f("Unsupported MutableState policy ", readInt, " was restored"));
        }
        return new ParcelableSnapshotMutableState<>(readValue, f1Var);
    }

    public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
