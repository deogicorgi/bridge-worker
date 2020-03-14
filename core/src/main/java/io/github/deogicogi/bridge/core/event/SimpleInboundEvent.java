package io.github.deogicogi.bridge.core.event;

import java.util.List;

public abstract class SimpleInboundEvent implements BridgeEvent {

    public void addOutboundEvents(List<OutboundEvent> outboundEvents) {
        for (OutboundEvent outboundEvent : outboundEvents) this.addOutboundEvent(outboundEvent);
    }

    public void addOutboundEvent(OutboundEvent outboundEvent) {

    }
}

