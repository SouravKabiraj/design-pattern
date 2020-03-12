public class Resume extends Document {
    private ExperiencePage experiencePage;
    private SkillPage skillPage;

    // factory method
    public void addPages(ExperiencePage experiencePage, SkillPage skillPage) {
        this.experiencePage = experiencePage;
        this.skillPage = skillPage;
    }
}
