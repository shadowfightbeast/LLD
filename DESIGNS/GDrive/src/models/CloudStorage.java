package models;

public abstract class CloudStorage {
    protected String storageName;

    public CloudStorage(String storageName) {
        this.storageName = storageName;
    }

    public abstract void uploadFile(File file);
    public abstract File downloadFile(String fileId);
    public abstract void deleteFile(String fileId);
}
