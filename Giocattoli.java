 class Giocattoli {
    private String nome;
    private String id;
    private double prezzo;
    private int etaConsigliata;

    public Giocattoli(String nome, String id, double prezzo, int etaConsigliata){
        this.nome=nome;
        this.id=id;
        this.prezzo=prezzo;
        this.etaConsigliata=etaConsigliata;
    }

    public String getNome(){
        return nome;
    }

        public String getId(){
        return id;
    }

        public double getPrezzo(){
        return prezzo;
    }

        public int getEtaConsigliata(){
        return etaConsigliata;
    }

    public void setNome(){
        this.nome=nome;
    }

        public void setId(){
        this.id=id;
    }

        public void setPrezzo(){
        this.prezzo=prezzo;
    }

        public void setEtaConsigliata(){
        this.etaConsigliata=etaConsigliata;
    }



    
}
