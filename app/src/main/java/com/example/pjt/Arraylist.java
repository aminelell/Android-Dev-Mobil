import java.util.ArrayList;

public class Arraylist {
    private ArrayList<Object> account = new ArrayList<>();

    //  ajouter un compte à la liste
    public void addAccount(Object id, Object email, Object password) {
        // Créer un ArrayList temporaire pour stocker
        ArrayList<Object> temp = new ArrayList<>();
        temp.add(id);
        temp.add(email);
        temp.add(password);

        // Ajouter le compte à la liste principale
        account.add(temp);
    }
}

