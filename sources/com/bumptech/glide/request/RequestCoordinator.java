package com.bumptech.glide.request;

public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private RequestState(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    /* renamed from: a */
    boolean mo17113a();

    /* renamed from: b */
    boolean mo17114b(C6124d dVar);

    /* renamed from: d */
    boolean mo17115d(C6124d dVar);

    /* renamed from: f */
    void mo17116f(C6124d dVar);

    RequestCoordinator getRoot();

    /* renamed from: i */
    void mo17118i(C6124d dVar);

    /* renamed from: j */
    boolean mo17119j(C6124d dVar);
}
