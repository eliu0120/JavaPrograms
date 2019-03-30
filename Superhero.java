public class Superhero
{
    private Name superName;
    private String superSuit;
    private String superCape;
    private Date birthDay;
    private Boolean specialPower;

    public Superhero ()
    {

    }

    public Superhero(Name superName, String superSuit, String superCape, Date birthDay, Boolean onDuty) {
        this.superName = superName;
        this.superSuit = superSuit;
        this.superCape = superCape;
        this.birthDay = birthDay;
        this.specialPower = onDuty;
    }

    public Name getSuperName() {
        return superName;
    }

    public void setSuperName(Name superName) {
        this.superName = superName;
    }

    public String getSuperSuit() {
        return superSuit;
    }

    public void setSuperSuit(String superSuit) {
        this.superSuit = superSuit;
    }

    public String getSuperCape() {
        return superCape;
    }

    public void setSuperCape(String superCape) {
        this.superCape = superCape;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Boolean getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(Boolean specialPower) {
        this.specialPower = specialPower;
    }

    @Override
    public String toString() {
        return  "Name is: " + superName +
                ", He is wearing the " + superSuit + " suit" +
                ", Wearing cape? " + superCape +
                ", Birthday is: " + birthDay +
                ", Using special power? " + specialPower;
    }
}
