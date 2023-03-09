

public abstract class WaterCraft {
    protected String name;
     protected String produceDate;
    protected String material;
    private String story;
    protected String purpose;



    WaterCraft(String _name, String _produceDate, String _material) {
        name = _name;
        produceDate = _produceDate;
        material = _material;

    }
    // noch nicht verwendet, Anforderung auf Notion
    void GetStory(String _story) {
        story = _story;
    }


    public abstract void Charactaristics();

    // setpurpose wurde implementiert aber noch nicht gebraucht!
    public abstract void SetPurpose();

    public abstract void GetShape();

}

