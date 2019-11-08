
/**
 * Escreva a descrição da classe Post aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Post
{
   private User author;
   private String description;
   
   public User getAuthor(){
       return author;
    }
    
   public void setAuthor(User author){
       this.author = author;
    }
    
   public String getDescription(){
       return description;
    }
    
   public void setDescription(String description){
       this.description = description;
    }
    
}
