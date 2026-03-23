abstract class LibraryItem {
    private String itemId;
    private String title;
    protected boolean isReserved;

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isReserved = false;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println(itemId + " - " + title);
    }

    public abstract void processLoan();
}

class TextBook extends LibraryItem {
    public TextBook(String itemId, String title) {
        super(itemId, title);
    }

    public void processLoan() {
        if (isReserved) {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        } else {
            isReserved = true;
            System.out.println("Textbook '" + getTitle() + "' issued...");
        }
    }
}

class ResearchPaper extends LibraryItem {
    public ResearchPaper(String itemId, String title) {
        super(itemId, title);
    }

    public void processLoan() {
        System.out.println("Generating secure PDF download link...");
    }
}

public class CS4 {
    public static void main(String[] args) {
        LibraryItem t1 = new TextBook("B101", "Java Core");
        t1.processLoan();
        t1.processLoan();

        LibraryItem r1 = new ResearchPaper("R99", "AI Ethics");
        r1.processLoan();
    }
}