class Cliente {
    private String nome;
    private String email;
    private String id;

    public Cliente(String nome, String email, String id){
        this.nome=nome;
        this.email=email;
        this.id=id;
    }

    public String getNome(){
        return nome;
    }

      public String getEmail(){
        return email;
    }

    public String getId(){
        return id;
    }

    public void setNome(){
        this.nome=nome;
    }

    public void setEmail(){
        this.email=email;
    }

    public void setId(){
        this.id=id;
    }
    
}
