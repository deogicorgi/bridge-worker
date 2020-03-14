package io.github.deogicogi.bridge.core.data;

public abstract class SimpleInboundBridgeData<T> implements BridgeData<T> {

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
