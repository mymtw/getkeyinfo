package com.paypal.pyplcheckout.events;

public interface EventListener {
    void onEvent(EventType eventType, ResultData resultData);
}
