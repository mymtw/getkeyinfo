package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p003a2.C0015b;
import p513bj.C14049b0;
import p513bj.C14065m;
import p635oh.C18292b;
import p635oh.C18295e;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new C14175a();
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final Class<? extends C18292b> exoMediaCryptoType;
    public final float frameRate;
    private int hashCode;
    public final int height;

    /* renamed from: id */
    public final String f31288id;
    public final List<byte[]> initializationData;
    public final String label;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    /* renamed from: com.google.android.exoplayer2.Format$a */
    public class C14175a implements Parcelable.Creator<Format> {
        public final Object createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        public final Object[] newArray(int i) {
            return new Format[i];
        }
    }

    public /* synthetic */ Format(C14176b bVar, C14175a aVar) {
        this(bVar);
    }

    @Deprecated
    public static Format createAudioContainerFormat(String str, String str2, String str3, String str4, String str5, Metadata metadata2, int i, int i2, int i3, List<byte[]> list, int i4, int i5, String str6) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31294b = str2;
        bVar.f31295c = str6;
        bVar.f31296d = i4;
        bVar.f31297e = i5;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str5;
        bVar.f31301i = metadata2;
        bVar.f31302j = str3;
        bVar.f31303k = str4;
        bVar.f31305m = list;
        bVar.f31316x = i2;
        bVar.f31317y = i3;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData2, int i5, String str4) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31295c = str4;
        bVar.f31296d = i5;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str3;
        bVar.f31303k = str2;
        bVar.f31304l = i2;
        bVar.f31305m = list;
        bVar.f31306n = drmInitData2;
        bVar.f31316x = i3;
        bVar.f31317y = i4;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createContainerFormat(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31294b = str2;
        bVar.f31295c = str6;
        bVar.f31296d = i2;
        bVar.f31297e = i3;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str5;
        bVar.f31302j = str3;
        bVar.f31303k = str4;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createImageSampleFormat(String str, String str2, int i, List<byte[]> list, String str3) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31295c = str3;
        bVar.f31296d = i;
        bVar.f31303k = str2;
        bVar.f31305m = list;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createSampleFormat(String str, String str2) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31303k = str2;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31294b = str2;
        bVar.f31295c = str6;
        bVar.f31296d = i2;
        bVar.f31297e = i3;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str5;
        bVar.f31302j = str3;
        bVar.f31303k = str4;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createTextSampleFormat(String str, String str2, int i, String str3) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31295c = str3;
        bVar.f31296d = i;
        bVar.f31303k = str2;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createVideoContainerFormat(String str, String str2, String str3, String str4, String str5, Metadata metadata2, int i, int i2, int i3, float f, List<byte[]> list, int i4, int i5) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31294b = str2;
        bVar.f31296d = i4;
        bVar.f31297e = i5;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str5;
        bVar.f31301i = metadata2;
        bVar.f31302j = str3;
        bVar.f31303k = str4;
        bVar.f31305m = list;
        bVar.f31308p = i2;
        bVar.f31309q = i3;
        bVar.f31310r = f;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, DrmInitData drmInitData2) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str3;
        bVar.f31303k = str2;
        bVar.f31304l = i2;
        bVar.f31305m = list;
        bVar.f31306n = drmInitData2;
        bVar.f31308p = i3;
        bVar.f31309q = i4;
        bVar.f31310r = f;
        return bVar.mo47144a();
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder h = C0072d.m201h("id=");
        h.append(format.f31288id);
        h.append(", mimeType=");
        h.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            h.append(", bitrate=");
            h.append(format.bitrate);
        }
        if (format.codecs != null) {
            h.append(", codecs=");
            h.append(format.codecs);
        }
        if (!(format.width == -1 || format.height == -1)) {
            h.append(", res=");
            h.append(format.width);
            h.append(EtsyDialogFragment.OPT_X_BUTTON);
            h.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            h.append(", fps=");
            h.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            h.append(", channels=");
            h.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            h.append(", sample_rate=");
            h.append(format.sampleRate);
        }
        if (format.language != null) {
            h.append(", language=");
            h.append(format.language);
        }
        if (format.label != null) {
            h.append(", label=");
            h.append(format.label);
        }
        return h.toString();
    }

    public C14176b buildUpon() {
        return new C14176b(this);
    }

    @Deprecated
    public Format copyWithBitrate(int i) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31298f = i;
        buildUpon.f31299g = i;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithDrmInitData(DrmInitData drmInitData2) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31306n = drmInitData2;
        return buildUpon.mo47144a();
    }

    public Format copyWithExoMediaCryptoType(Class<? extends C18292b> cls) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31292D = cls;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithFrameRate(float f) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31310r = f;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithGaplessInfo(int i, int i2) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31289A = i;
        buildUpon.f31290B = i2;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithLabel(String str) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31294b = str;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithManifestFormatInfo(Format format) {
        return withManifestFormatInfo(format);
    }

    @Deprecated
    public Format copyWithMaxInputSize(int i) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31304l = i;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithMetadata(Metadata metadata2) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31301i = metadata2;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithSubsampleOffsetUs(long j) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31307o = j;
        return buildUpon.mo47144a();
    }

    @Deprecated
    public Format copyWithVideoSize(int i, int i2) {
        C14176b buildUpon = buildUpon();
        buildUpon.f31308p = i;
        buildUpon.f31309q = i2;
        return buildUpon.mo47144a();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.hashCode;
        if (i2 == 0 || (i = format.hashCode) == 0 || i2 == i) {
            return this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && C14049b0.m21628a(this.exoMediaCryptoType, format.exoMediaCryptoType) && C14049b0.m21628a(this.f31288id, format.f31288id) && C14049b0.m21628a(this.label, format.label) && C14049b0.m21628a(this.codecs, format.codecs) && C14049b0.m21628a(this.containerMimeType, format.containerMimeType) && C14049b0.m21628a(this.sampleMimeType, format.sampleMimeType) && C14049b0.m21628a(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && C14049b0.m21628a(this.metadata, format.metadata) && C14049b0.m21628a(this.colorInfo, format.colorInfo) && C14049b0.m21628a(this.drmInitData, format.drmInitData) && initializationDataEquals(format);
        }
        return false;
    }

    public int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.f31288id;
            int i = 0;
            int hashCode2 = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.language;
            int hashCode4 = (((((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            String str4 = this.codecs;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata2 = this.metadata;
            int hashCode6 = (hashCode5 + (metadata2 == null ? 0 : metadata2.hashCode())) * 31;
            String str5 = this.containerMimeType;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.sampleMimeType;
            int floatToIntBits = (((((((((((((((Float.floatToIntBits(this.pixelWidthHeightRatio) + ((((Float.floatToIntBits(this.frameRate) + ((((((((((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31)) * 31) + this.rotationDegrees) * 31)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31;
            Class<? extends C18292b> cls = this.exoMediaCryptoType;
            if (cls != null) {
                i = cls.hashCode();
            }
            this.hashCode = floatToIntBits + i;
        }
        return this.hashCode;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str = this.f31288id;
        String str2 = this.label;
        String str3 = this.containerMimeType;
        String str4 = this.sampleMimeType;
        String str5 = this.codecs;
        int i = this.bitrate;
        String str6 = this.language;
        int i2 = this.width;
        int i3 = this.height;
        float f = this.frameRate;
        int i4 = this.channelCount;
        int i5 = this.sampleRate;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str6, C0391c.m1055a(str5, C0391c.m1055a(str4, C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 104)))))), "Format(", str, ", ", str2);
        C0391c.m1061h(k, ", ", str3, ", ", str4);
        k.append(", ");
        k.append(str5);
        k.append(", ");
        k.append(i);
        k.append(", ");
        k.append(str6);
        k.append(", [");
        k.append(i2);
        k.append(", ");
        k.append(i3);
        k.append(", ");
        k.append(f);
        k.append("], [");
        k.append(i4);
        k.append(", ");
        k.append(i5);
        k.append("])");
        return k.toString();
    }

    public Format withManifestFormatInfo(Format format) {
        String str;
        if (this == format) {
            return this;
        }
        int h = C14065m.m21678h(this.sampleMimeType);
        String str2 = format.f31288id;
        String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        String str4 = this.language;
        if ((h == 3 || h == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i = this.averageBitrate;
        if (i == -1) {
            i = format.averageBitrate;
        }
        int i2 = this.peakBitrate;
        if (i2 == -1) {
            i2 = format.peakBitrate;
        }
        String str5 = this.codecs;
        if (str5 == null) {
            String q = C14049b0.m21644q(h, format.codecs);
            if (C14049b0.m21627H(q).length == 1) {
                str5 = q;
            }
        }
        Metadata metadata2 = this.metadata;
        Metadata copyWithAppendedEntriesFrom = metadata2 == null ? format.metadata : metadata2.copyWithAppendedEntriesFrom(format.metadata);
        float f = this.frameRate;
        if (f == -1.0f && h == 2) {
            f = format.frameRate;
        }
        int i3 = this.selectionFlags | format.selectionFlags;
        int i4 = this.roleFlags | format.roleFlags;
        DrmInitData createSessionCreationData = DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData);
        C14176b buildUpon = buildUpon();
        buildUpon.f31293a = str2;
        buildUpon.f31294b = str3;
        buildUpon.f31295c = str4;
        buildUpon.f31296d = i3;
        buildUpon.f31297e = i4;
        buildUpon.f31298f = i;
        buildUpon.f31299g = i2;
        buildUpon.f31300h = str5;
        buildUpon.f31301i = copyWithAppendedEntriesFrom;
        buildUpon.f31306n = createSessionCreationData;
        buildUpon.f31310r = f;
        return buildUpon.mo47144a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31288id);
        parcel.writeString(this.label);
        parcel.writeString(this.language);
        parcel.writeInt(this.selectionFlags);
        parcel.writeInt(this.roleFlags);
        parcel.writeInt(this.averageBitrate);
        parcel.writeInt(this.peakBitrate);
        parcel.writeString(this.codecs);
        int i2 = 0;
        parcel.writeParcelable(this.metadata, 0);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeInt(this.maxInputSize);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.initializationData.get(i3));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeLong(this.subsampleOffsetUs);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        if (this.projectionData != null) {
            i2 = 1;
        }
        int i4 = C14049b0.f30913a;
        parcel.writeInt(i2);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeInt(this.accessibilityChannel);
    }

    private Format(C14176b bVar) {
        this.f31288id = bVar.f31293a;
        this.label = bVar.f31294b;
        this.language = C14049b0.m21622C(bVar.f31295c);
        this.selectionFlags = bVar.f31296d;
        this.roleFlags = bVar.f31297e;
        int i = bVar.f31298f;
        this.averageBitrate = i;
        int i2 = bVar.f31299g;
        this.peakBitrate = i2;
        this.bitrate = i2 != -1 ? i2 : i;
        this.codecs = bVar.f31300h;
        this.metadata = bVar.f31301i;
        this.containerMimeType = bVar.f31302j;
        this.sampleMimeType = bVar.f31303k;
        this.maxInputSize = bVar.f31304l;
        List<byte[]> list = bVar.f31305m;
        this.initializationData = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData2 = bVar.f31306n;
        this.drmInitData = drmInitData2;
        this.subsampleOffsetUs = bVar.f31307o;
        this.width = bVar.f31308p;
        this.height = bVar.f31309q;
        this.frameRate = bVar.f31310r;
        int i3 = bVar.f31311s;
        int i4 = 0;
        this.rotationDegrees = i3 == -1 ? 0 : i3;
        float f = bVar.f31312t;
        this.pixelWidthHeightRatio = f == -1.0f ? 1.0f : f;
        this.projectionData = bVar.f31313u;
        this.stereoMode = bVar.f31314v;
        this.colorInfo = bVar.f31315w;
        this.channelCount = bVar.f31316x;
        this.sampleRate = bVar.f31317y;
        this.pcmEncoding = bVar.f31318z;
        int i5 = bVar.f31289A;
        this.encoderDelay = i5 == -1 ? 0 : i5;
        int i6 = bVar.f31290B;
        this.encoderPadding = i6 != -1 ? i6 : i4;
        this.accessibilityChannel = bVar.f31291C;
        Class<? extends C18292b> cls = bVar.f31292D;
        if (cls != null || drmInitData2 == null) {
            this.exoMediaCryptoType = cls;
        } else {
            this.exoMediaCryptoType = C18295e.class;
        }
    }

    @Deprecated
    public static Format createTextSampleFormat(String str, String str2, int i, String str3, int i2, long j, List<byte[]> list) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31295c = str3;
        bVar.f31296d = i;
        bVar.f31303k = str2;
        bVar.f31305m = list;
        bVar.f31307o = j;
        bVar.f31291C = i2;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31294b = str2;
        bVar.f31295c = str6;
        bVar.f31296d = i2;
        bVar.f31297e = i3;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str5;
        bVar.f31302j = str3;
        bVar.f31303k = str4;
        bVar.f31291C = i4;
        return bVar.mo47144a();
    }

    /* renamed from: com.google.android.exoplayer2.Format$b */
    public static final class C14176b {

        /* renamed from: A */
        public int f31289A;

        /* renamed from: B */
        public int f31290B;

        /* renamed from: C */
        public int f31291C;

        /* renamed from: D */
        public Class<? extends C18292b> f31292D;

        /* renamed from: a */
        public String f31293a;

        /* renamed from: b */
        public String f31294b;

        /* renamed from: c */
        public String f31295c;

        /* renamed from: d */
        public int f31296d;

        /* renamed from: e */
        public int f31297e;

        /* renamed from: f */
        public int f31298f;

        /* renamed from: g */
        public int f31299g;

        /* renamed from: h */
        public String f31300h;

        /* renamed from: i */
        public Metadata f31301i;

        /* renamed from: j */
        public String f31302j;

        /* renamed from: k */
        public String f31303k;

        /* renamed from: l */
        public int f31304l;

        /* renamed from: m */
        public List<byte[]> f31305m;

        /* renamed from: n */
        public DrmInitData f31306n;

        /* renamed from: o */
        public long f31307o;

        /* renamed from: p */
        public int f31308p;

        /* renamed from: q */
        public int f31309q;

        /* renamed from: r */
        public float f31310r;

        /* renamed from: s */
        public int f31311s;

        /* renamed from: t */
        public float f31312t;

        /* renamed from: u */
        public byte[] f31313u;

        /* renamed from: v */
        public int f31314v;

        /* renamed from: w */
        public ColorInfo f31315w;

        /* renamed from: x */
        public int f31316x;

        /* renamed from: y */
        public int f31317y;

        /* renamed from: z */
        public int f31318z;

        public C14176b() {
            this.f31298f = -1;
            this.f31299g = -1;
            this.f31304l = -1;
            this.f31307o = Long.MAX_VALUE;
            this.f31308p = -1;
            this.f31309q = -1;
            this.f31310r = -1.0f;
            this.f31312t = 1.0f;
            this.f31314v = -1;
            this.f31316x = -1;
            this.f31317y = -1;
            this.f31318z = -1;
            this.f31291C = -1;
        }

        /* renamed from: a */
        public final Format mo47144a() {
            return new Format(this, (C14175a) null);
        }

        /* renamed from: b */
        public final void mo47145b(int i) {
            this.f31293a = Integer.toString(i);
        }

        public C14176b(Format format) {
            this.f31293a = format.f31288id;
            this.f31294b = format.label;
            this.f31295c = format.language;
            this.f31296d = format.selectionFlags;
            this.f31297e = format.roleFlags;
            this.f31298f = format.averageBitrate;
            this.f31299g = format.peakBitrate;
            this.f31300h = format.codecs;
            this.f31301i = format.metadata;
            this.f31302j = format.containerMimeType;
            this.f31303k = format.sampleMimeType;
            this.f31304l = format.maxInputSize;
            this.f31305m = format.initializationData;
            this.f31306n = format.drmInitData;
            this.f31307o = format.subsampleOffsetUs;
            this.f31308p = format.width;
            this.f31309q = format.height;
            this.f31310r = format.frameRate;
            this.f31311s = format.rotationDegrees;
            this.f31312t = format.pixelWidthHeightRatio;
            this.f31313u = format.projectionData;
            this.f31314v = format.stereoMode;
            this.f31315w = format.colorInfo;
            this.f31316x = format.channelCount;
            this.f31317y = format.sampleRate;
            this.f31318z = format.pcmEncoding;
            this.f31289A = format.encoderDelay;
            this.f31290B = format.encoderPadding;
            this.f31291C = format.accessibilityChannel;
            this.f31292D = format.exoMediaCryptoType;
        }
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData2) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str3;
        bVar.f31303k = str2;
        bVar.f31304l = i2;
        bVar.f31305m = list;
        bVar.f31306n = drmInitData2;
        bVar.f31308p = i3;
        bVar.f31309q = i4;
        bVar.f31310r = f;
        bVar.f31311s = i5;
        bVar.f31312t = f2;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData2, int i6, String str4) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31295c = str4;
        bVar.f31296d = i6;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str3;
        bVar.f31303k = str2;
        bVar.f31304l = i2;
        bVar.f31305m = list;
        bVar.f31306n = drmInitData2;
        bVar.f31316x = i3;
        bVar.f31317y = i4;
        bVar.f31318z = i5;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo2, DrmInitData drmInitData2) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str3;
        bVar.f31303k = str2;
        bVar.f31304l = i2;
        bVar.f31305m = list;
        bVar.f31306n = drmInitData2;
        bVar.f31308p = i3;
        bVar.f31309q = i4;
        bVar.f31310r = f;
        bVar.f31311s = i5;
        bVar.f31312t = f2;
        bVar.f31313u = bArr;
        bVar.f31314v = i6;
        bVar.f31315w = colorInfo2;
        return bVar.mo47144a();
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData2, int i8, String str4, Metadata metadata2) {
        C14176b bVar = new C14176b();
        bVar.f31293a = str;
        bVar.f31295c = str4;
        bVar.f31296d = i8;
        bVar.f31298f = i;
        bVar.f31299g = i;
        bVar.f31300h = str3;
        bVar.f31301i = metadata2;
        bVar.f31303k = str2;
        bVar.f31304l = i2;
        bVar.f31305m = list;
        bVar.f31306n = drmInitData2;
        bVar.f31316x = i3;
        bVar.f31317y = i4;
        bVar.f31318z = i5;
        bVar.f31289A = i6;
        bVar.f31290B = i7;
        return bVar.mo47144a();
    }

    public Format(Parcel parcel) {
        this.f31288id = parcel.readString();
        this.label = parcel.readString();
        this.language = parcel.readString();
        this.selectionFlags = parcel.readInt();
        this.roleFlags = parcel.readInt();
        int readInt = parcel.readInt();
        this.averageBitrate = readInt;
        int readInt2 = parcel.readInt();
        this.peakBitrate = readInt2;
        this.bitrate = readInt2 != -1 ? readInt2 : readInt;
        this.codecs = parcel.readString();
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.maxInputSize = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.initializationData = new ArrayList(readInt3);
        boolean z = false;
        for (int i = 0; i < readInt3; i++) {
            List<byte[]> list = this.initializationData;
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            list.add(createByteArray);
        }
        DrmInitData drmInitData2 = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.drmInitData = drmInitData2;
        this.subsampleOffsetUs = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        int i2 = C14049b0.f30913a;
        Class cls = null;
        this.projectionData = parcel.readInt() != 0 ? true : z ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.accessibilityChannel = parcel.readInt();
        this.exoMediaCryptoType = drmInitData2 != null ? C18295e.class : cls;
    }
}
