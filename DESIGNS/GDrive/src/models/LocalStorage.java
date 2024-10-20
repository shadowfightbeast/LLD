package models;

public class LocalStorage extends CloudStorage {
    public LocalStorage(String storageName) {
        super(storageName);
    }

    @Override
    public void uploadFile(File file) {
        // Logic to upload file to local storage
        System.out.println("Uploading file to Local Storage: " + file.getName());
    }

    @Override
    public File downloadFile(String fileId) {
        // Logic to download file from local storage
        System.out.println("Downloading file with ID: " + fileId + " from Local Storage");
        return null; // Return the file object after download logic
    }

    @Override
    public void deleteFile(String fileId) {
        // Logic to delete file from local storage
        System.out.println("Deleting file with ID: " + fileId + " from Local Storage");
    }
}
