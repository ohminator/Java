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
        return null;
    }

    public Nebenrolle sucheEigenschaft(String pAttribut, String pEigenschaft) {
        setcards.toFirst();
        while(setcards.hasAccess()) {
            if(pAttribut == "Alter") {
                if(pEigenschaft.equals(setcards.getContent().getAlter())) {
                    return setcards.getContent();
                }
                setcards.next();
            }
            if(pAttribut == "Geschlecht") {
                if(pEigenschaft.equals(setcards.getContent().getGeschlecht())) {
                    return setcards.getContent();
                }
                setcards.next();
            }
            if(pAttribut == "Größe") {
                if(pEigenschaft.equals(setcards.getContent().getGröße())) {
                    return setcards.getContent();
                }
                setcards.next();
            }
        }
        return null;
    }

    public void nebenrolleHinzufügen(Nebenrolle pNeueNebenrolle) {
        new Nebenrolle pNeueNebenrolle;
        setcards.append(pNeueNebenrolle);
    }

    public void nebenrolleLöschen() {
        setcards.remove();
    }

    public Nebenrolle aktNeberolle() {
        while(setcards.hasAccess()) {
            return setcards.getContent();
        }
        return null;
    }
}
