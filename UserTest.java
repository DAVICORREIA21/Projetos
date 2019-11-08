

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste UserTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class UserTest
{
    /**
     * Construtor default para a classe de teste UserTest
     */
    public UserTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        User user1 = new User();
        user1.setEmail("davicorreia21@gmail.com");
        user1.setLogin("login1");
        user1.setPassword("2116");
        user1.setBio("bio1");
        assertEquals("davicorreia21@gmail.com", user1.getEmail());
        assertEquals("login1", user1.getLogin());
        assertEquals("2116", user1.getPassword());
        assertEquals("bio1", user1.getBio());
    }

   

    @Test
    public void test2()
    {
        User user1 = new User();
        user1.setLogin("Davi");
        Post post1 = new Post();
        post1.setDescription("cinema");
        post1.setAuthor(user1);
        assertEquals("cinema", post1.getDescription());
        assertEquals(user1, post1.getAuthor());
        assertEquals("Davi", user1.getLogin());
      
    }

    @Test
    public void test3()
    {
        User user1 = new User();
        User user2 = new User();
        user1.setLogin("DAVI");
        user2.setLogin("AQUILES");
        Post post1 = new Post();
        post1.setDescription("CINEMA");
        post1.setAuthor(user1);
        user1.addPosts(post1);
        Post post2 = new Post();
        post2.setDescription("NETFLIX");
        post2.setAuthor(user1);
        user1.addPosts(post2);
        Post post3 = new Post();
        post3.setDescription("LAGOA");
        post3.setAuthor(user1);
        user1.addPosts(post3);
        Post post4 = new Post();
        post4.setDescription("COMER");
        post4.setAuthor(user2);
        user2.addPosts(post4);
        Post post5 = new Post();
        post5.setDescription("BRIGAR");
        post5.setAuthor(user2);
        user2.addPosts(post5);
        Post post6 = new Post();
        post6.setDescription("BANHO");
        post6.setAuthor(user2);
        user2.addPosts(post6);
        java.util.ArrayList<Post> daviposts = (java.util.ArrayList<Post>)user1.getPosts();
        java.util.ArrayList<Post> aquilesposts = (java.util.ArrayList<Post>)user2.getPosts();
        assertEquals(user1, post1.getAuthor());
        assertEquals(user1, post2.getAuthor());
        assertEquals(user1, post3.getAuthor());
        assertEquals(user2, post4.getAuthor());
        assertEquals(user2, post5.getAuthor());
        assertEquals(user2, post6.getAuthor());
        assertEquals(3, daviposts.size());
        assertEquals(3, aquilesposts.size());
        assertEquals(post1, daviposts.get(0));
        assertEquals(post2, daviposts.get(1));
        assertEquals(post3, daviposts.get(2));
        assertEquals(post4, aquilesposts.get(0));
        assertEquals(post5, aquilesposts.get(1));
        assertEquals(post6, aquilesposts.get(2));
    }
}










