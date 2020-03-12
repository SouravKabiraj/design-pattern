public class Report extends Document {
    private IntroductionPage introductionPage;
    private SummaryPage summaryPage;
    private ConclusionPage conclusionPage;

    // factory method
    public void addPages(IntroductionPage introductionPage, SummaryPage summaryPage, ConclusionPage conclusionPage) {
        this.introductionPage = introductionPage;
        this.summaryPage = summaryPage;
        this.conclusionPage = conclusionPage;
    }
}
