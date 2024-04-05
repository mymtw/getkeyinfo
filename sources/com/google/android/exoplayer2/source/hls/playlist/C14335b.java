package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p620mi.C18231c;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.b */
public final class C14335b extends C18231c {

    /* renamed from: n */
    public static final C14335b f32101n = new C14335b("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (Format) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f32102d;

    /* renamed from: e */
    public final List<C14337b> f32103e;

    /* renamed from: f */
    public final List<C14336a> f32104f;

    /* renamed from: g */
    public final List<C14336a> f32105g;

    /* renamed from: h */
    public final List<C14336a> f32106h;

    /* renamed from: i */
    public final List<C14336a> f32107i;

    /* renamed from: j */
    public final Format f32108j;

    /* renamed from: k */
    public final List<Format> f32109k;

    /* renamed from: l */
    public final Map<String, String> f32110l;

    /* renamed from: m */
    public final List<DrmInitData> f32111m;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.b$a */
    public static final class C14336a {

        /* renamed from: a */
        public final Uri f32112a;

        /* renamed from: b */
        public final Format f32113b;

        /* renamed from: c */
        public final String f32114c;

        public C14336a(Uri uri, Format format, String str) {
            this.f32112a = uri;
            this.f32113b = format;
            this.f32114c = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.b$b */
    public static final class C14337b {

        /* renamed from: a */
        public final Uri f32115a;

        /* renamed from: b */
        public final Format f32116b;

        /* renamed from: c */
        public final String f32117c;

        /* renamed from: d */
        public final String f32118d;

        /* renamed from: e */
        public final String f32119e;

        /* renamed from: f */
        public final String f32120f;

        public C14337b(Uri uri, Format format, String str, String str2, String str3, String str4) {
            this.f32115a = uri;
            this.f32116b = format;
            this.f32117c = str;
            this.f32118d = str2;
            this.f32119e = str3;
            this.f32120f = str4;
        }
    }

    public C14335b(String str, List<String> list, List<C14337b> list2, List<C14336a> list3, List<C14336a> list4, List<C14336a> list5, List<C14336a> list6, Format format, List<Format> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(z, str, list);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = list2.get(i).f32115a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m22607b(list3, arrayList);
        m22607b(list4, arrayList);
        m22607b(list5, arrayList);
        m22607b(list6, arrayList);
        this.f32102d = Collections.unmodifiableList(arrayList);
        this.f32103e = Collections.unmodifiableList(list2);
        this.f32104f = Collections.unmodifiableList(list3);
        this.f32105g = Collections.unmodifiableList(list4);
        this.f32106h = Collections.unmodifiableList(list5);
        this.f32107i = Collections.unmodifiableList(list6);
        this.f32108j = format;
        this.f32109k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f32110l = Collections.unmodifiableMap(map);
        this.f32111m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static void m22607b(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C14336a) list.get(i)).f32112a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* renamed from: c */
    public static ArrayList m22608c(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                StreamKey streamKey = (StreamKey) list2.get(i3);
                if (streamKey.groupIndex == i && streamKey.trackIndex == i2) {
                    arrayList.add(obj);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object mo47783a(List list) {
        return new C14335b(this.f39972a, this.f39973b, m22608c(this.f32103e, list, 0), Collections.emptyList(), m22608c(this.f32105g, list, 1), m22608c(this.f32106h, list, 2), Collections.emptyList(), this.f32108j, this.f32109k, this.f39974c, this.f32110l, this.f32111m);
    }
}
