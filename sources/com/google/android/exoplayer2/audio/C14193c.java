package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.c */
public abstract class C14193c implements AudioProcessor {

    /* renamed from: b */
    public AudioProcessor.C14178a f31436b;

    /* renamed from: c */
    public AudioProcessor.C14178a f31437c;

    /* renamed from: d */
    public AudioProcessor.C14178a f31438d;

    /* renamed from: e */
    public AudioProcessor.C14178a f31439e;

    /* renamed from: f */
    public ByteBuffer f31440f;

    /* renamed from: g */
    public ByteBuffer f31441g;

    /* renamed from: h */
    public boolean f31442h;

    public C14193c() {
        ByteBuffer byteBuffer = AudioProcessor.f31319a;
        this.f31440f = byteBuffer;
        this.f31441g = byteBuffer;
        AudioProcessor.C14178a aVar = AudioProcessor.C14178a.f31320e;
        this.f31438d = aVar;
        this.f31439e = aVar;
        this.f31436b = aVar;
        this.f31437c = aVar;
    }

    /* renamed from: a */
    public ByteBuffer mo47176a() {
        ByteBuffer byteBuffer = this.f31441g;
        this.f31441g = AudioProcessor.f31319a;
        return byteBuffer;
    }

    /* renamed from: c */
    public final AudioProcessor.C14178a mo47178c(AudioProcessor.C14178a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f31438d = aVar;
        this.f31439e = mo47253e(aVar);
        return isActive() ? this.f31439e : AudioProcessor.C14178a.f31320e;
    }

    /* renamed from: d */
    public final void mo47179d() {
        this.f31442h = true;
        mo47255g();
    }

    /* renamed from: e */
    public abstract AudioProcessor.C14178a mo47253e(AudioProcessor.C14178a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    /* renamed from: f */
    public void mo47254f() {
    }

    public final void flush() {
        this.f31441g = AudioProcessor.f31319a;
        this.f31442h = false;
        this.f31436b = this.f31438d;
        this.f31437c = this.f31439e;
        mo47254f();
    }

    /* renamed from: g */
    public void mo47255g() {
    }

    /* renamed from: h */
    public void mo47256h() {
    }

    /* renamed from: i */
    public final ByteBuffer mo47257i(int i) {
        if (this.f31440f.capacity() < i) {
            this.f31440f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f31440f.clear();
        }
        ByteBuffer byteBuffer = this.f31440f;
        this.f31441g = byteBuffer;
        return byteBuffer;
    }

    public boolean isActive() {
        return this.f31439e != AudioProcessor.C14178a.f31320e;
    }

    public boolean isEnded() {
        return this.f31442h && this.f31441g == AudioProcessor.f31319a;
    }

    public final void reset() {
        flush();
        this.f31440f = AudioProcessor.f31319a;
        AudioProcessor.C14178a aVar = AudioProcessor.C14178a.f31320e;
        this.f31438d = aVar;
        this.f31439e = aVar;
        this.f31436b = aVar;
        this.f31437c = aVar;
        mo47256h();
    }
}
