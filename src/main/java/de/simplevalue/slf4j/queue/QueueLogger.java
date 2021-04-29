package de.simplevalue.slf4j.queue;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.helpers.MessageFormatter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueLogger implements org.slf4j.Logger, Serializable {

    private BlockingQueue queue = new LinkedBlockingQueue();

    public static final QueueLogger QUEUE_LOGGER = new QueueLogger();

    public static BlockingQueue getQueue() {
        return QUEUE_LOGGER.queue;
    }

    public String getName() {
        return "de.simplevalue.slf4j.queue.Logger";
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void trace(String msg) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(Level.TRACE, null, msg, null);
        }
    }

    @Override
    public void trace(String format, Object arg) {
        if (isTraceEnabled()) {
            handle_1ArgsCall(Level.TRACE, null, format, arg);
        }
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        if (isTraceEnabled()) {
            handle2ArgsCall(Level.TRACE, null, format, arg1, arg2);
        }
    }

    @Override
    public void trace(String format, Object... arguments) {
        if (isTraceEnabled()) {
            handleArgArrayCall(Level.TRACE, null, format, arguments);
        }
    }

    @Override
    public void trace(String msg, Throwable t) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(Level.TRACE, null, msg, t);
        }
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return true;
    }

    @Override
    public void trace(Marker marker, String msg) {
        if (isTraceEnabled(marker)) {
            handle_0ArgsCall(Level.TRACE, marker, msg, null);
        }
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        if (isTraceEnabled(marker)) {
            handle_1ArgsCall(Level.TRACE, marker, format, arg);
        }
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        if (isTraceEnabled(marker)) {
            handle2ArgsCall(Level.TRACE, marker, format, arg1, arg2);
        }
    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        if (isTraceEnabled(marker)) {
            handleArgArrayCall(Level.TRACE, marker, format, argArray);
        }
    }

    public void trace(Marker marker, String msg, Throwable t) {
        if (isTraceEnabled(marker)) {
            handle_0ArgsCall(Level.TRACE, marker, msg, t);
        }
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    public void debug(String msg) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(Level.DEBUG, null, msg, null);
        }
    }

    public void debug(String format, Object arg) {
        if (isDebugEnabled()) {
            handle_1ArgsCall(Level.DEBUG, null, format, arg);
        }
    }

    public void debug(String format, Object arg1, Object arg2) {
        if (isDebugEnabled()) {
            handle2ArgsCall(Level.DEBUG, null, format, arg1, arg2);
        }
    }

    public void debug(String format, Object... arguments) {
        if (isDebugEnabled()) {
            handleArgArrayCall(Level.DEBUG, null, format, arguments);
        }
    }

    public void debug(String msg, Throwable t) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(Level.DEBUG, null, msg, t);
        }
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return true;
    }

    public void debug(Marker marker, String msg) {
        if (isDebugEnabled(marker)) {
            handle_0ArgsCall(Level.DEBUG, marker, msg, null);
        }
    }

    public void debug(Marker marker, String format, Object arg) {
        if (isDebugEnabled(marker)) {
            handle_1ArgsCall(Level.DEBUG, marker, format, arg);
        }
    }

    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        if (isDebugEnabled(marker)) {
            handle2ArgsCall(Level.DEBUG, marker, format, arg1, arg2);
        }
    }

    public void debug(Marker marker, String format, Object... arguments) {
        if (isDebugEnabled(marker)) {
            handleArgArrayCall(Level.DEBUG, marker, format, arguments);
        }
    }

    public void debug(Marker marker, String msg, Throwable t) {
        if (isDebugEnabled(marker)) {
            handle_0ArgsCall(Level.DEBUG, marker, msg, t);
        }
    }

    @Override
    public boolean isInfoEnabled() {
        return true;
    }

    public void info(String msg) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(Level.INFO, null, msg, null);
        }
    }

    public void info(String format, Object arg) {
        if (isInfoEnabled()) {
            handle_1ArgsCall(Level.INFO, null, format, arg);
        }
    }

    public void info(String format, Object arg1, Object arg2) {
        if (isInfoEnabled()) {
            handle2ArgsCall(Level.INFO, null, format, arg1, arg2);
        }
    }

    public void info(String format, Object... arguments) {
        if (isInfoEnabled()) {
            handleArgArrayCall(Level.INFO, null, format, arguments);
        }
    }

    public void info(String msg, Throwable t) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(Level.INFO, null, msg, t);
        }
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return true;
    }

    public void info(Marker marker, String msg) {
        if (isInfoEnabled(marker)) {
            handle_0ArgsCall(Level.INFO, marker, msg, null);
        }
    }

    public void info(Marker marker, String format, Object arg) {
        if (isInfoEnabled(marker)) {
            handle_1ArgsCall(Level.INFO, marker, format, arg);
        }
    }

    public void info(Marker marker, String format, Object arg1, Object arg2) {
        if (isInfoEnabled(marker)) {
            handle2ArgsCall(Level.INFO, marker, format, arg1, arg2);
        }
    }

    public void info(Marker marker, String format, Object... arguments) {
        if (isInfoEnabled(marker)) {
            handleArgArrayCall(Level.INFO, marker, format, arguments);
        }
    }

    public void info(Marker marker, String msg, Throwable t) {
        if (isInfoEnabled(marker)) {
            handle_0ArgsCall(Level.INFO, marker, msg, t);
        }
    }

    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    public void warn(String msg) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(Level.WARN, null, msg, null);
        }
    }

    public void warn(String format, Object arg) {
        if (isWarnEnabled()) {
            handle_1ArgsCall(Level.WARN, null, format, arg);
        }
    }

    public void warn(String format, Object arg1, Object arg2) {
        if (isWarnEnabled()) {
            handle2ArgsCall(Level.WARN, null, format, arg1, arg2);
        }
    }

    public void warn(String format, Object... arguments) {
        if (isWarnEnabled()) {
            handleArgArrayCall(Level.WARN, null, format, arguments);
        }
    }

    public void warn(String msg, Throwable t) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(Level.WARN, null, msg, t);
        }
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return true;
    }

    public void warn(Marker marker, String msg) {
        if (isWarnEnabled(marker)) {
            handle_0ArgsCall(Level.WARN, marker, msg, null);
        }
    }

    public void warn(Marker marker, String format, Object arg) {
        if (isWarnEnabled(marker)) {
            handle_1ArgsCall(Level.WARN, marker, format, arg);
        }
    }

    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        if (isWarnEnabled(marker)) {
            handle2ArgsCall(Level.WARN, marker, format, arg1, arg2);
        }
    }

    public void warn(Marker marker, String format, Object... arguments) {
        if (isWarnEnabled(marker)) {
            handleArgArrayCall(Level.WARN, marker, format, arguments);
        }
    }

    public void warn(Marker marker, String msg, Throwable t) {
        if (isWarnEnabled(marker)) {
            handle_0ArgsCall(Level.WARN, marker, msg, t);
        }
    }

    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    public void error(String msg) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(Level.ERROR, null, msg, null);
        }
    }

    public void error(String format, Object arg) {
        if (isErrorEnabled()) {
            handle_1ArgsCall(Level.ERROR, null, format, arg);
        }
    }

    public void error(String format, Object arg1, Object arg2) {
        if (isErrorEnabled()) {
            handle2ArgsCall(Level.ERROR, null, format, arg1, arg2);
        }
    }

    public void error(String format, Object... arguments) {
        if (isErrorEnabled()) {
            handleArgArrayCall(Level.ERROR, null, format, arguments);
        }
    }

    public void error(String msg, Throwable t) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(Level.ERROR, null, msg, t);
        }
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return true;
    }

    public void error(Marker marker, String msg) {
        if (isErrorEnabled(marker)) {
            handle_0ArgsCall(Level.ERROR, marker, msg, null);
        }
    }

    public void error(Marker marker, String format, Object arg) {
        if (isErrorEnabled(marker)) {
            handle_1ArgsCall(Level.ERROR, marker, format, arg);
        }
    }

    public void error(Marker marker, String format, Object arg1, Object arg2) {
        if (isErrorEnabled(marker)) {
            handle2ArgsCall(Level.ERROR, marker, format, arg1, arg2);
        }
    }

    public void error(Marker marker, String format, Object... arguments) {
        if (isErrorEnabled(marker)) {
            handleArgArrayCall(Level.ERROR, marker, format, arguments);
        }
    }

    public void error(Marker marker, String msg, Throwable t) {
        if (isErrorEnabled(marker)) {
            handle_0ArgsCall(Level.ERROR, marker, msg, t);
        }
    }

    private void handle_0ArgsCall(Level level, Marker marker, String msg, Throwable t) {
        handleNormalizedLoggingCall(level, marker, msg, null, t);
    }

    private void handle_1ArgsCall(Level level, Marker marker, String msg, Object arg1) {
        handleNormalizedLoggingCall(level, marker, msg, new Object[] { arg1 }, null);
    }

    private void handle2ArgsCall(Level level, Marker marker, String msg, Object arg1, Object arg2) {
        if (arg2 instanceof Throwable) {
            handleNormalizedLoggingCall(level, marker, msg, new Object[] { arg1 }, (Throwable) arg2);
        } else {
            handleNormalizedLoggingCall(level, marker, msg, new Object[] { arg1, arg2 }, null);
        }
    }

    private void handleArgArrayCall(Level level, Marker marker, String msg, Object[] args) {
        Throwable throwableCandidate = MessageFormatter.getThrowableCandidate(args);
        if (throwableCandidate != null) {
            Object[] trimmedCopy = MessageFormatter.trimmedCopy(args);
            handleNormalizedLoggingCall(level, marker, msg, trimmedCopy, throwableCandidate);
        } else {
            handleNormalizedLoggingCall(level, marker, msg, args, null);
        }
    }

    protected void handleNormalizedLoggingCall(Level level, Marker marker, String msg, Object[] arguments, Throwable throwable) {
        Map<String,Object> data = new HashMap();
        data.put("level", level.toString());
        data.put("marker", marker);
        data.put("msg", msg);
        data.put("arguments", arguments);
        data.put("throwable", throwable);
        data.put("timestamp", new Date());
        queue.add(data);
    }
}
