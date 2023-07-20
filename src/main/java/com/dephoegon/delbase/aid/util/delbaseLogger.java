package com.dephoegon.delbase.aid.util;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class delbaseLogger<E> extends FileAppender<E> {
    public static final Logger LOGGER = LoggerFactory.getLogger(delbaseLogger.class);
    private String primaryDir;
    private String secondaryDir;
    private String fileName;

    public void setPrimaryDir(String primaryDir) { this.primaryDir = primaryDir; }
    public void setSecondaryDir(String secondaryDir) { this.secondaryDir = secondaryDir; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public void start() {
        File primaryFile = new File(primaryDir, fileName);
        if (FileUtil.createMissingParentDirectories(primaryFile)) {
            setFile(primaryFile.getAbsolutePath());
        } else {
            addWarn("Failed to create Parent directories for [" + primaryFile.getAbsolutePath() +"]");
            File secondaryFile = new File(secondaryDir, fileName);
            setFile(secondaryFile.getAbsolutePath());
        }
        super.start();
    }
}
