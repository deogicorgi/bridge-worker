package io.github.deogicogi.bridge.core.data;

import io.github.deogicogi.bridge.core.data.BridgeData;

public class SimpleOutboundBridgeData<T> implements BridgeData<T> {

    private T data;

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}
