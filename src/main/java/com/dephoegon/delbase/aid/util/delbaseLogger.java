package com.dephoegon.delbase.aid.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileUtil;
import com.dephoegon.delbase.Delbase;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
public class delbaseLogger extends FileAppender<ILoggingEvent> {
    public static final Identifier LOGGER_NAME = new Identifier(Delbase.Delbase_ID, "delbase_logger");
    public static final Logger DEL_LOGGER = LoggerFactory.getLogger(LOGGER_NAME.toString());

    public delbaseLogger(String primaryDir, String secondaryDir, String fileName) {
        LoggerContext loggerContext = new LoggerContext();

        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
        encoder.start();

        setContext(loggerContext);
        setName("FILE");

        File primaryFile = new File(primaryDir, fileName);
        if (FileUtil.createMissingParentDirectories(primaryFile)) {
            setFile(primaryFile.getAbsolutePath());
        } else {
            addWarn("Failed to create Parent directories for [" + primaryFile.getAbsolutePath() +"]");
            File secondaryFile = new File(secondaryDir, fileName);
            setFile(secondaryFile.getAbsolutePath());
        }

        setEncoder(encoder);
        start();

        ch.qos.logback.classic.Logger rootLogger = loggerContext.getLogger("ROOT");
        rootLogger.addAppender(this);
    }
}