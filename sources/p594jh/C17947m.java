package p594jh;

import android.content.Context;

/* renamed from: jh.m */
public final class C17947m implements C17914g1 {

    /* renamed from: a */
    public final Context f39132a;

    public C17947m(Context context) {
        this.f39132a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p594jh.C17904d1[] mo69491a(android.os.Handler r8, p594jh.C17921i1.C17923b r9, p594jh.C17921i1.C17923b r10, p594jh.C17921i1.C17923b r11, p594jh.C17921i1.C17923b r12) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = r7.f39132a
            cj.e r2 = new cj.e
            r2.<init>(r1, r8, r9)
            r9 = 0
            r2.f31664x1 = r9
            r2.f31666y1 = r9
            r2.f31668z1 = r9
            r0.add(r2)
            android.content.Context r1 = r7.f39132a
            com.google.android.exoplayer2.audio.DefaultAudioSink r2 = new com.google.android.exoplayer2.audio.DefaultAudioSink
            lh.e r3 = p611lh.C18168e.f39744c
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.media.action.HDMI_AUDIO_PLUG"
            r3.<init>(r4)
            r4 = 0
            android.content.Intent r3 = r1.registerReceiver(r4, r3)
            int r4 = p513bj.C14049b0.f30913a
            r5 = 17
            r6 = 1
            if (r4 < r5) goto L_0x0043
            java.lang.String r4 = p513bj.C14049b0.f30915c
            java.lang.String r5 = "Amazon"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0041
            java.lang.String r5 = "Xiaomi"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0043
        L_0x0041:
            r4 = r6
            goto L_0x0044
        L_0x0043:
            r4 = r9
        L_0x0044:
            if (r4 == 0) goto L_0x0055
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r4 = "external_surround_sound_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r4, r9)
            if (r1 != r6) goto L_0x0055
            lh.e r1 = p611lh.C18168e.f39745d
            goto L_0x0076
        L_0x0055:
            if (r3 == 0) goto L_0x0074
            java.lang.String r1 = "android.media.extra.AUDIO_PLUG_STATE"
            int r1 = r3.getIntExtra(r1, r9)
            if (r1 != 0) goto L_0x0060
            goto L_0x0074
        L_0x0060:
            lh.e r1 = new lh.e
            java.lang.String r4 = "android.media.extra.ENCODINGS"
            int[] r4 = r3.getIntArrayExtra(r4)
            r5 = 8
            java.lang.String r6 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r3 = r3.getIntExtra(r6, r5)
            r1.<init>(r3, r4)
            goto L_0x0076
        L_0x0074:
            lh.e r1 = p611lh.C18168e.f39744c
        L_0x0076:
            com.google.android.exoplayer2.audio.DefaultAudioSink$d r3 = new com.google.android.exoplayer2.audio.DefaultAudioSink$d
            com.google.android.exoplayer2.audio.AudioProcessor[] r4 = new com.google.android.exoplayer2.audio.AudioProcessor[r9]
            r3.<init>(r4)
            r2.<init>(r1, r3)
            android.content.Context r1 = r7.f39132a
            com.google.android.exoplayer2.audio.f r3 = new com.google.android.exoplayer2.audio.f
            r3.<init>(r1, r8, r10, r2)
            r3.f31664x1 = r9
            r3.f31666y1 = r9
            r3.f31668z1 = r9
            r0.add(r3)
            android.os.Looper r10 = r8.getLooper()
            com.google.android.exoplayer2.text.TextRenderer r1 = new com.google.android.exoplayer2.text.TextRenderer
            r1.<init>(r11, r10)
            r0.add(r1)
            android.os.Looper r8 = r8.getLooper()
            com.google.android.exoplayer2.metadata.MetadataRenderer r10 = new com.google.android.exoplayer2.metadata.MetadataRenderer
            r10.<init>(r12, r8)
            r0.add(r10)
            dj.b r8 = new dj.b
            r8.<init>()
            r0.add(r8)
            jh.d1[] r8 = new p594jh.C17904d1[r9]
            java.lang.Object[] r8 = r0.toArray(r8)
            jh.d1[] r8 = (p594jh.C17904d1[]) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17947m.mo69491a(android.os.Handler, jh.i1$b, jh.i1$b, jh.i1$b, jh.i1$b):jh.d1[]");
    }
}
