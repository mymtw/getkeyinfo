package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Locale;
import p513bj.C14049b0;

public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR = new C14381a();
    @Deprecated
    public static final TrackSelectionParameters DEFAULT;
    public static final TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;
    public final int disabledTextTrackSelectionFlags;
    public final ImmutableList<String> preferredAudioLanguages;
    public final int preferredAudioRoleFlags;
    public final ImmutableList<String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final boolean selectUndeterminedTextLanguage;

    /* renamed from: com.google.android.exoplayer2.trackselection.TrackSelectionParameters$a */
    public class C14381a implements Parcelable.Creator<TrackSelectionParameters> {
        public final Object createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        public final Object[] newArray(int i) {
            return new TrackSelectionParameters[i];
        }
    }

    static {
        TrackSelectionParameters trackSelectionParameters = new TrackSelectionParameters(ImmutableList.m25826of(), 0, ImmutableList.m25826of(), 0, false, 0);
        DEFAULT_WITHOUT_CONTEXT = trackSelectionParameters;
        DEFAULT = trackSelectionParameters;
    }

    public TrackSelectionParameters(ImmutableList<String> immutableList, int i, ImmutableList<String> immutableList2, int i2, boolean z, int i3) {
        this.preferredAudioLanguages = immutableList;
        this.preferredAudioRoleFlags = i;
        this.preferredTextLanguages = immutableList2;
        this.preferredTextRoleFlags = i2;
        this.selectUndeterminedTextLanguage = z;
        this.disabledTextTrackSelectionFlags = i3;
    }

    public static TrackSelectionParameters getDefaults(Context context) {
        C14382b bVar = new C14382b(context);
        return new TrackSelectionParameters(bVar.f32379a, bVar.f32380b, bVar.f32381c, bVar.f32382d, bVar.f32383e, bVar.f32384f);
    }

    public C14382b buildUpon() {
        return new C14382b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.preferredAudioLanguages.equals(trackSelectionParameters.preferredAudioLanguages) && this.preferredAudioRoleFlags == trackSelectionParameters.preferredAudioRoleFlags && this.preferredTextLanguages.equals(trackSelectionParameters.preferredTextLanguages) && this.preferredTextRoleFlags == trackSelectionParameters.preferredTextRoleFlags && this.selectUndeterminedTextLanguage == trackSelectionParameters.selectUndeterminedTextLanguage && this.disabledTextTrackSelectionFlags == trackSelectionParameters.disabledTextTrackSelectionFlags;
    }

    public int hashCode() {
        return ((((((this.preferredTextLanguages.hashCode() + ((((this.preferredAudioLanguages.hashCode() + 31) * 31) + this.preferredAudioRoleFlags) * 31)) * 31) + this.preferredTextRoleFlags) * 31) + (this.selectUndeterminedTextLanguage ? 1 : 0)) * 31) + this.disabledTextTrackSelectionFlags;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.preferredAudioLanguages);
        parcel.writeInt(this.preferredAudioRoleFlags);
        parcel.writeList(this.preferredTextLanguages);
        parcel.writeInt(this.preferredTextRoleFlags);
        boolean z = this.selectUndeterminedTextLanguage;
        int i2 = C14049b0.f30913a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.disabledTextTrackSelectionFlags);
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.TrackSelectionParameters$b */
    public static class C14382b {

        /* renamed from: a */
        public ImmutableList<String> f32379a;

        /* renamed from: b */
        public int f32380b;

        /* renamed from: c */
        public ImmutableList<String> f32381c;

        /* renamed from: d */
        public int f32382d;

        /* renamed from: e */
        public boolean f32383e;

        /* renamed from: f */
        public int f32384f;

        public C14382b(Context context) {
            this();
            mo47880a(context);
        }

        /* renamed from: a */
        public void mo47880a(Context context) {
            CaptioningManager captioningManager;
            int i = C14049b0.f30913a;
            if (i < 19) {
                return;
            }
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f32382d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f32381c = ImmutableList.m25827of(i >= 21 ? locale.toLanguageTag() : locale.toString());
                }
            }
        }

        @Deprecated
        public C14382b() {
            this.f32379a = ImmutableList.m25826of();
            this.f32380b = 0;
            this.f32381c = ImmutableList.m25826of();
            this.f32382d = 0;
            this.f32383e = false;
            this.f32384f = 0;
        }

        public C14382b(TrackSelectionParameters trackSelectionParameters) {
            this.f32379a = trackSelectionParameters.preferredAudioLanguages;
            this.f32380b = trackSelectionParameters.preferredAudioRoleFlags;
            this.f32381c = trackSelectionParameters.preferredTextLanguages;
            this.f32382d = trackSelectionParameters.preferredTextRoleFlags;
            this.f32383e = trackSelectionParameters.selectUndeterminedTextLanguage;
            this.f32384f = trackSelectionParameters.disabledTextTrackSelectionFlags;
        }
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, (ClassLoader) null);
        this.preferredAudioLanguages = ImmutableList.copyOf(arrayList);
        this.preferredAudioRoleFlags = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, (ClassLoader) null);
        this.preferredTextLanguages = ImmutableList.copyOf(arrayList2);
        this.preferredTextRoleFlags = parcel.readInt();
        int i = C14049b0.f30913a;
        this.selectUndeterminedTextLanguage = parcel.readInt() != 0;
        this.disabledTextTrackSelectionFlags = parcel.readInt();
    }
}
