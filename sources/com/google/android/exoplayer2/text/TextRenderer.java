package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C14177a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p594jh.C17948m0;
import p636oi.C18296a;
import p636oi.C18301e;
import p636oi.C18302f;
import p636oi.C18304g;
import p636oi.C18305h;
import p636oi.C18306i;

public final class TextRenderer extends C14177a implements Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 0;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private C18301e decoder;
    private final C18302f decoderFactory;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final C17948m0 formatHolder;
    private boolean inputStreamEnded;
    private C18304g nextInputBuffer;
    private C18305h nextSubtitle;
    private int nextSubtitleEventIndex;
    private final C18306i output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private Format streamFormat;
    private C18305h subtitle;
    private boolean waitingForKeyFrame;

    public TextRenderer(C18306i iVar, Looper looper) {
        this(iVar, looper, C18302f.f40182a);
    }

    private void clearOutput() {
        updateOutput(Collections.emptyList());
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        this.subtitle.getClass();
        if (this.nextSubtitleEventIndex >= this.subtitle.mo69844f()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.mo69843e(this.nextSubtitleEventIndex);
    }

    private void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.streamFormat);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        C14075p.m21698j(TAG, sb.toString(), subtitleDecoderException);
        clearOutput();
        replaceDecoder();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        if (r1.equals("application/pgs") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        r5.decoder = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initDecoder() {
        /*
            r5 = this;
            r0 = 1
            r5.waitingForKeyFrame = r0
            oi.f r1 = r5.decoderFactory
            com.google.android.exoplayer2.Format r2 = r5.streamFormat
            r2.getClass()
            oi.f$a r1 = (p636oi.C18302f.C18303a) r1
            r1.getClass()
            java.lang.String r1 = r2.sampleMimeType
            if (r1 == 0) goto L_0x00e7
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1351681404: goto L_0x008f;
                case -1248334819: goto L_0x0086;
                case -1026075066: goto L_0x007b;
                case -1004728940: goto L_0x0070;
                case 691401887: goto L_0x0065;
                case 822864842: goto L_0x005a;
                case 930165504: goto L_0x004f;
                case 1566015601: goto L_0x0044;
                case 1566016562: goto L_0x0038;
                case 1668750253: goto L_0x002b;
                case 1693976202: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = r3
            goto L_0x0099
        L_0x001e:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0027
            goto L_0x001b
        L_0x0027:
            r0 = 10
            goto L_0x0099
        L_0x002b:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0034
            goto L_0x001b
        L_0x0034:
            r0 = 9
            goto L_0x0099
        L_0x0038:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x001b
        L_0x0041:
            r0 = 8
            goto L_0x0099
        L_0x0044:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x001b
        L_0x004d:
            r0 = 7
            goto L_0x0099
        L_0x004f:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x001b
        L_0x0058:
            r0 = 6
            goto L_0x0099
        L_0x005a:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0063
            goto L_0x001b
        L_0x0063:
            r0 = 5
            goto L_0x0099
        L_0x0065:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x001b
        L_0x006e:
            r0 = 4
            goto L_0x0099
        L_0x0070:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0079
            goto L_0x001b
        L_0x0079:
            r0 = 3
            goto L_0x0099
        L_0x007b:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0084
            goto L_0x001b
        L_0x0084:
            r0 = 2
            goto L_0x0099
        L_0x0086:
            java.lang.String r4 = "application/pgs"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0099
            goto L_0x001b
        L_0x008f:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0098
            goto L_0x001b
        L_0x0098:
            r0 = 0
        L_0x0099:
            switch(r0) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00a9;
                case 9: goto L_0x00a3;
                case 10: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e7
        L_0x009d:
            vi.c r0 = new vi.c
            r0.<init>()
            goto L_0x00e4
        L_0x00a3:
            ui.a r0 = new ui.a
            r0.<init>()
            goto L_0x00e4
        L_0x00a9:
            pi.c r0 = new pi.c
            int r1 = r2.accessibilityChannel
            java.util.List<byte[]> r2 = r2.initializationData
            r0.<init>(r1, r2)
            goto L_0x00e4
        L_0x00b3:
            pi.a r0 = new pi.a
            int r2 = r2.accessibilityChannel
            r0.<init>(r1, r2)
            goto L_0x00e4
        L_0x00bb:
            ti.a r0 = new ti.a
            java.util.List<byte[]> r1 = r2.initializationData
            r0.<init>(r1)
            goto L_0x00e4
        L_0x00c3:
            wi.a r0 = new wi.a
            java.util.List<byte[]> r1 = r2.initializationData
            r0.<init>(r1)
            goto L_0x00e4
        L_0x00cb:
            xi.h r0 = new xi.h
            r0.<init>()
            goto L_0x00e4
        L_0x00d1:
            xi.b r0 = new xi.b
            r0.<init>()
            goto L_0x00e4
        L_0x00d7:
            ri.a r0 = new ri.a
            r0.<init>()
            goto L_0x00e4
        L_0x00dd:
            qi.a r0 = new qi.a
            java.util.List<byte[]> r1 = r2.initializationData
            r0.<init>(r1)
        L_0x00e4:
            r5.decoder = r0
            return
        L_0x00e7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x00fa
            java.lang.String r1 = r2.concat(r1)
            goto L_0x00ff
        L_0x00fa:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x00ff:
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.TextRenderer.initDecoder():void");
    }

    private void invokeUpdateOutputInternal(List<C18296a> list) {
        this.output.onCues(list);
    }

    private void releaseBuffers() {
        this.nextInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        C18305h hVar = this.subtitle;
        if (hVar != null) {
            hVar.mo47085j();
            this.subtitle = null;
        }
        C18305h hVar2 = this.nextSubtitle;
        if (hVar2 != null) {
            hVar2.mo47085j();
            this.nextSubtitle = null;
        }
    }

    private void releaseDecoder() {
        releaseBuffers();
        C18301e eVar = this.decoder;
        eVar.getClass();
        eVar.release();
        this.decoder = null;
        this.decoderReplacementState = 0;
    }

    private void replaceDecoder() {
        releaseDecoder();
        initDecoder();
    }

    private void updateOutput(List<C18296a> list) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            invokeUpdateOutputInternal(list);
        }
    }

    public String getName() {
        return TAG;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            invokeUpdateOutputInternal((List) message.obj);
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
        this.streamFormat = null;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        clearOutput();
        releaseDecoder();
    }

    public void onPositionReset(long j, boolean z) {
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        if (this.decoderReplacementState != 0) {
            replaceDecoder();
            return;
        }
        releaseBuffers();
        C18301e eVar = this.decoder;
        eVar.getClass();
        eVar.flush();
    }

    public void onStreamChanged(Format[] formatArr, long j, long j2) {
        this.streamFormat = formatArr[0];
        if (this.decoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initDecoder();
        }
    }

    public void render(long j, long j2) {
        boolean z;
        if (isCurrentStreamFinal()) {
            long j3 = this.finalStreamEndPositionUs;
            if (j3 != -9223372036854775807L && j >= j3) {
                releaseBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (!this.outputStreamEnded) {
            if (this.nextSubtitle == null) {
                C18301e eVar = this.decoder;
                eVar.getClass();
                eVar.mo69839a(j);
                try {
                    C18301e eVar2 = this.decoder;
                    eVar2.getClass();
                    this.nextSubtitle = (C18305h) eVar2.mo69763b();
                } catch (SubtitleDecoderException e) {
                    handleDecoderError(e);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.subtitle != null) {
                    long nextEventTime = getNextEventTime();
                    z = false;
                    while (nextEventTime <= j) {
                        this.nextSubtitleEventIndex++;
                        nextEventTime = getNextEventTime();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C18305h hVar = this.nextSubtitle;
                if (hVar != null) {
                    if (hVar.mo69761h(4)) {
                        if (!z && getNextEventTime() == Long.MAX_VALUE) {
                            if (this.decoderReplacementState == 2) {
                                replaceDecoder();
                            } else {
                                releaseBuffers();
                                this.outputStreamEnded = true;
                            }
                        }
                    } else if (hVar.f39956c <= j) {
                        C18305h hVar2 = this.subtitle;
                        if (hVar2 != null) {
                            hVar2.mo47085j();
                        }
                        this.nextSubtitleEventIndex = hVar.mo69841a(j);
                        this.subtitle = hVar;
                        this.nextSubtitle = null;
                        z = true;
                    }
                }
                if (z) {
                    this.subtitle.getClass();
                    updateOutput(this.subtitle.mo69842c(j));
                }
                if (this.decoderReplacementState != 2) {
                    while (!this.inputStreamEnded) {
                        try {
                            C18304g gVar = this.nextInputBuffer;
                            if (gVar == null) {
                                C18301e eVar3 = this.decoder;
                                eVar3.getClass();
                                gVar = (C18304g) eVar3.mo69765d();
                                if (gVar != null) {
                                    this.nextInputBuffer = gVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.decoderReplacementState == 1) {
                                gVar.f39937b = 4;
                                C18301e eVar4 = this.decoder;
                                eVar4.getClass();
                                eVar4.mo69764c(gVar);
                                this.nextInputBuffer = null;
                                this.decoderReplacementState = 2;
                                return;
                            }
                            int readSource = readSource(this.formatHolder, gVar, 0);
                            if (readSource == -4) {
                                if (gVar.mo69761h(4)) {
                                    this.inputStreamEnded = true;
                                    this.waitingForKeyFrame = false;
                                } else {
                                    Format format = this.formatHolder.f39134b;
                                    if (format != null) {
                                        gVar.f40183j = format.subsampleOffsetUs;
                                        gVar.mo47272m();
                                        this.waitingForKeyFrame &= !gVar.mo69761h(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.waitingForKeyFrame) {
                                    C18301e eVar5 = this.decoder;
                                    eVar5.getClass();
                                    eVar5.mo69764c(gVar);
                                    this.nextInputBuffer = null;
                                }
                            } else if (readSource == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            handleDecoderError(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void setFinalStreamEndPositionUs(long j) {
        C14075p.m21694f(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
    }

    public int supportsFormat(Format format) {
        ((C18302f.C18303a) this.decoderFactory).getClass();
        String str = format.sampleMimeType;
        if (!("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str))) {
            return C14065m.m21680j(format.sampleMimeType) ? 1 : 0;
        }
        return (format.exoMediaCryptoType == null ? 4 : 2) | 0 | 0;
    }

    public TextRenderer(C18306i iVar, Looper looper, C18302f fVar) {
        super(3);
        Handler handler;
        iVar.getClass();
        this.output = iVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = C14049b0.f30913a;
            handler = new Handler(looper, this);
        }
        this.outputHandler = handler;
        this.decoderFactory = fVar;
        this.formatHolder = new C17948m0();
        this.finalStreamEndPositionUs = -9223372036854775807L;
    }
}
