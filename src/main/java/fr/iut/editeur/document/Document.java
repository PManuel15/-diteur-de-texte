package fr.iut.editeur.document;
/**
 * Description de la classe
 */
public class Document {
    /**
     * Description de la propriété
     */
    private String texte;
    /**
     * Description de la méthode
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Description de la méthode
     * @return texte
     */
    public String getTexte() {
        return texte;
    }
    /**
     * Description de la méthode
     * @param texte
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }
    /**
     * Description de la méthode
     * @param texte
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }
    /**
     * Description de la méthode
     * @param debut description du premier paramètre
     * @param fin description du second paramètre
     * @param remplacement description du troisieme paramètre
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }
    /**
     * Description de la méthode
     * @param debut description du premier paramètre
     * @param fin description du second paramètre
     */
    public void majuscules(int debut, int fin){
        String partie = texte.substring(debut, fin+1);
        partie =partie.toUpperCase();
        remplacer(debut, fin, partie);
    }
    /**
     * Description de la méthode
     * @param debut description du premier paramètre
     * @param fin description du second paramètre
     */
    public void effacer(int debut, int fin){
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin );

        texte = partieGauche +  partieDroite;
    }
    /**
    * Description de la méthode
    */
    public void clear(){
        texte="";
    }

}
