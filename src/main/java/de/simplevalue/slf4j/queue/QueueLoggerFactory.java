package de.simplevalue.slf4j.queue;

import org.slf4j.ILoggerFactory;

public class QueueLoggerFactory implements ILoggerFactory {

    public QueueLoggerFactory() {
        // nothing to do
    }

    public QueueLogger getLogger(String name) {
        return QueueLogger.QUEUE_LOGGER;
    }

}