package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C2751c0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C2691a();

    /* renamed from: b */
    public final int[] f6064b;

    /* renamed from: c */
    public final ArrayList<String> f6065c;

    /* renamed from: d */
    public final int[] f6066d;

    /* renamed from: e */
    public final int[] f6067e;

    /* renamed from: f */
    public final int f6068f;

    /* renamed from: g */
    public final String f6069g;

    /* renamed from: h */
    public final int f6070h;

    /* renamed from: i */
    public final int f6071i;

    /* renamed from: j */
    public final CharSequence f6072j;

    /* renamed from: k */
    public final int f6073k;

    /* renamed from: l */
    public final CharSequence f6074l;

    /* renamed from: m */
    public final ArrayList<String> f6075m;

    /* renamed from: n */
    public final ArrayList<String> f6076n;

    /* renamed from: o */
    public final boolean f6077o;

    /* renamed from: androidx.fragment.app.BackStackRecordState$a */
    public class C2691a implements Parcelable.Creator<BackStackRecordState> {
        public final Object createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        public final Object[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(C2740a aVar) {
        int size = aVar.f6246c.size();
        this.f6064b = new int[(size * 6)];
        if (aVar.f6252i) {
            this.f6065c = new ArrayList<>(size);
            this.f6066d = new int[size];
            this.f6067e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C2751c0.C2752a aVar2 = aVar.f6246c.get(i);
                int i3 = i2 + 1;
                this.f6064b[i2] = aVar2.f6262a;
                ArrayList<String> arrayList = this.f6065c;
                Fragment fragment = aVar2.f6263b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f6064b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f6264c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f6265d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f6266e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f6267f;
                iArr[i7] = aVar2.f6268g;
                this.f6066d[i] = aVar2.f6269h.ordinal();
                this.f6067e[i] = aVar2.f6270i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f6068f = aVar.f6251h;
            this.f6069g = aVar.f6254k;
            this.f6070h = aVar.f6220u;
            this.f6071i = aVar.f6255l;
            this.f6072j = aVar.f6256m;
            this.f6073k = aVar.f6257n;
            this.f6074l = aVar.f6258o;
            this.f6075m = aVar.f6259p;
            this.f6076n = aVar.f6260q;
            this.f6077o = aVar.f6261r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f6064b);
        parcel.writeStringList(this.f6065c);
        parcel.writeIntArray(this.f6066d);
        parcel.writeIntArray(this.f6067e);
        parcel.writeInt(this.f6068f);
        parcel.writeString(this.f6069g);
        parcel.writeInt(this.f6070h);
        parcel.writeInt(this.f6071i);
        TextUtils.writeToParcel(this.f6072j, parcel, 0);
        parcel.writeInt(this.f6073k);
        TextUtils.writeToParcel(this.f6074l, parcel, 0);
        parcel.writeStringList(this.f6075m);
        parcel.writeStringList(this.f6076n);
        parcel.writeInt(this.f6077o ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f6064b = parcel.createIntArray();
        this.f6065c = parcel.createStringArrayList();
        this.f6066d = parcel.createIntArray();
        this.f6067e = parcel.createIntArray();
        this.f6068f = parcel.readInt();
        this.f6069g = parcel.readString();
        this.f6070h = parcel.readInt();
        this.f6071i = parcel.readInt();
        this.f6072j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6073k = parcel.readInt();
        this.f6074l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6075m = parcel.createStringArrayList();
        this.f6076n = parcel.createStringArrayList();
        this.f6077o = parcel.readInt() != 0;
    }
}
