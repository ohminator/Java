// NebenRollenVermittlung

public class NebenRollenVermittlung {

    private List<Nebenrolle> setcards;

    public NebenRollenVermittlung() {
        setcards = new List<Nebenrolle>();
    }

    public Nebenrolle sucheExaktName(String pName) {
        setcards.toFirst();
        while(setcards.hasAccess()) {
            if(pName.equals(setcards.getContent().getName())) {
                return setcards.getContent();
            }
            setcards.next();
        }
    }

    public Nebenrolle sucheEigenschaft(String pAttribut, String pEigenschaft) {
        setcards.toFirst();
        while(setcards.hasAccess()) {
            
        }
    }
}