package com.google.android.exoplayer2.trackselection;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C14383a;
import com.google.android.exoplayer2.trackselection.C14386b;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.C16206p;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.cli.HelpFormatter;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p380ka.C12989a;
import p513bj.C14049b0;
import p513bj.C14083w;
import p594jh.C17931k0;
import p718yi.C18884b;
import p718yi.C18888f;

public final class DefaultTrackSelector extends C14389c {

    /* renamed from: f */
    public static final int[] f32313f = new int[0];

    /* renamed from: g */
    public static final Ordering<Integer> f32314g = Ordering.from(new C12989a(1));

    /* renamed from: h */
    public static final Ordering<Integer> f32315h = Ordering.from(new C18884b());

    /* renamed from: d */
    public final C14386b.C14388b f32316d;

    /* renamed from: e */
    public final AtomicReference<Parameters> f32317e;

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR = new C14374a();
        public static final Parameters DEFAULT_WITHOUT_CONTEXT = new C14378c().mo47881b();
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final boolean forceHighestSupportedBitrate;
        public final boolean forceLowestBitrate;
        public final int maxAudioBitrate;
        public final int maxAudioChannelCount;
        public final int maxVideoBitrate;
        public final int maxVideoFrameRate;
        public final int maxVideoHeight;
        public final int maxVideoWidth;
        public final int minVideoBitrate;
        public final int minVideoFrameRate;
        public final int minVideoHeight;
        public final int minVideoWidth;
        public final ImmutableList<String> preferredAudioMimeTypes;
        public final ImmutableList<String> preferredVideoMimeTypes;
        /* access modifiers changed from: private */
        public final SparseBooleanArray rendererDisabledFlags;
        /* access modifiers changed from: private */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;
        public final int viewportHeight;
        public final boolean viewportOrientationMayChange;
        public final int viewportWidth;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$a */
        public class C14374a implements Parcelable.Creator<Parameters> {
            public final Object createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            public final Object[] newArray(int i) {
                return new Parameters[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Parameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i10, boolean z4, ImmutableList<String> immutableList, ImmutableList<String> immutableList2, int i11, int i12, int i13, boolean z5, boolean z6, boolean z7, boolean z8, ImmutableList<String> immutableList3, ImmutableList<String> immutableList4, int i14, boolean z9, int i15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(immutableList2, i11, immutableList4, i14, z9, i15);
            this.maxVideoWidth = i;
            this.maxVideoHeight = i2;
            this.maxVideoFrameRate = i3;
            this.maxVideoBitrate = i4;
            this.minVideoWidth = i5;
            this.minVideoHeight = i6;
            this.minVideoFrameRate = i7;
            this.minVideoBitrate = i8;
            this.exceedVideoConstraintsIfNecessary = z;
            this.allowVideoMixedMimeTypeAdaptiveness = z2;
            this.allowVideoNonSeamlessAdaptiveness = z3;
            this.viewportWidth = i9;
            this.viewportHeight = i10;
            this.viewportOrientationMayChange = z4;
            this.preferredVideoMimeTypes = immutableList;
            this.maxAudioChannelCount = i12;
            this.maxAudioBitrate = i13;
            this.exceedAudioConstraintsIfNecessary = z5;
            this.allowAudioMixedMimeTypeAdaptiveness = z6;
            this.allowAudioMixedSampleRateAdaptiveness = z7;
            this.allowAudioMixedChannelCountAdaptiveness = z8;
            this.preferredAudioMimeTypes = immutableList3;
            this.forceLowestBitrate = z10;
            this.forceHighestSupportedBitrate = z11;
            this.exceedRendererCapabilitiesIfNecessary = z12;
            this.tunnelingEnabled = z13;
            this.allowMultipleAdaptiveSelections = z14;
            this.selectionOverrides = sparseArray;
            this.rendererDisabledFlags = sparseBooleanArray;
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters getDefaults(Context context) {
            return new C14378c(context).mo47881b();
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> readSelectionOverrides(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                    trackGroupArray.getClass();
                    hashMap.put(trackGroupArray, (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(obj) && this.maxVideoWidth == parameters.maxVideoWidth && this.maxVideoHeight == parameters.maxVideoHeight && this.maxVideoFrameRate == parameters.maxVideoFrameRate && this.maxVideoBitrate == parameters.maxVideoBitrate && this.minVideoWidth == parameters.minVideoWidth && this.minVideoHeight == parameters.minVideoHeight && this.minVideoFrameRate == parameters.minVideoFrameRate && this.minVideoBitrate == parameters.minVideoBitrate && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.viewportOrientationMayChange == parameters.viewportOrientationMayChange && this.viewportWidth == parameters.viewportWidth && this.viewportHeight == parameters.viewportHeight && this.preferredVideoMimeTypes.equals(parameters.preferredVideoMimeTypes) && this.maxAudioChannelCount == parameters.maxAudioChannelCount && this.maxAudioBitrate == parameters.maxAudioBitrate && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.preferredAudioMimeTypes.equals(parameters.preferredAudioMimeTypes) && this.forceLowestBitrate == parameters.forceLowestBitrate && this.forceHighestSupportedBitrate == parameters.forceHighestSupportedBitrate && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides);
        }

        public final boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        public final SelectionOverride getSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map map = this.selectionOverrides.get(i);
            if (map != null) {
                return (SelectionOverride) map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean hasSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map map = this.selectionOverrides.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        public int hashCode() {
            int hashCode = this.preferredVideoMimeTypes.hashCode();
            return ((((((((((this.preferredAudioMimeTypes.hashCode() + ((((((((((((((hashCode + (((((((((((((((((((((((((((((super.hashCode() * 31) + this.maxVideoWidth) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 31) + this.minVideoWidth) * 31) + this.minVideoHeight) * 31) + this.minVideoFrameRate) * 31) + this.minVideoBitrate) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31)) * 31) + this.maxAudioChannelCount) * 31) + this.maxAudioBitrate) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31)) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.forceHighestSupportedBitrate ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.maxVideoWidth);
            parcel.writeInt(this.maxVideoHeight);
            parcel.writeInt(this.maxVideoFrameRate);
            parcel.writeInt(this.maxVideoBitrate);
            parcel.writeInt(this.minVideoWidth);
            parcel.writeInt(this.minVideoHeight);
            parcel.writeInt(this.minVideoFrameRate);
            parcel.writeInt(this.minVideoBitrate);
            boolean z = this.exceedVideoConstraintsIfNecessary;
            int i2 = C14049b0.f30913a;
            parcel.writeInt(z ? 1 : 0);
            parcel.writeInt(this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0);
            parcel.writeInt(this.allowVideoNonSeamlessAdaptiveness ? 1 : 0);
            parcel.writeInt(this.viewportWidth);
            parcel.writeInt(this.viewportHeight);
            parcel.writeInt(this.viewportOrientationMayChange ? 1 : 0);
            parcel.writeList(this.preferredVideoMimeTypes);
            parcel.writeInt(this.maxAudioChannelCount);
            parcel.writeInt(this.maxAudioBitrate);
            parcel.writeInt(this.exceedAudioConstraintsIfNecessary ? 1 : 0);
            parcel.writeInt(this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0);
            parcel.writeInt(this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0);
            parcel.writeInt(this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0);
            parcel.writeList(this.preferredAudioMimeTypes);
            parcel.writeInt(this.forceLowestBitrate ? 1 : 0);
            parcel.writeInt(this.forceHighestSupportedBitrate ? 1 : 0);
            parcel.writeInt(this.exceedRendererCapabilitiesIfNecessary ? 1 : 0);
            parcel.writeInt(this.tunnelingEnabled ? 1 : 0);
            parcel.writeInt(this.allowMultipleAdaptiveSelections ? 1 : 0);
            writeSelectionOverridesToParcel(parcel, this.selectionOverrides);
            parcel.writeSparseBooleanArray(this.rendererDisabledFlags);
        }

        public C14378c buildUpon() {
            return new C14378c(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean areSelectionOverridesEqual(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p513bj.C14049b0.m21628a(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.areSelectionOverridesEqual(java.util.Map, java.util.Map):boolean");
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.maxVideoWidth = parcel.readInt();
            this.maxVideoHeight = parcel.readInt();
            this.maxVideoFrameRate = parcel.readInt();
            this.maxVideoBitrate = parcel.readInt();
            this.minVideoWidth = parcel.readInt();
            this.minVideoHeight = parcel.readInt();
            this.minVideoFrameRate = parcel.readInt();
            this.minVideoBitrate = parcel.readInt();
            int i = C14049b0.f30913a;
            boolean z = true;
            this.exceedVideoConstraintsIfNecessary = parcel.readInt() != 0;
            this.allowVideoMixedMimeTypeAdaptiveness = parcel.readInt() != 0;
            this.allowVideoNonSeamlessAdaptiveness = parcel.readInt() != 0;
            this.viewportWidth = parcel.readInt();
            this.viewportHeight = parcel.readInt();
            this.viewportOrientationMayChange = parcel.readInt() != 0;
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, (ClassLoader) null);
            this.preferredVideoMimeTypes = ImmutableList.copyOf(arrayList);
            this.maxAudioChannelCount = parcel.readInt();
            this.maxAudioBitrate = parcel.readInt();
            this.exceedAudioConstraintsIfNecessary = parcel.readInt() != 0;
            this.allowAudioMixedMimeTypeAdaptiveness = parcel.readInt() != 0;
            this.allowAudioMixedSampleRateAdaptiveness = parcel.readInt() != 0;
            this.allowAudioMixedChannelCountAdaptiveness = parcel.readInt() != 0;
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, (ClassLoader) null);
            this.preferredAudioMimeTypes = ImmutableList.copyOf(arrayList2);
            this.forceLowestBitrate = parcel.readInt() != 0;
            this.forceHighestSupportedBitrate = parcel.readInt() != 0;
            this.exceedRendererCapabilitiesIfNecessary = parcel.readInt() != 0;
            this.tunnelingEnabled = parcel.readInt() != 0;
            this.allowMultipleAdaptiveSelections = parcel.readInt() == 0 ? false : z;
            this.selectionOverrides = readSelectionOverrides(parcel);
            this.rendererDisabledFlags = parcel.readSparseBooleanArray();
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new C14375a();
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$a */
        public class C14375a implements Parcelable.Creator<SelectionOverride> {
            public final Object createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            public final Object[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.tracks) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.tracks) + (this.groupIndex * 31)) * 31) + this.type;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.groupIndex);
            parcel.writeInt(this.tracks.length);
            parcel.writeIntArray(this.tracks);
            parcel.writeInt(this.type);
        }

        public SelectionOverride(int i, int[] iArr, int i2) {
            this.groupIndex = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = copyOf;
            this.length = iArr.length;
            this.type = i2;
            Arrays.sort(copyOf);
        }

        public SelectionOverride(Parcel parcel) {
            this.groupIndex = parcel.readInt();
            int readByte = parcel.readByte();
            this.length = readByte;
            int[] iArr = new int[readByte];
            this.tracks = iArr;
            parcel.readIntArray(iArr);
            this.type = parcel.readInt();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a */
    public static final class C14376a implements Comparable<C14376a> {

        /* renamed from: b */
        public final boolean f32318b;

        /* renamed from: c */
        public final String f32319c;

        /* renamed from: d */
        public final Parameters f32320d;

        /* renamed from: e */
        public final boolean f32321e;

        /* renamed from: f */
        public final int f32322f;

        /* renamed from: g */
        public final int f32323g;

        /* renamed from: h */
        public final int f32324h;

        /* renamed from: i */
        public final int f32325i;

        /* renamed from: j */
        public final int f32326j;

        /* renamed from: k */
        public final boolean f32327k;

        /* renamed from: l */
        public final int f32328l;

        /* renamed from: m */
        public final int f32329m;

        /* renamed from: n */
        public final int f32330n;

        /* renamed from: o */
        public final int f32331o;

        public C14376a(Format format, Parameters parameters, int i) {
            int i2;
            int i3;
            String[] strArr;
            int i4;
            this.f32320d = parameters;
            this.f32319c = DefaultTrackSelector.m22765h(format.language);
            int i5 = 0;
            this.f32321e = DefaultTrackSelector.m22763f(i, false);
            int i6 = 0;
            while (true) {
                int size = parameters.preferredAudioLanguages.size();
                i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i6 >= size) {
                    i3 = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                }
                i3 = DefaultTrackSelector.m22761c(format, parameters.preferredAudioLanguages.get(i6), false);
                if (i3 > 0) {
                    break;
                }
                i6++;
            }
            this.f32323g = i6;
            this.f32322f = i3;
            this.f32324h = Integer.bitCount(format.roleFlags & parameters.preferredAudioRoleFlags);
            this.f32327k = (format.selectionFlags & 1) != 0;
            int i7 = format.channelCount;
            this.f32328l = i7;
            this.f32329m = format.sampleRate;
            int i8 = format.bitrate;
            this.f32330n = i8;
            this.f32318b = (i8 == -1 || i8 <= parameters.maxAudioBitrate) && (i7 == -1 || i7 <= parameters.maxAudioChannelCount);
            int i9 = C14049b0.f30913a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i10 = C14049b0.f30913a;
            if (i10 >= 24) {
                strArr = configuration.getLocales().toLanguageTags().split(",", -1);
            } else {
                String[] strArr2 = new String[1];
                Locale locale = configuration.locale;
                strArr2[0] = i10 >= 21 ? locale.toLanguageTag() : locale.toString();
                strArr = strArr2;
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                strArr[i11] = C14049b0.m21622C(strArr[i11]);
            }
            int i12 = 0;
            while (true) {
                if (i12 >= strArr.length) {
                    i4 = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                }
                i4 = DefaultTrackSelector.m22761c(format, strArr[i12], false);
                if (i4 > 0) {
                    break;
                }
                i12++;
            }
            this.f32325i = i12;
            this.f32326j = i4;
            while (true) {
                if (i5 < parameters.preferredAudioMimeTypes.size()) {
                    String str = format.sampleMimeType;
                    if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            this.f32331o = i2;
        }

        /* renamed from: a */
        public final int compareTo(C14376a aVar) {
            Ordering<Integer> reverse = (!this.f32318b || !this.f32321e) ? DefaultTrackSelector.f32314g.reverse() : DefaultTrackSelector.f32314g;
            C16206p d = C16206p.f36306a.mo57712e(this.f32321e, aVar.f32321e).mo57711d(Integer.valueOf(this.f32323g), Integer.valueOf(aVar.f32323g), Ordering.natural().reverse()).mo57708a(this.f32322f, aVar.f32322f).mo57708a(this.f32324h, aVar.f32324h).mo57712e(this.f32318b, aVar.f32318b).mo57711d(Integer.valueOf(this.f32331o), Integer.valueOf(aVar.f32331o), Ordering.natural().reverse()).mo57711d(Integer.valueOf(this.f32330n), Integer.valueOf(aVar.f32330n), this.f32320d.forceLowestBitrate ? DefaultTrackSelector.f32314g.reverse() : DefaultTrackSelector.f32315h).mo57712e(this.f32327k, aVar.f32327k).mo57711d(Integer.valueOf(this.f32325i), Integer.valueOf(aVar.f32325i), Ordering.natural().reverse()).mo57708a(this.f32326j, aVar.f32326j).mo57711d(Integer.valueOf(this.f32328l), Integer.valueOf(aVar.f32328l), reverse).mo57711d(Integer.valueOf(this.f32329m), Integer.valueOf(aVar.f32329m), reverse);
            Integer valueOf = Integer.valueOf(this.f32330n);
            Integer valueOf2 = Integer.valueOf(aVar.f32330n);
            if (!C14049b0.m21628a(this.f32319c, aVar.f32319c)) {
                reverse = DefaultTrackSelector.f32315h;
            }
            return d.mo57711d(valueOf, valueOf2, reverse).mo57714g();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b */
    public static final class C14377b implements Comparable<C14377b> {

        /* renamed from: b */
        public final boolean f32332b;

        /* renamed from: c */
        public final boolean f32333c;

        public C14377b(Format format, int i) {
            this.f32332b = (format.selectionFlags & 1) == 0 ? false : true;
            this.f32333c = DefaultTrackSelector.m22763f(i, false);
        }

        public final int compareTo(Object obj) {
            C14377b bVar = (C14377b) obj;
            return C16206p.f36306a.mo57712e(this.f32333c, bVar.f32333c).mo57712e(this.f32332b, bVar.f32332b).mo57714g();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d */
    public static final class C14379d implements Comparable<C14379d> {

        /* renamed from: b */
        public final boolean f32363b;

        /* renamed from: c */
        public final boolean f32364c;

        /* renamed from: d */
        public final boolean f32365d;

        /* renamed from: e */
        public final boolean f32366e;

        /* renamed from: f */
        public final int f32367f;

        /* renamed from: g */
        public final int f32368g;

        /* renamed from: h */
        public final int f32369h;

        /* renamed from: i */
        public final int f32370i;

        /* renamed from: j */
        public final boolean f32371j;

        public C14379d(Format format, Parameters parameters, int i, String str) {
            int i2;
            boolean z = false;
            this.f32364c = DefaultTrackSelector.m22763f(i, false);
            int i3 = format.selectionFlags & (~parameters.disabledTextTrackSelectionFlags);
            this.f32365d = (i3 & 1) != 0;
            this.f32366e = (i3 & 2) != 0;
            int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            ImmutableList<String> of = parameters.preferredTextLanguages.isEmpty() ? ImmutableList.m25827of("") : parameters.preferredTextLanguages;
            int i5 = 0;
            while (true) {
                if (i5 >= of.size()) {
                    i2 = 0;
                    break;
                }
                i2 = DefaultTrackSelector.m22761c(format, of.get(i5), parameters.selectUndeterminedTextLanguage);
                if (i2 > 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            this.f32367f = i4;
            this.f32368g = i2;
            int bitCount = Integer.bitCount(format.roleFlags & parameters.preferredTextRoleFlags);
            this.f32369h = bitCount;
            this.f32371j = (format.roleFlags & 1088) != 0;
            int c = DefaultTrackSelector.m22761c(format, str, DefaultTrackSelector.m22765h(str) == null);
            this.f32370i = c;
            if (i2 > 0 || ((parameters.preferredTextLanguages.isEmpty() && bitCount > 0) || this.f32365d || (this.f32366e && c > 0))) {
                z = true;
            }
            this.f32363b = z;
        }

        /* renamed from: a */
        public final int compareTo(C14379d dVar) {
            C16206p a = C16206p.f36306a.mo57712e(this.f32364c, dVar.f32364c).mo57711d(Integer.valueOf(this.f32367f), Integer.valueOf(dVar.f32367f), Ordering.natural().reverse()).mo57708a(this.f32368g, dVar.f32368g).mo57708a(this.f32369h, dVar.f32369h).mo57712e(this.f32365d, dVar.f32365d).mo57711d(Boolean.valueOf(this.f32366e), Boolean.valueOf(dVar.f32366e), this.f32368g == 0 ? Ordering.natural() : Ordering.natural().reverse()).mo57708a(this.f32370i, dVar.f32370i);
            if (this.f32369h == 0) {
                a = a.mo57713f(this.f32371j, dVar.f32371j);
            }
            return a.mo57714g();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$e */
    public static final class C14380e implements Comparable<C14380e> {

        /* renamed from: b */
        public final boolean f32372b;

        /* renamed from: c */
        public final Parameters f32373c;

        /* renamed from: d */
        public final boolean f32374d;

        /* renamed from: e */
        public final boolean f32375e;

        /* renamed from: f */
        public final int f32376f;

        /* renamed from: g */
        public final int f32377g;

        /* renamed from: h */
        public final int f32378h;

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
            if (r10 < ((float) r8.minVideoFrameRate)) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
            if (r10 < r8.minVideoBitrate) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0091 A[EDGE_INSN: B:50:0x0091->B:48:0x0091 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C14380e(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f32373c = r8
                r0 = 1
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L_0x0033
                int r4 = r7.width
                if (r4 == r3) goto L_0x0014
                int r5 = r8.maxVideoWidth
                if (r4 > r5) goto L_0x0033
            L_0x0014:
                int r4 = r7.height
                if (r4 == r3) goto L_0x001c
                int r5 = r8.maxVideoHeight
                if (r4 > r5) goto L_0x0033
            L_0x001c:
                float r4 = r7.frameRate
                int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r5 == 0) goto L_0x0029
                int r5 = r8.maxVideoFrameRate
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x0033
            L_0x0029:
                int r4 = r7.bitrate
                if (r4 == r3) goto L_0x0031
                int r5 = r8.maxVideoBitrate
                if (r4 > r5) goto L_0x0033
            L_0x0031:
                r4 = r0
                goto L_0x0034
            L_0x0033:
                r4 = r2
            L_0x0034:
                r6.f32372b = r4
                if (r10 == 0) goto L_0x005e
                int r10 = r7.width
                if (r10 == r3) goto L_0x0040
                int r4 = r8.minVideoWidth
                if (r10 < r4) goto L_0x005e
            L_0x0040:
                int r10 = r7.height
                if (r10 == r3) goto L_0x0048
                int r4 = r8.minVideoHeight
                if (r10 < r4) goto L_0x005e
            L_0x0048:
                float r10 = r7.frameRate
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0055
                int r1 = r8.minVideoFrameRate
                float r1 = (float) r1
                int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r10 < 0) goto L_0x005e
            L_0x0055:
                int r10 = r7.bitrate
                if (r10 == r3) goto L_0x005f
                int r1 = r8.minVideoBitrate
                if (r10 < r1) goto L_0x005e
                goto L_0x005f
            L_0x005e:
                r0 = r2
            L_0x005f:
                r6.f32374d = r0
                boolean r9 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22763f(r9, r2)
                r6.f32375e = r9
                int r9 = r7.bitrate
                r6.f32376f = r9
                int r9 = r7.getPixelCount()
                r6.f32377g = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L_0x0074:
                com.google.common.collect.ImmutableList<java.lang.String> r10 = r8.preferredVideoMimeTypes
                int r10 = r10.size()
                if (r2 >= r10) goto L_0x0091
                java.lang.String r10 = r7.sampleMimeType
                if (r10 == 0) goto L_0x008e
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.preferredVideoMimeTypes
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L_0x008e
                r9 = r2
                goto L_0x0091
            L_0x008e:
                int r2 = r2 + 1
                goto L_0x0074
            L_0x0091:
                r6.f32378h = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C14380e.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters, int, boolean):void");
        }

        /* renamed from: a */
        public final int compareTo(C14380e eVar) {
            Ordering<Integer> reverse = (!this.f32372b || !this.f32375e) ? DefaultTrackSelector.f32314g.reverse() : DefaultTrackSelector.f32314g;
            return C16206p.f36306a.mo57712e(this.f32375e, eVar.f32375e).mo57712e(this.f32372b, eVar.f32372b).mo57712e(this.f32374d, eVar.f32374d).mo57711d(Integer.valueOf(this.f32378h), Integer.valueOf(eVar.f32378h), Ordering.natural().reverse()).mo57711d(Integer.valueOf(this.f32376f), Integer.valueOf(eVar.f32376f), this.f32373c.forceLowestBitrate ? DefaultTrackSelector.f32314g.reverse() : DefaultTrackSelector.f32315h).mo57711d(Integer.valueOf(this.f32377g), Integer.valueOf(eVar.f32377g), reverse).mo57711d(Integer.valueOf(this.f32376f), Integer.valueOf(eVar.f32376f), reverse).mo57714g();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, new C14383a.C14385b());
    }

    /* renamed from: c */
    public static int m22761c(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        String h = m22765h(str);
        String h2 = m22765h(format.language);
        if (h2 == null || h == null) {
            return (!z || h2 != null) ? 0 : 1;
        }
        if (h2.startsWith(h) || h.startsWith(h2)) {
            return 3;
        }
        int i = C14049b0.f30913a;
        return h2.split(HelpFormatter.DEFAULT_OPT_PREFIX, 2)[0].equals(h.split(HelpFormatter.DEFAULT_OPT_PREFIX, 2)[0]) ? 2 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m22762e(com.google.android.exoplayer2.source.TrackGroup r16, int r17, int r18, boolean r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.length
            r3.<init>(r4)
            r4 = 0
            r5 = r4
        L_0x000f:
            int r6 = r0.length
            if (r5 >= r6) goto L_0x001d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.add(r6)
            int r5 = r5 + 1
            goto L_0x000f
        L_0x001d:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto L_0x00aa
            if (r2 != r5) goto L_0x0026
            goto L_0x00aa
        L_0x0026:
            r6 = r4
            r7 = r5
        L_0x0028:
            int r8 = r0.length
            r9 = -1
            r10 = 1
            if (r6 >= r8) goto L_0x0085
            com.google.android.exoplayer2.Format r8 = r0.getFormat(r6)
            int r11 = r8.width
            if (r11 <= 0) goto L_0x0082
            int r12 = r8.height
            if (r12 <= 0) goto L_0x0082
            if (r19 == 0) goto L_0x004a
            if (r11 <= r12) goto L_0x0040
            r13 = r10
            goto L_0x0041
        L_0x0040:
            r13 = r4
        L_0x0041:
            if (r1 <= r2) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r10 = r4
        L_0x0045:
            if (r13 == r10) goto L_0x004a
            r10 = r1
            r13 = r2
            goto L_0x004c
        L_0x004a:
            r13 = r1
            r10 = r2
        L_0x004c:
            int r14 = r11 * r10
            int r15 = r12 * r13
            if (r14 < r15) goto L_0x005d
            android.graphics.Point r10 = new android.graphics.Point
            int r12 = p513bj.C14049b0.f30913a
            int r15 = r15 + r11
            int r15 = r15 + r9
            int r15 = r15 / r11
            r10.<init>(r13, r15)
            goto L_0x0068
        L_0x005d:
            android.graphics.Point r11 = new android.graphics.Point
            int r13 = p513bj.C14049b0.f30913a
            int r14 = r14 + r12
            int r14 = r14 + r9
            int r14 = r14 / r12
            r11.<init>(r14, r10)
            r10 = r11
        L_0x0068:
            int r9 = r8.width
            int r8 = r8.height
            int r11 = r9 * r8
            int r12 = r10.x
            float r12 = (float) r12
            r13 = 1065017672(0x3f7ae148, float:0.98)
            float r12 = r12 * r13
            int r12 = (int) r12
            if (r9 < r12) goto L_0x0082
            int r9 = r10.y
            float r9 = (float) r9
            float r9 = r9 * r13
            int r9 = (int) r9
            if (r8 < r9) goto L_0x0082
            if (r11 >= r7) goto L_0x0082
            r7 = r11
        L_0x0082:
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0085:
            if (r7 == r5) goto L_0x00aa
            int r1 = r3.size()
            int r1 = r1 - r10
        L_0x008c:
            if (r1 < 0) goto L_0x00aa
            java.lang.Object r2 = r3.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.exoplayer2.Format r2 = r0.getFormat(r2)
            int r2 = r2.getPixelCount()
            if (r2 == r9) goto L_0x00a4
            if (r2 <= r7) goto L_0x00a7
        L_0x00a4:
            r3.remove(r1)
        L_0x00a7:
            int r1 = r1 + -1
            goto L_0x008c
        L_0x00aa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22762e(com.google.android.exoplayer2.source.TrackGroup, int, int, boolean):java.util.ArrayList");
    }

    /* renamed from: f */
    public static boolean m22763f(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        r2 = r2.bitrate;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22764g(com.google.android.exoplayer2.Format r2, java.lang.String r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            int r0 = r2.roleFlags
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = m22763f(r4, r1)
            if (r0 == 0) goto L_0x0047
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0047
            if (r3 == 0) goto L_0x001b
            java.lang.String r4 = r2.sampleMimeType
            boolean r3 = p513bj.C14049b0.m21628a(r4, r3)
            if (r3 == 0) goto L_0x0047
        L_0x001b:
            int r3 = r2.width
            r4 = -1
            if (r3 == r4) goto L_0x0024
            if (r10 > r3) goto L_0x0047
            if (r3 > r6) goto L_0x0047
        L_0x0024:
            int r3 = r2.height
            if (r3 == r4) goto L_0x002c
            if (r11 > r3) goto L_0x0047
            if (r3 > r7) goto L_0x0047
        L_0x002c:
            float r3 = r2.frameRate
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x003e
            float r5 = (float) r12
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0047
            float r5 = (float) r8
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0047
        L_0x003e:
            int r2 = r2.bitrate
            if (r2 == r4) goto L_0x0047
            if (r13 > r2) goto L_0x0047
            if (r2 > r9) goto L_0x0047
            r1 = 1
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m22764g(com.google.android.exoplayer2.Format, java.lang.String, int, int, int, int, int, int, int, int, int, int):boolean");
    }

    /* renamed from: h */
    public static String m22765h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final Parameters mo47858d() {
        return this.f32317e.get();
    }

    /* renamed from: i */
    public final void mo47859i(C14378c cVar) {
        C18888f.C18889a aVar;
        Parameters b = cVar.mo47881b();
        if (!this.f32317e.getAndSet(b).equals(b) && (aVar = this.f42066a) != null) {
            ((C14083w) ((C17931k0) aVar).f39058h).mo46950c(10);
        }
    }

    public DefaultTrackSelector(Parameters parameters, C14383a.C14385b bVar) {
        this.f32316d = bVar;
        this.f32317e = new AtomicReference<>(parameters);
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c */
    public static final class C14378c extends TrackSelectionParameters.C14382b {

        /* renamed from: A */
        public boolean f32334A;

        /* renamed from: B */
        public ImmutableList<String> f32335B;

        /* renamed from: C */
        public boolean f32336C;

        /* renamed from: D */
        public boolean f32337D;

        /* renamed from: E */
        public boolean f32338E;

        /* renamed from: F */
        public boolean f32339F;

        /* renamed from: G */
        public boolean f32340G;

        /* renamed from: H */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f32341H;

        /* renamed from: I */
        public final SparseBooleanArray f32342I;

        /* renamed from: g */
        public int f32343g;

        /* renamed from: h */
        public int f32344h;

        /* renamed from: i */
        public int f32345i;

        /* renamed from: j */
        public int f32346j;

        /* renamed from: k */
        public int f32347k;

        /* renamed from: l */
        public int f32348l;

        /* renamed from: m */
        public int f32349m;

        /* renamed from: n */
        public int f32350n;

        /* renamed from: o */
        public boolean f32351o;

        /* renamed from: p */
        public boolean f32352p;

        /* renamed from: q */
        public boolean f32353q;

        /* renamed from: r */
        public int f32354r;

        /* renamed from: s */
        public int f32355s;

        /* renamed from: t */
        public boolean f32356t;

        /* renamed from: u */
        public ImmutableList<String> f32357u;

        /* renamed from: v */
        public int f32358v;

        /* renamed from: w */
        public int f32359w;

        /* renamed from: x */
        public boolean f32360x;

        /* renamed from: y */
        public boolean f32361y;

        /* renamed from: z */
        public boolean f32362z;

        @Deprecated
        public C14378c() {
            mo47883d();
            this.f32341H = new SparseArray<>();
            this.f32342I = new SparseBooleanArray();
        }

        /* renamed from: a */
        public final void mo47880a(Context context) {
            super.mo47880a(context);
        }

        /* renamed from: b */
        public final Parameters mo47881b() {
            return new Parameters(this.f32343g, this.f32344h, this.f32345i, this.f32346j, this.f32347k, this.f32348l, this.f32349m, this.f32350n, this.f32351o, this.f32352p, this.f32353q, this.f32354r, this.f32355s, this.f32356t, this.f32357u, this.f32379a, this.f32380b, this.f32358v, this.f32359w, this.f32360x, this.f32361y, this.f32362z, this.f32334A, this.f32335B, this.f32381c, this.f32382d, this.f32383e, this.f32384f, this.f32336C, this.f32337D, this.f32338E, this.f32339F, this.f32340G, this.f32341H, this.f32342I);
        }

        /* renamed from: c */
        public final void mo47882c(int i) {
            Map map = this.f32341H.get(i);
            if (map != null && !map.isEmpty()) {
                this.f32341H.remove(i);
            }
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioMimeTypes"})
        /* renamed from: d */
        public final void mo47883d() {
            this.f32343g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32344h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32345i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32346j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32351o = true;
            this.f32352p = false;
            this.f32353q = true;
            this.f32354r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32355s = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32356t = true;
            this.f32357u = ImmutableList.m25826of();
            this.f32358v = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32359w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32360x = true;
            this.f32361y = false;
            this.f32362z = false;
            this.f32334A = false;
            this.f32335B = ImmutableList.m25826of();
            this.f32336C = false;
            this.f32337D = false;
            this.f32338E = true;
            this.f32339F = false;
            this.f32340G = true;
        }

        /* renamed from: e */
        public final void mo47884e(int i, boolean z) {
            if (this.f32342I.get(i) != z) {
                if (z) {
                    this.f32342I.put(i, true);
                } else {
                    this.f32342I.delete(i);
                }
            }
        }

        public C14378c(Context context) {
            super(context);
            Point point;
            String str;
            mo47883d();
            this.f32341H = new SparseArray<>();
            this.f32342I = new SparseBooleanArray();
            int i = C14049b0.f30913a;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            Display defaultDisplay = windowManager.getDefaultDisplay();
            int i2 = C14049b0.f30913a;
            if (i2 <= 29 && defaultDisplay.getDisplayId() == 0) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                    if (!"Sony".equals(C14049b0.f30915c) || !C14049b0.f30916d.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        if (i2 < 28) {
                            str = C14049b0.m21651x("sys.display-size");
                        } else {
                            str = C14049b0.m21651x("vendor.display-size");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                String[] split = str.trim().split(EtsyDialogFragment.OPT_X_BUTTON, -1);
                                if (split.length == 2) {
                                    int parseInt = Integer.parseInt(split[0]);
                                    int parseInt2 = Integer.parseInt(split[1]);
                                    if (parseInt > 0 && parseInt2 > 0) {
                                        point = new Point(parseInt, parseInt2);
                                        int i3 = point.x;
                                        int i4 = point.y;
                                        this.f32354r = i3;
                                        this.f32355s = i4;
                                        this.f32356t = true;
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            String valueOf = String.valueOf(str);
                            Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
                        }
                    } else {
                        point = new Point(3840, 2160);
                        int i32 = point.x;
                        int i42 = point.y;
                        this.f32354r = i32;
                        this.f32355s = i42;
                        this.f32356t = true;
                    }
                }
            }
            point = new Point();
            int i5 = C14049b0.f30913a;
            if (i5 >= 23) {
                Display.Mode mode = defaultDisplay.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else if (i5 >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            int i322 = point.x;
            int i422 = point.y;
            this.f32354r = i322;
            this.f32355s = i422;
            this.f32356t = true;
        }

        public C14378c(Parameters parameters) {
            super((TrackSelectionParameters) parameters);
            this.f32343g = parameters.maxVideoWidth;
            this.f32344h = parameters.maxVideoHeight;
            this.f32345i = parameters.maxVideoFrameRate;
            this.f32346j = parameters.maxVideoBitrate;
            this.f32347k = parameters.minVideoWidth;
            this.f32348l = parameters.minVideoHeight;
            this.f32349m = parameters.minVideoFrameRate;
            this.f32350n = parameters.minVideoBitrate;
            this.f32351o = parameters.exceedVideoConstraintsIfNecessary;
            this.f32352p = parameters.allowVideoMixedMimeTypeAdaptiveness;
            this.f32353q = parameters.allowVideoNonSeamlessAdaptiveness;
            this.f32354r = parameters.viewportWidth;
            this.f32355s = parameters.viewportHeight;
            this.f32356t = parameters.viewportOrientationMayChange;
            this.f32357u = parameters.preferredVideoMimeTypes;
            this.f32358v = parameters.maxAudioChannelCount;
            this.f32359w = parameters.maxAudioBitrate;
            this.f32360x = parameters.exceedAudioConstraintsIfNecessary;
            this.f32361y = parameters.allowAudioMixedMimeTypeAdaptiveness;
            this.f32362z = parameters.allowAudioMixedSampleRateAdaptiveness;
            this.f32334A = parameters.allowAudioMixedChannelCountAdaptiveness;
            this.f32335B = parameters.preferredAudioMimeTypes;
            this.f32336C = parameters.forceLowestBitrate;
            this.f32337D = parameters.forceHighestSupportedBitrate;
            this.f32338E = parameters.exceedRendererCapabilitiesIfNecessary;
            this.f32339F = parameters.tunnelingEnabled;
            this.f32340G = parameters.allowMultipleAdaptiveSelections;
            SparseArray access$000 = parameters.selectionOverrides;
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>();
            for (int i = 0; i < access$000.size(); i++) {
                sparseArray.put(access$000.keyAt(i), new HashMap((Map) access$000.valueAt(i)));
            }
            this.f32341H = sparseArray;
            this.f32342I = parameters.rendererDisabledFlags.clone();
        }
    }
}
