import java.util.Date;

import models.File;
import models.FileStorageSystem;
import models.Folder;
import models.Permission;
import models.PublicLink;
import models.User;

public class GDrive {
    public static void main(String[] args) {
        // Initialize storage system and user
        FileStorageSystem fileStorageSystem = new FileStorageSystem();
        User owner = new User("u1", "John Doe", "john@example.com");

        // Create the service for handling drive operations
        FileDriveService driveService = new FileDriveService(fileStorageSystem);

        // Create root folder for the user
        Folder rootFolder = driveService.createFolder("Root", null, owner);

        // Create a file in the root folder
        File newFile = driveService.createFile("MyDocument.txt", rootFolder, owner);

        // Share the file publicly with a link
        // PublicLink publicLink = driveService.shareFile(newFile, owner,
        // Permission.PermissionType.READ, new Date());

        // Print file details and public link
        System.out.println("File Name: " + newFile.getName());
        System.out.println("Owner: " + newFile.getOwner().getName());
        
        // System.out.println("Public Link ID: " + publicLink.getLinkId());
        // System.out.println("Is Link Active: " + publicLink.isLinkActive());

        // Delete the file
        driveService.deleteFile(newFile.getFileId());

    }
}
