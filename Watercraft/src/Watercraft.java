

public abstract class WaterCraft {
    protected String name;
     private String produceDate;
    private String material;
    private String story;

    // Polymorphie für diese Methode
    protected String purpose;

    WaterCraft(String _name, String _produceDate, String _material) {
        name = _name;
        produceDate = _produceDate;
        material = _material;

    }
// noch nicht verwendet
    void GetStory(String _story) {
        story = _story;
    }

    public abstract void SetPurpose();


}

