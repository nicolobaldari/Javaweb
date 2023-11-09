public class Cliente 
{
   // Attributi
   private int id;
   private String nome;
   private String email;

   // Costruttore
   public Cliente(int id, String nome, String email) 
   {
      this.id = id;
      this.nome = nome;
      this.email = email;
   }

   public int getId() 
   {
      return id;
   }

   public String getNome() 
   {
      return nome;
   }

   public String getEmail() 
   {
      return email;
   }

   public void setId(int id) 
   {
      this.id = id;
   }

   public void setNome(String nome) 
   {
      this.nome = nome;
   }

   public void setEmail(String email) 
   {
      this.email = email;
   }
}
