import com.nikhilaukhaj.mongo.repository.UserRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@QuarkusTest
public class UserRepositoryTest {
    @InjectMock
    UserRepository sut;

    @Test
    @DisplayName("Test user repository")
    public void testUserRespository(){
        Assertions.assertEquals(0, sut.count());

        Mockito.when(sut.count()).thenReturn(23L);
        Assertions.assertEquals(23, sut.count());
    }
}
