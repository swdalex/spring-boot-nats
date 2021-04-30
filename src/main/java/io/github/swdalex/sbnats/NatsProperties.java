package io.github.swdalex.sbnats;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.nats")
public class NatsProperties {

    private String[] natsUrls = {"nats://127.0.0.1:4222"};
    private String token = null;
    private int maxReconnect = 60;
    private int reconnectWait = 2;
    private int connectionTimeout = 2;

    public String[] getNatsUrls() {
        return natsUrls;
    }

    public void setNatsUrls(String[] natsUrls) {
        this.natsUrls = natsUrls;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getMaxReconnect() {
        return maxReconnect;
    }

    public void setMaxReconnect(int maxReconnect) {
        this.maxReconnect = maxReconnect;
    }

    public int getReconnectWait() {
        return reconnectWait;
    }

    public void setReconnectWait(int reconnectWait) {
        this.reconnectWait = reconnectWait;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }
}
