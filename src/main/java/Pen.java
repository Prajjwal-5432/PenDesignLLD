import strategies.writeStrategies.WriteBehaviour;

public abstract class Pen {
    private String name;
    private String company;
    private PenType penType;
    private WriteBehaviour writeBehaviour;

    public Pen(PenType penType, WriteBehaviour writeBehaviour) {
        this.penType = penType;
        this.writeBehaviour = writeBehaviour;
    }
    public void write() {
        this.writeBehaviour.write();
    }
    public abstract Color getColor();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }
}
