import java.util.ArrayList;

public class Main {
    public static void main() {
        ArrayList<Document> documents = new ArrayList<>();
        Resume resume = new Resume();
        resume.addPages(new ExperiencePage(), new SkillPage());
        Report report = new Report();
        report.addPages(new IntroductionPage(),new SummaryPage(),new ConclusionPage());
        documents.add(resume);
        documents.add(report);
    }
}
