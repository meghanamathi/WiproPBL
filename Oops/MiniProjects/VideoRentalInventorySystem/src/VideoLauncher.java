package Oops.MiniProjects.VideoRentalInventorySystem.src;

import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Create VideoStore object
        VideoStore store = new VideoStore();

        int choice;

        // Menu repeats until user chooses Exit
        do {

            System.out.println("\n==============================");
            System.out.println("      VIDEO RENTAL STORE");
            System.out.println("==============================");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            choice = sc.nextInt();

            // Consume the newline left by nextInt()
            sc.nextLine();

            switch (choice) {

                // Add Video
                case 1:

                    System.out.print("Enter the name of the video: ");
                    String addVideo = sc.nextLine();

                    store.addVideo(addVideo);

                    break;

                // Checkout Video
                case 2:

                    System.out.print("Enter the name of the video to checkout: ");
                    String checkoutVideo = sc.nextLine();

                    store.doCheckout(checkoutVideo);

                    break;

                // Return Video
                case 3:

                    System.out.print("Enter the name of the video to return: ");
                    String returnVideo = sc.nextLine();

                    store.doReturn(returnVideo);

                    break;

                // Receive Rating
                case 4:

                    System.out.print("Enter the name of the video: ");
                    String ratingVideo = sc.nextLine();

                    System.out.print("Enter the rating (1-10): ");
                    int rating = sc.nextInt();

                    store.receiveRating(ratingVideo, rating);

                    break;

                // Display Inventory
                case 5:

                    store.listInventory();

                    break;

                // Exit
                case 6:

                    System.out.println("\nExiting...!! Thanks for using the application.");

                    break;

                // Invalid Choice
                default:

                    System.out.println("Invalid Choice! Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

        // Close Scanner
        sc.close();
    }
}
