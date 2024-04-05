package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.C3039b;
import com.google.android.exoplayer2.C14177a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p512bi.C14041a;
import p512bi.C14042b;
import p512bi.C14044c;
import p512bi.C14045d;
import p513bj.C14049b0;
import p594jh.C17948m0;

public final class MetadataRenderer extends C14177a implements Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 0;
    private static final String TAG = "MetadataRenderer";
    private final C14044c buffer;
    private C14041a decoder;
    private final C14042b decoderFactory;
    private boolean inputStreamEnded;
    private final C14045d output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private Metadata pendingMetadata;
    private long pendingMetadataTimestampUs;
    private long subsampleOffsetUs;

    public MetadataRenderer(C14045d dVar, Looper looper) {
        this(dVar, looper, C14042b.f30905a);
    }

    private void decodeWrappedMetadata(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.length(); i++) {
            Format wrappedMetadataFormat = metadata.get(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                list.add(metadata.get(i));
            } else {
                C3039b a = this.decoderFactory.mo46863a(wrappedMetadataFormat);
                byte[] wrappedMetadataBytes = metadata.get(i).getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                this.buffer.mo46795j();
                this.buffer.mo47271l(wrappedMetadataBytes.length);
                ByteBuffer byteBuffer = this.buffer.f31493d;
                int i2 = C14049b0.f30913a;
                byteBuffer.put(wrappedMetadataBytes);
                this.buffer.mo47272m();
                Metadata e = a.mo11181e(this.buffer);
                if (e != null) {
                    decodeWrappedMetadata(e, list);
                }
            }
        }
    }

    private void invokeRenderer(Metadata metadata) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void invokeRendererInternal(Metadata metadata) {
        this.output.onMetadata(metadata);
    }

    private boolean outputMetadata(long j) {
        boolean z;
        Metadata metadata = this.pendingMetadata;
        if (metadata == null || this.pendingMetadataTimestampUs > j) {
            z = false;
        } else {
            invokeRenderer(metadata);
            this.pendingMetadata = null;
            this.pendingMetadataTimestampUs = -9223372036854775807L;
            z = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z;
    }

    private void readMetadata() {
        if (!this.inputStreamEnded && this.pendingMetadata == null) {
            this.buffer.mo46795j();
            C17948m0 formatHolder = getFormatHolder();
            int readSource = readSource(formatHolder, this.buffer, 0);
            if (readSource == -4) {
                if (this.buffer.mo69761h(4)) {
                    this.inputStreamEnded = true;
                    return;
                }
                C14044c cVar = this.buffer;
                cVar.f30906j = this.subsampleOffsetUs;
                cVar.mo47272m();
                C14041a aVar = this.decoder;
                int i = C14049b0.f30913a;
                Metadata e = aVar.mo11181e(this.buffer);
                if (e != null) {
                    ArrayList arrayList = new ArrayList(e.length());
                    decodeWrappedMetadata(e, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.pendingMetadata = new Metadata((List<? extends Metadata.Entry>) arrayList);
                        this.pendingMetadataTimestampUs = this.buffer.f31495f;
                    }
                }
            } else if (readSource == -5) {
                Format format = formatHolder.f39134b;
                format.getClass();
                this.subsampleOffsetUs = format.subsampleOffsetUs;
            }
        }
    }

    public String getName() {
        return TAG;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            invokeRendererInternal((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    public boolean isReady() {
        return true;
    }

    public void onDisabled() {
        this.pendingMetadata = null;
        this.pendingMetadataTimestampUs = -9223372036854775807L;
        this.decoder = null;
    }

    public void onPositionReset(long j, boolean z) {
        this.pendingMetadata = null;
        this.pendingMetadataTimestampUs = -9223372036854775807L;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    public void onStreamChanged(Format[] formatArr, long j, long j2) {
        this.decoder = this.decoderFactory.mo46863a(formatArr[0]);
    }

    public void render(long j, long j2) {
        boolean z = true;
        while (z) {
            readMetadata();
            z = outputMetadata(j);
        }
    }

    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
    }

    public int supportsFormat(Format format) {
        if (!this.decoderFactory.supportsFormat(format)) {
            return 0;
        }
        return (format.exoMediaCryptoType == null ? 4 : 2) | 0 | 0;
    }

    public MetadataRenderer(C14045d dVar, Looper looper, C14042b bVar) {
        super(5);
        Handler handler;
        dVar.getClass();
        this.output = dVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = C14049b0.f30913a;
            handler = new Handler(looper, this);
        }
        this.outputHandler = handler;
        bVar.getClass();
        this.decoderFactory = bVar;
        this.buffer = new C14044c();
        this.pendingMetadataTimestampUs = -9223372036854775807L;
    }
}
