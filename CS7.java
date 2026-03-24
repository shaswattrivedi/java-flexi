abstract class Media {
    private String title;
    private int duration;
    protected boolean isPremium;

    public Media(String title, int duration, boolean isPremium) {
        this.title = title;
        this.duration = duration;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void getDetails() {
        System.out.println(title + " -> " + duration + " minutes");
    }

    public abstract void playContent();
}

class Movie extends Media {
    public Movie(String title, int duration, boolean isPremium) {
        super(title, duration, isPremium);
    }

    public void playContent() {
        if (isPremium) {
            System.out.println("Verifying Subscription...");
        }
        System.out.println("Streaming Movie: " + getTitle());
    }
}

class Podcast extends Media {
    public Podcast(String title, int duration) {
        super(title, duration, false);
    }

    public void playContent() {
        System.out.println("Loading Advertisement...");
        System.out.println("Playing Podcast: " + getTitle());
    }
}

public class CS7 {
    public static void main(String[] args) {
        Media m1 = new Movie("Inception", 148, true);
        Media m2 = new Podcast("Tech Talk", 30);
        Media m3 = new Movie("Free Guy", 115, false);

        Media[] mediaList = {m1, m2, m3};

        for (Media m : mediaList) {
            m.playContent();
        }
    }
}
