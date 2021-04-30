package io.github.swdalex.sbnats;

import io.nats.client.Connection;
import io.nats.client.ConnectionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NatsListener implements ConnectionListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionListener.class);

    @Override
    public void connectionEvent(Connection conn, Events type) {
        LOGGER.info(String.format("NATS connection status: %s", conn.getStatus()));

        if (conn.getStatus().equals(Connection.Status.CLOSED)) {
            LOGGER.info("NATS connection is closed, server is shutting down");
            throw new IllegalStateException("NATS server has been shut down");
        }
    }
}
