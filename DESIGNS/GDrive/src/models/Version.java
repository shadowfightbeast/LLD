package models;

import java.util.Date;

public class Version {
    private String versionId;
    private File file;
    private Date timestamp;
    private String content; // Can be byte array or file path depending on implementation

    public Version(String versionId, File file, Date timestamp, String content) {
        this.versionId = versionId;
        this.file = file;
        this.timestamp = timestamp;
        this.content = content;
    }

    public String getVersionId() {
        return versionId;
    }

    public File getFile() {
        return file;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }
}
