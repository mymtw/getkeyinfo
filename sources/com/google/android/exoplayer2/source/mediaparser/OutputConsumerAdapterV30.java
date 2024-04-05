package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.media.MediaParser$SeekMap;
import android.media.MediaParser$SeekPoint;
import android.util.Pair;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.CharUtils;
import p505aj.C13997e;
import p513bj.C14049b0;
import p513bj.C14075p;
import p513bj.C14086y;
import p644ph.C18344c;
import p644ph.C18351j;
import p644ph.C18364t;
import p644ph.C18367u;
import p644ph.C18368v;

@SuppressLint({"Override"})
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    private static final Pair<MediaParser$SeekPoint, MediaParser$SeekPoint> SEEK_POINT_PAIR_START;
    private static final String TAG = "OutputConsumerAdapterV30";
    private String containerMimeType;
    private MediaParser$SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private C18351j extractorOutput;
    private C18344c lastChunkIndex;
    private final ArrayList<C18368v.C18369a> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    private MediaParser$SeekMap lastSeekMap;
    private List<Format> muxedCaptionFormats;
    private int primaryTrackIndex;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final C14361a scratchDataReaderAdapter;
    private boolean seekingDisabled;
    private C14086y timestampAdjuster;
    private final ArrayList<Format> trackFormats;
    private final ArrayList<C18368v> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;

    /* renamed from: com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$a */
    public static final class C14361a implements C13997e {

        /* renamed from: a */
        public MediaParser$InputReader f32243a;

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            MediaParser$InputReader mediaParser$InputReader = this.f32243a;
            int i3 = C14049b0.f30913a;
            return mediaParser$InputReader.read(bArr, i, i2);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$b */
    public static final class C14362b implements C18364t {

        /* renamed from: a */
        public final MediaParser$SeekMap f32244a;

        public C14362b(MediaParser$SeekMap mediaParser$SeekMap) {
            this.f32244a = mediaParser$SeekMap;
        }

        /* renamed from: d */
        public final C18364t.C18365a mo47833d(long j) {
            Pair<MediaParser$SeekPoint, MediaParser$SeekPoint> seekPoints = this.f32244a.getSeekPoints(j);
            Object obj = seekPoints.first;
            Object obj2 = seekPoints.second;
            if (obj == obj2) {
                MediaParser$SeekPoint mediaParser$SeekPoint = (MediaParser$SeekPoint) obj;
                C18367u uVar = new C18367u(mediaParser$SeekPoint.timeMicros, mediaParser$SeekPoint.position);
                return new C18364t.C18365a(uVar, uVar);
            }
            MediaParser$SeekPoint mediaParser$SeekPoint2 = (MediaParser$SeekPoint) obj;
            MediaParser$SeekPoint mediaParser$SeekPoint3 = (MediaParser$SeekPoint) obj2;
            return new C18364t.C18365a(new C18367u(mediaParser$SeekPoint2.timeMicros, mediaParser$SeekPoint2.position), new C18367u(mediaParser$SeekPoint3.timeMicros, mediaParser$SeekPoint3.position));
        }

        /* renamed from: g */
        public final boolean mo47834g() {
            return this.f32244a.isSeekable();
        }

        /* renamed from: i */
        public final long mo47835i() {
            long durationMicros = this.f32244a.getDurationMicros();
            if (durationMicros != ParserMinimalBase.MIN_INT_L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }
    }

    static {
        MediaParser$SeekPoint mediaParser$SeekPoint = MediaParser$SeekPoint.START;
        SEEK_POINT_PAIR_START = Pair.create(mediaParser$SeekPoint, mediaParser$SeekPoint);
    }

    public OutputConsumerAdapterV30() {
        this((Format) null, 7, false);
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.trackOutputs.size(); size <= i; size++) {
            this.trackOutputs.add((Object) null);
            this.trackFormats.add((Object) null);
            this.lastReceivedCryptoInfos.add((Object) null);
            this.lastOutputCryptoDatas.add((Object) null);
        }
    }

    private static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static ColorInfo getColorInfo(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        int a = mediaFormat.getInteger("color-transfer", -1);
        int a2 = mediaFormat.getInteger("color-range", -1);
        int a3 = mediaFormat.getInteger("color-standard", -1);
        if (array == null && a == -1 && a2 == -1 && a3 == -1) {
            return null;
        }
        return new ColorInfo(a3, a2, a, array);
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(getArray(byteBuffer));
            i = i2;
        }
    }

    private static String getMimeType(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    c = 0;
                    break;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    c = 1;
                    break;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    c = 2;
                    break;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    c = 3;
                    break;
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    c = 4;
                    break;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    c = 5;
                    break;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    c = 6;
                    break;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    c = 7;
                    break;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    c = 8;
                    break;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    c = 9;
                    break;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    c = 10;
                    break;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    c = 11;
                    break;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    c = 12;
                    break;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    c = CharUtils.f44393CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 6:
                return "video/mp4";
            case 1:
                return "audio/ogg";
            case 2:
                return "video/mp2t";
            case 3:
                return "audio/mp4a-latm";
            case 4:
                return "audio/raw";
            case 5:
                return "video/mp2p";
            case 7:
                return "audio/ac3";
            case 8:
                return "audio/amr";
            case 9:
                return "audio/flac";
            case 10:
                return "video/webm";
            case 11:
                return "audio/ac4";
            case 12:
                return "audio/mpeg";
            case 13:
                return "video/x-flv";
            default:
                throw new IllegalArgumentException(str.length() != 0 ? "Illegal parser name: ".concat(str) : new String("Illegal parser name: "));
        }
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | 0 | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (this.tracksFoundCalled && !this.tracksEnded) {
            int size = this.trackOutputs.size();
            int i = 0;
            while (i < size) {
                if (this.trackOutputs.get(i) != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.extractorOutput.mo4163p();
            this.tracksEnded = true;
        }
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS);
        byteBuffer2.getClass();
        LongBuffer asLongBuffer = byteBuffer2.asLongBuffer();
        ByteBuffer byteBuffer3 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS);
        byteBuffer3.getClass();
        LongBuffer asLongBuffer2 = byteBuffer3.asLongBuffer();
        ByteBuffer byteBuffer4 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES);
        byteBuffer4.getClass();
        LongBuffer asLongBuffer3 = byteBuffer4.asLongBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        long[] jArr = new long[asLongBuffer.remaining()];
        long[] jArr2 = new long[asLongBuffer2.remaining()];
        long[] jArr3 = new long[asLongBuffer3.remaining()];
        asIntBuffer.get(iArr);
        asLongBuffer.get(jArr);
        asLongBuffer2.get(jArr2);
        asLongBuffer3.get(jArr3);
        C18344c cVar = new C18344c(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = cVar;
        this.extractorOutput.mo4162l(cVar);
        return true;
    }

    private C18368v.C18369a toExoPlayerCryptoData(int i, MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i) == cryptoInfo) {
            C18368v.C18369a aVar = this.lastOutputCryptoDatas.get(i);
            aVar.getClass();
            return aVar;
        }
        int i3 = 0;
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            String group = matcher.group(1);
            int i4 = C14049b0.f30913a;
            int parseInt = Integer.parseInt(group);
            i2 = Integer.parseInt(matcher.group(2));
            i3 = parseInt;
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(cryptoInfo);
            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
            sb.append("Unexpected error while parsing CryptoInfo: ");
            sb.append(valueOf);
            C14075p.m21698j(TAG, sb.toString(), e);
            i2 = 0;
        }
        C18368v.C18369a aVar2 = new C18368v.C18369a(cryptoInfo.mode, i3, i2, cryptoInfo.key);
        this.lastReceivedCryptoInfos.set(i, cryptoInfo);
        this.lastOutputCryptoDatas.set(i, aVar2);
        return aVar2;
    }

    private static DrmInitData toExoPlayerDrmInitData(String str, android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            schemeDataArr[i] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new com.google.android.exoplayer2.drm.DrmInitData(str, schemeDataArr);
    }

    private Format toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31306n = toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData);
        bVar.f31302j = this.containerMimeType;
        bVar.f31299g = mediaFormat.getInteger("bitrate", -1);
        bVar.f31316x = mediaFormat.getInteger("channel-count", -1);
        bVar.f31315w = getColorInfo(mediaFormat);
        bVar.f31303k = string;
        bVar.f31300h = mediaFormat.getString("codecs-string");
        bVar.f31310r = mediaFormat.getFloat("frame-rate", -1.0f);
        bVar.f31308p = mediaFormat.getInteger(ResponseConstants.WIDTH, -1);
        bVar.f31309q = mediaFormat.getInteger(ResponseConstants.HEIGHT, -1);
        bVar.f31305m = getInitializationData(mediaFormat);
        bVar.f31295c = mediaFormat.getString("language");
        bVar.f31304l = mediaFormat.getInteger("max-input-size", -1);
        bVar.f31318z = mediaFormat.getInteger("exo-pcm-encoding", -1);
        int i = 0;
        bVar.f31311s = mediaFormat.getInteger("rotation-degrees", 0);
        bVar.f31317y = mediaFormat.getInteger("sample-rate", -1);
        bVar.f31296d = getSelectionFlags(mediaFormat);
        bVar.f31289A = mediaFormat.getInteger("encoder-delay", 0);
        bVar.f31290B = mediaFormat.getInteger("encoder-padding", 0);
        bVar.f31312t = mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f);
        bVar.f31307o = mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE);
        bVar.f31291C = integer;
        while (true) {
            if (i >= this.muxedCaptionFormats.size()) {
                break;
            }
            Format format = this.muxedCaptionFormats.get(i);
            if (C14049b0.m21628a(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                bVar.f31295c = format.language;
                bVar.f31297e = format.roleFlags;
                bVar.f31296d = format.selectionFlags;
                bVar.f31294b = format.label;
                bVar.f31301i = format.metadata;
                break;
            }
            i++;
        }
        return bVar.mo47144a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int toTrackTypeConstant(java.lang.String r5) {
        /*
            r0 = -1
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -450004177: goto L_0x003c;
                case -284840886: goto L_0x0031;
                case 3556653: goto L_0x0026;
                case 93166550: goto L_0x001b;
                case 112202875: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            r1 = r0
            goto L_0x0046
        L_0x0010:
            java.lang.String r1 = "video"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            r1 = 4
            goto L_0x0046
        L_0x001b:
            java.lang.String r1 = "audio"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0024
            goto L_0x000e
        L_0x0024:
            r1 = r2
            goto L_0x0046
        L_0x0026:
            java.lang.String r1 = "text"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x002f
            goto L_0x000e
        L_0x002f:
            r1 = r3
            goto L_0x0046
        L_0x0031:
            java.lang.String r1 = "unknown"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x003a
            goto L_0x000e
        L_0x003a:
            r1 = r4
            goto L_0x0046
        L_0x003c:
            java.lang.String r1 = "metadata"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0045
            goto L_0x000e
        L_0x0045:
            r1 = 0
        L_0x0046:
            switch(r1) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0051;
                case 2: goto L_0x0050;
                case 3: goto L_0x004f;
                case 4: goto L_0x004e;
                default: goto L_0x0049;
            }
        L_0x0049:
            int r5 = p513bj.C14065m.m21678h(r5)
            return r5
        L_0x004e:
            return r3
        L_0x004f:
            return r4
        L_0x0050:
            return r2
        L_0x0051:
            return r0
        L_0x0052:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.toTrackTypeConstant(java.lang.String):int");
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public C18344c getChunkIndex() {
        return this.lastChunkIndex;
    }

    public MediaParser$SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    public Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        Format[] formatArr = new Format[this.trackFormats.size()];
        for (int i = 0; i < this.trackFormats.size(); i++) {
            Format format = this.trackFormats.get(i);
            format.getClass();
            formatArr[i] = format;
        }
        return formatArr;
    }

    public Pair<MediaParser$SeekPoint, MediaParser$SeekPoint> getSeekPoints(long j) {
        MediaParser$SeekMap mediaParser$SeekMap = this.lastSeekMap;
        return mediaParser$SeekMap != null ? mediaParser$SeekMap.getSeekPoints(j) : SEEK_POINT_PAIR_START;
    }

    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.sampleTimestampUpperLimitFilterUs;
        if (j2 == -9223372036854775807L || j < j2) {
            C14086y yVar = this.timestampAdjuster;
            if (yVar != null) {
                j = yVar.mo46957a(j);
            }
            C18368v vVar = this.trackOutputs.get(i);
            vVar.getClass();
            vVar.mo47754c(j, i2, i3, i4, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        ensureSpaceForTrackIndex(i);
        this.scratchDataReaderAdapter.f32243a = mediaParser$InputReader;
        C18368v vVar = this.trackOutputs.get(i);
        if (vVar == null) {
            vVar = this.extractorOutput.mo4164r(i, -1);
            this.trackOutputs.set(i, vVar);
        }
        vVar.mo69900e(this.scratchDataReaderAdapter, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser$SeekMap mediaParser$SeekMap) {
        C18364t tVar;
        if (!this.expectDummySeekMap || this.dummySeekMap != null) {
            this.lastSeekMap = mediaParser$SeekMap;
            long durationMicros = mediaParser$SeekMap.getDurationMicros();
            C18351j jVar = this.extractorOutput;
            if (this.seekingDisabled) {
                if (durationMicros == ParserMinimalBase.MIN_INT_L) {
                    durationMicros = -9223372036854775807L;
                }
                tVar = new C18364t.C18366b(durationMicros);
            } else {
                tVar = new C14362b(mediaParser$SeekMap);
            }
            jVar.mo4162l(tVar);
            return;
        }
        this.dummySeekMap = mediaParser$SeekMap;
    }

    public void onTrackCountFound(int i) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        if (!maybeObtainChunkIndex(trackData.mediaFormat)) {
            ensureSpaceForTrackIndex(i);
            C18368v vVar = this.trackOutputs.get(i);
            if (vVar == null) {
                String string = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
                int trackTypeConstant = toTrackTypeConstant(string != null ? string : trackData.mediaFormat.getString("mime"));
                if (trackTypeConstant == this.primaryTrackType) {
                    this.primaryTrackIndex = i;
                }
                C18368v r = this.extractorOutput.mo4164r(i, trackTypeConstant);
                this.trackOutputs.set(i, r);
                if (string == null) {
                    vVar = r;
                } else {
                    return;
                }
            }
            Format exoPlayerFormat = toExoPlayerFormat(trackData);
            Format format = this.primaryTrackManifestFormat;
            vVar.mo47752a((format == null || i != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(format));
            this.trackFormats.set(i, exoPlayerFormat);
            maybeEndTracks();
        }
    }

    public void setExtractorOutput(C18351j jVar) {
        this.extractorOutput = jVar;
    }

    public void setMuxedCaptionFormats(List<Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.sampleTimestampUpperLimitFilterUs = j;
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }

    public void setTimestampAdjuster(C14086y yVar) {
        this.timestampAdjuster = yVar;
    }

    public OutputConsumerAdapterV30(Format format, int i, boolean z) {
        this.expectDummySeekMap = z;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new C14361a();
        this.extractorOutput = new C0761x();
        this.sampleTimestampUpperLimitFilterUs = -9223372036854775807L;
        this.muxedCaptionFormats = ImmutableList.m25826of();
    }
}
