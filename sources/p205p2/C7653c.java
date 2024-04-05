package p205p2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
import p003a2.C0023f;
import p193o.C7494b;

/* renamed from: p2.c */
public final class C7653c extends VersionedParcel {

    /* renamed from: d */
    public final SparseIntArray f16951d;

    /* renamed from: e */
    public final Parcel f16952e;

    /* renamed from: f */
    public final int f16953f;

    /* renamed from: g */
    public final int f16954g;

    /* renamed from: h */
    public final String f16955h;

    /* renamed from: i */
    public int f16956i;

    /* renamed from: j */
    public int f16957j;

    /* renamed from: k */
    public int f16958k;

    public C7653c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C7494b(), new C7494b(), new C7494b());
    }

    /* renamed from: A */
    public final void mo12563A(long j) {
        this.f16952e.writeLong(j);
    }

    /* renamed from: B */
    public final void mo12564B(Parcelable parcelable) {
        this.f16952e.writeParcelable(parcelable, 0);
    }

    /* renamed from: D */
    public final void mo12566D(String str) {
        this.f16952e.writeString(str);
    }

    /* renamed from: F */
    public final void mo12568F(IBinder iBinder) {
        this.f16952e.writeStrongBinder(iBinder);
    }

    /* renamed from: H */
    public final void mo20062H() {
        int i = this.f16956i;
        if (i >= 0) {
            int i2 = this.f16951d.get(i);
            int dataPosition = this.f16952e.dataPosition();
            this.f16952e.setDataPosition(i2);
            this.f16952e.writeInt(dataPosition - i2);
            this.f16952e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public final C7653c mo12570a() {
        Parcel parcel = this.f16952e;
        int dataPosition = parcel.dataPosition();
        int i = this.f16957j;
        if (i == this.f16953f) {
            i = this.f16954g;
        }
        return new C7653c(parcel, dataPosition, i, C0023f.m110k(new StringBuilder(), this.f16955h, "  "), this.f7783a, this.f7784b, this.f7785c);
    }

    /* renamed from: f */
    public final boolean mo12575f() {
        return this.f16952e.readInt() != 0;
    }

    /* renamed from: g */
    public final byte[] mo12576g() {
        int readInt = this.f16952e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f16952e.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: h */
    public final CharSequence mo12577h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f16952e);
    }

    /* renamed from: i */
    public final boolean mo12578i(int i) {
        while (this.f16957j < this.f16954g) {
            int i2 = this.f16958k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f16952e.setDataPosition(this.f16957j);
            int readInt = this.f16952e.readInt();
            this.f16958k = this.f16952e.readInt();
            this.f16957j += readInt;
        }
        return this.f16958k == i;
    }

    /* renamed from: j */
    public final int mo12579j() {
        return this.f16952e.readInt();
    }

    /* renamed from: l */
    public final long mo12581l() {
        return this.f16952e.readLong();
    }

    /* renamed from: m */
    public final <T extends Parcelable> T mo12582m() {
        return this.f16952e.readParcelable(C7653c.class.getClassLoader());
    }

    /* renamed from: o */
    public final String mo12584o() {
        return this.f16952e.readString();
    }

    /* renamed from: q */
    public final IBinder mo12586q() {
        return this.f16952e.readStrongBinder();
    }

    /* renamed from: t */
    public final void mo12589t(int i) {
        mo20062H();
        this.f16956i = i;
        this.f16951d.put(i, this.f16952e.dataPosition());
        mo12594y(0);
        mo12594y(i);
    }

    /* renamed from: v */
    public final void mo12591v(boolean z) {
        this.f16952e.writeInt(z ? 1 : 0);
    }

    /* renamed from: w */
    public final void mo12592w(byte[] bArr) {
        if (bArr != null) {
            this.f16952e.writeInt(bArr.length);
            this.f16952e.writeByteArray(bArr);
            return;
        }
        this.f16952e.writeInt(-1);
    }

    /* renamed from: x */
    public final void mo12593x(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f16952e, 0);
    }

    /* renamed from: y */
    public final void mo12594y(int i) {
        this.f16952e.writeInt(i);
    }

    public C7653c(Parcel parcel, int i, int i2, String str, C7494b<String, Method> bVar, C7494b<String, Method> bVar2, C7494b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f16951d = new SparseIntArray();
        this.f16956i = -1;
        this.f16958k = -1;
        this.f16952e = parcel;
        this.f16953f = i;
        this.f16954g = i2;
        this.f16957j = i;
        this.f16955h = str;
    }
}
