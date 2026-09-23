package Lambda;

import java.util.Arrays;

public class Arrays_stream {

    static class Video {

        private final String title;
        private boolean flag;
        private float averageuserrating;

        Video(String title) {
            this.title = title;
            this.flag = true;
            this.averageuserrating = 0.0f;
        }

        void beingcheckedout() {
            this.flag = false;
        }

        void beingreturned() {
            this.flag = true;
        }

        void receiverating(int rating) {
            this.averageuserrating = rating;
        }

        String getTitle() {
            return this.title;
        }

        boolean getFlag() {
            return this.flag;
        }

        float getAverageUserRating() {
            return this.averageuserrating;
        }
    }

    static class VideoStore {

        Video[] videoarr = new Video[10];
        static int index = -1;

        // 1. Add a new video
        void addVideo(String title) {
            index++;
            videoarr[index] = new Video(title);
        }

        // 2. Check out a video
        void checkOut(String title) {
            Arrays.stream(videoarr)
                    .filter(v -> v != null)
                    .filter(v -> v.getTitle().equals(title))
                    .forEach(v -> v.beingcheckedout());
        }

        // 3. Return a video
        void returnVideo(String title) {
            Arrays.stream(videoarr)
                    .filter(v -> v != null)
                    .filter(v -> v.getTitle().equals(title))
                    .forEach(v -> v.beingreturned());
        }

        // 4. Receive rating
        void receiveRating(String title, int rating) {
            Arrays.stream(videoarr)
                    .filter(v -> v != null)
                    .filter(v -> v.getTitle().equals(title))
                    .forEach(v -> v.receiverating(rating));
        }

        // 5. List inventory
        void listInventory() {

            System.out.println("\nList Inventory:");

            Arrays.stream(videoarr)
                    .filter(v -> v != null)
                    .forEach(v ->
                            System.out.println(
                                    "Title: " + v.getTitle()
                                    + ", Available: " + v.getFlag()
                                    + ", Rating: " + v.getAverageUserRating()
                            )
                    );
        }
    }

    public static void main(String[] args) {

        VideoStore vsobj1 = new VideoStore();

        vsobj1.addVideo("Sample1");
        vsobj1.addVideo("Sample2");
        vsobj1.addVideo("Sample3");
        vsobj1.addVideo("Sample4");

        vsobj1.listInventory();

        vsobj1.checkOut("Sample3");
        vsobj1.listInventory();

        vsobj1.checkOut("Sample1");
        vsobj1.listInventory();

        vsobj1.returnVideo("Sample3");
        vsobj1.listInventory();

        vsobj1.receiveRating("Sample2", 5);
        vsobj1.listInventory();
    }
}