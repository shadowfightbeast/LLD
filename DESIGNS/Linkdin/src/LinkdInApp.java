import java.util.ArrayList;
import java.util.List;

import models.JobPosting;
import models.Profile;
import models.User;
import services.LinkedInService;

public class LinkdInApp {
    public static void main(String[] args) {
        LinkedInService linkedInService = LinkedInService.getInstance();

        // User registration
        User user1 = new User("1", "John Doe", "john@example.com", "password", new Profile(), new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>());
        User user2 = new User("2", "Jane Smith", "jane@example.com", "password", new Profile(), new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>());
        linkedInService.registerUser(user1);
        linkedInService.registerUser(user2);

        // User login
        User loggedInUser = linkedInService.loginUser("john@example.com", "password");
        if (loggedInUser != null) {
            System.out.println("User logged in: " + loggedInUser.getName());
        } else {
            System.out.println("Invalid email or password.");
        }

        // Update user profile
        Profile profile = new Profile();
        profile.setHeadline("Software Engineer");
        profile.setSummary("Passionate about coding and problem-solving.");
        loggedInUser.setProfile(profile);
        linkedInService.updateUserProfile(loggedInUser);

        linkedInService.sendConnectionRequest(user1, user2);
        // Accept connection request
        linkedInService.acceptConnectionRequest(user2, user1);
        // Search for users
        List<User> searchResults = linkedInService.searchUsers("John");
        System.out.println("Search Results:");
        for (User user : searchResults) {
            System.out.println("Name: " + user.getName());
            System.out.println("Headline: " + user.getProfile().getHeadline());
            System.out.println();
        }

        // search for job postings
        List<JobPosting> jobPostingResults = linkedInService.searchJobPostings("Software");
        System.out.println("JOb posting results");
        for (JobPosting posting : jobPostingResults) {
            System.out.println("Title: " + posting.getTitle());
            System.out.println("Description: " + posting.getDescription());
            System.out.println();
        }

        // send a message
        linkedInService.sendMessage(user1, user2, "Hi jane how you are doing well");

    }
}
