package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p003a2.C0023f;
import p513bj.C14049b0;
import p594jh.C17912g;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C14214a();
    private int hashCode;
    public final int schemeDataCount;
    private final SchemeData[] schemeDatas;
    public final String schemeType;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C14213a();
        public final byte[] data;
        private int hashCode;
        public final String licenseServerUrl;
        public final String mimeType;
        public final UUID uuid;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$a */
        public class C14213a implements Parcelable.Creator<SchemeData> {
            public final Object createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            public final Object[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid2, String str, byte[] bArr) {
            this(uuid2, (String) null, str, bArr);
        }

        public boolean canReplace(SchemeData schemeData) {
            return hasData() && !schemeData.hasData() && matches(schemeData.uuid);
        }

        public SchemeData copyWithData(byte[] bArr) {
            return new SchemeData(this.uuid, this.licenseServerUrl, this.mimeType, bArr);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return C14049b0.m21628a(this.licenseServerUrl, schemeData.licenseServerUrl) && C14049b0.m21628a(this.mimeType, schemeData.mimeType) && C14049b0.m21628a(this.uuid, schemeData.uuid) && Arrays.equals(this.data, schemeData.data);
        }

        public boolean hasData() {
            return this.data != null;
        }

        public int hashCode() {
            if (this.hashCode == 0) {
                int hashCode2 = this.uuid.hashCode() * 31;
                String str = this.licenseServerUrl;
                this.hashCode = Arrays.hashCode(this.data) + C0023f.m105e(this.mimeType, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.hashCode;
        }

        public boolean matches(UUID uuid2) {
            return C17912g.f38897a.equals(this.uuid) || uuid2.equals(this.uuid);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.licenseServerUrl);
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
        }

        public SchemeData(UUID uuid2, String str, String str2, byte[] bArr) {
            uuid2.getClass();
            this.uuid = uuid2;
            this.licenseServerUrl = str;
            str2.getClass();
            this.mimeType = str2;
            this.data = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.licenseServerUrl = parcel.readString();
            String readString = parcel.readString();
            int i = C14049b0.f30913a;
            this.mimeType = readString;
            this.data = parcel.createByteArray();
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    public class C14214a implements Parcelable.Creator<DrmInitData> {
        public final Object createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        public final Object[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this((String) null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    private static boolean containsSchemeDataWithUuid(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).uuid.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData createSessionCreationData(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.schemeType;
            for (SchemeData schemeData : drmInitData.schemeDatas) {
                if (schemeData.hasData()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.schemeType;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.schemeDatas) {
                if (schemeData2.hasData() && !containsSchemeDataWithUuid(arrayList, size, schemeData2.uuid)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, (List<SchemeData>) arrayList);
    }

    public DrmInitData copyWithSchemeType(String str) {
        return C14049b0.m21628a(this.schemeType, str) ? this : new DrmInitData(str, false, this.schemeDatas);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return C14049b0.m21628a(this.schemeType, drmInitData.schemeType) && Arrays.equals(this.schemeDatas, drmInitData.schemeDatas);
    }

    public SchemeData get(int i) {
        return this.schemeDatas[i];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeType;
            this.hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.schemeDatas);
        }
        return this.hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r6.schemeType;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.drm.DrmInitData merge(com.google.android.exoplayer2.drm.DrmInitData r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.schemeType
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.String r2 = r6.schemeType
            if (r2 == 0) goto L_0x0012
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            p513bj.C14075p.m21694f(r0)
            java.lang.String r0 = r5.schemeType
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            java.lang.String r0 = r6.schemeType
        L_0x001d:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = r5.schemeDatas
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r6 = r6.schemeDatas
            int r3 = p513bj.C14049b0.f30913a
            int r3 = r2.length
            int r4 = r6.length
            int r3 = r3 + r4
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r3)
            int r2 = r2.length
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r1, r3, r2, r4)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
            com.google.android.exoplayer2.drm.DrmInitData r6 = new com.google.android.exoplayer2.drm.DrmInitData
            r6.<init>((java.lang.String) r0, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.merge(com.google.android.exoplayer2.drm.DrmInitData):com.google.android.exoplayer2.drm.DrmInitData");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = C17912g.f38897a;
        if (uuid.equals(schemeData.uuid)) {
            return uuid.equals(schemeData2.uuid) ? 0 : 1;
        }
        return schemeData.uuid.compareTo(schemeData2.uuid);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private DrmInitData(java.lang.String r1, boolean r2, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.schemeType = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
        L_0x000e:
            r0.schemeDatas = r3
            int r1 = r3.length
            r0.schemeDataCount = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.<init>(java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]):void");
    }

    public DrmInitData(Parcel parcel) {
        this.schemeType = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = C14049b0.f30913a;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }
}
